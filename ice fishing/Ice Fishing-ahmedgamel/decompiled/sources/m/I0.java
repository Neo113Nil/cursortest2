package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.icefishingapp.icefishing.C5275R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q2.C4896n;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: g, reason: collision with root package name */
    public static I0 f39013g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f39015a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f39016b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f39017c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39018d;

    /* renamed from: e, reason: collision with root package name */
    public C4896n f39019e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f39012f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final H0 f39014h = new H0(6);

    public static synchronized I0 b() {
        I0 i02;
        synchronized (I0.class) {
            try {
                if (f39013g == null) {
                    f39013g = new I0();
                }
                i02 = f39013g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (I0.class) {
            H0 h02 = f39014h;
            h02.getClass();
            int i6 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) h02.a(Integer.valueOf(mode.hashCode() + i6));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f39017c == null) {
            this.f39017c = new TypedValue();
        }
        TypedValue typedValue = this.f39017c;
        context.getResources().getValue(i, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.e eVar = (s.e) this.f39016b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.j(j6, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b9 = s.d.b(eVar.f40416u, eVar.f40418w, j6);
                        if (b9 >= 0) {
                            Object[] objArr = eVar.f40417v;
                            Object obj = objArr[b9];
                            Object obj2 = s.e.f40414x;
                            if (obj != obj2) {
                                objArr[b9] = obj2;
                                eVar.f40415n = true;
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
        if (this.f39019e != null) {
            if (i == C5275R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, C5275R.drawable.abc_cab_background_internal_bg), c(context, 2131230777)});
            } else if (i == C5275R.drawable.abc_ratingbar_material) {
                layerDrawable = C4896n.g(this, context, C5275R.dimen.abc_star_big);
            } else if (i == C5275R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C4896n.g(this, context, C5275R.dimen.abc_star_medium);
            } else if (i == C5275R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C4896n.g(this, context, C5275R.dimen.abc_star_small);
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
                    s.e eVar2 = (s.e) this.f39016b.get(context);
                    if (eVar2 == null) {
                        eVar2 = new s.e();
                        this.f39016b.put(context, eVar2);
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

    public final synchronized Drawable d(Context context, int i, boolean z3) {
        Drawable a9;
        try {
            if (!this.f39018d) {
                this.f39018d = true;
                Drawable c9 = c(context, C5275R.drawable.abc_vector_test);
                if (c9 == null || (!(c9 instanceof E0.p) && !"android.graphics.drawable.VectorDrawable".equals(c9.getClass().getName()))) {
                    this.f39018d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a9 = a(context, i);
            if (a9 == null) {
                a9 = E.a.b(context, i);
            }
            if (a9 != null) {
                a9 = g(context, i, z3, a9);
            }
            if (a9 != null) {
                AbstractC4694j0.a(a9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        s.l lVar;
        WeakHashMap weakHashMap = this.f39015a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (s.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C4896n c4896n = this.f39019e;
            if (c4896n != null) {
                colorStateList2 = c4896n.h(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f39015a == null) {
                    this.f39015a = new WeakHashMap();
                }
                s.l lVar2 = (s.l) this.f39015a.get(context);
                if (lVar2 == null) {
                    lVar2 = new s.l();
                    this.f39015a.put(context, lVar2);
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
    public final Drawable g(Context context, int i, boolean z3, Drawable drawable) {
        int i6;
        boolean z6;
        int round;
        ColorStateList f3 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f3 != null) {
            Drawable mutate = drawable.mutate();
            H.a.h(mutate, f3);
            if (this.f39019e != null && i == C5275R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                H.a.i(mutate, mode);
            }
            return mutate;
        }
        if (this.f39019e != null) {
            if (i == C5275R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int c9 = N0.c(context, C5275R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C4710s.f39221b;
                C4896n.m(findDrawableByLayerId, c9, mode2);
                C4896n.m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5275R.attr.colorControlNormal), mode2);
                C4896n.m(layerDrawable.findDrawableByLayerId(R.id.progress), N0.c(context, C5275R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == C5275R.drawable.abc_ratingbar_material || i == C5275R.drawable.abc_ratingbar_indicator_material || i == C5275R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int b9 = N0.b(context, C5275R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C4710s.f39221b;
                C4896n.m(findDrawableByLayerId2, b9, mode3);
                C4896n.m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5275R.attr.colorControlActivated), mode3);
                C4896n.m(layerDrawable2.findDrawableByLayerId(R.id.progress), N0.c(context, C5275R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C4896n c4896n = this.f39019e;
        boolean z9 = false;
        if (c4896n != null) {
            PorterDuff.Mode mode4 = C4710s.f39221b;
            if (C4896n.b((int[]) c4896n.f40192u, i)) {
                i6 = C5275R.attr.colorControlNormal;
            } else if (C4896n.b((int[]) c4896n.f40194w, i)) {
                i6 = C5275R.attr.colorControlActivated;
            } else {
                if (C4896n.b((int[]) c4896n.f40195x, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131230797) {
                    round = Math.round(40.8f);
                    i6 = 16842800;
                    z6 = true;
                    if (z6) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C4710s.c(N0.c(context, i6), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z9 = true;
                    }
                } else if (i != C5275R.drawable.abc_dialog_material_background) {
                    i6 = 0;
                    z6 = false;
                    round = -1;
                    if (z6) {
                    }
                }
                i6 = 16842801;
            }
            z6 = true;
            round = -1;
            if (z6) {
            }
        }
        if (z9 || !z3) {
            return drawable;
        }
        return null;
    }
}
