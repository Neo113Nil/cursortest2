package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.Dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC2525Dm implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3648nm f24546a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4241ym f24547b;

    public GestureDetectorOnGestureListenerC2525Dm(C3648nm c3648nm, ViewTreeObserverOnGlobalLayoutListenerC4241ym viewTreeObserverOnGlobalLayoutListenerC4241ym) {
        this.f24546a = c3648nm;
        this.f24547b = viewTreeObserverOnGlobalLayoutListenerC4241ym;
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
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f9) {
        int y6;
        int u7;
        try {
            C3648nm c3648nm = this.f24546a;
            if (c3648nm != null) {
                int i = -1;
                if (Math.abs(f6) > Math.abs(f9)) {
                    if (f6 > 0.0f) {
                        y6 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                        i = 1;
                    } else {
                        if (f6 < 0.0f) {
                            y6 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f6) * 1000.0f);
                            i = 2;
                        }
                        y6 = 0;
                    }
                    synchronized (c3648nm) {
                        u7 = c3648nm.f33007n.u();
                    }
                    if (i == u7) {
                        c3648nm.c(y6, this.f24547b.f35404w);
                        return false;
                    }
                } else {
                    if (f9 > 0.0f) {
                        y6 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f9) * 1000.0f);
                        i = 8;
                    } else {
                        if (f9 < 0.0f) {
                            y6 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f9) * 1000.0f);
                            i = 4;
                        }
                        y6 = 0;
                    }
                    synchronized (c3648nm) {
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f9) {
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
