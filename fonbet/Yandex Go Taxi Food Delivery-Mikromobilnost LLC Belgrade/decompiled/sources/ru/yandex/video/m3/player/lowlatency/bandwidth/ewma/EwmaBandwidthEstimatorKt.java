package ru.yandex.video.m3.player.lowlatency.bandwidth.ewma;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"MIN_SAMPLE_BYTES", "", "MIN_SAMPLE_BYTES_LOW_LATENCY", "MIN_TOTAL_BYTES", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EwmaBandwidthEstimatorKt {
    private static final double MIN_SAMPLE_BYTES = 16000.0d;
    private static final double MIN_SAMPLE_BYTES_LOW_LATENCY = 2000.0d;
    private static final double MIN_TOTAL_BYTES = 128000.0d;
}
