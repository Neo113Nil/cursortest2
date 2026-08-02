package ru.yandex.taxi.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/domain/RequirementAddressInputType;", "", "FLOOR", "APARTMENT", "DOOR_PHONE", "PORCH", "COMMENT", "address"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequirementAddressInputType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementAddressInputType[] $VALUES;
    public static final RequirementAddressInputType APARTMENT;
    public static final RequirementAddressInputType COMMENT;
    public static final RequirementAddressInputType DOOR_PHONE;
    public static final RequirementAddressInputType FLOOR;
    public static final RequirementAddressInputType PORCH;

    static {
        RequirementAddressInputType requirementAddressInputType = new RequirementAddressInputType("FLOOR", 0);
        FLOOR = requirementAddressInputType;
        RequirementAddressInputType requirementAddressInputType2 = new RequirementAddressInputType("APARTMENT", 1);
        APARTMENT = requirementAddressInputType2;
        RequirementAddressInputType requirementAddressInputType3 = new RequirementAddressInputType("DOOR_PHONE", 2);
        DOOR_PHONE = requirementAddressInputType3;
        RequirementAddressInputType requirementAddressInputType4 = new RequirementAddressInputType("PORCH", 3);
        PORCH = requirementAddressInputType4;
        RequirementAddressInputType requirementAddressInputType5 = new RequirementAddressInputType("COMMENT", 4);
        COMMENT = requirementAddressInputType5;
        RequirementAddressInputType[] requirementAddressInputTypeArr = {requirementAddressInputType, requirementAddressInputType2, requirementAddressInputType3, requirementAddressInputType4, requirementAddressInputType5};
        $VALUES = requirementAddressInputTypeArr;
        $ENTRIES = kotlin.enums.a.a(requirementAddressInputTypeArr);
    }

    public static RequirementAddressInputType valueOf(String str) {
        return (RequirementAddressInputType) Enum.valueOf(RequirementAddressInputType.class, str);
    }

    public static RequirementAddressInputType[] values() {
        return (RequirementAddressInputType[]) $VALUES.clone();
    }
}
