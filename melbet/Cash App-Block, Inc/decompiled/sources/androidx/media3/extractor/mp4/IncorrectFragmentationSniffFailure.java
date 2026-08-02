package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public static final IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new IncorrectFragmentationSniffFailure(true);
    public static final IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    public IncorrectFragmentationSniffFailure(boolean z) {
        this.fileIsFragmented = z;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("IncorrectFragmentation{expected="), !this.fileIsFragmented, "}");
    }
}
