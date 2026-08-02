package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.rida.bids.ui.c;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class ya2 implements wls {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ya2(gq5 gq5Var, boolean z, tx40 tx40Var, wg6 wg6Var, f530 f530Var, tls tlsVar, int i) {
        this.w = gq5Var;
        this.b = z;
        this.x = tx40Var;
        this.y = wg6Var;
        this.c = f530Var;
        this.z = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Throwable th;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.c;
        Object obj6 = this.x;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                za2.b((wls) obj7, (sls) obj6, (f530) obj5, this.b, (jl10) obj4, (j690) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                c.c((gq5) obj7, this.b, (tx40) obj6, (wg6) obj4, (f530) obj5, (tls) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                a.b((f530) obj5, (String) obj7, (String) obj6, this.b, (String) obj4, (String) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a.e((String) obj7, (List) obj6, (List) obj5, (v990) obj4, this.b, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                f530 f530Var = (f530) obj5;
                ButtonSize buttonSize = (ButtonSize) obj7;
                byk0 byk0Var = (byk0) obj4;
                sls slsVar = (sls) obj6;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 a = ljs0.a(f530Var, buttonSize.getSize(), buttonSize.getSize());
                    boolean z = this.b;
                    f530 d = q791.d(ymb1.l(m4m0.a(q6a1.c(a, z), new ze60(), byk0Var, 4), byk0Var), z, null, new awk0(0), slsVar, 10);
                    z910 d2 = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, d);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d2);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d3);
                    aVar.invoke(cj6.a, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                yn91.f((f530) obj5, this.b, (ButtonSize) obj7, (ButtonForm) obj4, (sls) obj6, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(196609));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.d.b((zqv0) obj7, (f530) obj5, this.b, (tls) obj6, (tls) obj4, (tpr) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                x3z0 x3z0Var = (x3z0) obj7;
                tls tlsVar = (tls) obj6;
                oz40 oz40Var = (oz40) obj5;
                oz40 oz40Var2 = (oz40) obj4;
                oz40 oz40Var3 = (oz40) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = new uny0(1, oz40Var);
                        btsVar2.o0(Q);
                    }
                    tls tlsVar2 = (tls) Q;
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = new uny0(2, oz40Var2);
                        btsVar2.o0(Q2);
                    }
                    boolean z2 = this.b;
                    ru.yandex.taxi.communications.ticket.ui.a.c(null, x3z0Var, z2, tlsVar2, (tls) Q2, btsVar2, 27648);
                    TicketMode ticketMode = x3z0Var.m;
                    TicketMode ticketMode2 = TicketMode.TICKET;
                    c530 c530Var = c530.a;
                    if (ticketMode == ticketMode2) {
                        btsVar2.e0(1733549483);
                        th = null;
                        xab1.a(ljs0.c(c530Var, 1.0f), null, wwg.S(-772987712, true, new my8(z2, x3z0Var, 14), btsVar2), btsVar2, 3078, 6);
                        btsVar2.t(false);
                    } else {
                        th = null;
                        btsVar2.e0(1733956947);
                        btsVar2.t(false);
                    }
                    ru.yandex.taxi.communications.ticket.ui.a.a(null, x3z0Var, ((Boolean) oz40Var3.getValue()).booleanValue(), tlsVar, btsVar2, 0);
                    f530 e = n.e(c530Var, 12.0f, btsVar2, c530Var, 1.0f);
                    lhl0 a2 = khl0.a(lr20.h, x4c.D, btsVar2, 6);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d4 = b.d(btsVar2, e);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw th;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar3);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a2);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d4);
                    Object Q3 = btsVar2.Q();
                    if (Q3 == o430Var) {
                        Q3 = f.j(new y7m(56.0f));
                        btsVar2.o0(Q3);
                    }
                    oz40 oz40Var4 = (oz40) Q3;
                    boolean k = btsVar2.k(tlsVar);
                    Object Q4 = btsVar2.Q();
                    if (k || Q4 == o430Var) {
                        Q4 = new lao0(25, tlsVar);
                        btsVar2.o0(Q4);
                    }
                    sls slsVar4 = (sls) Q4;
                    float f = ((y7m) oz40Var4.getValue()).a;
                    Object Q5 = btsVar2.Q();
                    if (Q5 == o430Var) {
                        Q5 = new rsm(oz40Var4, oz40Var3, 2);
                        btsVar2.o0(Q5);
                    }
                    dpb1.b(null, slsVar4, f, (sls) Q5, btsVar2, HProv.ALG_TYPE_SECURECHANNEL);
                    n.y(btsVar2, true, c530Var, 12.0f, btsVar2);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ ya2(wls wlsVar, sls slsVar, f530 f530Var, boolean z, jl10 jl10Var, j690 j690Var, int i) {
        this.w = wlsVar;
        this.x = slsVar;
        this.c = f530Var;
        this.b = z;
        this.y = jl10Var;
        this.z = j690Var;
    }

    public /* synthetic */ ya2(f530 f530Var, ButtonSize buttonSize, boolean z, byk0 byk0Var, sls slsVar, androidx.compose.runtime.internal.a aVar) {
        this.c = f530Var;
        this.w = buttonSize;
        this.b = z;
        this.y = byk0Var;
        this.x = slsVar;
        this.z = aVar;
    }

    public /* synthetic */ ya2(f530 f530Var, String str, String str2, boolean z, String str3, String str4, int i) {
        this.c = f530Var;
        this.w = str;
        this.x = str2;
        this.b = z;
        this.y = str3;
        this.z = str4;
    }

    public /* synthetic */ ya2(f530 f530Var, boolean z, ButtonSize buttonSize, ButtonForm buttonForm, sls slsVar, androidx.compose.runtime.internal.a aVar, int i) {
        this.c = f530Var;
        this.b = z;
        this.w = buttonSize;
        this.y = buttonForm;
        this.x = slsVar;
        this.z = aVar;
    }

    public /* synthetic */ ya2(zqv0 zqv0Var, f530 f530Var, boolean z, tls tlsVar, tls tlsVar2, tpr tprVar, int i) {
        this.w = zqv0Var;
        this.c = f530Var;
        this.b = z;
        this.x = tlsVar;
        this.y = tlsVar2;
        this.z = tprVar;
    }

    public /* synthetic */ ya2(x3z0 x3z0Var, boolean z, tls tlsVar, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3) {
        this.w = x3z0Var;
        this.b = z;
        this.x = tlsVar;
        this.c = oz40Var;
        this.y = oz40Var2;
        this.z = oz40Var3;
    }

    public /* synthetic */ ya2(String str, List list, List list2, v990 v990Var, boolean z, tls tlsVar, int i) {
        this.w = str;
        this.x = list;
        this.c = list2;
        this.y = v990Var;
        this.b = z;
        this.z = tlsVar;
    }
}
