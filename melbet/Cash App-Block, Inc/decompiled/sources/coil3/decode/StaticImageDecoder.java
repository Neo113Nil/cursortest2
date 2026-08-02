package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.BitmapImage;
import coil3.RealImageLoader;
import coil3.decode.Decoder;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class StaticImageDecoder implements Decoder {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object closeable;
    public final Options options;
    public final SemaphoreImpl parallelismLock;
    public final Object source;

    /* loaded from: classes.dex */
    public final class Factory implements Decoder.Factory {
        public final SemaphoreImpl parallelismLock;

        public Factory(SemaphoreImpl semaphoreImpl) {
            this.parallelismLock = semaphoreImpl;
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, RealImageLoader realImageLoader) {
            ImageDecoder.Source imageDecoderSourceOrNull;
            Bitmap.Config bitmapConfig = ImageRequests_androidKt.getBitmapConfig(options);
            if ((bitmapConfig == Bitmap.Config.ARGB_8888 || bitmapConfig == Bitmap.Config.HARDWARE) && (imageDecoderSourceOrNull = StaticImageDecoderKt.toImageDecoderSourceOrNull(sourceFetchResult.getSource(), options, false)) != null) {
                return new StaticImageDecoder(imageDecoderSourceOrNull, sourceFetchResult.getSource(), options, this.parallelismLock);
            }
            return null;
        }
    }

    public StaticImageDecoder(ImageSource imageSource, Options options, SemaphoreImpl semaphoreImpl, ExifOrientationStrategy$$ExternalSyntheticLambda0 exifOrientationStrategy$$ExternalSyntheticLambda0) {
        this.source = imageSource;
        this.options = options;
        this.parallelismLock = semaphoreImpl;
        this.closeable = exifOrientationStrategy$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:(2:5|(10:7|8|(1:(1:(6:12|13|14|15|16|17)(2:23|24))(1:25))(1:40)|26|27|29|30|(4:34|15|16|17)|32|33))|29|30|(0)|32|33)|42|8|(0)(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004f, code lost:
    
        if (r9 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a7  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(Continuation continuation) {
        StaticImageDecoder$decode$1 staticImageDecoder$decode$1;
        int i;
        SemaphoreImpl semaphoreImpl;
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        Semaphore semaphore;
        Object obj2;
        int i3 = this.$r8$classId;
        SemaphoreImpl semaphoreImpl2 = this.parallelismLock;
        int i4 = 1;
        switch (i3) {
            case 0:
                try {
                    try {
                        if (continuation instanceof StaticImageDecoder$decode$1) {
                            staticImageDecoder$decode$1 = (StaticImageDecoder$decode$1) continuation;
                            int i5 = staticImageDecoder$decode$1.label;
                            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                staticImageDecoder$decode$1.label = i5 - PKIFailureInfo.systemUnavail;
                                Object obj3 = staticImageDecoder$decode$1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = staticImageDecoder$decode$1.label;
                                if (i != 0) {
                                    SafeTrace.throwOnFailure(obj3);
                                    staticImageDecoder$decode$1.L$0 = semaphoreImpl2;
                                    staticImageDecoder$decode$1.label = 1;
                                    Object acquire = semaphoreImpl2.acquire(staticImageDecoder$decode$1);
                                    semaphoreImpl = semaphoreImpl2;
                                    if (acquire == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                } else {
                                    if (i != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    SemaphoreImpl semaphoreImpl3 = staticImageDecoder$decode$1.L$0;
                                    SafeTrace.throwOnFailure(obj3);
                                    semaphoreImpl = semaphoreImpl3;
                                }
                                AutoCloseable autoCloseable = (AutoCloseable) this.closeable;
                                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                DecodeResult decodeResult = new DecodeResult(new BitmapImage(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.source, new StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1(this, ref$BooleanRef, 0))), ref$BooleanRef.element);
                                Cache.Companion.closeFinally(autoCloseable, null);
                                return decodeResult;
                            }
                        }
                        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                        DecodeResult decodeResult2 = new DecodeResult(new BitmapImage(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.source, new StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1(this, ref$BooleanRef2, 0))), ref$BooleanRef2.element);
                        Cache.Companion.closeFinally(autoCloseable, null);
                        return decodeResult2;
                    } finally {
                    }
                    AutoCloseable autoCloseable2 = (AutoCloseable) this.closeable;
                } finally {
                    semaphoreImpl.release();
                }
                staticImageDecoder$decode$1 = new StaticImageDecoder$decode$1(this, (ContinuationImpl) continuation);
                Object obj32 = staticImageDecoder$decode$1.result;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = staticImageDecoder$decode$1.label;
                if (i != 0) {
                }
            default:
                try {
                    if (continuation instanceof BitmapFactoryDecoder$decode$1) {
                        bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuation;
                        int i6 = bitmapFactoryDecoder$decode$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            bitmapFactoryDecoder$decode$1.label = i6 - PKIFailureInfo.systemUnavail;
                            obj = bitmapFactoryDecoder$decode$1.result;
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = bitmapFactoryDecoder$decode$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj);
                                bitmapFactoryDecoder$decode$1.L$0 = semaphoreImpl2;
                                bitmapFactoryDecoder$decode$1.label = 1;
                                Object acquire2 = semaphoreImpl2.acquire(bitmapFactoryDecoder$decode$1);
                                semaphore = semaphoreImpl2;
                                break;
                            } else {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    obj2 = bitmapFactoryDecoder$decode$1.L$0;
                                    try {
                                        SafeTrace.throwOnFailure(obj);
                                        DecodeResult decodeResult3 = (DecodeResult) obj;
                                        ((SemaphoreAndMutexImpl) obj2).release();
                                        return decodeResult3;
                                    } catch (Throwable th) {
                                        th = th;
                                        ((SemaphoreAndMutexImpl) obj2).release();
                                        throw th;
                                    }
                                }
                                Semaphore semaphore2 = bitmapFactoryDecoder$decode$1.L$0;
                                SafeTrace.throwOnFailure(obj);
                                semaphore = semaphore2;
                            }
                            yf$$ExternalSyntheticLambda2 yf__externalsyntheticlambda2 = new yf$$ExternalSyntheticLambda2(this, i4);
                            bitmapFactoryDecoder$decode$1.L$0 = semaphore;
                            bitmapFactoryDecoder$decode$1.label = 2;
                            obj = InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, yf__externalsyntheticlambda2, bitmapFactoryDecoder$decode$1);
                            if (obj != coroutineSingletons) {
                                obj2 = semaphore;
                                DecodeResult decodeResult32 = (DecodeResult) obj;
                                ((SemaphoreAndMutexImpl) obj2).release();
                                return decodeResult32;
                            }
                            return coroutineSingletons;
                        }
                    }
                    obj = InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, yf__externalsyntheticlambda2, bitmapFactoryDecoder$decode$1);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = semaphore;
                    ((SemaphoreAndMutexImpl) obj2).release();
                    throw th;
                }
                bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, (ContinuationImpl) continuation);
                obj = bitmapFactoryDecoder$decode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bitmapFactoryDecoder$decode$1.label;
                if (i2 != 0) {
                }
                yf$$ExternalSyntheticLambda2 yf__externalsyntheticlambda22 = new yf$$ExternalSyntheticLambda2(this, i4);
                bitmapFactoryDecoder$decode$1.L$0 = semaphore;
                bitmapFactoryDecoder$decode$1.label = 2;
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, ImageSource imageSource, Options options, SemaphoreImpl semaphoreImpl) {
        this.source = source;
        this.closeable = imageSource;
        this.options = options;
        this.parallelismLock = semaphoreImpl;
    }
}
