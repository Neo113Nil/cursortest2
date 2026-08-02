package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes5.dex */
public final class Qd extends P5 implements Zb, Yb {
    public final Oi w;
    public final Si x;
    public final C0772x7 y;

    public Qd(@NonNull Context context, @NonNull C0385jp c0385jp, @NonNull H5 h5, @NonNull C0250f5 c0250f5, @NonNull Oi oi, @NonNull C0772x7 c0772x7, @NonNull N5 n5) {
        this(context, h5, c0250f5, new C0505o0(), new TimePassedChecker(), new Sd(context, h5, c0250f5, n5, c0385jp, new Ld(c0772x7), C0747wb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), C0747wb.k().w(), C0747wb.k().l(), new Ed()), oi, c0772x7);
    }

    @Override // io.appmetrica.analytics.impl.P5
    public final void D() {
        this.w.a(this.x);
    }

    public final boolean E() {
        boolean optBoolean;
        Hr hr = this.t;
        synchronized (hr) {
            optBoolean = hr.a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.Yb
    public final void a() {
        Hr hr = this.t;
        synchronized (hr) {
            Ir ir = hr.a;
            ir.a(ir.a().put("referrer_handled", true));
        }
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.impl.Pb
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.impl.InterfaceC0171cc
    public final synchronized void a(@NonNull C0250f5 c0250f5) {
        super.a(c0250f5);
        this.y.a(c0250f5.i);
    }

    public Qd(Context context, H5 h5, C0250f5 c0250f5, C0505o0 c0505o0, TimePassedChecker timePassedChecker, Sd sd, Oi oi, C0772x7 c0772x7) {
        super(context, h5, c0505o0, timePassedChecker, sd, c0250f5);
        this.w = oi;
        C0255fa l = l();
        l.a(EnumC0603rc.EVENT_TYPE_REGULAR, new C0408kj(l.b()));
        this.x = sd.a(this);
        this.y = c0772x7;
        C0747wb.k().x().onMainReporterCreated(new C0730vn(this, c0250f5));
    }
}
