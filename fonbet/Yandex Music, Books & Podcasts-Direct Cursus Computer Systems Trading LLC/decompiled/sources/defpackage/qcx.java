package defpackage;

/* loaded from: classes.dex */
public final class qcx extends xkt {
    public final Object b;
    public boolean c;

    public qcx(Object obj) {
        super(3);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c) {
            wvs.n();
            return null;
        }
        this.c = true;
        return this.b;
    }
}
