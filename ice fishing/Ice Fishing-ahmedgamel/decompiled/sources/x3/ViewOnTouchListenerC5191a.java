package x3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC5191a implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final Dialog f41880n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41881u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41882v;

    /* renamed from: w, reason: collision with root package name */
    public final int f41883w;

    public ViewOnTouchListenerC5191a(Dialog dialog, Rect rect) {
        this.f41880n = dialog;
        this.f41881u = rect.left;
        this.f41882v = rect.top;
        this.f41883w = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f41881u;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f41882v, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f41883w;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f41880n.onTouchEvent(obtain);
    }
}
