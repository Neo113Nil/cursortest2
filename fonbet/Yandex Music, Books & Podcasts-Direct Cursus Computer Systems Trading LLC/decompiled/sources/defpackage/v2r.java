package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v2r {
    public final Function1 a;
    public Object b;
    public cpi c;
    public int j;
    public int d = -1;
    public final tpi e = ldg.n();
    public final tpi f = new tpi();
    public final upi g = new upi();
    public final eqi h = new eqi(new zx7[16]);
    public final nq5 i = new nq5(1, this);
    public final tpi k = ldg.n();
    public final HashMap l = new HashMap();

    public v2r(Function1 function1) {
        this.a = function1;
    }

    public final void a(Object obj, hxo hxoVar, Function0 function0) {
        boolean z;
        int i;
        int i2;
        Object obj2 = this.b;
        cpi cpiVar = this.c;
        int i3 = this.d;
        this.b = obj;
        this.c = (cpi) this.f.g(obj);
        if (this.d == -1) {
            this.d = Long.hashCode(g2r.k().g());
        }
        nq5 nq5Var = this.i;
        eqi S = szf.S();
        boolean z2 = true;
        try {
            S.d(nq5Var);
            wyf.U(function0, hxoVar);
            S.m(S.c - 1);
            Object obj3 = this.b;
            obj3.getClass();
            int i4 = this.d;
            cpi cpiVar2 = this.c;
            if (cpiVar2 != null) {
                long[] jArr = cpiVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            z = z2;
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    i2 = i6;
                                    Object obj4 = cpiVar2.b[i9];
                                    i = i8;
                                    boolean z3 = cpiVar2.c[i9] != i4 ? z : false;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        cpiVar2.h(i9);
                                    }
                                } else {
                                    i = i8;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8 = i + 1;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z2 = z;
                    }
                }
            }
            this.b = obj2;
            this.c = cpiVar;
            this.d = i3;
        } catch (Throwable th) {
            S.m(S.c - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x053f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        Object g;
        int i;
        Object g2;
        Object[] objArr;
        long[] jArr;
        Iterator it2;
        int i2;
        Object[] objArr2;
        long j2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i3;
        Object[] objArr5;
        int i4;
        int i5;
        int i6;
        cpi cpiVar;
        long[] jArr3;
        ehv ehvVar;
        Object[] objArr6;
        tpi tpiVar;
        HashMap hashMap;
        long[] jArr4;
        ehv ehvVar2;
        Object[] objArr7;
        tpi tpiVar2;
        HashMap hashMap2;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        Object g3;
        HashMap hashMap3;
        Object[] objArr8;
        tpi tpiVar3;
        HashMap hashMap4;
        int i11;
        int i12;
        long j4;
        int i13;
        long[] jArr5;
        long[] jArr6;
        ehv ehvVar3 = ehv.h;
        boolean z2 = set instanceof yso;
        eqi eqiVar = this.h;
        int i14 = 8;
        tpi tpiVar4 = this.k;
        HashMap hashMap5 = this.l;
        tpi tpiVar5 = this.e;
        upi upiVar = this.g;
        if (z2) {
            upi upiVar2 = ((yso) set).a;
            Object[] objArr9 = upiVar2.b;
            long[] jArr7 = upiVar2.a;
            c = 7;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i15 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j5 = jArr7[i15];
                    int i16 = i15;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j5 & 255) < 128) {
                                int i19 = i14;
                                Object obj = objArr9[(i16 << 3) + i18];
                                jArr4 = jArr7;
                                if (obj instanceof ner) {
                                    ehvVar2 = ehvVar3;
                                    if (!((ner) obj).b(2)) {
                                        objArr7 = objArr9;
                                        tpiVar2 = tpiVar4;
                                        hashMap2 = hashMap5;
                                        i7 = length;
                                        i8 = i17;
                                        i9 = i18;
                                        j3 = j5;
                                        i10 = 8;
                                    }
                                } else {
                                    ehvVar2 = ehvVar3;
                                }
                                if (!tpiVar4.c(obj) || (g3 = tpiVar4.g(obj)) == null) {
                                    objArr7 = objArr9;
                                    tpiVar2 = tpiVar4;
                                    hashMap2 = hashMap5;
                                    i7 = length;
                                    i8 = i17;
                                    i9 = i18;
                                    j3 = j5;
                                } else if (g3 instanceof upi) {
                                    upi upiVar3 = (upi) g3;
                                    Object[] objArr10 = upiVar3.b;
                                    long[] jArr8 = upiVar3.a;
                                    int length2 = jArr8.length - 2;
                                    if (length2 >= 0) {
                                        i9 = i18;
                                        boolean z3 = z;
                                        int i20 = 0;
                                        while (true) {
                                            long j6 = jArr8[i20];
                                            j3 = j5;
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                int i22 = 0;
                                                while (i22 < i21) {
                                                    if ((j6 & 255) < 128) {
                                                        objArr8 = objArr9;
                                                        zx7 zx7Var = (zx7) objArr10[(i20 << 3) + i22];
                                                        zx7Var.getClass();
                                                        j4 = j6;
                                                        Object obj2 = hashMap5.get(zx7Var);
                                                        n2r n2rVar = zx7Var.c;
                                                        if (n2rVar == null) {
                                                            n2rVar = ehvVar2;
                                                        }
                                                        i13 = i22;
                                                        if (n2rVar.J(zx7Var.i().f, obj2)) {
                                                            tpiVar3 = tpiVar4;
                                                            hashMap4 = hashMap5;
                                                            i11 = length;
                                                            i12 = i17;
                                                            eqiVar.d(zx7Var);
                                                        } else {
                                                            Object g4 = tpiVar5.g(zx7Var);
                                                            if (g4 != null) {
                                                                if (g4 instanceof upi) {
                                                                    upi upiVar4 = (upi) g4;
                                                                    Object[] objArr11 = upiVar4.b;
                                                                    long[] jArr9 = upiVar4.a;
                                                                    int length3 = jArr9.length - 2;
                                                                    if (length3 >= 0) {
                                                                        i11 = length;
                                                                        i12 = i17;
                                                                        int i23 = 0;
                                                                        while (true) {
                                                                            long j7 = jArr9[i23];
                                                                            tpiVar3 = tpiVar4;
                                                                            hashMap4 = hashMap5;
                                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                                                                int i25 = 0;
                                                                                while (i25 < i24) {
                                                                                    if ((j7 & 255) < 128) {
                                                                                        jArr6 = jArr9;
                                                                                        upiVar.a(objArr11[(i23 << 3) + i25]);
                                                                                        z3 = true;
                                                                                    } else {
                                                                                        jArr6 = jArr9;
                                                                                    }
                                                                                    j7 >>= i19;
                                                                                    i25++;
                                                                                    jArr9 = jArr6;
                                                                                }
                                                                                jArr5 = jArr9;
                                                                                if (i24 != i19) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr5 = jArr9;
                                                                            }
                                                                            if (i23 == length3) {
                                                                                break;
                                                                            }
                                                                            i23++;
                                                                            tpiVar4 = tpiVar3;
                                                                            hashMap5 = hashMap4;
                                                                            jArr9 = jArr5;
                                                                            i19 = 8;
                                                                        }
                                                                    }
                                                                } else {
                                                                    tpiVar3 = tpiVar4;
                                                                    hashMap4 = hashMap5;
                                                                    i11 = length;
                                                                    i12 = i17;
                                                                    upiVar.a(g4);
                                                                    z3 = true;
                                                                }
                                                            }
                                                            tpiVar3 = tpiVar4;
                                                            hashMap4 = hashMap5;
                                                            i11 = length;
                                                            i12 = i17;
                                                        }
                                                    } else {
                                                        objArr8 = objArr9;
                                                        tpiVar3 = tpiVar4;
                                                        hashMap4 = hashMap5;
                                                        i11 = length;
                                                        i12 = i17;
                                                        j4 = j6;
                                                        i13 = i22;
                                                    }
                                                    j6 = j4 >> 8;
                                                    i22 = i13 + 1;
                                                    i19 = 8;
                                                    objArr9 = objArr8;
                                                    length = i11;
                                                    i17 = i12;
                                                    tpiVar4 = tpiVar3;
                                                    hashMap5 = hashMap4;
                                                }
                                                objArr7 = objArr9;
                                                tpiVar2 = tpiVar4;
                                                hashMap3 = hashMap5;
                                                i7 = length;
                                                i8 = i17;
                                                if (i21 != i19) {
                                                    break;
                                                }
                                            } else {
                                                objArr7 = objArr9;
                                                tpiVar2 = tpiVar4;
                                                hashMap3 = hashMap5;
                                                i7 = length;
                                                i8 = i17;
                                            }
                                            if (i20 == length2) {
                                                break;
                                            }
                                            i20++;
                                            j5 = j3;
                                            objArr9 = objArr7;
                                            length = i7;
                                            i17 = i8;
                                            tpiVar4 = tpiVar2;
                                            hashMap5 = hashMap3;
                                            i19 = 8;
                                        }
                                        z = z3;
                                    } else {
                                        objArr7 = objArr9;
                                        tpiVar2 = tpiVar4;
                                        hashMap3 = hashMap5;
                                        i7 = length;
                                        i8 = i17;
                                        i9 = i18;
                                        j3 = j5;
                                    }
                                    hashMap2 = hashMap3;
                                } else {
                                    objArr7 = objArr9;
                                    tpiVar2 = tpiVar4;
                                    i7 = length;
                                    i8 = i17;
                                    i9 = i18;
                                    j3 = j5;
                                    zx7 zx7Var2 = (zx7) g3;
                                    hashMap2 = hashMap5;
                                    Object obj3 = hashMap2.get(zx7Var2);
                                    n2r n2rVar2 = zx7Var2.c;
                                    if (n2rVar2 == null) {
                                        n2rVar2 = ehvVar2;
                                    }
                                    if (n2rVar2.J(zx7Var2.i().f, obj3)) {
                                        eqiVar.d(zx7Var2);
                                    } else {
                                        Object g5 = tpiVar5.g(zx7Var2);
                                        if (g5 != null) {
                                            if (g5 instanceof upi) {
                                                upi upiVar5 = (upi) g5;
                                                Object[] objArr12 = upiVar5.b;
                                                long[] jArr10 = upiVar5.a;
                                                int length4 = jArr10.length - 2;
                                                if (length4 >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        long j8 = jArr10[i26];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                                                            for (int i28 = 0; i28 < i27; i28++) {
                                                                if ((j8 & 255) < 128) {
                                                                    upiVar.a(objArr12[(i26 << 3) + i28]);
                                                                    z = true;
                                                                }
                                                                j8 >>= 8;
                                                            }
                                                            if (i27 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i26 == length4) {
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                }
                                            } else {
                                                upiVar.a(g5);
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                Object g6 = tpiVar5.g(obj);
                                if (g6 != null) {
                                    if (g6 instanceof upi) {
                                        upi upiVar6 = (upi) g6;
                                        Object[] objArr13 = upiVar6.b;
                                        long[] jArr11 = upiVar6.a;
                                        int length5 = jArr11.length - 2;
                                        if (length5 >= 0) {
                                            int i29 = 0;
                                            while (true) {
                                                long j9 = jArr11[i29];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31++) {
                                                        if ((j9 & 255) < 128) {
                                                            upiVar.a(objArr13[(i29 << 3) + i31]);
                                                            z = true;
                                                        }
                                                        j9 >>= 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                            }
                                        }
                                    } else {
                                        upiVar.a(g6);
                                        z = true;
                                    }
                                }
                                i10 = 8;
                            } else {
                                jArr4 = jArr7;
                                ehvVar2 = ehvVar3;
                                objArr7 = objArr9;
                                tpiVar2 = tpiVar4;
                                hashMap2 = hashMap5;
                                i7 = length;
                                i8 = i17;
                                i9 = i18;
                                j3 = j5;
                                i10 = i14;
                            }
                            i18 = i9 + 1;
                            i14 = i10;
                            jArr7 = jArr4;
                            objArr9 = objArr7;
                            length = i7;
                            i17 = i8;
                            j5 = j3 >> i10;
                            tpiVar4 = tpiVar2;
                            hashMap5 = hashMap2;
                            ehvVar3 = ehvVar2;
                        }
                        jArr3 = jArr7;
                        ehvVar = ehvVar3;
                        objArr6 = objArr9;
                        tpiVar = tpiVar4;
                        hashMap = hashMap5;
                        int i32 = length;
                        if (i17 != i14) {
                            break;
                        }
                        length = i32;
                    } else {
                        jArr3 = jArr7;
                        ehvVar = ehvVar3;
                        objArr6 = objArr9;
                        tpiVar = tpiVar4;
                        hashMap = hashMap5;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i15 = i16 + 1;
                    hashMap5 = hashMap;
                    jArr7 = jArr3;
                    ehvVar3 = ehvVar;
                    objArr9 = objArr6;
                    tpiVar4 = tpiVar;
                    i14 = 8;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            tpi tpiVar6 = tpiVar4;
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof ner) || ((ner) next).b(2)) {
                    tpi tpiVar7 = tpiVar6;
                    if (tpiVar7.c(next) && (g2 = tpiVar7.g(next)) != null) {
                        if (g2 instanceof upi) {
                            upi upiVar7 = (upi) g2;
                            Object[] objArr14 = upiVar7.b;
                            long[] jArr12 = upiVar7.a;
                            int length6 = jArr12.length - 2;
                            if (length6 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j10 = jArr12[i33];
                                    tpiVar6 = tpiVar7;
                                    long[] jArr13 = jArr12;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length6)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j10 & 255) < 128) {
                                                it2 = it3;
                                                zx7 zx7Var3 = (zx7) objArr14[(i33 << 3) + i35];
                                                zx7Var3.getClass();
                                                i2 = i35;
                                                Object obj4 = hashMap5.get(zx7Var3);
                                                objArr2 = objArr14;
                                                n2r n2rVar3 = zx7Var3.c;
                                                if (n2rVar3 == null) {
                                                    n2rVar3 = ehvVar3;
                                                }
                                                boolean z4 = z;
                                                if (n2rVar3.J(zx7Var3.i().f, obj4)) {
                                                    j2 = j10;
                                                    jArr2 = jArr13;
                                                    eqiVar.d(zx7Var3);
                                                } else {
                                                    Object g7 = tpiVar5.g(zx7Var3);
                                                    if (g7 != null) {
                                                        if (g7 instanceof upi) {
                                                            upi upiVar8 = (upi) g7;
                                                            Object[] objArr15 = upiVar8.b;
                                                            long[] jArr14 = upiVar8.a;
                                                            int length7 = jArr14.length - 2;
                                                            if (length7 >= 0) {
                                                                j2 = j10;
                                                                boolean z5 = z4;
                                                                int i36 = 0;
                                                                while (true) {
                                                                    long j11 = jArr14[i36];
                                                                    z4 = z5;
                                                                    jArr2 = jArr13;
                                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                                        int i38 = 0;
                                                                        while (i38 < i37) {
                                                                            if ((j11 & 255) < 128) {
                                                                                objArr4 = objArr15;
                                                                                upiVar.a(objArr4[(i36 << 3) + i38]);
                                                                                z4 = true;
                                                                            } else {
                                                                                objArr4 = objArr15;
                                                                            }
                                                                            j11 >>= 8;
                                                                            i38++;
                                                                            objArr15 = objArr4;
                                                                        }
                                                                        objArr3 = objArr15;
                                                                        if (i37 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        objArr3 = objArr15;
                                                                    }
                                                                    z5 = z4;
                                                                    if (i36 == length7) {
                                                                        z = z5;
                                                                        break;
                                                                    }
                                                                    i36++;
                                                                    jArr13 = jArr2;
                                                                    objArr15 = objArr3;
                                                                }
                                                            }
                                                        } else {
                                                            j2 = j10;
                                                            jArr2 = jArr13;
                                                            upiVar.a(g7);
                                                            z = true;
                                                        }
                                                    }
                                                    j2 = j10;
                                                    jArr2 = jArr13;
                                                }
                                                z = z4;
                                            } else {
                                                it2 = it3;
                                                i2 = i35;
                                                objArr2 = objArr14;
                                                j2 = j10;
                                                jArr2 = jArr13;
                                            }
                                            j10 = j2 >> 8;
                                            i35 = i2 + 1;
                                            it3 = it2;
                                            objArr14 = objArr2;
                                            jArr13 = jArr2;
                                        }
                                        it = it3;
                                        objArr = objArr14;
                                        jArr = jArr13;
                                        if (i34 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        objArr = objArr14;
                                        jArr = jArr13;
                                    }
                                    if (i33 == length6) {
                                        break;
                                    }
                                    i33++;
                                    it3 = it;
                                    objArr14 = objArr;
                                    jArr12 = jArr;
                                    tpiVar7 = tpiVar6;
                                }
                            }
                        } else {
                            it = it3;
                            tpiVar6 = tpiVar7;
                            zx7 zx7Var4 = (zx7) g2;
                            Object obj5 = hashMap5.get(zx7Var4);
                            n2r n2rVar4 = zx7Var4.c;
                            if (n2rVar4 == null) {
                                n2rVar4 = ehvVar3;
                            }
                            if (n2rVar4.J(zx7Var4.i().f, obj5)) {
                                eqiVar.d(zx7Var4);
                            } else {
                                Object g8 = tpiVar5.g(zx7Var4);
                                if (g8 != null) {
                                    if (g8 instanceof upi) {
                                        upi upiVar9 = (upi) g8;
                                        Object[] objArr16 = upiVar9.b;
                                        long[] jArr15 = upiVar9.a;
                                        int length8 = jArr15.length - 2;
                                        if (length8 >= 0) {
                                            int i39 = 0;
                                            while (true) {
                                                long j12 = jArr15[i39];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i40 = 8 - ((~(i39 - length8)) >>> 31);
                                                    for (int i41 = 0; i41 < i40; i41++) {
                                                        if ((j12 & 255) < 128) {
                                                            upiVar.a(objArr16[(i39 << 3) + i41]);
                                                            z = true;
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i40 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i39 == length8) {
                                                    break;
                                                }
                                                i39++;
                                            }
                                        }
                                    } else {
                                        upiVar.a(g8);
                                        z = true;
                                    }
                                }
                            }
                        }
                        g = tpiVar5.g(next);
                        if (g != null) {
                            if (g instanceof upi) {
                                upi upiVar10 = (upi) g;
                                Object[] objArr17 = upiVar10.b;
                                long[] jArr16 = upiVar10.a;
                                int length9 = jArr16.length - 2;
                                if (length9 >= 0) {
                                    while (true) {
                                        long j13 = jArr16[i];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i42 = 8 - ((~(i - length9)) >>> 31);
                                            for (int i43 = 0; i43 < i42; i43++) {
                                                if ((j13 & 255) < 128) {
                                                    upiVar.a(objArr17[(i << 3) + i43]);
                                                    z = true;
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i42 != 8) {
                                                break;
                                            }
                                        }
                                        i = i != length9 ? i + 1 : 0;
                                    }
                                }
                            } else {
                                upiVar.a(g);
                                z = true;
                            }
                        }
                    }
                    it = it3;
                    tpiVar6 = tpiVar7;
                    g = tpiVar5.g(next);
                    if (g != null) {
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
        int i44 = eqiVar.c;
        if (i44 != 0) {
            Object[] objArr18 = eqiVar.a;
            int i45 = 0;
            while (i45 < i44) {
                zx7 zx7Var5 = (zx7) objArr18[i45];
                int hashCode = Long.hashCode(g2r.k().g());
                Object g9 = tpiVar5.g(zx7Var5);
                if (g9 != null) {
                    boolean z6 = g9 instanceof upi;
                    tpi tpiVar8 = this.f;
                    if (z6) {
                        upi upiVar11 = (upi) g9;
                        Object[] objArr19 = upiVar11.b;
                        long[] jArr17 = upiVar11.a;
                        int length10 = jArr17.length - 2;
                        if (length10 >= 0) {
                            int i46 = 0;
                            while (true) {
                                long j14 = jArr17[i46];
                                i3 = i44;
                                objArr5 = objArr18;
                                if ((((~j14) << c) & j14 & j) != j) {
                                    int i47 = 8 - ((~(i46 - length10)) >>> 31);
                                    int i48 = 0;
                                    while (i48 < i47) {
                                        if ((j14 & 255) < 128) {
                                            i5 = i48;
                                            Object obj6 = objArr19[(i46 << 3) + i48];
                                            cpi cpiVar2 = (cpi) tpiVar8.g(obj6);
                                            i6 = i45;
                                            if (cpiVar2 == null) {
                                                cpiVar = new cpi();
                                                tpiVar8.m(obj6, cpiVar);
                                            } else {
                                                cpiVar = cpiVar2;
                                            }
                                            c(zx7Var5, hashCode, obj6, cpiVar);
                                        } else {
                                            i5 = i48;
                                            i6 = i45;
                                        }
                                        j14 >>= 8;
                                        i48 = i5 + 1;
                                        i45 = i6;
                                    }
                                    i4 = i45;
                                    if (i47 != 8) {
                                        break;
                                    }
                                } else {
                                    i4 = i45;
                                }
                                if (i46 != length10) {
                                    i46++;
                                    i44 = i3;
                                    objArr18 = objArr5;
                                    i45 = i4;
                                }
                            }
                        } else {
                            i3 = i44;
                            objArr5 = objArr18;
                            i4 = i45;
                        }
                    } else {
                        i3 = i44;
                        objArr5 = objArr18;
                        i4 = i45;
                        cpi cpiVar3 = (cpi) tpiVar8.g(g9);
                        if (cpiVar3 == null) {
                            cpiVar3 = new cpi();
                            tpiVar8.m(g9, cpiVar3);
                        }
                        c(zx7Var5, hashCode, g9, cpiVar3);
                    }
                } else {
                    i3 = i44;
                    objArr5 = objArr18;
                    i4 = i45;
                }
                i45 = i4 + 1;
                i44 = i3;
                objArr18 = objArr5;
            }
            eqiVar.i();
        }
        return z;
    }

    public final void c(Object obj, int i, Object obj2, cpi cpiVar) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int c = cpiVar.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = cpiVar.c[c];
        }
        cpiVar.b[c] = obj;
        cpiVar.c[c] = i;
        if ((obj instanceof zx7) && i2 != i) {
            xx7 i3 = ((zx7) obj).i();
            this.l.put(obj, i3.f);
            cpi cpiVar2 = i3.e;
            tpi tpiVar = this.k;
            ldg.E(tpiVar, obj);
            Object[] objArr = cpiVar2.b;
            long[] jArr = cpiVar2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                mer merVar = (mer) objArr[(i4 << 3) + i6];
                                if (merVar instanceof ner) {
                                    ((ner) merVar).c(2);
                                }
                                ldg.l(tpiVar, merVar, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof ner) {
                ((ner) obj).c(2);
            }
            ldg.l(this.e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        tpi tpiVar = this.e;
        ldg.D(tpiVar, obj2, obj);
        if (!(obj2 instanceof zx7) || tpiVar.c(obj2)) {
            return;
        }
        ldg.E(this.k, obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        tpi tpiVar = this.f;
        long[] jArr3 = tpiVar.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = tpiVar.b[i6];
                        j2 = j5;
                        cpi cpiVar = (cpi) tpiVar.c[i6];
                        obj.getClass();
                        boolean U = ((vzj) obj).U();
                        if (!U) {
                            Object[] objArr = cpiVar.b;
                            int[] iArr = cpiVar.c;
                            long[] jArr4 = cpiVar.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = U;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                d(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    U = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    tpiVar.l(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = U;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
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
