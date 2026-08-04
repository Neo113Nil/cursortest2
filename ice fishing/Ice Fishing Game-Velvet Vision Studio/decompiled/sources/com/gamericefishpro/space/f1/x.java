package com.gamericefishpro.space.f1;

import com.gamericefishpro.space.h2.p1;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t0.m2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final Function1 a;
    public Object b;
    public com.gamericefishpro.space.t.c0 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final com.gamericefishpro.space.t.h0 e = y3.t();
    public final com.gamericefishpro.space.t.h0 f = new com.gamericefishpro.space.t.h0();
    public final com.gamericefishpro.space.t.i0 g = new com.gamericefishpro.space.t.i0();
    public final com.gamericefishpro.space.v0.e h = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.t0.d0[16]);
    public final w i = new w(0, this);
    public final com.gamericefishpro.space.t.h0 l = y3.t();
    public final HashMap m = new HashMap();

    public x(Function1 function1) {
        this.a = function1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b A[DONT_INVERT, PHI: r23
      0x021b: PHI (r23v20 boolean) = (r23v19 boolean), (r23v21 boolean) binds: [B:93:0x01f3, B:101:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x021d A[Catch: all -> 0x012d, LOOP:8: B:92:0x01e9->B:103:0x021d, LOOP_END, TryCatch #2 {all -> 0x012d, blocks: (B:27:0x0084, B:29:0x0088, B:32:0x009c, B:34:0x00ac, B:36:0x00b6, B:38:0x00bc, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:47:0x00ef, B:50:0x0101, B:52:0x010f, B:54:0x0119, B:56:0x011f, B:60:0x0135, B:67:0x0157, B:71:0x016f, B:64:0x0140, B:65:0x0149, B:68:0x015a, B:77:0x0192, B:80:0x01ad, B:83:0x01c5, B:85:0x01d1, B:87:0x01d7, B:89:0x01db, B:92:0x01e9, B:94:0x01f5, B:96:0x0201, B:98:0x0207, B:99:0x0211, B:103:0x021d, B:104:0x0220, B:105:0x0225, B:106:0x0228), top: B:328:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02ac A[DONT_INVERT, PHI: r23
      0x02ac: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:125:0x0284, B:133:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x02ae A[LOOP:6: B:124:0x027a->B:135:0x02ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x042c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0503 A[EDGE_INSN: B:248:0x0503->B:249:0x0504 BREAK  A[LOOP:20: B:232:0x04c2->B:245:0x04f9], PHI: r2
      0x0503: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v15 boolean) binds: [B:226:0x04ad, B:230:0x04be, B:246:0x04fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:252:0x050e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0576 A[DONT_INVERT, PHI: r0
      0x0576: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:267:0x054f, B:275:0x0574] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:277:0x0578 A[LOOP:18: B:266:0x0545->B:277:0x0578, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:337:0x0157 A[EDGE_INSN: B:337:0x0157->B:67:0x0157 BREAK  A[LOOP:4: B:50:0x0101->B:64:0x0140], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x02b6 A[EDGE_INSN: B:342:0x02b6->B:137:0x02b6 BREAK  A[LOOP:6: B:124:0x027a->B:135:0x02ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0225 A[EDGE_INSN: B:347:0x0225->B:105:0x0225 BREAK  A[LOOP:8: B:92:0x01e9->B:103:0x021d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x057f A[EDGE_INSN: B:368:0x057f->B:279:0x057f BREAK  A[LOOP:18: B:266:0x0545->B:277:0x0578], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT, PHI: r23
      0x013e: PHI (r23v31 boolean) = (r23v30 boolean), (r23v32 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: all -> 0x012d, LOOP:4: B:50:0x0101->B:64:0x0140, LOOP_END, TryCatch #2 {all -> 0x012d, blocks: (B:27:0x0084, B:29:0x0088, B:32:0x009c, B:34:0x00ac, B:36:0x00b6, B:38:0x00bc, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:47:0x00ef, B:50:0x0101, B:52:0x010f, B:54:0x0119, B:56:0x011f, B:60:0x0135, B:67:0x0157, B:71:0x016f, B:64:0x0140, B:65:0x0149, B:68:0x015a, B:77:0x0192, B:80:0x01ad, B:83:0x01c5, B:85:0x01d1, B:87:0x01d7, B:89:0x01db, B:92:0x01e9, B:94:0x01f5, B:96:0x0201, B:98:0x0207, B:99:0x0211, B:103:0x021d, B:104:0x0220, B:105:0x0225, B:106:0x0228), top: B:328:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    public final boolean a(Set set) throws Throwable {
        long j;
        boolean z;
        Iterator it;
        Object obj;
        String str;
        HashMap map;
        int i;
        boolean z2;
        Iterator it2;
        Object obj2;
        String str2;
        com.gamericefishpro.space.t.h0 h0Var;
        int i2;
        boolean z3;
        long[] jArr;
        int i3;
        int i4;
        Object[] objArr;
        int i5;
        com.gamericefishpro.space.t.c0 c0Var;
        long[] jArr2;
        com.gamericefishpro.space.t0.f fVar;
        com.gamericefishpro.space.t.h0 h0Var2;
        Object[] objArr2;
        int i6;
        long[] jArr3;
        com.gamericefishpro.space.t0.f fVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        com.gamericefishpro.space.t.h0 h0Var3;
        Object[] objArr3;
        boolean z4;
        com.gamericefishpro.space.t.h0 h0Var4;
        int i11;
        int i12;
        int i13;
        long j3;
        x xVar = this;
        com.gamericefishpro.space.t0.f fVar3 = com.gamericefishpro.space.t0.f.z;
        boolean z5 = set instanceof com.gamericefishpro.space.v0.g;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        com.gamericefishpro.space.v0.e eVar = xVar.h;
        com.gamericefishpro.space.t.h0 h0Var5 = xVar.l;
        HashMap map2 = xVar.m;
        com.gamericefishpro.space.t.h0 h0Var6 = xVar.e;
        com.gamericefishpro.space.t.i0 i0Var = xVar.g;
        if (z5) {
            com.gamericefishpro.space.t.i0 i0Var2 = ((com.gamericefishpro.space.v0.g) set).d;
            Object[] objArr4 = i0Var2.b;
            long[] jArr4 = i0Var2.a;
            j = -9187201950435737472L;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i14 = 0;
                z = false;
                while (true) {
                    int i15 = 8;
                    long j4 = jArr4[i14];
                    com.gamericefishpro.space.t.h0 h0Var7 = h0Var5;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j4 & 255) < 128) {
                                Object obj3 = objArr4[(i14 << 3) + i17];
                                jArr3 = jArr4;
                                if (obj3 instanceof d0) {
                                    fVar2 = fVar3;
                                    if (!((d0) obj3).e(2)) {
                                    }
                                    j4 = j2 >> 8;
                                    i17 = i8 + 1;
                                    i15 = 8;
                                    objArr4 = objArr3;
                                    jArr4 = jArr3;
                                    fVar3 = fVar2;
                                    length = i9;
                                    i14 = i10;
                                    i16 = i7;
                                    h0Var7 = h0Var3;
                                } else {
                                    fVar2 = fVar3;
                                }
                                if (xVar.j) {
                                    h0Var3 = h0Var7;
                                    i7 = i16;
                                    i8 = i17;
                                    i9 = length;
                                    i10 = i14;
                                    j2 = j4;
                                    objArr3 = objArr4;
                                } else {
                                    h0Var3 = h0Var7;
                                    if (h0Var3.c(obj3)) {
                                        xVar.j = true;
                                        try {
                                            Object objG = h0Var3.g(obj3);
                                            if (objG != null) {
                                                objArr3 = objArr4;
                                                try {
                                                    if (objG instanceof com.gamericefishpro.space.t.i0) {
                                                        com.gamericefishpro.space.t.i0 i0Var3 = (com.gamericefishpro.space.t.i0) objG;
                                                        Object[] objArr5 = i0Var3.b;
                                                        long[] jArr5 = i0Var3.a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j2 = j4;
                                                            int i18 = 0;
                                                            while (true) {
                                                                long j5 = jArr5[i18];
                                                                i9 = length;
                                                                i10 = i14;
                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                    int i20 = 0;
                                                                    while (i20 < i19) {
                                                                        if ((j5 & 255) < 128) {
                                                                            i12 = i17;
                                                                            com.gamericefishpro.space.t0.d0 d0Var = (com.gamericefishpro.space.t0.d0) objArr5[(i18 << 3) + i20];
                                                                            Intrinsics.c(d0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                            i13 = i20;
                                                                            Object obj4 = map2.get(d0Var);
                                                                            j3 = j5;
                                                                            m2 m2Var = d0Var.i;
                                                                            if (m2Var == null) {
                                                                                m2Var = fVar2;
                                                                            }
                                                                            if (m2Var.a(d0Var.h().f, obj4)) {
                                                                                h0Var4 = h0Var3;
                                                                                i11 = i16;
                                                                                eVar.b(d0Var);
                                                                            } else {
                                                                                Object objG2 = h0Var6.g(d0Var);
                                                                                if (objG2 == null) {
                                                                                    h0Var4 = h0Var3;
                                                                                    i11 = i16;
                                                                                } else if (objG2 instanceof com.gamericefishpro.space.t.i0) {
                                                                                    com.gamericefishpro.space.t.i0 i0Var4 = (com.gamericefishpro.space.t.i0) objG2;
                                                                                    Object[] objArr6 = i0Var4.b;
                                                                                    long[] jArr6 = i0Var4.a;
                                                                                    int length3 = jArr6.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        i11 = i16;
                                                                                        int i21 = 0;
                                                                                        while (true) {
                                                                                            long j6 = jArr6[i21];
                                                                                            h0Var4 = h0Var3;
                                                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                                if (i21 != length3) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i21++;
                                                                                                i15 = 8;
                                                                                                h0Var3 = h0Var4;
                                                                                            } else {
                                                                                                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                                                                                for (int i23 = 0; i23 < i22; i23++) {
                                                                                                    if ((j6 & 255) < 128) {
                                                                                                        i0Var.a(objArr6[(i21 << 3) + i23]);
                                                                                                        z = true;
                                                                                                    }
                                                                                                    j6 >>= i15;
                                                                                                }
                                                                                                if (i22 != i15) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i21 != length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i21++;
                                                                                                i15 = 8;
                                                                                                h0Var3 = h0Var4;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        h0Var4 = h0Var3;
                                                                                        i11 = i16;
                                                                                    }
                                                                                } else {
                                                                                    h0Var4 = h0Var3;
                                                                                    i11 = i16;
                                                                                    i0Var.a(objG2);
                                                                                    z = true;
                                                                                }
                                                                                Unit unit = Unit.a;
                                                                            }
                                                                        } else {
                                                                            h0Var4 = h0Var3;
                                                                            i11 = i16;
                                                                            i12 = i17;
                                                                            i13 = i20;
                                                                            j3 = j5;
                                                                        }
                                                                        j5 = j3 >> 8;
                                                                        i20 = i13 + 1;
                                                                        i15 = 8;
                                                                        i17 = i12;
                                                                        i16 = i11;
                                                                        h0Var3 = h0Var4;
                                                                    }
                                                                    h0Var3 = h0Var3;
                                                                    i7 = i16;
                                                                    i8 = i17;
                                                                    if (i19 != i15) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    h0Var3 = h0Var3;
                                                                    i7 = i16;
                                                                    i8 = i17;
                                                                }
                                                                if (i18 == length2) {
                                                                    break;
                                                                }
                                                                i18++;
                                                                i15 = 8;
                                                                length = i9;
                                                                i14 = i10;
                                                                i17 = i8;
                                                                i16 = i7;
                                                                h0Var3 = h0Var3;
                                                            }
                                                        }
                                                    } else {
                                                        h0Var3 = h0Var3;
                                                        i7 = i16;
                                                        i8 = i17;
                                                        i9 = length;
                                                        i10 = i14;
                                                        j2 = j4;
                                                        com.gamericefishpro.space.t0.d0 d0Var2 = (com.gamericefishpro.space.t0.d0) objG;
                                                        Object obj5 = map2.get(d0Var2);
                                                        m2 m2Var2 = d0Var2.i;
                                                        if (m2Var2 == null) {
                                                            m2Var2 = fVar2;
                                                        }
                                                        if (m2Var2.a(d0Var2.h().f, obj5)) {
                                                            eVar.b(d0Var2);
                                                        } else {
                                                            Object objG3 = h0Var6.g(d0Var2);
                                                            if (objG3 != null) {
                                                                if (objG3 instanceof com.gamericefishpro.space.t.i0) {
                                                                    com.gamericefishpro.space.t.i0 i0Var5 = (com.gamericefishpro.space.t.i0) objG3;
                                                                    Object[] objArr7 = i0Var5.b;
                                                                    long[] jArr7 = i0Var5.a;
                                                                    int length4 = jArr7.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i24 = 0;
                                                                        while (true) {
                                                                            long j7 = jArr7[i24];
                                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i24 != length4) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i24++;
                                                                            } else {
                                                                                int i25 = 8 - ((~(i24 - length4)) >>> 31);
                                                                                for (int i26 = 0; i26 < i25; i26++) {
                                                                                    if ((j7 & 255) < 128) {
                                                                                        i0Var.a(objArr7[(i24 << 3) + i26]);
                                                                                        z = true;
                                                                                    }
                                                                                    j7 >>= 8;
                                                                                }
                                                                                if (i25 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i24 != length4) {
                                                                                    break;
                                                                                }
                                                                                i24++;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i0Var.a(objG3);
                                                                    z = true;
                                                                }
                                                            }
                                                            Unit unit2 = Unit.a;
                                                        }
                                                    }
                                                    xVar = this;
                                                    xVar.j = false;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z4 = false;
                                                    xVar = this;
                                                    xVar.j = z4;
                                                    throw th;
                                                }
                                            } else {
                                                objArr3 = objArr4;
                                            }
                                            i7 = i16;
                                            i8 = i17;
                                            i9 = length;
                                            i10 = i14;
                                            j2 = j4;
                                            xVar = this;
                                            xVar.j = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z4 = false;
                                        }
                                    } else {
                                        h0Var3 = h0Var3;
                                        objArr3 = objArr4;
                                        i7 = i16;
                                        i8 = i17;
                                        i9 = length;
                                        i10 = i14;
                                        j2 = j4;
                                    }
                                }
                                Object objG4 = h0Var6.g(obj3);
                                if (objG4 != null) {
                                    if (objG4 instanceof com.gamericefishpro.space.t.i0) {
                                        com.gamericefishpro.space.t.i0 i0Var6 = (com.gamericefishpro.space.t.i0) objG4;
                                        Object[] objArr8 = i0Var6.b;
                                        long[] jArr8 = i0Var6.a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                long j8 = jArr8[i27];
                                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i27 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i27++;
                                                } else {
                                                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                    for (int i29 = 0; i29 < i28; i29++) {
                                                        if ((j8 & 255) < 128) {
                                                            i0Var.a(objArr8[(i27 << 3) + i29]);
                                                            z = true;
                                                        }
                                                        j8 >>= 8;
                                                    }
                                                    if (i28 != 8) {
                                                        break;
                                                    }
                                                    if (i27 != length5) {
                                                        break;
                                                    }
                                                    i27++;
                                                }
                                            }
                                        }
                                    } else {
                                        i0Var.a(objG4);
                                        z = true;
                                    }
                                }
                                j4 = j2 >> 8;
                                i17 = i8 + 1;
                                i15 = 8;
                                objArr4 = objArr3;
                                jArr4 = jArr3;
                                fVar3 = fVar2;
                                length = i9;
                                i14 = i10;
                                i16 = i7;
                                h0Var7 = h0Var3;
                            } else {
                                jArr3 = jArr4;
                                fVar2 = fVar3;
                            }
                            i7 = i16;
                            i8 = i17;
                            i9 = length;
                            i10 = i14;
                            j2 = j4;
                            h0Var3 = h0Var7;
                            objArr3 = objArr4;
                            j4 = j2 >> 8;
                            i17 = i8 + 1;
                            i15 = 8;
                            objArr4 = objArr3;
                            jArr4 = jArr3;
                            fVar3 = fVar2;
                            length = i9;
                            i14 = i10;
                            i16 = i7;
                            h0Var7 = h0Var3;
                        }
                        jArr2 = jArr4;
                        fVar = fVar3;
                        int i30 = length;
                        int i31 = i14;
                        h0Var2 = h0Var7;
                        objArr2 = objArr4;
                        if (i16 != i15) {
                            break;
                        }
                        length = i30;
                        i6 = i31;
                    } else {
                        jArr2 = jArr4;
                        fVar = fVar3;
                        h0Var2 = h0Var7;
                        objArr2 = objArr4;
                        i6 = i14;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i14 = i6 + 1;
                    objArr4 = objArr2;
                    jArr4 = jArr2;
                    fVar3 = fVar;
                    h0Var5 = h0Var2;
                }
            } else {
                z = false;
            }
        } else {
            com.gamericefishpro.space.t.h0 h0Var8 = h0Var5;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z6 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof d0) || ((d0) next).e(2)) {
                    if (xVar.j) {
                        it = it3;
                        obj = next;
                        str = str3;
                        map = map2;
                        i = 0;
                    } else {
                        com.gamericefishpro.space.t.h0 h0Var9 = h0Var8;
                        if (h0Var9.c(next)) {
                            xVar.j = true;
                            try {
                                Object objG5 = h0Var9.g(next);
                                if (objG5 == null) {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    h0Var8 = h0Var9;
                                    map = map2;
                                } else if (objG5 instanceof com.gamericefishpro.space.t.i0) {
                                    com.gamericefishpro.space.t.i0 i0Var7 = (com.gamericefishpro.space.t.i0) objG5;
                                    Object[] objArr9 = i0Var7.b;
                                    long[] jArr9 = i0Var7.a;
                                    int length6 = jArr9.length - 2;
                                    if (length6 >= 0) {
                                        boolean z7 = z6;
                                        map = map2;
                                        int i32 = 0;
                                        while (true) {
                                            long j9 = jArr9[i32];
                                            long[] jArr10 = jArr9;
                                            Object[] objArr10 = objArr9;
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                                long j10 = j9;
                                                int i34 = 0;
                                                while (i34 < i33) {
                                                    if ((j10 & 255) < 128) {
                                                        com.gamericefishpro.space.t0.d0 d0Var3 = (com.gamericefishpro.space.t0.d0) objArr10[(i32 << 3) + i34];
                                                        Intrinsics.c(d0Var3, str3);
                                                        Object obj6 = map.get(d0Var3);
                                                        it2 = it3;
                                                        m2 m2Var3 = d0Var3.i;
                                                        if (m2Var3 == null) {
                                                            m2Var3 = fVar3;
                                                        }
                                                        str2 = str3;
                                                        if (m2Var3.a(d0Var3.h().f, obj6)) {
                                                            obj2 = next;
                                                            h0Var = h0Var9;
                                                            i2 = i34;
                                                            eVar.b(d0Var3);
                                                        } else {
                                                            Object objG6 = h0Var6.g(d0Var3);
                                                            if (objG6 == null) {
                                                                obj2 = next;
                                                                h0Var = h0Var9;
                                                                i2 = i34;
                                                                z3 = z7;
                                                            } else if (objG6 instanceof com.gamericefishpro.space.t.i0) {
                                                                com.gamericefishpro.space.t.i0 i0Var8 = (com.gamericefishpro.space.t.i0) objG6;
                                                                Object[] objArr11 = i0Var8.b;
                                                                long[] jArr11 = i0Var8.a;
                                                                int length7 = jArr11.length - 2;
                                                                if (length7 >= 0) {
                                                                    h0Var = h0Var9;
                                                                    i2 = i34;
                                                                    int i35 = 0;
                                                                    while (true) {
                                                                        long j11 = jArr11[i35];
                                                                        obj2 = next;
                                                                        Object[] objArr12 = objArr11;
                                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                                            int i37 = 0;
                                                                            while (i37 < i36) {
                                                                                if ((j11 & 255) < 128) {
                                                                                    i0Var.a(objArr12[(i35 << 3) + i37]);
                                                                                    z7 = true;
                                                                                }
                                                                                j11 >>= 8;
                                                                                i37++;
                                                                                jArr11 = jArr11;
                                                                            }
                                                                            jArr = jArr11;
                                                                            if (i36 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr = jArr11;
                                                                        }
                                                                        if (i35 == length7) {
                                                                            break;
                                                                        }
                                                                        i35++;
                                                                        next = obj2;
                                                                        objArr11 = objArr12;
                                                                        jArr11 = jArr;
                                                                    }
                                                                } else {
                                                                    obj2 = next;
                                                                    h0Var = h0Var9;
                                                                    i2 = i34;
                                                                }
                                                                z3 = z7;
                                                            } else {
                                                                obj2 = next;
                                                                h0Var = h0Var9;
                                                                i2 = i34;
                                                                i0Var.a(objG6);
                                                                z3 = true;
                                                            }
                                                            Unit unit3 = Unit.a;
                                                            z7 = z3;
                                                        }
                                                    } else {
                                                        it2 = it3;
                                                        obj2 = next;
                                                        str2 = str3;
                                                        h0Var = h0Var9;
                                                        i2 = i34;
                                                    }
                                                    j10 >>= 8;
                                                    i34 = i2 + 1;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    next = obj2;
                                                    h0Var9 = h0Var;
                                                }
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                h0Var8 = h0Var9;
                                                if (i33 != 8) {
                                                    break;
                                                }
                                            } else {
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                h0Var8 = h0Var9;
                                            }
                                            if (i32 == length6) {
                                                break;
                                            }
                                            i32++;
                                            it3 = it;
                                            objArr9 = objArr10;
                                            jArr9 = jArr10;
                                            str3 = str;
                                            next = obj;
                                            h0Var9 = h0Var8;
                                        }
                                        z6 = z7;
                                    } else {
                                        it = it3;
                                        obj = next;
                                        str = str3;
                                        h0Var8 = h0Var9;
                                        map = map2;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    h0Var8 = h0Var9;
                                    map = map2;
                                    com.gamericefishpro.space.t0.d0 d0Var4 = (com.gamericefishpro.space.t0.d0) objG5;
                                    Object obj7 = map.get(d0Var4);
                                    m2 m2Var4 = d0Var4.i;
                                    if (m2Var4 == null) {
                                        m2Var4 = fVar3;
                                    }
                                    if (m2Var4.a(d0Var4.h().f, obj7)) {
                                        eVar.b(d0Var4);
                                    } else {
                                        Object objG7 = h0Var6.g(d0Var4);
                                        if (objG7 == null) {
                                            z2 = z6;
                                            break;
                                        }
                                        if (objG7 instanceof com.gamericefishpro.space.t.i0) {
                                            com.gamericefishpro.space.t.i0 i0Var9 = (com.gamericefishpro.space.t.i0) objG7;
                                            Object[] objArr13 = i0Var9.b;
                                            long[] jArr12 = i0Var9.a;
                                            int length8 = jArr12.length - 2;
                                            if (length8 < 0) {
                                                z2 = z6;
                                                break;
                                            }
                                            boolean z8 = z6;
                                            int i38 = 0;
                                            while (true) {
                                                long j12 = jArr12[i38];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i39 = 8 - ((~(i38 - length8)) >>> 31);
                                                    long j13 = j12;
                                                    for (int i40 = 0; i40 < i39; i40++) {
                                                        if ((j13 & 255) < 128) {
                                                            i0Var.a(objArr13[(i38 << 3) + i40]);
                                                            z8 = true;
                                                        }
                                                        j13 >>= 8;
                                                    }
                                                    if (i39 != 8) {
                                                        z2 = z8;
                                                        break;
                                                    }
                                                }
                                                if (i38 == length8) {
                                                    z6 = z8;
                                                    z2 = z6;
                                                    break;
                                                }
                                                i38++;
                                            }
                                        } else {
                                            i0Var.a(objG7);
                                            z2 = true;
                                        }
                                        Unit unit4 = Unit.a;
                                        z6 = z2;
                                    }
                                }
                                i = 0;
                                xVar.j = false;
                            } catch (Throwable th3) {
                                xVar.j = false;
                                throw th3;
                            }
                        } else {
                            h0Var8 = h0Var9;
                            it = it3;
                            obj = next;
                            str = str3;
                            map = map2;
                            i = 0;
                        }
                    }
                    boolean z9 = z6;
                    Object objG8 = h0Var6.g(obj);
                    if (objG8 != null) {
                        if (objG8 instanceof com.gamericefishpro.space.t.i0) {
                            com.gamericefishpro.space.t.i0 i0Var10 = (com.gamericefishpro.space.t.i0) objG8;
                            Object[] objArr14 = i0Var10.b;
                            long[] jArr13 = i0Var10.a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i41 = i;
                                while (true) {
                                    long j14 = jArr13[i41];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i41 != length9) {
                                            break;
                                            break;
                                        }
                                        i41++;
                                    } else {
                                        int i42 = 8 - ((~(i41 - length9)) >>> 31);
                                        for (int i43 = i; i43 < i42; i43++) {
                                            if ((j14 & 255) < 128) {
                                                i0Var.a(objArr14[(i41 << 3) + i43]);
                                                z9 = true;
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i42 != 8) {
                                            break;
                                        }
                                        if (i41 != length9) {
                                            break;
                                        }
                                        i41++;
                                    }
                                }
                            }
                        } else {
                            i0Var.a(objG8);
                            z9 = true;
                        }
                    }
                    z6 = z9;
                } else {
                    it = it3;
                    str = str3;
                    map = map2;
                }
                it3 = it;
                map2 = map;
                str3 = str;
            }
            z = z6;
        }
        int i44 = 0;
        if (!xVar.j && (i3 = eVar.i) != 0) {
            Object[] objArr15 = eVar.d;
            int i45 = 0;
            while (i45 < i3) {
                com.gamericefishpro.space.t0.d0 d0Var5 = (com.gamericefishpro.space.t0.d0) objArr15[i45];
                int iHashCode = Long.hashCode(p.j().g());
                Object objG9 = h0Var6.g(d0Var5);
                if (objG9 != null) {
                    boolean z10 = objG9 instanceof com.gamericefishpro.space.t.i0;
                    com.gamericefishpro.space.t.h0 h0Var10 = xVar.f;
                    if (z10) {
                        com.gamericefishpro.space.t.i0 i0Var11 = (com.gamericefishpro.space.t.i0) objG9;
                        Object[] objArr16 = i0Var11.b;
                        long[] jArr14 = i0Var11.a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i46 = i44;
                            while (true) {
                                long j15 = jArr14[i46];
                                i5 = i45;
                                if ((((~j15) << 7) & j15 & j) != j) {
                                    int i47 = 8 - ((~(i46 - length10)) >>> 31);
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        if ((j15 & 255) < 128) {
                                            Object obj8 = objArr16[(i46 << 3) + i48];
                                            com.gamericefishpro.space.t.c0 c0Var2 = (com.gamericefishpro.space.t.c0) h0Var10.g(obj8);
                                            if (c0Var2 == null) {
                                                c0Var = new com.gamericefishpro.space.t.c0();
                                                h0Var10.m(obj8, c0Var);
                                                Unit unit5 = Unit.a;
                                            } else {
                                                c0Var = c0Var2;
                                            }
                                            xVar.b(d0Var5, iHashCode, obj8, c0Var);
                                        }
                                        j15 >>= 8;
                                        i48++;
                                        i3 = i3;
                                        objArr15 = objArr15;
                                    }
                                    i4 = i3;
                                    objArr = objArr15;
                                    if (i47 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    objArr = objArr15;
                                }
                                if (i46 == length10) {
                                    break;
                                }
                                i46++;
                                i45 = i5;
                                i3 = i4;
                                objArr15 = objArr;
                            }
                        } else {
                            i4 = i3;
                            objArr = objArr15;
                            i5 = i45;
                        }
                    } else {
                        i4 = i3;
                        objArr = objArr15;
                        i5 = i45;
                        com.gamericefishpro.space.t.c0 c0Var3 = (com.gamericefishpro.space.t.c0) h0Var10.g(objG9);
                        if (c0Var3 == null) {
                            c0Var3 = new com.gamericefishpro.space.t.c0();
                            h0Var10.m(objG9, c0Var3);
                            Unit unit6 = Unit.a;
                        }
                        xVar.b(d0Var5, iHashCode, objG9, c0Var3);
                    }
                } else {
                    i4 = i3;
                    objArr = objArr15;
                    i5 = i45;
                }
                i45 = i5 + 1;
                i3 = i4;
                objArr15 = objArr;
                i44 = 0;
            }
            eVar.g();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, com.gamericefishpro.space.t.c0 c0Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = c0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = c0Var.c[iC];
        }
        c0Var.b[iC] = obj;
        c0Var.c[iC] = i;
        if ((obj instanceof com.gamericefishpro.space.t0.d0) && i2 != i) {
            com.gamericefishpro.space.t0.c0 c0VarH = ((com.gamericefishpro.space.t0.d0) obj).h();
            this.m.put(obj, c0VarH.f);
            com.gamericefishpro.space.t.c0 c0Var2 = c0VarH.e;
            com.gamericefishpro.space.t.h0 h0Var = this.l;
            y3.J(h0Var, obj);
            Object[] objArr = c0Var2.b;
            long[] jArr = c0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                c0 c0Var3 = (c0) objArr[(i3 << 3) + i5];
                                if (c0Var3 instanceof d0) {
                                    ((d0) c0Var3).f(2);
                                }
                                y3.l(h0Var, c0Var3, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof d0) {
                ((d0) obj).f(2);
            }
            y3.l(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        com.gamericefishpro.space.t.h0 h0Var = this.e;
        y3.I(h0Var, obj2, obj);
        if (!(obj2 instanceof com.gamericefishpro.space.t0.d0) || h0Var.c(obj2)) {
            return;
        }
        y3.J(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[EDGE_INSN: B:48:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        com.gamericefishpro.space.t.h0 h0Var = this.f;
        long[] jArr3 = h0Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = h0Var.b[i6];
                        j2 = j4;
                        com.gamericefishpro.space.t.c0 c0Var = (com.gamericefishpro.space.t.c0) h0Var.c[i6];
                        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zT = ((p1) obj).t();
                        if (zT) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zT;
                        } else {
                            Object[] objArr = c0Var.b;
                            int[] iArr = c0Var.c;
                            long[] jArr4 = c0Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zT;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zT = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zT = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zT;
                            }
                        }
                        if (!z) {
                            h0Var.l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
