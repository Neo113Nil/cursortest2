package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import defpackage.md30;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtCheckoutDeeplinkStatus;", "", "", "wireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "md30", "SUCCESS", "FAILURE", "CANCEL", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtCheckoutDeeplinkStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtCheckoutDeeplinkStatus[] $VALUES;
    public static final MtCheckoutDeeplinkStatus CANCEL;
    public static final md30 Companion;
    public static final MtCheckoutDeeplinkStatus FAILURE;
    public static final MtCheckoutDeeplinkStatus SUCCESS;
    public static final MtCheckoutDeeplinkStatus UNKNOWN;
    private final String wireName;

    static {
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus = new MtCheckoutDeeplinkStatus("SUCCESS", 0, "SUCCESS");
        SUCCESS = mtCheckoutDeeplinkStatus;
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus2 = new MtCheckoutDeeplinkStatus("FAILURE", 1, "FAILURE");
        FAILURE = mtCheckoutDeeplinkStatus2;
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus3 = new MtCheckoutDeeplinkStatus("CANCEL", 2, "CANCEL");
        CANCEL = mtCheckoutDeeplinkStatus3;
        MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus4 = new MtCheckoutDeeplinkStatus("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = mtCheckoutDeeplinkStatus4;
        MtCheckoutDeeplinkStatus[] mtCheckoutDeeplinkStatusArr = {mtCheckoutDeeplinkStatus, mtCheckoutDeeplinkStatus2, mtCheckoutDeeplinkStatus3, mtCheckoutDeeplinkStatus4};
        $VALUES = mtCheckoutDeeplinkStatusArr;
        $ENTRIES = kotlin.enums.a.a(mtCheckoutDeeplinkStatusArr);
        Companion = new md30();
    }

    public MtCheckoutDeeplinkStatus(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MtCheckoutDeeplinkStatus valueOf(String str) {
        return (MtCheckoutDeeplinkStatus) Enum.valueOf(MtCheckoutDeeplinkStatus.class, str);
    }

    public static MtCheckoutDeeplinkStatus[] values() {
        return (MtCheckoutDeeplinkStatus[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
