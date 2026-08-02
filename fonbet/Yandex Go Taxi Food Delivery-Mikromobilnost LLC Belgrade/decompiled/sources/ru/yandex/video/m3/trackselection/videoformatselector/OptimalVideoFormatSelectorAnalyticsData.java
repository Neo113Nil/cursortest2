package ru.yandex.video.m3.trackselection.videoformatselector;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.ysq0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u00064"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "", "bandwidth", "", "cappingWidth", "", "cappingHeight", "surfaceWidth", "surfaceHeight", "serviceQuality", "userQuality", "preferHd", "", "whiteListFormatExtensions", "", "", "input", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadataAnalytics;", "output", "(JIIIIIIZLjava/util/List;Ljava/util/List;Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadataAnalytics;)V", "getBandwidth", "()J", "getCappingHeight", "()I", "getCappingWidth", "getInput", "()Ljava/util/List;", "getOutput", "()Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadataAnalytics;", "getPreferHd", "()Z", "getServiceQuality", "getSurfaceHeight", "getSurfaceWidth", "getUserQuality", "getWhiteListFormatExtensions", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OptimalVideoFormatSelectorAnalyticsData {
    public static final int $stable = 8;

    @ysq0("bandwidth")
    private final long bandwidth;

    @ysq0("cappingHeight")
    private final int cappingHeight;

    @ysq0("cappingWidth")
    private final int cappingWidth;

    @ysq0("input")
    private final List<VideoMetadataAnalytics> input;

    @ysq0("output")
    private final VideoMetadataAnalytics output;

    @ysq0("preferHd")
    private final boolean preferHd;

    @ysq0("serviceQuality")
    private final int serviceQuality;

    @ysq0("surfaceHeight")
    private final int surfaceHeight;

    @ysq0("surfaceWidth")
    private final int surfaceWidth;

    @ysq0("userQuality")
    private final int userQuality;

    @ysq0("whiteListFormatExtensions")
    private final List<String> whiteListFormatExtensions;

    public OptimalVideoFormatSelectorAnalyticsData(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, List<String> list, List<VideoMetadataAnalytics> list2, VideoMetadataAnalytics videoMetadataAnalytics) {
        this.bandwidth = j;
        this.cappingWidth = i;
        this.cappingHeight = i2;
        this.surfaceWidth = i3;
        this.surfaceHeight = i4;
        this.serviceQuality = i5;
        this.userQuality = i6;
        this.preferHd = z;
        this.whiteListFormatExtensions = list;
        this.input = list2;
        this.output = videoMetadataAnalytics;
    }

    public static /* synthetic */ OptimalVideoFormatSelectorAnalyticsData copy$default(OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData, long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, List list, List list2, VideoMetadataAnalytics videoMetadataAnalytics, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = optimalVideoFormatSelectorAnalyticsData.bandwidth;
        }
        return optimalVideoFormatSelectorAnalyticsData.copy(j, (i7 & 2) != 0 ? optimalVideoFormatSelectorAnalyticsData.cappingWidth : i, (i7 & 4) != 0 ? optimalVideoFormatSelectorAnalyticsData.cappingHeight : i2, (i7 & 8) != 0 ? optimalVideoFormatSelectorAnalyticsData.surfaceWidth : i3, (i7 & 16) != 0 ? optimalVideoFormatSelectorAnalyticsData.surfaceHeight : i4, (i7 & 32) != 0 ? optimalVideoFormatSelectorAnalyticsData.serviceQuality : i5, (i7 & 64) != 0 ? optimalVideoFormatSelectorAnalyticsData.userQuality : i6, (i7 & 128) != 0 ? optimalVideoFormatSelectorAnalyticsData.preferHd : z, (i7 & 256) != 0 ? optimalVideoFormatSelectorAnalyticsData.whiteListFormatExtensions : list, (i7 & 512) != 0 ? optimalVideoFormatSelectorAnalyticsData.input : list2, (i7 & 1024) != 0 ? optimalVideoFormatSelectorAnalyticsData.output : videoMetadataAnalytics);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBandwidth() {
        return this.bandwidth;
    }

    public final List<VideoMetadataAnalytics> component10() {
        return this.input;
    }

    /* renamed from: component11, reason: from getter */
    public final VideoMetadataAnalytics getOutput() {
        return this.output;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCappingWidth() {
        return this.cappingWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCappingHeight() {
        return this.cappingHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final int getServiceQuality() {
        return this.serviceQuality;
    }

    /* renamed from: component7, reason: from getter */
    public final int getUserQuality() {
        return this.userQuality;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPreferHd() {
        return this.preferHd;
    }

    public final List<String> component9() {
        return this.whiteListFormatExtensions;
    }

    public final OptimalVideoFormatSelectorAnalyticsData copy(long bandwidth, int cappingWidth, int cappingHeight, int surfaceWidth, int surfaceHeight, int serviceQuality, int userQuality, boolean preferHd, List<String> whiteListFormatExtensions, List<VideoMetadataAnalytics> input, VideoMetadataAnalytics output) {
        return new OptimalVideoFormatSelectorAnalyticsData(bandwidth, cappingWidth, cappingHeight, surfaceWidth, surfaceHeight, serviceQuality, userQuality, preferHd, whiteListFormatExtensions, input, output);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimalVideoFormatSelectorAnalyticsData)) {
            return false;
        }
        OptimalVideoFormatSelectorAnalyticsData optimalVideoFormatSelectorAnalyticsData = (OptimalVideoFormatSelectorAnalyticsData) other;
        return this.bandwidth == optimalVideoFormatSelectorAnalyticsData.bandwidth && this.cappingWidth == optimalVideoFormatSelectorAnalyticsData.cappingWidth && this.cappingHeight == optimalVideoFormatSelectorAnalyticsData.cappingHeight && this.surfaceWidth == optimalVideoFormatSelectorAnalyticsData.surfaceWidth && this.surfaceHeight == optimalVideoFormatSelectorAnalyticsData.surfaceHeight && this.serviceQuality == optimalVideoFormatSelectorAnalyticsData.serviceQuality && this.userQuality == optimalVideoFormatSelectorAnalyticsData.userQuality && this.preferHd == optimalVideoFormatSelectorAnalyticsData.preferHd && jl40.l(this.whiteListFormatExtensions, optimalVideoFormatSelectorAnalyticsData.whiteListFormatExtensions) && jl40.l(this.input, optimalVideoFormatSelectorAnalyticsData.input) && jl40.l(this.output, optimalVideoFormatSelectorAnalyticsData.output);
    }

    public final long getBandwidth() {
        return this.bandwidth;
    }

    public final int getCappingHeight() {
        return this.cappingHeight;
    }

    public final int getCappingWidth() {
        return this.cappingWidth;
    }

    public final List<VideoMetadataAnalytics> getInput() {
        return this.input;
    }

    public final VideoMetadataAnalytics getOutput() {
        return this.output;
    }

    public final boolean getPreferHd() {
        return this.preferHd;
    }

    public final int getServiceQuality() {
        return this.serviceQuality;
    }

    public final int getSurfaceHeight() {
        return this.surfaceHeight;
    }

    public final int getSurfaceWidth() {
        return this.surfaceWidth;
    }

    public final int getUserQuality() {
        return this.userQuality;
    }

    public final List<String> getWhiteListFormatExtensions() {
        return this.whiteListFormatExtensions;
    }

    public int hashCode() {
        return this.output.hashCode() + unr0.c(unr0.c(unr0.e(oyr.b(this.userQuality, oyr.b(this.serviceQuality, oyr.b(this.surfaceHeight, oyr.b(this.surfaceWidth, oyr.b(this.cappingHeight, oyr.b(this.cappingWidth, Long.hashCode(this.bandwidth) * 31, 31), 31), 31), 31), 31), 31), 31, this.preferHd), 31, this.whiteListFormatExtensions), 31, this.input);
    }

    public String toString() {
        return "OptimalVideoFormatSelectorAnalyticsData(bandwidth=" + this.bandwidth + ", cappingWidth=" + this.cappingWidth + ", cappingHeight=" + this.cappingHeight + ", surfaceWidth=" + this.surfaceWidth + ", surfaceHeight=" + this.surfaceHeight + ", serviceQuality=" + this.serviceQuality + ", userQuality=" + this.userQuality + ", preferHd=" + this.preferHd + ", whiteListFormatExtensions=" + this.whiteListFormatExtensions + ", input=" + this.input + ", output=" + this.output + ')';
    }
}
