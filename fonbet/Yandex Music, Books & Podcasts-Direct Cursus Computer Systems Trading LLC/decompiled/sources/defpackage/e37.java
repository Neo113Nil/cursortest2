package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e37 implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ h37 b;

    public e37(rjc rjcVar, h37 h37Var) {
        this.a = rjcVar;
        this.b = h37Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x019b, code lost:
    
        if (r6.emit(r5, r2) != r3) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        d37 d37Var;
        Object obj2;
        nm6 nm6Var;
        int i;
        xqn xqnVar;
        z27 z27Var;
        xqn xqnVar2;
        e37 e37Var;
        rjc rjcVar;
        z27 z27Var2;
        h37 h37Var;
        List list;
        Iterator it;
        rjc rjcVar2;
        z7o z7oVar;
        if (continuation instanceof d37) {
            d37Var = (d37) continuation;
            int i2 = d37Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d37Var.k = i2 - Integer.MIN_VALUE;
                obj2 = d37Var.j;
                nm6Var = nm6.a;
                i = d37Var.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    z27 z27Var3 = (z27) obj;
                    List list2 = z27Var3.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(((rfk) obj3) instanceof jfk)) {
                            arrayList.add(obj3);
                        }
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    h37 h37Var2 = this.b;
                    if (!isEmpty) {
                        rn5 rn5Var = h37Var2.q;
                        if (rn5Var != null) {
                            rn5Var.U(arrayList);
                        }
                        if (z27Var3.d) {
                            g0c g0cVar = h37Var2.l;
                            qne j1 = gut.j1(yfk.YANDEX_BANK, false);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(j1);
                            rn5 rn5Var2 = h37Var2.q;
                            if (rn5Var2 != null) {
                                rn5Var2.t(0);
                            }
                        }
                    }
                    xqnVar = new xqn();
                    bm2 bm2Var = z27Var3.c;
                    xqnVar.a = bm2Var;
                    boolean z = h37Var2.o;
                    rjc rjcVar3 = this.a;
                    if (z && bm2Var == null) {
                        e8w e8wVar = e8w.a;
                        d37Var.l = this;
                        d37Var.n = rjcVar3;
                        d37Var.o = z27Var3;
                        d37Var.p = xqnVar;
                        d37Var.k = 1;
                        z7o b = e8wVar.b(d37Var);
                        if (b != nm6Var) {
                            z27Var2 = z27Var3;
                            obj2 = b;
                            e37Var = this;
                            rjcVar = rjcVar3;
                        }
                        return nm6Var;
                    }
                    z27Var = z27Var3;
                    xqnVar2 = xqnVar;
                    e37Var = this;
                    rjcVar = rjcVar3;
                    h37 h37Var3 = e37Var.b;
                    List list3 = z27Var.a;
                    tc1 tc1Var = h37Var3.m;
                    rn5 rn5Var3 = h37Var3.q;
                    int D = qdq.D(rn5Var3 != null ? rn5Var3.I() : null);
                    boolean z2 = z27Var.b;
                    h37Var = e37Var.b;
                    String str = h37Var.C;
                    Object obj4 = xqnVar2.a;
                    if (!h37Var.o) {
                        obj4 = null;
                    }
                    q27 H = x97.H(list3, tc1Var, D, z2, str, null, (bm2) obj4, h37Var.r, null, h37Var.l, h37Var.D, 128);
                    d37Var.l = rjcVar;
                    d37Var.n = z27Var;
                    d37Var.o = null;
                    d37Var.p = null;
                    d37Var.k = 2;
                    cno cnoVar = new cno(qxe.b(d37Var));
                    List list4 = H.a;
                    list = list4;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            String str2 = ((p27) it.next()).a;
                            okr[] okrVarArr = okr.a;
                            if (str2.equals("sbp_token")) {
                                ((tdk) h37Var3.n).b(new es6(list4, cnoVar, H));
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
                        b37 b37Var = new b37((q27) obj2, z27Var);
                        d37Var.l = null;
                        d37Var.n = null;
                        d37Var.k = 3;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    xqnVar = d37Var.p;
                    z27Var2 = d37Var.o;
                    rjcVar = (rjc) d37Var.n;
                    e37Var = (e37) d37Var.l;
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
                    z27Var = (z27) d37Var.n;
                    rjcVar2 = d37Var.l;
                    qgg.h0(obj2);
                    b37 b37Var2 = new b37((q27) obj2, z27Var);
                    d37Var.l = null;
                    d37Var.n = null;
                    d37Var.k = 3;
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
                z27Var = z27Var2;
                h37 h37Var32 = e37Var.b;
                List list32 = z27Var.a;
                tc1 tc1Var2 = h37Var32.m;
                rn5 rn5Var32 = h37Var32.q;
                int D2 = qdq.D(rn5Var32 != null ? rn5Var32.I() : null);
                boolean z22 = z27Var.b;
                h37Var = e37Var.b;
                String str3 = h37Var.C;
                Object obj42 = xqnVar2.a;
                if (!h37Var.o) {
                }
                q27 H2 = x97.H(list32, tc1Var2, D2, z22, str3, null, (bm2) obj42, h37Var.r, null, h37Var.l, h37Var.D, 128);
                d37Var.l = rjcVar;
                d37Var.n = z27Var;
                d37Var.o = null;
                d37Var.p = null;
                d37Var.k = 2;
                cno cnoVar2 = new cno(qxe.b(d37Var));
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
        d37Var = new d37(this, continuation);
        obj2 = d37Var.j;
        nm6Var = nm6.a;
        i = d37Var.k;
        if (i != 0) {
        }
        z7oVar = (z7o) obj2;
        if (z7oVar != null) {
        }
        xqnVar2 = xqnVar;
        z27Var = z27Var2;
        h37 h37Var322 = e37Var.b;
        List list322 = z27Var.a;
        tc1 tc1Var22 = h37Var322.m;
        rn5 rn5Var322 = h37Var322.q;
        int D22 = qdq.D(rn5Var322 != null ? rn5Var322.I() : null);
        boolean z222 = z27Var.b;
        h37Var = e37Var.b;
        String str32 = h37Var.C;
        Object obj422 = xqnVar2.a;
        if (!h37Var.o) {
        }
        q27 H22 = x97.H(list322, tc1Var22, D22, z222, str32, null, (bm2) obj422, h37Var.r, null, h37Var.l, h37Var.D, 128);
        d37Var.l = rjcVar;
        d37Var.n = z27Var;
        d37Var.o = null;
        d37Var.p = null;
        d37Var.k = 2;
        cno cnoVar22 = new cno(qxe.b(d37Var));
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
