package androidx.camera.camera2.pipe.media;

import android.content.res.TypedArray;
import android.media.Image;
import androidx.camera.video.Recorder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.atomicfu.AtomicRef;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SharedOutputImage$Companion$SharedOutputImageImpl implements OutputImage {
    public final AtomicBoolean closed = AtomicFU.atomic(false);
    public final OutputImage outputImage;
    public final Recorder.AnonymousClass3 sharedReference;

    public SharedOutputImage$Companion$SharedOutputImageImpl(OutputImage outputImage, Recorder.AnonymousClass3 anonymousClass3) {
        this.outputImage = outputImage;
        this.sharedReference = anonymousClass3;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SharedOutputImage$Companion$SharedOutputImageImpl acquire() {
        int i;
        int i2;
        SharedOutputImage$Companion$SharedOutputImageImpl sharedOutputImage$Companion$SharedOutputImageImpl;
        if (!this.closed.getValue()) {
            Recorder.AnonymousClass3 anonymousClass3 = this.sharedReference;
            AtomicInt atomicInt = (AtomicInt) anonymousClass3.val$recordingToStart;
            do {
                i = atomicInt.value;
                i2 = i == 0 ? 0 : i + 1;
            } while (!AtomicInt.FU.compareAndSet(atomicInt, i, i2));
            if ((i2 != 0 ? (OutputImage) anonymousClass3.val$completer : null) != null) {
                sharedOutputImage$Companion$SharedOutputImageImpl = new SharedOutputImage$Companion$SharedOutputImageImpl(this.outputImage, this.sharedReference);
                if (sharedOutputImage$Companion$SharedOutputImageImpl == null) {
                    return sharedOutputImage$Companion$SharedOutputImageImpl;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            }
        }
        sharedOutputImage$Companion$SharedOutputImageImpl = null;
        if (sharedOutputImage$Companion$SharedOutputImageImpl == null) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (this.closed.compareAndSet()) {
            Recorder.AnonymousClass3 anonymousClass3 = this.sharedReference;
            AtomicInt atomicInt = (AtomicInt) anonymousClass3.val$recordingToStart;
            atomicInt.getClass();
            if (AtomicInt.FU.decrementAndGet(atomicInt) == 0) {
                AtomicRef atomicRef = (AtomicRef) anonymousClass3.this$0;
                atomicRef.getClass();
                ((ClosingFinalizer) AtomicRef.FU.getAndSet(atomicRef, null)).getClass();
                AutoCloseable autoCloseable = (OutputImage) anonymousClass3.val$completer;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (!(autoCloseable instanceof ExecutorService)) {
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    } else {
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return;
                    }
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final String toString() {
        return this.outputImage.toString();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (this.closed.getValue()) {
            return null;
        }
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(SharedOutputImage$Companion$SharedOutputImageImpl.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(OutputImage.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(ImageWrapper.class))) {
            return this;
        }
        if (!kClass.equals(reflectionFactory.getOrCreateKotlinClass(Image.class))) {
            return this.outputImage.unwrapAs(kClass);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }
}
