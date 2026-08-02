package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.FileTypes;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.avi.AviExtractor;
import androidx.media3.extractor.avif.AvifExtractor;
import androidx.media3.extractor.bmp.BmpExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.flv.FlvExtractor;
import androidx.media3.extractor.heif.HeifExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.room.CoroutinesRoom;
import app.cash.zipline.CallResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    public static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final CallResult FLAC_EXTENSION_LOADER = new CallResult(new Id3Peeker$$ExternalSyntheticBUOutline0(15));
    public static final CallResult MIDI_EXTENSION_LOADER = new CallResult(new Id3Peeker$$ExternalSyntheticBUOutline0(16));
    public int heifFlags;
    public int jpegFlags;
    public RegularImmutableList tsSubtitleFormats;
    public CoroutinesRoom.Companion subtitleParserFactory = new CoroutinesRoom.Companion(14);
    public boolean textTrackTranscodingEnabled = true;
    public int codecsToParseWithinGopSampleDependencies = 3;

    public final void addExtractorsForFileType(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new Ac3Extractor());
                break;
            case 1:
                arrayList.add(new Ac4Extractor());
                break;
            case 2:
                arrayList.add(new AdtsExtractor());
                break;
            case 3:
                arrayList.add(new AmrExtractor());
                break;
            case 4:
                Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(0);
                if (extractor == null) {
                    arrayList.add(new FlacExtractor());
                    break;
                } else {
                    arrayList.add(extractor);
                    break;
                }
            case 5:
                arrayList.add(new FlvExtractor());
                break;
            case 6:
                arrayList.add(new MatroskaExtractor(this.subtitleParserFactory, this.textTrackTranscodingEnabled ? 0 : 2));
                break;
            case 7:
                arrayList.add(new Mp3Extractor());
                break;
            case 8:
                CoroutinesRoom.Companion companion = this.subtitleParserFactory;
                int i2 = this.codecsToParseWithinGopSampleDependencies;
                int i3 = (i2 & 1) != 0 ? 64 : 0;
                if ((i2 & 2) != 0) {
                    i3 |= 128;
                }
                arrayList.add(new FragmentedMp4Extractor(companion, (this.textTrackTranscodingEnabled ? 0 : 32) | i3));
                CoroutinesRoom.Companion companion2 = this.subtitleParserFactory;
                int i4 = this.codecsToParseWithinGopSampleDependencies;
                int i5 = (i4 & 1) == 0 ? 0 : 32;
                if ((2 & i4) != 0) {
                    i5 |= 128;
                }
                arrayList.add(new Mp4Extractor(companion2, i5 | (this.textTrackTranscodingEnabled ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new OggExtractor());
                break;
            case 10:
                arrayList.add(new PsExtractor());
                break;
            case 11:
                if (this.tsSubtitleFormats == null) {
                    ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                    this.tsSubtitleFormats = RegularImmutableList.EMPTY;
                }
                arrayList.add(new TsExtractor(!this.textTrackTranscodingEnabled ? 1 : 0, this.subtitleParserFactory, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(this.tsSubtitleFormats)));
                break;
            case 12:
                arrayList.add(new WavExtractor());
                break;
            case 14:
                arrayList.add(new BmpExtractor(this.jpegFlags));
                break;
            case 15:
                Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    arrayList.add(extractor2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new AviExtractor(!this.textTrackTranscodingEnabled ? 1 : 0, this.subtitleParserFactory));
                break;
            case 17:
                arrayList.add(new BmpExtractor((byte) 0, 1));
                break;
            case 18:
                arrayList.add(new AvifExtractor(1));
                break;
            case 19:
                arrayList.add(new BmpExtractor((byte) 0, 0));
                break;
            case 20:
                arrayList.add(new HeifExtractor(this.heifFlags));
                break;
            case 21:
                arrayList.add(new AvifExtractor(0));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x024f A[Catch: all -> 0x0253, TRY_ENTER, TryCatch #0 {all -> 0x0253, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:15:0x024f, B:16:0x0255, B:19:0x025d, B:22:0x0263, B:25:0x0269, B:27:0x026c, B:31:0x026f, B:36:0x002d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0263 A[Catch: all -> 0x0253, TryCatch #0 {all -> 0x0253, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:15:0x024f, B:16:0x0255, B:19:0x025d, B:22:0x0263, B:25:0x0269, B:27:0x026c, B:31:0x026f, B:36:0x002d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002d A[Catch: all -> 0x0253, TRY_LEAVE, TryCatch #0 {all -> 0x0253, blocks: (B:4:0x0003, B:6:0x0019, B:9:0x0020, B:15:0x024f, B:16:0x0255, B:19:0x025d, B:22:0x0263, B:25:0x0269, B:27:0x026c, B:31:0x026f, B:36:0x002d), top: B:3:0x0003 }] */
    @Override // androidx.media3.extractor.ExtractorsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Extractor[] createExtractors(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int i;
        char c;
        int inferFileTypeFromUri;
        int i2;
        try {
            int[] iArr = DEFAULT_EXTRACTOR_ORDER;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                if (str == null) {
                    String normalizeMimeType = MimeTypes.normalizeMimeType(str);
                    normalizeMimeType.getClass();
                    i = 20;
                    switch (normalizeMimeType.hashCode()) {
                        case -2123537834:
                            if (normalizeMimeType.equals("audio/eac3-joc")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662384011:
                            if (normalizeMimeType.equals("video/mp2p")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662384007:
                            if (normalizeMimeType.equals("video/mp2t")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1662095187:
                            if (normalizeMimeType.equals("video/webm")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1606874997:
                            if (normalizeMimeType.equals("audio/amr-wb")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1487656890:
                            if (normalizeMimeType.equals("image/avif")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1487464693:
                            if (normalizeMimeType.equals("image/heic")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1487464690:
                            if (normalizeMimeType.equals("image/heif")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1487394660:
                            if (normalizeMimeType.equals("image/jpeg")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1487018032:
                            if (normalizeMimeType.equals("image/webp")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1248337486:
                            if (normalizeMimeType.equals("application/mp4")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1079884372:
                            if (normalizeMimeType.equals("video/x-msvideo")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1004728940:
                            if (normalizeMimeType.equals("text/vtt")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -879272239:
                            if (normalizeMimeType.equals("image/bmp")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -879258763:
                            if (normalizeMimeType.equals("image/png")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -387023398:
                            if (normalizeMimeType.equals("audio/x-matroska")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -43467528:
                            if (normalizeMimeType.equals("application/webm")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 13915911:
                            if (normalizeMimeType.equals("video/x-flv")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (normalizeMimeType.equals("audio/ac3")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (normalizeMimeType.equals("audio/ac4")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078669:
                            if (normalizeMimeType.equals("audio/amr")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187090232:
                            if (normalizeMimeType.equals("audio/mp4")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187091926:
                            if (normalizeMimeType.equals("audio/ogg")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187099443:
                            if (normalizeMimeType.equals("audio/wav")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1331848029:
                            if (normalizeMimeType.equals("video/mp4")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1503095341:
                            if (normalizeMimeType.equals("audio/3gpp")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (normalizeMimeType.equals("audio/eac3")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504619009:
                            if (normalizeMimeType.equals("audio/flac")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504824762:
                            if (normalizeMimeType.equals("audio/midi")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504831518:
                            if (normalizeMimeType.equals("audio/mpeg")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1505118770:
                            if (normalizeMimeType.equals("audio/webm")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2039520277:
                            if (normalizeMimeType.equals("video/x-matroska")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 18:
                        case 26:
                            i = 0;
                            break;
                        case 1:
                            i = 10;
                            break;
                        case 2:
                            i = 11;
                            break;
                        case 3:
                        case 15:
                        case 16:
                        case 30:
                        case 31:
                            i = 6;
                            break;
                        case 4:
                        case 20:
                        case 25:
                            i = 3;
                            break;
                        case 5:
                            i = 21;
                            break;
                        case '\b':
                            i = 14;
                            break;
                        case '\t':
                            i = 18;
                            break;
                        case '\n':
                        case 21:
                        case 24:
                            i = 8;
                            break;
                        case 11:
                            i = 16;
                            break;
                        case '\f':
                            i = 13;
                            break;
                        case '\r':
                            i = 19;
                            break;
                        case 14:
                            i = 17;
                            break;
                        case 17:
                            i = 5;
                            break;
                        case 19:
                            i = 1;
                            break;
                        case 22:
                            i = 9;
                            break;
                        case 23:
                            i = 12;
                            break;
                        case 27:
                            i = 4;
                            break;
                        case 28:
                            i = 15;
                            break;
                        case 29:
                            i = 7;
                            break;
                    }
                    if (i != -1) {
                        addExtractorsForFileType(i, arrayList);
                    }
                    inferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
                    if (inferFileTypeFromUri != -1 && inferFileTypeFromUri != i) {
                        addExtractorsForFileType(inferFileTypeFromUri, arrayList);
                    }
                    for (i2 = 0; i2 < 21; i2++) {
                        int i3 = iArr[i2];
                        if (i3 != i && i3 != inferFileTypeFromUri) {
                            addExtractorsForFileType(i3, arrayList);
                        }
                    }
                }
                i = -1;
                if (i != -1) {
                }
                inferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
                if (inferFileTypeFromUri != -1) {
                    addExtractorsForFileType(inferFileTypeFromUri, arrayList);
                }
                while (i2 < 21) {
                }
            }
            str = null;
            if (str == null) {
            }
            i = -1;
            if (i != -1) {
            }
            inferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
            if (inferFileTypeFromUri != -1) {
            }
            while (i2 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Extractor[]) arrayList.toArray(new Extractor[0]);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final synchronized Extractor[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }
}
