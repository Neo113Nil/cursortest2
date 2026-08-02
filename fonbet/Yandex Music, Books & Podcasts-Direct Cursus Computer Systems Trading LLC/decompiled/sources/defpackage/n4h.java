package defpackage;

/* loaded from: classes.dex */
public final class n4h {
    public int a;
    public float[] b;
    public int[] c;

    public n4h(int[] iArr) {
        this.c = iArr;
        if (iArr.length == 0) {
            qq6.d("Empty array can't be reduced.");
            throw null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                i *= iArr[i2];
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.a = i;
        this.b = new float[i];
    }
}
