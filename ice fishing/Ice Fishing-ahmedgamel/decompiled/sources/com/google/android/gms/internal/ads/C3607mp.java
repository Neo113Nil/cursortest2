package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3607mp implements InterfaceC4200xp {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f33361h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C2590Gf f33362a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f33363b;

    /* renamed from: c, reason: collision with root package name */
    public final C3075cu f33364c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f33365d;

    /* renamed from: e, reason: collision with root package name */
    public final C2719Np f33366e;

    /* renamed from: f, reason: collision with root package name */
    public final Vu f33367f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f33368g;

    public C3607mp(Context context, C3075cu c3075cu, C2590Gf c2590Gf, C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, C2719Np c2719Np, Vu vu) {
        this.f33368g = context;
        this.f33364c = c3075cu;
        this.f33362a = c2590Gf;
        this.f33363b = c3383ig;
        this.f33365d = scheduledExecutorService;
        this.f33366e = c2719Np;
        this.f33367f = vu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4200xp
    public final P3.a d(C2759Qe c2759Qe) {
        P3.a r9;
        C2590Gf c2590Gf = this.f33362a;
        String str = c2759Qe.f27829w;
        w2.D d9 = C4906k.f40186C.f40191c;
        boolean e9 = w2.D.e(str);
        C3383ig c3383ig = (C3383ig) c2590Gf.f25831v;
        if (e9) {
            r9 = QC.k(new C4254yp(1));
        } else {
            r9 = QC.r(((C3383ig) c2590Gf.f25830u).b(new E2.w(6, c2590Gf, c2759Qe)), ExecutionException.class, C2576Fi.f25610c, c3383ig);
        }
        XC r10 = QC.r(r9, C4254yp.class, new C3339hp(c2590Gf, c2759Qe, Binder.getCallingUid(), 0), c3383ig);
        Su e10 = Su.e(this.f33368g, 11);
        AbstractC2792Sd.p(r10, e10);
        AbstractC3310hD t6 = QC.t(r10, new C4187xc(5, this), this.f33363b);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.z6)).booleanValue()) {
            t6 = QC.r(QC.s(t6, ((Integer) r2.f40509c.a(AbstractC3592ma.f32756A6)).intValue(), TimeUnit.SECONDS, this.f33365d), TimeoutException.class, C2576Fi.f25611d, AbstractC3436jg.f32062h);
        }
        AbstractC2792Sd.G(t6, this.f33367f, e10, false);
        t6.a(new LD(0, t6, new C3717or(this)), AbstractC3436jg.f32062h);
        return t6;
    }
}
