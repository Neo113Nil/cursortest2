package defpackage;

/* loaded from: classes3.dex */
public final class qpd {
    public int a;
    public int b;
    public int c;
    public float d;

    public static void a(qpd qpdVar, int i, int i2, float f, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            f = 0.0f;
        }
        qpdVar.b = Math.max(qpdVar.b, i);
        qpdVar.c = Math.max(qpdVar.c, i2);
        qpdVar.d = Math.max(qpdVar.d, f);
    }

    public final boolean b() {
        return this.d > 0.0f;
    }
}
