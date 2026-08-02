package ru.yandex.taxi.masstransit.threads;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/threads/ThreadsCardMode;", "", "COLLAPSED", "FULL_HEIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThreadsCardMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ThreadsCardMode[] $VALUES;
    public static final ThreadsCardMode COLLAPSED;
    public static final ThreadsCardMode FULL_HEIGHT;

    static {
        ThreadsCardMode threadsCardMode = new ThreadsCardMode("COLLAPSED", 0);
        COLLAPSED = threadsCardMode;
        ThreadsCardMode threadsCardMode2 = new ThreadsCardMode("FULL_HEIGHT", 1);
        FULL_HEIGHT = threadsCardMode2;
        ThreadsCardMode[] threadsCardModeArr = {threadsCardMode, threadsCardMode2};
        $VALUES = threadsCardModeArr;
        $ENTRIES = a.a(threadsCardModeArr);
    }

    public static ThreadsCardMode valueOf(String str) {
        return (ThreadsCardMode) Enum.valueOf(ThreadsCardMode.class, str);
    }

    public static ThreadsCardMode[] values() {
        return (ThreadsCardMode[]) $VALUES.clone();
    }
}
