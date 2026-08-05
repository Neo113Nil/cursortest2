package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h2 {
    public static final byte[] VgvYg0wo = new byte[1792];
    public int MdtA4re8;
    public final int NCTxEWno;
    public final CharSequence qoPGr6Ce;
    public char wxUZMvaN;

    static {
        for (int i = 0; i < 1792; i++) {
            VgvYg0wo[i] = Character.getDirectionality(i);
        }
    }

    public h2(CharSequence charSequence) {
        this.qoPGr6Ce = charSequence;
        this.NCTxEWno = charSequence.length();
    }

    public final byte qoPGr6Ce() {
        int i = this.MdtA4re8 - 1;
        CharSequence charSequence = this.qoPGr6Ce;
        char charAt = charSequence.charAt(i);
        this.wxUZMvaN = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i2 = this.MdtA4re8;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            this.MdtA4re8 -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.MdtA4re8 = i2 - 1;
        char c = this.wxUZMvaN;
        return c < 1792 ? VgvYg0wo[c] : Character.getDirectionality(c);
    }
}
