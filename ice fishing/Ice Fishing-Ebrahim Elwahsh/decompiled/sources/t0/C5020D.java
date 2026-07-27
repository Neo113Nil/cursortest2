package t0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: t0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5020D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5032P f40576a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f40577b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40578c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40579d;

    public C5020D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40577b = new Rect();
        this.f40578c = true;
        this.f40579d = false;
    }

    public C5020D(int i, int i4) {
        super(i, i4);
        this.f40577b = new Rect();
        this.f40578c = true;
        this.f40579d = false;
    }

    public C5020D(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f40577b = new Rect();
        this.f40578c = true;
        this.f40579d = false;
    }

    public C5020D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40577b = new Rect();
        this.f40578c = true;
        this.f40579d = false;
    }

    public C5020D(C5020D c5020d) {
        super((ViewGroup.LayoutParams) c5020d);
        this.f40577b = new Rect();
        this.f40578c = true;
        this.f40579d = false;
    }
}
