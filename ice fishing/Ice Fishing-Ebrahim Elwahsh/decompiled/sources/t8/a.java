package t8;

import M7.j;
import f8.c;
import kotlin.jvm.internal.h;
import u8.e;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f40954a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, int i4, int i9, String str, String str2) {
        int i10 = (i9 & 1) != 0 ? 0 : i;
        int length = (i9 & 2) != 0 ? str.length() : i4;
        boolean z8 = (i9 & 8) == 0;
        boolean z9 = (i9 & 16) == 0;
        boolean z10 = (i9 & 32) == 0;
        boolean z11 = (i9 & 64) == 0;
        h.e(str, "<this>");
        int i11 = i10;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            int i12 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z11) || j.M(str2, (char) codePointAt) || ((codePointAt == 37 && (!z8 || (z9 && !b(i11, length, str)))) || (codePointAt == 43 && z10)))) {
                e eVar = new e();
                eVar.c0(i10, i11, str);
                e eVar2 = null;
                while (i11 < length) {
                    int codePointAt2 = str.codePointAt(i11);
                    if (!z8 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i12 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            eVar.d0("+");
                        } else if (codePointAt2 == 43 && z10) {
                            eVar.d0(z8 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i12 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z11) && !j.M(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z8 && (!z9 || b(i11, length, str))))) {
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
                                char[] cArr = f40954a;
                                eVar.X(cArr[((z12 & 255) >> 4) & 15]);
                                eVar.X(cArr[z12 & 15]);
                            }
                        }
                    }
                    i11 += Character.charCount(codePointAt2);
                    i12 = 32;
                }
                return eVar.G();
            }
            i11 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i10, length);
        h.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean b(int i, int i4, String str) {
        h.e(str, "<this>");
        int i9 = i + 2;
        return i9 < i4 && str.charAt(i) == '%' && c.j(str.charAt(i + 1)) != -1 && c.j(str.charAt(i9)) != -1;
    }

    public static String c(int i, String str, int i4, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            i4 = str.length();
        }
        boolean z8 = (i9 & 4) == 0;
        h.e(str, "<this>");
        int i11 = i;
        while (i11 < i4) {
            char charAt = str.charAt(i11);
            if (charAt == '%' || (charAt == '+' && z8)) {
                e eVar = new e();
                eVar.c0(i, i11, str);
                while (i11 < i4) {
                    int codePointAt = str.codePointAt(i11);
                    if (codePointAt != 37 || (i10 = i11 + 2) >= i4) {
                        if (codePointAt == 43 && z8) {
                            eVar.X(32);
                            i11++;
                        }
                        eVar.e0(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    } else {
                        int j9 = c.j(str.charAt(i11 + 1));
                        int j10 = c.j(str.charAt(i10));
                        if (j9 != -1 && j10 != -1) {
                            eVar.X((j9 << 4) + j10);
                            i11 = Character.charCount(codePointAt) + i10;
                        }
                        eVar.e0(codePointAt);
                        i11 += Character.charCount(codePointAt);
                    }
                }
                return eVar.G();
            }
            i11++;
        }
        String substring = str.substring(i, i4);
        h.d(substring, "substring(...)");
        return substring;
    }
}
