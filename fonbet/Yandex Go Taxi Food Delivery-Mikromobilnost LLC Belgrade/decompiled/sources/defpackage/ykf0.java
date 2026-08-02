package defpackage;

/* loaded from: classes10.dex */
public final class ykf0 {
    public final int a;
    public final int b;
    public final float[] c;
    public final float[] d;

    public ykf0(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        switch (i3) {
            case 1:
                this.a = i;
                if (fArr.length * 2 != fArr2.length * 3) {
                    w511.q();
                    throw null;
                }
                this.c = fArr;
                this.d = fArr2;
                this.b = i2;
                return;
            default:
                this.a = i;
                d6z.l(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
                this.c = fArr;
                this.d = fArr2;
                this.b = i2;
                return;
        }
    }
}
