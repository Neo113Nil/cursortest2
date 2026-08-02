package defpackage;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import androidx.work.impl.WorkDatabase;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class omp {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ pmp b;

    public omp(pmp pmpVar) {
        this.b = pmpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, String str, cg6 cg6Var) {
        mmp mmpVar;
        int i;
        omp ompVar;
        Iterable iterable;
        Iterator it;
        boolean z;
        if (cg6Var instanceof mmp) {
            mmpVar = (mmp) cg6Var;
            int i2 = mmpVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mmpVar.n = i2 - Integer.MIN_VALUE;
                Object obj = mmpVar.l;
                nm6 nm6Var = nm6.a;
                i = mmpVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    context.getClass();
                    g4w d = g4w.d(context);
                    d.getClass();
                    WorkDatabase workDatabase = d.c;
                    j4w j4wVar = d.d;
                    workDatabase.getClass();
                    j4wVar.getClass();
                    str.getClass();
                    srp srpVar = new srp(str, 6);
                    qhp qhpVar = j4wVar.a;
                    qhpVar.getClass();
                    ys3 z2 = wct.z(new u13(7, qhpVar, "loadStatusFuture", new rln(26, srpVar, workDatabase)));
                    mmpVar.j = this;
                    mmpVar.k = str;
                    mmpVar.n = 1;
                    obj = pcg.r(z2, mmpVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    ompVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = mmpVar.k;
                    ompVar = mmpVar.j;
                    qgg.h0(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (u75.h(c4w.b, c4w.a).contains(((d4w) it.next()).b)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                aw0 aw0Var = (aw0) ompVar.a.get(str);
                return Boolean.valueOf(!(aw0Var == null ? aw0Var.b.get() : false) && z);
            }
        }
        mmpVar = new mmp(this, cg6Var);
        Object obj2 = mmpVar.l;
        nm6 nm6Var2 = nm6.a;
        i = mmpVar.n;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        z = false;
        aw0 aw0Var2 = (aw0) ompVar.a.get(str);
        return Boolean.valueOf(!(aw0Var2 == null ? aw0Var2.b.get() : false) && z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, aw0 aw0Var, cg6 cg6Var) {
        nmp nmpVar;
        int i;
        omp ompVar;
        Context context2;
        if (cg6Var instanceof nmp) {
            nmpVar = (nmp) cg6Var;
            int i2 = nmpVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nmpVar.n = i2 - Integer.MIN_VALUE;
                Object obj = nmpVar.l;
                nm6 nm6Var = nm6.a;
                i = nmpVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String str = aw0Var.a;
                    aw0 aw0Var2 = (aw0) this.a.put(str, aw0Var);
                    if (aw0Var2 != null) {
                        aw0Var2.c.n(null);
                        aw0Var2.b.set(false);
                        aw0Var2.l.g(null);
                    }
                    trj trjVar = new trj(SessionWorker.class);
                    Pair[] pairArr = {new Pair("KEY", str)};
                    p97 p97Var = new p97(0);
                    Pair pair = pairArr[0];
                    p97Var.e(pair.b, (String) pair.a);
                    ((t4w) trjVar.c).e = p97Var.c();
                    urj urjVar = (urj) trjVar.a();
                    context.getClass();
                    g4w d = g4w.d(context);
                    d.getClass();
                    ys3 ys3Var = (ys3) d.c(str, opb.a, urjVar).a;
                    nmpVar.j = this;
                    nmpVar.k = context;
                    nmpVar.n = 1;
                    if (pcg.r(ys3Var, nmpVar) == nm6Var) {
                        return nm6Var;
                    }
                    ompVar = this;
                    context2 = context;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context2 = nmpVar.k;
                    ompVar = nmpVar.j;
                    qgg.h0(obj);
                }
                pmp pmpVar = ompVar.b;
                context2.getClass();
                g4w d2 = g4w.d(context2);
                d2.getClass();
                opb opbVar = opb.b;
                trj trjVar2 = (trj) new trj(SessionWorker.class).l(3650L, TimeUnit.DAYS);
                ((t4w) trjVar2.c).j = new fa6(new f1j(null), g2j.a, true, false, false, false, -1L, -1L, CollectionsKt.A0(new LinkedHashSet()));
                d2.c("sessionWorkerKeepEnabled", opbVar, (urj) trjVar2.a());
                return Unit.a;
            }
        }
        nmpVar = new nmp(this, cg6Var);
        Object obj2 = nmpVar.l;
        nm6 nm6Var2 = nm6.a;
        i = nmpVar.n;
        if (i != 0) {
        }
        pmp pmpVar2 = ompVar.b;
        context2.getClass();
        g4w d22 = g4w.d(context2);
        d22.getClass();
        opb opbVar2 = opb.b;
        trj trjVar22 = (trj) new trj(SessionWorker.class).l(3650L, TimeUnit.DAYS);
        ((t4w) trjVar22.c).j = new fa6(new f1j(null), g2j.a, true, false, false, false, -1L, -1L, CollectionsKt.A0(new LinkedHashSet()));
        d22.c("sessionWorkerKeepEnabled", opbVar2, (urj) trjVar22.a());
        return Unit.a;
    }
}
