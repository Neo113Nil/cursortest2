package io.appmetrica.analytics.push.model;

/* loaded from: classes4.dex */
public enum AdditionalActionType {
    OPEN_URI(0),
    OPEN_APP_URI(1),
    DO_NOTHING(2),
    INLINE(3),
    UNKNOWN(-1);

    private final int a;

    AdditionalActionType(int i) {
        this.a = i;
    }

    public static AdditionalActionType fromValue(int i) {
        for (AdditionalActionType additionalActionType : values()) {
            if (additionalActionType.a == i) {
                return additionalActionType;
            }
        }
        return UNKNOWN;
    }
}
