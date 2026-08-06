package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bp0 extends AbstractMap implements Map, r40 {
    public Object AvO7iQsrTN;
    public za1 EljAMC1QTz;
    public cp0 JFJ3QoxA;
    public vt OOA6hdeuvCS = new vt(9);
    public int encWxUiV2;
    public int mOu10nynGul;

    public bp0(cp0 cp0Var) {
        this.EljAMC1QTz = cp0Var.OOA6hdeuvCS;
        this.mOu10nynGul = cp0Var.EljAMC1QTz;
        this.JFJ3QoxA = cp0Var;
    }

    public final cp0 GWasM1elztuh() {
        za1 za1Var = this.EljAMC1QTz;
        cp0 cp0Var = this.JFJ3QoxA;
        if (za1Var != cp0Var.OOA6hdeuvCS) {
            this.OOA6hdeuvCS = new vt(9);
            cp0Var = new cp0(this.EljAMC1QTz, this.mOu10nynGul);
        }
        this.JFJ3QoxA = cp0Var;
        return cp0Var;
    }

    public final void OOA6hdeuvCS(int i) {
        this.mOu10nynGul = i;
        this.encWxUiV2++;
    }

    public final Object X1lG3V04pd(Object obj) {
        return this.EljAMC1QTz.AvO7iQsrTN(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final boolean Yi7zF1RB1(Object obj) {
        return this.EljAMC1QTz.xqGvceK5x(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.EljAMC1QTz = za1.OOA6hdeuvCS;
        OOA6hdeuvCS(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ps0) {
            return Yi7zF1RB1((ps0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jd1) {
            return super.containsValue((jd1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new gp0(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ps0) {
            return (jd1) X1lG3V04pd((ps0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ps0) ? obj2 : (jd1) super.getOrDefault((ps0) obj, (jd1) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new gp0(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.AvO7iQsrTN = null;
        this.EljAMC1QTz = this.EljAMC1QTz.E7jCp8Ls(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.AvO7iQsrTN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [dp0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        cp0 cp0Var = null;
        cp0 cp0Var2 = map instanceof dp0 ? (dp0) map : null;
        if (cp0Var2 == null) {
            bp0 bp0Var = map instanceof bp0 ? (bp0) map : null;
            if (bp0Var != null) {
                cp0Var = bp0Var.GWasM1elztuh();
            }
        } else {
            cp0Var = cp0Var2;
        }
        if (cp0Var == null) {
            super.putAll(map);
            return;
        }
        dl dlVar = new dl();
        dlVar.GWasM1elztuh = 0;
        int i = this.mOu10nynGul;
        za1 za1Var = this.EljAMC1QTz;
        za1 za1Var2 = cp0Var.OOA6hdeuvCS;
        za1Var2.getClass();
        this.EljAMC1QTz = za1Var.XnEVoBF0td1l(za1Var2, 0, dlVar, this);
        int i2 = (cp0Var.EljAMC1QTz + i) - dlVar.GWasM1elztuh;
        if (i != i2) {
            OOA6hdeuvCS(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        za1 iwATDS1i01k = this.EljAMC1QTz.iwATDS1i01k(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (iwATDS1i01k == null) {
            iwATDS1i01k = za1.OOA6hdeuvCS;
        }
        this.EljAMC1QTz = iwATDS1i01k;
        return i != this.mOu10nynGul;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.mOu10nynGul;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new jp0(this);
    }

    public final Object xqGvceK5x(Object obj) {
        this.AvO7iQsrTN = null;
        za1 uFEq9NpZ = this.EljAMC1QTz.uFEq9NpZ(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (uFEq9NpZ == null) {
            uFEq9NpZ = za1.OOA6hdeuvCS;
        }
        this.EljAMC1QTz = uFEq9NpZ;
        return this.AvO7iQsrTN;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof ps0) {
            return (jd1) xqGvceK5x((ps0) obj);
        }
        return null;
    }
}
