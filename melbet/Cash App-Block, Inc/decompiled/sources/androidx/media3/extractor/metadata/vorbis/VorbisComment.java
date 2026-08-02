package androidx.media3.extractor.metadata.vorbis;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import com.google.common.base.Ascii;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes3.dex */
public final class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = Ascii.toUpperCase(str);
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VorbisComment.class == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.key);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.value;
        switch (c) {
            case 0:
                Integer tryParse = CompositeException.WrappedPrintStream.tryParse(str2);
                if (tryParse != null) {
                    builder.totalTrackCount = tryParse;
                    break;
                }
                break;
            case 1:
                Integer tryParse2 = CompositeException.WrappedPrintStream.tryParse(str2);
                if (tryParse2 != null) {
                    builder.totalDiscCount = tryParse2;
                    break;
                }
                break;
            case 2:
                Integer tryParse3 = CompositeException.WrappedPrintStream.tryParse(str2);
                if (tryParse3 != null) {
                    builder.trackNumber = tryParse3;
                    break;
                }
                break;
            case 3:
                builder.albumTitle = str2;
                break;
            case 4:
                builder.genre = str2;
                break;
            case 5:
                builder.title = str2;
                break;
            case 6:
                builder.description = str2;
                break;
            case 7:
                Integer tryParse4 = CompositeException.WrappedPrintStream.tryParse(str2);
                if (tryParse4 != null) {
                    builder.discNumber = tryParse4;
                    break;
                }
                break;
            case '\b':
                builder.albumArtist = str2;
                break;
            case '\t':
                builder.artist = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.key + "=" + this.value;
    }
}
