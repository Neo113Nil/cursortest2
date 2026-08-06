package defpackage;

/* loaded from: classes.dex */
public final class md1 implements defpackage.i31 {
    public final defpackage.mz adDC3e2L;

    public md1(defpackage.mz mzVar) {
        mzVar.getClass();
        this.adDC3e2L = mzVar;
    }

    @Override // defpackage.i31
    public final boolean SyNS6RMn() {
        return this.adDC3e2L.SyNS6RMn();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.adDC3e2L.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00be, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
    
        r4 = defpackage.pd1.adDC3e2L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c7, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.i31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.k31 nBH8hAHy(java.lang.String str) {
        defpackage.pd1 pd1Var;
        int i;
        str.getClass();
        defpackage.mz mzVar = this.adDC3e2L;
        defpackage.ad1 ad1Var = null;
        if (!mzVar.isOpen()) {
            defpackage.a70.SiPhmbmu("connection is closed", 21);
            throw null;
        }
        java.lang.String upperCase = defpackage.rc1.gG5uWf3dqScO(str).toString().toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (defpackage.x70.kNAkVymC(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = defpackage.rc1.nVhUznk1t(upperCase, '*', i4 + 1, 4);
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
                        i3 = defpackage.rc1.nVhUznk1t(upperCase, '\n', i3 + 2, 4);
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
            return new defpackage.qd1(mzVar, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!defpackage.rc1.AsxAYCCkb3Hi(upperCase, "EXCLUSIVE", false)) {
                        if (!defpackage.rc1.AsxAYCCkb3Hi(upperCase, "IMMEDIATE", false)) {
                            pd1Var = defpackage.pd1.riuEU0zW4;
                            break;
                        } else {
                            pd1Var = defpackage.pd1.EXtogiMhuM;
                            break;
                        }
                    } else {
                        pd1Var = defpackage.pd1.AARZUJiTa;
                        break;
                    }
                }
                pd1Var = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !defpackage.rc1.AsxAYCCkb3Hi(upperCase, " TO ", false)) {
                    pd1Var = defpackage.pd1.xiZrDbcSW0;
                    break;
                }
                pd1Var = null;
                break;
            default:
                pd1Var = null;
                break;
        }
        if (pd1Var != null) {
            return new defpackage.qd1(mzVar, str, pd1Var);
        }
        if (substring.equals("PRA")) {
            java.lang.String lowerCase = upperCase.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (defpackage.rc1.AsxAYCCkb3Hi(defpackage.rc1.mL9sMlGfef(lowerCase, "journal_mode", ""), "=", false)) {
                ad1Var = defpackage.ad1.AARZUJiTa;
            }
        }
        if (ad1Var != null) {
            return new defpackage.qd1(mzVar, str, new defpackage.rd1(mzVar, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new defpackage.qd1(mzVar, str) : new defpackage.rd1(mzVar, str);
    }
}
