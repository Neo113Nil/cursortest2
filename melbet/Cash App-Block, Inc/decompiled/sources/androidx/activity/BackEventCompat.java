package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.navigationevent.NavigationEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class BackEventCompat {
    public final long frameTimeMillis;
    public final float progress;
    public final int swipeEdge;
    public final float touchX;
    public final float touchY;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BackEventCompat(BackEvent backEvent) {
        this(Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L, backEvent.getSwipeEdge(), r4, r5, r6);
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.touchX);
        sb.append(", touchY=");
        sb.append(this.touchY);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", swipeEdge=");
        sb.append(this.swipeEdge);
        sb.append(", frameTimeMillis=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.frameTimeMillis, ')');
    }

    public BackEventCompat(long j, int i, float f, float f2, float f3) {
        this.touchX = f;
        this.touchY = f2;
        this.progress = f3;
        this.swipeEdge = i;
        this.frameTimeMillis = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BackEventCompat(NavigationEvent navigationEvent) {
        this(navigationEvent.frameTimeMillis, navigationEvent.swipeEdge, r4, r5, r6);
        navigationEvent.getClass();
        float f = navigationEvent.touchX;
        float f2 = navigationEvent.touchY;
        float f3 = navigationEvent.progress;
    }
}
