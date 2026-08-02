package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0436j2 implements InterfaceC0746tn {
    public static final C0408i2 b = new C0408i2();
    public static final int c = 1;
    public final InterfaceC0868y0 a;

    public C0436j2(InterfaceC0868y0 interfaceC0868y0) {
        this.a = interfaceC0868y0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0746tn
    public final void reportData(int i, Bundle bundle) {
        ((C0350g2) this.a).a(bundle);
    }
}
