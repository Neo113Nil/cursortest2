package defpackage;

/* loaded from: classes5.dex */
public final class ry0 extends wug {
    public final long[] a;
    public int b;

    public ry0(long[] jArr) {
        this.a = jArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // defpackage.wug
    public final long nextLong() {
        try {
            long[] jArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            wvs.h(e.getMessage());
            return 0L;
        }
    }
}
