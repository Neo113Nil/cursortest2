package com.google.android.gms.internal.ads;

import com.anythink.core.common.d.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.xK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4178xK implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public long f35758A;

    /* renamed from: B, reason: collision with root package name */
    public int f35759B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f35760C;

    /* renamed from: E, reason: collision with root package name */
    public String[] f35762E;

    /* renamed from: F, reason: collision with root package name */
    public int[] f35763F;

    /* renamed from: n, reason: collision with root package name */
    public final StringReader f35764n;

    /* renamed from: u, reason: collision with root package name */
    public final char[] f35765u = new char[1024];

    /* renamed from: v, reason: collision with root package name */
    public int f35766v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f35767w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f35768x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f35769y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f35770z = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f35761D = 1;

    public C4178xK(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f35760C = iArr;
        iArr[0] = 6;
        this.f35762E = new String[32];
        this.f35763F = new int[32];
        this.f35764n = stringReader;
    }

    public final int B() {
        int i = this.f35770z;
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
                        case j.v.f13364I /* 93 */:
                            return false;
                        case j.v.f13363H /* 92 */:
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
        r11.f35766v = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ca, code lost:
    
        J("Malformed Unicode escape \\u".concat(new java.lang.String(r5, r11.f35766v, 4)));
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
            int i4 = this.f35766v;
            int i6 = this.f35767w;
            int i9 = i4;
            while (true) {
                char[] cArr = this.f35765u;
                if (i4 >= i6) {
                    break;
                }
                int i10 = i4 + 1;
                char c10 = cArr[i4];
                if (c10 == c9) {
                    int i11 = (i10 - i9) - 1;
                    this.f35766v = i10;
                    if (sb == null) {
                        return new String(cArr, i9, i11);
                    }
                    sb.append(cArr, i9, i11);
                    return sb.toString();
                }
                char c11 = '\n';
                if (c10 == '\\') {
                    int i12 = i10 - i9;
                    int i13 = i12 - 1;
                    this.f35766v = i10;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i12 + i12, 16));
                    }
                    sb.append(cArr, i9, i13);
                    if (this.f35766v == this.f35767w && !G(1)) {
                        J("Unterminated escape sequence");
                        throw null;
                    }
                    int i14 = this.f35766v;
                    int i15 = i14 + 1;
                    this.f35766v = i15;
                    char c12 = cArr[i14];
                    if (c12 == '\n') {
                        this.f35768x++;
                        this.f35769y = i15;
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
                                if (i14 + 5 > this.f35767w && !G(4)) {
                                    J("Unterminated escape sequence");
                                    throw null;
                                }
                                int i16 = this.f35766v;
                                int i17 = i16 + 4;
                                int i18 = 0;
                                while (i16 < i17) {
                                    int i19 = i18 << 4;
                                    char c13 = cArr[i16];
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
                                    i18 = i + i19;
                                    i16++;
                                }
                                this.f35766v += 4;
                                c11 = (char) i18;
                            }
                        }
                        sb.append(c11);
                        i9 = this.f35766v;
                        i6 = this.f35767w;
                        i4 = i9;
                    }
                    c11 = c12;
                    sb.append(c11);
                    i9 = this.f35766v;
                    i6 = this.f35767w;
                    i4 = i9;
                } else {
                    if (c10 == '\n') {
                        this.f35768x++;
                        this.f35769y = i10;
                    }
                    i4 = i10;
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
        int i4 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i6 = this.f35766v + i4;
            int i9 = this.f35767w;
            cArr = this.f35765u;
            if (i6 < i9) {
                char c9 = cArr[i6];
                if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                    if (c9 != '#') {
                        if (c9 != ',') {
                            if (c9 != '/' && c9 != '=') {
                                if (c9 != '{' && c9 != '}' && c9 != ':') {
                                    if (c9 != ';') {
                                        switch (c9) {
                                            case '[':
                                            case j.v.f13364I /* 93 */:
                                                break;
                                            case j.v.f13363H /* 92 */:
                                                break;
                                            default:
                                                i4++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i4 >= 1024) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(Math.max(i4, 16));
                }
                sb2.append(cArr, this.f35766v, i4);
                this.f35766v += i4;
                if (G(1)) {
                    i4 = 0;
                }
            } else if (G(i4 + 1)) {
            }
        }
        i = i4;
        if (sb2 == null) {
            sb = new String(cArr, this.f35766v, i);
        } else {
            sb2.append(cArr, this.f35766v, i);
            sb = sb2.toString();
        }
        this.f35766v += i;
        return sb;
    }

    public final void F(int i) {
        int i4 = this.f35761D;
        if (i4 - 1 >= 1280) {
            String z6 = z();
            throw new D1.y(Wv.i(new StringBuilder(z6.length() + 26), "Nesting limit 1280 reached", z6));
        }
        int[] iArr = this.f35760C;
        if (i4 == iArr.length) {
            int i6 = i4 + i4;
            this.f35760C = Arrays.copyOf(iArr, i6);
            this.f35763F = Arrays.copyOf(this.f35763F, i6);
            this.f35762E = (String[]) Arrays.copyOf(this.f35762E, i6);
        }
        int[] iArr2 = this.f35760C;
        int i9 = this.f35761D;
        this.f35761D = i9 + 1;
        iArr2[i9] = i;
    }

    public final boolean G(int i) {
        int i4;
        int i6 = this.f35769y;
        int i9 = this.f35766v;
        this.f35769y = i6 - i9;
        int i10 = this.f35767w;
        char[] cArr = this.f35765u;
        if (i10 != i9) {
            int i11 = i10 - i9;
            this.f35767w = i11;
            System.arraycopy(cArr, i9, cArr, 0, i11);
        } else {
            this.f35767w = 0;
        }
        this.f35766v = 0;
        do {
            int i12 = this.f35767w;
            int read = this.f35764n.read(cArr, i12, 1024 - i12);
            if (read == -1) {
                return false;
            }
            i4 = this.f35767w + read;
            this.f35767w = i4;
            if (this.f35768x == 0 && this.f35769y == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f35766v++;
                this.f35769y = 1;
                i++;
            }
        } while (i4 < i);
        return true;
    }

    public final int H(boolean z6) {
        int i = this.f35766v;
        int i4 = this.f35767w;
        while (true) {
            if (i == i4) {
                this.f35766v = i;
                if (!G(1)) {
                    if (z6) {
                        throw new EOFException("End of input".concat(z()));
                    }
                    return -1;
                }
                i = this.f35766v;
                i4 = this.f35767w;
            }
            int i6 = i + 1;
            char c9 = this.f35765u[i];
            if (c9 == '\n') {
                this.f35768x++;
                this.f35769y = i6;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 != '/') {
                    if (c9 != '#') {
                        this.f35766v = i6;
                        return c9;
                    }
                    this.f35766v = i6;
                    I();
                    throw null;
                }
                this.f35766v = i6;
                if (i6 == i4) {
                    this.f35766v = i;
                    boolean G2 = G(2);
                    this.f35766v++;
                    if (!G2) {
                        return 47;
                    }
                }
                I();
                throw null;
            }
            i = i6;
        }
    }

    public final void I() {
        J("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void J(String str) {
        String z6 = z();
        throw new D1.y(D.x.p(new StringBuilder(str.length() + z6.length() + 79), str, z6, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException K(String str) {
        int B3 = B();
        String b9 = UC.b(B());
        String z6 = z();
        int j6 = AbstractC5128c.j(str.length() + 18, z6.length(), b9);
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(B3 == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(concat.length() + j6 + 5);
        AbstractC5128c.h(sb, "Expected ", str, " but was ", b9);
        return new IllegalStateException(D.x.p(sb, z6, "\nSee ", concat));
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
    
        r26.f35758A = r1;
        r26.f35766v += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e0, code lost:
    
        r26.f35770z = r7;
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
    
        r26.f35759B = r4;
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
        int i4;
        int H9;
        int i6;
        String str;
        String str2;
        int i9;
        char c9;
        int i10;
        int[] iArr = this.f35760C;
        int i11 = this.f35761D;
        int i12 = i11 - 1;
        int i13 = iArr[i12];
        char[] cArr = this.f35765u;
        int i14 = 3;
        int i15 = 4;
        int i16 = 2;
        int i17 = 1;
        if (i13 == 1) {
            iArr[i12] = 2;
        } else {
            if (i13 != 2) {
                if (i13 == 3) {
                    i = 4;
                } else if (i13 == 5) {
                    i = 4;
                } else if (i13 == 4) {
                    iArr[i12] = 5;
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
                    if (i13 != 6) {
                        if (i13 == 7) {
                            if (H(false) != -1) {
                                I();
                                throw null;
                            }
                            i14 = 17;
                            this.f35770z = i14;
                            return i14;
                        }
                        i4 = 0;
                        if (i13 == 8) {
                            throw new IllegalStateException("JsonReader is closed");
                        }
                        H9 = H(true);
                        if (H9 == 34) {
                            if (H9 == 39) {
                                I();
                                throw null;
                            }
                            if (H9 == 44 || H9 == 59) {
                                i6 = 1;
                            } else if (H9 != 91) {
                                if (H9 == 93) {
                                    i6 = 1;
                                    if (i13 == 1) {
                                        i14 = 4;
                                    }
                                } else if (H9 != 123) {
                                    int i18 = this.f35766v - 1;
                                    this.f35766v = i18;
                                    char c10 = cArr[i18];
                                    if (c10 == 't' || c10 == 'T') {
                                        str = "TRUE";
                                        str2 = "true";
                                        i9 = 5;
                                    } else if (c10 == 'f' || c10 == 'F') {
                                        str = "FALSE";
                                        str2 = "false";
                                        i9 = 6;
                                    } else {
                                        if (c10 == 'n' || c10 == 'N') {
                                            str = "NULL";
                                            str2 = "null";
                                            i9 = 7;
                                        }
                                        i9 = i4;
                                        if (i9 == 0) {
                                            return i9;
                                        }
                                        int i19 = this.f35766v;
                                        int i20 = this.f35767w;
                                        int i21 = i4;
                                        int i22 = i21;
                                        int i23 = i22;
                                        int i24 = i19;
                                        boolean z6 = true;
                                        long j6 = 0;
                                        while (true) {
                                            if (i24 + i21 == i20) {
                                                if (i21 == 1024) {
                                                    break;
                                                }
                                                if (!G(i21 + 1)) {
                                                    int i25 = i16;
                                                    break;
                                                }
                                                i24 = this.f35766v;
                                                i20 = this.f35767w;
                                            }
                                            char c11 = cArr[i24 + i21];
                                            if (c11 != '+') {
                                                if (c11 == 'E' || c11 == 'e') {
                                                    if (i22 != i16 && i22 != 4) {
                                                        break;
                                                    }
                                                    i22 = 5;
                                                    i21++;
                                                    i17 = 1;
                                                    i16 = 2;
                                                } else if (c11 != '-') {
                                                    if (c11 == '.') {
                                                        if (i22 != i16) {
                                                            break;
                                                        }
                                                        i22 = 3;
                                                        i21++;
                                                        i17 = 1;
                                                        i16 = 2;
                                                    } else {
                                                        if (c11 < '0' || c11 > '9') {
                                                            break;
                                                        }
                                                        if (i22 == i17 || i22 == 0) {
                                                            j6 = -(c11 - '0');
                                                            i22 = 2;
                                                        } else if (i22 == i16) {
                                                            if (j6 == 0) {
                                                                break;
                                                            }
                                                            long j9 = (10 * j6) - (c11 - '0');
                                                            z6 &= j6 > -922337203685477580L || (j6 == -922337203685477580L && j9 < j6);
                                                            j6 = j9;
                                                        } else if (i22 == 3) {
                                                            i22 = 4;
                                                        } else if (i22 == 5 || i22 == 6) {
                                                            i22 = 7;
                                                        }
                                                        i21++;
                                                        i17 = 1;
                                                        i16 = 2;
                                                    }
                                                } else if (i22 == 0) {
                                                    i22 = 1;
                                                    i23 = 1;
                                                    i21++;
                                                    i17 = 1;
                                                    i16 = 2;
                                                } else {
                                                    if (i22 != 5) {
                                                        break;
                                                    }
                                                    i22 = 6;
                                                    i21++;
                                                    i17 = 1;
                                                    i16 = 2;
                                                }
                                                if (i10 == 0) {
                                                    return i10;
                                                }
                                                if (C(cArr[this.f35766v])) {
                                                    I();
                                                    throw null;
                                                }
                                                J("Expected value");
                                                throw null;
                                            }
                                            if (i22 != 5) {
                                                break;
                                            }
                                            i22 = 6;
                                            i21++;
                                            i17 = 1;
                                            i16 = 2;
                                        }
                                        i10 = 0;
                                        if (i10 == 0) {
                                        }
                                    }
                                    int i26 = i4;
                                    while (true) {
                                        int length = str2.length();
                                        if (i26 < length) {
                                            if ((this.f35766v + i26 >= this.f35767w && !G(i26 + 1)) || ((c9 = cArr[this.f35766v + i26]) != str2.charAt(i26) && c9 != str.charAt(i26))) {
                                                break;
                                            }
                                            i26++;
                                        } else if ((this.f35766v + length >= this.f35767w && !G(length + 1)) || !C(cArr[this.f35766v + length])) {
                                            this.f35766v += length;
                                            this.f35770z = i9;
                                        }
                                    }
                                    i9 = i4;
                                    if (i9 == 0) {
                                    }
                                } else {
                                    i14 = 1;
                                }
                            }
                            if (i13 == i6 || i13 == 2) {
                                I();
                                throw null;
                            }
                            J("Unexpected value");
                            throw null;
                        }
                        i14 = 9;
                        this.f35770z = i14;
                        return i14;
                    }
                    iArr[i11 - 1] = 7;
                }
                i15 = 2;
                iArr[i12] = i;
                if (i13 != 5 || (H8 = H(true)) == 44) {
                    int H11 = H(true);
                    if (H11 == 34) {
                        i14 = 13;
                        this.f35770z = i14;
                        return i14;
                    }
                    if (H11 == 39) {
                        I();
                        throw null;
                    }
                    if (H11 != 125) {
                        I();
                        throw null;
                    }
                    if (i13 == 5) {
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
                i14 = i15;
                this.f35770z = i14;
                return i14;
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
                i14 = i15;
                this.f35770z = i14;
                return i14;
            }
        }
        i4 = 0;
        H9 = H(true);
        if (H9 == 34) {
        }
        this.f35770z = i14;
        return i14;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35770z = 0;
        this.f35760C[0] = 8;
        this.f35761D = 1;
        this.f35764n.close();
    }

    public final String j() {
        String str;
        int i = this.f35770z;
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
            str = Long.toString(this.f35758A);
        } else {
            if (i != 16) {
                throw K("a string");
            }
            str = new String(this.f35765u, this.f35766v, this.f35759B);
            this.f35766v += this.f35759B;
        }
        this.f35770z = 0;
        int[] iArr = this.f35763F;
        int i4 = this.f35761D - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    public final String toString() {
        return C4178xK.class.getSimpleName().concat(z());
    }

    public final String z() {
        int i = this.f35768x + 1;
        int i4 = this.f35766v - this.f35769y;
        StringBuilder sb = new StringBuilder("$");
        for (int i6 = 0; i6 < this.f35761D; i6++) {
            int i9 = this.f35760C[i6];
            switch (i9) {
                case 1:
                case 2:
                    int i10 = this.f35763F[i6];
                    sb.append('[');
                    sb.append(i10);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f35762E[i6];
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
                    throw new AssertionError(D.x.k(i9, "Unknown scope value: ", new StringBuilder(String.valueOf(i9).length() + 21)));
            }
        }
        int i11 = i4 + 1;
        String sb2 = sb.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i11).length();
        StringBuilder sb3 = new StringBuilder(sb2.length() + length2 + length + 17 + 6);
        AbstractC5128c.g(sb3, " at line ", i, " column ", i11);
        return Wv.i(sb3, " path ", sb2);
    }
}
