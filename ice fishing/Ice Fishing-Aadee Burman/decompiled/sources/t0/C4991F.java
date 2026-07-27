package t0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: t0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4991F extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5003S f40551a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f40552b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40553c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40554d;

    public C4991F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40552b = new Rect();
        this.f40553c = true;
        this.f40554d = false;
    }

    public C4991F(int i, int i6) {
        super(i, i6);
        this.f40552b = new Rect();
        this.f40553c = true;
        this.f40554d = false;
    }

    public C4991F(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f40552b = new Rect();
        this.f40553c = true;
        this.f40554d = false;
    }

    public C4991F(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40552b = new Rect();
        this.f40553c = true;
        this.f40554d = false;
    }

    public C4991F(C4991F c4991f) {
        super((ViewGroup.LayoutParams) c4991f);
        this.f40552b = new Rect();
        this.f40553c = true;
        this.f40554d = false;
    }
}
