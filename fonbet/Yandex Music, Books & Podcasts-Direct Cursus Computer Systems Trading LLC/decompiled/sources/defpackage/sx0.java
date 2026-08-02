package defpackage;

import kotlin.text.c;

/* loaded from: classes5.dex */
public final class sx0 implements CharSequence {
    public final char[] a;
    public int b;

    public sx0(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return c.l(this.a, i, Math.min(i2, this.b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        return c.l(this.a, 0, Math.min(i, i));
    }
}
