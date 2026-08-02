package ru.yandex.taxi.experiments.mainscreen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/experiments/mainscreen/MainScreenBehavior;", "", "", "version", "Ljava/lang/String;", "", "isShowCurrentRouteSuggest", "Z", "a", "()Z", "WHERE_TO", "SHORTCUTS", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainScreenBehavior {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenBehavior[] $VALUES;
    public static final MainScreenBehavior SHORTCUTS;
    public static final MainScreenBehavior WHERE_TO;
    private final boolean isShowCurrentRouteSuggest;
    public final String version;

    static {
        MainScreenBehavior mainScreenBehavior = new MainScreenBehavior("WHERE_TO", 0, "0", false);
        WHERE_TO = mainScreenBehavior;
        MainScreenBehavior mainScreenBehavior2 = new MainScreenBehavior("SHORTCUTS", 1, "shortcuts", true);
        SHORTCUTS = mainScreenBehavior2;
        MainScreenBehavior[] mainScreenBehaviorArr = {mainScreenBehavior, mainScreenBehavior2};
        $VALUES = mainScreenBehaviorArr;
        $ENTRIES = a.a(mainScreenBehaviorArr);
    }

    public MainScreenBehavior(String str, int i, String str2, boolean z) {
        this.version = str2;
        this.isShowCurrentRouteSuggest = z;
    }

    public static MainScreenBehavior valueOf(String str) {
        return (MainScreenBehavior) Enum.valueOf(MainScreenBehavior.class, str);
    }

    public static MainScreenBehavior[] values() {
        return (MainScreenBehavior[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsShowCurrentRouteSuggest() {
        return this.isShowCurrentRouteSuggest;
    }
}
