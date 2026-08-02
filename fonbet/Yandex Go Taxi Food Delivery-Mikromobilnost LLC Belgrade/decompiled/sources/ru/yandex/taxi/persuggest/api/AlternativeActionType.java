package ru.yandex.taxi.persuggest.api;

import defpackage.ew1;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ro1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/persuggest/api/AlternativeActionType;", "", "Companion", "ew1", "ORGANIZATION_CARD", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AlternativeActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AlternativeActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ew1 Companion;
    public static final AlternativeActionType ORGANIZATION_CARD;

    static {
        AlternativeActionType alternativeActionType = new AlternativeActionType("ORGANIZATION_CARD", 0);
        ORGANIZATION_CARD = alternativeActionType;
        AlternativeActionType[] alternativeActionTypeArr = {alternativeActionType};
        $VALUES = alternativeActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(alternativeActionTypeArr);
        Companion = new ew1();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(13));
    }

    public static AlternativeActionType valueOf(String str) {
        return (AlternativeActionType) Enum.valueOf(AlternativeActionType.class, str);
    }

    public static AlternativeActionType[] values() {
        return (AlternativeActionType[]) $VALUES.clone();
    }
}
