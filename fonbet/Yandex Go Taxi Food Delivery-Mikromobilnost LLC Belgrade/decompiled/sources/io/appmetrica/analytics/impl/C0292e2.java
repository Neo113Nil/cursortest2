package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0292e2 extends SafeRunnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ C0321f2 b;

    public C0292e2(C0321f2 c0321f2, Bundle bundle) {
        this.b = c0321f2;
        this.a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.pauseUserSession(this.a);
    }
}
