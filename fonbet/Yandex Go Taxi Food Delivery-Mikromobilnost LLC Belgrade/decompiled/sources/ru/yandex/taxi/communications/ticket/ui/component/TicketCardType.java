package ru.yandex.taxi.communications.ticket.ui.component;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/communications/ticket/ui/component/TicketCardType;", "", "TopCard", "BottomCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TicketCardType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TicketCardType[] $VALUES;
    public static final TicketCardType BottomCard;
    public static final TicketCardType TopCard;

    static {
        TicketCardType ticketCardType = new TicketCardType("TopCard", 0);
        TopCard = ticketCardType;
        TicketCardType ticketCardType2 = new TicketCardType("BottomCard", 1);
        BottomCard = ticketCardType2;
        TicketCardType[] ticketCardTypeArr = {ticketCardType, ticketCardType2};
        $VALUES = ticketCardTypeArr;
        $ENTRIES = kotlin.enums.a.a(ticketCardTypeArr);
    }

    public static TicketCardType valueOf(String str) {
        return (TicketCardType) Enum.valueOf(TicketCardType.class, str);
    }

    public static TicketCardType[] values() {
        return (TicketCardType[]) $VALUES.clone();
    }
}
