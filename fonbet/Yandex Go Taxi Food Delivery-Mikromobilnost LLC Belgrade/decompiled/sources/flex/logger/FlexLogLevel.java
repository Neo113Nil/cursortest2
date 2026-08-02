package flex.logger;

import defpackage.b64;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lflex/logger/FlexLogLevel;", "", "", "icon", "Ljava/lang/String;", "DEBUG", "INFO", "WARNING", "ERROR", "FAULT", "flex-logger"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlexLogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlexLogLevel[] $VALUES;
    public static final FlexLogLevel DEBUG;
    public static final FlexLogLevel ERROR;
    public static final FlexLogLevel FAULT;
    public static final FlexLogLevel INFO;
    public static final FlexLogLevel WARNING;
    private final String icon;

    static {
        FlexLogLevel flexLogLevel = new FlexLogLevel("DEBUG", 0, "🔵");
        DEBUG = flexLogLevel;
        FlexLogLevel flexLogLevel2 = new FlexLogLevel("INFO", 1, "🟢");
        INFO = flexLogLevel2;
        FlexLogLevel flexLogLevel3 = new FlexLogLevel("WARNING", 2, "🟡");
        WARNING = flexLogLevel3;
        FlexLogLevel flexLogLevel4 = new FlexLogLevel("ERROR", 3, "🟠");
        ERROR = flexLogLevel4;
        FlexLogLevel flexLogLevel5 = new FlexLogLevel("FAULT", 4, "🔴");
        FAULT = flexLogLevel5;
        FlexLogLevel[] flexLogLevelArr = {flexLogLevel, flexLogLevel2, flexLogLevel3, flexLogLevel4, flexLogLevel5};
        $VALUES = flexLogLevelArr;
        $ENTRIES = a.a(flexLogLevelArr);
    }

    public FlexLogLevel(String str, int i, String str2) {
        this.icon = str2;
    }

    public static FlexLogLevel valueOf(String str) {
        return (FlexLogLevel) Enum.valueOf(FlexLogLevel.class, str);
    }

    public static FlexLogLevel[] values() {
        return (FlexLogLevel[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return b64.j(this.icon, name());
    }
}
