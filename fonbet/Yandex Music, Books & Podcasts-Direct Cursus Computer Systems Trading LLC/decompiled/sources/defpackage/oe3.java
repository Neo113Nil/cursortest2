package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class oe3 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public oe3(yci yciVar, fvf fvfVar, o0k o0kVar) {
        this.a = 0;
        float f = edo.a;
        this.b = yciVar;
        this.c = fvfVar;
        this.d = o0kVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                float f = edo.a;
                ug3.a(d.d(androidx.compose.ui.layout.a.b((yci) obj6, new ne3((fvf) obj5, (o0k) obj4)), 1.0f), hq5Var, 0);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ((i10) obj3).getClass();
                ((pu4) obj6).a((oab) obj5, (spd) obj4, booleanValue, str);
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                ((i10) obj3).getClass();
                ((pu4) obj6).a((pab) obj5, (spd) obj4, booleanValue2, str2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oe3(pu4 pu4Var, qab qabVar, spd spdVar, int i) {
        this.a = i;
        this.b = pu4Var;
        this.c = qabVar;
        this.d = spdVar;
    }
}
