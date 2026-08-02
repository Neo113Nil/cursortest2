package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/ScootersMobilityHubFinishResolution;", "", "CONTINUE_ROUTE", "DISMISS_ROUTE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersMobilityHubFinishResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMobilityHubFinishResolution[] $VALUES;
    public static final ScootersMobilityHubFinishResolution CONTINUE_ROUTE;
    public static final ScootersMobilityHubFinishResolution DISMISS_ROUTE;

    static {
        ScootersMobilityHubFinishResolution scootersMobilityHubFinishResolution = new ScootersMobilityHubFinishResolution("CONTINUE_ROUTE", 0);
        CONTINUE_ROUTE = scootersMobilityHubFinishResolution;
        ScootersMobilityHubFinishResolution scootersMobilityHubFinishResolution2 = new ScootersMobilityHubFinishResolution("DISMISS_ROUTE", 1);
        DISMISS_ROUTE = scootersMobilityHubFinishResolution2;
        ScootersMobilityHubFinishResolution[] scootersMobilityHubFinishResolutionArr = {scootersMobilityHubFinishResolution, scootersMobilityHubFinishResolution2};
        $VALUES = scootersMobilityHubFinishResolutionArr;
        $ENTRIES = kotlin.enums.a.a(scootersMobilityHubFinishResolutionArr);
    }

    public static ScootersMobilityHubFinishResolution valueOf(String str) {
        return (ScootersMobilityHubFinishResolution) Enum.valueOf(ScootersMobilityHubFinishResolution.class, str);
    }

    public static ScootersMobilityHubFinishResolution[] values() {
        return (ScootersMobilityHubFinishResolution[]) $VALUES.clone();
    }
}
