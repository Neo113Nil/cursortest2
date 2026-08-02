package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.n2z0;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketOnShowFeature;", "", "Companion", "TicketOnShowFeatureType", "ru/yandex/taxi/communications/api/dto/ticket/d", "n2z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TicketOnShowFeature {
    public static final n2z0 Companion = new n2z0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(3))};
    public final TicketOnShowFeatureType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/communications/api/dto/ticket/TicketOnShowFeature$TicketOnShowFeatureType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/ticket/e", "VIBRATION", "CONFETTI", JCP.RAW_PREFIX, "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TicketOnShowFeatureType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TicketOnShowFeatureType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TicketOnShowFeatureType CONFETTI;
        public static final e Companion;
        public static final TicketOnShowFeatureType NONE;
        public static final TicketOnShowFeatureType VIBRATION;

        static {
            TicketOnShowFeatureType ticketOnShowFeatureType = new TicketOnShowFeatureType("VIBRATION", 0);
            VIBRATION = ticketOnShowFeatureType;
            TicketOnShowFeatureType ticketOnShowFeatureType2 = new TicketOnShowFeatureType("CONFETTI", 1);
            CONFETTI = ticketOnShowFeatureType2;
            TicketOnShowFeatureType ticketOnShowFeatureType3 = new TicketOnShowFeatureType(JCP.RAW_PREFIX, 2);
            NONE = ticketOnShowFeatureType3;
            TicketOnShowFeatureType[] ticketOnShowFeatureTypeArr = {ticketOnShowFeatureType, ticketOnShowFeatureType2, ticketOnShowFeatureType3};
            $VALUES = ticketOnShowFeatureTypeArr;
            $ENTRIES = kotlin.enums.a.a(ticketOnShowFeatureTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(4));
        }

        public static TicketOnShowFeatureType valueOf(String str) {
            return (TicketOnShowFeatureType) Enum.valueOf(TicketOnShowFeatureType.class, str);
        }

        public static TicketOnShowFeatureType[] values() {
            return (TicketOnShowFeatureType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TicketOnShowFeature(int i, TicketOnShowFeatureType ticketOnShowFeatureType) {
        if ((i & 1) == 0) {
            this.a = TicketOnShowFeatureType.NONE;
        } else {
            this.a = ticketOnShowFeatureType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TicketOnShowFeature) && this.a == ((TicketOnShowFeature) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TicketOnShowFeature(type=" + this.a + Extension.C_BRAKE;
    }

    public TicketOnShowFeature(TicketOnShowFeatureType ticketOnShowFeatureType) {
        this.a = ticketOnShowFeatureType;
    }

    public TicketOnShowFeature() {
        this(TicketOnShowFeatureType.NONE);
    }
}
