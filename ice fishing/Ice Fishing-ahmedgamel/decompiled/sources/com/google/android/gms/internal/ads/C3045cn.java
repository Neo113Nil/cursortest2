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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4826a;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.cn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3045cn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29581a;

    /* renamed from: b, reason: collision with root package name */
    public final C2829Vm f29582b;

    /* renamed from: c, reason: collision with root package name */
    public final C3441k7 f29583c;

    /* renamed from: d, reason: collision with root package name */
    public final C5110a f29584d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.b f29585e;

    /* renamed from: f, reason: collision with root package name */
    public final C3068d9 f29586f;

    /* renamed from: g, reason: collision with root package name */
    public final RD f29587g;

    /* renamed from: h, reason: collision with root package name */
    public final C3462kb f29588h;
    public final C3314hn i;

    /* renamed from: j, reason: collision with root package name */
    public final C2612In f29589j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f29590k;

    /* renamed from: l, reason: collision with root package name */
    public final C4175xn f29591l;

    /* renamed from: m, reason: collision with root package name */
    public final C3153eo f29592m;

    /* renamed from: n, reason: collision with root package name */
    public final C4237yv f29593n;

    /* renamed from: o, reason: collision with root package name */
    public final C2800Tp f29594o;

    /* renamed from: p, reason: collision with root package name */
    public final BinderC2880Yp f29595p;

    /* renamed from: q, reason: collision with root package name */
    public final C3213fu f29596q;

    /* renamed from: r, reason: collision with root package name */
    public final C2993bo f29597r;

    /* renamed from: s, reason: collision with root package name */
    public final C3691oo f29598s;

    /* renamed from: t, reason: collision with root package name */
    public final C3311hk f29599t;

    public C3045cn(Context context, C2829Vm c2829Vm, C3441k7 c3441k7, C5110a c5110a, k8.b bVar, C3068d9 c3068d9, RD rd, C3052cu c3052cu, C3314hn c3314hn, C2612In c2612In, ScheduledExecutorService scheduledExecutorService, C3153eo c3153eo, C4237yv c4237yv, C2800Tp c2800Tp, C4175xn c4175xn, BinderC2880Yp binderC2880Yp, C3213fu c3213fu, C2993bo c2993bo, C3691oo c3691oo, C3311hk c3311hk) {
        this.f29581a = context;
        this.f29582b = c2829Vm;
        this.f29583c = c3441k7;
        this.f29584d = c5110a;
        this.f29585e = bVar;
        this.f29586f = c3068d9;
        this.f29587g = rd;
        this.f29588h = c3052cu.f29628j;
        this.i = c3314hn;
        this.f29589j = c2612In;
        this.f29590k = scheduledExecutorService;
        this.f29592m = c3153eo;
        this.f29593n = c4237yv;
        this.f29594o = c2800Tp;
        this.f29591l = c4175xn;
        this.f29595p = binderC2880Yp;
        this.f29596q = c3213fu;
        this.f29597r = c2993bo;
        this.f29598s = c3691oo;
        this.f29599t = c3311hk;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(com.anythink.expressad.foundation.d.d.bv), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final q2.L0 f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new q2.L0(optString, optString2);
    }

    public final N3.a a(JSONArray jSONArray, boolean z3, boolean z6, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return QC.c(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z6 ? jSONArray.length() : 1;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
            String a9 = com.anythink.basead.exoplayer.f.f.a(i);
            C4835j.f39733C.f39745k.getClass();
            this.f29597r.c(a9, System.currentTimeMillis());
        }
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(b(jSONArray.optJSONObject(i6), z3, 0));
        }
        return QC.u(new CD(RB.n(arrayList), true), L2.i, this.f29587g);
    }

    public final N3.a b(JSONObject jSONObject, boolean z3, int i) {
        double d2;
        N3.a u3;
        if (jSONObject == null) {
            return ND.f26473u;
        }
        C3301ha c3301ha = AbstractC3569ma.f32093O4;
        q2.r rVar = q2.r.f40207e;
        HashMap hashMap = null;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            C3301ha c3301ha2 = AbstractC3569ma.f32101P4;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
            if (jSONObject.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2))) {
                hashMap = new HashMap();
                for (String str : ((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32110Q4)).split(",")) {
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
            return ND.f26473u;
        }
        C3301ha c3301ha3 = AbstractC3569ma.f32108Q2;
        q2.r rVar2 = q2.r.f40207e;
        if (((Boolean) rVar2.f40210c.a(c3301ha3)).booleanValue() && i != 0) {
            C4835j.f39733C.f39745k.getClass();
            this.f29597r.c(com.anythink.basead.exoplayer.f.f.a(i), System.currentTimeMillis());
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z3) {
            d2 = optDouble;
        } else {
            if (hashMap2 == null) {
                final C2829Vm c2829Vm = this.f29582b;
                c2829Vm.getClass();
                boolean booleanValue = ((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32220c7)).booleanValue();
                RD rd = c2829Vm.f28234c;
                if (booleanValue && optString != null && optString.startsWith("data:")) {
                    u3 = QC.o(new Callable() { // from class: com.google.android.gms.internal.ads.Tm
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            C2829Vm c2829Vm2 = C2829Vm.this;
                            c2829Vm2.getClass();
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
                            return c2829Vm2.a(Base64.decode(str2.substring(indexOf + 1), 0), optDouble, optBoolean);
                        }
                    }, rd);
                } else {
                    c2829Vm.f28232a.getClass();
                    C3467kg c3467kg = new C3467kg();
                    u2.r.f41310a.o(new u2.q(optString, c3467kg));
                    u3 = QC.u(c3467kg, new UA() { // from class: com.google.android.gms.internal.ads.Um
                        @Override // com.google.android.gms.internal.ads.UA
                        public final /* synthetic */ Object apply(Object obj) {
                            C2829Vm c2829Vm2 = C2829Vm.this;
                            c2829Vm2.getClass();
                            return c2829Vm2.a(((C3064d5) obj).f29708b, optDouble, optBoolean);
                        }
                    }, rd);
                }
                return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), QC.u(u3, new UA() { // from class: com.google.android.gms.internal.ads.Ym
                    @Override // com.google.android.gms.internal.ads.UA
                    public final /* synthetic */ Object apply(Object obj) {
                        return new BinderC3356ib(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.f29587g));
            }
            d2 = optDouble;
        }
        return QC.c(new BinderC3356ib(null, Uri.parse(optString), d2, optInt, optInt2, hashMap2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3878sD d(JSONObject jSONObject, St st, Ut ut, C4826a c4826a, C4221yf c4221yf) {
        q2.f1 f1Var;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString(com.onesignal.inAppMessages.internal.d.HTML);
        int i = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i = optInt;
        } else if (optInt2 == 0) {
            f1Var = q2.f1.a();
            C3314hn c3314hn = this.i;
            c3314hn.getClass();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                C4835j.f39733C.f39745k.getClass();
                c3314hn.f30938j.c("native-assets-loading-video-composition-start", System.currentTimeMillis());
            }
            C3878sD t6 = QC.t(ND.f26473u, new C2893Zm(c3314hn, f1Var, st, ut, c4826a, c4221yf, optString, optString2, 1), c3314hn.f30931b);
            return QC.t(t6, new C2938an(t6, 1), AbstractC3413jg.f31275h);
        }
        f1Var = new q2.f1(this.f29581a, new k2.h(i, optInt2));
        C3314hn c3314hn2 = this.i;
        c3314hn2.getClass();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
        }
        C3878sD t62 = QC.t(ND.f26473u, new C2893Zm(c3314hn2, f1Var, st, ut, c4826a, c4221yf, optString, optString2, 1), c3314hn2.f30931b);
        return QC.t(t62, new C2938an(t62, 1), AbstractC3413jg.f31275h);
    }

    public final HD e(String str, boolean z3, N3.a aVar) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32117R2)).booleanValue()) {
            MA.f(aVar, str, this.f29587g);
        }
        return z3 ? QC.t(aVar, new C3304hd(1, aVar), AbstractC3413jg.f31275h) : QC.r(aVar, Exception.class, new C2556Fi(1), AbstractC3413jg.f31275h);
    }
}
