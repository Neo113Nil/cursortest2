package ru.yandex.video.m3.player.impl.listeners;

import defpackage.h5z0;
import defpackage.hp4;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalBandwidthMeterEventListener;", "Lhp4;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "elapsedMs", "", "bytesTransferred", "bitrateEstimate", "Lzy11;", "onBandwidthSample", "(IJJ)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalBandwidthMeterEventListener implements hp4 {
    public static final int $stable = 8;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;

    public InternalBandwidthMeterEventListener(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        this.dispatcher = observerDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[SYNTHETIC] */
    @Override // defpackage.hp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        HashSet H0;
        HashSet H02;
        int i;
        long j;
        long j2;
        Object failure;
        Throwable a;
        Object failure2;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onBandwidthEstimation(bitrateEstimate);
                failure2 = zy11.a;
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                i = elapsedMs;
                j = bytesTransferred;
                j2 = bitrateEstimate;
                try {
                    ((PlayerDelegate.Observer) it2.next()).onBandwidthSample(i, j, j2);
                    failure = zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    failure = new Result.Failure(th);
                    a = Result.a(failure);
                    if (a == null) {
                    }
                    elapsedMs = i;
                    bytesTransferred = j;
                    bitrateEstimate = j2;
                }
            } catch (Throwable th3) {
                th = th3;
                i = elapsedMs;
                j = bytesTransferred;
                j2 = bitrateEstimate;
            }
            a = Result.a(failure);
            if (a == null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
            elapsedMs = i;
            bytesTransferred = j;
            bitrateEstimate = j2;
        }
    }
}
