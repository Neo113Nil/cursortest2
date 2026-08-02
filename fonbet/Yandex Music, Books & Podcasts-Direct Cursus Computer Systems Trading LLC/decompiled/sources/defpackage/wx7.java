package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wx7 extends p9 implements cpf, zci {
    public final opv b;
    public final uif c;
    public final x6k d;

    /* JADX WARN: Multi-variable type inference failed */
    public wx7(opv opvVar, Function2 function2) {
        super(lhb.v0);
        this.b = opvVar;
        this.c = (uif) function2;
        this.d = szf.g0(opvVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, uif] */
    @Override // defpackage.cpf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        int intValue = ((Number) this.c.invoke((opv) this.d.getValue(), mfhVar)).intValue();
        if (intValue == 0) {
            return mfh.m0(mfhVar, 0, 0, e27.F);
        }
        ksk M = ffhVar.M(ga6.b(j, 0, 0, intValue, intValue, 3));
        return mfh.m0(mfhVar, M.a, intValue, new ai0(M, 5));
    }

    @Override // defpackage.zci
    public final void d(ddi ddiVar) {
        this.d.setValue(new lob(this.b, (opv) ddiVar.d(sqv.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx7)) {
            return false;
        }
        wx7 wx7Var = (wx7) obj;
        return Intrinsics.d(this.b, wx7Var.b) && this.c == wx7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
