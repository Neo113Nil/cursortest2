package ru.yandex.taxi.masstransit.tickets.analyticks;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$OrderAction", "", "Lru/yandex/taxi/masstransit/tickets/analyticks/MasstransitTicketsAnalytics$OrderAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Scroll", "TicketPaging", "Deeplink", "CopyToClipboard", "Update", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitTicketsAnalytics$OrderAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitTicketsAnalytics$OrderAction[] $VALUES;
    public static final MasstransitTicketsAnalytics$OrderAction CopyToClipboard;
    public static final MasstransitTicketsAnalytics$OrderAction Deeplink;
    public static final MasstransitTicketsAnalytics$OrderAction Scroll;
    public static final MasstransitTicketsAnalytics$OrderAction TicketPaging;
    public static final MasstransitTicketsAnalytics$OrderAction Update;
    private final String eventValue;

    static {
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction = new MasstransitTicketsAnalytics$OrderAction("Scroll", 0, "scroll");
        Scroll = masstransitTicketsAnalytics$OrderAction;
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction2 = new MasstransitTicketsAnalytics$OrderAction("TicketPaging", 1, "ticket_paging");
        TicketPaging = masstransitTicketsAnalytics$OrderAction2;
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction3 = new MasstransitTicketsAnalytics$OrderAction("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = masstransitTicketsAnalytics$OrderAction3;
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction4 = new MasstransitTicketsAnalytics$OrderAction("CopyToClipboard", 3, "copyToClipboard");
        CopyToClipboard = masstransitTicketsAnalytics$OrderAction4;
        MasstransitTicketsAnalytics$OrderAction masstransitTicketsAnalytics$OrderAction5 = new MasstransitTicketsAnalytics$OrderAction("Update", 4, "update");
        Update = masstransitTicketsAnalytics$OrderAction5;
        MasstransitTicketsAnalytics$OrderAction[] masstransitTicketsAnalytics$OrderActionArr = {masstransitTicketsAnalytics$OrderAction, masstransitTicketsAnalytics$OrderAction2, masstransitTicketsAnalytics$OrderAction3, masstransitTicketsAnalytics$OrderAction4, masstransitTicketsAnalytics$OrderAction5};
        $VALUES = masstransitTicketsAnalytics$OrderActionArr;
        $ENTRIES = a.a(masstransitTicketsAnalytics$OrderActionArr);
    }

    public MasstransitTicketsAnalytics$OrderAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitTicketsAnalytics$OrderAction valueOf(String str) {
        return (MasstransitTicketsAnalytics$OrderAction) Enum.valueOf(MasstransitTicketsAnalytics$OrderAction.class, str);
    }

    public static MasstransitTicketsAnalytics$OrderAction[] values() {
        return (MasstransitTicketsAnalytics$OrderAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
