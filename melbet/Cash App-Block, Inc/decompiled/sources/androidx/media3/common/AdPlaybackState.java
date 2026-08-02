package androidx.media3.common;

import android.net.Uri;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import java.util.Arrays;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public final class AdPlaybackState {
    public static final AdPlaybackState NONE = new AdPlaybackState(new AdGroup[0]);
    public static final AdGroup REMOVED_AD_GROUP;
    public final int adGroupCount;
    public final AdGroup[] adGroups;

    public final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final SkipInfo[] skipInfos;
        public final int[] states;
        public final Uri[] uris;

        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
            Fragment$5$$ExternalSyntheticOutline0.m$1(5, 6, 7, 8, 9);
            Util.intToStringMaxRadix(10);
            Util.intToStringMaxRadix(11);
        }

        public AdGroup(int i, int i2, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, String[] strArr, SkipInfo[] skipInfoArr) {
            Uri uri;
            int i3 = 0;
            Trace.checkArgument(iArr.length == mediaItemArr.length);
            Trace.checkArgument(iArr.length == skipInfoArr.length);
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.uris = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i3 >= uriArr.length) {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    return;
                }
                MediaItem mediaItem = mediaItemArr[i3];
                if (mediaItem == null) {
                    uri = null;
                } else {
                    MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
                    localConfiguration.getClass();
                    uri = localConfiguration.uri;
                }
                uriArr[i3] = uri;
                i3++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && Arrays.equals(this.ids, adGroup.ids) && Arrays.equals(this.skipInfos, adGroup.skipInfos);
        }

        public final int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.skipInfos) + ((((Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + ((Arrays.hashCode(this.mediaItems) + (((this.count * 31) + this.originalCount) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.ids)) * 31)) * 31;
        }
    }

    public abstract class SkipInfo {
    }

    static {
        AdGroup adGroup = new AdGroup(-1, -1, new int[0], new MediaItem[0], new long[0], new String[0], new SkipInfo[0]);
        int[] iArr = adGroup.states;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = adGroup.durationsUs;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(adGroup.mediaItems, 0);
        String[] strArr = (String[]) Arrays.copyOf(adGroup.ids, 0);
        SkipInfo[] skipInfoArr = adGroup.skipInfos;
        REMOVED_AD_GROUP = new AdGroup(0, adGroup.originalCount, copyOf, mediaItemArr, copyOf2, strArr, (SkipInfo[]) Arrays.copyOf(skipInfoArr, Math.max(0, skipInfoArr.length)));
        Util.intToStringMaxRadix(1);
        Util.intToStringMaxRadix(2);
        Util.intToStringMaxRadix(3);
        Util.intToStringMaxRadix(4);
    }

    public AdPlaybackState(AdGroup[] adGroupArr) {
        this.adGroupCount = adGroupArr.length;
        this.adGroups = adGroupArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return this.adGroupCount == adPlaybackState.adGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public final AdGroup getAdGroup(int i) {
        return i < 0 ? REMOVED_AD_GROUP : this.adGroups[i];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.adGroups) + Fragment$5$$ExternalSyntheticOutline0.m$1(this.adGroupCount, 29791, 1, 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            AdGroup[] adGroupArr = this.adGroups;
            if (i >= adGroupArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            adGroupArr[i].getClass();
            for (int i2 = 0; i2 < adGroupArr[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = adGroupArr[i].states[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(adGroupArr[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < adGroupArr[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < adGroupArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
