package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g1 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f4300a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4301b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4302c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4304e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4305f;

    public g1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f4304e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f4301b = rect3;
        Rect rect4 = new Rect();
        this.f4303d = rect4;
        Rect rect5 = new Rect();
        this.f4302c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f4300a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f4305f;
                if (z11 && !this.f4303d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            } else {
                if (action == 3) {
                    z11 = this.f4305f;
                    this.f4305f = false;
                }
                z10 = true;
                z12 = false;
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f4301b.contains(x10, y10)) {
                this.f4305f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f4302c;
        View view = this.f4300a;
        if (!z10 || rect.contains(x10, y10)) {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
