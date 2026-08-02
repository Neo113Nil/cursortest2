package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;

/* loaded from: classes3.dex */
public final class Track {
    public final long durationUs;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;

    /* renamed from: format, reason: collision with root package name */
    public final Format f892format;
    public final int id;
    public final long mediaDurationUs;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    public final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;

    /* renamed from: type, reason: collision with root package name */
    public final int f893type;

    public Track(int i, int i2, long j, long j2, long j3, long j4, Format format2, int i3, TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2) {
        this.id = i;
        this.f893type = i2;
        this.timescale = j;
        this.movieTimescale = j2;
        this.durationUs = j3;
        this.mediaDurationUs = j4;
        this.f892format = format2;
        this.sampleTransformation = i3;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i4;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public final Track copyWithFormat(Format format2) {
        return new Track(this.id, this.f893type, this.timescale, this.movieTimescale, this.durationUs, this.mediaDurationUs, format2, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, this.editListDurations, this.editListMediaTimes);
    }
}
