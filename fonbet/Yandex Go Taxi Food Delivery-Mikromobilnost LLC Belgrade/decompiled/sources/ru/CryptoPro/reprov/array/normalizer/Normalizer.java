package ru.CryptoPro.reprov.array.normalizer;

/* loaded from: classes4.dex */
public class Normalizer implements Cloneable {
    private static final int COMPAT_BIT = 1;
    private static final int COMPOSE_BIT = 4;
    private static final boolean DEBUG = false;
    private static final int DECOMP_BIT = 2;
    public static final char DONE = 65535;
    static final char HANGUL_BASE = 44032;
    static final char HANGUL_LIMIT = 55204;
    public static final int IGNORE_HANGUL = 1;
    private static final char JAMO_LBASE = 4352;
    private static final int JAMO_LCOUNT = 19;
    private static final int JAMO_NCOUNT = 588;
    private static final char JAMO_TBASE = 4519;
    private static final int JAMO_TCOUNT = 28;
    private static final char JAMO_VBASE = 4449;
    private static final int JAMO_VCOUNT = 21;
    static final int STR_INDEX_SHIFT = 2;
    static final int STR_LENGTH_MASK = 3;
    public static final Mode DECOMP = new Mode(2);
    public static final Mode DECOMP_COMPAT = new Mode(3);

    public class Mode {
        final int mode;

        public Mode(int i) {
            this.mode = i;
        }

        public boolean compat() {
            return (this.mode & 1) != 0;
        }

        public boolean decomp() {
            return (this.mode & 2) != 0;
        }
    }

    public static String decompose(String str, boolean z, int i, boolean z2) {
        int i2;
        int i3;
        StringBuffer stringBuffer;
        char charAt;
        int i4;
        boolean z3 = (i & 1) == 0;
        int i5 = z ? 0 : 11177;
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = null;
        if (z2) {
            stringBuffer = new StringBuffer();
            i2 = 0;
            i3 = -1;
        } else {
            i2 = 0;
            i3 = -1;
            stringBuffer = null;
        }
        while (true) {
            if (i2 >= str.length() && i3 < 0) {
                fixCanonical(stringBuffer2);
                return stringBuffer2.toString();
            }
            if (i3 >= 0) {
                i4 = i3 + 1;
                charAt = stringBuffer3.charAt(i3);
                if (i4 == stringBuffer3.length()) {
                    i4 = -1;
                }
            } else {
                int i6 = i3;
                charAt = str.charAt(i2);
                i2++;
                i4 = i6;
            }
            char elementAt = DecompData.offsets.elementAt(charAt);
            int i7 = elementAt & 32767;
            if (i7 > i5) {
                if ((elementAt & 32768) != 0) {
                    if (stringBuffer3 == null) {
                        stringBuffer3 = new StringBuffer();
                    } else {
                        stringBuffer3.setLength(0);
                    }
                    doAppend(DecompData.contents, i7, stringBuffer3);
                    i3 = 0;
                } else if (z2) {
                    stringBuffer.setLength(0);
                    doAppend(DecompData.contents, i7, stringBuffer);
                    if (stringBuffer.length() > 1 || charAt == 894 || charAt == 8175) {
                        for (int i8 = 0; i8 < stringBuffer.length(); i8++) {
                            char charAt2 = stringBuffer.charAt(i8);
                            if ((charAt2 < '\t' || charAt2 > '\r') && ((charAt2 < ' ' || charAt2 > '/') && ((charAt2 < ':' || charAt2 > '@') && ((charAt2 < '[' || charAt2 > '`') && (charAt2 < '{' || charAt2 > '~'))))) {
                                stringBuffer2.append(charAt2);
                            } else {
                                stringBuffer2.append('\'');
                                stringBuffer2.append(charAt2);
                                stringBuffer2.append('\'');
                            }
                        }
                    } else {
                        stringBuffer2.append(stringBuffer);
                    }
                } else {
                    doAppend(DecompData.contents, i7, stringBuffer2);
                }
            } else if (charAt < 44032 || charAt >= 55204 || !z3) {
                stringBuffer2.append(charAt);
            } else {
                hangulToJamo(charAt, stringBuffer2, i5);
            }
            i3 = i4;
        }
    }

    public static int doAppend(String str, int i, StringBuffer stringBuffer) {
        int i2 = i >>> 2;
        int i3 = i & 3;
        if (i3 != 0) {
            int i4 = 0;
            while (i4 < i3) {
                stringBuffer.append(str.charAt(i2));
                i4++;
                i2++;
            }
            return i3;
        }
        while (true) {
            int i5 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == 0) {
                return i3;
            }
            stringBuffer.append(charAt);
            i3++;
            i2 = i5;
        }
    }

    private static void fixCanonical(StringBuffer stringBuffer) {
        if (stringBuffer.length() == 0) {
            return;
        }
        int length = stringBuffer.length();
        int i = getClass(stringBuffer.charAt(length - 1));
        int i2 = length - 2;
        while (i2 >= 0) {
            int i3 = getClass(stringBuffer.charAt(i2));
            if (i3 <= i || i == 0) {
                i = i3;
            } else {
                char charAt = stringBuffer.charAt(i2);
                int i4 = i2 + 1;
                stringBuffer.setCharAt(i2, stringBuffer.charAt(i4));
                stringBuffer.setCharAt(i4, charAt);
                if (i2 < stringBuffer.length() - 2) {
                    i2 += 2;
                }
                i = getClass(stringBuffer.charAt(i2));
            }
            i2--;
        }
    }

    public static final int getClass(char c) {
        byte elementAt = DecompData.canonClass.elementAt(c);
        return elementAt >= 0 ? elementAt : elementAt + 256;
    }

    public static int hangulToJamo(char c, StringBuffer stringBuffer, int i) {
        char c2 = (char) (c - HANGUL_BASE);
        char c3 = (char) ((c2 / 588) + 4352);
        char c4 = (char) (((c2 % 588) / 28) + 4449);
        char c5 = (char) ((c2 % 28) + 4519);
        int jamoAppend = jamoAppend(c4, i, stringBuffer) + jamoAppend(c3, i, stringBuffer);
        return c5 != 4519 ? jamoAppend(c5, i, stringBuffer) + jamoAppend : jamoAppend;
    }

    public static final int jamoAppend(char c, int i, StringBuffer stringBuffer) {
        char elementAt = DecompData.offsets.elementAt(c);
        if (elementAt > i) {
            return doAppend(DecompData.contents, elementAt, stringBuffer);
        }
        stringBuffer.append(c);
        return 1;
    }

    public static String normalize(String str, Mode mode, int i, boolean z) {
        return mode.decomp() ? decompose(str, mode.compat(), i, z) : str;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public static String normalize(String str, Mode mode, int i) {
        return normalize(str, mode, i, false);
    }
}
