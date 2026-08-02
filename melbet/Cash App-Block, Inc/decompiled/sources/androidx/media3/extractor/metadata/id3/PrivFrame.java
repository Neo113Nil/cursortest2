package androidx.media3.extractor.metadata.id3;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class PrivFrame extends Id3Frame {
    public final String owner;
    public final byte[] privateData;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.owner = str;
        this.privateData = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return this.owner.equals(privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.privateData) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.owner);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": owner=" + this.owner;
    }
}
