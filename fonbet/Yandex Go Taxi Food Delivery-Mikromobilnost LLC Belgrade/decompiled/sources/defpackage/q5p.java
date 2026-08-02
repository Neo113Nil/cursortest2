package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class q5p implements jg5 {
    public final /* synthetic */ int a;
    public final lg5 b;

    public /* synthetic */ q5p(lg5 lg5Var, int i) {
        this.a = i;
        this.b = lg5Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        int i = this.a;
        lg5 lg5Var = this.b;
        switch (i) {
            case 0:
                if (ig5Var instanceof p5p) {
                    lg5Var.getClass();
                    break;
                }
                break;
            case 1:
                if (ig5Var instanceof zhu) {
                    lg5Var.getClass();
                    break;
                }
                break;
            case 2:
                if (ig5Var instanceof dpq0) {
                    dpq0 dpq0Var = (dpq0) ig5Var;
                    b bVar = dpq0Var.b;
                    Map map = null;
                    if (bVar != null) {
                        c cVar = bVar instanceof c ? (c) bVar : null;
                        Object i2 = cVar != null ? bia1.i(cVar) : null;
                        if (i2 instanceof Map) {
                            map = (Map) i2;
                        }
                    }
                    lg5Var.c(dpq0Var.a, map);
                    break;
                }
                break;
            case 3:
                if (ig5Var instanceof g4r0) {
                    lg5Var.getClass();
                    break;
                }
                break;
            case 4:
                if (ig5Var instanceof q1u0) {
                    lg5Var.getClass();
                    break;
                }
                break;
            default:
                if (ig5Var instanceof ngy0) {
                    ngy0 ngy0Var = (ngy0) ig5Var;
                    lg5Var.d(ngy0Var.a, ngy0Var.b, ngy0Var.c);
                    break;
                }
                break;
        }
    }
}
