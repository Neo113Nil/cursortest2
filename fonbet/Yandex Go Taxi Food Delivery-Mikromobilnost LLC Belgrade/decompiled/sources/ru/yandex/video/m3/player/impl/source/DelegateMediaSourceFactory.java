package ru.yandex.video.m3.player.impl.source;

import android.os.Handler;
import defpackage.a9z0;
import defpackage.au1;
import defpackage.cj01;
import defpackage.fe10;
import defpackage.nmm;
import defpackage.o2v0;
import defpackage.rf10;
import defpackage.rmm;
import defpackage.s8c;
import defpackage.sf10;
import defpackage.tf10;
import defpackage.twy;
import defpackage.uf10;
import defpackage.vyc0;
import defpackage.xe10;
import defpackage.yf10;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.yandex.video.m3.player.baseurls.BaseUrlsManagerProvider;
import ru.yandex.video.m3.player.netperf.NetPerfManager;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory;", "Lrf10;", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "baseUrlsManagerProvider", "baseMediaSourceFactory", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "netPerfManager", "<init>", "(Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;Lrf10;Lru/yandex/video/m3/player/netperf/NetPerfManager;)V", "", "getSupportedTypes", "()[I", "Lrmm;", "p0", "setDrmSessionManagerProvider", "(Lrmm;)Lrf10;", "Ltwy;", "setLoadErrorHandlingPolicy", "(Ltwy;)Lrf10;", "Lfe10;", "mediaItem", "Luf10;", "createMediaSource", "(Lfe10;)Luf10;", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "Lrf10;", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "DelegateMediaSource", "DelegateMediaSourceCaller", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DelegateMediaSourceFactory implements rf10 {
    public static final int $stable = 8;
    private final rf10 baseMediaSourceFactory;
    private final BaseUrlsManagerProvider baseUrlsManagerProvider;
    private final NetPerfManager netPerfManager;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory$DelegateMediaSourceCaller;", "Ltf10;", "Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory$DelegateMediaSource;", "mediaSource", "mediaSourceCaller", "<init>", "(Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory$DelegateMediaSource;Ltf10;)V", "Luf10;", "source", "La9z0;", "timeline", "Lzy11;", "onSourceInfoRefreshed", "(Luf10;La9z0;)V", "Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory$DelegateMediaSource;", "Ltf10;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DelegateMediaSourceCaller implements tf10 {
        public static final int $stable = 8;
        private final DelegateMediaSource mediaSource;
        private final tf10 mediaSourceCaller;

        public DelegateMediaSourceCaller(DelegateMediaSource delegateMediaSource, tf10 tf10Var) {
            this.mediaSource = delegateMediaSource;
            this.mediaSourceCaller = tf10Var;
        }

        @Override // defpackage.tf10
        public void onSourceInfoRefreshed(uf10 source, a9z0 timeline) {
            this.mediaSourceCaller.onSourceInfoRefreshed(this.mediaSource, timeline);
        }
    }

    public DelegateMediaSourceFactory(BaseUrlsManagerProvider baseUrlsManagerProvider, rf10 rf10Var, NetPerfManager netPerfManager) {
        this.baseUrlsManagerProvider = baseUrlsManagerProvider;
        this.baseMediaSourceFactory = rf10Var;
        this.netPerfManager = netPerfManager;
    }

    @Override // defpackage.rf10
    public uf10 createMediaSource(fe10 mediaItem) {
        return new DelegateMediaSource(this.baseUrlsManagerProvider, this.baseMediaSourceFactory.createMediaSource(mediaItem), this.netPerfManager);
    }

    @Override // defpackage.rf10
    @Deprecated
    public rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    @Override // defpackage.rf10
    public rf10 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // defpackage.rf10
    public int[] getSupportedTypes() {
        return this.baseMediaSourceFactory.getSupportedTypes();
    }

    public rf10 setCmcdConfigurationFactory(s8c s8cVar) {
        return this;
    }

    @Override // defpackage.rf10
    public rf10 setDrmSessionManagerProvider(rmm p0) {
        return this.baseMediaSourceFactory.setDrmSessionManagerProvider(p0);
    }

    @Override // defpackage.rf10
    public rf10 setLoadErrorHandlingPolicy(twy p0) {
        return this.baseMediaSourceFactory.setLoadErrorHandlingPolicy(p0);
    }

    @Override // defpackage.rf10
    public rf10 setSubtitleParserFactory(o2v0 o2v0Var) {
        return this;
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u001aH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0017H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b'\u0010(J)\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/yandex/video/m3/player/impl/source/DelegateMediaSourceFactory$DelegateMediaSource;", "Luf10;", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "baseUrlsManagerProvider", "baseMediaSource", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "netPerfManager", "<init>", "(Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;Luf10;Lru/yandex/video/m3/player/netperf/NetPerfManager;)V", "Landroid/os/Handler;", "p0", "Lnmm;", "p1", "Lzy11;", "addDrmEventListener", "(Landroid/os/Handler;Lnmm;)V", "Lyf10;", "addEventListener", "(Landroid/os/Handler;Lyf10;)V", "Lsf10;", "Lau1;", "", "p2", "Lxe10;", "createPeriod", "(Lsf10;Lau1;J)Lxe10;", "Ltf10;", "disable", "(Ltf10;)V", "enable", "Lfe10;", "getMediaItem", "()Lfe10;", "maybeThrowSourceInfoRefreshError", "()V", "releasePeriod", "(Lxe10;)V", "removeDrmEventListener", "(Lnmm;)V", "removeEventListener", "(Lyf10;)V", "caller", "Lcj01;", "mediaTransferListener", "Lvyc0;", "playerId", "prepareSource", "(Ltf10;Lcj01;Lvyc0;)V", "releaseSource", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "Luf10;", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "Ljava/util/concurrent/ConcurrentHashMap;", "mediaSourceCallers", "Ljava/util/concurrent/ConcurrentHashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DelegateMediaSource implements uf10 {
        public static final int $stable = 8;
        private final uf10 baseMediaSource;
        private final BaseUrlsManagerProvider baseUrlsManagerProvider;
        private final ConcurrentHashMap<tf10, tf10> mediaSourceCallers = new ConcurrentHashMap<>();
        private final NetPerfManager netPerfManager;

        public DelegateMediaSource(BaseUrlsManagerProvider baseUrlsManagerProvider, uf10 uf10Var, NetPerfManager netPerfManager) {
            this.baseUrlsManagerProvider = baseUrlsManagerProvider;
            this.baseMediaSource = uf10Var;
            this.netPerfManager = netPerfManager;
        }

        @Override // defpackage.uf10
        public void addDrmEventListener(Handler p0, nmm p1) {
            this.baseMediaSource.addDrmEventListener(p0, p1);
        }

        @Override // defpackage.uf10
        public void addEventListener(Handler p0, yf10 p1) {
            this.baseMediaSource.addEventListener(p0, p1);
        }

        @Override // defpackage.uf10
        public /* bridge */ /* synthetic */ boolean canUpdateMediaItem(fe10 fe10Var) {
            return false;
        }

        @Override // defpackage.uf10
        public xe10 createPeriod(sf10 p0, au1 p1, long p2) {
            return this.baseMediaSource.createPeriod(p0, p1, p2);
        }

        @Override // defpackage.uf10
        public void disable(tf10 p0) {
            this.baseMediaSource.disable(p0);
        }

        @Override // defpackage.uf10
        public void enable(tf10 p0) {
            this.baseMediaSource.enable(p0);
        }

        @Override // defpackage.uf10
        public /* bridge */ /* synthetic */ a9z0 getInitialTimeline() {
            return null;
        }

        @Override // defpackage.uf10
        public fe10 getMediaItem() {
            return this.baseMediaSource.getMediaItem();
        }

        @Override // defpackage.uf10
        public /* bridge */ /* synthetic */ boolean isSingleWindow() {
            return true;
        }

        @Override // defpackage.uf10
        public void maybeThrowSourceInfoRefreshError() {
            this.baseMediaSource.maybeThrowSourceInfoRefreshError();
        }

        @Override // defpackage.uf10
        public void prepareSource(tf10 caller, cj01 mediaTransferListener, vyc0 playerId) {
            DelegateMediaSourceCaller delegateMediaSourceCaller = new DelegateMediaSourceCaller(this, caller);
            this.baseMediaSource.prepareSource(delegateMediaSourceCaller, mediaTransferListener, playerId);
            this.mediaSourceCallers.put(caller, delegateMediaSourceCaller);
            this.netPerfManager.start$video_player_internalRelease();
        }

        @Override // defpackage.uf10
        public void releasePeriod(xe10 p0) {
            this.baseMediaSource.releasePeriod(p0);
        }

        @Override // defpackage.uf10
        public void releaseSource(tf10 caller) {
            uf10 uf10Var = this.baseMediaSource;
            tf10 remove = this.mediaSourceCallers.remove(caller);
            if (remove != null) {
                caller = remove;
            }
            uf10Var.releaseSource(caller);
            if (this.mediaSourceCallers.isEmpty()) {
                this.baseUrlsManagerProvider.release();
                this.netPerfManager.stop$video_player_internalRelease();
            }
        }

        @Override // defpackage.uf10
        public void removeDrmEventListener(nmm p0) {
            this.baseMediaSource.removeDrmEventListener(p0);
        }

        @Override // defpackage.uf10
        public void removeEventListener(yf10 p0) {
            this.baseMediaSource.removeEventListener(p0);
        }

        @Override // defpackage.uf10
        public /* bridge */ /* synthetic */ void updateMediaItem(fe10 fe10Var) {
        }

        @Override // defpackage.uf10
        @Deprecated
        public void prepareSource(tf10 tf10Var, cj01 cj01Var) {
            prepareSource(tf10Var, cj01Var, vyc0.d);
        }
    }
}
