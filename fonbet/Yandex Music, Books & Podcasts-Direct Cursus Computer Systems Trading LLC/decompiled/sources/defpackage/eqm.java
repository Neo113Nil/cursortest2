package defpackage;

import android.app.Application;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eqm extends qj0 {
    public final sdk k;
    public final Handler l;
    public final String m;
    public final ik0 n;
    public final g0c o;
    public final voi p;
    public final voi q;
    public final ExecutorService r;
    public ArrayList s;

    public eqm(Application application, sdk sdkVar, Handler handler, String str, ik0 ik0Var, g0c g0cVar) {
        application.getClass();
        sdkVar.getClass();
        g0cVar.getClass();
        this.k = sdkVar;
        this.l = handler;
        this.m = str;
        this.n = ik0Var;
        this.o = g0cVar;
        this.p = new voi();
        this.q = new voi();
        this.r = Executors.newSingleThreadExecutor();
        this.s = new ArrayList();
    }

    public final ArrayList G() {
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            rfk rfkVar = (rfk) obj;
            if (rfkVar instanceof ffk) {
                if (((ffk) rfkVar).e == null) {
                    arrayList2.add(obj);
                }
            } else if (rfkVar instanceof mfk) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void H() {
        jfk jfkVar;
        String str;
        qne m1 = gut.m1(d0n.PRESELECT);
        x60 x60Var = (x60) this.o;
        x60Var.getClass();
        x60Var.a(m1);
        Iterator it = this.s.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            jfkVar = jfk.a;
            str = this.m;
            if (!hasNext) {
                i = -1;
                break;
            }
            rfk rfkVar = (rfk) it.next();
            if (!Intrinsics.d(rfkVar, jfkVar) && Intrinsics.d(o8g.w(rfkVar), str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : !Intrinsics.d(CollectionsKt.Q(this.s), jfkVar) ? 0 : null;
        rfk rfkVar2 = valueOf != null ? (rfk) this.s.get(valueOf.intValue()) : null;
        if (str != null) {
            if (rfkVar2 == null || !Intrinsics.d(o8g.w(rfkVar2), str)) {
                qne y = gut.y(str);
                x60Var.getClass();
                x60Var.a(y);
            } else {
                qne x = gut.x(str);
                x60Var.getClass();
                x60Var.a(x);
            }
        }
        ArrayList<rfk> arrayList = this.s;
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (rfk rfkVar3 : arrayList) {
            rfkVar3.getClass();
            arrayList2.add(new kcp(rfkVar3, false, false, null, null));
        }
        q7g.O(this.k, arrayList2, new jtc(new zpm(arrayList2, valueOf, !G().isEmpty()), this));
    }

    public final void J(rfk rfkVar, boolean z) {
        qne s = avf.s(rfkVar, z);
        x60 x60Var = (x60) this.o;
        x60Var.getClass();
        x60Var.a(s);
        if (!(rfkVar instanceof jfk)) {
            cfk.e.a(rfkVar);
        } else {
            this.q.l(new wpm(z));
        }
    }

    public final void K(zpm zpmVar) {
        rfk rfkVar;
        this.q.l(zpmVar);
        Integer num = zpmVar.b;
        if (num != null) {
            rfkVar = (rfk) this.s.get(num.intValue());
        } else {
            rfkVar = null;
        }
        if (rfkVar instanceof jfk) {
            return;
        }
        cfk.e.a(rfkVar);
    }

    public final void L() {
        ArrayList G = G();
        ArrayList arrayList = new ArrayList(v75.o(G, 10));
        Iterator it = G.iterator();
        while (it.hasNext()) {
            rfk rfkVar = (rfk) it.next();
            rfkVar.getClass();
            arrayList.add(new kcp(rfkVar, false, true, null, null));
        }
        if (!G.isEmpty()) {
            q7g.O(this.k, arrayList, new nnd(21, this, arrayList));
        } else if (this.s.size() == 1) {
            J((rfk) CollectionsKt.Q(this.s), false);
        } else {
            H();
        }
    }
}
