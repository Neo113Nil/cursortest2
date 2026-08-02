package coil3.intercept;

import android.graphics.Bitmap;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.BitmapImage;
import coil3.ComponentRegistry;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda0;
import coil3.EventListener;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.decode.DecodeResult;
import coil3.decode.Decoder;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSource;
import coil3.fetch.FetchResult;
import coil3.fetch.Fetcher;
import coil3.fetch.ImageFetchResult;
import coil3.fetch.SourceFetchResult;
import coil3.map.FileMapper;
import coil3.memory.MemoryCache$Key;
import coil3.memory.MemoryCache$Value;
import coil3.memory.MemoryCacheService;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.NullRequestDataException;
import coil3.request.Options;
import coil3.request.SuccessResult;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.AndroidSystemCallbacks;
import coil3.util.BitmapsKt;
import coil3.util.Utils_androidKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.coroutines.JobKt;
import net.oneformapp.ProfileStore_;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class EngineInterceptor implements Interceptor {
    public final RealImageLoader imageLoader;
    public final MemoryCacheService memoryCacheService;
    public final Extras.Key requestService;
    public final AndroidSystemCallbacks systemCallbacks;

    /* loaded from: classes3.dex */
    public final class ExecuteResult {
        public final DataSource dataSource;
        public final String diskCacheKey;
        public final Image image;
        public final boolean isSampled;

        public ExecuteResult(Image image, boolean z, DataSource dataSource, String str) {
            this.image = image;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return Intrinsics.areEqual(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && Intrinsics.areEqual(this.diskCacheKey, executeResult.diskCacheKey);
        }

        public final Image getImage() {
            return this.image;
        }

        public final int hashCode() {
            int hashCode = (this.dataSource.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.isSampled)) * 31;
            String str = this.diskCacheKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ")";
        }
    }

    public EngineInterceptor(RealImageLoader realImageLoader, AndroidSystemCallbacks androidSystemCallbacks, Extras.Key key) {
        this.imageLoader = realImageLoader;
        this.systemCallbacks = androidSystemCallbacks;
        this.requestService = key;
        this.memoryCacheService = new MemoryCacheService(realImageLoader, key);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0099 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$decode(EngineInterceptor engineInterceptor, SourceFetchResult sourceFetchResult, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, ContinuationImpl continuationImpl) {
        EngineInterceptor$decode$1 engineInterceptor$decode$1;
        int i;
        int i2;
        int size;
        Pair pair;
        if (continuationImpl instanceof EngineInterceptor$decode$1) {
            engineInterceptor$decode$1 = (EngineInterceptor$decode$1) continuationImpl;
            int i3 = engineInterceptor$decode$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                engineInterceptor$decode$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = engineInterceptor$decode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$decode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    i2 = 0;
                    RealImageLoader realImageLoader = engineInterceptor.imageLoader;
                    size = componentRegistry.getDecoderFactories().size();
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = engineInterceptor$decode$1.I$0;
                    EventListener eventListener2 = engineInterceptor$decode$1.L$5;
                    Options options2 = engineInterceptor$decode$1.L$4;
                    obj = engineInterceptor$decode$1.L$3;
                    ImageRequest imageRequest2 = engineInterceptor$decode$1.L$2;
                    ComponentRegistry componentRegistry2 = engineInterceptor$decode$1.L$1;
                    SourceFetchResult sourceFetchResult2 = engineInterceptor$decode$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    int intValue = i4;
                    sourceFetchResult = sourceFetchResult2;
                    eventListener = eventListener2;
                    componentRegistry = componentRegistry2;
                    options = options2;
                    imageRequest = imageRequest2;
                    DecodeResult decodeResult = (DecodeResult) obj2;
                    eventListener.getClass();
                    if (decodeResult == null) {
                        Image image = decodeResult.getImage();
                        boolean isSampled = decodeResult.isSampled();
                        DataSource dataSource = sourceFetchResult.getDataSource();
                        ImageSource source = sourceFetchResult.getSource();
                        FileImageSource fileImageSource = source instanceof FileImageSource ? (FileImageSource) source : null;
                        return new ExecuteResult(image, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey$coil_core() : null);
                    }
                    i2 = intValue;
                    RealImageLoader realImageLoader2 = engineInterceptor.imageLoader;
                    size = componentRegistry.getDecoderFactories().size();
                    while (true) {
                        if (i2 >= size) {
                            pair = null;
                            break;
                        }
                        Decoder create = ((Decoder.Factory) componentRegistry.getDecoderFactories().get(i2)).create(sourceFetchResult, options, realImageLoader2);
                        if (create != null) {
                            pair = new Pair(create, Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    }
                    if (pair != null) {
                        Path$$ExternalSyntheticBUOutline0.m((Object) Boxes$$ExternalSyntheticOutline1.m("Unable to create a decoder that supports: ", obj));
                        return null;
                    }
                    Decoder decoder = (Decoder) pair.first;
                    intValue = ((Number) pair.second).intValue() + 1;
                    eventListener.getClass();
                    engineInterceptor$decode$1.L$0 = sourceFetchResult;
                    engineInterceptor$decode$1.L$1 = componentRegistry;
                    engineInterceptor$decode$1.L$2 = imageRequest;
                    engineInterceptor$decode$1.L$3 = obj;
                    engineInterceptor$decode$1.L$4 = options;
                    engineInterceptor$decode$1.L$5 = eventListener;
                    engineInterceptor$decode$1.I$0 = intValue;
                    engineInterceptor$decode$1.label = 1;
                    obj2 = decoder.decode(engineInterceptor$decode$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    DecodeResult decodeResult2 = (DecodeResult) obj2;
                    eventListener.getClass();
                    if (decodeResult2 == null) {
                    }
                }
            }
        }
        engineInterceptor$decode$1 = new EngineInterceptor$decode$1(engineInterceptor, continuationImpl);
        Object obj22 = engineInterceptor$decode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$decode$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(6:(1:(1:(4:13|14|(1:16)|17)(2:19|20))(10:21|22|23|24|25|26|27|(1:29)(1:42)|(2:33|34)|39))(4:60|61|62|63)|45|46|(1:48)(1:59)|(2:52|53)|58)(9:90|91|92|(10:103|104|(2:107|105)|108|109|(2:112|110)|113|114|(1:116)|117)|94|95|96|(1:98)|41)|64|65|(4:67|68|69|(2:71|41)(7:72|25|26|27|(0)(0)|(3:31|33|34)|39))(3:74|75|(8:77|78|79|26|27|(0)(0)|(0)|39)(3:80|81|82))))|126|6|7|8|(0)(0)|64|65|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01b5, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x020f, code lost:
    
        if (r1 == r9) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #4 {all -> 0x01b7, blocks: (B:65:0x0179, B:67:0x0184), top: B:64:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb A[Catch: all -> 0x01b4, TryCatch #2 {all -> 0x01b4, blocks: (B:25:0x01ae, B:69:0x018f, B:74:0x01bb, B:77:0x01c0), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006e  */
    /* JADX WARN: Type inference failed for: r23v0, types: [coil3.intercept.EngineInterceptor] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$execute(EngineInterceptor engineInterceptor, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, ContinuationImpl continuationImpl) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        int i;
        ?? r2;
        SourceFetchResult sourceFetchResult;
        SourceFetchResult sourceFetchResult2;
        ImageSource source;
        EngineInterceptor$execute$1 engineInterceptor$execute$12;
        ImageRequest imageRequest2;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        EventListener eventListener2;
        FetchResult fetchResult;
        ExecuteResult executeResult;
        Ref$ObjectRef ref$ObjectRef4;
        EventListener eventListener3;
        Ref$ObjectRef ref$ObjectRef5;
        SourceFetchResult sourceFetchResult3;
        ImageSource source2;
        Ref$ObjectRef ref$ObjectRef6;
        if (continuationImpl instanceof EngineInterceptor$execute$1) {
            engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuationImpl;
            int i2 = engineInterceptor$execute$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                engineInterceptor$execute$1.label = i2 - PKIFailureInfo.systemUnavail;
                EngineInterceptor$execute$1 engineInterceptor$execute$13 = engineInterceptor$execute$1;
                Object obj3 = engineInterceptor$execute$13.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$execute$13.label;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        ref$ObjectRef2 = engineInterceptor$execute$13.L$6;
                        ref$ObjectRef3 = engineInterceptor$execute$13.L$5;
                        ?? r4 = engineInterceptor$execute$13.L$4;
                        Ref$ObjectRef ref$ObjectRef7 = engineInterceptor$execute$13.L$3;
                        eventListener2 = (EventListener) engineInterceptor$execute$13.L$2;
                        Object obj4 = engineInterceptor$execute$13.L$1;
                        ImageRequest imageRequest3 = engineInterceptor$execute$13.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            engineInterceptor$execute$12 = engineInterceptor$execute$13;
                            ref$ObjectRef = ref$ObjectRef7;
                            obj2 = obj4;
                            sourceFetchResult = r4;
                            imageRequest2 = imageRequest3;
                        } catch (Throwable th) {
                            th = th;
                            r2 = ref$ObjectRef3;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                            ExecuteResult executeResult2 = (ExecuteResult) obj3;
                            Image image = executeResult2.getImage();
                            Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                            if (image instanceof BitmapImage) {
                                ((BitmapImage) image).getBitmap().prepareToDraw();
                            }
                            return executeResult2;
                        }
                        r2 = engineInterceptor$execute$13.L$3;
                        ref$ObjectRef4 = (Ref$ObjectRef) engineInterceptor$execute$13.L$2;
                        eventListener3 = (EventListener) engineInterceptor$execute$13.L$1;
                        imageRequest2 = engineInterceptor$execute$13.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            engineInterceptor$execute$12 = engineInterceptor$execute$13;
                            ref$ObjectRef6 = r2;
                            executeResult = (ExecuteResult) obj3;
                            ref$ObjectRef = ref$ObjectRef4;
                            eventListener2 = eventListener3;
                            ref$ObjectRef5 = ref$ObjectRef6;
                            Object obj5 = ref$ObjectRef5.element;
                            sourceFetchResult3 = obj5 instanceof SourceFetchResult ? (SourceFetchResult) obj5 : null;
                            if (sourceFetchResult3 != null && (source2 = sourceFetchResult3.getSource()) != null) {
                                try {
                                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) source2);
                                } catch (RuntimeException e) {
                                    throw e;
                                } catch (Exception unused) {
                                }
                            }
                            Options options2 = (Options) ref$ObjectRef.element;
                            engineInterceptor$execute$12.L$0 = null;
                            engineInterceptor$execute$12.L$1 = null;
                            engineInterceptor$execute$12.L$2 = null;
                            engineInterceptor$execute$12.L$3 = null;
                            engineInterceptor$execute$12.L$4 = null;
                            engineInterceptor$execute$12.L$5 = null;
                            engineInterceptor$execute$12.L$6 = null;
                            engineInterceptor$execute$12.label = 3;
                            obj3 = EngineInterceptorKt.transform(executeResult, imageRequest2, options2, eventListener2, engineInterceptor$execute$12);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    sourceFetchResult = null;
                    Object obj6 = r2.element;
                    sourceFetchResult2 = !(obj6 instanceof SourceFetchResult) ? (SourceFetchResult) obj6 : sourceFetchResult;
                    if (sourceFetchResult2 != null && (source = sourceFetchResult2.getSource()) != null) {
                        try {
                            JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) source);
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
                Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj3);
                m.element = options;
                ?? ref$ObjectRef8 = new Ref$ObjectRef();
                ref$ObjectRef8.element = engineInterceptor.imageLoader.components;
                Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                try {
                    Options options3 = (Options) m.element;
                    options3.getClass();
                    BitmapsKt.isHardware((Bitmap.Config) ExtrasKt.getExtra(options3, ImageRequests_androidKt.bitmapConfigKey));
                    m.element = options3;
                    imageRequest.getClass();
                    if (imageRequest.getDecoderFactory() != null) {
                        try {
                            ComponentRegistry componentRegistry = (ComponentRegistry) ref$ObjectRef8.element;
                            componentRegistry.getClass();
                            ArrayList mutableList = CollectionsKt.toMutableList((Collection) componentRegistry.interceptors);
                            ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) componentRegistry.mappers);
                            ArrayList mutableList3 = CollectionsKt.toMutableList((Collection) componentRegistry.keyers);
                            List fetcherFactories = componentRegistry.getFetcherFactories();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = fetcherFactories.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new ImageLoader$Builder$$ExternalSyntheticLambda1((Pair) it.next(), 24));
                            }
                            List decoderFactories = componentRegistry.getDecoderFactories();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = decoderFactories.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0((Decoder.Factory) it2.next(), i3));
                            }
                            Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                            if (decoderFactory != null) {
                                arrayList2.add(0, new yf$$ExternalSyntheticLambda2(decoderFactory, 4));
                            }
                            ref$ObjectRef8.element = new ComponentRegistry(BundleKt.toImmutableList(mutableList), BundleKt.toImmutableList(mutableList2), BundleKt.toImmutableList(mutableList3), BundleKt.toImmutableList(arrayList), BundleKt.toImmutableList(arrayList2));
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = ref$ObjectRef9;
                            sourceFetchResult = null;
                            Object obj62 = r2.element;
                            if (!(obj62 instanceof SourceFetchResult)) {
                            }
                            if (sourceFetchResult2 != null) {
                            }
                            throw th;
                        }
                    }
                    try {
                        ComponentRegistry componentRegistry2 = (ComponentRegistry) ref$ObjectRef8.element;
                        Options options4 = (Options) m.element;
                        engineInterceptor$execute$13.L$0 = imageRequest;
                        engineInterceptor$execute$13.L$1 = obj;
                        engineInterceptor$execute$13.L$2 = eventListener;
                        engineInterceptor$execute$13.L$3 = m;
                        engineInterceptor$execute$13.L$4 = ref$ObjectRef8;
                        engineInterceptor$execute$13.L$5 = ref$ObjectRef9;
                        engineInterceptor$execute$13.L$6 = ref$ObjectRef9;
                        engineInterceptor$execute$13.label = 1;
                        obj3 = engineInterceptor.fetch(componentRegistry2, imageRequest, obj, options4, eventListener, engineInterceptor$execute$13);
                        engineInterceptor$execute$12 = engineInterceptor$execute$13;
                        if (obj3 != coroutineSingletons) {
                            imageRequest2 = imageRequest;
                            obj2 = obj;
                            ref$ObjectRef = m;
                            ref$ObjectRef2 = ref$ObjectRef9;
                            ref$ObjectRef3 = ref$ObjectRef2;
                            eventListener2 = eventListener;
                            sourceFetchResult = ref$ObjectRef8;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        sourceFetchResult = null;
                        r2 = ref$ObjectRef9;
                        Object obj622 = r2.element;
                        if (!(obj622 instanceof SourceFetchResult)) {
                        }
                        if (sourceFetchResult2 != null) {
                            JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) source);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sourceFetchResult = null;
                }
                ref$ObjectRef2.element = obj3;
                Object obj7 = ref$ObjectRef3.element;
                fetchResult = (FetchResult) obj7;
                if (fetchResult instanceof SourceFetchResult) {
                    r2 = ref$ObjectRef3;
                    try {
                        if (!(fetchResult instanceof ImageFetchResult)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        executeResult = new ExecuteResult(((ImageFetchResult) obj7).getImage(), ((ImageFetchResult) r2.element).isSampled(), ((ImageFetchResult) r2.element).getDataSource(), null);
                        ref$ObjectRef5 = r2;
                        Object obj52 = ref$ObjectRef5.element;
                        if (obj52 instanceof SourceFetchResult) {
                        }
                        if (sourceFetchResult3 != null) {
                        }
                        Options options22 = (Options) ref$ObjectRef.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.label = 3;
                        obj3 = EngineInterceptorKt.transform(executeResult, imageRequest2, options22, eventListener2, engineInterceptor$execute$12);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    CoroutineContext decoderCoroutineContext = imageRequest2.getDecoderCoroutineContext();
                    Ref$ObjectRef ref$ObjectRef10 = ref$ObjectRef3;
                    EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2((EngineInterceptor) engineInterceptor, ref$ObjectRef10, (Ref$ObjectRef) sourceFetchResult, imageRequest2, obj2, ref$ObjectRef, eventListener2, (Continuation) null);
                    engineInterceptor$execute$12.L$0 = imageRequest2;
                    engineInterceptor$execute$12.L$1 = eventListener2;
                    engineInterceptor$execute$12.L$2 = ref$ObjectRef;
                    engineInterceptor$execute$12.L$3 = ref$ObjectRef10;
                    engineInterceptor$execute$12.L$4 = null;
                    engineInterceptor$execute$12.L$5 = null;
                    engineInterceptor$execute$12.L$6 = null;
                    engineInterceptor$execute$12.label = 2;
                    obj3 = JobKt.withContext(decoderCoroutineContext, engineInterceptor$intercept$2, engineInterceptor$execute$12);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef4 = ref$ObjectRef;
                    eventListener3 = eventListener2;
                    ref$ObjectRef6 = ref$ObjectRef10;
                    executeResult = (ExecuteResult) obj3;
                    ref$ObjectRef = ref$ObjectRef4;
                    eventListener2 = eventListener3;
                    ref$ObjectRef5 = ref$ObjectRef6;
                    Object obj522 = ref$ObjectRef5.element;
                    if (obj522 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult3 != null) {
                        JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) source2);
                    }
                    Options options222 = (Options) ref$ObjectRef.element;
                    engineInterceptor$execute$12.L$0 = null;
                    engineInterceptor$execute$12.L$1 = null;
                    engineInterceptor$execute$12.L$2 = null;
                    engineInterceptor$execute$12.L$3 = null;
                    engineInterceptor$execute$12.L$4 = null;
                    engineInterceptor$execute$12.L$5 = null;
                    engineInterceptor$execute$12.L$6 = null;
                    engineInterceptor$execute$12.label = 3;
                    obj3 = EngineInterceptorKt.transform(executeResult, imageRequest2, options222, eventListener2, engineInterceptor$execute$12);
                }
            }
        }
        engineInterceptor$execute$1 = new EngineInterceptor$execute$1(engineInterceptor, continuationImpl);
        EngineInterceptor$execute$1 engineInterceptor$execute$132 = engineInterceptor$execute$1;
        Object obj32 = engineInterceptor$execute$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$execute$132.label;
        int i32 = 1;
        if (i == 0) {
        }
        ref$ObjectRef2.element = obj32;
        Object obj72 = ref$ObjectRef3.element;
        fetchResult = (FetchResult) obj72;
        if (fetchResult instanceof SourceFetchResult) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:10:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, ContinuationImpl continuationImpl) {
        EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        int i;
        int i2;
        int size;
        Pair pair;
        ImageSource source;
        if (continuationImpl instanceof EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (EngineInterceptor$fetch$1) continuationImpl;
            int i3 = engineInterceptor$fetch$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                engineInterceptor$fetch$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = engineInterceptor$fetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    i2 = 0;
                    size = componentRegistry.getFetcherFactories().size();
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = engineInterceptor$fetch$1.I$0;
                    EventListener eventListener2 = engineInterceptor$fetch$1.L$4;
                    Options options2 = engineInterceptor$fetch$1.L$3;
                    Object obj3 = engineInterceptor$fetch$1.L$2;
                    ImageRequest imageRequest2 = engineInterceptor$fetch$1.L$1;
                    ComponentRegistry componentRegistry2 = engineInterceptor$fetch$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    int intValue = i4;
                    componentRegistry = componentRegistry2;
                    eventListener = eventListener2;
                    imageRequest = imageRequest2;
                    options = options2;
                    obj = obj3;
                    FetchResult fetchResult = (FetchResult) obj2;
                    try {
                        eventListener.getClass();
                        if (fetchResult == null) {
                            return fetchResult;
                        }
                        i2 = intValue;
                        size = componentRegistry.getFetcherFactories().size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) componentRegistry.getFetcherFactories().get(i2);
                            Fetcher.Factory factory = (Fetcher.Factory) pair2.first;
                            if (((KClass) pair2.second).isInstance(obj)) {
                                factory.getClass();
                                Fetcher create = factory.create(obj, options, this.imageLoader);
                                if (create != null) {
                                    pair = new Pair(create, Integer.valueOf(i2));
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (pair != null) {
                            Path$$ExternalSyntheticBUOutline0.m((Object) Boxes$$ExternalSyntheticOutline1.m("Unable to create a fetcher that supports: ", obj));
                            return null;
                        }
                        Fetcher fetcher = (Fetcher) pair.first;
                        intValue = ((Number) pair.second).intValue() + 1;
                        eventListener.getClass();
                        engineInterceptor$fetch$1.L$0 = componentRegistry;
                        engineInterceptor$fetch$1.L$1 = imageRequest;
                        engineInterceptor$fetch$1.L$2 = obj;
                        engineInterceptor$fetch$1.L$3 = options;
                        engineInterceptor$fetch$1.L$4 = eventListener;
                        engineInterceptor$fetch$1.I$0 = intValue;
                        engineInterceptor$fetch$1.label = 1;
                        obj2 = fetcher.fetch(engineInterceptor$fetch$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        FetchResult fetchResult2 = (FetchResult) obj2;
                        eventListener.getClass();
                        if (fetchResult2 == null) {
                        }
                    } catch (Throwable th) {
                        SourceFetchResult sourceFetchResult = fetchResult2 instanceof SourceFetchResult ? (SourceFetchResult) fetchResult2 : null;
                        if (sourceFetchResult != null && (source = sourceFetchResult.getSource()) != null) {
                            try {
                                JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) source);
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            }
        }
        engineInterceptor$fetch$1 = new EngineInterceptor$fetch$1(this, continuationImpl);
        Object obj22 = engineInterceptor$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(ProfileStore_ profileStore_, ContinuationImpl continuationImpl) {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        ProfileStore_ profileStore_2;
        Image error;
        MemoryCacheService memoryCacheService = this.memoryCacheService;
        if (continuationImpl instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuationImpl;
            int i2 = engineInterceptor$intercept$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                engineInterceptor$intercept$1.label = i2 - PKIFailureInfo.systemUnavail;
                EngineInterceptor$intercept$1 engineInterceptor$intercept$12 = engineInterceptor$intercept$1;
                Object obj = engineInterceptor$intercept$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$intercept$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        ImageRequest request = profileStore_.getRequest();
                        Object data = request.getData();
                        Size size = profileStore_.getSize();
                        EventListener eventListener = profileStore_.getEventListener();
                        Options options = this.requestService.options(request, size);
                        Scale scale = options.getScale();
                        List list = this.imageLoader.components.mappers;
                        int size2 = list.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Pair pair = (Pair) list.get(i3);
                            FileMapper fileMapper = (FileMapper) pair.first;
                            if (((KClass) pair.second).isInstance(data)) {
                                fileMapper.getClass();
                                Object map = fileMapper.map(data, options);
                                if (map != null) {
                                    data = map;
                                }
                            }
                        }
                        MemoryCache$Key newCacheKey = memoryCacheService.newCacheKey(request, data, options, eventListener);
                        MemoryCache$Value cacheValue = newCacheKey != null ? memoryCacheService.getCacheValue(request, newCacheKey, size, scale) : null;
                        if (cacheValue != null) {
                            Image image = cacheValue.getImage();
                            DataSource dataSource = DataSource.MEMORY_CACHE;
                            Object obj2 = cacheValue.getExtras().get("coil#disk_cache_key");
                            String str = obj2 instanceof String ? (String) obj2 : null;
                            Object obj3 = cacheValue.getExtras().get("coil#is_sampled");
                            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            return new SuccessResult(image, request, dataSource, newCacheKey, str, bool != null ? bool.booleanValue() : false, profileStore_.isPlaceholderCached());
                        }
                        CoroutineContext fetcherCoroutineContext = request.getFetcherCoroutineContext();
                        profileStore_2 = profileStore_;
                        try {
                            EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(this, request, data, options, eventListener, newCacheKey, profileStore_2, null, 0);
                            engineInterceptor$intercept$12.L$0 = profileStore_2;
                            engineInterceptor$intercept$12.label = 1;
                            Object withContext = JobKt.withContext(fetcherCoroutineContext, engineInterceptor$intercept$2, engineInterceptor$intercept$12);
                            return withContext == coroutineSingletons ? coroutineSingletons : withContext;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        profileStore_2 = profileStore_;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ProfileStore_ profileStore_3 = engineInterceptor$intercept$12.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        profileStore_2 = profileStore_3;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                ImageRequest request2 = profileStore_2.getRequest();
                if (th instanceof NullRequestDataException) {
                    error = request2.fallback();
                    if (error == null) {
                        error = request2.error();
                    }
                } else {
                    error = request2.error();
                }
                return new ErrorResult(error, request2, th);
            }
        }
        engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, continuationImpl);
        EngineInterceptor$intercept$1 engineInterceptor$intercept$122 = engineInterceptor$intercept$1;
        Object obj4 = engineInterceptor$intercept$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$intercept$122.label;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
