package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class TextInformationFrame extends Id3Frame {
    public final String description;
    public final ImmutableList values;

    public TextInformationFrame(String str, String str2, RegularImmutableList regularImmutableList) {
        super(str);
        Trace.checkArgument(!regularImmutableList.isEmpty());
        this.description = str2;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) regularImmutableList);
        this.values = copyOf;
    }

    public static ArrayList parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.id.equals(textInformationFrame.id) || !Objects.equals(this.description, textInformationFrame.description)) {
            return false;
        }
        ImmutableList immutableList = textInformationFrame.values;
        ImmutableList immutableList2 = this.values;
        immutableList2.getClass();
        return Maps.equalsImpl(immutableList, immutableList2);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.id);
        String str = this.description;
        return this.values.hashCode() + ((m + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
        char c;
        String str = this.id;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        ImmutableList immutableList = this.values;
        try {
            switch (c) {
                case 0:
                case '\n':
                    builder.albumTitle = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    builder.composer = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) immutableList.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    builder.recordingMonth = Integer.valueOf(parseInt);
                    builder.recordingDay = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    builder.artist = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    builder.albumArtist = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    builder.conductor = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) immutableList.get(0);
                    String str4 = Util.DEVICE_DEBUG_INFO;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    builder.trackNumber = Integer.valueOf(parseInt3);
                    builder.totalTrackCount = valueOf;
                    break;
                case 7:
                case 17:
                    builder.title = (CharSequence) immutableList.get(0);
                    break;
                case '\b':
                case 16:
                    builder.writer = (CharSequence) immutableList.get(0);
                    break;
                case '\t':
                case 22:
                    builder.recordingYear = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case '\f':
                    Integer tryParse = CompositeException.WrappedPrintStream.tryParse((String) immutableList.get(0));
                    if (tryParse != null) {
                        String resolveV1Genre = Id3Util.resolveV1Genre(tryParse.intValue());
                        if (resolveV1Genre != null) {
                            builder.genre = resolveV1Genre;
                            break;
                        }
                    } else {
                        builder.genre = (CharSequence) immutableList.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList parseId3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate((String) immutableList.get(0));
                    int size = parseId3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.recordingDay = (Integer) parseId3v2point4TimestampFrameForDate.get(2);
                            }
                        }
                        builder.recordingMonth = (Integer) parseId3v2point4TimestampFrameForDate.get(1);
                    }
                    builder.recordingYear = (Integer) parseId3v2point4TimestampFrameForDate.get(0);
                    break;
                case 15:
                    ArrayList parseId3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate((String) immutableList.get(0));
                    int size2 = parseId3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.releaseDay = (Integer) parseId3v2point4TimestampFrameForDate2.get(2);
                            }
                        }
                        builder.releaseMonth = (Integer) parseId3v2point4TimestampFrameForDate2.get(1);
                    }
                    builder.releaseYear = (Integer) parseId3v2point4TimestampFrameForDate2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }
}
