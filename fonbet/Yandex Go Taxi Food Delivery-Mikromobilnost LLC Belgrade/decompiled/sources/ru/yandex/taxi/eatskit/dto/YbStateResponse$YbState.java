package ru.yandex.taxi.eatskit.dto;

import defpackage.dp51;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qx51;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/eatskit/dto/YbStateResponse$YbState", "", "Lru/yandex/taxi/eatskit/dto/YbStateResponse$YbState;", "Companion", "qx51", "UNAVAILABLE", "RESTRICTED", "NO_BANK_ACCOUNT", "UNAUTHENTICATED", "UNAUTHORIZED", "NORMAL", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class YbStateResponse$YbState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbStateResponse$YbState[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final qx51 Companion;
    public static final YbStateResponse$YbState NORMAL;
    public static final YbStateResponse$YbState NO_BANK_ACCOUNT;
    public static final YbStateResponse$YbState RESTRICTED;
    public static final YbStateResponse$YbState UNAUTHENTICATED;
    public static final YbStateResponse$YbState UNAUTHORIZED;
    public static final YbStateResponse$YbState UNAVAILABLE;

    static {
        YbStateResponse$YbState ybStateResponse$YbState = new YbStateResponse$YbState("UNAVAILABLE", 0);
        UNAVAILABLE = ybStateResponse$YbState;
        YbStateResponse$YbState ybStateResponse$YbState2 = new YbStateResponse$YbState("RESTRICTED", 1);
        RESTRICTED = ybStateResponse$YbState2;
        YbStateResponse$YbState ybStateResponse$YbState3 = new YbStateResponse$YbState("NO_BANK_ACCOUNT", 2);
        NO_BANK_ACCOUNT = ybStateResponse$YbState3;
        YbStateResponse$YbState ybStateResponse$YbState4 = new YbStateResponse$YbState("UNAUTHENTICATED", 3);
        UNAUTHENTICATED = ybStateResponse$YbState4;
        YbStateResponse$YbState ybStateResponse$YbState5 = new YbStateResponse$YbState("UNAUTHORIZED", 4);
        UNAUTHORIZED = ybStateResponse$YbState5;
        YbStateResponse$YbState ybStateResponse$YbState6 = new YbStateResponse$YbState("NORMAL", 5);
        NORMAL = ybStateResponse$YbState6;
        YbStateResponse$YbState[] ybStateResponse$YbStateArr = {ybStateResponse$YbState, ybStateResponse$YbState2, ybStateResponse$YbState3, ybStateResponse$YbState4, ybStateResponse$YbState5, ybStateResponse$YbState6};
        $VALUES = ybStateResponse$YbStateArr;
        $ENTRIES = kotlin.enums.a.a(ybStateResponse$YbStateArr);
        Companion = new qx51();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dp51(9));
    }

    public static YbStateResponse$YbState valueOf(String str) {
        return (YbStateResponse$YbState) Enum.valueOf(YbStateResponse$YbState.class, str);
    }

    public static YbStateResponse$YbState[] values() {
        return (YbStateResponse$YbState[]) $VALUES.clone();
    }
}
