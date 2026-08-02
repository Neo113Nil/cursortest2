package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.k;
import com.yandex.media.ynison.service.m;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class tmw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ anw c;

    public /* synthetic */ tmw(rjc rjcVar, anw anwVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = anwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0482  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        smw smwVar;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        jcw jcwVar;
        int i2;
        Pair pair;
        vmw vmwVar;
        int i3;
        c0 c0Var;
        a0 a0Var;
        nnw nnwVar;
        gxc gxcVar;
        r V;
        switch (this.a) {
            case 0:
                if (continuation instanceof smw) {
                    smwVar = (smw) continuation;
                    int i4 = smwVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        smwVar.k = i4 - Integer.MIN_VALUE;
                        Object obj2 = smwVar.j;
                        nm6Var = nm6.a;
                        i = smwVar.k;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj2);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i2 = smwVar.o;
                                jcwVar = smwVar.n;
                                rjcVar = smwVar.m;
                                qgg.h0(obj2);
                            }
                        } else {
                            qgg.h0(obj2);
                            jcw jcwVar2 = (jcw) obj;
                            gsw gswVar = this.c.b;
                            rjcVar = this.b;
                            smwVar.m = rjcVar;
                            smwVar.n = jcwVar2;
                            smwVar.o = 0;
                            smwVar.k = 1;
                            Object c = gsw.c(gswVar, smwVar);
                            if (c != nm6Var) {
                                jcwVar = jcwVar2;
                                obj2 = c;
                                i2 = 0;
                            }
                        }
                        pair = new Pair(obj2, jcwVar);
                        smwVar.m = null;
                        smwVar.n = null;
                        smwVar.o = i2;
                        smwVar.k = 2;
                        if (rjcVar.emit(pair, smwVar) == nm6Var) {
                        }
                    }
                }
                smwVar = new smw(this, continuation);
                Object obj22 = smwVar.j;
                nm6Var = nm6.a;
                i = smwVar.k;
                if (i == 0) {
                }
                pair = new Pair(obj22, jcwVar);
                smwVar.m = null;
                smwVar.n = null;
                smwVar.o = i2;
                smwVar.k = 2;
                if (rjcVar.emit(pair, smwVar) == nm6Var) {
                }
                break;
            default:
                if (continuation instanceof vmw) {
                    vmwVar = (vmw) continuation;
                    int i5 = vmwVar.k;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vmwVar.k = i5 - Integer.MIN_VALUE;
                        Object obj3 = vmwVar.j;
                        nm6 nm6Var2 = nm6.a;
                        i3 = vmwVar.k;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                qgg.h0(obj3);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj3);
                            oow oowVar = (oow) obj;
                            s0 a = this.c.d.a(oowVar.d());
                            if (oowVar instanceof mow) {
                                long b = oowVar.b();
                                long j = ((mow) oowVar).e().e;
                                boolean z = !oowVar.a();
                                double d = oowVar.c().a;
                                qrl q = c0.q();
                                q.j(b);
                                q.h(j);
                                q.i(z);
                                q.d();
                                c0.h((c0) q.b, d);
                                q.k(a);
                                c0Var = (c0) q.b();
                            } else if (oowVar instanceof now) {
                                now nowVar = (now) oowVar;
                                y1u y1uVar = nowVar.g;
                                y1uVar.getClass();
                                long j2 = y1uVar.b.f;
                                boolean z2 = !nowVar.d;
                                double d2 = nowVar.h.a;
                                qrl q2 = c0.q();
                                q2.j(0L);
                                q2.h(j2);
                                q2.i(z2);
                                q2.d();
                                c0.h((c0) q2.b, d2);
                                q2.k(a);
                                c0Var = (c0) q2.b();
                            } else if (!(oowVar instanceof jow)) {
                                b6e.s();
                                break;
                            } else {
                                boolean z3 = !((jow) oowVar).d;
                                qrl q3 = c0.q();
                                q3.j(0L);
                                q3.h(1L);
                                q3.i(z3);
                                q3.d();
                                c0.h((c0) q3.b, 1.0f);
                                q3.k(a);
                                c0Var = (c0) q3.b();
                            }
                            if (oowVar instanceof kow) {
                                kow kowVar = (kow) oowVar;
                                q4q q4qVar = kowVar.b;
                                eu7 eu7Var = kowVar.a;
                                cu7 cu7Var = eu7Var.a;
                                Pair v = vq2.v(cu7Var, kowVar.h);
                                List list = (List) v.a;
                                i0 i0Var = (i0) v.b;
                                List e = cu7Var.e();
                                e5b e5bVar = e5b.a;
                                e5bVar.getClass();
                                asw U = y7g.U(e, new asw(e5bVar, e5bVar));
                                List<jzs> list2 = list;
                                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                                for (jzs jzsVar : list2) {
                                    jzsVar.getClass();
                                    arrayList.add(o2g.q0(jzsVar, U.b(jzsVar.g)));
                                }
                                List<jzs> list3 = cu7Var.b;
                                ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                                for (jzs jzsVar2 : list3) {
                                    jzsVar2.getClass();
                                    arrayList2.add(o2g.q0(jzsVar2, U.b(jzsVar2.g)));
                                }
                                Map map = (Map) U.c.getValue();
                                ArrayList arrayList3 = new ArrayList(map.size());
                                Iterator it = map.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        int intValue = ((Number) entry.getKey()).intValue();
                                        e6v e6vVar = (e6v) entry.getValue();
                                        s0 s0Var = a;
                                        if (e6vVar instanceof d6v) {
                                            V = y7g.W((d6v) e6vVar, intValue);
                                        } else if (!(e6vVar instanceof b6v)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            V = y7g.V((b6v) e6vVar, intValue);
                                        }
                                        arrayList3.add(V);
                                        a = s0Var;
                                    } else {
                                        s0 s0Var2 = a;
                                        if (q4qVar instanceof u4q) {
                                            gxcVar = ((u4q) q4qVar).b.c;
                                        } else if (!(q4qVar instanceof s4q)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            gxcVar = ((s4q) q4qVar).b.c;
                                        }
                                        x K = v7g.K(t7g.Q(q4qVar.getId().b, arrayList3, arrayList2, eu7Var.b.b, gxcVar.a, gxcVar.b), kowVar.h, arrayList, null, gxcVar.a, gxcVar.b, v7g.M(rvf.Q(kowVar.c)), i0Var, s0Var2, o8g.Q(q4qVar.getId().a.a()));
                                        pnl n = a0.n();
                                        n.j(c0Var);
                                        n.i(K);
                                        a0Var = (a0) n.b();
                                    }
                                }
                                nnwVar = new nnw(a0Var, String.valueOf(oowVar), qqw.b);
                                vmwVar.k = 1;
                                if (this.b.emit(nnwVar, vmwVar) == nm6Var2) {
                                }
                            } else {
                                if (oowVar instanceof low) {
                                    low lowVar = (low) oowVar;
                                    eu7 eu7Var2 = lowVar.a;
                                    c5q c5qVar = lowVar.b.b;
                                    cu7 cu7Var2 = eu7Var2.a;
                                    Pair v2 = vq2.v(cu7Var2, lowVar.h);
                                    List list4 = (List) v2.a;
                                    i0 i0Var2 = (i0) v2.b;
                                    List e2 = cu7Var2.e();
                                    e5b e5bVar2 = e5b.a;
                                    e5bVar2.getClass();
                                    asw U2 = y7g.U(e2, new asw(e5bVar2, e5bVar2));
                                    List<jzs> list5 = list4;
                                    ArrayList arrayList4 = new ArrayList(v75.o(list5, 10));
                                    for (jzs jzsVar3 : list5) {
                                        jzsVar3.getClass();
                                        arrayList4.add(o2g.q0(jzsVar3, U2.b(jzsVar3.g)));
                                    }
                                    Map map2 = U2.b;
                                    ArrayList arrayList5 = new ArrayList(map2.size());
                                    for (Map.Entry entry2 : map2.entrySet()) {
                                        arrayList5.add(y7g.V((b6v) entry2.getValue(), ((Number) entry2.getKey()).intValue()));
                                    }
                                    int i6 = eu7Var2.b.b;
                                    gxc gxcVar2 = c5qVar.b;
                                    w P = t7g.P(i6, gxcVar2.a, gxcVar2.b, arrayList5);
                                    int i7 = lowVar.h;
                                    b0 M = v7g.M(rvf.Q(lowVar.c));
                                    gxc gxcVar3 = c5qVar.b;
                                    x K2 = v7g.K(P, i7, arrayList4, null, gxcVar3.a, gxcVar3.b, M, i0Var2, a, null);
                                    pnl n2 = a0.n();
                                    n2.j(c0Var);
                                    n2.i(K2);
                                    a0Var = (a0) n2.b();
                                } else if (oowVar instanceof now) {
                                    now nowVar2 = (now) oowVar;
                                    v80 v80Var = nowVar2.b;
                                    String str = nowVar2.a;
                                    str.getClass();
                                    dhl t = w.t();
                                    ghl i8 = m.i();
                                    i8.d();
                                    m.f((m) i8.b, str);
                                    m mVar = (m) i8.b();
                                    t.d();
                                    w.g((w) t.b, mVar);
                                    w wVar = (w) t.b();
                                    int i9 = nowVar2.e;
                                    List<y1u> list6 = nowVar2.c;
                                    ArrayList arrayList6 = new ArrayList(v75.o(list6, 10));
                                    for (y1u y1uVar2 : list6) {
                                        y1uVar2.getClass();
                                        arrayList6.add(ngg.O(y1uVar2.b, v80Var, y1uVar2.c));
                                    }
                                    String str2 = v80Var.a;
                                    gxc gxcVar4 = v80Var.b;
                                    String str3 = gxcVar4.a;
                                    String str4 = gxcVar4.b;
                                    wnl i10 = b0.i();
                                    i10.d();
                                    b0.f((b0) i10.b, 2);
                                    x K3 = v7g.K(wVar, i9, arrayList6, str2, str3, str4, (b0) i10.b(), null, a, null);
                                    pnl n3 = a0.n();
                                    n3.j(c0Var);
                                    n3.i(K3);
                                    a0Var = (a0) n3.b();
                                } else if (!(oowVar instanceof jow)) {
                                    b6e.s();
                                    break;
                                } else {
                                    jow jowVar = (jow) oowVar;
                                    String h = jowVar.a.h();
                                    dhl t2 = w.t();
                                    ehl i11 = k.i();
                                    i11.h(h);
                                    t2.d();
                                    w.f((w) t2.b, (k) i11.b());
                                    w wVar2 = (w) t2.b();
                                    e5d e5dVar = jowVar.b;
                                    gxc gxcVar5 = jowVar.c;
                                    gxcVar5.getClass();
                                    e5dVar.getClass();
                                    x K4 = v7g.K(wVar2, 0, t75.c(bzf.J(e5dVar.a, lwk.INFINITE, gxcVar5.a, gxcVar5.b, "android-main-app", e5dVar.c, null, e5dVar.e, null)), null, null, null, v7g.M(2), null, a, null);
                                    pnl n4 = a0.n();
                                    n4.j(c0Var);
                                    n4.i(K4);
                                    a0Var = (a0) n4.b();
                                }
                                nnwVar = new nnw(a0Var, String.valueOf(oowVar), qqw.b);
                                vmwVar.k = 1;
                                if (this.b.emit(nnwVar, vmwVar) == nm6Var2) {
                                }
                            }
                        }
                    }
                }
                vmwVar = new vmw(this, continuation);
                Object obj32 = vmwVar.j;
                nm6 nm6Var22 = nm6.a;
                i3 = vmwVar.k;
                if (i3 == 0) {
                }
                break;
        }
        return Unit.a;
    }
}
