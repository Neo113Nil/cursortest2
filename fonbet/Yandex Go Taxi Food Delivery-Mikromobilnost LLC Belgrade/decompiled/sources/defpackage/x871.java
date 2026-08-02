package defpackage;

/* loaded from: classes7.dex */
public abstract class x871 extends wr71 {
    public int a = 2;
    public Object b;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 4) {
            ny61.k();
            return false;
        }
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        this.a = 4;
        this.b = a();
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
