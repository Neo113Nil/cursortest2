package androidx.media3.extractor.avif;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SingleSampleExtractor;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class AvifExtractor implements Extractor {
    public final /* synthetic */ int $r8$classId;
    public final SingleSampleExtractor imageExtractor;
    public final ParsableByteArray scratch;

    public AvifExtractor(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.scratch = new ParsableByteArray(4);
                this.imageExtractor = new SingleSampleExtractor(-1, -1, "image/webp");
                break;
            default:
                this.scratch = new ParsableByteArray(4);
                this.imageExtractor = new SingleSampleExtractor(-1, -1, "image/avif");
                break;
        }
    }

    private final void release$androidx$media3$extractor$avif$AvifExtractor() {
    }

    private final void release$androidx$media3$extractor$webp$WebpExtractor() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        int i = this.$r8$classId;
        SingleSampleExtractor singleSampleExtractor = this.imageExtractor;
        switch (i) {
            case 0:
                singleSampleExtractor.init(extractorOutput);
                break;
            default:
                singleSampleExtractor.init(extractorOutput);
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        switch (this.$r8$classId) {
        }
        return this.imageExtractor.read(extractorInput, iadFrame);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        int i = this.$r8$classId;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        switch (this.$r8$classId) {
            case 0:
                this.imageExtractor.seek(j, j2);
                break;
            default:
                this.imageExtractor.seek(j, j2);
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        int i = this.$r8$classId;
        ParsableByteArray parsableByteArray = this.scratch;
        switch (i) {
            case 0:
                DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput.advancePeekPosition(4, false);
                parsableByteArray.reset(4);
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                if (parsableByteArray.readUnsignedInt() == 1718909296) {
                    parsableByteArray.reset(4);
                    defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                    if (parsableByteArray.readUnsignedInt() == 1635150182) {
                    }
                }
                break;
            default:
                parsableByteArray.reset(4);
                DefaultExtractorInput defaultExtractorInput2 = (DefaultExtractorInput) extractorInput;
                defaultExtractorInput2.peekFully(parsableByteArray.data, 0, 4, false);
                if (parsableByteArray.readUnsignedInt() == 1380533830) {
                    defaultExtractorInput2.advancePeekPosition(4, false);
                    parsableByteArray.reset(4);
                    defaultExtractorInput2.peekFully(parsableByteArray.data, 0, 4, false);
                    if (parsableByteArray.readUnsignedInt() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }
}
