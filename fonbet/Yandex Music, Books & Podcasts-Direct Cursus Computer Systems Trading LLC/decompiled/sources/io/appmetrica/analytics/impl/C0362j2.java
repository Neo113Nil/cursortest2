package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0362j2 implements InterfaceC0153bn {

    @NotNull
    public static final C0334i2 b = new C0334i2();
    public static final int c = 1;
    public final InterfaceC0736w0 a;

    public C0362j2(@NotNull InterfaceC0736w0 interfaceC0736w0) {
        this.a = interfaceC0736w0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0153bn
    public final void reportData(int i, @NotNull Bundle bundle) {
        ((C0276g2) this.a).a(bundle);
    }
}
