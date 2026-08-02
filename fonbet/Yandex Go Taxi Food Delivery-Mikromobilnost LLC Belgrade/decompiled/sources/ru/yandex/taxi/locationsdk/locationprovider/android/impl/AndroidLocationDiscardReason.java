package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import defpackage.e3n;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.la2;
import defpackage.o430;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.time.DurationUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/locationsdk/locationprovider/android/impl/AndroidLocationDiscardReason;", "", "InfiniteCoordinates", "OutOfBoundsCoordinates", "ZeroCoordinates", "Mock", "RealtimeTooNew", "RealtimeTooOld", "location-provider-android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class AndroidLocationDiscardReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidLocationDiscardReason[] $VALUES;
    public static final AndroidLocationDiscardReason InfiniteCoordinates;
    public static final AndroidLocationDiscardReason Mock;
    public static final AndroidLocationDiscardReason OutOfBoundsCoordinates;
    public static final AndroidLocationDiscardReason RealtimeTooNew;
    public static final AndroidLocationDiscardReason RealtimeTooOld;
    public static final AndroidLocationDiscardReason ZeroCoordinates;

    static {
        AndroidLocationDiscardReason androidLocationDiscardReason = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.InfiniteCoordinates
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                return Math.abs(location.getLatitude()) > Double.MAX_VALUE || Math.abs(location.getLongitude()) > Double.MAX_VALUE;
            }
        };
        InfiniteCoordinates = androidLocationDiscardReason;
        AndroidLocationDiscardReason androidLocationDiscardReason2 = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.OutOfBoundsCoordinates
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                double latitude = location.getLatitude();
                if (-90.0d > latitude || latitude > 90.0d) {
                    return true;
                }
                double longitude = location.getLongitude();
                return -180.0d > longitude || longitude > 180.0d;
            }
        };
        OutOfBoundsCoordinates = androidLocationDiscardReason2;
        AndroidLocationDiscardReason androidLocationDiscardReason3 = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.ZeroCoordinates
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                return location.getLatitude() == 0.0d || location.getLongitude() == 0.0d;
            }
        };
        ZeroCoordinates = androidLocationDiscardReason3;
        AndroidLocationDiscardReason androidLocationDiscardReason4 = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.Mock
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                return !la2Var.a && tje.K(location);
            }
        };
        Mock = androidLocationDiscardReason4;
        AndroidLocationDiscardReason androidLocationDiscardReason5 = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.RealtimeTooNew
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                e3n e3nVar = la2Var.c;
                if (e3nVar != null) {
                    long j2 = e3nVar.a;
                    o430 o430Var = e3n.b;
                    if (e3n.c(kp50.V(location.getElapsedRealtimeNanos() - j, DurationUnit.NANOSECONDS), j2) > 0) {
                        return true;
                    }
                }
                return false;
            }
        };
        RealtimeTooNew = androidLocationDiscardReason5;
        AndroidLocationDiscardReason androidLocationDiscardReason6 = new AndroidLocationDiscardReason() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason.RealtimeTooOld
            @Override // ru.yandex.taxi.locationsdk.locationprovider.android.impl.AndroidLocationDiscardReason
            public final boolean b(Location location, long j, la2 la2Var) {
                e3n e3nVar = la2Var.b;
                if (e3nVar != null) {
                    long j2 = e3nVar.a;
                    o430 o430Var = e3n.b;
                    if (e3n.c(kp50.V(j - location.getElapsedRealtimeNanos(), DurationUnit.NANOSECONDS), j2) > 0) {
                        return true;
                    }
                }
                return false;
            }
        };
        RealtimeTooOld = androidLocationDiscardReason6;
        AndroidLocationDiscardReason[] androidLocationDiscardReasonArr = {androidLocationDiscardReason, androidLocationDiscardReason2, androidLocationDiscardReason3, androidLocationDiscardReason4, androidLocationDiscardReason5, androidLocationDiscardReason6};
        $VALUES = androidLocationDiscardReasonArr;
        $ENTRIES = kotlin.enums.a.a(androidLocationDiscardReasonArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static AndroidLocationDiscardReason valueOf(String str) {
        return (AndroidLocationDiscardReason) Enum.valueOf(AndroidLocationDiscardReason.class, str);
    }

    public static AndroidLocationDiscardReason[] values() {
        return (AndroidLocationDiscardReason[]) $VALUES.clone();
    }

    public abstract boolean b(Location location, long j, la2 la2Var);
}
