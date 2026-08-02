package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.Ordering;
import com.google.common.collect.RegularImmutableList;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class DefaultTrackSelector {
    public static final Ordering FORMAT_VALUE_ORDERING = Ordering.from(new ng$$ExternalSyntheticLambda0(8));
    public AudioAttributes audioAttributes;
    public DefaultBandwidthMeter bandwidthMeter;
    public final Context context;
    public Boolean deviceIsTV;
    public ExoPlayerImplInternal listener;
    public final Object lock;
    public Parameters parameters;
    public Thread playbackThread;
    public SpatializerWrapper spatializer;
    public final CoroutinesRoom.Companion trackSelectionFactory;

    public final class AudioTrackInfo extends TrackInfo implements Comparable {
        public final boolean allowMixedMimeTypes;
        public final int bitrate;
        public final int channelCount;
        public final boolean hasMainOrNoRoleFlag;
        public final boolean isDefaultSelectionFlag;
        public final boolean isObjectBasedAudio;
        public final boolean isWithinConstraints;
        public final boolean isWithinRendererCapabilities;
        public final String language;
        public final int localeLanguageMatchIndex;
        public final int localeLanguageScore;
        public final Parameters parameters;
        public final int preferredLabelMatchIndex;
        public final int preferredLanguageIndex;
        public final int preferredLanguageScore;
        public final int preferredMimeTypeMatchIndex;
        public final int preferredRoleFlagsScore;
        public final int sampleRate;
        public final int selectionEligibility;
        public final boolean usesHardwareAcceleration;
        public final boolean usesPrimaryDecoder;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[LOOP:1: B:36:0x00ed->B:38:0x00f0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x012f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x010d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AudioTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, boolean z, DefaultTrackSelector$$ExternalSyntheticLambda10 defaultTrackSelector$$ExternalSyntheticLambda10, int i4) {
            super(i, trackGroup, i2);
            int i5;
            int i6;
            boolean z2;
            String[] split;
            int i7;
            int i8;
            int i9;
            int i10;
            boolean z3;
            Parameters parameters2;
            boolean z4;
            TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
            boolean z5;
            this.parameters = parameters;
            boolean z6 = parameters.allowAudioNonSeamlessAdaptiveness;
            ImmutableList immutableList = parameters.preferredAudioMimeTypes;
            ImmutableList immutableList2 = parameters.preferredAudioLanguages;
            int i11 = z6 ? 24 : 16;
            int i12 = 0;
            this.allowMixedMimeTypes = false;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.f885format.language);
            this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
            int i13 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i13 >= immutableList2.size()) {
                    i6 = 0;
                    i13 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = DefaultTrackSelector.getFormatLanguageScore(this.f885format, (String) immutableList2.get(i13), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.preferredLanguageIndex = i13;
            this.preferredLanguageScore = i6;
            int i14 = this.f885format.roleFlags;
            this.preferredRoleFlagsScore = (i14 == 0 || i14 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
            this.preferredLabelMatchIndex = DefaultTrackSelector.access$4300(this.f885format, parameters.preferredAudioLabels);
            Format format2 = this.f885format;
            int i15 = format2.roleFlags;
            this.hasMainOrNoRoleFlag = i15 == 0 || (i15 & 1) != 0;
            this.isDefaultSelectionFlag = (format2.selectionFlags & 1) != 0;
            String str = format2.sampleMimeType;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            z5 = false;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            z5 = true;
                            break;
                        }
                        z5 = -1;
                        break;
                    case 1504698186:
                        if (str.equals("audio/iamf")) {
                            z5 = 2;
                            break;
                        }
                        z5 = -1;
                        break;
                    default:
                        z5 = -1;
                        break;
                }
                switch (z5) {
                    case false:
                    case true:
                    case true:
                        z2 = true;
                        break;
                }
                this.isObjectBasedAudio = z2;
                int i16 = format2.channelCount;
                this.channelCount = i16;
                this.sampleRate = format2.sampleRate;
                int i17 = format2.bitrate;
                this.bitrate = i17;
                this.isWithinConstraints = (i17 != -1 || i17 <= parameters.maxAudioBitrate) && (i16 == -1 || i16 <= parameters.maxAudioChannelCount) && defaultTrackSelector$$ExternalSyntheticLambda10.apply(format2);
                split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
                for (i7 = 0; i7 < split.length; i7++) {
                    split[i7] = Util.normalizeLanguageCode(split[i7]);
                }
                i8 = 0;
                while (true) {
                    if (i8 >= split.length) {
                        i9 = DefaultTrackSelector.getFormatLanguageScore(this.f885format, split[i8], false);
                        if (i9 <= 0) {
                            i8++;
                        }
                    } else {
                        i9 = 0;
                        i8 = Integer.MAX_VALUE;
                    }
                }
                this.localeLanguageMatchIndex = i8;
                this.localeLanguageScore = i9;
                i10 = 0;
                while (true) {
                    if (i10 < immutableList.size()) {
                        String str2 = this.f885format.sampleMimeType;
                        if (str2 == null || !str2.equals(immutableList.get(i10))) {
                            i10++;
                        } else {
                            i5 = i10;
                        }
                    }
                }
                this.preferredMimeTypeMatchIndex = i5;
                this.usesPrimaryDecoder = (i3 & MLKEMEngine.KyberPolyBytes) != 128;
                this.usesHardwareAcceleration = (i3 & 64) != 64;
                z3 = this.isWithinConstraints;
                parameters2 = this.parameters;
                z4 = parameters2.exceedRendererCapabilitiesIfNecessary;
                audioOffloadPreferences = parameters2.audioOffloadPreferences;
                if (BaseRenderer.isFormatSupported(i3, z4) && (z3 || parameters2.exceedAudioConstraintsIfNecessary)) {
                    audioOffloadPreferences.getClass();
                    i12 = (BaseRenderer.isFormatSupported(i3, false) || !z3 || this.f885format.bitrate == -1 || (!parameters2.allowMultipleAdaptiveSelections && z) || (i11 & i3) == 0) ? 1 : 2;
                }
                this.selectionEligibility = i12;
            }
            z2 = false;
            this.isObjectBasedAudio = z2;
            int i162 = format2.channelCount;
            this.channelCount = i162;
            this.sampleRate = format2.sampleRate;
            int i172 = format2.bitrate;
            this.bitrate = i172;
            this.isWithinConstraints = (i172 != -1 || i172 <= parameters.maxAudioBitrate) && (i162 == -1 || i162 <= parameters.maxAudioChannelCount) && defaultTrackSelector$$ExternalSyntheticLambda10.apply(format2);
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            while (i7 < split.length) {
            }
            i8 = 0;
            while (true) {
                if (i8 >= split.length) {
                }
                i8++;
            }
            this.localeLanguageMatchIndex = i8;
            this.localeLanguageScore = i9;
            i10 = 0;
            while (true) {
                if (i10 < immutableList.size()) {
                }
                i10++;
            }
            this.preferredMimeTypeMatchIndex = i5;
            this.usesPrimaryDecoder = (i3 & MLKEMEngine.KyberPolyBytes) != 128;
            this.usesHardwareAcceleration = (i3 & 64) != 64;
            z3 = this.isWithinConstraints;
            parameters2 = this.parameters;
            z4 = parameters2.exceedRendererCapabilitiesIfNecessary;
            audioOffloadPreferences = parameters2.audioOffloadPreferences;
            if (BaseRenderer.isFormatSupported(i3, z4)) {
                audioOffloadPreferences.getClass();
                if (BaseRenderer.isFormatSupported(i3, false)) {
                }
            }
            this.selectionEligibility = i12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AudioTrackInfo audioTrackInfo) {
            boolean z = this.isWithinRendererCapabilities;
            boolean z2 = this.isWithinConstraints;
            Ordering reverse = (z2 && z) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            boolean z3 = audioTrackInfo.isWithinRendererCapabilities;
            int i = audioTrackInfo.bitrate;
            ComparisonChain compareFalseFirst = ComparisonChain.ACTIVE.compareFalseFirst(z, z3);
            Integer valueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(audioTrackInfo.preferredLanguageIndex);
            NaturalOrdering naturalOrdering = NaturalOrdering.INSTANCE$2;
            ComparisonChain compare = compareFalseFirst.compare(valueOf, valueOf2, naturalOrdering).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compare(Integer.valueOf(this.preferredLabelMatchIndex), Integer.valueOf(audioTrackInfo.preferredLabelMatchIndex), naturalOrdering).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), naturalOrdering).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(z2, audioTrackInfo.isWithinConstraints).compare(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), naturalOrdering);
            this.parameters.getClass();
            ComparisonChain compare2 = compare.compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compareFalseFirst(this.isObjectBasedAudio, audioTrackInfo.isObjectBasedAudio).compare(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), reverse).compare(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), reverse);
            if (Objects.equals(this.language, audioTrackInfo.language)) {
                compare2 = compare2.compare(Integer.valueOf(this.bitrate), Integer.valueOf(i), reverse);
            }
            return compare2.result();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean isCompatibleForAdaptationWith(TrackInfo trackInfo) {
            int i;
            String str;
            AudioTrackInfo audioTrackInfo = (AudioTrackInfo) trackInfo;
            Format format2 = audioTrackInfo.f885format;
            this.parameters.getClass();
            Format format3 = this.f885format;
            int i2 = format3.channelCount;
            if (i2 == -1 || i2 != format2.channelCount) {
                return false;
            }
            return (this.allowMixedMimeTypes || ((str = format3.sampleMimeType) != null && TextUtils.equals(str, format2.sampleMimeType))) && (i = format3.sampleRate) != -1 && i == format2.sampleRate && this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    public final class ImageTrackInfo extends TrackInfo implements Comparable {
        public final int pixelCount;
        public final int selectionEligibility;

        public ImageTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3) {
            super(i, trackGroup, i2);
            int i4;
            this.selectionEligibility = BaseRenderer.isFormatSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            Format format2 = this.f885format;
            int i5 = format2.width;
            int i6 = -1;
            if (i5 != -1 && (i4 = format2.height) != -1) {
                i6 = i5 * i4;
            }
            this.pixelCount = i6;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return Integer.compare(this.pixelCount, ((ImageTrackInfo) obj).pixelCount);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(TrackInfo trackInfo) {
            return false;
        }
    }

    public final class OtherTrackScore implements Comparable {
        public final boolean isDefault;
        public final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format2, int i) {
            this.isDefault = (format2.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            OtherTrackScore otherTrackScore = (OtherTrackScore) obj;
            return ComparisonChain.ACTIVE.compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    public final class TextTrackInfo extends TrackInfo implements Comparable {
        public final boolean hasCaptionRoleFlags;
        public final boolean isDefault;
        public final boolean isForced;
        public final boolean isWithinRendererCapabilities;
        public final int preferredLabelMatchIndex;
        public final int preferredLanguageIndex;
        public final int preferredLanguageScore;
        public final int preferredRoleFlagsScore;
        public final int selectedAudioLanguageScore;
        public final int selectionEligibility;

        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str, String str2) {
            super(i, trackGroup, i2);
            int i4;
            int i5 = 0;
            this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
            int i6 = this.f885format.selectionFlags;
            int i7 = parameters.ignoredTextSelectionFlags;
            ImmutableList immutableList = parameters.preferredTextLanguages;
            int i8 = i6 & (~i7);
            this.isDefault = (i8 & 1) != 0;
            this.isForced = (i8 & 2) != 0;
            ImmutableList of = str2 != null ? ImmutableList.of((Object) str2) : immutableList.isEmpty() ? ImmutableList.of((Object) "") : immutableList;
            int i9 = 0;
            while (true) {
                if (i9 >= of.size()) {
                    i4 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = DefaultTrackSelector.getFormatLanguageScore(this.f885format, (String) of.get(i9), false);
                    if (i4 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.preferredLanguageIndex = i9;
            this.preferredLanguageScore = i4;
            int i10 = str2 != null ? 1088 : 0;
            int i11 = this.f885format.roleFlags;
            Ordering ordering = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
            int bitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
            this.preferredRoleFlagsScore = bitCount;
            Format format2 = this.f885format;
            this.hasCaptionRoleFlags = (1088 & format2.roleFlags) != 0;
            int access$4300 = DefaultTrackSelector.access$4300(format2, parameters.preferredTextLabels);
            this.preferredLabelMatchIndex = access$4300;
            int formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f885format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore;
            boolean z = i4 > 0 || (immutableList.isEmpty() && bitCount > 0) || ((immutableList.isEmpty() && access$4300 != Integer.MAX_VALUE) || this.isDefault || (this.isForced && formatLanguageScore > 0));
            if (BaseRenderer.isFormatSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i5 = 1;
            }
            this.selectionEligibility = i5;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain compareFalseFirst = ComparisonChain.ACTIVE.compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities);
            Integer valueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(textTrackInfo.preferredLanguageIndex);
            NaturalOrdering naturalOrdering = NaturalOrdering.INSTANCE;
            NaturalOrdering naturalOrdering2 = NaturalOrdering.INSTANCE$2;
            ComparisonChain compare = compareFalseFirst.compare(valueOf, valueOf2, naturalOrdering2);
            int i = textTrackInfo.preferredLanguageScore;
            int i2 = this.preferredLanguageScore;
            ComparisonChain compare2 = compare.compare(i2, i);
            int i3 = textTrackInfo.preferredRoleFlagsScore;
            int i4 = this.preferredRoleFlagsScore;
            ComparisonChain compareFalseFirst2 = compare2.compare(i4, i3).compare(Integer.valueOf(this.preferredLabelMatchIndex), Integer.valueOf(textTrackInfo.preferredLabelMatchIndex), naturalOrdering2).compareFalseFirst(this.isDefault, textTrackInfo.isDefault);
            Boolean valueOf3 = Boolean.valueOf(this.isForced);
            Boolean valueOf4 = Boolean.valueOf(textTrackInfo.isForced);
            if (i2 != 0) {
                naturalOrdering = naturalOrdering2;
            }
            ComparisonChain compare3 = compareFalseFirst2.compare(valueOf3, valueOf4, naturalOrdering).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (i4 == 0) {
                compare3 = compare3.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return compare3.result();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final /* bridge */ /* synthetic */ boolean isCompatibleForAdaptationWith(TrackInfo trackInfo) {
            return false;
        }
    }

    public abstract class TrackInfo {

        /* renamed from: format, reason: collision with root package name */
        public final Format f885format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory {
            RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.f885format = trackGroup.formats[i2];
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(TrackInfo trackInfo);
    }

    public final class VideoTrackInfo extends TrackInfo {
        public final boolean allowMixedMimeTypes;
        public final int bitrate;
        public final int codecPreferenceScore;
        public final boolean hasMainOrNoRoleFlag;
        public final boolean hasReasonableFrameRate;
        public final boolean isHdr;
        public final boolean isWithinMaxConstraints;
        public final boolean isWithinMinConstraints;
        public final boolean isWithinRendererCapabilities;
        public final Parameters parameters;
        public final int pixelCount;
        public final int preferredLabelMatchIndex;
        public final int preferredLanguageIndex;
        public final int preferredLanguageScore;
        public final int preferredMimeTypeMatchIndex;
        public final int preferredRoleFlagsScore;
        public final String resolvedMimeType;
        public final int selectedAudioLanguageScore;
        public final int selectionEligibility;
        public final boolean usesHardwareAcceleration;
        public final boolean usesPrimaryDecoder;
        public final boolean usesPrimaryOrFallbackDecoder;

        public static int $r8$lambda$mN6XX8i7M4d49ufL_31PyFTAA68(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ComparisonChain compareFalseFirst = ComparisonChain.ACTIVE.compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities);
            Integer valueOf = Integer.valueOf(videoTrackInfo.preferredLanguageIndex);
            Integer valueOf2 = Integer.valueOf(videoTrackInfo2.preferredLanguageIndex);
            NaturalOrdering naturalOrdering = NaturalOrdering.INSTANCE$2;
            return compareFalseFirst.compare(valueOf, valueOf2, naturalOrdering).compare(videoTrackInfo.preferredLanguageScore, videoTrackInfo2.preferredLanguageScore).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compare(Integer.valueOf(videoTrackInfo.preferredLabelMatchIndex), Integer.valueOf(videoTrackInfo2.preferredLabelMatchIndex), naturalOrdering).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compare(videoTrackInfo.selectedAudioLanguageScore, videoTrackInfo2.selectedAudioLanguageScore).compareFalseFirst(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), naturalOrdering).compareFalseFirst(videoTrackInfo.usesPrimaryOrFallbackDecoder, videoTrackInfo2.usesPrimaryOrFallbackDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration).result();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:103:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0115 A[EDGE_INSN: B:155:0x0115->B:81:0x0115 BREAK  A[LOOP:1: B:74:0x00fe->B:153:0x0112], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0125 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VideoTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str, int i4, boolean z) {
            super(i, trackGroup, i2);
            boolean z2;
            boolean z3;
            int i5;
            int i6;
            int i7;
            String str2;
            int i8;
            int i9;
            boolean z4;
            int i10;
            boolean z5;
            boolean z6;
            Format format2;
            boolean z7;
            String alternativeCodecMimeType;
            int i11;
            Format format3;
            int i12;
            int i13;
            float f;
            int i14;
            Format format4;
            int i15;
            int i16;
            int i17;
            this.parameters = parameters;
            boolean z8 = parameters.allowVideoNonSeamlessAdaptiveness;
            ImmutableList immutableList = parameters.preferredVideoMimeTypes;
            ImmutableList immutableList2 = parameters.preferredVideoLanguages;
            int i18 = z8 ? 24 : 16;
            int i19 = 0;
            this.allowMixedMimeTypes = false;
            if (z && (((i15 = (format4 = this.f885format).width) == -1 || i15 <= parameters.maxVideoWidth) && ((i16 = format4.height) == -1 || i16 <= parameters.maxVideoHeight))) {
                float f2 = format4.frameRate;
                if ((f2 == -1.0f || f2 <= parameters.maxVideoFrameRate) && ((i17 = format4.bitrate) == -1 || i17 <= parameters.maxVideoBitrate)) {
                    z2 = true;
                    this.isWithinMaxConstraints = z2;
                    if (z && (((i12 = (format3 = this.f885format).width) == -1 || i12 >= 0) && ((i13 = format3.height) == -1 || i13 >= 0))) {
                        f = format3.frameRate;
                        if ((f != -1.0f || f >= RecyclerView.DECELERATION_RATE) && ((i14 = format3.bitrate) == -1 || i14 >= 0)) {
                            z3 = true;
                            this.isWithinMinConstraints = z3;
                            this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
                            Format format5 = this.f885format;
                            float f3 = format5.frameRate;
                            this.hasReasonableFrameRate = f3 == -1.0f && f3 >= 10.0f;
                            this.bitrate = format5.bitrate;
                            int i20 = format5.width;
                            this.pixelCount = (i20 != -1 || (i11 = format5.height) == -1) ? -1 : i20 * i11;
                            i5 = 0;
                            while (true) {
                                i6 = Integer.MAX_VALUE;
                                if (i5 < immutableList2.size()) {
                                    i7 = 0;
                                    i5 = Integer.MAX_VALUE;
                                    break;
                                } else {
                                    i7 = DefaultTrackSelector.getFormatLanguageScore(this.f885format, (String) immutableList2.get(i5), false);
                                    if (i7 > 0) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                            this.preferredLanguageIndex = i5;
                            this.preferredLanguageScore = i7;
                            int i21 = this.f885format.roleFlags;
                            Ordering ordering = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
                            this.preferredRoleFlagsScore = (i21 == 0 && i21 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                            int i22 = this.f885format.roleFlags;
                            this.hasMainOrNoRoleFlag = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                            this.selectedAudioLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f885format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) != null);
                            Format format6 = this.f885format;
                            str2 = format6.sampleMimeType;
                            i8 = i3 & MLKEMEngine.KyberPolyBytes;
                            if (i8 == 256 && (alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(format6)) != null) {
                                str2 = alternativeCodecMimeType;
                            }
                            i9 = 0;
                            while (true) {
                                if (i9 < immutableList.size()) {
                                    if (str2 != null && str2.equals(immutableList.get(i9))) {
                                        i6 = i9;
                                        break;
                                    }
                                    i9++;
                                } else {
                                    break;
                                }
                            }
                            this.preferredMimeTypeMatchIndex = i6;
                            this.preferredLabelMatchIndex = DefaultTrackSelector.access$4300(this.f885format, parameters.preferredVideoLabels);
                            this.usesPrimaryOrFallbackDecoder = i8 != 128 || i8 == 256;
                            z4 = i8 != 128;
                            this.usesPrimaryDecoder = z4;
                            this.usesHardwareAcceleration = (i3 & 64) != 64;
                            this.resolvedMimeType = str2;
                            if (str2 != null) {
                                i10 = 4;
                                switch (str2.hashCode()) {
                                    case -1851077871:
                                        if (str2.equals("video/dolby-vision")) {
                                            z7 = false;
                                            break;
                                        }
                                        z7 = -1;
                                        break;
                                    case -1662735862:
                                        if (str2.equals("video/av01")) {
                                            z7 = true;
                                            break;
                                        }
                                        z7 = -1;
                                        break;
                                    case -1662541442:
                                        if (str2.equals("video/hevc")) {
                                            z7 = 2;
                                            break;
                                        }
                                        z7 = -1;
                                        break;
                                    case 1331836730:
                                        if (str2.equals("video/avc")) {
                                            z7 = 3;
                                            break;
                                        }
                                        z7 = -1;
                                        break;
                                    case 1599127257:
                                        if (str2.equals("video/x-vnd.on2.vp9")) {
                                            z7 = 4;
                                            break;
                                        }
                                        z7 = -1;
                                        break;
                                    default:
                                        z7 = -1;
                                        break;
                                }
                                switch (z7) {
                                    case false:
                                        i10 = 5;
                                        break;
                                    case true:
                                        i10 = 3;
                                        break;
                                    case true:
                                        i10 = 1;
                                        break;
                                    case true:
                                        i10 = 2;
                                        break;
                                }
                                this.codecPreferenceScore = i10;
                                if (z4) {
                                    ColorInfo colorInfo = this.f885format.colorInfo;
                                    if (colorInfo != null) {
                                        int i23 = colorInfo.colorTransfer;
                                        if (i23 == 7 || i23 == 6) {
                                            z5 = true;
                                            this.isHdr = z5;
                                            z6 = this.isWithinMaxConstraints;
                                            Parameters parameters2 = this.parameters;
                                            format2 = this.f885format;
                                            if ((format2.roleFlags & 16384) == 0 && BaseRenderer.isFormatSupported(i3, parameters2.exceedRendererCapabilitiesIfNecessary) && (z6 || parameters2.exceedVideoConstraintsIfNecessary)) {
                                                i19 = (BaseRenderer.isFormatSupported(i3, false) || !this.isWithinMinConstraints || !z6 || format2.bitrate == -1 || (i18 & i3) == 0) ? 1 : 2;
                                            }
                                            this.selectionEligibility = i19;
                                        }
                                    } else {
                                        ColorInfo colorInfo2 = ColorInfo.SDR_BT709_LIMITED;
                                    }
                                }
                                z5 = false;
                                this.isHdr = z5;
                                z6 = this.isWithinMaxConstraints;
                                Parameters parameters22 = this.parameters;
                                format2 = this.f885format;
                                if ((format2.roleFlags & 16384) == 0) {
                                    if (BaseRenderer.isFormatSupported(i3, false)) {
                                    }
                                }
                                this.selectionEligibility = i19;
                            }
                            i10 = 0;
                            this.codecPreferenceScore = i10;
                            if (z4) {
                            }
                            z5 = false;
                            this.isHdr = z5;
                            z6 = this.isWithinMaxConstraints;
                            Parameters parameters222 = this.parameters;
                            format2 = this.f885format;
                            if ((format2.roleFlags & 16384) == 0) {
                            }
                            this.selectionEligibility = i19;
                        }
                    }
                    z3 = false;
                    this.isWithinMinConstraints = z3;
                    this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
                    Format format52 = this.f885format;
                    float f32 = format52.frameRate;
                    this.hasReasonableFrameRate = f32 == -1.0f && f32 >= 10.0f;
                    this.bitrate = format52.bitrate;
                    int i202 = format52.width;
                    this.pixelCount = (i202 != -1 || (i11 = format52.height) == -1) ? -1 : i202 * i11;
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 < immutableList2.size()) {
                        }
                        i5++;
                    }
                    this.preferredLanguageIndex = i5;
                    this.preferredLanguageScore = i7;
                    int i212 = this.f885format.roleFlags;
                    Ordering ordering2 = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
                    this.preferredRoleFlagsScore = (i212 == 0 && i212 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                    int i222 = this.f885format.roleFlags;
                    this.hasMainOrNoRoleFlag = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                    this.selectedAudioLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f885format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) != null);
                    Format format62 = this.f885format;
                    str2 = format62.sampleMimeType;
                    i8 = i3 & MLKEMEngine.KyberPolyBytes;
                    if (i8 == 256) {
                        str2 = alternativeCodecMimeType;
                    }
                    i9 = 0;
                    while (true) {
                        if (i9 < immutableList.size()) {
                        }
                        i9++;
                    }
                    this.preferredMimeTypeMatchIndex = i6;
                    this.preferredLabelMatchIndex = DefaultTrackSelector.access$4300(this.f885format, parameters.preferredVideoLabels);
                    this.usesPrimaryOrFallbackDecoder = i8 != 128 || i8 == 256;
                    if (i8 != 128) {
                    }
                    this.usesPrimaryDecoder = z4;
                    this.usesHardwareAcceleration = (i3 & 64) != 64;
                    this.resolvedMimeType = str2;
                    if (str2 != null) {
                    }
                    i10 = 0;
                    this.codecPreferenceScore = i10;
                    if (z4) {
                    }
                    z5 = false;
                    this.isHdr = z5;
                    z6 = this.isWithinMaxConstraints;
                    Parameters parameters2222 = this.parameters;
                    format2 = this.f885format;
                    if ((format2.roleFlags & 16384) == 0) {
                    }
                    this.selectionEligibility = i19;
                }
            }
            z2 = false;
            this.isWithinMaxConstraints = z2;
            if (z) {
                f = format3.frameRate;
                if (f != -1.0f) {
                }
                z3 = true;
                this.isWithinMinConstraints = z3;
                this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
                Format format522 = this.f885format;
                float f322 = format522.frameRate;
                this.hasReasonableFrameRate = f322 == -1.0f && f322 >= 10.0f;
                this.bitrate = format522.bitrate;
                int i2022 = format522.width;
                this.pixelCount = (i2022 != -1 || (i11 = format522.height) == -1) ? -1 : i2022 * i11;
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < immutableList2.size()) {
                    }
                    i5++;
                }
                this.preferredLanguageIndex = i5;
                this.preferredLanguageScore = i7;
                int i2122 = this.f885format.roleFlags;
                Ordering ordering22 = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
                this.preferredRoleFlagsScore = (i2122 == 0 && i2122 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i2222 = this.f885format.roleFlags;
                this.hasMainOrNoRoleFlag = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
                this.selectedAudioLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f885format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) != null);
                Format format622 = this.f885format;
                str2 = format622.sampleMimeType;
                i8 = i3 & MLKEMEngine.KyberPolyBytes;
                if (i8 == 256) {
                }
                i9 = 0;
                while (true) {
                    if (i9 < immutableList.size()) {
                    }
                    i9++;
                }
                this.preferredMimeTypeMatchIndex = i6;
                this.preferredLabelMatchIndex = DefaultTrackSelector.access$4300(this.f885format, parameters.preferredVideoLabels);
                this.usesPrimaryOrFallbackDecoder = i8 != 128 || i8 == 256;
                if (i8 != 128) {
                }
                this.usesPrimaryDecoder = z4;
                this.usesHardwareAcceleration = (i3 & 64) != 64;
                this.resolvedMimeType = str2;
                if (str2 != null) {
                }
                i10 = 0;
                this.codecPreferenceScore = i10;
                if (z4) {
                }
                z5 = false;
                this.isHdr = z5;
                z6 = this.isWithinMaxConstraints;
                Parameters parameters22222 = this.parameters;
                format2 = this.f885format;
                if ((format2.roleFlags & 16384) == 0) {
                }
                this.selectionEligibility = i19;
            }
            z3 = false;
            this.isWithinMinConstraints = z3;
            this.isWithinRendererCapabilities = BaseRenderer.isFormatSupported(i3, false);
            Format format5222 = this.f885format;
            float f3222 = format5222.frameRate;
            this.hasReasonableFrameRate = f3222 == -1.0f && f3222 >= 10.0f;
            this.bitrate = format5222.bitrate;
            int i20222 = format5222.width;
            this.pixelCount = (i20222 != -1 || (i11 = format5222.height) == -1) ? -1 : i20222 * i11;
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < immutableList2.size()) {
                }
                i5++;
            }
            this.preferredLanguageIndex = i5;
            this.preferredLanguageScore = i7;
            int i21222 = this.f885format.roleFlags;
            Ordering ordering222 = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
            this.preferredRoleFlagsScore = (i21222 == 0 && i21222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i22222 = this.f885format.roleFlags;
            this.hasMainOrNoRoleFlag = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
            this.selectedAudioLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f885format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) != null);
            Format format6222 = this.f885format;
            str2 = format6222.sampleMimeType;
            i8 = i3 & MLKEMEngine.KyberPolyBytes;
            if (i8 == 256) {
            }
            i9 = 0;
            while (true) {
                if (i9 < immutableList.size()) {
                }
                i9++;
            }
            this.preferredMimeTypeMatchIndex = i6;
            this.preferredLabelMatchIndex = DefaultTrackSelector.access$4300(this.f885format, parameters.preferredVideoLabels);
            this.usesPrimaryOrFallbackDecoder = i8 != 128 || i8 == 256;
            if (i8 != 128) {
            }
            this.usesPrimaryDecoder = z4;
            this.usesHardwareAcceleration = (i3 & 64) != 64;
            this.resolvedMimeType = str2;
            if (str2 != null) {
            }
            i10 = 0;
            this.codecPreferenceScore = i10;
            if (z4) {
            }
            z5 = false;
            this.isHdr = z5;
            z6 = this.isWithinMaxConstraints;
            Parameters parameters222222 = this.parameters;
            format2 = this.f885format;
            if ((format2.roleFlags & 16384) == 0) {
            }
            this.selectionEligibility = i19;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean isCompatibleForAdaptationWith(TrackInfo trackInfo) {
            VideoTrackInfo videoTrackInfo = (VideoTrackInfo) trackInfo;
            if (!this.allowMixedMimeTypes && !Objects.equals(this.resolvedMimeType, videoTrackInfo.resolvedMimeType)) {
                return false;
            }
            this.parameters.getClass();
            return this.usesPrimaryOrFallbackDecoder == videoTrackInfo.usesPrimaryOrFallbackDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    public DefaultTrackSelector(Context context) {
        CoroutinesRoom.Companion companion = new CoroutinesRoom.Companion(12);
        Parameters parameters = Parameters.DEFAULT;
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = companion;
        if (parameters != null) {
            this.parameters = parameters;
        } else {
            parameters.getClass();
            Parameters.Builder builder = new Parameters.Builder(parameters);
            builder.init(parameters);
            this.parameters = new Parameters(builder);
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int access$4300(Format format2, ImmutableList immutableList) {
        for (int i = 0; i < immutableList.size(); i++) {
            for (int i2 = 0; i2 < format2.labels.size(); i2++) {
                if (((Label) format2.labels.get(i2)).value.equals(immutableList.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void applyLegacyRendererOverrides(MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int i = mappingTrackSelector$MappedTrackInfo.rendererCount;
        for (int i2 = 0; i2 < i; i2++) {
            TrackGroupArray trackGroupArray = mappingTrackSelector$MappedTrackInfo.rendererTrackGroups[i2];
            Map map = (Map) parameters.selectionOverrides.get(i2);
            if (map != null && map.containsKey(trackGroupArray)) {
                Map map2 = (Map) parameters.selectionOverrides.get(i2);
                if (map2 != null && map2.get(trackGroupArray) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                definitionArr[i2] = null;
            }
        }
    }

    public static void applyRendererDisableOverrides(MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        for (int i = 0; i < mappingTrackSelector$MappedTrackInfo.rendererCount; i++) {
            int i2 = mappingTrackSelector$MappedTrackInfo.rendererTrackTypes[i];
            if (parameters.rendererDisabledFlags.get(i) || parameters.disabledTrackTypes.contains(Integer.valueOf(i2))) {
                definitionArr[i] = null;
            }
        }
    }

    public static void applyTrackSelectionOverrides(MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        ExoTrackSelection.Definition definition;
        int i = mappingTrackSelector$MappedTrackInfo.rendererCount;
        TrackGroupArray[] trackGroupArrayArr = mappingTrackSelector$MappedTrackInfo.rendererTrackGroups;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            collectTrackSelectionOverrides(trackGroupArrayArr[i2], parameters, hashMap);
        }
        collectTrackSelectionOverrides(mappingTrackSelector$MappedTrackInfo.unmappedTrackGroups, parameters, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) hashMap.get(Integer.valueOf(mappingTrackSelector$MappedTrackInfo.rendererTrackTypes[i3]));
            if (trackSelectionOverride != null) {
                TrackGroup trackGroup = trackSelectionOverride.mediaTrackGroup;
                ImmutableList immutableList = trackSelectionOverride.trackIndices;
                if (!immutableList.isEmpty()) {
                    int indexOf = trackGroupArrayArr[i3].trackGroups.indexOf(trackGroup);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        definition = new ExoTrackSelection.Definition(trackGroup, CompositeException.WrappedPrintStream.toArray(immutableList));
                        definitionArr[i3] = definition;
                    }
                }
                definition = null;
                definitionArr[i3] = definition;
            }
        }
    }

    public static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, HashMap hashMap) {
        for (int i = 0; i < trackGroupArray.length; i++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride != null) {
                TrackGroup trackGroup = trackSelectionOverride.mediaTrackGroup;
                TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) hashMap.get(Integer.valueOf(trackGroup.f871type));
                if (trackSelectionOverride2 == null || (trackSelectionOverride2.trackIndices.isEmpty() && !trackSelectionOverride.trackIndices.isEmpty())) {
                    hashMap.put(Integer.valueOf(trackGroup.f871type), trackSelectionOverride);
                }
            }
        }
    }

    public static Pair findDefinitionForType(ExoTrackSelection.Definition[] definitionArr, int i) {
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition != null && definition.group.f871type == i) {
                return Pair.create(definition, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int getFormatLanguageScore(Format format2, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format2.language)) {
            return 4;
        }
        String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format2.language);
        if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
            return (z && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        String str2 = Util.DEVICE_DEBUG_INFO;
        return normalizeUndeterminedLanguageToNull2.split("-", 2)[0].equals(normalizeUndeterminedLanguageToNull.split("-", 2)[0]) ? 2 : 0;
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static ExoTrackSelection.Definition selectOtherTrack(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        parameters.audioOffloadPreferences.getClass();
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroupArray.length; i2++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < trackGroup2.length; i3++) {
                if (BaseRenderer.isFormatSupported(iArr2[i3], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.formats[i3], iArr2[i3]);
                    if (otherTrackScore != null) {
                        if (ComparisonChain.ACTIVE.compareFalseFirst(otherTrackScore2.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(otherTrackScore2.isDefault, otherTrackScore.isDefault).result() <= 0) {
                        }
                    }
                    trackGroup = trackGroup2;
                    i = i3;
                    otherTrackScore = otherTrackScore2;
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i);
    }

    public static Pair selectTracksForType(int i, MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo, int[][][] iArr, TrackInfo.Factory factory, Comparator comparator) {
        int i2;
        RandomAccess randomAccess;
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int i3 = mappingTrackSelector$MappedTrackInfo2.rendererCount;
        int i4 = 0;
        while (i4 < i3) {
            if (i == mappingTrackSelector$MappedTrackInfo2.rendererTrackTypes[i4]) {
                TrackGroupArray trackGroupArray = mappingTrackSelector$MappedTrackInfo2.rendererTrackGroups[i4];
                for (int i5 = 0; i5 < trackGroupArray.length; i5++) {
                    TrackGroup trackGroup = trackGroupArray.get(i5);
                    RegularImmutableList create = factory.create(i4, trackGroup, iArr[i4][i5]);
                    int i6 = trackGroup.length;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        TrackInfo trackInfo = (TrackInfo) create.get(i7);
                        int selectionEligibility = trackInfo.getSelectionEligibility();
                        if (zArr[i7] || selectionEligibility == 0) {
                            i2 = i3;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccess = ImmutableList.of((Object) trackInfo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(trackInfo);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    TrackInfo trackInfo2 = (TrackInfo) create.get(i8);
                                    int i9 = i3;
                                    if (trackInfo2.getSelectionEligibility() == 2 && trackInfo.isCompatibleForAdaptationWith(trackInfo2)) {
                                        arrayList2.add(trackInfo2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccess = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccess);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            mappingTrackSelector$MappedTrackInfo2 = mappingTrackSelector$MappedTrackInfo;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((TrackInfo) list.get(i10)).trackIndex;
        }
        TrackInfo trackInfo3 = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo3.trackGroup, iArr2), Integer.valueOf(trackInfo3.rendererIndex));
    }

    public final Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    public final void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        ExoPlayerImplInternal exoPlayerImplInternal;
        SpatializerWrapper spatializerWrapper;
        synchronized (this.lock) {
            try {
                z = this.parameters.constrainAudioChannelCountToDeviceCapabilities && Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null && spatializerWrapper.spatializationSupported;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (exoPlayerImplInternal = this.listener) == null) {
            return;
        }
        exoPlayerImplInternal.handler.sendEmptyMessage(10);
    }

    public final void release() {
        SpatializerWrapper spatializerWrapper;
        synchronized (this.lock) {
            try {
                Thread thread = this.playbackThread;
                if (thread != null) {
                    Trace.checkState("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            spatializerWrapper.release();
            this.spatializer = null;
        }
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public final void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        Parameters.Builder builder = new Parameters.Builder(getParameters());
        builder.init(trackSelectionParameters);
        setParametersInternal(new Parameters(builder));
    }

    public final void setParametersInternal(Parameters parameters) {
        boolean equals;
        synchronized (this.lock) {
            equals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (equals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            Log.w("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        ExoPlayerImplInternal exoPlayerImplInternal = this.listener;
        if (exoPlayerImplInternal != null) {
            exoPlayerImplInternal.handler.sendEmptyMessage(10);
        }
    }

    public final class Parameters extends TrackSelectionParameters {
        public static final Parameters DEFAULT = new Parameters(new Builder());
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final SparseBooleanArray rendererDisabledFlags;
        public final SparseArray selectionOverrides;

        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_COLOR_TABLE, 1004);
            Fragment$5$$ExternalSyntheticOutline0.m$1(IptcConstants.IMAGE_RESOURCE_BLOCK_RESOLUTION_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES, IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION);
            Fragment$5$$ExternalSyntheticOutline0.m$1(IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR, IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO);
            Util.intToStringMaxRadix(IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC);
            Util.intToStringMaxRadix(IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
            Util.intToStringMaxRadix(IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS);
            Util.intToStringMaxRadix(IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO);
        }

        public Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final TrackSelectionParameters.Builder buildUpon() {
            return new Builder(this);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections) {
                    SparseBooleanArray sparseBooleanArray = parameters.rendererDisabledFlags;
                    SparseBooleanArray sparseBooleanArray2 = this.rendererDisabledFlags;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray sparseArray = parameters.selectionOverrides;
                                SparseArray sparseArray2 = this.selectionOverrides;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i2);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                                    if (map2.containsKey(trackGroupArray) && Objects.equals(entry.getValue(), map2.get(trackGroupArray))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 961) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 961) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 28629151) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 961) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31;
        }

        public final class Builder extends TrackSelectionParameters.Builder {
            public final boolean allowAudioNonSeamlessAdaptiveness;
            public final boolean allowMultipleAdaptiveSelections;
            public final boolean allowVideoNonSeamlessAdaptiveness;
            public final boolean constrainAudioChannelCountToDeviceCapabilities;
            public final boolean exceedAudioConstraintsIfNecessary;
            public final boolean exceedRendererCapabilitiesIfNecessary;
            public final boolean exceedVideoConstraintsIfNecessary;
            public final SparseBooleanArray rendererDisabledFlags;
            public final SparseArray selectionOverrides;

            public Builder(Parameters parameters) {
                init(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                SparseArray sparseArray = parameters.selectionOverrides;
                SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
                }
                this.selectionOverrides = sparseArray2;
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters build() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            public final void setDisabledTrackTypes(Set set) {
                this.disabledTrackTypes.clear();
                this.disabledTrackTypes.addAll(set);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setIgnoredTextSelectionFlags() {
                this.ignoredTextSelectionFlags = -3;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setPreferredTextLanguage() {
                super.setPreferredTextLanguage();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setPreferredTextLanguages(String[] strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setPreferredTextRoleFlags() {
                this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = false;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public final TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            public Builder() {
                this.selectionOverrides = new SparseArray();
                this.rendererDisabledFlags = new SparseBooleanArray();
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.allowMultipleAdaptiveSelections = true;
            }
        }
    }
}
