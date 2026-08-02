package defpackage;

/* loaded from: classes15.dex */
public final class ybb extends fv10 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    public /* synthetic */ ybb(long j, int i) {
        this.c = i;
        this.d = j;
    }

    @Override // defpackage.fv10
    public final int a(j3b j3bVar, k020 k020Var) {
        int i = this.c;
        long j = this.d;
        switch (i) {
            case 0:
                long j2 = j3bVar.a;
                at2 at2Var = k020Var.b;
                if (!at2Var.B().I(j2, j)) {
                    return -1;
                }
                int k = at2Var.B().k(j2, j) - 1;
                if (k < 0) {
                    return 0;
                }
                return k;
            default:
                int k2 = k020Var.b.B().k(j3bVar.a, j) - 1;
                if (k2 < 0) {
                    return 0;
                }
                return k2;
        }
    }
}
