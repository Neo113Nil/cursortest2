package ru.yandex.tankerapp.yb.models;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/tankerapp/yb/models/YbState;", "", "<init>", "(Ljava/lang/String;I)V", "Unavailable", "Restricted", "NoBankAccount", "Unauthenticated", "Unauthorized", "Normal", "yb_sdk_adapter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YbState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbState[] $VALUES;

    @ysq0("unavailable")
    public static final YbState Unavailable = new YbState("Unavailable", 0);

    @ysq0("restricted")
    public static final YbState Restricted = new YbState("Restricted", 1);

    @ysq0("noBankAccount")
    public static final YbState NoBankAccount = new YbState("NoBankAccount", 2);

    @ysq0("unauthenticated")
    public static final YbState Unauthenticated = new YbState("Unauthenticated", 3);

    @ysq0("unauthorized")
    public static final YbState Unauthorized = new YbState("Unauthorized", 4);

    @ysq0(Constants.NORMAL)
    public static final YbState Normal = new YbState("Normal", 5);

    private static final /* synthetic */ YbState[] $values() {
        return new YbState[]{Unavailable, Restricted, NoBankAccount, Unauthenticated, Unauthorized, Normal};
    }

    static {
        YbState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbState valueOf(String str) {
        return (YbState) Enum.valueOf(YbState.class, str);
    }

    public static YbState[] values() {
        return (YbState[]) $VALUES.clone();
    }
}
