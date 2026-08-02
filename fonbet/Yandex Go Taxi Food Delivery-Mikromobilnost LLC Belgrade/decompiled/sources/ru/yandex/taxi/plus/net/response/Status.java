package ru.yandex.taxi.plus.net.response;

import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.y7u0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/plus/net/response/Status;", "", "Companion", "y7u0", "PENDING", "SUCCESS", "FAILURE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final y7u0 Companion;
    public static final Status FAILURE;
    public static final Status PENDING;
    public static final Status SUCCESS;
    public static final Status UNKNOWN;

    static {
        Status status = new Status("PENDING", 0);
        PENDING = status;
        Status status2 = new Status("SUCCESS", 1);
        SUCCESS = status2;
        Status status3 = new Status("FAILURE", 2);
        FAILURE = status3;
        Status status4 = new Status("UNKNOWN", 3);
        UNKNOWN = status4;
        Status[] statusArr = {status, status2, status3, status4};
        $VALUES = statusArr;
        $ENTRIES = a.a(statusArr);
        Companion = new y7u0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(7));
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
