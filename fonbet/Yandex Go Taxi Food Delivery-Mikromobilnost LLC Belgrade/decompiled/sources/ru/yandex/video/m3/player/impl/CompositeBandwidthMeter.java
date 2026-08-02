package ru.yandex.video.m3.player.impl;

import android.os.Handler;
import defpackage.cj01;
import defpackage.gp4;
import defpackage.hp4;
import defpackage.ip4;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.player.feature.PlaybackFeatureChangeListener;
import ru.yandex.video.m3.player.feature.PlaybackFeatures;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/CompositeBandwidthMeter;", "Lip4;", "Lru/yandex/video/m3/player/feature/PlaybackFeatureChangeListener;", "baseBandwidthMeter", "lowLatencyBandwidthMeter", "Landroid/os/Handler;", "handler", "<init>", "(Lip4;Lip4;Landroid/os/Handler;)V", "", "getBitrateEstimate", "()J", "Lcj01;", "getTransferListener", "()Lcj01;", "Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "features", "Lzy11;", "updateFeatureConfig", "(Lru/yandex/video/m3/player/feature/PlaybackFeatures;)V", "eventHandler", "Lhp4;", "eventListener", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "removeEventListener", "(Lhp4;)V", "Lip4;", "Landroid/os/Handler;", "", "lowLatency", "Z", "Lgp4;", "eventDispatcher", "Lgp4;", "CompositeListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeBandwidthMeter implements ip4, PlaybackFeatureChangeListener {
    public static final int $stable = 8;
    private final ip4 baseBandwidthMeter;
    private final gp4 eventDispatcher = new gp4();
    private final Handler handler;
    private volatile boolean lowLatency;
    private final ip4 lowLatencyBandwidthMeter;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/CompositeBandwidthMeter$CompositeListener;", "Lhp4;", "Lkotlin/Function0;", "", "condition", "<init>", "(Lru/yandex/video/m3/player/impl/CompositeBandwidthMeter;Lsls;)V", "", "elapsedMs", "", "bytesTransferred", "bitrateEstimate", "Lzy11;", "onBandwidthSample", "(IJJ)V", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class CompositeListener implements hp4 {
        private final sls condition;

        public CompositeListener(sls slsVar) {
            this.condition = slsVar;
        }

        @Override // defpackage.hp4
        public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
            if (((Boolean) this.condition.invoke()).booleanValue()) {
                CompositeBandwidthMeter.this.eventDispatcher.b(elapsedMs, bytesTransferred, bitrateEstimate);
            }
        }
    }

    public CompositeBandwidthMeter(ip4 ip4Var, ip4 ip4Var2, Handler handler) {
        this.baseBandwidthMeter = ip4Var;
        this.lowLatencyBandwidthMeter = ip4Var2;
        this.handler = handler;
        ip4Var.addEventListener(handler, new CompositeListener(new sls() { // from class: ru.yandex.video.m3.player.impl.CompositeBandwidthMeter.1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                return Boolean.valueOf(!CompositeBandwidthMeter.this.lowLatency);
            }
        }));
        ip4Var2.addEventListener(handler, new CompositeListener(new sls() { // from class: ru.yandex.video.m3.player.impl.CompositeBandwidthMeter.3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Boolean invoke() {
                return Boolean.valueOf(CompositeBandwidthMeter.this.lowLatency);
            }
        }));
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler eventHandler, hp4 eventListener) {
        this.eventDispatcher.a(eventHandler, eventListener);
    }

    @Override // defpackage.ip4
    public long getBitrateEstimate() {
        return this.lowLatency ? this.lowLatencyBandwidthMeter.getBitrateEstimate() : this.baseBandwidthMeter.getBitrateEstimate();
    }

    @Override // defpackage.ip4
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ip4
    /* renamed from: getTransferListener */
    public cj01 getProxyTransferListener() {
        return this.lowLatency ? this.lowLatencyBandwidthMeter.getProxyTransferListener() : this.baseBandwidthMeter.getProxyTransferListener();
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 eventListener) {
        this.eventDispatcher.c(eventListener);
    }

    @Override // ru.yandex.video.m3.player.feature.PlaybackFeatureChangeListener
    public void updateFeatureConfig(PlaybackFeatures features) {
        this.lowLatency = features.getLowLatency();
    }
}
