package ru.yandex.taxi.persuggest.api;

import defpackage.cz;
import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/api/ActionType;", "", "Companion", "cz", "DEEPLINK", "SEARCH_IN_GOOGLE", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final cz Companion;
    public static final ActionType DEEPLINK;
    public static final ActionType SEARCH_IN_GOOGLE;

    static {
        ActionType actionType = new ActionType("DEEPLINK", 0);
        DEEPLINK = actionType;
        ActionType actionType2 = new ActionType("SEARCH_IN_GOOGLE", 1);
        SEARCH_IN_GOOGLE = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        $VALUES = actionTypeArr;
        $ENTRIES = kotlin.enums.a.a(actionTypeArr);
        Companion = new cz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(14));
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
