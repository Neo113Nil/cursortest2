package com.google.maps.android.compose;

/* loaded from: classes4.dex */
public enum CameraMoveStartedReason {
    UNKNOWN(-2),
    NO_MOVEMENT_YET(-1),
    GESTURE(1),
    /* JADX INFO: Fake field, exist only in values array */
    API_ANIMATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ANIMATION(3);

    public static final Companion Companion = new Companion();
    public final int value;

    public final class Companion {
    }

    CameraMoveStartedReason(int i) {
        this.value = i;
    }
}
