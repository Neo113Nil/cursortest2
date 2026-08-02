package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC2597Gm implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3873rm f25889a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2529Cm f25890b;

    public GestureDetectorOnGestureListenerC2597Gm(C3873rm c3873rm, ViewTreeObserverOnGlobalLayoutListenerC2529Cm viewTreeObserverOnGlobalLayoutListenerC2529Cm) {
        this.f25889a = c3873rm;
        this.f25890b = viewTreeObserverOnGlobalLayoutListenerC2529Cm;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f9) {
        int y7;
        int y9;
        try {
            C3873rm c3873rm = this.f25889a;
            if (c3873rm != null) {
                int i = -1;
                if (Math.abs(f2) > Math.abs(f9)) {
                    if (f2 > 0.0f) {
                        y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f2) * 1000.0f);
                        i = 1;
                    } else {
                        if (f2 < 0.0f) {
                            y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f2) * 1000.0f);
                            i = 2;
                        }
                        y7 = 0;
                    }
                    synchronized (c3873rm) {
                        y9 = c3873rm.f34503n.y();
                    }
                    if (i == y9) {
                        c3873rm.c(y7, this.f25890b.f24961w);
                        return false;
                    }
                } else {
                    if (f9 > 0.0f) {
                        y7 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f9) * 1000.0f);
                        i = 8;
                    } else {
                        if (f9 < 0.0f) {
                            y7 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f9) * 1000.0f);
                            i = 4;
                        }
                        y7 = 0;
                    }
                    synchronized (c3873rm) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f9) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
