package ru.yandex.taxi.checkin;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/checkin/CheckInButtonState;", "", "LOADING", "IDLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CheckInButtonState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckInButtonState[] $VALUES;
    public static final CheckInButtonState IDLE;
    public static final CheckInButtonState LOADING;

    static {
        CheckInButtonState checkInButtonState = new CheckInButtonState() { // from class: ru.yandex.taxi.checkin.CheckInButtonState.LOADING
            @Override // ru.yandex.taxi.checkin.CheckInButtonState
            public final void a(ButtonComponent buttonComponent, Runnable runnable) {
                buttonComponent.startProgress();
                buttonComponent.setDebounceClickListener(null);
            }
        };
        LOADING = checkInButtonState;
        CheckInButtonState checkInButtonState2 = new CheckInButtonState() { // from class: ru.yandex.taxi.checkin.CheckInButtonState.IDLE
            @Override // ru.yandex.taxi.checkin.CheckInButtonState
            public final void a(ButtonComponent buttonComponent, Runnable runnable) {
                buttonComponent.finishProgress();
                buttonComponent.setDebounceClickListener(runnable);
            }
        };
        IDLE = checkInButtonState2;
        CheckInButtonState[] checkInButtonStateArr = {checkInButtonState, checkInButtonState2};
        $VALUES = checkInButtonStateArr;
        $ENTRIES = kotlin.enums.a.a(checkInButtonStateArr);
    }

    public static CheckInButtonState valueOf(String str) {
        return (CheckInButtonState) Enum.valueOf(CheckInButtonState.class, str);
    }

    public static CheckInButtonState[] values() {
        return (CheckInButtonState[]) $VALUES.clone();
    }

    public abstract void a(ButtonComponent buttonComponent, Runnable runnable);
}
