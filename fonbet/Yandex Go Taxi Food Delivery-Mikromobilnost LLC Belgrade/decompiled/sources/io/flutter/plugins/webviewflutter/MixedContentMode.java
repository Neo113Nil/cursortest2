package io.flutter.plugins.webviewflutter;

import defpackage.gk20;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/flutter/plugins/webviewflutter/MixedContentMode;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "gk20", "ALWAYS_ALLOW", "COMPATIBILITY_MODE", "NEVER_ALLOW", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MixedContentMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MixedContentMode[] $VALUES;
    public static final MixedContentMode ALWAYS_ALLOW;
    public static final MixedContentMode COMPATIBILITY_MODE;
    public static final gk20 Companion;
    public static final MixedContentMode NEVER_ALLOW;
    private final int raw;

    static {
        MixedContentMode mixedContentMode = new MixedContentMode("ALWAYS_ALLOW", 0, 0);
        ALWAYS_ALLOW = mixedContentMode;
        MixedContentMode mixedContentMode2 = new MixedContentMode("COMPATIBILITY_MODE", 1, 1);
        COMPATIBILITY_MODE = mixedContentMode2;
        MixedContentMode mixedContentMode3 = new MixedContentMode("NEVER_ALLOW", 2, 2);
        NEVER_ALLOW = mixedContentMode3;
        MixedContentMode[] mixedContentModeArr = {mixedContentMode, mixedContentMode2, mixedContentMode3};
        $VALUES = mixedContentModeArr;
        $ENTRIES = kotlin.enums.a.a(mixedContentModeArr);
        Companion = new gk20();
    }

    public MixedContentMode(String str, int i, int i2) {
        this.raw = i2;
    }

    public static MixedContentMode valueOf(String str) {
        return (MixedContentMode) Enum.valueOf(MixedContentMode.class, str);
    }

    public static MixedContentMode[] values() {
        return (MixedContentMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
