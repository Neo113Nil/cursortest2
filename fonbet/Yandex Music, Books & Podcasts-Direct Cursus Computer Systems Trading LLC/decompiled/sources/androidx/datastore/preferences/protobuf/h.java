package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;
import defpackage.dfi;
import defpackage.jj4;
import defpackage.xq0;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {
    public int a;
    public i b;

    public static final class a extends h {
        public final byte[] c;
        public int d;
        public int e;
        public int g;
        public int h = Integer.MAX_VALUE;
        public int f = 0;

        public a(byte[] bArr, int i) {
            this.c = bArr;
            this.d = i;
        }

        public final int A() {
            int i;
            int i2 = this.f;
            int i3 = this.d;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.c;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f = i5;
                    return i;
                }
            }
            return (int) C();
        }

        public final long B() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f;
            int i2 = this.d;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.c;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.f = i4;
                    return j;
                }
            }
            return C();
        }

        public final long C() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f;
                if (i2 == this.d) {
                    throw v.f();
                }
                this.f = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.c[i2] & 128) == 0) {
                    return j;
                }
            }
            throw v.c();
        }

        public final void D() {
            int i = this.d + this.e;
            this.d = i;
            int i2 = this.h;
            if (i <= i2) {
                this.e = 0;
                return;
            }
            int i3 = i - i2;
            this.e = i3;
            this.d = i - i3;
        }

        public final void E(int i) {
            if (i >= 0) {
                int i2 = this.d;
                int i3 = this.f;
                if (i <= i2 - i3) {
                    this.f = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw v.f();
            }
            throw v.d();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final void a(int i) {
            if (this.g != i) {
                throw new v("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int b() {
            return this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean c() {
            return this.f == this.d;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final void d(int i) {
            this.h = i;
            D();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int e(int i) {
            if (i < 0) {
                throw v.d();
            }
            int i2 = i + this.f;
            int i3 = this.h;
            if (i2 > i3) {
                throw v.f();
            }
            this.h = i2;
            D();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean f() {
            return B() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final g g() {
            byte[] bArr;
            int A = A();
            byte[] bArr2 = this.c;
            if (A > 0) {
                int i = this.d;
                int i2 = this.f;
                if (A <= i - i2) {
                    g g = g.g(bArr2, i2, A);
                    this.f += A;
                    return g;
                }
            }
            if (A == 0) {
                return g.b;
            }
            if (A > 0) {
                int i3 = this.d;
                int i4 = this.f;
                if (A <= i3 - i4) {
                    int i5 = A + i4;
                    this.f = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    g gVar = g.b;
                    return new g.e(bArr);
                }
            }
            if (A > 0) {
                throw v.f();
            }
            if (A != 0) {
                throw v.d();
            }
            bArr = u.b;
            g gVar2 = g.b;
            return new g.e(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final double h() {
            return Double.longBitsToDouble(z());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int i() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int j() {
            return y();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long k() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final float l() {
            return Float.intBitsToFloat(y());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int m() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long n() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int o() {
            return y();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long p() {
            return z();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int q() {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long r() {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final String s() {
            int A = A();
            if (A > 0) {
                int i = this.d;
                int i2 = this.f;
                if (A <= i - i2) {
                    String str = new String(this.c, i2, A, u.a);
                    this.f += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw v.d();
            }
            throw v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final String t() {
            int A = A();
            if (A > 0) {
                int i = this.d;
                int i2 = this.f;
                if (A <= i - i2) {
                    String a = c1.a.a(this.c, i2, A);
                    this.f += A;
                    return a;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw v.d();
            }
            throw v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int u() {
            if (c()) {
                this.g = 0;
                return 0;
            }
            int A = A();
            this.g = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new v("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int v() {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long w() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean x(int i) {
            int u;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.d - this.f;
                byte[] bArr = this.c;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.f;
                        this.f = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw v.c();
                }
                while (i3 < 10) {
                    int i6 = this.f;
                    if (i6 == this.d) {
                        throw v.f();
                    }
                    this.f = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw v.c();
                return true;
            }
            if (i2 == 1) {
                E(8);
                return true;
            }
            if (i2 == 2) {
                E(A());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw v.b();
                }
                E(4);
                return true;
            }
            do {
                u = u();
                if (u == 0) {
                    break;
                }
            } while (x(u));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final int y() {
            int i = this.f;
            if (this.d - i < 4) {
                throw v.f();
            }
            this.f = i + 4;
            byte[] bArr = this.c;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long z() {
            int i = this.f;
            if (this.d - i < 8) {
                throw v.f();
            }
            this.f = i + 8;
            byte[] bArr = this.c;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
    }

    public static final class b extends h {
        public final FileInputStream c;
        public final byte[] d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = u.a;
            this.c = fileInputStream;
            this.d = new byte[4096];
            this.e = 0;
            this.g = 0;
            this.i = 0;
        }

        public final ArrayList A(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.c.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw v.f();
                    }
                    this.i += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() {
            int i = this.g;
            if (this.e - i < 4) {
                H(4);
                i = this.g;
            }
            this.g = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long C() {
            int i = this.g;
            if (this.e - i < 8) {
                H(8);
                i = this.g;
            }
            this.g = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int D() {
            int i;
            int i2 = this.g;
            int i3 = this.e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.d;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.g = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.g = i5;
                    return i;
                }
            }
            return (int) F();
        }

        public final long E() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.g;
            int i2 = this.e;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.d;
                byte b = bArr[i];
                if (b >= 0) {
                    this.g = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.g = i4;
                    return j;
                }
            }
            return F();
        }

        public final long F() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.g == this.e) {
                    H(1);
                }
                int i2 = this.g;
                this.g = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            }
            throw v.c();
        }

        public final void G() {
            int i = this.e + this.f;
            this.e = i;
            int i2 = this.i + i;
            int i3 = this.j;
            if (i2 <= i3) {
                this.f = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
        }

        public final void H(int i) {
            if (J(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
                throw v.f();
            }
            throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void I(int i) {
            int i2 = this.e;
            int i3 = this.g;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.g = i3 + i;
                return;
            }
            FileInputStream fileInputStream = this.c;
            if (i < 0) {
                throw v.d();
            }
            int i5 = this.i;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.j;
            if (i7 > i8) {
                I((i8 - i5) - i3);
                throw v.f();
            }
            this.i = i6;
            this.e = 0;
            this.g = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } finally {
                    this.i += i4;
                    G();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i9 = this.e;
            int i10 = i9 - this.g;
            this.g = i9;
            H(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.e;
                if (i11 <= i12) {
                    this.g = i11;
                    return;
                } else {
                    i10 += i12;
                    this.g = i12;
                    H(1);
                }
            }
        }

        public final boolean J(int i) {
            int i2 = this.g;
            int i3 = i2 + i;
            int i4 = this.e;
            if (i3 <= i4) {
                xq0.q(dfi.c(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i5 = this.i;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
                byte[] bArr = this.d;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.i += i2;
                    this.e -= i2;
                    this.g = 0;
                }
                int i6 = this.e;
                int min = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6);
                FileInputStream fileInputStream = this.c;
                int read = fileInputStream.read(bArr, i6, min);
                if (read == 0 || read < -1 || read > bArr.length) {
                    jj4.e(read, fileInputStream.getClass());
                    return false;
                }
                if (read > 0) {
                    this.e += read;
                    G();
                    if (this.e >= i) {
                        return true;
                    }
                    return J(i);
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final void a(int i) {
            if (this.h != i) {
                throw new v("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int b() {
            return this.i + this.g;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean c() {
            return this.g == this.e && !J(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final void d(int i) {
            this.j = i;
            G();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int e(int i) {
            if (i < 0) {
                throw v.d();
            }
            int i2 = this.i + this.g + i;
            int i3 = this.j;
            if (i2 > i3) {
                throw v.f();
            }
            this.j = i2;
            G();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean f() {
            return E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final g g() {
            int D = D();
            int i = this.e;
            int i2 = this.g;
            int i3 = i - i2;
            byte[] bArr = this.d;
            if (D <= i3 && D > 0) {
                g g = g.g(bArr, i2, D);
                this.g += D;
                return g;
            }
            if (D == 0) {
                return g.b;
            }
            byte[] z = z(D);
            if (z != null) {
                return g.g(z, 0, z.length);
            }
            int i4 = this.g;
            int i5 = this.e;
            int i6 = i5 - i4;
            this.i += i5;
            this.g = 0;
            this.e = 0;
            ArrayList A = A(D - i6);
            byte[] bArr2 = new byte[D];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                i6 += bArr3.length;
            }
            g gVar = g.b;
            return new g.e(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final double h() {
            return Double.longBitsToDouble(C());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int i() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int j() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long k() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final float l() {
            return Float.intBitsToFloat(B());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int m() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long n() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int o() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long p() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int q() {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long r() {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final String s() {
            int D = D();
            byte[] bArr = this.d;
            if (D > 0) {
                int i = this.e;
                int i2 = this.g;
                if (D <= i - i2) {
                    String str = new String(bArr, i2, D, u.a);
                    this.g += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D > this.e) {
                return new String(y(D), u.a);
            }
            H(D);
            String str2 = new String(bArr, this.g, D, u.a);
            this.g += D;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final String t() {
            int D = D();
            int i = this.g;
            int i2 = this.e;
            int i3 = i2 - i;
            byte[] bArr = this.d;
            if (D <= i3 && D > 0) {
                this.g = i + D;
            } else {
                if (D == 0) {
                    return "";
                }
                i = 0;
                if (D <= i2) {
                    H(D);
                    this.g = D;
                } else {
                    bArr = y(D);
                }
            }
            return c1.a.a(bArr, i, D);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int u() {
            if (c()) {
                this.h = 0;
                return 0;
            }
            int D = D();
            this.h = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new v("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final int v() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final long w() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean x(int i) {
            int u;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.e - this.g;
                byte[] bArr = this.d;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.g;
                        this.g = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw v.c();
                }
                while (i3 < 10) {
                    if (this.g == this.e) {
                        H(1);
                    }
                    int i6 = this.g;
                    this.g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw v.c();
                return true;
            }
            if (i2 == 1) {
                I(8);
                return true;
            }
            if (i2 == 2) {
                I(D());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw v.b();
                }
                I(4);
                return true;
            }
            do {
                u = u();
                if (u == 0) {
                    break;
                }
            } while (x(u));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] y(int i) {
            byte[] z = z(i);
            if (z != null) {
                return z;
            }
            int i2 = this.g;
            int i3 = this.e;
            int i4 = i3 - i2;
            this.i += i3;
            this.g = 0;
            this.e = 0;
            ArrayList A = A(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.d, i2, bArr, 0, i4);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i) {
            if (i == 0) {
                return u.b;
            }
            if (i < 0) {
                throw v.d();
            }
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.j;
            if (i4 > i5) {
                I((i5 - i2) - i3);
                throw v.f();
            }
            int i6 = this.e - i3;
            int i7 = i - i6;
            FileInputStream fileInputStream = this.c;
            if (i7 >= 4096 && i7 > fileInputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.d, this.g, bArr, 0, i6);
            this.i += this.e;
            this.g = 0;
            this.e = 0;
            while (i6 < i) {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw v.f();
                }
                this.i += read;
                i6 += read;
            }
            return bArr;
        }
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);
}
