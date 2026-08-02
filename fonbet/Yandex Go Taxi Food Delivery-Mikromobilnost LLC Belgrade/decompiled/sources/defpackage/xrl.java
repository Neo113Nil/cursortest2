package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.communications.ticket.ui.component.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class xrl implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ xrl(float f, int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.w = obj;
        this.b = f;
        this.x = obj2;
        this.y = obj3;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        int i2 = this.c;
        Object obj3 = this.y;
        Object obj4 = this.w;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yrl.a((f530) obj4, this.b, (wp2) obj5, (qor) obj3, (fid) obj, vng.O(1 | i2));
                return zy11Var;
            case 1:
                byk0 byk0Var = (byk0) obj4;
                bms bmsVar = (bms) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 2;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    c530 c530Var = c530.a;
                    f530 k = m4m0.b(kp50.F(ymb1.l(c530Var, byk0Var), new kj6(z, i3)), ((ldc) btsVar.m(k2z.b)).a, qke.q).k(an91.o(c530Var, 0.0f, 0.0f, 0.0f, this.b, 7));
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k);
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
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    if (obj5 != null) {
                        btsVar.e0(-1840473903);
                        bmsVar.invoke(cj6.a, obj5, btsVar, Integer.valueOf((((i2 >> 3) & 8) << 3) | 6));
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1840421048);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).intValue();
                wkb1.f((v611) obj5, (f530) obj4, this.b, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
            default:
                ((Integer) obj2).intValue();
                c.a((TicketTopAsset) obj5, (f530) obj4, this.b, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                return zy11Var;
        }
    }

    public /* synthetic */ xrl(Object obj, f530 f530Var, float f, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.x = obj;
        this.w = f530Var;
        this.b = f;
        this.y = cmsVar;
        this.c = i;
    }
}
