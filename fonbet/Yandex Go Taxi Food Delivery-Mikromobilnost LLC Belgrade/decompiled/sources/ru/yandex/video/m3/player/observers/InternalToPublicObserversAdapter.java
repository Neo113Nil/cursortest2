package ru.yandex.video.m3.player.observers;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u0013J)\u00106\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/observers/InternalToPublicObserversAdapter;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerObserver;", "observers", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "analyticObservers", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lru/yandex/video/m3/data/Ad;", "ad", "Lzy11;", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "()V", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "onAdSkipAvailable", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "onEngineBufferingStart", "onEngineBufferingEnd", "onPausePlayback", "onResumePlayback", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "startPosition", "", "autoPlay", "onPreparedInternal", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;Z)V", "onPlayerReleased", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalToPublicObserversAdapter<H> implements InternalPlayerObserver {
    public static final int $stable = 8;
    private final ObserverDispatcher<PlayerAnalyticsObserver> analyticObservers;
    private final ObserverDispatcher<PlayerObserver<H>> observers;
    private final YandexPlayer<H> player;

    public InternalToPublicObserversAdapter(YandexPlayer<H> yandexPlayer, ObserverDispatcher<PlayerObserver<H>> observerDispatcher, ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher2) {
        this.player = yandexPlayer;
        this.observers = observerDispatcher;
        this.analyticObservers = observerDispatcher2;
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdConfigSet(AdConfig adConfig) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdConfigSet(adConfig);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdEnd() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdEnd();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdError(AdException exception) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdError(exception);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdListChanged(List<Ad> adList) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdListChanged(adList);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdMetadata(AdMetadata adMetadata) {
        HashSet H0;
        ObserverDispatcher<PlayerAnalyticsObserver> observerDispatcher = this.analyticObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerAnalyticsObserver) it.next()).onAdMetadata(adMetadata);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdPodEnd() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdPodEnd();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdPodStart(Ad ad, int index) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdPodStart(ad, index);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdSkipAvailable(Ad ad) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdSkipAvailable(ad);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdSkipped() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdSkipped();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdStart(Ad ad) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onAdStart(ad);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onEngineBufferingEnd() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onEngineBufferingEnd();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onEngineBufferingStart() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onEngineBufferingStart();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPausePlayback() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onPausePlayback();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPlayerReleased() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onPlayerReleased();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPreparedInternal(VideoData videoData, Long startPosition, boolean autoPlay) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onEnginePrepared(videoData);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPreparingWithAdConfig(AdConfig adConfig) {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onPreparingWithAdConfig(adConfig);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onResumePlayback() {
        HashSet H0;
        ObserverDispatcher<PlayerObserver<H>> observerDispatcher = this.observers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((PlayerObserver) it.next()).onResumePlayback();
        }
    }
}
