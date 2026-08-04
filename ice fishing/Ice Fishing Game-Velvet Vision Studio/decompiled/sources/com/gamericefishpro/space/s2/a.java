package com.gamericefishpro.space.s2;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements CharacterIterator {
    public final CharSequence d;
    public final int e;
    public int i = 0;

    public a(int i, CharSequence charSequence) {
        this.d = charSequence;
        this.e = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.i;
        if (i == this.e) {
            return (char) 65535;
        }
        return this.d.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.i = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.i;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.e;
        if (i == 0) {
            this.i = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.i = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.i + 1;
        this.i = i;
        int i2 = this.e;
        if (i < i2) {
            return this.d.charAt(i);
        }
        this.i = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.i;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.i = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.e || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.i = i;
        return current();
    }
}
