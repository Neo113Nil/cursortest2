package ru.yandex.video.m3.player.impl.bandwidth;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.c260;
import defpackage.cj01;
import defpackage.gp4;
import defpackage.hp4;
import defpackage.ip4;
import defpackage.kpg;
import defpackage.npg;
import defpackage.o2x0;
import defpackage.vps0;
import defpackage.y3c;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002<=B=\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J/\u0010*\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109¨\u0006>"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/MultipleStreamsBandwidthMeter;", "Lip4;", "Lcj01;", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "eventHandler", "Lhp4;", "eventListener", "", "maxWeight", "Ly3c;", "clock", "<init>", "(Landroid/content/Context;Landroid/os/Handler;Lhp4;ILy3c;)V", "elapsedMs", "", "bytesTransferred", "bitrate", "Lzy11;", "maybeNotifyBandwidthSample", "(IJJ)V", "networkType", "getInitialBitrateEstimateForNetworkType", "(I)J", "getBitrateEstimate", "()J", "getTransferListener", "()Lcj01;", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "removeEventListener", "(Lhp4;)V", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "Lgp4;", "eventDispatcher", "Lgp4;", "Lvps0;", "slidingPercentile", "Lvps0;", "Ly3c;", "Ljava/util/WeakHashMap;", "Lru/yandex/video/m3/player/impl/bandwidth/MultipleStreamsBandwidthMeter$Transfer;", "transfers", "Ljava/util/WeakHashMap;", "totalElapsedTimeMs", "J", "totalBytesTransferred", "bitrateEstimate", "Companion", "Transfer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultipleStreamsBandwidthMeter implements ip4, cj01 {
    public static final int $stable;
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE_2G = 159000;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE_3G = 2200000;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE_4G = 2700000;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE_5G = 5900000;
    private static final long DEFAULT_INITIAL_BITRATE_ESTIMATE_WIFI = 6100000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private static final Map<Integer, Long> initialBitrateEstimates;
    private long bitrateEstimate;
    private final y3c clock;
    private final gp4 eventDispatcher;
    private final vps0 slidingPercentile;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    private final WeakHashMap<kpg, Transfer> transfers;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/MultipleStreamsBandwidthMeter$Transfer;", "", "()V", "sampleBytesTransferred", "", "getSampleBytesTransferred", "()J", "setSampleBytesTransferred", "(J)V", "sampleStartTimeMs", "getSampleStartTimeMs", "setSampleStartTimeMs", "streamCount", "", "getStreamCount", "()I", "setStreamCount", "(I)V", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transfer {
        private long sampleBytesTransferred;
        private long sampleStartTimeMs;
        private int streamCount;
        private Uri uri;

        public final long getSampleBytesTransferred() {
            return this.sampleBytesTransferred;
        }

        public final long getSampleStartTimeMs() {
            return this.sampleStartTimeMs;
        }

        public final int getStreamCount() {
            return this.streamCount;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final void setSampleBytesTransferred(long j) {
            this.sampleBytesTransferred = j;
        }

        public final void setSampleStartTimeMs(long j) {
            this.sampleStartTimeMs = j;
        }

        public final void setStreamCount(int i) {
            this.streamCount = i;
        }

        public final void setUri(Uri uri) {
            this.uri = uri;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        $stable = 8;
        initialBitrateEstimates = companion.getInitialBitrateEstimates();
    }

    public MultipleStreamsBandwidthMeter(Context context, Handler handler, hp4 hp4Var, int i, y3c y3cVar) {
        gp4 gp4Var = new gp4();
        this.eventDispatcher = gp4Var;
        if (handler != null && hp4Var != null) {
            gp4Var.a(handler, hp4Var);
        }
        this.slidingPercentile = new vps0(i);
        this.clock = y3cVar;
        this.transfers = new WeakHashMap<>();
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(context == null ? 0 : c260.a(context).b());
    }

    private final long getInitialBitrateEstimateForNetworkType(int networkType) {
        Map<Integer, Long> map = initialBitrateEstimates;
        Long l = map.get(Integer.valueOf(networkType));
        if (l == null) {
            l = map.get(0);
        }
        if (l == null) {
            l = Long.valueOf(DEFAULT_INITIAL_BITRATE_ESTIMATE);
        }
        return l.longValue();
    }

    private final void maybeNotifyBandwidthSample(int elapsedMs, long bytesTransferred, long bitrate) {
        if (elapsedMs == 0 && bytesTransferred == 0) {
            return;
        }
        this.eventDispatcher.b(elapsedMs, bytesTransferred, bitrate);
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler eventHandler, hp4 eventListener) {
        this.eventDispatcher.a(eventHandler, eventListener);
    }

    @Override // defpackage.ip4
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // defpackage.ip4
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ip4
    /* renamed from: getTransferListener */
    public cj01 getProxyTransferListener() {
        return this;
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
        Transfer transfer;
        if (isNetwork && (transfer = this.transfers.get(source)) != null) {
            transfer.setSampleBytesTransferred(transfer.getSampleBytesTransferred() + bytesTransferred);
        }
    }

    @Override // defpackage.cj01
    public synchronized void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
        Throwable th;
        MultipleStreamsBandwidthMeter multipleStreamsBandwidthMeter;
        try {
            if (!isNetwork) {
                return;
            }
            try {
                Transfer transfer = this.transfers.get(source);
                if (transfer == null) {
                    return;
                }
                try {
                    ((o2x0) this.clock).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long sampleStartTimeMs = transfer.getSampleStartTimeMs();
                    long sampleBytesTransferred = transfer.getSampleBytesTransferred();
                    int i = (int) (elapsedRealtime - sampleStartTimeMs);
                    this.totalElapsedTimeMs += i;
                    this.totalBytesTransferred += sampleBytesTransferred;
                    if (i > 0) {
                        try {
                            this.slidingPercentile.a((sampleBytesTransferred * 8000.0f) / i, (int) Math.sqrt(sampleBytesTransferred));
                            if (this.totalElapsedTimeMs < 2000) {
                                if (this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                }
                            }
                            this.bitrateEstimate = (long) this.slidingPercentile.b();
                        } catch (Throwable th2) {
                            th = th2;
                            multipleStreamsBandwidthMeter = this;
                            throw th;
                        }
                    }
                    maybeNotifyBandwidthSample(i, sampleBytesTransferred, this.bitrateEstimate);
                    transfer.setStreamCount(transfer.getStreamCount() - 1);
                    if (transfer.getStreamCount() > 0) {
                        transfer.setSampleStartTimeMs(elapsedRealtime);
                        transfer.setSampleBytesTransferred(0L);
                    } else {
                        this.transfers.remove(source);
                    }
                } catch (Throwable th3) {
                    multipleStreamsBandwidthMeter = this;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                multipleStreamsBandwidthMeter = this;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
        if (isNetwork) {
            Transfer transfer = this.transfers.get(source);
            if (transfer == null) {
                transfer = new Transfer();
                transfer.setUri(dataSpec.a);
                ((o2x0) this.clock).getClass();
                transfer.setSampleStartTimeMs(SystemClock.elapsedRealtime());
                this.transfers.put(source, transfer);
            }
            transfer.setStreamCount(transfer.getStreamCount() + 1);
            transfer.getStreamCount();
        }
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 eventListener) {
        this.eventDispatcher.c(eventListener);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/MultipleStreamsBandwidthMeter$Companion;", "", "()V", "BYTES_TRANSFERRED_FOR_ESTIMATE", "", "DEFAULT_INITIAL_BITRATE_ESTIMATE", "", "DEFAULT_INITIAL_BITRATE_ESTIMATE_2G", "DEFAULT_INITIAL_BITRATE_ESTIMATE_3G", "DEFAULT_INITIAL_BITRATE_ESTIMATE_4G", "DEFAULT_INITIAL_BITRATE_ESTIMATE_5G", "DEFAULT_INITIAL_BITRATE_ESTIMATE_WIFI", "ELAPSED_MILLIS_FOR_ESTIMATE", "initialBitrateEstimates", "", "getInitialBitrateEstimates", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<Integer, Long> getInitialBitrateEstimates() {
            HashMap hashMap = new HashMap(6);
            hashMap.put(0, Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE));
            Long valueOf = Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE_WIFI);
            hashMap.put(2, valueOf);
            hashMap.put(3, Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE_2G));
            hashMap.put(4, Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE_3G));
            hashMap.put(5, Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE_4G));
            Long valueOf2 = Long.valueOf(MultipleStreamsBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATE_5G);
            hashMap.put(10, valueOf2);
            hashMap.put(9, valueOf2);
            hashMap.put(7, valueOf);
            return hashMap;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultipleStreamsBandwidthMeter(Context context, Handler handler, hp4 hp4Var, int i, y3c y3cVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : handler, (i2 & 4) != 0 ? null : hp4Var, (i2 & 8) != 0 ? ELAPSED_MILLIS_FOR_ESTIMATE : i, (i2 & 16) != 0 ? y3c.a : y3cVar);
    }
}
