package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.h;
import androidx.compose.foundation.gestures.u;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.plus.text.PlusNewSize;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class qtb implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;

    public /* synthetic */ qtb(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.w = obj2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusNewSize plusNewSize;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.c;
        Object obj4 = this.w;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                Integer num = (Integer) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    c.b(str, num, z, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                String str2 = (String) obj5;
                PlusNewType plusNewType = (PlusNewType) obj4;
                yl4 yl4Var = (yl4) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(yl4Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int i2 = n6d0.a[((BadgeSize) yl4Var.a.getValue()).ordinal()];
                    if (i2 == 1) {
                        plusNewSize = PlusNewSize.Caption1;
                    } else if (i2 == 2) {
                        plusNewSize = PlusNewSize.Caption1Bold;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        plusNewSize = PlusNewSize.Caption2;
                    }
                    mq91.a(str2, null, plusNewSize, plusNewType, this.c, btsVar2, 0, 2);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                xss0 xss0Var = (xss0) obj5;
                tls tlsVar = (tls) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    wdb1.b(ibp0Var, xss0Var.c, !z, tlsVar, btsVar3, intValue3 & 14);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                yny0 yny0Var = (yny0) obj5;
                oz40 oz40Var = yny0Var.f;
                zx40 zx40Var = (zx40) obj4;
                ((Integer) obj3).getClass();
                bts btsVar4 = (bts) ((fid) obj2);
                btsVar4.e0(-2137546592);
                boolean z2 = ((Orientation) oz40Var.getValue()) == Orientation.Vertical || !(btsVar4.m(j.n) == LayoutDirection.Rtl);
                boolean k = btsVar4.k(yny0Var);
                Object Q = btsVar4.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new s5w0(28, yny0Var);
                    btsVar4.o0(Q);
                }
                oz40 n = f.n((tls) Q, btsVar4);
                Object Q2 = btsVar4.Q();
                if (Q2 == o430Var) {
                    h hVar = new h(new ttm(21, n));
                    btsVar4.o0(hVar);
                    Q2 = hVar;
                }
                wkp0 wkp0Var = (wkp0) Q2;
                boolean k2 = btsVar4.k(wkp0Var) | btsVar4.k(yny0Var);
                Object Q3 = btsVar4.Q();
                if (k2 || Q3 == o430Var) {
                    Q3 = new xny0(wkp0Var, yny0Var);
                    btsVar4.o0(Q3);
                }
                f530 b = u.b((xny0) Q3, (Orientation) oz40Var.getValue(), z && yny0Var.b.getFloatValue() != 0.0f, z2, zx40Var);
                btsVar4.t(false);
                return b;
            default:
                r3z0 r3z0Var = (r3z0) obj5;
                u2z0 u2z0Var = r3z0Var.b;
                oz40 oz40Var2 = (oz40) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (!btsVar5.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar5.Y();
                } else if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                    btsVar5.e0(1105293215);
                    sic a = qic.a(lr20.c, x4c.H, btsVar5, 48);
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o = btsVar5.o();
                    f530 d = b.d(btsVar5, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, a);
                    qje.W(btsVar5, d.e, o);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d);
                    ety0 ety0Var = xya1.d(btsVar5).g.a;
                    u2z0 u2z0Var2 = r3z0Var.a;
                    jeb1.f(u2z0Var2.a, null, u2z0Var2.b, nwa1.i(ety0Var.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar5, 0, 0, 16370);
                    ety0 ety0Var2 = xya1.d(btsVar5).h.a;
                    jeb1.f(r3z0Var.c, null, new up2(ldc.b(tje.n(u2z0Var2.b, btsVar5), 0.5f, 0.0f, 0.0f, 0.0f, 14)), nwa1.i(ety0Var2.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar5, 0, 0, 16370);
                    btsVar5.t(true);
                    btsVar5.t(false);
                } else {
                    btsVar5.e0(1105994621);
                    ety0 ety0Var3 = xya1.d(btsVar5).h.a;
                    jeb1.f(u2z0Var.a, null, u2z0Var.b, nwa1.i(ety0Var3.a.b, z), 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var3, btsVar5, 0, 0, 16370);
                    btsVar5.t(false);
                }
                return zy11Var;
        }
    }

    public /* synthetic */ qtb(String str, boolean z, int i, Object obj) {
        this.a = i;
        this.b = str;
        this.w = obj;
        this.c = z;
    }
}
