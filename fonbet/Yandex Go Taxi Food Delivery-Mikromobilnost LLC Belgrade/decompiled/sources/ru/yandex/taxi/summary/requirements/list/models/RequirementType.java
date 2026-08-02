package ru.yandex.taxi.summary.requirements.list.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/models/RequirementType;", "", "DRIVER_COMMENT", "EXTRA_PHONE_NUMBER", "ORDER_FOR_OTHER", "ORDER_DUE", "INTERCITY_CONTACT", "COST_CENTER", "TRANSFER", "TESTING_COMMANDS", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementType[] $VALUES;
    public static final RequirementType COST_CENTER;
    public static final RequirementType DRIVER_COMMENT;
    public static final RequirementType EXTRA_PHONE_NUMBER;
    public static final RequirementType INTERCITY_CONTACT;
    public static final RequirementType ORDER_DUE;
    public static final RequirementType ORDER_FOR_OTHER;
    public static final RequirementType TESTING_COMMANDS;
    public static final RequirementType TRANSFER;

    static {
        RequirementType requirementType = new RequirementType("DRIVER_COMMENT", 0);
        DRIVER_COMMENT = requirementType;
        RequirementType requirementType2 = new RequirementType("EXTRA_PHONE_NUMBER", 1);
        EXTRA_PHONE_NUMBER = requirementType2;
        RequirementType requirementType3 = new RequirementType("ORDER_FOR_OTHER", 2);
        ORDER_FOR_OTHER = requirementType3;
        RequirementType requirementType4 = new RequirementType("ORDER_DUE", 3);
        ORDER_DUE = requirementType4;
        RequirementType requirementType5 = new RequirementType("INTERCITY_CONTACT", 4);
        INTERCITY_CONTACT = requirementType5;
        RequirementType requirementType6 = new RequirementType("COST_CENTER", 5);
        COST_CENTER = requirementType6;
        RequirementType requirementType7 = new RequirementType("TRANSFER", 6);
        TRANSFER = requirementType7;
        RequirementType requirementType8 = new RequirementType("TESTING_COMMANDS", 7);
        TESTING_COMMANDS = requirementType8;
        RequirementType[] requirementTypeArr = {requirementType, requirementType2, requirementType3, requirementType4, requirementType5, requirementType6, requirementType7, requirementType8};
        $VALUES = requirementTypeArr;
        $ENTRIES = a.a(requirementTypeArr);
    }

    public static RequirementType valueOf(String str) {
        return (RequirementType) Enum.valueOf(RequirementType.class, str);
    }

    public static RequirementType[] values() {
        return (RequirementType[]) $VALUES.clone();
    }
}
