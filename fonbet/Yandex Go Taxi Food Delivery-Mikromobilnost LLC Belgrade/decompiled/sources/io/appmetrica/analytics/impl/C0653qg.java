package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0653qg implements InterfaceC0892yo {
    public final int a;

    public C0653qg(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892yo
    public final boolean a(String str) {
        return this.a != Process.myPid();
    }
}
