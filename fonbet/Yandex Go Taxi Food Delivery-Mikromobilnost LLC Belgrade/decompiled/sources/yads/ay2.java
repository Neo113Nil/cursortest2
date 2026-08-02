package yads;

import defpackage.k091;
import defpackage.wr71;

/* loaded from: classes7.dex */
public final class ay2 extends y31 {
    public final transient Object w;

    public ay2(Object obj) {
        obj.getClass();
        this.w = obj;
    }

    @Override // yads.n31
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.w;
        return i + 1;
    }

    @Override // yads.y31, yads.n31
    public final t31 b() {
        return t31.n(this.w);
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.w.equals(obj);
    }

    @Override // yads.y31, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // yads.n31
    public final boolean i() {
        return false;
    }

    @Override // yads.n31
    /* renamed from: j */
    public final wr71 iterator() {
        return new k091(this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.w.toString() + ']';
    }
}
