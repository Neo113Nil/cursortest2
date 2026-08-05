package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.focus.FocusRingDrawable;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ir {
    public RippleDrawable I5GHvsYW;
    public boolean KlHjfFWx;
    public g80 MdtA4re8;
    public r60 NCTxEWno;
    public ColorStateList OnDfzHZD;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public int RXQxj5Oe;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public PorterDuff.Mode k3x7lurq;
    public tr lDXGDhIF;
    public ColorStateList ow5vqvCr;
    public final hr qoPGr6Ce;
    public wm wxUZMvaN;
    public ColorStateList ygLcUYwZ;
    public boolean sjUBp5pO = false;
    public boolean OxcuoDLp = false;
    public boolean amk52bBQ = false;
    public boolean Ey6iv0m0 = true;

    public ir(hr hrVar, r60 r60Var) {
        this.qoPGr6Ce = hrVar;
        this.NCTxEWno = r60Var;
    }

    public final void MdtA4re8() {
        tr trVar = new tr(this.NCTxEWno);
        g80 g80Var = this.MdtA4re8;
        if (g80Var != null) {
            trVar.lDXGDhIF(g80Var);
        }
        wm wmVar = this.wxUZMvaN;
        if (wmVar != null) {
            trVar.euDDoUNr = wmVar;
        }
        hr hrVar = this.qoPGr6Ce;
        Context context = hrVar.getContext();
        trVar.OnDfzHZD(context);
        trVar.setTintList(this.ow5vqvCr);
        PorterDuff.Mode mode = this.k3x7lurq;
        if (mode != null) {
            trVar.setTintMode(mode);
        }
        float f = this.eVhOlqcC;
        ColorStateList colorStateList = this.OnDfzHZD;
        trVar.MdtA4re8.eVhOlqcC = f;
        trVar.invalidateSelf();
        rr rrVar = trVar.MdtA4re8;
        if (rrVar.wxUZMvaN != colorStateList) {
            rrVar.wxUZMvaN = colorStateList;
            trVar.onStateChange(trVar.getState());
        }
        tr trVar2 = new tr(this.NCTxEWno);
        g80 g80Var2 = this.MdtA4re8;
        if (g80Var2 != null) {
            trVar2.lDXGDhIF(g80Var2);
        }
        int i = 0;
        trVar2.setTint(0);
        float f2 = this.eVhOlqcC;
        int ygLcUYwZ = this.sjUBp5pO ? fn.ygLcUYwZ(hrVar, R.attr.colorSurface) : 0;
        trVar2.MdtA4re8.eVhOlqcC = f2;
        trVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(ygLcUYwZ);
        rr rrVar2 = trVar2.MdtA4re8;
        if (rrVar2.wxUZMvaN != valueOf) {
            rrVar2.wxUZMvaN = valueOf;
            trVar2.onStateChange(trVar2.getState());
        }
        tr trVar3 = new tr(this.NCTxEWno);
        this.lDXGDhIF = trVar3;
        g80 g80Var3 = this.MdtA4re8;
        if (g80Var3 != null) {
            trVar3.lDXGDhIF(g80Var3);
        }
        this.lDXGDhIF.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(q30.NCTxEWno(this.ygLcUYwZ), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{trVar2, trVar}), this.VgvYg0wo, this.b2ZJblxo, this.P7K7Inc8, this.Qr9iLBAD), this.lDXGDhIF);
        this.I5GHvsYW = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.VgvYg0wo(context, rippleDrawable, null);
        hrVar.setInternalBackground(this.I5GHvsYW);
        tr qoPGr6Ce = qoPGr6Ce(false);
        if (qoPGr6Ce != null) {
            qoPGr6Ce.sjUBp5pO(this.RXQxj5Oe);
            qoPGr6Ce.setState(hrVar.getDrawableState());
        }
        Drawable background = hrVar.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else {
            if (background instanceof DrawableWrapper) {
                Drawable drawable = ((DrawableWrapper) background).getDrawable();
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                }
            }
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                while (true) {
                    if (i >= layerDrawable.getNumberOfLayers()) {
                        break;
                    }
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable2;
                        break;
                    }
                    i++;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.jb9XjC4I = new WeakReference(qoPGr6Ce);
        }
    }

    public final void NCTxEWno(int i, int i2, int i3, int i4) {
        hr hrVar = this.qoPGr6Ce;
        int paddingStart = hrVar.getPaddingStart();
        int paddingTop = hrVar.getPaddingTop();
        int paddingEnd = hrVar.getPaddingEnd();
        int paddingBottom = hrVar.getPaddingBottom();
        int i5 = this.VgvYg0wo;
        int i6 = this.b2ZJblxo;
        int i7 = this.P7K7Inc8;
        int i8 = this.Qr9iLBAD;
        this.VgvYg0wo = i;
        this.b2ZJblxo = i2;
        this.P7K7Inc8 = i3;
        this.Qr9iLBAD = i4;
        if (!this.OxcuoDLp) {
            MdtA4re8();
        }
        hrVar.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void VgvYg0wo() {
        tr qoPGr6Ce = qoPGr6Ce(false);
        tr qoPGr6Ce2 = qoPGr6Ce(true);
        if (qoPGr6Ce != null) {
            float f = this.eVhOlqcC;
            ColorStateList colorStateList = this.OnDfzHZD;
            qoPGr6Ce.MdtA4re8.eVhOlqcC = f;
            qoPGr6Ce.invalidateSelf();
            rr rrVar = qoPGr6Ce.MdtA4re8;
            if (rrVar.wxUZMvaN != colorStateList) {
                rrVar.wxUZMvaN = colorStateList;
                qoPGr6Ce.onStateChange(qoPGr6Ce.getState());
            }
            if (qoPGr6Ce2 != null) {
                float f2 = this.eVhOlqcC;
                int ygLcUYwZ = this.sjUBp5pO ? fn.ygLcUYwZ(this.qoPGr6Ce, R.attr.colorSurface) : 0;
                qoPGr6Ce2.MdtA4re8.eVhOlqcC = f2;
                qoPGr6Ce2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(ygLcUYwZ);
                rr rrVar2 = qoPGr6Ce2.MdtA4re8;
                if (rrVar2.wxUZMvaN != valueOf) {
                    rrVar2.wxUZMvaN = valueOf;
                    qoPGr6Ce2.onStateChange(qoPGr6Ce2.getState());
                }
            }
        }
    }

    public final tr qoPGr6Ce(boolean z) {
        RippleDrawable rippleDrawable = this.I5GHvsYW;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (tr) ((LayerDrawable) ((InsetDrawable) this.I5GHvsYW.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void wxUZMvaN() {
        e70 e70Var;
        tr qoPGr6Ce = qoPGr6Ce(false);
        if (qoPGr6Ce != null) {
            qoPGr6Ce.Ey6iv0m0(this.NCTxEWno);
            g80 g80Var = this.MdtA4re8;
            if (g80Var != null) {
                qoPGr6Ce.lDXGDhIF(g80Var);
            }
        }
        tr qoPGr6Ce2 = qoPGr6Ce(true);
        if (qoPGr6Ce2 != null) {
            qoPGr6Ce2.Ey6iv0m0(this.NCTxEWno);
            g80 g80Var2 = this.MdtA4re8;
            if (g80Var2 != null) {
                qoPGr6Ce2.lDXGDhIF(g80Var2);
            }
        }
        RippleDrawable rippleDrawable = this.I5GHvsYW;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof e70) {
                e70Var = (e70) findDrawableByLayerId;
                if (e70Var == null) {
                    boolean z = e70Var instanceof tr;
                    r60 r60Var = this.NCTxEWno;
                    if (!z) {
                        e70Var.setShapeAppearanceModel(r60Var.wxUZMvaN());
                        return;
                    }
                    tr trVar = (tr) e70Var;
                    trVar.Ey6iv0m0(r60Var);
                    g80 g80Var3 = this.MdtA4re8;
                    if (g80Var3 != null) {
                        trVar.lDXGDhIF(g80Var3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        e70Var = null;
        if (e70Var == null) {
        }
    }
}
