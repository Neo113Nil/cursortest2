package io.appmetrica.analytics.push.model;

/* loaded from: classes4.dex */
public enum OpenType {
    BROADCAST(0),
    TRANSPARENT_ACTIVITY(1),
    APPLICATION_ACTIVITY(2),
    UNKNOWN(-1);

    private final int a;

    OpenType(int i) {
        this.a = i;
    }

    public static OpenType fromValue(int i) {
        for (OpenType openType : values()) {
            if (openType.a == i) {
                return openType;
            }
        }
        return UNKNOWN;
    }
}
