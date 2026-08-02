package defpackage;

/* loaded from: classes12.dex */
public class tv4 {
    public int a = 0;
    public boolean b;

    public final void a(int i, int... iArr) {
        this.a = i;
        for (int i2 : iArr) {
            this.a = i2 | this.a;
        }
    }
}
