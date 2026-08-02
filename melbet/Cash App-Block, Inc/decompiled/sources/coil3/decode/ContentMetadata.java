package coil3.decode;

import android.content.res.AssetFileDescriptor;
import coil3.decode.ImageSource;

/* loaded from: classes3.dex */
public final class ContentMetadata extends ImageSource.Metadata {
    public final AssetFileDescriptor assetFileDescriptor;

    public ContentMetadata(AssetFileDescriptor assetFileDescriptor) {
        this.assetFileDescriptor = assetFileDescriptor;
    }
}
