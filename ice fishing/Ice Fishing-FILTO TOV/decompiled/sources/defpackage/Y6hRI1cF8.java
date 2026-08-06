package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Y6hRI1cF8 extends jivtDDk9H implements ListIterator {
    public final /* synthetic */ lv06NcmrQ encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6hRI1cF8(lv06NcmrQ lv06ncmrq, int i) {
        super(0, lv06ncmrq);
        this.encWxUiV2 = lv06ncmrq;
        int GWasM1elztuh = lv06ncmrq.GWasM1elztuh();
        if (i < 0 || i > GWasM1elztuh) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", GWasM1elztuh));
            throw null;
        }
        this.EljAMC1QTz = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.EljAMC1QTz > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.EljAMC1QTz;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            o4.E7jCp8Ls();
            return null;
        }
        int i = this.EljAMC1QTz - 1;
        this.EljAMC1QTz = i;
        return this.encWxUiV2.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.EljAMC1QTz - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
