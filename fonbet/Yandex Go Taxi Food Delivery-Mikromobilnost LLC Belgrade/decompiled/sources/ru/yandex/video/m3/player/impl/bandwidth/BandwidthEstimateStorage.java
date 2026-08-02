package ru.yandex.video.m3.player.impl.bandwidth;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "name", "", "getLongOrNull", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Long;", "network", "getBandwidthEstimate", "(Ljava/lang/String;)Ljava/lang/Long;", "estimate", "Lzy11;", "setBandwidthEstimate", "(Ljava/lang/String;J)V", "Landroid/content/SharedPreferences;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BandwidthEstimateStorage {
    private static final String BANDWIDTH_PREFS_NAME = "ru.yandex.video.player.impl.bandwidth.pref";
    private static volatile BandwidthEstimateStorage INSTANCE;
    private final SharedPreferences sharedPreferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private BandwidthEstimateStorage(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    private final Long getLongOrNull(SharedPreferences sharedPreferences, String str) {
        long j = sharedPreferences.getLong(str, -1L);
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final Long getBandwidthEstimate(String network) {
        return getLongOrNull(this.sharedPreferences, network);
    }

    public final void setBandwidthEstimate(String network, long estimate) {
        this.sharedPreferences.edit().putLong(network, estimate).apply();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage$Companion;", "", "()V", "BANDWIDTH_PREFS_NAME", "", "INSTANCE", "Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage;", "get", "context", "Landroid/content/Context;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BandwidthEstimateStorage get(Context context) {
            BandwidthEstimateStorage bandwidthEstimateStorage;
            BandwidthEstimateStorage bandwidthEstimateStorage2 = BandwidthEstimateStorage.INSTANCE;
            if (bandwidthEstimateStorage2 != null) {
                return bandwidthEstimateStorage2;
            }
            synchronized (this) {
                bandwidthEstimateStorage = BandwidthEstimateStorage.INSTANCE;
                if (bandwidthEstimateStorage == null) {
                    bandwidthEstimateStorage = new BandwidthEstimateStorage(context.getSharedPreferences(BandwidthEstimateStorage.BANDWIDTH_PREFS_NAME, 0), null);
                    BandwidthEstimateStorage.INSTANCE = bandwidthEstimateStorage;
                }
            }
            return bandwidthEstimateStorage;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BandwidthEstimateStorage(SharedPreferences sharedPreferences, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences);
    }
}
