package ru.yandex.video.m3.player.netperf;

import defpackage.b64;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d5j0;
import defpackage.g221;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lse;
import defpackage.m5j0;
import defpackage.mdh;
import defpackage.nci0;
import defpackage.pz40;
import defpackage.qhw0;
import defpackage.qje;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.wg10;
import defpackage.wms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import okhttp3.OkHttpClient;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 J2\u00020\u0001:\u0003JKLBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016H\u0002¢\u0006\u0004\b \u0010!J'\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u0015\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u0012H\u0000¢\u0006\u0004\b%\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0000¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010,\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010:¨\u0006M"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfManager;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "", "sendingInterval", "Ljava/util/concurrent/TimeUnit;", "sendingIntervalUnit", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "netPerfApiSendUrlBuilder", "Ltse;", "netPerfScope", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/impl/utils/TimeProvider;JLjava/util/concurrent/TimeUnit;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;Ltse;)V", "Lzy11;", "sendEventsIfExist", "()V", "navStart", "", "Lru/yandex/video/m3/player/netperf/PerfEventDto;", "events", "logEventAsync", "(JLjava/util/List;)V", "Lru/yandex/video/m3/player/netperf/NetPerfEvent;", "tryLogVsids", "(Ljava/util/List;)V", "sendingEvents", "Lru/yandex/video/m3/player/netperf/NetPerfManager$PerfEventDtoHolder;", "transformEvents", "(Ljava/util/List;)Lru/yandex/video/m3/player/netperf/NetPerfManager$PerfEventDtoHolder;", "Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;", "toDtoList", "(Ljava/util/List;Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;)Ljava/util/List;", "start$video_player_internalRelease", "start", "stop$video_player_internalRelease", "stop", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "getNetPerfEventTrackerFactory$video_player_internalRelease", "()Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "getNetPerfEventTrackerFactory", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "J", "Ljava/util/concurrent/TimeUnit;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "Ltse;", "Lkotlin/Function0;", "measureTimeProvider", "Lsls;", "sendingIntervalMs", "Ll8x;", "currentSendJob", "Ll8x;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "eventsQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "globalNavStart", "Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;", "Lru/yandex/video/m3/player/netperf/NetPerfEventCollector;", "collector", "Lru/yandex/video/m3/player/netperf/NetPerfEventCollector;", "netPerfEventTrackerFactory", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "Lpz40;", "", ClidProvider.STATE, "Lpz40;", "job", "Companion", "PerfEventDtoHolder", "Timestamp", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfManager {
    private static final long DEFAULT_INTERVAL = 35;
    private static final String TAG = "PerfApi";
    private static final String VSID_PARAMETER_NAME = "vsid";
    private static final String httpJsonMediaType = "application/json";
    private final NetPerfEventCollector collector;
    private l8x currentSendJob;
    private final ConcurrentLinkedQueue<NetPerfEvent> eventsQueue;
    private final Timestamp globalNavStart;
    private final l8x job;
    private final JsonConverter jsonConverter;
    private final sls measureTimeProvider;
    private final NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder;
    private final NetPerfEventTrackerFactory netPerfEventTrackerFactory;
    private final tse netPerfScope;
    private final OkHttpClient okHttpClient;
    private final long sendingInterval;
    private final long sendingIntervalMs;
    private final TimeUnit sendingIntervalUnit;
    private final pz40 state;
    private final TimeProvider timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoOpOkHttpCallback noOpOkHttpCallback = new NoOpOkHttpCallback();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfManager$PerfEventDtoHolder;", "", "globalNavStart", "", "eventDtos", "", "Lru/yandex/video/m3/player/netperf/PerfEventDto;", "(JLjava/util/List;)V", "getEventDtos", "()Ljava/util/List;", "getGlobalNavStart", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PerfEventDtoHolder {
        private final List<PerfEventDto> eventDtos;
        private final long globalNavStart;

        public PerfEventDtoHolder(long j, List<PerfEventDto> list) {
            this.globalNavStart = j;
            this.eventDtos = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PerfEventDtoHolder copy$default(PerfEventDtoHolder perfEventDtoHolder, long j, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = perfEventDtoHolder.globalNavStart;
            }
            if ((i & 2) != 0) {
                list = perfEventDtoHolder.eventDtos;
            }
            return perfEventDtoHolder.copy(j, list);
        }

        /* renamed from: component1, reason: from getter */
        public final long getGlobalNavStart() {
            return this.globalNavStart;
        }

        public final List<PerfEventDto> component2() {
            return this.eventDtos;
        }

        public final PerfEventDtoHolder copy(long globalNavStart, List<PerfEventDto> eventDtos) {
            return new PerfEventDtoHolder(globalNavStart, eventDtos);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PerfEventDtoHolder)) {
                return false;
            }
            PerfEventDtoHolder perfEventDtoHolder = (PerfEventDtoHolder) other;
            return this.globalNavStart == perfEventDtoHolder.globalNavStart && jl40.l(this.eventDtos, perfEventDtoHolder.eventDtos);
        }

        public final List<PerfEventDto> getEventDtos() {
            return this.eventDtos;
        }

        public final long getGlobalNavStart() {
            return this.globalNavStart;
        }

        public int hashCode() {
            return this.eventDtos.hashCode() + (Long.hashCode(this.globalNavStart) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PerfEventDtoHolder(globalNavStart=");
            sb.append(this.globalNavStart);
            sb.append(", eventDtos=");
            return unr0.t(sb, this.eventDtos, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;", "", "currentTimeMillis", "", "uptimeMillis", "(JJ)V", "getCurrentTimeMillis", "()J", "getUptimeMillis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Timestamp {
        public static final int $stable = 0;
        private final long currentTimeMillis;
        private final long uptimeMillis;

        public Timestamp(long j, long j2) {
            this.currentTimeMillis = j;
            this.uptimeMillis = j2;
        }

        public static /* synthetic */ Timestamp copy$default(Timestamp timestamp, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timestamp.currentTimeMillis;
            }
            if ((i & 2) != 0) {
                j2 = timestamp.uptimeMillis;
            }
            return timestamp.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCurrentTimeMillis() {
            return this.currentTimeMillis;
        }

        /* renamed from: component2, reason: from getter */
        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final Timestamp copy(long currentTimeMillis, long uptimeMillis) {
            return new Timestamp(currentTimeMillis, uptimeMillis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timestamp)) {
                return false;
            }
            Timestamp timestamp = (Timestamp) other;
            return this.currentTimeMillis == timestamp.currentTimeMillis && this.uptimeMillis == timestamp.uptimeMillis;
        }

        public final long getCurrentTimeMillis() {
            return this.currentTimeMillis;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public int hashCode() {
            return Long.hashCode(this.uptimeMillis) + (Long.hashCode(this.currentTimeMillis) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Timestamp(currentTimeMillis=");
            sb.append(this.currentTimeMillis);
            sb.append(", uptimeMillis=");
            return b64.o(sb, this.uptimeMillis, ')');
        }
    }

    public NetPerfManager(OkHttpClient okHttpClient, TimeProvider timeProvider, long j, TimeUnit timeUnit, JsonConverter jsonConverter, NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder, tse tseVar) {
        this.okHttpClient = okHttpClient;
        this.timeProvider = timeProvider;
        this.sendingInterval = j;
        this.sendingIntervalUnit = timeUnit;
        this.jsonConverter = jsonConverter;
        this.netPerfApiSendUrlBuilder = netPerfApiSendUrlBuilder;
        this.netPerfScope = tseVar;
        sls slsVar = new sls() { // from class: ru.yandex.video.m3.player.netperf.NetPerfManager$measureTimeProvider$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Long invoke() {
                TimeProvider timeProvider2;
                timeProvider2 = NetPerfManager.this.timeProvider;
                return Long.valueOf(timeProvider2.uptimeMillis());
            }
        };
        this.measureTimeProvider = slsVar;
        this.sendingIntervalMs = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ConcurrentLinkedQueue<NetPerfEvent> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.eventsQueue = concurrentLinkedQueue;
        this.globalNavStart = new Timestamp(timeProvider.currentTimeMillis(), timeProvider.uptimeMillis());
        NetPerfEventCollector netPerfEventCollector = new NetPerfEventCollector(concurrentLinkedQueue);
        this.collector = netPerfEventCollector;
        this.netPerfEventTrackerFactory = new DefaultNetPerfEventTrackerFactoryImpl(netPerfEventCollector, slsVar);
        r0 c = bvf0.c(Boolean.FALSE);
        this.state = c;
        this.job = e.H(tseVar, e.X(c, new NetPerfManager$special$$inlined$flatMapLatest$1(null, this)));
    }

    private final void logEventAsync(long navStart, List<PerfEventDto> events) {
        try {
            String str = this.jsonConverter.to(events);
            OkHttpClient okHttpClient = this.okHttpClient;
            t4j0 t4j0Var = new t4j0();
            t4j0Var.a = this.netPerfApiSendUrlBuilder.buildUrl(navStart, this.timeProvider);
            int i = m5j0.a;
            Regex regex = wg10.e;
            t4j0Var.e("POST", wms.a(str, qje.o(httpJsonMediaType)));
            ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).I(noOpOkHttpCallback);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEventsIfExist() {
        if (this.eventsQueue.isEmpty()) {
            return;
        }
        List<NetPerfEvent> J0 = a.J0(this.eventsQueue);
        this.eventsQueue.clear();
        tryLogVsids(J0);
        PerfEventDtoHolder transformEvents = transformEvents(J0);
        logEventAsync(transformEvents.getGlobalNavStart(), transformEvents.getEventDtos());
    }

    private final List<PerfEventDto> toDtoList(List<NetPerfEvent> list, Timestamp timestamp) {
        List<NetPerfEvent> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((NetPerfEvent) it.next()).relativeToTimestamp(timestamp.getUptimeMillis()).toDto());
        }
        return arrayList;
    }

    private final PerfEventDtoHolder transformEvents(List<NetPerfEvent> sendingEvents) {
        return new PerfEventDtoHolder(this.globalNavStart.getCurrentTimeMillis(), toDtoList(sendingEvents, this.globalNavStart));
    }

    private final void tryLogVsids(List<NetPerfEvent> events) {
    }

    /* renamed from: getNetPerfEventTrackerFactory$video_player_internalRelease, reason: from getter */
    public final NetPerfEventTrackerFactory getNetPerfEventTrackerFactory() {
        return this.netPerfEventTrackerFactory;
    }

    public final void start$video_player_internalRelease() {
        pz40 pz40Var = this.state;
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void stop$video_player_internalRelease() {
        pz40 pz40Var = this.state;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfManager$Companion;", "", "<init>", "()V", "Ltse;", "createDefaultScope", "()Ltse;", "", "DEFAULT_INTERVAL", "J", "", "TAG", "Ljava/lang/String;", "VSID_PARAMETER_NAME", "httpJsonMediaType", "Lru/yandex/video/m3/player/netperf/NoOpOkHttpCallback;", "noOpOkHttpCallback", "Lru/yandex/video/m3/player/netperf/NoOpOkHttpCallback;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final tse createDefaultScope() {
            NetPerfManager$Companion$createDefaultScope$$inlined$CoroutineExceptionHandler$1 netPerfManager$Companion$createDefaultScope$$inlined$CoroutineExceptionHandler$1 = new NetPerfManager$Companion$createDefaultScope$$inlined$CoroutineExceptionHandler$1(lse.a);
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            mdh.b.getClass();
            return bvf0.a(cvw.U(a, g221.b.P(1)).plus(netPerfManager$Companion$createDefaultScope$$inlined$CoroutineExceptionHandler$1));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NetPerfManager(OkHttpClient okHttpClient, TimeProvider timeProvider, long j, TimeUnit timeUnit, JsonConverter jsonConverter, NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder, tse tseVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, r0, r1, r3, r4, r5, (i & 64) != 0 ? Companion.createDefaultScope() : tseVar);
        NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder2;
        TimeProvider systemTimeProvider = (i & 2) != 0 ? new SystemTimeProvider() : timeProvider;
        long j2 = (i & 4) != 0 ? DEFAULT_INTERVAL : j;
        TimeUnit timeUnit2 = (i & 8) != 0 ? TimeUnit.SECONDS : timeUnit;
        JsonConverter jsonConverterImpl = (i & 16) != 0 ? new JsonConverterImpl() : jsonConverter;
        if ((i & 32) != 0) {
            netPerfApiSendUrlBuilder2 = new DefaultNetPerfApiSendUrlBuilder(null, 1, 0 == true ? 1 : 0);
        } else {
            netPerfApiSendUrlBuilder2 = netPerfApiSendUrlBuilder;
        }
    }
}
