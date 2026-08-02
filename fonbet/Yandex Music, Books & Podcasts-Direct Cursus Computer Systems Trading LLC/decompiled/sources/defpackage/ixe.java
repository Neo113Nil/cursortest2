package defpackage;

/* loaded from: classes.dex */
public abstract class ixe extends xci implements epf {
    public final /* synthetic */ int o;

    public /* synthetic */ ixe(int i) {
        this.o = i;
    }

    public int E(twg twgVar, ffh ffhVar, int i) {
        switch (this.o) {
        }
        return ffhVar.a(i);
    }

    @Override // defpackage.epf
    public int M(twg twgVar, ffh ffhVar, int i) {
        switch (this.o) {
        }
        return ffhVar.G(i);
    }

    public abstract long S0(ffh ffhVar, long j);

    public abstract boolean T0();

    @Override // defpackage.epf
    public int b(twg twgVar, ffh ffhVar, int i) {
        switch (this.o) {
        }
        return ffhVar.J(i);
    }

    public lfh c(mfh mfhVar, ffh ffhVar, long j) {
        long S0 = S0(ffhVar, j);
        if (T0()) {
            S0 = ia6.e(j, S0);
        }
        ksk M = ffhVar.M(S0);
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 9));
    }

    public int p0(twg twgVar, ffh ffhVar, int i) {
        switch (this.o) {
        }
        return ffhVar.z(i);
    }
}
