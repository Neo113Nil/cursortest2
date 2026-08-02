package io.flutter.embedding.engine.systemchannels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode {
    private static final /* synthetic */ PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode[] $VALUES;
    public static final PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode HYBRID_ONLY;
    public static final PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode TEXTURE_WITH_HYBRID_FALLBACK;
    public static final PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode TEXTURE_WITH_VIRTUAL_FALLBACK;

    static {
        PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode = new PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode("TEXTURE_WITH_VIRTUAL_FALLBACK", 0);
        TEXTURE_WITH_VIRTUAL_FALLBACK = platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode;
        PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode2 = new PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode("TEXTURE_WITH_HYBRID_FALLBACK", 1);
        TEXTURE_WITH_HYBRID_FALLBACK = platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode2;
        PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode3 = new PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode("HYBRID_ONLY", 2);
        HYBRID_ONLY = platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode3;
        $VALUES = new PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode[]{platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode, platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode2, platformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode3};
    }

    public static PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode valueOf(String str) {
        return (PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode) Enum.valueOf(PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode.class, str);
    }

    public static PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode[] values() {
        return (PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode[]) $VALUES.clone();
    }
}
