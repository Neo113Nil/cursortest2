package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class w2o {
    public static w2o g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public mmo e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final v2o h = new v2o(6, 0);

    public static synchronized w2o c() {
        w2o w2oVar;
        synchronized (w2o.class) {
            try {
                if (g == null) {
                    g = new w2o();
                }
                w2oVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w2oVar;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (w2o.class) {
            v2o v2oVar = h;
            v2oVar.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) v2oVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        q4r q4rVar = (q4r) this.a.get(context);
        if (q4rVar == null) {
            q4rVar = new q4r(0);
            this.a.put(context, q4rVar);
        }
        int i2 = q4rVar.c;
        if (i2 != 0 && i <= q4rVar.a[i2 - 1]) {
            q4rVar.e(i, colorStateList);
            return;
        }
        if (i2 >= q4rVar.a.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            q4rVar.a = Arrays.copyOf(q4rVar.a, i6);
            q4rVar.b = Arrays.copyOf(q4rVar.b, i6);
        }
        q4rVar.a[i2] = i;
        q4rVar.b[i2] = colorStateList;
        q4rVar.c = i2 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable b(Context context, int i) {
        Drawable newDrawable;
        LayerDrawable f0;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            ovg ovgVar = (ovg) this.b.get(context);
            if (ovgVar != null) {
                WeakReference weakReference = (WeakReference) ovgVar.c(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        ovgVar.g(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                f0 = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131230885)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                f0 = mmo.f0(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                f0 = mmo.f0(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                f0 = mmo.f0(this, context, R.dimen.abc_star_small);
            }
            if (f0 != null) {
                return f0;
            }
            f0.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = f0.getConstantState();
                    if (constantState2 == null) {
                        return f0;
                    }
                    ovg ovgVar2 = (ovg) this.b.get(context);
                    if (ovgVar2 == null) {
                        ovgVar2 = new ovg((Object) null);
                        this.b.put(context, ovgVar2);
                    }
                    ovgVar2.f(j, new WeakReference(constantState2));
                    return f0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f0 = null;
        if (f0 != null) {
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable b;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(context, R.drawable.abc_vector_test);
                if (d == null || (!(d instanceof kzt) && !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b = b(context, i);
            if (b == null) {
                b = context.getDrawable(i);
            }
            if (b != null) {
                b = h(context, i, z, b);
            }
            if (b != null) {
                xpa.a(b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        q4r q4rVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (q4rVar = (q4r) weakHashMap.get(context)) == null) ? null : (ColorStateList) q4rVar.c(i);
        if (colorStateList == null) {
            mmo mmoVar = this.e;
            if (mmoVar != null) {
                colorStateList2 = mmoVar.g0(context, i);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        ColorStateList g2 = g(context, i);
        PorterDuff.Mode mode = null;
        if (g2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(g2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        mmo mmoVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (mmoVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c = gfs.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = ir0.b;
                mmo.O0(findDrawableByLayerId, c, mode2);
                mmo.O0(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), gfs.c(context, R.attr.colorControlNormal), mode2);
                mmo.O0(layerDrawable.findDrawableByLayerId(android.R.id.progress), gfs.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b = gfs.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = ir0.b;
                mmo.O0(findDrawableByLayerId2, b, mode3);
                mmo.O0(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), gfs.c(context, R.attr.colorControlActivated), mode3);
                mmo.O0(layerDrawable2.findDrawableByLayerId(android.R.id.progress), gfs.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        mmo mmoVar2 = this.e;
        boolean z3 = false;
        if (mmoVar2 != null) {
            PorterDuff.Mode mode4 = ir0.b;
            if (!mmo.j((int[]) mmoVar2.b, i)) {
                if (mmo.j((int[]) mmoVar2.d, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean j = mmo.j((int[]) mmoVar2.e, i);
                    i2 = android.R.attr.colorBackground;
                    if (j) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230905) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            mutate2.setColorFilter(ir0.c(gfs.c(context, i2), mode4));
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
}
