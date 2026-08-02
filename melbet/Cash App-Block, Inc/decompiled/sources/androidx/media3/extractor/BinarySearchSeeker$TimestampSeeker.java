package androidx.media3.extractor;

/* loaded from: classes3.dex */
public interface BinarySearchSeeker$TimestampSeeker {
    default void onSeekFinished() {
    }

    BinarySearchSeeker$TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j);
}
