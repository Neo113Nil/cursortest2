package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ph0 implements java.util.Iterator, defpackage.nb0 {
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public int e6mdH7fiFuta;
    public int oh71FJcDz6S2;

    public ph0(java.lang.String str) {
        this.WDYagTQQm9ns = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.oh71FJcDz6S2;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.e6mdH7fiFuta < 0) {
            this.oh71FJcDz6S2 = 2;
            return false;
        }
        java.lang.String str = this.WDYagTQQm9ns;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.QiMR8OkAhezm; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.oh71FJcDz6S2 = 1;
                this.e6mdH7fiFuta = i;
                this.P05cfTpS5W5L = length;
                return true;
            }
        }
        i = -1;
        this.oh71FJcDz6S2 = 1;
        this.e6mdH7fiFuta = i;
        this.P05cfTpS5W5L = length;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        this.oh71FJcDz6S2 = 0;
        int i = this.P05cfTpS5W5L;
        int i2 = this.QiMR8OkAhezm;
        this.QiMR8OkAhezm = this.e6mdH7fiFuta + i;
        return this.WDYagTQQm9ns.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
