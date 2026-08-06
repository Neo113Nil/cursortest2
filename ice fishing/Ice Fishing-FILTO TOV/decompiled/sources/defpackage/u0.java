package defpackage;

import android.content.Context;
import android.view.View;
import com.combinations.level.experts.R;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ u0(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                v0 v0Var = (v0) this.EljAMC1QTz;
                Context context = view.getContext();
                if (!v0Var.xqGvceK5x) {
                    context.getApplicationContext().registerComponentCallbacks(v0Var.OOA6hdeuvCS);
                    v0Var.xqGvceK5x = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                v0 v0Var = (v0) obj;
                Context context = view.getContext();
                if (v0Var.xqGvceK5x) {
                    context.getApplicationContext().unregisterComponentCallbacks(v0Var.OOA6hdeuvCS);
                    v0Var.xqGvceK5x = false;
                    break;
                }
                break;
            case 1:
                WIEu4Ya2g8 wIEu4Ya2g8 = (WIEu4Ya2g8) obj;
                for (Object obj2 : x01.EXrPz3p7hFb(wIEu4Ya2g8.getParent(), se1.E7jCp8Ls)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                wIEu4Ya2g8.EljAMC1QTz();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((f51) obj).GWasM1elztuh(null);
                break;
        }
    }

    private final void GWasM1elztuh(View view) {
    }

    private final void Yi7zF1RB1(View view) {
    }
}
