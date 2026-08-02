package defpackage;

/* loaded from: classes8.dex */
public final class uut {
    public static final uut e = new uut("", -1);
    public static final int[] f = {3, 1};
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public uut(String str, int i) {
        this.a = str;
        this.b = i;
        boolean z = false;
        this.c = i == 3;
        if (str.length() > 0) {
            int[] iArr = f;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (iArr[i2] == this.b) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.d = z;
    }
}
