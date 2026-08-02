package ru.yandextaxi.flutter_yandex_mapkit.models;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/models/OverzoomMode;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "WITH_PREFETCH", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverzoomMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OverzoomMode[] $VALUES;

    @ysq0(BackendConfig.Restrictions.DISABLED)
    public static final OverzoomMode DISABLED;

    @ysq0(BackendConfig.Restrictions.ENABLED)
    public static final OverzoomMode ENABLED;

    @ysq0("withPrefetch")
    public static final OverzoomMode WITH_PREFETCH;

    static {
        OverzoomMode overzoomMode = new OverzoomMode("DISABLED", 0);
        DISABLED = overzoomMode;
        OverzoomMode overzoomMode2 = new OverzoomMode("ENABLED", 1);
        ENABLED = overzoomMode2;
        OverzoomMode overzoomMode3 = new OverzoomMode("WITH_PREFETCH", 2);
        WITH_PREFETCH = overzoomMode3;
        OverzoomMode[] overzoomModeArr = {overzoomMode, overzoomMode2, overzoomMode3};
        $VALUES = overzoomModeArr;
        $ENTRIES = a.a(overzoomModeArr);
    }

    private OverzoomMode(String str, int i) {
    }

    public static OverzoomMode valueOf(String str) {
        return (OverzoomMode) Enum.valueOf(OverzoomMode.class, str);
    }

    public static OverzoomMode[] values() {
        return (OverzoomMode[]) $VALUES.clone();
    }
}
