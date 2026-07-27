package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineRedux {
    public static CatchingFishCoroutineRedux CatchingFishViewModelScope;
    public TypedValue CatchingFishCoroutine;
    public CatchingFishViewWorkManager CatchingFishDaggerWebsocket;
    public WeakHashMap CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public final WeakHashMap CatchingFishSnackbar = new WeakHashMap(0);
    public static final PorterDuff.Mode CatchingFishWorkManager = PorterDuff.Mode.SRC_IN;
    public static final CatchingFishJUnitParcelable CatchingFishViewModelFAB = new CatchingFishJUnitParcelable(6);

    public static synchronized PorterDuffColorFilter CatchingFishDaggerWebsocket(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (CatchingFishCoroutineRedux.class) {
            CatchingFishJUnitParcelable catchingFishJUnitParcelable = CatchingFishViewModelFAB;
            catchingFishJUnitParcelable.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) catchingFishJUnitParcelable.CatchingFishWorkManager(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized CatchingFishCoroutineRedux CatchingFishSnackbar() {
        CatchingFishCoroutineRedux catchingFishCoroutineRedux;
        synchronized (CatchingFishCoroutineRedux.class) {
            try {
                if (CatchingFishViewModelScope == null) {
                    CatchingFishViewModelScope = new CatchingFishCoroutineRedux();
                }
                catchingFishCoroutineRedux = CatchingFishViewModelScope;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishCoroutineRedux;
    }

    public final synchronized Drawable CatchingFishCoroutine(Context context, int i) {
        return CatchingFishReduxKtor(context, i, false);
    }

    public final Drawable CatchingFishParcelableFAB(Context context, int i) {
        Drawable drawable;
        if (this.CatchingFishCoroutine == null) {
            this.CatchingFishCoroutine = new TypedValue();
        }
        TypedValue typedValue = this.CatchingFishCoroutine;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) this.CatchingFishSnackbar.get(context);
            drawable = null;
            if (catchingFishLayoutMVVMFlux != null) {
                WeakReference weakReference = (WeakReference) catchingFishLayoutMVVMFlux.CatchingFishSnackbar(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        catchingFishLayoutMVVMFlux.CatchingFishWorkManager(j);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.CatchingFishDaggerWebsocket != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{CatchingFishCoroutine(context, R.drawable.abc_cab_background_internal_bg), CatchingFishCoroutine(context, 2131165242)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = CatchingFishViewWorkManager.CatchingFishUnitTesting(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = CatchingFishViewWorkManager.CatchingFishUnitTesting(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = CatchingFishViewWorkManager.CatchingFishUnitTesting(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux2 = (CatchingFishLayoutMVVMFlux) this.CatchingFishSnackbar.get(context);
                    if (catchingFishLayoutMVVMFlux2 == null) {
                        catchingFishLayoutMVVMFlux2 = new CatchingFishLayoutMVVMFlux((Object) null);
                        this.CatchingFishSnackbar.put(context, catchingFishLayoutMVVMFlux2);
                    }
                    catchingFishLayoutMVVMFlux2.CatchingFishDaggerWebsocket(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable CatchingFishReduxKtor(Context context, int i, boolean z) {
        Drawable CatchingFishParcelableFAB;
        try {
            if (!this.CatchingFishReduxKtor) {
                this.CatchingFishReduxKtor = true;
                Drawable CatchingFishCoroutine = CatchingFishCoroutine(context, R.drawable.abc_vector_test);
                if (CatchingFishCoroutine == null || (!(CatchingFishCoroutine instanceof CatchingFishPayPalRoomFlux) && !"android.graphics.drawable.VectorDrawable".equals(CatchingFishCoroutine.getClass().getName()))) {
                    this.CatchingFishReduxKtor = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            CatchingFishParcelableFAB = CatchingFishParcelableFAB(context, i);
            if (CatchingFishParcelableFAB == null) {
                CatchingFishParcelableFAB = context.getDrawable(i);
            }
            if (CatchingFishParcelableFAB != null) {
                CatchingFishParcelableFAB = CatchingFishViewModelScope(context, i, z, CatchingFishParcelableFAB);
            }
            if (CatchingFishParcelableFAB != null) {
                CatchingFishRealmPicasso.CatchingFishParcelableFAB(CatchingFishParcelableFAB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return CatchingFishParcelableFAB;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable CatchingFishViewModelScope(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int round;
        ColorStateList CatchingFishWorkManager2 = CatchingFishWorkManager(context, i);
        PorterDuff.Mode mode = null;
        if (CatchingFishWorkManager2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(CatchingFishWorkManager2);
            if (this.CatchingFishDaggerWebsocket != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.CatchingFishDaggerWebsocket != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int CatchingFishCoroutine = CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = CatchingFishPicassoMVPJUnit.CatchingFishSnackbar;
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(findDrawableByLayerId, CatchingFishCoroutine, mode2);
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlNormal), mode2);
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(layerDrawable.findDrawableByLayerId(android.R.id.progress), CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int CatchingFishSnackbar = CatchingFishKtorWorkManager.CatchingFishSnackbar(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = CatchingFishPicassoMVPJUnit.CatchingFishSnackbar;
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(findDrawableByLayerId2, CatchingFishSnackbar, mode3);
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlActivated), mode3);
                CatchingFishViewWorkManager.CatchingFishRoomDatabase(layerDrawable2.findDrawableByLayerId(android.R.id.progress), CatchingFishKtorWorkManager.CatchingFishCoroutine(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishDaggerWebsocket;
        boolean z3 = false;
        if (catchingFishViewWorkManager != null) {
            PorterDuff.Mode mode4 = CatchingFishPicassoMVPJUnit.CatchingFishSnackbar;
            if (CatchingFishViewWorkManager.CatchingFishFragmentHandler((int[]) catchingFishViewWorkManager.CatchingFishReduxKtor, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (CatchingFishViewWorkManager.CatchingFishFragmentHandler((int[]) catchingFishViewWorkManager.CatchingFishWorkManager, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (CatchingFishViewWorkManager.CatchingFishFragmentHandler((int[]) catchingFishViewWorkManager.CatchingFishViewModelScope, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165262) {
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(CatchingFishPicassoMVPJUnit.CatchingFishCoroutine(CatchingFishKtorWorkManager.CatchingFishCoroutine(context, i2), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z3 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z2 = false;
                    round = -1;
                    if (z2) {
                    }
                }
                i2 = 16842801;
            }
            z2 = true;
            round = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }

    public final synchronized ColorStateList CatchingFishWorkManager(Context context, int i) {
        ColorStateList colorStateList;
        CatchingFishGsonAsyncTask catchingFishGsonAsyncTask;
        WeakHashMap weakHashMap = this.CatchingFishParcelableFAB;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (catchingFishGsonAsyncTask = (CatchingFishGsonAsyncTask) weakHashMap.get(context)) == null) ? null : (ColorStateList) catchingFishGsonAsyncTask.CatchingFishCoroutine(i);
        if (colorStateList == null) {
            CatchingFishViewWorkManager catchingFishViewWorkManager = this.CatchingFishDaggerWebsocket;
            if (catchingFishViewWorkManager != null) {
                colorStateList2 = catchingFishViewWorkManager.CatchingFishAnimationMockk(context, i);
            }
            if (colorStateList2 != null) {
                if (this.CatchingFishParcelableFAB == null) {
                    this.CatchingFishParcelableFAB = new WeakHashMap();
                }
                CatchingFishGsonAsyncTask catchingFishGsonAsyncTask2 = (CatchingFishGsonAsyncTask) this.CatchingFishParcelableFAB.get(context);
                if (catchingFishGsonAsyncTask2 == null) {
                    catchingFishGsonAsyncTask2 = new CatchingFishGsonAsyncTask(0);
                    this.CatchingFishParcelableFAB.put(context, catchingFishGsonAsyncTask2);
                }
                catchingFishGsonAsyncTask2.CatchingFishParcelableFAB(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }
}
