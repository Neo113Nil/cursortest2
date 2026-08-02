package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.google.android.libraries.places.internal.zzcjk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Id3Reader implements ElementaryStreamReader {
    public final /* synthetic */ int $r8$classId;
    public final Object id3Header;
    public Object output;
    public int sampleBytesRead;
    public int sampleSize;
    public long sampleTimeUs;
    public boolean writingSample;

    public Id3Reader(List list) {
        this.$r8$classId = 1;
        this.id3Header = list;
        this.output = new TrackOutput[list.size()];
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                ParsableByteArray parsableByteArray2 = (ParsableByteArray) this.id3Header;
                ((TrackOutput) this.output).getClass();
                if (this.writingSample) {
                    int bytesLeft = parsableByteArray.bytesLeft();
                    int i = this.sampleBytesRead;
                    if (i < 10) {
                        int min = Math.min(bytesLeft, 10 - i);
                        System.arraycopy(parsableByteArray.data, parsableByteArray.position, parsableByteArray2.data, this.sampleBytesRead, min);
                        if (this.sampleBytesRead + min == 10) {
                            parsableByteArray2.setPosition(0);
                            if (73 != parsableByteArray2.readUnsignedByte() || 68 != parsableByteArray2.readUnsignedByte() || 51 != parsableByteArray2.readUnsignedByte()) {
                                Log.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.writingSample = false;
                                break;
                            } else {
                                parsableByteArray2.skipBytes(3);
                                this.sampleSize = parsableByteArray2.readSynchSafeInt() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(bytesLeft, this.sampleSize - this.sampleBytesRead);
                    ((TrackOutput) this.output).sampleData(min2, parsableByteArray);
                    this.sampleBytesRead += min2;
                    break;
                }
                break;
            default:
                if (this.writingSample) {
                    if (this.sampleSize == 2) {
                        if (parsableByteArray.bytesLeft() == 0) {
                            z2 = false;
                        } else {
                            if (parsableByteArray.readUnsignedByte() != 32) {
                                this.writingSample = false;
                            }
                            this.sampleSize--;
                            z2 = this.writingSample;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.sampleSize == 1) {
                        if (parsableByteArray.bytesLeft() == 0) {
                            z = false;
                        } else {
                            if (parsableByteArray.readUnsignedByte() != 0) {
                                this.writingSample = false;
                            }
                            this.sampleSize--;
                            z = this.writingSample;
                        }
                        if (!z) {
                        }
                    }
                    int i2 = parsableByteArray.position;
                    int bytesLeft2 = parsableByteArray.bytesLeft();
                    for (TrackOutput trackOutput : (TrackOutput[]) this.output) {
                        parsableByteArray.setPosition(i2);
                        trackOutput.sampleData(bytesLeft2, parsableByteArray);
                    }
                    this.sampleBytesRead += bytesLeft2;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        switch (this.$r8$classId) {
            case 0:
                zzcjkVar.generateNewId();
                zzcjkVar.maybeThrowUninitializedError();
                TrackOutput track = extractorOutput.track(zzcjkVar.zze, 5);
                this.output = track;
                Format.Builder builder = new Format.Builder();
                zzcjkVar.maybeThrowUninitializedError();
                builder.id = (String) zzcjkVar.zza;
                builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                builder.sampleMimeType = MimeTypes.normalizeMimeType("application/id3");
                NavAction$$ExternalSyntheticOutline0.m(builder, track);
                break;
            default:
                TrackOutput[] trackOutputArr = (TrackOutput[]) this.output;
                for (int i = 0; i < trackOutputArr.length; i++) {
                    TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = (TsPayloadReader.DvbSubtitleInfo) ((List) this.id3Header).get(i);
                    zzcjkVar.generateNewId();
                    zzcjkVar.maybeThrowUninitializedError();
                    TrackOutput track2 = extractorOutput.track(zzcjkVar.zze, 3);
                    Format.Builder builder2 = new Format.Builder();
                    zzcjkVar.maybeThrowUninitializedError();
                    builder2.id = (String) zzcjkVar.zza;
                    builder2.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
                    builder2.sampleMimeType = MimeTypes.normalizeMimeType("application/dvbsubs");
                    builder2.initializationData = Collections.singletonList(dvbSubtitleInfo.initializationData);
                    builder2.language = dvbSubtitleInfo.language;
                    NavAction$$ExternalSyntheticOutline0.m(builder2, track2);
                    trackOutputArr[i] = track2;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished(boolean z) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                ((TrackOutput) this.output).getClass();
                if (this.writingSample && (i = this.sampleSize) != 0 && this.sampleBytesRead == i) {
                    Trace.checkState(this.sampleTimeUs != -9223372036854775807L);
                    ((TrackOutput) this.output).sampleMetadata(this.sampleTimeUs, 1, this.sampleSize, 0, null);
                    this.writingSample = false;
                    break;
                }
                break;
            default:
                if (this.writingSample) {
                    Trace.checkState(this.sampleTimeUs != -9223372036854775807L);
                    for (TrackOutput trackOutput : (TrackOutput[]) this.output) {
                        trackOutput.sampleMetadata(this.sampleTimeUs, 1, this.sampleBytesRead, 0, null);
                    }
                    this.writingSample = false;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetStarted(int i, long j) {
        switch (this.$r8$classId) {
            case 0:
                if ((i & 4) != 0) {
                    this.writingSample = true;
                    this.sampleTimeUs = j;
                    this.sampleSize = 0;
                    this.sampleBytesRead = 0;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.writingSample = true;
                    this.sampleTimeUs = j;
                    this.sampleBytesRead = 0;
                    this.sampleSize = 2;
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        switch (this.$r8$classId) {
            case 0:
                this.writingSample = false;
                this.sampleTimeUs = -9223372036854775807L;
                break;
            default:
                this.writingSample = false;
                this.sampleTimeUs = -9223372036854775807L;
                break;
        }
    }

    public Id3Reader() {
        this.$r8$classId = 0;
        this.id3Header = new ParsableByteArray(10);
        this.sampleTimeUs = -9223372036854775807L;
    }
}
