package ru.yandex.video.m3.preload_manager;

import java.io.Closeable;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "Ljava/io/Closeable;", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "Lzy11;", "startPreload", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "setPriority", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "cancelPreload", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "commit", "()V", "revert", "", "getInProgress", "()Z", "inProgress", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreloaderTransaction extends Closeable {
    void cancelPreload(VideoData videoData);

    void commit();

    boolean getInProgress();

    void revert();

    void setPriority(VideoData videoData, PreloadPriority priority);

    void startPreload(VideoData videoData, PreloadConfig config, PreloadPriority priority);
}
