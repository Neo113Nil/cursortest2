package androidx.camera.core;

/* loaded from: classes3.dex */
public final class ImageCaptureException extends Exception {
    public final int mImageCaptureError;

    public ImageCaptureException(int i, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i;
    }
}
