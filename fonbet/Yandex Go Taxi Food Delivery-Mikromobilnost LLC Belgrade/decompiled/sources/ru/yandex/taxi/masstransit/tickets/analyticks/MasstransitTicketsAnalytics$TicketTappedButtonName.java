package ru.yandex.taxi.masstransit.tickets.analyticks;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$TicketTappedButtonName", "", "Lru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$TicketTappedButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NameRoute", "VisualCode", "HowActivate", "Activate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitTicketsAnalytics$TicketTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitTicketsAnalytics$TicketTappedButtonName[] $VALUES;
    public static final MasstransitTicketsAnalytics$TicketTappedButtonName Activate;
    public static final MasstransitTicketsAnalytics$TicketTappedButtonName HowActivate;
    public static final MasstransitTicketsAnalytics$TicketTappedButtonName NameRoute;
    public static final MasstransitTicketsAnalytics$TicketTappedButtonName VisualCode;
    private final String eventValue;

    static {
        MasstransitTicketsAnalytics$TicketTappedButtonName masstransitTicketsAnalytics$TicketTappedButtonName = new MasstransitTicketsAnalytics$TicketTappedButtonName("NameRoute", 0, "name_route");
        NameRoute = masstransitTicketsAnalytics$TicketTappedButtonName;
        MasstransitTicketsAnalytics$TicketTappedButtonName masstransitTicketsAnalytics$TicketTappedButtonName2 = new MasstransitTicketsAnalytics$TicketTappedButtonName("VisualCode", 1, "visual_code");
        VisualCode = masstransitTicketsAnalytics$TicketTappedButtonName2;
        MasstransitTicketsAnalytics$TicketTappedButtonName masstransitTicketsAnalytics$TicketTappedButtonName3 = new MasstransitTicketsAnalytics$TicketTappedButtonName("HowActivate", 2, "how_activate");
        HowActivate = masstransitTicketsAnalytics$TicketTappedButtonName3;
        MasstransitTicketsAnalytics$TicketTappedButtonName masstransitTicketsAnalytics$TicketTappedButtonName4 = new MasstransitTicketsAnalytics$TicketTappedButtonName("Activate", 3, "activate");
        Activate = masstransitTicketsAnalytics$TicketTappedButtonName4;
        MasstransitTicketsAnalytics$TicketTappedButtonName[] masstransitTicketsAnalytics$TicketTappedButtonNameArr = {masstransitTicketsAnalytics$TicketTappedButtonName, masstransitTicketsAnalytics$TicketTappedButtonName2, masstransitTicketsAnalytics$TicketTappedButtonName3, masstransitTicketsAnalytics$TicketTappedButtonName4};
        $VALUES = masstransitTicketsAnalytics$TicketTappedButtonNameArr;
        $ENTRIES = a.a(masstransitTicketsAnalytics$TicketTappedButtonNameArr);
    }

    public MasstransitTicketsAnalytics$TicketTappedButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitTicketsAnalytics$TicketTappedButtonName valueOf(String str) {
        return (MasstransitTicketsAnalytics$TicketTappedButtonName) Enum.valueOf(MasstransitTicketsAnalytics$TicketTappedButtonName.class, str);
    }

    public static MasstransitTicketsAnalytics$TicketTappedButtonName[] values() {
        return (MasstransitTicketsAnalytics$TicketTappedButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
