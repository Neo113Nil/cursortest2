package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/masstransit/analytic/CloseReason;", "", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SELECT_ROUTE", "BACK_BUTTON", "SYSTEM_BACK", "CLOSE", "ROLL_OFF", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CloseReason[] $VALUES;
    public static final CloseReason BACK_BUTTON;
    public static final CloseReason CLOSE;
    public static final CloseReason ROLL_OFF;
    public static final CloseReason SELECT_ROUTE;
    public static final CloseReason SYSTEM_BACK;
    private final String reason;

    static {
        CloseReason closeReason = new CloseReason("SELECT_ROUTE", 0, "select_route");
        SELECT_ROUTE = closeReason;
        CloseReason closeReason2 = new CloseReason("BACK_BUTTON", 1, "back");
        BACK_BUTTON = closeReason2;
        CloseReason closeReason3 = new CloseReason("SYSTEM_BACK", 2, "system_back");
        SYSTEM_BACK = closeReason3;
        CloseReason closeReason4 = new CloseReason("CLOSE", 3, "close");
        CLOSE = closeReason4;
        CloseReason closeReason5 = new CloseReason("ROLL_OFF", 4, "roll_off");
        ROLL_OFF = closeReason5;
        CloseReason[] closeReasonArr = {closeReason, closeReason2, closeReason3, closeReason4, closeReason5};
        $VALUES = closeReasonArr;
        $ENTRIES = a.a(closeReasonArr);
    }

    public CloseReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static CloseReason valueOf(String str) {
        return (CloseReason) Enum.valueOf(CloseReason.class, str);
    }

    public static CloseReason[] values() {
        return (CloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
