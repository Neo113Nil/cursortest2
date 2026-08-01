package k0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class L extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public b0 f3396a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3397b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3398c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3399d;

    public L(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3397b = new Rect();
        this.f3398c = true;
        this.f3399d = false;
    }

    public L(int i, int i2) {
        super(i, i2);
        this.f3397b = new Rect();
        this.f3398c = true;
        this.f3399d = false;
    }

    public L(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3397b = new Rect();
        this.f3398c = true;
        this.f3399d = false;
    }

    public L(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3397b = new Rect();
        this.f3398c = true;
        this.f3399d = false;
    }

    public L(L l2) {
        super((ViewGroup.LayoutParams) l2);
        this.f3397b = new Rect();
        this.f3398c = true;
        this.f3399d = false;
    }
}
