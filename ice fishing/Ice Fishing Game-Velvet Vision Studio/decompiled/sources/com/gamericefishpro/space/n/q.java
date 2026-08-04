package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static q c;
    public p1 a;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return p1.e(i, mode);
    }

    public static synchronized void c() {
        if (c == null) {
            q qVar = new q();
            c = qVar;
            qVar.a = p1.b();
            p1 p1Var = c.a;
            com.gamericefishpro.space.c8.h hVar = new com.gamericefishpro.space.c8.h();
            hVar.a = new int[]{2131165300, 2131165298, 2131165224};
            hVar.b = new int[]{2131165248, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            hVar.c = new int[]{2131165297, 2131165299, 2131165241, R.drawable.abc_text_cursor_material, 2131165294, 2131165295, 2131165296};
            hVar.d = new int[]{2131165273, R.drawable.abc_cab_background_internal_bg, 2131165272};
            hVar.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            hVar.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (p1Var) {
                p1Var.e = hVar;
            }
        }
    }

    public static void d(Drawable drawable, w1 w1Var, int[] iArr) {
        PorterDuff.Mode mode = p1.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = w1Var.d;
            if (!z && !w1Var.c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z ? w1Var.a : null;
            PorterDuff.Mode mode2 = w1Var.c ? w1Var.b : p1.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = p1.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.c(context, i);
    }
}
