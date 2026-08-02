package defpackage;

/* loaded from: classes3.dex */
public final class t5i implements cpf {
    public final long a;

    public t5i(long j) {
        this.a = j;
    }

    @Override // defpackage.cpf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ffhVar.getClass();
        ksk M = ffhVar.M(j);
        int i = M.a;
        long j2 = this.a;
        int max = Math.max(i, mfhVar.L(fma.c(j2)));
        int max2 = Math.max(M.b, mfhVar.L(fma.b(j2)));
        return mfh.m0(mfhVar, max, max2, new dt4(max, max2, M));
    }

    public final boolean equals(Object obj) {
        t5i t5iVar = obj instanceof t5i ? (t5i) obj : null;
        if (t5iVar == null) {
            return false;
        }
        return fma.a(this.a, t5iVar.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
