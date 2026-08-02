package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class u9w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityDashboardSelectTariffSource.values().length];
        try {
            iArr[IntercityDashboardSelectTariffSource.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardSelectTariffSource.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardSelectTariffSource.UPDATE_DASHBOARD_CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IntercityDashboardSelectTariffSource.SUMMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
