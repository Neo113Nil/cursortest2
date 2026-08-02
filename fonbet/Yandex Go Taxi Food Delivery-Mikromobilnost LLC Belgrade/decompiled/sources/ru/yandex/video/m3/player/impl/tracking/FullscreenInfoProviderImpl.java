package ru.yandex.video.m3.player.impl.tracking;

import android.content.Context;
import android.util.DisplayMetrics;
import defpackage.h5z0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracking.FullscreenInfoKt;
import ru.yandex.video.m3.player.tracking.FullscreenInfoListener;
import ru.yandex.video.m3.player.tracking.FullscreenInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/FullscreenInfoProviderImpl;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoListener;", "observerDispatcher", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "surfaceHeight", "surfaceWidth", "", "isFullscreenInternal", "(II)Z", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "getFullscreenInfo", "()Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "fullscreenInfoListener", "Lzy11;", "addListener", "(Lru/yandex/video/m3/player/tracking/FullscreenInfoListener;)V", "removeListener", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "fullscreenDataBundle", "onFullscreenInfoUpdated", "(Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;)V", "Landroid/content/Context;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "fullscreenInfo", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullscreenInfoProviderImpl implements FullscreenInfoProvider {
    private static final double FULLSCREEN_THRESHOLD_VALUE = 0.9d;
    private final Context context;
    private FullscreenInfo fullscreenInfo;
    private final ObserverDispatcher<FullscreenInfoListener> observerDispatcher;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ FullscreenInfoProviderImpl(Context context, ObserverDispatcher observerDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ObserverDispatcher() : observerDispatcher);
    }

    private final boolean isFullscreenInternal(int surfaceHeight, int surfaceWidth) {
        if (this.context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        if (surfaceHeight == Integer.MAX_VALUE) {
            return false;
        }
        int i = surfaceHeight * surfaceWidth;
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        return ((double) i) / ((double) (displayMetrics.heightPixels * displayMetrics.widthPixels)) > FULLSCREEN_THRESHOLD_VALUE;
    }

    @Override // ru.yandex.video.m3.player.tracking.FullscreenInfoProvider
    public void addListener(FullscreenInfoListener fullscreenInfoListener) {
        this.observerDispatcher.add((ObserverDispatcher<FullscreenInfoListener>) fullscreenInfoListener);
    }

    @Override // ru.yandex.video.m3.player.tracking.FullscreenInfoProvider
    public FullscreenInfo getFullscreenInfo() {
        return this.fullscreenInfo;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onFullscreenInfoUpdated(FullscreenDataBundle fullscreenDataBundle) {
        HashSet H0;
        Object failure;
        this.fullscreenInfo = FullscreenInfoKt.FullscreenInfo$default(fullscreenDataBundle.getIsFullscreenExternal(), Boolean.valueOf(isFullscreenInternal(fullscreenDataBundle.getSurfaceHeight(), fullscreenDataBundle.getSurfaceWidth())), null, 4, null);
        ObserverDispatcher<FullscreenInfoListener> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((FullscreenInfoListener) it.next()).onFullscreenInfoChanged(this.fullscreenInfo);
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

    @Override // ru.yandex.video.m3.player.tracking.FullscreenInfoProvider
    public void removeListener(FullscreenInfoListener fullscreenInfoListener) {
        this.observerDispatcher.remove(fullscreenInfoListener);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/FullscreenInfoProviderImpl$Companion;", "", "()V", "FULLSCREEN_THRESHOLD_VALUE", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FullscreenInfoProviderImpl(Context context, ObserverDispatcher<FullscreenInfoListener> observerDispatcher) {
        this.context = context;
        this.observerDispatcher = observerDispatcher;
    }
}
