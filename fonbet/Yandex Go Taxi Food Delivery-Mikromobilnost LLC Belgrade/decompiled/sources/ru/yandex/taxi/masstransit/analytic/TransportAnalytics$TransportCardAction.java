package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportAnalytics$TransportCardAction", "", "Lru/yandex/taxi/masstransit/analytic/TransportAnalytics$TransportCardAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TopUp", "Manage", "AddCard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportAnalytics$TransportCardAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportAnalytics$TransportCardAction[] $VALUES;
    public static final TransportAnalytics$TransportCardAction AddCard;
    public static final TransportAnalytics$TransportCardAction Manage;
    public static final TransportAnalytics$TransportCardAction TopUp;
    private final String eventValue;

    static {
        TransportAnalytics$TransportCardAction transportAnalytics$TransportCardAction = new TransportAnalytics$TransportCardAction("TopUp", 0, "top_up");
        TopUp = transportAnalytics$TransportCardAction;
        TransportAnalytics$TransportCardAction transportAnalytics$TransportCardAction2 = new TransportAnalytics$TransportCardAction("Manage", 1, "manage");
        Manage = transportAnalytics$TransportCardAction2;
        TransportAnalytics$TransportCardAction transportAnalytics$TransportCardAction3 = new TransportAnalytics$TransportCardAction("AddCard", 2, "add_card");
        AddCard = transportAnalytics$TransportCardAction3;
        TransportAnalytics$TransportCardAction[] transportAnalytics$TransportCardActionArr = {transportAnalytics$TransportCardAction, transportAnalytics$TransportCardAction2, transportAnalytics$TransportCardAction3};
        $VALUES = transportAnalytics$TransportCardActionArr;
        $ENTRIES = a.a(transportAnalytics$TransportCardActionArr);
    }

    public TransportAnalytics$TransportCardAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportAnalytics$TransportCardAction valueOf(String str) {
        return (TransportAnalytics$TransportCardAction) Enum.valueOf(TransportAnalytics$TransportCardAction.class, str);
    }

    public static TransportAnalytics$TransportCardAction[] values() {
        return (TransportAnalytics$TransportCardAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
