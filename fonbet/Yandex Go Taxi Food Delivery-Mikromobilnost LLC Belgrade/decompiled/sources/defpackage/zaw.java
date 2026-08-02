package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class zaw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.values().length];
        try {
            iArr[IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
