package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class Aa extends AbstractC0741ti {
    public final Zj a;
    public final C0224bk b;
    public final Nj c;

    public Aa(S5 s5) {
        this.a = new Zj(s5);
        this.b = new C0224bk(s5);
        this.c = new Nj(s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0741ti
    public final AbstractC0502la a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = Hc.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.a);
        } else if (ordinal == 3) {
            linkedList.add(this.c);
        } else if (ordinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new C0473ka(linkedList);
    }
}
