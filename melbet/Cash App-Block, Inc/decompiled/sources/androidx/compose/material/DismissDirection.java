package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DismissDirection {
    public static final /* synthetic */ DismissDirection[] $VALUES;
    public static final DismissDirection EndToStart;
    public static final DismissDirection StartToEnd;

    static {
        DismissDirection dismissDirection = new DismissDirection("StartToEnd", 0);
        StartToEnd = dismissDirection;
        DismissDirection dismissDirection2 = new DismissDirection("EndToStart", 1);
        EndToStart = dismissDirection2;
        $VALUES = new DismissDirection[]{dismissDirection, dismissDirection2};
    }

    public static DismissDirection valueOf(String str) {
        return (DismissDirection) Enum.valueOf(DismissDirection.class, str);
    }

    public static DismissDirection[] values() {
        return (DismissDirection[]) $VALUES.clone();
    }
}
