package ru.yandex.video.m3.ott.impl;

import com.google.gson.reflect.TypeToken;
import defpackage.op70;
import defpackage.sd30;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.ott.data.net.OttTrackingApi;
import ru.yandex.video.m3.ott.ott.TrackingPendingReporter;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/yandex/video/m3/ott/impl/OttTrackingReporterImpl;", "Lru/yandex/video/m3/ott/impl/TrackingReporter;", "Lru/yandex/video/m3/ott/ott/TrackingPendingReporter;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/ott/data/net/OttTrackingApi;", "ottTrackingApi", "Lru/yandex/video/m3/ott/data/local/db/DatabaseHelper;", "databaseHelper", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "triggerReportEvents", "<init>", "(Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/ott/data/net/OttTrackingApi;Lru/yandex/video/m3/ott/data/local/db/DatabaseHelper;Ljava/util/concurrent/ExecutorService;I)V", "", "", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "report", "(Ljava/util/Map;)V", "reportPendingEvents", "()V", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/ott/data/net/OttTrackingApi;", "Lru/yandex/video/m3/ott/data/local/db/DatabaseHelper;", "Ljava/util/concurrent/ExecutorService;", CA20Status.STATUS_USER_I, "Ljava/util/concurrent/atomic/AtomicLong;", "reportEvents", "Ljava/util/concurrent/atomic/AtomicLong;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttTrackingReporterImpl implements TrackingReporter, TrackingPendingReporter {
    public static final int $stable = 8;
    private final DatabaseHelper databaseHelper;
    private final ExecutorService executorService;
    private final JsonConverter jsonConverter;
    private final OttTrackingApi ottTrackingApi;
    private AtomicLong reportEvents;
    private final int triggerReportEvents;

    public OttTrackingReporterImpl(JsonConverter jsonConverter, OttTrackingApi ottTrackingApi, DatabaseHelper databaseHelper, ExecutorService executorService, int i) {
        this.jsonConverter = jsonConverter;
        this.ottTrackingApi = ottTrackingApi;
        this.databaseHelper = databaseHelper;
        this.executorService = executorService;
        this.triggerReportEvents = i;
        this.reportEvents = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void report$lambda$3(OttTrackingReporterImpl ottTrackingReporterImpl, Map map) {
        Object failure;
        try {
            failure = ottTrackingReporterImpl.ottTrackingApi.sendEvents(Collections.singletonList(map)).get();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            ottTrackingReporterImpl.databaseHelper.insertOttTrackingEvents(ottTrackingReporterImpl.jsonConverter.to(map));
        }
        if ((failure instanceof Result.Failure) || ottTrackingReporterImpl.reportEvents.addAndGet(1L) % ottTrackingReporterImpl.triggerReportEvents != 0) {
            return;
        }
        ottTrackingReporterImpl.reportPendingEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportPendingEvents$lambda$7(OttTrackingReporterImpl ottTrackingReporterImpl) {
        Map<Integer, String> ottTrackingEvents;
        try {
            synchronized (ottTrackingReporterImpl) {
                do {
                    try {
                        ottTrackingEvents = ottTrackingReporterImpl.databaseHelper.getOttTrackingEvents(50);
                        if (!ottTrackingEvents.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<Map.Entry<Integer, String>> it = ottTrackingEvents.entrySet().iterator();
                            while (it.hasNext()) {
                                Map map = (Map) ottTrackingReporterImpl.jsonConverter.from(it.next().getValue(), new TypeToken<Map<String, ? extends Object>>() { // from class: ru.yandex.video.m3.ott.impl.OttTrackingReporterImpl$reportPendingEvents$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$from$1
                                }.getType());
                                if (map != null) {
                                    arrayList.add(map);
                                }
                            }
                            ottTrackingReporterImpl.ottTrackingApi.sendEvents(arrayList).get();
                            ottTrackingReporterImpl.databaseHelper.removeOttTrackingEvents(ottTrackingEvents.keySet());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } while (!ottTrackingEvents.isEmpty());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // ru.yandex.video.m3.ott.impl.TrackingReporter
    public void report(Map<String, ? extends Object> event) {
        try {
            this.executorService.execute(new sd30(24, this, event));
        } catch (RejectedExecutionException unused) {
            this.databaseHelper.insertOttTrackingEvents(this.jsonConverter.to(event));
        }
    }

    @Override // ru.yandex.video.m3.ott.ott.TrackingPendingReporter
    public void reportPendingEvents() {
        try {
            ExecutorsUtilKt.executeSafely(this.executorService, new op70(13, this));
        } catch (RejectedExecutionException unused) {
        }
    }

    public /* synthetic */ OttTrackingReporterImpl(JsonConverter jsonConverter, OttTrackingApi ottTrackingApi, DatabaseHelper databaseHelper, ExecutorService executorService, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConverter, ottTrackingApi, databaseHelper, executorService, (i2 & 16) != 0 ? 5 : i);
    }
}
