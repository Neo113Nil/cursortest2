package defpackage;

import android.view.View;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class si9 extends p9 {
    public static void G(cj9 cj9Var, qi9 qi9Var, xzb xzbVar) {
        if (qi9Var == null) {
            cj9Var.setDividerColor(335544320);
            cj9Var.setHorizontal(true);
        } else {
            cj9Var.setDividerColor(((Number) qi9Var.a.a(xzbVar)).intValue());
            cj9Var.setHorizontal(((pi9) qi9Var.b.a(xzbVar)) == pi9.HORIZONTAL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (defpackage.xp3.B(r3 != null ? r3.b : null, r1 != null ? r1.b : null) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (defpackage.xp3.V(r3 != null ? r3.b : null) != false) goto L48;
     */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        szb szbVar;
        szb szbVar2;
        cj9 cj9Var = (cj9) view;
        ri9 ri9Var = (ri9) dp8Var;
        ri9 ri9Var2 = (ri9) dp8Var2;
        bg3.k(cj9Var, e23Var, ri9Var.b, ri9Var.d, ri9Var.x, ri9Var.o, ri9Var.u, ri9Var.t, ri9Var.B, ri9Var.A, ri9Var.c, ri9Var.k);
        qi9 qi9Var = ri9Var.m;
        ja8 ja8Var = null;
        qi9 qi9Var2 = ri9Var2 != null ? ri9Var2.m : null;
        xzb xzbVar = e23Var.b;
        if (xp3.B(qi9Var != null ? qi9Var.a : null, qi9Var2 != null ? qi9Var2.a : null)) {
        }
        G(cj9Var, qi9Var, xzbVar);
        if (xp3.V(qi9Var != null ? qi9Var.a : null)) {
        }
        lj0 lj0Var = new lj0(this, cj9Var, qi9Var, xzbVar, 24);
        cj9Var = cj9Var;
        cj9Var.i((qi9Var == null || (szbVar2 = qi9Var.a) == null) ? null : szbVar2.c(xzbVar, lj0Var));
        if (qi9Var != null && (szbVar = qi9Var.b) != null) {
            ja8Var = szbVar.c(xzbVar, lj0Var);
        }
        cj9Var.i(ja8Var);
        cj9Var.setDividerHeightResource(R.dimen.div_separator_delimiter_height);
        cj9Var.setDividerGravity(17);
    }
}
