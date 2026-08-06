package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cy implements Iterator, q40 {
    public Object AvO7iQsrTN;
    public int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final Object encWxUiV2;

    public cy(kg0 kg0Var) {
        this.OOA6hdeuvCS = 2;
        this.encWxUiV2 = kg0Var;
        this.EljAMC1QTz = -1;
        this.AvO7iQsrTN = q70.Y6hRI1cF8(new jg0(kg0Var, this, null));
    }

    public void GWasM1elztuh() {
        Object mOu10nynGul;
        int i = this.EljAMC1QTz;
        cl clVar = (cl) this.encWxUiV2;
        if (i == -2) {
            mOu10nynGul = ((o1) clVar.Yi7zF1RB1).EljAMC1QTz;
        } else {
            hv hvVar = (hv) clVar.X1lG3V04pd;
            Object obj = this.AvO7iQsrTN;
            obj.getClass();
            mOu10nynGul = hvVar.mOu10nynGul(obj);
        }
        this.AvO7iQsrTN = mOu10nynGul;
        this.EljAMC1QTz = mOu10nynGul == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.EljAMC1QTz < 0) {
                    GWasM1elztuh();
                }
                return this.EljAMC1QTz == 1;
            case 1:
                return ((w01) this.AvO7iQsrTN).hasNext();
            case 2:
                return ((w01) this.AvO7iQsrTN).hasNext();
            default:
                return this.EljAMC1QTz < ((Map) this.encWxUiV2).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.EljAMC1QTz < 0) {
                    GWasM1elztuh();
                }
                if (this.EljAMC1QTz == 0) {
                    o4.E7jCp8Ls();
                    return null;
                }
                Object obj2 = this.AvO7iQsrTN;
                obj2.getClass();
                this.EljAMC1QTz = -1;
                return obj2;
            case 1:
                return ((w01) this.AvO7iQsrTN).next();
            case 2:
                return ((w01) this.AvO7iQsrTN).next();
            default:
                if (hasNext()) {
                    obj = this.AvO7iQsrTN;
                    this.EljAMC1QTz++;
                    Object obj3 = ((Map) this.encWxUiV2).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.AvO7iQsrTN = ((ra0) obj3).Yi7zF1RB1;
                } else {
                    o4.E7jCp8Ls();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.encWxUiV2;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.EljAMC1QTz;
                if (i2 != -1) {
                    ((dg0) obj).EljAMC1QTz.encWxUiV2(i2);
                    this.EljAMC1QTz = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.EljAMC1QTz;
                if (i3 != -1) {
                    ((kg0) obj).EljAMC1QTz.XnEVoBF0td1l(i3);
                    this.EljAMC1QTz = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cy(cl clVar) {
        this.OOA6hdeuvCS = 0;
        this.encWxUiV2 = clVar;
        this.EljAMC1QTz = -2;
    }

    public cy(Object obj, Map map) {
        this.OOA6hdeuvCS = 3;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = map;
    }

    public cy(dg0 dg0Var) {
        this.OOA6hdeuvCS = 1;
        this.encWxUiV2 = dg0Var;
        this.EljAMC1QTz = -1;
        this.AvO7iQsrTN = q70.Y6hRI1cF8(new cg0(dg0Var, this, null));
    }
}
