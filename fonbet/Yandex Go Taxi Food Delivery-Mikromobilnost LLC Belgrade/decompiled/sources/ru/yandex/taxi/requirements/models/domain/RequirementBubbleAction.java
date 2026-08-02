package ru.yandex.taxi.requirements.models.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/requirements/models/domain/RequirementBubbleAction;", "", "CLOSE", "PREORDER", "INTERCITY_CONTACT", "REMOVE_ALT_CHOICE", "COMPOUND_OPTIONS", "COUNTER_PLUS", "COUNTER_MINUS", "nonblocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementBubbleAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementBubbleAction[] $VALUES;
    public static final RequirementBubbleAction CLOSE;
    public static final RequirementBubbleAction COMPOUND_OPTIONS;
    public static final RequirementBubbleAction COUNTER_MINUS;
    public static final RequirementBubbleAction COUNTER_PLUS;
    public static final RequirementBubbleAction INTERCITY_CONTACT;
    public static final RequirementBubbleAction PREORDER;
    public static final RequirementBubbleAction REMOVE_ALT_CHOICE;

    static {
        RequirementBubbleAction requirementBubbleAction = new RequirementBubbleAction("CLOSE", 0);
        CLOSE = requirementBubbleAction;
        RequirementBubbleAction requirementBubbleAction2 = new RequirementBubbleAction("PREORDER", 1);
        PREORDER = requirementBubbleAction2;
        RequirementBubbleAction requirementBubbleAction3 = new RequirementBubbleAction("INTERCITY_CONTACT", 2);
        INTERCITY_CONTACT = requirementBubbleAction3;
        RequirementBubbleAction requirementBubbleAction4 = new RequirementBubbleAction("REMOVE_ALT_CHOICE", 3);
        REMOVE_ALT_CHOICE = requirementBubbleAction4;
        RequirementBubbleAction requirementBubbleAction5 = new RequirementBubbleAction("COMPOUND_OPTIONS", 4);
        COMPOUND_OPTIONS = requirementBubbleAction5;
        RequirementBubbleAction requirementBubbleAction6 = new RequirementBubbleAction("COUNTER_PLUS", 5);
        COUNTER_PLUS = requirementBubbleAction6;
        RequirementBubbleAction requirementBubbleAction7 = new RequirementBubbleAction("COUNTER_MINUS", 6);
        COUNTER_MINUS = requirementBubbleAction7;
        RequirementBubbleAction[] requirementBubbleActionArr = {requirementBubbleAction, requirementBubbleAction2, requirementBubbleAction3, requirementBubbleAction4, requirementBubbleAction5, requirementBubbleAction6, requirementBubbleAction7};
        $VALUES = requirementBubbleActionArr;
        $ENTRIES = a.a(requirementBubbleActionArr);
    }

    public static RequirementBubbleAction valueOf(String str) {
        return (RequirementBubbleAction) Enum.valueOf(RequirementBubbleAction.class, str);
    }

    public static RequirementBubbleAction[] values() {
        return (RequirementBubbleAction[]) $VALUES.clone();
    }
}
