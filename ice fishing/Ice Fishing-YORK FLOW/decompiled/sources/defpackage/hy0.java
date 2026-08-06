package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hy0 extends defpackage.BXaznwstz2U0 {
    public final defpackage.by0 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ hy0(defpackage.by0 by0Var, int i) {
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = by0Var;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        int i = this.oh71FJcDz6S2;
        defpackage.by0 by0Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                by0Var.getClass();
                break;
            default:
                by0Var.getClass();
                break;
        }
        return by0Var.oh71FJcDz6S2;
    }

    @Override // defpackage.lr1, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.by0 by0Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object obj2 = by0Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && by0Var.containsKey(entry.getKey());
            default:
                return by0Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.oh71FJcDz6S2) {
            case 0:
                defpackage.vp1 vp1Var = this.QiMR8OkAhezm.WDYagTQQm9ns;
                defpackage.wp1[] wp1VarArr = new defpackage.wp1[8];
                for (int i = 0; i < 8; i++) {
                    wp1VarArr[i] = new defpackage.xp1(0);
                }
                return new defpackage.iy0(vp1Var, wp1VarArr);
            default:
                defpackage.vp1 vp1Var2 = this.QiMR8OkAhezm.WDYagTQQm9ns;
                defpackage.wp1[] wp1VarArr2 = new defpackage.wp1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    wp1VarArr2[i2] = new defpackage.xp1(1);
                }
                return new defpackage.iy0(vp1Var2, wp1VarArr2);
        }
    }
}
