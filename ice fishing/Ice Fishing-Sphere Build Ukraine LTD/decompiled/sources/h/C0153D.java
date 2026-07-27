package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import c.AbstractC0097a;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0153D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f2076a;

    /* renamed from: b, reason: collision with root package name */
    public int f2077b;

    public C0153D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2077b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1646j);
        this.f2076a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f2077b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0153D(int i2) {
        super(i2, -2);
        this.f2077b = -1;
        this.f2076a = 0.0f;
    }

    public C0153D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2077b = -1;
    }
}
