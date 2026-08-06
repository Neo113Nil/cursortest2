package defpackage;

/* loaded from: classes.dex */
public final class ku0 extends defpackage.nBH8hAHy {
    public final /* synthetic */ int adDC3e2L;
    public final defpackage.fu0 xiZrDbcSW0;

    public /* synthetic */ ku0(int i, defpackage.fu0 fu0Var) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = fu0Var;
    }

    @Override // defpackage.nBH8hAHy
    public final int IHQe1A4L2xu() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0.riuEU0zW4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.adDC3e2L) {
            case 0:
                this.xiZrDbcSW0.clear();
                break;
            default:
                this.xiZrDbcSW0.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                defpackage.fu0 fu0Var = this.xiZrDbcSW0;
                java.lang.Object obj2 = fu0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && fu0Var.containsKey(entry.getKey());
            default:
                return this.xiZrDbcSW0.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.adDC3e2L) {
            case 0:
                return new defpackage.lu0(this.xiZrDbcSW0);
            default:
                defpackage.zi1[] zi1VarArr = new defpackage.zi1[8];
                for (int i = 0; i < 8; i++) {
                    zi1VarArr[i] = new defpackage.aj1(1);
                }
                return new defpackage.mu0(this.xiZrDbcSW0, zi1VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return this.xiZrDbcSW0.remove(entry.getKey(), entry.getValue());
            default:
                defpackage.fu0 fu0Var = this.xiZrDbcSW0;
                if (!fu0Var.containsKey(obj)) {
                    return false;
                }
                fu0Var.remove(obj);
                return true;
        }
    }
}
