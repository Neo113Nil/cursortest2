package ru.yandex.taxi.preorder.mainscreen;

import defpackage.k4o;
import defpackage.zxf0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/MainScreen;", "Lzxf0;", "MainScreenMode", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MainScreen extends zxf0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/MainScreen$MainScreenMode;", "", "DEFAULT", "TAXI_FUNCTIONALITY_DISABLED", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class MainScreenMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MainScreenMode[] $VALUES;
        public static final MainScreenMode DEFAULT;
        public static final MainScreenMode TAXI_FUNCTIONALITY_DISABLED;

        static {
            MainScreenMode mainScreenMode = new MainScreenMode("DEFAULT", 0);
            DEFAULT = mainScreenMode;
            MainScreenMode mainScreenMode2 = new MainScreenMode("TAXI_FUNCTIONALITY_DISABLED", 1);
            TAXI_FUNCTIONALITY_DISABLED = mainScreenMode2;
            MainScreenMode[] mainScreenModeArr = {mainScreenMode, mainScreenMode2};
            $VALUES = mainScreenModeArr;
            $ENTRIES = a.a(mainScreenModeArr);
        }

        public static MainScreenMode valueOf(String str) {
            return (MainScreenMode) Enum.valueOf(MainScreenMode.class, str);
        }

        public static MainScreenMode[] values() {
            return (MainScreenMode[]) $VALUES.clone();
        }
    }

    void disableControlElements();

    void enableControlElements();

    int getBottomContentHeight();

    default int getTopContentHeight() {
        return 0;
    }

    ITransitionCoordinator getTransitionCoordinator();

    default void onMapCollapsed() {
    }
}
