package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.gamericefishpro.space.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {
    public static p1 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public com.gamericefishpro.space.c8.h e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final o1 h = new o1(6);

    public static synchronized p1 b() {
        try {
            if (g == null) {
                g = new p1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        o1 o1Var = h;
        o1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) o1Var.d(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) this.b.get(context);
            drawableNewDrawable = null;
            if (qVar != null && (weakReference = (WeakReference) qVar.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    qVar.f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableK = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableK = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableK = com.gamericefishpro.space.c8.h.k(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableK = com.gamericefishpro.space.c8.h.k(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableK = com.gamericefishpro.space.c8.h.k(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableK == null) {
            return layerDrawableK;
        }
        layerDrawableK.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableK.getConstantState();
                if (constantState2 != null) {
                    com.gamericefishpro.space.t.q qVar2 = (com.gamericefishpro.space.t.q) this.b.get(context);
                    if (qVar2 == null) {
                        qVar2 = new com.gamericefishpro.space.t.q((Object) null);
                        this.b.put(context, qVar2);
                    }
                    qVar2.e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableK;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable drawableA;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof com.gamericefishpro.space.j6.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, drawableA);
            }
            if (drawableA != null) {
                q0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        com.gamericefishpro.space.t.s0 s0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListL = null;
        colorStateList = (weakHashMap == null || (s0Var = (com.gamericefishpro.space.t.s0) weakHashMap.get(context)) == null) ? null : (ColorStateList) s0Var.c(i);
        if (colorStateList == null) {
            com.gamericefishpro.space.c8.h hVar = this.e;
            if (hVar != null) {
                colorStateListL = hVar.l(context, i);
            }
            if (colorStateListL != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                com.gamericefishpro.space.t.s0 s0Var2 = (com.gamericefishpro.space.t.s0) this.a.get(context);
                if (s0Var2 == null) {
                    s0Var2 = new com.gamericefishpro.space.t.s0(0);
                    this.a.put(context, s0Var2);
                }
                s0Var2.a(i, colorStateListL);
            }
            colorStateList = colorStateListL;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    public final Drawable g(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListF = f(context, i);
        if (colorStateListF != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            PorterDuff.Mode mode = null;
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = u1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = q.b;
                com.gamericefishpro.space.c8.h.n(drawableFindDrawableByLayerId, iC, mode2);
                com.gamericefishpro.space.c8.h.n(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), u1.c(context, R.attr.colorControlNormal), mode2);
                com.gamericefishpro.space.c8.h.n(layerDrawable.findDrawableByLayerId(android.R.id.progress), u1.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = u1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = q.b;
                com.gamericefishpro.space.c8.h.n(drawableFindDrawableByLayerId2, iB, mode3);
                com.gamericefishpro.space.c8.h.n(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), u1.c(context, R.attr.colorControlActivated), mode3);
                com.gamericefishpro.space.c8.h.n(layerDrawable2.findDrawableByLayerId(android.R.id.progress), u1.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        com.gamericefishpro.space.c8.h hVar = this.e;
        if (hVar != null) {
            PorterDuff.Mode mode4 = q.b;
            boolean z = true;
            if (com.gamericefishpro.space.c8.h.g((int[]) hVar.a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (com.gamericefishpro.space.c8.h.g((int[]) hVar.c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (com.gamericefishpro.space.c8.h.g((int[]) hVar.d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == 2131165261) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        z = false;
                        i2 = 0;
                    }
                    if (z) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(q.b(u1.c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                    }
                }
                i2 = 16842801;
            }
            iRound = -1;
            if (z) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(q.b(u1.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}
