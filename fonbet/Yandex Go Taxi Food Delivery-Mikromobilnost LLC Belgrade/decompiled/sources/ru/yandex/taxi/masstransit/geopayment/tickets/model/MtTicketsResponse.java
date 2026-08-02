package ru.yandex.taxi.masstransit.geopayment.tickets.model;

import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.p840;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/tickets/model/MtTicketsResponse;", "", "Companion", "a", "TicketType", "o840", "p840", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MtTicketsResponse {
    public static final p840 Companion = new p840();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(1))};
    public final List a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/tickets/model/MtTicketsResponse$TicketType;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/tickets/model/d", "SUBURBAN", "AEROEXPRESS", "MASSTRANSIT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TicketType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TicketType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TicketType AEROEXPRESS;
        public static final d Companion;
        public static final TicketType MASSTRANSIT;
        public static final TicketType SUBURBAN;
        public static final TicketType UNKNOWN;

        static {
            TicketType ticketType = new TicketType("SUBURBAN", 0);
            SUBURBAN = ticketType;
            TicketType ticketType2 = new TicketType("AEROEXPRESS", 1);
            AEROEXPRESS = ticketType2;
            TicketType ticketType3 = new TicketType("MASSTRANSIT", 2);
            MASSTRANSIT = ticketType3;
            TicketType ticketType4 = new TicketType("UNKNOWN", 3);
            UNKNOWN = ticketType4;
            TicketType[] ticketTypeArr = {ticketType, ticketType2, ticketType3, ticketType4};
            $VALUES = ticketTypeArr;
            $ENTRIES = kotlin.enums.a.a(ticketTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(4));
        }

        public static k4o b() {
            return $ENTRIES;
        }

        public static TicketType valueOf(String str) {
            return (TicketType) Enum.valueOf(TicketType.class, str);
        }

        public static TicketType[] values() {
            return (TicketType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MtTicketsResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MtTicketsResponse) && jl40.l(this.a, ((MtTicketsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtTicketsResponse(items=", Extension.C_BRAKE, this.a);
    }

    public MtTicketsResponse() {
        this.a = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/tickets/model/MtTicketsResponse$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/tickets/model/b", "ru/yandex/taxi/masstransit/geopayment/tickets/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public static final i3y[] c;
        public final TicketType a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new e540(2)), kotlin.a.b(lazyThreadSafetyMode, new e540(3))};
        }

        public /* synthetic */ a(int i, TicketType ticketType, List list) {
            this.a = (i & 1) == 0 ? TicketType.UNKNOWN : ticketType;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TicketItem(type=" + this.a + ", ticketIds=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this.a = TicketType.UNKNOWN;
            this.b = EmptyList.a;
        }
    }
}
