package ru.yandex.taxi.plus.api.dto.state.subscription;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.c3u0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o1v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/plus/api/dto/state/subscription/SubscriptionStatusDto;", "", "Companion", "o1v0", "AVAILABLE", "PURCHASING", Card.ACTIVE, "NOT_AVAILABLE", "UNRECOGNIZED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubscriptionStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SubscriptionStatusDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SubscriptionStatusDto ACTIVE;
    public static final SubscriptionStatusDto AVAILABLE;
    public static final o1v0 Companion;
    public static final SubscriptionStatusDto NOT_AVAILABLE;
    public static final SubscriptionStatusDto PURCHASING;
    public static final SubscriptionStatusDto UNRECOGNIZED;

    static {
        SubscriptionStatusDto subscriptionStatusDto = new SubscriptionStatusDto("AVAILABLE", 0);
        AVAILABLE = subscriptionStatusDto;
        SubscriptionStatusDto subscriptionStatusDto2 = new SubscriptionStatusDto("PURCHASING", 1);
        PURCHASING = subscriptionStatusDto2;
        SubscriptionStatusDto subscriptionStatusDto3 = new SubscriptionStatusDto(Card.ACTIVE, 2);
        ACTIVE = subscriptionStatusDto3;
        SubscriptionStatusDto subscriptionStatusDto4 = new SubscriptionStatusDto("NOT_AVAILABLE", 3);
        NOT_AVAILABLE = subscriptionStatusDto4;
        SubscriptionStatusDto subscriptionStatusDto5 = new SubscriptionStatusDto("UNRECOGNIZED", 4);
        UNRECOGNIZED = subscriptionStatusDto5;
        SubscriptionStatusDto[] subscriptionStatusDtoArr = {subscriptionStatusDto, subscriptionStatusDto2, subscriptionStatusDto3, subscriptionStatusDto4, subscriptionStatusDto5};
        $VALUES = subscriptionStatusDtoArr;
        $ENTRIES = a.a(subscriptionStatusDtoArr);
        Companion = new o1v0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(22));
    }

    public static SubscriptionStatusDto valueOf(String str) {
        return (SubscriptionStatusDto) Enum.valueOf(SubscriptionStatusDto.class, str);
    }

    public static SubscriptionStatusDto[] values() {
        return (SubscriptionStatusDto[]) $VALUES.clone();
    }
}
