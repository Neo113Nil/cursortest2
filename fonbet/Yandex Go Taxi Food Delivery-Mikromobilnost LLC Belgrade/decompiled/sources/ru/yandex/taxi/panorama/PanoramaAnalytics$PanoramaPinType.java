package ru.yandex.taxi.panorama;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/panorama/PanoramaAnalytics$PanoramaPinType", "", "Lru/yandex/taxi/panorama/PanoramaAnalytics$PanoramaPinType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "A", "B", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PanoramaAnalytics$PanoramaPinType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PanoramaAnalytics$PanoramaPinType[] $VALUES;
    public static final PanoramaAnalytics$PanoramaPinType A;
    public static final PanoramaAnalytics$PanoramaPinType B;
    private final String eventValue;

    static {
        PanoramaAnalytics$PanoramaPinType panoramaAnalytics$PanoramaPinType = new PanoramaAnalytics$PanoramaPinType("A", 0, "a");
        A = panoramaAnalytics$PanoramaPinType;
        PanoramaAnalytics$PanoramaPinType panoramaAnalytics$PanoramaPinType2 = new PanoramaAnalytics$PanoramaPinType("B", 1, "b");
        B = panoramaAnalytics$PanoramaPinType2;
        PanoramaAnalytics$PanoramaPinType[] panoramaAnalytics$PanoramaPinTypeArr = {panoramaAnalytics$PanoramaPinType, panoramaAnalytics$PanoramaPinType2};
        $VALUES = panoramaAnalytics$PanoramaPinTypeArr;
        $ENTRIES = kotlin.enums.a.a(panoramaAnalytics$PanoramaPinTypeArr);
    }

    public PanoramaAnalytics$PanoramaPinType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PanoramaAnalytics$PanoramaPinType valueOf(String str) {
        return (PanoramaAnalytics$PanoramaPinType) Enum.valueOf(PanoramaAnalytics$PanoramaPinType.class, str);
    }

    public static PanoramaAnalytics$PanoramaPinType[] values() {
        return (PanoramaAnalytics$PanoramaPinType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
