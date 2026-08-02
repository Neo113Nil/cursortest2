package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes3.dex */
public final class SettableImageProxy extends ForwardingImageProxy {
    public Rect mCropRect;
    public final int mHeight;
    public final ImageInfo mImageInfo;
    public final Object mLock;
    public final int mWidth;

    public SettableImageProxy(ImageProxy imageProxy, Size size, ImageInfo imageInfo) {
        super(imageProxy);
        this.mLock = new Object();
        if (size == null) {
            this.mWidth = this.mImage.getWidth();
            this.mHeight = this.mImage.getHeight();
        } else {
            this.mWidth = size.getWidth();
            this.mHeight = size.getHeight();
        }
        this.mImageInfo = imageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final Rect getCropRect() {
        synchronized (this.mLock) {
            try {
                if (this.mCropRect == null) {
                    return new Rect(0, 0, this.mWidth, this.mHeight);
                }
                return new Rect(this.mCropRect);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.mHeight;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.mWidth;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final void setCropRect(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.mWidth, this.mHeight)) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.mLock) {
            this.mCropRect = rect;
        }
    }
}
