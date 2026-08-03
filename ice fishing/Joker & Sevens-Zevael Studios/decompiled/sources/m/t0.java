package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: g, reason: collision with root package name */
    public static t0 f4457g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4459a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f4460b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4461c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4462d;

    /* renamed from: e, reason: collision with root package name */
    public d8.m f4463e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f4456f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final s0 f4458h = new s0(6);

    public static synchronized t0 b() {
        t0 t0Var;
        synchronized (t0.class) {
            try {
                if (f4457g == null) {
                    f4457g = new t0();
                }
                t0Var = f4457g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0Var;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t0.class) {
            s0 s0Var = f4458h;
            s0Var.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) s0Var.a(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) {
        Drawable drawable;
        Object obj;
        if (this.f4461c == null) {
            this.f4461c = new TypedValue();
        }
        TypedValue typedValue = this.f4461c;
        context.getResources().getValue(i10, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.o oVar = (s.o) this.f4460b.get(context);
            drawable = null;
            if (oVar != null) {
                int b2 = t.a.b(oVar.f6309h, oVar.f6311j, j3);
                if (b2 < 0 || (obj = oVar.f6310i[b2]) == s.p.f6313a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        oVar.c(j3);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f4463e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165214)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = d8.m.k(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = d8.m.k(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = d8.m.k(this, context, R.dimen.abc_star_small);
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
                    s.o oVar2 = (s.o) this.f4460b.get(context);
                    if (oVar2 == null) {
                        oVar2 = new s.o((Object) null);
                        this.f4460b.put(context, oVar2);
                    }
                    oVar2.b(j3, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i10) {
        return d(context, i10);
    }

    public final synchronized Drawable d(Context context, int i10) {
        Drawable a6;
        try {
            if (!this.f4462d) {
                this.f4462d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof m4.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f4462d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a6 = a(context, i10);
            if (a6 == null) {
                a6 = context.getDrawable(i10);
            }
            if (a6 != null) {
                a6 = g(context, i10, a6);
            }
            if (a6 != null) {
                int i11 = c0.f4278a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a6;
    }

    public final synchronized ColorStateList f(Context context, int i10) {
        ColorStateList colorStateList;
        s.r0 r0Var;
        WeakHashMap weakHashMap = this.f4459a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (r0Var = (s.r0) weakHashMap.get(context)) == null) ? null : (ColorStateList) r0Var.d(i10);
        if (colorStateList == null) {
            d8.m mVar = this.f4463e;
            if (mVar != null) {
                colorStateList2 = mVar.l(context, i10);
            }
            if (colorStateList2 != null) {
                if (this.f4459a == null) {
                    this.f4459a = new WeakHashMap();
                }
                s.r0 r0Var2 = (s.r0) this.f4459a.get(context);
                if (r0Var2 == null) {
                    r0Var2 = new s.r0(0);
                    this.f4459a.put(context, r0Var2);
                }
                r0Var2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i10, Drawable drawable) {
        int i11;
        int round;
        PorterDuffColorFilter e10;
        ColorStateList f10 = f(context, i10);
        if (f10 != null) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(f10);
            PorterDuff.Mode mode = null;
            if (this.f4463e != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
            return drawable;
        }
        if (this.f4463e != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c3 = j1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = o.f4397b;
                d8.m.n(findDrawableByLayerId, c3, mode2);
                d8.m.n(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), j1.c(context, R.attr.colorControlNormal), mode2);
                d8.m.n(layerDrawable.findDrawableByLayerId(android.R.id.progress), j1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = j1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = o.f4397b;
                d8.m.n(findDrawableByLayerId2, b2, mode3);
                d8.m.n(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), j1.c(context, R.attr.colorControlActivated), mode3);
                d8.m.n(layerDrawable2.findDrawableByLayerId(android.R.id.progress), j1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        d8.m mVar = this.f4463e;
        if (mVar != null) {
            PorterDuff.Mode mode4 = o.f4397b;
            boolean z10 = true;
            if (d8.m.g((int[]) mVar.f1797a, i10)) {
                i11 = R.attr.colorControlNormal;
            } else if (d8.m.g((int[]) mVar.f1799c, i10)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (d8.m.g((int[]) mVar.f1800d, i10)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i10 == 2131165234) {
                    round = Math.round(40.8f);
                    i11 = 16842800;
                    if (z10) {
                        Drawable mutate = c0.a(drawable) ? drawable.mutate() : drawable;
                        int c7 = j1.c(context, i11);
                        synchronized (o.class) {
                            e10 = e(c7, mode4);
                        }
                        mutate.setColorFilter(e10);
                        if (round != -1) {
                            mutate.setAlpha(round);
                        }
                    }
                } else if (i10 != R.drawable.abc_dialog_material_background) {
                    z10 = false;
                    i11 = 0;
                }
                i11 = 16842801;
            }
            round = -1;
            if (z10) {
            }
        }
        return drawable;
    }
}
