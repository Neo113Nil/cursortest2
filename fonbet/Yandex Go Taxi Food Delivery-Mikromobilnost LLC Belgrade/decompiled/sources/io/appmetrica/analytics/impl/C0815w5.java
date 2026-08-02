package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0815w5 extends AbstractC0741ti {
    public final C0786v5 a;

    public C0815w5(C0670r5 c0670r5) {
        this.a = new C0786v5(c0670r5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0741ti
    public final AbstractC0502la a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = Hc.a(i).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.a.a);
        } else if (ordinal == 14) {
            arrayList.add(this.a.b);
        } else if (ordinal == 34) {
            arrayList.add(this.a.c);
        }
        return new C0473ka(arrayList);
    }
}
