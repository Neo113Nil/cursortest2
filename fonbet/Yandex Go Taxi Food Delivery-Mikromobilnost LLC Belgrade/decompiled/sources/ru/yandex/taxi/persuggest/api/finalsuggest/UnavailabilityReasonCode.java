package ru.yandex.taxi.persuggest.api.finalsuggest;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.k4o;
import defpackage.lw11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/persuggest/api/finalsuggest/UnavailabilityReasonCode;", "", "Companion", "lw11", "NO_EXPERIMENT", "NOT_PORTAL", "BAD_REQUEST", "NO_DRIVE_RESPONSE", "NOT_REGISTERED", "NO_SERVICE", "NO_CARS", "BAD_DST", "OTHER", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnavailabilityReasonCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UnavailabilityReasonCode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final UnavailabilityReasonCode BAD_DST;
    public static final UnavailabilityReasonCode BAD_REQUEST;
    public static final lw11 Companion;
    public static final UnavailabilityReasonCode NOT_PORTAL;
    public static final UnavailabilityReasonCode NOT_REGISTERED;
    public static final UnavailabilityReasonCode NO_CARS;
    public static final UnavailabilityReasonCode NO_DRIVE_RESPONSE;
    public static final UnavailabilityReasonCode NO_EXPERIMENT;
    public static final UnavailabilityReasonCode NO_SERVICE;
    public static final UnavailabilityReasonCode OTHER;

    static {
        UnavailabilityReasonCode unavailabilityReasonCode = new UnavailabilityReasonCode("NO_EXPERIMENT", 0);
        NO_EXPERIMENT = unavailabilityReasonCode;
        UnavailabilityReasonCode unavailabilityReasonCode2 = new UnavailabilityReasonCode("NOT_PORTAL", 1);
        NOT_PORTAL = unavailabilityReasonCode2;
        UnavailabilityReasonCode unavailabilityReasonCode3 = new UnavailabilityReasonCode("BAD_REQUEST", 2);
        BAD_REQUEST = unavailabilityReasonCode3;
        UnavailabilityReasonCode unavailabilityReasonCode4 = new UnavailabilityReasonCode("NO_DRIVE_RESPONSE", 3);
        NO_DRIVE_RESPONSE = unavailabilityReasonCode4;
        UnavailabilityReasonCode unavailabilityReasonCode5 = new UnavailabilityReasonCode("NOT_REGISTERED", 4);
        NOT_REGISTERED = unavailabilityReasonCode5;
        UnavailabilityReasonCode unavailabilityReasonCode6 = new UnavailabilityReasonCode("NO_SERVICE", 5);
        NO_SERVICE = unavailabilityReasonCode6;
        UnavailabilityReasonCode unavailabilityReasonCode7 = new UnavailabilityReasonCode("NO_CARS", 6);
        NO_CARS = unavailabilityReasonCode7;
        UnavailabilityReasonCode unavailabilityReasonCode8 = new UnavailabilityReasonCode("BAD_DST", 7);
        BAD_DST = unavailabilityReasonCode8;
        UnavailabilityReasonCode unavailabilityReasonCode9 = new UnavailabilityReasonCode("OTHER", 8);
        OTHER = unavailabilityReasonCode9;
        UnavailabilityReasonCode[] unavailabilityReasonCodeArr = {unavailabilityReasonCode, unavailabilityReasonCode2, unavailabilityReasonCode3, unavailabilityReasonCode4, unavailabilityReasonCode5, unavailabilityReasonCode6, unavailabilityReasonCode7, unavailabilityReasonCode8, unavailabilityReasonCode9};
        $VALUES = unavailabilityReasonCodeArr;
        $ENTRIES = a.a(unavailabilityReasonCodeArr);
        Companion = new lw11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(16));
    }

    public static UnavailabilityReasonCode valueOf(String str) {
        return (UnavailabilityReasonCode) Enum.valueOf(UnavailabilityReasonCode.class, str);
    }

    public static UnavailabilityReasonCode[] values() {
        return (UnavailabilityReasonCode[]) $VALUES.clone();
    }
}
