package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vr implements Iterator, q40 {
    public final Iterator EljAMC1QTz;
    public Object encWxUiV2;
    public final /* synthetic */ v01 mOu10nynGul;
    public final /* synthetic */ int OOA6hdeuvCS = 0;
    public int AvO7iQsrTN = -1;

    public vr(cl clVar) {
        this.mOu10nynGul = clVar;
        this.EljAMC1QTz = new ia1((r71) clVar.Yi7zF1RB1);
    }

    public void GWasM1elztuh() {
        Object next;
        cl clVar = (cl) this.mOu10nynGul;
        do {
            Iterator it = this.EljAMC1QTz;
            if (!it.hasNext()) {
                this.AvO7iQsrTN = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((dx0) clVar.X1lG3V04pd).mOu10nynGul(next)).booleanValue());
        this.encWxUiV2 = next;
        this.AvO7iQsrTN = 1;
    }

    public void Yi7zF1RB1() {
        Iterator it = this.EljAMC1QTz;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((r71) this.mOu10nynGul).X1lG3V04pd.mOu10nynGul(next)).booleanValue()) {
                this.AvO7iQsrTN = 1;
                this.encWxUiV2 = next;
                return;
            }
        }
        this.AvO7iQsrTN = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.AvO7iQsrTN == -1) {
                    GWasM1elztuh();
                }
                if (this.AvO7iQsrTN == 1) {
                }
                break;
            default:
                if (this.AvO7iQsrTN == -1) {
                    Yi7zF1RB1();
                }
                if (this.AvO7iQsrTN == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.AvO7iQsrTN == -1) {
                    GWasM1elztuh();
                }
                if (this.AvO7iQsrTN == 0) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    Object obj = this.encWxUiV2;
                    this.encWxUiV2 = null;
                    this.AvO7iQsrTN = -1;
                    break;
                }
            default:
                if (this.AvO7iQsrTN == -1) {
                    Yi7zF1RB1();
                }
                if (this.AvO7iQsrTN == 0) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    Object obj2 = this.encWxUiV2;
                    this.encWxUiV2 = null;
                    this.AvO7iQsrTN = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vr(r71 r71Var) {
        this.mOu10nynGul = r71Var;
        this.EljAMC1QTz = r71Var.Yi7zF1RB1.iterator();
    }
}
