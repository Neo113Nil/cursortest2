package androidx.camera.viewfinder.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ImplementationMode {
    public static final /* synthetic */ ImplementationMode[] $VALUES;
    public static final ImplementationMode EMBEDDED;
    public static final ImplementationMode EXTERNAL;

    static {
        ImplementationMode implementationMode = new ImplementationMode("EXTERNAL", 0);
        EXTERNAL = implementationMode;
        ImplementationMode implementationMode2 = new ImplementationMode("EMBEDDED", 1);
        EMBEDDED = implementationMode2;
        $VALUES = new ImplementationMode[]{implementationMode, implementationMode2};
    }

    public static ImplementationMode valueOf(String str) {
        return (ImplementationMode) Enum.valueOf(ImplementationMode.class, str);
    }

    public static ImplementationMode[] values() {
        return (ImplementationMode[]) $VALUES.clone();
    }
}
