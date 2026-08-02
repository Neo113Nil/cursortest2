package ru.yandex.taxi.eatskit.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ServiceHeaderMode;", "", "HEADER_WITH_LOGO", "HEADER_NO_LOGO", "HEADER_INVISIBLE", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceHeaderMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServiceHeaderMode[] $VALUES;
    public static final ServiceHeaderMode HEADER_INVISIBLE;
    public static final ServiceHeaderMode HEADER_NO_LOGO;
    public static final ServiceHeaderMode HEADER_WITH_LOGO;

    static {
        ServiceHeaderMode serviceHeaderMode = new ServiceHeaderMode("HEADER_WITH_LOGO", 0);
        HEADER_WITH_LOGO = serviceHeaderMode;
        ServiceHeaderMode serviceHeaderMode2 = new ServiceHeaderMode("HEADER_NO_LOGO", 1);
        HEADER_NO_LOGO = serviceHeaderMode2;
        ServiceHeaderMode serviceHeaderMode3 = new ServiceHeaderMode("HEADER_INVISIBLE", 2);
        HEADER_INVISIBLE = serviceHeaderMode3;
        ServiceHeaderMode[] serviceHeaderModeArr = {serviceHeaderMode, serviceHeaderMode2, serviceHeaderMode3};
        $VALUES = serviceHeaderModeArr;
        $ENTRIES = kotlin.enums.a.a(serviceHeaderModeArr);
    }

    public static ServiceHeaderMode valueOf(String str) {
        return (ServiceHeaderMode) Enum.valueOf(ServiceHeaderMode.class, str);
    }

    public static ServiceHeaderMode[] values() {
        return (ServiceHeaderMode[]) $VALUES.clone();
    }
}
