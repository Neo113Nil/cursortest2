package defpackage;

import kotlin.text.h;

/* loaded from: classes5.dex */
public final class t4f extends wdp {
    public final y6 k;
    public final uhp l;

    public t4f(y6 y6Var, x3f x3fVar) {
        x3fVar.getClass();
        this.k = y6Var;
        this.l = x3fVar.b;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final byte E() {
        y6 y6Var = this.k;
        String l = y6Var.l();
        try {
            return h.a(l);
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'UByte' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.eg7, defpackage.tq5
    public final uhp a() {
        return this.l;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final int h() {
        y6 y6Var = this.k;
        String l = y6Var.l();
        try {
            return h.b(l);
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'UInt' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final long l() {
        y6 y6Var = this.k;
        String l = y6Var.l();
        try {
            return h.d(l);
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'ULong' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final short o() {
        y6 y6Var = this.k;
        String l = y6Var.l();
        try {
            return h.f(l);
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'UShort' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.tq5
    public final int w(mhp mhpVar) {
        mhpVar.getClass();
        throw new IllegalStateException("unsupported");
    }
}
