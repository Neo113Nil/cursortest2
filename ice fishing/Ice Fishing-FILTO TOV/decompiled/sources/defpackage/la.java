package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class la implements CharacterIterator {
    public int AvO7iQsrTN = 0;
    public final int EljAMC1QTz;
    public final CharSequence OOA6hdeuvCS;

    public la(CharSequence charSequence, int i) {
        this.OOA6hdeuvCS = charSequence;
        this.EljAMC1QTz = i;
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
        int i = this.AvO7iQsrTN;
        if (i == this.EljAMC1QTz) {
            return (char) 65535;
        }
        return this.OOA6hdeuvCS.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.AvO7iQsrTN = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.EljAMC1QTz;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.AvO7iQsrTN;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.EljAMC1QTz;
        if (i == 0) {
            this.AvO7iQsrTN = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.AvO7iQsrTN = i2;
        return this.OOA6hdeuvCS.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.AvO7iQsrTN + 1;
        this.AvO7iQsrTN = i;
        int i2 = this.EljAMC1QTz;
        if (i < i2) {
            return this.OOA6hdeuvCS.charAt(i);
        }
        this.AvO7iQsrTN = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.AvO7iQsrTN;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.AvO7iQsrTN = i2;
        return this.OOA6hdeuvCS.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.EljAMC1QTz || i < 0) {
            o4.mE4lRynR("invalid position");
            return (char) 0;
        }
        this.AvO7iQsrTN = i;
        return current();
    }
}
