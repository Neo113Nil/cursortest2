package androidx.media3.extractor.heif;

import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SingleSampleExtractor;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class HeifExtractor implements Extractor {
    public final boolean extractImage;
    public final Extractor extractor;

    public HeifExtractor(int i) {
        boolean z = (i & 1) != 0;
        this.extractImage = z;
        if (z) {
            this.extractor = new SingleSampleExtractor(-1, -1, "image/heif");
        } else {
            this.extractor = new HeicMotionPhotoExtractor();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        return this.extractor.read(extractorInput, iadFrame);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.extractor.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return this.extractImage ? HeifSniffer.sniff((DefaultExtractorInput) extractorInput, false) : this.extractor.sniff(extractorInput);
    }
}
