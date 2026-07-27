package L;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class y extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f607a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f608b;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f607a = new Rect();
        this.f608b = true;
    }

    public y(int i2, int i3) {
        super(i2, i3);
        this.f607a = new Rect();
        this.f608b = true;
    }

    public y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f607a = new Rect();
        this.f608b = true;
    }

    public y(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f607a = new Rect();
        this.f608b = true;
    }

    public y(y yVar) {
        super((ViewGroup.LayoutParams) yVar);
        this.f607a = new Rect();
        this.f608b = true;
    }
}
