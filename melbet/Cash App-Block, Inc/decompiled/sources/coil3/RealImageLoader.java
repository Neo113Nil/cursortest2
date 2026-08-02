package coil3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.u4$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.decode.Decoder;
import coil3.decode.ExifOrientationStrategy$$ExternalSyntheticLambda0;
import coil3.decode.StaticImageDecoder;
import coil3.fetch.BitmapFetcher;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.EngineInterceptor;
import coil3.key.UriKeyer;
import coil3.map.FileMapper;
import coil3.memory.RealMemoryCache;
import coil3.request.BaseRequestDelegate;
import coil3.request.Disposable;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.NullRequestData;
import coil3.request.NullRequestDataException;
import coil3.request.Options;
import coil3.request.RequestDelegate;
import coil3.request.SuccessResult;
import coil3.request.ViewTargetRequestDelegate;
import coil3.size.Precision;
import coil3.size.RealViewSizeResolver;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeResolver;
import coil3.size.ViewSizeResolverKt;
import coil3.target.ImageViewTarget;
import coil3.target.Target;
import coil3.transition.NoneTransition;
import coil3.transition.Transition;
import coil3.transition.TransitionTarget;
import coil3.util.AndroidSystemCallbacks;
import coil3.util.AndroidSystemCallbacks.ActivityCallbacks;
import coil3.util.Utils_androidKt;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import okio.Path;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealImageLoader {
    public static final /* synthetic */ AtomicIntegerFieldUpdater shutdown$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "shutdown$volatile");
    public final ComponentRegistry components;
    public final Options options;
    public final Extras.Key requestService;
    public final ContextScope scope;
    public volatile /* synthetic */ int shutdown$volatile;
    public final AndroidSystemCallbacks systemCallbacks;

    public final class Options {
        public final Context application;
        public final ComponentRegistry componentRegistry;
        public final ImageRequest.Defaults defaults;
        public final Lazy diskCacheLazy;
        public final EventListener.Factory eventListenerFactory;
        public final Lazy mainCoroutineContextLazy;
        public final Lazy memoryCacheLazy;

        public Options(Context context, ImageRequest.Defaults defaults, Lazy lazy, Lazy lazy2, Lazy lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = lazy;
            this.memoryCacheLazy = lazy2;
            this.diskCacheLazy = lazy3;
            this.eventListenerFactory = factory;
            this.componentRegistry = componentRegistry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Options) {
                Options options = (Options) obj;
                return Intrinsics.areEqual(this.application, options.application) && this.defaults.equals(options.defaults) && Intrinsics.areEqual(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && Intrinsics.areEqual(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.areEqual(this.diskCacheLazy, options.diskCacheLazy) && this.eventListenerFactory.equals(options.eventListenerFactory) && this.componentRegistry == options.componentRegistry;
            }
            return false;
        }

        public final int hashCode() {
            return (this.componentRegistry.hashCode() + ((this.eventListenerFactory.hashCode() + ((this.diskCacheLazy.hashCode() + ((this.memoryCacheLazy.hashCode() + ((this.mainCoroutineContextLazy.hashCode() + ((this.defaults.hashCode() + (this.application.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        }

        public final String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=null)";
        }
    }

    public RealImageLoader(Options options) {
        int i;
        this.options = options;
        int i2 = 0;
        this.scope = JobKt.CoroutineScope(CoroutineContext.Element.DefaultImpls.plus(JobKt.SupervisorJob$default(), new RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.$$INSTANCE, i2)));
        AndroidSystemCallbacks androidSystemCallbacks = new AndroidSystemCallbacks();
        androidSystemCallbacks.imageLoader = new WeakReference(this);
        androidSystemCallbacks.activityCallbacks = androidSystemCallbacks.new ActivityCallbacks(this);
        androidSystemCallbacks.componentCallbacks = new AndroidSystemCallbacks.ComponentCallbacks(androidSystemCallbacks, i2);
        this.systemCallbacks = androidSystemCallbacks;
        Extras.Key key = new Extras.Key(this);
        this.requestService = key;
        ComponentRegistry componentRegistry = options.componentRegistry;
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
        builder.interceptors = CollectionsKt.toMutableList((Collection) componentRegistry.interceptors);
        builder.mappers = CollectionsKt.toMutableList((Collection) componentRegistry.mappers);
        builder.keyers = CollectionsKt.toMutableList((Collection) componentRegistry.keyers);
        List fetcherFactories = componentRegistry.getFetcherFactories();
        ArrayList arrayList = new ArrayList();
        Iterator it = fetcherFactories.iterator();
        while (it.hasNext()) {
            arrayList.add(new ImageLoader$Builder$$ExternalSyntheticLambda1((Pair) it.next(), 24));
        }
        builder.lazyFetcherFactories = arrayList;
        List decoderFactories = componentRegistry.getDecoderFactories();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = decoderFactories.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            } else {
                arrayList2.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0((Decoder.Factory) it2.next(), i));
            }
        }
        builder.lazyDecoderFactories = arrayList2;
        ArrayList arrayList3 = (ArrayList) builder.keyers;
        ImageRequest.Defaults defaults = options.defaults;
        Object obj = defaults.extras.data.get(ExtrasKt.serviceLoaderEnabledKey);
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            ((ArrayList) builder.lazyFetcherFactories).add(new u4$$ExternalSyntheticLambda0(18));
            ((ArrayList) builder.lazyDecoderFactories).add(new u4$$ExternalSyntheticLambda0(19));
        }
        FileMapper fileMapper = new FileMapper(i);
        ReflectionFactory reflectionFactory = Reflection.factory;
        builder.add(fileMapper, reflectionFactory.getOrCreateKotlinClass(android.net.Uri.class));
        int i3 = 3;
        builder.add(new FileMapper(i3), reflectionFactory.getOrCreateKotlinClass(Integer.class));
        arrayList3.add(new Pair(new UriKeyer(1), reflectionFactory.getOrCreateKotlinClass(Uri.class)));
        builder.add(new BitmapFetcher.Factory(i), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        int i4 = 4;
        builder.add(new BitmapFetcher.Factory(i4), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        builder.add(new BitmapFetcher.Factory(9), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        builder.add(new BitmapFetcher.Factory(6), reflectionFactory.getOrCreateKotlinClass(Drawable.class));
        Extras.Key key2 = ImageLoaders_androidKt.bitmapFactoryMaxParallelismKey;
        Object obj2 = defaults.extras.data.get(ImageLoaders_androidKt.bitmapFactoryMaxParallelismKey);
        int intValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i5 = SemaphoreKt.MAX_SPIN_CYCLES;
        final SemaphoreImpl semaphoreImpl = new SemaphoreImpl(intValue);
        Object obj3 = defaults.extras.data.get(ImageLoaders_androidKt.imageDecoderEnabledKey);
        boolean booleanValue = ((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue();
        Object obj4 = ExifOrientationStrategy$$ExternalSyntheticLambda0.RESPECT_PERFORMANCE;
        if (booleanValue) {
            Object obj5 = defaults.extras.data.get(ImageLoaders_androidKt.bitmapFactoryExifOrientationStrategyKey);
            if (((ExifOrientationStrategy$$ExternalSyntheticLambda0) (obj5 == null ? obj4 : obj5)).equals(obj4)) {
                builder.add(new StaticImageDecoder.Factory(semaphoreImpl));
            }
        }
        Object obj6 = defaults.extras.data.get(ImageLoaders_androidKt.bitmapFactoryExifOrientationStrategyKey);
        final ExifOrientationStrategy$$ExternalSyntheticLambda0 exifOrientationStrategy$$ExternalSyntheticLambda0 = (ExifOrientationStrategy$$ExternalSyntheticLambda0) (obj6 != null ? obj6 : obj4);
        builder.add(new Decoder.Factory(semaphoreImpl, exifOrientationStrategy$$ExternalSyntheticLambda0) { // from class: coil3.decode.BitmapFactoryDecoder$Factory
            public final ExifOrientationStrategy$$ExternalSyntheticLambda0 exifOrientationStrategy;
            public final SemaphoreImpl parallelismLock;

            {
                this.parallelismLock = semaphoreImpl;
                this.exifOrientationStrategy = exifOrientationStrategy$$ExternalSyntheticLambda0;
            }

            @Override // coil3.decode.Decoder.Factory
            public final Decoder create(SourceFetchResult sourceFetchResult, Options options2, RealImageLoader realImageLoader) {
                return new StaticImageDecoder(sourceFetchResult.getSource(), options2, this.parallelismLock, this.exifOrientationStrategy);
            }
        });
        builder.add(new FileMapper(i2), reflectionFactory.getOrCreateKotlinClass(File.class));
        builder.add(new BitmapFetcher.Factory(8), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        builder.add(new BitmapFetcher.Factory(i3), reflectionFactory.getOrCreateKotlinClass(ByteBuffer.class));
        builder.add(new FileMapper(i4), reflectionFactory.getOrCreateKotlinClass(String.class));
        int i6 = 2;
        builder.add(new FileMapper(i6), reflectionFactory.getOrCreateKotlinClass(Path.class));
        arrayList3.add(new Pair(new UriKeyer(2), reflectionFactory.getOrCreateKotlinClass(Uri.class)));
        arrayList3.add(new Pair(new UriKeyer(0), reflectionFactory.getOrCreateKotlinClass(Uri.class)));
        builder.add(new BitmapFetcher.Factory(7), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        builder.add(new BitmapFetcher.Factory(i6), reflectionFactory.getOrCreateKotlinClass(byte[].class));
        builder.add(new BitmapFetcher.Factory(5), reflectionFactory.getOrCreateKotlinClass(Uri.class));
        builder.add(new BitmapFetcher.Factory(i2), reflectionFactory.getOrCreateKotlinClass(Bitmap.class));
        builder.add(new EngineInterceptor(this, androidSystemCallbacks, key));
        this.components = builder.build();
    }

    public final Disposable enqueue(ImageRequest imageRequest) {
        return ExtrasKt.getDisposable(imageRequest, JobKt.async$default(this.scope, (CoroutineContext) this.options.mainCoroutineContextLazy.getValue(), null, new RealImageLoader$enqueue$job$1(this, imageRequest, null, 0), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01d6, code lost:
    
        if (r3.awaitStarted(r9) == r10) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x023b A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x0235, B:17:0x023b, B:21:0x0246, B:23:0x024a, B:24:0x0258, B:25:0x025d, B:61:0x0063, B:62:0x01e4, B:64:0x01ed, B:65:0x01f4), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0246 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x0235, B:17:0x023b, B:21:0x0246, B:23:0x024a, B:24:0x0258, B:25:0x025d, B:61:0x0063, B:62:0x01e4, B:64:0x01ed, B:65:0x01f4), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026d A[Catch: all -> 0x0290, TryCatch #0 {all -> 0x0290, blocks: (B:41:0x0269, B:43:0x026d, B:45:0x0273, B:47:0x0279, B:48:0x0282, B:51:0x027e, B:52:0x0292, B:53:0x0298), top: B:40:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0292 A[Catch: all -> 0x0290, TRY_ENTER, TryCatch #0 {all -> 0x0290, blocks: (B:41:0x0269, B:43:0x026d, B:45:0x0273, B:47:0x0279, B:48:0x0282, B:51:0x027e, B:52:0x0292, B:53:0x0298), top: B:40:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:15:0x0235, B:17:0x023b, B:21:0x0246, B:23:0x024a, B:24:0x0258, B:25:0x025d, B:61:0x0063, B:62:0x01e4, B:64:0x01ed, B:65:0x01f4), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0068  */
    /* JADX WARN: Type inference failed for: r16v0, types: [coil3.RealImageLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [coil3.EventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [coil3.request.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, int i, ContinuationImpl continuationImpl) {
        RealImageLoader$execute$3 realImageLoader$execute$3;
        ImageRequest imageRequest2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        ?? r1;
        Image error;
        RequestDelegate lifecycleRequestDelegate;
        ImageRequest imageRequest3;
        EventListener eventListener;
        RequestDelegate requestDelegate;
        Scale scale;
        ImageView.ScaleType scaleType;
        Target target;
        RequestDelegate requestDelegate2;
        Image image;
        EventListener eventListener2;
        ImageRequest imageRequest4;
        ImageRequest imageRequest5;
        EventListener eventListener3;
        RequestDelegate requestDelegate3;
        ImageResult imageResult;
        ?? r3;
        try {
            if (continuationImpl instanceof RealImageLoader$execute$3) {
                realImageLoader$execute$3 = (RealImageLoader$execute$3) continuationImpl;
                r3 = realImageLoader$execute$3.label;
                ?? r4 = -2147483648;
                if ((r3 & PKIFailureInfo.systemUnavail) != 0) {
                    ?? r32 = r3 - PKIFailureInfo.systemUnavail;
                    realImageLoader$execute$3.label = r32;
                    imageRequest2 = r32;
                    RealImageLoader$execute$3 realImageLoader$execute$32 = realImageLoader$execute$3;
                    obj = realImageLoader$execute$32.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r1 = realImageLoader$execute$32.label;
                    if (r1 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Job job = JobKt.getJob(realImageLoader$execute$32.getContext());
                        boolean z = i == 0;
                        Extras.Key key = this.requestService;
                        key.getClass();
                        RealImageLoader realImageLoader = (RealImageLoader) key.f61default;
                        Target target2 = imageRequest.getTarget();
                        if (target2 instanceof ImageViewTarget) {
                            Lifecycle lifecycle = (Lifecycle) ExtrasKt.getExtra(imageRequest, ImageRequests_androidKt.lifecycleKey);
                            if (lifecycle == null) {
                                lifecycle = Extras.Key.findLifecycle(imageRequest);
                            }
                            lifecycleRequestDelegate = new ViewTargetRequestDelegate(realImageLoader, imageRequest, (ImageViewTarget) target2, lifecycle, job);
                        } else {
                            Lifecycle lifecycle2 = (Lifecycle) ExtrasKt.getExtra(imageRequest, ImageRequests_androidKt.lifecycleKey);
                            if (lifecycle2 == null) {
                                lifecycle2 = z ? Extras.Key.findLifecycle(imageRequest) : null;
                            }
                            lifecycleRequestDelegate = lifecycle2 != null ? new LifecycleRequestDelegate(lifecycle2, job) : BaseRequestDelegate.m1462boximpl(job);
                        }
                        lifecycleRequestDelegate.assertActive();
                        ImageRequest.Builder newBuilder$default = ImageRequest.newBuilder$default(imageRequest);
                        newBuilder$default.defaults(realImageLoader.options.defaults);
                        SizeResolver sizeResolver = imageRequest.getDefined().getSizeResolver();
                        if (sizeResolver == null) {
                            if (imageRequest.getTarget() instanceof ImageViewTarget) {
                                View view = ((ImageViewTarget) imageRequest.getTarget()).getView();
                                sizeResolver = (view == null || !((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? ViewSizeResolverKt.ViewSizeResolver$default((ImageView) view) : SizeResolver.ORIGINAL;
                            } else {
                                sizeResolver = SizeResolver.ORIGINAL;
                            }
                            newBuilder$default.size(sizeResolver);
                        }
                        if (imageRequest.getDefined().getScale() == null) {
                            Target target3 = imageRequest.getTarget();
                            ImageViewTarget imageViewTarget = target3 instanceof ImageViewTarget ? (ImageViewTarget) target3 : null;
                            View view2 = imageViewTarget != null ? imageViewTarget.getView() : null;
                            ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
                            if (imageView != null) {
                                Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                                ImageView.ScaleType scaleType2 = imageView.getScaleType();
                                int i2 = scaleType2 == null ? -1 : Utils_androidKt.WhenMappings.$EnumSwitchMapping$1[scaleType2.ordinal()];
                                scale = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? Scale.FIT : Scale.FILL;
                            } else {
                                scale = imageRequest.getScale();
                            }
                            newBuilder$default.scale(scale);
                        }
                        if (imageRequest.getDefined().getPrecision() == null) {
                            newBuilder$default.precision((imageRequest.getDefined().getSizeResolver() == null && Intrinsics.areEqual(sizeResolver, SizeResolver.ORIGINAL)) ? Precision.INEXACT : ((imageRequest.getTarget() instanceof ImageViewTarget) && (sizeResolver instanceof RealViewSizeResolver) && ((ImageViewTarget) imageRequest.getTarget()).getView() != null && ((ImageViewTarget) imageRequest.getTarget()).getView() == ((RealViewSizeResolver) sizeResolver).getView()) ? Precision.INEXACT : Precision.EXACT);
                        }
                        ImageRequest build = newBuilder$default.build();
                        EventListener create = this.options.eventListenerFactory.create();
                        try {
                            if (build.getData().equals(NullRequestData.INSTANCE)) {
                                throw new NullRequestDataException();
                            }
                            lifecycleRequestDelegate.start();
                            if (i == 0) {
                                realImageLoader$execute$32.L$0 = lifecycleRequestDelegate;
                                realImageLoader$execute$32.L$1 = build;
                                realImageLoader$execute$32.L$2 = create;
                                realImageLoader$execute$32.label = 1;
                            }
                            RequestDelegate requestDelegate4 = lifecycleRequestDelegate;
                            imageRequest3 = build;
                            eventListener = create;
                            requestDelegate = requestDelegate4;
                        } catch (Throwable th) {
                            th = th;
                            RequestDelegate requestDelegate5 = lifecycleRequestDelegate;
                            imageRequest2 = build;
                            r1 = create;
                            r4 = requestDelegate5;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else if (r1 == 1) {
                        eventListener = realImageLoader$execute$32.L$2;
                        imageRequest3 = realImageLoader$execute$32.L$1;
                        requestDelegate = realImageLoader$execute$32.L$0;
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (r1 != 2) {
                            if (r1 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eventListener3 = realImageLoader$execute$32.L$2;
                            imageRequest5 = realImageLoader$execute$32.L$1;
                            requestDelegate3 = realImageLoader$execute$32.L$0;
                            SafeTrace.throwOnFailure(obj);
                            imageResult = (ImageResult) obj;
                            if (!(imageResult instanceof SuccessResult)) {
                                onSuccess((SuccessResult) imageResult, imageRequest5.getTarget(), eventListener3);
                            } else {
                                if (!(imageResult instanceof ErrorResult)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                onError((ErrorResult) imageResult, imageRequest5.getTarget(), eventListener3);
                            }
                            requestDelegate3.complete();
                            return imageResult;
                        }
                        Image image2 = realImageLoader$execute$32.L$3;
                        EventListener eventListener4 = realImageLoader$execute$32.L$2;
                        ImageRequest imageRequest6 = realImageLoader$execute$32.L$1;
                        RequestDelegate requestDelegate6 = realImageLoader$execute$32.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            requestDelegate2 = requestDelegate6;
                            image = image2;
                            imageRequest4 = imageRequest6;
                            eventListener2 = eventListener4;
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = eventListener4;
                            imageRequest2 = imageRequest6;
                            r4 = requestDelegate6;
                            try {
                                if (th instanceof CancellationException) {
                                    r1.getClass();
                                    imageRequest2.getClass();
                                    throw th;
                                }
                                if (th instanceof NullRequestDataException) {
                                    error = imageRequest2.fallback();
                                    if (error == null) {
                                        error = imageRequest2.error();
                                    }
                                } else {
                                    error = imageRequest2.error();
                                }
                                ErrorResult errorResult = new ErrorResult(error, imageRequest2, th);
                                onError(errorResult, imageRequest2.getTarget(), r1);
                                return errorResult;
                            } finally {
                                r4.complete();
                            }
                        }
                        try {
                            eventListener2.getClass();
                            CoroutineContext interceptorCoroutineContext = imageRequest4.getInterceptorCoroutineContext();
                            RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(imageRequest4, this, (Size) obj, eventListener2, image, null, 0);
                            realImageLoader$execute$32.L$0 = requestDelegate2;
                            realImageLoader$execute$32.L$1 = imageRequest4;
                            realImageLoader$execute$32.L$2 = eventListener2;
                            realImageLoader$execute$32.L$3 = null;
                            realImageLoader$execute$32.label = 3;
                            obj = JobKt.withContext(interceptorCoroutineContext, realImageLoader$execute$result$1, realImageLoader$execute$32);
                            if (obj != coroutineSingletons) {
                                imageRequest5 = imageRequest4;
                                eventListener3 = eventListener2;
                                requestDelegate3 = requestDelegate2;
                                imageResult = (ImageResult) obj;
                                if (!(imageResult instanceof SuccessResult)) {
                                }
                                requestDelegate3.complete();
                                return imageResult;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th = th3;
                            imageRequest2 = imageRequest4;
                            r1 = eventListener2;
                            r4 = requestDelegate2;
                            if (th instanceof CancellationException) {
                            }
                        }
                    }
                    imageRequest3.getClass();
                    target = imageRequest3.getTarget();
                    if (target != null) {
                        target.onStart(imageRequest3.placeholder());
                    }
                    eventListener.getClass();
                    SizeResolver sizeResolver2 = imageRequest3.getSizeResolver();
                    realImageLoader$execute$32.L$0 = requestDelegate;
                    realImageLoader$execute$32.L$1 = imageRequest3;
                    realImageLoader$execute$32.L$2 = eventListener;
                    realImageLoader$execute$32.L$3 = null;
                    realImageLoader$execute$32.label = 2;
                    obj = sizeResolver2.size(realImageLoader$execute$32);
                    if (obj != coroutineSingletons) {
                        requestDelegate2 = requestDelegate;
                        image = null;
                        eventListener2 = eventListener;
                        imageRequest4 = imageRequest3;
                        eventListener2.getClass();
                        CoroutineContext interceptorCoroutineContext2 = imageRequest4.getInterceptorCoroutineContext();
                        RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1(imageRequest4, this, (Size) obj, eventListener2, image, null, 0);
                        realImageLoader$execute$32.L$0 = requestDelegate2;
                        realImageLoader$execute$32.L$1 = imageRequest4;
                        realImageLoader$execute$32.L$2 = eventListener2;
                        realImageLoader$execute$32.L$3 = null;
                        realImageLoader$execute$32.label = 3;
                        obj = JobKt.withContext(interceptorCoroutineContext2, realImageLoader$execute$result$12, realImageLoader$execute$32);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (r1 != 0) {
            }
            imageRequest3.getClass();
            target = imageRequest3.getTarget();
            if (target != null) {
            }
            eventListener.getClass();
            SizeResolver sizeResolver22 = imageRequest3.getSizeResolver();
            realImageLoader$execute$32.L$0 = requestDelegate;
            realImageLoader$execute$32.L$1 = imageRequest3;
            realImageLoader$execute$32.L$2 = eventListener;
            realImageLoader$execute$32.L$3 = null;
            realImageLoader$execute$32.label = 2;
            obj = sizeResolver22.size(realImageLoader$execute$32);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
        }
        realImageLoader$execute$3 = new RealImageLoader$execute$3(this, continuationImpl);
        imageRequest2 = r3;
        RealImageLoader$execute$3 realImageLoader$execute$322 = realImageLoader$execute$3;
        obj = realImageLoader$execute$322.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r1 = realImageLoader$execute$322.label;
    }

    public final RealMemoryCache getMemoryCache() {
        return (RealMemoryCache) this.options.memoryCacheLazy.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(ErrorResult errorResult, Target target, EventListener eventListener) {
        ImageRequest request = errorResult.getRequest();
        if (target instanceof TransitionTarget) {
            Transition create = ((Transition.Factory) ExtrasKt.getExtra(errorResult.getRequest(), ImageRequests_androidKt.transitionFactoryKey)).create((TransitionTarget) target, errorResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.getClass();
                create.transition();
            }
            target.onError(errorResult.getImage());
        }
        eventListener.onError(request, errorResult);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, errorResult);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSuccess(SuccessResult successResult, Target target, EventListener eventListener) {
        ImageRequest request = successResult.getRequest();
        if (target instanceof TransitionTarget) {
            Transition create = ((Transition.Factory) ExtrasKt.getExtra(successResult.getRequest(), ImageRequests_androidKt.transitionFactoryKey)).create((TransitionTarget) target, successResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.getClass();
                create.transition();
            }
            target.onSuccess(successResult.getImage());
        }
        eventListener.getClass();
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(successResult);
        }
    }

    public final void shutdown() {
        if (shutdown$volatile$FU.getAndSet(this, 1) == 1) {
            return;
        }
        JobKt.cancel(this.scope, (CancellationException) null);
        this.systemCallbacks.shutdown();
        RealMemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    public final Object execute(ImageRequest imageRequest, ContinuationImpl continuationImpl) {
        if (!(imageRequest.getTarget() instanceof ImageViewTarget) && !(imageRequest.getSizeResolver() instanceof RealViewSizeResolver) && ((Lifecycle) ExtrasKt.getExtra(imageRequest, ImageRequests_androidKt.lifecycleKey)) == null) {
            return execute(imageRequest, 1, continuationImpl);
        }
        return JobKt.coroutineScope(new RealImageLoader$execute$2(this, imageRequest, (Continuation) null, 0), continuationImpl);
    }
}
