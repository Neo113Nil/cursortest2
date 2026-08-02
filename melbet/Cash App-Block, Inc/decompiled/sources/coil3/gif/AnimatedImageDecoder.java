package coil3.gif;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.t7$$ExternalSyntheticLambda4;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.decode.DecodeResult;
import coil3.decode.Decoder;
import coil3.decode.ImageSource;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import coil3.size.ScaleDrawable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.BufferedSource;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnimatedImageDecoder implements Decoder {
    public final boolean enforceMinimumFrameDelay;
    public final Options options;
    public final ImageSource source;

    /* loaded from: classes.dex */
    public final class Factory implements Decoder.Factory {
        public final boolean enforceMinimumFrameDelay;

        public Factory() {
            this.enforceMinimumFrameDelay = Build.VERSION.SDK_INT < 34;
        }

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, RealImageLoader realImageLoader) {
            BufferedSource source = sourceFetchResult.getSource().source();
            if (DecodeUtilsKt.isGif(source) || DecodeUtilsKt.isAnimatedWebP(source) || (Build.VERSION.SDK_INT >= 30 && DecodeUtilsKt.isAnimatedHeif(source))) {
                return new AnimatedImageDecoder(sourceFetchResult.getSource(), options, this.enforceMinimumFrameDelay);
            }
            return null;
        }
    }

    public AnimatedImageDecoder(ImageSource imageSource, Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.enforceMinimumFrameDelay = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil3.decode.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(Continuation continuation) {
        AnimatedImageDecoder$decode$1 animatedImageDecoder$decode$1;
        Object obj;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        Object runInterruptible;
        Object wrapDrawable;
        Ref$BooleanRef ref$BooleanRef2;
        if (continuation instanceof AnimatedImageDecoder$decode$1) {
            animatedImageDecoder$decode$1 = (AnimatedImageDecoder$decode$1) continuation;
            int i2 = animatedImageDecoder$decode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                animatedImageDecoder$decode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = animatedImageDecoder$decode$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedImageDecoder$decode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ref$BooleanRef = new Ref$BooleanRef();
                    t7$$ExternalSyntheticLambda4 t7__externalsyntheticlambda4 = new t7$$ExternalSyntheticLambda4(9, this, ref$BooleanRef);
                    animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
                    animatedImageDecoder$decode$1.label = 1;
                    runInterruptible = InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, t7__externalsyntheticlambda4, animatedImageDecoder$decode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$BooleanRef2 = animatedImageDecoder$decode$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        return new DecodeResult(Image_androidKt.asImage((Drawable) obj2), ref$BooleanRef2.element);
                    }
                    Ref$BooleanRef ref$BooleanRef3 = animatedImageDecoder$decode$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    runInterruptible = obj2;
                    ref$BooleanRef = ref$BooleanRef3;
                }
                animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
                animatedImageDecoder$decode$1.label = 2;
                wrapDrawable = wrapDrawable((Drawable) runInterruptible, animatedImageDecoder$decode$1);
                if (wrapDrawable != obj) {
                    Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                    obj2 = wrapDrawable;
                    ref$BooleanRef2 = ref$BooleanRef4;
                    return new DecodeResult(Image_androidKt.asImage((Drawable) obj2), ref$BooleanRef2.element);
                }
                return obj;
            }
        }
        animatedImageDecoder$decode$1 = new AnimatedImageDecoder$decode$1(this, (ContinuationImpl) continuation);
        Object obj22 = animatedImageDecoder$decode$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedImageDecoder$decode$1.label;
        if (i != 0) {
        }
        animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
        animatedImageDecoder$decode$1.label = 2;
        wrapDrawable = wrapDrawable((Drawable) runInterruptible, animatedImageDecoder$decode$1);
        if (wrapDrawable != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wrapDrawable(Drawable drawable, ContinuationImpl continuationImpl) {
        AnimatedImageDecoder$wrapDrawable$1 animatedImageDecoder$wrapDrawable$1;
        int i;
        if (continuationImpl instanceof AnimatedImageDecoder$wrapDrawable$1) {
            animatedImageDecoder$wrapDrawable$1 = (AnimatedImageDecoder$wrapDrawable$1) continuationImpl;
            int i2 = animatedImageDecoder$wrapDrawable$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                animatedImageDecoder$wrapDrawable$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = animatedImageDecoder$wrapDrawable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedImageDecoder$wrapDrawable$1.label;
                Options options = this.options;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    Extras.Key key = ImageRequestsKt.repeatCountKey;
                    if (((Number) ExtrasKt.getExtra(options, key)).intValue() != -2) {
                        ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) ExtrasKt.getExtra(options, key)).intValue());
                    }
                    Function0 function0 = (Function0) ExtrasKt.getExtra(options, ImageRequestsKt.animationStartCallbackKey);
                    Function0 function02 = (Function0) ExtrasKt.getExtra(options, ImageRequestsKt.animationEndCallbackKey);
                    if (function0 != null || function02 != null) {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        HandlerContext handlerContext = MainDispatcherLoader.dispatcher.immediate;
                        AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(drawable, function0, function02, null, 0);
                        animatedImageDecoder$wrapDrawable$1.L$0 = (AnimatedImageDrawable) drawable;
                        animatedImageDecoder$wrapDrawable$1.label = 1;
                        if (JobKt.withContext(handlerContext, animatedImageDecoder$wrapDrawable$2, animatedImageDecoder$wrapDrawable$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        drawable = drawable;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = animatedImageDecoder$wrapDrawable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new ScaleDrawable(drawable, options.scale);
            }
        }
        animatedImageDecoder$wrapDrawable$1 = new AnimatedImageDecoder$wrapDrawable$1(this, continuationImpl);
        Object obj2 = animatedImageDecoder$wrapDrawable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedImageDecoder$wrapDrawable$1.label;
        Options options2 = this.options;
        if (i != 0) {
        }
        return new ScaleDrawable(drawable, options2.scale);
    }
}
