package androidx.media3.extractor;

/* loaded from: classes3.dex */
public final class BinarySearchSeeker$TimestampSearchResult {
    public static final BinarySearchSeeker$TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new BinarySearchSeeker$TimestampSearchResult(-3, -9223372036854775807L, -1);
    public final long bytePositionToUpdate;
    public final long timestampToUpdate;

    /* renamed from: type, reason: collision with root package name */
    public final int f887type;

    public BinarySearchSeeker$TimestampSearchResult(int i, long j, long j2) {
        this.f887type = i;
        this.timestampToUpdate = j;
        this.bytePositionToUpdate = j2;
    }
}
