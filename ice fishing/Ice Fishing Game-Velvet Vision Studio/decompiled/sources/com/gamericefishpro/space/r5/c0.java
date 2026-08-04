package com.gamericefishpro.space.r5;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends ViewGroup.MarginLayoutParams {
    public final Rect a;
    public boolean b;
    public boolean c;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = true;
        this.c = false;
    }

    public c0(int i, int i2) {
        super(i, i2);
        this.a = new Rect();
        this.b = true;
        this.c = false;
    }

    public c0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = new Rect();
        this.b = true;
        this.c = false;
    }

    public c0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = new Rect();
        this.b = true;
        this.c = false;
    }

    public c0(c0 c0Var) {
        super((ViewGroup.LayoutParams) c0Var);
        this.a = new Rect();
        this.b = true;
        this.c = false;
    }
}
