package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Format;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.f$0 = eventTime;
        this.f$2 = i;
        this.f$1 = j;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = (SubtitleTranscodingTrackOutput) this.f$0;
        CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
        subtitleTranscodingTrackOutput.currentFormat.getClass();
        ImmutableList immutableList = cuesWithTiming.cues;
        long j = cuesWithTiming.durationUs;
        Format$$ExternalSyntheticLambda1 format$$ExternalSyntheticLambda1 = new Format$$ExternalSyntheticLambda1(11);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) format$$ExternalSyntheticLambda1.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        ParsableByteArray parsableByteArray = subtitleTranscodingTrackOutput.parsableScratch;
        parsableByteArray.getClass();
        parsableByteArray.reset(marshall.length, marshall);
        subtitleTranscodingTrackOutput.delegate.sampleData(marshall.length, parsableByteArray);
        long j2 = cuesWithTiming.startTimeUs;
        Format format2 = subtitleTranscodingTrackOutput.currentFormat;
        long j3 = this.f$1;
        if (j2 == -9223372036854775807L) {
            Trace.checkState(format2.subsampleOffsetUs == Long.MAX_VALUE);
        } else {
            long j4 = format2.subsampleOffsetUs;
            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
        }
        subtitleTranscodingTrackOutput.delegate.sampleMetadata(j3, this.f$2 | 1, marshall.length, 0, null);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onBandwidthEstimate((AnalyticsListener.EventTime) this.f$0, this.f$2, this.f$1);
    }

    public /* synthetic */ SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0(SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput, long j, int i) {
        this.f$0 = subtitleTranscodingTrackOutput;
        this.f$1 = j;
        this.f$2 = i;
    }
}
