package yads;

import defpackage.wr71;

/* loaded from: classes7.dex */
public final class zk2 extends y31 {
    public final transient w31 w;
    public final transient al2 x;

    public zk2(w31 w31Var, al2 al2Var) {
        this.w = w31Var;
        this.x = al2Var;
    }

    @Override // yads.n31
    public final int a(int i, Object[] objArr) {
        return this.x.a(i, objArr);
    }

    @Override // yads.y31, yads.n31
    public final t31 b() {
        return this.x;
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w.get(obj) != null;
    }

    @Override // yads.n31
    public final boolean i() {
        return true;
    }

    @Override // yads.n31
    /* renamed from: j */
    public final wr71 iterator() {
        return this.x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((bl2) this.w).y;
    }
}
