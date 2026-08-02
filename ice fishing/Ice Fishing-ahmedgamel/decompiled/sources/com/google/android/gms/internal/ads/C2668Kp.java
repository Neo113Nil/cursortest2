package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2668Kp implements Eu {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f26773x = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: n, reason: collision with root package name */
    public final String f26774n;

    /* renamed from: u, reason: collision with root package name */
    public final Su f26775u;

    /* renamed from: v, reason: collision with root package name */
    public final Vu f26776v;

    /* renamed from: w, reason: collision with root package name */
    public final C2847Vh f26777w;

    public C2668Kp(String str, Vu vu, Su su, C2847Vh c2847Vh) {
        this.f26774n = str;
        this.f26776v = vu;
        this.f26775u = su;
        this.f26777w = c2847Vh;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public final Object a(Object obj) {
        String str;
        C3231fp c3231fp;
        byte[] bArr;
        JSONObject jSONObject;
        String str2;
        C2651Jp c2651Jp = (C2651Jp) obj;
        int optInt = c2651Jp.f26516a.optInt("http_timeout_millis", 60000);
        C2776Re c2776Re = c2651Jp.f26517b;
        int i = c2776Re.f27982g;
        Vu vu = this.f26776v;
        Su su = this.f26775u;
        int i4 = 1;
        str = "";
        if (i != -2) {
            if (i == 1) {
                List list = c2776Re.f27976a;
                if (list != null) {
                    str = TextUtils.join(", ", list);
                    int i6 = w2.z.f41712b;
                    x2.i.c(str);
                }
                c3231fp = new C3231fp(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                c3231fp = new C3231fp(1);
            }
            su.d(c3231fp);
            su.a(false);
            vu.a(su);
            throw c3231fp;
        }
        HashMap hashMap = new HashMap();
        if (c2776Re.f27980e) {
            String str3 = this.f26774n;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33179w1)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = f26773x.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(i4);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = str2.concat("; ");
                                    }
                                    str2 = str2.concat(group);
                                }
                            }
                            i4 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put("Cookie", str2);
                    }
                } else {
                    hashMap.put("Cookie", str3);
                }
            }
        }
        if (c2776Re.f27979d && (jSONObject = c2651Jp.f26516a) != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                w2.z.k("DSID signal does not exist.");
            }
        }
        byte[] bArr2 = null;
        if (((Boolean) AbstractC2517Ca.f24891a.r()).booleanValue()) {
            C2847Vh c2847Vh = this.f26777w;
            c2847Vh.a();
            TM tm = c2847Vh.f29021c;
            String encodeToString = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
            if (!TextUtils.isEmpty(encodeToString)) {
                hashMap.put((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.ea), encodeToString);
            }
        }
        byte[] bArr3 = new byte[0];
        String str4 = c2776Re.f27978c;
        if (TextUtils.isEmpty(str4)) {
            bArr = bArr3;
        } else {
            byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
            if (c2776Re.f27986l) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        bArr2 = byteArray;
                    } finally {
                    }
                } catch (IOException e9) {
                    w2.z.l("gzip compression failed, sending uncompressed.", e9);
                    C4906k.f40186C.f40196h.d("PrepareRequestFunction.apply", e9);
                }
                if (bArr2 != null) {
                    hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
                    bArr = bArr2;
                }
            }
            bArr = bytes;
        }
        String str5 = c2776Re.f27987m;
        str = TextUtils.isEmpty(str5) ? "" : str5;
        su.a(true);
        vu.a(su);
        return new C2617Hp(c2776Re.f27981f, optInt, hashMap, bArr, str);
    }
}
