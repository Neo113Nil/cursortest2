package ru.yandex.taxi.requirements.interactor;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/requirements/interactor/ChangeRequirementCounterInteractor$RequirementChangeType", "", "Lru/yandex/taxi/requirements/interactor/ChangeRequirementCounterInteractor$RequirementChangeType;", "INCREMENT", "DECREMENT", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeRequirementCounterInteractor$RequirementChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeRequirementCounterInteractor$RequirementChangeType[] $VALUES;
    public static final ChangeRequirementCounterInteractor$RequirementChangeType DECREMENT;
    public static final ChangeRequirementCounterInteractor$RequirementChangeType INCREMENT;

    static {
        ChangeRequirementCounterInteractor$RequirementChangeType changeRequirementCounterInteractor$RequirementChangeType = new ChangeRequirementCounterInteractor$RequirementChangeType("INCREMENT", 0);
        INCREMENT = changeRequirementCounterInteractor$RequirementChangeType;
        ChangeRequirementCounterInteractor$RequirementChangeType changeRequirementCounterInteractor$RequirementChangeType2 = new ChangeRequirementCounterInteractor$RequirementChangeType("DECREMENT", 1);
        DECREMENT = changeRequirementCounterInteractor$RequirementChangeType2;
        ChangeRequirementCounterInteractor$RequirementChangeType[] changeRequirementCounterInteractor$RequirementChangeTypeArr = {changeRequirementCounterInteractor$RequirementChangeType, changeRequirementCounterInteractor$RequirementChangeType2};
        $VALUES = changeRequirementCounterInteractor$RequirementChangeTypeArr;
        $ENTRIES = kotlin.enums.a.a(changeRequirementCounterInteractor$RequirementChangeTypeArr);
    }

    public static ChangeRequirementCounterInteractor$RequirementChangeType valueOf(String str) {
        return (ChangeRequirementCounterInteractor$RequirementChangeType) Enum.valueOf(ChangeRequirementCounterInteractor$RequirementChangeType.class, str);
    }

    public static ChangeRequirementCounterInteractor$RequirementChangeType[] values() {
        return (ChangeRequirementCounterInteractor$RequirementChangeType[]) $VALUES.clone();
    }
}
