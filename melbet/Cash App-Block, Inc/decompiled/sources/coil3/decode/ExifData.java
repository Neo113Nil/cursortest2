package coil3.decode;

/* loaded from: classes3.dex */
public final class ExifData {
    public static final ExifData NONE = new ExifData(false, 0);
    public final boolean isFlipped;
    public final int rotationDegrees;

    public ExifData(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }
}
