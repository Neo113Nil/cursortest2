package com.squareup.cash.sheet;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.squareup.util.android.Views;

/* loaded from: classes7.dex */
public final class OutsideBoundsTouchHandler$scrollDetector$1 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ OutsideBoundsTouchHandler$scrollDetector$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 1:
                motionEvent.getClass();
                motionEvent.getX();
                motionEvent.getY();
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                motionEvent.getClass();
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                motionEvent2.getClass();
                BottomSheet bottomSheet = ((OutsideBoundsTouchHandler) this.this$0).layout;
                View childAt = bottomSheet.getChildAt(0);
                childAt.getClass();
                bottomSheet.onNestedPreScroll(childAt, 0, (int) f2, OutsideBoundsTouchHandler.fakeIntArray, 0);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                motionEvent.getClass();
                BottomSheet bottomSheet = ((OutsideBoundsTouchHandler) this.this$0).layout;
                if (Views.boundsRelativeTo(bottomSheet, bottomSheet.sheet).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return bottomSheet.performClick();
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
