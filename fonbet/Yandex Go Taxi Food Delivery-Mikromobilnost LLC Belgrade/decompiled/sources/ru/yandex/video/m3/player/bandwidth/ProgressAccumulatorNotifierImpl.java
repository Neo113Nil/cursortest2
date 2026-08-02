package ru.yandex.video.m3.player.bandwidth;

import defpackage.ep4;
import defpackage.phs0;
import defpackage.qwq;
import defpackage.sls;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.videoplayer.multiplatform.fetcher.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0012\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0013J(\u0010\u0016\u001a\u00020\u000b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\"\u0010\u0017\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0011H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\"\u0010\u0018\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0010j\u0002`\u0014H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifierImpl;", "Lru/yandex/video/m3/player/bandwidth/ProgressAccumulatorNotifier;", "Lqwq;", "Lru/yandex/videoplayer/multiplatform/fetcher/a;", "progressAccumulator", "Lphs0;", "singleListenerFetcher", "<init>", "(Lru/yandex/videoplayer/multiplatform/fetcher/a;Lphs0;)V", "Lkotlin/Function1;", "Lep4;", "Lzy11;", "Lru/yandex/videoplayer/multiplatform/fetcher/FetcherProgressListener;", "listener", "addProgressListener", "(Ltls;)V", "Lkotlin/Function0;", "Lru/yandex/videoplayer/multiplatform/fetcher/FetcherResponseEndListener;", "addResponseEndListener", "(Lsls;)V", "Lru/yandex/videoplayer/multiplatform/fetcher/FetcherResponseStartListener;", "addResponseStartListener", "removeProgressListener", "removeResponseEndListener", "removeResponseStartListener", "responseStart", "()V", "bandwidthInfo", "responseProgress", "(Lep4;)V", "responseEnd", "process", "Lru/yandex/videoplayer/multiplatform/fetcher/a;", "Lphs0;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressAccumulatorNotifierImpl implements ProgressAccumulatorNotifier, qwq {
    public static final int $stable = 8;
    private final a progressAccumulator;
    private final phs0 singleListenerFetcher;

    public /* synthetic */ ProgressAccumulatorNotifierImpl(a aVar, phs0 phs0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new phs0() : phs0Var);
    }

    public void addProgressListener(tls listener) {
        this.singleListenerFetcher.a(listener);
    }

    public void addResponseEndListener(sls listener) {
        this.singleListenerFetcher.b(listener);
    }

    public void addResponseStartListener(sls listener) {
        this.singleListenerFetcher.c(listener);
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void process() {
        this.progressAccumulator.b();
    }

    public void removeProgressListener(tls listener) {
        this.singleListenerFetcher.c = null;
    }

    public void removeResponseEndListener(sls listener) {
        this.singleListenerFetcher.b = null;
    }

    public void removeResponseStartListener(sls listener) {
        this.singleListenerFetcher.a = null;
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseEnd() {
        sls slsVar = this.singleListenerFetcher.b;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseProgress(ep4 bandwidthInfo) {
        tls tlsVar = this.singleListenerFetcher.c;
        if (tlsVar != null) {
            tlsVar.invoke(bandwidthInfo);
        }
    }

    @Override // ru.yandex.video.m3.player.bandwidth.ProgressAccumulatorNotifier
    public void responseStart() {
        sls slsVar = this.singleListenerFetcher.a;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public ProgressAccumulatorNotifierImpl(a aVar, phs0 phs0Var) {
        this.progressAccumulator = aVar;
        this.singleListenerFetcher = phs0Var;
    }
}
