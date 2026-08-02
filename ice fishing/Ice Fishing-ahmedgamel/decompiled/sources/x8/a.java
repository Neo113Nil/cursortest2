package x8;

import Q7.j;
import j8.c;
import kotlin.jvm.internal.h;
import y8.e;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f41888a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, int i4, int i6, String str, String str2) {
        int i9 = (i6 & 1) != 0 ? 0 : i;
        int length = (i6 & 2) != 0 ? str.length() : i4;
        boolean z6 = (i6 & 8) == 0;
        boolean z9 = (i6 & 16) == 0;
        boolean z10 = (i6 & 32) == 0;
        boolean z11 = (i6 & 64) == 0;
        h.e(str, "<this>");
        int i10 = i9;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int i11 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z11) || j.l0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z9 && !b(i10, length, str)))) || (codePointAt == 43 && z10)))) {
                e eVar = new e();
                eVar.c0(i9, i10, str);
                e eVar2 = null;
                while (i10 < length) {
                    int codePointAt2 = str.codePointAt(i10);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i11 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            eVar.d0("+");
                        } else if (codePointAt2 == 43 && z10) {
                            eVar.d0(z6 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i11 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z11) && !j.l0(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z6 && (!z9 || b(i10, length, str))))) {
                                    eVar.e0(codePointAt2);
                                }
                            }
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            eVar2.e0(codePointAt2);
                            while (!eVar2.j()) {
                                byte z12 = eVar2.z();
                                eVar.X(37);
                                char[] cArr = f41888a;
                                eVar.X(cArr[((z12 & 255) >> 4) & 15]);
                                eVar.X(cArr[z12 & 15]);
                            }
                        }
                    }
                    i10 += Character.charCount(codePointAt2);
                    i11 = 32;
                }
                return eVar.G();
            }
            i10 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i9, length);
        h.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean b(int i, int i4, String str) {
        h.e(str, "<this>");
        int i6 = i + 2;
        return i6 < i4 && str.charAt(i) == '%' && c.j(str.charAt(i + 1)) != -1 && c.j(str.charAt(i6)) != -1;
    }

    public static String c(int i, String str, int i4, int i6) {
        int i9;
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = str.length();
        }
        boolean z6 = (i6 & 4) == 0;
        h.e(str, "<this>");
        int i10 = i;
        while (i10 < i4) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z6)) {
                e eVar = new e();
                eVar.c0(i, i10, str);
                while (i10 < i4) {
                    int codePointAt = str.codePointAt(i10);
                    if (codePointAt != 37 || (i9 = i10 + 2) >= i4) {
                        if (codePointAt == 43 && z6) {
                            eVar.X(32);
                            i10++;
                        }
                        eVar.e0(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    } else {
                        int j6 = c.j(str.charAt(i10 + 1));
                        int j9 = c.j(str.charAt(i9));
                        if (j6 != -1 && j9 != -1) {
                            eVar.X((j6 << 4) + j9);
                            i10 = Character.charCount(codePointAt) + i9;
                        }
                        eVar.e0(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    }
                }
                return eVar.G();
            }
            i10++;
        }
        String substring = str.substring(i, i4);
        h.d(substring, "substring(...)");
        return substring;
    }
}
