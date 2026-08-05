package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jf0 extends Drawable.ConstantState {
    public ColorStateList MdtA4re8;
    public if0 NCTxEWno;
    public Bitmap P7K7Inc8;
    public PorterDuff.Mode Qr9iLBAD;
    public boolean VgvYg0wo;
    public ColorStateList b2ZJblxo;
    public boolean eVhOlqcC;
    public int jb9XjC4I;
    public boolean k3x7lurq;
    public Paint ow5vqvCr;
    public int qoPGr6Ce;
    public PorterDuff.Mode wxUZMvaN;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.qoPGr6Ce;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new lf0(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new lf0(this);
    }
}
