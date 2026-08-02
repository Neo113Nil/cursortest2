package defpackage;

/* loaded from: classes.dex */
public final class f6x extends xkt {
    public static final Object c = new Object();
    public Object b;

    public f6x(Object obj) {
        super(1);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        wvs.n();
        return null;
    }
}
