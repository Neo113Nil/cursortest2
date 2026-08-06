package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xh1 implements defpackage.y61 {
    public final defpackage.e10 WDYagTQQm9ns;

    public xh1(defpackage.e10 e10Var) {
        e10Var.getClass();
        this.WDYagTQQm9ns = e10Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00be, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
    
        r4 = defpackage.ai1.WDYagTQQm9ns;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c7, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.y61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.a71 UmgHb6n58gfG(java.lang.String str) {
        defpackage.ai1 ai1Var;
        int i;
        str.getClass();
        defpackage.e10 e10Var = this.WDYagTQQm9ns;
        defpackage.pa1 pa1Var = null;
        if (!e10Var.isOpen()) {
            defpackage.b80.IBvW5fLsPuHy("connection is closed", 21);
            throw null;
        }
        java.lang.String upperCase = defpackage.tg1.omM9cAlgeGXx(str).toString().toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (defpackage.ma0.fNwYGHIYeJcR(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = defpackage.tg1.NkfcFfdaVTox(upperCase, '*', i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = defpackage.tg1.NkfcFfdaVTox(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        java.lang.String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, java.lang.Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new defpackage.bi1(e10Var, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!defpackage.tg1.Jkfc0NcwyPL8(upperCase, "EXCLUSIVE", false)) {
                        if (!defpackage.tg1.Jkfc0NcwyPL8(upperCase, "IMMEDIATE", false)) {
                            ai1Var = defpackage.ai1.e6mdH7fiFuta;
                            break;
                        } else {
                            ai1Var = defpackage.ai1.P05cfTpS5W5L;
                            break;
                        }
                    } else {
                        ai1Var = defpackage.ai1.QiMR8OkAhezm;
                        break;
                    }
                }
                ai1Var = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !defpackage.tg1.Jkfc0NcwyPL8(upperCase, " TO ", false)) {
                    ai1Var = defpackage.ai1.oh71FJcDz6S2;
                    break;
                }
                ai1Var = null;
                break;
            default:
                ai1Var = null;
                break;
        }
        if (ai1Var != null) {
            return new defpackage.bi1(e10Var, str, ai1Var);
        }
        if (substring.equals("PRA")) {
            java.lang.String lowerCase = upperCase.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (defpackage.tg1.Jkfc0NcwyPL8(defpackage.tg1.FhgBoOud6zyW(lowerCase, "journal_mode", ""), "=", false)) {
                pa1Var = defpackage.pa1.fNwYGHIYeJcR;
            }
        }
        if (pa1Var != null) {
            return new defpackage.bi1(e10Var, str, new defpackage.di1(e10Var, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new defpackage.bi1(e10Var, str) : new defpackage.di1(e10Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.WDYagTQQm9ns.close();
    }

    @Override // defpackage.y61
    public final boolean gUjdnLbkVAaA() {
        return this.WDYagTQQm9ns.gUjdnLbkVAaA();
    }
}
