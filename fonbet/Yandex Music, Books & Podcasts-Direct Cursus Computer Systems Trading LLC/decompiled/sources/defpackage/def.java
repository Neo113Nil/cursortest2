package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class def implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gef b;
    public final /* synthetic */ jef c;
    public final /* synthetic */ qnq d;
    public final /* synthetic */ ub7 e;

    public /* synthetic */ def(gef gefVar, jef jefVar, qnq qnqVar, ub7 ub7Var, int i) {
        this.a = i;
        this.b = gefVar;
        this.c = jefVar;
        this.d = qnqVar;
        this.e = ub7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(147555700, new def(this.b, this.c, this.d, this.e, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    String M = rvf.M(R.string.kids_catalog_title, oq5Var2);
                    gef gefVar = this.b;
                    nt0.q(M, this.c, gefVar.x(), this.d, ((uoq) gefVar.k.getValue()).e, oq5Var2, 4608);
                    rzf.j(this.e, a.l(vci.a, ogp.A(oq5Var2)), oq5Var2, 0, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
