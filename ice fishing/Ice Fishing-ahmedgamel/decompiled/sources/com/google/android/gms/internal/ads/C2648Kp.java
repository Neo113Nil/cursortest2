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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2648Kp implements Eu {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f25973x = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: n, reason: collision with root package name */
    public final String f25974n;

    /* renamed from: u, reason: collision with root package name */
    public final Su f25975u;

    /* renamed from: v, reason: collision with root package name */
    public final Vu f25976v;

    /* renamed from: w, reason: collision with root package name */
    public final C2824Vh f25977w;

    public C2648Kp(String str, Vu vu, Su su, C2824Vh c2824Vh) {
        this.f25974n = str;
        this.f25976v = vu;
        this.f25975u = su;
        this.f25977w = c2824Vh;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public final Object a(Object obj) {
        String str;
        C3208fp c3208fp;
        byte[] bArr;
        JSONObject jSONObject;
        String str2;
        C2631Jp c2631Jp = (C2631Jp) obj;
        int optInt = c2631Jp.f25764a.optInt("http_timeout_millis", 60000);
        C2756Re c2756Re = c2631Jp.f25765b;
        int i = c2756Re.f27298g;
        Vu vu = this.f25976v;
        Su su = this.f25975u;
        int i6 = 1;
        str = "";
        if (i != -2) {
            if (i == 1) {
                List list = c2756Re.f27292a;
                if (list != null) {
                    str = TextUtils.join(", ", list);
                    int i9 = u2.z.f41322b;
                    v2.i.c(str);
                }
                c3208fp = new C3208fp(2, "Error building request URL: ".concat(String.valueOf(str)));
            } else {
                c3208fp = new C3208fp(1);
            }
            su.d(c3208fp);
            su.a(false);
            vu.a(su);
            throw c3208fp;
        }
        HashMap hashMap = new HashMap();
        if (c2756Re.f27296e) {
            String str3 = this.f25974n;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32399w1)).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str2 = "";
                    } else {
                        Matcher matcher = f25973x.matcher(str3);
                        str2 = "";
                        while (matcher.find()) {
                            String group = matcher.group(i6);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        str2 = str2.concat("; ");
                                    }
                                    str2 = str2.concat(group);
                                }
                            }
                            i6 = 1;
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
        if (c2756Re.f27295d && (jSONObject = c2631Jp.f25764a) != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                }
            } else {
                u2.z.k("DSID signal does not exist.");
            }
        }
        byte[] bArr2 = null;
        if (((Boolean) AbstractC2497Ca.f24156a.r()).booleanValue()) {
            C2824Vh c2824Vh = this.f25977w;
            c2824Vh.a();
            TM tm = c2824Vh.f28224c;
            String encodeToString = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
            if (!TextUtils.isEmpty(encodeToString)) {
                hashMap.put((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.ea), encodeToString);
            }
        }
        byte[] bArr3 = new byte[0];
        String str4 = c2756Re.f27294c;
        if (TextUtils.isEmpty(str4)) {
            bArr = bArr3;
        } else {
            byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
            if (c2756Re.f27302l) {
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
                    u2.z.l("gzip compression failed, sending uncompressed.", e9);
                    C4835j.f39733C.f39743h.d("PrepareRequestFunction.apply", e9);
                }
                if (bArr2 != null) {
                    hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
                    bArr = bArr2;
                }
            }
            bArr = bytes;
        }
        String str5 = c2756Re.f27303m;
        str = TextUtils.isEmpty(str5) ? "" : str5;
        su.a(true);
        vu.a(su);
        return new C2597Hp(c2756Re.f27297f, optInt, hashMap, bArr, str);
    }
}
