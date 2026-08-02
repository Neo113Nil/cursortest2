package app.cash.zipline.loader.internal.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FileState {
    public static final /* synthetic */ FileState[] $VALUES;
    public static final FileState DIRTY;
    public static final FileState READY;

    static {
        FileState fileState = new FileState("DIRTY", 0);
        DIRTY = fileState;
        FileState fileState2 = new FileState("READY", 1);
        READY = fileState2;
        $VALUES = new FileState[]{fileState, fileState2};
    }

    public static FileState valueOf(String str) {
        return (FileState) Enum.valueOf(FileState.class, str);
    }

    public static FileState[] values() {
        return (FileState[]) $VALUES.clone();
    }
}
