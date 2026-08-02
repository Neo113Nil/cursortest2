package androidx.media3.extractor;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public interface ExtractorOutput {
    public static final Transition.AnonymousClass1 PLACEHOLDER = new Transition.AnonymousClass1();

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i, int i2);
}
