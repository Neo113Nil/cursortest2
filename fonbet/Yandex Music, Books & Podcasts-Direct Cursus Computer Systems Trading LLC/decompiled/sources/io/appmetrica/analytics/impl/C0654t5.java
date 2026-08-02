package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0654t5 extends AbstractC0177ci {
    public final C0625s5 a;

    public C0654t5(C0510o5 c0510o5) {
        this.a = new C0625s5(c0510o5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0177ci
    public final AbstractC0226ea a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0603rc.a(i).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.a.a);
        } else if (ordinal == 14) {
            arrayList.add(this.a.b);
        } else if (ordinal == 34) {
            arrayList.add(this.a.c);
        }
        return new C0198da(arrayList);
    }
}
