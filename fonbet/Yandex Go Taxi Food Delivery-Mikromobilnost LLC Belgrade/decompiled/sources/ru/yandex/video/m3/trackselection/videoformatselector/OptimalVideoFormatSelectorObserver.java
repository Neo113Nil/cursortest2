package ru.yandex.video.m3.trackselection.videoformatselector;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorObserver;", "", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "optimalVideoFormatSelectorAnalyticsData", "", "vsid", "Lzy11;", "onSelectionFinished", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;Ljava/lang/String;)V", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", Constants.KEY_EXCEPTION, "onSelectionError", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OptimalVideoFormatSelectorObserver {
    void onSelectionError(OptimalVideoFormatSelectorException exception, String vsid);

    void onSelectionFinished(OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData, String vsid);
}
