package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g31 implements Iterator {
    public Iterator AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public int OOA6hdeuvCS = -1;
    public final /* synthetic */ e31 encWxUiV2;

    public g31(e31 e31Var) {
        this.encWxUiV2 = e31Var;
    }

    public final Iterator GWasM1elztuh() {
        if (this.AvO7iQsrTN == null) {
            this.AvO7iQsrTN = this.encWxUiV2.EljAMC1QTz.entrySet().iterator();
        }
        return this.AvO7iQsrTN;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.OOA6hdeuvCS + 1;
        e31 e31Var = this.encWxUiV2;
        return i < e31Var.OOA6hdeuvCS.size() || (!e31Var.EljAMC1QTz.isEmpty() && GWasM1elztuh().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.EljAMC1QTz = true;
        int i = this.OOA6hdeuvCS + 1;
        this.OOA6hdeuvCS = i;
        e31 e31Var = this.encWxUiV2;
        return i < e31Var.OOA6hdeuvCS.size() ? (Map.Entry) e31Var.OOA6hdeuvCS.get(this.OOA6hdeuvCS) : (Map.Entry) GWasM1elztuh().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.EljAMC1QTz) {
            o4.jivtDDk9H("remove() was called before next()");
            return;
        }
        this.EljAMC1QTz = false;
        int i = e31.JFJ3QoxA;
        e31 e31Var = this.encWxUiV2;
        e31Var.Yi7zF1RB1();
        if (this.OOA6hdeuvCS >= e31Var.OOA6hdeuvCS.size()) {
            GWasM1elztuh().remove();
            return;
        }
        int i2 = this.OOA6hdeuvCS;
        this.OOA6hdeuvCS = i2 - 1;
        e31Var.encWxUiV2(i2);
    }
}
