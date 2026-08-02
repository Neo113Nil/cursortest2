package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s9s extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t9s s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9s(t9s t9sVar, int i) {
        super(1);
        this.r = i;
        this.s = t9sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cds cdsVar;
        switch (this.r) {
            case 0:
                List list = (List) obj;
                t9s t9sVar = this.s;
                cds cdsVar2 = t9sVar.T0().n;
                if (cdsVar2 != null) {
                    bds bdsVar = cdsVar2.a;
                    mn0 mn0Var = bdsVar.a;
                    ges gesVar = t9sVar.p;
                    a95 a95Var = t9sVar.z;
                    cdsVar = new cds(new bds(mn0Var, ges.f(gesVar, a95Var != null ? a95Var.a() : d85.n, 0L, null, 0L, null, null, 0, 0L, 16777214), bdsVar.c, bdsVar.d, bdsVar.e, bdsVar.f, bdsVar.g, bdsVar.h, bdsVar.i, bdsVar.j), cdsVar2.b, cdsVar2.c);
                    list.add(cdsVar);
                } else {
                    cdsVar = null;
                }
                break;
            case 1:
                mn0 mn0Var2 = (mn0) obj;
                t9s t9sVar2 = this.s;
                r9s r9sVar = t9sVar2.E;
                if (r9sVar == null) {
                    r9s r9sVar2 = new r9s(t9sVar2.o, mn0Var2);
                    qgi qgiVar = new qgi(mn0Var2, t9sVar2.p, t9sVar2.q, t9sVar2.s, t9sVar2.t, t9sVar2.u, t9sVar2.v, c5b.a);
                    qgiVar.c(t9sVar2.T0().j);
                    r9sVar2.d = qgiVar;
                    t9sVar2.E = r9sVar2;
                } else if (!Intrinsics.d(mn0Var2, r9sVar.b)) {
                    r9sVar.b = mn0Var2;
                    qgi qgiVar2 = r9sVar.d;
                    if (qgiVar2 != null) {
                        qgiVar2.f(mn0Var2, t9sVar2.p, t9sVar2.q, t9sVar2.s, t9sVar2.t, t9sVar2.u, t9sVar2.v, c5b.a);
                    }
                }
                neg.w(t9sVar2);
                h4a.z(t9sVar2);
                vq1.Z(t9sVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                t9s t9sVar3 = this.s;
                r9s r9sVar3 = t9sVar3.E;
                if (r9sVar3 != null) {
                    Function1 function1 = t9sVar3.A;
                    if (function1 != null) {
                        function1.invoke(r9sVar3);
                    }
                    r9s r9sVar4 = t9sVar3.E;
                    if (r9sVar4 != null) {
                        r9sVar4.c = booleanValue;
                    }
                    neg.w(t9sVar3);
                    h4a.z(t9sVar3);
                    vq1.Z(t9sVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
