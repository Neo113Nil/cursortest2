package defpackage;

/* loaded from: classes.dex */
public final class ni3 extends f7 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public ni3(int i, int i2, Object[] objArr) {
        super(i, i2);
        this.d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                if (!hasNext()) {
                    wvs.n();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.d;
                    int i = this.a;
                    this.a = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    wvs.n();
                    break;
                } else {
                    this.a++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.c) {
            case 0:
                if (!hasPrevious()) {
                    wvs.n();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.d;
                    int i = this.a - 1;
                    this.a = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    wvs.n();
                    break;
                } else {
                    this.a--;
                    break;
                }
        }
        return null;
    }

    public ni3(int i, Object obj) {
        super(i, 1);
        this.d = obj;
    }
}
