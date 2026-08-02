package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.MediaMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ApicFrame extends Id3Frame {
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.pictureType == apicFrame.pictureType && this.mimeType.equals(apicFrame.mimeType) && Objects.equals(this.description, apicFrame.description) && Arrays.equals(this.pictureData, apicFrame.pictureData);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((527 + this.pictureType) * 31, 31, this.mimeType);
        String str = this.description;
        return Arrays.hashCode(this.pictureData) + ((m + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureType, this.pictureData);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
