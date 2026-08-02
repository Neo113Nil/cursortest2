package ru.yandex.video.m3.list_player_manager;

import android.util.Log;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Objects;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\t\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\t\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJM\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\t\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/list_player_manager/LogcatPlayerLogger;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "<init>", "()V", "", "tag", "method", "", Constants.KEY_MESSAGE, "", "values", "Lzy11;", "verbose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "info", "", "throwable", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LogcatPlayerLogger implements PlayerLogger {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void error(String tag, String method, Object message, Throwable throwable, Object... values) {
        Log.e(tag, "[" + method + "] " + message, throwable);
    }

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void info(String tag, String method, Object message, Object... values) {
        Log.i(tag, "[" + method + "] " + message);
    }

    @Override // ru.yandex.video.m3.player.utils.PlayerLogger
    public void verbose(String tag, String method, Object message, Object... values) {
        Objects.toString(message);
    }
}
