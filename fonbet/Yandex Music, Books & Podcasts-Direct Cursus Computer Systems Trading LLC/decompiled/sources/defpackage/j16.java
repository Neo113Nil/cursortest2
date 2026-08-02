package defpackage;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class j16 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pud b;

    public /* synthetic */ j16(pud pudVar, int i) {
        this.a = i;
        this.b = pudVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ct5 ct5Var = this.b.d;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ges d = nu0.d();
                ges c = nu0.c();
                cds a = ids.a(o5g.O(0, 1, hq5Var), ct5Var.c, d, 2, false, 2, cVar.b, 968);
                xcs.b(ct5Var.c, null, d85.b(((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, a.c() ? c : d, hq5Var, 0, 3120, 55290);
            default:
                ct5 ct5Var2 = this.b.d;
                c cVar2 = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                ges d2 = nu0.d();
                ges c2 = nu0.c();
                cds a2 = ids.a(o5g.O(0, 1, hq5Var2), ct5Var2.c, d2, 2, false, 2, cVar2.b, 968);
                xcs.b(ct5Var2.c, null, d85.b(((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, a2.c() ? c2 : d2, hq5Var2, 0, 3120, 55290);
        }
        return Unit.a;
    }
}
