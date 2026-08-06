package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k70 extends he0 implements go {
    public m70 mE4lRynR;

    @Override // defpackage.go
    public final void DmJncFq5(i60 i60Var) {
        ArrayList arrayList = this.mE4lRynR.encWxUiV2;
        if (arrayList.size() <= 0) {
            i60Var.GWasM1elztuh();
        } else {
            mr0.WIEu4Ya2g8(arrayList.get(0));
            throw null;
        }
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        m70 m70Var = this.mE4lRynR;
        m70Var.X1lG3V04pd();
        m70Var.Yi7zF1RB1 = null;
    }

    @Override // defpackage.he0
    public final void cTIXpaxc() {
        this.mE4lRynR.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k70) && o30.rQPn8YBR(this.mE4lRynR, ((k70) obj).mE4lRynR);
    }

    public final int hashCode() {
        return this.mE4lRynR.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.mE4lRynR + ')';
    }
}
