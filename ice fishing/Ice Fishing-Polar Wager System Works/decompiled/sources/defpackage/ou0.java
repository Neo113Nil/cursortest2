package defpackage;

/* loaded from: classes.dex */
public final class ou0 extends defpackage.Uv8CGu3G {
    public final /* synthetic */ int adDC3e2L;
    public final defpackage.hu0 xiZrDbcSW0;

    public /* synthetic */ ou0(defpackage.hu0 hu0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = hu0Var;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        defpackage.hu0 hu0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                hu0Var.getClass();
                break;
            default:
                hu0Var.getClass();
                break;
        }
        return hu0Var.xiZrDbcSW0;
    }

    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.hu0 hu0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object obj2 = hu0Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && hu0Var.containsKey(entry.getKey());
            default:
                return hu0Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.adDC3e2L) {
            case 0:
                defpackage.yi1 yi1Var = this.xiZrDbcSW0.adDC3e2L;
                defpackage.zi1[] zi1VarArr = new defpackage.zi1[8];
                for (int i = 0; i < 8; i++) {
                    zi1VarArr[i] = new defpackage.aj1(0);
                }
                return new defpackage.pu0(yi1Var, zi1VarArr);
            default:
                defpackage.yi1 yi1Var2 = this.xiZrDbcSW0.adDC3e2L;
                defpackage.zi1[] zi1VarArr2 = new defpackage.zi1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zi1VarArr2[i2] = new defpackage.aj1(1);
                }
                return new defpackage.pu0(yi1Var2, zi1VarArr2);
        }
    }
}
