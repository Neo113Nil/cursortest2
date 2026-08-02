package androidx.glance;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Visibility {
    public static final /* synthetic */ Visibility[] $VALUES;
    public static final Visibility Visible;

    static {
        Visibility visibility = new Visibility("Visible", 0);
        Visible = visibility;
        $VALUES = new Visibility[]{visibility, new Visibility("Invisible", 1), new Visibility("Gone", 2)};
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }
}
