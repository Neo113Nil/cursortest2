package androidx.navigationevent;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class NavigationEvent {
    public final long frameTimeMillis;
    public final float progress;
    public final int swipeEdge;
    public final float touchX;
    public final float touchY;

    public NavigationEvent(long j, int i, float f, float f2, float f3) {
        this.swipeEdge = i;
        this.progress = f;
        this.touchX = f2;
        this.touchY = f3;
        this.frameTimeMillis = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavigationEvent.class == obj.getClass()) {
            NavigationEvent navigationEvent = (NavigationEvent) obj;
            return this.touchX == navigationEvent.touchX && this.touchY == navigationEvent.touchY && this.progress == navigationEvent.progress && this.swipeEdge == navigationEvent.swipeEdge && this.frameTimeMillis == navigationEvent.frameTimeMillis;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.frameTimeMillis) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.swipeEdge, CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, CameraState$Type$EnumUnboxingLocalUtility.m(this.touchY, Float.hashCode(this.touchX) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
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
}
