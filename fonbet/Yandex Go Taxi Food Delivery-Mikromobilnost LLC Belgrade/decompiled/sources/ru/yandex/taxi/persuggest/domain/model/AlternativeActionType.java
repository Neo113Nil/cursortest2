package ru.yandex.taxi.persuggest.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/persuggest/domain/model/AlternativeActionType;", "", "ORGANIZATION_CARD", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AlternativeActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AlternativeActionType[] $VALUES;
    public static final AlternativeActionType ORGANIZATION_CARD;

    static {
        AlternativeActionType alternativeActionType = new AlternativeActionType("ORGANIZATION_CARD", 0);
        ORGANIZATION_CARD = alternativeActionType;
        AlternativeActionType[] alternativeActionTypeArr = {alternativeActionType};
        $VALUES = alternativeActionTypeArr;
        $ENTRIES = a.a(alternativeActionTypeArr);
    }

    public static AlternativeActionType valueOf(String str) {
        return (AlternativeActionType) Enum.valueOf(AlternativeActionType.class, str);
    }

    public static AlternativeActionType[] values() {
        return (AlternativeActionType[]) $VALUES.clone();
    }
}
