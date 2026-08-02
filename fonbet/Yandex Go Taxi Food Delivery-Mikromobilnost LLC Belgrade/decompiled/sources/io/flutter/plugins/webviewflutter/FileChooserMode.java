package io.flutter.plugins.webviewflutter;

import defpackage.bzq;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/flutter/plugins/webviewflutter/FileChooserMode;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "bzq", "OPEN", "OPEN_MULTIPLE", "SAVE", "UNKNOWN", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileChooserMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FileChooserMode[] $VALUES;
    public static final bzq Companion;
    public static final FileChooserMode OPEN;
    public static final FileChooserMode OPEN_MULTIPLE;
    public static final FileChooserMode SAVE;
    public static final FileChooserMode UNKNOWN;
    private final int raw;

    static {
        FileChooserMode fileChooserMode = new FileChooserMode("OPEN", 0, 0);
        OPEN = fileChooserMode;
        FileChooserMode fileChooserMode2 = new FileChooserMode("OPEN_MULTIPLE", 1, 1);
        OPEN_MULTIPLE = fileChooserMode2;
        FileChooserMode fileChooserMode3 = new FileChooserMode("SAVE", 2, 2);
        SAVE = fileChooserMode3;
        FileChooserMode fileChooserMode4 = new FileChooserMode("UNKNOWN", 3, 3);
        UNKNOWN = fileChooserMode4;
        FileChooserMode[] fileChooserModeArr = {fileChooserMode, fileChooserMode2, fileChooserMode3, fileChooserMode4};
        $VALUES = fileChooserModeArr;
        $ENTRIES = kotlin.enums.a.a(fileChooserModeArr);
        Companion = new bzq();
    }

    public FileChooserMode(String str, int i, int i2) {
        this.raw = i2;
    }

    public static FileChooserMode valueOf(String str) {
        return (FileChooserMode) Enum.valueOf(FileChooserMode.class, str);
    }

    public static FileChooserMode[] values() {
        return (FileChooserMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
