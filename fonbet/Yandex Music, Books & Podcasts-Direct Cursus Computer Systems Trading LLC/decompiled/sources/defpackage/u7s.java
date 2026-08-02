package defpackage;

import android.view.View;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u7s implements ux8 {
    public gc8 a;
    public cge b;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gc8 gc8Var) {
        String str;
        pm9 E;
        rv8 divData;
        String str2 = null;
        if (gc8Var != null && (divData = gc8Var.getDivData()) != null) {
            str2 = (String) CollectionsKt.firstOrNull(wct.w(divData));
        }
        if (str2 == null) {
            return;
        }
        int ordinal = this.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "restoring";
            } else if (ordinal != 2) {
                if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                    b6e.s();
                    return;
                }
                str = "empty";
            }
            E = kg5.E(str2 + "/" + str);
            if (Intrinsics.d(gc8Var.getDiv2Component$div_release().r().a(gc8Var.getDataTag().a, String.valueOf(E.e())), E.d())) {
                gc8Var.T(E, false);
                return;
            }
            return;
        }
        str = "show_restore_button";
        E = kg5.E(str2 + "/" + str);
        if (Intrinsics.d(gc8Var.getDiv2Component$div_release().r().a(gc8Var.getDataTag().a, String.valueOf(E.e())), E.d())) {
        }
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        this.a = gc8Var;
        a(gc8Var);
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        dp8Var.getClass();
        return sj2.t(dp8Var, "restore_purchase_state");
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        this.a = null;
    }
}
