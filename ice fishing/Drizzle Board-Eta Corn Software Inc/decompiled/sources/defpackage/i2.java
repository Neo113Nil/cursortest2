package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i2 {
    public static final String MdtA4re8;
    public static final String NCTxEWno;
    public static final i2 VgvYg0wo;
    public static final i2 wxUZMvaN;
    public final boolean qoPGr6Ce;

    static {
        y30 y30Var = cc0.MdtA4re8;
        NCTxEWno = Character.toString((char) 8206);
        MdtA4re8 = Character.toString((char) 8207);
        wxUZMvaN = new i2(false);
        VgvYg0wo = new i2(true);
    }

    public i2(boolean z) {
        y30 y30Var = cc0.qoPGr6Ce;
        this.qoPGr6Ce = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int NCTxEWno(CharSequence charSequence) {
        h2 h2Var = new h2(charSequence);
        h2Var.MdtA4re8 = h2Var.NCTxEWno;
        int i = 0;
        while (true) {
            int i2 = i;
            while (h2Var.MdtA4re8 > 0) {
                byte qoPGr6Ce = h2Var.qoPGr6Ce();
                if (qoPGr6Ce != 0) {
                    if (qoPGr6Ce == 1 || qoPGr6Ce == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (qoPGr6Ce != 9) {
                        switch (qoPGr6Ce) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r0.MdtA4re8 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        switch(r0.qoPGr6Ce()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008b, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int qoPGr6Ce(CharSequence charSequence) {
        byte directionality;
        h2 h2Var = new h2(charSequence);
        h2Var.MdtA4re8 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = h2Var.MdtA4re8;
            if (i4 < h2Var.NCTxEWno && i == 0) {
                CharSequence charSequence2 = h2Var.qoPGr6Ce;
                char charAt = charSequence2.charAt(i4);
                h2Var.wxUZMvaN = charAt;
                boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                int i5 = h2Var.MdtA4re8;
                if (isHighSurrogate) {
                    int codePointAt = Character.codePointAt(charSequence2, i5);
                    h2Var.MdtA4re8 = Character.charCount(codePointAt) + h2Var.MdtA4re8;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    h2Var.MdtA4re8 = i5 + 1;
                    char c = h2Var.wxUZMvaN;
                    directionality = c < 1792 ? h2.VgvYg0wo[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }
}
