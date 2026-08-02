package defpackage;

/* loaded from: classes11.dex */
public class udr {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;

    public final void a(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = this.c;
        int i6 = i4 - (this.d + i5);
        this.c = Math.max(i5, i2);
        this.d = Math.max(this.d, i3);
        this.a = Math.max(i6, i) + this.c + this.d;
    }
}
