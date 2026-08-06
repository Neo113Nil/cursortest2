package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ey0 extends defpackage.dG7RjM6DqYVL {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final defpackage.zx0 oh71FJcDz6S2;

    public /* synthetic */ ey0(int i, defpackage.zx0 zx0Var) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = zx0Var;
    }

    @Override // defpackage.dG7RjM6DqYVL
    public final int ZpBGe2uQfcn8() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2.e6mdH7fiFuta;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                this.oh71FJcDz6S2.clear();
                break;
            default:
                this.oh71FJcDz6S2.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                defpackage.zx0 zx0Var = this.oh71FJcDz6S2;
                java.lang.Object obj2 = zx0Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && zx0Var.containsKey(entry.getKey());
            default:
                return this.oh71FJcDz6S2.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                return new defpackage.fy0(this.oh71FJcDz6S2);
            default:
                defpackage.wp1[] wp1VarArr = new defpackage.wp1[8];
                for (int i = 0; i < 8; i++) {
                    wp1VarArr[i] = new defpackage.xp1(1);
                }
                return new defpackage.gy0(this.oh71FJcDz6S2, wp1VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return this.oh71FJcDz6S2.remove(entry.getKey(), entry.getValue());
            default:
                defpackage.zx0 zx0Var = this.oh71FJcDz6S2;
                if (!zx0Var.containsKey(obj)) {
                    return false;
                }
                zx0Var.remove(obj);
                return true;
        }
    }
}
