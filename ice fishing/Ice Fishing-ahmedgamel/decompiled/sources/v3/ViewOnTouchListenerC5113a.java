package v3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC5113a implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final Dialog f41426n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41427u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41428v;

    /* renamed from: w, reason: collision with root package name */
    public final int f41429w;

    public ViewOnTouchListenerC5113a(Dialog dialog, Rect rect) {
        this.f41426n = dialog;
        this.f41427u = rect.left;
        this.f41428v = rect.top;
        this.f41429w = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f41427u;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f41428v, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f41429w;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f41426n.onTouchEvent(obtain);
    }
}
