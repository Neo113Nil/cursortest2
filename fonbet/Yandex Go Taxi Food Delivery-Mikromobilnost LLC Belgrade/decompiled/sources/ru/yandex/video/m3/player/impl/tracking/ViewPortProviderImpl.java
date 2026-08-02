package ru.yandex.video.m3.player.impl.tracking;

import defpackage.h5z0;
import defpackage.jl40;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateListener;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracking.FullscreenInfoListener;
import ru.yandex.video.m3.player.tracking.FullscreenInfoProvider;
import ru.yandex.video.m3.player.tracking.ViewPortChangeListener;
import ru.yandex.video.m3.player.tracking.ViewPortProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/ViewPortProviderImpl;", "Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateListener;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoListener;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "fullscreenInfoProvider", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/tracking/ViewPortChangeListener;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "isPip", "Lzy11;", "onChange", "(Z)V", "viewPortChangeListener", "addListener", "(Lru/yandex/video/m3/player/tracking/ViewPortChangeListener;)V", "removeListener", "Lru/yandex/video/m3/data/ViewPortState;", "getViewPortState", "()Lru/yandex/video/m3/data/ViewPortState;", "isInPictureInPictureMode", "onPictureInPictureStateChanged", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "fullscreenInfo", "onFullscreenInfoChanged", "(Lru/yandex/video/m3/player/tracking/FullscreenInfo;)V", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "lastViewPortState", "Lru/yandex/video/m3/data/ViewPortState;", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewPortProviderImpl implements ViewPortProvider, PictureInPictureStateListener, FullscreenInfoListener {
    public static final int $stable = 8;
    private final FullscreenInfoProvider fullscreenInfoProvider;
    private volatile boolean isInPictureInPictureMode;
    private volatile ViewPortState lastViewPortState;
    private final ObserverDispatcher<ViewPortChangeListener> observerDispatcher;

    public /* synthetic */ ViewPortProviderImpl(FullscreenInfoProvider fullscreenInfoProvider, ObserverDispatcher observerDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fullscreenInfoProvider, (i & 2) != 0 ? new ObserverDispatcher() : observerDispatcher);
    }

    private final synchronized void onChange(boolean isPip) {
        HashSet H0;
        Object failure;
        try {
            this.isInPictureInPictureMode = isPip;
            ViewPortState viewPortState = getViewPortState();
            if (viewPortState != this.lastViewPortState) {
                ObserverDispatcher<ViewPortChangeListener> observerDispatcher = this.observerDispatcher;
                synchronized (observerDispatcher.getObservers()) {
                    H0 = a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    try {
                        ((ViewPortChangeListener) it.next()).onViewPortChanged(viewPortState);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        h5z0.a.f(a, "notifyObservers", new Object[0]);
                    }
                }
                this.lastViewPortState = viewPortState;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void onChange$default(ViewPortProviderImpl viewPortProviderImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = viewPortProviderImpl.isInPictureInPictureMode;
        }
        viewPortProviderImpl.onChange(z);
    }

    @Override // ru.yandex.video.m3.player.tracking.ViewPortProvider
    public void addListener(ViewPortChangeListener viewPortChangeListener) {
        this.observerDispatcher.add((ObserverDispatcher<ViewPortChangeListener>) viewPortChangeListener);
    }

    @Override // ru.yandex.video.m3.player.tracking.ViewPortProvider
    public synchronized ViewPortState getViewPortState() {
        ViewPortState viewPortState;
        FullscreenInfo fullscreenInfo;
        FullscreenInfo fullscreenInfo2;
        try {
            if (this.isInPictureInPictureMode) {
                viewPortState = ViewPortState.PIP;
            } else {
                FullscreenInfoProvider fullscreenInfoProvider = this.fullscreenInfoProvider;
                boolean z = false;
                if (!((fullscreenInfoProvider == null || (fullscreenInfo2 = fullscreenInfoProvider.getFullscreenInfo()) == null) ? false : jl40.l(fullscreenInfo2.getIsFullscreenExternal(), Boolean.TRUE))) {
                    FullscreenInfoProvider fullscreenInfoProvider2 = this.fullscreenInfoProvider;
                    if (fullscreenInfoProvider2 != null && (fullscreenInfo = fullscreenInfoProvider2.getFullscreenInfo()) != null) {
                        z = jl40.l(fullscreenInfo.getIsFullscreenInternal(), Boolean.TRUE);
                    }
                    if (!z) {
                        viewPortState = ViewPortState.DEFAULT;
                    }
                }
                viewPortState = ViewPortState.FULLSCREEN;
            }
        } catch (Throwable th) {
            throw th;
        }
        return viewPortState;
    }

    @Override // ru.yandex.video.m3.player.tracking.FullscreenInfoListener
    public void onFullscreenInfoChanged(FullscreenInfo fullscreenInfo) {
        onChange$default(this, false, 1, null);
    }

    @Override // ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateListener
    public void onPictureInPictureStateChanged(boolean isInPictureInPictureMode) {
        onChange(isInPictureInPictureMode);
    }

    @Override // ru.yandex.video.m3.player.tracking.ViewPortProvider
    public void removeListener(ViewPortChangeListener viewPortChangeListener) {
        this.observerDispatcher.remove(viewPortChangeListener);
    }

    public ViewPortProviderImpl(FullscreenInfoProvider fullscreenInfoProvider, ObserverDispatcher<ViewPortChangeListener> observerDispatcher) {
        this.fullscreenInfoProvider = fullscreenInfoProvider;
        this.observerDispatcher = observerDispatcher;
        this.lastViewPortState = ViewPortState.DEFAULT;
    }
}
