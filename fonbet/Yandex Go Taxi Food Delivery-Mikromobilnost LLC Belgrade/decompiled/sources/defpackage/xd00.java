package defpackage;

import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class xd00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteStatsMode.values().length];
        try {
            iArr[RouteStatsMode.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteStatsMode.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
