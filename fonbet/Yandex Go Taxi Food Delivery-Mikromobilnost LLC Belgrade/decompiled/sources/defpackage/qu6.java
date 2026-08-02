package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class qu6 implements g001 {
    public final int a;
    public final a b;
    public final coj c = new coj();
    public a d;
    public g001 e;
    public long f;

    public qu6(int i, int i2, a aVar) {
        this.a = i2;
        this.b = aVar;
    }

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        g001 g001Var = this.e;
        int i3 = tw21.a;
        g001Var.a(ef90Var, i, 0);
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        g001 g001Var = this.e;
        int i2 = tw21.a;
        return g001Var.b(apgVar, i, z);
    }

    @Override // defpackage.g001
    public final void c(long j, int i, int i2, int i3, f001 f001Var) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        g001 g001Var = this.e;
        int i4 = tw21.a;
        g001Var.c(j, i, i2, i3, f001Var);
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar = aVar.d(aVar2);
        }
        this.d = aVar;
        g001 g001Var = this.e;
        int i = tw21.a;
        g001Var.d(aVar);
    }
}
