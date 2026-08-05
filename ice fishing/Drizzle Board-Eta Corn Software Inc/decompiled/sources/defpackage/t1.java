package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t1 extends Drawable implements dc0 {
    public final tr MdtA4re8;
    public final WeakReference NCTxEWno;
    public WeakReference OnDfzHZD;
    public final w1 P7K7Inc8;
    public float Qr9iLBAD;
    public final Rect VgvYg0wo;
    public float b2ZJblxo;
    public float eVhOlqcC;
    public final int jb9XjC4I;
    public float k3x7lurq;
    public float ow5vqvCr;
    public final ec0 wxUZMvaN;
    public WeakReference ygLcUYwZ;

    public t1(Context context, v1 v1Var) {
        bc0 bc0Var;
        WeakReference weakReference = new WeakReference(context);
        this.NCTxEWno = weakReference;
        fn.VgvYg0wo(context, fn.FySoLYna, "Theme.MaterialComponents");
        this.VgvYg0wo = new Rect();
        ec0 ec0Var = new ec0(this);
        this.wxUZMvaN = ec0Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = ec0Var.qoPGr6Ce;
        textPaint.setTextAlign(align);
        w1 w1Var = new w1(context, v1Var);
        this.P7K7Inc8 = w1Var;
        boolean P7K7Inc8 = P7K7Inc8();
        v1 v1Var2 = w1Var.NCTxEWno;
        int intValue = P7K7Inc8 ? v1Var2.Qr9iLBAD.intValue() : v1Var2.P7K7Inc8.intValue();
        int intValue2 = P7K7Inc8() ? v1Var2.jb9XjC4I.intValue() : v1Var2.b2ZJblxo.intValue();
        P7K7Inc8 p7K7Inc8 = new P7K7Inc8(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, intValue);
        if (intValue2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(intValue2, true);
        }
        tr trVar = new tr(t60.b2ZJblxo(contextThemeWrapper.obtainStyledAttributes(y00.gjV1z5T1), p7K7Inc8).qoPGr6Ce());
        this.MdtA4re8 = trVar;
        Qr9iLBAD();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && ec0Var.b2ZJblxo != (bc0Var = new bc0(context2, v1Var2.VgvYg0wo.intValue()))) {
            ec0Var.NCTxEWno(bc0Var, context2);
            textPaint.setColor(v1Var2.wxUZMvaN.intValue());
            invalidateSelf();
            eVhOlqcC();
            invalidateSelf();
        }
        int i = v1Var2.OnDfzHZD;
        if (i != -2) {
            this.jb9XjC4I = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.jb9XjC4I = v1Var2.ygLcUYwZ;
        }
        ec0Var.VgvYg0wo = true;
        eVhOlqcC();
        invalidateSelf();
        ec0Var.VgvYg0wo = true;
        Qr9iLBAD();
        eVhOlqcC();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(v1Var2.MdtA4re8.intValue());
        if (trVar.MdtA4re8.MdtA4re8 != valueOf) {
            trVar.OxcuoDLp(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(v1Var2.wxUZMvaN.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.OnDfzHZD;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.OnDfzHZD.get();
            WeakReference weakReference3 = this.ygLcUYwZ;
            jb9XjC4I(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        eVhOlqcC();
        setVisible(v1Var2.I5GHvsYW.booleanValue(), false);
    }

    public final String MdtA4re8() {
        w1 w1Var = this.P7K7Inc8;
        v1 v1Var = w1Var.NCTxEWno;
        v1 v1Var2 = w1Var.NCTxEWno;
        String str = v1Var.k3x7lurq;
        WeakReference weakReference = this.NCTxEWno;
        if (str == null) {
            if (!b2ZJblxo()) {
                return null;
            }
            int i = this.jb9XjC4I;
            if (i == -2 || VgvYg0wo() <= i) {
                return NumberFormat.getInstance(v1Var2.lDXGDhIF).format(VgvYg0wo());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(v1Var2.lDXGDhIF, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = v1Var.OnDfzHZD;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void NCTxEWno(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout wxUZMvaN = wxUZMvaN();
        if (wxUZMvaN == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = wxUZMvaN;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.Qr9iLBAD - this.ow5vqvCr) + f;
            float f4 = (this.b2ZJblxo - this.k3x7lurq) + f2;
            View view5 = view3;
            float height = ((this.Qr9iLBAD + this.ow5vqvCr) - view5.getHeight()) + f;
            float width = ((this.b2ZJblxo + this.k3x7lurq) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.Qr9iLBAD = Math.abs(f3) + this.Qr9iLBAD;
            }
            if (f4 < 0.0f) {
                this.b2ZJblxo = Math.abs(f4) + this.b2ZJblxo;
            }
            if (height > 0.0f) {
                this.Qr9iLBAD -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.b2ZJblxo -= Math.abs(width);
            }
        }
    }

    public final boolean P7K7Inc8() {
        return this.P7K7Inc8.NCTxEWno.k3x7lurq != null || b2ZJblxo();
    }

    public final void Qr9iLBAD() {
        Context context = (Context) this.NCTxEWno.get();
        if (context == null) {
            return;
        }
        boolean P7K7Inc8 = P7K7Inc8();
        w1 w1Var = this.P7K7Inc8;
        int intValue = P7K7Inc8 ? w1Var.NCTxEWno.Qr9iLBAD.intValue() : w1Var.NCTxEWno.P7K7Inc8.intValue();
        int intValue2 = P7K7Inc8() ? w1Var.NCTxEWno.jb9XjC4I.intValue() : w1Var.NCTxEWno.b2ZJblxo.intValue();
        P7K7Inc8 p7K7Inc8 = new P7K7Inc8(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, intValue);
        if (intValue2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(intValue2, true);
        }
        this.MdtA4re8.setShapeAppearanceModel(t60.b2ZJblxo(contextThemeWrapper.obtainStyledAttributes(y00.gjV1z5T1), p7K7Inc8).qoPGr6Ce());
        invalidateSelf();
    }

    public final int VgvYg0wo() {
        int i = this.P7K7Inc8.NCTxEWno.ow5vqvCr;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean b2ZJblxo() {
        v1 v1Var = this.P7K7Inc8.NCTxEWno;
        return v1Var.k3x7lurq == null && v1Var.ow5vqvCr != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String MdtA4re8;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.MdtA4re8.draw(canvas);
        if (!P7K7Inc8() || (MdtA4re8 = MdtA4re8()) == null) {
            return;
        }
        Rect rect = new Rect();
        ec0 ec0Var = this.wxUZMvaN;
        ec0Var.qoPGr6Ce.getTextBounds(MdtA4re8, 0, MdtA4re8.length(), rect);
        float exactCenterY = this.Qr9iLBAD - rect.exactCenterY();
        canvas.drawText(MdtA4re8, this.b2ZJblxo, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), ec0Var.qoPGr6Ce);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void eVhOlqcC() {
        float f;
        int intValue;
        int intValue2;
        int intValue3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        WeakReference weakReference = this.NCTxEWno;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.OnDfzHZD;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.VgvYg0wo;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.ygLcUYwZ;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean P7K7Inc8 = P7K7Inc8();
        w1 w1Var = this.P7K7Inc8;
        float f10 = P7K7Inc8 ? w1Var.wxUZMvaN : w1Var.MdtA4re8;
        this.eVhOlqcC = f10;
        if (f10 != -1.0f) {
            this.k3x7lurq = f10;
            this.ow5vqvCr = f10;
        } else {
            this.k3x7lurq = Math.round((P7K7Inc8() ? w1Var.b2ZJblxo : w1Var.VgvYg0wo) / 2.0f);
            this.ow5vqvCr = Math.round((P7K7Inc8() ? w1Var.Qr9iLBAD : w1Var.P7K7Inc8) / 2.0f);
        }
        if (P7K7Inc8()) {
            String MdtA4re8 = MdtA4re8();
            float f11 = this.k3x7lurq;
            ec0 ec0Var = this.wxUZMvaN;
            if (ec0Var.VgvYg0wo) {
                ec0Var.qoPGr6Ce(MdtA4re8);
                f9 = ec0Var.MdtA4re8;
            } else {
                f9 = ec0Var.MdtA4re8;
            }
            this.k3x7lurq = Math.max(f11, (f9 / 2.0f) + w1Var.NCTxEWno.RXQxj5Oe.intValue());
            float f12 = this.ow5vqvCr;
            if (ec0Var.VgvYg0wo) {
                ec0Var.qoPGr6Ce(MdtA4re8);
            }
            float max = Math.max(f12, (ec0Var.wxUZMvaN / 2.0f) + w1Var.NCTxEWno.FySoLYna.intValue());
            this.ow5vqvCr = max;
            this.k3x7lurq = Math.max(this.k3x7lurq, max);
        }
        v1 v1Var = w1Var.NCTxEWno;
        v1 v1Var2 = w1Var.NCTxEWno;
        int i = w1Var.k3x7lurq;
        int intValue4 = v1Var.WYNAV5pd.intValue();
        if (P7K7Inc8()) {
            intValue4 = v1Var.lwWCatUu.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f = -1.0f;
                intValue4 += Math.round(yoc1Y4KB.NCTxEWno(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f) * ((intValue4 - v1Var.Mq3SeTnW.intValue()) - intValue4));
                if (i == 0) {
                    intValue4 -= Math.round(this.ow5vqvCr);
                }
                intValue = v1Var.i7xS8jrb.intValue() + intValue4;
                intValue2 = v1Var2.Ey6iv0m0.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.Qr9iLBAD = rect3.bottom - intValue;
                } else {
                    this.Qr9iLBAD = rect3.top + intValue;
                }
                int intValue5 = !P7K7Inc8() ? v1Var.DK9slbsy.intValue() : v1Var2.gjV1z5T1.intValue();
                if (i == 1) {
                    intValue5 += P7K7Inc8() ? w1Var.eVhOlqcC : w1Var.jb9XjC4I;
                }
                int intValue6 = v1Var.U0LaHZX7.intValue() + intValue5;
                intValue3 = v1Var2.Ey6iv0m0.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (w1Var.ow5vqvCr != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f2 = rect3.left + this.k3x7lurq;
                            f3 = (this.ow5vqvCr * 2.0f) - intValue6;
                            f4 = f2 - f3;
                            this.b2ZJblxo = f4;
                        } else {
                            f4 = (rect3.right - this.k3x7lurq) + ((this.ow5vqvCr * 2.0f) - intValue6);
                            this.b2ZJblxo = f4;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f4 = (rect3.left - this.k3x7lurq) + intValue6;
                        this.b2ZJblxo = f4;
                    } else {
                        f2 = rect3.right + this.k3x7lurq;
                        f3 = intValue6;
                        f4 = f2 - f3;
                        this.b2ZJblxo = f4;
                    }
                } else if (w1Var.ow5vqvCr == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f6 = rect3.right + this.k3x7lurq;
                        f7 = intValue6;
                        f8 = f6 - f7;
                        this.b2ZJblxo = f8;
                    } else {
                        f8 = (rect3.left - this.k3x7lurq) + intValue6;
                        this.b2ZJblxo = f8;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f8 = (rect3.right - this.k3x7lurq) + ((this.ow5vqvCr * 2.0f) - intValue6);
                    this.b2ZJblxo = f8;
                } else {
                    f6 = rect3.left + this.k3x7lurq;
                    f7 = (this.ow5vqvCr * 2.0f) - intValue6;
                    f8 = f6 - f7;
                    this.b2ZJblxo = f8;
                }
                if (v1Var.euDDoUNr.booleanValue()) {
                    NCTxEWno(view, null);
                } else {
                    ViewParent wxUZMvaN = wxUZMvaN();
                    if (wxUZMvaN == null) {
                        wxUZMvaN = view.getParent();
                    }
                    if ((wxUZMvaN instanceof View) && (wxUZMvaN.getParent() instanceof View)) {
                        NCTxEWno(view, (View) wxUZMvaN.getParent());
                    }
                }
                float f13 = this.b2ZJblxo;
                float f14 = this.Qr9iLBAD;
                float f15 = this.k3x7lurq;
                float f16 = this.ow5vqvCr;
                rect2.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
                f5 = this.eVhOlqcC;
                tr trVar = this.MdtA4re8;
                if (f5 != f) {
                    trVar.setShapeAppearanceModel(trVar.MdtA4re8.qoPGr6Ce.qoPGr6Ce(f5));
                }
                if (rect.equals(rect2)) {
                    trVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f = -1.0f;
        if (i == 0) {
        }
        intValue = v1Var.i7xS8jrb.intValue() + intValue4;
        intValue2 = v1Var2.Ey6iv0m0.intValue();
        if (intValue2 != 8388691) {
        }
        this.Qr9iLBAD = rect3.bottom - intValue;
        if (!P7K7Inc8()) {
        }
        if (i == 1) {
        }
        int intValue62 = v1Var.U0LaHZX7.intValue() + intValue5;
        intValue3 = v1Var2.Ey6iv0m0.intValue();
        if (intValue3 != 8388659) {
        }
        if (w1Var.ow5vqvCr != 0) {
        }
        if (v1Var.euDDoUNr.booleanValue()) {
        }
        float f132 = this.b2ZJblxo;
        float f142 = this.Qr9iLBAD;
        float f152 = this.k3x7lurq;
        float f162 = this.ow5vqvCr;
        rect2.set((int) (f132 - f152), (int) (f142 - f162), (int) (f132 + f152), (int) (f142 + f162));
        f5 = this.eVhOlqcC;
        tr trVar2 = this.MdtA4re8;
        if (f5 != f) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.P7K7Inc8.NCTxEWno.eVhOlqcC;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.VgvYg0wo.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.VgvYg0wo.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void jb9XjC4I(View view, FrameLayout frameLayout) {
        this.OnDfzHZD = new WeakReference(view);
        this.ygLcUYwZ = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        eVhOlqcC();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dc0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // defpackage.dc0
    public final void qoPGr6Ce() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        w1 w1Var = this.P7K7Inc8;
        w1Var.qoPGr6Ce.eVhOlqcC = i;
        w1Var.NCTxEWno.eVhOlqcC = i;
        this.wxUZMvaN.qoPGr6Ce.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final FrameLayout wxUZMvaN() {
        WeakReference weakReference = this.ygLcUYwZ;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
