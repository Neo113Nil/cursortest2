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
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3661np {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f33557p = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final C3332hi f33558a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f33559b;

    /* renamed from: c, reason: collision with root package name */
    public final C5189a f33560c;

    /* renamed from: d, reason: collision with root package name */
    public final C3075cu f33561d;

    /* renamed from: e, reason: collision with root package name */
    public final RD f33562e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f33563f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33564g;

    /* renamed from: h, reason: collision with root package name */
    public final Vu f33565h;
    public final C3069co i;

    /* renamed from: j, reason: collision with root package name */
    public final C4260yv f33566j;

    /* renamed from: k, reason: collision with root package name */
    public final C2959al f33567k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f33568l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public String f33569m;

    /* renamed from: n, reason: collision with root package name */
    public List f33570n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f33571o;

    public C3661np(C3332hi c3332hi, Context context, C5189a c5189a, C3075cu c3075cu, RD rd, String str, Vu vu, C3069co c3069co, C2889Yb c2889Yb, ScheduledExecutorService scheduledExecutorService, C4260yv c4260yv, C2959al c2959al) {
        this.f33558a = c3332hi;
        this.f33559b = context;
        this.f33560c = c5189a;
        this.f33561d = c3075cu;
        this.f33562e = rd;
        this.f33564g = str;
        this.f33565h = vu;
        this.i = c3069co;
        this.f33563f = scheduledExecutorService;
        this.f33566j = c4260yv;
        this.f33567k = c2959al;
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
    public final AbstractC3310hD a(String str, String str2) {
        P3.a c9;
        String str3;
        String str4;
        int i = 0;
        int i4 = 7;
        int i6 = 6;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return QC.k(new Zq(15, "Invalid ad string."));
        }
        Context context = this.f33559b;
        Su e9 = Su.e(context, 11);
        e9.c();
        C3112dd l9 = C4906k.f40186C.f40205r.l(context, this.f33560c, this.f33558a.c());
        C2889Yb c2889Yb = AbstractC3066cl.f30344C;
        C3219fd a9 = l9.a("google.afma.response.normalize", c2889Yb, c2889Yb);
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32970Z7)).booleanValue();
        RD rd = this.f33562e;
        C3069co c3069co = this.i;
        if (booleanValue) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.f33569m = jSONObject.optString("fetch_url", "");
                    this.f33570n = d6.c.p(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i9 = w2.z.f41712b;
                    x2.i.f("Invalid ad response.");
                    str4 = this.f33569m;
                    List list = this.f33570n;
                    if (TextUtils.isEmpty(str4)) {
                    }
                    C3901sD t6 = QC.t(QC.t(QC.t(c9, new C4187xc(i4, str2), rd), new E2.r(i6, this, a9), rd), new C4187xc(i6, this), rd);
                    AbstractC2792Sd.G(t6, this.f33565h, e9, false);
                    t6.a(new LD(i, t6, new Qx(this)), AbstractC3436jg.f32062h);
                    return t6;
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            str4 = this.f33569m;
            List list2 = this.f33570n;
            if (TextUtils.isEmpty(str4)) {
                c3069co.b("sst", "2");
                C3324ha c3324ha = AbstractC3592ma.f32990b8;
                s2.r rVar = s2.r.f40506e;
                String str6 = (String) rVar.f40509c.a(c3324ha);
                C3324ha c3324ha2 = AbstractC3592ma.f32980a8;
                if (((Boolean) rVar.f40509c.a(c3324ha2)).booleanValue()) {
                    Pattern pattern = f33557p;
                    VA va = new VA(pattern);
                    pattern.matcher("").getClass();
                    AbstractC2792Sd.C(!r4.matches(), "The pattern may not match the empty string: %s", va);
                    List q8 = new com.bumptech.glide.manager.o(new C4042ut(i6, va)).q(str4);
                    if (q8.size() < 2) {
                        c9 = QC.k(new Zq(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) q8.get(1);
                        w2.D d9 = C4906k.f40186C.f40191c;
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                c9 = QC.r((ID) QC.s(ID.s(AbstractC3436jg.f32055a.b(new E2.w(8, this, new C2617Hp(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6)))), ((Integer) r10.a(AbstractC3592ma.f33000c8)).intValue(), TimeUnit.MILLISECONDS, this.f33563f), Exception.class, new E2.r(i4, this, list2), rd);
            } else {
                c9 = QC.c(str3);
                c3069co.b("sst", "1");
            }
        } else {
            c9 = QC.c(str);
            c3069co.b("sst", "1");
        }
        C3901sD t62 = QC.t(QC.t(QC.t(c9, new C4187xc(i4, str2), rd), new E2.r(i6, this, a9), rd), new C4187xc(i6, this), rd);
        AbstractC2792Sd.G(t62, this.f33565h, e9, false);
        t62.a(new LD(i, t62, new Qx(this)), AbstractC3436jg.f32062h);
        return t62;
    }

    public final void b(int i) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33020e8)).booleanValue()) {
            String a9 = com.IceFishing.LiveIceFishing.k.a(i);
            C4906k.f40186C.f40198k.getClass();
            this.i.c(a9, System.currentTimeMillis());
        }
    }

    public final String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && com.anythink.core.common.v.m.f17596e.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f33564g));
            }
            return jSONObject.toString();
        } catch (JSONException e9) {
            String concat = "Failed to update the ad types for rendering. ".concat(e9.toString());
            int i = w2.z.f41712b;
            x2.i.f(concat);
            return str;
        }
    }
}
