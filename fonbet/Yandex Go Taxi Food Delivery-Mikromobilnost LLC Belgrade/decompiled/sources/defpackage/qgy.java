package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.text.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public abstract class qgy {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:123:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final CharSequence charSequence, final xfc xfcVar, String str, final f530 f530Var, long j, long j2, sjy0 sjy0Var, long j3, int i, int i2, int i3, final ety0 ety0Var, fid fidVar, final int i4, final int i5, final int i6) {
        int i7;
        sjy0 sjy0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        bts btsVar;
        final String str2;
        final long j4;
        final long j5;
        final int i15;
        final int i16;
        final int i17;
        final sjy0 sjy0Var3;
        final long j6;
        aii0 v;
        String obj;
        long j7;
        sjy0 sjy0Var4;
        int i18;
        Throwable th;
        int i19;
        long j8;
        long j9;
        int i20;
        Object obj2;
        String str3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(497774890);
        if ((i4 & 6) == 0) {
            i7 = ((i4 & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= (i4 & 64) == 0 ? btsVar2.k(xfcVar) : btsVar2.e(xfcVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i7 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        int i21 = 1794048 | i7;
        int i22 = i6 & 128;
        if (i22 != 0) {
            i21 = 14376960 | i7;
        } else if ((12582912 & i4) == 0) {
            sjy0Var2 = sjy0Var;
            i21 |= btsVar2.k(sjy0Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            i8 = 100663296 | i21;
            i9 = i6 & 512;
            if (i9 == 0) {
                i8 = 905969664 | i21;
            } else if ((805306368 & i4) == 0) {
                i10 = i;
                i8 |= btsVar2.c(i10) ? 536870912 : SelfTester_JCP.IMITA;
                i11 = i6 & 1024;
                if (i11 != 0) {
                    i12 = i2;
                    i13 = 6;
                } else {
                    i12 = i2;
                    if ((i5 & 6) == 0) {
                        i13 = i5 | (btsVar2.c(i12) ? 4 : 2);
                    } else {
                        i13 = i5;
                    }
                }
                i14 = i13 | 48 | (btsVar2.k(ety0Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
                if (btsVar2.V(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
                    btsVar2.a0();
                    if ((i4 & 1) == 0 || btsVar2.C()) {
                        obj = charSequence.toString();
                        int i23 = i8 & (-897);
                        j7 = sty0.c;
                        if (i22 != 0) {
                            sjy0Var2 = null;
                        }
                        if (i9 != 0) {
                            i10 = 1;
                        }
                        int i24 = i10;
                        sjy0Var4 = sjy0Var2;
                        i18 = i24;
                        th = null;
                        i19 = i23;
                        j8 = j7;
                        i15 = 1;
                        i16 = i11 != 0 ? Integer.MAX_VALUE : i12;
                        j9 = j8;
                    } else {
                        btsVar2.Y();
                        int i25 = i10;
                        sjy0Var4 = sjy0Var2;
                        i18 = i25;
                        j7 = j;
                        i15 = i3;
                        i19 = i8 & (-897);
                        th = null;
                        i16 = i12;
                        obj = str;
                        j9 = j2;
                        j8 = j3;
                    }
                    btsVar2.u();
                    final fwi fwiVar = (fwi) btsVar2.m(j.h);
                    int i26 = i18;
                    boolean booleanValue = ((Boolean) btsVar2.m(n.a)).booleanValue();
                    long j10 = j9;
                    LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(j.n);
                    Object Q = btsVar2.Q();
                    sjy0 sjy0Var5 = sjy0Var4;
                    Object obj3 = did.a;
                    if (Q == obj3) {
                        Q = zpn.j(EmptyCoroutineContext.a, btsVar2);
                        btsVar2.o0(Q);
                    }
                    tse tseVar = (tse) Q;
                    long j11 = j8;
                    pey peyVar = (pey) btsVar2.m(n3z.a);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == obj3) {
                        Q2 = new a(booleanValue, layoutDirection, tseVar, peyVar);
                        btsVar2.o0(Q2);
                    }
                    final a aVar = (a) Q2;
                    boolean k = btsVar2.k(obj);
                    Object Q3 = btsVar2.Q();
                    if (k || Q3 == obj3) {
                        Q3 = new vsq(obj, 18);
                        btsVar2.o0(Q3);
                    }
                    f530 a2 = fnq0.a(f530Var, (tls) Q3);
                    z910 d = pi6.d(x4c.b, true);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, a2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw th;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    f530 a3 = exw0.a(c530.a, aVar, new com.yandex.go.design.compose.text.b(aVar));
                    Object Q4 = btsVar2.Q();
                    if (Q4 == obj3) {
                        Q4 = new mtw(27);
                        btsVar2.o0(Q4);
                    }
                    tls tlsVar = (tls) Q4;
                    boolean e = btsVar2.e(aVar);
                    Object Q5 = btsVar2.Q();
                    if (e || Q5 == obj3) {
                        i20 = 0;
                        Q5 = new lgy(aVar, i20);
                        btsVar2.o0(Q5);
                    } else {
                        i20 = 0;
                    }
                    tls tlsVar2 = (tls) Q5;
                    int i27 = (btsVar2.e(aVar) ? 1 : 0) | (btsVar2.k(fwiVar) ? 1 : 0) | (((i19 & 14) == 4 || ((i19 & 8) != 0 && btsVar2.e(charSequence))) ? 1 : i20) | (((i19 & 112) == 32 || ((i19 & 64) != 0 && btsVar2.e(xfcVar))) ? 1 : i20) | ((i19 & HProv.ALG_CLASS_ALL) == 16384 ? 1 : i20) | ((i19 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 ? 1 : i20) | ((i19 & 3670016) == 1048576 ? 1 : i20) | ((i19 & 29360128) == 8388608 ? 1 : i20) | ((i19 & 234881024) == 67108864 ? 1 : i20) | ((i19 & 1879048192) == 536870912 ? 1 : i20) | ((i14 & 14) == 4 ? 1 : i20);
                    if ((((i14 & 896) ^ 384) > 256 && btsVar2.k(ety0Var)) || (i14 & 384) == 256) {
                        i20 = 1;
                    }
                    int i28 = i20 | i27;
                    Object Q6 = btsVar2.Q();
                    if (i28 != 0 || Q6 == obj3) {
                        j4 = j10;
                        sjy0Var3 = sjy0Var5;
                        j5 = j11;
                        str3 = obj;
                        j6 = j7;
                        i17 = i26;
                        obj2 = new tls() { // from class: mgy
                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                long j12 = ldc.m;
                                a.this.c((RobotoTextView) obj4, fwiVar, charSequence, j12, xfcVar, j6, j4, sjy0Var3, j5, i17, i16, i15, ety0Var, null);
                                return zy11.a;
                            }
                        };
                        btsVar = btsVar2;
                        btsVar.o0(obj2);
                    } else {
                        i17 = i26;
                        sjy0Var3 = sjy0Var5;
                        j5 = j11;
                        str3 = obj;
                        btsVar = btsVar2;
                        obj2 = Q6;
                        j6 = j7;
                        j4 = j10;
                    }
                    androidx.compose.ui.viewinterop.b.b(tlsVar, a3, null, tlsVar2, (tls) obj2, btsVar, 6, 4);
                    btsVar.t(true);
                    str2 = str3;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    str2 = str;
                    j4 = j2;
                    j5 = j3;
                    i15 = i3;
                    i16 = i12;
                    i17 = i10;
                    sjy0Var3 = sjy0Var2;
                    j6 = j;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ngy
                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            int O = vng.O(i4 | 1);
                            int O2 = vng.O(i5);
                            qgy.a(charSequence, xfcVar, str2, f530Var, j6, j4, sjy0Var3, j5, i17, i16, i15, ety0Var, (fid) obj4, O, O2, i6);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            i10 = i;
            i11 = i6 & 1024;
            if (i11 != 0) {
            }
            i14 = i13 | 48 | (btsVar2.k(ety0Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
            if (btsVar2.V(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        sjy0Var2 = sjy0Var;
        i8 = 100663296 | i21;
        i9 = i6 & 512;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i6 & 1024;
        if (i11 != 0) {
        }
        i14 = i13 | 48 | (btsVar2.k(ety0Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar2.V(i8 & 1, (i8 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final CharSequence charSequence, String str, f530 f530Var, wp2 wp2Var, long j, long j2, sjy0 sjy0Var, long j3, int i, int i2, int i3, ety0 ety0Var, tls tlsVar, fid fidVar, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        wp2 wp2Var2;
        int i9;
        long j4;
        int i10;
        int i11;
        int i12;
        long j5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        bts btsVar;
        final String str2;
        final f530 f530Var2;
        final sjy0 sjy0Var2;
        final int i19;
        final ety0 ety0Var2;
        final tls tlsVar2;
        final wp2 wp2Var3;
        final long j6;
        final int i20;
        final int i21;
        final long j7;
        final long j8;
        aii0 v;
        String str3;
        ety0 ety0Var3;
        ety0 ety0Var4;
        int i22;
        wp2 wp2Var4;
        int i23;
        int i24;
        int i25;
        tls tlsVar3;
        int i26;
        String str4;
        f530 f530Var3;
        sjy0 sjy0Var3;
        long j9;
        long j10;
        long j11;
        int i27;
        final int i28;
        final sjy0 sjy0Var4;
        final int i29;
        final int i30;
        final tls tlsVar4;
        final long j12;
        final long j13;
        final ety0 ety0Var5;
        final long j14;
        int i31;
        int i32;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1484521417);
        if ((i4 & 6) == 0) {
            i7 = ((i4 & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i6 & 2) == 0 && btsVar2.k(str)) {
                i32 = 32;
                i7 |= i32;
            }
            i32 = 16;
            i7 |= i32;
        }
        int i33 = i6 & 4;
        if (i33 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= btsVar2.k(f530Var) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wp2Var2 = wp2Var;
                i7 |= btsVar2.k(wp2Var2) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    j4 = j;
                } else {
                    j4 = j;
                    if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i7 |= btsVar2.d(j4) ? 16384 : 8192;
                    }
                }
                i10 = i7 | 1769472;
                i11 = i6 & 128;
                if (i11 != 0) {
                    i10 = i7 | 14352384;
                } else if ((12582912 & i4) == 0) {
                    i10 |= btsVar2.k(sjy0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i10 |= 100663296;
                        j5 = j3;
                    } else {
                        j5 = j3;
                        if ((i4 & 100663296) == 0) {
                            i10 |= btsVar2.d(j5) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                        }
                    }
                    i13 = i6 & 512;
                    if (i13 == 0) {
                        i10 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i10 |= btsVar2.c(i) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                    i14 = i6 & 1024;
                    if (i14 == 0) {
                        i16 = i5 | 6;
                        i15 = i14;
                    } else if ((i5 & 6) == 0) {
                        i15 = i14;
                        i16 = i5 | (btsVar2.c(i2) ? 4 : 2);
                    } else {
                        i15 = i14;
                        i16 = i5;
                    }
                    int i34 = i16 | 48;
                    if ((i5 & 384) == 0) {
                        if ((i6 & 4096) == 0 && btsVar2.k(ety0Var)) {
                            i31 = 256;
                            i34 |= i31;
                        }
                        i31 = 128;
                        i34 |= i31;
                    }
                    int i35 = i34;
                    i17 = i6 & 8192;
                    if (i17 == 0) {
                        i18 = i35 | HProv.ALG_TYPE_SECURECHANNEL;
                    } else {
                        int i36 = i35;
                        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i36 |= btsVar2.e(tlsVar) ? 2048 : 1024;
                        }
                        i18 = i36;
                    }
                    if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 1171) != 1170)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        str2 = str;
                        f530Var2 = f530Var;
                        sjy0Var2 = sjy0Var;
                        i19 = i3;
                        ety0Var2 = ety0Var;
                        tlsVar2 = tlsVar;
                        wp2Var3 = wp2Var2;
                        j6 = j4;
                        i20 = i;
                        i21 = i2;
                        j7 = j5;
                        j8 = j2;
                    } else {
                        btsVar2.a0();
                        int i37 = i4 & 1;
                        c530 c530Var = c530.a;
                        if (i37 == 0 || btsVar2.C()) {
                            if ((i6 & 2) != 0) {
                                str3 = charSequence.toString();
                                i10 &= -113;
                            } else {
                                str3 = str;
                            }
                            f530 f530Var4 = i33 != 0 ? c530Var : f530Var;
                            if (i8 != 0) {
                                wp2Var2 = tp2.a;
                            }
                            if (i9 != 0) {
                                j4 = sty0.c;
                            }
                            long j15 = sty0.c;
                            sjy0 sjy0Var5 = i11 != 0 ? null : sjy0Var;
                            if (i12 != 0) {
                                j5 = j15;
                            }
                            int i38 = i13 != 0 ? 1 : i;
                            int i39 = i15 != 0 ? Integer.MAX_VALUE : i2;
                            if ((i6 & 4096) != 0) {
                                ety0Var3 = xya1.e(btsVar2).g.a;
                                i18 &= -897;
                            } else {
                                ety0Var3 = ety0Var;
                            }
                            ety0Var4 = ety0Var3;
                            i22 = i38;
                            wp2Var4 = wp2Var2;
                            i23 = i39;
                            i24 = i10;
                            if (i17 != 0) {
                                i25 = 1;
                                tlsVar3 = null;
                            } else {
                                i25 = 1;
                                tlsVar3 = tlsVar;
                            }
                            long j16 = j5;
                            i26 = i18;
                            str4 = str3;
                            f530Var3 = f530Var4;
                            sjy0Var3 = sjy0Var5;
                            j9 = j15;
                            j10 = j16;
                        } else {
                            btsVar2.Y();
                            if ((i6 & 2) != 0) {
                                i10 &= -113;
                            }
                            if ((i6 & 4096) != 0) {
                                i18 &= -897;
                            }
                            f530Var3 = f530Var;
                            sjy0Var3 = sjy0Var;
                            i25 = i3;
                            ety0Var4 = ety0Var;
                            j10 = j5;
                            wp2Var4 = wp2Var2;
                            i24 = i10;
                            j9 = j2;
                            i23 = i2;
                            tlsVar3 = tlsVar;
                            i26 = i18;
                            str4 = str;
                            i22 = i;
                        }
                        btsVar2.u();
                        long j17 = j9;
                        final long n = tje.n(wp2Var4, btsVar2);
                        wp2 wp2Var5 = wp2Var4;
                        final fwi fwiVar = (fwi) btsVar2.m(j.h);
                        sjy0 sjy0Var6 = sjy0Var3;
                        boolean booleanValue = ((Boolean) btsVar2.m(n.a)).booleanValue();
                        int i40 = i23;
                        LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(j.n);
                        long j18 = j4;
                        Object Q = btsVar2.Q();
                        Object obj = did.a;
                        if (Q == obj) {
                            j11 = j10;
                            Q = new a(booleanValue, layoutDirection, null, null);
                            btsVar2.o0(Q);
                        } else {
                            j11 = j10;
                        }
                        final a aVar = (a) Q;
                        boolean z = (((i24 & 112) ^ 48) > 32 && btsVar2.k(str4)) || (i24 & 48) == 32;
                        Object Q2 = btsVar2.Q();
                        if (z || Q2 == obj) {
                            Q2 = new vsq(str4, 19);
                            btsVar2.o0(Q2);
                        }
                        f530 a2 = fnq0.a(f530Var3, (tls) Q2);
                        z910 d = pi6.d(x4c.b, true);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, a2);
                        ohd.G1.getClass();
                        String str5 = str4;
                        sls slsVar = d.b;
                        f530 f530Var5 = f530Var3;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, d);
                        qje.W(btsVar2, d.e, o);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d2);
                        f530 a3 = exw0.a(c530Var, aVar, new com.yandex.go.design.compose.text.b(aVar));
                        Object Q3 = btsVar2.Q();
                        if (Q3 == obj) {
                            Q3 = new mtw(28);
                            btsVar2.o0(Q3);
                        }
                        tls tlsVar5 = (tls) Q3;
                        boolean e = btsVar2.e(aVar);
                        Object Q4 = btsVar2.Q();
                        if (e || Q4 == obj) {
                            i27 = 1;
                            Q4 = new lgy(aVar, i27);
                            btsVar2.o0(Q4);
                        } else {
                            i27 = 1;
                        }
                        tls tlsVar6 = (tls) Q4;
                        int i41 = (btsVar2.e(aVar) ? 1 : 0) | (btsVar2.k(fwiVar) ? 1 : 0) | (((i24 & 14) == 4 || ((i24 & 8) != 0 && btsVar2.e(charSequence))) ? i27 : 0) | (btsVar2.d(n) ? 1 : 0) | ((i24 & HProv.ALG_CLASS_ALL) == 16384 ? i27 : 0) | ((i24 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 ? i27 : 0) | ((i24 & 3670016) == 1048576 ? i27 : 0) | ((i24 & 29360128) == 8388608 ? i27 : 0) | ((i24 & 234881024) == 67108864 ? i27 : 0) | ((i24 & 1879048192) == 536870912 ? i27 : 0) | ((i26 & 14) == 4 ? i27 : 0) | ((i26 & 112) == 32 ? i27 : 0) | (((((i26 & 896) ^ 384) <= 256 || !btsVar2.k(ety0Var4)) && (i26 & 384) != 256) ? 0 : i27) | ((i26 & 7168) == 2048 ? i27 : 0);
                        Object Q5 = btsVar2.Q();
                        if (i41 != 0 || Q5 == obj) {
                            i28 = i22;
                            sjy0Var4 = sjy0Var6;
                            i29 = i40;
                            i30 = i25;
                            tlsVar4 = tlsVar3;
                            j12 = j17;
                            j13 = j18;
                            ety0Var5 = ety0Var4;
                            j14 = j11;
                            Object obj2 = new tls() { // from class: ogy
                                @Override // defpackage.tls
                                public final Object invoke(Object obj3) {
                                    a.this.c((RobotoTextView) obj3, fwiVar, charSequence, n, null, j13, j12, sjy0Var4, j14, i28, i29, i30, ety0Var5, tlsVar4);
                                    return zy11.a;
                                }
                            };
                            btsVar = btsVar2;
                            btsVar.o0(obj2);
                            Q5 = obj2;
                        } else {
                            i28 = i22;
                            j12 = j17;
                            sjy0Var4 = sjy0Var6;
                            i29 = i40;
                            j13 = j18;
                            j14 = j11;
                            btsVar = btsVar2;
                            i30 = i25;
                            tlsVar4 = tlsVar3;
                            ety0Var5 = ety0Var4;
                        }
                        androidx.compose.ui.viewinterop.b.b(tlsVar5, a3, null, tlsVar6, (tls) Q5, btsVar, 6, 4);
                        btsVar.t(true);
                        j6 = j13;
                        j8 = j12;
                        sjy0Var2 = sjy0Var4;
                        j7 = j14;
                        i20 = i28;
                        i21 = i29;
                        i19 = i30;
                        ety0Var2 = ety0Var5;
                        tlsVar2 = tlsVar4;
                        wp2Var3 = wp2Var5;
                        str2 = str5;
                        f530Var2 = f530Var5;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: pgy
                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int O = vng.O(i4 | 1);
                                int O2 = vng.O(i5);
                                qgy.b(charSequence, str2, f530Var2, wp2Var3, j6, j8, sjy0Var2, j7, i20, i21, i19, ety0Var2, tlsVar2, (fid) obj3, O, O2, i6);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i6 & 512;
                if (i13 == 0) {
                }
                i14 = i6 & 1024;
                if (i14 == 0) {
                }
                int i342 = i16 | 48;
                if ((i5 & 384) == 0) {
                }
                int i352 = i342;
                i17 = i6 & 8192;
                if (i17 == 0) {
                }
                if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 1171) != 1170)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            wp2Var2 = wp2Var;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            i10 = i7 | 1769472;
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i6 & 512;
            if (i13 == 0) {
            }
            i14 = i6 & 1024;
            if (i14 == 0) {
            }
            int i3422 = i16 | 48;
            if ((i5 & 384) == 0) {
            }
            int i3522 = i3422;
            i17 = i6 & 8192;
            if (i17 == 0) {
            }
            if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        wp2Var2 = wp2Var;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        i10 = i7 | 1769472;
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i6 & 512;
        if (i13 == 0) {
        }
        i14 = i6 & 1024;
        if (i14 == 0) {
        }
        int i34222 = i16 | 48;
        if ((i5 & 384) == 0) {
        }
        int i35222 = i34222;
        i17 = i6 & 8192;
        if (i17 == 0) {
        }
        if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i18 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
