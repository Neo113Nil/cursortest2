package defpackage;

import com.yandex.go.preorder.mode.SourceAnalyticsMode;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Type;
import ru.yandex.taxi.analytics.SourceScreenAnalytics$TappedObject;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qjt0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SourceAnalyticsMode.values().length];
        try {
            iArr[SourceAnalyticsMode.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourceAnalyticsMode.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourceAnalyticsMode.EDIT_DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SourceAnalyticsMode.ROUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SourceAnalyticsMode.SUMMARY_NO_ROUTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[MapRouteAppearance$Type.values().length];
        try {
            iArr2[MapRouteAppearance$Type.BEZIER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MapRouteAppearance$Type.WALK_ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MapRouteAppearance$Type.UNSUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[SourceScreenAnalytics$TappedObject.values().length];
        try {
            iArr3[SourceScreenAnalytics$TappedObject.ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SourceScreenAnalytics$TappedObject.BUBBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
