package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w01 implements Iterator, vg, q40 {
    public vg AvO7iQsrTN;
    public Object EljAMC1QTz;
    public int OOA6hdeuvCS;

    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        o50.A1EKNP6CxJ(obj);
        this.OOA6hdeuvCS = 4;
    }

    public final RuntimeException GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.OOA6hdeuvCS);
    }

    @Override // defpackage.vg
    public final gh OOA6hdeuvCS() {
        return vp.OOA6hdeuvCS;
    }

    public final void Yi7zF1RB1(vg vgVar, Object obj) {
        this.EljAMC1QTz = obj;
        this.OOA6hdeuvCS = 3;
        this.AvO7iQsrTN = vgVar;
        vgVar.getClass();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.OOA6hdeuvCS;
            if (i != 0) {
                break;
            }
            this.OOA6hdeuvCS = 5;
            vg vgVar = this.AvO7iQsrTN;
            vgVar.getClass();
            this.AvO7iQsrTN = null;
            vgVar.AvO7iQsrTN(kc1.GWasM1elztuh);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw GWasM1elztuh();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OOA6hdeuvCS;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            o4.E7jCp8Ls();
            return null;
        }
        if (i == 2) {
            this.OOA6hdeuvCS = 1;
            throw null;
        }
        if (i != 3) {
            throw GWasM1elztuh();
        }
        this.OOA6hdeuvCS = 0;
        Object obj = this.EljAMC1QTz;
        this.EljAMC1QTz = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
