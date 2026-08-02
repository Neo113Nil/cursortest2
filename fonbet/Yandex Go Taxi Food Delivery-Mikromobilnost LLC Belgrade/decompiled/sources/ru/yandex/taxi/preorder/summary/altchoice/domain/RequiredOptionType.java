package ru.yandex.taxi.preorder.summary.altchoice.domain;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/preorder/summary/altchoice/domain/RequiredOptionType;", "", "ALT_CHOICE", "DELIVERY_INTERVALS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequiredOptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequiredOptionType[] $VALUES;
    public static final RequiredOptionType ALT_CHOICE;
    public static final RequiredOptionType DELIVERY_INTERVALS;

    static {
        RequiredOptionType requiredOptionType = new RequiredOptionType("ALT_CHOICE", 0);
        ALT_CHOICE = requiredOptionType;
        RequiredOptionType requiredOptionType2 = new RequiredOptionType("DELIVERY_INTERVALS", 1);
        DELIVERY_INTERVALS = requiredOptionType2;
        RequiredOptionType[] requiredOptionTypeArr = {requiredOptionType, requiredOptionType2};
        $VALUES = requiredOptionTypeArr;
        $ENTRIES = a.a(requiredOptionTypeArr);
    }

    public static RequiredOptionType valueOf(String str) {
        return (RequiredOptionType) Enum.valueOf(RequiredOptionType.class, str);
    }

    public static RequiredOptionType[] values() {
        return (RequiredOptionType[]) $VALUES.clone();
    }
}
