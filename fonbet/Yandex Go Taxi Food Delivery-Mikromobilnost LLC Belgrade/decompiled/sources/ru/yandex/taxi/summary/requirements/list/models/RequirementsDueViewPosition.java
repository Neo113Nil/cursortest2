package ru.yandex.taxi.summary.requirements.list.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/models/RequirementsDueViewPosition;", "", "DEFAULT", "GLUED", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementsDueViewPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementsDueViewPosition[] $VALUES;
    public static final RequirementsDueViewPosition DEFAULT;
    public static final RequirementsDueViewPosition GLUED;

    static {
        RequirementsDueViewPosition requirementsDueViewPosition = new RequirementsDueViewPosition("DEFAULT", 0);
        DEFAULT = requirementsDueViewPosition;
        RequirementsDueViewPosition requirementsDueViewPosition2 = new RequirementsDueViewPosition("GLUED", 1);
        GLUED = requirementsDueViewPosition2;
        RequirementsDueViewPosition[] requirementsDueViewPositionArr = {requirementsDueViewPosition, requirementsDueViewPosition2};
        $VALUES = requirementsDueViewPositionArr;
        $ENTRIES = a.a(requirementsDueViewPositionArr);
    }

    public static RequirementsDueViewPosition valueOf(String str) {
        return (RequirementsDueViewPosition) Enum.valueOf(RequirementsDueViewPosition.class, str);
    }

    public static RequirementsDueViewPosition[] values() {
        return (RequirementsDueViewPosition[]) $VALUES.clone();
    }
}
