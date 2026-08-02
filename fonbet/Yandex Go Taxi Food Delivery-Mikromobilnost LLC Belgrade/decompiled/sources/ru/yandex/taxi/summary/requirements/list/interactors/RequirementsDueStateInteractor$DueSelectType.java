package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/summary/requirements/list/interactors/RequirementsDueStateInteractor$DueSelectType", "", "Lru/yandex/taxi/summary/requirements/list/interactors/RequirementsDueStateInteractor$DueSelectType;", "ONLY_VARIANT", "SELECTABLE", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementsDueStateInteractor$DueSelectType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementsDueStateInteractor$DueSelectType[] $VALUES;
    public static final RequirementsDueStateInteractor$DueSelectType ONLY_VARIANT;
    public static final RequirementsDueStateInteractor$DueSelectType SELECTABLE;

    static {
        RequirementsDueStateInteractor$DueSelectType requirementsDueStateInteractor$DueSelectType = new RequirementsDueStateInteractor$DueSelectType("ONLY_VARIANT", 0);
        ONLY_VARIANT = requirementsDueStateInteractor$DueSelectType;
        RequirementsDueStateInteractor$DueSelectType requirementsDueStateInteractor$DueSelectType2 = new RequirementsDueStateInteractor$DueSelectType("SELECTABLE", 1);
        SELECTABLE = requirementsDueStateInteractor$DueSelectType2;
        RequirementsDueStateInteractor$DueSelectType[] requirementsDueStateInteractor$DueSelectTypeArr = {requirementsDueStateInteractor$DueSelectType, requirementsDueStateInteractor$DueSelectType2};
        $VALUES = requirementsDueStateInteractor$DueSelectTypeArr;
        $ENTRIES = kotlin.enums.a.a(requirementsDueStateInteractor$DueSelectTypeArr);
    }

    public static RequirementsDueStateInteractor$DueSelectType valueOf(String str) {
        return (RequirementsDueStateInteractor$DueSelectType) Enum.valueOf(RequirementsDueStateInteractor$DueSelectType.class, str);
    }

    public static RequirementsDueStateInteractor$DueSelectType[] values() {
        return (RequirementsDueStateInteractor$DueSelectType[]) $VALUES.clone();
    }
}
