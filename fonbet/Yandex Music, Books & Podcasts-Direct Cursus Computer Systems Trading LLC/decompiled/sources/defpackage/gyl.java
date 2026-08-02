package defpackage;

import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class gyl implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yxl b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ qzl d;

    public /* synthetic */ gyl(yxl yxlVar, qzl qzlVar, jab jabVar) {
        this.a = 0;
        this.b = yxlVar;
        this.d = qzlVar;
        this.c = jabVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a aVar = (a) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                aVar.getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    p1g.m(((sxl) this.b).a, this.d, this.c, androidx.compose.ui.platform.a.a(vci.a, "similar_entities"), oq5Var, 3072);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                aVar.getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    v3g.j((txl) this.b, this.c, this.d, null, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                aVar.getClass();
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 17) != 16)) {
                    a0g.k((qxl) this.b, this.c, this.d, null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gyl(int i, jab jabVar, yxl yxlVar, qzl qzlVar) {
        this.a = i;
        this.b = yxlVar;
        this.c = jabVar;
        this.d = qzlVar;
    }
}
