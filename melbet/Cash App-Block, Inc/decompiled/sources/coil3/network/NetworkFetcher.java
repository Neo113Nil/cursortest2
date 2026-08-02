package coil3.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.u4$$ExternalSyntheticLambda0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.DiskLruCache;
import coil3.disk.RealDiskCache;
import coil3.fetch.Fetcher;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.EngineInterceptor$fetch$1;
import coil3.network.CacheStrategy;
import coil3.network.NetworkHeaders;
import coil3.network.internal.DefaultCacheStrategy;
import coil3.network.internal.UNINITIALIZED;
import coil3.network.internal.Utils_androidKt;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import coil3.request.CachePolicy;
import coil3.request.OneShotDisposable;
import coil3.request.Options;
import coil3.util.MimeTypesKt;
import com.android.volley.Response;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class NetworkFetcher implements Fetcher {
    public final Lazy cacheStrategy;
    public final Lazy concurrentRequestStrategy;
    public final InitializedLazyImpl connectivityChecker;
    public final Lazy diskCache;
    public final Lazy networkClient;
    public final Options options;
    public final String url;

    /* loaded from: classes.dex */
    public final class Factory implements Fetcher.Factory {
        public final Lazy cacheStrategyLazy;
        public final Lazy concurrentRequestStrategyLazy;
        public final WorkLauncherImpl connectivityCheckerLazy;
        public final Lazy networkClientLazy;

        /* renamed from: coil3.network.NetworkFetcher$Factory$2, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2(1, Strings.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context applicationContext = ((Context) obj).getApplicationContext();
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
                if (connectivityManager != null && Utils_androidKt.isPermissionGranted(applicationContext)) {
                    try {
                        return new ConnectivityCheckerApi23(connectivityManager);
                    } catch (Exception unused) {
                    }
                }
                return ConnectivityChecker.ONLINE;
            }
        }

        public Factory(Function0 function0) {
            u4$$ExternalSyntheticLambda0 u4__externalsyntheticlambda0 = new u4$$ExternalSyntheticLambda0(20);
            AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            u4$$ExternalSyntheticLambda0 u4__externalsyntheticlambda02 = new u4$$ExternalSyntheticLambda0(21);
            this.networkClientLazy = LazyKt.lazy(function0);
            this.cacheStrategyLazy = LazyKt.lazy(u4__externalsyntheticlambda0);
            WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(20);
            workLauncherImpl.processor = anonymousClass2;
            workLauncherImpl.workTaskExecutor = UNINITIALIZED.INSTANCE;
            this.connectivityCheckerLazy = workLauncherImpl;
            this.concurrentRequestStrategyLazy = LazyKt.lazy(u4__externalsyntheticlambda02);
        }

        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(Object obj, Options options, RealImageLoader realImageLoader) {
            Uri uri = (Uri) obj;
            if (!Intrinsics.areEqual(uri.scheme, "http") && !Intrinsics.areEqual(uri.scheme, "https")) {
                return null;
            }
            String str = uri.data;
            Lazy lazy = this.networkClientLazy;
            Lazy lazy2 = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(realImageLoader, 2));
            Lazy lazy3 = this.cacheStrategyLazy;
            WorkLauncherImpl workLauncherImpl = this.connectivityCheckerLazy;
            Context context = options.getContext();
            Object obj2 = workLauncherImpl.workTaskExecutor;
            UNINITIALIZED uninitialized = UNINITIALIZED.INSTANCE;
            if (obj2 == uninitialized) {
                synchronized (workLauncherImpl) {
                    obj2 = workLauncherImpl.workTaskExecutor;
                    if (obj2 == uninitialized) {
                        Function1 function1 = (Function1) workLauncherImpl.processor;
                        function1.getClass();
                        Object invoke = function1.invoke(context);
                        workLauncherImpl.workTaskExecutor = invoke;
                        workLauncherImpl.processor = null;
                        obj2 = invoke;
                    }
                }
            }
            return new NetworkFetcher(str, options, lazy, lazy2, lazy3, new InitializedLazyImpl(obj2), this.concurrentRequestStrategyLazy);
        }
    }

    public NetworkFetcher(String str, Options options, Lazy lazy, Lazy lazy2, Lazy lazy3, InitializedLazyImpl initializedLazyImpl, Lazy lazy4) {
        this.url = str;
        this.options = options;
        this.networkClient = lazy;
        this.diskCache = lazy2;
        this.cacheStrategy = lazy3;
        this.connectivityChecker = initializedLazyImpl;
        this.concurrentRequestStrategy = lazy4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a4, code lost:
    
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018b A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x01a7, B:21:0x0049, B:22:0x0187, B:24:0x018b, B:38:0x014b, B:40:0x0151, B:43:0x0160, B:44:0x0165, B:45:0x0166), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123 A[Catch: Exception -> 0x00e2, TryCatch #4 {Exception -> 0x00e2, blocks: (B:32:0x011d, B:34:0x0123, B:72:0x009a, B:74:0x00a1, B:76:0x00af, B:79:0x00e6, B:81:0x00f2, B:85:0x00c4, B:87:0x00ce, B:89:0x0142, B:90:0x014a), top: B:71:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x01a7, B:21:0x0049, B:22:0x0187, B:24:0x018b, B:38:0x014b, B:40:0x0151, B:43:0x0160, B:44:0x0165, B:45:0x0166), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a1 A[Catch: Exception -> 0x00e2, TryCatch #4 {Exception -> 0x00e2, blocks: (B:32:0x011d, B:34:0x0123, B:72:0x009a, B:74:0x00a1, B:76:0x00af, B:79:0x00e6, B:81:0x00f2, B:85:0x00c4, B:87:0x00ce, B:89:0x0142, B:90:0x014a), top: B:71:0x009a }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$doFetch(NetworkFetcher networkFetcher, Continuation continuation) {
        NetworkFetcher$doFetch$1 networkFetcher$doFetch$1;
        int i;
        RealDiskCache.RealSnapshot realSnapshot;
        Ref$ObjectRef m;
        RealDiskCache.RealSnapshot realSnapshot2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        RealDiskCache realDiskCache;
        Ref$ObjectRef ref$ObjectRef3;
        CacheStrategy.ReadResult readResult;
        SourceFetchResult sourceFetchResult;
        Lazy lazy = networkFetcher.networkClient;
        Ref$ObjectRef ref$ObjectRef4 = networkFetcher.url;
        Options options = networkFetcher.options;
        try {
            if (continuation instanceof NetworkFetcher$doFetch$1) {
                networkFetcher$doFetch$1 = (NetworkFetcher$doFetch$1) continuation;
                int i2 = networkFetcher$doFetch$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    networkFetcher$doFetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                    NetworkFetcher$doFetch$1 networkFetcher$doFetch$12 = networkFetcher$doFetch$1;
                    Object obj = networkFetcher$doFetch$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = networkFetcher$doFetch$12.label;
                    int i3 = 0;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                        try {
                            if (options.diskCachePolicy.readEnabled && (realDiskCache = (RealDiskCache) networkFetcher.diskCache.getValue()) != null) {
                                String str = options.diskCacheKey;
                                if (str == null) {
                                    str = ref$ObjectRef4;
                                }
                                DiskLruCache diskLruCache = realDiskCache.cache;
                                ByteString.Companion companion = ByteString.Companion;
                                DiskLruCache.Snapshot snapshot = diskLruCache.get(ByteString.Companion.encodeUtf8(str).digest$okio("SHA-256").hex());
                                if (snapshot != null) {
                                    realSnapshot2 = new RealDiskCache.RealSnapshot(snapshot);
                                    m.element = realSnapshot2;
                                    ref$ObjectRef = new Ref$ObjectRef();
                                    if (realSnapshot2 != null) {
                                        FileSystem fileSystem = networkFetcher.getFileSystem();
                                        DiskLruCache.Snapshot snapshot2 = ((RealDiskCache.RealSnapshot) m.element).snapshot;
                                        if (snapshot2.closed) {
                                            throw new IllegalStateException("snapshot is closed");
                                        }
                                        Long l = (Long) fileSystem.metadata((Path) snapshot2.entry.cleanFiles.get(0)).size;
                                        if (l != null && l.longValue() == 0) {
                                            return new SourceFetchResult(networkFetcher.toImageSource((RealDiskCache.RealSnapshot) m.element), getMimeType(ref$ObjectRef4, null), DataSource.DISK);
                                        }
                                        NetworkResponse networkResponseOrNull = networkFetcher.toNetworkResponseOrNull((RealDiskCache.RealSnapshot) m.element);
                                        ref$ObjectRef.element = networkResponseOrNull;
                                        if (networkResponseOrNull != null) {
                                            throwIfFailureResponseCode(networkResponseOrNull);
                                            CacheStrategy cacheStrategy = (CacheStrategy) networkFetcher.cacheStrategy.getValue();
                                            NetworkResponse networkResponse = (NetworkResponse) ref$ObjectRef.element;
                                            networkFetcher.newRequest();
                                            networkFetcher$doFetch$12.L$0 = m;
                                            networkFetcher$doFetch$12.L$1 = ref$ObjectRef;
                                            networkFetcher$doFetch$12.label = 1;
                                            ((DefaultCacheStrategy) cacheStrategy).getClass();
                                            CacheStrategy.ReadResult readResult2 = new CacheStrategy.ReadResult(networkResponse);
                                            if (readResult2 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            ref$ObjectRef2 = ref$ObjectRef;
                                            obj = readResult2;
                                        }
                                    }
                                    ref$ObjectRef3 = m;
                                    if (options.networkCachePolicy.readEnabled && Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        throw new NetworkOnMainThreadException();
                                    }
                                    NetworkRequest newRequest = networkFetcher.newRequest();
                                    CallFactoryNetworkClient callFactoryNetworkClient = (CallFactoryNetworkClient) lazy.getValue();
                                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef3, networkFetcher, ref$ObjectRef, newRequest, (Continuation) null);
                                    networkFetcher$doFetch$12.L$0 = ref$ObjectRef3;
                                    networkFetcher$doFetch$12.L$1 = null;
                                    networkFetcher$doFetch$12.label = 2;
                                    obj = CallFactoryNetworkClient.m1461executeRequestimpl(callFactoryNetworkClient.callFactory, newRequest, networkFetcher$doFetch$fetchResult$1, networkFetcher$doFetch$12);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    sourceFetchResult = (SourceFetchResult) obj;
                                    if (sourceFetchResult == null) {
                                    }
                                }
                            }
                            ref$ObjectRef = new Ref$ObjectRef();
                            if (realSnapshot2 != null) {
                            }
                            ref$ObjectRef3 = m;
                            if (options.networkCachePolicy.readEnabled) {
                                throw new NetworkOnMainThreadException();
                            }
                            NetworkRequest newRequest2 = networkFetcher.newRequest();
                            CallFactoryNetworkClient callFactoryNetworkClient2 = (CallFactoryNetworkClient) lazy.getValue();
                            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$12 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef3, networkFetcher, ref$ObjectRef, newRequest2, (Continuation) null);
                            networkFetcher$doFetch$12.L$0 = ref$ObjectRef3;
                            networkFetcher$doFetch$12.L$1 = null;
                            networkFetcher$doFetch$12.label = 2;
                            obj = CallFactoryNetworkClient.m1461executeRequestimpl(callFactoryNetworkClient2.callFactory, newRequest2, networkFetcher$doFetch$fetchResult$12, networkFetcher$doFetch$12);
                            if (obj == coroutineSingletons) {
                            }
                            sourceFetchResult = (SourceFetchResult) obj;
                            if (sourceFetchResult == null) {
                            }
                        } catch (Exception e) {
                            e = e;
                            ref$ObjectRef4 = m;
                            realSnapshot = (RealDiskCache.RealSnapshot) ref$ObjectRef4.element;
                            if (realSnapshot != null) {
                            }
                            throw e;
                        }
                        realSnapshot2 = null;
                        m.element = realSnapshot2;
                    } else if (i == 1) {
                        Ref$ObjectRef ref$ObjectRef5 = networkFetcher$doFetch$12.L$1;
                        Ref$ObjectRef ref$ObjectRef6 = networkFetcher$doFetch$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            ref$ObjectRef2 = ref$ObjectRef5;
                            m = ref$ObjectRef6;
                        } catch (Exception e2) {
                            e = e2;
                            ref$ObjectRef4 = ref$ObjectRef6;
                            realSnapshot = (RealDiskCache.RealSnapshot) ref$ObjectRef4.element;
                            if (realSnapshot != null) {
                                try {
                                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) realSnapshot);
                                } catch (RuntimeException e3) {
                                    throw e3;
                                } catch (Exception unused) {
                                }
                            }
                            throw e;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Ref$ObjectRef ref$ObjectRef7 = networkFetcher$doFetch$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return (SourceFetchResult) obj;
                        }
                        ref$ObjectRef3 = networkFetcher$doFetch$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        sourceFetchResult = (SourceFetchResult) obj;
                        if (sourceFetchResult == null) {
                            return sourceFetchResult;
                        }
                        CallFactoryNetworkClient callFactoryNetworkClient3 = (CallFactoryNetworkClient) lazy.getValue();
                        NetworkRequest newRequest3 = networkFetcher.newRequest();
                        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(networkFetcher, continuation2, i3);
                        networkFetcher$doFetch$12.L$0 = ref$ObjectRef3;
                        networkFetcher$doFetch$12.label = 3;
                        obj = CallFactoryNetworkClient.m1461executeRequestimpl(callFactoryNetworkClient3.callFactory, newRequest3, networkFetcher$doFetch$2, networkFetcher$doFetch$12);
                    }
                    readResult = (CacheStrategy.ReadResult) obj;
                    if (readResult.response == null) {
                        return new SourceFetchResult(networkFetcher.toImageSource((RealDiskCache.RealSnapshot) m.element), getMimeType(ref$ObjectRef4, readResult.response.headers.get()), DataSource.DISK);
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                    ref$ObjectRef3 = m;
                    if (options.networkCachePolicy.readEnabled) {
                    }
                    NetworkRequest newRequest22 = networkFetcher.newRequest();
                    CallFactoryNetworkClient callFactoryNetworkClient22 = (CallFactoryNetworkClient) lazy.getValue();
                    NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$122 = new NetworkFetcher$doFetch$fetchResult$1(ref$ObjectRef3, networkFetcher, ref$ObjectRef, newRequest22, (Continuation) null);
                    networkFetcher$doFetch$12.L$0 = ref$ObjectRef3;
                    networkFetcher$doFetch$12.L$1 = null;
                    networkFetcher$doFetch$12.label = 2;
                    obj = CallFactoryNetworkClient.m1461executeRequestimpl(callFactoryNetworkClient22.callFactory, newRequest22, networkFetcher$doFetch$fetchResult$122, networkFetcher$doFetch$12);
                    if (obj == coroutineSingletons) {
                    }
                    sourceFetchResult = (SourceFetchResult) obj;
                    if (sourceFetchResult == null) {
                    }
                }
            }
            if (i != 0) {
            }
            readResult = (CacheStrategy.ReadResult) obj;
            if (readResult.response == null) {
            }
        } catch (Exception e4) {
            e = e4;
        }
        networkFetcher$doFetch$1 = new NetworkFetcher$doFetch$1(networkFetcher, continuation);
        NetworkFetcher$doFetch$1 networkFetcher$doFetch$122 = networkFetcher$doFetch$1;
        Object obj2 = networkFetcher$doFetch$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$doFetch$122.label;
        int i32 = 0;
        Continuation continuation22 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toImageSource(NetworkFetcher networkFetcher, SourceResponseBody sourceResponseBody, ContinuationImpl continuationImpl) {
        NetworkFetcher$toImageSource$1 networkFetcher$toImageSource$1;
        int i;
        Buffer buffer;
        networkFetcher.getClass();
        if (continuationImpl instanceof NetworkFetcher$toImageSource$1) {
            networkFetcher$toImageSource$1 = (NetworkFetcher$toImageSource$1) continuationImpl;
            int i2 = networkFetcher$toImageSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                networkFetcher$toImageSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = networkFetcher$toImageSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkFetcher$toImageSource$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Buffer buffer2 = new Buffer();
                    networkFetcher$toImageSource$1.L$0 = buffer2;
                    networkFetcher$toImageSource$1.label = 1;
                    sourceResponseBody.source.readAll(buffer2);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    buffer = buffer2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    buffer = networkFetcher$toImageSource$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return ImageSourceKt.ImageSource$default(buffer, networkFetcher.getFileSystem());
            }
        }
        networkFetcher$toImageSource$1 = new NetworkFetcher$toImageSource$1(networkFetcher, continuationImpl);
        Object obj2 = networkFetcher$toImageSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$toImageSource$1.label;
        if (i != 0) {
        }
        return ImageSourceKt.ImageSource$default(buffer, networkFetcher.getFileSystem());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$writeToDiskCache(NetworkFetcher networkFetcher, RealDiskCache.RealSnapshot realSnapshot, NetworkResponse networkResponse, NetworkResponse networkResponse2, ContinuationImpl continuationImpl) {
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$1;
        int i;
        OneShotDisposable oneShotDisposable;
        NetworkResponse networkResponse3;
        OneShotDisposable oneShotDisposable2;
        OneShotDisposable oneShotDisposable3;
        ?? th;
        ?? th2;
        Response edit;
        SourceResponseBody sourceResponseBody;
        SourceResponseBody sourceResponseBody2;
        DiskLruCache diskLruCache;
        DiskLruCache.Snapshot snapshot;
        RealDiskCache.RealSnapshot realSnapshot2 = realSnapshot;
        NetworkResponse networkResponse4 = networkResponse2;
        networkFetcher.getClass();
        if (continuationImpl instanceof NetworkFetcher$writeToDiskCache$1) {
            networkFetcher$writeToDiskCache$1 = (NetworkFetcher$writeToDiskCache$1) continuationImpl;
            int i2 = networkFetcher$writeToDiskCache$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                networkFetcher$writeToDiskCache$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = networkFetcher$writeToDiskCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkFetcher$writeToDiskCache$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!networkFetcher.options.diskCachePolicy.writeEnabled) {
                        if (realSnapshot2 == null) {
                            return null;
                        }
                        try {
                            JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) realSnapshot2);
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                        return null;
                    }
                    CacheStrategy cacheStrategy = (CacheStrategy) networkFetcher.cacheStrategy.getValue();
                    networkFetcher$writeToDiskCache$1.L$0 = realSnapshot2;
                    networkFetcher$writeToDiskCache$1.L$1 = networkResponse4;
                    networkFetcher$writeToDiskCache$1.label = 1;
                    ((DefaultCacheStrategy) cacheStrategy).getClass();
                    int i4 = networkResponse4.code;
                    if (i4 != 304 || networkResponse == null) {
                        oneShotDisposable = null;
                        obj = ((200 > i4 || i4 >= 300) && !DefaultCacheStrategy.CACHEABLE_STATUS_CODES.contains(new Integer(i4))) ? CacheStrategy.WriteResult.DISABLED : new CacheStrategy.WriteResult(networkResponse4);
                    } else {
                        NetworkHeaders networkHeaders = networkResponse.headers;
                        NetworkHeaders networkHeaders2 = networkResponse4.headers;
                        networkHeaders.getClass();
                        Map map = networkHeaders.data;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(entry.getKey(), CollectionsKt.toMutableList((Collection) entry.getValue()));
                        }
                        for (Map.Entry entry2 : networkHeaders2.data.entrySet()) {
                            String str = (String) entry2.getKey();
                            List list = (List) entry2.getValue();
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            linkedHashMap.put(lowerCase, CollectionsKt.toMutableList((Collection) list));
                        }
                        oneShotDisposable = null;
                        obj = new CacheStrategy.WriteResult(new NetworkResponse(networkResponse4.code, networkResponse4.requestMillis, networkResponse4.responseMillis, new NetworkHeaders(MapsKt__MapsKt.toMap(linkedHashMap)), null, networkResponse4.delegate));
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    NetworkResponse networkResponse5 = networkFetcher$writeToDiskCache$1.L$1;
                    RealDiskCache.RealSnapshot realSnapshot3 = (RealDiskCache.RealSnapshot) networkFetcher$writeToDiskCache$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    networkResponse4 = networkResponse5;
                    realSnapshot2 = realSnapshot3;
                    oneShotDisposable = null;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oneShotDisposable3 = networkFetcher$writeToDiskCache$1.L$2;
                    networkResponse3 = networkFetcher$writeToDiskCache$1.L$1;
                    networkResponse4 = (NetworkResponse) networkFetcher$writeToDiskCache$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        oneShotDisposable = null;
                        Response response = (Response) oneShotDisposable3.job;
                        diskLruCache = (DiskLruCache) response.error;
                        synchronized (diskLruCache.lock) {
                            response.complete(true);
                            snapshot = diskLruCache.get(((DiskLruCache.Entry) response.result).key);
                        }
                        return snapshot != null ? new RealDiskCache.RealSnapshot(snapshot) : oneShotDisposable;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            ((Response) oneShotDisposable3.job).complete(false);
                        } catch (Exception unused2) {
                        }
                        sourceResponseBody = networkResponse4.body;
                        if (sourceResponseBody != null) {
                        }
                        sourceResponseBody2 = networkResponse3.body;
                        if (sourceResponseBody2 != null) {
                        }
                    }
                }
                networkResponse3 = ((CacheStrategy.WriteResult) obj).response;
                if (networkResponse3 != null) {
                    return oneShotDisposable;
                }
                if (realSnapshot2 != null) {
                    DiskLruCache.Snapshot snapshot2 = realSnapshot2.snapshot;
                    DiskLruCache diskLruCache2 = DiskLruCache.this;
                    synchronized (diskLruCache2.lock) {
                        snapshot2.close();
                        edit = diskLruCache2.edit(snapshot2.entry.key);
                    }
                    if (edit != null) {
                        oneShotDisposable2 = new OneShotDisposable(edit, i3);
                        if (oneShotDisposable2 != null) {
                            return oneShotDisposable;
                        }
                        try {
                            RealBufferedSink buffer = Okio.buffer(networkFetcher.getFileSystem().sink(((Response) oneShotDisposable2.job).file(0), false));
                            try {
                                CacheNetworkResponse.writeTo(networkResponse3, buffer);
                                try {
                                    buffer.close();
                                    th = oneShotDisposable;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                try {
                                    buffer.close();
                                } catch (Throwable th5) {
                                    ExceptionsKt__ExceptionsKt.addSuppressed(th4, th5);
                                }
                                th = th4;
                            }
                            if (th != 0) {
                                throw th;
                            }
                            SourceResponseBody sourceResponseBody3 = networkResponse3.body;
                            if (sourceResponseBody3 != null) {
                                FileSystem fileSystem = networkFetcher.getFileSystem();
                                Path file = ((Response) oneShotDisposable2.job).file(1);
                                networkFetcher$writeToDiskCache$1.L$0 = networkResponse4;
                                networkFetcher$writeToDiskCache$1.L$1 = networkResponse3;
                                networkFetcher$writeToDiskCache$1.L$2 = oneShotDisposable2;
                                networkFetcher$writeToDiskCache$1.label = 2;
                                BufferedSource bufferedSource = sourceResponseBody3.source;
                                RealBufferedSink buffer2 = Okio.buffer(fileSystem.sink(file, false));
                                try {
                                    new Long(bufferedSource.readAll(buffer2));
                                    try {
                                        buffer2.close();
                                        th2 = oneShotDisposable;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        buffer2.close();
                                    } catch (Throwable th8) {
                                        ExceptionsKt__ExceptionsKt.addSuppressed(th7, th8);
                                    }
                                    th2 = th7;
                                }
                                if (th2 != 0) {
                                    throw th2;
                                }
                                if (Unit.INSTANCE == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            oneShotDisposable3 = oneShotDisposable2;
                            Response response2 = (Response) oneShotDisposable3.job;
                            diskLruCache = (DiskLruCache) response2.error;
                            synchronized (diskLruCache.lock) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            oneShotDisposable3 = oneShotDisposable2;
                            ((Response) oneShotDisposable3.job).complete(false);
                            sourceResponseBody = networkResponse4.body;
                            if (sourceResponseBody != null) {
                                try {
                                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) sourceResponseBody);
                                } catch (RuntimeException e4) {
                                    throw e4;
                                } catch (Exception unused3) {
                                }
                            }
                            sourceResponseBody2 = networkResponse3.body;
                            if (sourceResponseBody2 != null) {
                                throw e;
                            }
                            try {
                                JsonLogicResult$Success$$ExternalSyntheticOutline0.m((AutoCloseable) sourceResponseBody2);
                                throw e;
                            } catch (RuntimeException e5) {
                                throw e5;
                            } catch (Exception unused4) {
                                throw e;
                            }
                        }
                    }
                    oneShotDisposable2 = oneShotDisposable;
                    if (oneShotDisposable2 != null) {
                    }
                } else {
                    RealDiskCache realDiskCache = (RealDiskCache) networkFetcher.diskCache.getValue();
                    if (realDiskCache != null) {
                        String str2 = networkFetcher.options.diskCacheKey;
                        if (str2 == null) {
                            str2 = networkFetcher.url;
                        }
                        DiskLruCache diskLruCache3 = realDiskCache.cache;
                        ByteString.Companion companion = ByteString.Companion;
                        Response edit2 = diskLruCache3.edit(ByteString.Companion.encodeUtf8(str2).digest$okio("SHA-256").hex());
                        if (edit2 != null) {
                            oneShotDisposable2 = new OneShotDisposable(edit2, i3);
                            if (oneShotDisposable2 != null) {
                            }
                        }
                    }
                    oneShotDisposable2 = oneShotDisposable;
                    if (oneShotDisposable2 != null) {
                    }
                }
            }
        }
        networkFetcher$writeToDiskCache$1 = new NetworkFetcher$writeToDiskCache$1(networkFetcher, continuationImpl);
        Object obj2 = networkFetcher$writeToDiskCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkFetcher$writeToDiskCache$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        networkResponse3 = ((CacheStrategy.WriteResult) obj2).response;
        if (networkResponse3 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getMimeType(String str, String str2) {
        String str3;
        if (str2 == null || StringsKt__StringsJVMKt.startsWith(str2, "text/plain", false)) {
            if (!StringsKt.isBlank(str)) {
                String substringBeforeLast$default = StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#'), '?');
                String substringAfterLast = StringsKt.substringAfterLast('.', StringsKt.substringAfterLast('/', substringBeforeLast$default, substringBeforeLast$default), "");
                if (!StringsKt.isBlank(substringAfterLast)) {
                    String lowerCase = substringAfterLast.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str3 = (String) MimeTypesKt.mimeTypeData.get(lowerCase);
                    if (str3 == null) {
                        str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        if (str2 != null) {
            return StringsKt.substringBefore$default(str2, ';');
        }
        return null;
    }

    public static void throwIfFailureResponseCode(NetworkResponse networkResponse) {
        int i = networkResponse.code;
        if ((200 > i || i >= 300) && i != 304) {
            throw new HttpException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "HTTP "));
        }
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(EngineInterceptor$fetch$1 engineInterceptor$fetch$1) {
        UncoordinatedConcurrentRequestStrategy uncoordinatedConcurrentRequestStrategy = (UncoordinatedConcurrentRequestStrategy) this.concurrentRequestStrategy.getValue();
        String str = this.options.diskCacheKey;
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, this, NetworkFetcher.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
        uncoordinatedConcurrentRequestStrategy.getClass();
        return networkFetcher$fetch$2.invoke(engineInterceptor$fetch$1);
    }

    public final FileSystem getFileSystem() {
        FileSystem fileSystem;
        RealDiskCache realDiskCache = (RealDiskCache) this.diskCache.getValue();
        return (realDiskCache == null || (fileSystem = realDiskCache.fileSystem) == null) ? this.options.fileSystem : fileSystem;
    }

    public final NetworkRequest newRequest() {
        Extras.Key key = ImageRequestsKt.httpHeadersKey;
        Options options = this.options;
        NetworkHeaders networkHeaders = (NetworkHeaders) ExtrasKt.getExtra(options, key);
        networkHeaders.getClass();
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder(networkHeaders);
        CachePolicy cachePolicy = options.diskCachePolicy;
        boolean z = cachePolicy.readEnabled;
        boolean z2 = options.networkCachePolicy.readEnabled && ((ConnectivityChecker) this.connectivityChecker.value).isOnline();
        if (!z2 && z) {
            builder.set("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                builder.set("no-cache, only-if-cached");
            }
        } else if (cachePolicy.writeEnabled) {
            builder.set("no-cache");
        } else {
            builder.set("no-cache, no-store");
        }
        String str = (String) ExtrasKt.getExtra(options, ImageRequestsKt.httpMethodKey);
        NetworkHeaders networkHeaders2 = new NetworkHeaders(MapsKt__MapsKt.toMap(builder.data));
        if (ExtrasKt.getExtra(options, ImageRequestsKt.httpBodyKey) == null) {
            return new NetworkRequest(this.url, str, networkHeaders2, options.extras);
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public final FileImageSource toImageSource(RealDiskCache.RealSnapshot realSnapshot) {
        DiskLruCache.Snapshot snapshot = realSnapshot.snapshot;
        if (snapshot.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("snapshot is closed");
            return null;
        }
        Path path = (Path) snapshot.entry.cleanFiles.get(1);
        FileSystem fileSystem = getFileSystem();
        String str = this.options.diskCacheKey;
        if (str == null) {
            str = this.url;
        }
        return ImageSourceKt.ImageSource$default(path, fileSystem, str, realSnapshot, 16);
    }

    public final NetworkResponse toNetworkResponseOrNull(RealDiskCache.RealSnapshot realSnapshot) {
        Throwable th;
        NetworkResponse networkResponse;
        try {
            FileSystem fileSystem = getFileSystem();
            DiskLruCache.Snapshot snapshot = realSnapshot.snapshot;
            if (snapshot.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            RealBufferedSource buffer = Okio.buffer(fileSystem.source((Path) snapshot.entry.cleanFiles.get(0)));
            try {
                networkResponse = CacheNetworkResponse.readFrom(buffer);
                try {
                    buffer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                }
                th = th3;
                networkResponse = null;
            }
            if (th == null) {
                return networkResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
