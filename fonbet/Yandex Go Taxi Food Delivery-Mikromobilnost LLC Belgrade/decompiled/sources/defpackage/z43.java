package defpackage;

/* loaded from: classes4.dex */
public final class z43 extends jor {
    public final float[] a;
    public int b;

    public z43(float[] fArr) {
        this.a = fArr;
    }

    @Override // defpackage.jor
    public final float a() {
        try {
            float[] fArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            w511.i(e.getMessage());
            return 0.0f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }
}
