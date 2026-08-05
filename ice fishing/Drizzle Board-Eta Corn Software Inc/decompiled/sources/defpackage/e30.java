package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e30 {
    public static final PorterDuff.Mode P7K7Inc8 = PorterDuff.Mode.SRC_IN;
    public static final d30 Qr9iLBAD = new d30(6);
    public static e30 b2ZJblxo;
    public TypedValue MdtA4re8;
    public final WeakHashMap NCTxEWno = new WeakHashMap(0);
    public bp9dZ9BB VgvYg0wo;
    public WeakHashMap qoPGr6Ce;
    public boolean wxUZMvaN;

    public static synchronized e30 MdtA4re8() {
        e30 e30Var;
        synchronized (e30.class) {
            e30Var = b2ZJblxo;
            if (e30Var == null) {
                e30Var = new e30();
                b2ZJblxo = e30Var;
            }
        }
        return e30Var;
    }

    public static synchronized PorterDuffColorFilter P7K7Inc8(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (e30.class) {
            d30 d30Var = Qr9iLBAD;
            d30Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) d30Var.Qr9iLBAD(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void jb9XjC4I(Drawable drawable, rc0 rc0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = rc0Var.wxUZMvaN;
        if (!z && !rc0Var.MdtA4re8) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? rc0Var.qoPGr6Ce : null;
        PorterDuff.Mode mode = rc0Var.MdtA4re8 ? rc0Var.NCTxEWno : P7K7Inc8;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = P7K7Inc8(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final Drawable NCTxEWno(Context context, int i) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        TypedValue typedValue = this.MdtA4re8;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.MdtA4re8 = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            lq lqVar = (lq) this.NCTxEWno.get(context);
            layerDrawable = null;
            if (lqVar != null) {
                WeakReference weakReference = (WeakReference) lqVar.NCTxEWno(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b2ZJblxo2 = le0.b2ZJblxo(lqVar.MdtA4re8, lqVar.VgvYg0wo, j);
                        if (b2ZJblxo2 >= 0) {
                            Object[] objArr = lqVar.wxUZMvaN;
                            Object obj = objArr[b2ZJblxo2];
                            Object obj2 = w30.VgvYg0wo;
                            if (obj != obj2) {
                                objArr[b2ZJblxo2] = obj2;
                                lqVar.NCTxEWno = true;
                            }
                        }
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.VgvYg0wo != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{wxUZMvaN(context, R.drawable.abc_cab_background_internal_bg), wxUZMvaN(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = bp9dZ9BB.wxUZMvaN(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = bp9dZ9BB.wxUZMvaN(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = bp9dZ9BB.wxUZMvaN(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                lq lqVar2 = (lq) this.NCTxEWno.get(context);
                if (lqVar2 == null) {
                    lqVar2 = new lq();
                    this.NCTxEWno.put(context, lqVar2);
                }
                lqVar2.wxUZMvaN(j, new WeakReference(constantState2));
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable Qr9iLBAD(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int round;
        PorterDuffColorFilter P7K7Inc82;
        ColorStateList b2ZJblxo2 = b2ZJblxo(context, i);
        PorterDuff.Mode mode = null;
        if (b2ZJblxo2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(b2ZJblxo2);
            if (this.VgvYg0wo != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        bp9dZ9BB bp9dz9bb = this.VgvYg0wo;
        int i2 = R.attr.colorControlNormal;
        if (bp9dz9bb != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int MdtA4re8 = ic0.MdtA4re8(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j5BPOSYv.NCTxEWno;
                bp9dZ9BB.P7K7Inc8(findDrawableByLayerId, MdtA4re8, mode2);
                bp9dZ9BB.P7K7Inc8(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ic0.MdtA4re8(context, R.attr.colorControlNormal), mode2);
                bp9dZ9BB.P7K7Inc8(layerDrawable.findDrawableByLayerId(android.R.id.progress), ic0.MdtA4re8(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int NCTxEWno = ic0.NCTxEWno(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j5BPOSYv.NCTxEWno;
                bp9dZ9BB.P7K7Inc8(findDrawableByLayerId2, NCTxEWno, mode3);
                bp9dZ9BB.P7K7Inc8(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ic0.MdtA4re8(context, R.attr.colorControlActivated), mode3);
                bp9dZ9BB.P7K7Inc8(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ic0.MdtA4re8(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        bp9dZ9BB bp9dz9bb2 = this.VgvYg0wo;
        boolean z3 = false;
        if (bp9dz9bb2 != null) {
            PorterDuff.Mode mode4 = j5BPOSYv.NCTxEWno;
            if (!bp9dZ9BB.qoPGr6Ce((int[]) bp9dz9bb2.qoPGr6Ce, i)) {
                if (bp9dZ9BB.qoPGr6Ce((int[]) bp9dz9bb2.MdtA4re8, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean qoPGr6Ce = bp9dZ9BB.qoPGr6Ce((int[]) bp9dz9bb2.wxUZMvaN, i);
                    i2 = android.R.attr.colorBackground;
                    if (qoPGr6Ce) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165261) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable mutate2 = drawable.mutate();
                            int MdtA4re82 = ic0.MdtA4re8(context, i2);
                            synchronized (j5BPOSYv.class) {
                                P7K7Inc82 = P7K7Inc8(MdtA4re82, mode4);
                            }
                            mutate2.setColorFilter(P7K7Inc82);
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

    public final synchronized Drawable VgvYg0wo(Context context, int i, boolean z) {
        Drawable NCTxEWno;
        try {
            if (!this.wxUZMvaN) {
                this.wxUZMvaN = true;
                Drawable wxUZMvaN = wxUZMvaN(context, R.drawable.abc_vector_test);
                if (wxUZMvaN == null || (!(wxUZMvaN instanceof lf0) && !"android.graphics.drawable.VectorDrawable".equals(wxUZMvaN.getClass().getName()))) {
                    this.wxUZMvaN = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            NCTxEWno = NCTxEWno(context, i);
            if (NCTxEWno == null) {
                NCTxEWno = context.getDrawable(i);
            }
            if (NCTxEWno != null) {
                NCTxEWno = Qr9iLBAD(context, i, z, NCTxEWno);
            }
            if (NCTxEWno != null) {
                ud.qoPGr6Ce(NCTxEWno);
            }
        } catch (Throwable th) {
            throw th;
        }
        return NCTxEWno;
    }

    public final synchronized ColorStateList b2ZJblxo(Context context, int i) {
        ColorStateList colorStateList;
        a80 a80Var;
        WeakHashMap weakHashMap = this.qoPGr6Ce;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (a80Var = (a80) weakHashMap.get(context)) == null) ? null : (ColorStateList) ej0.eVhOlqcC(a80Var, i);
        if (colorStateList == null) {
            bp9dZ9BB bp9dz9bb = this.VgvYg0wo;
            if (bp9dz9bb != null) {
                colorStateList2 = bp9dz9bb.VgvYg0wo(context, i);
            }
            if (colorStateList2 != null) {
                qoPGr6Ce(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final void qoPGr6Ce(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.qoPGr6Ce;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.qoPGr6Ce = weakHashMap;
        }
        a80 a80Var = (a80) weakHashMap.get(context);
        if (a80Var == null) {
            a80Var = new a80(0);
            this.qoPGr6Ce.put(context, a80Var);
        }
        int i2 = a80Var.VgvYg0wo;
        if (i2 != 0 && i <= a80Var.MdtA4re8[i2 - 1]) {
            a80Var.NCTxEWno(i, colorStateList);
            return;
        }
        if (a80Var.NCTxEWno && i2 >= a80Var.MdtA4re8.length) {
            ej0.amk52bBQ(a80Var);
        }
        int i3 = a80Var.VgvYg0wo;
        if (i3 >= a80Var.MdtA4re8.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            a80Var.MdtA4re8 = Arrays.copyOf(a80Var.MdtA4re8, i7);
            a80Var.wxUZMvaN = Arrays.copyOf(a80Var.wxUZMvaN, i7);
        }
        a80Var.MdtA4re8[i3] = i;
        a80Var.wxUZMvaN[i3] = colorStateList;
        a80Var.VgvYg0wo = i3 + 1;
    }

    public final synchronized Drawable wxUZMvaN(Context context, int i) {
        return VgvYg0wo(context, i, false);
    }
}
