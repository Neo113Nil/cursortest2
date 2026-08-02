package ru.yandex.taxi.tariffs.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"ru/yandex/taxi/tariffs/analytics/TariffAnalytics$Origin", "", "Lru/yandex/taxi/tariffs/analytics/TariffAnalytics$Origin;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PreorderController", "Invalidate", "ForceTariffSwitchForIntercityOrdersExperiment", "ForceTariffSwitchIntercityDashboard", "Personalstate", "Shortcut", "TrapOnlyFallback", "Action", "Deeplink", "Redirect", "DeliveryCancel", "UnsupportedRequirements", "User", "DueTimetable", "Main", "Promotion", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TariffAnalytics$Origin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffAnalytics$Origin[] $VALUES;
    public static final TariffAnalytics$Origin Action;
    public static final TariffAnalytics$Origin Deeplink;
    public static final TariffAnalytics$Origin DeliveryCancel;
    public static final TariffAnalytics$Origin DueTimetable;
    public static final TariffAnalytics$Origin ForceTariffSwitchForIntercityOrdersExperiment;
    public static final TariffAnalytics$Origin ForceTariffSwitchIntercityDashboard;
    public static final TariffAnalytics$Origin Invalidate;
    public static final TariffAnalytics$Origin Main;
    public static final TariffAnalytics$Origin Personalstate;
    public static final TariffAnalytics$Origin PreorderController;
    public static final TariffAnalytics$Origin Promotion;
    public static final TariffAnalytics$Origin Redirect;
    public static final TariffAnalytics$Origin Shortcut;
    public static final TariffAnalytics$Origin TrapOnlyFallback;
    public static final TariffAnalytics$Origin UnsupportedRequirements;
    public static final TariffAnalytics$Origin User;
    private final String eventValue;

    static {
        TariffAnalytics$Origin tariffAnalytics$Origin = new TariffAnalytics$Origin("PreorderController", 0, "preorder_controller");
        PreorderController = tariffAnalytics$Origin;
        TariffAnalytics$Origin tariffAnalytics$Origin2 = new TariffAnalytics$Origin("Invalidate", 1, "invalidate");
        Invalidate = tariffAnalytics$Origin2;
        TariffAnalytics$Origin tariffAnalytics$Origin3 = new TariffAnalytics$Origin("ForceTariffSwitchForIntercityOrdersExperiment", 2, "force_tariff_switch_for_intercity_orders_experiment");
        ForceTariffSwitchForIntercityOrdersExperiment = tariffAnalytics$Origin3;
        TariffAnalytics$Origin tariffAnalytics$Origin4 = new TariffAnalytics$Origin("ForceTariffSwitchIntercityDashboard", 3, "force_tariff_switch_intercity_dashboard");
        ForceTariffSwitchIntercityDashboard = tariffAnalytics$Origin4;
        TariffAnalytics$Origin tariffAnalytics$Origin5 = new TariffAnalytics$Origin("Personalstate", 4, "personalstate");
        Personalstate = tariffAnalytics$Origin5;
        TariffAnalytics$Origin tariffAnalytics$Origin6 = new TariffAnalytics$Origin("Shortcut", 5, "shortcut");
        Shortcut = tariffAnalytics$Origin6;
        TariffAnalytics$Origin tariffAnalytics$Origin7 = new TariffAnalytics$Origin("TrapOnlyFallback", 6, "trap_only_fallback");
        TrapOnlyFallback = tariffAnalytics$Origin7;
        TariffAnalytics$Origin tariffAnalytics$Origin8 = new TariffAnalytics$Origin("Action", 7, "action");
        Action = tariffAnalytics$Origin8;
        TariffAnalytics$Origin tariffAnalytics$Origin9 = new TariffAnalytics$Origin("Deeplink", 8, Constants.DEEPLINK);
        Deeplink = tariffAnalytics$Origin9;
        TariffAnalytics$Origin tariffAnalytics$Origin10 = new TariffAnalytics$Origin("Redirect", 9, "redirect");
        Redirect = tariffAnalytics$Origin10;
        TariffAnalytics$Origin tariffAnalytics$Origin11 = new TariffAnalytics$Origin("DeliveryCancel", 10, "delivery_cancel");
        DeliveryCancel = tariffAnalytics$Origin11;
        TariffAnalytics$Origin tariffAnalytics$Origin12 = new TariffAnalytics$Origin("UnsupportedRequirements", 11, "unsupported_requirements");
        UnsupportedRequirements = tariffAnalytics$Origin12;
        TariffAnalytics$Origin tariffAnalytics$Origin13 = new TariffAnalytics$Origin("User", 12, "user");
        User = tariffAnalytics$Origin13;
        TariffAnalytics$Origin tariffAnalytics$Origin14 = new TariffAnalytics$Origin("DueTimetable", 13, "due_timetable");
        DueTimetable = tariffAnalytics$Origin14;
        TariffAnalytics$Origin tariffAnalytics$Origin15 = new TariffAnalytics$Origin("Main", 14, "main");
        Main = tariffAnalytics$Origin15;
        TariffAnalytics$Origin tariffAnalytics$Origin16 = new TariffAnalytics$Origin("Promotion", 15, "promotion");
        Promotion = tariffAnalytics$Origin16;
        TariffAnalytics$Origin[] tariffAnalytics$OriginArr = {tariffAnalytics$Origin, tariffAnalytics$Origin2, tariffAnalytics$Origin3, tariffAnalytics$Origin4, tariffAnalytics$Origin5, tariffAnalytics$Origin6, tariffAnalytics$Origin7, tariffAnalytics$Origin8, tariffAnalytics$Origin9, tariffAnalytics$Origin10, tariffAnalytics$Origin11, tariffAnalytics$Origin12, tariffAnalytics$Origin13, tariffAnalytics$Origin14, tariffAnalytics$Origin15, tariffAnalytics$Origin16};
        $VALUES = tariffAnalytics$OriginArr;
        $ENTRIES = a.a(tariffAnalytics$OriginArr);
    }

    public TariffAnalytics$Origin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TariffAnalytics$Origin valueOf(String str) {
        return (TariffAnalytics$Origin) Enum.valueOf(TariffAnalytics$Origin.class, str);
    }

    public static TariffAnalytics$Origin[] values() {
        return (TariffAnalytics$Origin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
