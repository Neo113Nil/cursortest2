package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class aa extends ba {
    public static final /* synthetic */ AtomicIntegerFieldUpdater JFJ3QoxA = AtomicIntegerFieldUpdater.newUpdater(aa.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final z9 encWxUiV2;
    public final boolean mOu10nynGul;

    public /* synthetic */ aa(z9 z9Var, boolean z) {
        this(z9Var, z, vp.OOA6hdeuvCS, -3, l8.OOA6hdeuvCS);
    }

    @Override // defpackage.ba
    public final z9 AvO7iQsrTN(ph phVar) {
        if (!this.mOu10nynGul || JFJ3QoxA.getAndSet(this, 1) == 0) {
            return this.EljAMC1QTz == -3 ? this.encWxUiV2 : super.AvO7iQsrTN(phVar);
        }
        o4.jivtDDk9H("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.ba
    public final ls EljAMC1QTz() {
        return new aa(this.encWxUiV2, this.mOu10nynGul);
    }

    @Override // defpackage.ba, defpackage.ls
    public final Object GWasM1elztuh(ms msVar, vg vgVar) {
        int i = this.EljAMC1QTz;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == -3) {
            boolean z = this.mOu10nynGul;
            if (z && JFJ3QoxA.getAndSet(this, 1) != 0) {
                o4.jivtDDk9H("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object cilMamHF = fb1.cilMamHF(msVar, this.encWxUiV2, z, vgVar);
            if (cilMamHF == qhVar) {
                return cilMamHF;
            }
        } else {
            Object GWasM1elztuh = super.GWasM1elztuh(msVar, vgVar);
            if (GWasM1elztuh == qhVar) {
                return GWasM1elztuh;
            }
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.ba
    public final ba OOA6hdeuvCS(gh ghVar, int i, l8 l8Var) {
        return new aa(this.encWxUiV2, this.mOu10nynGul, ghVar, i, l8Var);
    }

    @Override // defpackage.ba
    public final String X1lG3V04pd() {
        return "channel=" + this.encWxUiV2;
    }

    @Override // defpackage.ba
    public final Object xqGvceK5x(ds0 ds0Var, vg vgVar) {
        Object cilMamHF = fb1.cilMamHF(new u01(ds0Var), this.encWxUiV2, this.mOu10nynGul, vgVar);
        return cilMamHF == qh.OOA6hdeuvCS ? cilMamHF : kc1.GWasM1elztuh;
    }

    public aa(z9 z9Var, boolean z, gh ghVar, int i, l8 l8Var) {
        super(ghVar, i, l8Var);
        this.encWxUiV2 = z9Var;
        this.mOu10nynGul = z;
        this.consumed$volatile = 0;
    }
}
