package androidx.media3.exoplayer.source;

/* loaded from: classes3.dex */
public final class MediaSource$MediaPeriodId {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final int nextAdGroupIndex;
    public final Object periodUid;
    public final long windowSequenceNumber;

    public MediaSource$MediaPeriodId(Object obj, int i, int i2, long j, int i3) {
        this.periodUid = obj;
        this.adGroupIndex = i;
        this.adIndexInAdGroup = i2;
        this.windowSequenceNumber = j;
        this.nextAdGroupIndex = i3;
    }

    public final MediaSource$MediaPeriodId copyWithPeriodUid(Object obj) {
        if (this.periodUid.equals(obj)) {
            return this;
        }
        return new MediaSource$MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSource$MediaPeriodId)) {
            return false;
        }
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = (MediaSource$MediaPeriodId) obj;
        return this.periodUid.equals(mediaSource$MediaPeriodId.periodUid) && this.adGroupIndex == mediaSource$MediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaSource$MediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaSource$MediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaSource$MediaPeriodId.nextAdGroupIndex;
    }

    public final int hashCode() {
        return ((((((((this.periodUid.hashCode() + 527) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
    }

    public final boolean isAd() {
        return this.adGroupIndex != -1;
    }

    public MediaSource$MediaPeriodId(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public MediaSource$MediaPeriodId(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public MediaSource$MediaPeriodId(Object obj) {
        this(obj, -1L);
    }
}
