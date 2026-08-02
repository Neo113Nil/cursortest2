package defpackage;

/* loaded from: classes10.dex */
public final class suw {
    public final int a;
    public final int b;
    public final h5y c;

    public suw(int i, int i2, h5y h5yVar) {
        this.a = i;
        this.b = i2;
        this.c = h5yVar;
        if (i < 0) {
            lxv.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        lxv.a("size should be > 0");
    }
}
