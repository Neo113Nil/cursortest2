package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ge1 implements defpackage.ij, java.lang.Iterable, defpackage.nb0 {
    public boolean Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public defpackage.gn0 T1fB7bDYiVJQ;
    public int e6mdH7fiFuta;
    public int fNwYGHIYeJcR;
    public java.util.HashMap gUjdnLbkVAaA;
    public int oh71FJcDz6S2;
    public int[] WDYagTQQm9ns = new int[0];
    public java.lang.Object[] QiMR8OkAhezm = new java.lang.Object[0];
    public final java.lang.Object GE9mJIPrb8gP = new java.lang.Object();
    public java.util.ArrayList h3m55N1URyyK = new java.util.ArrayList();

    public final defpackage.je1 JhCgjQRTAOCT() {
        if (this.Ns0WNyEWdPsk) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot start a writer when another writer is pending");
        }
        if (this.e6mdH7fiFuta > 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot start a writer when a reader is pending");
        }
        this.Ns0WNyEWdPsk = true;
        this.fNwYGHIYeJcR++;
        return new defpackage.je1(this);
    }

    public final boolean WDYagTQQm9ns(defpackage.y20 y20Var) {
        int WDYagTQQm9ns;
        return y20Var.ZpBGe2uQfcn8() && (WDYagTQQm9ns = defpackage.ie1.WDYagTQQm9ns(this.h3m55N1URyyK, y20Var.ZpBGe2uQfcn8, this.oh71FJcDz6S2)) >= 0 && defpackage.ma0.QiMR8OkAhezm(this.h3m55N1URyyK.get(WDYagTQQm9ns), y20Var);
    }

    public final int ZpBGe2uQfcn8(defpackage.y20 y20Var) {
        if (this.Ns0WNyEWdPsk) {
            defpackage.ej.ZpBGe2uQfcn8("Use active SlotWriter to determine anchor location instead");
        }
        if (!y20Var.ZpBGe2uQfcn8()) {
            defpackage.g11.ZpBGe2uQfcn8("Anchor refers to a group that was removed");
        }
        return y20Var.ZpBGe2uQfcn8;
    }

    public final defpackage.fe1 fWTAfUmVKrZq() {
        if (this.Ns0WNyEWdPsk) {
            defpackage.h7.P05cfTpS5W5L("Cannot read while a writer is pending");
            return null;
        }
        this.e6mdH7fiFuta++;
        return new defpackage.fe1(this);
    }

    public final void giKS3J6vZuNy() {
        this.gUjdnLbkVAaA = new java.util.HashMap();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.n40(this, 0, this.oh71FJcDz6S2);
    }

    public final defpackage.g30 oh71FJcDz6S2(int i) {
        int i2;
        java.util.ArrayList arrayList;
        int WDYagTQQm9ns;
        java.util.HashMap hashMap = this.gUjdnLbkVAaA;
        if (hashMap != null) {
            if (this.Ns0WNyEWdPsk) {
                defpackage.ej.ZpBGe2uQfcn8("use active SlotWriter to crate an anchor for location instead");
            }
            defpackage.y20 y20Var = (i < 0 || i >= (i2 = this.oh71FJcDz6S2) || (WDYagTQQm9ns = defpackage.ie1.WDYagTQQm9ns((arrayList = this.h3m55N1URyyK), i, i2)) < 0) ? null : (defpackage.y20) arrayList.get(WDYagTQQm9ns);
            if (y20Var != null) {
                return (defpackage.g30) hashMap.get(y20Var);
            }
        }
        return null;
    }
}
