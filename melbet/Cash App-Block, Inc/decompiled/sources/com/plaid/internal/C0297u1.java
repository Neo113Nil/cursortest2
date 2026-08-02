package com.plaid.internal;

import android.text.TextUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.plaid.internal.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0297u1 {
    public static final C0323x0 e;
    public final int a;
    public final String b;
    public final HashMap c;
    public final String d;

    static {
        W3 w3 = Z3.a;
        e = new C0323x0("http-response");
    }

    public C0297u1(int i, String str, HashMap hashMap, String str2) {
        this.a = i;
        this.b = str;
        this.c = hashMap;
        this.d = str2;
    }

    public static C0297u1 a(InputStream inputStream) {
        String a;
        String str;
        O6 o6 = new O6(inputStream);
        do {
            a = o6.a();
            if (a == null) {
                a$$ExternalSyntheticBUOutline0.m$4("empty response");
                return null;
            }
        } while (a.length() < 10);
        e.a(W3.TRACE, "HttpResponse: ".concat(a), new Object[0]);
        String[] split = a.split(" ");
        if (split.length > 0) {
            String str2 = split[0];
        }
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 500;
        if (split.length > 2) {
            str = TextUtils.join(" ", Arrays.copyOfRange(split, 2, split.length));
        } else if (parseInt == 204) {
            str = "No Content";
        } else if (parseInt == 404) {
            str = "Not Found";
        } else if (parseInt == 410) {
            str = "Gone";
        } else if (parseInt != 500) {
            switch (parseInt) {
                case 200:
                    str = "OK";
                    break;
                case SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE:
                    str = "Created";
                    break;
                case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                    str = "Accepted";
                    break;
                default:
                    str = "Unknown Error";
                    break;
            }
        } else {
            str = "Internal Server Error";
        }
        HashMap hashMap = new HashMap();
        String a2 = o6.a();
        if (a2 == null) {
            a$$ExternalSyntheticBUOutline0.m$4("unexpected end of response");
            return null;
        }
        int length = a2.length();
        while (length > 0) {
            C0323x0 c0323x0 = e;
            c0323x0.a(W3.TRACE, a2, new Object[0]);
            String[] split2 = a2.split(":");
            if (split2.length > 1) {
                String lowerCase = split2[0].trim().toLowerCase();
                String trim = a2.substring(split2[0].length() + 1).trim();
                List list = (List) hashMap.get(lowerCase);
                if (list == null) {
                    list = new LinkedList();
                    hashMap.put(lowerCase, list);
                }
                list.add(trim);
            } else {
                c0323x0.a(W3.ERROR, "Invalid header line received: ".concat(a2), new Object[0]);
            }
            a2 = o6.a();
            if (a2 == null) {
                a$$ExternalSyntheticBUOutline0.m$4("unexpected end of response");
                return null;
            }
            length = a2.length();
        }
        e.a(W3.TRACE, a2, new Object[0]);
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) ((List) entry.getValue()).get(0);
            if ("transfer-encoding".equals(str3)) {
                if ("chunked".equalsIgnoreCase(str4)) {
                    z = true;
                } else if ("gzip".equalsIgnoreCase(str4)) {
                    z2 = true;
                }
            } else if ("content-length".equals(str3)) {
                i = Integer.parseInt((String) ((List) entry.getValue()).get(0));
            }
            if ("content-encoding".equals(entry.getKey()) && "gzip".equalsIgnoreCase(str4)) {
                z2 = true;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        if (z) {
            e.a(W3.TRACE, "read chunked", new Object[0]);
            while (true) {
                String a3 = o6.a();
                if (a3 != null) {
                    int parseInt2 = Integer.parseInt(a3.trim(), 16);
                    e.a(W3.TRACE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(parseInt2, "read chunk of ", " bytes"), new Object[0]);
                    if (parseInt2 != 0) {
                        byte[] bArr = new byte[parseInt2];
                        byteArrayOutputStream.write(bArr, 0, o6.a.read(bArr, 0, parseInt2));
                        o6.a();
                    }
                }
            }
        } else {
            if (i >= 0) {
                e.a(W3.TRACE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "read body of content-length="), new Object[0]);
                byte[] bArr2 = new byte[i];
                int i2 = 0;
                do {
                    int read = o6.a.read(bArr2, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    }
                    byteArrayOutputStream.write(bArr2);
                } while (i2 != i);
                byteArrayOutputStream.write(bArr2);
            } else {
                e.a(W3.TRACE, "read body of unknown content-length", new Object[0]);
                byte[] bArr3 = new byte[256];
                for (int read2 = o6.a.read(bArr3, 0, 256); read2 > 0; read2 = o6.a.read(bArr3, 0, 256)) {
                    byteArrayOutputStream.write(bArr3, 0, read2);
                }
            }
            if (z2) {
                e.a(W3.TRACE, "decompress response bytes", new Object[0]);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length * 4);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
                byte[] bArr4 = new byte[32];
                while (true) {
                    int read3 = gZIPInputStream.read(bArr4);
                    if (read3 != -1) {
                        byteArrayOutputStream.write(bArr4, 0, read3);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    }
                }
            }
        }
        return new C0297u1(parseInt, str, hashMap, byteArrayOutputStream.toString());
    }
}
