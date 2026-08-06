package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oe1 extends h50 implements wu {
    public final /* synthetic */ u0 AvO7iQsrTN;
    public final /* synthetic */ WIEu4Ya2g8 EljAMC1QTz;
    public final /* synthetic */ o4 encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe1(WIEu4Ya2g8 wIEu4Ya2g8, u0 u0Var, o4 o4Var) {
        super(0);
        this.EljAMC1QTz = wIEu4Ya2g8;
        this.AvO7iQsrTN = u0Var;
        this.encWxUiV2 = o4Var;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        u0 u0Var = this.AvO7iQsrTN;
        WIEu4Ya2g8 wIEu4Ya2g8 = this.EljAMC1QTz;
        wIEu4Ya2g8.removeOnAttachStateChangeListener(u0Var);
        o50.Y6hRI1cF8(wIEu4Ya2g8).GWasM1elztuh.remove(this.encWxUiV2);
        return kc1.GWasM1elztuh;
    }
}
