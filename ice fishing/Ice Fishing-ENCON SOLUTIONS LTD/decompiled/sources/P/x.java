package P;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1379a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1380b;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1379a = new Rect();
        this.f1380b = true;
    }

    public x(int i2, int i3) {
        super(i2, i3);
        this.f1379a = new Rect();
        this.f1380b = true;
    }

    public x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1379a = new Rect();
        this.f1380b = true;
    }

    public x(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1379a = new Rect();
        this.f1380b = true;
    }

    public x(x xVar) {
        super((ViewGroup.LayoutParams) xVar);
        this.f1379a = new Rect();
        this.f1380b = true;
    }
}
