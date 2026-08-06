package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jc0 extends M3K9sHhK {
    public final ic0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ jc0(ic0 ic0Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = ic0Var;
    }

    @Override // defpackage.M3K9sHhK
    public final int GWasM1elztuh() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz.XnEVoBF0td1l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.OOA6hdeuvCS;
        collection.getClass();
        switch (i) {
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
        int i = this.OOA6hdeuvCS;
        ic0 ic0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ic0Var.getClass();
                int EljAMC1QTz = ic0Var.EljAMC1QTz(entry.getKey());
                if (EljAMC1QTz < 0) {
                    return false;
                }
                Object[] objArr = ic0Var.EljAMC1QTz;
                objArr.getClass();
                return o30.rQPn8YBR(objArr[EljAMC1QTz], entry.getValue());
            default:
                return ic0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                collection.getClass();
                return this.EljAMC1QTz.xqGvceK5x(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.OOA6hdeuvCS;
        ic0 ic0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                ic0Var.getClass();
                return new fc0(ic0Var, 0);
            default:
                ic0Var.getClass();
                return new fc0(ic0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.OOA6hdeuvCS;
        ic0 ic0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ic0Var.getClass();
                    ic0Var.Yi7zF1RB1();
                    int EljAMC1QTz = ic0Var.EljAMC1QTz(entry.getKey());
                    if (EljAMC1QTz >= 0) {
                        Object[] objArr = ic0Var.EljAMC1QTz;
                        objArr.getClass();
                        if (o30.rQPn8YBR(objArr[EljAMC1QTz], entry.getValue())) {
                            ic0Var.JFJ3QoxA(EljAMC1QTz);
                            break;
                        }
                    }
                }
                break;
            default:
                ic0Var.Yi7zF1RB1();
                int EljAMC1QTz2 = ic0Var.EljAMC1QTz(obj);
                if (EljAMC1QTz2 >= 0) {
                    ic0Var.JFJ3QoxA(EljAMC1QTz2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.OOA6hdeuvCS;
        ic0 ic0Var = this.EljAMC1QTz;
        collection.getClass();
        switch (i) {
            case 0:
                ic0Var.Yi7zF1RB1();
                break;
            default:
                ic0Var.Yi7zF1RB1();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.OOA6hdeuvCS;
        ic0 ic0Var = this.EljAMC1QTz;
        collection.getClass();
        switch (i) {
            case 0:
                ic0Var.Yi7zF1RB1();
                break;
            default:
                ic0Var.Yi7zF1RB1();
                break;
        }
        return super.retainAll(collection);
    }
}
