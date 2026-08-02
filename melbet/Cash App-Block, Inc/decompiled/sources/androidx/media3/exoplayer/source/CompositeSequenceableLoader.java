package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.LoadingInfo;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class CompositeSequenceableLoader implements SequenceableLoader {
    public long lastAudioVideoBufferedPositionUs;
    public final RegularImmutableList loadersWithTrackTypes;

    public final class SequenceableLoaderWithTrackTypes implements SequenceableLoader {
        public final SequenceableLoader loader;
        public final ImmutableList trackTypes;

        public SequenceableLoaderWithTrackTypes(SequenceableLoader sequenceableLoader, List list) {
            this.loader = sequenceableLoader;
            this.trackTypes = ImmutableList.copyOf((Collection) list);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean continueLoading(LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }

    public CompositeSequenceableLoader(List list, List list2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Trace.checkArgument(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builder.m2032add((Object) new SequenceableLoaderWithTrackTypes((SequenceableLoader) list.get(i), (List) list2.get(i)));
        }
        this.loadersWithTrackTypes = builder.build();
        this.lastAudioVideoBufferedPositionUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                RegularImmutableList regularImmutableList = this.loadersWithTrackTypes;
                if (i >= regularImmutableList.size) {
                    break;
                }
                long nextLoadPositionUs2 = ((SequenceableLoaderWithTrackTypes) regularImmutableList.get(i)).loader.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= ((SequenceableLoaderWithTrackTypes) regularImmutableList.get(i)).loader.continueLoading(loadingInfo);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            RegularImmutableList regularImmutableList = this.loadersWithTrackTypes;
            if (i >= regularImmutableList.size) {
                break;
            }
            SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = (SequenceableLoaderWithTrackTypes) regularImmutableList.get(i);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.loader.getBufferedPositionUs();
            ImmutableList immutableList = sequenceableLoaderWithTrackTypes.trackTypes;
            if ((immutableList.contains(1) || immutableList.contains(2) || immutableList.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, bufferedPositionUs);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.lastAudioVideoBufferedPositionUs;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            RegularImmutableList regularImmutableList = this.loadersWithTrackTypes;
            if (i >= regularImmutableList.size) {
                break;
            }
            long nextLoadPositionUs = ((SequenceableLoaderWithTrackTypes) regularImmutableList.get(i)).loader.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            RegularImmutableList regularImmutableList = this.loadersWithTrackTypes;
            if (i >= regularImmutableList.size) {
                return false;
            }
            if (((SequenceableLoaderWithTrackTypes) regularImmutableList.get(i)).loader.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        int i = 0;
        while (true) {
            RegularImmutableList regularImmutableList = this.loadersWithTrackTypes;
            if (i >= regularImmutableList.size) {
                return;
            }
            ((SequenceableLoaderWithTrackTypes) regularImmutableList.get(i)).reevaluateBuffer(j);
            i++;
        }
    }
}
