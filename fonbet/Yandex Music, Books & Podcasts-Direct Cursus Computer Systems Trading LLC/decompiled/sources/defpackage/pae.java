package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class pae extends wyf {
    public static final b6e b = new b6e();
    public final nae a;

    public pae(nae naeVar) {
        this.a = naeVar;
    }

    public static int A0(int i, d7k d7kVar) {
        byte[] bArr = d7kVar.a;
        int i2 = d7kVar.b;
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
    public static boolean B0(d7k d7kVar, int i, int i2, boolean z) {
        int y;
        long y2;
        int i3;
        int i4;
        int i5 = d7kVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (d7kVar.a() < i2) {
                    d7kVar.H(i5);
                    return true;
                }
                if (i >= 3) {
                    y = d7kVar.h();
                    y2 = d7kVar.x();
                    i3 = d7kVar.B();
                } else {
                    y = d7kVar.y();
                    y2 = d7kVar.y();
                    i3 = 0;
                }
                if (y == 0 && y2 == 0 && i3 == 0) {
                    d7kVar.H(i5);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & y2) != 0) {
                        d7kVar.H(i5);
                        return false;
                    }
                    y2 = (((y2 >> 24) & 255) << 21) | (y2 & 255) | (((y2 >> 8) & 255) << 7) | (((y2 >> 16) & 255) << 14);
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
                    if (y2 < i4) {
                        d7kVar.H(i5);
                        return false;
                    }
                    if (d7kVar.a() < y2) {
                        d7kVar.H(i5);
                        return false;
                    }
                    d7kVar.I((int) y2);
                }
            } catch (Throwable th) {
                d7kVar.H(i5);
                throw th;
            }
        }
    }

    public static bp0 h0(d7k d7kVar, int i, int i2) {
        int z0;
        String concat;
        int v = d7kVar.v();
        Charset w0 = w0(v);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        d7kVar.f(bArr, 0, i3);
        if (i2 == 2) {
            concat = "image/" + ltg.M(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            z0 = 2;
        } else {
            z0 = z0(0, bArr);
            String M = ltg.M(new String(bArr, 0, z0, StandardCharsets.ISO_8859_1));
            concat = M.indexOf(47) == -1 ? "image/".concat(M) : M;
        }
        int i4 = bArr[z0 + 1] & 255;
        int i5 = z0 + 2;
        int y0 = y0(bArr, i5, v);
        String str = new String(bArr, i5, y0 - i5, w0);
        int v0 = v0(v) + y0;
        return new bp0(concat, str, i3 <= v0 ? dvt.c : Arrays.copyOfRange(bArr, v0, i3), i4);
    }

    public static ld4 i0(d7k d7kVar, int i, int i2, boolean z, int i3, nae naeVar) {
        int i4 = d7kVar.b;
        int z0 = z0(i4, d7kVar.a);
        String str = new String(d7kVar.a, i4, z0 - i4, StandardCharsets.ISO_8859_1);
        d7kVar.H(z0 + 1);
        int h = d7kVar.h();
        int h2 = d7kVar.h();
        long x = d7kVar.x();
        if (x == 4294967295L) {
            x = -1;
        }
        long x2 = d7kVar.x();
        long j = x2 == 4294967295L ? -1L : x2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (d7kVar.b < i5) {
            qae l0 = l0(i2, d7kVar, z, i3, naeVar);
            if (l0 != null) {
                arrayList.add(l0);
            }
        }
        return new ld4(str, h, h2, x, j, (qae[]) arrayList.toArray(new qae[0]));
    }

    public static od4 j0(d7k d7kVar, int i, int i2, boolean z, int i3, nae naeVar) {
        int i4 = d7kVar.b;
        int z0 = z0(i4, d7kVar.a);
        String str = new String(d7kVar.a, i4, z0 - i4, StandardCharsets.ISO_8859_1);
        d7kVar.H(z0 + 1);
        int v = d7kVar.v();
        boolean z2 = (v & 2) != 0;
        boolean z3 = (v & 1) != 0;
        int v2 = d7kVar.v();
        String[] strArr = new String[v2];
        for (int i5 = 0; i5 < v2; i5++) {
            int i6 = d7kVar.b;
            int z02 = z0(i6, d7kVar.a);
            strArr[i5] = new String(d7kVar.a, i6, z02 - i6, StandardCharsets.ISO_8859_1);
            d7kVar.H(z02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (d7kVar.b < i7) {
            qae l0 = l0(i2, d7kVar, z, i3, naeVar);
            if (l0 != null) {
                arrayList.add(l0);
            }
        }
        return new od4(str, z2, z3, strArr, (qae[]) arrayList.toArray(new qae[0]));
    }

    public static ub5 k0(int i, d7k d7kVar) {
        if (i < 4) {
            return null;
        }
        int v = d7kVar.v();
        Charset w0 = w0(v);
        byte[] bArr = new byte[3];
        d7kVar.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        d7kVar.f(bArr2, 0, i2);
        int y0 = y0(bArr2, 0, v);
        String str2 = new String(bArr2, 0, y0, w0);
        int v0 = v0(v) + y0;
        return new ub5(str, str2, p0(bArr2, v0, y0(bArr2, v0, v), w0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01b2, code lost:
    
        if (r5 == 67) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [qae] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [d7k] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qae l0(int i, d7k d7kVar, boolean z, int i2, nae naeVar) {
        int z2;
        int i3;
        ?? r1;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        d7k d7kVar2;
        Throwable th;
        d7k d7kVar3;
        ?? r12;
        d7k d7kVar4;
        qae m03Var;
        int i7 = i;
        int v = d7kVar.v();
        int v2 = d7kVar.v();
        int v3 = d7kVar.v();
        int v4 = i7 >= 3 ? d7kVar.v() : 0;
        if (i7 == 4) {
            z2 = d7kVar.z();
            if (!z) {
                z2 = (((z2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) << 21) | (z2 & KotlinVersion.MAX_COMPONENT_VALUE) | (((z2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 7) | (((z2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 14);
            }
        } else {
            z2 = i7 == 3 ? d7kVar.z() : d7kVar.y();
        }
        int i8 = z2;
        int B = i7 >= 3 ? d7kVar.B() : 0;
        if (v == 0 && v2 == 0 && v3 == 0 && v4 == 0 && i8 == 0 && B == 0) {
            d7kVar.H(d7kVar.c);
            return null;
        }
        int i9 = d7kVar.b + i8;
        if (i9 > d7kVar.c) {
            vq1.n0("Id3Decoder", "Frame size exceeds remaining tag data");
            d7kVar.H(d7kVar.c);
            return null;
        }
        if (naeVar != null) {
            boolean a = naeVar.a(i7, v, v2, v3, v4);
            i7 = i7;
            r1 = v;
            i3 = v2;
            if (!a) {
                d7kVar.H(i9);
                return null;
            }
        } else {
            i3 = v2;
            r1 = v;
        }
        if (i7 == 3) {
            z3 = (B & 128) != 0;
            z6 = (B & 64) != 0;
            z7 = false;
            z5 = (B & 32) != 0;
            z4 = z3;
        } else if (i7 == 4) {
            boolean z8 = (B & 64) != 0;
            boolean z9 = (B & 8) != 0;
            z6 = (B & 4) != 0;
            z7 = (B & 2) != 0;
            z4 = (B & 1) != 0;
            boolean z10 = z9;
            z5 = z8;
            z3 = z10;
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        if (z3 || z6) {
            vq1.n0("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            d7kVar.H(i9);
            return null;
        }
        if (z5) {
            i8--;
            d7kVar.I(1);
        }
        if (z4) {
            i8 -= 4;
            d7kVar.I(4);
        }
        if (z7) {
            i8 = A0(i8, d7kVar);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                d7kVar3 = d7kVar;
            }
        } catch (Exception e) {
            e = e;
            int i10 = i8;
            i8 = i3;
            i3 = i10;
            i4 = r1;
            i5 = v3;
            i6 = v4;
            d7kVar2 = d7kVar;
            th = null;
            d7kVar2.H(i9);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e2) {
            e = e2;
            int i102 = i8;
            i8 = i3;
            i3 = i102;
            i4 = r1;
            i5 = v3;
            i6 = v4;
            d7kVar2 = d7kVar;
            th = null;
            d7kVar2.H(i9);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (r1 == 84 && i3 == 88 && v3 == 88 && (i7 == 2 || v4 == 88)) {
            m03Var = s0(i8, d7kVar);
        } else if (r1 == 84) {
            m03Var = q0(i8, d7kVar, x0(i7, r1, i3, v3, v4));
        } else if (r1 == 87 && i3 == 88 && v3 == 88 && (i7 == 2 || v4 == 88)) {
            m03Var = u0(i8, d7kVar);
        } else if (r1 == 87) {
            m03Var = t0(i8, d7kVar, x0(i7, r1, i3, v3, v4));
        } else {
            if (r1 != 80 || i3 != 82 || v3 != 73 || v4 != 86) {
                th = null;
                try {
                } catch (Exception e3) {
                    e = e3;
                    int i11 = i8;
                    i8 = i3;
                    i3 = i11;
                    i4 = r1;
                    i5 = v3;
                    i6 = v4;
                    d7kVar2 = d7kVar;
                    d7kVar2.H(i9);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    int i112 = i8;
                    i8 = i3;
                    i3 = i112;
                    i4 = r1;
                    i5 = v3;
                    i6 = v4;
                    d7kVar2 = d7kVar;
                    d7kVar2.H(i9);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                if (r1 == 71 && i3 == 69 && v3 == 79 && (v4 == 66 || i7 == 2)) {
                    m03Var = m0(i8, d7kVar);
                } else {
                    if (i7 != 2) {
                        if (r1 == 65) {
                            if (i3 == 80) {
                                if (v3 == 73) {
                                }
                            }
                        }
                        if (r1 == 67) {
                        }
                        if (r1 != 67) {
                        }
                        int i12 = i8;
                        i8 = i3;
                        i3 = i12;
                        i4 = r1;
                        i5 = v3;
                        i6 = v4;
                        if (i4 != 67) {
                        }
                        i7 = i;
                        d7kVar4 = d7kVar;
                        if (i4 != 77) {
                        }
                        String x0 = x0(i7, i4, i8, i5, i6);
                        byte[] bArr = new byte[i3];
                        d7kVar4.f(bArr, 0, i3);
                        m03Var = new m03(x0, bArr);
                        r1 = d7kVar4;
                        r1.H(i9);
                        r12 = m03Var;
                        e = th;
                        if (r12 == 0) {
                        }
                        return r12;
                    }
                    if (r1 == 80 && i3 == 73 && v3 == 67) {
                        m03Var = h0(d7kVar, i8, i7);
                    }
                    if (r1 == 67 || i3 != 79 || v3 != 77 || (v4 != 77 && i7 != 2)) {
                        if (r1 != 67 && i3 == 72 && v3 == 65 && v4 == 80) {
                            int i13 = i8;
                            i8 = i3;
                            i3 = i13;
                            i4 = r1;
                            i5 = v3;
                            i6 = v4;
                            try {
                                m03Var = i0(d7kVar, i3, i7, z, i2, naeVar);
                                i7 = i;
                                r1 = d7kVar;
                            } catch (Exception e5) {
                                e = e5;
                                i7 = i;
                                d7kVar2 = d7kVar;
                                d7kVar2.H(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                i7 = i;
                                d7kVar2 = d7kVar;
                                d7kVar2.H(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                d7kVar3 = d7kVar;
                                d7kVar3.H(i9);
                                throw th;
                            }
                        } else {
                            int i122 = i8;
                            i8 = i3;
                            i3 = i122;
                            i4 = r1;
                            i5 = v3;
                            i6 = v4;
                            try {
                                if (i4 != 67 && i8 == 84 && i5 == 79 && i6 == 67) {
                                    i7 = i;
                                    d7k d7kVar5 = d7kVar;
                                    m03Var = j0(d7kVar5, i3, i7, z, i2, naeVar);
                                    r1 = d7kVar5;
                                } else {
                                    i7 = i;
                                    d7kVar4 = d7kVar;
                                    if (i4 != 77 && i8 == 76 && i5 == 76 && i6 == 84) {
                                        m03Var = n0(i3, d7kVar4);
                                        r1 = d7kVar4;
                                    } else {
                                        String x02 = x0(i7, i4, i8, i5, i6);
                                        byte[] bArr2 = new byte[i3];
                                        d7kVar4.f(bArr2, 0, i3);
                                        m03Var = new m03(x02, bArr2);
                                        r1 = d7kVar4;
                                    }
                                }
                            } catch (Exception e7) {
                                e = e7;
                                d7kVar2 = r1;
                                d7kVar2.H(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e8) {
                                e = e8;
                                d7kVar2 = r1;
                                d7kVar2.H(i9);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                d7kVar3 = r1;
                                d7kVar3.H(i9);
                                throw th;
                            }
                        }
                        r1.H(i9);
                        r12 = m03Var;
                        e = th;
                        if (r12 == 0) {
                            vq1.o0("Id3Decoder", "Failed to decode frame: id=" + x0(i7, i4, i8, i5, i6) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    m03Var = k0(i8, d7kVar);
                }
                int i14 = i8;
                i8 = i3;
                i3 = i14;
                i4 = r1;
                i5 = v3;
                i6 = v4;
                r1 = d7kVar;
                r1.H(i9);
                r12 = m03Var;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            m03Var = o0(i8, d7kVar);
        }
        int i15 = i8;
        i8 = i3;
        i3 = i15;
        i4 = r1;
        i5 = v3;
        i6 = v4;
        r1 = d7kVar;
        th = null;
        r1.H(i9);
        r12 = m03Var;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    public static c6d m0(int i, d7k d7kVar) {
        int v = d7kVar.v();
        Charset w0 = w0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d7kVar.f(bArr, 0, i2);
        int z0 = z0(0, bArr);
        String p = l5i.p(new String(bArr, 0, z0, StandardCharsets.ISO_8859_1));
        int i3 = z0 + 1;
        int y0 = y0(bArr, i3, v);
        String p0 = p0(bArr, i3, y0, w0);
        int v0 = v0(v) + y0;
        int y02 = y0(bArr, v0, v);
        String p02 = p0(bArr, v0, y02, w0);
        int v02 = v0(v) + y02;
        return new c6d(p, p0, p02, i2 <= v02 ? dvt.c : Arrays.copyOfRange(bArr, v02, i2));
    }

    public static e9i n0(int i, d7k d7kVar) {
        int B = d7kVar.B();
        int y = d7kVar.y();
        int y2 = d7kVar.y();
        int v = d7kVar.v();
        int v2 = d7kVar.v();
        v94 v94Var = new v94();
        v94Var.p(d7kVar);
        int i2 = ((i - 10) * 8) / (v + v2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = v94Var.i(v);
            int i5 = v94Var.i(v2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new e9i(B, y, y2, iArr, iArr2);
    }

    public static tsm o0(int i, d7k d7kVar) {
        byte[] bArr = new byte[i];
        d7kVar.f(bArr, 0, i);
        int z0 = z0(0, bArr);
        String str = new String(bArr, 0, z0, StandardCharsets.ISO_8859_1);
        int i2 = z0 + 1;
        return new tsm(str, i <= i2 ? dvt.c : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String p0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static gcs q0(int i, d7k d7kVar, String str) {
        if (i < 1) {
            return null;
        }
        int v = d7kVar.v();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d7kVar.f(bArr, 0, i2);
        return new gcs(str, null, r0(bArr, v, 0));
    }

    public static qsn r0(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return yde.y("");
        }
        tde u = yde.u();
        int y0 = y0(bArr, i2, i);
        while (i2 < y0) {
            u.a(new String(bArr, i2, y0 - i2, w0(i)));
            i2 = v0(i) + y0;
            y0 = y0(bArr, i2, i);
        }
        qsn f = u.f();
        return f.isEmpty() ? yde.y("") : f;
    }

    public static gcs s0(int i, d7k d7kVar) {
        if (i < 1) {
            return null;
        }
        int v = d7kVar.v();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d7kVar.f(bArr, 0, i2);
        int y0 = y0(bArr, 0, v);
        return new gcs("TXXX", new String(bArr, 0, y0, w0(v)), r0(bArr, v, v0(v) + y0));
    }

    public static tpt t0(int i, d7k d7kVar, String str) {
        byte[] bArr = new byte[i];
        d7kVar.f(bArr, 0, i);
        return new tpt(str, null, new String(bArr, 0, z0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static tpt u0(int i, d7k d7kVar) {
        if (i < 1) {
            return null;
        }
        int v = d7kVar.v();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d7kVar.f(bArr, 0, i2);
        int y0 = y0(bArr, 0, v);
        String str = new String(bArr, 0, y0, w0(v));
        int v0 = v0(v) + y0;
        return new tpt("WXXX", str, p0(bArr, v0, z0(v0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int v0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset w0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String x0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int y0(byte[] bArr, int i, int i2) {
        int z0 = z0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return z0;
        }
        while (z0 < bArr.length - 1) {
            if ((z0 - i) % 2 == 0 && bArr[z0 + 1] == 0) {
                return z0;
            }
            z0 = z0(z0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int z0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // defpackage.wyf
    public final u2i B(y2i y2iVar, ByteBuffer byteBuffer) {
        return g0(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u2i g0(int i, byte[] bArr) {
        oae oaeVar;
        ArrayList arrayList = new ArrayList();
        d7k d7kVar = new d7k(bArr, i);
        boolean z = false;
        if (d7kVar.a() < 10) {
            vq1.n0("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int y = d7kVar.y();
            if (y == 4801587) {
                int v = d7kVar.v();
                d7kVar.I(1);
                int v2 = d7kVar.v();
                int u = d7kVar.u();
                if (v == 2) {
                    if ((v2 & 64) != 0) {
                        vq1.n0("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    oaeVar = new oae(v, u, v >= 4 && (v2 & 128) != 0);
                } else {
                    if (v == 3) {
                        if ((v2 & 64) != 0) {
                            int h = d7kVar.h();
                            d7kVar.I(h);
                            u -= h + 4;
                        }
                    } else if (v == 4) {
                        if ((v2 & 64) != 0) {
                            int u2 = d7kVar.u();
                            d7kVar.I(u2 - 4);
                            u -= u2;
                        }
                        if ((v2 & 16) != 0) {
                            u -= 10;
                        }
                    } else {
                        dfi.o(v, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    oaeVar = new oae(v, u, v >= 4 && (v2 & 128) != 0);
                }
                if (oaeVar != null) {
                    return null;
                }
                int i2 = oaeVar.a;
                int i3 = d7kVar.b;
                int i4 = i2 == 2 ? 6 : 10;
                int i5 = oaeVar.c;
                if (oaeVar.b) {
                    i5 = A0(i5, d7kVar);
                }
                d7kVar.G(i3 + i5);
                if (!B0(d7kVar, i2, i4, false)) {
                    if (i2 != 4 || !B0(d7kVar, 4, i4, true)) {
                        dfi.o(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z = true;
                }
                while (d7kVar.a() >= i4) {
                    qae l0 = l0(i2, d7kVar, z, i4, this.a);
                    if (l0 != null) {
                        arrayList.add(l0);
                    }
                }
                return new u2i(arrayList);
            }
            vq1.n0("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(y))));
        }
        oaeVar = null;
        if (oaeVar != null) {
        }
    }
}
