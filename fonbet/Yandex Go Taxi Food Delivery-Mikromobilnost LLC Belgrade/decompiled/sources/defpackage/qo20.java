package defpackage;

import com.yandex.mob.cron.a;
import com.yandex.mob.datastore.d;
import com.yandex.mob.domain.c;
import com.yandex.mob.domain.h;
import com.yandex.mob.domain.i;
import com.yandex.mob.domain.j;
import com.yandex.mob.domain.k;
import com.yandex.mob.domain.l;
import com.yandex.mob.domain.m;
import com.yandex.mob.domain.p;
import com.yandex.mob.domain.q;
import com.yandex.mob.domain.r;
import com.yandex.mob.domain.s;
import com.yandex.mob.domain.t;
import com.yandex.mob.domain.u;
import com.yandex.mob.f;
import com.yandex.mob.model.MobCronJobType;
import com.yandex.mob.okhttp.b;

/* loaded from: classes8.dex */
public final class qo20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo20 b;
    public final /* synthetic */ xo20 c;

    public /* synthetic */ qo20(xo20 xo20Var, yo20 yo20Var, int i) {
        this.a = i;
        this.c = xo20Var;
        this.b = yo20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        Object[] objArr = 0;
        int i2 = 7;
        xo20 xo20Var = this.c;
        yo20 yo20Var = this.b;
        switch (i) {
            case 0:
                MobCronJobType mobCronJobType = MobCronJobType.AvailabilityReportAll;
                npt nptVar = yo20Var.c;
                return new a(mobCronJobType, nptVar, new jb7(i2, MobCronJobType.AvailabilityReport, nptVar, xo20Var.a()), new po20(yo20Var, objArr == true ? 1 : 0), yo20Var.l, yo20Var.k);
            case 1:
                MobCronJobType mobCronJobType2 = MobCronJobType.Notifications;
                npt nptVar2 = yo20Var.c;
                return new a(mobCronJobType2, nptVar2, new jb7(i2, mobCronJobType2, nptVar2, xo20Var.a()), new f(yo20Var), yo20Var.l, yo20Var.k);
            case 2:
                MobCronJobType mobCronJobType3 = MobCronJobType.DetailReport;
                npt nptVar3 = yo20Var.c;
                return new a(mobCronJobType3, nptVar3, new jb7(i2, mobCronJobType3, nptVar3, xo20Var.a()), new po20(yo20Var, 2), yo20Var.l, yo20Var.k);
            case 3:
                return new t((com.yandex.mob.okhttp.a) yo20Var.q.invoke(), (m) xo20Var.b.getValue(), yo20Var.m, yo20Var.A);
            case 4:
                return new com.yandex.mob.domain.a((l) yo20Var.A.invoke(), (d) yo20Var.x.invoke(), (com.yandex.mob.datastore.f) xo20Var.J.getValue(), (un20) xo20Var.c.getValue(), (u00) xo20Var.f.getValue(), (jdr) xo20Var.g.getValue(), (qt1) xo20Var.h.getValue());
            case 5:
                return new c((t) xo20Var.m.getValue(), (com.yandex.mob.datastore.f) xo20Var.J.getValue(), (com.yandex.mob.data.c) yo20Var.B.invoke(), (d) yo20Var.x.invoke(), xo20Var.b(), xo20Var.c(), (l) yo20Var.A.invoke());
            case 6:
                return new com.yandex.mob.domain.d((a) xo20Var.i.getValue(), (a) xo20Var.j.getValue(), (d) yo20Var.x.invoke(), yo20Var.l, (un20) xo20Var.c.getValue(), (com.yandex.mob.domain.a) xo20Var.n.getValue(), (c) xo20Var.o.getValue());
            case 7:
                return new i((com.yandex.mob.okhttp.c) yo20Var.s.invoke(), (com.yandex.mob.a) yo20Var.t.invoke(), (m) xo20Var.b.getValue(), (com.yandex.mob.network.a) xo20Var.x.getValue());
            case 8:
                return new nn20(yo20Var.h, new com.yandex.mob.utils.a(), (i) xo20Var.t.getValue());
            case 9:
                return new com.yandex.mob.network.a((com.yandex.mob.domain.d) xo20Var.p.getValue(), (com.yandex.mob.datastore.f) yo20Var.y.invoke(), (l) yo20Var.A.invoke());
            case 10:
                return new u((b) yo20Var.p.invoke(), (d) yo20Var.x.invoke(), yo20Var.d, (m) xo20Var.b.getValue(), (a) xo20Var.e.getValue(), (com.yandex.mob.network.a) xo20Var.x.getValue(), xo20Var.b(), xo20Var.c(), (com.yandex.mob.datastore.c) yo20Var.z.invoke(), (com.yandex.mob.datastore.f) xo20Var.J.getValue(), (com.yandex.mob.domain.d) xo20Var.p.getValue(), (vy21) xo20Var.E.getValue(), (jpt) xo20Var.L.getValue());
            case 11:
                return new q((b) yo20Var.p.invoke(), (d) yo20Var.x.invoke(), yo20Var.c, (m) xo20Var.b.getValue(), (u) xo20Var.y.getValue(), (com.yandex.mob.domain.d) xo20Var.p.getValue(), (l) yo20Var.A.invoke(), (com.yandex.mob.network.b) xo20Var.w.getValue(), (a) xo20Var.k.getValue(), xo20Var.b(), xo20Var.c(), (h) xo20Var.D.getValue(), (k) xo20Var.s.getValue(), new p());
            case 12:
                return new s((com.yandex.mob.data.c) yo20Var.B.invoke(), (un20) xo20Var.c.getValue());
            case 13:
                yo20Var.A.invoke();
                return new wbz0(z);
            case 14:
                l lVar = (l) yo20Var.A.invoke();
                com.yandex.mob.k kVar = yo20Var.o;
                rot c = xo20Var.c();
                return new h(lVar, kVar, xo20Var.a(), (a) xo20Var.l.getValue(), (jr20) xo20Var.G.getValue(), xo20Var.b(), c);
            case 15:
                return new r(yo20Var.k, (l) yo20Var.A.invoke(), (com.yandex.mob.datastore.c) yo20Var.z.invoke(), (com.yandex.mob.domain.d) xo20Var.p.getValue(), (u) xo20Var.y.getValue(), (com.yandex.mob.network.a) xo20Var.x.getValue(), (com.yandex.mob.okhttp.d) yo20Var.r.invoke(), yo20Var.c, (m) xo20Var.b.getValue(), xo20Var.b(), xo20Var.c());
            case 16:
                return new com.yandex.mob.domain.f(xo20Var.a(), yo20Var.c, (l) yo20Var.A.invoke(), yo20Var.l);
            case 17:
                return new j(yo20Var.a, yo20Var.f, (com.yandex.mob.datastore.c) yo20Var.z.invoke(), (com.yandex.mob.datastore.f) xo20Var.J.getValue());
            case 18:
                MobCronJobType mobCronJobType4 = MobCronJobType.Config;
                npt nptVar4 = yo20Var.c;
                return new a(mobCronJobType4, nptVar4, new jb7(i2, mobCronJobType4, nptVar4, xo20Var.a()), new po20(yo20Var, 3), yo20Var.l, yo20Var.k);
            default:
                MobCronJobType mobCronJobType5 = MobCronJobType.AvailabilityReport;
                npt nptVar5 = yo20Var.c;
                return new a(mobCronJobType5, nptVar5, new jb7(i2, mobCronJobType5, nptVar5, xo20Var.a()), new po20(yo20Var, 1), yo20Var.l, yo20Var.k);
        }
    }

    public /* synthetic */ qo20(yo20 yo20Var, xo20 xo20Var, int i) {
        this.a = i;
        this.b = yo20Var;
        this.c = xo20Var;
    }
}
