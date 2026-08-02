package defpackage;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class w5x extends q5x {
    public final /* synthetic */ y5x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5x(y5x y5xVar) {
        super(0);
        this.e = y5xVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        z5x z5xVar = this.e.f;
        return new AbstractMap.SimpleImmutableEntry(z5xVar.c.h.get(i), z5xVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.f.d.size();
    }
}
