package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class jj3 implements a7f {
    public static final pn3 m;
    public static final pn3 n;
    public static final pn3 o;
    public final ij3 a;
    public final hi3 b;
    public int c;
    public long d;
    public int e;
    public String f;
    public final int[] g;
    public int h;
    public final String[] i;
    public final int[] j;
    public final int[] k;
    public int l;

    static {
        pn3 pn3Var = pn3.d;
        m = ovn.C("'\\");
        n = ovn.C("\"\\");
        o = ovn.C("{}[]:, \n\t\r/\\;#=");
    }

    public jj3(ij3 ij3Var) {
        ij3Var.getClass();
        this.a = ij3Var;
        this.b = ij3Var.h();
        int[] iArr = new int[256];
        iArr[0] = 6;
        this.g = iArr;
        this.h = 1;
        this.i = new String[256];
        this.j = new int[256];
        int[] iArr2 = new int[256];
        iArr2[0] = 0;
        this.k = iArr2;
        this.l = 1;
    }

    public final String D() {
        long C = this.a.C(o);
        hi3 hi3Var = this.b;
        if (C == -1) {
            return hi3Var.G0();
        }
        hi3Var.getClass();
        return hi3Var.F0(C, Charsets.UTF_8);
    }

    public final void H(int i) {
        int i2 = this.h;
        int[] iArr = this.g;
        if (i2 != iArr.length) {
            this.h = i2 + 1;
            iArr[i2] = i;
        } else {
            throw new lp0("Nesting too deep at " + getPath(), null);
        }
    }

    public final char I() {
        int i;
        ij3 ij3Var = this.a;
        if (!ij3Var.request(1L)) {
            P("Unterminated escape sequence");
            throw null;
        }
        hi3 hi3Var = this.b;
        char readByte = (char) hi3Var.readByte();
        if (readByte != 'u') {
            if (readByte == 't') {
                return '\t';
            }
            if (readByte == 'b') {
                return '\b';
            }
            if (readByte == 'n') {
                return '\n';
            }
            if (readByte == 'r') {
                return '\r';
            }
            if (readByte == 'f') {
                return '\f';
            }
            if (readByte == '\n' || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/') {
                return readByte;
            }
            P("Invalid escape sequence: \\" + readByte);
            throw null;
        }
        if (!ij3Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
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
                    P("\\u".concat(hi3Var.F0(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = P - 55;
            }
            c = (char) (c2 + i);
        }
        hi3Var.skip(4L);
        return c;
    }

    @Override // defpackage.a7f
    public final String L() {
        String z;
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 12:
                z = z(m);
                break;
            case 13:
                z = z(n);
                break;
            case 14:
                z = D();
                break;
            default:
                b6e.x(f1d.v(peek()), b(), "Expected a name but was ");
                return null;
        }
        this.c = 0;
        this.i[this.h - 1] = z;
        return z;
    }

    public final void N(pn3 pn3Var) {
        while (true) {
            long C = this.a.C(pn3Var);
            if (C == -1) {
                P("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.b;
            if (hi3Var.P(C) != 92) {
                hi3Var.skip(C + 1);
                return;
            } else {
                hi3Var.skip(C + 1);
                I();
            }
        }
    }

    public final void P(String str) {
        StringBuilder m2 = tlm.m(str, " at path ");
        m2.append(getPath());
        throw new lp0(m2.toString(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        String str;
        String str2;
        long j;
        int i;
        byte P;
        long j2;
        hi3 hi3Var;
        char c;
        hi3 hi3Var2;
        int i2;
        char c2;
        hi3 hi3Var3;
        char c3;
        int i3 = this.h - 1;
        int[] iArr = this.g;
        int i4 = iArr[i3];
        char c4 = 5;
        hi3 hi3Var4 = this.b;
        switch (i4) {
            case 1:
                iArr[i3] = 2;
                break;
            case 2:
                int o2 = o(true);
                hi3Var4.readByte();
                char c5 = (char) o2;
                if (c5 == ']') {
                    this.c = 4;
                    return 4;
                }
                if (c5 != ',') {
                    P("Unterminated array");
                    throw null;
                }
                break;
            case 3:
            case 5:
                iArr[i3] = 4;
                if (i4 == 5) {
                    int o3 = o(true);
                    hi3Var4.readByte();
                    char c6 = (char) o3;
                    if (c6 == '}') {
                        this.c = 2;
                        return 2;
                    }
                    if (c6 != ',') {
                        P("Unterminated object");
                        throw null;
                    }
                }
                char o4 = (char) o(true);
                if (o4 == '\"') {
                    hi3Var4.readByte();
                    this.c = 13;
                    return 13;
                }
                if (o4 != '}') {
                    P("Unexpected character: " + o4);
                    throw null;
                }
                if (i4 == 5) {
                    P("Expected name");
                    throw null;
                }
                hi3Var4.readByte();
                this.c = 2;
                return 2;
            case 4:
                iArr[i3] = 5;
                int o5 = o(true);
                hi3Var4.readByte();
                if (((char) o5) != ':') {
                    P("Expected ':'");
                    throw null;
                }
                break;
            case 6:
                iArr[i3] = 7;
                break;
            case 7:
                if (o(false) == -1) {
                    this.c = 17;
                    return 17;
                }
                P("Malformed JSON");
                throw null;
            default:
                if (i4 == 8) {
                    xq0.q("JsonReader is closed");
                    return 0;
                }
                break;
        }
        char o6 = (char) o(true);
        if (o6 == ']') {
            if (i4 != 1) {
                P("Unexpected value");
                throw null;
            }
            hi3Var4.readByte();
            this.c = 4;
            return 4;
        }
        if (o6 == ';' || o6 == ',' || o6 == '\'') {
            P("Unexpected value");
            throw null;
        }
        if (o6 == '\"') {
            hi3Var4.readByte();
            this.c = 9;
            return 9;
        }
        if (o6 == '[') {
            hi3Var4.readByte();
            this.c = 3;
            return 3;
        }
        if (o6 == '{') {
            hi3Var4.readByte();
            this.c = 1;
            return 1;
        }
        byte P2 = hi3Var4.P(0L);
        ij3 ij3Var = this.a;
        if (P2 == 116 || P2 == 84) {
            str = PListParser.TAG_TRUE;
            str2 = "TRUE";
            j = 0;
            i = 5;
        } else if (P2 == 102 || P2 == 70) {
            str = PListParser.TAG_FALSE;
            str2 = "FALSE";
            j = 0;
            i = 6;
        } else if (P2 == 110 || P2 == 78) {
            str = "null";
            str2 = "NULL";
            j = 0;
            i = 7;
        } else {
            j = 0;
            i = 0;
            if (i == 0) {
                return i;
            }
            boolean z = true;
            long j3 = j;
            int i5 = 0;
            char c7 = 0;
            boolean z2 = false;
            while (true) {
                j2 = i5;
                char c8 = c7;
                if (ij3Var.request(j2 + 1)) {
                    byte P3 = hi3Var4.P(j2);
                    c2 = (char) P3;
                    if (c2 != '-') {
                        c = c8;
                        if (c2 != '+') {
                            if (c2 == 'e' || c2 == 'E') {
                                if (c == 2 || c == 4) {
                                    c3 = c4;
                                    c = c3;
                                    hi3Var3 = hi3Var4;
                                    i5++;
                                    c4 = c3;
                                    c7 = c;
                                    hi3Var4 = hi3Var3;
                                }
                            } else if (c2 == '.') {
                                if (c == 2) {
                                    hi3Var3 = hi3Var4;
                                    c3 = 5;
                                    c = 3;
                                    i5++;
                                    c4 = c3;
                                    c7 = c;
                                    hi3Var4 = hi3Var3;
                                }
                            } else if (P3 >= 48 && P3 <= 57) {
                                if (c == 0 || c == 1) {
                                    hi3Var3 = hi3Var4;
                                    c3 = 5;
                                    j3 = -(P3 - 48);
                                    c = 2;
                                } else if (c == 2) {
                                    c3 = 5;
                                    if (j3 != j) {
                                        hi3Var3 = hi3Var4;
                                        long j4 = (10 * j3) - (P3 - 48);
                                        z = (z && ((j3 > (-922337203685477580L) ? 1 : (j3 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j3 == -922337203685477580L && j4 < j3);
                                        j3 = j4;
                                    }
                                } else if (c != 3) {
                                    c3 = 5;
                                    if (c == 5 || c == 6) {
                                        hi3Var3 = hi3Var4;
                                        c = 7;
                                    }
                                    hi3Var3 = hi3Var4;
                                } else {
                                    c3 = 5;
                                    hi3Var3 = hi3Var4;
                                    c = 4;
                                }
                                i5++;
                                c4 = c3;
                                c7 = c;
                                hi3Var4 = hi3Var3;
                            }
                            if (i2 == 0) {
                                return i2;
                            }
                            if (g((char) hi3Var2.P(j))) {
                                P("Malformed JSON");
                                throw null;
                            }
                            P("Expected value");
                            throw null;
                        }
                        if (c != c4) {
                        }
                        c3 = c4;
                        hi3Var3 = hi3Var4;
                        c = 6;
                        i5++;
                        c4 = c3;
                        c7 = c;
                        hi3Var4 = hi3Var3;
                    } else if (c8 != 0) {
                        if (c8 != c4) {
                        }
                        c3 = c4;
                        hi3Var3 = hi3Var4;
                        c = 6;
                        i5++;
                        c4 = c3;
                        c7 = c;
                        hi3Var4 = hi3Var3;
                    } else {
                        c3 = c4;
                        hi3Var3 = hi3Var4;
                        z2 = true;
                        c = 1;
                        i5++;
                        c4 = c3;
                        c7 = c;
                        hi3Var4 = hi3Var3;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                    }
                } else {
                    hi3Var = hi3Var4;
                    c = c8;
                }
            }
            hi3Var = hi3Var4;
            if (g(c2)) {
                hi3Var2 = hi3Var;
                i2 = 0;
                if (i2 == 0) {
                }
            }
            char c9 = 2;
            if (c != 2) {
                hi3Var2 = hi3Var;
            } else if (!z || (j3 == Long.MIN_VALUE && !z2)) {
                hi3Var2 = hi3Var;
                c9 = 2;
            } else {
                if (!z2) {
                    j3 = -j3;
                }
                this.d = j3;
                hi3Var2 = hi3Var;
                hi3Var2.skip(j2);
                i2 = 15;
                this.c = 15;
                if (i2 == 0) {
                }
            }
            if (c == c9 || c == 4 || c == 7) {
                this.e = i5;
                i2 = 16;
                this.c = 16;
                if (i2 == 0) {
                }
            }
            i2 = 0;
            if (i2 == 0) {
            }
        }
        int length = str.length();
        int i6 = 1;
        while (true) {
            if (i6 < length) {
                long j5 = i6;
                if (ij3Var.request(j5 + 1) && ((P = hi3Var4.P(j5)) == ((byte) str.charAt(i6)) || P == ((byte) str2.charAt(i6)))) {
                    i6++;
                }
            } else {
                long j6 = length;
                if (!ij3Var.request(j6 + 1) || !g((char) hi3Var4.P(j6))) {
                    hi3Var4.skip(j6);
                    this.c = i;
                }
            }
        }
        if (i == 0) {
        }
    }

    public final String b() {
        return CollectionsKt.X(getPath(), ".", null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.g[0] = 8;
        this.h = 1;
        this.b.b();
        this.a.close();
    }

    @Override // defpackage.a7f
    public final String f0() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        String str = null;
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            str = String.valueOf(this.d);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = z(m);
                    break;
                case 9:
                    str = z(n);
                    break;
                case 10:
                    str = D();
                    break;
                case 11:
                    String str2 = this.f;
                    if (str2 != null) {
                        this.f = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    b6e.x(f1d.v(peek()), b(), "Expected a string but was ");
                    return null;
            }
        } else {
            long j = this.e;
            hi3 hi3Var = this.b;
            hi3Var.getClass();
            str = hi3Var.F0(j, Charsets.UTF_8);
        }
        this.c = 0;
        int i2 = this.h - 1;
        int[] iArr = this.j;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean g(char c) {
        if (c != '/' && c != '\\' && c != ';' && c != '#' && c != '=') {
            return !(c == '{' || c == '}' || c == '[' || c == ']' || c == ':' || c == ',' || c == ' ' || c == '\t' || c == '\r' || c == '\n');
        }
        P("Unexpected character: " + c);
        throw null;
    }

    @Override // defpackage.a7f
    public final ArrayList getPath() {
        String str;
        int i = this.h;
        int[] iArr = this.g;
        iArr.getClass();
        String[] strArr = this.i;
        strArr.getClass();
        int[] iArr2 = this.j;
        iArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = strArr[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // defpackage.a7f
    public final boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // defpackage.a7f
    public final a7f j() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 1) {
            b6e.x(f1d.v(peek()), b(), "Expected BEGIN_OBJECT but was ");
            return null;
        }
        H(3);
        this.c = 0;
        int i2 = this.l;
        this.l = i2 + 1;
        this.k[i2] = 0;
        return this;
    }

    @Override // defpackage.a7f
    public final void k() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // defpackage.a7f
    public final a7f l() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 4) {
            b6e.x(f1d.v(peek()), b(), "Expected END_ARRAY but was ");
            return null;
        }
        int i2 = this.h;
        this.h = i2 - 1;
        int i3 = i2 - 2;
        int[] iArr = this.j;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
        return this;
    }

    @Override // defpackage.a7f
    public final a7f m() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 3) {
            b6e.x(f1d.v(peek()), b(), "Expected BEGIN_ARRAY but was ");
            return null;
        }
        H(1);
        this.j[this.h - 1] = 0;
        this.c = 0;
        return this;
    }

    @Override // defpackage.a7f
    public final boolean nextBoolean() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.j;
        if (intValue == 5) {
            this.c = 0;
            int i2 = this.h - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (intValue != 6) {
            b6e.x(f1d.v(peek()), b(), "Expected a boolean but was ");
            return false;
        }
        this.c = 0;
        int i3 = this.h - 1;
        iArr[i3] = iArr[i3] + 1;
        return false;
    }

    @Override // defpackage.a7f
    public final double nextDouble() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.j;
        if (intValue == 15) {
            this.c = 0;
            int i2 = this.h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.d;
        }
        if (intValue == 16) {
            long j = this.e;
            hi3 hi3Var = this.b;
            hi3Var.getClass();
            this.f = hi3Var.F0(j, Charsets.UTF_8);
        } else if (intValue == 9) {
            this.f = z(n);
        } else if (intValue == 8) {
            this.f = z(m);
        } else if (intValue == 10) {
            this.f = D();
        } else if (intValue != 11) {
            b6e.x(f1d.v(peek()), b(), "Expected a double but was ");
            return 0.0d;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double parseDouble = Double.parseDouble(str);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f = null;
                this.c = 0;
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
                return parseDouble;
            }
            throw new lp0("JSON forbids NaN and infinities: " + parseDouble + " at path " + b(), null);
        } catch (NumberFormatException unused) {
            b6e.x(this.f, b(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // defpackage.a7f
    public final int nextInt() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.j;
        if (intValue == 15) {
            long j = this.d;
            int i2 = (int) j;
            if (j == i2) {
                this.c = 0;
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new lp0("Expected an int but was " + this.d + " at path " + getPath(), null);
        }
        if (intValue == 16) {
            long j2 = this.e;
            hi3 hi3Var = this.b;
            hi3Var.getClass();
            this.f = hi3Var.F0(j2, Charsets.UTF_8);
        } else if (intValue == 9 || intValue == 8) {
            String z = z(intValue == 9 ? n : m);
            this.f = z;
            try {
                int parseInt = Integer.parseInt(z);
                this.c = 0;
                int i4 = this.h - 1;
                iArr[i4] = iArr[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            b6e.x(f1d.v(peek()), b(), "Expected an int but was ");
            return 0;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double parseDouble = Double.parseDouble(str);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                b6e.x(this.f, b(), "Expected an int but was ");
                return 0;
            }
            this.f = null;
            this.c = 0;
            int i6 = this.h - 1;
            iArr[i6] = iArr[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            b6e.x(this.f, b(), "Expected an int but was ");
            return 0;
        }
    }

    @Override // defpackage.a7f
    public final long nextLong() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.j;
        if (intValue == 15) {
            this.c = 0;
            int i2 = this.h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.d;
        }
        if (intValue == 16) {
            long j = this.e;
            hi3 hi3Var = this.b;
            hi3Var.getClass();
            this.f = hi3Var.F0(j, Charsets.UTF_8);
        } else if (intValue == 9 || intValue == 8) {
            String z = z(intValue == 9 ? n : m);
            this.f = z;
            try {
                long parseLong = Long.parseLong(z);
                this.c = 0;
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            b6e.x(f1d.v(peek()), b(), "Expected a long but was ");
            return 0L;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double parseDouble = Double.parseDouble(str);
            long j2 = (long) parseDouble;
            if (j2 != parseDouble) {
                b6e.x(this.f, b(), "Expected a long but was ");
                return 0L;
            }
            this.f = null;
            this.c = 0;
            int i4 = this.h - 1;
            iArr[i4] = iArr[i4] + 1;
            return j2;
        } catch (NumberFormatException unused2) {
            b6e.x(this.f, b(), "Expected a long but was ");
            return 0L;
        }
    }

    public final int o(boolean z) {
        int i = 0;
        while (true) {
            long j = i;
            ij3 ij3Var = this.a;
            if (!ij3Var.request(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            hi3 hi3Var = this.b;
            byte P = hi3Var.P(j);
            if (P != 9 && P != 10 && P != 13 && P != 32) {
                hi3Var.skip(i - 1);
                if (P == 35) {
                    P("Malformed JSON");
                    throw null;
                }
                if (P != 47 || !ij3Var.request(2L)) {
                    return P;
                }
                P("Malformed JSON");
                throw null;
            }
        }
    }

    @Override // defpackage.a7f
    public final a7f p() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 2) {
            b6e.x(f1d.v(peek()), b(), "Expected END_OBJECT but was ");
            return null;
        }
        int i2 = this.h;
        int i3 = i2 - 1;
        this.h = i3;
        this.i[i3] = null;
        int i4 = i2 - 2;
        int[] iArr = this.j;
        iArr[i4] = iArr[i4] + 1;
        this.c = 0;
        this.l--;
        return this;
    }

    @Override // defpackage.a7f
    public final int peek() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
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
                return 9;
            case 7:
                return 10;
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
                return 8;
            case 16:
                return 7;
            case 17:
                return 11;
            default:
                wvs.b();
                return 0;
        }
    }

    @Override // defpackage.a7f
    public final void u0() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 7) {
            b6e.x(f1d.v(peek()), b(), "Expected null but was ");
            return;
        }
        this.c = 0;
        int i2 = this.h - 1;
        int[] iArr = this.j;
        iArr[i2] = iArr[i2] + 1;
    }

    @Override // defpackage.a7f
    public final void w() {
        int i = 0;
        do {
            int i2 = this.c;
            Integer valueOf = Integer.valueOf(i2);
            if (i2 == 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : a();
            hi3 hi3Var = this.b;
            switch (intValue) {
                case 1:
                    H(3);
                    i++;
                    break;
                case 2:
                    this.h--;
                    i--;
                    break;
                case 3:
                    H(1);
                    i++;
                    break;
                case 4:
                    this.h--;
                    i--;
                    break;
                case 8:
                case 12:
                    N(m);
                    break;
                case 9:
                case 13:
                    N(n);
                    break;
                case 10:
                case 14:
                    long C = this.a.C(o);
                    if (C == -1) {
                        C = hi3Var.b;
                    }
                    hi3Var.skip(C);
                    break;
                case 16:
                    hi3Var.skip(this.e);
                    break;
            }
            this.c = 0;
        } while (i != 0);
        int i3 = this.h - 1;
        int[] iArr = this.j;
        iArr[i3] = iArr[i3] + 1;
        this.i[i3] = "null";
    }

    @Override // defpackage.a7f
    public final o5f y0() {
        String f0 = f0();
        f0.getClass();
        return new o5f(f0);
    }

    public final String z(pn3 pn3Var) {
        StringBuilder sb = null;
        while (true) {
            long C = this.a.C(pn3Var);
            if (C == -1) {
                P("Unterminated string");
                throw null;
            }
            hi3 hi3Var = this.b;
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
            sb.append(I());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        w();
     */
    @Override // defpackage.a7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String L = L();
            int i = this.l - 1;
            int[] iArr = this.k;
            int i2 = iArr[i];
            if (Intrinsics.d(list.get(i2), L)) {
                int i3 = this.l;
                iArr[i3 - 1] = i2 + 1;
                if (iArr[i3 - 1] == list.size()) {
                    iArr[this.l - 1] = 0;
                }
                return i2;
            }
            int i4 = i2;
            do {
                i4++;
                if (i4 == list.size()) {
                    i4 = 0;
                }
                if (i4 == i2) {
                    break;
                }
            } while (!Intrinsics.d(list.get(i4), L));
            int i5 = this.l;
            iArr[i5 - 1] = i4 + 1;
            if (iArr[i5 - 1] == list.size()) {
                iArr[this.l - 1] = 0;
            }
            return i4;
        }
        return -1;
    }
}
