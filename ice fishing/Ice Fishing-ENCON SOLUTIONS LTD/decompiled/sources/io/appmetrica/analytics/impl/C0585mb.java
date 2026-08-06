package io.appmetrica.analytics.impl;

import android.os.Process;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585mb implements InterfaceC0285al {
    @Override // io.appmetrica.analytics.impl.InterfaceC0285al
    public final boolean a(C0507jb c0507jb) {
        Integer num = c0507jb.f6272f;
        return num == null || num.intValue() != Process.myPid();
    }
}
