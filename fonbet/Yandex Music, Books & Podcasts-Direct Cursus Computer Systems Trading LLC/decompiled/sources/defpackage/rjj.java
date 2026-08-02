package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rjj {
    public final cib a;
    public final tc1 b;
    public final g0c c;

    public rjj(cib cibVar, tc1 tc1Var, g0c g0cVar) {
        this.a = cibVar;
        this.b = tc1Var;
        this.c = g0cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a5, code lost:
    
        if (r6 == r5) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rjj rjjVar, njj njjVar, xgd xgdVar, cg6 cg6Var) {
        qjj qjjVar;
        Object obj;
        nm6 nm6Var;
        int i;
        xqn xqnVar;
        Object b;
        List list;
        Iterator it;
        njj njjVar2;
        z7o z7oVar;
        rjj rjjVar2 = rjjVar;
        njj njjVar3 = njjVar;
        xgd xgdVar2 = xgdVar;
        rjjVar2.getClass();
        if (cg6Var instanceof qjj) {
            qjjVar = (qjj) cg6Var;
            int i2 = qjjVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qjjVar.p = i2 - Integer.MIN_VALUE;
                obj = qjjVar.n;
                nm6Var = nm6.a;
                i = qjjVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList = njjVar3.a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!(((rfk) obj2) instanceof jfk)) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ((mt4) xgdVar2.d).invoke(arrayList2);
                    }
                    xqnVar = new xqn();
                    xqnVar.a = null;
                    if (xgdVar2.b) {
                        e8w e8wVar = e8w.a;
                        qjjVar.j = rjjVar2;
                        qjjVar.k = njjVar3;
                        qjjVar.l = xgdVar2;
                        qjjVar.m = xqnVar;
                        qjjVar.p = 1;
                        b = e8wVar.b(qjjVar);
                    }
                    cib cibVar = rjjVar2.a;
                    ArrayList arrayList3 = njjVar3.a;
                    tc1 tc1Var = rjjVar2.b;
                    ej6 ej6Var = (ej6) xgdVar2.e;
                    y57 y57Var = ((p57) xgdVar2.g).s;
                    int D = qdq.D((Integer) ej6Var.invoke());
                    boolean z = njjVar3.b;
                    mgk mgkVar = y57Var.v0;
                    String str = mgkVar != null ? mgkVar.f().a : null;
                    mgk mgkVar2 = y57Var.v0;
                    String str2 = mgkVar2 != null ? mgkVar2.f().b : null;
                    Object obj3 = xqnVar.a;
                    if (!xgdVar2.b) {
                        obj3 = null;
                    }
                    q27 H = x97.H(arrayList3, tc1Var, D, z, str, str2, (bm2) obj3, xgdVar2.c, (String) xgdVar2.a, rjjVar2.c, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
                    qjjVar.j = njjVar3;
                    qjjVar.k = null;
                    qjjVar.l = null;
                    qjjVar.m = null;
                    qjjVar.p = 2;
                    cno cnoVar = new cno(qxe.b(qjjVar));
                    List list2 = H.a;
                    list = list2;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            String str3 = ((p27) it.next()).a;
                            okr[] okrVarArr = okr.a;
                            if (str3.equals("sbp_token")) {
                                ((tdk) ((sdk) cibVar.b)).b(new c57(list2, cnoVar, H, 1));
                                break;
                            }
                        }
                    }
                    r7o r7oVar = z7o.b;
                    cnoVar.resumeWith(H);
                    obj = cnoVar.a();
                    nm6 nm6Var2 = nm6.a;
                    if (obj != nm6Var) {
                        njjVar2 = njjVar3;
                        return new mjj((q27) obj, njjVar2.c, njjVar2.a, njjVar2.b);
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    njjVar2 = (njj) qjjVar.j;
                    qgg.h0(obj);
                    return new mjj((q27) obj, njjVar2.c, njjVar2.a, njjVar2.b);
                }
                xqn xqnVar2 = qjjVar.m;
                xgd xgdVar3 = qjjVar.l;
                njj njjVar4 = qjjVar.k;
                rjj rjjVar3 = (rjj) qjjVar.j;
                qgg.h0(obj);
                xqnVar = xqnVar2;
                rjjVar2 = rjjVar3;
                b = obj;
                xgdVar2 = xgdVar3;
                njjVar3 = njjVar4;
                z7oVar = (z7o) b;
                if (z7oVar != null) {
                    Object obj4 = z7oVar.a;
                    if (!(obj4 instanceof t7o)) {
                        xqnVar.a = (bm2) obj4;
                    }
                    r7o r7oVar2 = z7o.b;
                }
                cib cibVar2 = rjjVar2.a;
                ArrayList arrayList32 = njjVar3.a;
                tc1 tc1Var2 = rjjVar2.b;
                ej6 ej6Var2 = (ej6) xgdVar2.e;
                y57 y57Var2 = ((p57) xgdVar2.g).s;
                int D2 = qdq.D((Integer) ej6Var2.invoke());
                boolean z2 = njjVar3.b;
                mgk mgkVar3 = y57Var2.v0;
                if (mgkVar3 != null) {
                }
                mgk mgkVar22 = y57Var2.v0;
                if (mgkVar22 != null) {
                }
                Object obj32 = xqnVar.a;
                if (!xgdVar2.b) {
                }
                q27 H2 = x97.H(arrayList32, tc1Var2, D2, z2, str, str2, (bm2) obj32, xgdVar2.c, (String) xgdVar2.a, rjjVar2.c, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
                qjjVar.j = njjVar3;
                qjjVar.k = null;
                qjjVar.l = null;
                qjjVar.m = null;
                qjjVar.p = 2;
                cno cnoVar2 = new cno(qxe.b(qjjVar));
                List list22 = H2.a;
                list = list22;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                r7o r7oVar3 = z7o.b;
                cnoVar2.resumeWith(H2);
                obj = cnoVar2.a();
                nm6 nm6Var22 = nm6.a;
                if (obj != nm6Var) {
                }
                return nm6Var;
            }
        }
        qjjVar = new qjj(rjjVar2, cg6Var);
        obj = qjjVar.n;
        nm6Var = nm6.a;
        i = qjjVar.p;
        if (i != 0) {
        }
        z7oVar = (z7o) b;
        if (z7oVar != null) {
        }
        cib cibVar22 = rjjVar2.a;
        ArrayList arrayList322 = njjVar3.a;
        tc1 tc1Var22 = rjjVar2.b;
        ej6 ej6Var22 = (ej6) xgdVar2.e;
        y57 y57Var22 = ((p57) xgdVar2.g).s;
        int D22 = qdq.D((Integer) ej6Var22.invoke());
        boolean z22 = njjVar3.b;
        mgk mgkVar32 = y57Var22.v0;
        if (mgkVar32 != null) {
        }
        mgk mgkVar222 = y57Var22.v0;
        if (mgkVar222 != null) {
        }
        Object obj322 = xqnVar.a;
        if (!xgdVar2.b) {
        }
        q27 H22 = x97.H(arrayList322, tc1Var22, D22, z22, str, str2, (bm2) obj322, xgdVar2.c, (String) xgdVar2.a, rjjVar2.c, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
        qjjVar.j = njjVar3;
        qjjVar.k = null;
        qjjVar.l = null;
        qjjVar.m = null;
        qjjVar.p = 2;
        cno cnoVar22 = new cno(qxe.b(qjjVar));
        List list222 = H22.a;
        list = list222;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        r7o r7oVar32 = z7o.b;
        cnoVar22.resumeWith(H22);
        obj = cnoVar22.a();
        nm6 nm6Var222 = nm6.a;
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x0q x0qVar, xgd xgdVar, cg6 cg6Var) {
        pjj pjjVar;
        int i;
        rjj rjjVar;
        if (cg6Var instanceof pjj) {
            pjjVar = (pjj) cg6Var;
            int i2 = pjjVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjjVar.o = i2 - Integer.MIN_VALUE;
                Object obj = pjjVar.m;
                nm6 nm6Var = nm6.a;
                i = pjjVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    pjjVar.j = this;
                    pjjVar.k = xgdVar;
                    pjjVar.l = x0qVar;
                    pjjVar.o = 1;
                    e8w.c();
                    fs fsVar = new fs(15, new gm2());
                    if (fsVar == nm6Var) {
                        return nm6Var;
                    }
                    obj = fsVar;
                    rjjVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x0qVar = pjjVar.l;
                    xgdVar = pjjVar.k;
                    rjjVar = pjjVar.j;
                    qgg.h0(obj);
                }
                return new u21(14, new u21(10, x0qVar, (pjc) obj, new a37(rjjVar, xgdVar, continuation, 4)), rjjVar, xgdVar);
            }
        }
        pjjVar = new pjj(this, cg6Var);
        Object obj2 = pjjVar.m;
        nm6 nm6Var2 = nm6.a;
        i = pjjVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return new u21(14, new u21(10, x0qVar, (pjc) obj2, new a37(rjjVar, xgdVar, continuation2, 4)), rjjVar, xgdVar);
    }
}
