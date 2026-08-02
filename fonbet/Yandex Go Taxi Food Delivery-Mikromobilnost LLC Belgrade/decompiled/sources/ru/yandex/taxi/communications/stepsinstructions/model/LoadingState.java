package ru.yandex.taxi.communications.stepsinstructions.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/communications/stepsinstructions/model/LoadingState;", "", "LOADING", "READY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final LoadingState LOADING;
    public static final LoadingState READY;

    static {
        LoadingState loadingState = new LoadingState("LOADING", 0);
        LOADING = loadingState;
        LoadingState loadingState2 = new LoadingState("READY", 1);
        READY = loadingState2;
        LoadingState[] loadingStateArr = {loadingState, loadingState2};
        $VALUES = loadingStateArr;
        $ENTRIES = a.a(loadingStateArr);
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) $VALUES.clone();
    }
}
