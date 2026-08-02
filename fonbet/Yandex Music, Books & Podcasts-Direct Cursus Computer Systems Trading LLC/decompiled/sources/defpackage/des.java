package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class des extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ees s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ des(ees eesVar, int i) {
        super(1);
        this.r = i;
        this.s = eesVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        jx7 jx7Var;
        cds cdsVar;
        switch (this.r) {
            case 0:
                List list = (List) obj;
                ees eesVar = this.s;
                w5k S0 = eesVar.S0();
                ges gesVar = eesVar.p;
                a95 a95Var = eesVar.v;
                ges f = ges.f(gesVar, a95Var != null ? a95Var.a() : d85.n, 0L, null, 0L, null, null, 0, 0L, 16777214);
                xof xofVar = S0.o;
                cds cdsVar2 = null;
                if (xofVar != null && (jx7Var = S0.i) != null) {
                    mn0 mn0Var = new mn0(S0.a);
                    if (S0.j != null && S0.n != null) {
                        long j = S0.p & (-8589934589L);
                        c5b c5bVar = c5b.a;
                        int i = S0.f;
                        boolean z = S0.e;
                        int i2 = S0.d;
                        ppc ppcVar = S0.c;
                        cdsVar = new cds(new bds(mn0Var, f, c5bVar, i, z, i2, jx7Var, xofVar, ppcVar, j), new ogi(new dn9(mn0Var, f, c5bVar, jx7Var, ppcVar), j, S0.f, S0.d), S0.l);
                        if (cdsVar != null) {
                            list.add(cdsVar);
                            cdsVar2 = cdsVar;
                        }
                        break;
                    }
                }
                cdsVar = null;
                if (cdsVar != null) {
                }
                break;
            case 1:
                String str = ((mn0) obj).b;
                ees eesVar2 = this.s;
                ces cesVar = eesVar2.z;
                if (cesVar == null) {
                    ces cesVar2 = new ces(eesVar2.o, str);
                    w5k w5kVar = new w5k(str, eesVar2.p, eesVar2.q, eesVar2.r, eesVar2.s, eesVar2.t, eesVar2.u);
                    w5kVar.c(eesVar2.S0().i);
                    cesVar2.d = w5kVar;
                    eesVar2.z = cesVar2;
                } else if (!Intrinsics.d(str, cesVar.b)) {
                    cesVar.b = str;
                    w5k w5kVar2 = cesVar.d;
                    if (w5kVar2 != null) {
                        ges gesVar2 = eesVar2.p;
                        ppc ppcVar2 = eesVar2.q;
                        int i3 = eesVar2.r;
                        boolean z2 = eesVar2.s;
                        int i4 = eesVar2.t;
                        int i5 = eesVar2.u;
                        w5kVar2.a = str;
                        w5kVar2.b = gesVar2;
                        w5kVar2.c = ppcVar2;
                        w5kVar2.d = i3;
                        w5kVar2.e = z2;
                        w5kVar2.f = i4;
                        w5kVar2.g = i5;
                        w5kVar2.b();
                    }
                }
                neg.w(eesVar2);
                h4a.z(eesVar2);
                vq1.Z(eesVar2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ees eesVar3 = this.s;
                ces cesVar3 = eesVar3.z;
                if (cesVar3 != null) {
                    cesVar3.c = booleanValue;
                    neg.w(eesVar3);
                    h4a.z(eesVar3);
                    vq1.Z(eesVar3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
