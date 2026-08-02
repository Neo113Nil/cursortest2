package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0657qk extends S5 {
    public final String w;
    public final C7 x;

    public C0657qk(Context context, K5 k5, C0439j5 c0439j5, C7 c7, Bp bp, Q5 q5, Ha ha) {
        this(context, k5, new C0637q0(), new TimePassedChecker(), new X5(context, k5, c0439j5, q5, bp, new C0512lk(c7), Jb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), Jb.k().l(), ha), c7, c0439j5);
    }

    @Override // io.appmetrica.analytics.impl.S5, io.appmetrica.analytics.impl.InterfaceC0562nc
    public final synchronized void a(C0439j5 c0439j5) {
        super.a(c0439j5);
        this.x.a(this.w, c0439j5.i);
    }

    public C0657qk(Context context, K5 k5, C0637q0 c0637q0, TimePassedChecker timePassedChecker, X5 x5, C7 c7, C0439j5 c0439j5) {
        super(context, k5, c0637q0, timePassedChecker, x5, c0439j5);
        this.w = k5.b();
        this.x = c7;
    }
}
