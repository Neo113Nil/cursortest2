package io.flutter.plugins.webviewflutter;

import defpackage.k4o;
import defpackage.m6e;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/webviewflutter/ConsoleMessageLevel;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "m6e", "DEBUG", "ERROR", "LOG", "TIP", "WARNING", "UNKNOWN", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConsoleMessageLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConsoleMessageLevel[] $VALUES;
    public static final m6e Companion;
    public static final ConsoleMessageLevel DEBUG;
    public static final ConsoleMessageLevel ERROR;
    public static final ConsoleMessageLevel LOG;
    public static final ConsoleMessageLevel TIP;
    public static final ConsoleMessageLevel UNKNOWN;
    public static final ConsoleMessageLevel WARNING;
    private final int raw;

    static {
        ConsoleMessageLevel consoleMessageLevel = new ConsoleMessageLevel("DEBUG", 0, 0);
        DEBUG = consoleMessageLevel;
        ConsoleMessageLevel consoleMessageLevel2 = new ConsoleMessageLevel("ERROR", 1, 1);
        ERROR = consoleMessageLevel2;
        ConsoleMessageLevel consoleMessageLevel3 = new ConsoleMessageLevel("LOG", 2, 2);
        LOG = consoleMessageLevel3;
        ConsoleMessageLevel consoleMessageLevel4 = new ConsoleMessageLevel("TIP", 3, 3);
        TIP = consoleMessageLevel4;
        ConsoleMessageLevel consoleMessageLevel5 = new ConsoleMessageLevel("WARNING", 4, 4);
        WARNING = consoleMessageLevel5;
        ConsoleMessageLevel consoleMessageLevel6 = new ConsoleMessageLevel("UNKNOWN", 5, 5);
        UNKNOWN = consoleMessageLevel6;
        ConsoleMessageLevel[] consoleMessageLevelArr = {consoleMessageLevel, consoleMessageLevel2, consoleMessageLevel3, consoleMessageLevel4, consoleMessageLevel5, consoleMessageLevel6};
        $VALUES = consoleMessageLevelArr;
        $ENTRIES = kotlin.enums.a.a(consoleMessageLevelArr);
        Companion = new m6e();
    }

    public ConsoleMessageLevel(String str, int i, int i2) {
        this.raw = i2;
    }

    public static ConsoleMessageLevel valueOf(String str) {
        return (ConsoleMessageLevel) Enum.valueOf(ConsoleMessageLevel.class, str);
    }

    public static ConsoleMessageLevel[] values() {
        return (ConsoleMessageLevel[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
