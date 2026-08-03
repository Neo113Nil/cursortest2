package m;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n1 implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4395g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4396h;

    public n1(s1 s1Var) {
        this.f4396h = s1Var;
        s1Var.f4439a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4395g) {
            case 0:
                o1 o1Var = ((Toolbar) this.f4396h).O;
                l.i iVar = o1Var == null ? null : o1Var.f4421h;
                if (iVar != null) {
                    iVar.collapseActionView();
                    break;
                }
                break;
            default:
                s1 s1Var = (s1) this.f4396h;
                if (s1Var.f4449k != null) {
                    s1Var.getClass();
                    break;
                }
                break;
        }
    }

    public n1(Toolbar toolbar) {
        this.f4396h = toolbar;
    }
}
