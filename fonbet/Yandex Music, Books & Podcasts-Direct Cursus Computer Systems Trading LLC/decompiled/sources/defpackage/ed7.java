package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public abstract class ed7 implements qve, cve {
    public final DateTimeFieldType a;
    public final int b;
    public final boolean c;

    public ed7(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
        this.a = dateTimeFieldType;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r10 <= '9') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(pd7 pd7Var, CharSequence charSequence, int i) {
        int i2;
        int i3;
        char charAt;
        int min = Math.min(this.b, charSequence.length() - i);
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i4 < min) {
            int i5 = i + i4;
            char charAt2 = charSequence.charAt(i5);
            if (i4 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.c)) {
                break;
            }
            boolean z3 = charAt2 == '-';
            boolean z4 = charAt2 == '+';
            int i6 = i4 + 1;
            if (i6 >= min || (charAt = charSequence.charAt(i5 + 1)) < '0' || charAt > '9') {
                boolean z5 = z3;
                z2 = z4;
                z = z5;
                break;
            }
            min = Math.min(min + 1, charSequence.length() - i);
            boolean z6 = z3;
            z2 = z4;
            z = z6;
            i4 = i6;
        }
        if (i4 == 0) {
            return ~i;
        }
        if (i4 < 9) {
            int i7 = (z || z2) ? i + 1 : i;
            int i8 = i7 + 1;
            try {
                int charAt3 = charSequence.charAt(i7) - '0';
                i2 = i + i4;
                while (i8 < i2) {
                    int i9 = (charAt3 << 3) + (charAt3 << 1);
                    int i10 = i8 + 1;
                    int charAt4 = (charSequence.charAt(i8) + i9) - 48;
                    i8 = i10;
                    charAt3 = charAt4;
                }
                i3 = z ? -charAt3 : charAt3;
            } catch (StringIndexOutOfBoundsException unused) {
                return ~i;
            }
        } else if (z2) {
            i2 = i + i4;
            i3 = Integer.parseInt(charSequence.subSequence(i + 1, i2).toString());
        } else {
            int i11 = i + i4;
            i3 = Integer.parseInt(charSequence.subSequence(i, i11).toString());
            i2 = i11;
        }
        nd7 c = pd7Var.c();
        c.a = this.a.b(pd7Var.a);
        c.b = i3;
        c.c = null;
        c.d = null;
        return i2;
    }
}
