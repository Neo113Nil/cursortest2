package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import r.AbstractC0341i;
import r.C0340h;
import r.C0343k;
import s.AbstractC0346a;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: g, reason: collision with root package name */
    public static L0 f3847g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3850b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3851c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3852d;
    public C0279t e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3846f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final K0 f3848h = new K0(6);

    public static synchronized L0 b() {
        L0 l02;
        synchronized (L0.class) {
            try {
                if (f3847g == null) {
                    f3847g = new L0();
                }
                l02 = f3847g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (L0.class) {
            K0 k02 = f3848h;
            k02.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) k02.f(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f3851c == null) {
            this.f3851c = new TypedValue();
        }
        TypedValue typedValue = this.f3851c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0340h c0340h = (C0340h) this.f3850b.get(context);
            drawable = null;
            if (c0340h != null) {
                WeakReference weakReference = (WeakReference) c0340h.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2 = AbstractC0346a.b(c0340h.f4315b, c0340h.f4317d, j);
                        if (b2 >= 0) {
                            Object[] objArr = c0340h.f4316c;
                            Object obj = objArr[b2];
                            Object obj2 = AbstractC0341i.f4318a;
                            if (obj != obj2) {
                                objArr[b2] = obj2;
                                c0340h.f4314a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0279t.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0279t.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0279t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C0340h c0340h2 = (C0340h) this.f3850b.get(context);
                        if (c0340h2 == null) {
                            c0340h2 = new C0340h();
                            this.f3850b.put(context, c0340h2);
                        }
                        c0340h2.d(j, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z2) {
        Drawable a2;
        try {
            if (!this.f3852d) {
                this.f3852d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof q0.p) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f3852d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i);
            if (a2 == null) {
                a2 = context.getDrawable(i);
            }
            if (a2 != null) {
                a2 = g(context, i, z2, a2);
            }
            if (a2 != null) {
                AbstractC0265l0.a(a2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        C0343k c0343k;
        WeakHashMap weakHashMap = this.f3849a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c0343k = (C0343k) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0343k.b(i);
        if (colorStateList == null) {
            C0279t c0279t = this.e;
            if (c0279t != null) {
                colorStateList2 = c0279t.d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f3849a == null) {
                    this.f3849a = new WeakHashMap();
                }
                C0343k c0343k2 = (C0343k) this.f3849a.get(context);
                if (c0343k2 == null) {
                    c0343k2 = new C0343k(0);
                    this.f3849a.put(context, c0343k2);
                }
                c0343k2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z2, Drawable drawable) {
        int i2;
        boolean z3;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f2);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            mutate.setTintMode(mode);
            return mutate;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = Q0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0281u.f4026b;
                C0279t.e(findDrawableByLayerId, c2, mode2);
                C0279t.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), Q0.c(context, R.attr.colorControlNormal), mode2);
                C0279t.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), Q0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = Q0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0281u.f4026b;
                C0279t.e(findDrawableByLayerId2, b2, mode3);
                C0279t.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), Q0.c(context, R.attr.colorControlActivated), mode3);
                C0279t.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), Q0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0279t c0279t = this.e;
        boolean z4 = false;
        if (c0279t != null) {
            PorterDuff.Mode mode4 = C0281u.f4026b;
            if (C0279t.a(c0279t.f4019a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0279t.a(c0279t.f4021c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0279t.a(c0279t.f4022d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131165261) {
                    z3 = true;
                    round = Math.round(40.8f);
                    i2 = 16842800;
                    if (z3) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0281u.c(Q0.c(context, i2), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z4 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z3 = false;
                    round = -1;
                    if (z3) {
                    }
                }
                i2 = 16842801;
            }
            z3 = true;
            round = -1;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
