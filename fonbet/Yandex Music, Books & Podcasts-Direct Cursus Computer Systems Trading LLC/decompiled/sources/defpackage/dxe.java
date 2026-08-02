package defpackage;

/* loaded from: classes.dex */
public final class dxe {
    public final int a;
    public final int b;
    public final itf c;

    public dxe(int i, int i2, itf itfVar) {
        this.a = i;
        this.b = i2;
        this.c = itfVar;
        if (i < 0) {
            vme.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        vme.a("size should be > 0");
    }
}
