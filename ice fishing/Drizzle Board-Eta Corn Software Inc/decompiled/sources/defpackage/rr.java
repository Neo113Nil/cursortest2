package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rr extends Drawable.ConstantState {
    public float eVhOlqcC;
    public r60 qoPGr6Ce;
    public ColorStateList MdtA4re8 = null;
    public ColorStateList wxUZMvaN = null;
    public ColorStateList VgvYg0wo = null;
    public PorterDuff.Mode P7K7Inc8 = PorterDuff.Mode.SRC_IN;
    public Rect b2ZJblxo = null;
    public float Qr9iLBAD = 1.0f;
    public float jb9XjC4I = 1.0f;
    public int k3x7lurq = 255;
    public float ow5vqvCr = 0.0f;
    public float OnDfzHZD = 0.0f;
    public int ygLcUYwZ = 0;
    public int lDXGDhIF = 0;
    public Paint.Style sjUBp5pO = Paint.Style.FILL_AND_STROKE;
    public te NCTxEWno = null;

    public rr(r60 r60Var) {
        this.qoPGr6Ce = r60Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        tr trVar = new tr(this);
        trVar.b2ZJblxo = true;
        trVar.Qr9iLBAD = true;
        return trVar;
    }
}
