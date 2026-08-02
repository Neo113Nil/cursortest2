package defpackage;

import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class jqm extends hq2 {
    public final int g = 2;

    @Override // defpackage.qon
    public final int f(int i) {
        return ((hqm) this.d.get(i)).c.ordinal();
    }

    @Override // defpackage.hq2, defpackage.qon
    public final void j(opn opnVar, int i) {
        s13 s13Var = (s13) opnVar;
        super.j(s13Var, i);
        s13Var.e((hqm) this.d.get(i));
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        gqm gqmVar = gqm.values()[i];
        int ordinal = gqmVar.ordinal();
        int i2 = this.g;
        if (ordinal == 0) {
            return new iqm(viewGroup, i2);
        }
        if (ordinal == 1) {
            return new igo(viewGroup, i2);
        }
        throw new EnumConstantNotPresentException(gqm.class, gqmVar.name());
    }
}
