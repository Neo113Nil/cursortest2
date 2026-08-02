package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ tt2(ik ikVar, Function2 function2, int i) {
        this.a = i;
        this.b = ikVar;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                qs5 qs5Var = mb6.a;
                oq5 oq5Var2 = (oq5) hq5Var;
                long j = ((d85) oq5Var2.j(sb6.a)).a;
                etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.87f : 1.0f)), ild.C(1047633578, new tt2(this.b, this.c, 1), hq5Var), hq5Var, 56);
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                xp3.a(this.b, a.a(vci.a, "top_app_bar_title"), null, 0, this.c, hq5Var2, 48, 12);
        }
        return Unit.a;
    }
}
