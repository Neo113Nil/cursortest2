package ru.yandex.taxi.persuggest.api.finalsuggest;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/persuggest/api/finalsuggest/Type;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNKNOWN", "TO_TAXI", "CHANGE_TO_UNWHITELISTED_TARIFF", "ALWAYS_TRUE", "NO_WHITELISTED_REQUIREMENTS", "HAS_WHITELISTED_REQUIREMENTS", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type ALWAYS_TRUE;
    public static final Type CHANGE_TO_UNWHITELISTED_TARIFF;
    public static final Type HAS_WHITELISTED_REQUIREMENTS;
    public static final Type NO_WHITELISTED_REQUIREMENTS;
    public static final Type TO_TAXI;
    public static final Type UNKNOWN;
    private final String analyticsName;

    static {
        Type type = new Type("UNKNOWN", 0, "UNKNOWN");
        UNKNOWN = type;
        Type type2 = new Type("TO_TAXI", 1, "TO_TAXI");
        TO_TAXI = type2;
        Type type3 = new Type("CHANGE_TO_UNWHITELISTED_TARIFF", 2, "CHANGE_TO_UNWHITELISTED_TARIFF");
        CHANGE_TO_UNWHITELISTED_TARIFF = type3;
        Type type4 = new Type("ALWAYS_TRUE", 3, "ALWAYS_TRUE");
        ALWAYS_TRUE = type4;
        Type type5 = new Type("NO_WHITELISTED_REQUIREMENTS", 4, "NO_WHITELISTED_REQUIREMENTS");
        NO_WHITELISTED_REQUIREMENTS = type5;
        Type type6 = new Type("HAS_WHITELISTED_REQUIREMENTS", 5, "HAS_WHITELISTED_REQUIREMENTS");
        HAS_WHITELISTED_REQUIREMENTS = type6;
        Type[] typeArr = {type, type2, type3, type4, type5, type6};
        $VALUES = typeArr;
        $ENTRIES = a.a(typeArr);
    }

    public Type(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
