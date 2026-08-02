package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final boolean hasOnlySyncSamples;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final int[] syncSampleIndices;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        Trace.checkArgument(iArr.length == jArr2.length);
        Trace.checkArgument(jArr.length == jArr2.length);
        Trace.checkArgument(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.syncSampleIndices = iArr3;
        this.hasOnlySyncSamples = z;
        this.durationUs = j;
        this.sampleCount = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public final int getIndexOfEarlierOrEqualSynchronizationSample(long j) {
        long[] jArr = this.timestampsUs;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchFloor(jArr, j, false);
        }
        int[] iArr = this.syncSampleIndices;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, i, 2, i);
            if (jArr[iArr[m]] <= j) {
                i = m + 1;
                i2 = m;
            } else {
                length = m - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    public final int getIndexOfLaterOrEqualSynchronizationSample(long j) {
        long[] jArr = this.timestampsUs;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchCeil(jArr, j, true);
        }
        int[] iArr = this.syncSampleIndices;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, i, 2, i);
            if (jArr[iArr[m]] >= j) {
                length = m - 1;
                i2 = m;
            } else {
                i = m + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }
}
