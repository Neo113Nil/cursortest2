package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC2560Fm implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3797qm f24843a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC2492Bm f24844b;

    public GestureDetectorOnGestureListenerC2560Fm(C3797qm c3797qm, ViewTreeObserverOnGlobalLayoutListenerC2492Bm viewTreeObserverOnGlobalLayoutListenerC2492Bm) {
        this.f24843a = c3797qm;
        this.f24844b = viewTreeObserverOnGlobalLayoutListenerC2492Bm;
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
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f9) {
        int y7;
        int y9;
        try {
            C3797qm c3797qm = this.f24843a;
            if (c3797qm != null) {
                int i = -1;
                if (Math.abs(f3) > Math.abs(f9)) {
                    if (f3 > 0.0f) {
                        y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f3) * 1000.0f);
                        i = 1;
                    } else {
                        if (f3 < 0.0f) {
                            y7 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f3) * 1000.0f);
                            i = 2;
                        }
                        y7 = 0;
                    }
                    synchronized (c3797qm) {
                        y9 = c3797qm.f33403n.y();
                    }
                    if (i == y9) {
                        c3797qm.c(y7, this.f24844b.f23948w);
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
                    synchronized (c3797qm) {
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f9) {
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
