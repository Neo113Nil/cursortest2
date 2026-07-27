package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3705op implements InterfaceC2477Ap {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f33213h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C2518Df f33214a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f33215b;

    /* renamed from: c, reason: collision with root package name */
    public final C3226fu f33216c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f33217d;

    /* renamed from: e, reason: collision with root package name */
    public final C2749Qp f33218e;

    /* renamed from: f, reason: collision with root package name */
    public final Yu f33219f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f33220g;

    public C3705op(Context context, C3226fu c3226fu, C2518Df c2518Df, C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, C2749Qp c2749Qp, Yu yu) {
        this.f33220g = context;
        this.f33216c = c3226fu;
        this.f33214a = c2518Df;
        this.f33215b = c3157eg;
        this.f33217d = scheduledExecutorService;
        this.f33218e = c2749Qp;
        this.f33219f = yu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477Ap
    public final J3.a c(C2687Ne c2687Ne) {
        J3.a v6;
        C2518Df c2518Df = this.f33214a;
        String str = c2687Ne.f26582w;
        t2.G g9 = p2.j.f39798C.f39803c;
        boolean e6 = t2.G.e(str);
        C3157eg c3157eg = (C3157eg) c2518Df.f24454v;
        if (e6) {
            v6 = C3686oN.l(new C2494Bp(1));
        } else {
            v6 = C3686oN.v(((C3157eg) c2518Df.f24453u).b(new T6(5, c2518Df, c2687Ne)), ExecutionException.class, C2538Ei.f24791c, c3157eg);
        }
        YC v9 = C3686oN.v(v6, C2494Bp.class, new C3435jp(c2518Df, c2687Ne, Binder.getCallingUid(), 0), c3157eg);
        Vu f6 = Vu.f(this.f33220g, 11);
        PA.t(v9, f6);
        AbstractC3354iD y6 = C3686oN.y(v9, new C3907sc(5, this), this.f33215b);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31849z6)).booleanValue()) {
            y6 = C3686oN.v(C3686oN.w(y6, ((Integer) r2.f40119c.a(AbstractC3368ia.f31398A6)).intValue(), TimeUnit.SECONDS, this.f33217d), TimeoutException.class, C2538Ei.f24792d, AbstractC3212fg.f30745h);
        }
        PA.Q(y6, this.f33219f, f6, false);
        y6.c(new MD(0, y6, new C3761pr(this)), AbstractC3212fg.f30745h);
        return y6;
    }
}
