package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.watchfacestudio.spraktum.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.AbstractC0999a;
import s.AbstractC1044a;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: g, reason: collision with root package name */
    public static N f3186g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f3188a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f3189b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3190c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3191d;

    /* renamed from: e, reason: collision with root package name */
    public Q0.c f3192e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f3185f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final M f3187h = new M(6);

    public static synchronized N b() {
        N n2;
        synchronized (N.class) {
            try {
                if (f3186g == null) {
                    f3186g = new N();
                }
                n2 = f3186g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (N.class) {
            M m2 = f3187h;
            m2.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m2.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Object obj;
        if (this.f3190c == null) {
            this.f3190c = new TypedValue();
        }
        TypedValue typedValue = this.f3190c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            l.e eVar = (l.e) this.f3189b.get(context);
            drawable = null;
            if (eVar != null) {
                int b2 = l.d.b(eVar.f8098b, eVar.f8100d, j2);
                if (b2 < 0 || (obj = eVar.f8099c[b2]) == l.e.f8096e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b3 = l.d.b(eVar.f8098b, eVar.f8100d, j2);
                        if (b3 >= 0) {
                            Object[] objArr = eVar.f8099c;
                            Object obj2 = objArr[b3];
                            Object obj3 = l.e.f8096e;
                            if (obj2 != obj3) {
                                objArr[b3] = obj3;
                                eVar.f8097a = true;
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
        if (this.f3192e != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165201)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        l.e eVar2 = (l.e) this.f3189b.get(context);
                        if (eVar2 == null) {
                            eVar2 = new l.e();
                            this.f3189b.put(context, eVar2);
                        }
                        eVar2.b(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2);
    }

    public final synchronized Drawable d(Context context, int i2) {
        Drawable a2;
        try {
            if (!this.f3191d) {
                this.f3191d = true;
                Drawable c2 = c(context, R.drawable.abc_vector_test);
                if (c2 == null || (!(c2 instanceof T.a) && !"android.graphics.drawable.VectorDrawable".equals(c2.getClass().getName()))) {
                    this.f3191d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a2 = a(context, i2);
            if (a2 == null) {
                a2 = AbstractC0999a.b(context, i2);
            }
            if (a2 != null) {
                a2 = g(context, i2, a2);
            }
            if (a2 != null) {
                Rect rect = AbstractC0227x.f3368a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        int i3;
        l.l lVar;
        Object obj;
        WeakHashMap weakHashMap = this.f3188a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (lVar = (l.l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a2 = l.d.a(lVar.f8128c, i2, lVar.f8126a);
            if (a2 < 0 || (obj = lVar.f8127b[a2]) == l.l.f8125d) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            Q0.c cVar = this.f3192e;
            if (cVar != null) {
                colorStateList2 = cVar.c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f3188a == null) {
                    this.f3188a = new WeakHashMap();
                }
                l.l lVar2 = (l.l) this.f3188a.get(context);
                if (lVar2 == null) {
                    lVar2 = new l.l();
                    int i4 = 4;
                    while (true) {
                        i3 = 40;
                        if (i4 >= 32) {
                            break;
                        }
                        int i5 = (1 << i4) - 12;
                        if (40 <= i5) {
                            i3 = i5;
                            break;
                        }
                        i4++;
                    }
                    int i6 = i3 / 4;
                    lVar2.f8126a = new int[i6];
                    lVar2.f8127b = new Object[i6];
                    this.f3188a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, Drawable drawable) {
        int round;
        PorterDuffColorFilter e2;
        int i3 = R.attr.colorControlNormal;
        int i4 = R.attr.colorControlActivated;
        ColorStateList f2 = f(context, i2);
        if (f2 != null) {
            if (AbstractC0227x.a(drawable)) {
                drawable = drawable.mutate();
            }
            AbstractC1044a.h(drawable, f2);
            PorterDuff.Mode mode = null;
            if (this.f3192e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC1044a.i(drawable, mode);
            }
        } else {
            if (this.f3192e != null) {
                if (i2 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int b2 = f0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C0219o.f3310b;
                    Q0.c.e(findDrawableByLayerId, b2);
                    Q0.c.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), f0.b(context, R.attr.colorControlNormal));
                    Q0.c.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), f0.b(context, R.attr.colorControlActivated));
                } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int a2 = f0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C0219o.f3310b;
                    Q0.c.e(findDrawableByLayerId2, a2);
                    Q0.c.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), f0.b(context, R.attr.colorControlActivated));
                    Q0.c.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), f0.b(context, R.attr.colorControlActivated));
                }
            }
            Q0.c cVar = this.f3192e;
            boolean z2 = false;
            if (cVar != null) {
                PorterDuff.Mode mode4 = C0219o.f3310b;
                if (!Q0.c.a((int[]) cVar.f1518a, i2)) {
                    if (!Q0.c.a((int[]) cVar.f1520c, i2)) {
                        boolean a3 = Q0.c.a((int[]) cVar.f1521d, i2);
                        i4 = android.R.attr.colorBackground;
                        if (a3) {
                            mode4 = PorterDuff.Mode.MULTIPLY;
                        } else if (i2 == 2131165227) {
                            round = Math.round(40.8f);
                            i3 = android.R.attr.colorForeground;
                            z2 = true;
                            if (z2) {
                                Drawable mutate = AbstractC0227x.a(drawable) ? drawable.mutate() : drawable;
                                int b3 = f0.b(context, i3);
                                synchronized (C0219o.class) {
                                    e2 = e(b3, mode4);
                                }
                                mutate.setColorFilter(e2);
                                if (round != -1) {
                                    mutate.setAlpha(round);
                                }
                            }
                        } else if (i2 != R.drawable.abc_dialog_material_background) {
                            i3 = 0;
                            round = -1;
                            if (z2) {
                            }
                        }
                    }
                    i3 = i4;
                }
                z2 = true;
                round = -1;
                if (z2) {
                }
            }
        }
        return drawable;
    }
}
