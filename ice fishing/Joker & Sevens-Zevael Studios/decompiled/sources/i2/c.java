package i2;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f3115g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3116h;

    /* renamed from: i, reason: collision with root package name */
    public int f3117i = 0;

    public c(CharSequence charSequence, int i10) {
        this.f3115g = charSequence;
        this.f3116h = i10;
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
        int i10 = this.f3117i;
        if (i10 == this.f3116h) {
            return (char) 65535;
        }
        return this.f3115g.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f3117i = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f3116h;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f3117i;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f3116h;
        if (i10 == 0) {
            this.f3117i = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f3117i = i11;
        return this.f3115g.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f3117i + 1;
        this.f3117i = i10;
        int i11 = this.f3116h;
        if (i10 < i11) {
            return this.f3115g.charAt(i10);
        }
        this.f3117i = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f3117i;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f3117i = i11;
        return this.f3115g.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f3116h || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f3117i = i10;
        return current();
    }
}
