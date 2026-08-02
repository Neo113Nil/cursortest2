package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ddx extends ocx {
    public final transient u7x f;
    public final transient gdx g;

    public ddx(u7x u7xVar, gdx gdxVar) {
        super(1);
        this.f = u7xVar;
        this.g = gdxVar;
    }

    @Override // defpackage.r4x
    public final int a(Object[] objArr) {
        return this.g.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.d;
    }
}
