package defpackage;

import androidx.compose.ui.graphics.d;
import com.google.ar.core.ImageMetadata;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class ymb1 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, f530 f530Var, final long j, lzr lzrVar, hzr hzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3, final int i4) {
        f530 f530Var2;
        int i5;
        lzr lzrVar2;
        int i6;
        long j5;
        int i7;
        int i8;
        long j6;
        int i9;
        bts btsVar;
        final long j7;
        final sjy0 sjy0Var2;
        final int i10;
        final tls tlsVar2;
        final ety0 ety0Var2;
        final long j8;
        final f530 f530Var3;
        final long j9;
        final hzr hzrVar2;
        final int i11;
        final boolean z2;
        final lzr lzrVar3;
        aii0 v;
        f530 f530Var4;
        int i12;
        tls tlsVar3;
        hzr hzrVar3;
        ety0 ety0Var3;
        boolean z3;
        int i13;
        int i14;
        long j10;
        long j11;
        sjy0 sjy0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(65610505);
        int i15 = (btsVar2.k(str) ? 4 : 2) | i3;
        int i16 = i4 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i15 |= btsVar2.k(f530Var2) ? 32 : 16;
            int i17 = i15 | (!btsVar2.d(j) ? 256 : 128);
            int i18 = i17 | HProv.ALG_TYPE_SECURECHANNEL;
            i5 = i4 & 16;
            if (i5 == 0) {
                i18 = i17 | 27648;
            } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                lzrVar2 = lzrVar;
                i18 |= btsVar2.k(lzrVar2) ? 16384 : 8192;
                int i19 = 65536 | i18;
                i6 = i4 & 64;
                if (i6 != 0) {
                    i19 = 1638400 | i18;
                    j5 = j2;
                } else {
                    j5 = j2;
                    if ((1572864 & i3) == 0) {
                        i19 |= btsVar2.d(j5) ? 1048576 : 524288;
                    }
                }
                i7 = i4 & 128;
                if (i7 != 0) {
                    i19 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i8 = i16;
                    j6 = j3;
                    i19 |= btsVar2.d(j6) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    i9 = i19 | 905969664;
                    if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        j7 = j4;
                        sjy0Var2 = sjy0Var;
                        i10 = i2;
                        tlsVar2 = tlsVar;
                        ety0Var2 = ety0Var;
                        j8 = j6;
                        f530Var3 = f530Var2;
                        j9 = j5;
                        hzrVar2 = hzrVar;
                        i11 = i;
                        z2 = z;
                        lzrVar3 = lzrVar2;
                    } else {
                        btsVar2.a0();
                        int i20 = 14;
                        if ((i3 & 1) == 0 || btsVar2.C()) {
                            f530 f530Var5 = i8 != 0 ? c530.a : f530Var2;
                            if (i5 != 0) {
                                lzrVar2 = lzr.E;
                            }
                            hzr hzrVar4 = new hzr(0);
                            int i21 = i9 & (-458753);
                            long E = i6 != 0 ? uh6.E(13) : j5;
                            if (i7 != 0) {
                                j6 = uh6.E(14);
                            }
                            long w = uh6.w(0.01d);
                            sjy0 sjy0Var4 = new sjy0(3);
                            Object Q = btsVar2.Q();
                            if (Q == did.a) {
                                Q = new wk6(6);
                                btsVar2.o0(Q);
                            }
                            f530Var4 = f530Var5;
                            i12 = i21;
                            tlsVar3 = (tls) Q;
                            hzrVar3 = hzrVar4;
                            ety0Var3 = (ety0) btsVar2.m(wqy0.a);
                            i20 = 14;
                            z3 = true;
                            i13 = 1;
                            i14 = 2;
                            j10 = j6;
                            j11 = E;
                            j7 = w;
                            sjy0Var3 = sjy0Var4;
                        } else {
                            btsVar2.Y();
                            i12 = i9 & (-458753);
                            hzrVar3 = hzrVar;
                            j7 = j4;
                            i14 = i;
                            z3 = z;
                            i13 = i2;
                            tlsVar3 = tlsVar;
                            ety0Var3 = ety0Var;
                            f530Var4 = f530Var2;
                            long j12 = j5;
                            sjy0Var3 = sjy0Var;
                            j10 = j6;
                            j11 = j12;
                        }
                        lzr lzrVar4 = lzrVar2;
                        btsVar2.u();
                        btsVar = btsVar2;
                        wqy0.b(str, f530Var4, j, j11, hzrVar3, lzrVar4, null, j7, null, sjy0Var3, j10, i14, z3, i13, 0, tlsVar3, ety0Var3, btsVar, (i12 & 1022) | ((i12 >> 9) & 7168) | ((i12 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | 114819072, ((i12 >> 21) & i20) | 200112, 16384);
                        long j13 = j11;
                        hzrVar2 = hzrVar3;
                        j9 = j13;
                        f530Var3 = f530Var4;
                        lzrVar3 = lzrVar4;
                        sjy0Var2 = sjy0Var3;
                        j8 = j10;
                        i11 = i14;
                        z2 = z3;
                        i10 = i13;
                        tlsVar2 = tlsVar3;
                        ety0Var2 = ety0Var3;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: oqy0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i3 | 1);
                                ymb1.a(str, f530Var3, j, lzrVar3, hzrVar2, j9, j8, j7, sjy0Var2, i11, z2, i10, tlsVar2, ety0Var2, (fid) obj, O, i4);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i8 = i16;
                j6 = j3;
                i9 = i19 | 905969664;
                if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            lzrVar2 = lzrVar;
            int i192 = 65536 | i18;
            i6 = i4 & 64;
            if (i6 != 0) {
            }
            i7 = i4 & 128;
            if (i7 != 0) {
            }
            i8 = i16;
            j6 = j3;
            i9 = i192 | 905969664;
            if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        int i172 = i15 | (!btsVar2.d(j) ? 256 : 128);
        int i182 = i172 | HProv.ALG_TYPE_SECURECHANNEL;
        i5 = i4 & 16;
        if (i5 == 0) {
        }
        lzrVar2 = lzrVar;
        int i1922 = 65536 | i182;
        i6 = i4 & 64;
        if (i6 != 0) {
        }
        i7 = i4 & 128;
        if (i7 != 0) {
        }
        i8 = i16;
        j6 = j3;
        i9 = i1922 | 905969664;
        if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final String str, f530 f530Var, final long j, lzr lzrVar, hzr hzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3) {
        bts btsVar;
        final f530 f530Var2;
        final lzr lzrVar2;
        final hzr hzrVar2;
        final long j5;
        final long j6;
        final long j7;
        final sjy0 sjy0Var2;
        final int i4;
        final boolean z2;
        final int i5;
        final tls tlsVar2;
        final ety0 ety0Var2;
        hzr hzrVar3;
        int i6;
        int i7;
        f530 f530Var3;
        boolean z3;
        sjy0 sjy0Var3;
        long j8;
        long j9;
        int i8;
        long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1900614129);
        int i9 = i3 | (btsVar2.k(str) ? 4 : 2) | 48 | (btsVar2.d(j) ? 256 : 128) | 920218624;
        if (btsVar2.V(i9 & 1, (306783379 & i9) != 306783378)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                lzr lzrVar3 = lzr.E;
                hzr hzrVar4 = new hzr(0);
                int i10 = i9 & (-458753);
                long E = uh6.E(11);
                long E2 = uh6.E(12);
                long w = uh6.w(0.01d);
                sjy0 sjy0Var4 = new sjy0(3);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new wk6(6);
                    btsVar2.o0(Q);
                }
                tlsVar2 = (tls) Q;
                ety0Var2 = (ety0) btsVar2.m(wqy0.a);
                hzrVar3 = hzrVar4;
                i6 = 1;
                lzrVar2 = lzrVar3;
                i7 = i10;
                f530Var3 = c530.a;
                z3 = true;
                sjy0Var3 = sjy0Var4;
                j8 = E;
                j9 = w;
                i8 = 1;
                j10 = E2;
            } else {
                btsVar2.Y();
                lzrVar2 = lzrVar;
                hzrVar3 = hzrVar;
                j8 = j2;
                j10 = j3;
                j9 = j4;
                sjy0Var3 = sjy0Var;
                i8 = i;
                z3 = z;
                i6 = i2;
                tlsVar2 = tlsVar;
                ety0Var2 = ety0Var;
                i7 = i9 & (-458753);
                f530Var3 = f530Var;
            }
            btsVar2.u();
            btsVar = btsVar2;
            wqy0.b(str, f530Var3, j, j8, hzrVar3, lzrVar2, null, j9, null, sjy0Var3, j10, i8, z3, i6, 0, tlsVar2, ety0Var2, btsVar, (i7 & 1022) | 115018752, 200118, 16384);
            hzrVar2 = hzrVar3;
            i5 = i6;
            z2 = z3;
            i4 = i8;
            sjy0Var2 = sjy0Var3;
            j6 = j10;
            j7 = j9;
            j5 = j8;
            f530Var2 = f530Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            lzrVar2 = lzrVar;
            hzrVar2 = hzrVar;
            j5 = j2;
            j6 = j3;
            j7 = j4;
            sjy0Var2 = sjy0Var;
            i4 = i;
            z2 = z;
            i5 = i2;
            tlsVar2 = tlsVar;
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(str, f530Var2, j, lzrVar2, hzrVar2, j5, j6, j7, sjy0Var2, i4, z2, i5, tlsVar2, ety0Var2, i3) { // from class: tqy0
                public final /* synthetic */ long A;
                public final /* synthetic */ sjy0 B;
                public final /* synthetic */ int C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ int E;
                public final /* synthetic */ tls F;
                public final /* synthetic */ ety0 G;
                public final /* synthetic */ String a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ lzr w;
                public final /* synthetic */ hzr x;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    ymb1.b(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, f530 f530Var, long j, eyr eyrVar, lzr lzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, int i3, int i4, int i5) {
        int i6;
        f530 f530Var2;
        long j5;
        int i7;
        int i8;
        int i9;
        long j6;
        int i10;
        long j7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        bts btsVar;
        eyr eyrVar2;
        sjy0 sjy0Var2;
        tls tlsVar2;
        ety0 ety0Var2;
        int i18;
        long j8;
        f530 f530Var3;
        long j9;
        long j10;
        lzr lzrVar2;
        long j11;
        int i19;
        boolean z2;
        aii0 v;
        tls tlsVar3;
        ety0 ety0Var3;
        int i20;
        boolean z3;
        int i21;
        f530 f530Var4;
        int i22;
        int i23;
        sjy0 sjy0Var3;
        long j12;
        lzr lzrVar3;
        long j13;
        long j14;
        eyr eyrVar3;
        int i24;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1160896801);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i25 = i5 & 2;
        if (i25 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) != 0) {
                if ((i5 & 4) == 0) {
                    j5 = j;
                    if (btsVar2.d(j5)) {
                        i24 = 256;
                        i6 |= i24;
                    }
                } else {
                    j5 = j;
                }
                i24 = 128;
                i6 |= i24;
            } else {
                j5 = j;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i6 |= btsVar2.k(eyrVar) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i6 |= btsVar2.k(lzrVar) ? 16384 : 8192;
                    int i26 = i6 | ImageMetadata.EDGE_MODE;
                    i9 = i5 & 64;
                    if (i9 == 0) {
                        i26 = i6 | 1769472;
                    } else if ((1572864 & i3) == 0) {
                        j6 = j2;
                        i26 |= btsVar2.d(j6) ? 1048576 : 524288;
                        i10 = i5 & 128;
                        if (i10 != 0) {
                            i26 |= 12582912;
                            j7 = j3;
                        } else {
                            j7 = j3;
                            if ((i3 & 12582912) == 0) {
                                i26 |= btsVar2.d(j7) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                            }
                        }
                        i11 = i26 | 905969664;
                        i12 = i5 & 1024;
                        if (i12 != 0) {
                            i14 = i4 | 6;
                            i13 = i12;
                        } else {
                            i13 = i12;
                            i14 = i4 | (btsVar2.k(sjy0Var) ? 4 : 2);
                        }
                        int i27 = i14;
                        int i28 = i27 | 432;
                        i15 = i5 & 8192;
                        if (i15 != 0) {
                            i28 = i27 | 3504;
                        } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i16 = i2;
                            i28 |= btsVar2.c(i16) ? 2048 : 1024;
                            i17 = i28 | 90112;
                            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
                                btsVar = btsVar2;
                                btsVar.Y();
                                eyrVar2 = eyrVar;
                                sjy0Var2 = sjy0Var;
                                tlsVar2 = tlsVar;
                                ety0Var2 = ety0Var;
                                i18 = i16;
                                j8 = j6;
                                f530Var3 = f530Var2;
                                j9 = j5;
                                j10 = j7;
                                lzrVar2 = lzrVar;
                                j11 = j4;
                                i19 = i;
                                z2 = z;
                            } else {
                                btsVar2.a0();
                                if ((i3 & 1) == 0 || btsVar2.C()) {
                                    f530 f530Var5 = i25 != 0 ? c530.a : f530Var2;
                                    if ((i5 & 4) != 0) {
                                        i11 &= -897;
                                        j5 = ((el51) btsVar2.m(gl51.a)).n();
                                    }
                                    eyr eyrVar4 = i7 != 0 ? null : eyrVar;
                                    lzr lzrVar4 = i8 != 0 ? null : lzrVar;
                                    if (i9 != 0) {
                                        j6 = sty0.c;
                                    }
                                    long j15 = i10 != 0 ? sty0.c : j7;
                                    long j16 = sty0.c;
                                    sjy0 sjy0Var4 = i13 == 0 ? sjy0Var : null;
                                    if (i15 != 0) {
                                        i16 = Integer.MAX_VALUE;
                                    }
                                    Object Q = btsVar2.Q();
                                    if (Q == did.a) {
                                        Q = new wk6(6);
                                        btsVar2.o0(Q);
                                    }
                                    tlsVar3 = (tls) Q;
                                    ety0Var3 = ((zm51) btsVar2.m(an51.a)).e;
                                    i20 = 196608;
                                    z3 = true;
                                    i21 = i16;
                                    f530Var4 = f530Var5;
                                    i22 = i17 & (-458753);
                                    i23 = 2;
                                    sjy0Var3 = sjy0Var4;
                                    j8 = j6;
                                    j12 = j5;
                                    lzrVar3 = lzrVar4;
                                    j13 = j15;
                                    j14 = j16;
                                    eyrVar3 = eyrVar4;
                                } else {
                                    btsVar2.Y();
                                    if ((i5 & 4) != 0) {
                                        i11 &= -897;
                                    }
                                    i22 = i17 & (-458753);
                                    j14 = j4;
                                    i23 = i;
                                    z3 = z;
                                    tlsVar3 = tlsVar;
                                    ety0Var3 = ety0Var;
                                    i21 = i16;
                                    j8 = j6;
                                    f530Var4 = f530Var2;
                                    j12 = j5;
                                    i20 = 196608;
                                    eyrVar3 = eyrVar;
                                    lzrVar3 = lzrVar;
                                    j13 = j7;
                                    sjy0Var3 = sjy0Var;
                                }
                                btsVar2.u();
                                int i29 = i11 >> 3;
                                btsVar = btsVar2;
                                wqy0.b(str, f530Var4, j12, j8, null, lzrVar3, eyrVar3, j14, null, sjy0Var3, j13, i23, z3, i21, 0, tlsVar3, ety0Var3, btsVar, (i11 & 1022) | ((i11 >> 9) & 7168) | (i29 & HProv.ALG_CLASS_ALL) | ((i11 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i11 << 9) & 3670016) | (i29 & 29360128) | (i29 & 234881024) | ((i22 << 27) & 1879048192), ((i11 >> 21) & 14) | 432 | (i22 & 7168) | i20, 16384);
                                f530Var3 = f530Var4;
                                j9 = j12;
                                lzrVar2 = lzrVar3;
                                eyrVar2 = eyrVar3;
                                j11 = j14;
                                sjy0Var2 = sjy0Var3;
                                j10 = j13;
                                i19 = i23;
                                z2 = z3;
                                i18 = i21;
                                tlsVar2 = tlsVar3;
                                ety0Var2 = ety0Var3;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new jqy0(str, f530Var3, j9, eyrVar2, lzrVar2, j8, j10, j11, sjy0Var2, i19, z2, i18, tlsVar2, ety0Var2, i3, i4, i5, 1);
                                return;
                            }
                            return;
                        }
                        i16 = i2;
                        i17 = i28 | 90112;
                        if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    j6 = j2;
                    i10 = i5 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i26 | 905969664;
                    i12 = i5 & 1024;
                    if (i12 != 0) {
                    }
                    int i272 = i14;
                    int i282 = i272 | 432;
                    i15 = i5 & 8192;
                    if (i15 != 0) {
                    }
                    i16 = i2;
                    i17 = i282 | 90112;
                    if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                int i262 = i6 | ImageMetadata.EDGE_MODE;
                i9 = i5 & 64;
                if (i9 == 0) {
                }
                j6 = j2;
                i10 = i5 & 128;
                if (i10 != 0) {
                }
                i11 = i262 | 905969664;
                i12 = i5 & 1024;
                if (i12 != 0) {
                }
                int i2722 = i14;
                int i2822 = i2722 | 432;
                i15 = i5 & 8192;
                if (i15 != 0) {
                }
                i16 = i2;
                i17 = i2822 | 90112;
                if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            int i2622 = i6 | ImageMetadata.EDGE_MODE;
            i9 = i5 & 64;
            if (i9 == 0) {
            }
            j6 = j2;
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i2622 | 905969664;
            i12 = i5 & 1024;
            if (i12 != 0) {
            }
            int i27222 = i14;
            int i28222 = i27222 | 432;
            i15 = i5 & 8192;
            if (i15 != 0) {
            }
            i16 = i2;
            i17 = i28222 | 90112;
            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        int i26222 = i6 | ImageMetadata.EDGE_MODE;
        i9 = i5 & 64;
        if (i9 == 0) {
        }
        j6 = j2;
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i26222 | 905969664;
        i12 = i5 & 1024;
        if (i12 != 0) {
        }
        int i272222 = i14;
        int i282222 = i272222 | 432;
        i15 = i5 & 8192;
        if (i15 != 0) {
        }
        i16 = i2;
        i17 = i282222 | 90112;
        if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i17 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(final kk2 kk2Var, final f530 f530Var, final long j, final lzr lzrVar, long j2, long j3, long j4, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3) {
        final long j5;
        final long j6;
        final long j7;
        final int i4;
        final boolean z2;
        final int i5;
        final tls tlsVar2;
        final ety0 ety0Var2;
        long j8;
        boolean z3;
        tls tlsVar3;
        ety0 ety0Var3;
        int i6;
        long j9;
        long j10;
        bts btsVar = (bts) fidVar;
        btsVar.g0(76511156);
        int i7 = 2;
        int i8 = i3 | (btsVar.k(kk2Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | 920325120;
        if (btsVar.V(i8 & 1, (306783379 & i8) != 306783378)) {
            btsVar.a0();
            if ((i3 & 1) == 0 || btsVar.C()) {
                j8 = sty0.c;
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new wk6(6);
                    btsVar.o0(Q);
                }
                z3 = true;
                tlsVar3 = (tls) Q;
                ety0Var3 = ((zm51) btsVar.m(an51.a)).f;
                i6 = Integer.MAX_VALUE;
                j9 = j8;
                j10 = j9;
            } else {
                btsVar.Y();
                j8 = j2;
                j9 = j3;
                j10 = j4;
                i7 = i;
                z3 = z;
                i6 = i2;
                tlsVar3 = tlsVar;
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            long j11 = j8;
            long j12 = j10;
            boolean z4 = z3;
            int i9 = i6;
            int i10 = i7;
            wqy0.c(kk2Var, f530Var, j, j11, lzrVar, j12, j9, i10, z4, i9, 0, null, tlsVar3, ety0Var3, btsVar, (i8 & 1022) | 920349696, 1576374, 49152);
            i4 = i10;
            z2 = z4;
            btsVar = btsVar;
            j6 = j9;
            ety0Var2 = ety0Var3;
            tlsVar2 = tlsVar3;
            i5 = i9;
            j7 = j12;
            j5 = j11;
        } else {
            btsVar.Y();
            j5 = j2;
            j6 = j3;
            j7 = j4;
            i4 = i;
            z2 = z;
            i5 = i2;
            tlsVar2 = tlsVar;
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f530Var, j, lzrVar, j5, j6, j7, i4, z2, i5, tlsVar2, ety0Var2, i3) { // from class: sqy0
                public final /* synthetic */ int A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ int C;
                public final /* synthetic */ tls D;
                public final /* synthetic */ ety0 E;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ lzr w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(24577);
                    ymb1.d(kk2.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, f530 f530Var, long j, eyr eyrVar, lzr lzrVar, hzr hzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, int i3, int i4, int i5) {
        int i6;
        f530 f530Var2;
        int i7;
        eyr eyrVar2;
        int i8;
        lzr lzrVar2;
        int i9;
        hzr hzrVar2;
        int i10;
        long j5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z2;
        int i20;
        int i21;
        int i22;
        int i23;
        bts btsVar;
        long j6;
        long j7;
        int i24;
        int i25;
        tls tlsVar2;
        ety0 ety0Var2;
        boolean z3;
        eyr eyrVar3;
        hzr hzrVar3;
        long j8;
        long j9;
        sjy0 sjy0Var2;
        aii0 v;
        long j10;
        tls tlsVar3;
        sjy0 sjy0Var3;
        int i26;
        int i27;
        long j11;
        int i28;
        tls tlsVar4;
        f530 f530Var3;
        long j12;
        eyr eyrVar4;
        hzr hzrVar4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1374710624);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i29 = i5 & 2;
        if (i29 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i6 |= ((i5 & 4) == 0 && btsVar2.d(j)) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                eyrVar2 = eyrVar;
                i6 |= btsVar2.k(eyrVar2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    lzrVar2 = lzrVar;
                    i6 |= btsVar2.k(lzrVar2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    int i30 = 65536;
                    if (i9 == 0) {
                        i6 |= ImageMetadata.EDGE_MODE;
                        hzrVar2 = hzrVar;
                    } else {
                        hzrVar2 = hzrVar;
                        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
                            i6 |= btsVar2.k(hzrVar2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        j5 = j2;
                    } else {
                        j5 = j2;
                        if ((i3 & 1572864) == 0) {
                            i6 |= btsVar2.d(j5) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= btsVar2.d(j3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= btsVar2.d(j4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                    i13 = i6 | 805306368;
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i16 = i4 | 6;
                        i15 = i14;
                    } else if ((i4 & 6) == 0) {
                        i15 = i14;
                        i16 = i4 | (btsVar2.k(sjy0Var) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i4 & 48) == 0) {
                        i18 = i17;
                        i16 |= btsVar2.c(i) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i31 = i16;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                        i31 |= 384;
                    } else if ((i4 & 384) == 0) {
                        z2 = z;
                        i31 |= btsVar2.a(z2) ? 256 : 128;
                        i20 = i5 & 8192;
                        if (i20 != 0) {
                            i21 = i31 | HProv.ALG_TYPE_SECURECHANNEL;
                        } else {
                            int i32 = i31;
                            if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i21 = i32 | (btsVar2.c(i2) ? 2048 : 1024);
                            } else {
                                i21 = i32;
                            }
                        }
                        i22 = i5 & 16384;
                        if (i22 != 0) {
                            i23 = i21 | HProv.ALG_CLASS_DATA_ENCRYPT;
                        } else {
                            i23 = i21;
                            if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                                i23 |= btsVar2.e(tlsVar) ? 16384 : 8192;
                                if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                                    if ((i5 & 32768) == 0 && btsVar2.k(ety0Var)) {
                                        i30 = 131072;
                                    }
                                    i23 |= i30;
                                }
                                if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                                    btsVar = btsVar2;
                                    btsVar.Y();
                                    j6 = j;
                                    j7 = j3;
                                    i24 = i;
                                    i25 = i2;
                                    tlsVar2 = tlsVar;
                                    ety0Var2 = ety0Var;
                                    z3 = z2;
                                    eyrVar3 = eyrVar2;
                                    hzrVar3 = hzrVar2;
                                    j8 = j5;
                                    j9 = j4;
                                    sjy0Var2 = sjy0Var;
                                } else {
                                    btsVar2.a0();
                                    if ((i3 & 1) == 0 || btsVar2.C()) {
                                        if (i29 != 0) {
                                            f530Var2 = c530.a;
                                        }
                                        if ((i5 & 4) != 0) {
                                            j10 = ((el51) btsVar2.m(gl51.a)).n();
                                            i13 &= -897;
                                        } else {
                                            j10 = j;
                                        }
                                        if (i7 != 0) {
                                            eyrVar2 = null;
                                        }
                                        if (i8 != 0) {
                                            lzrVar2 = null;
                                        }
                                        if (i9 != 0) {
                                            hzrVar2 = null;
                                        }
                                        if (i10 != 0) {
                                            j5 = sty0.c;
                                        }
                                        long j13 = i11 != 0 ? sty0.c : j3;
                                        long j14 = i12 != 0 ? sty0.c : j4;
                                        sjy0 sjy0Var4 = i15 == 0 ? sjy0Var : null;
                                        int i33 = i18 != 0 ? 2 : i;
                                        boolean z4 = i19 == 0 ? z2 : true;
                                        int i34 = i20 != 0 ? Integer.MAX_VALUE : i2;
                                        if (i22 != 0) {
                                            Object Q = btsVar2.Q();
                                            if (Q == did.a) {
                                                Q = new wk6(6);
                                                btsVar2.o0(Q);
                                            }
                                            tlsVar3 = (tls) Q;
                                        } else {
                                            tlsVar3 = tlsVar;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            sjy0Var3 = sjy0Var4;
                                            i26 = i33;
                                            i27 = i13;
                                            i28 = i23 & (-458753);
                                            z3 = z4;
                                            j7 = j13;
                                            tlsVar4 = tlsVar3;
                                            i25 = i34;
                                            ety0Var2 = ((zm51) btsVar2.m(an51.a)).f;
                                            f530Var3 = f530Var2;
                                            j11 = j5;
                                        } else {
                                            sjy0Var3 = sjy0Var4;
                                            i26 = i33;
                                            i27 = i13;
                                            j11 = j5;
                                            i28 = i23;
                                            z3 = z4;
                                            j7 = j13;
                                            ety0Var2 = ety0Var;
                                            tlsVar4 = tlsVar3;
                                            i25 = i34;
                                            f530Var3 = f530Var2;
                                        }
                                        j12 = j10;
                                        eyrVar4 = eyrVar2;
                                        hzrVar4 = hzrVar2;
                                        j9 = j14;
                                    } else {
                                        btsVar2.Y();
                                        if ((i5 & 4) != 0) {
                                            i13 &= -897;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            i23 &= -458753;
                                        }
                                        sjy0Var3 = sjy0Var;
                                        i26 = i;
                                        i25 = i2;
                                        tlsVar4 = tlsVar;
                                        ety0Var2 = ety0Var;
                                        z3 = z2;
                                        i27 = i13;
                                        f530Var3 = f530Var2;
                                        j11 = j5;
                                        i28 = i23;
                                        j12 = j;
                                        j7 = j3;
                                        eyrVar4 = eyrVar2;
                                        hzrVar4 = hzrVar2;
                                        j9 = j4;
                                    }
                                    btsVar2.u();
                                    int i35 = i27;
                                    int i36 = i35 >> 3;
                                    int i37 = ((i35 >> 9) & 7168) | (i27 & 1022) | (i36 & HProv.ALG_CLASS_ALL) | ((i35 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i35 << 9) & 3670016) | (i36 & 29360128) | (i36 & 234881024) | ((i28 << 27) & 1879048192);
                                    int i38 = (i28 & 896) | ((i35 >> 21) & 14) | (i28 & 112) | (i28 & 7168);
                                    int i39 = i28 << 3;
                                    btsVar = btsVar2;
                                    wqy0.b(str, f530Var3, j12, j11, hzrVar4, lzrVar2, eyrVar4, j9, null, sjy0Var3, j7, i26, z3, i25, 0, tlsVar4, ety0Var2, btsVar, i37, i38 | (i39 & ImageMetadata.JPEG_GPS_COORDINATES) | (i39 & 3670016), 16384);
                                    eyr eyrVar5 = eyrVar4;
                                    f530Var2 = f530Var3;
                                    j6 = j12;
                                    eyrVar3 = eyrVar5;
                                    long j15 = j11;
                                    hzrVar3 = hzrVar4;
                                    j8 = j15;
                                    sjy0Var2 = sjy0Var3;
                                    i24 = i26;
                                    tlsVar2 = tlsVar4;
                                }
                                lzr lzrVar3 = lzrVar2;
                                v = btsVar.v();
                                if (v == null) {
                                    v.d = new uqy0(str, f530Var2, j6, eyrVar3, lzrVar3, hzrVar3, j8, j7, j9, sjy0Var2, i24, z3, i25, tlsVar2, ety0Var2, i3, i4, i5, 1);
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                        }
                        if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                        }
                        lzr lzrVar32 = lzrVar2;
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    z2 = z;
                    i20 = i5 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                    }
                    if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                    }
                    if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                    }
                    lzr lzrVar322 = lzrVar2;
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                lzrVar2 = lzrVar;
                i9 = i5 & 32;
                int i302 = 65536;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i6 | 805306368;
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i312 = i16;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                z2 = z;
                i20 = i5 & 8192;
                if (i20 != 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                }
                if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                }
                lzr lzrVar3222 = lzrVar2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            eyrVar2 = eyrVar;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            lzrVar2 = lzrVar;
            i9 = i5 & 32;
            int i3022 = 65536;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i6 | 805306368;
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i3122 = i16;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            z2 = z;
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
            }
            if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
            }
            lzr lzrVar32222 = lzrVar2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        eyrVar2 = eyrVar;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        lzrVar2 = lzrVar;
        i9 = i5 & 32;
        int i30222 = 65536;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i6 | 805306368;
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i31222 = i16;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        z2 = z;
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
        }
        if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
        }
        lzr lzrVar322222 = lzrVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, f530 f530Var, long j, eyr eyrVar, lzr lzrVar, hzr hzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, int i3, int i4, int i5) {
        int i6;
        f530 f530Var2;
        int i7;
        eyr eyrVar2;
        int i8;
        lzr lzrVar2;
        int i9;
        hzr hzrVar2;
        int i10;
        long j5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z2;
        int i20;
        int i21;
        int i22;
        int i23;
        bts btsVar;
        long j6;
        long j7;
        int i24;
        int i25;
        tls tlsVar2;
        ety0 ety0Var2;
        boolean z3;
        eyr eyrVar3;
        hzr hzrVar3;
        long j8;
        long j9;
        sjy0 sjy0Var2;
        aii0 v;
        long j10;
        tls tlsVar3;
        sjy0 sjy0Var3;
        int i26;
        int i27;
        long j11;
        int i28;
        long j12;
        tls tlsVar4;
        f530 f530Var3;
        eyr eyrVar4;
        hzr hzrVar4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1265767863);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i29 = i5 & 2;
        if (i29 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i6 |= ((i5 & 4) == 0 && btsVar2.d(j)) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                eyrVar2 = eyrVar;
                i6 |= btsVar2.k(eyrVar2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    lzrVar2 = lzrVar;
                    i6 |= btsVar2.k(lzrVar2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    int i30 = 65536;
                    if (i9 == 0) {
                        i6 |= ImageMetadata.EDGE_MODE;
                        hzrVar2 = hzrVar;
                    } else {
                        hzrVar2 = hzrVar;
                        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
                            i6 |= btsVar2.k(hzrVar2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        j5 = j2;
                    } else {
                        j5 = j2;
                        if ((i3 & 1572864) == 0) {
                            i6 |= btsVar2.d(j5) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= btsVar2.d(j3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= btsVar2.d(j4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                    i13 = i6 | 805306368;
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i16 = i4 | 6;
                        i15 = i14;
                    } else if ((i4 & 6) == 0) {
                        i15 = i14;
                        i16 = i4 | (btsVar2.k(sjy0Var) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                        i18 = i17;
                    } else if ((i4 & 48) == 0) {
                        i18 = i17;
                        i16 |= btsVar2.c(i) ? 32 : 16;
                    } else {
                        i18 = i17;
                    }
                    int i31 = i16;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                        i31 |= 384;
                    } else if ((i4 & 384) == 0) {
                        z2 = z;
                        i31 |= btsVar2.a(z2) ? 256 : 128;
                        i20 = i5 & 8192;
                        if (i20 != 0) {
                            i21 = i31 | HProv.ALG_TYPE_SECURECHANNEL;
                        } else {
                            int i32 = i31;
                            if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                                i21 = i32 | (btsVar2.c(i2) ? 2048 : 1024);
                            } else {
                                i21 = i32;
                            }
                        }
                        i22 = i5 & 16384;
                        if (i22 != 0) {
                            i23 = i21 | HProv.ALG_CLASS_DATA_ENCRYPT;
                        } else {
                            i23 = i21;
                            if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                                i23 |= btsVar2.e(tlsVar) ? 16384 : 8192;
                                if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                                    if ((i5 & 32768) == 0 && btsVar2.k(ety0Var)) {
                                        i30 = 131072;
                                    }
                                    i23 |= i30;
                                }
                                if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                                    btsVar = btsVar2;
                                    btsVar.Y();
                                    j6 = j;
                                    j7 = j3;
                                    i24 = i;
                                    i25 = i2;
                                    tlsVar2 = tlsVar;
                                    ety0Var2 = ety0Var;
                                    z3 = z2;
                                    eyrVar3 = eyrVar2;
                                    hzrVar3 = hzrVar2;
                                    j8 = j5;
                                    j9 = j4;
                                    sjy0Var2 = sjy0Var;
                                } else {
                                    btsVar2.a0();
                                    if ((i3 & 1) == 0 || btsVar2.C()) {
                                        if (i29 != 0) {
                                            f530Var2 = c530.a;
                                        }
                                        if ((i5 & 4) != 0) {
                                            j10 = ((el51) btsVar2.m(gl51.a)).n();
                                            i13 &= -897;
                                        } else {
                                            j10 = j;
                                        }
                                        if (i7 != 0) {
                                            eyrVar2 = null;
                                        }
                                        if (i8 != 0) {
                                            lzrVar2 = null;
                                        }
                                        if (i9 != 0) {
                                            hzrVar2 = null;
                                        }
                                        if (i10 != 0) {
                                            j5 = sty0.c;
                                        }
                                        long j13 = i11 != 0 ? sty0.c : j3;
                                        long j14 = i12 != 0 ? sty0.c : j4;
                                        sjy0 sjy0Var4 = i15 == 0 ? sjy0Var : null;
                                        int i33 = i18 != 0 ? 2 : i;
                                        if (i19 != 0) {
                                            z2 = true;
                                        }
                                        i25 = i20 == 0 ? i2 : 1;
                                        if (i22 != 0) {
                                            Object Q = btsVar2.Q();
                                            if (Q == did.a) {
                                                Q = new wk6(6);
                                                btsVar2.o0(Q);
                                            }
                                            tlsVar3 = (tls) Q;
                                        } else {
                                            tlsVar3 = tlsVar;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            sjy0Var3 = sjy0Var4;
                                            z3 = z2;
                                            i26 = i33;
                                            i27 = i13;
                                            i28 = i23 & (-458753);
                                            j7 = j13;
                                            j12 = j10;
                                            tlsVar4 = tlsVar3;
                                            ety0Var2 = ((zm51) btsVar2.m(an51.a)).g;
                                            f530Var3 = f530Var2;
                                            j11 = j5;
                                        } else {
                                            sjy0Var3 = sjy0Var4;
                                            z3 = z2;
                                            i26 = i33;
                                            i27 = i13;
                                            j11 = j5;
                                            i28 = i23;
                                            j7 = j13;
                                            j12 = j10;
                                            ety0Var2 = ety0Var;
                                            tlsVar4 = tlsVar3;
                                            f530Var3 = f530Var2;
                                        }
                                        eyrVar4 = eyrVar2;
                                        hzrVar4 = hzrVar2;
                                        j9 = j14;
                                    } else {
                                        btsVar2.Y();
                                        if ((i5 & 4) != 0) {
                                            i13 &= -897;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            i23 &= -458753;
                                        }
                                        sjy0Var3 = sjy0Var;
                                        i26 = i;
                                        i25 = i2;
                                        tlsVar4 = tlsVar;
                                        ety0Var2 = ety0Var;
                                        z3 = z2;
                                        i27 = i13;
                                        f530Var3 = f530Var2;
                                        j11 = j5;
                                        i28 = i23;
                                        j12 = j;
                                        j7 = j3;
                                        eyrVar4 = eyrVar2;
                                        hzrVar4 = hzrVar2;
                                        j9 = j4;
                                    }
                                    btsVar2.u();
                                    int i34 = i27;
                                    int i35 = i34 >> 3;
                                    int i36 = ((i34 >> 9) & 7168) | (i27 & 1022) | (i35 & HProv.ALG_CLASS_ALL) | ((i34 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i34 << 9) & 3670016) | (i35 & 29360128) | (i35 & 234881024) | ((i28 << 27) & 1879048192);
                                    int i37 = (i28 & 896) | ((i34 >> 21) & 14) | (i28 & 112) | (i28 & 7168);
                                    int i38 = i28 << 3;
                                    btsVar = btsVar2;
                                    wqy0.b(str, f530Var3, j12, j11, hzrVar4, lzrVar2, eyrVar4, j9, null, sjy0Var3, j7, i26, z3, i25, 0, tlsVar4, ety0Var2, btsVar, i36, i37 | (i38 & ImageMetadata.JPEG_GPS_COORDINATES) | (i38 & 3670016), 16384);
                                    eyr eyrVar5 = eyrVar4;
                                    f530Var2 = f530Var3;
                                    j6 = j12;
                                    eyrVar3 = eyrVar5;
                                    long j15 = j11;
                                    hzrVar3 = hzrVar4;
                                    j8 = j15;
                                    sjy0Var2 = sjy0Var3;
                                    i24 = i26;
                                    tlsVar2 = tlsVar4;
                                }
                                lzr lzrVar3 = lzrVar2;
                                v = btsVar.v();
                                if (v == null) {
                                    v.d = new uqy0(str, f530Var2, j6, eyrVar3, lzrVar3, hzrVar3, j8, j7, j9, sjy0Var2, i24, z3, i25, tlsVar2, ety0Var2, i3, i4, i5, 0);
                                    return;
                                }
                                return;
                            }
                        }
                        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                        }
                        if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                        }
                        lzr lzrVar32 = lzrVar2;
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    z2 = z;
                    i20 = i5 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                    }
                    if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                    }
                    if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                    }
                    lzr lzrVar322 = lzrVar2;
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                lzrVar2 = lzrVar;
                i9 = i5 & 32;
                int i302 = 65536;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i6 | 805306368;
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i312 = i16;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                z2 = z;
                i20 = i5 & 8192;
                if (i20 != 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                }
                if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
                }
                lzr lzrVar3222 = lzrVar2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            eyrVar2 = eyrVar;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            lzrVar2 = lzrVar;
            i9 = i5 & 32;
            int i3022 = 65536;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i6 | 805306368;
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i3122 = i16;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            z2 = z;
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
            }
            if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
            }
            lzr lzrVar32222 = lzrVar2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        eyrVar2 = eyrVar;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        lzrVar2 = lzrVar;
        i9 = i5 & 32;
        int i30222 = 65536;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i6 | 805306368;
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i31222 = i16;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        z2 = z;
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
        }
        if (btsVar2.V(i13 & 1, (i13 & 306783379) == 306783378 || (i23 & 74899) != 74898)) {
        }
        lzr lzrVar322222 = lzrVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final String str, f530 f530Var, final long j, lzr lzrVar, long j2, long j3, long j4, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3, final int i4) {
        lzr lzrVar2;
        int i5;
        bts btsVar;
        final f530 f530Var2;
        final long j5;
        final long j6;
        final long j7;
        final int i6;
        final boolean z2;
        final int i7;
        final tls tlsVar2;
        final ety0 ety0Var2;
        final lzr lzrVar3;
        aii0 v;
        f530 f530Var3;
        int i8;
        long j8;
        long j9;
        tls tlsVar3;
        boolean z3;
        int i9;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-493592008);
        int i10 = (btsVar2.k(str) ? 4 : 2) | i3 | 48 | (btsVar2.d(j) ? 256 : 128);
        int i11 = i10 | HProv.ALG_TYPE_SECURECHANNEL;
        int i12 = i4 & 16;
        if (i12 != 0) {
            i11 = i10 | 27648;
        } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            lzrVar2 = lzrVar;
            i11 |= btsVar2.k(lzrVar2) ? 16384 : 8192;
            i5 = i11 | 920322048;
            if (btsVar2.V(i5 & 1, (306783379 & i5) == 306783378)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var2 = f530Var;
                j5 = j2;
                j6 = j3;
                j7 = j4;
                i6 = i;
                z2 = z;
                i7 = i2;
                tlsVar2 = tlsVar;
                ety0Var2 = ety0Var;
                lzrVar3 = lzrVar2;
            } else {
                btsVar2.a0();
                if ((i3 & 1) == 0 || btsVar2.C()) {
                    if (i12 != 0) {
                        lzrVar2 = null;
                    }
                    long j10 = sty0.c;
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new wk6(6);
                        btsVar2.o0(Q);
                    }
                    ety0 ety0Var4 = ((zm51) btsVar2.m(an51.a)).h;
                    f530Var3 = c530.a;
                    i8 = 2;
                    j8 = j10;
                    j9 = j8;
                    tlsVar3 = (tls) Q;
                    z3 = true;
                    i9 = 1;
                    ety0Var3 = ety0Var4;
                    j7 = j9;
                } else {
                    btsVar2.Y();
                    f530Var3 = f530Var;
                    j8 = j2;
                    j9 = j3;
                    j7 = j4;
                    i8 = i;
                    z3 = z;
                    i9 = i2;
                    tlsVar3 = tlsVar;
                    ety0Var3 = ety0Var;
                }
                lzr lzrVar4 = lzrVar2;
                btsVar2.u();
                f530Var2 = f530Var3;
                btsVar = btsVar2;
                wqy0.b(str, f530Var2, j, j8, null, lzrVar4, null, j7, null, null, j9, i8, z3, i9, 0, tlsVar3, ety0Var3, btsVar, (i5 & 1022) | 27648 | (458752 & (i5 << 3)) | 920125440, 200118, 16384);
                j5 = j8;
                lzrVar3 = lzrVar4;
                j6 = j9;
                i6 = i8;
                z2 = z3;
                i7 = i9;
                tlsVar2 = tlsVar3;
                ety0Var2 = ety0Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: mqy0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i3 | 1);
                        ymb1.g(str, f530Var2, j, lzrVar3, j5, j6, j7, i6, z2, i7, tlsVar2, ety0Var2, (fid) obj, O, i4);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        lzrVar2 = lzrVar;
        i5 = i11 | 920322048;
        if (btsVar2.V(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void h(final String str, f530 f530Var, final long j, lzr lzrVar, hzr hzrVar, long j2, long j3, long j4, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3, final int i4) {
        int i5;
        f530 f530Var2;
        int i6;
        bts btsVar;
        final lzr lzrVar2;
        final hzr hzrVar2;
        final long j5;
        final long j6;
        final long j7;
        final int i7;
        final boolean z2;
        final int i8;
        final tls tlsVar2;
        final ety0 ety0Var2;
        final f530 f530Var3;
        lzr lzrVar3;
        long j8;
        long j9;
        int i9;
        boolean z3;
        int i10;
        f530 f530Var4;
        hzr hzrVar3;
        long j10;
        int i11;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2094205126);
        if ((i3 & 6) == 0) {
            i5 = i3 | (btsVar2.k(str) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i6 = i5 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i6 = i5 | (btsVar2.k(f530Var2) ? 32 : 16);
        }
        int i13 = i6 | (btsVar2.d(j) ? 256 : 128) | 853109760;
        if (btsVar2.V(i13 & 1, (306783379 & i13) != 306783378)) {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                if (i12 != 0) {
                    f530Var2 = c530.a;
                }
                lzrVar3 = lzr.C;
                hzr hzrVar4 = new hzr(0);
                long E = uh6.E(32);
                long E2 = uh6.E(35);
                long w = uh6.w(-0.025d);
                int i14 = i13 & (-235339777);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new wk6(6);
                    btsVar2.o0(Q);
                }
                tlsVar2 = (tls) Q;
                ety0Var2 = (ety0) btsVar2.m(wqy0.a);
                j8 = E;
                j9 = E2;
                i9 = 2;
                z3 = true;
                i10 = i14;
                f530Var4 = f530Var2;
                hzrVar3 = hzrVar4;
                j10 = w;
                i11 = 1;
            } else {
                btsVar2.Y();
                lzrVar3 = lzrVar;
                j8 = j2;
                j9 = j3;
                j10 = j4;
                i9 = i;
                z3 = z;
                i11 = i2;
                tlsVar2 = tlsVar;
                ety0Var2 = ety0Var;
                i10 = i13 & (-235339777);
                f530Var4 = f530Var2;
                hzrVar3 = hzrVar;
            }
            btsVar2.u();
            btsVar = btsVar2;
            wqy0.b(str, f530Var4, j, j8, hzrVar3, lzrVar3, null, j10, null, null, j9, i9, z3, i11, 0, tlsVar2, ety0Var2, btsVar, (i10 & 1022) | 907742208, 200118, 16384);
            lzrVar2 = lzrVar3;
            j6 = j9;
            i8 = i11;
            z2 = z3;
            i7 = i9;
            j7 = j10;
            j5 = j8;
            hzrVar2 = hzrVar3;
            f530Var3 = f530Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            lzrVar2 = lzrVar;
            hzrVar2 = hzrVar;
            j5 = j2;
            j6 = j3;
            j7 = j4;
            i7 = i;
            z2 = z;
            i8 = i2;
            tlsVar2 = tlsVar;
            ety0Var2 = ety0Var;
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: nqy0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i3 | 1);
                    ymb1.h(str, f530Var3, j, lzrVar2, hzrVar2, j5, j6, j7, i7, z2, i8, tlsVar2, ety0Var2, (fid) obj, O, i4);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final String str, f530 f530Var, long j, final lzr lzrVar, hzr hzrVar, final long j2, long j3, long j4, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, final int i3, final int i4, final int i5) {
        int i6;
        long j5;
        int i7;
        int i8;
        hzr hzrVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        bts btsVar;
        f530 f530Var2;
        final long j6;
        final int i14;
        final tls tlsVar2;
        final ety0 ety0Var2;
        long j7;
        int i15;
        final long j8;
        final boolean z2;
        aii0 v;
        f530 f530Var3;
        ety0 ety0Var3;
        tls tlsVar3;
        int i16;
        boolean z3;
        int i17;
        int i18;
        hzr hzrVar3;
        long j9;
        long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(353680901);
        int i19 = (btsVar2.k(str) ? 4 : 2) | i3;
        int i20 = i5 & 2;
        if (i20 != 0) {
            i6 = i19 | 48;
        } else {
            i6 = i19 | (btsVar2.k(f530Var) ? 32 : 16);
        }
        if ((i5 & 4) == 0) {
            j5 = j;
            if (btsVar2.d(j5)) {
                i7 = 256;
                int i21 = i6 | i7 | HProv.ALG_TYPE_SECURECHANNEL;
                if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i21 |= btsVar2.k(lzrVar) ? 16384 : 8192;
                }
                i8 = i5 & 32;
                if (i8 == 0) {
                    i9 = i21 | ImageMetadata.EDGE_MODE;
                    hzrVar2 = hzrVar;
                } else {
                    hzrVar2 = hzrVar;
                    i9 = i21 | (btsVar2.k(hzrVar2) ? 131072 : 65536);
                }
                i10 = i9 | (!btsVar2.d(j2) ? 1048576 : 524288) | 918552576;
                int i22 = i4 | 438;
                i11 = i5 & 8192;
                if (i11 == 0) {
                    i22 = 3510;
                } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i12 = i2;
                    i22 |= btsVar2.c(i12) ? 2048 : 1024;
                    i13 = i22 | HProv.ALG_CLASS_DATA_ENCRYPT | (((i5 & 32768) == 0 || !btsVar2.k(ety0Var)) ? 65536 : 131072);
                    if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (74899 & i13) != 74898)) {
                        btsVar2.a0();
                        if ((i3 & 1) == 0 || btsVar2.C()) {
                            f530Var3 = i20 != 0 ? c530.a : f530Var;
                            if ((i5 & 4) != 0) {
                                j5 = ((el51) btsVar2.m(gl51.a)).n();
                                i10 &= -897;
                            }
                            hzr hzrVar4 = i8 != 0 ? null : hzrVar2;
                            long j11 = sty0.c;
                            int i23 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            Object Q = btsVar2.Q();
                            if (Q == did.a) {
                                Q = new wk6(6);
                                btsVar2.o0(Q);
                            }
                            tls tlsVar4 = (tls) Q;
                            if ((i5 & 32768) != 0) {
                                i13 &= -458753;
                                tlsVar3 = tlsVar4;
                                i16 = i10;
                                i15 = i23;
                                ety0Var3 = ((zm51) btsVar2.m(an51.a)).a;
                            } else {
                                ety0Var3 = ety0Var;
                                tlsVar3 = tlsVar4;
                                i16 = i10;
                                i15 = i23;
                            }
                            z3 = true;
                            i17 = 2;
                            i18 = i13;
                            j7 = j5;
                            hzrVar3 = hzrVar4;
                            j9 = j11;
                            j10 = j9;
                        } else {
                            btsVar2.Y();
                            if ((i5 & 4) != 0) {
                                i10 &= -897;
                            }
                            if ((i5 & 32768) != 0) {
                                i13 &= -458753;
                            }
                            f530Var3 = f530Var;
                            j10 = j3;
                            j9 = j4;
                            i17 = i;
                            z3 = z;
                            tlsVar3 = tlsVar;
                            ety0Var3 = ety0Var;
                            i16 = i10;
                            i15 = i12;
                            i18 = i13;
                            j7 = j5;
                            hzrVar3 = hzrVar2;
                        }
                        btsVar2.u();
                        btsVar = btsVar2;
                        f530Var2 = f530Var3;
                        wqy0.b(str, f530Var2, j7, j2, hzrVar3, lzrVar, null, j9, null, null, j10, i17, z3, i15, 0, tlsVar3, ety0Var3, btsVar, ((i16 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | (i16 & 1022) | ((i16 >> 9) & 7168) | ((i16 >> 3) & HProv.ALG_CLASS_ALL) | 920125440, (i18 & 7168) | 197046 | ((i18 << 3) & 3670016), 16384);
                        hzrVar2 = hzrVar3;
                        j6 = j9;
                        j8 = j10;
                        i14 = i17;
                        z2 = z3;
                        tlsVar2 = tlsVar3;
                        ety0Var2 = ety0Var3;
                    } else {
                        btsVar = btsVar2;
                        btsVar.Y();
                        f530Var2 = f530Var;
                        j6 = j4;
                        i14 = i;
                        tlsVar2 = tlsVar;
                        ety0Var2 = ety0Var;
                        j7 = j5;
                        i15 = i12;
                        j8 = j3;
                        z2 = z;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        final int i24 = i15;
                        final f530 f530Var4 = f530Var2;
                        final long j12 = j7;
                        final hzr hzrVar5 = hzrVar2;
                        v.d = new wls() { // from class: qqy0
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i3 | 1);
                                int O2 = vng.O(i4);
                                ymb1.i(str, f530Var4, j12, lzrVar, hzrVar5, j2, j8, j6, i14, z2, i24, tlsVar2, ety0Var2, (fid) obj, O, O2, i5);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i12 = i2;
                i13 = i22 | HProv.ALG_CLASS_DATA_ENCRYPT | (((i5 & 32768) == 0 || !btsVar2.k(ety0Var)) ? 65536 : 131072);
                if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (74899 & i13) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
        } else {
            j5 = j;
        }
        i7 = 128;
        int i212 = i6 | i7 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        i10 = i9 | (!btsVar2.d(j2) ? 1048576 : 524288) | 918552576;
        int i222 = i4 | 438;
        i11 = i5 & 8192;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i222 | HProv.ALG_CLASS_DATA_ENCRYPT | (((i5 & 32768) == 0 || !btsVar2.k(ety0Var)) ? 65536 : 131072);
        if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (74899 & i13) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(String str, f530 f530Var, long j, eyr eyrVar, lzr lzrVar, long j2, long j3, long j4, sjy0 sjy0Var, int i, boolean z, int i2, tls tlsVar, ety0 ety0Var, fid fidVar, int i3, int i4, int i5) {
        int i6;
        f530 f530Var2;
        long j5;
        int i7;
        eyr eyrVar2;
        int i8;
        long j6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        bts btsVar;
        long j7;
        long j8;
        int i15;
        boolean z2;
        int i16;
        tls tlsVar2;
        ety0 ety0Var2;
        f530 f530Var3;
        eyr eyrVar3;
        sjy0 sjy0Var2;
        aii0 v;
        tls tlsVar3;
        long j9;
        eyr eyrVar4;
        long j10;
        long j11;
        int i17;
        int i18;
        int i19;
        int i20;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-629431416);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 384) != 0) {
                if ((i5 & 4) == 0) {
                    j5 = j;
                    if (btsVar2.d(j5)) {
                        i20 = 256;
                        i6 |= i20;
                    }
                } else {
                    j5 = j;
                }
                i20 = 128;
                i6 |= i20;
            } else {
                j5 = j;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                eyrVar2 = eyrVar;
                i6 |= btsVar2.k(eyrVar2) ? 2048 : 1024;
                if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i6 |= btsVar2.k(lzrVar) ? 16384 : 8192;
                }
                int i22 = i6 | 1769472;
                i8 = i5 & 128;
                if (i8 != 0) {
                    i22 = i6 | 14352384;
                    j6 = j3;
                } else {
                    j6 = j3;
                    if ((12582912 & i3) == 0) {
                        i22 |= btsVar2.d(j6) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                }
                i9 = i22 | 905969664;
                i10 = i5 & 1024;
                if (i10 != 0) {
                    i12 = i4 | 6;
                    i11 = i10;
                } else {
                    i11 = i10;
                    i12 = i4 | (btsVar2.k(sjy0Var) ? 4 : 2);
                }
                int i23 = i12;
                int i24 = i23 | 432;
                i13 = i5 & 8192;
                if (i13 != 0) {
                    i24 = i23 | 3504;
                } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i24 |= btsVar2.c(i2) ? 2048 : 1024;
                    i14 = i24 | 90112;
                    if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        j7 = j2;
                        j8 = j4;
                        i15 = i;
                        z2 = z;
                        i16 = i2;
                        tlsVar2 = tlsVar;
                        ety0Var2 = ety0Var;
                        f530Var3 = f530Var2;
                        eyrVar3 = eyrVar2;
                        sjy0Var2 = sjy0Var;
                    } else {
                        btsVar2.a0();
                        if ((i3 & 1) == 0 || btsVar2.C()) {
                            f530 f530Var4 = i21 != 0 ? c530.a : f530Var2;
                            if ((i5 & 4) != 0) {
                                i9 &= -897;
                                j5 = ((el51) btsVar2.m(gl51.a)).n();
                            }
                            if (i7 != 0) {
                                eyrVar2 = null;
                            }
                            long j12 = sty0.c;
                            if (i8 != 0) {
                                j6 = j12;
                            }
                            sjy0 sjy0Var3 = i11 == 0 ? sjy0Var : null;
                            int i25 = i13 != 0 ? Integer.MAX_VALUE : i2;
                            Object Q = btsVar2.Q();
                            if (Q == did.a) {
                                Q = new wk6(6);
                                btsVar2.o0(Q);
                            }
                            int i26 = i14 & (-458753);
                            tlsVar3 = (tls) Q;
                            ety0Var2 = ((zm51) btsVar2.m(an51.a)).d;
                            j9 = j5;
                            eyrVar4 = eyrVar2;
                            z2 = true;
                            i15 = 2;
                            sjy0Var2 = sjy0Var3;
                            j10 = j6;
                            j11 = j12;
                            i17 = i25;
                            f530Var3 = f530Var4;
                            i18 = i26;
                            i19 = i9;
                            j7 = j11;
                        } else {
                            btsVar2.Y();
                            if ((i5 & 4) != 0) {
                                i9 &= -897;
                            }
                            i18 = i14 & (-458753);
                            i15 = i;
                            z2 = z;
                            i17 = i2;
                            tlsVar3 = tlsVar;
                            ety0Var2 = ety0Var;
                            i19 = i9;
                            f530Var3 = f530Var2;
                            j9 = j5;
                            j10 = j6;
                            eyrVar4 = eyrVar2;
                            j7 = j2;
                            j11 = j4;
                            sjy0Var2 = sjy0Var;
                        }
                        btsVar2.u();
                        int i27 = i19 >> 3;
                        btsVar = btsVar2;
                        wqy0.b(str, f530Var3, j9, j7, null, lzrVar, eyrVar4, j11, null, sjy0Var2, j10, i15, z2, i17, 0, tlsVar3, ety0Var2, btsVar, (i19 & 1022) | ((i19 >> 9) & 7168) | (57344 & i27) | ((i19 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i19 << 9) & 3670016) | (29360128 & i27) | (i27 & 234881024) | ((i18 << 27) & 1879048192), (i18 & 7168) | ((i19 >> 21) & 14) | 432 | ImageMetadata.EDGE_MODE, 16384);
                        long j13 = j9;
                        eyrVar3 = eyrVar4;
                        j5 = j13;
                        j8 = j11;
                        j6 = j10;
                        i16 = i17;
                        tlsVar2 = tlsVar3;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new jqy0(str, f530Var3, j5, eyrVar3, lzrVar, j7, j6, j8, sjy0Var2, i15, z2, i16, tlsVar2, ety0Var2, i3, i4, i5, 0);
                        return;
                    }
                    return;
                }
                i14 = i24 | 90112;
                if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            eyrVar2 = eyrVar;
            if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            int i222 = i6 | 1769472;
            i8 = i5 & 128;
            if (i8 != 0) {
            }
            i9 = i222 | 905969664;
            i10 = i5 & 1024;
            if (i10 != 0) {
            }
            int i232 = i12;
            int i242 = i232 | 432;
            i13 = i5 & 8192;
            if (i13 != 0) {
            }
            i14 = i242 | 90112;
            if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i3 & 384) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        eyrVar2 = eyrVar;
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        int i2222 = i6 | 1769472;
        i8 = i5 & 128;
        if (i8 != 0) {
        }
        i9 = i2222 | 905969664;
        i10 = i5 & 1024;
        if (i10 != 0) {
        }
        int i2322 = i12;
        int i2422 = i2322 | 432;
        i13 = i5 & 8192;
        if (i13 != 0) {
        }
        i14 = i2422 | 90112;
        if (btsVar2.V(i9 & 1, (i9 & 306783379) == 306783378 || (i14 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final Pair k(lne lneVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("bidderToken", lneVar.a);
        Set set = lneVar.b;
        if (set != null) {
            mapBuilder.put("bannerIdsToSkip", set);
        }
        return new Pair("yandexAdsSdk", mapBuilder.j());
    }

    public static final f530 l(f530 f530Var, ehr0 ehr0Var) {
        return d.c(f530Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ehr0Var, 518143);
    }

    public static final f530 m(f530 f530Var) {
        return d.c(f530Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 520191);
    }
}
