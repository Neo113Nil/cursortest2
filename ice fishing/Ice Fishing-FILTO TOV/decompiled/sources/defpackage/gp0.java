package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gp0 extends M3K9sHhK {
    public final bp0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ gp0(int i, bp0 bp0Var) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = bp0Var;
    }

    @Override // defpackage.M3K9sHhK
    public final int GWasM1elztuh() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz.mOu10nynGul;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                this.EljAMC1QTz.clear();
                break;
            default:
                this.EljAMC1QTz.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                bp0 bp0Var = this.EljAMC1QTz;
                Object obj2 = bp0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && bp0Var.containsKey(entry.getKey());
            default:
                return this.EljAMC1QTz.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return new hp0(this.EljAMC1QTz);
            default:
                ab1[] ab1VarArr = new ab1[8];
                for (int i = 0; i < 8; i++) {
                    ab1VarArr[i] = new bb1(1);
                }
                return new ip0(this.EljAMC1QTz, ab1VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.EljAMC1QTz.remove(entry.getKey(), entry.getValue());
            default:
                bp0 bp0Var = this.EljAMC1QTz;
                if (!bp0Var.containsKey(obj)) {
                    return false;
                }
                bp0Var.remove(obj);
                return true;
        }
    }
}
