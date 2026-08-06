package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class na0 implements Iterator, q40 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public final String OOA6hdeuvCS;
    public int encWxUiV2;
    public int mOu10nynGul;

    public na0(String str) {
        this.OOA6hdeuvCS = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.EljAMC1QTz;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.mOu10nynGul < 0) {
            this.EljAMC1QTz = 2;
            return false;
        }
        String str = this.OOA6hdeuvCS;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.AvO7iQsrTN; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.EljAMC1QTz = 1;
                this.mOu10nynGul = i;
                this.encWxUiV2 = length;
                return true;
            }
        }
        i = -1;
        this.EljAMC1QTz = 1;
        this.mOu10nynGul = i;
        this.encWxUiV2 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        this.EljAMC1QTz = 0;
        int i = this.encWxUiV2;
        int i2 = this.AvO7iQsrTN;
        this.AvO7iQsrTN = this.mOu10nynGul + i;
        return this.OOA6hdeuvCS.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
