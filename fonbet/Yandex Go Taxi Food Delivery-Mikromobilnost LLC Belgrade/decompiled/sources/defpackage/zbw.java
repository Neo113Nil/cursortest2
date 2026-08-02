package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardNavigationTarget;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class zbw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityDashboardNavigationTarget.values().length];
        try {
            iArr[IntercityDashboardNavigationTarget.FLEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardNavigationTarget.DUE_TIMETABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardNavigationTarget.SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IntercityDashboardNavigationTarget.DISCOVERY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[IntercityDashboardNavigationTarget.SUGGEST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
