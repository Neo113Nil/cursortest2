package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qql extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ grl n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qql(int i, grl grlVar, Continuation continuation) {
        super(3, continuation);
        this.j = i;
        this.n = grlVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                qql qqlVar = new qql(0, this.n, continuation);
                qqlVar.l = rjcVar;
                qqlVar.m = obj2;
                return qqlVar.invokeSuspend(Unit.a);
            default:
                qql qqlVar2 = new qql(1, this.n, continuation);
                qqlVar2.l = rjcVar;
                qqlVar2.m = obj2;
                return qqlVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc ailVar;
        kkl kklVar;
        boolean z;
        j1g j1gVar;
        p5n p5nVar;
        qpl qplVar;
        z3h z3hVar;
        pjc erlVar;
        z3h z3hVar2;
        String b;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rjc rjcVar = this.l;
                e6l e6lVar = (e6l) this.m;
                if (Intrinsics.d(e6lVar, b6l.a)) {
                    ailVar = new fs(15, iql.a);
                } else if (e6lVar instanceof c6l) {
                    ailVar = new fs(15, jql.a);
                } else {
                    if (!(e6lVar instanceof d6l)) {
                        b6e.s();
                        return null;
                    }
                    ailVar = new ail(1, jf0.z(this.n.y, h01.t), e6lVar);
                }
                this.l = null;
                this.m = null;
                this.k = 1;
                if (zsd.e0(rjcVar, ailVar, this) == nm6Var) {
                    return nm6Var;
                }
                return Unit.a;
            default:
                grl grlVar = this.n;
                kkl kklVar2 = grlVar.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rjc rjcVar2 = this.l;
                ujc ujcVar = (ujc) this.m;
                lql lqlVar = ujcVar.a;
                boolean z2 = ujcVar.b;
                j1g j1gVar2 = ujcVar.c;
                p5n p5nVar2 = ujcVar.d;
                qpl qplVar2 = ujcVar.e;
                h4q h4qVar = ujcVar.f;
                uz7 uz7Var = ujcVar.g;
                o3h o3hVar = ujcVar.h;
                boolean z3 = ujcVar.i;
                if (lqlVar instanceof kql) {
                    n7q n7qVar = ((kql) lqlVar).a;
                    if (o3hVar != null) {
                        String str = o3hVar.a.a;
                        mqs a = n7qVar.b().a();
                        if (Intrinsics.d(str, a != null ? a.a : null)) {
                            y5g y5gVar = o3hVar.b;
                            if (y5gVar instanceof e2h) {
                                u3h u3hVar = grlVar.m;
                                g1h g1hVar = ((e2h) y5gVar).a;
                                u3hVar.getClass();
                                g1hVar.getClass();
                                r2h r2hVar = g1hVar.f;
                                kklVar = kklVar2;
                                String str2 = g1hVar.d.b;
                                z = z2;
                                List list = g1hVar.e;
                                int ordinal = r2hVar.ordinal();
                                j1gVar = j1gVar2;
                                if (ordinal == 0) {
                                    p5nVar = p5nVar2;
                                    qplVar = qplVar2;
                                    kn0 kn0Var = new kn0();
                                    kn0Var.d(g1hVar.g);
                                    int i3 = 0;
                                    for (int i4 = 3; i3 < i4; i4 = 3) {
                                        kn0Var.append('\n');
                                        i3++;
                                    }
                                    int g = kn0Var.g(new c4r(d85.b(d85.f, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                                    if (list != null) {
                                        try {
                                            b = u3hVar.b(list);
                                        } catch (Throwable th) {
                                            kn0Var.f(g);
                                            throw th;
                                        }
                                    } else {
                                        b = null;
                                    }
                                    String a2 = str2 != null ? u3hVar.a(str2) : null;
                                    if (b != null) {
                                        kn0Var.d(b);
                                        kn0Var.append('\n');
                                    }
                                    if (a2 != null) {
                                        kn0Var.d(a2);
                                    }
                                    kn0Var.f(g);
                                    z3hVar2 = new zfr(kn0Var.h());
                                } else {
                                    if (ordinal != 1 && ordinal != 2) {
                                        b6e.s();
                                        return null;
                                    }
                                    String b2 = list != null ? u3hVar.b(list) : null;
                                    String a3 = str2 != null ? u3hVar.a(str2) : null;
                                    StringBuilder sb = new StringBuilder();
                                    if (b2 != null) {
                                        sb.append(b2);
                                    }
                                    sb.append('\n');
                                    if (a3 != null) {
                                        sb.append(a3);
                                    }
                                    String sb2 = sb.toString();
                                    List<wwr> list2 = g1hVar.h;
                                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                                    for (wwr wwrVar : list2) {
                                        arrayList.add(new ywr(wwrVar.a, wwrVar.b));
                                        p5nVar2 = p5nVar2;
                                        qplVar2 = qplVar2;
                                    }
                                    p5nVar = p5nVar2;
                                    qplVar = qplVar2;
                                    z3hVar2 = new zwr(sb2, arrayList, 3);
                                }
                                z3hVar = z3hVar2;
                            } else {
                                kklVar = kklVar2;
                                z = z2;
                                j1gVar = j1gVar2;
                                p5nVar = p5nVar2;
                                qplVar = qplVar2;
                                if (y5gVar.equals(f2h.a)) {
                                    z3hVar2 = zwr.d;
                                    z3hVar = z3hVar2;
                                } else {
                                    if (!(y5gVar instanceof g2h)) {
                                        b6e.s();
                                        return null;
                                    }
                                    z3hVar = null;
                                }
                            }
                            Resources resources = grlVar.l;
                            jkl jklVar = grlVar.r;
                            kklVar.getClass();
                            ybl yblVar = new ybl();
                            kklVar.getClass();
                            wt5 wt5Var = new wt5(3);
                            n7qVar.getClass();
                            resources.getClass();
                            jklVar.getClass();
                            uz7Var.getClass();
                            erlVar = new erl(new qm((pjc) wdg.A(n7qVar, new n3m(resources, jklVar, uz7Var, wt5Var)), n7qVar, uz7Var, yblVar, 6), n7qVar, z, grlVar, j1gVar, p5nVar, qplVar, h4qVar, z3hVar, z3);
                        }
                    }
                    kklVar = kklVar2;
                    z = z2;
                    j1gVar = j1gVar2;
                    p5nVar = p5nVar2;
                    qplVar = qplVar2;
                    z3hVar = null;
                    Resources resources2 = grlVar.l;
                    jkl jklVar2 = grlVar.r;
                    kklVar.getClass();
                    ybl yblVar2 = new ybl();
                    kklVar.getClass();
                    wt5 wt5Var2 = new wt5(3);
                    n7qVar.getClass();
                    resources2.getClass();
                    jklVar2.getClass();
                    uz7Var.getClass();
                    erlVar = new erl(new qm((pjc) wdg.A(n7qVar, new n3m(resources2, jklVar2, uz7Var, wt5Var2)), n7qVar, uz7Var, yblVar2, 6), n7qVar, z, grlVar, j1gVar, p5nVar, qplVar, h4qVar, z3hVar, z3);
                } else {
                    erlVar = new fs(15, qnl.a);
                }
                this.l = null;
                this.m = null;
                this.k = 1;
                if (zsd.e0(rjcVar2, erlVar, this) == nm6Var2) {
                    return nm6Var2;
                }
                return Unit.a;
        }
    }
}
