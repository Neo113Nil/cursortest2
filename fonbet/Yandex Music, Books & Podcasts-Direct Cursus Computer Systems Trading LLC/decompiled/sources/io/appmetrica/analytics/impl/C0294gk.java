package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0294gk extends P5 {
    public final String w;
    public final C0772x7 x;

    public C0294gk(@NonNull Context context, @NonNull H5 h5, @NonNull C0250f5 c0250f5, @NonNull C0772x7 c0772x7, @NonNull C0385jp c0385jp, @NonNull N5 n5, @NonNull Aa aa) {
        this(context, h5, new C0505o0(), new TimePassedChecker(), new U5(context, h5, c0250f5, n5, c0385jp, new C0150bk(c0772x7), C0747wb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), C0747wb.k().l(), aa), c0772x7, c0250f5);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.impl.InterfaceC0171cc
    public final synchronized void a(@NonNull C0250f5 c0250f5) {
        super.a(c0250f5);
        this.x.a(this.w, c0250f5.i);
    }

    public C0294gk(Context context, H5 h5, C0505o0 c0505o0, TimePassedChecker timePassedChecker, U5 u5, C0772x7 c0772x7, C0250f5 c0250f5) {
        super(context, h5, c0505o0, timePassedChecker, u5, c0250f5);
        this.w = h5.b();
        this.x = c0772x7;
    }
}
