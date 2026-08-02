package ru.yandex.video.m3.player.bandwidth;

import android.os.Handler;
import defpackage.bvf0;
import defpackage.cj01;
import defpackage.cvw;
import defpackage.ep4;
import defpackage.f050;
import defpackage.gp4;
import defpackage.h5z0;
import defpackage.hp4;
import defpackage.ijo;
import defpackage.ip4;
import defpackage.jl40;
import defpackage.jyc;
import defpackage.kpg;
import defpackage.lse;
import defpackage.mdh;
import defpackage.mse;
import defpackage.npg;
import defpackage.phs0;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.twq;
import defpackage.uan;
import defpackage.uyj;
import defpackage.zoy0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.bandwidth.DurationMeasurerImpl;
import ru.yandex.video.m3.player.bandwidth.IntervalTaskImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.videoplayer.multiplatform.fetcher.a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000245B/\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J/\u0010)\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u000601R\u00020\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;", "Lip4;", "Lcj01;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", RemoteBioParameters.TIME, "Lgp4;", "eventDispatcher", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "progressAccumulatorNotifier", "Lkotlin/Function0;", "", "provideCurrentEstimate", "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lgp4;Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;Lsls;)V", "", "elapsedMs", "bytesTransferred", "Lzy11;", "notifyEstimateSample", "(IJ)V", "Landroid/os/Handler;", "eventHandler", "Lhp4;", "eventListener", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "removeEventListener", "(Lhp4;)V", "getTransferListener", "()Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;", "getBitrateEstimate", "()J", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lgp4;", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "Lsls;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter$Transfer;", "transfers", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "Transfer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonBandwidthMeter implements ip4, cj01 {
    private static CommonBandwidthMeter INSTANCE = null;
    private static final String TAG = "CommonBandwidthMeter";
    private static final tse defaultProcessingScope;
    private static final jyc processingJob;
    private static final mse runtimeExceptionHandler;
    private final gp4 eventDispatcher;
    private final ProgressAccumulatorNotifier progressAccumulatorNotifier;
    private final sls provideCurrentEstimate;
    private final TimeProvider time;
    private final ConcurrentHashMap<Integer, Transfer> transfers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        CommonBandwidthMeter$special$$inlined$CoroutineExceptionHandler$1 commonBandwidthMeter$special$$inlined$CoroutineExceptionHandler$1 = new CommonBandwidthMeter$special$$inlined$CoroutineExceptionHandler$1(lse.a);
        runtimeExceptionHandler = commonBandwidthMeter$special$$inlined$CoroutineExceptionHandler$1;
        qhw0 a = jl40.a();
        processingJob = a;
        sjh sjhVar = uyj.a;
        defaultProcessingScope = bvf0.a(cvw.U(a, mdh.b).plus(commonBandwidthMeter$special$$inlined$CoroutineExceptionHandler$1));
    }

    private CommonBandwidthMeter(TimeProvider timeProvider, gp4 gp4Var, ProgressAccumulatorNotifier progressAccumulatorNotifier, sls slsVar) {
        this.time = timeProvider;
        this.eventDispatcher = gp4Var;
        this.progressAccumulatorNotifier = progressAccumulatorNotifier;
        this.provideCurrentEstimate = slsVar;
        this.transfers = new ConcurrentHashMap<>();
    }

    private final void notifyEstimateSample(int elapsedMs, long bytesTransferred) {
        this.eventDispatcher.b(elapsedMs, bytesTransferred, ((Number) this.provideCurrentEstimate.invoke()).longValue());
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler eventHandler, hp4 eventListener) {
        this.eventDispatcher.a(eventHandler, eventListener);
    }

    @Override // defpackage.ip4
    public long getBitrateEstimate() {
        return ((Number) this.provideCurrentEstimate.invoke()).longValue();
    }

    @Override // defpackage.ip4
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
        if (isNetwork) {
            Transfer transfer = this.transfers.get(Integer.valueOf(source.hashCode()));
            if (transfer == null) {
                h5z0.a.o("Didn't find transfer for source '" + source.getInflatedUri() + "'. Ignoring onBytesTransferred", new Object[0]);
                return;
            }
            long elapsedRealtime = this.time.elapsedRealtime();
            this.progressAccumulatorNotifier.responseProgress(new ep4(elapsedRealtime - transfer.getLastMillis(), bytesTransferred));
            transfer.setTotalBytes(transfer.getTotalBytes() + bytesTransferred);
            transfer.setLastMillis(elapsedRealtime);
        }
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
        if (isNetwork) {
            int hashCode = source.hashCode();
            Transfer transfer = this.transfers.get(Integer.valueOf(hashCode));
            if (transfer == null) {
                h5z0.a.o("Didn't find transfer for source '" + source.getInflatedUri() + "'. Ignoring onTransferEnd", new Object[0]);
                return;
            }
            this.progressAccumulatorNotifier.responseEnd();
            this.transfers.remove(Integer.valueOf(hashCode));
            long lastMillis = transfer.getLastMillis() - transfer.getStartMillis();
            if (transfer.getTotalBytes() <= 0 || lastMillis <= 0) {
                return;
            }
            notifyEstimateSample((int) lastMillis, transfer.getTotalBytes());
        }
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
        if (isNetwork) {
            this.transfers.put(Integer.valueOf(source.hashCode()), new Transfer(this, 0L, 0L, 0L, 7, null));
            this.progressAccumulatorNotifier.responseStart();
        }
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 eventListener) {
        this.eventDispatcher.c(eventListener);
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter$Companion;", "", "<init>", "()V", "Lru/yandex/videoplayer/multiplatform/fetcher/a;", "progressAccumulator", "Lphs0;", "notifierFetcher", "Ltse;", "processingScope", "", "usingPlatformSync", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "getProgressAccumulatorNotifier", "(Lru/yandex/videoplayer/multiplatform/fetcher/a;Lphs0;Ltse;Z)Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "", "initialBandwidth", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", RemoteBioParameters.TIME, "Lgp4;", "eventDispatcher", "usePlatformSync", "Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;", "getInstance$video_player_internalRelease", "(DLru/yandex/video/m3/player/impl/utils/TimeProvider;Lgp4;Ltse;Z)Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;", "getInstance", "INSTANCE", "Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;", "", "TAG", "Ljava/lang/String;", "defaultProcessingScope", "Ltse;", "Ljyc;", "processingJob", "Ljyc;", "Lmse;", "runtimeExceptionHandler", "Lmse;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CommonBandwidthMeter getInstance$video_player_internalRelease$default(Companion companion, double d, TimeProvider timeProvider, gp4 gp4Var, tse tseVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                d = Double.NaN;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                timeProvider = new SystemTimeProvider();
            }
            TimeProvider timeProvider2 = timeProvider;
            if ((i & 4) != 0) {
                gp4Var = new gp4();
            }
            gp4 gp4Var2 = gp4Var;
            if ((i & 8) != 0) {
                tseVar = CommonBandwidthMeter.defaultProcessingScope;
            }
            tse tseVar2 = tseVar;
            if ((i & 16) != 0) {
                z = false;
            }
            return companion.getInstance$video_player_internalRelease(d2, timeProvider2, gp4Var2, tseVar2, z);
        }

        private final ProgressAccumulatorNotifier getProgressAccumulatorNotifier(a progressAccumulator, phs0 notifierFetcher, tse processingScope, boolean usingPlatformSync) {
            ProgressAccumulatorNotifierImpl progressAccumulatorNotifierImpl = new ProgressAccumulatorNotifierImpl(progressAccumulator, notifierFetcher);
            return usingPlatformSync ? new SyncProgressAccumulatorNotifier(processingScope, progressAccumulatorNotifierImpl) : progressAccumulatorNotifierImpl;
        }

        public final CommonBandwidthMeter getInstance$video_player_internalRelease(double initialBandwidth, TimeProvider time, gp4 eventDispatcher, tse processingScope, boolean usePlatformSync) {
            CommonBandwidthMeter commonBandwidthMeter;
            CommonBandwidthMeter commonBandwidthMeter2 = CommonBandwidthMeter.INSTANCE;
            if (commonBandwidthMeter2 != null) {
                return commonBandwidthMeter2;
            }
            synchronized (this) {
                try {
                    commonBandwidthMeter = CommonBandwidthMeter.INSTANCE;
                    if (commonBandwidthMeter == null) {
                        Companion companion = CommonBandwidthMeter.INSTANCE;
                        h5z0.a.m("Initing CommonBandwidthMeter", new Object[0]);
                        ru.yandex.videoplayer.multiplatform.estimate.a aVar = ru.yandex.videoplayer.multiplatform.estimate.a.e;
                        final ru.yandex.videoplayer.multiplatform.estimate.a y = zoy0.y(initialBandwidth);
                        a aVar2 = new a(new DurationMeasurerImpl.Factory(time), new twq(new IntervalTaskImpl.Factory(processingScope), 2));
                        phs0 phs0Var = new phs0();
                        ProgressAccumulatorNotifier progressAccumulatorNotifier = companion.getProgressAccumulatorNotifier(aVar2, phs0Var, processingScope, usePlatformSync);
                        y.a.add(aVar2);
                        tls tlsVar = y.d;
                        f050 f050Var = a.k;
                        if (f050.b) {
                            aVar2.f.a.add(tlsVar);
                        } else {
                            synchronized (f050Var.a) {
                                aVar2.f.a.add(tlsVar);
                            }
                        }
                        aVar2.a(phs0Var);
                        CommonBandwidthMeter commonBandwidthMeter3 = new CommonBandwidthMeter(time, eventDispatcher, progressAccumulatorNotifier, new sls() { // from class: ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeter$Companion$getInstance$1$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Long invoke() {
                                double d;
                                ijo ijoVar = ru.yandex.videoplayer.multiplatform.estimate.a.this.c;
                                if (ijoVar.e >= 128000.0d) {
                                    uan uanVar = ijoVar.c;
                                    double pow = uanVar.b / (1.0d - Math.pow(uanVar.a, uanVar.c));
                                    uan uanVar2 = ijoVar.d;
                                    d = Math.min(pow, uanVar2.b / (1.0d - Math.pow(uanVar2.a, uanVar2.c)));
                                } else {
                                    d = ijoVar.a;
                                }
                                return Long.valueOf((long) d);
                            }
                        }, null);
                        CommonBandwidthMeter.INSTANCE = commonBandwidthMeter3;
                        commonBandwidthMeter = commonBandwidthMeter3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return commonBandwidthMeter;
        }

        private Companion() {
        }
    }

    @Override // defpackage.ip4
    /* renamed from: getTransferListener */
    public CommonBandwidthMeter getProxyTransferListener() {
        return this;
    }

    public /* synthetic */ CommonBandwidthMeter(TimeProvider timeProvider, gp4 gp4Var, ProgressAccumulatorNotifier progressAccumulatorNotifier, sls slsVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, gp4Var, progressAccumulatorNotifier, slsVar);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter$Transfer;", "", "totalBytes", "", "startMillis", "lastMillis", "(Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeter;JJJ)V", "getLastMillis", "()J", "setLastMillis", "(J)V", "getStartMillis", "setStartMillis", "getTotalBytes", "setTotalBytes", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Transfer {
        private long lastMillis;
        private long startMillis;
        private long totalBytes;

        public /* synthetic */ Transfer(CommonBandwidthMeter commonBandwidthMeter, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? commonBandwidthMeter.time.elapsedRealtime() : j2, (i & 4) != 0 ? commonBandwidthMeter.time.elapsedRealtime() : j3);
        }

        public final long getLastMillis() {
            return this.lastMillis;
        }

        public final long getStartMillis() {
            return this.startMillis;
        }

        public final long getTotalBytes() {
            return this.totalBytes;
        }

        public final void setLastMillis(long j) {
            this.lastMillis = j;
        }

        public final void setStartMillis(long j) {
            this.startMillis = j;
        }

        public final void setTotalBytes(long j) {
            this.totalBytes = j;
        }

        public Transfer(long j, long j2, long j3) {
            this.totalBytes = j;
            this.startMillis = j2;
            this.lastMillis = j3;
        }
    }
}
