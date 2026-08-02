package androidx.media3.common;

import android.text.TextUtils;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class MediaMetadata {
    public static final MediaMetadata EMPTY;
    public final CharSequence albumArtist;
    public final CharSequence albumTitle;
    public final CharSequence artist;
    public final byte[] artworkData;
    public final Integer artworkDataType;
    public final CharSequence composer;
    public final CharSequence conductor;
    public final CharSequence description;
    public final Integer discNumber;
    public final Integer folderType;
    public final CharSequence genre;
    public final Boolean isBrowsable;
    public final Integer mediaType;
    public final Integer recordingDay;
    public final Integer recordingMonth;
    public final Integer recordingYear;
    public final Integer releaseDay;
    public final Integer releaseMonth;
    public final Integer releaseYear;
    public final CharSequence station;
    public final ImmutableList supportedCommands;
    public final CharSequence title;
    public final Integer totalDiscCount;
    public final Integer totalTrackCount;
    public final Integer trackNumber;
    public final CharSequence writer;
    public final Integer year;

    public final class Builder {
        public CharSequence albumArtist;
        public CharSequence albumTitle;
        public CharSequence artist;
        public byte[] artworkData;
        public Integer artworkDataType;
        public CharSequence composer;
        public CharSequence conductor;
        public CharSequence description;
        public Integer discNumber;
        public Integer folderType;
        public CharSequence genre;
        public Boolean isBrowsable;
        public Integer mediaType;
        public Integer recordingDay;
        public Integer recordingMonth;
        public Integer recordingYear;
        public Integer releaseDay;
        public Integer releaseMonth;
        public Integer releaseYear;
        public CharSequence station;
        public ImmutableList supportedCommands;
        public CharSequence title;
        public Integer totalDiscCount;
        public Integer totalTrackCount;
        public Integer trackNumber;
        public CharSequence writer;

        public final void maybeSetArtworkData(int i, byte[] bArr) {
            if (this.artworkData == null || i == 3 || !Objects.equals(this.artworkDataType, 3)) {
                this.artworkData = (byte[]) bArr.clone();
                this.artworkDataType = Integer.valueOf(i);
            }
        }
    }

    static {
        Builder builder = new Builder();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        builder.supportedCommands = RegularImmutableList.EMPTY;
        EMPTY = new MediaMetadata(builder);
        Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        Fragment$5$$ExternalSyntheticOutline0.m$1(5, 6, 8, 9, 10);
        Fragment$5$$ExternalSyntheticOutline0.m$1(11, 12, 13, 14, 15);
        Fragment$5$$ExternalSyntheticOutline0.m$1(16, 17, 18, 19, 20);
        Fragment$5$$ExternalSyntheticOutline0.m$1(21, 22, 23, 24, 25);
        Fragment$5$$ExternalSyntheticOutline0.m$1(26, 27, 28, 29, 30);
        Fragment$5$$ExternalSyntheticOutline0.m$1(31, 32, 33, 34, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
    }

    public MediaMetadata(Builder builder) {
        Boolean bool = builder.isBrowsable;
        Integer num = builder.folderType;
        Integer num2 = builder.mediaType;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.title = builder.title;
        this.artist = builder.artist;
        this.albumTitle = builder.albumTitle;
        this.albumArtist = builder.albumArtist;
        this.description = builder.description;
        this.artworkData = builder.artworkData;
        this.artworkDataType = builder.artworkDataType;
        this.trackNumber = builder.trackNumber;
        this.totalTrackCount = builder.totalTrackCount;
        this.folderType = num;
        this.isBrowsable = bool;
        Integer num3 = builder.recordingYear;
        this.year = num3;
        this.recordingYear = num3;
        this.recordingMonth = builder.recordingMonth;
        this.recordingDay = builder.recordingDay;
        this.releaseYear = builder.releaseYear;
        this.releaseMonth = builder.releaseMonth;
        this.releaseDay = builder.releaseDay;
        this.writer = builder.writer;
        this.composer = builder.composer;
        this.conductor = builder.conductor;
        this.discNumber = builder.discNumber;
        this.totalDiscCount = builder.totalDiscCount;
        this.genre = builder.genre;
        this.station = builder.station;
        this.mediaType = num2;
        this.supportedCommands = builder.supportedCommands;
    }

    public final Builder buildUpon() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.artist = this.artist;
        builder.albumTitle = this.albumTitle;
        builder.albumArtist = this.albumArtist;
        builder.description = this.description;
        builder.artworkData = this.artworkData;
        builder.artworkDataType = this.artworkDataType;
        builder.trackNumber = this.trackNumber;
        builder.totalTrackCount = this.totalTrackCount;
        builder.folderType = this.folderType;
        builder.isBrowsable = this.isBrowsable;
        builder.recordingYear = this.recordingYear;
        builder.recordingMonth = this.recordingMonth;
        builder.recordingDay = this.recordingDay;
        builder.releaseYear = this.releaseYear;
        builder.releaseMonth = this.releaseMonth;
        builder.releaseDay = this.releaseDay;
        builder.writer = this.writer;
        builder.composer = this.composer;
        builder.conductor = this.conductor;
        builder.discNumber = this.discNumber;
        builder.totalDiscCount = this.totalDiscCount;
        builder.genre = this.genre;
        builder.station = this.station;
        builder.mediaType = this.mediaType;
        builder.supportedCommands = this.supportedCommands;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return TextUtils.equals(this.title, mediaMetadata.title) && TextUtils.equals(this.artist, mediaMetadata.artist) && TextUtils.equals(this.albumTitle, mediaMetadata.albumTitle) && TextUtils.equals(this.albumArtist, mediaMetadata.albumArtist) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.description, mediaMetadata.description) && Arrays.equals(this.artworkData, mediaMetadata.artworkData) && Objects.equals(this.artworkDataType, mediaMetadata.artworkDataType) && Objects.equals(this.trackNumber, mediaMetadata.trackNumber) && Objects.equals(this.totalTrackCount, mediaMetadata.totalTrackCount) && Objects.equals(this.folderType, mediaMetadata.folderType) && Objects.equals(this.isBrowsable, mediaMetadata.isBrowsable) && Objects.equals(this.recordingYear, mediaMetadata.recordingYear) && Objects.equals(this.recordingMonth, mediaMetadata.recordingMonth) && Objects.equals(this.recordingDay, mediaMetadata.recordingDay) && Objects.equals(this.releaseYear, mediaMetadata.releaseYear) && Objects.equals(this.releaseMonth, mediaMetadata.releaseMonth) && Objects.equals(this.releaseDay, mediaMetadata.releaseDay) && TextUtils.equals(this.writer, mediaMetadata.writer) && TextUtils.equals(this.composer, mediaMetadata.composer) && TextUtils.equals(this.conductor, mediaMetadata.conductor) && Objects.equals(this.discNumber, mediaMetadata.discNumber) && Objects.equals(this.totalDiscCount, mediaMetadata.totalDiscCount) && TextUtils.equals(this.genre, mediaMetadata.genre) && TextUtils.equals(null, null) && TextUtils.equals(this.station, mediaMetadata.station) && Objects.equals(this.mediaType, mediaMetadata.mediaType) && Objects.equals(this.supportedCommands, mediaMetadata.supportedCommands);
    }

    public final int hashCode() {
        return Objects.hash(this.title, this.artist, this.albumTitle, this.albumArtist, null, null, this.description, null, null, null, Integer.valueOf(Arrays.hashCode(this.artworkData)), this.artworkDataType, null, this.trackNumber, this.totalTrackCount, this.folderType, this.isBrowsable, null, this.recordingYear, this.recordingMonth, this.recordingDay, this.releaseYear, this.releaseMonth, this.releaseDay, this.writer, this.composer, this.conductor, this.discNumber, this.totalDiscCount, this.genre, null, this.station, this.mediaType, true, this.supportedCommands);
    }
}
