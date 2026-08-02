package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class qsr implements xjo {
    public final rsr a;

    public qsr(rsr rsrVar) {
        rsrVar.getClass();
        this.a = rsrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00be, code lost:
    
        if (r3.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ca, code lost:
    
        r5 = defpackage.zsr.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c7, code lost:
    
        if (r3.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.xjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cko D0(String str) {
        zsr zsrVar;
        int i;
        str.getClass();
        rsr rsrVar = this.a;
        y9w y9wVar = null;
        if (!rsrVar.isOpen()) {
            p6g.H(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.t0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (Intrinsics.e(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = StringsKt.S(upperCase, '*', i4 + 1, 4);
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
                        i3 = StringsKt.S(upperCase, '\n', i3 + 2, 4);
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
            return new atr(rsrVar, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!StringsKt.M(upperCase, "EXCLUSIVE", false)) {
                        if (!StringsKt.M(upperCase, "IMMEDIATE", false)) {
                            zsrVar = zsr.e;
                            break;
                        } else {
                            zsrVar = zsr.d;
                            break;
                        }
                    } else {
                        zsrVar = zsr.c;
                        break;
                    }
                }
                zsrVar = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !StringsKt.M(upperCase, " TO ", false)) {
                    zsrVar = zsr.b;
                    break;
                }
                zsrVar = null;
                break;
            default:
                zsrVar = null;
                break;
        }
        if (zsrVar != null) {
            return new atr(rsrVar, str, zsrVar);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.M(StringsKt.k0(lowerCase, "journal_mode", ""), "=", false)) {
                y9wVar = y9w.h;
            }
        }
        if (y9wVar != null) {
            return new atr(rsrVar, str, new btr(rsrVar, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new atr(rsrVar, str) : new btr(rsrVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.xjo
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }
}
