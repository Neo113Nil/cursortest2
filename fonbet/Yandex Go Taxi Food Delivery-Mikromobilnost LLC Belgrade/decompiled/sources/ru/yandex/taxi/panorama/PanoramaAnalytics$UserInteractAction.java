package ru.yandex.taxi.panorama;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/panorama/PanoramaAnalytics$UserInteractAction", "", "Lru/yandex/taxi/panorama/PanoramaAnalytics$UserInteractAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Zoom", "Move", "ArrowTap", "ReturnTap", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PanoramaAnalytics$UserInteractAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PanoramaAnalytics$UserInteractAction[] $VALUES;
    public static final PanoramaAnalytics$UserInteractAction ArrowTap;
    public static final PanoramaAnalytics$UserInteractAction Move;
    public static final PanoramaAnalytics$UserInteractAction ReturnTap;
    public static final PanoramaAnalytics$UserInteractAction Zoom;
    private final String eventValue;

    static {
        PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction = new PanoramaAnalytics$UserInteractAction("Zoom", 0, "zoom");
        Zoom = panoramaAnalytics$UserInteractAction;
        PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction2 = new PanoramaAnalytics$UserInteractAction("Move", 1, "move");
        Move = panoramaAnalytics$UserInteractAction2;
        PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction3 = new PanoramaAnalytics$UserInteractAction("ArrowTap", 2, "arrow_tap");
        ArrowTap = panoramaAnalytics$UserInteractAction3;
        PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction4 = new PanoramaAnalytics$UserInteractAction("ReturnTap", 3, "return_tap");
        ReturnTap = panoramaAnalytics$UserInteractAction4;
        PanoramaAnalytics$UserInteractAction[] panoramaAnalytics$UserInteractActionArr = {panoramaAnalytics$UserInteractAction, panoramaAnalytics$UserInteractAction2, panoramaAnalytics$UserInteractAction3, panoramaAnalytics$UserInteractAction4};
        $VALUES = panoramaAnalytics$UserInteractActionArr;
        $ENTRIES = kotlin.enums.a.a(panoramaAnalytics$UserInteractActionArr);
    }

    public PanoramaAnalytics$UserInteractAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PanoramaAnalytics$UserInteractAction valueOf(String str) {
        return (PanoramaAnalytics$UserInteractAction) Enum.valueOf(PanoramaAnalytics$UserInteractAction.class, str);
    }

    public static PanoramaAnalytics$UserInteractAction[] values() {
        return (PanoramaAnalytics$UserInteractAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
