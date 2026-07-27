package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3905sn implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final k8.b f34136a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34137b;

    /* renamed from: c, reason: collision with root package name */
    public final C3153eo f34138c;

    /* renamed from: d, reason: collision with root package name */
    public final C2800Tp f34139d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34140e;

    /* renamed from: f, reason: collision with root package name */
    public final C3441k7 f34141f;

    /* renamed from: g, reason: collision with root package name */
    public final C5110a f34142g;

    /* renamed from: h, reason: collision with root package name */
    public final C4237yv f34143h;
    public final BinderC2880Yp i;

    /* renamed from: j, reason: collision with root package name */
    public final C3213fu f34144j;

    /* renamed from: k, reason: collision with root package name */
    public final C3311hk f34145k;

    public CallableC3905sn(Context context, Executor executor, C3441k7 c3441k7, C5110a c5110a, k8.b bVar, C2800Tp c2800Tp, C4237yv c4237yv, C3153eo c3153eo, BinderC2880Yp binderC2880Yp, C3213fu c3213fu, C3311hk c3311hk) {
        this.f34137b = context;
        this.f34140e = executor;
        this.f34141f = c3441k7;
        this.f34142g = c5110a;
        this.f34136a = bVar;
        this.f34139d = c2800Tp;
        this.f34143h = c4237yv;
        this.f34138c = c3153eo;
        this.i = binderC2880Yp;
        this.f34144j = c3213fu;
        this.f34145k = c3311hk;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C3959tn c3959tn = new C3959tn(this);
        synchronized (c3959tn) {
            String str = (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32009E4);
            C3441k7 c3441k7 = c3959tn.f34391f;
            k8.b bVar = c3959tn.f34387b;
            BinderC2880Yp binderC2880Yp = c3959tn.f34395k;
            C3932tD u3 = QC.u(QC.p(new C2504Ch(c3959tn.f34388c, c3441k7, c3959tn.f34392g, bVar, binderC2880Yp, c3959tn.f34396l, c3959tn.f34389d, str), AbstractC3413jg.f31273f), new C2722Pe(1, c3959tn), c3959tn.f34390e);
            c3959tn.f34398n = u3;
            MA.f(u3, "NativeJavascriptExecutor.initializeEngine", AbstractC3413jg.f31275h);
        }
        return c3959tn;
    }
}
