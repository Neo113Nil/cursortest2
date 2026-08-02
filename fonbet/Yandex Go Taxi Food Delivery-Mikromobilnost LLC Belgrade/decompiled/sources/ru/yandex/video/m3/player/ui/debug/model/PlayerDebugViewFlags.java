package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001:\u0001RBù\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020\u00002\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b7\u00104R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b8\u00104R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b9\u00104R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b:\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b;\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b<\u00104R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b=\u00104R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b>\u00104R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b?\u00104R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\bA\u00104R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\bB\u00104R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bC\u00104R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bD\u00104R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\bE\u00104R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\bF\u00104R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bG\u00104R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\bH\u00104R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\bI\u00104R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bJ\u00104R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bK\u00104R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bL\u00104R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bM\u00104R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\bN\u00104R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bO\u00104R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bP\u00104R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bQ\u00104¨\u0006S"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "", "", "showVsid", "showVsidLabel", "showDrm", "showDrmLabel", "showVideoTrack", "showVideoTrackLabel", "showAudioTrack", "showAudioTrackLabel", "showSubtitlesTrack", "showSubtitlesTrackLabel", "showViewportSize", "showViewportSizeLabel", "showVideoDecoder", "showVideoDecoderLabel", "showAudioDecoder", "showAudioDecoderLabel", "showVideoDecoderInitsReusesReleases", "showBandwidthEstimation", "showBandwidthEstimationLabel", "showBufferSize", "showBufferSizeLabel", "showBytesLoaded", "showBytesLoadedLabel", "showLatency", "showLatencyLabel", "showExtraInfo", "showExtraInfoLabel", "showLastError", "showLastErrorLabel", "showQrCode", "<init>", "(ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowVsid", "()Z", "getShowVsidLabel", "getShowDrm", "getShowDrmLabel", "getShowVideoTrack", "getShowVideoTrackLabel", "getShowAudioTrack", "getShowAudioTrackLabel", "getShowSubtitlesTrack", "getShowSubtitlesTrackLabel", "getShowViewportSize", "getShowViewportSizeLabel", "getShowVideoDecoder", "getShowVideoDecoderLabel", "getShowAudioDecoder", "getShowAudioDecoderLabel", "getShowVideoDecoderInitsReusesReleases", "getShowBandwidthEstimation", "getShowBandwidthEstimationLabel", "getShowBufferSize", "getShowBufferSizeLabel", "getShowBytesLoaded", "getShowBytesLoadedLabel", "getShowLatency", "getShowLatencyLabel", "getShowExtraInfo", "getShowExtraInfoLabel", "getShowLastError", "getShowLastErrorLabel", "getShowQrCode", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDebugViewFlags {
    public static final int $stable = 0;
    private final boolean showAudioDecoder;
    private final boolean showAudioDecoderLabel;
    private final boolean showAudioTrack;
    private final boolean showAudioTrackLabel;
    private final boolean showBandwidthEstimation;
    private final boolean showBandwidthEstimationLabel;
    private final boolean showBufferSize;
    private final boolean showBufferSizeLabel;
    private final boolean showBytesLoaded;
    private final boolean showBytesLoadedLabel;
    private final boolean showDrm;
    private final boolean showDrmLabel;
    private final boolean showExtraInfo;
    private final boolean showExtraInfoLabel;
    private final boolean showLastError;
    private final boolean showLastErrorLabel;
    private final boolean showLatency;
    private final boolean showLatencyLabel;
    private final boolean showQrCode;
    private final boolean showSubtitlesTrack;
    private final boolean showSubtitlesTrackLabel;
    private final boolean showVideoDecoder;
    private final boolean showVideoDecoderInitsReusesReleases;
    private final boolean showVideoDecoderLabel;
    private final boolean showVideoTrack;
    private final boolean showVideoTrackLabel;
    private final boolean showViewportSize;
    private final boolean showViewportSizeLabel;
    private final boolean showVsid;
    private final boolean showVsidLabel;

    private PlayerDebugViewFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30) {
        this.showVsid = z;
        this.showVsidLabel = z2;
        this.showDrm = z3;
        this.showDrmLabel = z4;
        this.showVideoTrack = z5;
        this.showVideoTrackLabel = z6;
        this.showAudioTrack = z7;
        this.showAudioTrackLabel = z8;
        this.showSubtitlesTrack = z9;
        this.showSubtitlesTrackLabel = z10;
        this.showViewportSize = z11;
        this.showViewportSizeLabel = z12;
        this.showVideoDecoder = z13;
        this.showVideoDecoderLabel = z14;
        this.showAudioDecoder = z15;
        this.showAudioDecoderLabel = z16;
        this.showVideoDecoderInitsReusesReleases = z17;
        this.showBandwidthEstimation = z18;
        this.showBandwidthEstimationLabel = z19;
        this.showBufferSize = z20;
        this.showBufferSizeLabel = z21;
        this.showBytesLoaded = z22;
        this.showBytesLoadedLabel = z23;
        this.showLatency = z24;
        this.showLatencyLabel = z25;
        this.showExtraInfo = z26;
        this.showExtraInfoLabel = z27;
        this.showLastError = z28;
        this.showLastErrorLabel = z29;
        this.showQrCode = z30;
    }

    public static /* synthetic */ PlayerDebugViewFlags copy$default(PlayerDebugViewFlags playerDebugViewFlags, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerDebugViewFlags.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerDebugViewFlags.Builder builder) {
                }
            };
        }
        return playerDebugViewFlags.copy(tlsVar);
    }

    public final PlayerDebugViewFlags copy(tls builderAction) {
        Builder builder = new Builder();
        builder.m893setShowVsid(Boolean.valueOf(this.showVsid));
        builder.m894setShowVsidLabel(Boolean.valueOf(this.showVsidLabel));
        builder.m875setShowDrm(Boolean.valueOf(this.showDrm));
        builder.m876setShowDrmLabel(Boolean.valueOf(this.showDrmLabel));
        builder.m889setShowVideoTrack(Boolean.valueOf(this.showVideoTrack));
        builder.m890setShowVideoTrackLabel(Boolean.valueOf(this.showVideoTrackLabel));
        builder.m867setShowAudioTrack(Boolean.valueOf(this.showAudioTrack));
        builder.m868setShowAudioTrackLabel(Boolean.valueOf(this.showAudioTrackLabel));
        builder.m884setShowSubtitlesTrack(Boolean.valueOf(this.showSubtitlesTrack));
        builder.m885setShowSubtitlesTrackLabel(Boolean.valueOf(this.showSubtitlesTrackLabel));
        builder.m891setShowViewportSize(Boolean.valueOf(this.showViewportSize));
        builder.m892setShowViewportSizeLabel(Boolean.valueOf(this.showViewportSizeLabel));
        builder.m886setShowVideoDecoder(Boolean.valueOf(this.showVideoDecoder));
        builder.m888setShowVideoDecoderLabel(Boolean.valueOf(this.showVideoDecoderLabel));
        builder.m865setShowAudioDecoder(Boolean.valueOf(this.showAudioDecoder));
        builder.m866setShowAudioDecoderLabel(Boolean.valueOf(this.showAudioDecoderLabel));
        builder.m887setShowVideoDecoderInitsReusesReleases(Boolean.valueOf(this.showVideoDecoderInitsReusesReleases));
        builder.m869setShowBandwidthEstimation(Boolean.valueOf(this.showBandwidthEstimation));
        builder.m870setShowBandwidthEstimationLabel(Boolean.valueOf(this.showBandwidthEstimationLabel));
        builder.m871setShowBufferSize(Boolean.valueOf(this.showBufferSize));
        builder.m872setShowBufferSizeLabel(Boolean.valueOf(this.showBufferSizeLabel));
        builder.m873setShowBytesLoaded(Boolean.valueOf(this.showBytesLoaded));
        builder.m874setShowBytesLoadedLabel(Boolean.valueOf(this.showBytesLoadedLabel));
        builder.m881setShowLatency(Boolean.valueOf(this.showLatency));
        builder.m882setShowLatencyLabel(Boolean.valueOf(this.showLatencyLabel));
        builder.m877setShowExtraInfo(Boolean.valueOf(this.showExtraInfo));
        builder.m878setShowExtraInfoLabel(Boolean.valueOf(this.showExtraInfoLabel));
        builder.m879setShowLastError(Boolean.valueOf(this.showLastError));
        builder.m880setShowLastErrorLabel(Boolean.valueOf(this.showLastErrorLabel));
        builder.m883setShowQrCode(Boolean.valueOf(this.showQrCode));
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlayerDebugViewFlags.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlayerDebugViewFlags playerDebugViewFlags = (PlayerDebugViewFlags) other;
        return this.showVsid == playerDebugViewFlags.showVsid && this.showVsidLabel == playerDebugViewFlags.showVsidLabel && this.showDrm == playerDebugViewFlags.showDrm && this.showDrmLabel == playerDebugViewFlags.showDrmLabel && this.showVideoTrack == playerDebugViewFlags.showVideoTrack && this.showVideoTrackLabel == playerDebugViewFlags.showVideoTrackLabel && this.showAudioTrack == playerDebugViewFlags.showAudioTrack && this.showAudioTrackLabel == playerDebugViewFlags.showAudioTrackLabel && this.showSubtitlesTrack == playerDebugViewFlags.showSubtitlesTrack && this.showSubtitlesTrackLabel == playerDebugViewFlags.showSubtitlesTrackLabel && this.showViewportSize == playerDebugViewFlags.showViewportSize && this.showViewportSizeLabel == playerDebugViewFlags.showViewportSizeLabel && this.showVideoDecoder == playerDebugViewFlags.showVideoDecoder && this.showVideoDecoderLabel == playerDebugViewFlags.showVideoDecoderLabel && this.showAudioDecoder == playerDebugViewFlags.showAudioDecoder && this.showAudioDecoderLabel == playerDebugViewFlags.showAudioDecoderLabel && this.showVideoDecoderInitsReusesReleases == playerDebugViewFlags.showVideoDecoderInitsReusesReleases && this.showBandwidthEstimation == playerDebugViewFlags.showBandwidthEstimation && this.showBandwidthEstimationLabel == playerDebugViewFlags.showBandwidthEstimationLabel && this.showBufferSize == playerDebugViewFlags.showBufferSize && this.showBufferSizeLabel == playerDebugViewFlags.showBufferSizeLabel && this.showBytesLoaded == playerDebugViewFlags.showBytesLoaded && this.showBytesLoadedLabel == playerDebugViewFlags.showBytesLoadedLabel && this.showLatency == playerDebugViewFlags.showLatency && this.showLatencyLabel == playerDebugViewFlags.showLatencyLabel && this.showExtraInfo == playerDebugViewFlags.showExtraInfo && this.showExtraInfoLabel == playerDebugViewFlags.showExtraInfoLabel && this.showLastError == playerDebugViewFlags.showLastError && this.showLastErrorLabel == playerDebugViewFlags.showLastErrorLabel && this.showQrCode == playerDebugViewFlags.showQrCode;
    }

    public final boolean getShowAudioDecoder() {
        return this.showAudioDecoder;
    }

    public final boolean getShowAudioDecoderLabel() {
        return this.showAudioDecoderLabel;
    }

    public final boolean getShowAudioTrack() {
        return this.showAudioTrack;
    }

    public final boolean getShowAudioTrackLabel() {
        return this.showAudioTrackLabel;
    }

    public final boolean getShowBandwidthEstimation() {
        return this.showBandwidthEstimation;
    }

    public final boolean getShowBandwidthEstimationLabel() {
        return this.showBandwidthEstimationLabel;
    }

    public final boolean getShowBufferSize() {
        return this.showBufferSize;
    }

    public final boolean getShowBufferSizeLabel() {
        return this.showBufferSizeLabel;
    }

    public final boolean getShowBytesLoaded() {
        return this.showBytesLoaded;
    }

    public final boolean getShowBytesLoadedLabel() {
        return this.showBytesLoadedLabel;
    }

    public final boolean getShowDrm() {
        return this.showDrm;
    }

    public final boolean getShowDrmLabel() {
        return this.showDrmLabel;
    }

    public final boolean getShowExtraInfo() {
        return this.showExtraInfo;
    }

    public final boolean getShowExtraInfoLabel() {
        return this.showExtraInfoLabel;
    }

    public final boolean getShowLastError() {
        return this.showLastError;
    }

    public final boolean getShowLastErrorLabel() {
        return this.showLastErrorLabel;
    }

    public final boolean getShowLatency() {
        return this.showLatency;
    }

    public final boolean getShowLatencyLabel() {
        return this.showLatencyLabel;
    }

    public final boolean getShowQrCode() {
        return this.showQrCode;
    }

    public final boolean getShowSubtitlesTrack() {
        return this.showSubtitlesTrack;
    }

    public final boolean getShowSubtitlesTrackLabel() {
        return this.showSubtitlesTrackLabel;
    }

    public final boolean getShowVideoDecoder() {
        return this.showVideoDecoder;
    }

    public final boolean getShowVideoDecoderInitsReusesReleases() {
        return this.showVideoDecoderInitsReusesReleases;
    }

    public final boolean getShowVideoDecoderLabel() {
        return this.showVideoDecoderLabel;
    }

    public final boolean getShowVideoTrack() {
        return this.showVideoTrack;
    }

    public final boolean getShowVideoTrackLabel() {
        return this.showVideoTrackLabel;
    }

    public final boolean getShowViewportSize() {
        return this.showViewportSize;
    }

    public final boolean getShowViewportSizeLabel() {
        return this.showViewportSizeLabel;
    }

    public final boolean getShowVsid() {
        return this.showVsid;
    }

    public final boolean getShowVsidLabel() {
        return this.showVsidLabel;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showQrCode) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.showVsid) * 31, 31, this.showVsidLabel), 31, this.showDrm), 31, this.showDrmLabel), 31, this.showVideoTrack), 31, this.showVideoTrackLabel), 31, this.showAudioTrack), 31, this.showAudioTrackLabel), 31, this.showSubtitlesTrack), 31, this.showSubtitlesTrackLabel), 31, this.showViewportSize), 31, this.showViewportSizeLabel), 31, this.showVideoDecoder), 31, this.showVideoDecoderLabel), 31, this.showAudioDecoder), 31, this.showAudioDecoderLabel), 31, this.showVideoDecoderInitsReusesReleases), 31, this.showBandwidthEstimation), 31, this.showBandwidthEstimationLabel), 31, this.showBufferSize), 31, this.showBufferSizeLabel), 31, this.showBytesLoaded), 31, this.showBytesLoadedLabel), 31, this.showLatency), 31, this.showLatencyLabel), 31, this.showExtraInfo), 31, this.showExtraInfoLabel), 31, this.showLastError), 31, this.showLastErrorLabel);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerDebugViewFlags(showVsid=");
        sb.append(this.showVsid);
        sb.append(", showVsidLabel=");
        sb.append(this.showVsidLabel);
        sb.append(", showDrm=");
        sb.append(this.showDrm);
        sb.append(", showDrmLabel=");
        sb.append(this.showDrmLabel);
        sb.append(", showVideoTrack=");
        sb.append(this.showVideoTrack);
        sb.append(", showVideoTrackLabel=");
        sb.append(this.showVideoTrackLabel);
        sb.append(", showAudioTrack=");
        sb.append(this.showAudioTrack);
        sb.append(", showAudioTrackLabel=");
        sb.append(this.showAudioTrackLabel);
        sb.append(", showSubtitlesTrack=");
        sb.append(this.showSubtitlesTrack);
        sb.append(", showSubtitlesTrackLabel=");
        sb.append(this.showSubtitlesTrackLabel);
        sb.append(", showViewportSize=");
        sb.append(this.showViewportSize);
        sb.append(", showViewportSizeLabel=");
        sb.append(this.showViewportSizeLabel);
        sb.append(", showVideoDecoder=");
        sb.append(this.showVideoDecoder);
        sb.append(", showVideoDecoderLabel=");
        sb.append(this.showVideoDecoderLabel);
        sb.append(", showAudioDecoder=");
        sb.append(this.showAudioDecoder);
        sb.append(", showAudioDecoderLabel=");
        sb.append(this.showAudioDecoderLabel);
        sb.append(", showVideoDecoderInitsReusesReleases=");
        sb.append(this.showVideoDecoderInitsReusesReleases);
        sb.append(", showBandwidthEstimation=");
        sb.append(this.showBandwidthEstimation);
        sb.append(", showBandwidthEstimationLabel=");
        sb.append(this.showBandwidthEstimationLabel);
        sb.append(", showBufferSize=");
        sb.append(this.showBufferSize);
        sb.append(", showBufferSizeLabel=");
        sb.append(this.showBufferSizeLabel);
        sb.append(", showBytesLoaded=");
        sb.append(this.showBytesLoaded);
        sb.append(", showBytesLoadedLabel=");
        sb.append(this.showBytesLoadedLabel);
        sb.append(", showLatency=");
        sb.append(this.showLatency);
        sb.append(", showLatencyLabel=");
        sb.append(this.showLatencyLabel);
        sb.append(", showExtraInfo=");
        sb.append(this.showExtraInfo);
        sb.append(", showExtraInfoLabel=");
        sb.append(this.showExtraInfoLabel);
        sb.append(", showLastError=");
        sb.append(this.showLastError);
        sb.append(", showLastErrorLabel=");
        sb.append(this.showLastErrorLabel);
        sb.append(", showQrCode=");
        return unr0.u(sb, this.showQrCode, ')');
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b^\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010b\u001a\u00020cH\u0000¢\u0006\u0002\bdJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\u001f\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010\"\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010%\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010(\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010+\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010.\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u00101\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u00104\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u00107\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010:\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010=\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010@\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010C\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010F\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010I\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010L\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010O\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010R\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010U\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010X\u001a\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010[\u001a\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010^\u001a\u00020\u00002\b\u0010\\\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eJ\u0015\u0010a\u001a\u00020\u00002\b\u0010_\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR*\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR*\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR*\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR*\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR*\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR*\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR*\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR*\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR*\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR*\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR*\u0010/\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR*\u00102\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR*\u00105\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR*\u00108\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR*\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR*\u0010>\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR*\u0010A\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR*\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\tR*\u0010G\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\tR*\u0010J\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010\tR*\u0010M\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bN\u0010\u0007\"\u0004\bO\u0010\tR*\u0010P\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010\tR*\u0010S\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR*\u0010V\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bW\u0010\u0007\"\u0004\bX\u0010\tR*\u0010Y\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bZ\u0010\u0007\"\u0004\b[\u0010\tR*\u0010\\\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\tR*\u0010_\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b`\u0010\u0007\"\u0004\ba\u0010\t¨\u0006f"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags$Builder;", "", "()V", "<set-?>", "", "showAudioDecoder", "getShowAudioDecoder", "()Ljava/lang/Boolean;", "setShowAudioDecoder", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "showAudioDecoderLabel", "getShowAudioDecoderLabel", "setShowAudioDecoderLabel", "showAudioTrack", "getShowAudioTrack", "setShowAudioTrack", "showAudioTrackLabel", "getShowAudioTrackLabel", "setShowAudioTrackLabel", "showBandwidthEstimation", "getShowBandwidthEstimation", "setShowBandwidthEstimation", "showBandwidthEstimationLabel", "getShowBandwidthEstimationLabel", "setShowBandwidthEstimationLabel", "showBufferSize", "getShowBufferSize", "setShowBufferSize", "showBufferSizeLabel", "getShowBufferSizeLabel", "setShowBufferSizeLabel", "showBytesLoaded", "getShowBytesLoaded", "setShowBytesLoaded", "showBytesLoadedLabel", "getShowBytesLoadedLabel", "setShowBytesLoadedLabel", "showDrm", "getShowDrm", "setShowDrm", "showDrmLabel", "getShowDrmLabel", "setShowDrmLabel", "showExtraInfo", "getShowExtraInfo", "setShowExtraInfo", "showExtraInfoLabel", "getShowExtraInfoLabel", "setShowExtraInfoLabel", "showLastError", "getShowLastError", "setShowLastError", "showLastErrorLabel", "getShowLastErrorLabel", "setShowLastErrorLabel", "showLatency", "getShowLatency", "setShowLatency", "showLatencyLabel", "getShowLatencyLabel", "setShowLatencyLabel", "showQrCode", "getShowQrCode", "setShowQrCode", "showSubtitlesTrack", "getShowSubtitlesTrack", "setShowSubtitlesTrack", "showSubtitlesTrackLabel", "getShowSubtitlesTrackLabel", "setShowSubtitlesTrackLabel", "showVideoDecoder", "getShowVideoDecoder", "setShowVideoDecoder", "showVideoDecoderInitsReusesReleases", "getShowVideoDecoderInitsReusesReleases", "setShowVideoDecoderInitsReusesReleases", "showVideoDecoderLabel", "getShowVideoDecoderLabel", "setShowVideoDecoderLabel", "showVideoTrack", "getShowVideoTrack", "setShowVideoTrack", "showVideoTrackLabel", "getShowVideoTrackLabel", "setShowVideoTrackLabel", "showViewportSize", "getShowViewportSize", "setShowViewportSize", "showViewportSizeLabel", "getShowViewportSizeLabel", "setShowViewportSizeLabel", "showVsid", "getShowVsid", "setShowVsid", "showVsidLabel", "getShowVsidLabel", "setShowVsidLabel", "build", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "build$video_player_internalRelease", "(Ljava/lang/Boolean;)Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags$Builder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean showAudioDecoder;
        private Boolean showAudioDecoderLabel;
        private Boolean showAudioTrack;
        private Boolean showAudioTrackLabel;
        private Boolean showBandwidthEstimation;
        private Boolean showBandwidthEstimationLabel;
        private Boolean showBufferSize;
        private Boolean showBufferSizeLabel;
        private Boolean showBytesLoaded;
        private Boolean showBytesLoadedLabel;
        private Boolean showDrm;
        private Boolean showDrmLabel;
        private Boolean showExtraInfo;
        private Boolean showExtraInfoLabel;
        private Boolean showLastError;
        private Boolean showLastErrorLabel;
        private Boolean showLatency;
        private Boolean showLatencyLabel;
        private Boolean showQrCode;
        private Boolean showSubtitlesTrack;
        private Boolean showSubtitlesTrackLabel;
        private Boolean showVideoDecoder;
        private Boolean showVideoDecoderInitsReusesReleases;
        private Boolean showVideoDecoderLabel;
        private Boolean showVideoTrack;
        private Boolean showVideoTrackLabel;
        private Boolean showViewportSize;
        private Boolean showViewportSizeLabel;
        private Boolean showVsid;
        private Boolean showVsidLabel;

        public final PlayerDebugViewFlags build$video_player_internalRelease() {
            Boolean bool = this.showVsid;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            Boolean bool2 = this.showVsidLabel;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            Boolean bool3 = this.showDrm;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            Boolean bool4 = this.showDrmLabel;
            boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
            Boolean bool5 = this.showVideoTrack;
            boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : true;
            Boolean bool6 = this.showVideoTrackLabel;
            boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : true;
            Boolean bool7 = this.showAudioTrack;
            boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : true;
            Boolean bool8 = this.showAudioTrackLabel;
            boolean booleanValue8 = bool8 != null ? bool8.booleanValue() : true;
            Boolean bool9 = this.showSubtitlesTrack;
            boolean booleanValue9 = bool9 != null ? bool9.booleanValue() : true;
            Boolean bool10 = this.showSubtitlesTrackLabel;
            boolean booleanValue10 = bool10 != null ? bool10.booleanValue() : true;
            Boolean bool11 = this.showViewportSize;
            boolean booleanValue11 = bool11 != null ? bool11.booleanValue() : true;
            Boolean bool12 = this.showViewportSizeLabel;
            boolean booleanValue12 = bool12 != null ? bool12.booleanValue() : true;
            Boolean bool13 = this.showVideoDecoder;
            boolean booleanValue13 = bool13 != null ? bool13.booleanValue() : true;
            Boolean bool14 = this.showVideoDecoderLabel;
            boolean booleanValue14 = bool14 != null ? bool14.booleanValue() : true;
            Boolean bool15 = this.showAudioDecoder;
            boolean booleanValue15 = bool15 != null ? bool15.booleanValue() : true;
            Boolean bool16 = this.showAudioDecoderLabel;
            boolean booleanValue16 = bool16 != null ? bool16.booleanValue() : true;
            Boolean bool17 = this.showVideoDecoderInitsReusesReleases;
            boolean booleanValue17 = bool17 != null ? bool17.booleanValue() : true;
            Boolean bool18 = this.showBandwidthEstimation;
            boolean booleanValue18 = bool18 != null ? bool18.booleanValue() : true;
            Boolean bool19 = this.showBandwidthEstimationLabel;
            boolean booleanValue19 = bool19 != null ? bool19.booleanValue() : true;
            Boolean bool20 = this.showBufferSize;
            boolean booleanValue20 = bool20 != null ? bool20.booleanValue() : true;
            Boolean bool21 = this.showBufferSizeLabel;
            boolean booleanValue21 = bool21 != null ? bool21.booleanValue() : true;
            Boolean bool22 = this.showBytesLoaded;
            boolean booleanValue22 = bool22 != null ? bool22.booleanValue() : true;
            Boolean bool23 = this.showBytesLoadedLabel;
            boolean booleanValue23 = bool23 != null ? bool23.booleanValue() : true;
            Boolean bool24 = this.showLatency;
            boolean booleanValue24 = bool24 != null ? bool24.booleanValue() : true;
            Boolean bool25 = this.showLatencyLabel;
            boolean booleanValue25 = bool25 != null ? bool25.booleanValue() : true;
            Boolean bool26 = this.showExtraInfo;
            boolean booleanValue26 = bool26 != null ? bool26.booleanValue() : true;
            Boolean bool27 = this.showExtraInfoLabel;
            boolean booleanValue27 = bool27 != null ? bool27.booleanValue() : true;
            Boolean bool28 = this.showLastError;
            boolean booleanValue28 = bool28 != null ? bool28.booleanValue() : true;
            Boolean bool29 = this.showLastErrorLabel;
            boolean booleanValue29 = bool29 != null ? bool29.booleanValue() : true;
            Boolean bool30 = this.showQrCode;
            boolean z = booleanValue17;
            boolean z2 = booleanValue20;
            boolean z3 = booleanValue23;
            boolean z4 = booleanValue26;
            boolean z5 = booleanValue29;
            return new PlayerDebugViewFlags(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, booleanValue15, booleanValue16, z, booleanValue18, booleanValue19, z2, booleanValue21, booleanValue22, z3, booleanValue24, booleanValue25, z4, booleanValue27, booleanValue28, z5, bool30 != null ? bool30.booleanValue() : true, null);
        }

        public final Boolean getShowAudioDecoder() {
            return this.showAudioDecoder;
        }

        public final Boolean getShowAudioDecoderLabel() {
            return this.showAudioDecoderLabel;
        }

        public final Boolean getShowAudioTrack() {
            return this.showAudioTrack;
        }

        public final Boolean getShowAudioTrackLabel() {
            return this.showAudioTrackLabel;
        }

        public final Boolean getShowBandwidthEstimation() {
            return this.showBandwidthEstimation;
        }

        public final Boolean getShowBandwidthEstimationLabel() {
            return this.showBandwidthEstimationLabel;
        }

        public final Boolean getShowBufferSize() {
            return this.showBufferSize;
        }

        public final Boolean getShowBufferSizeLabel() {
            return this.showBufferSizeLabel;
        }

        public final Boolean getShowBytesLoaded() {
            return this.showBytesLoaded;
        }

        public final Boolean getShowBytesLoadedLabel() {
            return this.showBytesLoadedLabel;
        }

        public final Boolean getShowDrm() {
            return this.showDrm;
        }

        public final Boolean getShowDrmLabel() {
            return this.showDrmLabel;
        }

        public final Boolean getShowExtraInfo() {
            return this.showExtraInfo;
        }

        public final Boolean getShowExtraInfoLabel() {
            return this.showExtraInfoLabel;
        }

        public final Boolean getShowLastError() {
            return this.showLastError;
        }

        public final Boolean getShowLastErrorLabel() {
            return this.showLastErrorLabel;
        }

        public final Boolean getShowLatency() {
            return this.showLatency;
        }

        public final Boolean getShowLatencyLabel() {
            return this.showLatencyLabel;
        }

        public final Boolean getShowQrCode() {
            return this.showQrCode;
        }

        public final Boolean getShowSubtitlesTrack() {
            return this.showSubtitlesTrack;
        }

        public final Boolean getShowSubtitlesTrackLabel() {
            return this.showSubtitlesTrackLabel;
        }

        public final Boolean getShowVideoDecoder() {
            return this.showVideoDecoder;
        }

        public final Boolean getShowVideoDecoderInitsReusesReleases() {
            return this.showVideoDecoderInitsReusesReleases;
        }

        public final Boolean getShowVideoDecoderLabel() {
            return this.showVideoDecoderLabel;
        }

        public final Boolean getShowVideoTrack() {
            return this.showVideoTrack;
        }

        public final Boolean getShowVideoTrackLabel() {
            return this.showVideoTrackLabel;
        }

        public final Boolean getShowViewportSize() {
            return this.showViewportSize;
        }

        public final Boolean getShowViewportSizeLabel() {
            return this.showViewportSizeLabel;
        }

        public final Boolean getShowVsid() {
            return this.showVsid;
        }

        public final Boolean getShowVsidLabel() {
            return this.showVsidLabel;
        }

        /* renamed from: setShowAudioDecoder, reason: collision with other method in class */
        public final /* synthetic */ void m865setShowAudioDecoder(Boolean bool) {
            this.showAudioDecoder = bool;
        }

        /* renamed from: setShowAudioDecoderLabel, reason: collision with other method in class */
        public final /* synthetic */ void m866setShowAudioDecoderLabel(Boolean bool) {
            this.showAudioDecoderLabel = bool;
        }

        /* renamed from: setShowAudioTrack, reason: collision with other method in class */
        public final /* synthetic */ void m867setShowAudioTrack(Boolean bool) {
            this.showAudioTrack = bool;
        }

        /* renamed from: setShowAudioTrackLabel, reason: collision with other method in class */
        public final /* synthetic */ void m868setShowAudioTrackLabel(Boolean bool) {
            this.showAudioTrackLabel = bool;
        }

        /* renamed from: setShowBandwidthEstimation, reason: collision with other method in class */
        public final /* synthetic */ void m869setShowBandwidthEstimation(Boolean bool) {
            this.showBandwidthEstimation = bool;
        }

        /* renamed from: setShowBandwidthEstimationLabel, reason: collision with other method in class */
        public final /* synthetic */ void m870setShowBandwidthEstimationLabel(Boolean bool) {
            this.showBandwidthEstimationLabel = bool;
        }

        /* renamed from: setShowBufferSize, reason: collision with other method in class */
        public final /* synthetic */ void m871setShowBufferSize(Boolean bool) {
            this.showBufferSize = bool;
        }

        /* renamed from: setShowBufferSizeLabel, reason: collision with other method in class */
        public final /* synthetic */ void m872setShowBufferSizeLabel(Boolean bool) {
            this.showBufferSizeLabel = bool;
        }

        /* renamed from: setShowBytesLoaded, reason: collision with other method in class */
        public final /* synthetic */ void m873setShowBytesLoaded(Boolean bool) {
            this.showBytesLoaded = bool;
        }

        /* renamed from: setShowBytesLoadedLabel, reason: collision with other method in class */
        public final /* synthetic */ void m874setShowBytesLoadedLabel(Boolean bool) {
            this.showBytesLoadedLabel = bool;
        }

        /* renamed from: setShowDrm, reason: collision with other method in class */
        public final /* synthetic */ void m875setShowDrm(Boolean bool) {
            this.showDrm = bool;
        }

        /* renamed from: setShowDrmLabel, reason: collision with other method in class */
        public final /* synthetic */ void m876setShowDrmLabel(Boolean bool) {
            this.showDrmLabel = bool;
        }

        /* renamed from: setShowExtraInfo, reason: collision with other method in class */
        public final /* synthetic */ void m877setShowExtraInfo(Boolean bool) {
            this.showExtraInfo = bool;
        }

        /* renamed from: setShowExtraInfoLabel, reason: collision with other method in class */
        public final /* synthetic */ void m878setShowExtraInfoLabel(Boolean bool) {
            this.showExtraInfoLabel = bool;
        }

        /* renamed from: setShowLastError, reason: collision with other method in class */
        public final /* synthetic */ void m879setShowLastError(Boolean bool) {
            this.showLastError = bool;
        }

        /* renamed from: setShowLastErrorLabel, reason: collision with other method in class */
        public final /* synthetic */ void m880setShowLastErrorLabel(Boolean bool) {
            this.showLastErrorLabel = bool;
        }

        /* renamed from: setShowLatency, reason: collision with other method in class */
        public final /* synthetic */ void m881setShowLatency(Boolean bool) {
            this.showLatency = bool;
        }

        /* renamed from: setShowLatencyLabel, reason: collision with other method in class */
        public final /* synthetic */ void m882setShowLatencyLabel(Boolean bool) {
            this.showLatencyLabel = bool;
        }

        /* renamed from: setShowQrCode, reason: collision with other method in class */
        public final /* synthetic */ void m883setShowQrCode(Boolean bool) {
            this.showQrCode = bool;
        }

        /* renamed from: setShowSubtitlesTrack, reason: collision with other method in class */
        public final /* synthetic */ void m884setShowSubtitlesTrack(Boolean bool) {
            this.showSubtitlesTrack = bool;
        }

        /* renamed from: setShowSubtitlesTrackLabel, reason: collision with other method in class */
        public final /* synthetic */ void m885setShowSubtitlesTrackLabel(Boolean bool) {
            this.showSubtitlesTrackLabel = bool;
        }

        /* renamed from: setShowVideoDecoder, reason: collision with other method in class */
        public final /* synthetic */ void m886setShowVideoDecoder(Boolean bool) {
            this.showVideoDecoder = bool;
        }

        /* renamed from: setShowVideoDecoderInitsReusesReleases, reason: collision with other method in class */
        public final /* synthetic */ void m887setShowVideoDecoderInitsReusesReleases(Boolean bool) {
            this.showVideoDecoderInitsReusesReleases = bool;
        }

        /* renamed from: setShowVideoDecoderLabel, reason: collision with other method in class */
        public final /* synthetic */ void m888setShowVideoDecoderLabel(Boolean bool) {
            this.showVideoDecoderLabel = bool;
        }

        /* renamed from: setShowVideoTrack, reason: collision with other method in class */
        public final /* synthetic */ void m889setShowVideoTrack(Boolean bool) {
            this.showVideoTrack = bool;
        }

        /* renamed from: setShowVideoTrackLabel, reason: collision with other method in class */
        public final /* synthetic */ void m890setShowVideoTrackLabel(Boolean bool) {
            this.showVideoTrackLabel = bool;
        }

        /* renamed from: setShowViewportSize, reason: collision with other method in class */
        public final /* synthetic */ void m891setShowViewportSize(Boolean bool) {
            this.showViewportSize = bool;
        }

        /* renamed from: setShowViewportSizeLabel, reason: collision with other method in class */
        public final /* synthetic */ void m892setShowViewportSizeLabel(Boolean bool) {
            this.showViewportSizeLabel = bool;
        }

        /* renamed from: setShowVsid, reason: collision with other method in class */
        public final /* synthetic */ void m893setShowVsid(Boolean bool) {
            this.showVsid = bool;
        }

        /* renamed from: setShowVsidLabel, reason: collision with other method in class */
        public final /* synthetic */ void m894setShowVsidLabel(Boolean bool) {
            this.showVsidLabel = bool;
        }

        public final Builder setShowAudioDecoder(Boolean showAudioDecoder) {
            this.showAudioDecoder = showAudioDecoder;
            return this;
        }

        public final Builder setShowAudioDecoderLabel(Boolean showAudioDecoderLabel) {
            this.showAudioDecoderLabel = showAudioDecoderLabel;
            return this;
        }

        public final Builder setShowAudioTrack(Boolean showAudioTrack) {
            this.showAudioTrack = showAudioTrack;
            return this;
        }

        public final Builder setShowAudioTrackLabel(Boolean showAudioTrackLabel) {
            this.showAudioTrackLabel = showAudioTrackLabel;
            return this;
        }

        public final Builder setShowBandwidthEstimation(Boolean showBandwidthEstimation) {
            this.showBandwidthEstimation = showBandwidthEstimation;
            return this;
        }

        public final Builder setShowBandwidthEstimationLabel(Boolean showBandwidthEstimationLabel) {
            this.showBandwidthEstimationLabel = showBandwidthEstimationLabel;
            return this;
        }

        public final Builder setShowBufferSize(Boolean showBufferSize) {
            this.showBufferSize = showBufferSize;
            return this;
        }

        public final Builder setShowBufferSizeLabel(Boolean showBufferSizeLabel) {
            this.showBufferSizeLabel = showBufferSizeLabel;
            return this;
        }

        public final Builder setShowBytesLoaded(Boolean showBytesLoaded) {
            this.showBytesLoaded = showBytesLoaded;
            return this;
        }

        public final Builder setShowBytesLoadedLabel(Boolean showBytesLoadedLabel) {
            this.showBytesLoadedLabel = showBytesLoadedLabel;
            return this;
        }

        public final Builder setShowDrm(Boolean showDrm) {
            this.showDrm = showDrm;
            return this;
        }

        public final Builder setShowDrmLabel(Boolean showDrmLabel) {
            this.showDrmLabel = showDrmLabel;
            return this;
        }

        public final Builder setShowExtraInfo(Boolean showExtraInfo) {
            this.showExtraInfo = showExtraInfo;
            return this;
        }

        public final Builder setShowExtraInfoLabel(Boolean showExtraInfoLabel) {
            this.showExtraInfoLabel = showExtraInfoLabel;
            return this;
        }

        public final Builder setShowLastError(Boolean showLastError) {
            this.showLastError = showLastError;
            return this;
        }

        public final Builder setShowLastErrorLabel(Boolean showLastErrorLabel) {
            this.showLastErrorLabel = showLastErrorLabel;
            return this;
        }

        public final Builder setShowLatency(Boolean showLatency) {
            this.showLatency = showLatency;
            return this;
        }

        public final Builder setShowLatencyLabel(Boolean showLatencyLabel) {
            this.showLatencyLabel = showLatencyLabel;
            return this;
        }

        public final Builder setShowQrCode(Boolean showQrCode) {
            this.showQrCode = showQrCode;
            return this;
        }

        public final Builder setShowSubtitlesTrack(Boolean showSubtitlesTrack) {
            this.showSubtitlesTrack = showSubtitlesTrack;
            return this;
        }

        public final Builder setShowSubtitlesTrackLabel(Boolean showSubtitlesTrackLabel) {
            this.showSubtitlesTrackLabel = showSubtitlesTrackLabel;
            return this;
        }

        public final Builder setShowVideoDecoder(Boolean showVideoDecoder) {
            this.showVideoDecoder = showVideoDecoder;
            return this;
        }

        public final Builder setShowVideoDecoderInitsReusesReleases(Boolean showVideoDecoderInitsReusesReleases) {
            this.showVideoDecoderInitsReusesReleases = showVideoDecoderInitsReusesReleases;
            return this;
        }

        public final Builder setShowVideoDecoderLabel(Boolean showVideoDecoderLabel) {
            this.showVideoDecoderLabel = showVideoDecoderLabel;
            return this;
        }

        public final Builder setShowVideoTrack(Boolean showVideoTrack) {
            this.showVideoTrack = showVideoTrack;
            return this;
        }

        public final Builder setShowVideoTrackLabel(Boolean showVideoTrackLabel) {
            this.showVideoTrackLabel = showVideoTrackLabel;
            return this;
        }

        public final Builder setShowViewportSize(Boolean showViewportSize) {
            this.showViewportSize = showViewportSize;
            return this;
        }

        public final Builder setShowViewportSizeLabel(Boolean showViewportSizeLabel) {
            this.showViewportSizeLabel = showViewportSizeLabel;
            return this;
        }

        public final Builder setShowVsid(Boolean showVsid) {
            this.showVsid = showVsid;
            return this;
        }

        public final Builder setShowVsidLabel(Boolean showVsidLabel) {
            this.showVsidLabel = showVsidLabel;
            return this;
        }
    }

    public /* synthetic */ PlayerDebugViewFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30);
    }
}
