package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3584mp implements InterfaceC4177xp {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f32583h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C2570Gf f32584a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f32585b;

    /* renamed from: c, reason: collision with root package name */
    public final C3052cu f32586c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f32587d;

    /* renamed from: e, reason: collision with root package name */
    public final C2699Np f32588e;

    /* renamed from: f, reason: collision with root package name */
    public final Vu f32589f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f32590g;

    public C3584mp(Context context, C3052cu c3052cu, C2570Gf c2570Gf, C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, C2699Np c2699Np, Vu vu) {
        this.f32590g = context;
        this.f32586c = c3052cu;
        this.f32584a = c2570Gf;
        this.f32585b = c3360ig;
        this.f32587d = scheduledExecutorService;
        this.f32588e = c2699Np;
        this.f32589f = vu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4177xp
    public final N3.a d(C2739Qe c2739Qe) {
        N3.a r9;
        C2570Gf c2570Gf = this.f32584a;
        String str = c2739Qe.f27044w;
        u2.D d2 = C4835j.f39730C.f39735c;
        boolean e9 = u2.D.e(str);
        C3360ig c3360ig = (C3360ig) c2570Gf.f25043v;
        if (e9) {
            r9 = QC.k(new C4231yp(1));
        } else {
            r9 = QC.r(((C3360ig) c2570Gf.f25042u).b(new C2.x(6, c2570Gf, c2739Qe)), ExecutionException.class, C2556Fi.f24821c, c3360ig);
        }
        XC r10 = QC.r(r9, C4231yp.class, new C3316hp(c2570Gf, c2739Qe, Binder.getCallingUid(), 0), c3360ig);
        Su g4 = Su.g(this.f32590g, 11);
        AbstractC2772Sd.p(r10, g4);
        AbstractC3287hD t6 = QC.t(r10, new C4164xc(5, this), this.f32585b);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.z6)).booleanValue()) {
            t6 = QC.r(QC.s(t6, ((Integer) r2.f40207c.a(AbstractC3569ma.f31975A6)).intValue(), TimeUnit.SECONDS, this.f32587d), TimeoutException.class, C2556Fi.f24822d, AbstractC3413jg.f31275h);
        }
        AbstractC2772Sd.G(t6, this.f32589f, g4, false);
        t6.a(new LD(0, t6, new C3694or(this)), AbstractC3413jg.f31275h);
        return t6;
    }
}
