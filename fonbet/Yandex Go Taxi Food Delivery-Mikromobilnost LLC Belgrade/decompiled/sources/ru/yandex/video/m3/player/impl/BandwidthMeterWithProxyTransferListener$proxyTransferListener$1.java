package ru.yandex.video.m3.player.impl;

import defpackage.cj01;
import defpackage.ip4;
import defpackage.kpg;
import defpackage.npg;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"ru/yandex/video/m3/player/impl/BandwidthMeterWithProxyTransferListener$proxyTransferListener$1", "Lcj01;", "Lru/yandex/video/m3/player/lowlatency/source/ChunkDownloadListener;", "Lkpg;", "source", "Lnpg;", "dataSpec", "", "isNetwork", "Lzy11;", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "onTransferEnd", "", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "chunkDownloadBytes", "chunkDownloadTime", "flushChunk", "(Lru/yandex/video/m3/player/tracks/TrackType;JJ)V", "segmentBytesDownloaded", "segmentDownloadTime", "flushSegment", "sampleBytes", "sampleTime", "currentTimeMs", "submitPendingSample", "(Lru/yandex/video/m3/player/tracks/TrackType;JJJ)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BandwidthMeterWithProxyTransferListener$proxyTransferListener$1 implements cj01, ChunkDownloadListener {
    final /* synthetic */ BandwidthMeterWithProxyTransferListener this$0;

    public BandwidthMeterWithProxyTransferListener$proxyTransferListener$1(BandwidthMeterWithProxyTransferListener bandwidthMeterWithProxyTransferListener) {
        this.this$0 = bandwidthMeterWithProxyTransferListener;
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void flushChunk(TrackType trackType, long chunkDownloadBytes, long chunkDownloadTime) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        ChunkDownloadListener chunkDownloadListener = proxyTransferListener instanceof ChunkDownloadListener ? (ChunkDownloadListener) proxyTransferListener : null;
        if (chunkDownloadListener != null) {
            chunkDownloadListener.flushChunk(trackType, chunkDownloadBytes, chunkDownloadTime);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void flushSegment(TrackType trackType, long segmentBytesDownloaded, long segmentDownloadTime) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        ChunkDownloadListener chunkDownloadListener = proxyTransferListener instanceof ChunkDownloadListener ? (ChunkDownloadListener) proxyTransferListener : null;
        if (chunkDownloadListener != null) {
            chunkDownloadListener.flushSegment(trackType, segmentBytesDownloaded, segmentDownloadTime);
        }
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        if (proxyTransferListener != null) {
            proxyTransferListener.onBytesTransferred(source, dataSpec, isNetwork, bytesTransferred);
        }
        cj01 externalTransferListener = this.this$0.getExternalTransferListener();
        if (externalTransferListener != null) {
            externalTransferListener.onBytesTransferred(source, dataSpec, isNetwork, bytesTransferred);
        }
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg source, npg dataSpec, boolean isNetwork) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        if (proxyTransferListener != null) {
            proxyTransferListener.onTransferEnd(source, dataSpec, isNetwork);
        }
        cj01 externalTransferListener = this.this$0.getExternalTransferListener();
        if (externalTransferListener != null) {
            externalTransferListener.onTransferEnd(source, dataSpec, isNetwork);
        }
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        if (proxyTransferListener != null) {
            proxyTransferListener.onTransferInitializing(source, dataSpec, isNetwork);
        }
        cj01 externalTransferListener = this.this$0.getExternalTransferListener();
        if (externalTransferListener != null) {
            externalTransferListener.onTransferInitializing(source, dataSpec, isNetwork);
        }
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        if (proxyTransferListener != null) {
            proxyTransferListener.onTransferStart(source, dataSpec, isNetwork);
        }
        cj01 externalTransferListener = this.this$0.getExternalTransferListener();
        if (externalTransferListener != null) {
            externalTransferListener.onTransferStart(source, dataSpec, isNetwork);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener
    public void submitPendingSample(TrackType trackType, long sampleBytes, long sampleTime, long currentTimeMs) {
        ip4 ip4Var;
        ip4Var = this.this$0.internalBandwidthMeter;
        cj01 proxyTransferListener = ip4Var.getProxyTransferListener();
        ChunkDownloadListener chunkDownloadListener = proxyTransferListener instanceof ChunkDownloadListener ? (ChunkDownloadListener) proxyTransferListener : null;
        if (chunkDownloadListener != null) {
            chunkDownloadListener.submitPendingSample(trackType, sampleBytes, sampleTime, currentTimeMs);
        }
    }
}
