package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* loaded from: classes10.dex */
public final class yfc extends buf0 {
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    public yfc(int i, int i2) {
        super(i);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            auf0 auf0Var = this.b;
            auf0Var.e = colorDrawable;
            y4a0 y4a0Var = auf0Var.i;
            if (y4a0Var != null) {
                ((View) y4a0Var.c).setBackground(colorDrawable);
            }
        }
    }
}
