package h;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3273a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3274b;

    public i0(n0 n0Var) {
        this.f3274b = n0Var;
        n0Var.f3297a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3273a) {
            case 0:
                j0 j0Var = ((Toolbar) this.f3274b).f2216I;
                g.k kVar = j0Var == null ? null : j0Var.f3276b;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                n0 n0Var = (n0) this.f3274b;
                if (n0Var.f3307k != null) {
                    n0Var.getClass();
                    break;
                }
                break;
        }
    }

    public i0(Toolbar toolbar) {
        this.f3274b = toolbar;
    }
}
