package ru.yandex.taxi.settings.support;

import com.yandex.go.payments.shared.v;
import com.yandex.go.zone.repository.o;
import defpackage.cda0;
import defpackage.fga0;
import defpackage.fl8;
import defpackage.hor0;
import defpackage.rol0;
import defpackage.zjw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class g {
    public final zjw0 a;
    public final cda0 b;
    public final hor0 c;
    public final ru.yandex.taxi.launch.c d;
    public final o e;

    public g(zjw0 zjw0Var, cda0 cda0Var, hor0 hor0Var, ru.yandex.taxi.launch.c cVar, o oVar) {
        this.a = zjw0Var;
        this.b = cda0Var;
        this.c = hor0Var;
        this.d = cVar;
        this.e = oVar;
    }

    public static boolean c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof fl8) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((fl8) it.next()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        v vVar = this.c.a;
        fga0 fga0Var = vVar.b;
        com.yandex.go.payments.shared.business.c cVar = vVar.m;
        return !vVar.n.a(cVar.b().d.d) && !vVar.i.a().isEmpty() && cVar.b().d.c && fga0Var.b.g().f.a.isEmpty() && fga0Var.b.g().f.b.isEmpty() && !((Boolean) fga0Var.D.getValue()).booleanValue() && vVar.a.g();
    }

    public final f b() {
        return new f(kotlinx.coroutines.flow.e.K(new rol0(new BadgeNotificationsProvider$needToRefreshSharedPaymentNotificationFlow$launchIdFlow$1(this, null)), new b(((com.yandex.go.payments.paymentlist.data.c) this.b).g.D), this.e.s));
    }
}
