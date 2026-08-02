package defpackage;

import com.yandex.pulse.metrics.o;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class i0 extends FilterInputStream {
    public final int a;
    public final boolean b;
    public final byte[][] c;

    public i0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public static int D(int i, InputStream inputStream) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            kac.f("corrupted stream - high tag number < 31 found");
            return 0;
        }
        int i3 = read & 127;
        if (i3 == 0) {
            kac.f("corrupted stream - invalid high tag number found");
            return 0;
        }
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                kac.f("Tag number more than 31 bits");
                return 0;
            }
            int i4 = i3 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i3 = i4 | (read2 & 127);
            read = read2;
        }
        return i3;
    }

    public static s0 b(int i, uu7 uu7Var, byte[][] bArr) {
        switch (i) {
            case 1:
                return b0.B(g(uu7Var, bArr));
            case 2:
                return new j0(uu7Var.b());
            case 3:
                return z.B(uu7Var.b());
            case 4:
                return new a07(uu7Var.b());
            case 5:
                if (uu7Var.b().length == 0) {
                    return yz6.a;
                }
                xq0.q("malformed NULL encoding encountered");
                return null;
            case 6:
                return n0.B(g(uu7Var, bArr), true);
            case 7:
                return new l0(new wz6(uu7Var.b()));
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                kac.f(dfi.c(i, "unknown tag ", " encountered"));
                return null;
            case 10:
                byte[] g = g(uu7Var, bArr);
                if (g.length > 1) {
                    return new f0(g, true);
                }
                if (g.length == 0) {
                    xq0.x("ENUMERATED has zero length");
                    return null;
                }
                int i2 = g[0] & 255;
                if (i2 >= 12) {
                    return new f0(g, true);
                }
                f0[] f0VarArr = f0.b;
                f0 f0Var = f0VarArr[i2];
                if (f0Var == null) {
                    f0Var = new f0(g, true);
                    f0VarArr[i2] = f0Var;
                }
                return f0Var;
            case 12:
                return new g07(uu7Var.b());
            case 13:
                return new t0(uu7Var.b());
            case 18:
                return new zz6(uu7Var.b());
            case 19:
                return new c07(uu7Var.b());
            case 20:
                return new f07(uu7Var.b());
            case 21:
                return new i07(uu7Var.b());
            case 22:
                return new xz6(uu7Var.b());
            case 23:
                return new a1(uu7Var.b());
            case 24:
                return new h0(uu7Var.b());
            case 25:
                return new wz6(uu7Var.b());
            case 26:
                return new j07(uu7Var.b());
            case 27:
                return new uz6(uu7Var.b());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new h07(uu7Var.b());
            case 30:
                int i3 = uu7Var.d;
                if ((i3 & 1) != 0) {
                    kac.f("malformed BMPString encoding encountered");
                    return null;
                }
                int i4 = i3 / 2;
                char[] cArr = new char[i4];
                byte[] bArr2 = new byte[8];
                int i5 = 0;
                int i6 = 0;
                while (i3 >= 8) {
                    if (zdg.C(uu7Var, bArr2, 8) != 8) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    cArr[i6] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                    cArr[i6 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                    cArr[i6 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                    cArr[i6 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                    i6 += 4;
                    i3 -= 8;
                }
                if (i3 > 0) {
                    if (zdg.C(uu7Var, bArr2, i3) != i3) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    do {
                        int i7 = i5 + 1;
                        int i8 = bArr2[i5] << 8;
                        i5 += 2;
                        cArr[i6] = (char) ((bArr2[i7] & 255) | i8);
                        i6++;
                    } while (i5 < i3);
                }
                if (uu7Var.d == 0 && i4 == i6) {
                    return new rz6(cArr);
                }
                e7o.n();
                return null;
        }
    }

    public static byte[] g(uu7 uu7Var, byte[][] bArr) {
        int i = uu7Var.d;
        if (i >= bArr.length) {
            return uu7Var.b();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            xq0.x("buffer length not right for data");
            return null;
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = uu7Var.b;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + uu7Var.d + " >= " + i2);
        }
        int C = i - zdg.C(uu7Var.a, bArr2, bArr2.length);
        uu7Var.d = C;
        if (C == 0) {
            uu7Var.a();
            return bArr2;
        }
        wb8.g(uu7Var.c, uu7Var.d);
        return null;
    }

    public static int o(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            kac.f("invalid long form definite-length 0xFF");
            return 0;
        }
        int i2 = read & 127;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                kac.f("long form definite-length more than 31 bits");
                return 0;
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        kac.f(f1d.e(i3, i, "corrupted stream - out of bounds length found: ", " >= "));
        return 0;
    }

    public final e0 H(uu7 uu7Var) {
        int i = uu7Var.d;
        if (i < 1) {
            return new e0(0);
        }
        i0 i0Var = new i0(uu7Var, i, this.b, this.c);
        s0 z = i0Var.z();
        if (z == null) {
            return new e0(0);
        }
        e0 e0Var = new e0(0, (byte) 0);
        do {
            e0Var.e(z);
            z = i0Var.z();
        } while (z != null);
        return e0Var;
    }

    public final s0 a(int i, int i2, int i3) {
        uu7 uu7Var = new uu7(this, i3, this.a);
        if ((i & 224) == 0) {
            return b(i2, uu7Var, this.c);
        }
        int i4 = i & 192;
        int i5 = 4;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                return z0.B(i4, i2, H(uu7Var));
            }
            ki2 ki2Var = new ki2(i5, i4, i2, new a07(uu7Var.b()), 2);
            return i4 != 64 ? ki2Var : new a67(ki2Var);
        }
        int i6 = 0;
        if (i2 == 3) {
            e0 H = H(uu7Var);
            int i7 = H.c;
            z[] zVarArr = new z[i7];
            while (i6 != i7) {
                d0 g = H.g(i6);
                if (!(g instanceof z)) {
                    wb8.i(g.getClass(), "unknown object encountered in constructed BIT STRING: ");
                    return null;
                }
                zVarArr[i6] = (z) g;
                i6++;
            }
            return new ci2(zVarArr);
        }
        if (i2 == 4) {
            e0 H2 = H(uu7Var);
            int i8 = H2.c;
            o0[] o0VarArr = new o0[i8];
            while (i6 != i8) {
                d0 g2 = H2.g(i6);
                if (!(g2 instanceof o0)) {
                    wb8.i(g2.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
                o0VarArr[i6] = (o0) g2;
                i6++;
            }
            return new fi2(fi2.D(o0VarArr), o0VarArr);
        }
        if (i2 == 8) {
            f67 a = d67.a(H(uu7Var));
            a.getClass();
            return new tz6(a);
        }
        if (i2 != 16) {
            if (i2 == 17) {
                return d67.b(H(uu7Var));
            }
            kac.f(dfi.c(i2, "unknown tag ", " encountered"));
            return null;
        }
        if (uu7Var.d < 1) {
            return d67.a;
        }
        if (!this.b) {
            return d67.a(H(uu7Var));
        }
        byte[] b = uu7Var.b();
        wrf wrfVar = new wrf();
        wrfVar.c = b;
        return wrfVar;
    }

    public final s0 z() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            kac.f("unexpected end-of-contents marker");
            return null;
        }
        int D = D(read, this);
        int i = this.a;
        int o = o(this, i, false);
        if (o >= 0) {
            try {
                return a(read, D, o);
            } catch (IllegalArgumentException e) {
                throw new g0("corrupted stream detected", e);
            }
        }
        if ((read & 32) == 0) {
            kac.f("indefinite-length primitive encoding encountered");
            return null;
        }
        x0 x0Var = new x0(new nie(i, this), i, this.c, 0);
        int i2 = read & 192;
        if (i2 != 0) {
            return x0Var.S(i2, D);
        }
        if (D == 3) {
            return di2.b(x0Var);
        }
        if (D == 4) {
            return gi2.b(x0Var);
        }
        if (D == 8) {
            return ii2.b(x0Var);
        }
        if (D == 16) {
            return new hi2(x0Var.X());
        }
        if (D == 17) {
            return new ji2(x0Var.X());
        }
        kac.f("unknown BER object encountered");
        return null;
    }

    public i0(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public i0(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11][]);
    }

    public i0(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }
}
