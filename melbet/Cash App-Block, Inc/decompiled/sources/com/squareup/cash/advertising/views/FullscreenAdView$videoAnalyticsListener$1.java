package com.squareup.cash.advertising.views;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class FullscreenAdView$videoAnalyticsListener$1 implements AnalyticsListener {
    public String fallbackImageUrl;
    public final /* synthetic */ FullscreenAdView this$0;

    public FullscreenAdView$videoAnalyticsListener$1(FullscreenAdView fullscreenAdView) {
        this.this$0 = fullscreenAdView;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        if (z) {
            FullscreenAdView fullscreenAdView = this.this$0;
            fullscreenAdView.progress.setVisibility(8);
            fullscreenAdView.imageView.setVisibility(8);
            fullscreenAdView.videoView.setVisibility(0);
            fullscreenAdView.updateWindowFlags(false);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException) {
        iOException.getClass();
        FullscreenAdView.loadFallbackImage$default(this.this$0, this.fallbackImageUrl);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        playbackException.getClass();
        FullscreenAdView.loadFallbackImage$default(this.this$0, this.fallbackImageUrl);
    }
}
