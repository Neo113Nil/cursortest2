package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.insets.ProtectionLayout;
import java.util.List;

/* loaded from: classes10.dex */
public final class rkn extends qkn {
    @Override // defpackage.pkn, defpackage.nkn
    public void a(b2x0 b2x0Var, b2x0 b2x0Var2, Window window, View view, boolean z, boolean z2) {
        jl40.L(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int a = b2x0Var.a(z);
            int a2 = b2x0Var2.a(z2);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new ProtectionLayout(viewGroup.getContext(), (List<buf0>) scc.g(new yfc(2, a), new yfc(1, a2), new yfc(4, a2), new yfc(8, a2))));
        }
        window.setNavigationBarContrastEnforced(b2x0Var2.c == 0);
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        q751Var.U(!z);
        q751Var.T(!z2);
    }
}
