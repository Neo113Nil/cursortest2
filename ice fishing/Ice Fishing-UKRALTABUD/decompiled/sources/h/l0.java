package h;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2219f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2220g;

    public l0(q0 q0Var) {
        this.f2220g = q0Var;
        q0Var.f2244a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2219f) {
            case 0:
                m0 m0Var = ((Toolbar) this.f2220g).f1263N;
                g.k kVar = m0Var == null ? null : m0Var.f2225g;
                if (kVar != null) {
                    kVar.collapseActionView();
                    break;
                }
                break;
            default:
                q0 q0Var = (q0) this.f2220g;
                if (q0Var.f2254k != null) {
                    q0Var.getClass();
                    break;
                }
                break;
        }
    }

    public l0(Toolbar toolbar) {
        this.f2220g = toolbar;
    }
}
