package ru.yandex.video.m3.telemetry.helpers;

import android.os.Handler;
import defpackage.a9z0;
import defpackage.au1;
import defpackage.cj01;
import defpackage.fe10;
import defpackage.jxi;
import defpackage.nmm;
import defpackage.sf10;
import defpackage.tf10;
import defpackage.uf10;
import defpackage.vyc0;
import defpackage.xe10;
import defpackage.yf10;
import kotlin.Metadata;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerCaller;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerControlCallRestrictor;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fH\u0097\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0018H\u0097\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J!\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b.\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u0010\u001dJ\u0011\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002052\u0006\u00108\u001a\u00020\u001fH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001fH\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?¨\u0006@"}, d2 = {"Lru/yandex/video/m3/telemetry/helpers/ProxyTransferMediaSource;", "Luf10;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerCaller;", "originalMediaSource", "Lcj01;", "internalTransferListener", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "netPerfManagerCallRestrictor", "<init>", "(Luf10;Lcj01;Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;)V", "Landroid/os/Handler;", "p0", "Lnmm;", "p1", "Lzy11;", "addDrmEventListener", "(Landroid/os/Handler;Lnmm;)V", "Lyf10;", "addEventListener", "(Landroid/os/Handler;Lyf10;)V", "Lsf10;", "Lau1;", "", "p2", "Lxe10;", "createPeriod", "(Lsf10;Lau1;J)Lxe10;", "Ltf10;", "disable", "(Ltf10;)V", "enable", "Lfe10;", "getMediaItem", "()Lfe10;", "maybeThrowSourceInfoRefreshError", "()V", "releasePeriod", "(Lxe10;)V", "removeDrmEventListener", "(Lnmm;)V", "removeEventListener", "(Lyf10;)V", "caller", "mediaTransferListener", "Lvyc0;", "playerId", "prepareSource", "(Ltf10;Lcj01;Lvyc0;)V", "(Ltf10;Lcj01;)V", "releaseSource", "La9z0;", "getInitialTimeline", "()La9z0;", "", "isSingleWindow", "()Z", "mediaItem", "canUpdateMediaItem", "(Lfe10;)Z", "updateMediaItem", "(Lfe10;)V", "Luf10;", "Lcj01;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProxyTransferMediaSource implements uf10, NetPerfManagerCaller {
    public static final int $stable = 8;
    private final cj01 internalTransferListener;
    private final NetPerfManagerControlCallRestrictor netPerfManagerCallRestrictor;
    private final uf10 originalMediaSource;

    public ProxyTransferMediaSource(uf10 uf10Var, cj01 cj01Var, NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor) {
        this.originalMediaSource = uf10Var;
        this.internalTransferListener = cj01Var;
        this.netPerfManagerCallRestrictor = netPerfManagerControlCallRestrictor;
    }

    @Override // defpackage.uf10
    public void addDrmEventListener(Handler p0, nmm p1) {
        this.originalMediaSource.addDrmEventListener(p0, p1);
    }

    @Override // defpackage.uf10
    public void addEventListener(Handler p0, yf10 p1) {
        this.originalMediaSource.addEventListener(p0, p1);
    }

    @Override // defpackage.uf10
    public boolean canUpdateMediaItem(fe10 mediaItem) {
        return this.originalMediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // defpackage.uf10
    public xe10 createPeriod(sf10 p0, au1 p1, long p2) {
        return this.originalMediaSource.createPeriod(p0, p1, p2);
    }

    @Override // defpackage.uf10
    public void disable(tf10 p0) {
        this.originalMediaSource.disable(p0);
    }

    @Override // defpackage.uf10
    public void enable(tf10 p0) {
        this.originalMediaSource.enable(p0);
    }

    @Override // defpackage.uf10
    public a9z0 getInitialTimeline() {
        return this.originalMediaSource.getInitialTimeline();
    }

    @Override // defpackage.uf10
    public fe10 getMediaItem() {
        return this.originalMediaSource.getMediaItem();
    }

    @Override // defpackage.uf10
    public boolean isSingleWindow() {
        return this.originalMediaSource.isSingleWindow();
    }

    @Override // defpackage.uf10
    public void maybeThrowSourceInfoRefreshError() {
        this.originalMediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.uf10
    public void prepareSource(tf10 caller, cj01 mediaTransferListener, vyc0 playerId) {
        this.netPerfManagerCallRestrictor.start(this);
        this.originalMediaSource.prepareSource(caller, new ProxyTransferListener(mediaTransferListener, this.internalTransferListener), playerId);
    }

    @Override // defpackage.uf10
    public void releasePeriod(xe10 p0) {
        this.originalMediaSource.releasePeriod(p0);
    }

    @Override // defpackage.uf10
    public void releaseSource(tf10 caller) {
        this.originalMediaSource.releaseSource(caller);
        this.netPerfManagerCallRestrictor.stop(this);
    }

    @Override // defpackage.uf10
    public void removeDrmEventListener(nmm p0) {
        this.originalMediaSource.removeDrmEventListener(p0);
    }

    @Override // defpackage.uf10
    public void removeEventListener(yf10 p0) {
        this.originalMediaSource.removeEventListener(p0);
    }

    @Override // defpackage.uf10
    public void updateMediaItem(fe10 mediaItem) {
        this.originalMediaSource.updateMediaItem(mediaItem);
    }

    @Override // defpackage.uf10
    @jxi
    public void prepareSource(tf10 caller, cj01 mediaTransferListener) {
        this.netPerfManagerCallRestrictor.start(this);
        this.originalMediaSource.prepareSource(caller, new ProxyTransferListener(mediaTransferListener, this.internalTransferListener));
    }
}
