package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DrawerValue {
    public static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        Closed = drawerValue;
        $VALUES = new DrawerValue[]{drawerValue, new DrawerValue("Open", 1)};
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}
