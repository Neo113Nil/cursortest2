package io.flutter.embedding.engine.systemchannels;

import defpackage.g8e;

/* loaded from: classes4.dex */
public enum PlatformChannel$HapticFeedbackType {
    STANDARD(null),
    LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
    MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
    HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
    SELECTION_CLICK("HapticFeedbackType.selectionClick");

    private final String encodedName;

    PlatformChannel$HapticFeedbackType(String str) {
        this.encodedName = str;
    }

    public static PlatformChannel$HapticFeedbackType a(String str) {
        for (PlatformChannel$HapticFeedbackType platformChannel$HapticFeedbackType : values()) {
            String str2 = platformChannel$HapticFeedbackType.encodedName;
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return platformChannel$HapticFeedbackType;
            }
        }
        throw new NoSuchFieldException(g8e.o("No such HapticFeedbackType: ", str));
    }
}
