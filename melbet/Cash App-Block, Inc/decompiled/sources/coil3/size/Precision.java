package coil3.size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Precision {
    public static final /* synthetic */ Precision[] $VALUES;
    public static final Precision EXACT;
    public static final Precision INEXACT;

    static {
        Precision precision = new Precision("EXACT", 0);
        EXACT = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        INEXACT = precision2;
        $VALUES = new Precision[]{precision, precision2};
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}
