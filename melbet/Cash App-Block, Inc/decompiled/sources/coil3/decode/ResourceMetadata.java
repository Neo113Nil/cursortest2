package coil3.decode;

import coil3.decode.ImageSource;

/* loaded from: classes3.dex */
public final class ResourceMetadata extends ImageSource.Metadata {
    public final String packageName;
    public final int resId;

    public ResourceMetadata(String str, int i) {
        this.packageName = str;
        this.resId = i;
    }
}
