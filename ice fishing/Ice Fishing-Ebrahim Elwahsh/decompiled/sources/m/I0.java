package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q2.C4903n;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: g, reason: collision with root package name */
    public static I0 f39280g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f39282a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f39283b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f39284c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39285d;

    /* renamed from: e, reason: collision with root package name */
    public C4903n f39286e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f39279f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final H0 f39281h = new H0(6);

    public static synchronized I0 b() {
        I0 i02;
        synchronized (I0.class) {
            try {
                if (f39280g == null) {
                    f39280g = new I0();
                }
                i02 = f39280g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i02;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (I0.class) {
            H0 h02 = f39281h;
            h02.getClass();
            int i4 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) h02.b(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f39284c == null) {
            this.f39284c = new TypedValue();
        }
        TypedValue typedValue = this.f39284c;
        context.getResources().getValue(i, typedValue, true);
        long j9 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            s.e eVar = (s.e) this.f39283b.get(context);
            drawable = null;
            if (eVar != null) {
                WeakReference weakReference = (WeakReference) eVar.j(j9, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b9 = s.d.b(eVar.f40385u, eVar.f40387w, j9);
                        if (b9 >= 0) {
                            Object[] objArr = eVar.f40386v;
                            Object obj = objArr[b9];
                            Object obj2 = s.e.f40383x;
                            if (obj != obj2) {
                                objArr[b9] = obj2;
                                eVar.f40384n = true;
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
        if (this.f39286e != null) {
            if (i == C5284R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, C5284R.drawable.abc_cab_background_internal_bg), c(context, 2131230777)});
            } else if (i == C5284R.drawable.abc_ratingbar_material) {
                layerDrawable = C4903n.g(this, context, C5284R.dimen.abc_star_big);
            } else if (i == C5284R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C4903n.g(this, context, C5284R.dimen.abc_star_medium);
            } else if (i == C5284R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C4903n.g(this, context, C5284R.dimen.abc_star_small);
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
                    s.e eVar2 = (s.e) this.f39283b.get(context);
                    if (eVar2 == null) {
                        eVar2 = new s.e();
                        this.f39283b.put(context, eVar2);
                    }
                    eVar2.k(j9, new WeakReference(constantState2));
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

    public final synchronized Drawable d(Context context, int i, boolean z8) {
        Drawable a9;
        try {
            if (!this.f39285d) {
                this.f39285d = true;
                Drawable c4 = c(context, C5284R.drawable.abc_vector_test);
                if (c4 == null || (!(c4 instanceof E0.p) && !"android.graphics.drawable.VectorDrawable".equals(c4.getClass().getName()))) {
                    this.f39285d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a9 = a(context, i);
            if (a9 == null) {
                a9 = E.a.b(context, i);
            }
            if (a9 != null) {
                a9 = g(context, i, z8, a9);
            }
            if (a9 != null) {
                AbstractC4742j0.a(a9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        s.l lVar;
        WeakHashMap weakHashMap = this.f39282a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (s.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i, null);
        if (colorStateList == null) {
            C4903n c4903n = this.f39286e;
            if (c4903n != null) {
                colorStateList2 = c4903n.h(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f39282a == null) {
                    this.f39282a = new WeakHashMap();
                }
                s.l lVar2 = (s.l) this.f39282a.get(context);
                if (lVar2 == null) {
                    lVar2 = new s.l();
                    this.f39282a.put(context, lVar2);
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
    public final Drawable g(Context context, int i, boolean z8, Drawable drawable) {
        int i4;
        boolean z9;
        int round;
        ColorStateList f6 = f(context, i);
        PorterDuff.Mode mode = null;
        if (f6 != null) {
            Drawable mutate = drawable.mutate();
            H.a.h(mutate, f6);
            if (this.f39286e != null && i == C5284R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                H.a.i(mutate, mode);
            }
            return mutate;
        }
        if (this.f39286e != null) {
            if (i == C5284R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int c4 = N0.c(context, C5284R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C4758s.f39492b;
                C4903n.m(findDrawableByLayerId, c4, mode2);
                C4903n.m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5284R.attr.colorControlNormal), mode2);
                C4903n.m(layerDrawable.findDrawableByLayerId(R.id.progress), N0.c(context, C5284R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == C5284R.drawable.abc_ratingbar_material || i == C5284R.drawable.abc_ratingbar_indicator_material || i == C5284R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int b9 = N0.b(context, C5284R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C4758s.f39492b;
                C4903n.m(findDrawableByLayerId2, b9, mode3);
                C4903n.m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), N0.c(context, C5284R.attr.colorControlActivated), mode3);
                C4903n.m(layerDrawable2.findDrawableByLayerId(R.id.progress), N0.c(context, C5284R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C4903n c4903n = this.f39286e;
        boolean z10 = false;
        if (c4903n != null) {
            PorterDuff.Mode mode4 = C4758s.f39492b;
            if (C4903n.b((int[]) c4903n.f40101u, i)) {
                i4 = C5284R.attr.colorControlNormal;
            } else if (C4903n.b((int[]) c4903n.f40103w, i)) {
                i4 = C5284R.attr.colorControlActivated;
            } else {
                if (C4903n.b((int[]) c4903n.f40104x, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131230797) {
                    round = Math.round(40.8f);
                    i4 = 16842800;
                    z9 = true;
                    if (z9) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C4758s.c(N0.c(context, i4), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z10 = true;
                    }
                } else if (i != C5284R.drawable.abc_dialog_material_background) {
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
        if (z10 || !z8) {
            return drawable;
        }
        return null;
    }
}
