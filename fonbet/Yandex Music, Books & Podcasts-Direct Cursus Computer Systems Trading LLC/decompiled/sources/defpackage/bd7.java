package defpackage;

/* loaded from: classes5.dex */
public final class bd7 extends fd7 {
    @Override // defpackage.ed7, defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        int i2;
        char charAt;
        int b = super.b(pd7Var, charSequence, i);
        if (b < 0 || b == (i2 = this.b + i)) {
            return b;
        }
        if (this.c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
            i2++;
        }
        return b > i2 ? ~(i2 + 1) : b < i2 ? ~b : b;
    }
}
