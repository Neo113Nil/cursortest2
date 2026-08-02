package ru.yandex.taxi.logistics.sdk.ui.form;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cl91;
import defpackage.did;
import defpackage.el51;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.ldc;
import defpackage.lzr;
import defpackage.o430;
import defpackage.qj4;
import defpackage.qm51;
import defpackage.sls;
import defpackage.sty0;
import defpackage.tls;
import defpackage.v4v;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ynn;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.form.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final sls slsVar, final sls slsVar2, final ldc ldcVar, float f, float f2, long j, final ldc ldcVar2, final String str, sty0 sty0Var, lzr lzrVar, final v4v v4vVar, qj4 qj4Var, boolean z, String str2, Boolean bool, final boolean z2, fid fidVar, final int i, final int i2, final int i3) {
        float f3;
        int i4;
        int i5;
        int i6;
        sty0 sty0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        bts btsVar;
        final float f4;
        final long j2;
        final lzr lzrVar2;
        final qj4 qj4Var2;
        final Boolean bool2;
        final sty0 sty0Var3;
        final float f5;
        final boolean z3;
        final String str3;
        aii0 v;
        int i19;
        final long j3;
        int i20;
        final sty0 sty0Var4;
        float f6;
        long j4;
        Boolean bool3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-620055257);
        int i21 = (btsVar2.e(slsVar) ? 4 : 2) | i | (btsVar2.e(slsVar2) ? 32 : 16) | (btsVar2.k(ldcVar) ? 256 : 128);
        int i22 = i3 & 8;
        if (i22 != 0) {
            i4 = i21 | HProv.ALG_TYPE_SECURECHANNEL;
            f3 = f;
        } else {
            f3 = f;
            i4 = i21 | (btsVar2.b(f3) ? 2048 : 1024);
        }
        int i23 = i3 & 16;
        if (i23 != 0) {
            i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.b(f2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ImageMetadata.EDGE_MODE;
            } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
                i4 |= btsVar2.d(j) ? 131072 : 65536;
            }
            int i24 = 1024;
            int i25 = i4 | (!btsVar2.k(ldcVar2) ? 1048576 : 524288) | (!btsVar2.k(str) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
            i6 = i3 & 256;
            if (i6 == 0) {
                i7 = i25 | 100663296;
                sty0Var2 = sty0Var;
            } else {
                sty0Var2 = sty0Var;
                i7 = i25 | (btsVar2.k(sty0Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
            }
            i8 = i3 & 512;
            if (i8 == 0) {
                i9 = i7 | 805306368;
            } else {
                i9 = i7 | (btsVar2.k(lzrVar) ? 536870912 : SelfTester_JCP.IMITA);
            }
            i10 = i9;
            int i26 = i2 | (!btsVar2.k(v4vVar) ? 4 : 2);
            i11 = i3 & 2048;
            if (i11 == 0) {
                i13 = i26 | 48;
                i12 = i11;
            } else {
                i12 = i11;
                i13 = i26 | (btsVar2.k(qj4Var) ? 32 : 16);
            }
            int i27 = i13;
            int i28 = i27 | 384;
            i14 = i3 & 8192;
            if (i14 == 0) {
                i15 = i27 | 3456;
            } else {
                if (btsVar2.k(str2)) {
                    i24 = 2048;
                }
                i15 = i28 | i24;
            }
            i16 = i3 & 16384;
            if (i16 == 0) {
                i17 = i15 | HProv.ALG_CLASS_DATA_ENCRYPT;
            } else {
                i17 = i15 | (btsVar2.k(bool) ? 16384 : 8192);
            }
            if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                i17 |= btsVar2.a(z2) ? 131072 : 65536;
            }
            i18 = i17;
            if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (74899 & i18) != 74898)) {
                btsVar = btsVar2;
                btsVar.Y();
                f4 = f2;
                j2 = j;
                lzrVar2 = lzrVar;
                qj4Var2 = qj4Var;
                bool2 = bool;
                sty0Var3 = sty0Var2;
                f5 = f3;
                z3 = z;
                str3 = str2;
            } else {
                float f7 = i22 != 0 ? 32.0f : f3;
                final float f8 = i23 != 0 ? 10.0f : f2;
                if (i5 != 0) {
                    i19 = i6;
                    j3 = cl91.o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
                } else {
                    i19 = i6;
                    j3 = j;
                }
                if (i19 != 0) {
                    i20 = i8;
                    sty0Var4 = null;
                } else {
                    i20 = i8;
                    sty0Var4 = sty0Var2;
                }
                final lzr lzrVar3 = i20 != 0 ? null : lzrVar;
                final qj4 qj4Var3 = i12 != 0 ? null : qj4Var;
                String str4 = i14 != 0 ? null : str2;
                Boolean bool4 = i16 != 0 ? null : bool;
                boolean z4 = (i10 & 112) == 32;
                Object Q = btsVar2.Q();
                boolean z5 = z4;
                o430 o430Var = did.a;
                if (z5 || Q == o430Var) {
                    f6 = f7;
                    Q = new HintKt$Hint$1$1(slsVar2, null);
                    btsVar2.o0(Q);
                } else {
                    f6 = f7;
                }
                zpn.e(btsVar2, (wls) Q, zy11.a);
                if (ldcVar == null) {
                    btsVar2.e0(1127374835);
                    j4 = ((el51) btsVar2.m(gl51.a)).g();
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(1127373657);
                    btsVar2.t(false);
                    j4 = ldcVar.a;
                }
                long j5 = j4;
                byk0 a = ((YandexShapes) btsVar2.m(qm51.a)).a();
                boolean z6 = ((i10 & 29360128) == 8388608) | ((i18 & 7168) == 2048) | ((i18 & HProv.ALG_CLASS_ALL) == 16384);
                Object Q2 = btsVar2.Q();
                if (z6 || Q2 == o430Var) {
                    bool3 = bool4;
                    Q2 = new ynn(9, str4, str, bool3);
                    btsVar2.o0(Q2);
                } else {
                    bool3 = bool4;
                }
                btsVar = btsVar2;
                final float f9 = f6;
                lzr lzrVar4 = lzrVar3;
                qj4 qj4Var4 = qj4Var3;
                z3 = true;
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar, fnq0.b(c530.a, false, (tls) Q2), a, j5, 0L, null, null, null, true, null, null, null, wwg.S(-481471514, true, new zls() { // from class: sju
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        c530 c530Var;
                        long j6;
                        c530 c530Var2;
                        fid fidVar2 = (fid) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        bts btsVar3 = (bts) fidVar2;
                        if (btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                            boolean z7 = z2;
                            v4v v4vVar2 = v4vVar;
                            v4v v4vVar3 = z7 ? v4vVar2 : null;
                            if (z7) {
                                v4vVar2 = null;
                            }
                            c530 c530Var3 = c530.a;
                            f530 m = an91.m(ljs0.e(c530Var3, f9), f8, 0.0f, 2);
                            Object Q3 = btsVar3.Q();
                            if (Q3 == did.a) {
                                Q3 = new teb(20);
                                btsVar3.o0(Q3);
                            }
                            f530 a2 = fnq0.a(m, (tls) Q3);
                            lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
                            int hashCode = Long.hashCode(btsVar3.T);
                            r1b0 o = btsVar3.o();
                            f530 d = b.d(btsVar3, a2);
                            ohd.G1.getClass();
                            sls slsVar3 = d.b;
                            if (btsVar3.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar3.i0();
                            if (btsVar3.S) {
                                btsVar3.n(slsVar3);
                            } else {
                                btsVar3.r0();
                            }
                            qje.W(btsVar3, d.f, a3);
                            qje.W(btsVar3, d.e, o);
                            wls wlsVar = d.g;
                            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                                b64.z(hashCode, btsVar3, hashCode, wlsVar);
                            }
                            qje.W(btsVar3, d.d, d);
                            long j7 = j3;
                            if (v4vVar3 != null) {
                                btsVar3.e0(-1627345872);
                                c530Var = c530Var3;
                                s3b1.f(v4vVar3, ljs0.p(an91.o(c530Var3, 0.0f, 0.0f, 2.0f, 0.0f, 11), 0.0f, 0.0f, c8m.b(j7), c8m.a(j7), 3), null, btsVar3, 0, 4);
                                btsVar3.t(false);
                            } else {
                                c530Var = c530Var3;
                                btsVar3.e0(-1627076327);
                                oeb1.c(btsVar3, ljs0.q(c530Var, 4.0f));
                                btsVar3.t(false);
                            }
                            sty0 sty0Var5 = sty0Var4;
                            long j8 = sty0Var5 != null ? sty0Var5.a : sty0.c;
                            ldc ldcVar3 = ldcVar2;
                            if (ldcVar3 == null) {
                                btsVar3.e0(-1992140022);
                                j6 = ((el51) btsVar3.m(gl51.a)).n();
                                btsVar3.t(false);
                            } else {
                                btsVar3.e0(-1992141014);
                                btsVar3.t(false);
                                j6 = ldcVar3.a;
                            }
                            c530 c530Var4 = c530Var;
                            ymb1.f(str, null, j6, null, lzrVar3, null, j8, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 0, 0, 65450);
                            bts btsVar4 = btsVar3;
                            if (v4vVar2 != null) {
                                btsVar4.e0(-1626730739);
                                c530Var2 = c530Var4;
                                s3b1.f(v4vVar2, ljs0.p(an91.o(c530Var4, 2.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, c8m.b(j7), c8m.a(j7), 3), null, btsVar4, 0, 4);
                                btsVar4.t(false);
                            } else {
                                c530Var2 = c530Var4;
                                btsVar4.e0(-1626466464);
                                btsVar4.t(false);
                            }
                            qj4 qj4Var5 = qj4Var3;
                            if (qj4Var5 != null) {
                                btsVar4.e0(-1626425916);
                                oeb1.c(btsVar4, ljs0.q(c530Var2, 4.0f));
                                y3b1.d(qj4Var5.a, null, qj4Var5.b, qj4Var5.c, btsVar4, 0);
                                btsVar4 = btsVar4;
                                btsVar4.t(false);
                            } else {
                                btsVar4.e0(-1626183744);
                                btsVar4.t(false);
                            }
                            if (v4vVar2 == null && qj4Var5 == null) {
                                btsVar4.e0(-1626127975);
                                oeb1.c(btsVar4, ljs0.q(c530Var2, 4.0f));
                                btsVar4.t(false);
                            } else {
                                btsVar4.e0(-1626059744);
                                btsVar4.t(false);
                            }
                            btsVar4.t(true);
                        } else {
                            btsVar3.Y();
                        }
                        return zy11.a;
                    }
                }, btsVar), btsVar, (i10 & 14) | 100663296, 384, 3824);
                bool2 = bool3;
                str3 = str4;
                f5 = f9;
                f4 = f8;
                j2 = j3;
                sty0Var3 = sty0Var4;
                lzrVar2 = lzrVar4;
                qj4Var2 = qj4Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: tju
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i | 1);
                        int O2 = vng.O(i2);
                        a.a(sls.this, slsVar2, ldcVar, f5, f4, j2, ldcVar2, str, sty0Var3, lzrVar2, v4vVar, qj4Var2, z3, str3, bool2, z2, (fid) obj, O, O2, i3);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        int i242 = 1024;
        int i252 = i4 | (!btsVar2.k(ldcVar2) ? 1048576 : 524288) | (!btsVar2.k(str) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i10 = i9;
        int i262 = i2 | (!btsVar2.k(v4vVar) ? 4 : 2);
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        int i272 = i13;
        int i282 = i272 | 384;
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i16 = i3 & 16384;
        if (i16 == 0) {
        }
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
        }
        i18 = i17;
        if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (74899 & i18) != 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
