package defpackage;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class xil0 implements wil0 {
    public final vil0 a;
    public g001 b;
    public long c = -9223372036854775807L;
    public long d = 0;
    public int e = -1;

    public xil0(vil0 vil0Var) {
        this.a = vil0Var;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        this.c = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        this.b.getClass();
        int i2 = this.e;
        if (i2 != -1 && i != sil0.a(i2)) {
            int i3 = tw21.a;
            Locale locale = Locale.US;
        }
        long d = qva1.d(this.a.b, this.d, j, this.c);
        int a = ef90Var.a();
        this.b.a(ef90Var, a, 0);
        this.b.c(d, 1, a, 0, null);
        this.e = i;
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 1);
        this.b = B;
        B.d(this.a.c);
    }
}
