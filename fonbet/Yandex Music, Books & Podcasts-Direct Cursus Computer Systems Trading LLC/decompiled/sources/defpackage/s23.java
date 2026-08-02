package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s23 extends uif implements Function1 {
    public final /* synthetic */ int r = 2;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s23(t23 t23Var, n3m n3mVar, String str, boolean z, String str2, xzi xziVar) {
        super(1);
        this.s = t23Var;
        this.x = n3mVar;
        this.t = str;
        this.u = z;
        this.v = str2;
        this.w = xziVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wof wofVar;
        wof wofVar2;
        int i = this.r;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.v;
        Object obj5 = this.w;
        Object obj6 = this.x;
        switch (i) {
            case 0:
                jos josVar = (jos) obj;
                josVar.getClass();
                t23 t23Var = (t23) obj3;
                String e = eta.e();
                String str = (String) obj2;
                kos kosVar = josVar.a;
                lwt lwtVar = new lwt(e, t23Var.h, str, kosVar.a, kosVar.b, ((xle) obj6).a, this.u, (String) obj4);
                g0c g0cVar = t23Var.k;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k("Верификация новой карты при привязке через Vera", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(k, "event_name", "verify_binding", "verify_binding", k);
                yop C = t23Var.f.a.C(lwtVar, k9i.u, p1j.a);
                ((x60) g0cVar).b(j, C);
                return mif.a(C, new al(21, t23Var, (xzi) obj5), null, 5);
            case 1:
                xle xleVar = (xle) obj;
                xleVar.getClass();
                t23 t23Var2 = (t23) obj3;
                qre qreVar = xleVar.b;
                t23Var2.n.invoke(qreVar);
                ((x60) t23Var2.k).a(gut.M(qreVar != null ? qreVar.a : null));
                return mif.a(t23Var2.e.b((n3m) obj6, xleVar.a), new s23(t23Var2, (String) obj2, xleVar, this.u, (String) obj4, (xzi) obj5), null, 5);
            default:
                wof wofVar3 = (wof) obj;
                ybs ybsVar = (ybs) obj6;
                qbs qbsVar = (qbs) obj4;
                axf axfVar = (axf) obj3;
                x6k x6kVar = axfVar.o;
                axfVar.h = wofVar3;
                dds d = axfVar.d();
                if (d != null) {
                    d.b = wofVar3;
                }
                if (this.u) {
                    if (axfVar.a() == zrd.b) {
                        if (((Boolean) axfVar.l.getValue()).booleanValue() && ((Boolean) ((dwf) ((kpv) obj2)).c.getValue()).booleanValue()) {
                            qbsVar.p();
                        } else {
                            qbsVar.l();
                        }
                        axfVar.m.setValue(Boolean.valueOf(a0g.B(qbsVar, true)));
                        axfVar.n.setValue(Boolean.valueOf(a0g.B(qbsVar, false)));
                        x6kVar.setValue(Boolean.valueOf(rds.b(ybsVar.b)));
                    } else if (axfVar.a() == zrd.c) {
                        x6kVar.setValue(Boolean.valueOf(a0g.B(qbsVar, true)));
                    }
                    j66.l0(axfVar, ybsVar, (mnj) obj5);
                    dds d2 = axfVar.d();
                    if (d2 != null) {
                        ybs ybsVar2 = (ybs) obj6;
                        mnj mnjVar = (mnj) obj5;
                        pcs pcsVar = axfVar.e;
                        if (pcsVar != null && axfVar.b() && (wofVar = d2.b) != null && wofVar.d() && (wofVar2 = d2.c) != null) {
                            cds cdsVar = d2.a;
                            hxo hxoVar = new hxo(18, wofVar);
                            ynn U = weo.U(wofVar);
                            ynn y = wofVar.y(wofVar2, false);
                            if (Intrinsics.d((pcs) pcsVar.a.b.get(), pcsVar)) {
                                pcsVar.b.h(ybsVar2, mnjVar, cdsVar, hxoVar, U, y);
                            }
                        }
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s23(t23 t23Var, String str, xle xleVar, boolean z, String str2, xzi xziVar) {
        super(1);
        this.s = t23Var;
        this.t = str;
        this.x = xleVar;
        this.u = z;
        this.v = str2;
        this.w = xziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s23(axf axfVar, boolean z, kpv kpvVar, qbs qbsVar, ybs ybsVar, mnj mnjVar) {
        super(1);
        this.s = axfVar;
        this.u = z;
        this.t = kpvVar;
        this.v = qbsVar;
        this.x = ybsVar;
        this.w = mnjVar;
    }
}
