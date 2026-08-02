package ru.yandex.taxi.gopayments.dto;

import defpackage.k4o;
import defpackage.qmr0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/gopayments/dto/SharedAccountType;", "", "", "typeId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "qmr0", "FAMILY", "BUSINESS", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SharedAccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedAccountType[] $VALUES;
    public static final SharedAccountType BUSINESS;
    public static final qmr0 Companion;
    public static final SharedAccountType FAMILY;
    public static final SharedAccountType UNKNOWN;
    private final String typeId;

    static {
        SharedAccountType sharedAccountType = new SharedAccountType("FAMILY", 0, "family");
        FAMILY = sharedAccountType;
        SharedAccountType sharedAccountType2 = new SharedAccountType("BUSINESS", 1, "business");
        BUSINESS = sharedAccountType2;
        SharedAccountType sharedAccountType3 = new SharedAccountType("UNKNOWN", 2, null);
        UNKNOWN = sharedAccountType3;
        SharedAccountType[] sharedAccountTypeArr = {sharedAccountType, sharedAccountType2, sharedAccountType3};
        $VALUES = sharedAccountTypeArr;
        $ENTRIES = a.a(sharedAccountTypeArr);
        Companion = new qmr0();
    }

    public SharedAccountType(String str, int i, String str2) {
        this.typeId = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SharedAccountType valueOf(String str) {
        return (SharedAccountType) Enum.valueOf(SharedAccountType.class, str);
    }

    public static SharedAccountType[] values() {
        return (SharedAccountType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getTypeId() {
        return this.typeId;
    }
}
