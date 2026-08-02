package defpackage;

/* loaded from: classes10.dex */
public abstract class zg implements eh {
    public String a;
    public final int[] b = new int[2];

    public final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public void d(String str) {
        this.a = str;
    }
}
