package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.ui.c;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.communications.ticket.ui.component.TicketCardType;

/* loaded from: classes11.dex */
public final /* synthetic */ class xp5 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ xp5(gq5 gq5Var, boolean z, tx40 tx40Var, tls tlsVar) {
        this.c = gq5Var;
        this.b = z;
        this.w = tx40Var;
        this.x = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = this.b;
        o430 o430Var = did.a;
        int i2 = 18;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.w;
        Object obj5 = this.x;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                gq5 gq5Var = (gq5) obj6;
                tx40 tx40Var = (tx40) obj4;
                tls tlsVar = (tls) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    c.h(gq5Var, this.b, tx40Var, null, tlsVar, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                byk0 byk0Var = (byk0) obj6;
                f530 f530Var = (f530) obj4;
                a aVar = (a) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 f530Var2 = c530.a;
                    if (z) {
                        btsVar2.e0(49223185);
                        f530Var2 = bzk0.c(hbb1.c(f530Var2, dbb1.b(btsVar2), false, 24.0f, null, 10), AppColor$Palette.Background, byk0Var);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(49345139);
                        btsVar2.t(false);
                    }
                    f530 k = f530Var2.k(f530Var);
                    Object Q = btsVar2.Q();
                    if (Q == o430Var) {
                        Q = a12.j;
                        btsVar2.o0(Q);
                    }
                    f530 a = exw0.a(k, zy11Var, (PointerInputEventHandler) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
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
                    nnm.p(0, aVar, btsVar2, true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                String str = (String) obj6;
                sls slsVar2 = (sls) obj4;
                a37 a37Var = (a37) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    oad.a.getClass();
                    web1.c(null, 56.0f, false, 0.0f, null, oad.b, wwg.S(-1138456054, true, new fzv(str, 20), btsVar3), null, null, wwg.S(-1101460851, true, new mr1(slsVar2, z, a37Var, i2), btsVar3), null, null, false, btsVar3, 807075840, 0, 7581);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                x3z0 x3z0Var = (x3z0) obj6;
                tls tlsVar2 = (tls) obj5;
                tls tlsVar3 = (tls) obj4;
                dj6 dj6Var = (dj6) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(dj6Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Object Q2 = btsVar4.Q();
                    if (Q2 == o430Var) {
                        Q2 = f.j(Boolean.FALSE);
                        btsVar4.o0(Q2);
                    }
                    oz40 oz40Var = (oz40) Q2;
                    Object Q3 = btsVar4.Q();
                    if (Q3 == o430Var) {
                        Q3 = f.j(Boolean.FALSE);
                        btsVar4.o0(Q3);
                    }
                    oz40 oz40Var2 = (oz40) Q3;
                    float d3 = dj6Var.d();
                    boolean b = btsVar4.b(d3);
                    Object Q4 = btsVar4.Q();
                    if (b || Q4 == o430Var) {
                        Q4 = ly3.h(0.4587156f * d3, btsVar4);
                    }
                    float f = ((y7m) Q4).a;
                    TicketMode ticketMode = x3z0Var.m;
                    iqx iqxVar = x3z0Var.j;
                    boolean b2 = btsVar4.b(d3) | btsVar4.b(f) | btsVar4.c(ticketMode.ordinal());
                    Object Q5 = btsVar4.Q();
                    if (b2 || Q5 == o430Var) {
                        Q5 = ly3.h(ticketMode == TicketMode.ROUNDED_CARD ? f : d3 * 0.6116208f, btsVar4);
                    }
                    float f2 = ((y7m) Q5).a;
                    c530 c530Var = c530.a;
                    f530 e = ljs0.e(c530Var, f);
                    uo5 uo5Var = x4c.B;
                    cj6 cj6Var = cj6.a;
                    f530 a2 = cj6Var.a(e, uo5Var);
                    boolean k2 = btsVar4.k(tlsVar2) | btsVar4.k(tlsVar3);
                    Object Q6 = btsVar4.Q();
                    if (k2 || Q6 == o430Var) {
                        Q6 = new wnf0(tlsVar2, tlsVar3, 6);
                        btsVar4.o0(Q6);
                    }
                    epb1.b(eja1.y(a2, (tls) Q6), tje.n(x3z0Var.g, btsVar4), TicketCardType.TopCard, x3z0Var.m, wwg.S(1759700744, true, new r2z0(x3z0Var, this.b, oz40Var2, oz40Var, 0), btsVar4), btsVar4, 24960);
                    if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                        tse0.s(btsVar4, -958370548, c530Var, f2, btsVar4);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-958277393);
                        TicketTopAsset ticketTopAsset = x3z0Var.d;
                        f530 c = ljs0.c(c530Var, 1.0f);
                        TicketMode ticketMode2 = TicketMode.ROUNDED_CARD;
                        float f3 = ticketMode == ticketMode2 ? 24.0f : 0.0f;
                        float f4 = ticketMode == ticketMode2 ? 24.0f : 0.0f;
                        TicketMode ticketMode3 = TicketMode.TICKET;
                        byk0 d4 = cyk0.d(f3, f4, ticketMode == ticketMode3 ? 24.0f : 0.0f, ticketMode == ticketMode3 ? 24.0f : 0.0f);
                        Object Q7 = btsVar4.Q();
                        if (Q7 == o430Var) {
                            Q7 = new w01(27, oz40Var);
                            btsVar4.o0(Q7);
                        }
                        ru.yandex.taxi.communications.ticket.ui.component.c.b(c, ticketTopAsset, f2, d4, (sls) Q7, btsVar4, 24582);
                        btsVar4.t(false);
                    }
                    if (((Boolean) oz40Var2.getValue()).booleanValue() || iqxVar == null) {
                        btsVar4.e0(-957468820);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-957661020);
                        f530 k3 = an91.k(cj6Var.a(c530Var, x4c.C), 12.0f);
                        Object Q8 = btsVar4.Q();
                        if (Q8 == o430Var) {
                            Q8 = new w01(28, oz40Var2);
                            btsVar4.o0(Q8);
                        }
                        gpb1.e(k3, iqxVar, (sls) Q8, btsVar4, 384);
                        btsVar4.t(false);
                    }
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ xp5(x3z0 x3z0Var, tls tlsVar, tls tlsVar2, boolean z) {
        this.c = x3z0Var;
        this.x = tlsVar;
        this.w = tlsVar2;
        this.b = z;
    }

    public /* synthetic */ xp5(String str, sls slsVar, boolean z, a37 a37Var) {
        this.c = str;
        this.w = slsVar;
        this.b = z;
        this.x = a37Var;
    }

    public /* synthetic */ xp5(boolean z, byk0 byk0Var, f530 f530Var, a aVar) {
        this.b = z;
        this.c = byk0Var;
        this.w = f530Var;
        this.x = aVar;
    }
}
