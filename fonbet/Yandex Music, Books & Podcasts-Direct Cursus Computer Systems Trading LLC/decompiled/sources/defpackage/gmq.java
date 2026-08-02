package defpackage;

/* loaded from: classes3.dex */
public final class gmq extends hee {
    public final transient Object d;

    public gmq(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.hee, defpackage.qde
    public final yde a() {
        return yde.y(this.d);
    }

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.qde
    public final int g(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.hee, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.qde
    public final boolean r() {
        return false;
    }

    @Override // defpackage.qde
    /* renamed from: s */
    public final xkt iterator() {
        return new g1f(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // defpackage.hee, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
