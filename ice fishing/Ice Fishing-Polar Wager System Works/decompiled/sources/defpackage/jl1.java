package defpackage;

/* loaded from: classes.dex */
public abstract class jl1 {
    public static final defpackage.s70 IHQe1A4L2xu;

    static {
        IHQe1A4L2xu = (defpackage.al1.adDC3e2L && defpackage.al1.F7NU4MC0GW && !defpackage.v.IHQe1A4L2xu()) ? new defpackage.hl1(1) : new defpackage.hl1(0);
    }

    public static int IHQe1A4L2xu(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                throw new defpackage.il1(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }
}
