package ru.yandex.taxi.banners;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/banners/PromoBannerActivationStatus;", "", "ACTIVATED", "ERROR", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoBannerActivationStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PromoBannerActivationStatus[] $VALUES;
    public static final PromoBannerActivationStatus ACTIVATED;
    public static final PromoBannerActivationStatus ERROR;

    static {
        PromoBannerActivationStatus promoBannerActivationStatus = new PromoBannerActivationStatus("ACTIVATED", 0);
        ACTIVATED = promoBannerActivationStatus;
        PromoBannerActivationStatus promoBannerActivationStatus2 = new PromoBannerActivationStatus("ERROR", 1);
        ERROR = promoBannerActivationStatus2;
        PromoBannerActivationStatus[] promoBannerActivationStatusArr = {promoBannerActivationStatus, promoBannerActivationStatus2};
        $VALUES = promoBannerActivationStatusArr;
        $ENTRIES = kotlin.enums.a.a(promoBannerActivationStatusArr);
    }

    public static PromoBannerActivationStatus valueOf(String str) {
        return (PromoBannerActivationStatus) Enum.valueOf(PromoBannerActivationStatus.class, str);
    }

    public static PromoBannerActivationStatus[] values() {
        return (PromoBannerActivationStatus[]) $VALUES.clone();
    }
}
