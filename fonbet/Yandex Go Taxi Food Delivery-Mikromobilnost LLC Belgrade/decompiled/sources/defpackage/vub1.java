package defpackage;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class vub1 {
    public static final void a(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1007970033);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            qje.W(btsVar, d.f, jk11.a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nnm.p(6, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2z0(i, 24, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(a aVar, a aVar2, f530 f530Var, float f, to5 to5Var, to5 to5Var2, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        float f2;
        int i5;
        to5 to5Var3;
        int i6;
        to5 to5Var4;
        f530 f530Var3;
        aii0 v;
        to5 to5Var5 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-483954179);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(aVar2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                f2 = f;
                i3 |= btsVar.b(f2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    to5Var3 = to5Var;
                    i3 |= btsVar.k(to5Var3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                        to5Var4 = to5Var2;
                    } else {
                        to5Var4 = to5Var2;
                        if ((i & ImageMetadata.EDGE_MODE) == 0) {
                            i3 |= btsVar.k(to5Var4) ? 131072 : 65536;
                        }
                    }
                    if (btsVar.V(i3 & 1, (i3 & 74899) == 74898)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                    } else {
                        f530Var3 = i7 != 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            f2 = 0.0f;
                        }
                        if (i5 != 0) {
                            to5Var3 = to5Var5;
                        }
                        if (i6 != 0) {
                            to5Var4 = to5Var5;
                        }
                        boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
                        Object Q = btsVar.Q();
                        if (z || Q == did.a) {
                            Q = new lk11(f2, to5Var3, to5Var4);
                            btsVar.o0(Q);
                        }
                        z910 z910Var = (z910) Q;
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d = b.d(btsVar, f530Var3);
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
                        qje.W(btsVar, d.f, z910Var);
                        qje.W(btsVar, d.e, o);
                        qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar, d.h);
                        qje.W(btsVar, d.d, d);
                        a(wwg.S(1115787650, true, new k2z0(aVar, 22), btsVar), btsVar, 6);
                        a(wwg.S(1450098283, true, new k2z0(aVar2, 23), btsVar), btsVar, 6);
                        btsVar.t(true);
                    }
                    float f3 = f2;
                    to5 to5Var6 = to5Var4;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new w901(aVar, aVar2, f530Var3, f3, to5Var3, to5Var6, i, i2);
                        return;
                    }
                    return;
                }
                to5Var3 = to5Var;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if (btsVar.V(i3 & 1, (i3 & 74899) == 74898)) {
                }
                float f32 = f2;
                to5 to5Var62 = to5Var4;
                v = btsVar.v();
                if (v == null) {
                }
            }
            f2 = f;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            to5Var3 = to5Var;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 74899) == 74898)) {
            }
            float f322 = f2;
            to5 to5Var622 = to5Var4;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        to5Var3 = to5Var;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 74899) == 74898)) {
        }
        float f3222 = f2;
        to5 to5Var6222 = to5Var4;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final ArrayList c(String str, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof snr0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            snr0 snr0Var = (snr0) next;
            if (snr0Var.f && jl40.l(snr0Var.c.getTypeId(), str)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static a2g d(jkt jktVar, ViewGroup viewGroup) {
        jktVar.getClass();
        viewGroup.getClass();
        a2g a2gVar = new a2g();
        a2gVar.b = n3w.a(viewGroup);
        int i = 4;
        z1g z1gVar = new z1g(jktVar, i);
        z1g z1gVar2 = new z1g(jktVar, 0);
        int i2 = 13;
        int i3 = 3;
        npe0 npe0Var = new npe0(new z1g(jktVar, i2), new z1g(jktVar, 9), new qsn(new abx0(new abx0(new z1g(jktVar, 6), i), i3), 25), i2);
        jpf0 jpf0Var = new jpf0((xvf0) new z1g(jktVar, 10), (xvf0) npe0Var, 16);
        z1g z1gVar3 = new z1g(jktVar, 18);
        z1g z1gVar4 = new z1g(jktVar, 7);
        z1g z1gVar5 = new z1g(jktVar, 14);
        mg11 mg11Var = new mg11(z1gVar, new uw11(z1gVar2, npe0Var, jpf0Var, z1gVar3, z1gVar4, z1gVar5), 15);
        z1g z1gVar6 = new z1g(jktVar, 8);
        z1g z1gVar7 = new z1g(jktVar, 1);
        z1g z1gVar8 = new z1g(jktVar, 2);
        z1g z1gVar9 = new z1g(jktVar, 12);
        z1g z1gVar10 = new z1g(jktVar, i3);
        z1g z1gVar11 = new z1g(jktVar, 11);
        z1g z1gVar12 = new z1g(jktVar, 16);
        z1g z1gVar13 = new z1g(jktVar, 5);
        int i4 = 26;
        a2gVar.a = i5m.b(new c4p((Object) a2gVar.b, (xvf0) new c4p((Object) n3w.a(new sjj0(new q6c0(i4, z1gVar, new tgb0((xvf0) z1gVar, (xvf0) new ys10((xvf0) mg11Var, (xvf0) new xea((xvf0) z1gVar, (xvf0) z1gVar6, (xvf0) z1gVar7, (xvf0) new px4(z1gVar2, z1gVar8, z1gVar9, jpf0Var, z1gVar10, z1gVar3, new axy((xvf0) z1gVar11, (xvf0) z1gVar12, (xvf0) new vrt0(z1gVar13, 23), (xvf0) new q720(z1gVar13, 27), (xvf0) new q720(z1gVar13, i4), 23), new z1g(jktVar, 15), z1gVar5, z1gVar4, 1), 21, false), 22), (xvf0) new n7i0(z1gVar2, z1gVar3, 5), 29, (byte) 0), z1gVar3))), (xvf0) new xat(new z1g(jktVar, 17), 6), 28), 29));
        return a2gVar;
    }
}
