package ru.yandex.video.m3.ott.ott;

import android.content.Context;
import defpackage.p16;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.ott.data.net.impl.OttTrackingApiImpl;
import ru.yandex.video.m3.ott.impl.OttTrackingReporterImpl;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/ott/ott/TrackingPendingReporterBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "okHttpClient", "Lokhttp3/OkHttpClient;", "builder", "Lru/yandex/video/m3/ott/ott/TrackingPendingReporter;", "httpClient", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingPendingReporterBuilder {
    public static final int $stable = 8;
    private final Context context;
    private ExecutorService executorService;
    private OkHttpClient okHttpClient;

    public TrackingPendingReporterBuilder(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread builder$lambda$4$lambda$3(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:TrackingPendingReporter");
        return newThread;
    }

    public final TrackingPendingReporter builder() {
        ExecutorService executorService = this.executorService;
        if (executorService == null) {
            executorService = Executors.newCachedThreadPool(new p16(Executors.defaultThreadFactory(), 13));
        }
        ExecutorService executorService2 = executorService;
        OkHttpClient okHttpClient = this.okHttpClient;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient(new OkHttpClient.a());
        }
        DatabaseHelper databaseHelper = new DatabaseHelper(this.context);
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(this.context);
        JsonConverterImpl jsonConverterImpl = new JsonConverterImpl();
        return new OttTrackingReporterImpl(jsonConverterImpl, new OttTrackingApiImpl(okHttpClient, jsonConverterImpl, infoProviderImpl.getUserAgent()), databaseHelper, executorService2, 0, 16, null);
    }

    public final TrackingPendingReporterBuilder executorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public final TrackingPendingReporterBuilder httpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
        return this;
    }
}
