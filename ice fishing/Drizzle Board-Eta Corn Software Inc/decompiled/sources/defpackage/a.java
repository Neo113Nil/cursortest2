package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a extends mcXgUFR8 {
    public final qav1gMqP P7K7Inc8;
    public ColorStateList Qr9iLBAD;
    public Drawable b2ZJblxo;
    public boolean eVhOlqcC;
    public PorterDuff.Mode jb9XjC4I;
    public boolean k3x7lurq;

    public a(qav1gMqP qav1gmqp) {
        super(0, qav1gmqp);
        this.Qr9iLBAD = null;
        this.jb9XjC4I = null;
        this.eVhOlqcC = false;
        this.k3x7lurq = false;
        this.P7K7Inc8 = qav1gmqp;
    }

    public final void FXJmAAN1(Canvas canvas) {
        if (this.b2ZJblxo != null) {
            int max = this.P7K7Inc8.getMax();
            if (max > 1) {
                int intrinsicWidth = this.b2ZJblxo.getIntrinsicWidth();
                int intrinsicHeight = this.b2ZJblxo.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.b2ZJblxo.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.b2ZJblxo.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.mcXgUFR8
    public final void lwWCatUu(AttributeSet attributeSet, int i) {
        super.lwWCatUu(attributeSet, R.attr.seekBarStyle);
        qav1gMqP qav1gmqp = this.P7K7Inc8;
        Context context = qav1gmqp.getContext();
        int[] iArr = z00.b2ZJblxo;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        hg0.jb9XjC4I(qav1gmqp, qav1gmqp.getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, R.attr.seekBarStyle);
        Drawable amk52bBQ = Mq3SeTnW.amk52bBQ(0);
        if (amk52bBQ != null) {
            qav1gmqp.setThumb(amk52bBQ);
        }
        Drawable OxcuoDLp = Mq3SeTnW.OxcuoDLp(1);
        Drawable drawable = this.b2ZJblxo;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.b2ZJblxo = OxcuoDLp;
        if (OxcuoDLp != null) {
            OxcuoDLp.setCallback(qav1gmqp);
            OxcuoDLp.setLayoutDirection(qav1gmqp.getLayoutDirection());
            if (OxcuoDLp.isStateful()) {
                OxcuoDLp.setState(qav1gmqp.getDrawableState());
            }
            zCflySGU();
        }
        qav1gmqp.invalidate();
        if (typedArray.hasValue(3)) {
            this.jb9XjC4I = ud.NCTxEWno(typedArray.getInt(3, -1), this.jb9XjC4I);
            this.k3x7lurq = true;
        }
        if (typedArray.hasValue(2)) {
            this.Qr9iLBAD = Mq3SeTnW.sjUBp5pO(2);
            this.eVhOlqcC = true;
        }
        Mq3SeTnW.SgZGMMPL();
        zCflySGU();
    }

    public final void zCflySGU() {
        Drawable drawable = this.b2ZJblxo;
        if (drawable != null) {
            if (this.eVhOlqcC || this.k3x7lurq) {
                Drawable mutate = drawable.mutate();
                this.b2ZJblxo = mutate;
                if (this.eVhOlqcC) {
                    mutate.setTintList(this.Qr9iLBAD);
                }
                if (this.k3x7lurq) {
                    this.b2ZJblxo.setTintMode(this.jb9XjC4I);
                }
                if (this.b2ZJblxo.isStateful()) {
                    this.b2ZJblxo.setState(this.P7K7Inc8.getDrawableState());
                }
            }
        }
    }
}
