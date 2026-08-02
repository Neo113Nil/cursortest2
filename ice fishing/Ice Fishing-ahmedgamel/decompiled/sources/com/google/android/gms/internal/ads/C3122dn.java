package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import o1.C4797a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4896a;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3122dn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30618a;

    /* renamed from: b, reason: collision with root package name */
    public final C2868Wm f30619b;

    /* renamed from: c, reason: collision with root package name */
    public final C3464k7 f30620c;

    /* renamed from: d, reason: collision with root package name */
    public final C5189a f30621d;

    /* renamed from: e, reason: collision with root package name */
    public final C4797a f30622e;

    /* renamed from: f, reason: collision with root package name */
    public final C3091d9 f30623f;

    /* renamed from: g, reason: collision with root package name */
    public final RD f30624g;

    /* renamed from: h, reason: collision with root package name */
    public final C3485kb f30625h;
    public final C3390in i;

    /* renamed from: j, reason: collision with root package name */
    public final C2649Jn f30626j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f30627k;

    /* renamed from: l, reason: collision with root package name */
    public final C4252yn f30628l;

    /* renamed from: m, reason: collision with root package name */
    public final C3230fo f30629m;

    /* renamed from: n, reason: collision with root package name */
    public final C4260yv f30630n;

    /* renamed from: o, reason: collision with root package name */
    public final C2821Tp f30631o;

    /* renamed from: p, reason: collision with root package name */
    public final BinderC2903Yp f30632p;

    /* renamed from: q, reason: collision with root package name */
    public final C3236fu f30633q;

    /* renamed from: r, reason: collision with root package name */
    public final C3069co f30634r;

    /* renamed from: s, reason: collision with root package name */
    public final C3768po f30635s;

    /* renamed from: t, reason: collision with root package name */
    public final C3334hk f30636t;

    public C3122dn(Context context, C2868Wm c2868Wm, C3464k7 c3464k7, C5189a c5189a, C4797a c4797a, C3091d9 c3091d9, RD rd, C3075cu c3075cu, C3390in c3390in, C2649Jn c2649Jn, ScheduledExecutorService scheduledExecutorService, C3230fo c3230fo, C4260yv c4260yv, C2821Tp c2821Tp, C4252yn c4252yn, BinderC2903Yp binderC2903Yp, C3236fu c3236fu, C3069co c3069co, C3768po c3768po, C3334hk c3334hk) {
        this.f30618a = context;
        this.f30619b = c2868Wm;
        this.f30620c = c3464k7;
        this.f30621d = c5189a;
        this.f30622e = c4797a;
        this.f30623f = c3091d9;
        this.f30624g = rd;
        this.f30625h = c3075cu.f30398j;
        this.i = c3390in;
        this.f30626j = c2649Jn;
        this.f30627k = scheduledExecutorService;
        this.f30629m = c3230fo;
        this.f30630n = c4260yv;
        this.f30631o = c2821Tp;
        this.f30628l = c4252yn;
        this.f30632p = binderC2903Yp;
        this.f30633q = c3236fu;
        this.f30634r = c3069co;
        this.f30635s = c3768po;
        this.f30636t = c3334hk;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(com.anythink.expressad.foundation.d.d.bv), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final s2.L0 f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new s2.L0(optString, optString2);
    }

    public final P3.a a(JSONArray jSONArray, boolean z6, boolean z9, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return QC.c(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z9 ? jSONArray.length() : 1;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
            String a9 = com.IceFishing.LiveIceFishing.k.a(i);
            C4906k.f40186C.f40198k.getClass();
            this.f30634r.c(a9, System.currentTimeMillis());
        }
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(b(jSONArray.optJSONObject(i4), z6, 0));
        }
        return QC.u(new CD(RB.n(arrayList), true), L2.i, this.f30624g);
    }

    public final P3.a b(JSONObject jSONObject, boolean z6, int i) {
        double d9;
        P3.a u6;
        if (jSONObject == null) {
            return ND.f27257u;
        }
        C3324ha c3324ha = AbstractC3592ma.f32872O4;
        s2.r rVar = s2.r.f40506e;
        HashMap hashMap = null;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C3324ha c3324ha2 = AbstractC3592ma.f32881P4;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (jSONObject.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2))) {
                hashMap = new HashMap();
                for (String str : ((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32890Q4)).split(",")) {
                    try {
                        hashMap.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        HashMap hashMap2 = hashMap;
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString) && hashMap2 == null) {
            return ND.f27257u;
        }
        C3324ha c3324ha3 = AbstractC3592ma.f32888Q2;
        s2.r rVar2 = s2.r.f40506e;
        if (((Boolean) rVar2.f40509c.a(c3324ha3)).booleanValue() && i != 0) {
            C4906k.f40186C.f40198k.getClass();
            this.f30634r.c(com.IceFishing.LiveIceFishing.k.a(i), System.currentTimeMillis());
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z6) {
            d9 = optDouble;
        } else {
            if (hashMap2 == null) {
                final C2868Wm c2868Wm = this.f30619b;
                c2868Wm.getClass();
                boolean booleanValue = ((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32999c7)).booleanValue();
                RD rd = c2868Wm.f29181c;
                if (booleanValue && optString != null && optString.startsWith("data:")) {
                    u6 = QC.o(new Callable() { // from class: com.google.android.gms.internal.ads.Um
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C2868Wm c2868Wm2 = C2868Wm.this;
                            c2868Wm2.getClass();
                            String str2 = optString;
                            int indexOf = str2.indexOf(",");
                            if (indexOf == -1) {
                                throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
                            }
                            if (!str2.substring(0, indexOf).endsWith(";base64")) {
                                throw new IllegalArgumentException("Bad data URL: only base64 is supported");
                            }
                            int indexOf2 = str2.indexOf(":");
                            int indexOf3 = str2.indexOf(";");
                            if (indexOf2 == -1 || !str2.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
                                throw new IllegalArgumentException("Bad data URL: only image media is supported");
                            }
                            return c2868Wm2.a(Base64.decode(str2.substring(indexOf + 1), 0), optDouble, optBoolean);
                        }
                    }, rd);
                } else {
                    c2868Wm.f29179a.getClass();
                    C3490kg c3490kg = new C3490kg();
                    w2.r.f41700a.o(new w2.q(optString, c3490kg));
                    u6 = QC.u(c3490kg, new UA() { // from class: com.google.android.gms.internal.ads.Vm
                        @Override // com.google.android.gms.internal.ads.UA
                        public final /* synthetic */ Object apply(Object obj) {
                            C2868Wm c2868Wm2 = C2868Wm.this;
                            c2868Wm2.getClass();
                            return c2868Wm2.a(((C3087d5) obj).f30480b, optDouble, optBoolean);
                        }
                    }, rd);
                }
                return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), QC.u(u6, new UA() { // from class: com.google.android.gms.internal.ads.Zm
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        return new BinderC3379ib(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.f30624g));
            }
            d9 = optDouble;
        }
        return QC.c(new BinderC3379ib(null, Uri.parse(optString), d9, optInt, optInt2, hashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3901sD d(JSONObject jSONObject, St st, Ut ut, C4896a c4896a, C4244yf c4244yf) {
        s2.f1 f1Var;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString(com.onesignal.inAppMessages.internal.d.HTML);
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i = optInt;
        } else if (optInt2 == 0) {
            f1Var = s2.f1.a();
            C3390in c3390in = this.i;
            c3390in.getClass();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                C4906k.f40186C.f40198k.getClass();
                c3390in.f31895j.c("native-assets-loading-video-composition-start", System.currentTimeMillis());
            }
            C3901sD t6 = QC.t(ND.f27257u, new C2961an(c3390in, f1Var, st, ut, c4896a, c4244yf, optString, optString2, 1), c3390in.f31888b);
            return QC.t(t6, new C3015bn(t6, 1), AbstractC3436jg.f32062h);
        }
        f1Var = new s2.f1(this.f30618a, new m2.h(i, optInt2));
        C3390in c3390in2 = this.i;
        c3390in2.getClass();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
        }
        C3901sD t62 = QC.t(ND.f27257u, new C2961an(c3390in2, f1Var, st, ut, c4896a, c4244yf, optString, optString2, 1), c3390in2.f31888b);
        return QC.t(t62, new C3015bn(t62, 1), AbstractC3436jg.f32062h);
    }

    public final HD e(String str, boolean z6, P3.a aVar) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32896R2)).booleanValue()) {
            MA.f(aVar, str, this.f30624g);
        }
        return z6 ? QC.t(aVar, new C3327hd(1, aVar), AbstractC3436jg.f32062h) : QC.r(aVar, Exception.class, new C2576Fi(1), AbstractC3436jg.f32062h);
    }
}
