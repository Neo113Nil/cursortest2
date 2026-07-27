package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3638np {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f32770p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final C3309hi f32771a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f32772b;

    /* renamed from: c, reason: collision with root package name */
    public final C5110a f32773c;

    /* renamed from: d, reason: collision with root package name */
    public final C3052cu f32774d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f32775e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f32776f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32777g;

    /* renamed from: h, reason: collision with root package name */
    public final Vu f32778h;
    public final C2993bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C4237yv f32779j;

    /* renamed from: k, reason: collision with root package name */
    public final C2936al f32780k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f32781l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f32782m;

    /* renamed from: n, reason: collision with root package name */
    public List f32783n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f32784o;

    public C3638np(C3309hi c3309hi, Context context, C5110a c5110a, C3052cu c3052cu, RD rd, String str, Vu vu, C2993bo c2993bo, C2866Yb c2866Yb, ScheduledExecutorService scheduledExecutorService, C4237yv c4237yv, C2936al c2936al) {
        this.f32771a = c3309hi;
        this.f32772b = context;
        this.f32773c = c5110a;
        this.f32774d = c3052cu;
        this.f32775e = rd;
        this.f32777g = str;
        this.f32778h = vu;
        this.i = c2993bo;
        this.f32776f = scheduledExecutorService;
        this.f32779j = c4237yv;
        this.f32780k = c2936al;
    }

    public static final String d(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3287hD a(String str, String str2) {
        N3.a c9;
        String str3;
        String str4;
        int i = 0;
        int i6 = 7;
        int i9 = 6;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return QC.k(new Zq(15, "Invalid ad string."));
        }
        Context context = this.f32772b;
        Su g4 = Su.g(context, 11);
        g4.c();
        C3089dd m4 = C4835j.f39730C.f39749r.m(context, this.f32773c, this.f32771a.c());
        C2866Yb c2866Yb = AbstractC3043cl.f29559C;
        C3196fd a9 = m4.a("google.afma.response.normalize", c2866Yb, c2866Yb);
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32191Z7)).booleanValue();
        RD rd = this.f32775e;
        C2993bo c2993bo = this.i;
        if (booleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f32782m = jSONObject.optString("fetch_url", "");
                    this.f32783n = A8.b.E(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i10 = u2.z.f41319b;
                    v2.i.f("Invalid ad response.");
                    str4 = this.f32782m;
                    List list = this.f32783n;
                    if (TextUtils.isEmpty(str4)) {
                    }
                    C3878sD t6 = QC.t(QC.t(QC.t(c9, new C4164xc(i6, str2), rd), new C2.s(i9, this, a9), rd), new C4164xc(i9, this), rd);
                    AbstractC2772Sd.G(t6, this.f32778h, g4, false);
                    t6.a(new LD(i, t6, new Qx(this)), AbstractC3413jg.f31275h);
                    return t6;
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            str4 = this.f32782m;
            List list2 = this.f32783n;
            if (TextUtils.isEmpty(str4)) {
                c2993bo.b("sst", "2");
                C3301ha c3301ha = AbstractC3569ma.f32211b8;
                q2.r rVar = q2.r.f40204e;
                String str6 = (String) rVar.f40207c.a(c3301ha);
                C3301ha c3301ha2 = AbstractC3569ma.f32201a8;
                if (((Boolean) rVar.f40207c.a(c3301ha2)).booleanValue()) {
                    Pattern pattern = f32770p;
                    VA va = new VA(pattern);
                    pattern.matcher("").getClass();
                    AbstractC2772Sd.C(!r4.matches(), "The pattern may not match the empty string: %s", va);
                    List q8 = new com.bumptech.glide.manager.p(new C4019ut(i9, va)).q(str4);
                    if (q8.size() < 2) {
                        c9 = QC.k(new Zq(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) q8.get(1);
                        u2.D d2 = C4835j.f39730C.f39735c;
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                c9 = QC.r((ID) QC.s(ID.s(AbstractC3413jg.f31268a.b(new C2.x(8, this, new C2597Hp(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6)))), ((Integer) r10.a(AbstractC3569ma.f32221c8)).intValue(), TimeUnit.MILLISECONDS, this.f32776f), Exception.class, new C2.s(i6, this, list2), rd);
            } else {
                c9 = QC.c(str3);
                c2993bo.b("sst", "1");
            }
        } else {
            c9 = QC.c(str);
            c2993bo.b("sst", "1");
        }
        C3878sD t62 = QC.t(QC.t(QC.t(c9, new C4164xc(i6, str2), rd), new C2.s(i9, this, a9), rd), new C4164xc(i9, this), rd);
        AbstractC2772Sd.G(t62, this.f32778h, g4, false);
        t62.a(new LD(i, t62, new Qx(this)), AbstractC3413jg.f31275h);
        return t62;
    }

    public final void b(int i) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32240e8)).booleanValue()) {
            String a9 = com.anythink.basead.exoplayer.f.f.a(i);
            C4835j.f39730C.f39742k.getClass();
            this.i.c(a9, System.currentTimeMillis());
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && com.anythink.core.common.v.m.f16809e.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f32777g));
            }
            return jSONObject.toString();
        } catch (JSONException e9) {
            String concat = "Failed to update the ad types for rendering. ".concat(e9.toString());
            int i = u2.z.f41319b;
            v2.i.f(concat);
            return str;
        }
    }
}
