package defpackage;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;
import yads.gm1;

/* loaded from: classes7.dex */
public final class yw71 extends vd71 {
    public final i971 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw71(CustomizableMediaView customizableMediaView, v871 v871Var, j981 j981Var) {
        super(customizableMediaView, j981Var);
        i971 i971Var = new i971(1, v871Var);
        this.d = i971Var;
    }

    public static cu81 k(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (cu81) list.get(0);
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
        this.d.z(uy71Var, pj71Var, k(d171Var != null ? d171Var.c : null));
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        cu81 k = k(((d171) obj).c);
        if (k != null) {
            return this.d.C(k);
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
        cu81 k = k(d171Var.c);
        if (k == null) {
            return;
        }
        this.d.D(k);
    }

    @Override // defpackage.vd71
    public final void i(d171 d171Var) {
        cu81 k = k(d171Var.c);
        if (k == null) {
            return;
        }
        this.d.D(k);
    }

    @Override // defpackage.vd71
    public final gm1 j() {
        return gm1.f;
    }
}
