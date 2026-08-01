package b;

import android.window.BackEvent;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0105a f2263a = new C0105a();

    public final BackEvent a(float f2, float f3, float f4, int i) {
        return new BackEvent(f2, f3, f4, i);
    }

    public final float b(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
