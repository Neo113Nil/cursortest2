package ru.yandex.video.m3.player.impl.source.dash.manifest;

import android.net.Uri;
import defpackage.egg;
import defpackage.kvq0;
import defpackage.kw21;
import defpackage.lhf0;
import defpackage.pxa0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0087\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/manifest/YandexDashManifest;", "Legg;", "", "availabilityStartTimeMs", "durationMs", "minBufferTimeMs", "", "dynamic", "minUpdatePeriodMs", "timeShiftBufferDepthMs", "suggestedPresentationDelayMs", "publishTimeMs", "Llhf0;", "programInformation", "Lkw21;", "utcTiming", "Lkvq0;", "serviceDescription", "Landroid/net/Uri;", "location", "", "Lpxa0;", "periods", "totalAvailabilityOffsetMs", "", "manifestUrl", "<init>", "(JJJZJJJJLlhf0;Lkw21;Lkvq0;Landroid/net/Uri;Ljava/util/List;JLjava/lang/String;)V", "(JJJZJJJJLlhf0;Lkw21;Lkvq0;Landroid/net/Uri;Ljava/util/List;J)V", "J", "getTotalAvailabilityOffsetMs", "()J", "Ljava/lang/String;", "getManifestUrl", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexDashManifest extends egg {
    public static final int $stable = 0;
    private final String manifestUrl;
    private final long totalAvailabilityOffsetMs;

    public YandexDashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List<? extends pxa0> list, long j8) {
        this(j, j2, j3, z, j4, j5, j6, j7, lhf0Var, kw21Var, kvq0Var, uri, list, j8, "");
    }

    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    public final long getTotalAvailabilityOffsetMs() {
        return this.totalAvailabilityOffsetMs;
    }

    public YandexDashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List<? extends pxa0> list, long j8, String str) {
        super(j, j2, j3, z, j4, j5, j6, j7, lhf0Var, kw21Var, kvq0Var, uri, list);
        this.totalAvailabilityOffsetMs = j8;
        this.manifestUrl = str;
    }
}
