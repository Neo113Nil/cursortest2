package defpackage;

/* loaded from: classes.dex */
public final class x6x extends xkt {
    public final Object b;
    public boolean c;

    public x6x(Object obj) {
        super(2);
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
