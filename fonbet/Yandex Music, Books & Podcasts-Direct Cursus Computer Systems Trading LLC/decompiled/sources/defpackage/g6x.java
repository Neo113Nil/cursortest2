package defpackage;

/* loaded from: classes.dex */
public final class g6x extends i6x {
    public final transient i6x c;

    public g6x(i6x i6xVar) {
        this.c = i6xVar;
    }

    @Override // defpackage.i6x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        i6x i6xVar = this.c;
        hag.L(i, i6xVar.size());
        return i6xVar.get((i6xVar.size() - 1) - i);
    }

    @Override // defpackage.i6x, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.i6x, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.a6x
    public final boolean q() {
        return this.c.q();
    }

    @Override // defpackage.i6x
    public final i6x s() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.i6x, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final i6x subList(int i, int i2) {
        i6x i6xVar = this.c;
        hag.N(i, i2, i6xVar.size());
        return i6xVar.subList(i6xVar.size() - i2, i6xVar.size() - i).s();
    }
}
