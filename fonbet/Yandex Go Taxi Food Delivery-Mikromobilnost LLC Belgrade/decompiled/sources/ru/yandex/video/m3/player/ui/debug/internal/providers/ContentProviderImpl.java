package ru.yandex.video.m3.player.ui.debug.internal.providers;

import defpackage.h5z0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "mapVideoType", "(Lru/yandex/video/m3/data/VideoType;)Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "Lru/yandex/video/m3/data/StreamType;", "streamType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "mapStreamType", "(Lru/yandex/video/m3/data/StreamType;)Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentProviderImpl implements ContentProvider {
    public static final int $stable = 8;
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.VOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StreamType.values().length];
            try {
                iArr2[StreamType.Dash.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StreamType.Hls.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ContentProviderImpl(ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    private final CurrentStreamType mapStreamType(StreamType streamType) {
        int i = streamType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[streamType.ordinal()];
        return i != 1 ? i != 2 ? CurrentStreamType.UNKNOWN : CurrentStreamType.HLS : CurrentStreamType.DASH;
    }

    private final CurrentVideoType mapVideoType(VideoType videoType) {
        int i = videoType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[videoType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? CurrentVideoType.UNKNOWN : CurrentVideoType.LIVE : CurrentVideoType.EVENT : CurrentVideoType.VOD;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.ContentProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        HashSet<YandexDebugInfoObserver> H0;
        Object failure;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        for (YandexDebugInfoObserver yandexDebugInfoObserver : H0) {
            try {
                String contentId = params.getContentId();
                if (contentId == null) {
                    contentId = "None";
                }
                yandexDebugInfoObserver.onContentIdInitialized(contentId);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.ContentProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onVideoAndStreamTypeInitialized(mapVideoType(videoType), mapStreamType(streamType));
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }
}
