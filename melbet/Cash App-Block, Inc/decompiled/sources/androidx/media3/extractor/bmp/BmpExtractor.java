package androidx.media3.extractor.bmp;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SingleSampleExtractor;
import androidx.media3.extractor.jpeg.JpegMotionPhotoExtractor;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class BmpExtractor implements Extractor {
    public final /* synthetic */ int $r8$classId;
    public final Extractor imageExtractor;

    public BmpExtractor(byte b, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.imageExtractor = new SingleSampleExtractor(35152, 2, "image/png");
                break;
            default:
                this.imageExtractor = new SingleSampleExtractor(16973, 2, "image/bmp");
                break;
        }
    }

    private final void release$androidx$media3$extractor$bmp$BmpExtractor() {
    }

    private final void release$androidx$media3$extractor$png$PngExtractor() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        int i = this.$r8$classId;
        Extractor extractor = this.imageExtractor;
        switch (i) {
            case 0:
                ((SingleSampleExtractor) extractor).init(extractorOutput);
                break;
            case 1:
                ((SingleSampleExtractor) extractor).init(extractorOutput);
                break;
            default:
                extractor.init(extractorOutput);
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        int i = this.$r8$classId;
        Extractor extractor = this.imageExtractor;
        switch (i) {
            case 0:
                return ((SingleSampleExtractor) extractor).read(extractorInput, iadFrame);
            case 1:
                return ((SingleSampleExtractor) extractor).read(extractorInput, iadFrame);
            default:
                return extractor.read(extractorInput, iadFrame);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        switch (this.$r8$classId) {
            case 0:
            case 1:
                break;
            default:
                this.imageExtractor.release();
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        int i = this.$r8$classId;
        Extractor extractor = this.imageExtractor;
        switch (i) {
            case 0:
                ((SingleSampleExtractor) extractor).seek(j, j2);
                break;
            case 1:
                ((SingleSampleExtractor) extractor).seek(j, j2);
                break;
            default:
                extractor.seek(j, j2);
                break;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        int i = this.$r8$classId;
        Extractor extractor = this.imageExtractor;
        switch (i) {
            case 0:
                return ((SingleSampleExtractor) extractor).sniff(extractorInput);
            case 1:
                return ((SingleSampleExtractor) extractor).sniff(extractorInput);
            default:
                return extractor.sniff(extractorInput);
        }
    }

    public BmpExtractor(int i) {
        this.$r8$classId = 2;
        if ((i & 1) != 0) {
            this.imageExtractor = new SingleSampleExtractor(65496, 2, "image/jpeg");
        } else {
            this.imageExtractor = new JpegMotionPhotoExtractor();
        }
    }
}
