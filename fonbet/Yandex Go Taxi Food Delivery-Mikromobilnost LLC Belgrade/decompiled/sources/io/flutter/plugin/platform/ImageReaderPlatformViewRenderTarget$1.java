package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import defpackage.ndv;

/* loaded from: classes4.dex */
class ImageReaderPlatformViewRenderTarget$1 implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ ndv this$0;

    public ImageReaderPlatformViewRenderTarget$1(ndv ndvVar) {
        this.this$0 = ndvVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e.toString());
            image = null;
        }
        if (image != null) {
            throw null;
        }
    }
}
