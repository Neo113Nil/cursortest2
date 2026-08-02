package io.flutter.plugins.webviewflutter;

import defpackage.k4o;
import defpackage.wy80;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/flutter/plugins/webviewflutter/OverScrollMode;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "wy80", "ALWAYS", "IF_CONTENT_SCROLLS", "NEVER", "UNKNOWN", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverScrollMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OverScrollMode[] $VALUES;
    public static final OverScrollMode ALWAYS;
    public static final wy80 Companion;
    public static final OverScrollMode IF_CONTENT_SCROLLS;
    public static final OverScrollMode NEVER;
    public static final OverScrollMode UNKNOWN;
    private final int raw;

    static {
        OverScrollMode overScrollMode = new OverScrollMode("ALWAYS", 0, 0);
        ALWAYS = overScrollMode;
        OverScrollMode overScrollMode2 = new OverScrollMode("IF_CONTENT_SCROLLS", 1, 1);
        IF_CONTENT_SCROLLS = overScrollMode2;
        OverScrollMode overScrollMode3 = new OverScrollMode("NEVER", 2, 2);
        NEVER = overScrollMode3;
        OverScrollMode overScrollMode4 = new OverScrollMode("UNKNOWN", 3, 3);
        UNKNOWN = overScrollMode4;
        OverScrollMode[] overScrollModeArr = {overScrollMode, overScrollMode2, overScrollMode3, overScrollMode4};
        $VALUES = overScrollModeArr;
        $ENTRIES = kotlin.enums.a.a(overScrollModeArr);
        Companion = new wy80();
    }

    public OverScrollMode(String str, int i, int i2) {
        this.raw = i2;
    }

    public static OverScrollMode valueOf(String str) {
        return (OverScrollMode) Enum.valueOf(OverScrollMode.class, str);
    }

    public static OverScrollMode[] values() {
        return (OverScrollMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
