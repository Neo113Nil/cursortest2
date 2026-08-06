package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0664pc extends X4 implements Ma, La {

    /* renamed from: w, reason: collision with root package name */
    public final C0564lg f6737w;

    /* renamed from: x, reason: collision with root package name */
    public final C0668pg f6738x;

    /* renamed from: y, reason: collision with root package name */
    public final E6 f6739y;

    public C0664pc(Context context, C0415fm c0415fm, Q4 q4, C0630o4 c0630o4, C0564lg c0564lg, E6 e6, V4 v4) {
        this(context, q4, c0630o4, new C0522k0(), new TimePassedChecker(), new C0715rc(context, q4, c0630o4, v4, c0415fm, new C0534kc(e6), C0610na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0610na.k().w(), C0610na.k().l(), new C0379ec()), c0564lg, e6);
    }

    @Override // io.appmetrica.analytics.impl.X4
    public final void C() {
        this.f6737w.a(this.f6738x);
    }

    public final boolean D() {
        boolean optBoolean;
        C0883xo c0883xo = this.t;
        synchronized (c0883xo) {
            optBoolean = c0883xo.f7214a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(C0630o4 c0630o4) {
        super.a(c0630o4);
        this.f6739y.a(c0630o4.f6652i);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a() {
        C0883xo c0883xo = this.t;
        synchronized (c0883xo) {
            C0909yo c0909yo = c0883xo.f7214a;
            c0909yo.a(c0909yo.a().put("referrer_handled", true));
        }
    }

    public C0664pc(Context context, Q4 q4, C0630o4 c0630o4, C0522k0 c0522k0, TimePassedChecker timePassedChecker, C0715rc c0715rc, C0564lg c0564lg, E6 e6) {
        super(context, q4, c0522k0, timePassedChecker, c0715rc, c0630o4);
        this.f6737w = c0564lg;
        X8 k2 = k();
        k2.a(EnumC0301bb.EVENT_TYPE_REGULAR, new Hg(k2.b()));
        this.f6738x = c0715rc.a(this);
        this.f6739y = e6;
        C0610na.k().x().onMainReporterCreated(new C0827vk(this, c0630o4));
    }
}
