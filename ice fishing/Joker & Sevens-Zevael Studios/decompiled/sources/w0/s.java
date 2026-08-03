package w0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import m0.i0;
import m0.r2;
import m0.z0;
import s.g0;
import s.h0;
import x1.n1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f7594a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7595b;

    /* renamed from: c, reason: collision with root package name */
    public s.z f7596c;

    /* renamed from: j, reason: collision with root package name */
    public int f7603j;

    /* renamed from: d, reason: collision with root package name */
    public int f7597d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f7598e = v6.a.p();

    /* renamed from: f, reason: collision with root package name */
    public final g0 f7599f = new g0();

    /* renamed from: g, reason: collision with root package name */
    public final h0 f7600g = new h0();

    /* renamed from: h, reason: collision with root package name */
    public final o0.e f7601h = new o0.e(new i0[16]);

    /* renamed from: i, reason: collision with root package name */
    public final m0.q f7602i = new m0.q(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final g0 f7604k = v6.a.p();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7605l = new HashMap();

    public s(oc.c cVar) {
        this.f7594a = cVar;
    }

    public final void a(n1 n1Var, k2.e eVar, oc.a aVar) {
        Object obj;
        int i10;
        boolean z10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        Object obj3 = this.f7595b;
        s.z zVar = this.f7596c;
        int i14 = this.f7597d;
        this.f7595b = n1Var;
        this.f7596c = (s.z) this.f7599f.g(n1Var);
        if (this.f7597d == -1) {
            this.f7597d = Long.hashCode(m.k().g());
        }
        m0.q qVar = this.f7602i;
        o0.e m10 = m0.z.m();
        boolean z11 = true;
        try {
            m10.b(qVar);
            r.i(eVar, aVar);
            m10.k(m10.f5136i - 1);
            Object obj4 = this.f7595b;
            pc.j.b(obj4);
            int i15 = this.f7597d;
            s.z zVar2 = this.f7596c;
            if (zVar2 != null) {
                long[] jArr = zVar2.f6362a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j3 = jArr[i16];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            z10 = z11;
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j3 & 255) < 128) {
                                    int i20 = (i16 << 3) + i19;
                                    i13 = i17;
                                    Object obj5 = zVar2.f6363b[i20];
                                    i12 = i19;
                                    boolean z12 = zVar2.f6364c[i20] != i15 ? z10 : false;
                                    if (z12) {
                                        i11 = i15;
                                        g0 g0Var = this.f7598e;
                                        v6.a.O(g0Var, obj5, obj4);
                                        obj2 = obj4;
                                        if ((obj5 instanceof i0) && !g0Var.c(obj5)) {
                                            v6.a.P(this.f7604k, obj5);
                                            this.f7605l.remove(obj5);
                                        }
                                    } else {
                                        obj2 = obj4;
                                        i11 = i15;
                                    }
                                    if (z12) {
                                        zVar2.g(i20);
                                    }
                                } else {
                                    obj2 = obj4;
                                    i11 = i15;
                                    i12 = i19;
                                    i13 = i17;
                                }
                                j3 >>= i13;
                                i19 = i12 + 1;
                                i17 = i13;
                                i15 = i11;
                                obj4 = obj2;
                            }
                            obj = obj4;
                            i10 = i15;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            obj = obj4;
                            i10 = i15;
                            z10 = z11;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        z11 = z10;
                        i15 = i10;
                        obj4 = obj;
                    }
                }
            }
            this.f7595b = obj3;
            this.f7596c = zVar;
            this.f7597d = i14;
        } catch (Throwable th) {
            m10.k(m10.f5136i - 1);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (((w0.w) r1).e(2) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x050f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c3;
        long j3;
        boolean z10;
        Iterator it;
        String str;
        g0 g0Var;
        Object g8;
        int i10;
        Object g10;
        Object[] objArr;
        Iterator it2;
        int i11;
        String str2;
        g0 g0Var2;
        Object[] objArr2;
        long j6;
        long[] jArr;
        long[] jArr2;
        int i12;
        Object[] objArr3;
        int i13;
        int i14;
        int i15;
        s.z zVar;
        long[] jArr3;
        z0 z0Var;
        Object[] objArr4;
        long[] jArr4;
        z0 z0Var2;
        Object[] objArr5;
        int i16;
        int i17;
        int i18;
        long j10;
        Object obj;
        Object obj2;
        Object obj3;
        int i19;
        int i20;
        long j11;
        int i21;
        int i22;
        z0 z0Var3 = z0.f4844l;
        boolean z11 = set instanceof o0.h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        o0.e eVar = this.f7601h;
        g0 g0Var3 = this.f7604k;
        HashMap hashMap = this.f7605l;
        g0 g0Var4 = this.f7598e;
        h0 h0Var = this.f7600g;
        if (z11) {
            h0 h0Var2 = ((o0.h) set).f5148g;
            Object[] objArr6 = h0Var2.f6275b;
            long[] jArr5 = h0Var2.f6274a;
            c3 = 7;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i23 = 0;
                z10 = false;
                j3 = -9187201950435737472L;
                while (true) {
                    int i24 = 8;
                    long j12 = jArr5[i23];
                    int i25 = i23;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j12 & 255) < 128) {
                                jArr4 = jArr5;
                                Object obj4 = objArr6[(i25 << 3) + i27];
                                z0Var2 = z0Var3;
                                if (obj4 instanceof w) {
                                    objArr5 = objArr6;
                                } else {
                                    objArr5 = objArr6;
                                }
                                if (g0Var3.c(obj4)) {
                                    Object g11 = g0Var3.g(obj4);
                                    if (g11 != null) {
                                        if (g11 instanceof h0) {
                                            h0 h0Var3 = (h0) g11;
                                            Object[] objArr7 = h0Var3.f6275b;
                                            long[] jArr6 = h0Var3.f6274a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                i18 = i27;
                                                boolean z12 = z10;
                                                int i28 = 0;
                                                while (true) {
                                                    long j13 = jArr6[i28];
                                                    j10 = j12;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                        int i30 = 0;
                                                        while (i30 < i29) {
                                                            if ((j13 & 255) < 128) {
                                                                j11 = j13;
                                                                i0 i0Var = (i0) objArr7[(i28 << 3) + i30];
                                                                pc.j.c(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                Object obj5 = hashMap.get(i0Var);
                                                                i21 = i30;
                                                                r2 r2Var = i0Var.f4611i;
                                                                if (r2Var == null) {
                                                                    r2Var = z0Var2;
                                                                }
                                                                if (r2Var.a(i0Var.h().f4602f, obj5)) {
                                                                    obj3 = obj4;
                                                                    i19 = length;
                                                                    i20 = i26;
                                                                    eVar.b(i0Var);
                                                                } else {
                                                                    Object g12 = g0Var4.g(i0Var);
                                                                    if (g12 != null) {
                                                                        if (g12 instanceof h0) {
                                                                            h0 h0Var4 = (h0) g12;
                                                                            Object[] objArr8 = h0Var4.f6275b;
                                                                            long[] jArr7 = h0Var4.f6274a;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i19 = length;
                                                                                i20 = i26;
                                                                                int i31 = 0;
                                                                                while (true) {
                                                                                    long j14 = jArr7[i31];
                                                                                    long[] jArr8 = jArr7;
                                                                                    obj3 = obj4;
                                                                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i32 = 8 - ((~(i31 - length3)) >>> 31);
                                                                                        int i33 = 0;
                                                                                        while (i33 < i32) {
                                                                                            if ((j14 & 255) < 128) {
                                                                                                i22 = i33;
                                                                                                h0Var.a(objArr8[(i31 << 3) + i33]);
                                                                                                z12 = true;
                                                                                            } else {
                                                                                                i22 = i33;
                                                                                            }
                                                                                            j14 >>= i24;
                                                                                            i33 = i22 + 1;
                                                                                        }
                                                                                        if (i32 != i24) {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (i31 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i31++;
                                                                                    obj4 = obj3;
                                                                                    jArr7 = jArr8;
                                                                                    i24 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj3 = obj4;
                                                                            i19 = length;
                                                                            i20 = i26;
                                                                            h0Var.a(g12);
                                                                            z12 = true;
                                                                        }
                                                                    }
                                                                    obj3 = obj4;
                                                                    i19 = length;
                                                                    i20 = i26;
                                                                }
                                                            } else {
                                                                obj3 = obj4;
                                                                i19 = length;
                                                                i20 = i26;
                                                                j11 = j13;
                                                                i21 = i30;
                                                            }
                                                            j13 = j11 >> 8;
                                                            i30 = i21 + 1;
                                                            i24 = 8;
                                                            length = i19;
                                                            i26 = i20;
                                                            obj4 = obj3;
                                                        }
                                                        obj2 = obj4;
                                                        i16 = length;
                                                        i17 = i26;
                                                        if (i29 != i24) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj2 = obj4;
                                                        i16 = length;
                                                        i17 = i26;
                                                    }
                                                    if (i28 == length2) {
                                                        break;
                                                    }
                                                    i28++;
                                                    i24 = 8;
                                                    j12 = j10;
                                                    length = i16;
                                                    i26 = i17;
                                                    obj4 = obj2;
                                                }
                                                z10 = z12;
                                            }
                                        } else {
                                            obj2 = obj4;
                                            i16 = length;
                                            i17 = i26;
                                            i18 = i27;
                                            j10 = j12;
                                            i0 i0Var2 = (i0) g11;
                                            Object obj6 = hashMap.get(i0Var2);
                                            r2 r2Var2 = i0Var2.f4611i;
                                            if (r2Var2 == null) {
                                                r2Var2 = z0Var2;
                                            }
                                            if (r2Var2.a(i0Var2.h().f4602f, obj6)) {
                                                eVar.b(i0Var2);
                                            } else {
                                                Object g13 = g0Var4.g(i0Var2);
                                                if (g13 != null) {
                                                    if (g13 instanceof h0) {
                                                        h0 h0Var5 = (h0) g13;
                                                        Object[] objArr9 = h0Var5.f6275b;
                                                        long[] jArr9 = h0Var5.f6274a;
                                                        int length4 = jArr9.length - 2;
                                                        if (length4 >= 0) {
                                                            int i34 = 0;
                                                            while (true) {
                                                                long j15 = jArr9[i34];
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i35 = 8 - ((~(i34 - length4)) >>> 31);
                                                                    for (int i36 = 0; i36 < i35; i36++) {
                                                                        if ((j15 & 255) < 128) {
                                                                            h0Var.a(objArr9[(i34 << 3) + i36]);
                                                                            z10 = true;
                                                                        }
                                                                        j15 >>= 8;
                                                                    }
                                                                    if (i35 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i34 == length4) {
                                                                    break;
                                                                }
                                                                i34++;
                                                            }
                                                        }
                                                    } else {
                                                        h0Var.a(g13);
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                        }
                                        obj = obj2;
                                    }
                                    obj2 = obj4;
                                    i16 = length;
                                    i17 = i26;
                                    i18 = i27;
                                    j10 = j12;
                                    obj = obj2;
                                } else {
                                    i16 = length;
                                    i17 = i26;
                                    i18 = i27;
                                    j10 = j12;
                                    obj = obj4;
                                }
                                Object g14 = g0Var4.g(obj);
                                if (g14 != null) {
                                    if (g14 instanceof h0) {
                                        h0 h0Var6 = (h0) g14;
                                        Object[] objArr10 = h0Var6.f6275b;
                                        long[] jArr10 = h0Var6.f6274a;
                                        int length5 = jArr10.length - 2;
                                        if (length5 >= 0) {
                                            int i37 = 0;
                                            while (true) {
                                                long j16 = jArr10[i37];
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i38 = 8 - ((~(i37 - length5)) >>> 31);
                                                    for (int i39 = 0; i39 < i38; i39++) {
                                                        if ((j16 & 255) < 128) {
                                                            h0Var.a(objArr10[(i37 << 3) + i39]);
                                                            z10 = true;
                                                        }
                                                        j16 >>= 8;
                                                    }
                                                    if (i38 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i37 == length5) {
                                                    break;
                                                }
                                                i37++;
                                            }
                                        }
                                    } else {
                                        h0Var.a(g14);
                                        z10 = true;
                                    }
                                }
                                i27 = i18 + 1;
                                i24 = 8;
                                z0Var3 = z0Var2;
                                objArr6 = objArr5;
                                length = i16;
                                i26 = i17;
                                j12 = j10 >> 8;
                                jArr5 = jArr4;
                            } else {
                                jArr4 = jArr5;
                                z0Var2 = z0Var3;
                                objArr5 = objArr6;
                            }
                            i16 = length;
                            i17 = i26;
                            i18 = i27;
                            j10 = j12;
                            i27 = i18 + 1;
                            i24 = 8;
                            z0Var3 = z0Var2;
                            objArr6 = objArr5;
                            length = i16;
                            i26 = i17;
                            j12 = j10 >> 8;
                            jArr5 = jArr4;
                        }
                        jArr3 = jArr5;
                        z0Var = z0Var3;
                        objArr4 = objArr6;
                        int i40 = length;
                        if (i26 != i24) {
                            break;
                        }
                        length = i40;
                    } else {
                        jArr3 = jArr5;
                        z0Var = z0Var3;
                        objArr4 = objArr6;
                    }
                    if (i25 == length) {
                        break;
                    }
                    i23 = i25 + 1;
                    z0Var3 = z0Var;
                    jArr5 = jArr3;
                    objArr6 = objArr4;
                }
            } else {
                j3 = -9187201950435737472L;
                z10 = false;
            }
        } else {
            c3 = 7;
            j3 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z10 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof w) || ((w) next).e(2)) {
                    if (g0Var3.c(next) && (g10 = g0Var3.g(next)) != null) {
                        if (g10 instanceof h0) {
                            h0 h0Var7 = (h0) g10;
                            Object[] objArr11 = h0Var7.f6275b;
                            long[] jArr11 = h0Var7.f6274a;
                            int length6 = jArr11.length - 2;
                            if (length6 >= 0) {
                                int i41 = 0;
                                while (true) {
                                    long j17 = jArr11[i41];
                                    long[] jArr12 = jArr11;
                                    Object[] objArr12 = objArr11;
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i42 = 8 - ((~(i41 - length6)) >>> 31);
                                        int i43 = 0;
                                        while (i43 < i42) {
                                            if ((j17 & 255) < 128) {
                                                it2 = it3;
                                                i0 i0Var3 = (i0) objArr12[(i41 << 3) + i43];
                                                pc.j.c(i0Var3, str3);
                                                i11 = i43;
                                                Object obj7 = hashMap.get(i0Var3);
                                                str2 = str3;
                                                r2 r2Var3 = i0Var3.f4611i;
                                                if (r2Var3 == null) {
                                                    r2Var3 = z0Var3;
                                                }
                                                g0Var2 = g0Var3;
                                                if (r2Var3.a(i0Var3.h().f4602f, obj7)) {
                                                    objArr2 = objArr12;
                                                    j6 = j17;
                                                    eVar.b(i0Var3);
                                                } else {
                                                    Object g15 = g0Var4.g(i0Var3);
                                                    if (g15 != null) {
                                                        if (g15 instanceof h0) {
                                                            h0 h0Var8 = (h0) g15;
                                                            Object[] objArr13 = h0Var8.f6275b;
                                                            long[] jArr13 = h0Var8.f6274a;
                                                            int length7 = jArr13.length - 2;
                                                            if (length7 >= 0) {
                                                                objArr2 = objArr12;
                                                                boolean z13 = z10;
                                                                int i44 = 0;
                                                                while (true) {
                                                                    long j18 = jArr13[i44];
                                                                    j6 = j17;
                                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                                                        int i46 = 0;
                                                                        while (i46 < i45) {
                                                                            if ((j18 & 255) < 128) {
                                                                                jArr2 = jArr13;
                                                                                h0Var.a(objArr13[(i44 << 3) + i46]);
                                                                                z13 = true;
                                                                            } else {
                                                                                jArr2 = jArr13;
                                                                            }
                                                                            j18 >>= 8;
                                                                            i46++;
                                                                            jArr13 = jArr2;
                                                                        }
                                                                        jArr = jArr13;
                                                                        if (i45 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr = jArr13;
                                                                    }
                                                                    if (i44 == length7) {
                                                                        break;
                                                                    }
                                                                    i44++;
                                                                    j17 = j6;
                                                                    jArr13 = jArr;
                                                                }
                                                                z10 = z13;
                                                            }
                                                        } else {
                                                            objArr2 = objArr12;
                                                            j6 = j17;
                                                            h0Var.a(g15);
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                j17 = j6 >> 8;
                                                str3 = str2;
                                                g0Var3 = g0Var2;
                                                objArr12 = objArr2;
                                                i43 = i11 + 1;
                                                it3 = it2;
                                            } else {
                                                it2 = it3;
                                                i11 = i43;
                                                str2 = str3;
                                                g0Var2 = g0Var3;
                                            }
                                            objArr2 = objArr12;
                                            j6 = j17;
                                            j17 = j6 >> 8;
                                            str3 = str2;
                                            g0Var3 = g0Var2;
                                            objArr12 = objArr2;
                                            i43 = i11 + 1;
                                            it3 = it2;
                                        }
                                        it = it3;
                                        str = str3;
                                        g0Var = g0Var3;
                                        objArr = objArr12;
                                        if (i42 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        str = str3;
                                        g0Var = g0Var3;
                                        objArr = objArr12;
                                    }
                                    if (i41 == length6) {
                                        break;
                                    }
                                    i41++;
                                    it3 = it;
                                    jArr11 = jArr12;
                                    str3 = str;
                                    g0Var3 = g0Var;
                                    objArr11 = objArr;
                                }
                            }
                        } else {
                            it = it3;
                            str = str3;
                            g0Var = g0Var3;
                            i0 i0Var4 = (i0) g10;
                            Object obj8 = hashMap.get(i0Var4);
                            r2 r2Var4 = i0Var4.f4611i;
                            if (r2Var4 == null) {
                                r2Var4 = z0Var3;
                            }
                            if (r2Var4.a(i0Var4.h().f4602f, obj8)) {
                                eVar.b(i0Var4);
                            } else {
                                Object g16 = g0Var4.g(i0Var4);
                                if (g16 != null) {
                                    if (g16 instanceof h0) {
                                        h0 h0Var9 = (h0) g16;
                                        Object[] objArr14 = h0Var9.f6275b;
                                        long[] jArr14 = h0Var9.f6274a;
                                        int length8 = jArr14.length - 2;
                                        if (length8 >= 0) {
                                            int i47 = 0;
                                            while (true) {
                                                long j19 = jArr14[i47];
                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i48 = 8 - ((~(i47 - length8)) >>> 31);
                                                    for (int i49 = 0; i49 < i48; i49++) {
                                                        if ((j19 & 255) < 128) {
                                                            h0Var.a(objArr14[(i47 << 3) + i49]);
                                                            z10 = true;
                                                        }
                                                        j19 >>= 8;
                                                    }
                                                    if (i48 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i47 == length8) {
                                                    break;
                                                }
                                                i47++;
                                            }
                                        }
                                    } else {
                                        h0Var.a(g16);
                                        z10 = true;
                                    }
                                }
                            }
                        }
                        g8 = g0Var4.g(next);
                        if (g8 != null) {
                            if (g8 instanceof h0) {
                                h0 h0Var10 = (h0) g8;
                                Object[] objArr15 = h0Var10.f6275b;
                                long[] jArr15 = h0Var10.f6274a;
                                int length9 = jArr15.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j20 = jArr15[i10];
                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i50 = 8 - ((~(i10 - length9)) >>> 31);
                                            for (int i51 = 0; i51 < i50; i51++) {
                                                if ((j20 & 255) < 128) {
                                                    h0Var.a(objArr15[(i10 << 3) + i51]);
                                                    z10 = true;
                                                }
                                                j20 >>= 8;
                                            }
                                            if (i50 != 8) {
                                                break;
                                            }
                                        }
                                        i10 = i10 != length9 ? i10 + 1 : 0;
                                    }
                                }
                            } else {
                                h0Var.a(g8);
                                z10 = true;
                            }
                        }
                    }
                    it = it3;
                    str = str3;
                    g0Var = g0Var3;
                    g8 = g0Var4.g(next);
                    if (g8 != null) {
                    }
                } else {
                    it = it3;
                    str = str3;
                    g0Var = g0Var3;
                }
                it3 = it;
                str3 = str;
                g0Var3 = g0Var;
            }
        }
        int i52 = eVar.f5136i;
        if (i52 == 0) {
            return z10;
        }
        Object[] objArr16 = eVar.f5134g;
        int i53 = 0;
        while (i53 < i52) {
            i0 i0Var5 = (i0) objArr16[i53];
            int hashCode = Long.hashCode(m.k().g());
            Object g17 = g0Var4.g(i0Var5);
            if (g17 != null) {
                boolean z14 = g17 instanceof h0;
                g0 g0Var5 = this.f7599f;
                if (z14) {
                    h0 h0Var11 = (h0) g17;
                    Object[] objArr17 = h0Var11.f6275b;
                    long[] jArr16 = h0Var11.f6274a;
                    int length10 = jArr16.length - 2;
                    if (length10 >= 0) {
                        int i54 = 0;
                        while (true) {
                            long j21 = jArr16[i54];
                            i12 = i52;
                            objArr3 = objArr16;
                            if ((((~j21) << c3) & j21 & j3) != j3) {
                                int i55 = 8 - ((~(i54 - length10)) >>> 31);
                                int i56 = 0;
                                while (i56 < i55) {
                                    if ((j21 & 255) < 128) {
                                        i14 = i56;
                                        Object obj9 = objArr17[(i54 << 3) + i56];
                                        s.z zVar2 = (s.z) g0Var5.g(obj9);
                                        i15 = i53;
                                        if (zVar2 == null) {
                                            zVar = new s.z();
                                            g0Var5.m(obj9, zVar);
                                        } else {
                                            zVar = zVar2;
                                        }
                                        c(i0Var5, hashCode, obj9, zVar);
                                    } else {
                                        i14 = i56;
                                        i15 = i53;
                                    }
                                    j21 >>= 8;
                                    i56 = i14 + 1;
                                    i53 = i15;
                                }
                                i13 = i53;
                                if (i55 != 8) {
                                    break;
                                }
                            } else {
                                i13 = i53;
                            }
                            if (i54 != length10) {
                                i54++;
                                i52 = i12;
                                objArr16 = objArr3;
                                i53 = i13;
                            }
                        }
                    } else {
                        i12 = i52;
                        objArr3 = objArr16;
                        i13 = i53;
                    }
                } else {
                    i12 = i52;
                    objArr3 = objArr16;
                    i13 = i53;
                    s.z zVar3 = (s.z) g0Var5.g(g17);
                    if (zVar3 == null) {
                        zVar3 = new s.z();
                        g0Var5.m(g17, zVar3);
                    }
                    c(i0Var5, hashCode, g17, zVar3);
                }
            } else {
                i12 = i52;
                objArr3 = objArr16;
                i13 = i53;
            }
            i53 = i13 + 1;
            i52 = i12;
            objArr16 = objArr3;
        }
        eVar.g();
        return z10;
    }

    public final void c(Object obj, int i10, Object obj2, s.z zVar) {
        int i11;
        if (this.f7603j > 0) {
            return;
        }
        int c3 = zVar.c(obj);
        if (c3 < 0) {
            c3 = ~c3;
            i11 = -1;
        } else {
            i11 = zVar.f6364c[c3];
        }
        zVar.f6363b[c3] = obj;
        zVar.f6364c[c3] = i10;
        if ((obj instanceof i0) && i11 != i10) {
            m0.h0 h10 = ((i0) obj).h();
            this.f7605l.put(obj, h10.f4602f);
            s.z zVar2 = h10.f4601e;
            g0 g0Var = this.f7604k;
            v6.a.P(g0Var, obj);
            Object[] objArr = zVar2.f6363b;
            long[] jArr = zVar2.f6362a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j3 = jArr[i12];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j3 & 255) < 128) {
                                v vVar = (v) objArr[(i12 << 3) + i14];
                                if (vVar instanceof w) {
                                    ((w) vVar).f(2);
                                }
                                v6.a.m(g0Var, vVar, obj);
                            }
                            j3 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof w) {
                ((w) obj).f(2);
            }
            v6.a.m(this.f7598e, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j3;
        char c3;
        long j6;
        int i10;
        boolean z10;
        Object obj;
        long j10;
        Object obj2;
        g0 g0Var = this.f7599f;
        long[] jArr3 = g0Var.f6266a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr3[i11];
            char c7 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j11 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        c3 = c7;
                        Object obj3 = g0Var.f6267b[i15];
                        j6 = j12;
                        s.z zVar = (s.z) g0Var.f6268c[i15];
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean y10 = ((n1) obj3).y();
                        if (!y10) {
                            Object[] objArr = zVar.f6363b;
                            int[] iArr = zVar.f6364c;
                            long[] jArr4 = zVar.f6362a;
                            int i16 = i12;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j3 = j11;
                                int i17 = 0;
                                while (true) {
                                    long j13 = jArr4[i17];
                                    long[] jArr5 = jArr4;
                                    z10 = y10;
                                    if ((((~j13) << c3) & j13 & j6) != j6) {
                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j13 & 255) < 128) {
                                                int i20 = (i17 << 3) + i19;
                                                j10 = j13;
                                                Object obj4 = objArr[i20];
                                                int i21 = iArr[i20];
                                                g0 g0Var2 = this.f7598e;
                                                v6.a.O(g0Var2, obj4, obj3);
                                                obj2 = obj3;
                                                if ((obj4 instanceof i0) && !g0Var2.c(obj4)) {
                                                    v6.a.P(this.f7604k, obj4);
                                                    this.f7605l.remove(obj4);
                                                }
                                            } else {
                                                j10 = j13;
                                                obj2 = obj3;
                                            }
                                            j13 = j10 >> i16;
                                            i19++;
                                            obj3 = obj2;
                                        }
                                        obj = obj3;
                                        if (i18 != i16) {
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    if (i17 == length2) {
                                        break;
                                    }
                                    i17++;
                                    y10 = z10;
                                    jArr4 = jArr5;
                                    obj3 = obj;
                                    i16 = 8;
                                }
                                if (!z10) {
                                    g0Var.l(i15);
                                }
                                i10 = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j3 = j11;
                        z10 = y10;
                        if (!z10) {
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr3;
                        j3 = j11;
                        c3 = c7;
                        j6 = j12;
                        i10 = i12;
                    }
                    i14++;
                    i12 = i10;
                    j11 = j3 >> i10;
                    c7 = c3;
                    j12 = j6;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            jArr3 = jArr;
        }
    }
}
