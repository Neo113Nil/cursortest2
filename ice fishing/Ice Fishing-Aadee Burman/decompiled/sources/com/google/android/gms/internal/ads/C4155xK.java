package com.google.android.gms.internal.ads;

import com.anythink.core.common.d.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4155xK implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public long f34977A;

    /* renamed from: B, reason: collision with root package name */
    public int f34978B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f34979C;

    /* renamed from: E, reason: collision with root package name */
    public String[] f34981E;

    /* renamed from: F, reason: collision with root package name */
    public int[] f34982F;

    /* renamed from: n, reason: collision with root package name */
    public final StringReader f34983n;

    /* renamed from: u, reason: collision with root package name */
    public final char[] f34984u = new char[1024];

    /* renamed from: v, reason: collision with root package name */
    public int f34985v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f34986w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f34987x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f34988y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f34989z = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f34980D = 1;

    public C4155xK(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f34979C = iArr;
        iArr[0] = 6;
        this.f34981E = new String[32];
        this.f34982F = new int[32];
        this.f34983n = stringReader;
    }

    public final int B() {
        int i = this.f34989z;
        if (i == 0) {
            i = b();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean C(char c9) {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case j.v.f12578I /* 93 */:
                            return false;
                        case j.v.f12577H /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        I();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0122, code lost:
    
        r1.append(r5, r3, r4);
        r11.f34985v = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
    
        J("Malformed Unicode escape \\u".concat(new java.lang.String(r5, r11.f34985v, 4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String D(char c9) {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i6 = this.f34985v;
            int i9 = this.f34986w;
            int i10 = i6;
            while (true) {
                char[] cArr = this.f34984u;
                if (i6 >= i9) {
                    break;
                }
                int i11 = i6 + 1;
                char c10 = cArr[i6];
                if (c10 == c9) {
                    int i12 = (i11 - i10) - 1;
                    this.f34985v = i11;
                    if (sb == null) {
                        return new String(cArr, i10, i12);
                    }
                    sb.append(cArr, i10, i12);
                    return sb.toString();
                }
                char c11 = '\n';
                if (c10 == '\\') {
                    int i13 = i11 - i10;
                    int i14 = i13 - 1;
                    this.f34985v = i11;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i13 + i13, 16));
                    }
                    sb.append(cArr, i10, i14);
                    if (this.f34985v == this.f34986w && !G(1)) {
                        J("Unterminated escape sequence");
                        throw null;
                    }
                    int i15 = this.f34985v;
                    int i16 = i15 + 1;
                    this.f34985v = i16;
                    char c12 = cArr[i15];
                    if (c12 == '\n') {
                        this.f34987x++;
                        this.f34988y = i16;
                    } else if (c12 != '\"' && c12 != '\'' && c12 != '/' && c12 != '\\') {
                        if (c12 == 'b') {
                            c11 = '\b';
                        } else if (c12 == 'f') {
                            c11 = '\f';
                        } else if (c12 != 'n') {
                            if (c12 == 'r') {
                                c11 = '\r';
                            } else if (c12 == 't') {
                                c11 = '\t';
                            } else {
                                if (c12 != 'u') {
                                    J("Invalid escape sequence");
                                    throw null;
                                }
                                if (i15 + 5 > this.f34986w && !G(4)) {
                                    J("Unterminated escape sequence");
                                    throw null;
                                }
                                int i17 = this.f34985v;
                                int i18 = i17 + 4;
                                int i19 = 0;
                                while (i17 < i18) {
                                    int i20 = i19 << 4;
                                    char c13 = cArr[i17];
                                    if (c13 >= '0' && c13 <= '9') {
                                        i = c13 - '0';
                                    } else if (c13 >= 'a' && c13 <= 'f') {
                                        i = c13 - 'W';
                                    } else {
                                        if (c13 < 'A' || c13 > 'F') {
                                            break loop0;
                                        }
                                        i = c13 - '7';
                                    }
                                    i19 = i + i20;
                                    i17++;
                                }
                                this.f34985v += 4;
                                c11 = (char) i19;
                            }
                        }
                        sb.append(c11);
                        i10 = this.f34985v;
                        i9 = this.f34986w;
                        i6 = i10;
                    }
                    c11 = c12;
                    sb.append(c11);
                    i10 = this.f34985v;
                    i9 = this.f34986w;
                    i6 = i10;
                } else {
                    if (c10 == '\n') {
                        this.f34987x++;
                        this.f34988y = i11;
                    }
                    i6 = i11;
                }
            }
        } while (G(1));
        J("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0049, code lost:
    
        I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String E() {
        char[] cArr;
        String sb;
        int i = 0;
        int i6 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i9 = this.f34985v + i6;
            int i10 = this.f34986w;
            cArr = this.f34984u;
            if (i9 < i10) {
                char c9 = cArr[i9];
                if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                    if (c9 != '#') {
                        if (c9 != ',') {
                            if (c9 != '/' && c9 != '=') {
                                if (c9 != '{' && c9 != '}' && c9 != ':') {
                                    if (c9 != ';') {
                                        switch (c9) {
                                            case '[':
                                            case j.v.f12578I /* 93 */:
                                                break;
                                            case j.v.f12577H /* 92 */:
                                                break;
                                            default:
                                                i6++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i6 >= 1024) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(Math.max(i6, 16));
                }
                sb2.append(cArr, this.f34985v, i6);
                this.f34985v += i6;
                if (G(1)) {
                    i6 = 0;
                }
            } else if (G(i6 + 1)) {
            }
        }
        i = i6;
        if (sb2 == null) {
            sb = new String(cArr, this.f34985v, i);
        } else {
            sb2.append(cArr, this.f34985v, i);
            sb = sb2.toString();
        }
        this.f34985v += i;
        return sb;
    }

    public final void F(int i) {
        int i6 = this.f34980D;
        if (i6 - 1 >= 1280) {
            String z3 = z();
            throw new B1.z(u1.h.g(new StringBuilder(z3.length() + 26), "Nesting limit 1280 reached", z3));
        }
        int[] iArr = this.f34979C;
        if (i6 == iArr.length) {
            int i9 = i6 + i6;
            this.f34979C = Arrays.copyOf(iArr, i9);
            this.f34982F = Arrays.copyOf(this.f34982F, i9);
            this.f34981E = (String[]) Arrays.copyOf(this.f34981E, i9);
        }
        int[] iArr2 = this.f34979C;
        int i10 = this.f34980D;
        this.f34980D = i10 + 1;
        iArr2[i10] = i;
    }

    public final boolean G(int i) {
        int i6;
        int i9 = this.f34988y;
        int i10 = this.f34985v;
        this.f34988y = i9 - i10;
        int i11 = this.f34986w;
        char[] cArr = this.f34984u;
        if (i11 != i10) {
            int i12 = i11 - i10;
            this.f34986w = i12;
            System.arraycopy(cArr, i10, cArr, 0, i12);
        } else {
            this.f34986w = 0;
        }
        this.f34985v = 0;
        do {
            int i13 = this.f34986w;
            int read = this.f34983n.read(cArr, i13, 1024 - i13);
            if (read == -1) {
                return false;
            }
            i6 = this.f34986w + read;
            this.f34986w = i6;
            if (this.f34987x == 0 && this.f34988y == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f34985v++;
                this.f34988y = 1;
                i++;
            }
        } while (i6 < i);
        return true;
    }

    public final int H(boolean z3) {
        int i = this.f34985v;
        int i6 = this.f34986w;
        while (true) {
            if (i == i6) {
                this.f34985v = i;
                if (!G(1)) {
                    if (z3) {
                        throw new EOFException("End of input".concat(z()));
                    }
                    return -1;
                }
                i = this.f34985v;
                i6 = this.f34986w;
            }
            int i9 = i + 1;
            char c9 = this.f34984u[i];
            if (c9 == '\n') {
                this.f34987x++;
                this.f34988y = i9;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 != '/') {
                    if (c9 != '#') {
                        this.f34985v = i9;
                        return c9;
                    }
                    this.f34985v = i9;
                    I();
                    throw null;
                }
                this.f34985v = i9;
                if (i9 == i6) {
                    this.f34985v = i;
                    boolean G7 = G(2);
                    this.f34985v++;
                    if (!G7) {
                        return 47;
                    }
                }
                I();
                throw null;
            }
            i = i9;
        }
    }

    public final void I() {
        J("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void J(String str) {
        String z3 = z();
        throw new B1.z(D.y.s(new StringBuilder(str.length() + z3.length() + 79), str, z3, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException K(String str) {
        int B9 = B();
        String b9 = UC.b(B());
        String z3 = z();
        int a9 = u1.h.a(str.length() + 18, z3.length(), b9);
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(B9 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + a9 + 5);
        u1.h.i(sb, "Expected ", str, " but was ", b9);
        return new IllegalStateException(D.y.s(sb, z3, "\nSee ", concat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b4, code lost:
    
        if (C(r15) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        if (r10 != r3) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bb, code lost:
    
        if (r11 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c1, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        if (r19 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c5, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ce, code lost:
    
        if (r1 != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d0, code lost:
    
        if (r7 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d6, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d7, code lost:
    
        r26.f34977A = r1;
        r26.f34985v += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e0, code lost:
    
        r26.f34989z = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d3, code lost:
    
        if (r7 == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
    
        r6 = 2;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e4, code lost:
    
        if (r10 == r6) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e7, code lost:
    
        if (r10 == 4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ea, code lost:
    
        if (r10 != 7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ec, code lost:
    
        r26.f34978B = r4;
        r7 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b() {
        int i;
        int H8;
        int i6;
        int H9;
        int i9;
        String str;
        String str2;
        int i10;
        char c9;
        int i11;
        int[] iArr = this.f34979C;
        int i12 = this.f34980D;
        int i13 = i12 - 1;
        int i14 = iArr[i13];
        char[] cArr = this.f34984u;
        int i15 = 3;
        int i16 = 4;
        int i17 = 2;
        int i18 = 1;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else {
            if (i14 != 2) {
                if (i14 == 3) {
                    i = 4;
                } else if (i14 == 5) {
                    i = 4;
                } else if (i14 == 4) {
                    iArr[i13] = 5;
                    int H10 = H(true);
                    if (H10 != 58) {
                        if (H10 == 61) {
                            I();
                            throw null;
                        }
                        J("Expected ':'");
                        throw null;
                    }
                } else {
                    if (i14 != 6) {
                        if (i14 == 7) {
                            if (H(false) != -1) {
                                I();
                                throw null;
                            }
                            i15 = 17;
                            this.f34989z = i15;
                            return i15;
                        }
                        i6 = 0;
                        if (i14 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                        H9 = H(true);
                        if (H9 == 34) {
                            if (H9 == 39) {
                                I();
                                throw null;
                            }
                            if (H9 == 44 || H9 == 59) {
                                i9 = 1;
                            } else if (H9 != 91) {
                                if (H9 == 93) {
                                    i9 = 1;
                                    if (i14 == 1) {
                                        i15 = 4;
                                    }
                                } else if (H9 != 123) {
                                    int i19 = this.f34985v - 1;
                                    this.f34985v = i19;
                                    char c10 = cArr[i19];
                                    if (c10 == 't' || c10 == 'T') {
                                        str = "TRUE";
                                        str2 = "true";
                                        i10 = 5;
                                    } else if (c10 == 'f' || c10 == 'F') {
                                        str = "FALSE";
                                        str2 = "false";
                                        i10 = 6;
                                    } else {
                                        if (c10 == 'n' || c10 == 'N') {
                                            str = "NULL";
                                            str2 = "null";
                                            i10 = 7;
                                        }
                                        i10 = i6;
                                        if (i10 == 0) {
                                            return i10;
                                        }
                                        int i20 = this.f34985v;
                                        int i21 = this.f34986w;
                                        int i22 = i6;
                                        int i23 = i22;
                                        int i24 = i23;
                                        int i25 = i20;
                                        boolean z3 = true;
                                        long j6 = 0;
                                        while (true) {
                                            if (i25 + i22 == i21) {
                                                if (i22 == 1024) {
                                                    break;
                                                }
                                                if (!G(i22 + 1)) {
                                                    int i26 = i17;
                                                    break;
                                                }
                                                i25 = this.f34985v;
                                                i21 = this.f34986w;
                                            }
                                            char c11 = cArr[i25 + i22];
                                            if (c11 != '+') {
                                                if (c11 == 'E' || c11 == 'e') {
                                                    if (i23 != i17 && i23 != 4) {
                                                        break;
                                                    }
                                                    i23 = 5;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                } else if (c11 != '-') {
                                                    if (c11 == '.') {
                                                        if (i23 != i17) {
                                                            break;
                                                        }
                                                        i23 = 3;
                                                        i22++;
                                                        i18 = 1;
                                                        i17 = 2;
                                                    } else {
                                                        if (c11 < '0' || c11 > '9') {
                                                            break;
                                                        }
                                                        if (i23 == i18 || i23 == 0) {
                                                            j6 = -(c11 - '0');
                                                            i23 = 2;
                                                        } else if (i23 == i17) {
                                                            if (j6 == 0) {
                                                                break;
                                                            }
                                                            long j9 = (10 * j6) - (c11 - '0');
                                                            z3 &= j6 > -922337203685477580L || (j6 == -922337203685477580L && j9 < j6);
                                                            j6 = j9;
                                                        } else if (i23 == 3) {
                                                            i23 = 4;
                                                        } else if (i23 == 5 || i23 == 6) {
                                                            i23 = 7;
                                                        }
                                                        i22++;
                                                        i18 = 1;
                                                        i17 = 2;
                                                    }
                                                } else if (i23 == 0) {
                                                    i23 = 1;
                                                    i24 = 1;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                } else {
                                                    if (i23 != 5) {
                                                        break;
                                                    }
                                                    i23 = 6;
                                                    i22++;
                                                    i18 = 1;
                                                    i17 = 2;
                                                }
                                                if (i11 == 0) {
                                                    return i11;
                                                }
                                                if (C(cArr[this.f34985v])) {
                                                    I();
                                                    throw null;
                                                }
                                                J("Expected value");
                                                throw null;
                                            }
                                            if (i23 != 5) {
                                                break;
                                            }
                                            i23 = 6;
                                            i22++;
                                            i18 = 1;
                                            i17 = 2;
                                        }
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                    }
                                    int i27 = i6;
                                    while (true) {
                                        int length = str2.length();
                                        if (i27 < length) {
                                            if ((this.f34985v + i27 >= this.f34986w && !G(i27 + 1)) || ((c9 = cArr[this.f34985v + i27]) != str2.charAt(i27) && c9 != str.charAt(i27))) {
                                                break;
                                            }
                                            i27++;
                                        } else if ((this.f34985v + length >= this.f34986w && !G(length + 1)) || !C(cArr[this.f34985v + length])) {
                                            this.f34985v += length;
                                            this.f34989z = i10;
                                        }
                                    }
                                    i10 = i6;
                                    if (i10 == 0) {
                                    }
                                } else {
                                    i15 = 1;
                                }
                            }
                            if (i14 == i9 || i14 == 2) {
                                I();
                                throw null;
                            }
                            J("Unexpected value");
                            throw null;
                        }
                        i15 = 9;
                        this.f34989z = i15;
                        return i15;
                    }
                    iArr[i12 - 1] = 7;
                }
                i16 = 2;
                iArr[i13] = i;
                if (i14 != 5 || (H8 = H(true)) == 44) {
                    int H11 = H(true);
                    if (H11 == 34) {
                        i15 = 13;
                        this.f34989z = i15;
                        return i15;
                    }
                    if (H11 == 39) {
                        I();
                        throw null;
                    }
                    if (H11 != 125) {
                        I();
                        throw null;
                    }
                    if (i14 == 5) {
                        J("Expected name");
                        throw null;
                    }
                } else {
                    if (H8 == 59) {
                        I();
                        throw null;
                    }
                    if (H8 != 125) {
                        J("Unterminated object");
                        throw null;
                    }
                }
                i15 = i16;
                this.f34989z = i15;
                return i15;
            }
            int H12 = H(true);
            if (H12 != 44) {
                if (H12 == 59) {
                    I();
                    throw null;
                }
                if (H12 != 93) {
                    J("Unterminated array");
                    throw null;
                }
                i15 = i16;
                this.f34989z = i15;
                return i15;
            }
        }
        i6 = 0;
        H9 = H(true);
        if (H9 == 34) {
        }
        this.f34989z = i15;
        return i15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34989z = 0;
        this.f34979C[0] = 8;
        this.f34980D = 1;
        this.f34983n.close();
    }

    public final String j() {
        String str;
        int i = this.f34989z;
        if (i == 0) {
            i = b();
        }
        if (i == 10) {
            str = E();
        } else if (i == 8) {
            str = D('\'');
        } else if (i == 9) {
            str = D('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.f34977A);
        } else {
            if (i != 16) {
                throw K("a string");
            }
            str = new String(this.f34984u, this.f34985v, this.f34978B);
            this.f34985v += this.f34978B;
        }
        this.f34989z = 0;
        int[] iArr = this.f34982F;
        int i6 = this.f34980D - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    public final String toString() {
        return C4155xK.class.getSimpleName().concat(z());
    }

    public final String z() {
        int i = this.f34987x + 1;
        int i6 = this.f34985v - this.f34988y;
        StringBuilder sb = new StringBuilder("$");
        for (int i9 = 0; i9 < this.f34980D; i9++) {
            int i10 = this.f34979C[i9];
            switch (i10) {
                case 1:
                case 2:
                    int i11 = this.f34982F[i9];
                    sb.append('[');
                    sb.append(i11);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f34981E[i9];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(D.y.m(i10, "Unknown scope value: ", new StringBuilder(String.valueOf(i10).length() + 21)));
            }
        }
        int i12 = i6 + 1;
        String sb2 = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i12).length();
        StringBuilder sb3 = new StringBuilder(sb2.length() + length2 + length + 17 + 6);
        u1.h.h(sb3, " at line ", i, " column ", i12);
        return u1.h.g(sb3, " path ", sb2);
    }
}
