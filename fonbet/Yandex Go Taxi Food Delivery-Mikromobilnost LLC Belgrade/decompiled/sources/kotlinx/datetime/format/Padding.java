package kotlinx.datetime.format;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/format/Padding;", "", JCP.RAW_PREFIX, "ZERO", "SPACE", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Padding {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Padding[] $VALUES;
    public static final Padding NONE;
    public static final Padding SPACE;
    public static final Padding ZERO;

    static {
        Padding padding = new Padding(JCP.RAW_PREFIX, 0);
        NONE = padding;
        Padding padding2 = new Padding("ZERO", 1);
        ZERO = padding2;
        Padding padding3 = new Padding("SPACE", 2);
        SPACE = padding3;
        Padding[] paddingArr = {padding, padding2, padding3};
        $VALUES = paddingArr;
        $ENTRIES = kotlin.enums.a.a(paddingArr);
    }

    public static Padding valueOf(String str) {
        return (Padding) Enum.valueOf(Padding.class, str);
    }

    public static Padding[] values() {
        return (Padding[]) $VALUES.clone();
    }
}
