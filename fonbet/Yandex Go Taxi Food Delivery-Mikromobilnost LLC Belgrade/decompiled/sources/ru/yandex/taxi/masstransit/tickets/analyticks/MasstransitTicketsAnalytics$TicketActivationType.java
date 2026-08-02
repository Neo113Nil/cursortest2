package ru.yandex.taxi.masstransit.tickets.analyticks;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$TicketActivationType", "", "Lru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$TicketActivationType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "QR", "NFC", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitTicketsAnalytics$TicketActivationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitTicketsAnalytics$TicketActivationType[] $VALUES;
    public static final MasstransitTicketsAnalytics$TicketActivationType NFC;
    public static final MasstransitTicketsAnalytics$TicketActivationType QR;
    private final String eventValue;

    static {
        MasstransitTicketsAnalytics$TicketActivationType masstransitTicketsAnalytics$TicketActivationType = new MasstransitTicketsAnalytics$TicketActivationType("QR", 0, "QR");
        QR = masstransitTicketsAnalytics$TicketActivationType;
        MasstransitTicketsAnalytics$TicketActivationType masstransitTicketsAnalytics$TicketActivationType2 = new MasstransitTicketsAnalytics$TicketActivationType("NFC", 1, "NFC");
        NFC = masstransitTicketsAnalytics$TicketActivationType2;
        MasstransitTicketsAnalytics$TicketActivationType[] masstransitTicketsAnalytics$TicketActivationTypeArr = {masstransitTicketsAnalytics$TicketActivationType, masstransitTicketsAnalytics$TicketActivationType2};
        $VALUES = masstransitTicketsAnalytics$TicketActivationTypeArr;
        $ENTRIES = a.a(masstransitTicketsAnalytics$TicketActivationTypeArr);
    }

    public MasstransitTicketsAnalytics$TicketActivationType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitTicketsAnalytics$TicketActivationType valueOf(String str) {
        return (MasstransitTicketsAnalytics$TicketActivationType) Enum.valueOf(MasstransitTicketsAnalytics$TicketActivationType.class, str);
    }

    public static MasstransitTicketsAnalytics$TicketActivationType[] values() {
        return (MasstransitTicketsAnalytics$TicketActivationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
