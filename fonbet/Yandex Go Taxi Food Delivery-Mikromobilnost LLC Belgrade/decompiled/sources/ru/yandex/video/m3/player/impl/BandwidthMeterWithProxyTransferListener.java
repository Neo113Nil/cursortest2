package ru.yandex.video.m3.player.impl;

import android.os.Handler;
import defpackage.cj01;
import defpackage.hp4;
import defpackage.ip4;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/BandwidthMeterWithProxyTransferListener;", "Lip4;", "internalBandwidthMeter", "<init>", "(Lip4;)V", "Landroid/os/Handler;", "p0", "Lhp4;", "p1", "Lzy11;", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "", "getBitrateEstimate", "()J", "removeEventListener", "(Lhp4;)V", "getTimeToFirstByteEstimateUs", "Lcj01;", "getTransferListener", "()Lcj01;", "Lip4;", "externalTransferListener", "Lcj01;", "getExternalTransferListener", "setExternalTransferListener", "(Lcj01;)V", "proxyTransferListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BandwidthMeterWithProxyTransferListener implements ip4 {
    public static final int $stable = 8;
    private cj01 externalTransferListener;
    private final ip4 internalBandwidthMeter;
    private final cj01 proxyTransferListener = new BandwidthMeterWithProxyTransferListener$proxyTransferListener$1(this);

    public BandwidthMeterWithProxyTransferListener(ip4 ip4Var) {
        this.internalBandwidthMeter = ip4Var;
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler p0, hp4 p1) {
        this.internalBandwidthMeter.addEventListener(p0, p1);
    }

    @Override // defpackage.ip4
    public long getBitrateEstimate() {
        return this.internalBandwidthMeter.getBitrateEstimate();
    }

    public final cj01 getExternalTransferListener() {
        return this.externalTransferListener;
    }

    @Override // defpackage.ip4
    public long getTimeToFirstByteEstimateUs() {
        return this.internalBandwidthMeter.getTimeToFirstByteEstimateUs();
    }

    @Override // defpackage.ip4
    /* renamed from: getTransferListener, reason: from getter */
    public cj01 getProxyTransferListener() {
        return this.proxyTransferListener;
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 p0) {
        this.internalBandwidthMeter.removeEventListener(p0);
    }

    public final void setExternalTransferListener(cj01 cj01Var) {
        this.externalTransferListener = cj01Var;
    }
}
