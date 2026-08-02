package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0217bd implements InterfaceC0892yo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0892yo
    public final boolean a(Yc yc) {
        Integer num = yc.f;
        return num == null || num.intValue() != Process.myPid();
    }
}
