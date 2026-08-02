package ru.yandex.video.m3.list_player_manager.impl.preload;

import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.j73;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/DefaultPreloadErrorHandler;", "Lru/yandex/video/m3/list_player_manager/impl/preload/PreloadErrorHandler;", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "videoDataCache", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;)V", "", Constants.KEY_EXCEPTION, "", "depth", "getResponseCode", "(Ljava/lang/Throwable;I)Ljava/lang/Integer;", "", "videoContentId", "Lzy11;", "handleVideoLoadError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPreloadErrorHandler implements PreloadErrorHandler {

    @Deprecated
    public static final int MAX_DEPTH = 10;
    private final DataCache<?> videoDataCache;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Integer[] fatalCacheExceptions = {403, Integer.valueOf(NetworkRequestException.REGIONAL_RESTRICTION)};

    public DefaultPreloadErrorHandler(DataCache<?> dataCache) {
        this.videoDataCache = dataCache;
    }

    private final Integer getResponseCode(Throwable exception, int depth) {
        Throwable cause;
        if (exception instanceof HttpDataSource$InvalidResponseCodeException) {
            return Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) exception).responseCode);
        }
        if (exception instanceof DataSourceException) {
            return Integer.valueOf(((DataSourceException) exception).reason);
        }
        if (depth <= 10 && (cause = exception.getCause()) != null) {
            return getResponseCode(cause, depth + 1);
        }
        return null;
    }

    public static /* synthetic */ Integer getResponseCode$default(DefaultPreloadErrorHandler defaultPreloadErrorHandler, Throwable th, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return defaultPreloadErrorHandler.getResponseCode(th, i);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.PreloadErrorHandler
    public void handleVideoLoadError(String videoContentId, Throwable exception) {
        if (j73.y(fatalCacheExceptions, getResponseCode$default(this, exception, 0, 2, null))) {
            this.videoDataCache.remove(videoContentId);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/DefaultPreloadErrorHandler$Companion;", "", "()V", "MAX_DEPTH", "", "fatalCacheExceptions", "", "getFatalCacheExceptions", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer[] getFatalCacheExceptions() {
            return DefaultPreloadErrorHandler.fatalCacheExceptions;
        }

        private Companion() {
        }
    }
}
