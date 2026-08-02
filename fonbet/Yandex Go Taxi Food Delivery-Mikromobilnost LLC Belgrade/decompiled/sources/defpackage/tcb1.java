package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class tcb1 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, qiy qiyVar, ehr0 ehr0Var, jt1 jt1Var, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        ehr0 ehr0Var2;
        int i4;
        int i5;
        jt1 jt1Var2;
        int i6;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2048108797);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i3 | (btsVar.k(qiyVar) ? 32 : 16);
        if ((i2 & 4) == 0) {
            ehr0Var2 = ehr0Var;
            if (btsVar.k(ehr0Var2)) {
                i4 = 256;
                int i8 = i7 | i4;
                i5 = i2 & 8;
                if (i5 == 0) {
                    i6 = i8 | HProv.ALG_TYPE_SECURECHANNEL;
                    jt1Var2 = jt1Var;
                } else {
                    jt1Var2 = jt1Var;
                    i6 = i8 | (btsVar.k(jt1Var2) ? 2048 : 1024);
                }
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i6 |= btsVar.e(zlsVar) ? 16384 : 8192;
                }
                if (btsVar.V(i6 & 1, (i6 & 9363) == 9362)) {
                    btsVar.Y();
                } else {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        if ((i2 & 4) != 0) {
                            ehr0Var2 = ((YandexShapes) btsVar.m(qm51.a)).b();
                            i6 &= -897;
                        }
                        if (i5 != 0) {
                            jt1Var2 = x4c.y;
                        }
                    } else {
                        btsVar.Y();
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                        }
                    }
                    btsVar.u();
                    f530 l = ymb1.l(m4m0.a(f530Var, qiyVar, ehr0Var2, 4), ehr0Var2);
                    int i9 = ((i6 >> 3) & 7168) | ((i6 >> 6) & 112);
                    z910 d = pi6.d(jt1Var2, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, l);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    ly3.x(((i9 >> 6) & 112) | 6, zlsVar, cj6.a, btsVar, true);
                }
                ehr0 ehr0Var3 = ehr0Var2;
                jt1 jt1Var3 = jt1Var2;
                v = btsVar.v();
                if (v == null) {
                    v.d = new xg0(f530Var, qiyVar, ehr0Var3, jt1Var3, zlsVar, i, i2, 15);
                    return;
                }
                return;
            }
        } else {
            ehr0Var2 = ehr0Var;
        }
        i4 = 128;
        int i82 = i7 | i4;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i6 & 1, (i6 & 9363) == 9362)) {
        }
        ehr0 ehr0Var32 = ehr0Var2;
        jt1 jt1Var32 = jt1Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final f530 f530Var, long j, ehr0 ehr0Var, jt1 jt1Var, zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        long j2;
        ehr0 ehr0Var2;
        jt1 jt1Var2;
        int i4;
        zls zlsVar2;
        aii0 v;
        int i5;
        int i6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-434862220);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (btsVar.d(j2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j2 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ehr0Var2 = ehr0Var;
                if (btsVar.k(ehr0Var2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                ehr0Var2 = ehr0Var;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            ehr0Var2 = ehr0Var;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            jt1Var2 = jt1Var;
            i3 |= btsVar.k(jt1Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                zlsVar2 = zlsVar;
                i3 |= btsVar.e(zlsVar2) ? 16384 : 8192;
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        if ((i2 & 2) != 0) {
                            j2 = ((el51) btsVar.m(gl51.a)).g();
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            ehr0Var2 = ((YandexShapes) btsVar.m(qm51.a)).b();
                            i3 &= -897;
                        }
                        if (i7 != 0) {
                            jt1Var2 = x4c.y;
                        }
                        if (i4 != 0) {
                            hdd.a.getClass();
                            zlsVar2 = hdd.b;
                        }
                    } else {
                        btsVar.Y();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    btsVar.u();
                    f530 l = ymb1.l(m4m0.b(f530Var, j2, ehr0Var2), ehr0Var2);
                    int i8 = ((i3 >> 3) & 7168) | ((i3 >> 6) & 112);
                    z910 d = pi6.d(jt1Var2, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, l);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    ly3.x(((i8 >> 6) & 112) | 6, zlsVar2, cj6.a, btsVar, true);
                } else {
                    btsVar.Y();
                }
                final long j3 = j2;
                final ehr0 ehr0Var3 = ehr0Var2;
                final jt1 jt1Var3 = jt1Var2;
                final zls zlsVar3 = zlsVar2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: d0s0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            tcb1.b(f530.this, j3, ehr0Var3, jt1Var3, zlsVar3, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            zlsVar2 = zlsVar;
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            final long j32 = j2;
            final ehr0 ehr0Var32 = ehr0Var2;
            final jt1 jt1Var32 = jt1Var2;
            final zls zlsVar32 = zlsVar2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        jt1Var2 = jt1Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        zlsVar2 = zlsVar;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        final long j322 = j2;
        final ehr0 ehr0Var322 = ehr0Var2;
        final jt1 jt1Var322 = jt1Var2;
        final zls zlsVar322 = zlsVar2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final float c(ButtonSize buttonSize, fid fidVar) {
        xw91 xw91Var = ((nx2) ((bts) fidVar).m(uy2.c)).b;
        int i = s17.a[buttonSize.ordinal()];
        if (i == 1 || i == 2) {
            return 16.0f;
        }
        if (i == 3) {
            return 13.0f;
        }
        if (i == 4) {
            return 10.0f;
        }
        w511.b();
        return 0.0f;
    }

    public static final Double d(String str) {
        Double i = str != null ? avu0.i(str) : null;
        if (i == null || evu0.y(str, "e", false) || evu0.y(str, "E", false) || Double.isInfinite(i.doubleValue()) || Double.isNaN(i.doubleValue()) || jl40.h(i, Double.MAX_VALUE) || jl40.h(i, Double.MIN_VALUE)) {
            return null;
        }
        return i;
    }
}
