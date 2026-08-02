package ru.yandex.taxi.client.dto;

import defpackage.aww;
import defpackage.dwx;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/client/dto/LaunchParam$SupportedFeatures", "", "Lru/yandex/taxi/client/dto/LaunchParam$SupportedFeatures;", "Companion", "dwx", "MULTIORDER", "PENDING_ORDERS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LaunchParam$SupportedFeatures {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LaunchParam$SupportedFeatures[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final dwx Companion;
    public static final LaunchParam$SupportedFeatures MULTIORDER;
    public static final LaunchParam$SupportedFeatures PENDING_ORDERS;

    static {
        LaunchParam$SupportedFeatures launchParam$SupportedFeatures = new LaunchParam$SupportedFeatures("MULTIORDER", 0);
        MULTIORDER = launchParam$SupportedFeatures;
        LaunchParam$SupportedFeatures launchParam$SupportedFeatures2 = new LaunchParam$SupportedFeatures("PENDING_ORDERS", 1);
        PENDING_ORDERS = launchParam$SupportedFeatures2;
        LaunchParam$SupportedFeatures[] launchParam$SupportedFeaturesArr = {launchParam$SupportedFeatures, launchParam$SupportedFeatures2};
        $VALUES = launchParam$SupportedFeaturesArr;
        $ENTRIES = a.a(launchParam$SupportedFeaturesArr);
        Companion = new dwx();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aww(20));
    }

    public static LaunchParam$SupportedFeatures valueOf(String str) {
        return (LaunchParam$SupportedFeatures) Enum.valueOf(LaunchParam$SupportedFeatures.class, str);
    }

    public static LaunchParam$SupportedFeatures[] values() {
        return (LaunchParam$SupportedFeatures[]) $VALUES.clone();
    }
}
