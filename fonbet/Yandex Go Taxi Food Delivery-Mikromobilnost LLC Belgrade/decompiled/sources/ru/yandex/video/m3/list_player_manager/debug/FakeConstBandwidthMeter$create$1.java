package ru.yandex.video.m3.list_player_manager.debug;

import android.os.Handler;
import defpackage.cj01;
import defpackage.hp4;
import defpackage.ip4;
import defpackage.kpg;
import defpackage.npg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"ru/yandex/video/m3/list_player_manager/debug/FakeConstBandwidthMeter$create$1", "Lip4;", "Lcj01;", "", "getBitrateEstimate", "()J", "getTransferListener", "()Lcj01;", "Landroid/os/Handler;", "eventHandler", "Lhp4;", "eventListener", "Lzy11;", "addEventListener", "(Landroid/os/Handler;Lhp4;)V", "removeEventListener", "(Lhp4;)V", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "onTransferEnd", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FakeConstBandwidthMeter$create$1 implements ip4, cj01 {
    final /* synthetic */ FakeConstBandwidthMeter this$0;

    public FakeConstBandwidthMeter$create$1(FakeConstBandwidthMeter fakeConstBandwidthMeter) {
        this.this$0 = fakeConstBandwidthMeter;
    }

    @Override // defpackage.ip4
    public void addEventListener(Handler eventHandler, hp4 eventListener) {
    }

    @Override // defpackage.ip4
    public long getBitrateEstimate() {
        long j;
        j = this.this$0.initBitrateEstimate;
        return j;
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
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // defpackage.ip4
    public void removeEventListener(hp4 eventListener) {
    }
}
