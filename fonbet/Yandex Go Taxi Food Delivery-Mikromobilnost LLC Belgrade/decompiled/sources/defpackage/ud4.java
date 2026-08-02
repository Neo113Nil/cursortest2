package defpackage;

/* loaded from: classes4.dex */
public final class ud4 extends s3 {
    @Override // defpackage.s3
    public final i3 E(b3 b3Var) {
        return new nd4(b3Var);
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        b3 aSN1Primitive = this.w.toASN1Primitive();
        boolean C = C();
        if (z) {
            int i = this.b;
            if (C || aSN1Primitive.o()) {
                i |= 32;
            }
            ryhVar.L(i, this.c);
        }
        if (!C) {
            aSN1Primitive.n(ryhVar, false);
            return;
        }
        ryhVar.E(128);
        aSN1Primitive.n(ryhVar, true);
        ryhVar.E(0);
        ryhVar.E(0);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return C() || this.w.toASN1Primitive().o();
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        b3 aSN1Primitive = this.w.toASN1Primitive();
        boolean C = C();
        int p = aSN1Primitive.p(C);
        if (C) {
            p += 3;
        }
        return p + (z ? ryh.x(this.c) : 0);
    }
}
