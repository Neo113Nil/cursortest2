package defpackage;

import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class wdx implements Closeable {
    public long B;
    public int C;
    public String D;
    public int[] E;
    public String[] G;
    public int[] H;
    public final Reader a;
    public Strictness b = Strictness.LEGACY_STRICT;
    public final char[] c = new char[1024];
    public int w = 0;
    public int x = 0;
    public int y = 0;
    public int z = 0;
    public int A = 0;
    public int F = 1;

    static {
        ydx.a = new vdx();
    }

    public wdx(Reader reader) {
        int[] iArr = new int[32];
        this.E = iArr;
        iArr[0] = 6;
        this.G = new String[32];
        this.H = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    public final boolean B(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case HProv.PP_CIPHEROID /* 93 */:
                            return false;
                        case HProv.PP_HASHOID /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public void B0() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i != 7) {
            throw f0("null");
        }
        this.A = 0;
        int[] iArr = this.H;
        int i2 = this.F - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    final String D() {
        StringBuilder s = b64.s(this.y + 1, (this.w - this.z) + 1, " at line ", " column ", " path ");
        s.append(getPath());
        return s.toString();
    }

    public final int G(boolean z) {
        char c;
        int i = this.w;
        int i2 = this.x;
        while (true) {
            if (i == i2) {
                this.w = i;
                if (!o(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(D()));
                    }
                    return -1;
                }
                i = this.w;
                i2 = this.x;
            }
            int i3 = i + 1;
            char[] cArr = this.c;
            c = cArr[i];
            if (c == '\n') {
                this.y++;
                this.z = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.w = i3;
                    if (i3 == i2) {
                        this.w = i;
                        boolean o = o(2);
                        this.w++;
                        if (!o) {
                            break;
                        }
                    }
                    d();
                    int i4 = this.w;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.w = i4 + 1;
                        while (true) {
                            if (this.w + 2 > this.x && !o(2)) {
                                e0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.w;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.w;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.x;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.y++;
                                this.z = i5 + 1;
                            }
                            this.w++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.w = i4 + 1;
                        a0();
                        i = this.w;
                        i2 = this.x;
                    }
                } else {
                    if (c != '#') {
                        this.w = i3;
                        return c;
                    }
                    this.w = i3;
                    d();
                    a0();
                    i = this.w;
                    i2 = this.x;
                }
            }
            i = i3;
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r11.w = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.w = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String I(char c) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.w;
            int i3 = this.x;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.c;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.b == Strictness.STRICT && c2 < ' ') {
                        e0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.w = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.y++;
                        this.z = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(U());
                i2 = this.w;
                i3 = this.x;
            }
        } while (o(1));
        e0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String P() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.w + i2;
                int i4 = this.x;
                cArr = this.c;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case HProv.PP_CIPHEROID /* 93 */:
                                                    break;
                                                case HProv.PP_HASHOID /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.w, i2);
                    this.w += i2;
                } else if (o(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.w;
            if (sb2 != null) {
                sb = new String(cArr, i5, i);
            } else {
                sb2.append(cArr, i5, i);
                sb = sb2.toString();
            }
            this.w += i;
            return sb;
        } while (o(1));
        int i52 = this.w;
        if (sb2 != null) {
        }
        this.w += i;
        return sb;
    }

    public JsonToken R() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                ny61.w();
                return null;
        }
    }

    public final void T(int i) {
        int i2 = this.F;
        if (i2 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached".concat(D()));
        }
        int[] iArr = this.E;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.E = Arrays.copyOf(iArr, i3);
            this.H = Arrays.copyOf(this.H, i3);
            this.G = (String[]) Arrays.copyOf(this.G, i3);
        }
        int[] iArr2 = this.E;
        int i4 = this.F;
        this.F = i4 + 1;
        iArr2[i4] = i;
    }

    public final char U() {
        int i;
        if (this.w == this.x && !o(1)) {
            e0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.w;
        int i3 = i2 + 1;
        this.w = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return HexString.LF;
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            e0("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.x && !o(4)) {
                            e0("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.w;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    e0("Malformed Unicode escape \\u".concat(new String(cArr, this.w, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.w += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.b == Strictness.STRICT) {
            e0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.y++;
        this.z = i3;
        if (this.b == Strictness.STRICT) {
            e0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void W(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.b = strictness;
    }

    public final void Z(char c) {
        do {
            int i = this.w;
            int i2 = this.x;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.w = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.w = i3;
                    U();
                    i = this.w;
                    i2 = this.x;
                } else {
                    if (c2 == '\n') {
                        this.y++;
                        this.z = i3;
                    }
                    i = i3;
                }
            }
            this.w = i;
        } while (o(1));
        e0("Unterminated string");
        throw null;
    }

    public void a() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i != 3) {
            throw f0("BEGIN_ARRAY");
        }
        T(1);
        this.H[this.F - 1] = 0;
        this.A = 0;
    }

    public final void a0() {
        char c;
        do {
            if (this.w >= this.x && !o(1)) {
                return;
            }
            int i = this.w;
            int i2 = i + 1;
            this.w = i2;
            c = this.c[i];
            if (c == '\n') {
                this.y++;
                this.z = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void b0() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.w + i;
                if (i2 < this.x) {
                    char c = this.c[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case HProv.PP_CIPHEROID /* 93 */:
                                                    break;
                                                case HProv.PP_HASHOID /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.w = i2;
                }
            }
            d();
            this.w += i;
            return;
        } while (o(1));
    }

    public void c() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i != 1) {
            throw f0("BEGIN_OBJECT");
        }
        T(3);
        this.A = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A = 0;
        this.E[0] = 8;
        this.F = 1;
        this.a.close();
    }

    public final void d() {
        if (this.b == Strictness.LENIENT) {
            return;
        }
        e0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d1, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
    
        if (B(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01aa, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0229, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x022b, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0231, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0233, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023a, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023c, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023e, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0240, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0243, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0244, code lost:
    
        r26.B = r4;
        r26.w += r2;
        r9 = 15;
        r26.A = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0236, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0250, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0253, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0256, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
    
        r26.C = r2;
        r9 = 16;
        r26.A = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e() {
        int G;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int[] iArr = this.E;
        boolean z = true;
        int i5 = this.F - 1;
        int i6 = iArr[i5];
        char[] cArr = this.c;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int G2 = G(true);
            if (G2 != 44) {
                if (G2 != 59) {
                    if (G2 == 93) {
                        this.A = 4;
                        return 4;
                    }
                    e0("Unterminated array");
                    throw null;
                }
                d();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (G = G(true)) != 44) {
                    if (G != 59) {
                        if (G == 125) {
                            this.A = 2;
                            return 2;
                        }
                        e0("Unterminated object");
                        throw null;
                    }
                    d();
                }
                int G3 = G(true);
                if (G3 == 34) {
                    this.A = 13;
                    return 13;
                }
                if (G3 == 39) {
                    d();
                    this.A = 12;
                    return 12;
                }
                if (G3 == 125) {
                    if (i6 != 5) {
                        this.A = 2;
                        return 2;
                    }
                    e0("Expected name");
                    throw null;
                }
                d();
                this.w--;
                if (B((char) G3)) {
                    this.A = 14;
                    return 14;
                }
                e0("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int G4 = G(true);
                if (G4 != 58) {
                    if (G4 != 61) {
                        e0("Expected ':'");
                        throw null;
                    }
                    d();
                    if (this.w < this.x || o(1)) {
                        int i7 = this.w;
                        if (cArr[i7] == '>') {
                            this.w = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.b == Strictness.LENIENT) {
                    G(true);
                    int i8 = this.w;
                    this.w = i8 - 1;
                    if (i8 + 4 <= this.x || o(5)) {
                        int i9 = this.w;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.w = i9 + 5;
                        }
                    }
                }
                this.E[this.F - 1] = 7;
            } else if (i6 == 7) {
                if (G(false) == -1) {
                    this.A = 17;
                    return 17;
                }
                d();
                this.w--;
            } else if (i6 == 8) {
                ny61.r("JsonReader is closed");
                return 0;
            }
        }
        int G5 = G(true);
        if (G5 == 34) {
            this.A = 9;
            return 9;
        }
        if (G5 == 39) {
            d();
            this.A = 8;
            return 8;
        }
        if (G5 == 44 || G5 == 59) {
            i = 1;
        } else {
            if (G5 == 91) {
                this.A = 3;
                return 3;
            }
            if (G5 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.A = 4;
                    return 4;
                }
            } else {
                if (G5 == 123) {
                    this.A = 1;
                    return 1;
                }
                int i10 = this.w - 1;
                this.w = i10;
                char c2 = cArr[i10];
                if (c2 == 't' || c2 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else if (c2 == 'f' || c2 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                } else {
                    if (c2 == 'n' || c2 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        return i3;
                    }
                    int i11 = this.w;
                    int i12 = this.x;
                    boolean z2 = true;
                    int i13 = 0;
                    long j = 0;
                    boolean z3 = false;
                    char c3 = 0;
                    while (true) {
                        if (i11 + i13 == i12) {
                            if (i13 == cArr.length) {
                                break;
                            }
                            if (!o(i13 + 1)) {
                                long j2 = j;
                                break;
                            }
                            i11 = this.w;
                            i12 = this.x;
                        }
                        char c4 = cArr[i11 + i13];
                        if (c4 != '+') {
                            if (c4 == 'E' || c4 == 'e') {
                                if (c3 != 2 && c3 != 4) {
                                    break;
                                }
                                c3 = 5;
                                i13++;
                                z = true;
                            } else if (c4 != '-') {
                                if (c4 == '.') {
                                    if (c3 != 2) {
                                        break;
                                    }
                                    c3 = 3;
                                    i13++;
                                    z = true;
                                } else {
                                    if (c4 < '0' || c4 > '9') {
                                        break;
                                    }
                                    if (c3 == z || c3 == 0) {
                                        j = -(c4 - '0');
                                        c3 = 2;
                                    } else if (c3 != 2) {
                                        long j3 = j;
                                        if (c3 == 3) {
                                            j = j3;
                                            c3 = 4;
                                        } else if (c3 == 5 || c3 == 6) {
                                            j = j3;
                                            c3 = 7;
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        if (j == 0) {
                                            break;
                                        }
                                        long j4 = j;
                                        long j5 = (10 * j) - (c4 - '0');
                                        z2 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                        j = j5;
                                    }
                                    i13++;
                                    z = true;
                                }
                            } else if (c3 == 0) {
                                z3 = true;
                                c3 = 1;
                                i13++;
                                z = true;
                            } else {
                                if (c3 != 5) {
                                    break;
                                }
                                c3 = 6;
                                i13++;
                                z = true;
                            }
                            if (i4 == 0) {
                                return i4;
                            }
                            if (!B(cArr[this.w])) {
                                e0("Expected value");
                                throw null;
                            }
                            d();
                            this.A = 10;
                            return 10;
                        }
                        if (c3 != 5) {
                            break;
                        }
                        c3 = 6;
                        i13++;
                        z = true;
                    }
                    i4 = 0;
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.b != Strictness.STRICT;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.w;
                    int i16 = this.x;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !o(i14 + 1)) || ((c = cArr[this.w + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else if ((i15 + length >= i16 && !o(length + 1)) || !B(cArr[this.w + length])) {
                        this.w += length;
                        this.A = i2;
                        i3 = i2;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            e0("Unexpected value");
            throw null;
        }
        d();
        this.w -= i;
        this.A = 7;
        return 7;
    }

    public final void e0(String str) {
        StringBuilder t = qv10.t(str);
        t.append(D());
        t.append("\nSee ");
        t.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(t.toString());
    }

    public final IllegalStateException f0(String str) {
        String str2 = R() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder x = unr0.x("Expected ", str, " but was ");
        x.append(R());
        x.append(D());
        x.append("\nSee ");
        x.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(x.toString());
    }

    public final void g0(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                e0("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    public String getPath() {
        return v(false);
    }

    public boolean hasNext() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public void k() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i != 4) {
            throw f0("END_ARRAY");
        }
        int i2 = this.F;
        this.F = i2 - 1;
        int[] iArr = this.H;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.A = 0;
    }

    public void n() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i != 2) {
            throw f0("END_OBJECT");
        }
        int i2 = this.F;
        int i3 = i2 - 1;
        this.F = i3;
        this.G[i3] = null;
        int[] iArr = this.H;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.A = 0;
    }

    public boolean nextBoolean() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 5) {
            this.A = 0;
            int[] iArr = this.H;
            int i2 = this.F - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw f0("a boolean");
        }
        this.A = 0;
        int[] iArr2 = this.H;
        int i3 = this.F - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double nextDouble() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.A = 0;
            int[] iArr = this.H;
            int i2 = this.F - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.B;
        }
        if (i == 16) {
            this.D = new String(this.c, this.w, this.C);
            this.w += this.C;
        } else if (i == 8 || i == 9) {
            this.D = I(i == 8 ? '\'' : OpenList.CHAR_QUOTE);
        } else if (i == 10) {
            this.D = P();
        } else if (i != 11) {
            throw f0("a double");
        }
        this.A = 11;
        double parseDouble = Double.parseDouble(this.D);
        if (this.b != Strictness.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            e0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.D = null;
        this.A = 0;
        int[] iArr2 = this.H;
        int i3 = this.F - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int nextInt() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            long j = this.B;
            int i2 = (int) j;
            if (j == i2) {
                this.A = 0;
                int[] iArr = this.H;
                int i3 = this.F - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.B + D());
        }
        if (i == 16) {
            this.D = new String(this.c, this.w, this.C);
            this.w += this.C;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw f0("an int");
            }
            if (i == 10) {
                this.D = P();
            } else {
                this.D = I(i == 8 ? '\'' : OpenList.CHAR_QUOTE);
            }
            g0(this.D);
            try {
                int parseInt = Integer.parseInt(this.D);
                this.A = 0;
                int[] iArr2 = this.H;
                int i4 = this.F - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.A = 11;
        double parseDouble = Double.parseDouble(this.D);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.D = null;
            this.A = 0;
            int[] iArr3 = this.H;
            int i6 = this.F - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.D + D());
    }

    public long nextLong() {
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.A = 0;
            int[] iArr = this.H;
            int i2 = this.F - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.B;
        }
        if (i == 16) {
            this.D = new String(this.c, this.w, this.C);
            this.w += this.C;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw f0("a long");
            }
            if (i == 10) {
                this.D = P();
            } else {
                this.D = I(i == 8 ? '\'' : OpenList.CHAR_QUOTE);
            }
            g0(this.D);
            try {
                long parseLong = Long.parseLong(this.D);
                this.A = 0;
                int[] iArr2 = this.H;
                int i3 = this.F - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.A = 11;
        double parseDouble = Double.parseDouble(this.D);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.D = null;
            this.A = 0;
            int[] iArr3 = this.H;
            int i4 = this.F - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.D + D());
    }

    public String nextName() {
        String I;
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 14) {
            I = P();
        } else if (i == 12) {
            I = I('\'');
        } else {
            if (i != 13) {
                throw f0("a name");
            }
            I = I(OpenList.CHAR_QUOTE);
        }
        this.A = 0;
        this.G[this.F - 1] = I;
        return I;
    }

    public String nextString() {
        String str;
        int i = this.A;
        if (i == 0) {
            i = e();
        }
        if (i == 10) {
            str = P();
        } else if (i == 8) {
            str = I('\'');
        } else if (i == 9) {
            str = I(OpenList.CHAR_QUOTE);
        } else if (i == 11) {
            str = this.D;
            this.D = null;
        } else if (i == 15) {
            str = Long.toString(this.B);
        } else {
            if (i != 16) {
                throw f0("a string");
            }
            str = new String(this.c, this.w, this.C);
            this.w += this.C;
        }
        this.A = 0;
        int[] iArr = this.H;
        int i2 = this.F - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean o(int i) {
        int i2;
        int i3;
        int i4 = this.z;
        int i5 = this.w;
        this.z = i4 - i5;
        int i6 = this.x;
        char[] cArr = this.c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.x = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.x = 0;
        }
        this.w = 0;
        do {
            int i8 = this.x;
            int read = this.a.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.x + read;
            this.x = i2;
            if (this.y == 0 && (i3 = this.z) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.w++;
                this.z = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() {
        int i = 0;
        do {
            int i2 = this.A;
            if (i2 == 0) {
                i2 = e();
            }
            switch (i2) {
                case 1:
                    T(3);
                    i++;
                    this.A = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.G[this.F - 1] = null;
                    }
                    this.F--;
                    i--;
                    this.A = 0;
                    break;
                case 3:
                    T(1);
                    i++;
                    this.A = 0;
                    break;
                case 4:
                    this.F--;
                    i--;
                    this.A = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.A = 0;
                    break;
                case 8:
                    Z('\'');
                    this.A = 0;
                    break;
                case 9:
                    Z(OpenList.CHAR_QUOTE);
                    this.A = 0;
                    break;
                case 10:
                    b0();
                    this.A = 0;
                    break;
                case 12:
                    Z('\'');
                    if (i == 0) {
                        this.G[this.F - 1] = "<skipped>";
                    }
                    this.A = 0;
                    break;
                case 13:
                    Z(OpenList.CHAR_QUOTE);
                    if (i == 0) {
                        this.G[this.F - 1] = "<skipped>";
                    }
                    this.A = 0;
                    break;
                case 14:
                    b0();
                    if (i == 0) {
                        this.G[this.F - 1] = "<skipped>";
                    }
                    this.A = 0;
                    break;
                case 16:
                    this.w += this.C;
                    this.A = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.H;
        int i3 = this.F - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public String toString() {
        return getClass().getSimpleName().concat(D());
    }

    public final String v(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.F;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.E[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.H[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.G[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    ny61.f(oyr.i(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public String w() {
        return v(true);
    }
}
