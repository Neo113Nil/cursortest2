package L;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class y extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f685a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f686b;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f685a = new Rect();
        this.f686b = true;
    }

    public y(int i2, int i3) {
        super(i2, i3);
        this.f685a = new Rect();
        this.f686b = true;
    }

    public y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f685a = new Rect();
        this.f686b = true;
    }

    public y(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f685a = new Rect();
        this.f686b = true;
    }

    public y(y yVar) {
        super((ViewGroup.LayoutParams) yVar);
        this.f685a = new Rect();
        this.f686b = true;
    }
}
