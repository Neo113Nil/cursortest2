package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o1.C4797a;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3982tn implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C4797a f35165a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35166b;

    /* renamed from: c, reason: collision with root package name */
    public final C3230fo f35167c;

    /* renamed from: d, reason: collision with root package name */
    public final C2821Tp f35168d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f35169e;

    /* renamed from: f, reason: collision with root package name */
    public final C3464k7 f35170f;

    /* renamed from: g, reason: collision with root package name */
    public final C5189a f35171g;

    /* renamed from: h, reason: collision with root package name */
    public final C4260yv f35172h;
    public final BinderC2903Yp i;

    /* renamed from: j, reason: collision with root package name */
    public final C3236fu f35173j;

    /* renamed from: k, reason: collision with root package name */
    public final C3334hk f35174k;

    public CallableC3982tn(Context context, Executor executor, C3464k7 c3464k7, C5189a c5189a, C4797a c4797a, C2821Tp c2821Tp, C4260yv c4260yv, C3230fo c3230fo, BinderC2903Yp binderC2903Yp, C3236fu c3236fu, C3334hk c3334hk) {
        this.f35166b = context;
        this.f35169e = executor;
        this.f35170f = c3464k7;
        this.f35171g = c5189a;
        this.f35165a = c4797a;
        this.f35168d = c2821Tp;
        this.f35172h = c4260yv;
        this.f35167c = c3230fo;
        this.i = binderC2903Yp;
        this.f35173j = c3236fu;
        this.f35174k = c3334hk;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C4036un c4036un = new C4036un(this);
        synchronized (c4036un) {
            String str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32790E4);
            C3464k7 c3464k7 = c4036un.f35344f;
            C4797a c4797a = c4036un.f35340b;
            BinderC2903Yp binderC2903Yp = c4036un.f35348k;
            C3955tD u6 = QC.u(QC.p(new C2524Ch(c4036un.f35341c, c3464k7, c4036un.f35345g, c4797a, binderC2903Yp, c4036un.f35349l, c4036un.f35342d, str), AbstractC3436jg.f32060f), new C2742Pe(1, c4036un), c4036un.f35343e);
            c4036un.f35351n = u6;
            MA.f(u6, "NativeJavascriptExecutor.initializeEngine", AbstractC3436jg.f32062h);
        }
        return c4036un;
    }
}
