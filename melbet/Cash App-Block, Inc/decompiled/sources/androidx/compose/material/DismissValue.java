package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DismissValue {
    public static final /* synthetic */ DismissValue[] $VALUES;
    public static final DismissValue Default;
    public static final DismissValue DismissedToEnd;
    public static final DismissValue DismissedToStart;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        Default = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        DismissedToEnd = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        DismissedToStart = dismissValue3;
        $VALUES = new DismissValue[]{dismissValue, dismissValue2, dismissValue3};
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }
}
