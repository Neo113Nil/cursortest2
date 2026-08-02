package ru.yandex.taxi.design.sourcedestination;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/design/sourcedestination/SourceTrailMode;", "", JCP.RAW_PREFIX, "PORCH", "CHEVRON", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceTrailMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceTrailMode[] $VALUES;
    public static final SourceTrailMode CHEVRON;
    public static final SourceTrailMode NONE;
    public static final SourceTrailMode PORCH;

    static {
        SourceTrailMode sourceTrailMode = new SourceTrailMode(JCP.RAW_PREFIX, 0);
        NONE = sourceTrailMode;
        SourceTrailMode sourceTrailMode2 = new SourceTrailMode("PORCH", 1);
        PORCH = sourceTrailMode2;
        SourceTrailMode sourceTrailMode3 = new SourceTrailMode("CHEVRON", 2);
        CHEVRON = sourceTrailMode3;
        SourceTrailMode[] sourceTrailModeArr = {sourceTrailMode, sourceTrailMode2, sourceTrailMode3};
        $VALUES = sourceTrailModeArr;
        $ENTRIES = a.a(sourceTrailModeArr);
    }

    public static SourceTrailMode valueOf(String str) {
        return (SourceTrailMode) Enum.valueOf(SourceTrailMode.class, str);
    }

    public static SourceTrailMode[] values() {
        return (SourceTrailMode[]) $VALUES.clone();
    }
}
