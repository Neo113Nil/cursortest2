package app.cash.molecule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SnapshotNotifier {
    public static final /* synthetic */ SnapshotNotifier[] $VALUES;
    public static final SnapshotNotifier WhileActive;

    /* JADX INFO: Fake field, exist only in values array */
    SnapshotNotifier EF0;

    static {
        SnapshotNotifier snapshotNotifier = new SnapshotNotifier("External", 0);
        SnapshotNotifier snapshotNotifier2 = new SnapshotNotifier("WhileActive", 1);
        WhileActive = snapshotNotifier2;
        $VALUES = new SnapshotNotifier[]{snapshotNotifier, snapshotNotifier2};
    }

    public static SnapshotNotifier valueOf(String str) {
        return (SnapshotNotifier) Enum.valueOf(SnapshotNotifier.class, str);
    }

    public static SnapshotNotifier[] values() {
        return (SnapshotNotifier[]) $VALUES.clone();
    }
}
