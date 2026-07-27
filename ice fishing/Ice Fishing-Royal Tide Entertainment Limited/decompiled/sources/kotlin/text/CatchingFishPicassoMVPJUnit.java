package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishPicassoMVPJUnit {
    public static CatchingFishPicassoMVPJUnit CatchingFishCoroutine;
    public static final PorterDuff.Mode CatchingFishSnackbar = PorterDuff.Mode.SRC_IN;
    public CatchingFishCoroutineRedux CatchingFishParcelableFAB;

    public static synchronized PorterDuffColorFilter CatchingFishCoroutine(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter CatchingFishDaggerWebsocket;
        synchronized (CatchingFishPicassoMVPJUnit.class) {
            CatchingFishDaggerWebsocket = CatchingFishCoroutineRedux.CatchingFishDaggerWebsocket(i, mode);
        }
        return CatchingFishDaggerWebsocket;
    }

    public static void CatchingFishDaggerWebsocket(Drawable drawable, CatchingFishFABDaggerHilt catchingFishFABDaggerHilt, int[] iArr) {
        PorterDuff.Mode mode = CatchingFishCoroutineRedux.CatchingFishWorkManager;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = catchingFishFABDaggerHilt.CatchingFishSnackbar;
            if (!z && !catchingFishFABDaggerHilt.CatchingFishParcelableFAB) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) catchingFishFABDaggerHilt.CatchingFishCoroutine : null;
            PorterDuff.Mode mode2 = catchingFishFABDaggerHilt.CatchingFishParcelableFAB ? (PorterDuff.Mode) catchingFishFABDaggerHilt.CatchingFishReduxKtor : CatchingFishCoroutineRedux.CatchingFishWorkManager;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = CatchingFishCoroutineRedux.CatchingFishDaggerWebsocket(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public static synchronized CatchingFishPicassoMVPJUnit CatchingFishParcelableFAB() {
        CatchingFishPicassoMVPJUnit catchingFishPicassoMVPJUnit;
        synchronized (CatchingFishPicassoMVPJUnit.class) {
            try {
                if (CatchingFishCoroutine == null) {
                    CatchingFishReduxKtor();
                }
                catchingFishPicassoMVPJUnit = CatchingFishCoroutine;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishPicassoMVPJUnit;
    }

    public static synchronized void CatchingFishReduxKtor() {
        synchronized (CatchingFishPicassoMVPJUnit.class) {
            if (CatchingFishCoroutine == null) {
                CatchingFishPicassoMVPJUnit catchingFishPicassoMVPJUnit = new CatchingFishPicassoMVPJUnit();
                CatchingFishCoroutine = catchingFishPicassoMVPJUnit;
                catchingFishPicassoMVPJUnit.CatchingFishParcelableFAB = CatchingFishCoroutineRedux.CatchingFishSnackbar();
                CatchingFishCoroutineRedux catchingFishCoroutineRedux = CatchingFishCoroutine.CatchingFishParcelableFAB;
                CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
                catchingFishViewWorkManager.CatchingFishReduxKtor = new int[]{2131165301, 2131165299, 2131165225};
                catchingFishViewWorkManager.CatchingFishDaggerWebsocket = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                catchingFishViewWorkManager.CatchingFishWorkManager = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
                catchingFishViewWorkManager.CatchingFishViewModelScope = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
                catchingFishViewWorkManager.CatchingFishViewModelFAB = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                catchingFishViewWorkManager.CatchingFishLayout = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (catchingFishCoroutineRedux) {
                    catchingFishCoroutineRedux.CatchingFishDaggerWebsocket = catchingFishViewWorkManager;
                }
            }
        }
    }

    public final synchronized Drawable CatchingFishSnackbar(Context context, int i) {
        return this.CatchingFishParcelableFAB.CatchingFishCoroutine(context, i);
    }
}
