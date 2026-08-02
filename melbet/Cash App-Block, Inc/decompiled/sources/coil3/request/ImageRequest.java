package coil3.request;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.core.os.BundleKt;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.Extras;
import coil3.Image;
import coil3.decode.Decoder;
import coil3.size.Precision;
import coil3.size.RealSizeResolver;
import coil3.size.Scale;
import coil3.size.SizeKt;
import coil3.size.SizeResolver;
import coil3.target.ImageViewTarget;
import coil3.target.Target;
import coil3.util.UtilsKt$EMPTY_IMAGE_FACTORY$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ImageRequest {
    public final Context context;
    public final Object data;
    public final CoroutineContext decoderCoroutineContext;
    public final Decoder.Factory decoderFactory;
    public final Defaults defaults;
    public final Defined defined;
    public final String diskCacheKey;
    public final CachePolicy diskCachePolicy;
    public final Function1 errorFactory;
    public final Extras extras;
    public final Function1 fallbackFactory;
    public final CoroutineContext fetcherCoroutineContext;
    public final FileSystem fileSystem;
    public final CoroutineContext interceptorCoroutineContext;
    public final Listener listener;
    public final String memoryCacheKey;
    public final Map memoryCacheKeyExtras;
    public final CachePolicy memoryCachePolicy;
    public final CachePolicy networkCachePolicy;
    public final Function1 placeholderFactory;
    public final Precision precision;
    public final Scale scale;
    public final SizeResolver sizeResolver;
    public final Target target;

    /* loaded from: classes.dex */
    public final class Defaults {
        public static final Defaults DEFAULT;
        public final CoroutineContext decoderCoroutineContext;
        public final CachePolicy diskCachePolicy;
        public final Function1 errorFactory;
        public final Extras extras;
        public final Function1 fallbackFactory;
        public final CoroutineContext fetcherCoroutineContext;
        public final FileSystem fileSystem;
        public final CoroutineContext interceptorCoroutineContext;
        public final CachePolicy memoryCachePolicy;
        public final CachePolicy networkCachePolicy;
        public final Function1 placeholderFactory;
        public final Precision precision;
        public final Scale scale;
        public final SizeResolver sizeResolver;

        static {
            JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
            CachePolicy cachePolicy = CachePolicy.ENABLED;
            RealSizeResolver realSizeResolver = SizeResolver.ORIGINAL;
            Scale scale = Scale.FIT;
            Precision precision = Precision.EXACT;
            Extras extras = Extras.EMPTY;
            UtilsKt$EMPTY_IMAGE_FACTORY$1 utilsKt$EMPTY_IMAGE_FACTORY$1 = UtilsKt$EMPTY_IMAGE_FACTORY$1.INSTANCE;
            DEFAULT = new Defaults(jvmSystemFileSystem, emptyCoroutineContext, defaultIoScheduler, defaultIoScheduler, cachePolicy, cachePolicy, cachePolicy, utilsKt$EMPTY_IMAGE_FACTORY$1, utilsKt$EMPTY_IMAGE_FACTORY$1, utilsKt$EMPTY_IMAGE_FACTORY$1, realSizeResolver, scale, precision, extras);
        }

        public Defaults(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras) {
            this.fileSystem = fileSystem;
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cachePolicy;
            this.diskCachePolicy = cachePolicy2;
            this.networkCachePolicy = cachePolicy3;
            this.placeholderFactory = function1;
            this.errorFactory = function12;
            this.fallbackFactory = function13;
            this.sizeResolver = sizeResolver;
            this.scale = scale;
            this.precision = precision;
            this.extras = extras;
        }

        public static Defaults copy$default(Defaults defaults, EmptyCoroutineContext emptyCoroutineContext, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Extras extras, int i) {
            FileSystem fileSystem = defaults.fileSystem;
            CoroutineContext coroutineContext3 = (i & 2) != 0 ? defaults.interceptorCoroutineContext : emptyCoroutineContext;
            CoroutineContext coroutineContext4 = (i & 4) != 0 ? defaults.fetcherCoroutineContext : coroutineContext;
            CoroutineContext coroutineContext5 = (i & 8) != 0 ? defaults.decoderCoroutineContext : coroutineContext2;
            CachePolicy cachePolicy = defaults.memoryCachePolicy;
            CoroutineContext coroutineContext6 = coroutineContext3;
            CoroutineContext coroutineContext7 = coroutineContext4;
            CoroutineContext coroutineContext8 = coroutineContext5;
            CachePolicy cachePolicy2 = defaults.diskCachePolicy;
            CachePolicy cachePolicy3 = defaults.networkCachePolicy;
            Function1 function1 = defaults.placeholderFactory;
            Function1 function12 = defaults.errorFactory;
            Function1 function13 = defaults.fallbackFactory;
            SizeResolver sizeResolver = defaults.sizeResolver;
            Scale scale = defaults.scale;
            Precision precision = defaults.precision;
            Extras extras2 = (i & PKIFailureInfo.certRevoked) != 0 ? defaults.extras : extras;
            defaults.getClass();
            return new Defaults(fileSystem, coroutineContext6, coroutineContext7, coroutineContext8, cachePolicy, cachePolicy2, cachePolicy3, function1, function12, function13, sizeResolver, scale, precision, extras2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) obj;
            return Intrinsics.areEqual(this.fileSystem, defaults.fileSystem) && Intrinsics.areEqual(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && Intrinsics.areEqual(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && Intrinsics.areEqual(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && Intrinsics.areEqual(this.placeholderFactory, defaults.placeholderFactory) && Intrinsics.areEqual(this.errorFactory, defaults.errorFactory) && Intrinsics.areEqual(this.fallbackFactory, defaults.fallbackFactory) && Intrinsics.areEqual(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && Intrinsics.areEqual(this.extras, defaults.extras);
        }

        public final int hashCode() {
            return this.extras.data.hashCode() + ((this.precision.hashCode() + ((this.scale.hashCode() + ((this.sizeResolver.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m((this.networkCachePolicy.hashCode() + ((this.diskCachePolicy.hashCode() + ((this.memoryCachePolicy.hashCode() + ((this.decoderCoroutineContext.hashCode() + ((this.fetcherCoroutineContext.hashCode() + ((this.interceptorCoroutineContext.hashCode() + (this.fileSystem.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.placeholderFactory), 31, this.errorFactory), 31, this.fallbackFactory)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ")";
        }
    }

    public final class Defined {
        public final CoroutineContext decoderCoroutineContext;
        public final CachePolicy diskCachePolicy;
        public final Function1 errorFactory;
        public final Function1 fallbackFactory;
        public final CoroutineContext fetcherCoroutineContext;
        public final CoroutineContext interceptorCoroutineContext;
        public final CachePolicy memoryCachePolicy;
        public final Function1 placeholderFactory;
        public final Precision precision;
        public final Scale scale;
        public final SizeResolver sizeResolver;

        public Defined(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision) {
            this.interceptorCoroutineContext = coroutineContext;
            this.fetcherCoroutineContext = coroutineContext2;
            this.decoderCoroutineContext = coroutineContext3;
            this.memoryCachePolicy = cachePolicy;
            this.diskCachePolicy = cachePolicy2;
            this.placeholderFactory = function1;
            this.errorFactory = function12;
            this.fallbackFactory = function13;
            this.sizeResolver = sizeResolver;
            this.scale = scale;
            this.precision = precision;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) obj;
            return Intrinsics.areEqual(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && Intrinsics.areEqual(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && Intrinsics.areEqual(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && Intrinsics.areEqual(this.placeholderFactory, defined.placeholderFactory) && Intrinsics.areEqual(this.errorFactory, defined.errorFactory) && Intrinsics.areEqual(this.fallbackFactory, defined.fallbackFactory) && Intrinsics.areEqual(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        public final Precision getPrecision() {
            return this.precision;
        }

        public final Scale getScale() {
            return this.scale;
        }

        public final SizeResolver getSizeResolver() {
            return this.sizeResolver;
        }

        public final int hashCode() {
            CoroutineContext coroutineContext = this.interceptorCoroutineContext;
            int hashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
            CoroutineContext coroutineContext2 = this.fetcherCoroutineContext;
            int hashCode2 = (hashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.decoderCoroutineContext;
            int hashCode3 = (hashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            CachePolicy cachePolicy = this.memoryCachePolicy;
            int hashCode4 = (hashCode3 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.diskCachePolicy;
            int hashCode5 = (hashCode4 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 961;
            Function1 function1 = this.placeholderFactory;
            int hashCode6 = (hashCode5 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.errorFactory;
            int hashCode7 = (hashCode6 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.fallbackFactory;
            int hashCode8 = (hashCode7 + (function13 == null ? 0 : function13.hashCode())) * 31;
            SizeResolver sizeResolver = this.sizeResolver;
            int hashCode9 = (hashCode8 + (sizeResolver == null ? 0 : sizeResolver.hashCode())) * 31;
            Scale scale = this.scale;
            int hashCode10 = (hashCode9 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.precision;
            return hashCode10 + (precision != null ? precision.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=null, placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ")";
        }
    }

    /* loaded from: classes.dex */
    public interface Listener {
        void onError(ImageRequest imageRequest, ErrorResult errorResult);

        default void onSuccess(SuccessResult successResult) {
        }
    }

    public ImageRequest(Context context, Object obj, Target target, Listener listener, String str, Map map, String str2, FileSystem fileSystem, Decoder.Factory factory, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = target;
        this.listener = listener;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = fileSystem;
        this.decoderFactory = factory;
        this.interceptorCoroutineContext = coroutineContext;
        this.fetcherCoroutineContext = coroutineContext2;
        this.decoderCoroutineContext = coroutineContext3;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.placeholderFactory = function1;
        this.errorFactory = function12;
        this.fallbackFactory = function13;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.precision = precision;
        this.extras = extras;
        this.defined = defined;
        this.defaults = defaults;
    }

    public static Builder newBuilder$default(ImageRequest imageRequest) {
        Context context = imageRequest.context;
        imageRequest.getClass();
        return new Builder(imageRequest, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return Intrinsics.areEqual(this.context, imageRequest.context) && this.data.equals(imageRequest.data) && Intrinsics.areEqual(this.target, imageRequest.target) && Intrinsics.areEqual(this.listener, imageRequest.listener) && Intrinsics.areEqual(this.memoryCacheKey, imageRequest.memoryCacheKey) && this.memoryCacheKeyExtras.equals(imageRequest.memoryCacheKeyExtras) && Intrinsics.areEqual(this.diskCacheKey, imageRequest.diskCacheKey) && Intrinsics.areEqual(this.fileSystem, imageRequest.fileSystem) && Intrinsics.areEqual(this.decoderFactory, imageRequest.decoderFactory) && Intrinsics.areEqual(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && Intrinsics.areEqual(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && Intrinsics.areEqual(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && Intrinsics.areEqual(this.placeholderFactory, imageRequest.placeholderFactory) && Intrinsics.areEqual(this.errorFactory, imageRequest.errorFactory) && Intrinsics.areEqual(this.fallbackFactory, imageRequest.fallbackFactory) && Intrinsics.areEqual(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && this.extras.equals(imageRequest.extras) && this.defined.equals(imageRequest.defined) && Intrinsics.areEqual(this.defaults, imageRequest.defaults);
    }

    public final Image error() {
        Image image = (Image) this.errorFactory.invoke(this);
        return image == null ? (Image) this.defaults.errorFactory.invoke(this) : image;
    }

    public final Image fallback() {
        Image image = (Image) this.fallbackFactory.invoke(this);
        return image == null ? (Image) this.defaults.fallbackFactory.invoke(this) : image;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getData() {
        return this.data;
    }

    public final CoroutineContext getDecoderCoroutineContext() {
        return this.decoderCoroutineContext;
    }

    public final Decoder.Factory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final Defaults getDefaults() {
        return this.defaults;
    }

    public final Defined getDefined() {
        return this.defined;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final Extras getExtras() {
        return this.extras;
    }

    public final CoroutineContext getFetcherCoroutineContext() {
        return this.fetcherCoroutineContext;
    }

    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    public final CoroutineContext getInterceptorCoroutineContext() {
        return this.interceptorCoroutineContext;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final Map getMemoryCacheKeyExtras() {
        return this.memoryCacheKeyExtras;
    }

    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final Precision getPrecision() {
        return this.precision;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    public final Target getTarget() {
        return this.target;
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.context.hashCode() * 31)) * 31;
        Target target = this.target;
        int hashCode2 = (hashCode + (target == null ? 0 : target.hashCode())) * 31;
        Listener listener = this.listener;
        int hashCode3 = (hashCode2 + (listener == null ? 0 : listener.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, this.memoryCacheKeyExtras, 31);
        String str2 = this.diskCacheKey;
        int hashCode4 = (this.fileSystem.hashCode() + ((m + (str2 == null ? 0 : str2.hashCode())) * 31)) * 961;
        Decoder.Factory factory = this.decoderFactory;
        return this.defaults.hashCode() + ((this.defined.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.precision.hashCode() + ((this.scale.hashCode() + ((this.sizeResolver.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m((this.networkCachePolicy.hashCode() + ((this.diskCachePolicy.hashCode() + ((this.memoryCachePolicy.hashCode() + ((this.decoderCoroutineContext.hashCode() + ((this.fetcherCoroutineContext.hashCode() + ((this.interceptorCoroutineContext.hashCode() + ((hashCode4 + (factory != null ? factory.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.placeholderFactory), 31, this.errorFactory), 31, this.fallbackFactory)) * 31)) * 31)) * 31, this.extras.data, 31)) * 31);
    }

    public final Image placeholder() {
        Image image = (Image) this.placeholderFactory.invoke(this);
        return image == null ? (Image) this.defaults.placeholderFactory.invoke(this) : image;
    }

    public final String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=null, decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + ")";
    }

    public final class Builder {
        public final Context context;
        public Object data;
        public CoroutineContext decoderCoroutineContext;
        public Decoder.Factory decoderFactory;
        public Defaults defaults;
        public String diskCacheKey;
        public CachePolicy diskCachePolicy;
        public Function1 errorFactory;
        public final Function1 fallbackFactory;
        public CoroutineContext fetcherCoroutineContext;
        public CoroutineContext interceptorCoroutineContext;
        public Object lazyExtras;
        public Map lazyMemoryCacheKeyExtras;
        public Listener listener;
        public String memoryCacheKey;
        public boolean memoryCacheKeyExtrasAreMutable;
        public CachePolicy memoryCachePolicy;
        public Function1 placeholderFactory;
        public Precision precision;
        public Scale scale;
        public SizeResolver sizeResolver;
        public Target target;

        public Builder(ImageRequest imageRequest, Context context) {
            this.context = context;
            this.defaults = imageRequest.defaults;
            this.data = imageRequest.data;
            this.target = imageRequest.target;
            this.listener = imageRequest.listener;
            this.memoryCacheKey = imageRequest.memoryCacheKey;
            this.lazyMemoryCacheKeyExtras = imageRequest.memoryCacheKeyExtras;
            this.diskCacheKey = imageRequest.diskCacheKey;
            Defined defined = imageRequest.defined;
            this.decoderFactory = imageRequest.decoderFactory;
            this.interceptorCoroutineContext = defined.interceptorCoroutineContext;
            this.fetcherCoroutineContext = defined.fetcherCoroutineContext;
            this.decoderCoroutineContext = defined.decoderCoroutineContext;
            this.memoryCachePolicy = defined.memoryCachePolicy;
            this.diskCachePolicy = defined.diskCachePolicy;
            this.placeholderFactory = defined.placeholderFactory;
            this.errorFactory = defined.errorFactory;
            this.fallbackFactory = defined.fallbackFactory;
            this.sizeResolver = defined.sizeResolver;
            this.scale = defined.scale;
            this.precision = defined.precision;
            this.lazyExtras = imageRequest.extras;
        }

        public final ImageRequest build() {
            Map map;
            Extras extras;
            Object obj = this.data;
            if (obj == null) {
                obj = NullRequestData.INSTANCE;
            }
            Object obj2 = obj;
            Target target = this.target;
            Listener listener = this.listener;
            String str = this.memoryCacheKey;
            Map map2 = this.lazyMemoryCacheKeyExtras;
            if (Intrinsics.areEqual(map2, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                map2.getClass();
                map = BundleKt.toImmutableMap(TypeIntrinsics.asMutableMap(map2));
            } else {
                if (!(map2 instanceof Map)) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return null;
                }
                map = map2;
            }
            Map map3 = map;
            map3.getClass();
            String str2 = this.diskCacheKey;
            Defaults defaults = this.defaults;
            FileSystem fileSystem = defaults.fileSystem;
            Decoder.Factory factory = this.decoderFactory;
            CachePolicy cachePolicy = this.memoryCachePolicy;
            if (cachePolicy == null) {
                cachePolicy = defaults.memoryCachePolicy;
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.diskCachePolicy;
            if (cachePolicy3 == null) {
                cachePolicy3 = defaults.diskCachePolicy;
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = defaults.networkCachePolicy;
            CoroutineContext coroutineContext = this.interceptorCoroutineContext;
            if (coroutineContext == null) {
                coroutineContext = defaults.interceptorCoroutineContext;
            }
            CoroutineContext coroutineContext2 = this.fetcherCoroutineContext;
            if (coroutineContext2 == null) {
                coroutineContext2 = defaults.fetcherCoroutineContext;
            }
            CoroutineContext coroutineContext3 = this.decoderCoroutineContext;
            if (coroutineContext3 == null) {
                coroutineContext3 = defaults.decoderCoroutineContext;
            }
            Function1 function1 = this.placeholderFactory;
            if (function1 == null) {
                function1 = defaults.placeholderFactory;
            }
            Function1 function12 = function1;
            Function1 function13 = this.errorFactory;
            if (function13 == null) {
                function13 = defaults.errorFactory;
            }
            Function1 function14 = function13;
            Function1 function15 = this.fallbackFactory;
            if (function15 == null) {
                function15 = defaults.fallbackFactory;
            }
            Function1 function16 = function15;
            SizeResolver sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = defaults.sizeResolver;
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.scale;
            if (scale == null) {
                scale = defaults.scale;
            }
            Scale scale2 = scale;
            Precision precision = this.precision;
            if (precision == null) {
                precision = defaults.precision;
            }
            Precision precision2 = precision;
            Object obj3 = this.lazyExtras;
            if (obj3 instanceof Extras.Builder) {
                extras = new Extras(BundleKt.toImmutableMap(((Extras.Builder) obj3).data));
            } else {
                if (!(obj3 instanceof Extras)) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return null;
                }
                extras = (Extras) obj3;
            }
            Extras extras2 = extras;
            CoroutineContext coroutineContext4 = this.interceptorCoroutineContext;
            CoroutineContext coroutineContext5 = this.fetcherCoroutineContext;
            CoroutineContext coroutineContext6 = this.decoderCoroutineContext;
            Function1 function17 = this.placeholderFactory;
            Function1 function18 = this.errorFactory;
            return new ImageRequest(this.context, obj2, target, listener, str, map3, str2, fileSystem, factory, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy2, cachePolicy4, cachePolicy5, function12, function14, function16, sizeResolver2, scale2, precision2, extras2, new Defined(coroutineContext4, coroutineContext5, coroutineContext6, this.memoryCachePolicy, this.diskCachePolicy, function17, function18, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults);
        }

        public final void data(Object obj) {
            this.data = obj;
        }

        public final void defaults(Defaults defaults) {
            this.defaults = defaults;
        }

        public final void diskCachePolicy() {
            this.diskCachePolicy = CachePolicy.ENABLED;
        }

        public final void error(Image image) {
            this.errorFactory = new xg$$ExternalSyntheticLambda9(image, 13);
        }

        public final Extras.Builder getExtras() {
            Object obj = this.lazyExtras;
            if (obj instanceof Extras.Builder) {
                return (Extras.Builder) obj;
            }
            if (!(obj instanceof Extras)) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
            Extras.Builder builder = new Extras.Builder((Extras) obj);
            this.lazyExtras = builder;
            return builder;
        }

        public final void memoryCacheKeyExtra(String str) {
            Map asMutableMap;
            Map map = this.lazyMemoryCacheKeyExtras;
            if (!Intrinsics.areEqual(map, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                if (!(map instanceof Map)) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    asMutableMap = null;
                    asMutableMap.put("coil#transformations", str);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    this.lazyMemoryCacheKeyExtras = linkedHashMap;
                    this.memoryCacheKeyExtrasAreMutable = true;
                    map = linkedHashMap;
                }
            }
            map.getClass();
            asMutableMap = TypeIntrinsics.asMutableMap(map);
            asMutableMap.put("coil#transformations", str);
        }

        public final void memoryCachePolicy() {
            this.memoryCachePolicy = CachePolicy.ENABLED;
        }

        public final void placeholder(Image image) {
            this.placeholderFactory = new xg$$ExternalSyntheticLambda9(image, 13);
        }

        public final void precision(Precision precision) {
            this.precision = precision;
        }

        public final void scale(Scale scale) {
            this.scale = scale;
        }

        public final void size(int i, int i2) {
            this.sizeResolver = new RealSizeResolver(SizeKt.Size(i, i2));
        }

        public final void target(ImageViewTarget imageViewTarget) {
            this.target = imageViewTarget;
        }

        public final void size(SizeResolver sizeResolver) {
            this.sizeResolver = sizeResolver;
        }

        public Builder(Context context) {
            this.context = context;
            this.defaults = Defaults.DEFAULT;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.lazyMemoryCacheKeyExtras = emptyMap;
            this.diskCacheKey = null;
            this.decoderFactory = null;
            this.interceptorCoroutineContext = null;
            this.fetcherCoroutineContext = null;
            this.decoderCoroutineContext = null;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            UtilsKt$EMPTY_IMAGE_FACTORY$1 utilsKt$EMPTY_IMAGE_FACTORY$1 = UtilsKt$EMPTY_IMAGE_FACTORY$1.INSTANCE;
            this.placeholderFactory = utilsKt$EMPTY_IMAGE_FACTORY$1;
            this.errorFactory = utilsKt$EMPTY_IMAGE_FACTORY$1;
            this.fallbackFactory = utilsKt$EMPTY_IMAGE_FACTORY$1;
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.EMPTY;
        }
    }
}
