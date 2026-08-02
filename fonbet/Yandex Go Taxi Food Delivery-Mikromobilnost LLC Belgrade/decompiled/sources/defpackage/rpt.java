package defpackage;

import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rpt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ObserveStrategy.values().length];
        try {
            iArr[ObserveStrategy.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObserveStrategy.OnlyNoInternet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ObserveStrategy.OnlyServer.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ObserveStrategy.TaxiIsSearching.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ObserveStrategy.Favorites.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ObserveStrategy.ScootersDiscovery.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
