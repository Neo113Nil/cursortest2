package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/paymentcards/MtTransportCardSubscriber$TransportCardEventType", "", "Lru/yandex/taxi/masstransit/paymentcards/MtTransportCardSubscriber$TransportCardEventType;", "", "eventName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CARD_ADDED", "CARD_REPLENISHED", "CARD_REMOVED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtTransportCardSubscriber$TransportCardEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTransportCardSubscriber$TransportCardEventType[] $VALUES;
    public static final MtTransportCardSubscriber$TransportCardEventType CARD_ADDED;
    public static final MtTransportCardSubscriber$TransportCardEventType CARD_REMOVED;
    public static final MtTransportCardSubscriber$TransportCardEventType CARD_REPLENISHED;
    private final String eventName;

    static {
        MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType = new MtTransportCardSubscriber$TransportCardEventType("CARD_ADDED", 0, "cardAddedSuccess");
        CARD_ADDED = mtTransportCardSubscriber$TransportCardEventType;
        MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType2 = new MtTransportCardSubscriber$TransportCardEventType("CARD_REPLENISHED", 1, "cardReplenishedSuccess");
        CARD_REPLENISHED = mtTransportCardSubscriber$TransportCardEventType2;
        MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType3 = new MtTransportCardSubscriber$TransportCardEventType("CARD_REMOVED", 2, "cardRemovedSuccess");
        CARD_REMOVED = mtTransportCardSubscriber$TransportCardEventType3;
        MtTransportCardSubscriber$TransportCardEventType[] mtTransportCardSubscriber$TransportCardEventTypeArr = {mtTransportCardSubscriber$TransportCardEventType, mtTransportCardSubscriber$TransportCardEventType2, mtTransportCardSubscriber$TransportCardEventType3};
        $VALUES = mtTransportCardSubscriber$TransportCardEventTypeArr;
        $ENTRIES = kotlin.enums.a.a(mtTransportCardSubscriber$TransportCardEventTypeArr);
    }

    public MtTransportCardSubscriber$TransportCardEventType(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MtTransportCardSubscriber$TransportCardEventType valueOf(String str) {
        return (MtTransportCardSubscriber$TransportCardEventType) Enum.valueOf(MtTransportCardSubscriber$TransportCardEventType.class, str);
    }

    public static MtTransportCardSubscriber$TransportCardEventType[] values() {
        return (MtTransportCardSubscriber$TransportCardEventType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }
}
