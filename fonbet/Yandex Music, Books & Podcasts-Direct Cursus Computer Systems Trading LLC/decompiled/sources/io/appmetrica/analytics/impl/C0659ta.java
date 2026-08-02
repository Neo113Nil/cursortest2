package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0659ta extends AbstractC0177ci {
    public final Pj a;
    public final Rj b;
    public final Dj c;

    public C0659ta(P5 p5) {
        this.a = new Pj(p5);
        this.b = new Rj(p5);
        this.c = new Dj(p5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0177ci
    public final AbstractC0226ea a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0603rc.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.a);
        } else if (ordinal == 3) {
            linkedList.add(this.c);
        } else if (ordinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new C0198da(linkedList);
    }
}
