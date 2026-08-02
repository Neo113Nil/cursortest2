package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik b;

    public /* synthetic */ dk(ik ikVar, int i) {
        this.a = i;
        this.b = ikVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                xp3.a(this.b, a.a(vciVar, "top_app_bar_title"), null, 0, null, hq5Var, 48, 28);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                xp3.a(this.b, a.a(vciVar, "top_app_bar_title"), null, 0, null, hq5Var2, 48, 28);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xp3.a(this.b, null, nu0.d(), 2, null, hq5Var3, 3072, 18);
            default:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                xp3.a(this.b, a.a(vciVar, "top_app_bar_title"), null, 0, null, hq5Var4, 48, 28);
        }
        return Unit.a;
    }
}
