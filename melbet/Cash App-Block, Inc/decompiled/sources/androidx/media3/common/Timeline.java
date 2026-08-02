package androidx.media3.common;

import android.net.Uri;
import android.util.Pair;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import net.idrnd.misnap.iad.IadFrame;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class Timeline {
    public static final AnonymousClass1 EMPTY = new AnonymousClass1();

    /* renamed from: androidx.media3.common.Timeline$1, reason: invalid class name */
    public final class AnonymousClass1 extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Period getPeriod(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int getPeriodCount() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final Window getWindow(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int getWindowCount() {
            return 0;
        }
    }

    public final class Period {
        public AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Objects.equals(this.id, period.id) && Objects.equals(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Objects.equals(this.adPlaybackState, period.adPlaybackState);
        }

        public final long getAdDurationUs(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.durationsUs[i2];
            }
            return -9223372036854775807L;
        }

        public final int getAdGroupIndexAfterPositionUs(long j) {
            AdPlaybackState.AdGroup adGroup;
            int i;
            AdPlaybackState adPlaybackState = this.adPlaybackState;
            long j2 = this.durationUs;
            int i2 = adPlaybackState.adGroupCount;
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i3 = 0;
                while (i3 < i2) {
                    adPlaybackState.getAdGroup(i3).getClass();
                    adPlaybackState.getAdGroup(i3).getClass();
                    if (0 > j && ((i = (adGroup = adPlaybackState.getAdGroup(i3)).count) == -1 || adGroup.getNextAdIndexToPlay(-1) < i)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    if (j2 != -9223372036854775807L) {
                        adPlaybackState.getAdGroup(i3).getClass();
                        if (0 <= j2) {
                        }
                    }
                    return i3;
                }
            }
            return -1;
        }

        public final int getAdGroupIndexForPositionUs(long j) {
            int i;
            AdPlaybackState adPlaybackState = this.adPlaybackState;
            int i2 = adPlaybackState.adGroupCount;
            int i3 = i2 - 1;
            if (i3 == i2 - 1) {
                adPlaybackState.getAdGroup(i3).getClass();
            }
            while (i3 >= 0 && j != Long.MIN_VALUE) {
                adPlaybackState.getAdGroup(i3).getClass();
                if (j >= 0) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
                int i4 = adGroup.count;
                if (i4 != -1) {
                    while (i < i4) {
                        int i5 = adGroup.states[i];
                        i = (i5 == 0 || i5 == 1) ? 0 : i + 1;
                    }
                }
                return i3;
            }
            return -1;
        }

        public final long getAdGroupTimeUs(int i) {
            this.adPlaybackState.getAdGroup(i).getClass();
            return 0L;
        }

        public final int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.getAdGroup(i).getNextAdIndexToPlay(-1);
        }

        public final int hashCode() {
            Object obj = this.id;
            int hashCode = (EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.positionInWindowUs;
            return this.adPlaybackState.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31);
        }

        public final boolean isLivePostrollPlaceholder(int i) {
            AdPlaybackState adPlaybackState = this.adPlaybackState;
            int i2 = adPlaybackState.adGroupCount;
            if (i != i2 - 1 || i != i2 - 1) {
                return false;
            }
            adPlaybackState.getAdGroup(i).getClass();
            return false;
        }

        public final boolean isServerSideInsertedAdGroup(int i) {
            this.adPlaybackState.getAdGroup(i).getClass();
            return false;
        }

        public final void set(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z;
        }
    }

    public final class Window {
        public static final MediaItem PLACEHOLDER_MEDIA_ITEM;
        public static final Object SINGLE_WINDOW_UID = new Object();
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public MediaItem.LiveConfiguration liveConfiguration;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        public long windowStartTimeMs;
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = PLACEHOLDER_MEDIA_ITEM;

        static {
            IadFrame iadFrame = new IadFrame();
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
            List list = Collections.EMPTY_LIST;
            RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
            MediaItem.LiveConfiguration.Builder builder = new MediaItem.LiveConfiguration.Builder();
            MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
            Uri uri = Uri.EMPTY;
            PLACEHOLDER_MEDIA_ITEM = new MediaItem("androidx.media3.common.Timeline", new MediaItem.ClippingProperties(iadFrame), uri != null ? new MediaItem.LocalConfiguration(uri, null, null, list, regularImmutableList2, -9223372036854775807L) : null, new MediaItem.LiveConfiguration(builder), MediaMetadata.EMPTY, requestMetadata);
            Fragment$5$$ExternalSyntheticOutline0.m$1(1, 2, 3, 4, 5);
            Fragment$5$$ExternalSyntheticOutline0.m$1(6, 7, 8, 9, 10);
            Util.intToStringMaxRadix(11);
            Util.intToStringMaxRadix(12);
            Util.intToStringMaxRadix(13);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Objects.equals(this.uid, window.uid) && Objects.equals(this.mediaItem, window.mediaItem) && Objects.equals(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public final int hashCode() {
            int hashCode = (this.mediaItem.hashCode() + ((this.uid.hashCode() + EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31)) * 961;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode2 = liveConfiguration == null ? 0 : liveConfiguration.hashCode();
            long j = this.presentationStartTimeMs;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        public final boolean isLive() {
            return this.liveConfiguration != null;
        }

        public final void set(MediaItem mediaItem, boolean z, boolean z2, MediaItem.LiveConfiguration liveConfiguration, long j, long j2) {
            this.uid = SINGLE_WINDOW_UID;
            this.mediaItem = mediaItem != null ? mediaItem : PLACEHOLDER_MEDIA_ITEM;
            if (mediaItem != null) {
                MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            }
            this.presentationStartTimeMs = -9223372036854775807L;
            this.windowStartTimeMs = -9223372036854775807L;
            this.elapsedRealtimeEpochOffsetMs = -9223372036854775807L;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j;
            this.durationUs = j2;
            this.firstPeriodIndex = 0;
            this.lastPeriodIndex = 0;
            this.positionInFirstPeriodUs = 0L;
            this.isPlaceholder = false;
        }
    }

    static {
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
        Util.intToStringMaxRadix(2);
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                if (timeline.getWindowCount() == getWindowCount() && timeline.getPeriodCount() == getPeriodCount()) {
                    Window window = new Window();
                    Period period = new Period();
                    Window window2 = new Window();
                    Period period2 = new Period();
                    int i = 0;
                    while (true) {
                        if (i >= getWindowCount()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= getPeriodCount()) {
                                    int firstWindowIndex = getFirstWindowIndex(true);
                                    if (firstWindowIndex == timeline.getFirstWindowIndex(true) && (lastWindowIndex = getLastWindowIndex(true)) == timeline.getLastWindowIndex(true)) {
                                        while (firstWindowIndex != lastWindowIndex) {
                                            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
                                            if (nextWindowIndex == timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                                                firstWindowIndex = nextWindowIndex;
                                            }
                                        }
                                    }
                                } else {
                                    if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!getWindow(i, window, 0L).equals(timeline.getWindow(i, window2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period, false).windowIndex;
        if (getWindow(i3, window, 0L).lastPeriodIndex != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window, 0L).firstPeriodIndex;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getLastWindowIndex(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getLastWindowIndex(z) ? getFirstWindowIndex(z) : i + 1;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    public abstract Period getPeriod(int i, Period period, boolean z);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    public final Pair getPeriodPositionUs(Window window, Period period, int i, long j, long j2) {
        Trace.checkElementIndex(i, getWindowCount());
        getWindow(i, window, j2);
        if (j == -9223372036854775807L) {
            j = window.defaultPositionUs;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        getPeriod(i2, period, false);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, period, false).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, period, true);
        long j3 = j - period.positionInWindowUs;
        long j4 = period.durationUs;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = period.uid;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getFirstWindowIndex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getFirstWindowIndex(z) ? getLastWindowIndex(z) : i - 1;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    public abstract Object getUidOfPeriod(int i);

    public abstract Window getWindow(int i, Window window, long j);

    public final void getWindow(int i, Window window) {
        getWindow(i, window, 0L);
    }

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = getWindowCount() + EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE;
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, window, 0L).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final Pair getPeriodPositionUs(Window window, Period period, int i, long j) {
        Pair periodPositionUs = getPeriodPositionUs(window, period, i, j, 0L);
        periodPositionUs.getClass();
        return periodPositionUs;
    }
}
