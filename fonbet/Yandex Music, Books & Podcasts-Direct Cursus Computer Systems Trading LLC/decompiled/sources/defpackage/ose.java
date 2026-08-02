package defpackage;

import java.util.AbstractList;

/* loaded from: classes3.dex */
public final class ose extends AbstractList {
    public final mse a;
    public final nse b;

    public ose(mse mseVar, nse nseVar) {
        this.a = mseVar;
        this.b = nseVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(((ipe) this.a).n(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
