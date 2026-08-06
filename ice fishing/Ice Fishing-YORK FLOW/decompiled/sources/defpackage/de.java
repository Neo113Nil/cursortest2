package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class de implements java.text.CharacterIterator {
    public int QiMR8OkAhezm = 0;
    public final java.lang.CharSequence WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public de(java.lang.CharSequence charSequence, int i) {
        this.WDYagTQQm9ns = charSequence;
        this.oh71FJcDz6S2 = i;
    }

    @Override // java.text.CharacterIterator
    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.QiMR8OkAhezm;
        if (i == this.oh71FJcDz6S2) {
            return (char) 65535;
        }
        return this.WDYagTQQm9ns.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.QiMR8OkAhezm = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.oh71FJcDz6S2;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.QiMR8OkAhezm;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.oh71FJcDz6S2;
        if (i == 0) {
            this.QiMR8OkAhezm = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.QiMR8OkAhezm = i2;
        return this.WDYagTQQm9ns.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.QiMR8OkAhezm + 1;
        this.QiMR8OkAhezm = i;
        int i2 = this.oh71FJcDz6S2;
        if (i < i2) {
            return this.WDYagTQQm9ns.charAt(i);
        }
        this.QiMR8OkAhezm = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.QiMR8OkAhezm;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.QiMR8OkAhezm = i2;
        return this.WDYagTQQm9ns.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.oh71FJcDz6S2 || i < 0) {
            defpackage.h7.w7APNrr0aGRc("invalid position");
            return (char) 0;
        }
        this.QiMR8OkAhezm = i;
        return current();
    }
}
