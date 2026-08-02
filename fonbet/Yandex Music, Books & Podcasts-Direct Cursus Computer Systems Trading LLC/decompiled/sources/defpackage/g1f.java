package defpackage;

/* loaded from: classes3.dex */
public final class g1f extends xkt {
    public final Object b;
    public boolean c;

    public g1f(Object obj) {
        super(0);
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
