package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class twg extends ksk implements vei, mfh {
    public boolean f;
    public boolean g;
    public boolean h;
    public final uwg i = new uwg(0, this);
    public bpi j;
    public bpi k;

    public static void N0(f8j f8jVar) {
        npf npfVar;
        f8j f8jVar2 = f8jVar.m;
        mpf mpfVar = f8jVar.l;
        if (!Intrinsics.d(f8jVar2 != null ? f8jVar2.l : null, mpfVar)) {
            mpfVar.G.p.y.f();
            return;
        }
        n40 c = mpfVar.G.p.c();
        if (c == null || (npfVar = ((jfh) c).y) == null) {
            return;
        }
        npfVar.f();
    }

    public abstract int C0(v2e v2eVar);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f4, code lost:
    
        r37 = r4;
        r36 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x011b, code lost:
    
        r39 = r13;
        r44 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        r38 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r2.f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        if (((r2.a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        r4 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        r5 = r2.e;
        r29 = defpackage.net.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0141, code lost:
    
        if (java.lang.Long.compare((r5 * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        r4 = r2.a;
        r5 = r2.d;
        r6 = r2.b;
        r11 = r2.c;
        r12 = (r5 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
    
        if (r6 >= r12) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        r42 = r11;
        r11 = r4[r6] & (-9187201950435737472L);
        r4[r6] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r6 = r6 + 1;
        r13 = r13;
        r11 = r42;
        r12 = r12;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0178, code lost:
    
        r42 = r11;
        r39 = r13;
        r44 = r14;
        r6 = defpackage.xz0.C(r4);
        r11 = r6 - 1;
        r4[r11] = (r4[r11] & 72057594037927935L) | (-72057594037927936L);
        r4[r6] = r4[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
    
        if (r6 == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019b, code lost:
    
        r11 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r12 = (r4[r11] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a8, code lost:
    
        if (r12 != 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01af, code lost:
    
        if (r12 == 254) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b2, code lost:
    
        r12 = r6[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b4, code lost:
    
        if (r12 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b6, code lost:
    
        r12 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bd, code lost:
    
        r12 = r12 * (-862048943);
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r38 = r2.b(r13);
        r13 = r13 & r5;
        r47 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d9, code lost:
    
        if ((((r38 - r13) & r5) / 8) != (((r6 - r13) & r47) / 8)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01db, code lost:
    
        r4[r11] = (r4[r11] & (~(255 << r14))) | ((r12 & 127) << r14);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f8, code lost:
    
        r5 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fb, code lost:
    
        r43 = r6;
        r5 = r38 >> 3;
        r48 = r4[r5];
        r6 = (r38 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020b, code lost:
    
        if (((r48 >> r6) & 255) != 128) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020d, code lost:
    
        r4[r5] = (r48 & (~(255 << r6))) | ((r12 & 127) << r6);
        r4[r11] = (r4[r11] & (~(255 << r14))) | (128 << r14);
        r6[r38] = r6[r43];
        r6[r43] = null;
        r42[r38] = r42[r43];
        r42[r43] = 0.0f;
        r6 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025c, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0239, code lost:
    
        r4[r5] = ((r12 & 127) << r6) | (r48 & (~(255 << r6)));
        r5 = r6[r38];
        r6[r38] = r6[r43];
        r6[r43] = r5;
        r5 = r42[r38];
        r42[r38] = r42[r43];
        r42[r43] = r5;
        r6 = r43 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bb, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026a, code lost:
    
        r2.f = defpackage.vso.a(r2.d) - r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0301, code lost:
    
        r2.e++;
        r5 = r2.f;
        r6 = r2.a;
        r11 = r4 >> 3;
        r12 = r6[r11];
        r14 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0319, code lost:
    
        if (((r12 >> r14) & 255) != 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x031c, code lost:
    
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x031e, code lost:
    
        r2.f = r5 - r33;
        r5 = r2.d;
        r5 = ((~(255 << r14)) & r12) | (r11 << r14);
        r6[r11] = r5;
        r6[(((r4 - 7) & r5) + (r5 & 7)) >> 3] = r5;
        r4 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0277, code lost:
    
        r39 = r13;
        r44 = r14;
        r4 = defpackage.vso.c(r2.d);
        r5 = r2.a;
        r6 = r2.b;
        r11 = r2.c;
        r12 = r2.d;
        r2.d(r4);
        r4 = r2.a;
        r13 = r2.b;
        r14 = r2.c;
        r4 = r2.d;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029a, code lost:
    
        if (r4 >= r12) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02aa, code lost:
    
        if (((r5[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ac, code lost:
    
        r31 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ae, code lost:
    
        if (r31 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b0, code lost:
    
        r36 = r31.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02b7, code lost:
    
        r36 = r36 * (-862048943);
        r36 = r36 ^ (r36 << 16);
        r37 = r4;
        r4 = r2.b(r36 >>> 7);
        r4 = r36 & 127;
        r36 = r5;
        r42 = r4 >> 3;
        r43 = (r4 & 7) << 3;
        r4 = (r4[r42] & (~(255 << r43))) | (r4 << r43);
        r4[r42] = r4;
        r4[(((r4 - 7) & r4) + (r4 & 7)) >> 3] = r4;
        r13[r4] = r31;
        r14[r4] = r11[r37];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f8, code lost:
    
        r4 = r37 + 1;
        r5 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b5, code lost:
    
        r36 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(msk mskVar) {
        long j;
        long j2;
        long j3;
        Object obj;
        Object obj2;
        Object obj3;
        twg L0;
        wzj snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        Object[] objArr2;
        float[] fArr2;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        if (this.h || mskVar.a.e() == null) {
            return;
        }
        bpi bpiVar = this.k;
        if (bpiVar == null) {
            bpiVar = new bpi();
            this.k = bpiVar;
        }
        bpi bpiVar2 = this.j;
        if (bpiVar2 == null) {
            bpiVar2 = new bpi();
            this.j = bpiVar2;
        }
        Object[] objArr3 = bpiVar2.b;
        float[] fArr3 = bpiVar2.c;
        long[] jArr3 = bpiVar2.a;
        int length = jArr3.length - 2;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            j = 255;
            j2 = 128;
            while (true) {
                long j5 = jArr3[i6];
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j5 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj4 = objArr3[i9];
                            float f2 = fArr3[i9];
                            int hashCode = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i10 = hashCode ^ (hashCode << 16);
                            int i11 = i10 >>> 7;
                            objArr2 = objArr3;
                            int i12 = i10 & 127;
                            fArr2 = fArr3;
                            int i13 = bpiVar.d;
                            int i14 = i11 & i13;
                            int i15 = 0;
                            while (true) {
                                long[] jArr4 = bpiVar.a;
                                int i16 = i14 >> 3;
                                int i17 = (i14 & 7) << 3;
                                long j6 = jArr4[i16] >>> i17;
                                int i18 = 1;
                                long j7 = jArr4[i16 + 1] << (64 - i17);
                                jArr2 = jArr3;
                                long j8 = j6 | (j7 & ((-i17) >> 63));
                                j4 = j5;
                                long j9 = i12;
                                long j10 = j8 ^ (j9 * 72340172838076673L);
                                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                                while (true) {
                                    if (j11 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                                    int i19 = i12;
                                    if (Intrinsics.d(bpiVar.b[numberOfTrailingZeros], obj4)) {
                                        i = i8;
                                        f = f2;
                                        i4 = numberOfTrailingZeros;
                                        break;
                                    }
                                    j11 &= j11 - 1;
                                    i12 = i19;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i13;
                                jArr3 = jArr2;
                                j5 = j4;
                                i12 = i3;
                            }
                            if (i4 < 0) {
                                i4 = ~i4;
                            }
                            bpiVar.b[i4] = obj4;
                            bpiVar.c[i4] = f;
                            i2 = 8;
                        } else {
                            objArr2 = objArr3;
                            fArr2 = fArr3;
                            jArr2 = jArr3;
                            j4 = j5;
                            i = i8;
                            i2 = i5;
                        }
                        j5 = j4 >> i2;
                        i8 = i + 1;
                        i5 = i2;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                fArr3 = fArr;
                objArr3 = objArr;
                jArr3 = jArr;
                i5 = 8;
            }
        } else {
            j = 255;
            j2 = 128;
            j3 = -9187201950435737472L;
            obj = null;
        }
        bpiVar2.a();
        uzj uzjVar = J0().n;
        if (uzjVar != null && (snapshotObserver = uzjVar.getSnapshotObserver()) != null) {
            snapshotObserver.a(mskVar, vsf.E, new ssb(12, mskVar, this));
        }
        Object[] objArr4 = bpiVar2.b;
        long[] jArr5 = bpiVar2.a;
        int length2 = jArr5.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j12 = jArr5[i20];
                if ((((~j12) << 7) & j12 & j3) != j3) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j12 & j) >= j2) {
                            obj3 = obj;
                        } else {
                            if (objArr4[(i20 << 3) + i22] != null) {
                                l1j.f();
                                return;
                            }
                            obj3 = obj;
                            if (bpiVar.c(obj3) < 0 && (L0 = L0()) != null) {
                                do {
                                    bpi bpiVar3 = L0.j;
                                    if (bpiVar3 != null && bpiVar3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        L0 = L0.L0();
                                    }
                                } while (L0 != null);
                            }
                        }
                        j12 >>= 8;
                        i22++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i21 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i20 == length2) {
                    break;
                }
                i20++;
                obj = obj2;
            }
        }
        bpiVar.a();
    }

    @Override // defpackage.fxe
    public boolean F() {
        return false;
    }

    public abstract twg G0();

    public abstract wof H0();

    public abstract boolean I0();

    public abstract mpf J0();

    public abstract lfh K0();

    public abstract twg L0();

    public abstract long M0();

    public abstract void O0();

    @Override // defpackage.mfh
    public final lfh W(int i, int i2, Map map, Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            sme.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new rwg(i, i2, map, function1, this);
    }

    @Override // defpackage.ksk
    public final int Y(v2e v2eVar) {
        int C0;
        if (I0() && (C0 = C0(v2eVar)) != Integer.MIN_VALUE) {
            return C0 + ((int) (this.e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.vei
    public final void o(boolean z) {
        twg L0 = L0();
        mpf J0 = L0 != null ? L0.J0() : null;
        if (Intrinsics.d(J0, J0())) {
            this.f = z;
            return;
        }
        if ((J0 != null ? J0.G.d : null) != ipf.c) {
            if ((J0 != null ? J0.G.d : null) != ipf.d) {
                return;
            }
        }
        this.f = z;
    }
}
