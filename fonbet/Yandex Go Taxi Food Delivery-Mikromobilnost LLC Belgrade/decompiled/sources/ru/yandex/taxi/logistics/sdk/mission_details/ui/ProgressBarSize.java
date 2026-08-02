package ru.yandex.taxi.logistics.sdk.mission_details.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/mission_details/ui/ProgressBarSize;", "", "S", "M", "sdk-delivery-screen-mission-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProgressBarSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProgressBarSize[] $VALUES;
    public static final ProgressBarSize M;
    public static final ProgressBarSize S;

    static {
        ProgressBarSize progressBarSize = new ProgressBarSize("S", 0);
        S = progressBarSize;
        ProgressBarSize progressBarSize2 = new ProgressBarSize("M", 1);
        M = progressBarSize2;
        ProgressBarSize[] progressBarSizeArr = {progressBarSize, progressBarSize2};
        $VALUES = progressBarSizeArr;
        $ENTRIES = kotlin.enums.a.a(progressBarSizeArr);
    }

    public static ProgressBarSize valueOf(String str) {
        return (ProgressBarSize) Enum.valueOf(ProgressBarSize.class, str);
    }

    public static ProgressBarSize[] values() {
        return (ProgressBarSize[]) $VALUES.clone();
    }
}
