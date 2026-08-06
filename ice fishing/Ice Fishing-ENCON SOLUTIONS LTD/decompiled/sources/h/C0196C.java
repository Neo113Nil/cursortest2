package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import c.AbstractC0131a;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0196C extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f3133a;

    /* renamed from: b, reason: collision with root package name */
    public int f3134b;

    public C0196C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3134b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0131a.f2627j);
        this.f3133a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f3134b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C0196C(int i2) {
        super(i2, -2);
        this.f3134b = -1;
        this.f3133a = 0.0f;
    }

    public C0196C(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3134b = -1;
    }
}
