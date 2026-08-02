package ru.yandex.taxi;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/AutoLoginState;", "", "DISABLED", "NOT_STARTED", "STARTED", "COMPLETED", "FAILED_WITH_PASSPORT", "FAILED_WITHOUT_PASSPORT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoLoginState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoLoginState[] $VALUES;
    public static final AutoLoginState COMPLETED;
    public static final AutoLoginState DISABLED;
    public static final AutoLoginState FAILED_WITHOUT_PASSPORT;
    public static final AutoLoginState FAILED_WITH_PASSPORT;
    public static final AutoLoginState NOT_STARTED;
    public static final AutoLoginState STARTED;

    static {
        AutoLoginState autoLoginState = new AutoLoginState("DISABLED", 0);
        DISABLED = autoLoginState;
        AutoLoginState autoLoginState2 = new AutoLoginState("NOT_STARTED", 1);
        NOT_STARTED = autoLoginState2;
        AutoLoginState autoLoginState3 = new AutoLoginState("STARTED", 2);
        STARTED = autoLoginState3;
        AutoLoginState autoLoginState4 = new AutoLoginState("COMPLETED", 3);
        COMPLETED = autoLoginState4;
        AutoLoginState autoLoginState5 = new AutoLoginState("FAILED_WITH_PASSPORT", 4);
        FAILED_WITH_PASSPORT = autoLoginState5;
        AutoLoginState autoLoginState6 = new AutoLoginState("FAILED_WITHOUT_PASSPORT", 5);
        FAILED_WITHOUT_PASSPORT = autoLoginState6;
        AutoLoginState[] autoLoginStateArr = {autoLoginState, autoLoginState2, autoLoginState3, autoLoginState4, autoLoginState5, autoLoginState6};
        $VALUES = autoLoginStateArr;
        $ENTRIES = kotlin.enums.a.a(autoLoginStateArr);
    }

    public static AutoLoginState valueOf(String str) {
        return (AutoLoginState) Enum.valueOf(AutoLoginState.class, str);
    }

    public static AutoLoginState[] values() {
        return (AutoLoginState[]) $VALUES.clone();
    }
}
