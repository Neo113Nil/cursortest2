package androidx.media3.exoplayer.source;

import androidx.camera.video.Recorder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.tracing.Trace;
import androidx.transition.Transition;
import coil3.size.DimensionKt;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import com.google.common.collect.RegularImmutableList;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class MergingMediaSource extends CompositeMediaSource {
    public static final MediaItem PLACEHOLDER_MEDIA_ITEM;
    public final Transition.AnonymousClass1 compositeSequenceableLoaderFactory;
    public final ArrayList mediaPeriods;
    public final BaseMediaSource[] mediaSources;
    public IllegalMergeException mergeError;
    public final ArrayList pendingTimelineSources;
    public int periodCount;
    public long[][] periodTimeOffsetsUs;
    public final Timeline[] timelines;

    public final class IllegalMergeException extends IOException {
    }

    public final class MediaPeriodAndId {
        public final MediaPeriod mediaPeriod;
        public final MediaSource$MediaPeriodId mediaPeriodId;

        public MediaPeriodAndId(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaPeriod mediaPeriod) {
            this.mediaPeriodId = mediaSource$MediaPeriodId;
            this.mediaPeriod = mediaPeriod;
        }
    }

    static {
        IadFrame iadFrame = new IadFrame();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        MediaItem.LiveConfiguration.Builder builder = new MediaItem.LiveConfiguration.Builder();
        PLACEHOLDER_MEDIA_ITEM = new MediaItem("MergingMediaSource", new MediaItem.ClippingProperties(iadFrame), null, new MediaItem.LiveConfiguration(builder), MediaMetadata.EMPTY, MediaItem.RequestMetadata.EMPTY);
    }

    public MergingMediaSource(BaseMediaSource... baseMediaSourceArr) {
        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
        this.mediaSources = baseMediaSourceArr;
        this.compositeSequenceableLoaderFactory = anonymousClass1;
        this.pendingTimelineSources = new ArrayList(Arrays.asList(baseMediaSourceArr));
        this.periodCount = -1;
        this.mediaPeriods = new ArrayList(baseMediaSourceArr.length);
        for (int i = 0; i < baseMediaSourceArr.length; i++) {
            this.mediaPeriods.add(new ArrayList());
        }
        this.timelines = new Timeline[baseMediaSourceArr.length];
        this.periodTimeOffsetsUs = new long[0][];
        new HashMap();
        DimensionKt.checkNonnegative(8, "expectedKeys");
        DimensionKt.checkNonnegative(2, "expectedValuesPerKey");
        CompactHashMap createWithExpectedSize = CompactHashMap.createWithExpectedSize();
        new MultimapBuilder$ArrayListSupplier();
        Trace.checkArgument(createWithExpectedSize.isEmpty());
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final MediaPeriod createPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Recorder.AnonymousClass3 anonymousClass3, long j) {
        BaseMediaSource[] baseMediaSourceArr = this.mediaSources;
        int length = baseMediaSourceArr.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        Timeline[] timelineArr = this.timelines;
        int indexOfPeriod = timelineArr[0].getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid);
        for (int i = 0; i < length; i++) {
            MediaSource$MediaPeriodId copyWithPeriodUid = mediaSource$MediaPeriodId.copyWithPeriodUid(timelineArr[i].getUidOfPeriod(indexOfPeriod));
            mediaPeriodArr[i] = baseMediaSourceArr[i].createPeriod(copyWithPeriodUid, anonymousClass3, j - this.periodTimeOffsetsUs[indexOfPeriod][i]);
            ((List) this.mediaPeriods.get(i)).add(new MediaPeriodAndId(copyWithPeriodUid, mediaPeriodArr[i]));
        }
        return new MergingMediaPeriod(this.compositeSequenceableLoaderFactory, this.periodTimeOffsetsUs[indexOfPeriod], mediaPeriodArr);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final MediaItem getMediaItem() {
        BaseMediaSource[] baseMediaSourceArr = this.mediaSources;
        return baseMediaSourceArr.length > 0 ? baseMediaSourceArr[0].getMediaItem() : PLACEHOLDER_MEDIA_ITEM;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.mediaPeriods;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((MediaPeriodAndId) list.get(i)).mediaPeriodId.equals(mediaSource$MediaPeriodId)) {
                return ((MediaPeriodAndId) ((List) arrayList.get(0)).get(i)).mediaPeriodId;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void maybeThrowSourceInfoRefreshError() {
        IllegalMergeException illegalMergeException = this.mergeError;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void onChildSourceInfoRefreshed(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        Integer num = (Integer) obj;
        if (this.mergeError != null) {
            return;
        }
        if (this.periodCount == -1) {
            this.periodCount = timeline.getPeriodCount();
        } else if (timeline.getPeriodCount() != this.periodCount) {
            this.mergeError = new IllegalMergeException();
            return;
        }
        int length = this.periodTimeOffsetsUs.length;
        Timeline[] timelineArr = this.timelines;
        if (length == 0) {
            this.periodTimeOffsetsUs = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.periodCount, timelineArr.length);
        }
        ArrayList arrayList = this.pendingTimelineSources;
        arrayList.remove(baseMediaSource);
        timelineArr[num.intValue()] = timeline;
        if (arrayList.isEmpty()) {
            refreshSourceInfo(timelineArr[0]);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void prepareSourceInternal(DefaultBandwidthMeter defaultBandwidthMeter) {
        this.mediaTransferListener = defaultBandwidthMeter;
        this.eventHandler = Util.createHandlerForCurrentLooper(null);
        int i = 0;
        while (true) {
            BaseMediaSource[] baseMediaSourceArr = this.mediaSources;
            if (i >= baseMediaSourceArr.length) {
                return;
            }
            prepareChildSource(Integer.valueOf(i), baseMediaSourceArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        MergingMediaPeriod mergingMediaPeriod = (MergingMediaPeriod) mediaPeriod;
        int i = 0;
        while (true) {
            BaseMediaSource[] baseMediaSourceArr = this.mediaSources;
            if (i >= baseMediaSourceArr.length) {
                return;
            }
            List list = (List) this.mediaPeriods.get(i);
            boolean[] zArr = mergingMediaPeriod.periodsWithTimeOffsets;
            MediaPeriod[] mediaPeriodArr = mergingMediaPeriod.periods;
            MediaPeriod mediaPeriod2 = zArr[i] ? ((TimeOffsetMediaPeriod) mediaPeriodArr[i]).mediaPeriod : mediaPeriodArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((MediaPeriodAndId) list.get(i2)).mediaPeriod.equals(mediaPeriod2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            baseMediaSourceArr[i].releasePeriod(mergingMediaPeriod.periodsWithTimeOffsets[i] ? ((TimeOffsetMediaPeriod) mediaPeriodArr[i]).mediaPeriod : mediaPeriodArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.timelines, (Object) null);
        this.periodCount = -1;
        this.mergeError = null;
        ArrayList arrayList = this.pendingTimelineSources;
        arrayList.clear();
        Collections.addAll(arrayList, this.mediaSources);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void updateMediaItem(MediaItem mediaItem) {
        this.mediaSources[0].updateMediaItem(mediaItem);
    }
}
