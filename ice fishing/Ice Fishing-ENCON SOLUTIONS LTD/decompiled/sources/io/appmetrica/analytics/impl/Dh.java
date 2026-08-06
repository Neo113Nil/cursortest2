package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Dh extends X4 {

    /* renamed from: w, reason: collision with root package name */
    public final String f4303w;

    /* renamed from: x, reason: collision with root package name */
    public final E6 f4304x;

    public Dh(Context context, Q4 q4, C0630o4 c0630o4, E6 e6, C0415fm c0415fm, V4 v4, InterfaceC0738s9 interfaceC0738s9) {
        this(context, q4, new C0522k0(), new TimePassedChecker(), new C0321c5(context, q4, c0630o4, v4, c0415fm, new C0902yh(e6), C0610na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0610na.k().l(), interfaceC0738s9), e6, c0630o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(C0630o4 c0630o4) {
        super.a(c0630o4);
        this.f4304x.a(this.f4303w, c0630o4.f6652i);
    }

    public Dh(Context context, Q4 q4, C0522k0 c0522k0, TimePassedChecker timePassedChecker, C0321c5 c0321c5, E6 e6, C0630o4 c0630o4) {
        super(context, q4, c0522k0, timePassedChecker, c0321c5, c0630o4);
        this.f4303w = q4.b();
        this.f4304x = e6;
    }
}
