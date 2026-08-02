package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.CounterSize;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class rsb1 {
    public static i971 a;

    /* JADX WARN: Removed duplicated region for block: B:116:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, final String str, final sls slsVar, final sls slsVar2, final boolean z, final boolean z2, long j, long j2, CounterSize counterSize, fid fidVar, final int i, final int i2) {
        final f530 f530Var2;
        int i3;
        int i4;
        final long j3;
        final CounterSize counterSize2;
        bts btsVar;
        final long j4;
        aii0 v;
        CounterSize counterSize3;
        int i5;
        f530 f530Var3;
        long j5;
        long j6;
        byk0 e;
        ety0 a2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(571916766);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.a(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= SelfTester_JCP.ENCRYPT_CBC;
        }
        int i7 = i2 & 256;
        int i8 = 100663296;
        if (i7 == 0) {
            if ((100663296 & i) == 0) {
                i8 = btsVar2.c(counterSize == null ? -1 : counterSize.ordinal()) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
            }
            i4 = i3;
            if (btsVar2.V(i4 & 1, (38347923 & i3) == 38347922)) {
                btsVar2.Y();
                j3 = j2;
                counterSize2 = counterSize;
                btsVar = btsVar2;
                j4 = j;
            } else {
                btsVar2.a0();
                int i9 = i & 1;
                c530 c530Var = c530.a;
                if (i9 == 0 || btsVar2.C()) {
                    if (i6 != 0) {
                        f530Var2 = c530Var;
                    }
                    a7u0 a7u0Var = gl51.a;
                    long g = ((el51) btsVar2.m(a7u0Var)).g();
                    long q = ((el51) btsVar2.m(a7u0Var)).q();
                    int i10 = i4 & (-33030145);
                    if (i7 != 0) {
                        i5 = i10;
                        f530Var3 = f530Var2;
                        counterSize3 = CounterSize.M;
                    } else {
                        counterSize3 = counterSize;
                        i5 = i10;
                        f530Var3 = f530Var2;
                    }
                    j5 = g;
                    j6 = q;
                } else {
                    btsVar2.Y();
                    j5 = j;
                    j6 = j2;
                    counterSize3 = counterSize;
                    i5 = i4 & (-33030145);
                    f530Var3 = f530Var2;
                }
                btsVar2.u();
                f530 e2 = ljs0.e(fj91.d(f530Var3, IntrinsicSize.Max), counterSize3.getHeight());
                int[] iArr = u0f.a;
                int i11 = iArr[counterSize3.ordinal()];
                if (i11 == 1) {
                    btsVar2.e0(1692416894);
                    e = ((YandexShapes) btsVar2.m(qm51.a)).e();
                    btsVar2.t(false);
                } else if (i11 == 2) {
                    btsVar2.e0(1692417821);
                    e = ((YandexShapes) btsVar2.m(qm51.a)).d();
                    btsVar2.t(false);
                } else if (i11 == 3) {
                    btsVar2.e0(1692418717);
                    e = ((YandexShapes) btsVar2.m(qm51.a)).b();
                    btsVar2.t(false);
                } else {
                    if (i11 != 4) {
                        throw unr0.y(1692415713, btsVar2, false);
                    }
                    btsVar2.e0(1692419613);
                    e = ((YandexShapes) btsVar2.m(qm51.a)).b();
                    btsVar2.t(false);
                }
                long j7 = j5;
                f530 m = an91.m(m4m0.b(e2, j7, e), 12.0f, 0.0f, 2);
                lhl0 a3 = khl0.a(lr20.g, x4c.E, btsVar2, 54);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d = b.d(btsVar2, m);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar3);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, a3);
                qje.W(btsVar2, d.e, o);
                wls wlsVar = d.g;
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar2, hashCode, wlsVar);
                }
                qje.W(btsVar2, d.d, d);
                f530 b = tra1.b(ljs0.m(c530Var, counterSize3.getHeight() / 2.0f), z ? 1.0f : 0.25f);
                int i12 = wzg0.ic_delivery_counter_minus;
                String e3 = ohb1.e(btsVar2, vzh0.minus_content_description);
                Boolean bool = Boolean.TRUE;
                f530 f530Var4 = f530Var3;
                s3b1.c(new cuj0(i12, e3, bool, null, 24), b, z, null, false, x4c.x, slsVar2, btsVar2, ((i5 >> 6) & 896) | 221184 | ((i5 << 9) & 3670016), 8);
                f530 d2 = hi91.d(an91.m(new x2y(1.0f, false), 12.0f, 0.0f, 2), false, null, 3);
                int i13 = iArr[counterSize3.ordinal()];
                if (i13 == 1) {
                    btsVar2.e0(-1032088953);
                    a2 = ety0.a(((zm51) btsVar2.m(an51.a)).g, 0L, 0L, lzr.G, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                    btsVar2.t(false);
                } else if (i13 == 2) {
                    btsVar2.e0(-1032086487);
                    a2 = ety0.a(((zm51) btsVar2.m(an51.a)).f, 0L, 0L, lzr.E, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                    btsVar2.t(false);
                } else if (i13 == 3) {
                    btsVar2.e0(-1032083959);
                    a2 = ety0.a(((zm51) btsVar2.m(an51.a)).e, 0L, 0L, lzr.E, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                    btsVar2.t(false);
                } else {
                    if (i13 != 4) {
                        throw unr0.y(-1032090606, btsVar2, false);
                    }
                    btsVar2.e0(-1032081653);
                    a2 = ((zm51) btsVar2.m(an51.a)).d;
                    btsVar2.t(false);
                }
                float f = 1.0f;
                wqy0.b(str, d2, j6, 0L, null, null, null, 0L, null, new sjy0(3), 0L, 2, false, 0, 0, null, a2, btsVar2, (i5 >> 3) & 14, 48, 62968);
                f530 m2 = ljs0.m(c530Var, counterSize3.getHeight() / 2.0f);
                if (!z2) {
                    f = 0.25f;
                }
                s3b1.c(new cuj0(wzg0.ic_delivery_counter_plus, ohb1.e(btsVar2, vzh0.plus_content_description), bool, null, 24), tra1.b(m2, f), z2, null, false, x4c.z, slsVar, btsVar2, ((i5 >> 9) & 896) | 221184 | ((i5 << 12) & 3670016), 8);
                btsVar2.t(true);
                btsVar = btsVar2;
                j4 = j7;
                j3 = j6;
                counterSize2 = counterSize3;
                f530Var2 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ize
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i | 1);
                        rsb1.a(f530.this, str, slsVar, slsVar2, z, z2, j4, j3, counterSize2, (fid) obj, O, i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        i3 |= i8;
        i4 = i3;
        if (btsVar2.V(i4 & 1, (38347923 & i3) == 38347922)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(d360 d360Var, wls wlsVar, fid fidVar, int i) {
        int i2;
        d360 d360Var2;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(725653006);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(d360Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            d360Var2 = d360Var;
            wlsVar2 = wlsVar;
            zsb1.d(null, d360Var2, false, false, wlsVar2, btsVar, ((i2 << 3) & 112) | 390 | ((i2 << 9) & HProv.ALG_CLASS_ALL), 8);
        } else {
            d360Var2 = d360Var;
            wlsVar2 = wlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(d360Var2, wlsVar2, i, 27);
        }
    }

    public static final String c(Calendar calendar) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendar.getTime());
    }

    public static final Calendar d(Calendar calendar, int i, int i2) {
        Calendar a2 = wf7.a(calendar);
        a2.set(11, i);
        a2.set(12, i2);
        a2.set(13, 0);
        a2.set(14, 0);
        return a2;
    }
}
