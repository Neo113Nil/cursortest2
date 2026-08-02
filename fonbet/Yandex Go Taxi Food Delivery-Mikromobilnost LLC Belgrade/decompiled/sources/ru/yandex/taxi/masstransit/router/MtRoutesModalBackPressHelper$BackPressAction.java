package ru.yandex.taxi.masstransit.router;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/masstransit/router/MtRoutesModalBackPressHelper$BackPressAction", "", "Lru/yandex/taxi/masstransit/router/MtRoutesModalBackPressHelper$BackPressAction;", "Collapse", "GoBack", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtRoutesModalBackPressHelper$BackPressAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtRoutesModalBackPressHelper$BackPressAction[] $VALUES;
    public static final MtRoutesModalBackPressHelper$BackPressAction Collapse;
    public static final MtRoutesModalBackPressHelper$BackPressAction GoBack;

    static {
        MtRoutesModalBackPressHelper$BackPressAction mtRoutesModalBackPressHelper$BackPressAction = new MtRoutesModalBackPressHelper$BackPressAction("Collapse", 0);
        Collapse = mtRoutesModalBackPressHelper$BackPressAction;
        MtRoutesModalBackPressHelper$BackPressAction mtRoutesModalBackPressHelper$BackPressAction2 = new MtRoutesModalBackPressHelper$BackPressAction("GoBack", 1);
        GoBack = mtRoutesModalBackPressHelper$BackPressAction2;
        MtRoutesModalBackPressHelper$BackPressAction[] mtRoutesModalBackPressHelper$BackPressActionArr = {mtRoutesModalBackPressHelper$BackPressAction, mtRoutesModalBackPressHelper$BackPressAction2};
        $VALUES = mtRoutesModalBackPressHelper$BackPressActionArr;
        $ENTRIES = kotlin.enums.a.a(mtRoutesModalBackPressHelper$BackPressActionArr);
    }

    public static MtRoutesModalBackPressHelper$BackPressAction valueOf(String str) {
        return (MtRoutesModalBackPressHelper$BackPressAction) Enum.valueOf(MtRoutesModalBackPressHelper$BackPressAction.class, str);
    }

    public static MtRoutesModalBackPressHelper$BackPressAction[] values() {
        return (MtRoutesModalBackPressHelper$BackPressAction[]) $VALUES.clone();
    }
}
