package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.FixedTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector$MappedTrackInfo;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ng$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import com.google.common.collect.Multimaps$CustomListMultimap;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class MediaPeriodHolder {
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    public final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    public final MediaSourceList mediaSourceList;
    public MediaPeriodHolder next;
    public boolean prepareCalled;
    public boolean prepared;
    public final BaseRenderer[] rendererCapabilities;
    public long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    public TrackGroupArray trackGroups;
    public final DefaultTrackSelector trackSelector;
    public TrackSelectorResult trackSelectorResult;
    public final Object uid;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.ClippingMediaPeriod] */
    public MediaPeriodHolder(BaseRenderer[] baseRendererArr, long j, DefaultTrackSelector defaultTrackSelector, Recorder.AnonymousClass3 anonymousClass3, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        this.rendererCapabilities = baseRendererArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = defaultTrackSelector;
        this.mediaSourceList = mediaSourceList;
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = mediaPeriodInfo.id;
        this.uid = mediaSource$MediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.trackGroups = TrackGroupArray.EMPTY;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new SampleStream[baseRendererArr.length];
        this.mayRetainStreamFlags = new boolean[baseRendererArr.length];
        long j2 = mediaPeriodInfo.startPositionUs;
        long j3 = mediaPeriodInfo.endPositionUs;
        boolean z = mediaPeriodInfo.isPrecededByTransitionFromSameStream;
        mediaSourceList.getClass();
        Object obj = mediaSource$MediaPeriodId.periodUid;
        int i = PlaylistTimeline.$r8$clinit;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        MediaSource$MediaPeriodId copyWithPeriodUid = mediaSource$MediaPeriodId.copyWithPeriodUid(pair.second);
        MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) ((HashMap) mediaSourceList.mediaSourceByUid).get(obj2);
        mediaSourceHolder.getClass();
        ((HashSet) mediaSourceList.enabledMediaSourceHolders).add(mediaSourceHolder);
        MediaSourceList.MediaSourceAndListener mediaSourceAndListener = (MediaSourceList.MediaSourceAndListener) ((HashMap) mediaSourceList.childSources).get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
        mediaSourceHolder.activeMediaPeriodIds.add(copyWithPeriodUid);
        MaskingMediaPeriod createPeriod = mediaSourceHolder.mediaSource.createPeriod(copyWithPeriodUid, anonymousClass3, j2);
        ((IdentityHashMap) mediaSourceList.mediaSourceByMediaPeriod).put(createPeriod, mediaSourceHolder);
        mediaSourceList.disableUnusedMediaSources();
        if (j3 != -9223372036854775807L) {
            createPeriod = new ClippingMediaPeriod(createPeriod, !z, 0L, j3, 0);
        }
        this.mediaPeriod = createPeriod;
    }

    public final long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
        BaseRenderer[] baseRendererArr;
        SampleStream[] sampleStreamArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult.length) {
                break;
            }
            if (z || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i)) {
                z2 = false;
            }
            this.mayRetainStreamFlags[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            baseRendererArr = this.rendererCapabilities;
            int length = baseRendererArr.length;
            sampleStreamArr = this.sampleStreams;
            if (i2 >= length) {
                break;
            }
            if (baseRendererArr[i2].trackType == -2) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j);
        for (int i3 = 0; i3 < baseRendererArr.length; i3++) {
            if (baseRendererArr[i3].trackType == -2 && this.trackSelectorResult.isRendererEnabled(i3)) {
                sampleStreamArr[i3] = new CueEncoder(12);
            }
        }
        this.hasEnabledTracks = false;
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            if (sampleStreamArr[i4] != null) {
                Trace.checkState(trackSelectorResult.isRendererEnabled(i4));
                if (baseRendererArr[i4].trackType != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Trace.checkState(trackSelectorResult.selections[i4] == null);
            }
        }
        return selectTracks;
    }

    public final void disableTrackSelectionsInResult() {
        if (this.next != null) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i++;
        }
    }

    public final void enableTrackSelectionsInResult() {
        if (this.next != null) {
            return;
        }
        int i = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i++;
        }
    }

    public final long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    public final long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public final void handlePrepared(float f, Timeline timeline, boolean z) {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        TrackSelectorResult selectTracks = selectTracks(f, timeline, z);
        MediaPeriodInfo mediaPeriodInfo = this.info;
        long j = mediaPeriodInfo.startPositionUs;
        long j2 = mediaPeriodInfo.durationUs;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j, false, new boolean[this.rendererCapabilities.length]);
        long j3 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = (mediaPeriodInfo2.startPositionUs - applyTrackSelection) + j3;
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(applyTrackSelection, mediaPeriodInfo2.liveStreamStartPositionProjectionUs);
    }

    public final boolean isFullyBuffered() {
        if (this.prepared) {
            return !this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean isFullyPreloaded() {
        if (this.prepared) {
            return isFullyBuffered() || getBufferedPositionUs() - this.info.startPositionUs >= -9223372036854775807L;
        }
        return false;
    }

    public final void release() {
        disableTrackSelectionsInResult();
        MediaPeriod mediaPeriod = this.mediaPeriod;
        try {
            boolean z = mediaPeriod instanceof ClippingMediaPeriod;
            MediaSourceList mediaSourceList = this.mediaSourceList;
            if (z) {
                mediaSourceList.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final TrackSelectorResult selectTracks(float f, Timeline timeline, boolean z) {
        final DefaultTrackSelector.Parameters parameters;
        String str;
        RegularImmutableList build;
        boolean z2;
        RegularImmutableList regularImmutableList;
        FixedTrackSelection fixedTrackSelection;
        int i;
        int[] iArr;
        long[][] jArr;
        int i2;
        int i3;
        int[] iArr2;
        String str2;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pair;
        final boolean z3;
        Context context;
        int[] iArr3;
        final DefaultTrackSelector defaultTrackSelector = this.trackSelector;
        BaseRenderer[] baseRendererArr = this.rendererCapabilities;
        TrackGroupArray trackGroupArray = this.trackGroups;
        defaultTrackSelector.getClass();
        int i4 = 1;
        int[] iArr4 = new int[baseRendererArr.length + 1];
        int length = baseRendererArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr5 = new int[baseRendererArr.length + 1][][];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = trackGroupArray.length;
            trackGroupArr[i5] = new TrackGroup[i6];
            iArr5[i5] = new int[i6][];
        }
        int length2 = baseRendererArr.length;
        final int[] iArr6 = new int[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            iArr6[i7] = baseRendererArr[i7].supportsMixedMimeTypeAdaptation();
        }
        int i8 = 0;
        while (i8 < trackGroupArray.length) {
            TrackGroup trackGroup = trackGroupArray.get(i8);
            int i9 = trackGroup.f871type == 5 ? i4 : 0;
            int length3 = baseRendererArr.length;
            int i10 = i4;
            int i11 = 0;
            int i12 = 0;
            while (i11 < baseRendererArr.length) {
                BaseRenderer baseRenderer = baseRendererArr[i11];
                TrackGroupArray trackGroupArray2 = trackGroupArray;
                int[] iArr7 = iArr4;
                int i13 = i4;
                int i14 = 0;
                for (int i15 = 0; i15 < trackGroup.length; i15++) {
                    i14 = Math.max(i14, baseRenderer.supportsFormat(trackGroup.formats[i15]) & 7);
                }
                int i16 = iArr7[i11] == 0 ? i13 : 0;
                if (i14 > i12 || (i14 == i12 && i9 != 0 && i10 == 0 && i16 != 0)) {
                    i12 = i14;
                    i10 = i16;
                    length3 = i11;
                }
                i11++;
                i4 = i13;
                trackGroupArray = trackGroupArray2;
                iArr4 = iArr7;
            }
            TrackGroupArray trackGroupArray3 = trackGroupArray;
            int[] iArr8 = iArr4;
            int i17 = i4;
            if (length3 == baseRendererArr.length) {
                iArr3 = new int[trackGroup.length];
            } else {
                BaseRenderer baseRenderer2 = baseRendererArr[length3];
                int[] iArr9 = new int[trackGroup.length];
                for (int i18 = 0; i18 < trackGroup.length; i18++) {
                    iArr9[i18] = baseRenderer2.supportsFormat(trackGroup.formats[i18]);
                }
                iArr3 = iArr9;
            }
            int i19 = iArr8[length3];
            trackGroupArr[length3][i19] = trackGroup;
            iArr5[length3][i19] = iArr3;
            iArr8[length3] = i19 + 1;
            i8++;
            i4 = i17;
            trackGroupArray = trackGroupArray3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i20 = i4;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[baseRendererArr.length];
        String[] strArr = new String[baseRendererArr.length];
        int[] iArr11 = new int[baseRendererArr.length];
        for (int i21 = 0; i21 < baseRendererArr.length; i21++) {
            int i22 = iArr10[i21];
            trackGroupArrayArr[i21] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(i22, trackGroupArr[i21]));
            iArr5[i21] = (int[][]) Util.nullSafeArrayCopy(i22, iArr5[i21]);
            strArr[i21] = baseRendererArr[i21].getName();
            iArr11[i21] = baseRendererArr[i21].trackType;
        }
        MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo = new MappingTrackSelector$MappedTrackInfo(iArr11, trackGroupArrayArr, iArr6, iArr5, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(iArr10[baseRendererArr.length], trackGroupArr[baseRendererArr.length])));
        synchronized (defaultTrackSelector.lock) {
            defaultTrackSelector.playbackThread = Thread.currentThread();
            parameters = defaultTrackSelector.parameters;
        }
        if (defaultTrackSelector.deviceIsTV == null && (context = defaultTrackSelector.context) != null) {
            defaultTrackSelector.deviceIsTV = Boolean.valueOf(Util.isTv(context));
        }
        int i23 = 16;
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && Build.VERSION.SDK_INT >= 32 && defaultTrackSelector.spatializer == null) {
            defaultTrackSelector.spatializer = new SpatializerWrapper(defaultTrackSelector.context, new AFd1lSDK$$ExternalSyntheticLambda0(defaultTrackSelector, i23), defaultTrackSelector.deviceIsTV);
        }
        int i24 = mappingTrackSelector$MappedTrackInfo.rendererCount;
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[i24];
        DefaultTrackSelector.applyTrackSelectionOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        DefaultTrackSelector.applyLegacyRendererOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        DefaultTrackSelector.applyRendererDisableOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        Context context2 = defaultTrackSelector.context;
        int i25 = mappingTrackSelector$MappedTrackInfo.rendererCount;
        Pair findDefinitionForType = DefaultTrackSelector.findDefinitionForType(definitionArr, i20);
        if (findDefinitionForType == null) {
            int i26 = 0;
            while (true) {
                if (i26 >= i25) {
                    z3 = false;
                    break;
                }
                if (2 == iArr11[i26] && trackGroupArrayArr[i26].length > 0) {
                    z3 = true;
                    break;
                }
                i26++;
            }
            findDefinitionForType = DefaultTrackSelector.selectTracksForType(1, mappingTrackSelector$MappedTrackInfo, iArr5, new DefaultTrackSelector.TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
                @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
                public final RegularImmutableList create(int i27, TrackGroup trackGroup2, int[] iArr12) {
                    DefaultTrackSelector defaultTrackSelector2 = DefaultTrackSelector.this;
                    defaultTrackSelector2.getClass();
                    DefaultTrackSelector.Parameters parameters2 = parameters;
                    DefaultTrackSelector$$ExternalSyntheticLambda10 defaultTrackSelector$$ExternalSyntheticLambda10 = new DefaultTrackSelector$$ExternalSyntheticLambda10(defaultTrackSelector2, parameters2);
                    int i28 = iArr6[i27];
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (int i29 = 0; i29 < trackGroup2.length; i29++) {
                        builder.m2032add((Object) new DefaultTrackSelector.AudioTrackInfo(i27, trackGroup2, i29, parameters2, iArr12[i29], z3, defaultTrackSelector$$ExternalSyntheticLambda10, i28));
                    }
                    return builder.build();
                }
            }, new ng$$ExternalSyntheticLambda0(11));
            if (findDefinitionForType != null) {
                definitionArr[((Integer) findDefinitionForType.second).intValue()] = (ExoTrackSelection.Definition) findDefinitionForType.first;
            }
        }
        if (findDefinitionForType == null) {
            str = null;
        } else {
            ExoTrackSelection.Definition definition = (ExoTrackSelection.Definition) findDefinitionForType.first;
            str = definition.group.formats[definition.tracks[0]].language;
        }
        Pair findDefinitionForType2 = DefaultTrackSelector.findDefinitionForType(definitionArr, 2);
        Pair findDefinitionForType3 = DefaultTrackSelector.findDefinitionForType(definitionArr, 4);
        if (findDefinitionForType2 == null && findDefinitionForType3 == null) {
            parameters.audioOffloadPreferences.getClass();
            Pair selectTracksForType = DefaultTrackSelector.selectTracksForType(2, mappingTrackSelector$MappedTrackInfo, iArr5, new DefaultTrackSelector$$ExternalSyntheticLambda4(parameters, str, iArr6, (!parameters.isViewportSizeLimitedByPhysicalDisplaySize || context2 == null) ? null : Util.getCurrentDisplayModeSize(context2)), new ng$$ExternalSyntheticLambda0(10));
            if (selectTracksForType == null) {
                parameters.audioOffloadPreferences.getClass();
                pair = DefaultTrackSelector.selectTracksForType(4, mappingTrackSelector$MappedTrackInfo, iArr5, new ExoPlayerImplInternal$$ExternalSyntheticLambda2(parameters, 8), new ng$$ExternalSyntheticLambda0(9));
            } else {
                pair = null;
            }
            if (pair != null) {
                definitionArr[((Integer) pair.second).intValue()] = (ExoTrackSelection.Definition) pair.first;
            } else if (selectTracksForType != null) {
                definitionArr[((Integer) selectTracksForType.second).intValue()] = (ExoTrackSelection.Definition) selectTracksForType.first;
            }
        }
        if (DefaultTrackSelector.findDefinitionForType(definitionArr, 3) == null) {
            parameters.audioOffloadPreferences.getClass();
            if (!parameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str2 = null;
            } else {
                String str3 = Util.DEVICE_DEBUG_INFO;
                str2 = locale.toLanguageTag();
            }
            Pair selectTracksForType2 = DefaultTrackSelector.selectTracksForType(3, mappingTrackSelector$MappedTrackInfo, iArr5, new PreviewView$1$$ExternalSyntheticLambda2(4, parameters, str, str2), new ng$$ExternalSyntheticLambda0(12));
            if (selectTracksForType2 != null) {
                definitionArr[((Integer) selectTracksForType2.second).intValue()] = (ExoTrackSelection.Definition) selectTracksForType2.first;
            }
        }
        parameters.audioOffloadPreferences.getClass();
        int i27 = ImmutableSet.$r8$clinit;
        ImmutableSet.Builder builder = new ImmutableSet.Builder(4);
        int create = BaseRenderer.create(0, 0, 0, 0);
        int i28 = 0;
        while (i28 < i24) {
            ExoTrackSelection.Definition definition2 = definitionArr[i28];
            if (definition2 != null) {
                TrackGroup trackGroup2 = definition2.group;
                if (!parameters.rendererDisabledFlags.get(i28)) {
                    i3 = i28;
                    if (!parameters.disabledTrackTypes.contains(Integer.valueOf(trackGroup2.f871type))) {
                        builder.add((Object) trackGroup2.id);
                        int i29 = 0;
                        while (true) {
                            int[] iArr12 = definition2.tracks;
                            iArr2 = iArr11;
                            if (i29 < iArr12.length) {
                                String str4 = trackGroup2.formats[iArr12[i29]].primaryTrackGroupId;
                                if (str4 != null) {
                                    builder.m2032add((Object) str4);
                                }
                                i29++;
                                iArr11 = iArr2;
                            }
                        }
                        i28 = i3 + 1;
                        iArr11 = iArr2;
                    }
                    iArr2 = iArr11;
                    i28 = i3 + 1;
                    iArr11 = iArr2;
                }
            }
            i3 = i28;
            iArr2 = iArr11;
            i28 = i3 + 1;
            iArr11 = iArr2;
        }
        int[] iArr13 = iArr11;
        ImmutableSet build2 = builder.build();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i30 = 0;
        while (i30 < i25) {
            if (iArr13[i30] != 5) {
                i2 = i30;
            } else {
                TrackGroupArray trackGroupArray4 = trackGroupArrayArr[i30];
                i2 = i30;
                int i31 = 0;
                while (i31 < trackGroupArray4.length) {
                    TrackGroup trackGroup3 = trackGroupArray4.get(i31);
                    arrayList.add(trackGroup3);
                    TrackGroupArray[] trackGroupArrayArr2 = trackGroupArrayArr;
                    int[] iArr14 = (int[]) iArr5[i2][i31].clone();
                    int[][][] iArr15 = iArr5;
                    TrackGroupArray trackGroupArray5 = trackGroupArray4;
                    for (int i32 = 0; i32 < iArr14.length; i32++) {
                        String str5 = trackGroup3.formats[i32].primaryTrackGroupId;
                        if (str5 != null && !build2.contains(str5)) {
                            iArr14[i32] = create;
                        }
                    }
                    arrayList2.add(iArr14);
                    i31++;
                    iArr5 = iArr15;
                    trackGroupArrayArr = trackGroupArrayArr2;
                    trackGroupArray4 = trackGroupArray5;
                }
            }
            i30 = i2 + 1;
            iArr5 = iArr5;
            trackGroupArrayArr = trackGroupArrayArr;
        }
        TrackGroupArray[] trackGroupArrayArr3 = trackGroupArrayArr;
        int[][][] iArr16 = iArr5;
        int size = arrayList.size();
        TrackGroup[] trackGroupArr2 = new TrackGroup[size];
        Trace.checkState(arrayList.size() == size);
        arrayList.toArray(trackGroupArr2);
        TrackGroupArray trackGroupArray6 = new TrackGroupArray(trackGroupArr2);
        int size2 = arrayList2.size();
        int[][] iArr17 = new int[size2][];
        Trace.checkState(arrayList2.size() == size2);
        arrayList2.toArray(iArr17);
        for (int i33 = 0; i33 < i25; i33++) {
            if (iArr13[i33] == 5) {
                ExoTrackSelection.Definition selectOtherTrack = DefaultTrackSelector.selectOtherTrack(trackGroupArray6, iArr17, parameters);
                definitionArr[i33] = selectOtherTrack;
                if (selectOtherTrack == null) {
                    break;
                }
                int indexOf = trackGroupArray6.trackGroups.indexOf(selectOtherTrack.group);
                Arrays.fill(iArr17[indexOf >= 0 ? indexOf : -1], create);
            }
        }
        for (int i34 = 0; i34 < i25; i34++) {
            int i35 = iArr13[i34];
            if (i35 != 2 && i35 != 1) {
                if (i35 != 3 && i35 != 4) {
                    if (i35 != 5 && definitionArr[i34] == null) {
                        definitionArr[i34] = DefaultTrackSelector.selectOtherTrack(trackGroupArrayArr3[i34], iArr16[i34], parameters);
                    }
                }
            }
        }
        DefaultTrackSelector.applyTrackSelectionOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        DefaultTrackSelector.applyLegacyRendererOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        DefaultTrackSelector.applyRendererDisableOverrides(mappingTrackSelector$MappedTrackInfo, parameters, definitionArr);
        CoroutinesRoom.Companion companion = defaultTrackSelector.trackSelectionFactory;
        defaultTrackSelector.bandwidthMeter.getClass();
        companion.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (ExoTrackSelection.Definition definition3 : definitionArr) {
            if (definition3 == null || definition3.tracks.length <= 1) {
                arrayList3.add(null);
            } else {
                ImmutableList.Builder builder2 = ImmutableList.builder();
                builder2.m2032add((Object) new AdaptiveTrackSelection$AdaptationCheckpoint(0L, 0L));
                arrayList3.add(builder2);
            }
        }
        int length4 = definitionArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i36 = 0; i36 < definitionArr.length; i36++) {
            ExoTrackSelection.Definition definition4 = definitionArr[i36];
            if (definition4 == null) {
                jArr2[i36] = new long[0];
            } else {
                int[] iArr18 = definition4.tracks;
                jArr2[i36] = new long[iArr18.length];
                for (int i37 = 0; i37 < iArr18.length; i37++) {
                    long j = definition4.group.formats[iArr18[i37]].bitrate;
                    long[] jArr3 = jArr2[i36];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i37] = j;
                }
                Arrays.sort(jArr2[i36]);
            }
        }
        int[] iArr19 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i38 = 0; i38 < length4; i38++) {
            long[] jArr5 = jArr2[i38];
            jArr4[i38] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        FixedTrackSelection.addCheckpoint(arrayList3, jArr4);
        DimensionKt.checkNonnegative(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(NaturalOrdering.INSTANCE);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        Trace.checkArgument(treeMap.isEmpty());
        multimaps$CustomListMultimap.map = treeMap;
        multimaps$CustomListMultimap.factory = multimapBuilder$ArrayListSupplier;
        int i39 = 0;
        loop19: while (true) {
            if (i39 < length4) {
                long[] jArr6 = jArr2[i39];
                if (jArr6.length <= 1) {
                    i = length4;
                    iArr = iArr19;
                    jArr = jArr2;
                } else {
                    int length5 = jArr6.length;
                    double[] dArr = new double[length5];
                    int i40 = 0;
                    while (true) {
                        long[] jArr7 = jArr2[i39];
                        i = length4;
                        double d = 0.0d;
                        if (i40 >= jArr7.length) {
                            break;
                        }
                        int[] iArr20 = iArr19;
                        long[][] jArr8 = jArr2;
                        long j2 = jArr7[i40];
                        if (j2 != -1) {
                            d = Math.log(j2);
                        }
                        dArr[i40] = d;
                        i40++;
                        jArr2 = jArr8;
                        length4 = i;
                        iArr19 = iArr20;
                    }
                    iArr = iArr19;
                    long[][] jArr9 = jArr2;
                    int i41 = length5 - 1;
                    double d2 = dArr[i41] - dArr[0];
                    int i42 = 0;
                    while (i42 < i41) {
                        double d3 = dArr[i42];
                        i42++;
                        Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i42]) * 0.5d) - dArr[0]) / d2);
                        long[][] jArr10 = jArr9;
                        Integer valueOf2 = Integer.valueOf(i39);
                        double d4 = d2;
                        Map map = multimaps$CustomListMultimap.map;
                        Collection collection = (Collection) map.get(valueOf);
                        if (collection == null) {
                            List list = (List) multimaps$CustomListMultimap.factory.get();
                            if (!list.add(valueOf2)) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) "New Collection violated the Collection spec");
                                build = null;
                                break loop19;
                            }
                            multimaps$CustomListMultimap.totalSize++;
                            map.put(valueOf, list);
                        } else if (collection.add(valueOf2)) {
                            multimaps$CustomListMultimap.totalSize++;
                        }
                        jArr9 = jArr10;
                        d2 = d4;
                    }
                    jArr = jArr9;
                }
                i39++;
                length4 = i;
                iArr19 = iArr;
                jArr2 = jArr;
            } else {
                int[] iArr21 = iArr19;
                long[][] jArr11 = jArr2;
                Collection collection2 = multimaps$CustomListMultimap.values;
                if (collection2 == null) {
                    collection2 = new Maps.Values(multimaps$CustomListMultimap, 8);
                    multimaps$CustomListMultimap.values = collection2;
                }
                ImmutableList copyOf = ImmutableList.copyOf(collection2);
                for (int i43 = 0; i43 < copyOf.size(); i43++) {
                    int intValue = ((Integer) copyOf.get(i43)).intValue();
                    int i44 = iArr21[intValue] + 1;
                    iArr21[intValue] = i44;
                    jArr4[intValue] = jArr11[intValue][i44];
                    FixedTrackSelection.addCheckpoint(arrayList3, jArr4);
                }
                for (int i45 = 0; i45 < definitionArr.length; i45++) {
                    if (arrayList3.get(i45) != null) {
                        jArr4[i45] = jArr4[i45] * 2;
                    }
                }
                FixedTrackSelection.addCheckpoint(arrayList3, jArr4);
                ImmutableList.Builder builder3 = ImmutableList.builder();
                for (int i46 = 0; i46 < arrayList3.size(); i46++) {
                    ImmutableList.Builder builder4 = (ImmutableList.Builder) arrayList3.get(i46);
                    builder3.m2032add((Object) (builder4 == null ? RegularImmutableList.EMPTY : builder4.build()));
                }
                build = builder3.build();
            }
        }
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        for (int i47 = 0; i47 < definitionArr.length; i47++) {
            ExoTrackSelection.Definition definition5 = definitionArr[i47];
            if (definition5 != null) {
                int[] iArr22 = definition5.tracks;
                if (iArr22.length != 0) {
                    int length6 = iArr22.length;
                    TrackGroup trackGroup4 = definition5.group;
                    if (length6 == 1) {
                        fixedTrackSelection = new FixedTrackSelection(0, trackGroup4, new int[]{iArr22[0]});
                    } else {
                        ImmutableList immutableList = (ImmutableList) build.get(i47);
                        FixedTrackSelection fixedTrackSelection2 = new FixedTrackSelection(1, trackGroup4, iArr22);
                        ImmutableList.copyOf((Collection) immutableList);
                        fixedTrackSelection = fixedTrackSelection2;
                    }
                    exoTrackSelectionArr[i47] = fixedTrackSelection;
                }
            }
        }
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[i24];
        for (int i48 = 0; i48 < i24; i48++) {
            rendererConfigurationArr[i48] = (parameters.rendererDisabledFlags.get(i48) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappingTrackSelector$MappedTrackInfo.rendererTrackTypes[i48])) || (mappingTrackSelector$MappedTrackInfo.rendererTrackTypes[i48] != -2 && exoTrackSelectionArr[i48] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        parameters.audioOffloadPreferences.getClass();
        Pair create2 = Pair.create(rendererConfigurationArr, exoTrackSelectionArr);
        ExoTrackSelection[] exoTrackSelectionArr2 = (ExoTrackSelection[]) create2.second;
        int length7 = exoTrackSelectionArr2.length;
        List[] listArr = new List[length7];
        for (int i49 = 0; i49 < exoTrackSelectionArr2.length; i49++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr2[i49];
            if (exoTrackSelection != null) {
                regularImmutableList = ImmutableList.of((Object) exoTrackSelection);
            } else {
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                regularImmutableList = RegularImmutableList.EMPTY;
            }
            listArr[i49] = regularImmutableList;
        }
        ImmutableList.Builder builder5 = new ImmutableList.Builder(4);
        int i50 = 0;
        while (true) {
            int i51 = mappingTrackSelector$MappedTrackInfo.rendererCount;
            TrackGroupArray[] trackGroupArrayArr4 = mappingTrackSelector$MappedTrackInfo.rendererTrackGroups;
            if (i50 >= i51) {
                break;
            }
            TrackGroupArray trackGroupArray7 = trackGroupArrayArr4[i50];
            int i52 = 0;
            while (i52 < trackGroupArray7.length) {
                TrackGroup trackGroup5 = trackGroupArray7.get(i52);
                int i53 = trackGroupArrayArr4[i50].get(i52).length;
                int[] iArr23 = new int[i53];
                int i54 = 0;
                int i55 = 0;
                while (i54 < i53) {
                    List[] listArr2 = listArr;
                    if ((mappingTrackSelector$MappedTrackInfo.rendererFormatSupports[i50][i52][i54] & 7) == 4) {
                        iArr23[i55] = i54;
                        i55++;
                    }
                    i54++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf2 = Arrays.copyOf(iArr23, i55);
                TrackGroupArray trackGroupArray8 = trackGroupArray7;
                String str6 = null;
                int i56 = 0;
                boolean z4 = false;
                int i57 = 0;
                int i58 = 16;
                while (i56 < copyOf2.length) {
                    int[] iArr24 = copyOf2;
                    String str7 = trackGroupArrayArr4[i50].get(i52).formats[copyOf2[i56]].sampleMimeType;
                    int i59 = i57 + 1;
                    if (i57 == 0) {
                        str6 = str7;
                    } else {
                        z4 = (!Objects.equals(str6, str7)) | z4;
                    }
                    i58 = Math.min(i58, mappingTrackSelector$MappedTrackInfo.rendererFormatSupports[i50][i52][i56] & 24);
                    i56++;
                    i57 = i59;
                    copyOf2 = iArr24;
                }
                if (z4) {
                    i58 = Math.min(i58, mappingTrackSelector$MappedTrackInfo.rendererMixedMimeTypeAdaptiveSupports[i50]);
                }
                boolean z5 = i58 != 0;
                int i60 = trackGroup5.length;
                int[] iArr25 = new int[i60];
                boolean[] zArr = new boolean[i60];
                int i61 = 0;
                while (i61 < trackGroup5.length) {
                    iArr25[i61] = mappingTrackSelector$MappedTrackInfo.rendererFormatSupports[i50][i52][i61] & 7;
                    int i62 = 0;
                    boolean z6 = false;
                    while (i62 < length7) {
                        List list2 = listArr3[i62];
                        int i63 = length7;
                        TrackGroupArray[] trackGroupArrayArr5 = trackGroupArrayArr4;
                        int i64 = 0;
                        while (true) {
                            if (i64 < list2.size()) {
                                ExoTrackSelection exoTrackSelection2 = (ExoTrackSelection) list2.get(i64);
                                int i65 = i64;
                                if (exoTrackSelection2.getTrackGroup().equals(trackGroup5) && exoTrackSelection2.indexOf(i61) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i64 = i65 + 1;
                            }
                        }
                        i62++;
                        length7 = i63;
                        trackGroupArrayArr4 = trackGroupArrayArr5;
                    }
                    zArr[i61] = z6;
                    i61++;
                    trackGroupArrayArr4 = trackGroupArrayArr4;
                }
                builder5.m2032add((Object) new Tracks.Group(trackGroup5, z5, iArr25, zArr));
                i52++;
                listArr = listArr3;
                trackGroupArray7 = trackGroupArray8;
                length7 = length7;
                trackGroupArrayArr4 = trackGroupArrayArr4;
            }
            i50++;
        }
        TrackGroupArray trackGroupArray9 = mappingTrackSelector$MappedTrackInfo.unmappedTrackGroups;
        for (int i66 = 0; i66 < trackGroupArray9.length; i66++) {
            TrackGroup trackGroup6 = trackGroupArray9.get(i66);
            int[] iArr26 = new int[trackGroup6.length];
            Arrays.fill(iArr26, 0);
            builder5.m2032add((Object) new Tracks.Group(trackGroup6, false, iArr26, new boolean[trackGroup6.length]));
        }
        TrackSelectorResult trackSelectorResult = new TrackSelectorResult((RendererConfiguration[]) create2.first, (ExoTrackSelection[]) create2.second, new Tracks(builder5.build()), mappingTrackSelector$MappedTrackInfo);
        for (int i67 = 0; i67 < trackSelectorResult.length; i67++) {
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i67);
            ExoTrackSelection[] exoTrackSelectionArr3 = trackSelectorResult.selections;
            if (isRendererEnabled) {
                if (exoTrackSelectionArr3[i67] == null && this.rendererCapabilities[i67].trackType != -2) {
                    z2 = false;
                    Trace.checkState(z2);
                }
                z2 = true;
                Trace.checkState(z2);
            } else {
                Trace.checkState(exoTrackSelectionArr3[i67] == null);
            }
        }
        for (ExoTrackSelection exoTrackSelection3 : trackSelectorResult.selections) {
            if (exoTrackSelection3 != null) {
                exoTrackSelection3.onPlaybackSpeed(f);
                exoTrackSelection3.onPlayWhenReadyChanged(z);
            }
        }
        return trackSelectorResult;
    }

    public final void updateClipping() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j = this.info.endPositionUs;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            clippingMediaPeriod.startUs = 0L;
            clippingMediaPeriod.endUs = j;
        }
    }
}
