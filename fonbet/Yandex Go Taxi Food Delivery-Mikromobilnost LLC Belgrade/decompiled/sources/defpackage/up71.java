package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes7.dex */
public final class up71 implements i281, ny71 {
    public final v871 a;
    public final vd71 b;

    public up71(v871 v871Var, vd71 vd71Var) {
        this.a = v871Var;
        this.b = vd71Var;
    }

    @Override // defpackage.i281
    public final boolean a(Object obj) {
        d171 d171Var = (d171) obj;
        cu81 c = c(d171Var.c);
        v871 v871Var = this.a;
        View b = b((ia71) v871Var);
        boolean z = (b == null || c == null || v871Var == null || !v871Var.c(b, c)) ? false : true;
        vd71 vd71Var = this.b;
        View b2 = b((ia71) vd71Var);
        return z || (b2 != null && vd71Var != null && vd71Var.c(b2, d171Var));
    }

    @Override // defpackage.ny71
    public final void b(Object obj) {
        d171 d171Var = (d171) obj;
        cu81 c = c(d171Var.c);
        v871 v871Var = this.a;
        ImageView imageView = (ImageView) b((ia71) v871Var);
        if (imageView != null && c != null) {
            if (v871Var != null) {
                v871Var.c.a(c, new gs51(6, v871Var, c));
            }
            imageView.setVisibility(0);
        }
        vd71 vd71Var = this.b;
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) b((ia71) vd71Var);
        if (customizableMediaView == null) {
            return;
        }
        if (vd71Var != null) {
            vd71Var.i(d171Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // defpackage.i281
    public final void c(Object obj) {
        d171 d171Var = (d171) obj;
        cu81 c = c(d171Var.c);
        v871 v871Var = this.a;
        ImageView imageView = (ImageView) b((ia71) v871Var);
        if (imageView != null && c != null) {
            if (v871Var != null) {
                v871Var.c.a(c, new gs51(6, v871Var, c));
            }
            imageView.setVisibility(0);
        }
        vd71 vd71Var = this.b;
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) b((ia71) vd71Var);
        if (customizableMediaView != null) {
            if (vd71Var != null) {
                vd71Var.e(customizableMediaView, d171Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // defpackage.i281
    public final boolean d() {
        vd71 vd71Var = this.b;
        boolean z = vd71Var != null && sj71.b(vd71Var.d()) >= 100;
        v871 v871Var = this.a;
        return z || (v871Var != null && sj71.b(v871Var.d()) >= 100);
    }

    @Override // defpackage.i281
    public final boolean e() {
        v871 v871Var;
        vd71 vd71Var = this.b;
        return (vd71Var != null && vd71Var.f()) || ((v871Var = this.a) != null && v871Var.f());
    }

    @Override // defpackage.i281
    public final iv81 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) b((ia71) this.b);
        ImageView imageView = (ImageView) b((ia71) this.a);
        if (customizableMediaView != null) {
            return new iv81(customizableMediaView);
        }
        if (imageView != null) {
            return new iv81(imageView);
        }
        return null;
    }

    @Override // defpackage.i281
    public final void a(uy71 uy71Var, pj71 pj71Var) {
        d171 d171Var = (d171) uy71Var.c;
        v871 v871Var = this.a;
        if (v871Var != null) {
            v871Var.b(uy71Var, pj71Var, c(d171Var.c));
        }
        vd71 vd71Var = this.b;
        if (vd71Var != null) {
            vd71Var.b(uy71Var, pj71Var, d171Var);
        }
    }

    @Override // defpackage.i281
    public final boolean b() {
        vd71 vd71Var = this.b;
        if (vd71Var != null && vd71Var.d() != null) {
            return true;
        }
        v871 v871Var = this.a;
        return (v871Var == null || v871Var.d() == null) ? false : true;
    }

    public static cu81 c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (cu81) list.get(0);
    }

    public static View b(ia71 ia71Var) {
        if (ia71Var != null) {
            return ia71Var.d();
        }
        return null;
    }

    @Override // defpackage.i281
    public final void a() {
        v871 v871Var = this.a;
        ImageView imageView = (ImageView) b((ia71) v871Var);
        if (imageView != null && v871Var != null) {
            imageView.setImageDrawable(null);
            imageView.removeOnLayoutChangeListener(v871Var.e.d);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        vd71 vd71Var = this.b;
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) b((ia71) vd71Var);
        if (customizableMediaView == null || vd71Var == null) {
            return;
        }
        vd71Var.a(customizableMediaView);
    }
}
