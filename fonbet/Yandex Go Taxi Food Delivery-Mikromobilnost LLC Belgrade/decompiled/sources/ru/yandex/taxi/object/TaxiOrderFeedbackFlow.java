package ru.yandex.taxi.object;

import defpackage.gsq0;
import defpackage.i1y0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mpx0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/object/TaxiOrderFeedbackFlow;", "", "Companion", "i1y0", "FORCE_SCREEN", "TRACKING_ONLY", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderFeedbackFlow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderFeedbackFlow[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final i1y0 Companion;
    public static final TaxiOrderFeedbackFlow FORCE_SCREEN;
    public static final TaxiOrderFeedbackFlow TRACKING_ONLY;

    static {
        TaxiOrderFeedbackFlow taxiOrderFeedbackFlow = new TaxiOrderFeedbackFlow("FORCE_SCREEN", 0);
        FORCE_SCREEN = taxiOrderFeedbackFlow;
        TaxiOrderFeedbackFlow taxiOrderFeedbackFlow2 = new TaxiOrderFeedbackFlow("TRACKING_ONLY", 1);
        TRACKING_ONLY = taxiOrderFeedbackFlow2;
        TaxiOrderFeedbackFlow[] taxiOrderFeedbackFlowArr = {taxiOrderFeedbackFlow, taxiOrderFeedbackFlow2};
        $VALUES = taxiOrderFeedbackFlowArr;
        $ENTRIES = a.a(taxiOrderFeedbackFlowArr);
        Companion = new i1y0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(28));
    }

    public static TaxiOrderFeedbackFlow valueOf(String str) {
        return (TaxiOrderFeedbackFlow) Enum.valueOf(TaxiOrderFeedbackFlow.class, str);
    }

    public static TaxiOrderFeedbackFlow[] values() {
        return (TaxiOrderFeedbackFlow[]) $VALUES.clone();
    }
}
