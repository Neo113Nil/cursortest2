package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z21 implements af, Iterable, q40 {
    public int E7jCp8Ls;
    public int EljAMC1QTz;
    public int encWxUiV2;
    public rf0 iwATDS1i01k;
    public int mOu10nynGul;
    public boolean rQPn8YBR;
    public HashMap uFEq9NpZ;
    public int[] OOA6hdeuvCS = new int[0];
    public Object[] AvO7iQsrTN = new Object[0];
    public final Object JFJ3QoxA = new Object();
    public ArrayList XnEVoBF0td1l = new ArrayList();

    public final sx AvO7iQsrTN(int i) {
        int i2;
        ArrayList arrayList;
        int OOA6hdeuvCS;
        HashMap hashMap = this.uFEq9NpZ;
        if (hashMap != null) {
            if (this.rQPn8YBR) {
                we.GWasM1elztuh("use active SlotWriter to crate an anchor for location instead");
            }
            lx lxVar = (i < 0 || i >= (i2 = this.EljAMC1QTz) || (OOA6hdeuvCS = b31.OOA6hdeuvCS((arrayList = this.XnEVoBF0td1l), i, i2)) < 0) ? null : (lx) arrayList.get(OOA6hdeuvCS);
            if (lxVar != null) {
                return (sx) hashMap.get(lxVar);
            }
        }
        return null;
    }

    public final boolean EljAMC1QTz(lx lxVar) {
        int OOA6hdeuvCS;
        return lxVar.GWasM1elztuh() && (OOA6hdeuvCS = b31.OOA6hdeuvCS(this.XnEVoBF0td1l, lxVar.GWasM1elztuh, this.EljAMC1QTz)) >= 0 && o30.rQPn8YBR(this.XnEVoBF0td1l.get(OOA6hdeuvCS), lxVar);
    }

    public final int GWasM1elztuh(lx lxVar) {
        if (this.rQPn8YBR) {
            we.GWasM1elztuh("Use active SlotWriter to determine anchor location instead");
        }
        if (!lxVar.GWasM1elztuh()) {
            tq0.GWasM1elztuh("Anchor refers to a group that was removed");
        }
        return lxVar.GWasM1elztuh;
    }

    public final c31 OOA6hdeuvCS() {
        if (this.rQPn8YBR) {
            we.GWasM1elztuh("Cannot start a writer when another writer is pending");
        }
        if (this.mOu10nynGul > 0) {
            we.GWasM1elztuh("Cannot start a writer when a reader is pending");
        }
        this.rQPn8YBR = true;
        this.E7jCp8Ls++;
        return new c31(this);
    }

    public final y21 X1lG3V04pd() {
        if (this.rQPn8YBR) {
            o4.jivtDDk9H("Cannot read while a writer is pending");
            return null;
        }
        this.mOu10nynGul++;
        return new y21(this);
    }

    public final void Yi7zF1RB1() {
        this.uFEq9NpZ = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new az(this, 0, this.EljAMC1QTz);
    }
}
