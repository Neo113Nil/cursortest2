package ru.yandex.video.m3.ott.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.ott.data.local.impl.SubProfileProviderImpl;
import ru.yandex.video.m3.ott.data.net.impl.OttTrackingApiImpl;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.PictureInPictureProvider;
import ru.yandex.video.m3.ott.ott.TrackingManager;
import ru.yandex.video.m3.ott.ott.TrackingManagerFactory;
import ru.yandex.video.m3.player.impl.tracking.TimeCounterImpl;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingManagerFactoryImpl;", "Lru/yandex/video/m3/ott/ott/TrackingManagerFactory;", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "context", "Landroid/content/Context;", "deviceProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "pictureInPictureProvider", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "executorService", "Ljava/util/concurrent/ExecutorService;", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;Landroid/content/Context;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;Lokhttp3/OkHttpClient;)V", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "create", "Lru/yandex/video/m3/ott/ott/TrackingManager;", "setInfoProvider", "provider", "setInfoProvider$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingManagerFactoryImpl implements TrackingManagerFactory {
    public static final int $stable = 8;
    private final Context context;
    private final DeviceProvider deviceProvider;
    private final ExecutorService executorService;
    private InfoProvider infoProvider;
    private final OkHttpClient okHttpClient;
    private final PictureInPictureProvider pictureInPictureProvider;
    private final ScheduledExecutorService scheduledExecutorService;
    private final TimeProvider timeProvider;

    public TrackingManagerFactoryImpl(TimeProvider timeProvider, Context context, DeviceProvider deviceProvider, PictureInPictureProvider pictureInPictureProvider, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, OkHttpClient okHttpClient) {
        this.timeProvider = timeProvider;
        this.context = context;
        this.deviceProvider = deviceProvider;
        this.pictureInPictureProvider = pictureInPictureProvider;
        this.scheduledExecutorService = scheduledExecutorService;
        this.executorService = executorService;
        this.okHttpClient = okHttpClient;
        this.infoProvider = new InfoProviderImpl(context);
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingManagerFactory
    public TrackingManager create() {
        JsonConverterImpl jsonConverterImpl = new JsonConverterImpl();
        TimeCounterImpl timeCounterImpl = new TimeCounterImpl(this.timeProvider);
        TimeCounterImpl timeCounterImpl2 = new TimeCounterImpl(this.timeProvider);
        TimeCounterImpl timeCounterImpl3 = new TimeCounterImpl(this.timeProvider);
        TimeCounterImpl timeCounterImpl4 = new TimeCounterImpl(this.timeProvider);
        TimeCounterImpl timeCounterImpl5 = new TimeCounterImpl(this.timeProvider);
        Context context = this.context;
        return new TrackingManagerImpl(timeCounterImpl, timeCounterImpl2, timeCounterImpl3, timeCounterImpl4, timeCounterImpl5, new TrackingEventBuilderFactory(context, this.infoProvider, this.timeProvider, this.deviceProvider, new DefaultResourceProvider(context), new ConnectionChecker(this.context), new SubProfileProviderImpl(null, 1, null), this.pictureInPictureProvider), new OttTrackingReporterImpl(jsonConverterImpl, new OttTrackingApiImpl(this.okHttpClient, jsonConverterImpl, this.infoProvider.getUserAgent()), new DatabaseHelper(this.context), this.executorService, 0, 16, null), this.scheduledExecutorService, this.executorService);
    }

    public final TrackingManagerFactoryImpl setInfoProvider$video_player_internalRelease(InfoProvider provider) {
        this.infoProvider = provider;
        return this;
    }
}
