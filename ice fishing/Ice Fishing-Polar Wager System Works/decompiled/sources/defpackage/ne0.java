package defpackage;

/* loaded from: classes.dex */
public final class ne0 implements java.util.Iterator, defpackage.g90 {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public final java.lang.String adDC3e2L;
    public int riuEU0zW4;
    public int xiZrDbcSW0;

    public ne0(java.lang.String str) {
        this.adDC3e2L = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.xiZrDbcSW0;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.riuEU0zW4 < 0) {
            this.xiZrDbcSW0 = 2;
            return false;
        }
        java.lang.String str = this.adDC3e2L;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.AARZUJiTa; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.xiZrDbcSW0 = 1;
                this.riuEU0zW4 = i;
                this.EXtogiMhuM = length;
                return true;
            }
        }
        i = -1;
        this.xiZrDbcSW0 = 1;
        this.riuEU0zW4 = i;
        this.EXtogiMhuM = length;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        this.xiZrDbcSW0 = 0;
        int i = this.EXtogiMhuM;
        int i2 = this.AARZUJiTa;
        this.AARZUJiTa = this.riuEU0zW4 + i;
        return this.adDC3e2L.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
