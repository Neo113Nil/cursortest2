package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ta0 implements f40 {
    public final fk NCTxEWno;

    public ta0(fk fkVar) {
        fkVar.getClass();
        this.NCTxEWno = fkVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bc, code lost:
    
        if (r2.equals("END") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c8, code lost:
    
        r3 = defpackage.wa0.NCTxEWno;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c5, code lost:
    
        if (r2.equals("COM") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.f40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h40 Ey6iv0m0(String str) {
        wa0 wa0Var;
        int i;
        str.getClass();
        fk fkVar = this.NCTxEWno;
        re reVar = null;
        if (!fkVar.isOpen()) {
            w30.bvfAo0eO("connection is closed", 21);
            throw null;
        }
        String upperCase = ba0.SgZGMMPL(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (charAt >= ' ' && charAt != ' ') {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = ba0.gjV1z5T1(upperCase, '*', i4 + 1, 4);
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
                        i3 = ba0.gjV1z5T1(upperCase, '\n', i3 + 2, 4);
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
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new xa0(fkVar, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!ba0.I5GHvsYW(upperCase, "EXCLUSIVE")) {
                        if (!ba0.I5GHvsYW(upperCase, "IMMEDIATE")) {
                            wa0Var = wa0.P7K7Inc8;
                            break;
                        } else {
                            wa0Var = wa0.VgvYg0wo;
                            break;
                        }
                    } else {
                        wa0Var = wa0.wxUZMvaN;
                        break;
                    }
                }
                wa0Var = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !ba0.I5GHvsYW(upperCase, " TO ")) {
                    wa0Var = wa0.MdtA4re8;
                    break;
                }
                wa0Var = null;
                break;
            default:
                wa0Var = null;
                break;
        }
        if (wa0Var != null) {
            return new xa0(fkVar, str, wa0Var);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (ba0.I5GHvsYW(ba0.i7xS8jrb(lowerCase, "journal_mode", ""), "=")) {
                reVar = re.b2ZJblxo;
            }
        }
        if (reVar != null) {
            return new xa0(fkVar, str, new za0(fkVar, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new xa0(fkVar, str) : new za0(fkVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.NCTxEWno.close();
    }

    @Override // defpackage.f40
    public final boolean ow5vqvCr() {
        return this.NCTxEWno.ow5vqvCr();
    }
}
