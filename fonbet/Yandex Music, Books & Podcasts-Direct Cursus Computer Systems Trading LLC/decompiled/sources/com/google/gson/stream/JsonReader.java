package com.google.gson.stream;

import com.connectsdk.service.airplay.PListParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.ouj;
import defpackage.wvs;
import defpackage.xq0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class JsonReader implements Closeable {
    private static final int A = 9;
    private static final int B = 10;
    private static final int C = 11;
    private static final int D = 12;
    private static final int E = 13;
    private static final int F = 14;
    private static final int G = 15;
    private static final int H = 16;
    private static final int I = 17;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int X = 3;
    private static final int Y = 4;
    private static final int Z = 5;
    private static final long q = -922337203685477580L;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final int v = 4;
    private static final int v0 = 6;
    private static final int w = 5;
    private static final int w0 = 7;
    private static final int x = 6;
    static final int x0 = 255;
    private static final int y = 7;
    static final int y0 = 1024;
    private static final int z = 8;
    private final Reader a;
    private long j;
    private int k;
    private String l;
    private int[] m;
    private String[] o;
    private int[] p;
    private Strictness b = Strictness.b;
    private int c = 255;
    private final char[] d = new char[y0];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    int i = 0;
    private int n = 1;

    static {
        JsonReaderInternalAccess.a = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void a(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                    jsonTreeReader.V0(JsonToken.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) jsonTreeReader.Y0()).next();
                    jsonTreeReader.a1(entry.getValue());
                    jsonTreeReader.a1(new JsonPrimitive((String) entry.getKey()));
                    return;
                }
                int i = jsonReader.i;
                if (i == 0) {
                    i = jsonReader.D();
                }
                if (i == 13) {
                    jsonReader.i = 9;
                } else if (i == 12) {
                    jsonReader.i = 8;
                } else {
                    if (i != 14) {
                        throw jsonReader.U0("a name");
                    }
                    jsonReader.i = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.m = iArr;
        iArr[0] = 6;
        this.o = new String[32];
        this.p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String F0(char c) throws IOException {
        char[] cArr = this.d;
        StringBuilder sb = null;
        do {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                int i3 = i2;
                int i4 = i;
                while (i < i3) {
                    int i5 = i + 1;
                    char c2 = cArr[i];
                    if (this.b == Strictness.c && c2 < ' ') {
                        throw T0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c2 == c) {
                        this.e = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.e = i5;
                        int i7 = i5 - i4;
                        int i8 = i7 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 * 2, 16));
                        }
                        sb.append(cArr, i4, i8);
                        sb.append(L0());
                        i = this.e;
                        i2 = this.f;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i5;
                        }
                        i = i5;
                    }
                }
                break;
            }
        } while (N(1));
        throw T0("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004a, code lost:
    
        o();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String G0() throws IOException {
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.e;
                int i4 = i3 + i2;
                int i5 = this.f;
                char[] cArr = this.d;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
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
                    sb2.append(this.d, this.e, i2);
                    this.e += i2;
                } else if (N(i2 + 1)) {
                }
            }
            i = i2;
            char[] cArr2 = this.d;
            if (sb2 != null) {
                sb = new String(cArr2, this.e, i);
            } else {
                sb2.append(cArr2, this.e, i);
                sb = sb2.toString();
            }
            this.e += i;
            return sb;
        } while (N(1));
        char[] cArr22 = this.d;
        if (sb2 != null) {
        }
        this.e += i;
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int I0() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.d[this.e];
        if (c == 't' || c == 'T') {
            str = PListParser.TAG_TRUE;
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = PListParser.TAG_FALSE;
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        boolean z2 = this.b != Strictness.c;
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this.e;
            if (i2 >= length) {
                if ((i3 + length < this.f || N(length + 1)) && Y(this.d[this.e + length])) {
                    return 0;
                }
                this.e += length;
                this.i = i;
                return i;
            }
            if (i3 + i2 >= this.f && !N(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 == str.charAt(i2) || (z2 && c2 == str2.charAt(i2))) {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.j = r11;
        r19.e += r8;
        r19.i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.k = r8;
        r19.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (Y(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int J0() throws IOException {
        int i;
        char[] cArr = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = 0;
        int i5 = 0;
        char c = 0;
        boolean z2 = false;
        int i6 = 1;
        long j = 0;
        while (true) {
            char c2 = 2;
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!N(i5 + 1)) {
                    i = i4;
                    break;
                }
                i2 = this.e;
                i3 = this.f;
            }
            char c3 = cArr[i2 + i5];
            i = i4;
            if (c3 != '+') {
                if (c3 == 'E' || c3 == 'e') {
                    if (c != 2 && c != 4) {
                        return i;
                    }
                    c = 5;
                } else if (c3 == '-') {
                    c2 = 6;
                    if (c == 0) {
                        c = 1;
                        z2 = true;
                    } else if (c != 5) {
                        return i;
                    }
                } else if (c3 != '.') {
                    if (c3 < '0' || c3 > '9') {
                        break;
                    }
                    if (c == 1 || c == 0) {
                        j = -(c3 - '0');
                    } else if (c == 2) {
                        if (j == 0) {
                            return i;
                        }
                        long j2 = (10 * j) - (c3 - '0');
                        i6 &= (j > q || (j == q && j2 < j)) ? 1 : i;
                        j = j2;
                    } else if (c == 3) {
                        c = 4;
                    } else if (c == 5 || c == 6) {
                        c = 7;
                    }
                } else {
                    if (c != 2) {
                        return i;
                    }
                    c = 3;
                }
                i5++;
                i4 = i;
            } else {
                c2 = 6;
                if (c != 5) {
                    return i;
                }
            }
            c = c2;
            i5++;
            i4 = i;
        }
    }

    private void K0(int i) throws MalformedJsonException {
        int i2 = this.n;
        if (i2 - 1 >= this.c) {
            throw new MalformedJsonException("Nesting limit " + this.c + " reached" + j0());
        }
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.m = Arrays.copyOf(iArr, i3);
            this.p = Arrays.copyOf(this.p, i3);
            this.o = (String[]) Arrays.copyOf(this.o, i3);
        }
        int[] iArr2 = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr2[i4] = i;
    }

    private char L0() throws IOException {
        int i;
        if (this.e == this.f && !N(1)) {
            throw T0("Unterminated escape sequence");
        }
        char[] cArr = this.d;
        int i2 = this.e;
        int i3 = i2 + 1;
        this.e = i3;
        char c = cArr[i2];
        Strictness strictness = Strictness.c;
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
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            throw T0("Invalid escape sequence");
                        }
                        if (i2 + 5 > this.f && !N(4)) {
                            throw T0("Unterminated escape sequence");
                        }
                        int i4 = this.e;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char[] cArr2 = this.d;
                            char c2 = cArr2[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    throw T0("Malformed Unicode escape \\u".concat(new String(cArr2, this.e, 4)));
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.e += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.b == strictness) {
            throw T0("Cannot escape a newline character in strict mode");
        }
        this.g++;
        this.h = i3;
        if (this.b == strictness) {
            throw T0("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    private boolean N(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.d;
        int i4 = this.h;
        int i5 = this.e;
        this.h = i4 - i5;
        int i6 = this.f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.a;
            int i8 = this.f;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f + read;
            this.f = i2;
            if (this.g == 0 && (i3 = this.h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private void P0(char c) throws IOException {
        char[] cArr = this.d;
        do {
            int i = this.e;
            int i2 = this.f;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.e = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.e = i3;
                    L0();
                    i = this.e;
                    i2 = this.f;
                } else {
                    if (c2 == '\n') {
                        this.g++;
                        this.h = i3;
                    }
                    i = i3;
                }
            }
            this.e = i;
        } while (N(1));
        throw T0("Unterminated string");
    }

    private String Q(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.n;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.m[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.p[i];
                    if (z2 && i4 > 0 && i == i2 - 1) {
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
                    String str = this.o[i];
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
                    xq0.w(k5r.i(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    private boolean Q0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.e + length > this.f && !N(length)) {
                return false;
            }
            char[] cArr = this.d;
            int i = this.e;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.d[this.e + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.g++;
            this.h = i + 1;
            this.e++;
        }
    }

    private void R0() throws IOException {
        char c;
        do {
            if (this.e >= this.f && !N(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void S0() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.e;
                if (i2 + i < this.f) {
                    char c = this.d[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
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
                    this.e = i2 + i;
                }
            }
            this.e += i;
            return;
        } while (N(1));
    }

    private MalformedJsonException T0(String str) throws MalformedJsonException {
        StringBuilder k = dfi.k(str);
        k.append(j0());
        k.append("\nSee ");
        k.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(k.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException U0(String str) throws IOException {
        String str2 = H0() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder u2 = ouj.u("Expected ", str, " but was ");
        u2.append(H0());
        u2.append(j0());
        u2.append("\nSee ");
        u2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(u2.toString());
    }

    private boolean Y(char c) throws IOException {
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
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        o();
        return false;
    }

    private int l0(boolean z2) throws IOException {
        char c;
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        while (true) {
            if (i == i2) {
                this.e = i;
                if (!N(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + j0());
                }
                i = this.e;
                i2 = this.f;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i3;
                    if (i3 == i2) {
                        this.e = i;
                        boolean N = N(2);
                        this.e++;
                        if (!N) {
                            break;
                        }
                    }
                    o();
                    int i4 = this.e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.e = i4 + 1;
                        if (!Q0("*/")) {
                            throw T0("Unterminated comment");
                        }
                        i = this.e + 2;
                        i2 = this.f;
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.e = i4 + 1;
                        R0();
                        i = this.e;
                        i2 = this.f;
                    }
                } else {
                    if (c != '#') {
                        this.e = i3;
                        return c;
                    }
                    this.e = i3;
                    o();
                    R0();
                    i = this.e;
                    i2 = this.f;
                }
            }
            i = i3;
        }
        return c;
    }

    private void o() throws MalformedJsonException {
        if (this.b != Strictness.a) {
            throw T0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void z() throws IOException {
        l0(true);
        int i = this.e;
        this.e = i - 1;
        if (i + 4 <= this.f || N(5)) {
            int i2 = this.e;
            char[] cArr = this.d;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.e = i2 + 5;
            }
        }
    }

    public int D() throws IOException {
        int l0;
        int[] iArr = this.m;
        int i = this.n;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int l02 = l0(true);
            if (l02 != 44) {
                if (l02 != 59) {
                    if (l02 != 93) {
                        throw T0("Unterminated array");
                    }
                    this.i = 4;
                    return 4;
                }
                o();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (l0 = l0(true)) != 44) {
                    if (l0 != 59) {
                        if (l0 != 125) {
                            throw T0("Unterminated object");
                        }
                        this.i = 2;
                        return 2;
                    }
                    o();
                }
                int l03 = l0(true);
                if (l03 == 34) {
                    this.i = 13;
                    return 13;
                }
                if (l03 == 39) {
                    o();
                    this.i = 12;
                    return 12;
                }
                if (l03 == 125) {
                    if (i2 == 5) {
                        throw T0("Expected name");
                    }
                    this.i = 2;
                    return 2;
                }
                o();
                this.e--;
                if (!Y((char) l03)) {
                    throw T0("Expected name");
                }
                this.i = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int l04 = l0(true);
                if (l04 != 58) {
                    if (l04 != 61) {
                        throw T0("Expected ':'");
                    }
                    o();
                    if (this.e < this.f || N(1)) {
                        char[] cArr = this.d;
                        int i3 = this.e;
                        if (cArr[i3] == '>') {
                            this.e = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.b == Strictness.a) {
                    z();
                }
                this.m[this.n - 1] = 7;
            } else if (i2 == 7) {
                if (l0(false) == -1) {
                    this.i = 17;
                    return 17;
                }
                o();
                this.e--;
            } else if (i2 == 8) {
                xq0.q("JsonReader is closed");
                return 0;
            }
        }
        int l05 = l0(true);
        if (l05 == 34) {
            this.i = 9;
            return 9;
        }
        if (l05 == 39) {
            o();
            this.i = 8;
            return 8;
        }
        if (l05 != 44 && l05 != 59) {
            if (l05 == 91) {
                this.i = 3;
                return 3;
            }
            if (l05 != 93) {
                if (l05 == 123) {
                    this.i = 1;
                    return 1;
                }
                this.e--;
                int I0 = I0();
                if (I0 != 0) {
                    return I0;
                }
                int J0 = J0();
                if (J0 != 0) {
                    return J0;
                }
                if (!Y(this.d[this.e])) {
                    throw T0("Expected value");
                }
                o();
                this.i = 10;
                return 10;
            }
            if (i2 == 1) {
                this.i = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw T0("Unexpected value");
        }
        o();
        this.e--;
        this.i = 7;
        return 7;
    }

    public void H() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 4) {
            throw U0("END_ARRAY");
        }
        int i2 = this.n;
        this.n = i2 - 1;
        int[] iArr = this.p;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    public JsonToken H0() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
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
                wvs.b();
                return null;
        }
    }

    public void I() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 2) {
            throw U0("END_OBJECT");
        }
        int i2 = this.n;
        int i3 = i2 - 1;
        this.n = i3;
        this.o[i3] = null;
        int[] iArr = this.p;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i = 0;
    }

    public String L() throws IOException {
        String F0;
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 14) {
            F0 = G0();
        } else if (i == 12) {
            F0 = F0('\'');
        } else {
            if (i != 13) {
                throw U0("a name");
            }
            F0 = F0('\"');
        }
        this.i = 0;
        this.o[this.n - 1] = F0;
        return F0;
    }

    @Deprecated
    public final void M0(boolean z2) {
        O0(z2 ? Strictness.a : Strictness.b);
    }

    public final void N0(int i) {
        if (i >= 0) {
            this.c = i;
        } else {
            xq0.x(k5r.i(i, "Invalid nesting limit: "));
        }
    }

    public final void O0(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.b = strictness;
    }

    public final int P() {
        return this.c;
    }

    public String R() {
        return Q(true);
    }

    public final Strictness S() {
        return this.b;
    }

    public final boolean X() {
        return this.b == Strictness.a;
    }

    public void b() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 3) {
            throw U0("BEGIN_ARRAY");
        }
        K0(1);
        this.p[this.n - 1] = 0;
        this.i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.a.close();
    }

    public String f0() throws IOException {
        String str;
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 10) {
            str = G0();
        } else if (i == 8) {
            str = F0('\'');
        } else if (i == 9) {
            str = F0('\"');
        } else if (i == 11) {
            str = this.l;
            this.l = null;
        } else if (i == 15) {
            str = Long.toString(this.j);
        } else {
            if (i != 16) {
                throw U0("a string");
            }
            str = new String(this.d, this.e, this.k);
            this.e += this.k;
        }
        this.i = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public void g() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 1) {
            throw U0("BEGIN_OBJECT");
        }
        K0(3);
        this.i = 0;
    }

    public String getPath() {
        return Q(false);
    }

    public boolean hasNext() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public String j0() {
        StringBuilder l = dfi.l(" at line ", this.g + 1, (this.e - this.h) + 1, " column ", " path ");
        l.append(getPath());
        return l.toString();
    }

    public boolean nextBoolean() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw U0("a boolean");
        }
        this.i = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else if (i == 8 || i == 9) {
            this.l = F0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.l = G0();
        } else if (i != 11) {
            throw U0("a double");
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (this.b != Strictness.a && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw T0("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.l = null;
        this.i = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int nextInt() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 15) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.p;
                int i3 = this.n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.j + j0());
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw U0("an int");
            }
            if (i == 10) {
                this.l = G0();
            } else {
                this.l = F0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.l = null;
            this.i = 0;
            int[] iArr3 = this.p;
            int i6 = this.n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.l + j0());
    }

    public long nextLong() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw U0("a long");
            }
            if (i == 10) {
                this.l = G0();
            } else {
                this.l = F0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.l = null;
            this.i = 0;
            int[] iArr3 = this.p;
            int i4 = this.n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.l + j0());
    }

    public String toString() {
        return getClass().getSimpleName() + j0();
    }

    public void u0() throws IOException {
        int i = this.i;
        if (i == 0) {
            i = D();
        }
        if (i != 7) {
            throw U0("null");
        }
        this.i = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void w() throws IOException {
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = D();
            }
            switch (i2) {
                case 1:
                    K0(3);
                    i++;
                    this.i = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.o[this.n - 1] = null;
                    }
                    this.n--;
                    i--;
                    this.i = 0;
                    break;
                case 3:
                    K0(1);
                    i++;
                    this.i = 0;
                    break;
                case 4:
                    this.n--;
                    i--;
                    this.i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.i = 0;
                    break;
                case 8:
                    P0('\'');
                    this.i = 0;
                    break;
                case 9:
                    P0('\"');
                    this.i = 0;
                    break;
                case 10:
                    S0();
                    this.i = 0;
                    break;
                case 12:
                    P0('\'');
                    if (i == 0) {
                        this.o[this.n - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 13:
                    P0('\"');
                    if (i == 0) {
                        this.o[this.n - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 14:
                    S0();
                    if (i == 0) {
                        this.o[this.n - 1] = "<skipped>";
                    }
                    this.i = 0;
                    break;
                case 16:
                    this.e += this.k;
                    this.i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
    }
}
