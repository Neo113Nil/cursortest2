package defpackage;

import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ij0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ oj0 s;
    public final /* synthetic */ mpf t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij0(oj0 oj0Var, mpf mpfVar, int i) {
        super(1);
        this.r = i;
        this.s = oj0Var;
        this.t = mpfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets g;
        switch (this.r) {
            case 0:
                uzj uzjVar = (uzj) obj;
                AndroidComposeView androidComposeView = uzjVar instanceof AndroidComposeView ? (AndroidComposeView) uzjVar : null;
                oj0 oj0Var = this.s;
                if (androidComposeView != null) {
                    HashMap<oj0, mpf> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    mpf mpfVar = this.t;
                    holderToLayoutNode.put(oj0Var, mpfVar);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(oj0Var);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(mpfVar, oj0Var);
                    oj0Var.setImportantForAccessibility(1);
                    wdu.q(oj0Var, new ke0(androidComposeView, mpfVar, androidComposeView));
                }
                if (oj0Var.getView().getParent() != oj0Var) {
                    oj0Var.addView(oj0Var.getView());
                }
                break;
            case 1:
                sj2.l(this.s, this.t);
                break;
            default:
                mpf mpfVar2 = this.t;
                oj0 oj0Var2 = this.s;
                sj2.l(oj0Var2, mpfVar2);
                ((AndroidComposeView) oj0Var2.c).x = true;
                int[] iArr = oj0Var2.n;
                int i = iArr[0];
                int i2 = iArr[1];
                oj0Var2.getView().getLocationOnScreen(iArr);
                long j = oj0Var2.o;
                long j2 = ((wof) obj).j();
                oj0Var2.o = j2;
                kqv kqvVar = oj0Var2.p;
                if (kqvVar != null && ((i != iArr[0] || i2 != iArr[1] || !hqe.a(j, j2)) && (g = oj0Var2.l(kqvVar).g()) != null)) {
                    oj0Var2.getView().dispatchApplyWindowInsets(g);
                }
                break;
        }
        return Unit.a;
    }
}
