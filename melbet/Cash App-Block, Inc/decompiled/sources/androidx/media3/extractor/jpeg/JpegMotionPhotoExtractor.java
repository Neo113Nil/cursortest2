package androidx.media3.extractor.jpeg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.common.collect.RegularImmutableList;
import java.util.Objects;
import net.idrnd.misnap.iad.IadFrame;
import okhttp3.internal.http1.HeadersReader;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class JpegMotionPhotoExtractor implements Extractor {
    public ExtractorOutput extractorOutput;
    public ExtractorInput lastExtractorInput;
    public int marker;
    public MotionPhotoMetadata motionPhotoMetadata;
    public Mp4Extractor mp4Extractor;
    public HeadersReader mp4ExtractorStartOffsetExtractorInput;
    public int segmentLength;
    public int state;
    public final ParsableByteArray scratch = new ParsableByteArray(2);
    public long mp4StartPosition = -1;

    public final void endReading$1() {
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
        this.state = 6;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        String readNullTerminatedString;
        HeadersReader headersReader;
        RegularImmutableList regularImmutableList;
        int i;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        long j2;
        int i2 = this.state;
        long j3 = -1;
        ParsableByteArray parsableByteArray = this.scratch;
        if (i2 == 0) {
            parsableByteArray.reset(2);
            extractorInput.readFully(parsableByteArray.data, 0, 2);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            this.marker = readUnsignedShort;
            if (readUnsignedShort == 65498) {
                if (this.mp4StartPosition != -1) {
                    this.state = 4;
                    return 0;
                }
                endReading$1();
                return 0;
            }
            if ((readUnsignedShort < 65488 || readUnsignedShort > 65497) && readUnsignedShort != 65281) {
                this.state = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            parsableByteArray.reset(2);
            extractorInput.peekFully(0, 2, parsableByteArray.data);
            this.segmentLength = parsableByteArray.readUnsignedShort() - 2;
            extractorInput.skipFully(2);
            this.state = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    Path$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                if (this.mp4ExtractorStartOffsetExtractorInput == null || extractorInput != this.lastExtractorInput) {
                    this.lastExtractorInput = extractorInput;
                    this.mp4ExtractorStartOffsetExtractorInput = new HeadersReader(extractorInput, this.mp4StartPosition);
                }
                Mp4Extractor mp4Extractor = this.mp4Extractor;
                mp4Extractor.getClass();
                int read = mp4Extractor.read(this.mp4ExtractorStartOffsetExtractorInput, iadFrame);
                if (read == 1) {
                    iadFrame.b += this.mp4StartPosition;
                }
                return read;
            }
            long position = extractorInput.getPosition();
            long j4 = this.mp4StartPosition;
            if (position != j4) {
                iadFrame.b = j4;
                return 1;
            }
            if (!extractorInput.peekFully(parsableByteArray.data, 0, 1, true)) {
                endReading$1();
                return 0;
            }
            extractorInput.resetPeekPosition();
            if (this.mp4Extractor == null) {
                this.mp4Extractor = new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 8);
            }
            HeadersReader headersReader2 = new HeadersReader(extractorInput, this.mp4StartPosition);
            this.mp4ExtractorStartOffsetExtractorInput = headersReader2;
            if (!this.mp4Extractor.sniff(headersReader2)) {
                endReading$1();
                return 0;
            }
            Mp4Extractor mp4Extractor2 = this.mp4Extractor;
            long j5 = this.mp4StartPosition;
            ExtractorOutput extractorOutput = this.extractorOutput;
            extractorOutput.getClass();
            mp4Extractor2.init(new HeadersReader(j5, extractorOutput, 4));
            MotionPhotoMetadata motionPhotoMetadata2 = this.motionPhotoMetadata;
            motionPhotoMetadata2.getClass();
            ExtractorOutput extractorOutput2 = this.extractorOutput;
            extractorOutput2.getClass();
            TrackOutput track = extractorOutput2.track(1024, 4);
            Format.Builder builder = new Format.Builder();
            builder.containerMimeType = MimeTypes.normalizeMimeType("image/jpeg");
            builder.metadata = new Metadata(motionPhotoMetadata2);
            NavAction$$ExternalSyntheticOutline0.m(builder, track);
            this.state = 5;
            return 0;
        }
        if (this.marker == 65505) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.segmentLength);
            extractorInput.readFully(parsableByteArray2.data, 0, this.segmentLength);
            if (this.motionPhotoMetadata == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray2.readNullTerminatedString()) && (readNullTerminatedString = parsableByteArray2.readNullTerminatedString()) != null) {
                long length = extractorInput.getLength();
                if (length != -1) {
                    try {
                        headersReader = XmpMotionPhotoDescriptionParser.parseInternal(readNullTerminatedString);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        headersReader = null;
                    }
                    if (headersReader != null && (i = (regularImmutableList = (RegularImmutableList) headersReader.source).size) >= 2) {
                        int i3 = i - 1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        while (i3 >= 0) {
                            MotionPhotoDescription$ContainerItem motionPhotoDescription$ContainerItem = (MotionPhotoDescription$ContainerItem) regularImmutableList.get(i3);
                            String str = motionPhotoDescription$ContainerItem.mime;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                j = j3;
                                length -= motionPhotoDescription$ContainerItem.padding;
                                j2 = 0;
                            } else {
                                j = j3;
                                j2 = length - motionPhotoDescription$ContainerItem.length;
                            }
                            long j10 = length;
                            length = j2;
                            if (z && length != j10) {
                                j9 = j10 - length;
                                j8 = length;
                            }
                            if (i3 == 0) {
                                j7 = j10;
                                j6 = length;
                            }
                            i3--;
                            j3 = j;
                        }
                        long j11 = j3;
                        if (j8 != j11 && j9 != j11 && j6 != j11 && j7 != j11) {
                            motionPhotoMetadata = new MotionPhotoMetadata(j6, j7, headersReader.headerLimit, j8, j9);
                            this.motionPhotoMetadata = motionPhotoMetadata;
                            if (motionPhotoMetadata != null) {
                                this.mp4StartPosition = motionPhotoMetadata.videoStartPosition;
                            }
                        }
                    }
                }
                motionPhotoMetadata = null;
                this.motionPhotoMetadata = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                }
            }
        } else {
            extractorInput.skipFully(this.segmentLength);
        }
        this.state = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.mp4Extractor;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.state = 0;
            this.mp4Extractor = null;
        } else if (this.state == 5) {
            Mp4Extractor mp4Extractor = this.mp4Extractor;
            mp4Extractor.getClass();
            mp4Extractor.seek(j, j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        String readNullTerminatedString;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        ParsableByteArray parsableByteArray = this.scratch;
        parsableByteArray.reset(2);
        defaultExtractorInput.peekFully(parsableByteArray.data, 0, 2, false);
        if (parsableByteArray.readUnsignedShort() == 65496) {
            while (true) {
                parsableByteArray.reset(2);
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 2, false);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                this.marker = readUnsignedShort;
                if (readUnsignedShort == 65498) {
                    break;
                }
                parsableByteArray.reset(2);
                defaultExtractorInput.peekFully(0, 2, parsableByteArray.data);
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    break;
                }
                if (this.marker != 65505) {
                    defaultExtractorInput.advancePeekPosition(readUnsignedShort2, false);
                } else {
                    parsableByteArray.reset(readUnsignedShort2);
                    defaultExtractorInput.peekFully(parsableByteArray.data, 0, readUnsignedShort2, false);
                    if (Objects.equals(parsableByteArray.readNullTerminatedString(), "http://ns.adobe.com/xap/1.0/") && (readNullTerminatedString = parsableByteArray.readNullTerminatedString()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (readNullTerminatedString.contains(XmpMotionPhotoDescriptionParser.MOTION_PHOTO_ATTRIBUTE_NAMES[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
