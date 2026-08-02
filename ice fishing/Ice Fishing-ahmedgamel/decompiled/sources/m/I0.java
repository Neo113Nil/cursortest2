package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import s2.C4945n;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: g, reason: collision with root package name */
    public static I0 f39081g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f39083a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f39084b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f39085c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39086d;

    /* renamed from: e, reason: collision with root package name */
    public C4945n f39087e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f39080f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final H0 f39082h = new H0(6);

    public static synchronized I0 b() {
        I0 i02;
        synchronized (I0.class) {
            try {
                if (f39081g == null) {
                    f39081g = new I0();
                }
                i02 = f39081g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (I0.class) {
            H0 h02 = f39082h;
            h02.getClass();
            int i4 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) h02.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f39085c == null) {
            this.f39085c = new TypedValue();
        }
        TypedValue typedValue = this.f39085c;
        context.getResources().getValue(i, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.e eVar = (s.e) this.f39084b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.j(j6, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b9 = s.d.b(eVar.f40252u, eVar.f40254w, j6);
                        if (b9 >= 0) {
                            Object[] objArr = eVar.f40253v;
                            Object obj = objArr[b9];
                            Object obj2 = s.e.f40250x;
                            if (obj != obj2) {
                                objArr[b9] = obj2;
                                eVar.f40251n = true;
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
        if (this.f39087e != null) {
            if (i == C5248R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, C5248R.drawable.abc_cab_background_internal_bg), c(context, 2131230777)});
            } else if (i == C5248R.drawable.abc_ratingbar_material) {
                layerDrawable = C4945n.g(this, context, C5248R.dimen.abc_star_big);
            } else if (i == C5248R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C4945n.g(this, context, C5248R.dimen.abc_star_medium);
            } else if (i == C5248R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C4945n.g(this, context, C5248R.dimen.abc_star_small);
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
                    s.e eVar2 = (s.e) this.f39084b.get(context);
                    if (eVar2 == null) {
                        eVar2 = new s.e();
                        this.f39084b.put(context, eVar2);
                    }
                    eVar2.k(j6, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z6) {
        Drawable a9;
        try {
            if (!this.f39086d) {
                this.f39086d = true;
                Drawable c9 = c(context, C5248R.drawable.abc_vector_test);
                if (c9 == null || (!(c9 instanceof E0.p) && !"android.graphics.drawable.VectorDrawable".equals(c9.getClass().getName()))) {
                    this.f39086d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a9 = a(context, i);
            if (a9 == null) {
                a9 = E.a.b(context, i);
            }
            if (a9 != null) {
                a9 = g(context, i, z6, a9);
            }
            if (a9 != null) {
                AbstractC4707j0.a(a9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        s.l lVar;
        WeakHashMap weakHashMap = this.f39083a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (s.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C4945n c4945n = this.f39087e;
            if (c4945n != null) {
                colorStateList2 = c4945n.h(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f39083a == null) {
                    this.f39083a = new WeakHashMap();
                }
                s.l lVar2 = (s.l) this.f39083a.get(context);
                if (lVar2 == null) {
                    lVar2 = new s.l();
                    this.f39083a.put(context, lVar2);
                }
                lVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i, boolean z6, Drawable drawable) {
        int i4;
        boolean z9;
        int round;
        ColorStateList f2 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f2 != null) {
            Drawable mutate = drawable.mutate();
            H.a.h(mutate, f2);
            if (this.f39087e != null && i == C5248R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                H.a.i(mutate, mode);
            }
            return mutate;
        }
        if (this.f39087e != null) {
            if (i == C5248R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int c9 = N0.c(context, C5248R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C4723s.f39290b;
                C4945n.m(findDrawableByLayerId, c9, mode2);
                C4945n.m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5248R.attr.colorControlNormal), mode2);
                C4945n.m(layerDrawable.findDrawableByLayerId(R.id.progress), N0.c(context, C5248R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == C5248R.drawable.abc_ratingbar_material || i == C5248R.drawable.abc_ratingbar_indicator_material || i == C5248R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int b9 = N0.b(context, C5248R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C4723s.f39290b;
                C4945n.m(findDrawableByLayerId2, b9, mode3);
                C4945n.m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5248R.attr.colorControlActivated), mode3);
                C4945n.m(layerDrawable2.findDrawableByLayerId(R.id.progress), N0.c(context, C5248R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C4945n c4945n = this.f39087e;
        boolean z10 = false;
        if (c4945n != null) {
            PorterDuff.Mode mode4 = C4723s.f39290b;
            if (C4945n.b((int[]) c4945n.f40491u, i)) {
                i4 = C5248R.attr.colorControlNormal;
            } else if (C4945n.b((int[]) c4945n.f40493w, i)) {
                i4 = C5248R.attr.colorControlActivated;
            } else {
                if (C4945n.b((int[]) c4945n.f40494x, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131230797) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z9 = true;
                    if (z9) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C4723s.c(N0.c(context, i4), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z10 = true;
                    }
                } else if (i != C5248R.drawable.abc_dialog_material_background) {
                    i4 = 0;
                    z9 = false;
                    round = -1;
                    if (z9) {
                    }
                }
                i4 = 16842801;
            }
            z9 = true;
            round = -1;
            if (z9) {
            }
        }
        if (z10 || !z6) {
            return drawable;
        }
        return null;
    }
}
