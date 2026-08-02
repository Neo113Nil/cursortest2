package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.collection.ArrayMap;
import androidx.media3.extractor.text.CueEncoder;
import androidx.paging.PagingConfig;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.util.Util;
import com.fillr.m1;
import com.fillr.n1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class Glide implements ComponentCallbacks2 {
    public static volatile Glide glide;
    public static volatile boolean isInitializing;
    public final LruArrayPool arrayPool;
    public final BitmapPool bitmapPool;
    public final GlideBuilder$1 connectivityMonitorFactory;
    public final GlideContext glideContext;
    public final ArrayList managers = new ArrayList();
    public final LruResourceCache memoryCache;
    public final RequestManagerRetriever requestManagerRetriever;

    public Glide(Context context, Engine engine, LruResourceCache lruResourceCache, BitmapPool bitmapPool, LruArrayPool lruArrayPool, RequestManagerRetriever requestManagerRetriever, GlideBuilder$1 glideBuilder$1, GlideBuilder$1 glideBuilder$12, ArrayMap arrayMap, List list, ArrayList arrayList, AppGlideModule appGlideModule, m1 m1Var) {
        this.bitmapPool = bitmapPool;
        this.arrayPool = lruArrayPool;
        this.memoryCache = lruResourceCache;
        this.requestManagerRetriever = requestManagerRetriever;
        this.connectivityMonitorFactory = glideBuilder$1;
        this.glideContext = new GlideContext(context, lruArrayPool, new VideoCapture.AnonymousClass3(this, arrayList, appGlideModule), new GlideBuilder$1(), glideBuilder$12, arrayMap, list, engine, m1Var);
    }

    public static Glide get(Context context) {
        if (glide == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                a$$ExternalSyntheticBUOutline0.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                a$$ExternalSyntheticBUOutline0.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                a$$ExternalSyntheticBUOutline0.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                a$$ExternalSyntheticBUOutline0.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (Glide.class) {
                if (glide == null) {
                    if (isInitializing) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    isInitializing = true;
                    try {
                        initializeGlide(context, generatedAppGlideModule);
                        isInitializing = false;
                    } catch (Throwable th) {
                        isInitializing = false;
                        throw th;
                    }
                }
            }
        }
        return glide;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initializeGlide(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        GlideExecutor glideExecutor;
        Iterator it2;
        ApplicationInfo applicationInfo;
        ArrayMap arrayMap = new ArrayMap(0);
        n1 n1Var = new n1(1);
        GlideBuilder$1 glideBuilder$1 = new GlideBuilder$1();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    ManifestParser.parseModule(str);
                    throw null;
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                new HashSet();
                it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it2);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it3);
                }
            }
            it = arrayList.iterator();
            if (!it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
            GlideExecutor.DefaultPriorityThreadFactory defaultPriorityThreadFactory = new GlideExecutor.DefaultPriorityThreadFactory();
            if (GlideExecutor.bestThreadCount == 0) {
                GlideExecutor.bestThreadCount = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = GlideExecutor.bestThreadCount;
            if (TextUtils.isEmpty("source")) {
                a$$ExternalSyntheticBUOutline0.m$3("Name must be non-null and non-empty, but given: source");
                return;
            }
            PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
            GlideExecutor.DefaultThreadFactory defaultThreadFactory = new GlideExecutor.DefaultThreadFactory(defaultPriorityThreadFactory, "source", false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            GlideExecutor glideExecutor2 = new GlideExecutor(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, defaultThreadFactory));
            GlideExecutor.DefaultPriorityThreadFactory defaultPriorityThreadFactory2 = new GlideExecutor.DefaultPriorityThreadFactory();
            if (TextUtils.isEmpty("disk-cache")) {
                a$$ExternalSyntheticBUOutline0.m$3("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            GlideExecutor glideExecutor3 = new GlideExecutor(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new GlideExecutor.DefaultThreadFactory(defaultPriorityThreadFactory2, "disk-cache", true)));
            if (GlideExecutor.bestThreadCount == 0) {
                GlideExecutor.bestThreadCount = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = GlideExecutor.bestThreadCount >= 4 ? 2 : 1;
            GlideExecutor.DefaultPriorityThreadFactory defaultPriorityThreadFactory3 = new GlideExecutor.DefaultPriorityThreadFactory();
            if (TextUtils.isEmpty("animation")) {
                a$$ExternalSyntheticBUOutline0.m$3("Name must be non-null and non-empty, but given: animation");
                return;
            }
            GlideExecutor glideExecutor4 = new GlideExecutor(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new GlideExecutor.DefaultThreadFactory(defaultPriorityThreadFactory3, "animation", true)));
            MemorySizeCalculator$Builder memorySizeCalculator$Builder = new MemorySizeCalculator$Builder(applicationContext);
            PagingConfig pagingConfig = new PagingConfig();
            Context context2 = (Context) memorySizeCalculator$Builder.context;
            float f = memorySizeCalculator$Builder.bitmapPoolScreens;
            ActivityManager activityManager = (ActivityManager) memorySizeCalculator$Builder.activityManager;
            int i3 = activityManager.isLowRamDevice() ? PKIFailureInfo.badSenderNonce : 4194304;
            pagingConfig.initialLoadSize = i3;
            int round = Math.round(activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) ((m1) memorySizeCalculator$Builder.screenDimensions).a;
            float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            int round2 = Math.round(f2 * f);
            int round3 = Math.round(f2 * 2.0f);
            int i4 = round - i3;
            int i5 = round3 + round2;
            if (i5 <= i4) {
                pagingConfig.prefetchDistance = round3;
                pagingConfig.pageSize = round2;
            } else {
                float f3 = i4 / (f + 2.0f);
                pagingConfig.prefetchDistance = Math.round(2.0f * f3);
                pagingConfig.pageSize = Math.round(f3 * f);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                glideExecutor = glideExecutor4;
                sb.append(Formatter.formatFileSize(context2, pagingConfig.prefetchDistance));
                sb.append(", pool size: ");
                sb.append(Formatter.formatFileSize(context2, pagingConfig.pageSize));
                sb.append(", byte array size: ");
                sb.append(Formatter.formatFileSize(context2, i3));
                sb.append(", memory class limited? ");
                sb.append(i5 > round);
                sb.append(", max size: ");
                sb.append(Formatter.formatFileSize(context2, round));
                sb.append(", memoryClass: ");
                sb.append(activityManager.getMemoryClass());
                sb.append(", isLowMemoryDevice: ");
                sb.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb.toString());
            } else {
                glideExecutor = glideExecutor4;
            }
            GlideBuilder$1 glideBuilder$12 = new GlideBuilder$1();
            int i6 = pagingConfig.pageSize;
            BitmapPool lruBitmapPool = i6 > 0 ? new LruBitmapPool(i6) : new CueEncoder(18);
            LruArrayPool lruArrayPool = new LruArrayPool(pagingConfig.initialLoadSize);
            LruResourceCache lruResourceCache = new LruResourceCache(pagingConfig.prefetchDistance);
            Glide glide2 = new Glide(applicationContext, new Engine(lruResourceCache, new OneShotDisposable(applicationContext), glideExecutor3, glideExecutor2, new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new GlideExecutor.DefaultThreadFactory(new GlideExecutor.DefaultPriorityThreadFactory(), "source-unlimited", false))), glideExecutor), lruResourceCache, lruBitmapPool, lruArrayPool, new RequestManagerRetriever(), glideBuilder$12, glideBuilder$1, arrayMap, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new m1(n1Var));
            applicationContext.registerComponentCallbacks(glide2);
            glide = glide2;
            return;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        if (generatedAppGlideModule != null) {
            new HashSet();
            it2 = arrayList.iterator();
            if (it2.hasNext()) {
            }
        }
        if (Log.isLoggable("Glide", 3)) {
        }
        it = arrayList.iterator();
        if (!it.hasNext()) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Util.assertMainThread();
        this.memoryCache.trimToSize(0L);
        this.bitmapPool.clearMemory();
        LruArrayPool lruArrayPool = this.arrayPool;
        synchronized (lruArrayPool) {
            lruArrayPool.evictToSize(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        Util.assertMainThread();
        synchronized (this.managers) {
            try {
                Iterator it = this.managers.iterator();
                while (it.hasNext()) {
                    ((RequestManager) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LruResourceCache lruResourceCache = this.memoryCache;
        lruResourceCache.getClass();
        if (i >= 40) {
            lruResourceCache.trimToSize(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (lruResourceCache) {
                j = lruResourceCache.maxSize;
            }
            lruResourceCache.trimToSize(j / 2);
        }
        this.bitmapPool.trimMemory(i);
        LruArrayPool lruArrayPool = this.arrayPool;
        synchronized (lruArrayPool) {
            if (i >= 40) {
                synchronized (lruArrayPool) {
                    lruArrayPool.evictToSize(0);
                }
            } else if (i >= 20 || i == 15) {
                lruArrayPool.evictToSize(lruArrayPool.maxSize / 2);
            }
        }
    }
}
