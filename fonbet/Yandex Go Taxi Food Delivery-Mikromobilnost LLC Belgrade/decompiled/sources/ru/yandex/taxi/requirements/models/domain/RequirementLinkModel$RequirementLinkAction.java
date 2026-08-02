package ru.yandex.taxi.requirements.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/requirements/models/domain/RequirementLinkModel$RequirementLinkAction", "", "Lru/yandex/taxi/requirements/models/domain/RequirementLinkModel$RequirementLinkAction;", "ENABLE", "SHOW", "SHOW_AND_ENABLE", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementLinkModel$RequirementLinkAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementLinkModel$RequirementLinkAction[] $VALUES;
    public static final RequirementLinkModel$RequirementLinkAction ENABLE;
    public static final RequirementLinkModel$RequirementLinkAction SHOW;
    public static final RequirementLinkModel$RequirementLinkAction SHOW_AND_ENABLE;

    static {
        RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction = new RequirementLinkModel$RequirementLinkAction("ENABLE", 0);
        ENABLE = requirementLinkModel$RequirementLinkAction;
        RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction2 = new RequirementLinkModel$RequirementLinkAction("SHOW", 1);
        SHOW = requirementLinkModel$RequirementLinkAction2;
        RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction3 = new RequirementLinkModel$RequirementLinkAction("SHOW_AND_ENABLE", 2);
        SHOW_AND_ENABLE = requirementLinkModel$RequirementLinkAction3;
        RequirementLinkModel$RequirementLinkAction[] requirementLinkModel$RequirementLinkActionArr = {requirementLinkModel$RequirementLinkAction, requirementLinkModel$RequirementLinkAction2, requirementLinkModel$RequirementLinkAction3};
        $VALUES = requirementLinkModel$RequirementLinkActionArr;
        $ENTRIES = a.a(requirementLinkModel$RequirementLinkActionArr);
    }

    public static RequirementLinkModel$RequirementLinkAction valueOf(String str) {
        return (RequirementLinkModel$RequirementLinkAction) Enum.valueOf(RequirementLinkModel$RequirementLinkAction.class, str);
    }

    public static RequirementLinkModel$RequirementLinkAction[] values() {
        return (RequirementLinkModel$RequirementLinkAction[]) $VALUES.clone();
    }
}
