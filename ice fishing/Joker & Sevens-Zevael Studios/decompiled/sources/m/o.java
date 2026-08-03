package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f4397b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static o f4398c;

    /* renamed from: a, reason: collision with root package name */
    public t0 f4399a;

    public static synchronized void b() {
        synchronized (o.class) {
            if (f4398c == null) {
                o oVar = new o();
                f4398c = oVar;
                oVar.f4399a = t0.b();
                t0 t0Var = f4398c.f4399a;
                d8.m mVar = new d8.m();
                mVar.f1797a = new int[]{2131165273, 2131165271, 2131165197};
                mVar.f1798b = new int[]{2131165221, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                mVar.f1799c = new int[]{2131165270, 2131165272, 2131165214, R.drawable.abc_text_cursor_material, 2131165267, 2131165268, 2131165269};
                mVar.f1800d = new int[]{2131165246, R.drawable.abc_cab_background_internal_bg, 2131165245};
                mVar.f1801e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                mVar.f1802f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (t0Var) {
                    t0Var.f4463e = mVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, l1 l1Var, int[] iArr) {
        PorterDuff.Mode mode = t0.f4456f;
        if (c0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = l1Var.f4383d;
        if (!z10 && !l1Var.f4382c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z10 ? l1Var.f4380a : null;
        PorterDuff.Mode mode2 = l1Var.f4382c ? l1Var.f4381b : t0.f4456f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = t0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i10) {
        return this.f4399a.c(context, i10);
    }
}
