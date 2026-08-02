package defpackage;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import yads.gm1;

/* loaded from: classes7.dex */
public final class xz71 extends vd71 {
    public final i971 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz71(CustomizableMediaView customizableMediaView, dx71 dx71Var, j981 j981Var) {
        super(customizableMediaView, j981Var);
        i971 i971Var = new i971(1, dx71Var);
        this.d = i971Var;
    }

    @Override // defpackage.ia71
    public final void a(View view) {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) view;
        this.d.y();
        customizableMediaView.setVisibility(8);
        customizableMediaView.setOnClickListener(null);
        customizableMediaView.setOnTouchListener(null);
        customizableMediaView.setSelected(false);
    }

    @Override // defpackage.ia71
    public final void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        d171 d171Var = (d171) obj;
        this.d.z(uy71Var, pj71Var, d171Var != null ? d171Var.a : null);
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        lg71 lg71Var = ((d171) obj).a;
        if (lg71Var != null) {
            return this.d.C(lg71Var);
        }
        return false;
    }

    @Override // defpackage.vd71
    public final void g(CustomizableMediaView customizableMediaView) {
        this.d.y();
    }

    @Override // defpackage.vd71
    /* renamed from: h */
    public final void e(CustomizableMediaView customizableMediaView, d171 d171Var) {
        super.e(customizableMediaView, d171Var);
        lg71 lg71Var = d171Var.a;
        if (lg71Var == null) {
            return;
        }
        this.d.D(lg71Var);
    }

    @Override // defpackage.vd71
    public final void i(d171 d171Var) {
    }

    @Override // defpackage.vd71
    public final gm1 j() {
        return gm1.c;
    }
}
