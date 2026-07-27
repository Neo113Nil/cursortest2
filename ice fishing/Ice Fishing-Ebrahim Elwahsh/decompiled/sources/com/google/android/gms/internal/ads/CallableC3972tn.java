package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC3972tn implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final S0.s f34460a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34461b;

    /* renamed from: c, reason: collision with root package name */
    public final C3165eo f34462c;

    /* renamed from: d, reason: collision with root package name */
    public final C2834Vp f34463d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34464e;

    /* renamed from: f, reason: collision with root package name */
    public final C3348i7 f34465f;

    /* renamed from: g, reason: collision with root package name */
    public final C5107a f34466g;

    /* renamed from: h, reason: collision with root package name */
    public final Av f34467h;
    public final BinderC2949aq i;

    /* renamed from: j, reason: collision with root package name */
    public final C3280gu f34468j;

    public CallableC3972tn(Context context, Executor executor, C3348i7 c3348i7, C5107a c5107a, S0.s sVar, C2834Vp c2834Vp, Av av, C3165eo c3165eo, BinderC2949aq binderC2949aq, C3280gu c3280gu) {
        this.f34461b = context;
        this.f34464e = executor;
        this.f34465f = c3348i7;
        this.f34466g = c5107a;
        this.f34460a = sVar;
        this.f34463d = c2834Vp;
        this.f34467h = av;
        this.f34462c = c3165eo;
        this.i = binderC2949aq;
        this.f34468j = c3280gu;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C4026un c4026un = new C4026un(this);
        synchronized (c4026un) {
            String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31429E4);
            C3348i7 c3348i7 = c4026un.f34655f;
            S0.s sVar = c4026un.f34651b;
            BinderC2949aq binderC2949aq = c4026un.f34659k;
            C3999uD A8 = C3686oN.A(C3686oN.s(new C4236yh(c4026un.f34652c, c3348i7, c4026un.f34656g, sVar, binderC2949aq, c4026un.f34660l, c4026un.f34653d, str), AbstractC3212fg.f30743f), new C2670Me(1, c4026un), c4026un.f34654e);
            c4026un.f34661m = A8;
            AbstractC2720Pd.g(A8, "NativeJavascriptExecutor.initializeEngine", AbstractC3212fg.f30745h);
        }
        return c4026un;
    }
}
