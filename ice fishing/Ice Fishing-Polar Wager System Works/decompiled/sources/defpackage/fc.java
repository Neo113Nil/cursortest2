package defpackage;

/* loaded from: classes.dex */
public final class fc implements java.text.CharacterIterator {
    public int AARZUJiTa = 0;
    public final java.lang.CharSequence adDC3e2L;
    public final int xiZrDbcSW0;

    public fc(java.lang.CharSequence charSequence, int i) {
        this.adDC3e2L = charSequence;
        this.xiZrDbcSW0 = i;
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
        int i = this.AARZUJiTa;
        if (i == this.xiZrDbcSW0) {
            return (char) 65535;
        }
        return this.adDC3e2L.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.AARZUJiTa = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.xiZrDbcSW0;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.AARZUJiTa;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.xiZrDbcSW0;
        if (i == 0) {
            this.AARZUJiTa = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.AARZUJiTa = i2;
        return this.adDC3e2L.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.AARZUJiTa + 1;
        this.AARZUJiTa = i;
        int i2 = this.xiZrDbcSW0;
        if (i < i2) {
            return this.adDC3e2L.charAt(i);
        }
        this.AARZUJiTa = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.AARZUJiTa;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.AARZUJiTa = i2;
        return this.adDC3e2L.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.xiZrDbcSW0 || i < 0) {
            defpackage.db.fnWB2E7cs("invalid position");
            return (char) 0;
        }
        this.AARZUJiTa = i;
        return current();
    }
}
