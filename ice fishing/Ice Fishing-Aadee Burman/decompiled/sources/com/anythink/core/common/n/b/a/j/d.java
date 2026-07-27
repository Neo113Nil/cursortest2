package com.anythink.core.common.n.b.a.j;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.d.j;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f15368a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15369b;

    /* renamed from: c, reason: collision with root package name */
    private int f15370c;

    /* renamed from: d, reason: collision with root package name */
    private int f15371d;

    /* renamed from: e, reason: collision with root package name */
    private int f15372e;

    /* renamed from: f, reason: collision with root package name */
    private int f15373f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f15374g;

    private d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f15368a = name;
        this.f15369b = name.length();
    }

    private String a() {
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        char c9;
        int i12;
        int i13;
        char c10;
        char c11;
        while (true) {
            i = this.f15370c;
            i6 = this.f15369b;
            if (i >= i6 || this.f15374g[i] != ' ') {
                break;
            }
            this.f15370c = i + 1;
        }
        if (i == i6) {
            return null;
        }
        this.f15371d = i;
        this.f15370c = i + 1;
        while (true) {
            i9 = this.f15370c;
            i10 = this.f15369b;
            if (i9 >= i10 || (c11 = this.f15374g[i9]) == '=' || c11 == ' ') {
                break;
            }
            this.f15370c = i9 + 1;
        }
        if (i9 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
        }
        this.f15372e = i9;
        if (this.f15374g[i9] == ' ') {
            while (true) {
                i12 = this.f15370c;
                i13 = this.f15369b;
                if (i12 >= i13 || (c10 = this.f15374g[i12]) == '=' || c10 != ' ') {
                    break;
                }
                this.f15370c = i12 + 1;
            }
            if (this.f15374g[i12] != '=' || i12 == i13) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
            }
        }
        do {
            i11 = this.f15370c + 1;
            this.f15370c = i11;
            if (i11 >= this.f15369b) {
                break;
            }
        } while (this.f15374g[i11] == ' ');
        int i14 = this.f15372e;
        int i15 = this.f15371d;
        if (i14 - i15 > 4) {
            char[] cArr = this.f15374g;
            if (cArr[i15 + 3] == '.' && (((c9 = cArr[i15]) == 'O' || c9 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.f15371d = i15 + 4;
            }
        }
        char[] cArr2 = this.f15374g;
        int i16 = this.f15371d;
        return new String(cArr2, i16, i14 - i16);
    }

    private String b() {
        int i = this.f15370c + 1;
        this.f15370c = i;
        this.f15371d = i;
        this.f15372e = i;
        while (true) {
            int i6 = this.f15370c;
            if (i6 == this.f15369b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
            }
            char[] cArr = this.f15374g;
            char c9 = cArr[i6];
            if (c9 == '\"') {
                this.f15370c = i6 + 1;
                while (true) {
                    int i9 = this.f15370c;
                    if (i9 >= this.f15369b || this.f15374g[i9] != ' ') {
                        break;
                    }
                    this.f15370c = i9 + 1;
                }
                char[] cArr2 = this.f15374g;
                int i10 = this.f15371d;
                return new String(cArr2, i10, this.f15372e - i10);
            }
            if (c9 == '\\') {
                cArr[this.f15372e] = e();
            } else {
                cArr[this.f15372e] = c9;
            }
            this.f15370c++;
            this.f15372e++;
        }
    }

    private String c() {
        int i;
        char[] cArr;
        char c9;
        int i6 = this.f15370c;
        if (i6 + 4 >= this.f15369b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
        }
        this.f15371d = i6;
        this.f15370c = i6 + 1;
        while (true) {
            i = this.f15370c;
            if (i == this.f15369b || (c9 = (cArr = this.f15374g)[i]) == '+' || c9 == ',' || c9 == ';') {
                break;
            }
            if (c9 == ' ') {
                this.f15372e = i;
                this.f15370c = i + 1;
                while (true) {
                    int i9 = this.f15370c;
                    if (i9 >= this.f15369b || this.f15374g[i9] != ' ') {
                        break;
                    }
                    this.f15370c = i9 + 1;
                }
            } else {
                if (c9 >= 'A' && c9 <= 'F') {
                    cArr[i] = (char) (c9 + ' ');
                }
                this.f15370c = i + 1;
            }
        }
        this.f15372e = i;
        int i10 = this.f15372e;
        int i11 = this.f15371d;
        int i12 = i10 - i11;
        if (i12 < 5 || (i12 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
        }
        int i13 = i12 / 2;
        byte[] bArr = new byte[i13];
        int i14 = i11 + 1;
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) a(i14);
            i14 += 2;
        }
        return new String(this.f15374g, this.f15371d, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f15373f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d() {
        char[] cArr;
        int i;
        int i6;
        char c9;
        int i9 = this.f15370c;
        this.f15371d = i9;
        this.f15372e = i9;
        while (true) {
            int i10 = this.f15370c;
            if (i10 >= this.f15369b) {
                char[] cArr2 = this.f15374g;
                int i11 = this.f15371d;
                return new String(cArr2, i11, this.f15372e - i11);
            }
            cArr = this.f15374g;
            char c10 = cArr[i10];
            if (c10 == ' ') {
                int i12 = this.f15372e;
                this.f15373f = i12;
                this.f15370c = i10 + 1;
                this.f15372e = i12 + 1;
                cArr[i12] = ' ';
                while (true) {
                    i = this.f15370c;
                    i6 = this.f15369b;
                    if (i >= i6) {
                        break;
                    }
                    char[] cArr3 = this.f15374g;
                    if (cArr3[i] != ' ') {
                        break;
                    }
                    int i13 = this.f15372e;
                    this.f15372e = i13 + 1;
                    cArr3[i13] = ' ';
                    this.f15370c = i + 1;
                }
                if (i == i6 || (c9 = this.f15374g[i]) == ',' || c9 == '+' || c9 == ';') {
                    break;
                }
            } else {
                if (c10 == ';') {
                    break;
                }
                if (c10 == '\\') {
                    int i14 = this.f15372e;
                    this.f15372e = i14 + 1;
                    cArr[i14] = e();
                    this.f15370c++;
                } else {
                    if (c10 == '+' || c10 == ',') {
                        break;
                    }
                    int i15 = this.f15372e;
                    this.f15372e = i15 + 1;
                    cArr[i15] = c10;
                    this.f15370c = i10 + 1;
                }
            }
        }
        int i16 = this.f15371d;
        return new String(cArr, i16, this.f15372e - i16);
    }

    private char e() {
        int i = this.f15370c + 1;
        this.f15370c = i;
        if (i == this.f15369b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
        }
        char c9 = this.f15374g[i];
        if (c9 == ' ' || c9 == '%' || c9 == '\\' || c9 == '_' || c9 == '\"' || c9 == '#') {
            return c9;
        }
        switch (c9) {
            case '*':
            case j.f5811R /* 43 */:
            case j.f5812S /* 44 */:
                return c9;
            default:
                switch (c9) {
                    case j.v.f12591n /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        return c9;
                    default:
                        return f();
                }
        }
    }

    private char f() {
        int i;
        int i6;
        int a9 = a(this.f15370c);
        this.f15370c++;
        if (a9 < 128) {
            return (char) a9;
        }
        if (a9 < 192 || a9 > 247) {
            return '?';
        }
        if (a9 <= 223) {
            i = a9 & 31;
            i6 = 1;
        } else if (a9 <= 239) {
            i = a9 & 15;
            i6 = 2;
        } else {
            i = a9 & 7;
            i6 = 3;
        }
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f15370c;
            int i11 = i10 + 1;
            this.f15370c = i11;
            if (i11 == this.f15369b || this.f15374g[i11] != '\\') {
                return '?';
            }
            int i12 = i10 + 2;
            this.f15370c = i12;
            int a10 = a(i12);
            this.f15370c++;
            if ((a10 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (a10 & 63);
        }
        return (char) i;
    }

    private int a(int i) {
        int i6;
        int i9;
        int i10 = i + 1;
        if (i10 < this.f15369b) {
            char[] cArr = this.f15374g;
            char c9 = cArr[i];
            if (c9 >= '0' && c9 <= '9') {
                i6 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i6 = c9 - 'W';
            } else {
                if (c9 < 'A' || c9 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f15368a);
                }
                i6 = c9 - '7';
            }
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i9 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i9 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f15368a);
                }
                i9 = c10 - '7';
            }
            return (i6 << 4) + i9;
        }
        throw new IllegalStateException("Malformed DN: " + this.f15368a);
    }

    private String a(String str) {
        String str2;
        this.f15370c = 0;
        this.f15371d = 0;
        this.f15372e = 0;
        this.f15373f = 0;
        this.f15374g = this.f15368a.toCharArray();
        String a9 = a();
        if (a9 == null) {
            return null;
        }
        do {
            int i = this.f15370c;
            if (i == this.f15369b) {
                return null;
            }
            char c9 = this.f15374g[i];
            if (c9 == '\"') {
                int i6 = i + 1;
                this.f15370c = i6;
                this.f15371d = i6;
                this.f15372e = i6;
                while (true) {
                    int i9 = this.f15370c;
                    if (i9 != this.f15369b) {
                        char[] cArr = this.f15374g;
                        char c10 = cArr[i9];
                        if (c10 == '\"') {
                            this.f15370c = i9 + 1;
                            while (true) {
                                int i10 = this.f15370c;
                                if (i10 >= this.f15369b || this.f15374g[i10] != ' ') {
                                    break;
                                }
                                this.f15370c = i10 + 1;
                            }
                            char[] cArr2 = this.f15374g;
                            int i11 = this.f15371d;
                            str2 = new String(cArr2, i11, this.f15372e - i11);
                        } else {
                            if (c10 == '\\') {
                                cArr[this.f15372e] = e();
                            } else {
                                cArr[this.f15372e] = c10;
                            }
                            this.f15370c++;
                            this.f15372e++;
                        }
                    } else {
                        throw new IllegalStateException("Unexpected end of DN: " + this.f15368a);
                    }
                }
            } else if (c9 == '#') {
                str2 = c();
            } else if (c9 != '+' && c9 != ',' && c9 != ';') {
                str2 = d();
            } else {
                str2 = "";
            }
            if (str.equalsIgnoreCase(a9)) {
                return str2;
            }
            int i12 = this.f15370c;
            if (i12 >= this.f15369b) {
                return null;
            }
            char c11 = this.f15374g[i12];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f15368a);
            }
            this.f15370c = i12 + 1;
            a9 = a();
        } while (a9 != null);
        throw new IllegalStateException("Malformed DN: " + this.f15368a);
    }
}
