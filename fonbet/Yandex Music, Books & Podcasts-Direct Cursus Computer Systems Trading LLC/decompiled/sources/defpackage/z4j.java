package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class z4j implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ z4j(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    ug3.a(a.a(gdg.L(d.c(vci.a, 1.0f), (cVar.d() / cVar.c()) * 1.5f, 2.0f), new afn(u75.h(new d85(this.b), new d85(this.c)), null, 9205357640488583168L, Float.POSITIVE_INFINITY)), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                xcs.b(String.valueOf(this.b), null, ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.b, this.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.d(), hq5Var2, 3072, 0, 65522);
                break;
        }
        return Unit.a;
    }
}
