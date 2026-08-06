package h;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class b0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f3211a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3212b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3213c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3214d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3216f;

    public b0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3215e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3212b = rect3;
        Rect rect4 = new Rect();
        this.f3214d = rect4;
        Rect rect5 = new Rect();
        this.f3213c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f3211a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f3216f;
                if (z3 && !this.f3214d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f3216f;
                    this.f3216f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else {
            if (this.f3212b.contains(x2, y2)) {
                this.f3216f = true;
                z2 = true;
            }
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f3213c;
        View view = this.f3211a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
