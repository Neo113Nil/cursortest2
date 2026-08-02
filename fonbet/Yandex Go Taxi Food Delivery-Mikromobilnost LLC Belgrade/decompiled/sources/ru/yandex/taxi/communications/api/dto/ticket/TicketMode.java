package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.m2z0;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketMode;", "", "Companion", "m2z0", "TICKET", "CARD", "ROUNDED_CARD", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TicketMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TicketMode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TicketMode CARD;
    public static final m2z0 Companion;
    public static final TicketMode ROUNDED_CARD;
    public static final TicketMode TICKET;

    static {
        TicketMode ticketMode = new TicketMode("TICKET", 0);
        TICKET = ticketMode;
        TicketMode ticketMode2 = new TicketMode("CARD", 1);
        CARD = ticketMode2;
        TicketMode ticketMode3 = new TicketMode("ROUNDED_CARD", 2);
        ROUNDED_CARD = ticketMode3;
        TicketMode[] ticketModeArr = {ticketMode, ticketMode2, ticketMode3};
        $VALUES = ticketModeArr;
        $ENTRIES = kotlin.enums.a.a(ticketModeArr);
        Companion = new m2z0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(2));
    }

    public static TicketMode valueOf(String str) {
        return (TicketMode) Enum.valueOf(TicketMode.class, str);
    }

    public static TicketMode[] values() {
        return (TicketMode[]) $VALUES.clone();
    }
}
