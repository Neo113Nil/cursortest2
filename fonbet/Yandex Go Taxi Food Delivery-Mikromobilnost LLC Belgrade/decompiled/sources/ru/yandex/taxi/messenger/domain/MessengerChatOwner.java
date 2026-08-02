package ru.yandex.taxi.messenger.domain;

import defpackage.g110;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w020;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/messenger/domain/MessengerChatOwner;", "", "Companion", "w020", "DELIVERY", "TAXI_ORDER", "MARKETPLACE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerChatOwner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessengerChatOwner[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final w020 Companion;
    public static final MessengerChatOwner DELIVERY;
    public static final MessengerChatOwner MARKETPLACE;
    public static final MessengerChatOwner TAXI_ORDER;

    static {
        MessengerChatOwner messengerChatOwner = new MessengerChatOwner("DELIVERY", 0);
        DELIVERY = messengerChatOwner;
        MessengerChatOwner messengerChatOwner2 = new MessengerChatOwner("TAXI_ORDER", 1);
        TAXI_ORDER = messengerChatOwner2;
        MessengerChatOwner messengerChatOwner3 = new MessengerChatOwner("MARKETPLACE", 2);
        MARKETPLACE = messengerChatOwner3;
        MessengerChatOwner[] messengerChatOwnerArr = {messengerChatOwner, messengerChatOwner2, messengerChatOwner3};
        $VALUES = messengerChatOwnerArr;
        $ENTRIES = kotlin.enums.a.a(messengerChatOwnerArr);
        Companion = new w020();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(13));
    }

    public static MessengerChatOwner valueOf(String str) {
        return (MessengerChatOwner) Enum.valueOf(MessengerChatOwner.class, str);
    }

    public static MessengerChatOwner[] values() {
        return (MessengerChatOwner[]) $VALUES.clone();
    }
}
