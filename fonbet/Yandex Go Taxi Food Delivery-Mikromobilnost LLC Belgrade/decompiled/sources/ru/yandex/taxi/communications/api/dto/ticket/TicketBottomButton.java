package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.x1z0;
import defpackage.y1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketBottomButton;", "", "Companion", "TicketBottomButtonType", "ru/yandex/taxi/communications/api/dto/ticket/b", "y1z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TicketBottomButton {
    public static final y1z0 Companion = new y1z0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(0))};
    public final TicketBottomButtonType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketBottomButton$TicketBottomButtonType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/ticket/c", "CLOSE", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TicketBottomButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TicketBottomButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TicketBottomButtonType CLOSE;
        public static final c Companion;

        static {
            TicketBottomButtonType ticketBottomButtonType = new TicketBottomButtonType("CLOSE", 0);
            CLOSE = ticketBottomButtonType;
            TicketBottomButtonType[] ticketBottomButtonTypeArr = {ticketBottomButtonType};
            $VALUES = ticketBottomButtonTypeArr;
            $ENTRIES = kotlin.enums.a.a(ticketBottomButtonTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(1));
        }

        public static TicketBottomButtonType valueOf(String str) {
            return (TicketBottomButtonType) Enum.valueOf(TicketBottomButtonType.class, str);
        }

        public static TicketBottomButtonType[] values() {
            return (TicketBottomButtonType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TicketBottomButton(int i, TicketBottomButtonType ticketBottomButtonType) {
        if ((i & 1) == 0) {
            this.a = TicketBottomButtonType.CLOSE;
        } else {
            this.a = ticketBottomButtonType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TicketBottomButton) && this.a == ((TicketBottomButton) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TicketBottomButton(type=" + this.a + Extension.C_BRAKE;
    }

    public TicketBottomButton() {
        this(0);
    }

    public TicketBottomButton(int i) {
        this.a = TicketBottomButtonType.CLOSE;
    }
}
