package ru.yandex.taxi.linked_order.models.net.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.gpy;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wky;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/linked_order/models/net/dto/LinkedOrderStatusDto;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "gpy", "PREORDER", "SEARCH", "SCHEDULING", "SCHEDULED", "DRIVING", "WAITING", "TRANSPORTING", "COMPLETE", "CANCELLED", "FAILED", Card.EXPIRED, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkedOrderStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkedOrderStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LinkedOrderStatusDto CANCELLED;
    public static final LinkedOrderStatusDto COMPLETE;
    public static final gpy Companion;
    public static final LinkedOrderStatusDto DRIVING;
    public static final LinkedOrderStatusDto EXPIRED;
    public static final LinkedOrderStatusDto FAILED;
    public static final LinkedOrderStatusDto PREORDER;
    public static final LinkedOrderStatusDto SCHEDULED;
    public static final LinkedOrderStatusDto SCHEDULING;
    public static final LinkedOrderStatusDto SEARCH;
    public static final LinkedOrderStatusDto TRANSPORTING;
    public static final LinkedOrderStatusDto WAITING;
    private final String analyticsName;

    static {
        LinkedOrderStatusDto linkedOrderStatusDto = new LinkedOrderStatusDto("PREORDER", 0, "preorder");
        PREORDER = linkedOrderStatusDto;
        LinkedOrderStatusDto linkedOrderStatusDto2 = new LinkedOrderStatusDto("SEARCH", 1, "search");
        SEARCH = linkedOrderStatusDto2;
        LinkedOrderStatusDto linkedOrderStatusDto3 = new LinkedOrderStatusDto("SCHEDULING", 2, "scheduling");
        SCHEDULING = linkedOrderStatusDto3;
        LinkedOrderStatusDto linkedOrderStatusDto4 = new LinkedOrderStatusDto("SCHEDULED", 3, "scheduled");
        SCHEDULED = linkedOrderStatusDto4;
        LinkedOrderStatusDto linkedOrderStatusDto5 = new LinkedOrderStatusDto("DRIVING", 4, "driving");
        DRIVING = linkedOrderStatusDto5;
        LinkedOrderStatusDto linkedOrderStatusDto6 = new LinkedOrderStatusDto("WAITING", 5, "waiting");
        WAITING = linkedOrderStatusDto6;
        LinkedOrderStatusDto linkedOrderStatusDto7 = new LinkedOrderStatusDto("TRANSPORTING", 6, "transporting");
        TRANSPORTING = linkedOrderStatusDto7;
        LinkedOrderStatusDto linkedOrderStatusDto8 = new LinkedOrderStatusDto("COMPLETE", 7, "complete");
        COMPLETE = linkedOrderStatusDto8;
        LinkedOrderStatusDto linkedOrderStatusDto9 = new LinkedOrderStatusDto("CANCELLED", 8, "cancelled");
        CANCELLED = linkedOrderStatusDto9;
        LinkedOrderStatusDto linkedOrderStatusDto10 = new LinkedOrderStatusDto("FAILED", 9, "failed");
        FAILED = linkedOrderStatusDto10;
        LinkedOrderStatusDto linkedOrderStatusDto11 = new LinkedOrderStatusDto(Card.EXPIRED, 10, "expired");
        EXPIRED = linkedOrderStatusDto11;
        LinkedOrderStatusDto[] linkedOrderStatusDtoArr = {linkedOrderStatusDto, linkedOrderStatusDto2, linkedOrderStatusDto3, linkedOrderStatusDto4, linkedOrderStatusDto5, linkedOrderStatusDto6, linkedOrderStatusDto7, linkedOrderStatusDto8, linkedOrderStatusDto9, linkedOrderStatusDto10, linkedOrderStatusDto11};
        $VALUES = linkedOrderStatusDtoArr;
        $ENTRIES = a.a(linkedOrderStatusDtoArr);
        Companion = new gpy();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wky(6));
    }

    public LinkedOrderStatusDto(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static LinkedOrderStatusDto valueOf(String str) {
        return (LinkedOrderStatusDto) Enum.valueOf(LinkedOrderStatusDto.class, str);
    }

    public static LinkedOrderStatusDto[] values() {
        return (LinkedOrderStatusDto[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
