package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/paymentcards/TransportCardAction;", "", "ADD_TRANSPORT_CARD", "OPEN_TRANSPORT_CARDS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportCardAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportCardAction[] $VALUES;
    public static final TransportCardAction ADD_TRANSPORT_CARD;
    public static final TransportCardAction OPEN_TRANSPORT_CARDS;

    static {
        TransportCardAction transportCardAction = new TransportCardAction("ADD_TRANSPORT_CARD", 0);
        ADD_TRANSPORT_CARD = transportCardAction;
        TransportCardAction transportCardAction2 = new TransportCardAction("OPEN_TRANSPORT_CARDS", 1);
        OPEN_TRANSPORT_CARDS = transportCardAction2;
        TransportCardAction[] transportCardActionArr = {transportCardAction, transportCardAction2};
        $VALUES = transportCardActionArr;
        $ENTRIES = kotlin.enums.a.a(transportCardActionArr);
    }

    public static TransportCardAction valueOf(String str) {
        return (TransportCardAction) Enum.valueOf(TransportCardAction.class, str);
    }

    public static TransportCardAction[] values() {
        return (TransportCardAction[]) $VALUES.clone();
    }
}
