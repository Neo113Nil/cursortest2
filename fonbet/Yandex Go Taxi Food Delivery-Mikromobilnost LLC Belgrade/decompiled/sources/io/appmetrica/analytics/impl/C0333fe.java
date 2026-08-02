package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0333fe extends S5 {
    public final C7 w;

    public C0333fe(Context context, Bp bp, K5 k5, C0439j5 c0439j5, C7 c7, Q5 q5) {
        this(context, k5, c0439j5, new C0637q0(), new TimePassedChecker(), new C0391he(context, k5, c0439j5, q5, bp, new C0218be(c7), Jb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), Jb.k().w(), Jb.k().l(), new Ud()), c7);
    }

    @Override // io.appmetrica.analytics.impl.S5, io.appmetrica.analytics.impl.InterfaceC0562nc
    public final synchronized void a(C0439j5 c0439j5) {
        super.a(c0439j5);
        this.w.a(c0439j5.i);
    }

    @Override // io.appmetrica.analytics.impl.S5, io.appmetrica.analytics.impl.InterfaceC0302ec
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    public C0333fe(Context context, K5 k5, C0439j5 c0439j5, C0637q0 c0637q0, TimePassedChecker timePassedChecker, C0391he c0391he, C7 c7) {
        super(context, k5, c0637q0, timePassedChecker, c0391he, c0439j5);
        C0531ma l = l();
        l.a(Hc.EVENT_TYPE_REGULAR, new C0656qj(l.a()));
        this.w = c7;
        Jb.k().x().onMainReporterCreated(new Nn(this, c0439j5));
    }
}
