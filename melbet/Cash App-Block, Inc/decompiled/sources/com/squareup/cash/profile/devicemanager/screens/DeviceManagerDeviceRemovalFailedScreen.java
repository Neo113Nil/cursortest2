package com.squareup.cash.profile.devicemanager.screens;

import app.cash.broadway.screen.Screen;
import java.util.List;

/* loaded from: classes.dex */
public interface DeviceManagerDeviceRemovalFailedScreen extends Screen {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class ErrorReason {
        public static final /* synthetic */ ErrorReason[] $VALUES;
        public static final ErrorReason CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH;

        static {
            ErrorReason errorReason = new ErrorReason("CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH", 0);
            CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH = errorReason;
            $VALUES = new ErrorReason[]{errorReason};
        }

        public static ErrorReason valueOf(String str) {
            return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
        }

        public static ErrorReason[] values() {
            return (ErrorReason[]) $VALUES.clone();
        }
    }

    int getDevicesAttemptedToRemove();

    ErrorReason getErrorReason();

    List getFailedTokens();

    int getRemoveAttemptCount();

    boolean isRemoveAll();
}
