package defpackage;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class w5v extends ies0 {
    public static final qir b = new qir(15);
    public final u5v a;

    public w5v(u5v u5vVar) {
        this.a = u5vVar;
    }

    public static mo2 d(ef90 ef90Var, int i, int i2) {
        int v;
        String concat;
        int y = ef90Var.y();
        Charset s = s(y);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ef90Var.i(0, i3, bArr);
        if (i2 == 2) {
            concat = "image/" + f0b1.g(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String g = f0b1.g(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            concat = g.indexOf(47) == -1 ? "image/".concat(g) : g;
        }
        int i4 = bArr[v + 1] & 255;
        int i5 = v + 2;
        int u = u(i5, y, bArr);
        String str = new String(bArr, i5, u - i5, s);
        int r = r(y) + u;
        return new mo2(concat, str, i4, i3 <= r ? tw21.c : Arrays.copyOfRange(bArr, r, i3));
    }

    public static ri9 e(ef90 ef90Var, int i, int i2, boolean z, int i3, u5v u5vVar) {
        int i4 = ef90Var.b;
        int v = v(i4, ef90Var.a);
        String str = new String(ef90Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        ef90Var.K(v + 1);
        int k = ef90Var.k();
        int k2 = ef90Var.k();
        long A = ef90Var.A();
        if (A == _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
            A = -1;
        }
        long A2 = ef90Var.A();
        long j = A2 == _Gost_CryptoPro_PrivateKeyValues.maxDWORD ? -1L : A2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (ef90Var.b < i5) {
            x5v h = h(i2, ef90Var, z, i3, u5vVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new ri9(str, k, k2, A, j, (x5v[]) arrayList.toArray(new x5v[0]));
    }

    public static si9 f(ef90 ef90Var, int i, int i2, boolean z, int i3, u5v u5vVar) {
        int i4 = ef90Var.b;
        int v = v(i4, ef90Var.a);
        String str = new String(ef90Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        ef90Var.K(v + 1);
        int y = ef90Var.y();
        boolean z2 = (y & 2) != 0;
        boolean z3 = (y & 1) != 0;
        int y2 = ef90Var.y();
        String[] strArr = new String[y2];
        for (int i5 = 0; i5 < y2; i5++) {
            int i6 = ef90Var.b;
            int v2 = v(i6, ef90Var.a);
            strArr[i5] = new String(ef90Var.a, i6, v2 - i6, StandardCharsets.ISO_8859_1);
            ef90Var.K(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (ef90Var.b < i7) {
            x5v h = h(i2, ef90Var, z, i3, u5vVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new si9(str, z2, z3, strArr, (x5v[]) arrayList.toArray(new x5v[0]));
    }

    public static gmc g(int i, ef90 ef90Var) {
        if (i < 4) {
            return null;
        }
        int y = ef90Var.y();
        Charset s = s(y);
        byte[] bArr = new byte[3];
        ef90Var.i(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ef90Var.i(0, i2, bArr2);
        int u = u(0, y, bArr2);
        String str2 = new String(bArr2, 0, u, s);
        int r = r(y) + u;
        return new gmc(str, str2, l(bArr2, r, u(r, y, bArr2), s));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [x5v] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [ef90] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x5v h(int i, ef90 ef90Var, boolean z, int i2, u5v u5vVar) {
        int C;
        int i3;
        int i4;
        int i5;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ef90 ef90Var2;
        int i6;
        int i7;
        ef90 ef90Var3;
        Throwable th;
        int i8;
        ef90 ef90Var4;
        ?? r12;
        s820 pt5Var;
        int i9 = i;
        int y = ef90Var.y();
        int y2 = ef90Var.y();
        int y3 = ef90Var.y();
        int y4 = i9 >= 3 ? ef90Var.y() : 0;
        if (i9 == 4) {
            C = ef90Var.C();
            if (!z) {
                C = (((C >> 24) & 255) << 21) | (C & 255) | (((C >> 8) & 255) << 7) | (((C >> 16) & 255) << 14);
            }
        } else {
            C = i9 == 3 ? ef90Var.C() : ef90Var.B();
        }
        int i10 = C;
        int E = i9 >= 3 ? ef90Var.E() : 0;
        if (y == 0 && y2 == 0 && y3 == 0 && y4 == 0 && i10 == 0 && E == 0) {
            ef90Var.K(ef90Var.c);
            return null;
        }
        int i11 = ef90Var.b + i10;
        if (i11 > ef90Var.c) {
            lk91.j("Frame size exceeds remaining tag data");
            ef90Var.K(ef90Var.c);
            return null;
        }
        if (u5vVar != null) {
            boolean f = u5vVar.f(i9, y, y2, y3, y4);
            i9 = i9;
            r1 = y2;
            i3 = y;
            i4 = y3;
            i5 = y4;
            if (!f) {
                ef90Var.K(i11);
                return null;
            }
        } else {
            i3 = y;
            i4 = y3;
            i5 = y4;
            r1 = y2;
        }
        if (i9 == 3) {
            z2 = (E & 128) != 0;
            z3 = (E & 64) != 0;
            z6 = false;
            z5 = (E & 32) != 0;
            z4 = z2;
        } else if (i9 == 4) {
            boolean z7 = (E & 64) != 0;
            boolean z8 = (E & 8) != 0;
            boolean z9 = (E & 4) != 0;
            z6 = (E & 2) != 0;
            z4 = (E & 1) != 0;
            boolean z10 = z9;
            z5 = z7;
            z2 = z8;
            z3 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z3) {
            lk91.j("Skipping unsupported compressed or encrypted frame");
            ef90Var.K(i11);
            return null;
        }
        if (z5) {
            i10--;
            ef90Var.L(1);
        }
        if (z4) {
            i10 -= 4;
            ef90Var.L(4);
        }
        if (z6) {
            i10 = w(i10, ef90Var);
        }
        try {
            try {
            } catch (Exception | OutOfMemoryError e) {
                e = e;
                i6 = r1;
                i7 = i4;
                ef90Var3 = ef90Var;
                i4 = i10;
                th = null;
            }
            if (i3 == 84 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
                pt5Var = o(i10, ef90Var);
            } else if (i3 == 84) {
                pt5Var = m(i10, ef90Var, t(i9, i3, r1, i4, i5));
            } else if (i3 == 87 && r1 == 88 && i4 == 88 && (i9 == 2 || i5 == 88)) {
                pt5Var = q(i10, ef90Var);
            } else if (i3 == 87) {
                pt5Var = p(i10, ef90Var, t(i9, i3, r1, i4, i5));
            } else if (i3 == 80 && r1 == 82 && i4 == 73 && i5 == 86) {
                pt5Var = k(i10, ef90Var);
            } else {
                if (i3 != 71 || r1 != 69 || i4 != 79 || (i5 != 66 && i9 != 2)) {
                    th = null;
                    try {
                    } catch (Exception | OutOfMemoryError e2) {
                        e = e2;
                        i6 = r1;
                        i7 = i4;
                        ef90Var3 = ef90Var;
                        i4 = i10;
                        i8 = i5;
                        ef90Var4 = ef90Var3;
                        ef90Var4.K(i11);
                        r12 = th;
                        if (r12 == 0) {
                        }
                        return r12;
                    }
                    if (i9 != 2 ? i3 == 65 && r1 == 80 && i4 == 73 && i5 == 67 : i3 == 80 && r1 == 73 && i4 == 67) {
                        pt5Var = d(ef90Var, i10, i9);
                    } else {
                        if (i3 != 67 || r1 != 79 || i4 != 77 || (i5 != 77 && i9 != 2)) {
                            if (i3 == 67 && r1 == 72 && i4 == 65 && i5 == 80) {
                                i6 = r1;
                                i7 = i4;
                                i4 = i10;
                                i8 = i5;
                                try {
                                    pt5Var = e(ef90Var, i4, i9, z, i2, u5vVar);
                                    i9 = i;
                                    r1 = ef90Var;
                                } catch (Exception | OutOfMemoryError e3) {
                                    e = e3;
                                    i9 = i;
                                    ef90Var4 = ef90Var;
                                    ef90Var4.K(i11);
                                    r12 = th;
                                    if (r12 == 0) {
                                    }
                                    return r12;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ef90Var2 = ef90Var;
                                    ef90Var2.K(i11);
                                    throw th;
                                }
                            } else {
                                i6 = r1;
                                i7 = i4;
                                i4 = i10;
                                i8 = i5;
                                try {
                                    if (i3 == 67 && i6 == 84 && i7 == 79 && i8 == 67) {
                                        i9 = i;
                                        ef90 ef90Var5 = ef90Var;
                                        pt5Var = f(ef90Var5, i4, i9, z, i2, u5vVar);
                                        r1 = ef90Var5;
                                    } else {
                                        i9 = i;
                                        ef90 ef90Var6 = ef90Var;
                                        if (i3 == 77 && i6 == 76 && i7 == 76 && i8 == 84) {
                                            pt5Var = j(i4, ef90Var6);
                                            r1 = ef90Var6;
                                        } else {
                                            String t = t(i9, i3, i6, i7, i8);
                                            byte[] bArr = new byte[i4];
                                            ef90Var6.i(0, i4, bArr);
                                            pt5Var = new pt5(t, bArr);
                                            r1 = ef90Var6;
                                        }
                                    }
                                } catch (Exception | OutOfMemoryError e4) {
                                    e = e4;
                                    ef90Var4 = r1;
                                    ef90Var4.K(i11);
                                    r12 = th;
                                    if (r12 == 0) {
                                    }
                                    return r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ef90Var2 = r1;
                                    ef90Var2.K(i11);
                                    throw th;
                                }
                            }
                            r1.K(i11);
                            r12 = pt5Var;
                            e = th;
                            if (r12 == 0) {
                                lk91.k("Failed to decode frame: id=" + t(i9, i3, i6, i7, i8) + ", frameSize=" + i4, e);
                            }
                            return r12;
                        }
                        pt5Var = g(i10, ef90Var);
                    }
                    i6 = r1;
                    i7 = i4;
                    r1 = ef90Var;
                    i4 = i10;
                    r1 = r1;
                    i8 = i5;
                    r1.K(i11);
                    r12 = pt5Var;
                    e = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                pt5Var = i(i10, ef90Var);
            }
            i6 = r1;
            i7 = i4;
            r1 = ef90Var;
            i4 = i10;
            th = null;
            r1 = r1;
            i8 = i5;
            r1.K(i11);
            r12 = pt5Var;
            e = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            ef90Var2 = ef90Var;
        }
    }

    public static m2t i(int i, ef90 ef90Var) {
        int y = ef90Var.y();
        Charset s = s(y);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ef90Var.i(0, i2, bArr);
        int v = v(0, bArr);
        String q = eh20.q(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i3 = v + 1;
        int u = u(i3, y, bArr);
        String l = l(bArr, i3, u, s);
        int r = r(y) + u;
        int u2 = u(r, y, bArr);
        String l2 = l(bArr, r, u2, s);
        int r2 = r(y) + u2;
        return new m2t(q, l, l2, i2 <= r2 ? tw21.c : Arrays.copyOfRange(bArr, r2, i2));
    }

    public static vk20 j(int i, ef90 ef90Var) {
        int E = ef90Var.E();
        int B = ef90Var.B();
        int B2 = ef90Var.B();
        int y = ef90Var.y();
        int y2 = ef90Var.y();
        df90 df90Var = new df90();
        df90Var.l(ef90Var);
        int i2 = ((i - 10) * 8) / (y + y2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int g = df90Var.g(y);
            int g2 = df90Var.g(y2);
            iArr[i3] = g;
            iArr2[i3] = g2;
        }
        return new vk20(E, B, B2, iArr, iArr2);
    }

    public static o3f0 k(int i, ef90 ef90Var) {
        byte[] bArr = new byte[i];
        ef90Var.i(0, i, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i2 = v + 1;
        return new o3f0(str, i <= i2 ? tw21.c : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String l(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static bpy0 m(int i, ef90 ef90Var, String str) {
        if (i < 1) {
            return null;
        }
        int y = ef90Var.y();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ef90Var.i(0, i2, bArr);
        return new bpy0(str, null, n(y, 0, bArr));
    }

    public static ImmutableList n(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return ImmutableList.r("");
        }
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        int u = u(i2, i, bArr);
        while (i2 < u) {
            aVar.a(new String(bArr, i2, u - i2, s(i)));
            i2 = r(i) + u;
            u = u(i2, i, bArr);
        }
        ImmutableList g = aVar.g();
        return g.isEmpty() ? ImmutableList.r("") : g;
    }

    public static bpy0 o(int i, ef90 ef90Var) {
        if (i < 1) {
            return null;
        }
        int y = ef90Var.y();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ef90Var.i(0, i2, bArr);
        int u = u(0, y, bArr);
        return new bpy0("TXXX", new String(bArr, 0, u, s(y)), n(y, r(y) + u, bArr));
    }

    public static ch21 p(int i, ef90 ef90Var, String str) {
        byte[] bArr = new byte[i];
        ef90Var.i(0, i, bArr);
        return new ch21(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static ch21 q(int i, ef90 ef90Var) {
        if (i < 1) {
            return null;
        }
        int y = ef90Var.y();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ef90Var.i(0, i2, bArr);
        int u = u(0, y, bArr);
        String str = new String(bArr, 0, u, s(y));
        int r = r(y) + u;
        return new ch21("WXXX", str, l(bArr, r, v(r, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(int i, int i2, byte[] bArr) {
        int v = v(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return v;
        }
        while (v < bArr.length - 1) {
            if ((v - i) % 2 == 0 && bArr[v + 1] == 0) {
                return v;
            }
            v = v(v + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(int i, ef90 ef90Var) {
        byte[] bArr = ef90Var.a;
        int i2 = ef90Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(ef90 ef90Var, int i, int i2, boolean z) {
        int B;
        long B2;
        int i3;
        int i4;
        int i5 = ef90Var.b;
        while (true) {
            try {
                boolean z2 = true;
                if (ef90Var.a() < i2) {
                    ef90Var.K(i5);
                    return true;
                }
                if (i >= 3) {
                    B = ef90Var.k();
                    B2 = ef90Var.A();
                    i3 = ef90Var.E();
                } else {
                    B = ef90Var.B();
                    B2 = ef90Var.B();
                    i3 = 0;
                }
                if (B == 0 && B2 == 0 && i3 == 0) {
                    ef90Var.K(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & B2) != 0) {
                        ef90Var.K(i5);
                        return false;
                    }
                    B2 = (((B2 >> 24) & 255) << 21) | (B2 & 255) | (((B2 >> 8) & 255) << 7) | (((B2 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i4 = (i3 & 64) != 0 ? 1 : 0;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        i4 += 4;
                    }
                    if (B2 < i4) {
                        ef90Var.K(i5);
                        return false;
                    }
                    if (ef90Var.a() < B2) {
                        ef90Var.K(i5);
                        return false;
                    }
                    ef90Var.L((int) B2);
                }
            } catch (Throwable th) {
                ef90Var.K(i5);
                throw th;
            }
        }
    }

    @Override // defpackage.ies0
    public final w820 b(d920 d920Var, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w820 c(int i, byte[] bArr) {
        v5v v5vVar;
        ArrayList arrayList = new ArrayList();
        ef90 ef90Var = new ef90(bArr, i);
        boolean z = false;
        if (ef90Var.a() < 10) {
            lk91.j("Data too short to be an ID3 tag");
        } else {
            int B = ef90Var.B();
            if (B == 4801587) {
                int y = ef90Var.y();
                ef90Var.L(1);
                int y2 = ef90Var.y();
                int x = ef90Var.x();
                if (y == 2) {
                    if ((y2 & 64) != 0) {
                        lk91.j("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    v5vVar = new v5v(y, y >= 4 && (y2 & 128) != 0, x);
                } else {
                    if (y == 3) {
                        if ((y2 & 64) != 0) {
                            int k = ef90Var.k();
                            ef90Var.L(k);
                            x -= k + 4;
                        }
                    } else if (y == 4) {
                        if ((y2 & 64) != 0) {
                            int x2 = ef90Var.x();
                            ef90Var.L(x2 - 4);
                            x -= x2;
                        }
                        if ((y2 & 16) != 0) {
                            x -= 10;
                        }
                    } else {
                        xvz.v(y, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    v5vVar = new v5v(y, y >= 4 && (y2 & 128) != 0, x);
                }
                if (v5vVar != null) {
                    return null;
                }
                int i2 = v5vVar.a;
                int i3 = ef90Var.b;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = v5vVar.c;
                if (v5vVar.b) {
                    i5 = w(i5, ef90Var);
                }
                ef90Var.J(i3 + i5);
                if (!x(ef90Var, i2, i4, false)) {
                    if (i2 != 4 || !x(ef90Var, 4, i4, true)) {
                        xvz.v(i2, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z = true;
                }
                while (ef90Var.a() >= i4) {
                    x5v h = h(i2, ef90Var, z, i4, this.a);
                    if (h != null) {
                        arrayList.add(h);
                    }
                }
                return new w820(arrayList);
            }
            lk91.j("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(B))));
        }
        v5vVar = null;
        if (v5vVar != null) {
        }
    }

    public w5v() {
        this(null);
    }
}
