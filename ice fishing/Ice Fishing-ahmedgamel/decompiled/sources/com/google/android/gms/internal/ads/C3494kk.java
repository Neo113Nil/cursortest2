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
import t2.InterfaceC5034c;

/* renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3494kk implements InterfaceC2663Kk, InterfaceC2561Ek, InterfaceC2544Dk {

    /* renamed from: A, reason: collision with root package name */
    public final String f32370A;

    /* renamed from: B, reason: collision with root package name */
    public final C3334hk f32371B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f32372n;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2538De f32373u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2538De f32374v;

    /* renamed from: w, reason: collision with root package name */
    public final St f32375w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC4084vh f32376x;

    /* renamed from: y, reason: collision with root package name */
    public final V2.a f32377y;

    /* renamed from: z, reason: collision with root package name */
    public final C3230fo f32378z;

    public C3494kk(Context context, St st, InterfaceC4084vh interfaceC4084vh, Yt yt, V2.a aVar, C3230fo c3230fo, C3334hk c3334hk) {
        this.f32372n = context;
        this.f32375w = st;
        this.f32376x = interfaceC4084vh;
        this.f32377y = aVar;
        this.f32378z = c3230fo;
        this.f32371B = c3334hk;
        this.f32370A = ((Ut) yt.f29533b.f25831v).f28801b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void a(Context context) {
        C3812qe c3812qe = this.f32375w.f28396d0;
        if (c3812qe == null || !f()) {
            return;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.re)).booleanValue()) {
            String str = c3812qe.f34033e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                C3334hk c3334hk = this.f32371B;
                Context context2 = this.f32372n;
                InterfaceC5034c a9 = c3334hk.a(context2);
                if (a9 != null) {
                    a9.endSession(new Y2.b(context2), str);
                }
            } catch (Throwable th) {
                e("invokeEndSession", th);
            }
        }
    }

    public final void b(String str, long j6, String str2, Bundle bundle) {
        String jSONObject = bundle != null ? new x2.d().m(bundle, new JSONObject()).toString() : null;
        this.f32377y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j6;
        String encodeToString = jSONObject != null ? Base64.encodeToString(jSONObject.getBytes(), 1) : null;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            S0.e a9 = this.f32378z.a();
            a9.M(NativeAdvancedJsUtils.f18693p, str);
            a9.M("ppwpfl", String.valueOf(elapsedRealtime));
            a9.M("ppwpfst", str2);
            String str3 = this.f32370A;
            if (str3 != null) {
                a9.M("gqi", str3);
            }
            if (encodeToString != null) {
                a9.M("ppwpferr", encodeToString);
            }
            a9.P();
        }
    }

    public final void c(boolean z6, boolean z9) {
        InterfaceC4084vh interfaceC4084vh;
        Activity j6;
        C3812qe c3812qe = this.f32375w.f28396d0;
        if (c3812qe == null) {
            return;
        }
        if (z6) {
            String str = c3812qe.f34033e;
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("targetPackage", str);
                bundle.putString("referrer", c3812qe.f34035g);
                bundle.putBundle("extra_query_params", c3812qe.f34036h);
                if (z9 && (interfaceC4084vh = this.f32376x) != null && (j6 = interfaceC4084vh.j()) != null && j6.getWindow() != null && j6.getWindow().getDecorView() != null) {
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
            this.f32377y.getClass();
            BinderC3440jk binderC3440jk = new BinderC3440jk(this, str, SystemClock.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            C3334hk c3334hk = this.f32371B;
            Context context = this.f32372n;
            InterfaceC5034c a9 = c3334hk.a(context);
            if (a9 != null) {
                a9.prewarm(new Y2.b(context), arrayList, binderC3440jk);
            }
        } catch (Throwable th) {
            e("invokeHsdpPrewarmOrPrefetch", th);
        }
    }

    public final void e(String str, Throwable th) {
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.te)).booleanValue();
        Context context = this.f32372n;
        if (booleanValue) {
            if (this.f32374v == null) {
                this.f32374v = C2521Ce.c(context);
            }
            this.f32374v.e("HsdpServiceUnsampled.".concat(str), th);
        } else {
            if (this.f32373u == null) {
                this.f32373u = C2521Ce.a(context);
            }
            this.f32373u.e("HsdpService.".concat(str), th);
        }
    }

    public final boolean f() {
        C3812qe c3812qe;
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.qe)).booleanValue() && (c3812qe = this.f32375w.f28396d0) != null && c3812qe.f34032d;
    }

    public final boolean g(int i) {
        C3812qe c3812qe = this.f32375w.f28396d0;
        return (c3812qe == null || (i & c3812qe.f34034f) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        C3812qe c3812qe = this.f32375w.f28396d0;
        if (c3812qe == null || !c3812qe.f34029a) {
            return;
        }
        if (f()) {
            if (g(1)) {
                c(g(2), ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ve)).booleanValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = c3812qe.f34030b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void n(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void s(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        C3812qe c3812qe = this.f32375w.f28396d0;
        if (c3812qe == null || !c3812qe.f34029a) {
            return;
        }
        if (f()) {
            if (g(4)) {
                c(g(8), ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ue)).booleanValue());
                return;
            }
            return;
        }
        if (g(256)) {
            ArrayList arrayList = new ArrayList();
            if (g(512)) {
                String str = c3812qe.f34030b;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                arrayList.add(str);
            }
        }
    }
}
