package ru.yandex.taxi.favorites.rides.save_modal.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/favorites/rides/save_modal/dto/ResponseState;", "", "LOADING", "ERROR", "LOADED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResponseState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResponseState[] $VALUES;
    public static final ResponseState ERROR;
    public static final ResponseState LOADED;
    public static final ResponseState LOADING;

    static {
        ResponseState responseState = new ResponseState("LOADING", 0);
        LOADING = responseState;
        ResponseState responseState2 = new ResponseState("ERROR", 1);
        ERROR = responseState2;
        ResponseState responseState3 = new ResponseState("LOADED", 2);
        LOADED = responseState3;
        ResponseState[] responseStateArr = {responseState, responseState2, responseState3};
        $VALUES = responseStateArr;
        $ENTRIES = a.a(responseStateArr);
    }

    public static ResponseState valueOf(String str) {
        return (ResponseState) Enum.valueOf(ResponseState.class, str);
    }

    public static ResponseState[] values() {
        return (ResponseState[]) $VALUES.clone();
    }
}
