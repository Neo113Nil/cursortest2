package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    public static ResourceManagerInternal INSTANCE;
    public final WeakHashMap mDrawableCaches = new WeakHashMap(0);
    public boolean mHasCheckedVectorDrawableSetup;
    public zzlj mHooks;
    public WeakHashMap mTintLists;
    public TypedValue mTypedValue;
    public static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    public static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    public final class ColorFilterLruCache extends LruCache {
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new ResourceManagerInternal();
                }
                resourceManagerInternal = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return resourceManagerInternal;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
            colorFilterLruCache.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) colorFilterLruCache.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable createDrawableIfNeeded(Context context, int i) {
        Drawable newDrawable;
        LayerDrawable ratingBarLayerDrawable;
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            LongSparseArray longSparseArray = (LongSparseArray) this.mDrawableCaches.get(context);
            if (longSparseArray != null) {
                WeakReference weakReference = (WeakReference) longSparseArray.get(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        longSparseArray.remove(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.mHooks != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                ratingBarLayerDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, R.drawable.abc_cab_background_internal_bg), getDrawable(context, 2131230928)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                ratingBarLayerDrawable = zzlj.getRatingBarLayerDrawable(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                ratingBarLayerDrawable = zzlj.getRatingBarLayerDrawable(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                ratingBarLayerDrawable = zzlj.getRatingBarLayerDrawable(this, context, R.dimen.abc_star_small);
            }
            if (ratingBarLayerDrawable != null) {
                return ratingBarLayerDrawable;
            }
            ratingBarLayerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = ratingBarLayerDrawable.getConstantState();
                    if (constantState2 == null) {
                        return ratingBarLayerDrawable;
                    }
                    LongSparseArray longSparseArray2 = (LongSparseArray) this.mDrawableCaches.get(context);
                    if (longSparseArray2 == null) {
                        longSparseArray2 = new LongSparseArray((Object) null);
                        this.mDrawableCaches.put(context, longSparseArray2);
                    }
                    longSparseArray2.put(new WeakReference(constantState2), j);
                    return ratingBarLayerDrawable;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ratingBarLayerDrawable = null;
        if (ratingBarLayerDrawable != null) {
        }
    }

    public final synchronized Drawable getDrawable(Context context, int i, boolean z) {
        Drawable createDrawableIfNeeded;
        try {
            if (!this.mHasCheckedVectorDrawableSetup) {
                this.mHasCheckedVectorDrawableSetup = true;
                Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
                if (drawable == null || (!(drawable instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName()))) {
                    this.mHasCheckedVectorDrawableSetup = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            createDrawableIfNeeded = createDrawableIfNeeded(context, i);
            if (createDrawableIfNeeded == null) {
                createDrawableIfNeeded = context.getDrawable(i);
            }
            if (createDrawableIfNeeded != null) {
                createDrawableIfNeeded = tintDrawable(context, i, z, createDrawableIfNeeded);
            }
            if (createDrawableIfNeeded != null) {
                DrawableUtils.fixDrawable(createDrawableIfNeeded);
            }
        } catch (Throwable th) {
            throw th;
        }
        return createDrawableIfNeeded;
    }

    public final synchronized ColorStateList getTintList(Context context, int i) {
        ColorStateList colorStateList;
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.mTintLists;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) SieveCacheKt.commonGet(sparseArrayCompat, i);
        if (colorStateList == null) {
            zzlj zzljVar = this.mHooks;
            colorStateList = zzljVar == null ? null : zzljVar.getTintListForDrawableRes(context, i);
            if (colorStateList != null) {
                if (this.mTintLists == null) {
                    this.mTintLists = new WeakHashMap();
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) this.mTintLists.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat((Object) null);
                    this.mTintLists.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.append(i, colorStateList);
            }
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList tintList = getTintList(context, i);
        PorterDuff.Mode mode = null;
        if (tintList != null) {
            Drawable mutate = drawable.mutate();
            DrawableCompat.setTintList(mutate, tintList);
            if (this.mHooks != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                DrawableCompat.setTintMode(mutate, mode);
            }
            return mutate;
        }
        zzlj zzljVar = this.mHooks;
        int i2 = R.attr.colorControlNormal;
        if (zzljVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = AppCompatDrawableManager.DEFAULT_MODE;
                zzlj.setPorterDuffColorFilter(findDrawableByLayerId, themeAttrColor, mode2);
                zzlj.setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), mode2);
                zzlj.setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = AppCompatDrawableManager.DEFAULT_MODE;
                zzlj.setPorterDuffColorFilter(findDrawableByLayerId2, disabledThemeAttrColor, mode3);
                zzlj.setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), mode3);
                zzlj.setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        zzlj zzljVar2 = this.mHooks;
        boolean z3 = false;
        if (zzljVar2 != null) {
            PorterDuff.Mode mode4 = AppCompatDrawableManager.DEFAULT_MODE;
            if (!zzlj.arrayContains(i, (int[]) zzljVar2.zza)) {
                if (zzlj.arrayContains(i, (int[]) zzljVar2.zzc)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean arrayContains = zzlj.arrayContains(i, (int[]) zzljVar2.zze);
                    i2 = android.R.attr.colorBackground;
                    if (arrayContains) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230948) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode4));
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                            z3 = true;
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z2 = false;
                        i2 = 0;
                        round = -1;
                        if (z2) {
                        }
                    }
                }
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

    public final synchronized Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, false);
    }
}
