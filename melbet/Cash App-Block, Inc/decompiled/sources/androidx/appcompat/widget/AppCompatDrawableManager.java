package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.R;

/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    public static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    public static AppCompatDrawableManager INSTANCE;
    public ResourceManagerInternal mResourceManager;

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (INSTANCE == null) {
                    preload();
                }
                appCompatDrawableManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                ResourceManagerInternal resourceManagerInternal = INSTANCE.mResourceManager;
                zzlj zzljVar = new zzlj();
                zzljVar.zza = new int[]{2131230987, 2131230985, 2131230911};
                zzljVar.zzb = new int[]{2131230935, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                zzljVar.zzc = new int[]{2131230984, 2131230986, 2131230928, R.drawable.abc_text_cursor_material, 2131230981, 2131230982, 2131230983};
                zzljVar.zze = new int[]{2131230960, R.drawable.abc_cab_background_internal_bg, 2131230959};
                zzljVar.zzd = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                zzljVar.zzf = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (resourceManagerInternal) {
                    resourceManagerInternal.mHooks = zzljVar;
                }
            }
        }
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.DEFAULT_MODE;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.mHasTintList;
        if (!z && !tintInfo.mHasTintMode) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) tintInfo.mTintList : null;
        PorterDuff.Mode mode2 = tintInfo.mHasTintMode ? (PorterDuff.Mode) tintInfo.mTintMode : ResourceManagerInternal.DEFAULT_MODE;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable getDrawable(Context context, int i) {
        return this.mResourceManager.getDrawable(context, i);
    }
}
