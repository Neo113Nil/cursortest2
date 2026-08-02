package com.squareup.cash.initialscreenloader.backend;

/* loaded from: classes.dex */
public interface OpenTheAppUserJourney {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InitialScreen {
        public static final /* synthetic */ InitialScreen[] $VALUES;
        public static final InitialScreen ACCOUNT_PICKER;
        public static final InitialScreen HOME;
        public static final InitialScreen ONBOARDING_FLOW;
        public static final InitialScreen PRE_SIGN_IN;
        public static final InitialScreen RESTORED_STATE;

        static {
            InitialScreen initialScreen = new InitialScreen("ONBOARDING_FLOW", 0);
            ONBOARDING_FLOW = initialScreen;
            InitialScreen initialScreen2 = new InitialScreen("PRE_SIGN_IN", 1);
            PRE_SIGN_IN = initialScreen2;
            InitialScreen initialScreen3 = new InitialScreen("ACCOUNT_PICKER", 2);
            ACCOUNT_PICKER = initialScreen3;
            InitialScreen initialScreen4 = new InitialScreen("HOME", 3);
            HOME = initialScreen4;
            InitialScreen initialScreen5 = new InitialScreen("RESTORED_STATE", 4);
            RESTORED_STATE = initialScreen5;
            $VALUES = new InitialScreen[]{initialScreen, initialScreen2, initialScreen3, initialScreen4, initialScreen5};
        }

        public static InitialScreen valueOf(String str) {
            return (InitialScreen) Enum.valueOf(InitialScreen.class, str);
        }

        public static InitialScreen[] values() {
            return (InitialScreen[]) $VALUES.clone();
        }
    }
}
