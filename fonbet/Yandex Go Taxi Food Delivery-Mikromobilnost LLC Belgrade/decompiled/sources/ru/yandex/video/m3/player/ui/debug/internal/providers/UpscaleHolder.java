package ru.yandex.video.m3.player.ui.debug.internal.providers;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.tracking.WatchedTimeProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/UpscaleHolder;", "", "", "quality", "capping", "surface", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;", "watchedTimeProvider", "<init>", "(IIILru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;)V", "getUpscale", "()I", "Lzy11;", "updateUpscaleHistory", "()V", "updateQuality", "(I)V", "updateCapping", "surfaceHeight", "updateSurface", "", "getAverageUpscale", "()D", "getMaxUpscale", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;", "", "lastUpscaleTimestamp", "J", "", "upscaleHistory", "Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpscaleHolder {
    public static final int $stable = 8;
    private int capping;
    private long lastUpscaleTimestamp;
    private int quality;
    private int surface;
    private final Map<Long, Double> upscaleHistory;
    private final WatchedTimeProvider watchedTimeProvider;

    public /* synthetic */ UpscaleHolder(int i, int i2, int i3, WatchedTimeProvider watchedTimeProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, watchedTimeProvider);
    }

    private final int getUpscale() {
        return Math.min(this.quality, Math.min(this.capping, this.surface));
    }

    private final void updateUpscaleHistory() {
        int upscale = getUpscale();
        int i = this.quality;
        if (i == -1 || upscale <= i) {
            return;
        }
        this.upscaleHistory.put(Long.valueOf(this.watchedTimeProvider.getWatchedTime() - this.lastUpscaleTimestamp), Double.valueOf((upscale - r3) / this.quality));
        this.lastUpscaleTimestamp = this.watchedTimeProvider.getWatchedTime();
    }

    public final double getAverageUpscale() {
        Iterator<T> it = this.upscaleHistory.entrySet().iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            d += ((Number) entry.getKey()).doubleValue() * ((Number) entry.getValue()).doubleValue();
        }
        return d / this.watchedTimeProvider.getWatchedTime();
    }

    public final double getMaxUpscale() {
        Double d0 = a.d0(this.upscaleHistory.values());
        if (d0 != null) {
            return d0.doubleValue();
        }
        return 0.0d;
    }

    public final void updateCapping(int capping) {
        this.capping = capping;
        updateUpscaleHistory();
    }

    public final void updateQuality(int quality) {
        this.quality = quality;
        updateUpscaleHistory();
    }

    public final void updateSurface(int surfaceHeight) {
        this.surface = surfaceHeight;
        updateUpscaleHistory();
    }

    public UpscaleHolder(int i, int i2, int i3, WatchedTimeProvider watchedTimeProvider) {
        this.quality = i;
        this.capping = i2;
        this.surface = i3;
        this.watchedTimeProvider = watchedTimeProvider;
        this.upscaleHistory = new LinkedHashMap();
    }
}
