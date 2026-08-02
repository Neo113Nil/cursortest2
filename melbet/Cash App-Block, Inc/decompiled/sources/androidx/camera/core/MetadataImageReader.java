package androidx.camera.core;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.core.streamsharing.VirtualCameraAdapter;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.VideoCapture;
import androidx.room.TransactorKt;
import coil3.memory.RealStrongMemoryCache;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {
    public final ArrayList mAcquiredImageProxies;
    public final AnonymousClass1 mCameraCaptureCallback;
    public boolean mClosed;
    public Executor mExecutor;
    public int mImageProxiesIndex;
    public final VideoCapture.AnonymousClass3 mImageReaderProxy;
    public ImageReaderProxy.OnImageAvailableListener mListener;
    public final Object mLock;
    public final ArrayList mMatchedImageProxies;
    public final LongSparseArray mPendingImageInfos;
    public final LongSparseArray mPendingImages;
    public final StreamSharing$$ExternalSyntheticLambda1 mTransformedListener;
    public int mUnAcquiredAvailableImageCount;

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3(ImageReader.newInstance(i, i2, i3, i4));
        this.mLock = new Object();
        this.mCameraCaptureCallback = new AnonymousClass1(this, 0);
        this.mUnAcquiredAvailableImageCount = 0;
        this.mTransformedListener = new StreamSharing$$ExternalSyntheticLambda1(this, 7);
        this.mClosed = false;
        this.mPendingImageInfos = new LongSparseArray();
        this.mPendingImages = new LongSparseArray();
        this.mAcquiredImageProxies = new ArrayList();
        this.mImageReaderProxy = anonymousClass3;
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new ArrayList(getMaxImages());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            try {
                if (this.mMatchedImageProxies.isEmpty()) {
                    return null;
                }
                if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.mMatchedImageProxies.size() - 1; i++) {
                    if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i))) {
                        arrayList.add((ImageProxy) this.mMatchedImageProxies.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                int size = this.mMatchedImageProxies.size();
                ArrayList arrayList2 = this.mMatchedImageProxies;
                this.mImageProxiesIndex = size;
                ImageProxy imageProxy = (ImageProxy) arrayList2.get(size - 1);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            try {
                if (this.mMatchedImageProxies.isEmpty()) {
                    return null;
                }
                if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.mMatchedImageProxies;
                int i = this.mImageProxiesIndex;
                this.mImageProxiesIndex = i + 1;
                ImageProxy imageProxy = (ImageProxy) arrayList.get(i);
                this.mAcquiredImageProxies.add(imageProxy);
                return imageProxy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReaderProxy.clearOnImageAvailableListener();
            this.mListener = null;
            this.mExecutor = null;
            this.mUnAcquiredAvailableImageCount = 0;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                Iterator it = new ArrayList(this.mMatchedImageProxies).iterator();
                while (it.hasNext()) {
                    ((ImageProxy) it.next()).close();
                }
                this.mMatchedImageProxies.clear();
                this.mImageReaderProxy.close();
                this.mClosed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dequeImageProxy(ForwardingImageProxy forwardingImageProxy) {
        synchronized (this.mLock) {
            try {
                int indexOf = this.mMatchedImageProxies.indexOf(forwardingImageProxy);
                if (indexOf >= 0) {
                    this.mMatchedImageProxies.remove(indexOf);
                    int i = this.mImageProxiesIndex;
                    if (indexOf <= i) {
                        this.mImageProxiesIndex = i - 1;
                    }
                }
                this.mAcquiredImageProxies.remove(forwardingImageProxy);
                if (this.mUnAcquiredAvailableImageCount > 0) {
                    imageIncoming(this.mImageReaderProxy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void enqueueImageProxy(SettableImageProxy settableImageProxy) {
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.mLock) {
            try {
                if (this.mMatchedImageProxies.size() < getMaxImages()) {
                    settableImageProxy.addOnImageCloseListener(this);
                    this.mMatchedImageProxies.add(settableImageProxy);
                    onImageAvailableListener = this.mListener;
                    executor = this.mExecutor;
                } else {
                    StringUtilsKt.d("TAG", "Maximum image number reached.");
                    settableImageProxy.close();
                    onImageAvailableListener = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new CameraX$$ExternalSyntheticLambda2(9, this, onImageAvailableListener));
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    public final void imageIncoming(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxy;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return;
                }
                int size = this.mPendingImages.size() + this.mMatchedImageProxies.size();
                if (size >= imageReaderProxy.getMaxImages()) {
                    StringUtilsKt.d("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        imageProxy = imageReaderProxy.acquireNextImage();
                        if (imageProxy != null) {
                            this.mUnAcquiredAvailableImageCount--;
                            size++;
                            this.mPendingImages.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                            matchImages();
                        }
                    } catch (IllegalStateException e) {
                        if (StringUtilsKt.isLogLevelEnabled(3, "MetadataImageReader")) {
                            Log.d("MetadataImageReader", "Failed to acquire next image.", e);
                        }
                        imageProxy = null;
                    }
                    if (imageProxy == null || this.mUnAcquiredAvailableImageCount <= 0) {
                        break;
                    }
                } while (size < imageReaderProxy.getMaxImages());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void matchImages() {
        synchronized (this.mLock) {
            try {
                for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                    ImageInfo imageInfo = (ImageInfo) this.mPendingImageInfos.valueAt(size);
                    long timestamp = imageInfo.getTimestamp();
                    ImageProxy imageProxy = (ImageProxy) this.mPendingImages.get(timestamp);
                    if (imageProxy != null) {
                        this.mPendingImages.remove(timestamp);
                        this.mPendingImageInfos.removeAt(size);
                        enqueueImageProxy(new SettableImageProxy(imageProxy, null, imageInfo));
                    }
                }
                removeStaleData();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ForwardingImageProxy forwardingImageProxy) {
        synchronized (this.mLock) {
            dequeImageProxy(forwardingImageProxy);
        }
    }

    public final void removeStaleData() {
        synchronized (this.mLock) {
            try {
                if (this.mPendingImages.size() != 0 && this.mPendingImageInfos.size() != 0) {
                    long keyAt = this.mPendingImages.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.mPendingImageInfos.keyAt(0);
                    TransactorKt.checkArgument(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                            if (this.mPendingImages.keyAt(size) < keyAt2) {
                                ((ImageProxy) this.mPendingImages.valueAt(size)).close();
                                this.mPendingImages.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.mPendingImageInfos.size() - 1; size2 >= 0; size2--) {
                            if (this.mPendingImageInfos.keyAt(size2) < keyAt) {
                                this.mPendingImageInfos.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            onImageAvailableListener.getClass();
            this.mListener = onImageAvailableListener;
            executor.getClass();
            this.mExecutor = executor;
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, executor);
        }
    }

    /* renamed from: androidx.camera.core.MetadataImageReader$1, reason: invalid class name */
    public final class AnonymousClass1 extends CameraCaptureCallback {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(List list) {
            this.$r8$classId = 2;
            this.this$0 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                if (!(cameraCaptureCallback instanceof CameraCaptureCallbacks.NoOpCameraCaptureCallback)) {
                    ((ArrayList) this.this$0).add(cameraCaptureCallback);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(int i) {
            switch (this.$r8$classId) {
                case 2:
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        ((CameraCaptureCallback) it.next()).onCaptureCancelled(i);
                    }
                    break;
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i, CameraCaptureResult cameraCaptureResult) {
            switch (this.$r8$classId) {
                case 0:
                    MetadataImageReader metadataImageReader = (MetadataImageReader) this.this$0;
                    synchronized (metadataImageReader.mLock) {
                        try {
                            if (metadataImageReader.mClosed) {
                                return;
                            }
                            metadataImageReader.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
                            metadataImageReader.matchImages();
                            return;
                        } finally {
                        }
                    }
                case 1:
                default:
                    return;
                case 2:
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        ((CameraCaptureCallback) it.next()).onCaptureCompleted(i, cameraCaptureResult);
                    }
                    return;
                case 3:
                    VirtualCameraAdapter virtualCameraAdapter = (VirtualCameraAdapter) ((WeakReference) this.this$0).get();
                    if (virtualCameraAdapter != null) {
                        Iterator it2 = virtualCameraAdapter.mChildren.iterator();
                        while (it2.hasNext()) {
                            SessionConfig sessionConfig = ((UseCase) it2.next()).mAttachedSessionConfig;
                            Iterator it3 = sessionConfig.mRepeatingCaptureConfig.mCameraCaptureCallbacks.iterator();
                            while (it3.hasNext()) {
                                ((CameraCaptureCallback) it3.next()).onCaptureCompleted(i, new RealStrongMemoryCache(cameraCaptureResult, sessionConfig.mRepeatingCaptureConfig.mTagBundle, -1L));
                            }
                        }
                        return;
                    }
                    return;
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i, HurlStack hurlStack) {
            switch (this.$r8$classId) {
                case 2:
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        ((CameraCaptureCallback) it.next()).onCaptureFailed(i, hurlStack);
                    }
                    break;
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    zzabp.mainThreadExecutor().execute(new Recorder$$ExternalSyntheticLambda14(this, i2, 3));
                    break;
                case 2:
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        ((CameraCaptureCallback) it.next()).onCaptureProcessProgressed(i, i2);
                    }
                    break;
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i) {
            switch (this.$r8$classId) {
                case 1:
                    zzabp.mainThreadExecutor().execute(new Preview$$ExternalSyntheticLambda0(this, 10));
                    break;
                case 2:
                    Iterator it = ((ArrayList) this.this$0).iterator();
                    while (it.hasNext()) {
                        ((CameraCaptureCallback) it.next()).onCaptureStarted(i);
                    }
                    break;
            }
        }

        public AnonymousClass1(VirtualCameraAdapter virtualCameraAdapter) {
            this.$r8$classId = 3;
            this.this$0 = new WeakReference(virtualCameraAdapter);
        }

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
