package ru.yandex.taxi.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.orb1;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0017b\u0010\b\u0013\u0012\f\b\u0014\u0012\b\b\fJ\u0004\b\b(\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/ui/PassMoveTouchListener;", "Landroid/view/View$OnTouchListener;", "movableView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "touchSlop", "", "movableViewRect", "Landroid/graphics/Rect;", "touchedViewRect", "downX", "downY", "moving", "", "onTouch", "touchedView", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "Landroid/annotation/SuppressLint;", "value", "ClickableViewAccessibility", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PassMoveTouchListener implements View.OnTouchListener {
    private float downX;
    private float downY;
    private final View movableView;
    private boolean moving;
    private final float touchSlop;
    private final Rect movableViewRect = new Rect();
    private final Rect touchedViewRect = new Rect();

    public PassMoveTouchListener(View view) {
        this.movableView = view;
        this.touchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View touchedView, MotionEvent event) {
        this.movableView.getGlobalVisibleRect(this.movableViewRect);
        touchedView.getGlobalVisibleRect(this.touchedViewRect);
        Rect rect = this.touchedViewRect;
        int i = rect.left;
        Rect rect2 = this.movableViewRect;
        int i2 = i - rect2.left;
        int i3 = rect.top - rect2.top;
        int actionMasked = event.getActionMasked();
        float x = event.getX();
        float y = event.getY();
        int pointerCount = event.getPointerCount();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.moving = false;
        }
        if (this.moving || pointerCount > 1 || orb1.c(this.downX, this.downY, x, y, this.touchSlop)) {
            MotionEvent obtain = MotionEvent.obtain(event);
            obtain.offsetLocation(i2, i3);
            if (!this.moving) {
                this.moving = true;
                MotionEvent obtain2 = MotionEvent.obtain(obtain);
                obtain2.setAction(0);
                this.movableView.dispatchTouchEvent(obtain2);
            }
            this.movableView.dispatchTouchEvent(obtain);
        }
        if (actionMasked != 1 || !this.moving) {
            return false;
        }
        MotionEvent obtain3 = MotionEvent.obtain(event);
        obtain3.setAction(3);
        touchedView.dispatchTouchEvent(obtain3);
        return true;
    }
}
