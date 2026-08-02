package defpackage;

/* loaded from: classes.dex */
public final class m5x extends q5x {
    public final transient q5x e;

    public m5x(q5x q5xVar) {
        super(0);
        this.e = q5xVar;
    }

    @Override // defpackage.q5x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        q5x q5xVar = this.e;
        gdg.Q(i, q5xVar.size());
        return q5xVar.get((q5xVar.size() - 1) - i);
    }

    @Override // defpackage.q5x, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.e.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.q5x, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.e.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.q5x
    public final q5x s() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    @Override // defpackage.q5x, java.util.List
    /* renamed from: t */
    public final q5x subList(int i, int i2) {
        q5x q5xVar = this.e;
        gdg.R(i, i2, q5xVar.size());
        return q5xVar.subList(q5xVar.size() - i2, q5xVar.size() - i).s();
    }
}
