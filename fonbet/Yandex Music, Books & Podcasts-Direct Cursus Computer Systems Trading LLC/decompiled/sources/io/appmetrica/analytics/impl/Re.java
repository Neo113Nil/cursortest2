package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes5.dex */
public final class Re extends SafeRunnable {
    public final /* synthetic */ Te a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public Re(Te te, String str, byte[] bArr) {
        this.a = te;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Te.a(this.a).setSessionExtra(this.b, this.c);
    }
}
