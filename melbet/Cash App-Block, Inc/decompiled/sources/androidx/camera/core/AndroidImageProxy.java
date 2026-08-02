package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.video.Recorder;

/* loaded from: classes3.dex */
public final class AndroidImageProxy implements ImageProxy {
    public final Image mImage;
    public final AutoValue_ImmutableImageInfo mImageInfo;
    public final Recorder.AnonymousClass6[] mPlanes;

    public AndroidImageProxy(Image image) {
        this.mImage = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.mPlanes = new Recorder.AnonymousClass6[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.mPlanes[i] = new Recorder.AnonymousClass6(planes[i], 9);
            }
        } else {
            this.mPlanes = new Recorder.AnonymousClass6[0];
        }
        this.mImageInfo = new AutoValue_ImmutableImageInfo(TagBundle.EMPTY_TAGBUNDLE, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.mImage.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.mImage;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageInfo getImageInfo() {
        return this.mImageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        return this.mPlanes;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public final void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }
}
