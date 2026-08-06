package io.appmetrica.analytics.impl;

import android.os.Process;

/* loaded from: classes.dex */
public final class Gd implements InterfaceC0285al {

    /* renamed from: a, reason: collision with root package name */
    public final int f4419a;

    public Gd(int i2) {
        this.f4419a = i2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0285al
    public final boolean a(String str) {
        return this.f4419a != Process.myPid();
    }
}
