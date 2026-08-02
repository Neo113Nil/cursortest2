package ru.yandex.taxi.masstransit.experiment;

import defpackage.cao;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iqo;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/ExperimentAction;", "", "Companion", "iqo", "SHARE_ROUTE", "VIEW_ON_MAP", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExperimentAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final iqo Companion;
    public static final ExperimentAction SHARE_ROUTE;
    public static final ExperimentAction UNKNOWN;
    public static final ExperimentAction VIEW_ON_MAP;

    static {
        ExperimentAction experimentAction = new ExperimentAction("SHARE_ROUTE", 0);
        SHARE_ROUTE = experimentAction;
        ExperimentAction experimentAction2 = new ExperimentAction("VIEW_ON_MAP", 1);
        VIEW_ON_MAP = experimentAction2;
        ExperimentAction experimentAction3 = new ExperimentAction("UNKNOWN", 2);
        UNKNOWN = experimentAction3;
        ExperimentAction[] experimentActionArr = {experimentAction, experimentAction2, experimentAction3};
        $VALUES = experimentActionArr;
        $ENTRIES = kotlin.enums.a.a(experimentActionArr);
        Companion = new iqo();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cao(20));
    }

    public static ExperimentAction valueOf(String str) {
        return (ExperimentAction) Enum.valueOf(ExperimentAction.class, str);
    }

    public static ExperimentAction[] values() {
        return (ExperimentAction[]) $VALUES.clone();
    }
}
