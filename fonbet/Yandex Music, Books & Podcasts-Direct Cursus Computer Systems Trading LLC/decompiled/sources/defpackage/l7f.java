package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class l7f implements Closeable {
    public static final pn3 k;
    public static final pn3 l;
    public static final pn3 m;
    public int a;
    public final hi3 e;
    public final hi3 f;
    public long h;
    public int i;
    public String j;
    public int[] b = new int[32];
    public String[] c = new String[32];
    public int[] d = new int[32];
    public int g = 0;

    static {
        pn3 pn3Var = pn3.d;
        k = ovn.C("'\\");
        l = ovn.C("\"\\");
        m = ovn.C("{}[]:, \n\t\r\f/\\;#=");
        ovn.C("\n\r");
        ovn.C("*/");
    }

    public l7f(hi3 hi3Var) {
        this.e = hi3Var;
        this.f = hi3Var;
        S(6);
    }

    public final void D() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i != 2) {
            b6e.k(f1d.w(peek()), getPath(), "Expected END_OBJECT but was ");
            return;
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.g = 0;
    }

    public final void F0(String str) {
        StringBuilder m2 = tlm.m(str, " at path ");
        m2.append(getPath());
        throw new pg5(m2.toString());
    }

    public final int H(String str, aqd aqdVar) {
        int length = ((String[]) aqdVar.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) aqdVar.b)[i])) {
                this.g = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final int I(String str, aqd aqdVar) {
        int length = ((String[]) aqdVar.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) aqdVar.b)[i])) {
                this.g = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    public final String L() {
        String str;
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i == 14) {
            str = R();
        } else if (i == 13) {
            str = Q(l);
        } else if (i == 12) {
            str = Q(k);
        } else {
            if (i != 15) {
                b6e.k(f1d.w(peek()), getPath(), "Expected a name but was ");
                return null;
            }
            str = this.j;
            this.j = null;
        }
        this.g = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    public final boolean N(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        throw null;
    }

    public final int P(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            hi3 hi3Var = this.e;
            if (!hi3Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            hi3 hi3Var2 = this.f;
            byte P = hi3Var2.P(j);
            if (P != 10 && P != 32 && P != 13 && P != 9) {
                hi3Var2.skip(j);
                if (P == 47) {
                    if (hi3Var.request(2L)) {
                        g();
                        throw null;
                    }
                } else if (P == 35) {
                    g();
                    throw null;
                }
                return P;
            }
            i = i2;
        }
    }

    public final String Q(pn3 pn3Var) {
        StringBuilder sb = null;
        while (true) {
            long C = this.e.C(pn3Var);
            if (C == -1) {
                F0("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.f;
            if (hi3Var.P(C) != 92) {
                if (sb == null) {
                    String F0 = hi3Var.F0(C, Charsets.UTF_8);
                    hi3Var.readByte();
                    return F0;
                }
                sb.append(hi3Var.F0(C, Charsets.UTF_8));
                hi3Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(hi3Var.F0(C, Charsets.UTF_8));
            hi3Var.readByte();
            sb.append(X());
        }
    }

    public final String R() {
        long C = this.e.C(m);
        hi3 hi3Var = this.f;
        if (C == -1) {
            return hi3Var.G0();
        }
        hi3Var.getClass();
        return hi3Var.F0(C, Charsets.UTF_8);
    }

    public final void S(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new wp3("Nesting too deep at ".concat(getPath()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public final char X() {
        int i;
        hi3 hi3Var = this.e;
        if (!hi3Var.request(1L)) {
            F0("Unterminated escape sequence");
            throw null;
        }
        hi3 hi3Var2 = this.f;
        byte readByte = hi3Var2.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            F0("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!hi3Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(getPath()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte P = hi3Var2.P(i2);
            char c2 = (char) (c << 4);
            if (P >= 48 && P <= 57) {
                i = P - 48;
            } else if (P >= 97 && P <= 102) {
                i = P - 87;
            } else {
                if (P < 65 || P > 70) {
                    F0("\\u".concat(hi3Var2.F0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = P - 55;
            }
            c = (char) (i + c2);
        }
        hi3Var2.skip(4L);
        return c;
    }

    public final int Y(aqd aqdVar) {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return H(this.j, aqdVar);
        }
        int h0 = this.e.h0((qwj) aqdVar.c);
        if (h0 != -1) {
            this.g = 0;
            this.c[this.a - 1] = ((String[]) aqdVar.b)[h0];
            return h0;
        }
        String str = this.c[this.a - 1];
        String L = L();
        int H = H(L, aqdVar);
        if (H == -1) {
            this.g = 15;
            this.j = L;
            this.c[this.a - 1] = str;
        }
        return H;
    }

    public final void a() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i != 3) {
            b6e.k(f1d.w(peek()), getPath(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        S(1);
        this.d[this.a - 1] = 0;
        this.g = 0;
    }

    public final void b() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i != 1) {
            b6e.k(f1d.w(peek()), getPath(), "Expected BEGIN_OBJECT but was ");
        } else {
            S(3);
            this.g = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g = 0;
        this.b[0] = 8;
        this.a = 1;
        this.f.b();
    }

    public final String f0() {
        String F0;
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i == 10) {
            F0 = R();
        } else if (i == 9) {
            F0 = Q(l);
        } else if (i == 8) {
            F0 = Q(k);
        } else if (i == 11) {
            F0 = this.j;
            this.j = null;
        } else if (i == 16) {
            F0 = Long.toString(this.h);
        } else {
            if (i != 17) {
                b6e.k(f1d.w(peek()), getPath(), "Expected a string but was ");
                return null;
            }
            long j = this.i;
            hi3 hi3Var = this.f;
            hi3Var.getClass();
            F0 = hi3Var.F0(j, Charsets.UTF_8);
        }
        this.g = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return F0;
    }

    public final void g() {
        F0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String getPath() {
        return weo.z(this.a, this.b, this.c, this.d);
    }

    public final boolean hasNext() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final void j0() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i == 14) {
            long C = this.e.C(m);
            hi3 hi3Var = this.f;
            if (C == -1) {
                C = hi3Var.b;
            }
            hi3Var.skip(C);
        } else if (i == 13) {
            l0(l);
        } else if (i == 12) {
            l0(k);
        } else if (i != 15) {
            b6e.k(f1d.w(peek()), getPath(), "Expected a name but was ");
            return;
        }
        this.g = 0;
        this.c[this.a - 1] = "null";
    }

    public final void l0(pn3 pn3Var) {
        while (true) {
            long C = this.e.C(pn3Var);
            if (C == -1) {
                F0("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.f;
            if (hi3Var.P(C) != 92) {
                hi3Var.skip(C + 1);
                return;
            } else {
                hi3Var.skip(C + 1);
                X();
            }
        }
    }

    public final double nextDouble() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i == 16) {
            this.g = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.h;
        }
        if (i == 17) {
            long j = this.i;
            hi3 hi3Var = this.f;
            hi3Var.getClass();
            this.j = hi3Var.F0(j, Charsets.UTF_8);
        } else if (i == 9) {
            this.j = Q(l);
        } else if (i == 8) {
            this.j = Q(k);
        } else if (i == 10) {
            this.j = R();
        } else if (i != 11) {
            b6e.k(f1d.w(peek()), getPath(), "Expected a double but was ");
            return 0.0d;
        }
        this.g = 11;
        try {
            double parseDouble = Double.parseDouble(this.j);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new pg5("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.j = null;
            this.g = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            b6e.k(this.j, getPath(), "Expected a double but was ");
            return 0.0d;
        }
    }

    public final int nextInt() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i == 16) {
            long j = this.h;
            int i2 = (int) j;
            if (j == i2) {
                this.g = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new wp3("Expected an int but was " + this.h + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.i;
            hi3 hi3Var = this.f;
            hi3Var.getClass();
            this.j = hi3Var.F0(j2, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String Q = i == 9 ? Q(l) : Q(k);
            this.j = Q;
            try {
                int parseInt = Integer.parseInt(Q);
                this.g = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            b6e.k(f1d.w(peek()), getPath(), "Expected an int but was ");
            return 0;
        }
        this.g = 11;
        try {
            double parseDouble = Double.parseDouble(this.j);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                b6e.k(this.j, getPath(), "Expected an int but was ");
                return 0;
            }
            this.j = null;
            this.g = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            b6e.k(this.j, getPath(), "Expected an int but was ");
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bf, code lost:
    
        if (r1 == 4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        if (r1 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c4, code lost:
    
        r22.i = r2;
        r9 = 17;
        r22.g = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (N(r10) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r1 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r4 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
    
        if (r13 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a9, code lost:
    
        if (r8 != r16) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ab, code lost:
    
        if (r13 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b1, code lost:
    
        r22.h = r8;
        r7.skip(r2);
        r9 = 16;
        r22.g = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bc, code lost:
    
        if (r1 == 2) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o() {
        int i;
        String str;
        String str2;
        long j;
        char P;
        int i2;
        char c;
        int[] iArr = this.b;
        int i3 = this.a - 1;
        int i4 = iArr[i3];
        hi3 hi3Var = this.f;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else if (i4 == 2) {
            int P2 = P(true);
            hi3Var.readByte();
            if (P2 != 44) {
                if (P2 == 59) {
                    g();
                    throw null;
                }
                if (P2 == 93) {
                    this.g = 4;
                    return 4;
                }
                F0("Unterminated array");
                throw null;
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3] = 4;
                if (i4 == 5) {
                    int P3 = P(true);
                    hi3Var.readByte();
                    if (P3 != 44) {
                        if (P3 == 59) {
                            g();
                            throw null;
                        }
                        if (P3 == 125) {
                            this.g = 2;
                            return 2;
                        }
                        F0("Unterminated object");
                        throw null;
                    }
                }
                int P4 = P(true);
                if (P4 == 34) {
                    hi3Var.readByte();
                    this.g = 13;
                    return 13;
                }
                if (P4 == 39) {
                    hi3Var.readByte();
                    g();
                    throw null;
                }
                if (P4 != 125) {
                    g();
                    throw null;
                }
                if (i4 == 5) {
                    F0("Expected name");
                    throw null;
                }
                hi3Var.readByte();
                this.g = 2;
                return 2;
            }
            if (i4 == 4) {
                iArr[i3] = 5;
                int P5 = P(true);
                hi3Var.readByte();
                if (P5 != 58) {
                    if (P5 != 61) {
                        F0("Expected ':'");
                        throw null;
                    }
                    g();
                    throw null;
                }
            } else if (i4 == 6) {
                iArr[i3] = 7;
            } else {
                if (i4 == 7) {
                    if (P(false) == -1) {
                        this.g = 18;
                        return 18;
                    }
                    g();
                    throw null;
                }
                if (i4 == 9) {
                    throw null;
                }
                if (i4 == 8) {
                    xq0.q("JsonReader is closed");
                    return 0;
                }
            }
        }
        int P6 = P(true);
        if (P6 == 34) {
            hi3Var.readByte();
            this.g = 9;
            return 9;
        }
        if (P6 == 39) {
            g();
            throw null;
        }
        if (P6 != 44 && P6 != 59) {
            if (P6 == 91) {
                hi3Var.readByte();
                this.g = 3;
                return 3;
            }
            if (P6 != 93) {
                if (P6 == 123) {
                    hi3Var.readByte();
                    this.g = 1;
                    return 1;
                }
                byte P7 = hi3Var.P(0L);
                hi3 hi3Var2 = this.e;
                if (P7 == 116 || P7 == 84) {
                    i = 5;
                    str2 = PListParser.TAG_TRUE;
                    str = "TRUE";
                } else if (P7 == 102 || P7 == 70) {
                    i = 6;
                    str2 = PListParser.TAG_FALSE;
                    str = "FALSE";
                } else if (P7 == 110 || P7 == 78) {
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j = 0;
                    i = 0;
                    if (i == 0) {
                        return i;
                    }
                    boolean z = true;
                    long j2 = j;
                    char c2 = 0;
                    int i5 = 0;
                    boolean z2 = false;
                    while (true) {
                        int i6 = i5 + 1;
                        if (!hi3Var2.request(i6)) {
                            break;
                        }
                        byte P8 = hi3Var.P(i5);
                        if (P8 != 43) {
                            if (P8 == 69 || P8 == 101) {
                                c = 6;
                                if (c2 != 2 && c2 != 4) {
                                    break;
                                }
                                c2 = 5;
                                i5 = i6;
                            } else if (P8 == 45) {
                                c = 6;
                                if (c2 == 0) {
                                    c2 = 1;
                                    z2 = true;
                                    i5 = i6;
                                } else {
                                    if (c2 != 5) {
                                        break;
                                    }
                                    c2 = c;
                                    i5 = i6;
                                }
                            } else if (P8 == 46) {
                                c = 6;
                                if (c2 != 2) {
                                    break;
                                }
                                c2 = 3;
                                i5 = i6;
                            } else {
                                if (P8 < 48 || P8 > 57) {
                                    break;
                                }
                                if (c2 == 1 || c2 == 0) {
                                    c = 6;
                                    j2 = -(P8 - 48);
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - (P8 - 48);
                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                        j2 = j3;
                                    } else if (c2 == 3) {
                                        c2 = 4;
                                    } else {
                                        c = 6;
                                        if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                    }
                                    c = 6;
                                    i5 = i6;
                                }
                                i5 = i6;
                            }
                            if (i2 == 0) {
                                return i2;
                            }
                            if (N(hi3Var.P(j))) {
                                g();
                                throw null;
                            }
                            F0("Expected value");
                            throw null;
                        }
                        c = 6;
                        if (c2 != 5) {
                            break;
                        }
                        c2 = c;
                        i5 = i6;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                    }
                }
                int length = str2.length();
                j = 0;
                int i7 = 1;
                while (true) {
                    if (i7 < length) {
                        int i8 = i7 + 1;
                        if (!hi3Var2.request(i8) || ((P = hi3Var.P(i7)) != str2.charAt(i7) && P != str.charAt(i7))) {
                            break;
                        }
                        i7 = i8;
                    } else if (!hi3Var2.request(length + 1) || !N(hi3Var.P(length))) {
                        hi3Var.skip(length);
                        this.g = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i4 == 1) {
                hi3Var.readByte();
                this.g = 4;
                return 4;
            }
        }
        if (i4 == 1 || i4 == 2) {
            g();
            throw null;
        }
        F0("Unexpected value");
        throw null;
    }

    public final int peek() {
        int i = this.g;
        if (i == 0) {
            i = o();
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                wvs.b();
                return 0;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.e + ")";
    }

    public final void u0() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i != 7) {
            b6e.k(f1d.w(peek()), getPath(), "Expected null but was ");
            return;
        }
        this.g = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void w() {
        int i = 0;
        do {
            int i2 = this.g;
            if (i2 == 0) {
                i2 = o();
            }
            if (i2 == 3) {
                S(1);
            } else if (i2 == 1) {
                S(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        b6e.k(f1d.w(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        b6e.k(f1d.w(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else {
                    hi3 hi3Var = this.f;
                    if (i2 == 14 || i2 == 10) {
                        long C = this.e.C(m);
                        if (C == -1) {
                            C = hi3Var.b;
                        }
                        hi3Var.skip(C);
                    } else if (i2 == 9 || i2 == 13) {
                        l0(l);
                    } else if (i2 == 8 || i2 == 12) {
                        l0(k);
                    } else if (i2 == 17) {
                        hi3Var.skip(this.i);
                    } else if (i2 == 18) {
                        b6e.k(f1d.w(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                }
                this.g = 0;
            }
            i++;
            this.g = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i3] = "null";
    }

    public final void z() {
        int i = this.g;
        if (i == 0) {
            i = o();
        }
        if (i != 4) {
            b6e.k(f1d.w(peek()), getPath(), "Expected END_ARRAY but was ");
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        int[] iArr = this.d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.g = 0;
    }
}
