package t0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: t0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4988D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5000P f40604a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f40605b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40606c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40607d;

    public C4988D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40605b = new Rect();
        this.f40606c = true;
        this.f40607d = false;
    }

    public C4988D(int i, int i4) {
        super(i, i4);
        this.f40605b = new Rect();
        this.f40606c = true;
        this.f40607d = false;
    }

    public C4988D(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f40605b = new Rect();
        this.f40606c = true;
        this.f40607d = false;
    }

    public C4988D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40605b = new Rect();
        this.f40606c = true;
        this.f40607d = false;
    }

    public C4988D(C4988D c4988d) {
        super((ViewGroup.LayoutParams) c4988d);
        this.f40605b = new Rect();
        this.f40606c = true;
        this.f40607d = false;
    }
}
