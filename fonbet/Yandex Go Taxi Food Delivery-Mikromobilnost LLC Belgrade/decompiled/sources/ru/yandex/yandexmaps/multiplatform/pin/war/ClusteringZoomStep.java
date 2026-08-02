package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/ClusteringZoomStep;", "", "", "value", "F", "a", "()F", "FULL", "HALF", "QUARTER", "EIGHTH", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClusteringZoomStep {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClusteringZoomStep[] $VALUES;
    public static final ClusteringZoomStep EIGHTH;
    public static final ClusteringZoomStep FULL;
    public static final ClusteringZoomStep HALF;
    public static final ClusteringZoomStep QUARTER;
    private final float value;

    static {
        ClusteringZoomStep clusteringZoomStep = new ClusteringZoomStep("FULL", 0, 1.0f);
        FULL = clusteringZoomStep;
        ClusteringZoomStep clusteringZoomStep2 = new ClusteringZoomStep("HALF", 1, 0.5f);
        HALF = clusteringZoomStep2;
        ClusteringZoomStep clusteringZoomStep3 = new ClusteringZoomStep("QUARTER", 2, 0.25f);
        QUARTER = clusteringZoomStep3;
        ClusteringZoomStep clusteringZoomStep4 = new ClusteringZoomStep("EIGHTH", 3, 0.125f);
        EIGHTH = clusteringZoomStep4;
        ClusteringZoomStep[] clusteringZoomStepArr = {clusteringZoomStep, clusteringZoomStep2, clusteringZoomStep3, clusteringZoomStep4};
        $VALUES = clusteringZoomStepArr;
        $ENTRIES = kotlin.enums.a.a(clusteringZoomStepArr);
    }

    public ClusteringZoomStep(String str, int i, float f) {
        this.value = f;
    }

    public static ClusteringZoomStep valueOf(String str) {
        return (ClusteringZoomStep) Enum.valueOf(ClusteringZoomStep.class, str);
    }

    public static ClusteringZoomStep[] values() {
        return (ClusteringZoomStep[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getValue() {
        return this.value;
    }
}
