package io.grpc.util;

import defpackage.akp;
import defpackage.aqd;
import defpackage.bn7;
import defpackage.ceg;
import defpackage.gyr;
import defpackage.hs4;
import defpackage.nud;
import defpackage.o2g;
import defpackage.qxj;
import defpackage.reb;
import defpackage.rjp;
import defpackage.sgr;
import defpackage.txj;
import defpackage.vq6;
import defpackage.w6e;
import defpackage.wdg;
import defpackage.wu1;
import defpackage.xu1;
import defpackage.ydg;
import defpackage.zc4;
import defpackage.znd;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class b extends ceg {
    public static final wu1 o = new wu1("addressTrackerKey");
    public final bn7 g;
    public final vq6 h;
    public final a i;
    public final hs4 j;
    public final ScheduledExecutorService k;
    public rjp l;
    public Long m;
    public final zc4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wdg wdgVar) {
        super(0);
        hs4 hs4Var = hs4.m;
        zc4 N = wdgVar.N();
        this.n = N;
        this.i = new a(new znd(this, wdgVar));
        this.g = new bn7();
        vq6 R = wdgVar.R();
        o2g.O(R, "syncContext");
        this.h = R;
        ScheduledExecutorService Q = wdgVar.Q();
        o2g.O(Q, "timeService");
        this.k = Q;
        this.j = hs4Var;
        N.I(1, "OutlierDetection lb created.");
    }

    public static ArrayList A(bn7 bn7Var, int i) {
        ArrayList arrayList = new ArrayList();
        for (qxj qxjVar : bn7Var.values()) {
            if (qxjVar.c() >= i) {
                arrayList.add(qxjVar);
            }
        }
        return arrayList;
    }

    public static boolean z(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((reb) it.next()).a.size();
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ceg
    public final sgr a(ydg ydgVar) {
        a aVar = this.i;
        bn7 bn7Var = this.g;
        zc4 zc4Var = this.n;
        zc4Var.J(1, "Received resolution result: {0}", ydgVar);
        txj txjVar = (txj) ydgVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = ydgVar.a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((reb) it.next()).a);
        }
        bn7Var.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) bn7Var.r).values().iterator();
        while (it2.hasNext()) {
            ((qxj) it2.next()).a = txjVar;
        }
        HashMap hashMap = (HashMap) bn7Var.r;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!hashMap.containsKey(socketAddress)) {
                hashMap.put(socketAddress, new qxj(txjVar));
            }
        }
        akp akpVar = txjVar.g;
        Long l = txjVar.a;
        aVar.B(akpVar.a);
        if (txjVar.e == null && txjVar.f == null) {
            rjp rjpVar = this.l;
            if (rjpVar != null) {
                rjpVar.c();
                this.m = null;
                for (qxj qxjVar : ((HashMap) bn7Var.r).values()) {
                    if (qxjVar.d()) {
                        qxjVar.e();
                    }
                    qxjVar.e = 0;
                }
            }
        } else {
            Long valueOf = this.m == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.j.x() - this.m.longValue())));
            rjp rjpVar2 = this.l;
            if (rjpVar2 != null) {
                rjpVar2.c();
                for (qxj qxjVar2 : ((HashMap) bn7Var.r).values()) {
                    aqd aqdVar = qxjVar2.b;
                    ((AtomicLong) aqdVar.b).set(0L);
                    ((AtomicLong) aqdVar.c).set(0L);
                    aqd aqdVar2 = qxjVar2.c;
                    ((AtomicLong) aqdVar2.b).set(0L);
                    ((AtomicLong) aqdVar2.c).set(0L);
                }
            }
            vq6 vq6Var = this.h;
            nud nudVar = new nud(14, this, txjVar, zc4Var);
            long longValue = valueOf.longValue();
            long longValue2 = l.longValue();
            ScheduledExecutorService scheduledExecutorService = this.k;
            vq6Var.getClass();
            gyr gyrVar = new gyr(nudVar);
            this.l = new rjp(gyrVar, (ScheduledFuture) scheduledExecutorService.scheduleWithFixedDelay(new w6e(vq6Var, gyrVar, nudVar, longValue2), longValue, longValue2, TimeUnit.NANOSECONDS));
        }
        xu1 xu1Var = xu1.b;
        aVar.r(new ydg(ydgVar.a, ydgVar.b, txjVar.g.b));
        return sgr.e;
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        this.i.p(sgrVar);
    }

    @Override // defpackage.ceg
    public final void y() {
        this.i.y();
    }
}
