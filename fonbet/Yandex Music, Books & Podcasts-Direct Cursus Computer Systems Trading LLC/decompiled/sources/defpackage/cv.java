package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;
    public final /* synthetic */ jab c;

    public /* synthetic */ cv(j00 j00Var, jab jabVar, int i) {
        this.a = i;
        this.b = j00Var;
        this.c = jabVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Boolean bool;
        switch (this.a) {
            case 0:
                j00 j00Var = this.b;
                mt mtVar = j00Var.f;
                ff ffVar = mtVar.c;
                if (ffVar == null || (str = ffVar.b) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    oq oqVar = mtVar.a;
                    dfi.r(hrg.s("Acton button url for album ", oqVar.b, " with id = ", oqVar.a, " is null or empty."), "AlbumScreenPresenter");
                } else {
                    rmb.k(j00Var.h.a(this.c, null), str, null, null, 6);
                    dy dyVar = j00Var.d;
                    boolean booleanValue = (ffVar == null || (bool = ffVar.d) == null) ? true : bool.booleanValue();
                    dyVar.getClass();
                    w1g.y((t) dyVar.d.b, str, booleanValue);
                }
                break;
            case 1:
                j00 j00Var2 = this.b;
                rmb.j(j00Var2.h.a(this.c, null), wjb.AlbumListScreen, null, null, 14);
                String str2 = j00Var2.f.a.m;
                if (str2 != null) {
                    j00Var2.g.a(new gz(str2));
                }
                break;
            default:
                j00 j00Var3 = this.b;
                rmb.a(j00Var3.h.a(this.c, null), sjb.Refresh, null, null, 14);
                e10 e10Var = j00Var3.c;
                e10Var.getClass();
                ssg.a(3, "AlbumScreenViewModel", "onOfflineModeDisabled()", null);
                xdr xdrVar = e10Var.B;
                xdrVar.getClass();
                xdrVar.m(null, jy.a);
                x97.y(ot0.F(e10Var), null, null, new v00(e10Var, null, 5), 3);
                break;
        }
        return Unit.a;
    }
}
