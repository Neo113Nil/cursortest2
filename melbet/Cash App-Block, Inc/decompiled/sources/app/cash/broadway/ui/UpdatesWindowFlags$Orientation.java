package app.cash.broadway.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UpdatesWindowFlags$Orientation {
    public static final /* synthetic */ UpdatesWindowFlags$Orientation[] $VALUES;
    public static final UpdatesWindowFlags$Orientation Landscape;
    public static final UpdatesWindowFlags$Orientation None;

    static {
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = new UpdatesWindowFlags$Orientation("Landscape", 0);
        Landscape = updatesWindowFlags$Orientation;
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation2 = new UpdatesWindowFlags$Orientation("None", 1);
        None = updatesWindowFlags$Orientation2;
        $VALUES = new UpdatesWindowFlags$Orientation[]{updatesWindowFlags$Orientation, updatesWindowFlags$Orientation2};
    }

    public static UpdatesWindowFlags$Orientation valueOf(String str) {
        return (UpdatesWindowFlags$Orientation) Enum.valueOf(UpdatesWindowFlags$Orientation.class, str);
    }

    public static UpdatesWindowFlags$Orientation[] values() {
        return (UpdatesWindowFlags$Orientation[]) $VALUES.clone();
    }
}
