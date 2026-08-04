package com.gamericefishpro.space.t0;

import android.os.Trace;
import com.gamericefishpro.space.i9.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements t {
    public final com.gamericefishpro.space.t.i0 A;
    public final com.gamericefishpro.space.t.i0 B;
    public final com.gamericefishpro.space.t.h0 C;
    public final com.gamericefishpro.space.u0.a D;
    public final com.gamericefishpro.space.u0.a E;
    public final com.gamericefishpro.space.t.h0 F;
    public com.gamericefishpro.space.t.h0 G;
    public boolean H;
    public c2 I;
    public i1 J;
    public x K;
    public int L;
    public final com.gamericefishpro.space.m.d M;
    public final com.gamericefishpro.space.u6.q N;
    public final r O;
    public int P;
    public Function2 Q;
    public final u d;
    public final com.gamericefishpro.space.h2.d2 e;
    public final AtomicReference i = new AtomicReference(null);
    public final Object v = new Object();
    public final com.gamericefishpro.space.t.k0 w;
    public final e2 y;
    public final com.gamericefishpro.space.t.h0 z;

    public x(u uVar, com.gamericefishpro.space.h2.d2 d2Var) {
        this.d = uVar;
        this.e = d2Var;
        com.gamericefishpro.space.t.k0 k0Var = new com.gamericefishpro.space.t.k0(new com.gamericefishpro.space.t.i0());
        this.w = k0Var;
        e2 e2Var = new e2();
        if (uVar.d()) {
            e2Var.D = new com.gamericefishpro.space.t.w();
        }
        if (uVar.f()) {
            e2Var.c();
        }
        this.y = e2Var;
        this.z = y3.t();
        this.A = new com.gamericefishpro.space.t.i0();
        this.B = new com.gamericefishpro.space.t.i0();
        this.C = y3.t();
        com.gamericefishpro.space.u0.a aVar = new com.gamericefishpro.space.u0.a();
        this.D = aVar;
        com.gamericefishpro.space.u0.a aVar2 = new com.gamericefishpro.space.u0.a();
        this.E = aVar2;
        this.F = y3.t();
        this.G = y3.t();
        com.gamericefishpro.space.m.d dVar = new com.gamericefishpro.space.m.d(26, uVar);
        this.M = dVar;
        this.N = new com.gamericefishpro.space.u6.q();
        r rVar = new r(d2Var, uVar, e2Var, k0Var, aVar, aVar2, dVar, this);
        uVar.p(rVar);
        this.O = rVar;
        this.Q = i.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void A(Object obj) {
        synchronized (this.v) {
            try {
                v(obj);
                Object objG = this.C.g(obj);
                if (objG != null) {
                    if (objG instanceof com.gamericefishpro.space.t.i0) {
                        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) objG;
                        Object[] objArr = i0Var.b;
                        long[] jArr = i0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((d0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        v((d0) objG);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Function2 function2) {
        boolean zI = i();
        q();
        u uVar = this.d;
        if (!zI) {
            this.Q = function2;
            uVar.a(this, function2);
            return;
        }
        r rVar = this.O;
        rVar.z = 100;
        rVar.y = true;
        this.Q = function2;
        uVar.a(this, function2);
        rVar.u();
    }

    public final void a() {
        this.i.set(null);
        this.D.c.s0();
        this.E.c.s0();
        com.gamericefishpro.space.t.k0 k0Var = this.w;
        if (k0Var.d.g()) {
            return;
        }
        com.gamericefishpro.space.u6.q qVar = this.N;
        try {
            qVar.o(k0Var, this.O.C());
            qVar.b();
        } finally {
            qVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    public final void b(Object obj, boolean z) {
        int i;
        Object objG = this.z.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof com.gamericefishpro.space.t.i0;
        com.gamericefishpro.space.t.i0 i0Var = this.A;
        com.gamericefishpro.space.t.i0 i0Var2 = this.B;
        com.gamericefishpro.space.t.h0 h0Var = this.F;
        if (!z2) {
            p1 p1Var = (p1) objG;
            if (y3.I(h0Var, obj, p1Var) || p1Var.c(obj) == n0.d) {
                return;
            }
            if (p1Var.g == null || z) {
                i0Var.a(p1Var);
                return;
            } else {
                i0Var2.a(p1Var);
                return;
            }
        }
        com.gamericefishpro.space.t.i0 i0Var3 = (com.gamericefishpro.space.t.i0) objG;
        Object[] objArr = i0Var3.b;
        long[] jArr = i0Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j) < 128) {
                        p1 p1Var2 = (p1) objArr[(i2 << 3) + i5];
                        if (y3.I(h0Var, obj, p1Var2)) {
                            i = i3;
                        } else {
                            i = i3;
                            if (p1Var2.c(obj) != n0.d) {
                                if (p1Var2.g == null || z) {
                                    i0Var.a(p1Var2);
                                } else {
                                    i0Var2.a(p1Var2);
                                }
                            }
                        }
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0242 A[LOOP:6: B:96:0x01ee->B:113:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x024f A[EDGE_INSN: B:206:0x024f->B:115:0x024f BREAK  A[LOOP:6: B:96:0x01ee->B:113:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0196 A[EDGE_INSN: B:221:0x0196->B:77:0x0196 BREAK  A[LOOP:13: B:64:0x015a->B:75:0x018e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[LOOP:13: B:64:0x015a->B:75:0x018e, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean zG;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        boolean z2 = set instanceof com.gamericefishpro.space.v0.g;
        com.gamericefishpro.space.t.h0 h0Var = this.C;
        Object obj = null;
        int i5 = 8;
        if (z2) {
            com.gamericefishpro.space.t.i0 i0Var = ((com.gamericefishpro.space.v0.g) set).d;
            Object[] objArr = i0Var.b;
            long[] jArr8 = i0Var.a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof p1) {
                                    ((p1) obj2).c(obj);
                                    jArr7 = jArr8;
                                    j8 = j9;
                                    i3 = length;
                                } else {
                                    b(obj2, z);
                                    Object objG = h0Var.g(obj2);
                                    if (objG == null) {
                                        jArr7 = jArr8;
                                        j8 = j9;
                                        i3 = length;
                                    } else if (objG instanceof com.gamericefishpro.space.t.i0) {
                                        com.gamericefishpro.space.t.i0 i0Var2 = (com.gamericefishpro.space.t.i0) objG;
                                        Object[] objArr2 = i0Var2.b;
                                        long[] jArr9 = i0Var2.a;
                                        int length2 = jArr9.length - 2;
                                        if (length2 >= 0) {
                                            int i9 = i5;
                                            i3 = length;
                                            int i10 = 0;
                                            while (true) {
                                                long j10 = jArr9[i10];
                                                j8 = j9;
                                                long[] jArr10 = jArr9;
                                                if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                    int i12 = 0;
                                                    while (i12 < i11) {
                                                        if ((j10 & 255) < 128) {
                                                            b((d0) objArr2[(i10 << 3) + i12], z);
                                                        }
                                                        j10 >>= i9;
                                                        i12++;
                                                        jArr8 = jArr8;
                                                    }
                                                    jArr7 = jArr8;
                                                    if (i11 != i9) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                if (i10 == length2) {
                                                    break;
                                                }
                                                i10++;
                                                jArr9 = jArr10;
                                                j9 = j8;
                                                jArr8 = jArr7;
                                                i9 = 8;
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j8 = j9;
                                            i3 = length;
                                        }
                                    } else {
                                        jArr7 = jArr8;
                                        j8 = j9;
                                        i3 = length;
                                        b((d0) objG, z);
                                    }
                                    Unit unit = Unit.a;
                                }
                                i4 = 8;
                            } else {
                                jArr7 = jArr8;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr8;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr8 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof p1) {
                    ((p1) obj3).c(null);
                } else {
                    b(obj3, z);
                    Object objG2 = h0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof com.gamericefishpro.space.t.i0) {
                            com.gamericefishpro.space.t.i0 i0Var3 = (com.gamericefishpro.space.t.i0) objG2;
                            Object[] objArr3 = i0Var3.b;
                            long[] jArr11 = i0Var3.a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr11[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length3) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((d0) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        } else if (i14 != length3) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((d0) objG2, z);
                        }
                    }
                    Unit unit2 = Unit.a;
                }
            }
        }
        com.gamericefishpro.space.t.h0 h0Var2 = this.z;
        com.gamericefishpro.space.t.i0 i0Var4 = this.A;
        if (z) {
            com.gamericefishpro.space.t.i0 i0Var5 = this.B;
            if (i0Var5.h()) {
                long[] jArr12 = h0Var2.a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = h0Var2.b[i20];
                                    Object obj5 = h0Var2.c[i20];
                                    if (obj5 instanceof com.gamericefishpro.space.t.i0) {
                                        com.gamericefishpro.space.t.i0 i0Var6 = (com.gamericefishpro.space.t.i0) obj5;
                                        Object[] objArr4 = i0Var6.b;
                                        long[] jArr13 = i0Var6.a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr5 = jArr12;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            p1 p1Var = (p1) objArr4[i24];
                                                            if (i0Var5.c(p1Var) || i0Var4.c(p1Var)) {
                                                                i0Var6.m(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 != length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                } else if (i21 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        zG = i0Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i = length4;
                                        j6 = j12;
                                        Intrinsics.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        p1 p1Var2 = (p1) obj5;
                                        zG = i0Var5.c(p1Var2) || i0Var4.c(p1Var2);
                                    }
                                    if (zG) {
                                        h0Var2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr4;
                    }
                }
                i0Var5.b();
                h();
                return;
            }
        }
        if (i0Var4.h()) {
            long[] jArr14 = h0Var2.a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = h0Var2.b[i29];
                                Object obj7 = h0Var2.c[i29];
                                if (obj7 instanceof com.gamericefishpro.space.t.i0) {
                                    com.gamericefishpro.space.t.i0 i0Var7 = (com.gamericefishpro.space.t.i0) obj7;
                                    Object[] objArr5 = i0Var7.b;
                                    long[] jArr15 = i0Var7.a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr14;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (i0Var4.c((p1) objArr6[i33])) {
                                                            i0Var7.m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr14 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j4 = j14;
                                    }
                                    zC = i0Var7.g();
                                } else {
                                    jArr2 = jArr14;
                                    j4 = j14;
                                    Intrinsics.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = i0Var4.c((p1) obj7);
                                }
                                if (zC) {
                                    h0Var2.l(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                }
            }
            h();
            i0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.v) {
            try {
                e(this.D);
                o();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.w.d.g()) {
                        com.gamericefishpro.space.u6.q qVar = this.N;
                        try {
                            qVar.o(this.w, this.O.C());
                            qVar.b();
                        } finally {
                            qVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0138 A[EDGE_INSN: B:164:0x0138->B:82:0x0138 BREAK  A[LOOP:2: B:154:0x00eb->B:80:0x012e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012e A[Catch: all -> 0x011e, LOOP:2: B:154:0x00eb->B:80:0x012e, LOOP_END, TryCatch #8 {all -> 0x011e, blocks: (B:64:0x00eb, B:66:0x00fa, B:68:0x0104, B:70:0x010a, B:72:0x011a, B:76:0x0123, B:82:0x0138, B:90:0x015c, B:93:0x016f, B:80:0x012e, B:85:0x0142, B:99:0x018d, B:101:0x0199), top: B:154:0x00eb }] */
    public final void e(com.gamericefishpro.space.u0.a aVar) throws Throwable {
        c cVar;
        com.gamericefishpro.space.u6.q qVar;
        com.gamericefishpro.space.u6.q qVar2;
        long[] jArr;
        int i;
        long[] jArr2;
        com.gamericefishpro.space.u6.q qVar3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        com.gamericefishpro.space.u0.a aVar2 = this.E;
        r rVar = this.O;
        com.gamericefishpro.space.g1.f fVarC = rVar.C();
        com.gamericefishpro.space.u6.q qVar4 = this.N;
        qVar4.o(this.w, fVarC);
        try {
            if (aVar.c.u0()) {
                try {
                    if (aVar2.c.u0() && this.J == null) {
                        qVar4.b();
                    }
                    return;
                } finally {
                    qVar4.a();
                }
            }
            i1 i1Var = this.J;
            if (i1Var == null || (cVar = i1Var.l) == null) {
                cVar = this.e;
            }
            try {
                Trace.beginSection(cVar.equals(i1Var != null ? i1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    i1 i1Var2 = this.J;
                    if (i1Var2 == null || (qVar = i1Var2.k) == null) {
                        qVar = qVar4;
                    }
                    h2 h2VarF = this.y.f();
                    int i3 = 0;
                    try {
                        aVar.s0(cVar, h2VarF, qVar, rVar.C());
                        Unit unit = Unit.a;
                        h2VarF.e(true);
                        cVar.h();
                        Trace.endSection();
                        qVar4.c();
                        qVar4.d();
                        if (this.H) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.H = false;
                                com.gamericefishpro.space.t.h0 h0Var = this.z;
                                long[] jArr3 = h0Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = h0Var.b[i8];
                                                    Object obj2 = h0Var.c[i8];
                                                    if (obj2 instanceof com.gamericefishpro.space.t.i0) {
                                                        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) obj2;
                                                        Object[] objArr = i0Var.b;
                                                        long[] jArr4 = i0Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        qVar3 = qVar4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((p1) objArr[i13]).b()) {
                                                                                    i0Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = i0Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        qVar3 = qVar4;
                                                        j = j4;
                                                        Intrinsics.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zG = !((p1) obj2).b();
                                                    }
                                                    if (zG) {
                                                        h0Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    qVar3 = qVar4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                qVar4 = qVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            qVar2 = qVar4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            qVar2 = qVar4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        qVar4 = qVar2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    qVar2 = qVar4;
                                }
                                h();
                                Unit unit2 = Unit.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            qVar2 = qVar4;
                        }
                        try {
                            if (aVar2.c.u0() && this.J == null) {
                                qVar2.b();
                            }
                            return;
                        } finally {
                            qVar2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            h2VarF.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (aVar2.c.u0() && this.J == null) {
                qVar4.b();
            }
            throw th;
        } finally {
            qVar4.a();
        }
    }

    public final void f() {
        synchronized (this.v) {
            try {
                if (this.E.c.v0()) {
                    e(this.E);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.w.d.g()) {
                        com.gamericefishpro.space.u6.q qVar = this.N;
                        try {
                            qVar.o(this.w, this.O.C());
                            qVar.b();
                        } finally {
                            qVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.v) {
            try {
                this.O.v = null;
                if (!this.w.d.g()) {
                    com.gamericefishpro.space.u6.q qVar = this.N;
                    try {
                        qVar.o(this.w, this.O.C());
                        qVar.b();
                        qVar.a();
                    } catch (Throwable th) {
                        qVar.a();
                        throw th;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                try {
                    if (!this.w.d.g()) {
                        com.gamericefishpro.space.u6.q qVar2 = this.N;
                        try {
                            qVar2.o(this.w, this.O.C());
                            qVar2.b();
                        } finally {
                            qVar2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zG;
        int i3;
        long j7;
        com.gamericefishpro.space.t.h0 h0Var = this.C;
        long[] jArr3 = h0Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = h0Var.b[i8];
                            Object obj2 = h0Var.c[i8];
                            boolean z = obj2 instanceof com.gamericefishpro.space.t.i0;
                            com.gamericefishpro.space.t.h0 h0Var2 = this.z;
                            if (z) {
                                com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) obj2;
                                Object[] objArr = i0Var.b;
                                long[] jArr4 = i0Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) == j5) {
                                            if (i10 != length2) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        } else {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!h0Var2.c((d0) objArr[i13])) {
                                                        i0Var.m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 != length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zG = i0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                Intrinsics.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !h0Var2.c((d0) obj2);
                            }
                            if (zG) {
                                h0Var.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        com.gamericefishpro.space.t.i0 i0Var2 = this.B;
        if (!i0Var2.h()) {
            return;
        }
        Object[] objArr2 = i0Var2.b;
        long[] jArr5 = i0Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((p1) objArr2[i18]).g != null)) {
                            i0Var2.m(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.v) {
            z = true;
            if (this.P != 1) {
                z = false;
            }
            if (z) {
                this.P = 0;
            }
        }
        return z;
    }

    public final void j(Function2 function2) {
        try {
            synchronized (this.v) {
                n();
                com.gamericefishpro.space.t.h0 h0Var = this.G;
                this.G = y3.t();
                try {
                    r rVar = this.O;
                    c2 c2Var = this.I;
                    if (!rVar.e.c.u0()) {
                        s.a("Expected applyChanges() to have been called");
                    }
                    rVar.P = c2Var;
                    try {
                        rVar.n(h0Var, function2);
                        rVar.P = null;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        rVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.G = h0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.w.d.g()) {
                    com.gamericefishpro.space.u6.q qVar = this.N;
                    try {
                        qVar.o(this.w, this.O.C());
                        qVar.b();
                    } finally {
                        qVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final i1 k(boolean z, Function2 function2) {
        if (this.J != null) {
            m1.b("A pausable composition is in progress");
        }
        i1 i1Var = new i1(this, this.d, this.O, this.w, function2, z, this.e, this.v);
        this.J = i1Var;
        return i1Var;
    }

    public final void l() {
        synchronized (this.v) {
            try {
                if (this.J != null) {
                    m1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.y.e > 0;
                if (z || !this.w.d.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        com.gamericefishpro.space.u6.q qVar = this.N;
                        try {
                            qVar.o(this.w, this.O.C());
                            if (z) {
                                h2 h2VarF = this.y.f();
                                try {
                                    h2VarF.n(h2VarF.t, new com.gamericefishpro.space.d0.w(13, this.N, h2VarF));
                                    Unit unit = Unit.a;
                                    h2VarF.e(true);
                                    this.e.h();
                                    qVar.c();
                                } catch (Throwable th) {
                                    h2VarF.e(false);
                                    throw th;
                                }
                            }
                            qVar.b();
                            qVar.a();
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.z.a();
                this.C.a();
                this.G.a();
                this.D.c.s0();
                this.E.c.s0();
                r rVar = this.O;
                rVar.E.clear();
                rVar.s.clear();
                rVar.e.c.s0();
                rVar.v = null;
                this.P = 1;
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.v) {
            try {
                if (this.O.F) {
                    m1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.P != 3) {
                    this.P = 3;
                    this.Q = i.b;
                    com.gamericefishpro.space.u0.a aVar = this.O.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z = this.y.e > 0;
                    if (z || !this.w.d.g()) {
                        com.gamericefishpro.space.u6.q qVar = this.N;
                        try {
                            qVar.o(this.w, this.O.C());
                            if (z) {
                                h2 h2VarF = this.y.f();
                                try {
                                    h2VarF.n(h2VarF.t, new com.gamericefishpro.space.d0.n1(10, this.N));
                                    h2VarF.H();
                                    Unit unit = Unit.a;
                                    h2VarF.e(true);
                                    this.e.a();
                                    this.e.h();
                                    qVar.c();
                                } catch (Throwable th) {
                                    h2VarF.e(false);
                                    throw th;
                                }
                            }
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    }
                    r rVar = this.O;
                    rVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        rVar.b.u(rVar);
                        rVar.E.clear();
                        rVar.s.clear();
                        rVar.e.c.s0();
                        rVar.v = null;
                        rVar.a.a();
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.d.v(this);
    }

    public final void n() {
        Object obj = i.d;
        AtomicReference atomicReference = this.i;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                s.b("pending composition has not been applied");
                throw new com.gamericefishpro.space.oh.e();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                s.b("corrupt pendingModifications drain: " + atomicReference);
                throw new com.gamericefishpro.space.oh.e();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.i;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.a(andSet, i.d)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            s.b("corrupt pendingModifications drain: " + atomicReference);
            throw new com.gamericefishpro.space.oh.e();
        }
        if (this.J == null) {
            s.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        com.gamericefishpro.space.ph.i0 i0Var = com.gamericefishpro.space.ph.i0.d;
        AtomicReference atomicReference = this.i;
        Object andSet = atomicReference.getAndSet(i0Var);
        if (Intrinsics.a(andSet, i.d) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            s.b("corrupt pendingModifications drain: " + atomicReference);
            throw new com.gamericefishpro.space.oh.e();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i = this.P;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            m1.b(str);
        }
        if (this.J == null) {
            return;
        }
        m1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        com.gamericefishpro.space.t.k0 k0Var = this.w;
        r rVar = this.O;
        if (arrayList.size() > 0) {
            ((u0) ((Pair) arrayList.get(0)).d).getClass();
            throw null;
        }
        try {
            rVar.getClass();
            try {
                rVar.F(arrayList);
                rVar.i();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                rVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!k0Var.d.g()) {
                    com.gamericefishpro.space.u6.q qVar = this.N;
                    try {
                        qVar.o(k0Var, rVar.C());
                        qVar.b();
                    } finally {
                        qVar.a();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final n0 s(p1 p1Var, Object obj) {
        x xVar;
        int i = p1Var.b;
        if ((i & 2) != 0) {
            p1Var.b = i | 4;
        }
        a aVar = p1Var.c;
        if (aVar == null || !aVar.a()) {
            return n0.d;
        }
        if (this.y.h(aVar)) {
            if (p1Var.d == null) {
                return n0.d;
            }
            n0 n0VarU = u(p1Var, aVar, obj);
            if (n0VarU != n0.d) {
                this.M.o();
            }
            return n0VarU;
        }
        synchronized (this.v) {
            xVar = this.K;
        }
        if (xVar != null) {
            r rVar = xVar.O;
            if (rVar.F && rVar.f0(p1Var, obj)) {
                return n0.v;
            }
        }
        return n0.d;
    }

    public final void t() {
        x xVar;
        synchronized (this.v) {
            try {
                for (Object obj : this.y.i) {
                    p1 p1Var = obj instanceof p1 ? (p1) obj : null;
                    if (p1Var != null && (xVar = p1Var.a) != null) {
                        xVar.s(p1Var, null);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd A[Catch: all -> 0x0042, LOOP:0: B:47:0x008c->B:61:0x00cd, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:65:0x00d5->B:66:0x00da BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5 A[SYNTHETIC] */
    public final n0 u(p1 p1Var, a aVar, Object obj) {
        synchronized (this.v) {
            try {
                x xVar = this.K;
                x xVar2 = null;
                if (xVar != null) {
                    e2 e2Var = this.y;
                    int i = this.L;
                    if (e2Var.z) {
                        s.a("Writer is active");
                    }
                    if (i < 0 || i >= e2Var.e) {
                        s.a("Invalid group index");
                    }
                    if (e2Var.h(aVar)) {
                        int i2 = e2Var.d[(i * 5) + 3] + i;
                        int i3 = aVar.a;
                        if (i > i3 || i3 >= i2) {
                            xVar = null;
                        }
                    } else {
                        xVar = null;
                    }
                    xVar2 = xVar;
                }
                if (xVar2 == null) {
                    r rVar = this.O;
                    if (rVar.F && rVar.f0(p1Var, obj)) {
                        return n0.v;
                    }
                    if (obj != null && (obj instanceof d0)) {
                        Object objG = this.G.g(p1Var);
                        if (objG != null) {
                            if (!(objG instanceof com.gamericefishpro.space.t.i0)) {
                                if (objG != f.y) {
                                    y3.l(this.G, p1Var, obj);
                                    break;
                                }
                            } else {
                                com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) objG;
                                Object[] objArr = i0Var.b;
                                long[] jArr = i0Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    y3.l(this.G, p1Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i4 == length) {
                                            y3.l(this.G, p1Var, obj);
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        int i5 = 8;
                                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                                        int i7 = 0;
                                        while (i7 < i6) {
                                            if ((j & 255) < 128 && objArr[(i4 << 3) + i7] == f.y) {
                                                break loop0;
                                            }
                                            j >>= i5;
                                            i7++;
                                            i5 = i5;
                                        }
                                        if (i6 == i5) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        y3.l(this.G, p1Var, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            y3.l(this.G, p1Var, obj);
                            break;
                        }
                    } else {
                        this.G.m(p1Var, f.y);
                    }
                }
                if (xVar2 != null) {
                    return xVar2.u(p1Var, aVar, obj);
                }
                this.d.l(this);
                return this.O.F ? n0.i : n0.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.z.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof com.gamericefishpro.space.t.i0;
        com.gamericefishpro.space.t.h0 h0Var = this.F;
        if (!z) {
            p1 p1Var = (p1) objG;
            if (p1Var.c(obj) == n0.v) {
                y3.l(h0Var, obj, p1Var);
                return;
            }
            return;
        }
        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) objG;
        Object[] objArr = i0Var.b;
        long[] jArr = i0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        p1 p1Var2 = (p1) objArr[(i << 3) + i3];
                        if (p1Var2.c(obj) == n0.v) {
                            y3.l(h0Var, obj, p1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean w(Set set) {
        boolean z = set instanceof com.gamericefishpro.space.v0.g;
        com.gamericefishpro.space.t.h0 h0Var = this.C;
        com.gamericefishpro.space.t.h0 h0Var2 = this.z;
        if (z) {
            com.gamericefishpro.space.t.i0 i0Var = ((com.gamericefishpro.space.v0.g) set).d;
            Object[] objArr = i0Var.b;
            long[] jArr = i0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (h0Var2.c(obj) || h0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (h0Var2.c(obj2) || h0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.v) {
            i1 i1Var = this.J;
            boolean zV0 = false;
            if (i1Var != null && (i1Var.h.get() != j1.w || i1Var.i != com.gamericefishpro.space.b1.n.b())) {
                AtomicReference atomicReference = i1Var.h;
                j1 j1Var = j1.y;
                j1 j1Var2 = j1.v;
                while (!atomicReference.compareAndSet(j1Var, j1Var2) && atomicReference.get() == j1Var) {
                }
                i1Var.l.d.a(9);
                return false;
            }
            n();
            try {
                com.gamericefishpro.space.t.h0 h0Var = this.G;
                this.G = y3.t();
                try {
                    r rVar = this.O;
                    c2 c2Var = this.I;
                    com.gamericefishpro.space.u0.l0 l0Var = rVar.e.c;
                    if (!l0Var.u0()) {
                        s.a("Expected applyChanges() to have been called");
                    }
                    if (h0Var.e > 0 || !rVar.s.isEmpty()) {
                        rVar.P = c2Var;
                        try {
                            rVar.n(h0Var, null);
                            rVar.P = null;
                            zV0 = l0Var.v0();
                        } catch (Throwable th) {
                            rVar.P = null;
                            throw th;
                        }
                    }
                    if (!zV0) {
                        o();
                    }
                    return zV0;
                } catch (Throwable th2) {
                    this.G = h0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.w.d.g()) {
                        com.gamericefishpro.space.u6.q qVar = this.N;
                        try {
                            qVar.o(this.w, this.O.C());
                            qVar.b();
                        } finally {
                            qVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(com.gamericefishpro.space.v0.g gVar) {
        Object obj;
        while (true) {
            Object obj2 = this.i.get();
            if (obj2 == null || obj2.equals(i.d)) {
                obj = gVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, gVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.i).toString());
                }
                Set[] setArr = (Set[]) obj2;
                Intrinsics.checkNotNullParameter(setArr, "<this>");
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = gVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.i;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.v) {
                            o();
                            Unit unit = Unit.a;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void z(Object obj) {
        p1 p1VarA;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        r rVar = this.O;
        if (rVar.A <= 0 && (p1VarA = rVar.A()) != null) {
            boolean z4 = true;
            int i2 = p1VarA.b | 1;
            p1VarA.b = i2;
            if ((i2 & 32) == 0) {
                com.gamericefishpro.space.t.c0 c0Var = p1VarA.f;
                if (c0Var == null) {
                    c0Var = new com.gamericefishpro.space.t.c0();
                    p1VarA.f = c0Var;
                }
                int i3 = p1VarA.e;
                int iC = c0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = c0Var.c[iC];
                }
                c0Var.b[iC] = obj;
                c0Var.c[iC] = i3;
                if (i == p1VarA.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.M.o();
            if (z) {
                return;
            }
            if (obj instanceof com.gamericefishpro.space.f1.d0) {
                ((com.gamericefishpro.space.f1.d0) obj).f(1);
            }
            y3.l(this.z, obj, p1VarA);
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                c0 c0VarH = d0Var.h();
                com.gamericefishpro.space.t.h0 h0Var = this.C;
                y3.J(h0Var, obj);
                com.gamericefishpro.space.t.c0 c0Var2 = c0VarH.e;
                Object[] objArr = c0Var2.b;
                long[] jArr = c0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    com.gamericefishpro.space.f1.c0 c0Var3 = (com.gamericefishpro.space.f1.c0) objArr[(i4 << 3) + i7];
                                    if (c0Var3 instanceof com.gamericefishpro.space.f1.d0) {
                                        z3 = true;
                                        ((com.gamericefishpro.space.f1.d0) c0Var3).f(1);
                                    } else {
                                        z3 = true;
                                    }
                                    y3.l(h0Var, c0Var3, obj);
                                } else {
                                    z3 = z4;
                                }
                                j >>= i5;
                                i7++;
                                z4 = z3;
                                i5 = i5;
                            }
                            z2 = z4;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        z4 = z2;
                    }
                }
                Object obj2 = c0VarH.f;
                com.gamericefishpro.space.t.h0 h0Var2 = p1VarA.g;
                if (h0Var2 == null) {
                    h0Var2 = new com.gamericefishpro.space.t.h0();
                    p1VarA.g = h0Var2;
                }
                h0Var2.m(d0Var, obj2);
            }
        }
    }
}
