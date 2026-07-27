package t3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC5079a implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final Dialog f40946n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40947u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40948v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40949w;

    public ViewOnTouchListenerC5079a(Dialog dialog, Rect rect) {
        this.f40946n = dialog;
        this.f40947u = rect.left;
        this.f40948v = rect.top;
        this.f40949w = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f40947u;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f40948v, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f40949w;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f40946n.onTouchEvent(obtain);
    }
}
