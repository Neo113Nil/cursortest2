package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x4 implements Iterator, q40 {
    public boolean AvO7iQsrTN;
    public int EljAMC1QTz;
    public int OOA6hdeuvCS;
    public final /* synthetic */ int encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x4(b5 b5Var, int i) {
        this(b5Var.AvO7iQsrTN);
        this.encWxUiV2 = i;
        switch (i) {
            case 1:
                this.mOu10nynGul = b5Var;
                this(b5Var.AvO7iQsrTN);
                break;
            default:
                this.mOu10nynGul = b5Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.EljAMC1QTz < this.OOA6hdeuvCS;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object OOA6hdeuvCS;
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        int i = this.EljAMC1QTz;
        int i2 = this.encWxUiV2;
        Object obj = this.mOu10nynGul;
        switch (i2) {
            case 0:
                OOA6hdeuvCS = ((b5) obj).OOA6hdeuvCS(i);
                break;
            case 1:
                OOA6hdeuvCS = ((b5) obj).encWxUiV2(i);
                break;
            default:
                OOA6hdeuvCS = ((c5) obj).EljAMC1QTz[i];
                break;
        }
        this.EljAMC1QTz++;
        this.AvO7iQsrTN = true;
        return OOA6hdeuvCS;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.AvO7iQsrTN) {
            o4.jivtDDk9H("Call next() before removing an element.");
            return;
        }
        int i = this.EljAMC1QTz - 1;
        this.EljAMC1QTz = i;
        int i2 = this.encWxUiV2;
        Object obj = this.mOu10nynGul;
        switch (i2) {
            case 0:
                ((b5) obj).EljAMC1QTz(i);
                break;
            case 1:
                ((b5) obj).EljAMC1QTz(i);
                break;
            default:
                ((c5) obj).GWasM1elztuh(i);
                break;
        }
        this.OOA6hdeuvCS--;
        this.AvO7iQsrTN = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x4(c5 c5Var) {
        this(c5Var.AvO7iQsrTN);
        this.encWxUiV2 = 2;
        this.mOu10nynGul = c5Var;
    }

    public x4(int i) {
        this.OOA6hdeuvCS = i;
    }
}
