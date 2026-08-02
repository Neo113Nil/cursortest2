package ru.yandex.taxi.persuggest.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/persuggest/domain/model/SuggestResult$SuggestAction", "", "Lru/yandex/taxi/persuggest/domain/model/SuggestResult$SuggestAction;", "SEARCH", "SUBSTITUTE", "UNKNOWN", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SuggestResult$SuggestAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestResult$SuggestAction[] $VALUES;
    public static final SuggestResult$SuggestAction SEARCH;
    public static final SuggestResult$SuggestAction SUBSTITUTE;
    public static final SuggestResult$SuggestAction UNKNOWN;

    static {
        SuggestResult$SuggestAction suggestResult$SuggestAction = new SuggestResult$SuggestAction("SEARCH", 0);
        SEARCH = suggestResult$SuggestAction;
        SuggestResult$SuggestAction suggestResult$SuggestAction2 = new SuggestResult$SuggestAction("SUBSTITUTE", 1);
        SUBSTITUTE = suggestResult$SuggestAction2;
        SuggestResult$SuggestAction suggestResult$SuggestAction3 = new SuggestResult$SuggestAction("UNKNOWN", 2);
        UNKNOWN = suggestResult$SuggestAction3;
        SuggestResult$SuggestAction[] suggestResult$SuggestActionArr = {suggestResult$SuggestAction, suggestResult$SuggestAction2, suggestResult$SuggestAction3};
        $VALUES = suggestResult$SuggestActionArr;
        $ENTRIES = a.a(suggestResult$SuggestActionArr);
    }

    public static SuggestResult$SuggestAction valueOf(String str) {
        return (SuggestResult$SuggestAction) Enum.valueOf(SuggestResult$SuggestAction.class, str);
    }

    public static SuggestResult$SuggestAction[] values() {
        return (SuggestResult$SuggestAction[]) $VALUES.clone();
    }
}
