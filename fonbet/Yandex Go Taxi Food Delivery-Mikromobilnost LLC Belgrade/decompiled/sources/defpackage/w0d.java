package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;

/* loaded from: classes9.dex */
public final class w0d {
    public int a;
    public int b;
    public int c;
    public int d;
    public Integer e;
    public boolean f;
    public boolean g;
    public float h;
    public int i;

    public static GradientDrawable b(int i, float f, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setStroke(i2, i3);
        return gradientDrawable;
    }

    public final Drawable a() {
        Drawable b = b(this.a, this.h, this.i, this.b);
        if (this.g) {
            GradientDrawable b2 = b(-1, this.h, this.i, this.b);
            Integer num = this.e;
            b = new RippleDrawable(ColorStateList.valueOf(num != null ? num.intValue() : lhc.c(this.a) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0)), b, b2);
        }
        if (!this.f) {
            return b;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, b(this.c, this.h, this.i, this.d));
        stateListDrawable.addState(new int[0], b);
        return stateListDrawable;
    }
}
