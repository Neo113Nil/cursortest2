package defpackage;

import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes13.dex */
public final class va0 extends ad5 {
    public final kb0 x;
    public final dcp0 y;
    public CardType z;

    public va0(kb0 kb0Var, dcp0 dcp0Var) {
        super(ba0.class);
        this.x = kb0Var;
        this.y = dcp0Var;
        this.z = CardType.INSUFFICIENT_DIGITS;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((wjh) this.y).a(this);
        super.Cg();
    }
}
