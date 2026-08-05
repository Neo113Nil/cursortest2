package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lr {
    public static final double DK9slbsy = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable lwWCatUu;
    public boolean Ey6iv0m0;
    public final int FySoLYna;
    public ValueAnimator I5GHvsYW;
    public final tr MdtA4re8;
    public ColorStateList OnDfzHZD;
    public LayerDrawable OxcuoDLp;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public final TimeInterpolator RXQxj5Oe;
    public float VgvYg0wo;
    public tr amk52bBQ;
    public int b2ZJblxo;
    public Drawable eVhOlqcC;
    public final int gjV1z5T1;
    public int jb9XjC4I;
    public Drawable k3x7lurq;
    public ColorStateList lDXGDhIF;
    public ColorStateList ow5vqvCr;
    public final MaterialCardView qoPGr6Ce;
    public RippleDrawable sjUBp5pO;
    public final tr wxUZMvaN;
    public r60 ygLcUYwZ;
    public final Rect NCTxEWno = new Rect();
    public boolean KlHjfFWx = false;
    public float WYNAV5pd = 0.0f;

    static {
        lwWCatUu = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public lr(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.VgvYg0wo = -1.0f;
        this.qoPGr6Ce = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, q00.qoPGr6Ce, R.attr.materialCardViewStyle, R.style.CardView);
        tr trVar = new tr(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.MdtA4re8 = trVar;
        trVar.OnDfzHZD(materialCardView.getContext());
        trVar.KlHjfFWx();
        s60 eVhOlqcC = trVar.Qr9iLBAD().eVhOlqcC();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.VgvYg0wo = dimension;
            eVhOlqcC.NCTxEWno(dimension);
        }
        this.wxUZMvaN = new tr();
        Qr9iLBAD(eVhOlqcC.qoPGr6Ce());
        this.RXQxj5Oe = w30.hzgxAD8d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, yoc1Y4KB.qoPGr6Ce);
        this.FySoLYna = ra.eIA6dogk(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.gjV1z5T1 = ra.eIA6dogk(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float NCTxEWno(ra raVar, float f) {
        if (raVar instanceof c40) {
            return (float) ((1.0d - DK9slbsy) * f);
        }
        if (raVar instanceof ba) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final LayerDrawable MdtA4re8() {
        if (this.sjUBp5pO == null) {
            this.amk52bBQ = new tr(this.ygLcUYwZ);
            this.sjUBp5pO = new RippleDrawable(this.ow5vqvCr, null, this.amk52bBQ);
        }
        LayerDrawable layerDrawable = this.OxcuoDLp;
        if (layerDrawable != null) {
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{this.sjUBp5pO, this.wxUZMvaN, this.k3x7lurq});
        FocusRingDrawable.VgvYg0wo(this.qoPGr6Ce.getContext(), layerDrawable2, this.amk52bBQ);
        layerDrawable2.setId(2, R.id.mtrl_card_checked_layer_id);
        this.OxcuoDLp = layerDrawable2;
        return layerDrawable2;
    }

    public final void OnDfzHZD() {
        boolean z = this.KlHjfFWx;
        MaterialCardView materialCardView = this.qoPGr6Ce;
        if (!z) {
            materialCardView.setBackgroundInternal(wxUZMvaN(this.MdtA4re8));
        }
        materialCardView.setForeground(wxUZMvaN(this.eVhOlqcC));
    }

    public final void P7K7Inc8(boolean z, boolean z2) {
        Drawable drawable = this.k3x7lurq;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.WYNAV5pd = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = this.WYNAV5pd;
            if (z) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.I5GHvsYW;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I5GHvsYW = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.WYNAV5pd, f);
            this.I5GHvsYW = ofFloat;
            ofFloat.addUpdateListener(new bc(1, this));
            this.I5GHvsYW.setInterpolator(this.RXQxj5Oe);
            this.I5GHvsYW.setDuration((long) ((z ? this.FySoLYna : this.gjV1z5T1) * f2));
            this.I5GHvsYW.start();
        }
    }

    public final void Qr9iLBAD(r60 r60Var) {
        this.ygLcUYwZ = r60Var;
        tr trVar = this.MdtA4re8;
        trVar.Ey6iv0m0(r60Var);
        this.wxUZMvaN.Ey6iv0m0(r60Var);
        tr trVar2 = this.amk52bBQ;
        if (trVar2 != null) {
            trVar2.Ey6iv0m0(r60Var);
        }
        trVar.gjV1z5T1 = !trVar.ygLcUYwZ();
    }

    public final void VgvYg0wo(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.OxcuoDLp != null) {
            MaterialCardView materialCardView = this.qoPGr6Ce;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (jb9XjC4I() ? qoPGr6Ce() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (jb9XjC4I() ? qoPGr6Ce() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.Qr9iLBAD;
            boolean z = (i7 & 8388613) == 8388613;
            int i8 = this.P7K7Inc8;
            int i9 = z ? ((i - i8) - this.b2ZJblxo) - i4 : i8;
            int i10 = (i7 & 80) == 80 ? i8 : ((i2 - i8) - this.b2ZJblxo) - i3;
            int i11 = (i7 & 8388613) == 8388613 ? i8 : ((i - i8) - this.b2ZJblxo) - i4;
            if ((i7 & 80) == 80) {
                i8 = ((i2 - i8) - this.b2ZJblxo) - i3;
            }
            int i12 = i8;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.OxcuoDLp.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void b2ZJblxo(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k3x7lurq = mutate;
            mutate.setTintList(this.OnDfzHZD);
            P7K7Inc8(this.qoPGr6Ce.eVhOlqcC, false);
        } else {
            this.k3x7lurq = lwWCatUu;
        }
        LayerDrawable layerDrawable = this.OxcuoDLp;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.k3x7lurq);
        }
    }

    public final boolean eVhOlqcC() {
        View view = this.qoPGr6Ce;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final boolean jb9XjC4I() {
        MaterialCardView materialCardView = this.qoPGr6Ce;
        return materialCardView.getPreventCornerOverlap() && this.MdtA4re8.ygLcUYwZ() && materialCardView.getUseCompatPadding();
    }

    public final void k3x7lurq() {
        Drawable drawable = this.eVhOlqcC;
        Drawable MdtA4re8 = eVhOlqcC() ? MdtA4re8() : this.wxUZMvaN;
        this.eVhOlqcC = MdtA4re8;
        if (drawable != MdtA4re8) {
            MaterialCardView materialCardView = this.qoPGr6Ce;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(MdtA4re8);
            } else {
                materialCardView.setForeground(wxUZMvaN(MdtA4re8));
            }
        }
    }

    public final void ow5vqvCr() {
        MaterialCardView materialCardView = this.qoPGr6Ce;
        float f = 0.0f;
        float qoPGr6Ce = ((!materialCardView.getPreventCornerOverlap() || this.MdtA4re8.ygLcUYwZ()) && !jb9XjC4I()) ? 0.0f : qoPGr6Ce();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - DK9slbsy) * materialCardView.getCardViewRadius());
        }
        int i = (int) (qoPGr6Ce - f);
        Rect rect = this.NCTxEWno;
        materialCardView.wxUZMvaN.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        mcXgUFR8 mcxgufr8 = materialCardView.P7K7Inc8;
        if (!((r3) mcxgufr8.wxUZMvaN).getUseCompatPadding()) {
            mcxgufr8.aZz0PFXp(0, 0, 0, 0);
            return;
        }
        z30 z30Var = (z30) mcxgufr8.MdtA4re8;
        float f2 = z30Var.VgvYg0wo;
        float f3 = z30Var.qoPGr6Ce;
        int ceil = (int) Math.ceil(a40.qoPGr6Ce(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(a40.NCTxEWno(f2, f3, r0.getPreventCornerOverlap()));
        mcxgufr8.aZz0PFXp(ceil, ceil2, ceil, ceil2);
    }

    public final float qoPGr6Ce() {
        float f = 0.0f;
        for (t60 t60Var : this.ygLcUYwZ.MdtA4re8()) {
            if (t60Var != null) {
                ra raVar = t60Var.qoPGr6Ce;
                tr trVar = this.MdtA4re8;
                float NCTxEWno = NCTxEWno(raVar, trVar.eVhOlqcC());
                ra raVar2 = t60Var.NCTxEWno;
                float[] fArr = trVar.i7xS8jrb;
                float max = Math.max(NCTxEWno, NCTxEWno(raVar2, fArr != null ? fArr[0] : trVar.MdtA4re8.qoPGr6Ce.wxUZMvaN().P7K7Inc8.qoPGr6Ce(trVar.b2ZJblxo())));
                ra raVar3 = t60Var.MdtA4re8;
                float[] fArr2 = trVar.i7xS8jrb;
                float NCTxEWno2 = NCTxEWno(raVar3, fArr2 != null ? fArr2[1] : trVar.MdtA4re8.qoPGr6Ce.wxUZMvaN().b2ZJblxo.qoPGr6Ce(trVar.b2ZJblxo()));
                ra raVar4 = t60Var.wxUZMvaN;
                float[] fArr3 = trVar.i7xS8jrb;
                f = Math.max(f, Math.max(max, Math.max(NCTxEWno2, NCTxEWno(raVar4, fArr3 != null ? fArr3[2] : trVar.MdtA4re8.qoPGr6Ce.wxUZMvaN().Qr9iLBAD.qoPGr6Ce(trVar.b2ZJblxo())))));
            }
        }
        return f;
    }

    public final kr wxUZMvaN(Drawable drawable) {
        int i;
        int i2;
        if (this.qoPGr6Ce.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (jb9XjC4I() ? qoPGr6Ce() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (jb9XjC4I() ? qoPGr6Ce() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new kr(drawable, i, i2, i, i2);
    }
}
