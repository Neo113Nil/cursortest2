package com.anythink.core.common.n.b.a.j;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.d.j;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16155a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16156b;

    /* renamed from: c, reason: collision with root package name */
    private int f16157c;

    /* renamed from: d, reason: collision with root package name */
    private int f16158d;

    /* renamed from: e, reason: collision with root package name */
    private int f16159e;

    /* renamed from: f, reason: collision with root package name */
    private int f16160f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f16161g;

    private d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f16155a = name;
        this.f16156b = name.length();
    }

    private String a() {
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        char c9;
        int i11;
        int i12;
        char c10;
        char c11;
        while (true) {
            i = this.f16157c;
            i4 = this.f16156b;
            if (i >= i4 || this.f16161g[i] != ' ') {
                break;
            }
            this.f16157c = i + 1;
        }
        if (i == i4) {
            return null;
        }
        this.f16158d = i;
        this.f16157c = i + 1;
        while (true) {
            i6 = this.f16157c;
            i9 = this.f16156b;
            if (i6 >= i9 || (c11 = this.f16161g[i6]) == '=' || c11 == ' ') {
                break;
            }
            this.f16157c = i6 + 1;
        }
        if (i6 >= i9) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
        }
        this.f16159e = i6;
        if (this.f16161g[i6] == ' ') {
            while (true) {
                i11 = this.f16157c;
                i12 = this.f16156b;
                if (i11 >= i12 || (c10 = this.f16161g[i11]) == '=' || c10 != ' ') {
                    break;
                }
                this.f16157c = i11 + 1;
            }
            if (this.f16161g[i11] != '=' || i11 == i12) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
            }
        }
        do {
            i10 = this.f16157c + 1;
            this.f16157c = i10;
            if (i10 >= this.f16156b) {
                break;
            }
        } while (this.f16161g[i10] == ' ');
        int i13 = this.f16159e;
        int i14 = this.f16158d;
        if (i13 - i14 > 4) {
            char[] cArr = this.f16161g;
            if (cArr[i14 + 3] == '.' && (((c9 = cArr[i14]) == 'O' || c9 == 'o') && ((cArr[i14 + 1] == 'I' || cArr[i14 + 1] == 'i') && (cArr[i14 + 2] == 'D' || cArr[i14 + 2] == 'd')))) {
                this.f16158d = i14 + 4;
            }
        }
        char[] cArr2 = this.f16161g;
        int i15 = this.f16158d;
        return new String(cArr2, i15, i13 - i15);
    }

    private String b() {
        int i = this.f16157c + 1;
        this.f16157c = i;
        this.f16158d = i;
        this.f16159e = i;
        while (true) {
            int i4 = this.f16157c;
            if (i4 == this.f16156b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
            }
            char[] cArr = this.f16161g;
            char c9 = cArr[i4];
            if (c9 == '\"') {
                this.f16157c = i4 + 1;
                while (true) {
                    int i6 = this.f16157c;
                    if (i6 >= this.f16156b || this.f16161g[i6] != ' ') {
                        break;
                    }
                    this.f16157c = i6 + 1;
                }
                char[] cArr2 = this.f16161g;
                int i9 = this.f16158d;
                return new String(cArr2, i9, this.f16159e - i9);
            }
            if (c9 == '\\') {
                cArr[this.f16159e] = e();
            } else {
                cArr[this.f16159e] = c9;
            }
            this.f16157c++;
            this.f16159e++;
        }
    }

    private String c() {
        int i;
        char[] cArr;
        char c9;
        int i4 = this.f16157c;
        if (i4 + 4 >= this.f16156b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
        }
        this.f16158d = i4;
        this.f16157c = i4 + 1;
        while (true) {
            i = this.f16157c;
            if (i == this.f16156b || (c9 = (cArr = this.f16161g)[i]) == '+' || c9 == ',' || c9 == ';') {
                break;
            }
            if (c9 == ' ') {
                this.f16159e = i;
                this.f16157c = i + 1;
                while (true) {
                    int i6 = this.f16157c;
                    if (i6 >= this.f16156b || this.f16161g[i6] != ' ') {
                        break;
                    }
                    this.f16157c = i6 + 1;
                }
            } else {
                if (c9 >= 'A' && c9 <= 'F') {
                    cArr[i] = (char) (c9 + ' ');
                }
                this.f16157c = i + 1;
            }
        }
        this.f16159e = i;
        int i9 = this.f16159e;
        int i10 = this.f16158d;
        int i11 = i9 - i10;
        if (i11 < 5 || (i11 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
        }
        int i12 = i11 / 2;
        byte[] bArr = new byte[i12];
        int i13 = i10 + 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) a(i13);
            i13 += 2;
        }
        return new String(this.f16161g, this.f16158d, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f16160f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String d() {
        char[] cArr;
        int i;
        int i4;
        char c9;
        int i6 = this.f16157c;
        this.f16158d = i6;
        this.f16159e = i6;
        while (true) {
            int i9 = this.f16157c;
            if (i9 >= this.f16156b) {
                char[] cArr2 = this.f16161g;
                int i10 = this.f16158d;
                return new String(cArr2, i10, this.f16159e - i10);
            }
            cArr = this.f16161g;
            char c10 = cArr[i9];
            if (c10 == ' ') {
                int i11 = this.f16159e;
                this.f16160f = i11;
                this.f16157c = i9 + 1;
                this.f16159e = i11 + 1;
                cArr[i11] = ' ';
                while (true) {
                    i = this.f16157c;
                    i4 = this.f16156b;
                    if (i >= i4) {
                        break;
                    }
                    char[] cArr3 = this.f16161g;
                    if (cArr3[i] != ' ') {
                        break;
                    }
                    int i12 = this.f16159e;
                    this.f16159e = i12 + 1;
                    cArr3[i12] = ' ';
                    this.f16157c = i + 1;
                }
                if (i == i4 || (c9 = this.f16161g[i]) == ',' || c9 == '+' || c9 == ';') {
                    break;
                }
            } else {
                if (c10 == ';') {
                    break;
                }
                if (c10 == '\\') {
                    int i13 = this.f16159e;
                    this.f16159e = i13 + 1;
                    cArr[i13] = e();
                    this.f16157c++;
                } else {
                    if (c10 == '+' || c10 == ',') {
                        break;
                    }
                    int i14 = this.f16159e;
                    this.f16159e = i14 + 1;
                    cArr[i14] = c10;
                    this.f16157c = i9 + 1;
                }
            }
        }
        int i15 = this.f16158d;
        return new String(cArr, i15, this.f16159e - i15);
    }

    private char e() {
        int i = this.f16157c + 1;
        this.f16157c = i;
        if (i == this.f16156b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
        }
        char c9 = this.f16161g[i];
        if (c9 == ' ' || c9 == '%' || c9 == '\\' || c9 == '_' || c9 == '\"' || c9 == '#') {
            return c9;
        }
        switch (c9) {
            case '*':
            case j.f6597R /* 43 */:
            case j.f6598S /* 44 */:
                return c9;
            default:
                switch (c9) {
                    case j.v.f13377n /* 59 */:
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
        int i4;
        int a9 = a(this.f16157c);
        this.f16157c++;
        if (a9 < 128) {
            return (char) a9;
        }
        if (a9 < 192 || a9 > 247) {
            return '?';
        }
        if (a9 <= 223) {
            i = a9 & 31;
            i4 = 1;
        } else if (a9 <= 239) {
            i = a9 & 15;
            i4 = 2;
        } else {
            i = a9 & 7;
            i4 = 3;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int i9 = this.f16157c;
            int i10 = i9 + 1;
            this.f16157c = i10;
            if (i10 == this.f16156b || this.f16161g[i10] != '\\') {
                return '?';
            }
            int i11 = i9 + 2;
            this.f16157c = i11;
            int a10 = a(i11);
            this.f16157c++;
            if ((a10 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (a10 & 63);
        }
        return (char) i;
    }

    private int a(int i) {
        int i4;
        int i6;
        int i9 = i + 1;
        if (i9 < this.f16156b) {
            char[] cArr = this.f16161g;
            char c9 = cArr[i];
            if (c9 >= '0' && c9 <= '9') {
                i4 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i4 = c9 - 'W';
            } else {
                if (c9 < 'A' || c9 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f16155a);
                }
                i4 = c9 - '7';
            }
            char c10 = cArr[i9];
            if (c10 >= '0' && c10 <= '9') {
                i6 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i6 = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f16155a);
                }
                i6 = c10 - '7';
            }
            return (i4 << 4) + i6;
        }
        throw new IllegalStateException("Malformed DN: " + this.f16155a);
    }

    private String a(String str) {
        String str2;
        this.f16157c = 0;
        this.f16158d = 0;
        this.f16159e = 0;
        this.f16160f = 0;
        this.f16161g = this.f16155a.toCharArray();
        String a9 = a();
        if (a9 == null) {
            return null;
        }
        do {
            int i = this.f16157c;
            if (i == this.f16156b) {
                return null;
            }
            char c9 = this.f16161g[i];
            if (c9 == '\"') {
                int i4 = i + 1;
                this.f16157c = i4;
                this.f16158d = i4;
                this.f16159e = i4;
                while (true) {
                    int i6 = this.f16157c;
                    if (i6 != this.f16156b) {
                        char[] cArr = this.f16161g;
                        char c10 = cArr[i6];
                        if (c10 == '\"') {
                            this.f16157c = i6 + 1;
                            while (true) {
                                int i9 = this.f16157c;
                                if (i9 >= this.f16156b || this.f16161g[i9] != ' ') {
                                    break;
                                }
                                this.f16157c = i9 + 1;
                            }
                            char[] cArr2 = this.f16161g;
                            int i10 = this.f16158d;
                            str2 = new String(cArr2, i10, this.f16159e - i10);
                        } else {
                            if (c10 == '\\') {
                                cArr[this.f16159e] = e();
                            } else {
                                cArr[this.f16159e] = c10;
                            }
                            this.f16157c++;
                            this.f16159e++;
                        }
                    } else {
                        throw new IllegalStateException("Unexpected end of DN: " + this.f16155a);
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
            int i11 = this.f16157c;
            if (i11 >= this.f16156b) {
                return null;
            }
            char c11 = this.f16161g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f16155a);
            }
            this.f16157c = i11 + 1;
            a9 = a();
        } while (a9 != null);
        throw new IllegalStateException("Malformed DN: " + this.f16155a);
    }
}
