package ru.yandex.taxi.logistics.safe_flow;

import android.content.Context;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.mni;
import defpackage.pav;
import defpackage.qqo;
import defpackage.s8u0;
import defpackage.sni;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tni;
import defpackage.tse;
import defpackage.vx0;
import defpackage.wiq0;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class a {
    public final tj60 a;
    public final tni b;
    public final mni c;
    public final wiq0 d;

    public a(tj60 tj60Var, tni tniVar, mni mniVar, wiq0 wiq0Var) {
        this.a = tj60Var;
        this.b = tniVar;
        this.c = mniVar;
        this.d = wiq0Var;
    }

    public final void a(tse tseVar) {
        tje.N(tseVar, null, null, new DeliverySafeFlowNotificationRouter$attach$1(this, null), 3);
    }

    public final void b(String str) {
        Object obj;
        tj60 tj60Var = this.a;
        if (tj60Var.a(DeliverySafeFlowNotification.NOTIFICATION_ID) != null) {
            tj60Var.c(DeliverySafeFlowNotification.NOTIFICATION_ID);
        }
        tni tniVar = this.b;
        qqo qqoVar = tniVar.a;
        qqo qqoVar2 = tniVar.a;
        s8u0 s8u0Var = null;
        if (((sni) qqoVar.b()).b) {
            if (str == null) {
                str = ((sni) qqoVar2.b()).e;
            }
            Iterator it = ((sni) qqoVar2.b()).d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((sni.a) obj).a, str)) {
                        break;
                    }
                }
            }
            sni.a aVar = (sni.a) obj;
            if (aVar != null) {
                s8u0Var = new s8u0(aVar.a, d6z.Y((sni) qqoVar2.b(), aVar.b), aVar.c);
            }
        }
        if (s8u0Var == null) {
            return;
        }
        String str2 = s8u0Var.b;
        String str3 = s8u0Var.c;
        vx0 vx0Var = this.c.a;
        tj60Var.e(new DeliverySafeFlowNotification((Context) vx0Var.a.get(), (pav) vx0Var.b.get(), (k7x0) vx0Var.c.get(), str2, str3));
    }
}
