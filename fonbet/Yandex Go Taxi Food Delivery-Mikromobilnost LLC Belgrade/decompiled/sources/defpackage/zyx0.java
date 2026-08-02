package defpackage;

import android.app.Activity;
import com.yandex.go.taxi.order.chat.domain.a;
import com.yandex.go.taxi.order.chat.experiments.RideWebMessengerEnabledExperiment;
import com.yandex.go.taxi.order.chat.experiments.b;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class zyx0 extends h55 {
    public final ah00 D;
    public final izx0 E;
    public final s350 F;
    public final b G;

    public zyx0(ah00 ah00Var, izx0 izx0Var, s350 s350Var, b bVar) {
        super(null);
        this.D = ah00Var;
        this.E = izx0Var;
        this.F = s350Var;
        this.G = bVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        String str;
        yyx0 yyx0Var = (yyx0) obj;
        TaxiOrder b = yyx0Var.a.b();
        OrderStatusInfo V = b.V();
        int i = 2;
        if (V.R && (str = V.q0) != null && str.length() != 0 && (((Boolean) this.F.a.c()).booleanValue() || ((RideWebMessengerEnabledExperiment) this.G.a.c()).b)) {
            r(new t480(b, i));
            return;
        }
        boolean z = yyx0Var.b;
        jhu0 jhu0Var = new jhu0(this);
        izx0 izx0Var = this.E;
        kv1 kv1Var = izx0Var.a;
        kv1Var.getClass();
        n3w a = n3w.a(b);
        zag zagVar = new zag(kv1Var, 4);
        zag zagVar2 = new zag(kv1Var, 1);
        zag zagVar3 = new zag(kv1Var, 2);
        zag zagVar4 = new zag(kv1Var, 3);
        zag zagVar5 = new zag(kv1Var, 0);
        g6 g6Var = new g6((xvf0) a, (xvf0) zagVar, (xvf0) zagVar2, (xvf0) zagVar3, (xvf0) new pg5(new t4(a, zagVar4, new p4((Object) new xj7(zagVar5, 0), (xvf0) new xj7(zagVar5, 1), 27), new kk(a, 8), 15), 21), 15);
        Activity activity = (Activity) kv1Var.d;
        q5z.h(activity);
        a aVar = (a) kv1Var.r;
        q5z.h(aVar);
        zuj0 zuj0Var = (zuj0) kv1Var.g;
        q5z.h(zuj0Var);
        fzx0 fzx0Var = (fzx0) kv1Var.q;
        q5z.h(fzx0Var);
        ss21 ss21Var = (ss21) kv1Var.a;
        q5z.h(ss21Var);
        pho phoVar = (pho) kv1Var.o;
        q5z.h(phoVar);
        pj pjVar = new pj(phoVar);
        yh70 yh70Var = new yh70(phoVar);
        ysg ysgVar = (ysg) kv1Var.l;
        q5z.h(ysgVar);
        a980 a980Var = (a980) kv1Var.c;
        q5z.h(a980Var);
        pg7 pg7Var = (pg7) kv1Var.j;
        q5z.h(pg7Var);
        hg7 hg7Var = (hg7) kv1Var.m;
        q5z.h(hg7Var);
        oep0 oep0Var = (oep0) kv1Var.t;
        q5z.h(oep0Var);
        s7h s7hVar = (s7h) kv1Var.n;
        q5z.h(s7hVar);
        p2y0 p2y0Var = (p2y0) kv1Var.s;
        q5z.h(p2y0Var);
        com.yandex.go.taxi.order.chat.ui.chat.a aVar2 = new com.yandex.go.taxi.order.chat.ui.chat.a(b, aVar, zuj0Var, fzx0Var, ss21Var, pjVar, yh70Var, ysgVar, a980Var, pg7Var, hg7Var, g6Var, oep0Var, s7hVar, p2y0Var);
        tse tseVar = (tse) kv1Var.f;
        q5z.h(tseVar);
        tt2 tt2Var = (tt2) kv1Var.b;
        q5z.h(tt2Var);
        gs10 gs10Var = new gs10(tseVar, tt2Var);
        ney neyVar = (ney) kv1Var.e;
        q5z.h(neyVar);
        rs2 rs2Var = (rs2) kv1Var.k;
        q5z.h(rs2Var);
        pav pavVar = (pav) kv1Var.u;
        q5z.h(pavVar);
        TaxiOrderChatModalView taxiOrderChatModalView = new TaxiOrderChatModalView(activity, aVar2, gs10Var, neyVar, rs2Var, pavVar);
        izx0Var.d = taxiOrderChatModalView;
        taxiOrderChatModalView.setShowKeyboard(z);
        taxiOrderChatModalView.setOnAppearingListener(new ou4(12, jhu0Var, izx0Var));
        pj pjVar2 = izx0Var.c;
        pjVar2.getClass();
        pjVar2.a.a("Chat.Open", new HashMap(), 1, new HashMap());
        izx0Var.b.k(taxiOrderChatModalView, 0.0f, true);
    }
}
