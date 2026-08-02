package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qs8 implements dv8 {
    public final Context b;
    public final t1f c;
    public final boolean d;

    public qs8(t tVar, t1f t1fVar, boolean z) {
        tVar.getClass();
        this.b = tVar;
        this.c = t1fVar;
        this.d = z;
    }

    @Override // defpackage.dv8
    public final boolean b(String str) {
        str.getClass();
        return Intrinsics.d(str, "purchase_button") || Intrinsics.d(str, "progress");
    }

    @Override // defpackage.dv8
    public final View c(yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        xzbVar.getClass();
        ComposeView composeView = new ComposeView(this.b, null, 0, 6, null);
        String str = yu8Var.j;
        if (!Intrinsics.d(str, "purchase_button")) {
            if (Intrinsics.d(str, "progress")) {
                composeView.setContent(hld.c);
            }
            return composeView;
        }
        JSONObject jSONObject = yu8Var.i;
        Continuation continuation = null;
        iv8 iv8Var = jSONObject == null ? null : new iv8(wct.C("communication_id", jSONObject), wct.C("action_id", jSONObject));
        if (iv8Var != null) {
            lhk lhkVar = (lhk) this.c.b;
            lhkVar.getClass();
            xdr xdrVar = lhkVar.u;
            if (!Intrinsics.d(xdrVar.getValue(), iv8Var)) {
                xdrVar.m(null, iv8Var);
                yx2 yx2Var = (yx2) lhkVar.r.getValue();
                String str2 = lhkVar.m;
                yx2Var.getClass();
                str2.getClass();
                rdk rdkVar = new rdk(str2);
                lhkVar.s = rdkVar;
                v3n v3nVar = (v3n) rdkVar.D();
                v3nVar.getClass();
                v3n.c(v3nVar, r3n.g);
                rar rarVar = lhkVar.x;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                lhkVar.x = x97.y(ot0.F(lhkVar), null, null, new khk(lhkVar, continuation, 1), 3);
            }
        }
        composeView.setContent(new wn5(new ps8(this, 0), -741504813, true));
        return composeView;
    }

    @Override // defpackage.dv8
    public final void e(View view, yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        view.getClass();
        xzbVar.getClass();
    }

    @Override // defpackage.dv8
    public final void d(View view, yu8 yu8Var) {
    }
}
