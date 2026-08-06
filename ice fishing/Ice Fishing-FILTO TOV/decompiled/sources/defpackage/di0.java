package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class di0 implements Iterator, q40 {
    public final /* synthetic */ ei0 AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public int OOA6hdeuvCS = -1;

    public di0(ei0 ei0Var) {
        this.AvO7iQsrTN = ei0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OOA6hdeuvCS + 1 < this.AvO7iQsrTN.Yi7zF1RB1.OOA6hdeuvCS();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        this.EljAMC1QTz = true;
        y41 y41Var = this.AvO7iQsrTN.Yi7zF1RB1;
        int i = this.OOA6hdeuvCS + 1;
        this.OOA6hdeuvCS = i;
        return (xh0) y41Var.EljAMC1QTz(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.EljAMC1QTz) {
            o4.jivtDDk9H("You must call next() before you can remove an element");
            return;
        }
        y41 y41Var = this.AvO7iQsrTN.Yi7zF1RB1;
        ((xh0) y41Var.EljAMC1QTz(this.OOA6hdeuvCS)).AvO7iQsrTN = null;
        int i = this.OOA6hdeuvCS;
        Object[] objArr = y41Var.AvO7iQsrTN;
        Object obj = objArr[i];
        Object obj2 = o30.Mjvvu5DE;
        if (obj != obj2) {
            objArr[i] = obj2;
            y41Var.OOA6hdeuvCS = true;
        }
        this.OOA6hdeuvCS = i - 1;
        this.EljAMC1QTz = false;
    }
}
