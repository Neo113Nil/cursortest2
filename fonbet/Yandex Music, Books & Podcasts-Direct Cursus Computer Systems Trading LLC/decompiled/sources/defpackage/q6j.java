package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class q6j {
    public static final /* synthetic */ s9f[] d = {new yxm(q6j.class, "root", "getRoot()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, q6j.class, "toolbar", "getToolbar()Landroid/view/View;", 0), new yxm(q6j.class, "compose", "getCompose()Landroidx/compose/ui/platform/ComposeView;", 0)};
    public cib a;
    public final q13 b;
    public final q13 c;

    public q6j(View view, hmj hmjVar) {
        q13 q13Var = new q13(new o8f(view, 12));
        this.b = q13Var;
        this.c = new q13(new o8f(view, 13));
        s9f[] s9fVarArr = d;
        zs4.a((ViewGroup) q13Var.a(s9fVarArr[0]));
        s9f s9fVar = s9fVarArr[2];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.no_connection_slot);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
            }
            ((ComposeView) findViewById).setContent(new wn5(new fmj(new s8i(5, this), hmjVar, 0), 1441306406, true));
        } catch (ClassCastException e) {
            l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
            throw null;
        }
    }
}
