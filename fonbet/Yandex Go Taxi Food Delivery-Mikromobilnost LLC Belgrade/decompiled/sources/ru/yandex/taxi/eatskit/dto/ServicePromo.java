package ru.yandex.taxi.eatskit.dto;

import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.zwq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ServicePromo;", "", "Companion", "zwq0", "STORIES", "BANNER", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServicePromo {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServicePromo[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ServicePromo BANNER;
    public static final zwq0 Companion;
    public static final ServicePromo STORIES;

    static {
        ServicePromo servicePromo = new ServicePromo("STORIES", 0);
        STORIES = servicePromo;
        ServicePromo servicePromo2 = new ServicePromo("BANNER", 1);
        BANNER = servicePromo2;
        ServicePromo[] servicePromoArr = {servicePromo, servicePromo2};
        $VALUES = servicePromoArr;
        $ENTRIES = kotlin.enums.a.a(servicePromoArr);
        Companion = new zwq0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(8));
    }

    public static ServicePromo valueOf(String str) {
        return (ServicePromo) Enum.valueOf(ServicePromo.class, str);
    }

    public static ServicePromo[] values() {
        return (ServicePromo[]) $VALUES.clone();
    }
}
