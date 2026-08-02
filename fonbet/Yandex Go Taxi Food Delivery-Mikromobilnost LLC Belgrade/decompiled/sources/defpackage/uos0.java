package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class uos0 {
    public final ul5 a;

    public uos0(ul5 ul5Var) {
        this.a = ul5Var;
    }

    public final boolean a(pex0 pex0Var) {
        wu1 wu1Var;
        i3y i3yVar = this.a.a;
        if (!((tos0) ((qqo) i3yVar.getValue()).b()).b) {
            return false;
        }
        String str = null;
        boolean G = a.G(((tos0) ((qqo) i3yVar.getValue()).b()).c, pex0Var != null ? pex0Var.b : null);
        List list = ((tos0) ((qqo) i3yVar.getValue()).b()).d;
        if (pex0Var != null && (wu1Var = pex0Var.O) != null) {
            str = wu1Var.a();
        }
        return G || a.G(list, str);
    }
}
