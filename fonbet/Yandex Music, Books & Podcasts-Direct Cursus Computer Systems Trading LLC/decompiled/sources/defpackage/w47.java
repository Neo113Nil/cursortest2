package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class w47 implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ e57 b;

    public w47(rjc rjcVar, e57 e57Var) {
        this.a = rjcVar;
        this.b = e57Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01b0, code lost:
    
        if (r5.emit(r6, r2) != r3) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        v47 v47Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        xqn xqnVar;
        s47 s47Var;
        xqn xqnVar2;
        w47 w47Var;
        rjc rjcVar;
        s47 s47Var2;
        e57 e57Var;
        List list;
        Iterator it;
        rjc rjcVar2;
        z7o z7oVar;
        if (continuation instanceof v47) {
            v47Var = (v47) continuation;
            int i2 = v47Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v47Var.k = i2 - Integer.MIN_VALUE;
                obj2 = v47Var.j;
                nm6Var = nm6.a;
                i = v47Var.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    s47 s47Var3 = (s47) obj;
                    List list2 = s47Var3.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(((rfk) obj3) instanceof jfk)) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    e57 e57Var2 = this.b;
                    if (!isEmpty) {
                        rn5 rn5Var = e57Var2.x;
                        if (rn5Var != null) {
                            rn5Var.U(arrayList);
                        }
                        if (s47Var3.e) {
                            g0c g0cVar = e57Var2.l;
                            qne j1 = gut.j1(yfk.YANDEX_BANK, false);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(j1);
                            rn5 rn5Var2 = e57Var2.x;
                            if (rn5Var2 != null) {
                                rn5Var2.t(0);
                            }
                        }
                    }
                    xqnVar = new xqn();
                    bm2 bm2Var = s47Var3.c;
                    xqnVar.a = bm2Var;
                    boolean z = e57Var2.u;
                    rjc rjcVar3 = this.a;
                    if (z && bm2Var == null) {
                        e8w e8wVar = e8w.a;
                        v47Var.l = this;
                        v47Var.n = rjcVar3;
                        v47Var.o = s47Var3;
                        v47Var.p = xqnVar;
                        v47Var.k = 1;
                        z7o b = e8wVar.b(v47Var);
                        if (b != nm6Var) {
                            s47Var2 = s47Var3;
                            obj2 = b;
                            w47Var = this;
                            rjcVar = rjcVar3;
                        }
                        return nm6Var;
                    }
                    s47Var = s47Var3;
                    xqnVar2 = xqnVar;
                    w47Var = this;
                    rjcVar = rjcVar3;
                    e57Var = w47Var.b;
                    List list3 = s47Var.a;
                    tc1 tc1Var = e57Var.m;
                    rn5 rn5Var3 = e57Var.x;
                    int D = qdq.D(rn5Var3 != null ? rn5Var3.I() : null);
                    boolean z2 = s47Var.b;
                    mgk mgkVar = e57Var.w;
                    String str = mgkVar != null ? mgkVar.f().a : null;
                    mgk mgkVar2 = e57Var.w;
                    String str2 = mgkVar2 != null ? mgkVar2.f().b : null;
                    Object obj4 = xqnVar2.a;
                    if (!e57Var.u) {
                        obj4 = null;
                    }
                    q27 H = x97.H(list3, tc1Var, D, z2, str, str2, (bm2) obj4, e57Var.C, e57Var.D, e57Var.l, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
                    v47Var.l = rjcVar;
                    v47Var.n = s47Var;
                    v47Var.o = null;
                    v47Var.p = null;
                    v47Var.k = 2;
                    cno cnoVar = new cno(qxe.b(v47Var));
                    List list4 = H.a;
                    list = list4;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            String str3 = ((p27) it.next()).a;
                            okr[] okrVarArr = okr.a;
                            if (str3.equals("sbp_token")) {
                                ((tdk) e57Var.o).b(new c57(list4, cnoVar, H, 0));
                                break;
                            }
                        }
                    }
                    r7o r7oVar = z7o.b;
                    cnoVar.resumeWith(H);
                    obj2 = cnoVar.a();
                    nm6 nm6Var2 = nm6.a;
                    if (obj2 != nm6Var) {
                        rjcVar2 = rjcVar;
                        t47 t47Var = new t47((q27) obj2, s47Var);
                        v47Var.l = null;
                        v47Var.n = null;
                        v47Var.k = 3;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    xqnVar = v47Var.p;
                    s47Var2 = v47Var.o;
                    rjcVar = (rjc) v47Var.n;
                    w47Var = (w47) v47Var.l;
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s47Var = (s47) v47Var.n;
                    rjcVar2 = v47Var.l;
                    qgg.h0(obj2);
                    t47 t47Var2 = new t47((q27) obj2, s47Var);
                    v47Var.l = null;
                    v47Var.n = null;
                    v47Var.k = 3;
                }
                z7oVar = (z7o) obj2;
                if (z7oVar != null) {
                    Object obj5 = z7oVar.a;
                    if (!(obj5 instanceof t7o)) {
                        xqnVar.a = (bm2) obj5;
                    }
                    r7o r7oVar2 = z7o.b;
                }
                xqnVar2 = xqnVar;
                s47Var = s47Var2;
                e57Var = w47Var.b;
                List list32 = s47Var.a;
                tc1 tc1Var2 = e57Var.m;
                rn5 rn5Var32 = e57Var.x;
                int D2 = qdq.D(rn5Var32 != null ? rn5Var32.I() : null);
                boolean z22 = s47Var.b;
                mgk mgkVar3 = e57Var.w;
                if (mgkVar3 != null) {
                }
                mgk mgkVar22 = e57Var.w;
                if (mgkVar22 != null) {
                }
                Object obj42 = xqnVar2.a;
                if (!e57Var.u) {
                }
                q27 H2 = x97.H(list32, tc1Var2, D2, z22, str, str2, (bm2) obj42, e57Var.C, e57Var.D, e57Var.l, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
                v47Var.l = rjcVar;
                v47Var.n = s47Var;
                v47Var.o = null;
                v47Var.p = null;
                v47Var.k = 2;
                cno cnoVar2 = new cno(qxe.b(v47Var));
                List list42 = H2.a;
                list = list42;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                r7o r7oVar3 = z7o.b;
                cnoVar2.resumeWith(H2);
                obj2 = cnoVar2.a();
                nm6 nm6Var22 = nm6.a;
                if (obj2 != nm6Var) {
                }
                return nm6Var;
            }
        }
        v47Var = new v47(this, continuation);
        obj2 = v47Var.j;
        nm6Var = nm6.a;
        i = v47Var.k;
        if (i != 0) {
        }
        z7oVar = (z7o) obj2;
        if (z7oVar != null) {
        }
        xqnVar2 = xqnVar;
        s47Var = s47Var2;
        e57Var = w47Var.b;
        List list322 = s47Var.a;
        tc1 tc1Var22 = e57Var.m;
        rn5 rn5Var322 = e57Var.x;
        int D22 = qdq.D(rn5Var322 != null ? rn5Var322.I() : null);
        boolean z222 = s47Var.b;
        mgk mgkVar32 = e57Var.w;
        if (mgkVar32 != null) {
        }
        mgk mgkVar222 = e57Var.w;
        if (mgkVar222 != null) {
        }
        Object obj422 = xqnVar2.a;
        if (!e57Var.u) {
        }
        q27 H22 = x97.H(list322, tc1Var22, D22, z222, str, str2, (bm2) obj422, e57Var.C, e57Var.D, e57Var.l, null, RemoteCameraConfig.Mic.BUFFER_SIZE);
        v47Var.l = rjcVar;
        v47Var.n = s47Var;
        v47Var.o = null;
        v47Var.p = null;
        v47Var.k = 2;
        cno cnoVar22 = new cno(qxe.b(v47Var));
        List list422 = H22.a;
        list = list422;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        r7o r7oVar32 = z7o.b;
        cnoVar22.resumeWith(H22);
        obj2 = cnoVar22.a();
        nm6 nm6Var222 = nm6.a;
        if (obj2 != nm6Var) {
        }
        return nm6Var;
    }
}
