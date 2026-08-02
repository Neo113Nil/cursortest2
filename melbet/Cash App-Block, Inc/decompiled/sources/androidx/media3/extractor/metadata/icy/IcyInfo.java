package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class IcyInfo implements Metadata.Entry {
    public final byte[] rawMetadata;
    public final String title;
    public final String url;

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj).rawMetadata);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.title;
        if (str != null) {
            builder.title = str;
        }
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rawMetadata.length, "\"", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ICY: title=\"", this.title, "\", url=\"", this.url, "\", rawMetadata.length=\""));
    }
}
