package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class jivtDDk9H implements Iterator, q40 {
    public final Object AvO7iQsrTN;
    public int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ jivtDDk9H(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.AvO7iQsrTN = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                if (this.EljAMC1QTz < ((lv06NcmrQ) obj).GWasM1elztuh()) {
                    break;
                }
                break;
            case 1:
                if (this.EljAMC1QTz < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.EljAMC1QTz < ((y41) obj).OOA6hdeuvCS()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    o4.E7jCp8Ls();
                    return null;
                }
                int i2 = this.EljAMC1QTz;
                this.EljAMC1QTz = i2 + 1;
                return ((lv06NcmrQ) obj).get(i2);
            case 1:
                try {
                    int i3 = this.EljAMC1QTz;
                    this.EljAMC1QTz = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.EljAMC1QTz--;
                    o4.AvO7iQsrTN(e.getMessage());
                    return null;
                }
            default:
                int i4 = this.EljAMC1QTz;
                this.EljAMC1QTz = i4 + 1;
                return ((y41) obj).EljAMC1QTz(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
