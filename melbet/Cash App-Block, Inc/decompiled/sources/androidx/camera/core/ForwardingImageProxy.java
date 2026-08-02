package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ForwardingImageProxy implements ImageProxy {
    public final ImageProxy mImage;
    public final Object mLock = new Object();
    public final HashSet mOnImageCloseListeners = new HashSet();

    public interface OnImageCloseListener {
        void onImageClose(ForwardingImageProxy forwardingImageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.mImage = imageProxy;
    }

    public final void addOnImageCloseListener(OnImageCloseListener onImageCloseListener) {
        synchronized (this.mLock) {
            this.mOnImageCloseListeners.add(onImageCloseListener);
        }
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.mImage.close();
        synchronized (this.mLock) {
            hashSet = new HashSet(this.mOnImageCloseListeners);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((OnImageCloseListener) it.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return this.mImage.getImage();
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }
}
