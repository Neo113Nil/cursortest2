package defpackage;

import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class rq6 implements xdx {
    public static final ByteString F;
    public static final ByteString G;
    public static final ByteString H;
    public int A;
    public final String[] B;
    public final int[] C;
    public final int[] D;
    public int E;
    public final qq6 a;
    public final yp6 b;
    public int c;
    public long w;
    public int x;
    public String y;
    public final int[] z;

    static {
        ByteString byteString = new ByteString("'\\".getBytes(uza.a));
        byteString.b = "'\\";
        F = byteString;
        ByteString byteString2 = new ByteString("\"\\".getBytes(uza.a));
        byteString2.b = "\"\\";
        G = byteString2;
        ByteString byteString3 = new ByteString("{}[]:, \n\t\r/\\;#=".getBytes(uza.a));
        byteString3.b = "{}[]:, \n\t\r/\\;#=";
        H = byteString3;
    }

    public rq6(qq6 qq6Var) {
        this.a = qq6Var;
        this.b = qq6Var.h();
        int[] iArr = new int[256];
        iArr[0] = 6;
        this.z = iArr;
        this.A = 1;
        this.B = new String[256];
        this.C = new int[256];
        int[] iArr2 = new int[256];
        iArr2[0] = 0;
        this.D = iArr2;
        this.E = 1;
    }

    public final void B(String str) {
        StringBuilder v = oyr.v(str, " at path ");
        v.append(getPath());
        throw new JsonEncodingException(v.toString());
    }

    @Override // defpackage.xdx
    public final void B0() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            kbs.p(sb, c());
        } else {
            this.c = 0;
            int i2 = this.A - 1;
            int[] iArr = this.C;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.xdx
    public final hdx J0() {
        return new hdx(nextString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0240, code lost:
    
        if (d(r3) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0247, code lost:
    
        if (r13 != 2) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0249, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024f, code lost:
    
        if (r4 != Long.MIN_VALUE) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0251, code lost:
    
        if (r6 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0256, code lost:
    
        if (r6 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0259, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025a, code lost:
    
        r25.w = r4;
        r15.skip(r11);
        r11 = 15;
        r25.c = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0254, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0264, code lost:
    
        if (r13 == r10) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0267, code lost:
    
        if (r13 == 4) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026a, code lost:
    
        if (r13 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x026c, code lost:
    
        r25.x = r1;
        r11 = 16;
        r25.c = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        String str;
        String str2;
        long j;
        int i;
        byte e;
        char c;
        int i2;
        boolean z;
        char c2;
        char c3;
        int i3 = this.A - 1;
        int[] iArr = this.z;
        int i4 = iArr[i3];
        char c4 = 5;
        yp6 yp6Var = this.b;
        switch (i4) {
            case 1:
                iArr[i3] = 2;
                break;
            case 2:
                int e2 = e(true);
                yp6Var.readByte();
                char c5 = (char) e2;
                if (c5 == ']') {
                    this.c = 4;
                    return 4;
                }
                if (c5 != ',') {
                    B("Unterminated array");
                    throw null;
                }
                break;
            case 3:
            case 5:
                iArr[i3] = 4;
                if (i4 == 5) {
                    int e3 = e(true);
                    yp6Var.readByte();
                    char c6 = (char) e3;
                    if (c6 == '}') {
                        this.c = 2;
                        return 2;
                    }
                    if (c6 != ',') {
                        B("Unterminated object");
                        throw null;
                    }
                }
                char e4 = (char) e(true);
                if (e4 == '\"') {
                    yp6Var.readByte();
                    this.c = 13;
                    return 13;
                }
                if (e4 != '}') {
                    B("Unexpected character: " + e4);
                    throw null;
                }
                if (i4 == 5) {
                    B("Expected name");
                    throw null;
                }
                yp6Var.readByte();
                this.c = 2;
                return 2;
            case 4:
                iArr[i3] = 5;
                int e5 = e(true);
                yp6Var.readByte();
                if (((char) e5) != ':') {
                    B("Expected ':'");
                    throw null;
                }
                break;
            case 6:
                iArr[i3] = 7;
                break;
            case 7:
                if (e(false) == -1) {
                    this.c = 17;
                    return 17;
                }
                B("Malformed JSON");
                throw null;
            default:
                if (i4 == 8) {
                    ny61.r("JsonReader is closed");
                    return 0;
                }
                break;
        }
        char e6 = (char) e(true);
        if (e6 == ']') {
            if (i4 != 1) {
                B("Unexpected value");
                throw null;
            }
            yp6Var.readByte();
            this.c = 4;
            return 4;
        }
        if (e6 == ';' || e6 == ',' || e6 == '\'') {
            B("Unexpected value");
            throw null;
        }
        if (e6 == '\"') {
            yp6Var.readByte();
            this.c = 9;
            return 9;
        }
        if (e6 == '[') {
            yp6Var.readByte();
            this.c = 3;
            return 3;
        }
        if (e6 == '{') {
            yp6Var.readByte();
            this.c = 1;
            return 1;
        }
        byte e7 = yp6Var.e(0L);
        qq6 qq6Var = this.a;
        if (e7 == 116 || e7 == 84) {
            str = "true";
            str2 = "TRUE";
            j = 0;
            i = 5;
        } else if (e7 == 102 || e7 == 70) {
            str = "false";
            str2 = "FALSE";
            j = 0;
            i = 6;
        } else if (e7 == 110 || e7 == 78) {
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
            boolean z2 = true;
            long j2 = j;
            int i5 = 0;
            char c7 = 0;
            boolean z3 = false;
            while (true) {
                long j3 = i5;
                char c8 = c7;
                if (qq6Var.S(j3 + 1)) {
                    byte e8 = yp6Var.e(j3);
                    char c9 = (char) e8;
                    if (c9 != '-') {
                        c = c8;
                        if (c9 == '+') {
                            if (c != c4) {
                            }
                            c2 = c4;
                            z = true;
                            c3 = 6;
                            i5++;
                            c4 = c2;
                            c7 = c3;
                        } else if (c9 == 'e' || c9 == 'E') {
                            if (c == 2 || c == 4) {
                                c2 = c4;
                                c3 = c2;
                                z = true;
                                i5++;
                                c4 = c2;
                                c7 = c3;
                            }
                        } else if (c9 == '.') {
                            if (c == 2) {
                                c2 = 5;
                                z = true;
                                c3 = 3;
                                i5++;
                                c4 = c2;
                                c7 = c3;
                            }
                        } else if (e8 >= 48 && e8 <= 57) {
                            z = true;
                            if (c == 0 || c == 1) {
                                c2 = 5;
                                j2 = -(e8 - 48);
                                c3 = 2;
                            } else {
                                if (c == 2) {
                                    c2 = 5;
                                    if (j2 != j) {
                                        long j4 = (10 * j2) - (e8 - 48);
                                        z2 = (z2 && ((j2 > (-922337203685477580L) ? 1 : (j2 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j2 == -922337203685477580L && j4 < j2);
                                        j2 = j4;
                                    }
                                } else if (c != 3) {
                                    c2 = 5;
                                    if (c == 5 || c == 6) {
                                        c3 = 7;
                                    }
                                } else {
                                    c2 = 5;
                                    c3 = 4;
                                }
                                c3 = c;
                            }
                            i5++;
                            c4 = c2;
                            c7 = c3;
                        }
                    } else if (c8 != 0) {
                        if (c8 != c4) {
                        }
                        c2 = c4;
                        z = true;
                        c3 = 6;
                        i5++;
                        c4 = c2;
                        c7 = c3;
                    } else {
                        c2 = c4;
                        z3 = true;
                        z = true;
                        c3 = 1;
                        i5++;
                        c4 = c2;
                        c7 = c3;
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    if (d((char) yp6Var.e(j))) {
                        B("Malformed JSON");
                        throw null;
                    }
                    B("Expected value");
                    throw null;
                }
                c = c8;
            }
        }
        int length = str.length();
        int i6 = 1;
        while (true) {
            if (i6 < length) {
                long j5 = i6;
                if (qq6Var.S(j5 + 1) && ((e = yp6Var.e(j5)) == ((byte) str.charAt(i6)) || e == ((byte) str2.charAt(i6)))) {
                    i6++;
                }
            } else {
                long j6 = length;
                if (!qq6Var.S(j6 + 1) || !d((char) yp6Var.e(j6))) {
                    yp6Var.skip(j6);
                    this.c = i;
                }
            }
        }
        if (i == 0) {
        }
    }

    public final String c() {
        return a.X(getPath(), Extension.DOT_CHAR, null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.z[0] = 8;
        this.A = 1;
        this.b.clear();
        this.a.close();
    }

    public final boolean d(char c) {
        if (c != '/' && c != '\\' && c != ';' && c != '#' && c != '=') {
            return !(c == '{' || c == '}' || c == '[' || c == ']' || c == ':' || c == ',' || c == ' ' || c == '\t' || c == '\r' || c == '\n');
        }
        B("Unexpected character: " + c);
        throw null;
    }

    public final int e(boolean z) {
        int i = 0;
        while (true) {
            long j = i;
            qq6 qq6Var = this.a;
            if (!qq6Var.S(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            yp6 yp6Var = this.b;
            byte e = yp6Var.e(j);
            if (e != 9 && e != 10 && e != 13 && e != 32) {
                yp6Var.skip(i - 1);
                if (e == 35) {
                    B("Malformed JSON");
                    throw null;
                }
                if (e != 47 || !qq6Var.S(2L)) {
                    return e;
                }
                B("Malformed JSON");
                throw null;
            }
        }
    }

    @Override // defpackage.xdx
    public final ArrayList getPath() {
        String str;
        int i = this.A;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.z[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(this.C[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = this.B[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        skipValue();
     */
    @Override // defpackage.xdx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h2(List list) {
        if (list.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String nextName = nextName();
            int i = this.E - 1;
            int[] iArr = this.D;
            int i2 = iArr[i];
            if (jl40.l(list.get(i2), nextName)) {
                int i3 = this.E;
                iArr[i3 - 1] = i2 + 1;
                if (iArr[i3 - 1] == list.size()) {
                    iArr[this.E - 1] = 0;
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
            } while (!jl40.l(list.get(i4), nextName));
            int i5 = this.E;
            iArr[i5 - 1] = i4 + 1;
            if (iArr[i5 - 1] == list.size()) {
                iArr[this.E - 1] = 0;
            }
            return i4;
        }
        return -1;
    }

    @Override // defpackage.xdx
    public final boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    @Override // defpackage.xdx
    public final xdx j() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return null;
        }
        int i2 = this.A;
        this.A = i2 - 1;
        int i3 = i2 - 2;
        int[] iArr = this.C;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
        return this;
    }

    public final String k(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long K = this.a.K(byteString);
            if (K == -1) {
                B("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.b;
            if (yp6Var.e(K) != 92) {
                if (sb == null) {
                    String T = yp6Var.T(K, uza.a);
                    yp6Var.readByte();
                    return T;
                }
                sb.append(yp6Var.T(K, uza.a));
                yp6Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(yp6Var.T(K, uza.a));
            yp6Var.readByte();
            sb.append(v());
        }
    }

    @Override // defpackage.xdx
    public final xdx l() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 3) {
            o(1);
            this.C[this.A - 1] = 0;
            this.c = 0;
            return this;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        kbs.p(sb, c());
        return null;
    }

    public final String n() {
        long K = this.a.K(H);
        yp6 yp6Var = this.b;
        if (K == -1) {
            return yp6Var.I0();
        }
        yp6Var.getClass();
        return yp6Var.T(K, uza.a);
    }

    @Override // defpackage.xdx
    public final boolean nextBoolean() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.C;
        if (intValue == 5) {
            this.c = 0;
            int i2 = this.A - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (intValue == 6) {
            this.c = 0;
            int i3 = this.A - 1;
            iArr[i3] = iArr[i3] + 1;
            return false;
        }
        StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(peek());
        kbs.p(sb, c());
        return false;
    }

    @Override // defpackage.xdx
    public final double nextDouble() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.C;
        if (intValue == 15) {
            this.c = 0;
            int i2 = this.A - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.w;
        }
        if (intValue == 16) {
            long j = this.x;
            yp6 yp6Var = this.b;
            yp6Var.getClass();
            this.y = yp6Var.T(j, uza.a);
        } else if (intValue == 9) {
            this.y = k(G);
        } else if (intValue == 8) {
            this.y = k(F);
        } else if (intValue == 10) {
            this.y = n();
        } else if (intValue != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return 0.0d;
        }
        this.c = 11;
        try {
            double parseDouble = Double.parseDouble(this.y);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder u = oyr.u(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
                u.append(c());
                throw new JsonEncodingException(u.toString());
            }
            this.y = null;
            this.c = 0;
            int i3 = this.A - 1;
            iArr[i3] = iArr[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            xfo.i("Expected a double but was ", this.y, c());
            return 0.0d;
        }
    }

    @Override // defpackage.xdx
    public final int nextInt() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.C;
        if (intValue == 15) {
            long j = this.w;
            int i2 = (int) j;
            if (j == i2) {
                this.c = 0;
                int i3 = this.A - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.w + " at path " + getPath());
        }
        if (intValue == 16) {
            long j2 = this.x;
            yp6 yp6Var = this.b;
            yp6Var.getClass();
            this.y = yp6Var.T(j2, uza.a);
        } else if (intValue == 9 || intValue == 8) {
            String k = k(intValue == 9 ? G : F);
            this.y = k;
            try {
                int parseInt = Integer.parseInt(k);
                this.c = 0;
                int i4 = this.A - 1;
                iArr[i4] = iArr[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return 0;
        }
        this.c = 11;
        try {
            double parseDouble = Double.parseDouble(this.y);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                xfo.i("Expected an int but was ", this.y, c());
                return 0;
            }
            this.y = null;
            this.c = 0;
            int i6 = this.A - 1;
            iArr[i6] = iArr[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            xfo.i("Expected an int but was ", this.y, c());
            return 0;
        }
    }

    @Override // defpackage.xdx
    public final long nextLong() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.C;
        if (intValue == 15) {
            this.c = 0;
            int i2 = this.A - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.w;
        }
        if (intValue == 16) {
            long j = this.x;
            yp6 yp6Var = this.b;
            yp6Var.getClass();
            this.y = yp6Var.T(j, uza.a);
        } else if (intValue == 9 || intValue == 8) {
            String k = k(intValue == 9 ? G : F);
            this.y = k;
            try {
                long parseLong = Long.parseLong(k);
                this.c = 0;
                int i3 = this.A - 1;
                iArr[i3] = iArr[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return 0L;
        }
        this.c = 11;
        try {
            double parseDouble = Double.parseDouble(this.y);
            long j2 = (long) parseDouble;
            if (j2 != parseDouble) {
                xfo.i("Expected a long but was ", this.y, c());
                return 0L;
            }
            this.y = null;
            this.c = 0;
            int i4 = this.A - 1;
            iArr[i4] = iArr[i4] + 1;
            return j2;
        } catch (NumberFormatException unused2) {
            xfo.i("Expected a long but was ", this.y, c());
            return 0L;
        }
    }

    @Override // defpackage.xdx
    public final String nextName() {
        String k;
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 12:
                k = k(F);
                break;
            case 13:
                k = k(G);
                break;
            case 14:
                k = n();
                break;
            default:
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                kbs.p(sb, c());
                return null;
        }
        this.c = 0;
        this.B[this.A - 1] = k;
        return k;
    }

    @Override // defpackage.xdx
    public final String nextString() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        String str = null;
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            str = String.valueOf(this.w);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = k(F);
                    break;
                case 9:
                    str = k(G);
                    break;
                case 10:
                    str = n();
                    break;
                case 11:
                    String str2 = this.y;
                    if (str2 != null) {
                        this.y = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Expected a string but was ");
                    sb.append(peek());
                    kbs.p(sb, c());
                    return null;
            }
        } else {
            long j = this.x;
            yp6 yp6Var = this.b;
            yp6Var.getClass();
            str = yp6Var.T(j, uza.a);
        }
        this.c = 0;
        int i2 = this.A - 1;
        int[] iArr = this.C;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void o(int i) {
        int i2 = this.A;
        int[] iArr = this.z;
        if (i2 != iArr.length) {
            this.A = i2 + 1;
            iArr[i2] = i;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath());
        }
    }

    @Override // defpackage.xdx
    public final JsonReader$Token peek() {
        Integer valueOf = Integer.valueOf(this.c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 1:
                return JsonReader$Token.BEGIN_OBJECT;
            case 2:
                return JsonReader$Token.END_OBJECT;
            case 3:
                return JsonReader$Token.BEGIN_ARRAY;
            case 4:
                return JsonReader$Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader$Token.BOOLEAN;
            case 7:
                return JsonReader$Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader$Token.STRING;
            case 12:
            case 13:
            case 14:
                return JsonReader$Token.NAME;
            case 15:
                return JsonReader$Token.LONG;
            case 16:
                return JsonReader$Token.NUMBER;
            case 17:
                return JsonReader$Token.END_DOCUMENT;
            default:
                ny61.w();
                return null;
        }
    }

    @Override // defpackage.xdx
    public final void rewind() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // defpackage.xdx
    public final void skipValue() {
        int i = 0;
        do {
            int i2 = this.c;
            Integer valueOf = Integer.valueOf(i2);
            if (i2 == 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : a();
            yp6 yp6Var = this.b;
            switch (intValue) {
                case 1:
                    o(3);
                    i++;
                    break;
                case 2:
                    this.A--;
                    i--;
                    break;
                case 3:
                    o(1);
                    i++;
                    break;
                case 4:
                    this.A--;
                    i--;
                    break;
                case 8:
                case 12:
                    w(F);
                    break;
                case 9:
                case 13:
                    w(G);
                    break;
                case 10:
                case 14:
                    long K = this.a.K(H);
                    if (K == -1) {
                        K = yp6Var.b;
                    }
                    yp6Var.skip(K);
                    break;
                case 16:
                    yp6Var.skip(this.x);
                    break;
            }
            this.c = 0;
        } while (i != 0);
        int i3 = this.A - 1;
        int[] iArr = this.C;
        iArr[i3] = iArr[i3] + 1;
        this.B[i3] = "null";
    }

    @Override // defpackage.xdx
    public final xdx u() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 1) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return null;
        }
        o(3);
        this.c = 0;
        int i2 = this.E;
        this.E = i2 + 1;
        this.D[i2] = 0;
        return this;
    }

    public final char v() {
        int i;
        qq6 qq6Var = this.a;
        if (!qq6Var.S(1L)) {
            B("Unterminated escape sequence");
            throw null;
        }
        yp6 yp6Var = this.b;
        char readByte = (char) yp6Var.readByte();
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
                return HexString.LF;
            }
            if (readByte == 'f') {
                return '\f';
            }
            if (readByte == '\n' || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/') {
                return readByte;
            }
            B("Invalid escape sequence: \\" + readByte);
            throw null;
        }
        if (!qq6Var.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte e = yp6Var.e(i2);
            char c2 = (char) (c << 4);
            if (e >= 48 && e <= 57) {
                i = e - 48;
            } else if (e >= 97 && e <= 102) {
                i = e - 87;
            } else {
                if (e < 65 || e > 70) {
                    B("\\u".concat(yp6Var.T(4L, uza.a)));
                    throw null;
                }
                i = e - 55;
            }
            c = (char) (c2 + i);
        }
        yp6Var.skip(4L);
        return c;
    }

    public final void w(ByteString byteString) {
        while (true) {
            long K = this.a.K(byteString);
            if (K == -1) {
                B("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.b;
            if (yp6Var.e(K) != 92) {
                yp6Var.skip(K + 1);
                return;
            } else {
                yp6Var.skip(K + 1);
                v();
            }
        }
    }

    @Override // defpackage.xdx
    public final xdx y() {
        int i = this.c;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            kbs.p(sb, c());
            return null;
        }
        int i2 = this.A;
        int i3 = i2 - 1;
        this.A = i3;
        this.B[i3] = null;
        int i4 = i2 - 2;
        int[] iArr = this.C;
        iArr[i4] = iArr[i4] + 1;
        this.c = 0;
        this.E--;
        return this;
    }
}
