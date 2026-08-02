package androidx.compose.runtime.tooling;

/* loaded from: classes3.dex */
public final class LocationSourceInformation {
    public final boolean isRepeatable;
    public final int length;
    public final int lineNumber;
    public final int offset;

    public LocationSourceInformation(int i, int i2, boolean z, int i3) {
        this.lineNumber = i;
        this.offset = i2;
        this.length = i3;
        this.isRepeatable = z;
    }
}
