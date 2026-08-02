package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mdp extends cw7 implements epf, ipa, amd {
    public iep q;
    public final t9s r;

    public mdp(mn0 mn0Var, ges gesVar, ppc ppcVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, iep iepVar, a95 a95Var) {
        this.q = iepVar;
        t9s t9sVar = new t9s(mn0Var, gesVar, ppcVar, function1, i, z, i2, i3, list, function12, iepVar, a95Var, null);
        S0(t9sVar);
        this.r = t9sVar;
        if (this.q != null) {
            return;
        }
        vme.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        rj7.f();
        throw null;
    }

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        return this.r.E(twgVar, ffhVar, i);
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        iep iepVar = this.q;
        if (iepVar != null) {
            iepVar.d = pt0.p(iepVar.d, f8jVar, null, 2);
            bfp bfpVar = iepVar.b;
            long j = iepVar.a;
            bfpVar.a = false;
            fep fepVar = bfpVar.e;
            if (fepVar != null) {
                fepVar.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        return this.r.M(twgVar, ffhVar, i);
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        return this.r.b(twgVar, ffhVar, i);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        return this.r.c(mfhVar, ffhVar, j);
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        return this.r.p0(twgVar, ffhVar, i);
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        this.r.t0(opfVar);
    }
}
