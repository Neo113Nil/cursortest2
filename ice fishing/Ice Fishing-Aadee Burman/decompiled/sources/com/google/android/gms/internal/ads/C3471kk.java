package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import org.json.JSONObject;
import r2.InterfaceC4950c;

/* renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3471kk implements InterfaceC2643Kk, InterfaceC2541Ek, InterfaceC2524Dk {

    /* renamed from: A, reason: collision with root package name */
    public final String f31593A;

    /* renamed from: B, reason: collision with root package name */
    public final C3311hk f31594B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f31595n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2518De f31596u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2518De f31597v;

    /* renamed from: w, reason: collision with root package name */
    public final St f31598w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC4061vh f31599x;

    /* renamed from: y, reason: collision with root package name */
    public final T2.a f31600y;

    /* renamed from: z, reason: collision with root package name */
    public final C3153eo f31601z;

    public C3471kk(Context context, St st, InterfaceC4061vh interfaceC4061vh, Yt yt, T2.a aVar, C3153eo c3153eo, C3311hk c3311hk) {
        this.f31595n = context;
        this.f31598w = st;
        this.f31599x = interfaceC4061vh;
        this.f31600y = aVar;
        this.f31601z = c3153eo;
        this.f31594B = c3311hk;
        this.f31593A = ((Ut) yt.f28754b.f25043v).f28004b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void a(Context context) {
        C3789qe c3789qe = this.f31598w.f27613d0;
        if (c3789qe == null || !f()) {
            return;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.re)).booleanValue()) {
            String str = c3789qe.f33251e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                C3311hk c3311hk = this.f31594B;
                Context context2 = this.f31595n;
                InterfaceC4950c a9 = c3311hk.a(context2);
                if (a9 != null) {
                    a9.endSession(new W2.b(context2), str);
                }
            } catch (Throwable th) {
                e("invokeEndSession", th);
            }
        }
    }

    public final void b(String str, long j6, String str2, Bundle bundle) {
        String jSONObject = bundle != null ? new v2.d().m(bundle, new JSONObject()).toString() : null;
        this.f31600y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j6;
        String encodeToString = jSONObject != null ? Base64.encodeToString(jSONObject.getBytes(), 1) : null;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.se)).booleanValue()) {
            S0.e a9 = this.f31601z.a();
            a9.v(NativeAdvancedJsUtils.f17906p, str);
            a9.v("ppwpfl", String.valueOf(elapsedRealtime));
            a9.v("ppwpfst", str2);
            String str3 = this.f31593A;
            if (str3 != null) {
                a9.v("gqi", str3);
            }
            if (encodeToString != null) {
                a9.v("ppwpferr", encodeToString);
            }
            a9.B();
        }
    }

    public final void c(boolean z3, boolean z6) {
        InterfaceC4061vh interfaceC4061vh;
        Activity j6;
        C3789qe c3789qe = this.f31598w.f27613d0;
        if (c3789qe == null) {
            return;
        }
        if (z3) {
            String str = c3789qe.f33251e;
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("targetPackage", str);
                bundle.putString("referrer", c3789qe.f33253g);
                bundle.putBundle("extra_query_params", c3789qe.f33254h);
                if (z6 && (interfaceC4061vh = this.f31599x) != null && (j6 = interfaceC4061vh.j()) != null && j6.getWindow() != null && j6.getWindow().getDecorView() != null) {
                    bundle.putBinder("window_token", j6.getWindow().getDecorView().getWindowToken());
                }
                d("ppfla", bundle);
                return;
            }
        }
        d("ppwla", null);
    }

    public final void d(String str, Bundle bundle) {
        try {
            this.f31600y.getClass();
            BinderC3417jk binderC3417jk = new BinderC3417jk(this, str, SystemClock.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            C3311hk c3311hk = this.f31594B;
            Context context = this.f31595n;
            InterfaceC4950c a9 = c3311hk.a(context);
            if (a9 != null) {
                a9.prewarm(new W2.b(context), arrayList, binderC3417jk);
            }
        } catch (Throwable th) {
            e("invokeHsdpPrewarmOrPrefetch", th);
        }
    }

    public final void e(String str, Throwable th) {
        boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.te)).booleanValue();
        Context context = this.f31595n;
        if (booleanValue) {
            if (this.f31597v == null) {
                this.f31597v = C2501Ce.c(context);
            }
            this.f31597v.e("HsdpServiceUnsampled.".concat(str), th);
        } else {
            if (this.f31596u == null) {
                this.f31596u = C2501Ce.a(context);
            }
            this.f31596u.e("HsdpService.".concat(str), th);
        }
    }

    public final boolean f() {
        C3789qe c3789qe;
        return ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.qe)).booleanValue() && (c3789qe = this.f31598w.f27613d0) != null && c3789qe.f33250d;
    }

    public final boolean g(int i) {
        C3789qe c3789qe = this.f31598w.f27613d0;
        return (c3789qe == null || (i & c3789qe.f33252f) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        C3789qe c3789qe = this.f31598w.f27613d0;
        if (c3789qe == null || !c3789qe.f33247a) {
            return;
        }
        if (f()) {
            if (g(1)) {
                c(g(2), ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ve)).booleanValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = c3789qe.f33248b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void n(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void s(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        C3789qe c3789qe = this.f31598w.f27613d0;
        if (c3789qe == null || !c3789qe.f33247a) {
            return;
        }
        if (f()) {
            if (g(4)) {
                c(g(8), ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ue)).booleanValue());
                return;
            }
            return;
        }
        if (g(256)) {
            ArrayList arrayList = new ArrayList();
            if (g(512)) {
                String str = c3789qe.f33248b;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                arrayList.add(str);
            }
        }
    }
}
