package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class elg {
    public static final qs5 a = new qs5(grb.w0);

    public static rpj a(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        rpj rpjVar = (rpj) oq5Var.j(a);
        if (rpjVar == null) {
            oq5Var.Z(544166745);
            rpjVar = uwf.o((View) oq5Var.j(AndroidCompositionLocals_androidKt.f));
            oq5Var.p(false);
        } else {
            oq5Var.Z(544164296);
            oq5Var.p(false);
        }
        if (rpjVar != null) {
            oq5Var.Z(544164377);
            oq5Var.p(false);
            return rpjVar;
        }
        oq5Var.Z(544168748);
        Object obj = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(obj instanceof ContextWrapper)) {
                obj = null;
                break;
            }
            if (obj instanceof rpj) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        rpj rpjVar2 = (rpj) obj;
        oq5Var.p(false);
        return rpjVar2;
    }
}
