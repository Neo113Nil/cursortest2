package defpackage;

/* loaded from: classes5.dex */
public final class ky0 extends rpe {
    public final int[] a;
    public int b;

    public ky0(int[] iArr) {
        iArr.getClass();
        this.a = iArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // defpackage.rpe
    public final int nextInt() {
        try {
            int[] iArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            wvs.h(e.getMessage());
            return 0;
        }
    }
}
