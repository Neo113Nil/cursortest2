package ru.yandex.video.m3.player.crashmanager;

import defpackage.sls;
import java.lang.Thread;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/crashmanager/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "defaultHandler", "Lkotlin/Function0;", "Lzy11;", "crashAction", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;Lsls;)V", "Ljava/lang/Thread;", "t", "", "e", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final int $stable = 8;
    private final sls crashAction;
    private final Thread.UncaughtExceptionHandler defaultHandler;

    public CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, sls slsVar) {
        this.defaultHandler = uncaughtExceptionHandler;
        this.crashAction = slsVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) {
        this.crashAction.invoke();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
