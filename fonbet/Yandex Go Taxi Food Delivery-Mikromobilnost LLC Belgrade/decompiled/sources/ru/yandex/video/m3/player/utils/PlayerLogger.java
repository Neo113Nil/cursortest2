package ru.yandex.video.m3.player.utils;

import defpackage.w511;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JG\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJG\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\nJS\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\nJS\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "", "tag", "method", Constants.KEY_MESSAGE, "", "values", "Lzy11;", "verbose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "info", "", "throwable", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "debug", "warning", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PlayerLogger {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void debug(PlayerLogger playerLogger, String str, String str2, Object obj, Object... objArr) {
            PlayerLogger.super.debug(str, str2, obj, objArr);
        }

        @Deprecated
        public static void error(PlayerLogger playerLogger, String str, String str2, Object obj, Throwable th, Object... objArr) {
            PlayerLogger.super.error(str, str2, obj, th, objArr);
        }

        @Deprecated
        public static void info(PlayerLogger playerLogger, String str, String str2, Object obj, Object... objArr) {
            PlayerLogger.super.info(str, str2, obj, objArr);
        }

        @Deprecated
        public static void verbose(PlayerLogger playerLogger, String str, String str2, Object obj, Object... objArr) {
            PlayerLogger.super.verbose(str, str2, obj, objArr);
        }

        @Deprecated
        public static void warning(PlayerLogger playerLogger, String str, String str2, Object obj, Throwable th, Object... objArr) {
            PlayerLogger.super.warning(str, str2, obj, th, objArr);
        }
    }

    static /* synthetic */ void debug$default(PlayerLogger playerLogger, String str, String str2, Object obj, Object[] objArr, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: debug");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        playerLogger.debug(str, str2, obj, objArr);
    }

    static /* synthetic */ void error$default(PlayerLogger playerLogger, String str, String str2, Object obj, Throwable th, Object[] objArr, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: error");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        playerLogger.error(str, str2, obj, th, objArr);
    }

    static /* synthetic */ void info$default(PlayerLogger playerLogger, String str, String str2, Object obj, Object[] objArr, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: info");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        playerLogger.info(str, str2, obj, objArr);
    }

    static /* synthetic */ void verbose$default(PlayerLogger playerLogger, String str, String str2, Object obj, Object[] objArr, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: verbose");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        playerLogger.verbose(str, str2, obj, objArr);
    }

    static /* synthetic */ void warning$default(PlayerLogger playerLogger, String str, String str2, Object obj, Throwable th, Object[] objArr, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: warning");
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        playerLogger.warning(str, str2, obj, th, objArr);
    }

    default void debug(String tag, String method, Object message, Object... values) {
    }

    default void error(String tag, String method, Object message, Throwable throwable, Object... values) {
    }

    default void info(String tag, String method, Object message, Object... values) {
    }

    default void verbose(String tag, String method, Object message, Object... values) {
    }

    default void warning(String tag, String method, Object message, Throwable throwable, Object... values) {
    }
}
