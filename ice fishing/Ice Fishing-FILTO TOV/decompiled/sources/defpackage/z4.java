package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z4 implements Iterator, Map.Entry {
    public boolean AvO7iQsrTN;
    public int EljAMC1QTz = -1;
    public int OOA6hdeuvCS;
    public final /* synthetic */ b5 encWxUiV2;

    public z4(b5 b5Var) {
        this.encWxUiV2 = b5Var;
        this.OOA6hdeuvCS = b5Var.AvO7iQsrTN - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.AvO7iQsrTN) {
            o4.jivtDDk9H("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.EljAMC1QTz;
            b5 b5Var = this.encWxUiV2;
            if (o30.rQPn8YBR(key, b5Var.OOA6hdeuvCS(i)) && o30.rQPn8YBR(entry.getValue(), b5Var.encWxUiV2(this.EljAMC1QTz))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.AvO7iQsrTN) {
            return this.encWxUiV2.OOA6hdeuvCS(this.EljAMC1QTz);
        }
        o4.jivtDDk9H("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.AvO7iQsrTN) {
            return this.encWxUiV2.encWxUiV2(this.EljAMC1QTz);
        }
        o4.jivtDDk9H("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.EljAMC1QTz < this.OOA6hdeuvCS;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.AvO7iQsrTN) {
            o4.jivtDDk9H("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.EljAMC1QTz;
        b5 b5Var = this.encWxUiV2;
        Object OOA6hdeuvCS = b5Var.OOA6hdeuvCS(i);
        Object encWxUiV2 = b5Var.encWxUiV2(this.EljAMC1QTz);
        return (OOA6hdeuvCS == null ? 0 : OOA6hdeuvCS.hashCode()) ^ (encWxUiV2 != null ? encWxUiV2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        this.EljAMC1QTz++;
        this.AvO7iQsrTN = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.AvO7iQsrTN) {
            throw new IllegalStateException();
        }
        this.encWxUiV2.EljAMC1QTz(this.EljAMC1QTz);
        this.EljAMC1QTz--;
        this.OOA6hdeuvCS--;
        this.AvO7iQsrTN = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.AvO7iQsrTN) {
            return this.encWxUiV2.AvO7iQsrTN(this.EljAMC1QTz, obj);
        }
        o4.jivtDDk9H("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
