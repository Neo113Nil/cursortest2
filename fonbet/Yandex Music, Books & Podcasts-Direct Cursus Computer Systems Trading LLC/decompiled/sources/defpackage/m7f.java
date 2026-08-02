package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.io.EOFException;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class m7f extends b7f {
    public static final pn3 l;
    public static final pn3 m;
    public static final pn3 n;
    public final ikn f;
    public final hi3 g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        pn3 pn3Var = pn3.d;
        l = ovn.C("'\\");
        m = ovn.C("\"\\");
        n = ovn.C("{}[]:, \n\t\r\f/\\;#=");
        ovn.C("\n\r");
        ovn.C("*/");
    }

    public m7f(ikn iknVar) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = iknVar;
        this.g = iknVar.b;
        z(6);
    }

    @Override // defpackage.b7f
    public final int D(j6e j6eVar) {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return Q(this.k, j6eVar);
        }
        int h0 = this.f.h0((qwj) j6eVar.b);
        if (h0 != -1) {
            this.h = 0;
            this.c[this.a - 1] = ((String[]) j6eVar.a)[h0];
            return h0;
        }
        String str = this.c[this.a - 1];
        String L = L();
        int Q = Q(L, j6eVar);
        if (Q == -1) {
            this.h = 15;
            this.k = L;
            this.c[this.a - 1] = str;
        }
        return Q;
    }

    @Override // defpackage.b7f
    public final void H() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            long C = this.f.C(n);
            hi3 hi3Var = this.g;
            if (C == -1) {
                C = hi3Var.b;
            }
            hi3Var.skip(C);
        } else if (i == 13) {
            l0(m);
        } else if (i == 12) {
            l0(l);
        } else if (i != 15) {
            b6e.t(f1d.x(peek()), getPath(), "Expected a name but was ");
            return;
        }
        this.h = 0;
        this.c[this.a - 1] = "null";
    }

    public final String L() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 14) {
            str = Y();
        } else if (i == 13) {
            str = X(m);
        } else if (i == 12) {
            str = X(l);
        } else {
            if (i != 15) {
                b6e.t(f1d.x(peek()), getPath(), "Expected a name but was ");
                return null;
            }
            str = this.k;
        }
        this.h = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    public final void N() {
        I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.j = r2;
        r9 = 17;
        r22.h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (R(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P() {
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
        hi3 hi3Var = this.g;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else if (i4 == 2) {
            int S = S(true);
            hi3Var.readByte();
            if (S != 44) {
                if (S == 59) {
                    N();
                    throw null;
                }
                if (S == 93) {
                    this.h = 4;
                    return 4;
                }
                I("Unterminated array");
                throw null;
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3] = 4;
                if (i4 == 5) {
                    int S2 = S(true);
                    hi3Var.readByte();
                    if (S2 != 44) {
                        if (S2 == 59) {
                            N();
                            throw null;
                        }
                        if (S2 == 125) {
                            this.h = 2;
                            return 2;
                        }
                        I("Unterminated object");
                        throw null;
                    }
                }
                int S3 = S(true);
                if (S3 == 34) {
                    hi3Var.readByte();
                    this.h = 13;
                    return 13;
                }
                if (S3 == 39) {
                    hi3Var.readByte();
                    N();
                    throw null;
                }
                if (S3 != 125) {
                    N();
                    throw null;
                }
                if (i4 == 5) {
                    I("Expected name");
                    throw null;
                }
                hi3Var.readByte();
                this.h = 2;
                return 2;
            }
            if (i4 == 4) {
                iArr[i3] = 5;
                int S4 = S(true);
                hi3Var.readByte();
                if (S4 != 58) {
                    if (S4 != 61) {
                        I("Expected ':'");
                        throw null;
                    }
                    N();
                    throw null;
                }
            } else if (i4 == 6) {
                iArr[i3] = 7;
            } else {
                if (i4 == 7) {
                    if (S(false) == -1) {
                        this.h = 18;
                        return 18;
                    }
                    N();
                    throw null;
                }
                if (i4 == 8) {
                    xq0.q("JsonReader is closed");
                    return 0;
                }
            }
        }
        int S5 = S(true);
        if (S5 == 34) {
            hi3Var.readByte();
            this.h = 9;
            return 9;
        }
        if (S5 == 39) {
            N();
            throw null;
        }
        if (S5 != 44 && S5 != 59) {
            if (S5 == 91) {
                hi3Var.readByte();
                this.h = 3;
                return 3;
            }
            if (S5 != 93) {
                if (S5 == 123) {
                    hi3Var.readByte();
                    this.h = 1;
                    return 1;
                }
                byte P2 = hi3Var.P(0L);
                ikn iknVar = this.f;
                if (P2 == 116 || P2 == 84) {
                    i = 5;
                    str2 = PListParser.TAG_TRUE;
                    str = "TRUE";
                } else if (P2 == 102 || P2 == 70) {
                    i = 6;
                    str2 = PListParser.TAG_FALSE;
                    str = "FALSE";
                } else if (P2 == 110 || P2 == 78) {
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
                        if (!iknVar.request(i6)) {
                            break;
                        }
                        byte P3 = hi3Var.P(i5);
                        if (P3 != 43) {
                            if (P3 == 69 || P3 == 101) {
                                c = 6;
                                if (c2 != 2 && c2 != 4) {
                                    break;
                                }
                                c2 = 5;
                                i5 = i6;
                            } else if (P3 == 45) {
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
                            } else if (P3 == 46) {
                                c = 6;
                                if (c2 != 2) {
                                    break;
                                }
                                c2 = 3;
                                i5 = i6;
                            } else {
                                if (P3 < 48 || P3 > 57) {
                                    break;
                                }
                                if (c2 == 1 || c2 == 0) {
                                    c = 6;
                                    j2 = -(P3 - 48);
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - (P3 - 48);
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
                            if (R(hi3Var.P(j))) {
                                N();
                                throw null;
                            }
                            I("Expected value");
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
                        if (!iknVar.request(i8) || ((P = hi3Var.P(i7)) != str2.charAt(i7) && P != str.charAt(i7))) {
                            break;
                        }
                        i7 = i8;
                    } else if (!iknVar.request(length + 1) || !R(hi3Var.P(length))) {
                        hi3Var.skip(length);
                        this.h = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i4 == 1) {
                hi3Var.readByte();
                this.h = 4;
                return 4;
            }
        }
        if (i4 == 1 || i4 == 2) {
            N();
            throw null;
        }
        I("Unexpected value");
        throw null;
    }

    public final int Q(String str, j6e j6eVar) {
        int length = ((String[]) j6eVar.a).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) j6eVar.a)[i])) {
                this.h = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean R(int i) {
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
        N();
        throw null;
    }

    public final int S(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            ikn iknVar = this.f;
            if (!iknVar.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            hi3 hi3Var = this.g;
            byte P = hi3Var.P(j);
            if (P != 10 && P != 32 && P != 13 && P != 9) {
                hi3Var.skip(j);
                if (P == 47) {
                    if (iknVar.request(2L)) {
                        N();
                        throw null;
                    }
                } else if (P == 35) {
                    N();
                    throw null;
                }
                return P;
            }
            i = i2;
        }
    }

    public final String X(pn3 pn3Var) {
        StringBuilder sb = null;
        while (true) {
            long C = this.f.C(pn3Var);
            if (C == -1) {
                I("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.g;
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
            sb.append(j0());
        }
    }

    public final String Y() {
        long C = this.f.C(n);
        hi3 hi3Var = this.g;
        if (C == -1) {
            return hi3Var.G0();
        }
        hi3Var.getClass();
        return hi3Var.F0(C, Charsets.UTF_8);
    }

    @Override // defpackage.b7f
    public final void a() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i != 3) {
            b6e.t(f1d.x(peek()), getPath(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        z(1);
        this.d[this.a - 1] = 0;
        this.h = 0;
    }

    @Override // defpackage.b7f
    public final void b() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i != 1) {
            b6e.t(f1d.x(peek()), getPath(), "Expected BEGIN_OBJECT but was ");
        } else {
            z(3);
            this.h = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.b();
        this.f.close();
    }

    @Override // defpackage.b7f
    public final String f0() {
        String F0;
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 10) {
            F0 = Y();
        } else if (i == 9) {
            F0 = X(m);
        } else if (i == 8) {
            F0 = X(l);
        } else if (i == 11) {
            F0 = this.k;
            this.k = null;
        } else if (i == 16) {
            F0 = Long.toString(this.i);
        } else {
            if (i != 17) {
                b6e.t(f1d.x(peek()), getPath(), "Expected a string but was ");
                return null;
            }
            long j = this.j;
            hi3 hi3Var = this.g;
            hi3Var.getClass();
            F0 = hi3Var.F0(j, Charsets.UTF_8);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return F0;
    }

    @Override // defpackage.b7f
    public final void g() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i != 4) {
            b6e.t(f1d.x(peek()), getPath(), "Expected END_ARRAY but was ");
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        int[] iArr = this.d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // defpackage.b7f
    public final boolean hasNext() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final char j0() {
        int i;
        ikn iknVar = this.f;
        if (!iknVar.request(1L)) {
            I("Unterminated escape sequence");
            throw null;
        }
        hi3 hi3Var = this.g;
        byte readByte = hi3Var.readByte();
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
            I("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!iknVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(getPath()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte P = hi3Var.P(i2);
            char c2 = (char) (c << 4);
            if (P >= 48 && P <= 57) {
                i = P - 48;
            } else if (P >= 97 && P <= 102) {
                i = P - 87;
            } else {
                if (P < 65 || P > 70) {
                    I("\\u".concat(hi3Var.F0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = P - 55;
            }
            c = (char) (i + c2);
        }
        hi3Var.skip(4L);
        return c;
    }

    public final void l0(pn3 pn3Var) {
        while (true) {
            long C = this.f.C(pn3Var);
            if (C == -1) {
                I("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.g;
            if (hi3Var.P(C) != 92) {
                hi3Var.skip(C + 1);
                return;
            } else {
                hi3Var.skip(C + 1);
                j0();
            }
        }
    }

    @Override // defpackage.b7f
    public final boolean nextBoolean() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            b6e.t(f1d.x(peek()), getPath(), "Expected a boolean but was ");
            return false;
        }
        this.h = 0;
        int[] iArr2 = this.d;
        int i3 = this.a - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // defpackage.b7f
    public final double nextDouble() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 17) {
            long j = this.j;
            hi3 hi3Var = this.g;
            hi3Var.getClass();
            this.k = hi3Var.F0(j, Charsets.UTF_8);
        } else if (i == 9) {
            this.k = X(m);
        } else if (i == 8) {
            this.k = X(l);
        } else if (i == 10) {
            this.k = Y();
        } else if (i != 11) {
            b6e.t(f1d.x(peek()), getPath(), "Expected a double but was ");
            return 0.0d;
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new pg5("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            b6e.t(this.k, getPath(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // defpackage.b7f
    public final int nextInt() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i == 16) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new wp3("Expected an int but was " + this.i + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.j;
            hi3 hi3Var = this.g;
            hi3Var.getClass();
            this.k = hi3Var.F0(j2, Charsets.UTF_8);
        } else if (i == 9 || i == 8) {
            String X = i == 9 ? X(m) : X(l);
            this.k = X;
            try {
                int parseInt = Integer.parseInt(X);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            b6e.t(f1d.x(peek()), getPath(), "Expected an int but was ");
            return 0;
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                b6e.t(this.k, getPath(), "Expected an int but was ");
                return 0;
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            b6e.t(this.k, getPath(), "Expected an int but was ");
            return 0;
        }
    }

    @Override // defpackage.b7f
    public final void o() {
        int i = this.h;
        if (i == 0) {
            i = P();
        }
        if (i != 2) {
            b6e.t(f1d.x(peek()), getPath(), "Expected END_OBJECT but was ");
            return;
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.h = 0;
    }

    @Override // defpackage.b7f
    public final int peek() {
        int i = this.h;
        if (i == 0) {
            i = P();
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
        return "JsonReader(" + this.f + ")";
    }

    @Override // defpackage.b7f
    public final void w() {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = P();
            }
            if (i2 == 3) {
                z(1);
            } else if (i2 == 1) {
                z(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        b6e.t(f1d.x(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        b6e.t(f1d.x(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else {
                    hi3 hi3Var = this.g;
                    if (i2 == 14 || i2 == 10) {
                        long C = this.f.C(n);
                        if (C == -1) {
                            C = hi3Var.b;
                        }
                        hi3Var.skip(C);
                    } else if (i2 == 9 || i2 == 13) {
                        l0(m);
                    } else if (i2 == 8 || i2 == 12) {
                        l0(l);
                    } else if (i2 == 17) {
                        hi3Var.skip(this.j);
                    } else if (i2 == 18) {
                        b6e.t(f1d.x(peek()), getPath(), "Expected a value but was ");
                        return;
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i3] = "null";
    }
}
