package defpackage;

/* loaded from: classes.dex */
public final class ts7 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ts7(dsc dscVar, int i) {
        this.a = (dscVar.e & 1) != 0;
        this.b = at2.o(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ts7 ts7Var = (ts7) obj;
        return dl5.a.c(this.b, ts7Var.b).c(this.a, ts7Var.a).e();
    }
}
