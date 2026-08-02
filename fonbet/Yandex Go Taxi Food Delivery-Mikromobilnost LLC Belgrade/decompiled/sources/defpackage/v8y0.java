package defpackage;

import ru.yandex.taxi.panorama.PanoramaAnalytics$UserInteractAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class v8y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PanoramaAnalytics$UserInteractAction.values().length];
        try {
            iArr[PanoramaAnalytics$UserInteractAction.Zoom.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PanoramaAnalytics$UserInteractAction.Move.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PanoramaAnalytics$UserInteractAction.ArrowTap.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PanoramaAnalytics$UserInteractAction.ReturnTap.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
