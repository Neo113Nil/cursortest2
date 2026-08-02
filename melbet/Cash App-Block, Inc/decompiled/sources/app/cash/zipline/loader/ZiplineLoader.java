package app.cash.zipline.loader;

import android.util.Log;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraComponentImpl;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.impl.UseCaseCameraState;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import app.cash.zipline.EventListener;
import app.cash.zipline.QuickJs;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.loader.LoadResult;
import app.cash.zipline.loader.ZiplineLoader;
import app.cash.zipline.loader.internal.fetcher.Fetcher;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher;
import app.cash.zipline.loader.internal.fetcher.FsCachingFetcher$pin$2;
import app.cash.zipline.loader.internal.fetcher.FsEmbeddedFetcher;
import app.cash.zipline.loader.internal.fetcher.HttpFetcher;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.AsyncEventWriteScope;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.ConsentAwareStorage$Batch;
import com.datadog.android.core.internal.persistence.FileEventBatchWriter;
import com.datadog.android.core.internal.persistence.NoOpEventBatchWriter;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FileMover$delete$1;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.plaid.internal.EnumC0170g;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.coroutines.sync.SemaphoreKt;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.internal.connection.RealConnectionPool;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.assetfilesystem.AssetFileSystem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ZiplineLoader implements Storage {
    public final Object cache;
    public final Object cacheDispatcher;
    public final Object cachingFetcher;
    public final Object concurrentDownloadsSemaphore;
    public final Object dispatcher;
    public final Object embeddedDir;
    public final Object embeddedFetcher;
    public final Object embeddedFileSystem;
    public final Object eventListenerFactory;
    public final Object httpFetcher;
    public final Object manifestVerifier;
    public final Object moduleFetchers;
    public final Object nowEpochMs;

    public final class ModuleJob {
        public final String applicationName;
        public final String baseUrl;
        public final EventListener eventListener;
        public final String id;
        public final ZiplineManifest.Module module;
        public final long nowEpochMs;
        public final EventListenerAdapter receiver;
        public final /* synthetic */ ZiplineLoader this$0;
        public final ArrayList upstreams;

        public ModuleJob(ZiplineLoader ziplineLoader, String str, EventListener eventListener, String str2, String str3, ZiplineManifest.Module module, EventListenerAdapter eventListenerAdapter, long j) {
            str.getClass();
            eventListener.getClass();
            str2.getClass();
            module.getClass();
            this.this$0 = ziplineLoader;
            this.applicationName = str;
            this.eventListener = eventListener;
            this.id = str2;
            this.baseUrl = str3;
            this.module = module;
            this.receiver = eventListenerAdapter;
            this.nowEpochMs = j;
            this.upstreams = new ArrayList();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
        
            if (kotlinx.coroutines.JobKt.withContext(r1, r4, r13) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        
            if (kotlinx.coroutines.AwaitKt.joinAll(r18.upstreams, r13) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        
            if (r3 == r2) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object run(ContinuationImpl continuationImpl) {
            ZiplineLoader$ModuleJob$run$1 ziplineLoader$ModuleJob$run$1;
            int i;
            ZiplineManifest.Module module;
            ZiplineLoader ziplineLoader;
            int i2;
            Object fetch;
            ByteString byteString;
            if (continuationImpl instanceof ZiplineLoader$ModuleJob$run$1) {
                ziplineLoader$ModuleJob$run$1 = (ZiplineLoader$ModuleJob$run$1) continuationImpl;
                int i3 = ziplineLoader$ModuleJob$run$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineLoader$ModuleJob$run$1.label = i3 - PKIFailureInfo.systemUnavail;
                    ZiplineLoader$ModuleJob$run$1 ziplineLoader$ModuleJob$run$12 = ziplineLoader$ModuleJob$run$1;
                    Object obj = ziplineLoader$ModuleJob$run$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineLoader$ModuleJob$run$12.label;
                    module = this.module;
                    ZiplineLoader ziplineLoader2 = this.this$0;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list = (List) ziplineLoader2.moduleFetchers;
                        SemaphoreImpl semaphoreImpl = (SemaphoreImpl) ziplineLoader2.concurrentDownloadsSemaphore;
                        ByteString byteString2 = module.sha256;
                        String str = module.url;
                        ziplineLoader$ModuleJob$run$12.label = 1;
                        ziplineLoader = ziplineLoader2;
                        i2 = 2;
                        fetch = FetcherKt.fetch(list, semaphoreImpl, this.applicationName, this.eventListener, this.id, byteString2, this.nowEpochMs, this.baseUrl, str, ziplineLoader$ModuleJob$run$12);
                    } else if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        fetch = obj;
                        ziplineLoader = ziplineLoader2;
                        i2 = 2;
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        byteString = ziplineLoader$ModuleJob$run$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ziplineLoader = ziplineLoader2;
                        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) ziplineLoader.dispatcher;
                        ZiplineLoader$ModuleJob$run$3 ziplineLoader$ModuleJob$run$3 = new ZiplineLoader$ModuleJob$run$3(this, byteString, null, 0);
                        ziplineLoader$ModuleJob$run$12.L$0 = null;
                        ziplineLoader$ModuleJob$run$12.label = 3;
                    }
                    fetch.getClass();
                    byteString = (ByteString) fetch;
                    if (byteString.digest$okio("SHA-256").equals(module.sha256)) {
                        Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("checksum mismatch for ", this.id));
                        return null;
                    }
                    ziplineLoader$ModuleJob$run$12.L$0 = byteString;
                    ziplineLoader$ModuleJob$run$12.label = i2;
                }
            }
            ziplineLoader$ModuleJob$run$1 = new ZiplineLoader$ModuleJob$run$1(this, continuationImpl);
            ZiplineLoader$ModuleJob$run$1 ziplineLoader$ModuleJob$run$122 = ziplineLoader$ModuleJob$run$1;
            Object obj2 = ziplineLoader$ModuleJob$run$122.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = ziplineLoader$ModuleJob$run$122.label;
            module = this.module;
            ZiplineLoader ziplineLoader22 = this.this$0;
            if (i != 0) {
            }
            fetch.getClass();
            byteString = (ByteString) fetch;
            if (byteString.digest$okio("SHA-256").equals(module.sha256)) {
            }
        }
    }

    public ZiplineLoader(final DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl, final DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl, UseCaseCameraConfig useCaseCameraConfig) {
        this.dispatcher = useCaseCameraConfig;
        final int i = 1;
        this.cacheDispatcher = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i2 = this.id;
                switch (i2) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i2);
                }
            }
        });
        final int i2 = 2;
        this.manifestVerifier = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i2) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i3 = 7;
        this.httpFetcher = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i3) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i4 = 8;
        this.eventListenerFactory = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i4) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i5 = 6;
        this.nowEpochMs = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i5) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i6 = 9;
        this.embeddedDir = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i6) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i6;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i7 = 5;
        this.embeddedFileSystem = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i7) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i7;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i8 = 11;
        this.cache = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i8) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i8;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i9 = 10;
        this.concurrentDownloadsSemaphore = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i9) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i9;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i10 = 4;
        this.embeddedFetcher = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i10) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i11 = 3;
        this.cachingFetcher = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i11) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
        final int i12 = 0;
        this.moduleFetchers = DoubleCheck.provider(new Provider(daggerCameraAppComponent$CameraAppComponentImpl, daggerCameraAppComponent$CameraComponentImpl, this, i12) { // from class: androidx.camera.camera2.config.DaggerCameraAppComponent$UseCaseCameraComponentImpl$SwitchingProvider
            public final DaggerCameraAppComponent$CameraAppComponentImpl cameraAppComponentImpl;
            public final DaggerCameraAppComponent$CameraComponentImpl cameraComponentImpl;
            public final int id;
            public final ZiplineLoader useCaseCameraComponentImpl;

            {
                this.cameraAppComponentImpl = daggerCameraAppComponent$CameraAppComponentImpl;
                this.cameraComponentImpl = daggerCameraAppComponent$CameraComponentImpl;
                this.useCaseCameraComponentImpl = this;
                this.id = i12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // javax.inject.Provider
            public final Object get() {
                TargetAspectRatio targetAspectRatio;
                DaggerCameraAppComponent$CameraAppComponentImpl daggerCameraAppComponent$CameraAppComponentImpl2 = this.cameraAppComponentImpl;
                ZiplineLoader ziplineLoader = this.useCaseCameraComponentImpl;
                DaggerCameraAppComponent$CameraComponentImpl daggerCameraAppComponent$CameraComponentImpl2 = this.cameraComponentImpl;
                int i22 = this.id;
                switch (i22) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        if (((Provider) ziplineLoader.manifestVerifier).get() == null) {
                            return new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, (UseCaseCameraRequestControl) ((Provider) ziplineLoader.cachingFetcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (Provider) ziplineLoader.cache, (Provider) ziplineLoader.embeddedFileSystem);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    case 1:
                        UseCaseCameraConfig useCaseCameraConfig2 = (UseCaseCameraConfig) ziplineLoader.dispatcher;
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) daggerCameraAppComponent$CameraComponentImpl2.cameraStateAdapterProvider.get();
                        useCaseCameraConfig2.getClass();
                        cameraStateAdapter.getClass();
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                        }
                        return new UseCaseGraphContext(new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 0), cameraStateAdapter, useCaseCameraConfig2.graphStateToCameraStateAdapter, new UseCaseCameraConfig$$ExternalSyntheticLambda0(useCaseCameraConfig2, 1));
                    case 2:
                        ((UseCaseCameraConfig) ziplineLoader.dispatcher).getClass();
                        return null;
                    case 3:
                        return new DeferredUseCaseCameraRequestControl((Provider) ziplineLoader.embeddedFetcher, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get());
                    case 4:
                        return new UseCaseCameraRequestControlImpl((Provider) ziplineLoader.embeddedFileSystem, (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (Provider) ziplineLoader.concurrentDownloadsSemaphore, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (CameraXConfig) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.h);
                    case 5:
                        Provider provider = (Provider) ziplineLoader.nowEpochMs;
                        Provider provider2 = (Provider) ziplineLoader.embeddedDir;
                        provider.getClass();
                        provider2.getClass();
                        if (CapturePipelineTorchCorrection.isEnabled) {
                            Object obj = provider2.get();
                            obj.getClass();
                            return (CapturePipeline) obj;
                        }
                        Object obj2 = provider.get();
                        obj2.getClass();
                        return (CapturePipeline) obj2;
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) ((Provider) ziplineLoader.httpFetcher).get();
                        FlashControl flashControl = (FlashControl) daggerCameraAppComponent$CameraComponentImpl2.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) daggerCameraAppComponent$CameraComponentImpl2.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) daggerCameraAppComponent$CameraComponentImpl2.comboRequestListenerProvider.get();
                        CameraQuirks cameraQuirks = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        CameraDevicesImpl cameraDevices = daggerCameraAppComponent$CameraComponentImpl2.cameraAppComponentImpl.getCameraDevices();
                        IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl = (IntrinsicZoomCalculatorImpl) daggerCameraAppComponent$CameraComponentImpl2.intrinsicZoomCalculatorImplProvider.get();
                        cameraQuirks.getClass();
                        intrinsicZoomCalculatorImpl.getClass();
                        if (cameraQuirks.getQuirks().contains(UseTorchAsFlashQuirk.class)) {
                            MetadataRepo metadataRepo = new MetadataRepo();
                            metadataRepo.mMetadataList = cameraQuirks;
                            metadataRepo.mEmojiCharArray = cameraDevices;
                            metadataRepo.mRootNode = intrinsicZoomCalculatorImpl;
                            metadataRepo.mTypeface = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(metadataRepo, 7));
                            targetAspectRatio = metadataRepo;
                        } else {
                            targetAspectRatio = TargetAspectRatio.INSTANCE$7;
                        }
                        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, targetAspectRatio, (CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.eventListenerFactory, (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get());
                    case 7:
                        return new CaptureConfigAdapter((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), (ZslControl) daggerCameraAppComponent$CameraComponentImpl2.provideZslControlProvider.get(), (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 8:
                        return new UseCaseCameraState((UseCaseGraphContext) ((Provider) ziplineLoader.cacheDispatcher).get(), daggerCameraAppComponent$CameraComponentImpl2.templateParamsOverride());
                    case 9:
                        return new CapturePipelineTorchCorrection((CameraPipeCameraProperties) daggerCameraAppComponent$CameraComponentImpl2.cameraPipeCameraPropertiesProvider.get(), (Provider) ziplineLoader.nowEpochMs, (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get(), (TorchControl) daggerCameraAppComponent$CameraComponentImpl2.torchControlProvider.get());
                    case 10:
                        UseCaseThreads useCaseThreads3 = (UseCaseThreads) daggerCameraAppComponent$CameraComponentImpl2.provideUseCaseThreadsProvider.get();
                        CameraPipeImpl cameraPipeImpl = (CameraPipeImpl) daggerCameraAppComponent$CameraAppComponentImpl2.cameraAppConfig.c;
                        Preconditions.checkNotNullFromProvides(cameraPipeImpl);
                        CameraQuirks cameraQuirks2 = (CameraQuirks) daggerCameraAppComponent$CameraComponentImpl2.cameraQuirksProvider.get();
                        cameraQuirks2.getClass();
                        Quirks quirks = cameraQuirks2.getQuirks();
                        return new UseCaseSurfaceManager(useCaseThreads3, cameraPipeImpl, (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new Recorder.AnonymousClass4(3) : TargetAspectRatio.INSTANCE$3, (SessionConfigAdapter) ((Provider) ziplineLoader.cache).get());
                    case 11:
                        return ((UseCaseCameraConfig) ziplineLoader.dispatcher).sessionConfigAdapter;
                    default:
                        throw new AssertionError(i22);
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(7:5|6|7|8|(1:(1:(1:(1:(3:14|15|16)(2:18|19))(4:20|21|22|23))(6:25|26|27|(2:29|30)|22|23))(1:31))(2:60|(1:63)(1:62))|32|(1:34)(2:35|(6:41|42|43|44|45|(1:48)(5:47|27|(0)|22|23))(2:58|59))))|8|(0)(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005e, code lost:
    
        r19 = r3;
        r3 = r5;
        r4 = r6;
        r5 = r19;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008e  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [app.cash.zipline.loader.ZiplineLoader] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6, types: [app.cash.zipline.EventListener] */
    /* JADX WARN: Type inference failed for: r2v7, types: [app.cash.zipline.EventListener] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadFromLocal(ZiplineLoader ziplineLoader, ProducerScope producerScope, long j, String str, RealConnectionPool realConnectionPool, SerializersModule serializersModule, RealImageLoader$execute$2 realImageLoader$execute$2, ContinuationImpl continuationImpl) {
        ZiplineLoader$loadFromLocal$1 ziplineLoader$loadFromLocal$1;
        ?? r3;
        String str2;
        long j2;
        ProducerScope producerScope2;
        EventListener eventListener;
        String str3;
        ?? create;
        RealConnectionPool realConnectionPool2;
        ZiplineLoader$loadFromLocal$1 ziplineLoader$loadFromLocal$12;
        Object loadCachedOrEmbeddedManifest;
        long j3;
        String str4;
        RealImageLoader$execute$2 realImageLoader$execute$22;
        ProducerScope producerScope3;
        SerializersModule serializersModule2;
        LoadedManifest loadedManifest;
        LoadedManifest loadedManifest2;
        long j4;
        EventListener eventListener2;
        String str5;
        String str6;
        LoadResult.Success success;
        String str7 = str;
        try {
            if (continuationImpl instanceof ZiplineLoader$loadFromLocal$1) {
                ziplineLoader$loadFromLocal$1 = (ZiplineLoader$loadFromLocal$1) continuationImpl;
                int i = ziplineLoader$loadFromLocal$1.label;
                ?? r5 = -2147483648;
                if ((i & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineLoader$loadFromLocal$1.label = i - PKIFailureInfo.systemUnavail;
                    ZiplineLoader$loadFromLocal$1 ziplineLoader$loadFromLocal$13 = ziplineLoader$loadFromLocal$1;
                    Object obj = ziplineLoader$loadFromLocal$13.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r3 = ziplineLoader$loadFromLocal$13.label;
                    ?? r6 = 2;
                    if (r3 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        create = ((EventListener.Factory) ziplineLoader.eventListenerFactory).create(str7, null);
                        ziplineLoader$loadFromLocal$13.L$0 = producerScope;
                        ziplineLoader$loadFromLocal$13.L$1 = str7;
                        realConnectionPool2 = realConnectionPool;
                        ziplineLoader$loadFromLocal$13.L$2 = realConnectionPool2;
                        ziplineLoader$loadFromLocal$13.L$3 = serializersModule;
                        ziplineLoader$loadFromLocal$13.L$4 = realImageLoader$execute$2;
                        ziplineLoader$loadFromLocal$13.L$5 = create;
                        ziplineLoader$loadFromLocal$13.J$0 = j;
                        ziplineLoader$loadFromLocal$13.label = 1;
                        ziplineLoader$loadFromLocal$12 = ziplineLoader$loadFromLocal$13;
                        loadCachedOrEmbeddedManifest = ziplineLoader.loadCachedOrEmbeddedManifest(str7, create, j, ziplineLoader$loadFromLocal$12);
                        if (loadCachedOrEmbeddedManifest == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j3 = j;
                        str4 = str;
                        realImageLoader$execute$22 = realImageLoader$execute$2;
                        producerScope3 = producerScope;
                        serializersModule2 = serializersModule;
                    } else {
                        if (r3 != 1) {
                            if (r3 != 2) {
                                if (r3 != 3) {
                                    if (r3 != 4) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    e = ziplineLoader$loadFromLocal$13.L$8;
                                    ?? r1 = ziplineLoader$loadFromLocal$13.L$7;
                                    EventListener eventListener3 = ziplineLoader$loadFromLocal$13.L$5;
                                    str2 = ziplineLoader$loadFromLocal$13.L$1;
                                    SafeTrace.throwOnFailure(obj);
                                    str3 = r1;
                                    eventListener = eventListener3;
                                    eventListener.applicationLoadFailed(str2, e, str3);
                                    return null;
                                }
                                long j5 = ziplineLoader$loadFromLocal$13.J$0;
                                ?? r12 = ziplineLoader$loadFromLocal$13.L$7;
                                loadedManifest2 = ziplineLoader$loadFromLocal$13.L$6;
                                EventListener eventListener4 = ziplineLoader$loadFromLocal$13.L$5;
                                String str8 = ziplineLoader$loadFromLocal$13.L$1;
                                producerScope2 = ziplineLoader$loadFromLocal$13.L$0;
                                SafeTrace.throwOnFailure(obj);
                                str7 = r12;
                                r3 = j5;
                                r5 = eventListener4;
                                r6 = str8;
                                return loadedManifest2.manifest;
                            }
                            long j6 = ziplineLoader$loadFromLocal$13.J$0;
                            ?? r13 = ziplineLoader$loadFromLocal$13.L$7;
                            loadedManifest2 = ziplineLoader$loadFromLocal$13.L$6;
                            EventListener eventListener5 = ziplineLoader$loadFromLocal$13.L$5;
                            String str9 = ziplineLoader$loadFromLocal$13.L$1;
                            producerScope2 = ziplineLoader$loadFromLocal$13.L$0;
                            SafeTrace.throwOnFailure(obj);
                            str6 = r13;
                            j4 = j6;
                            eventListener2 = eventListener5;
                            str5 = str9;
                            Zipline zipline = (Zipline) obj;
                            eventListener2.applicationLoadSuccess(str5, loadedManifest2.manifest, zipline, str6);
                            success = new LoadResult.Success(zipline, loadedManifest2.manifest, loadedManifest2.freshAtEpochMs);
                            ziplineLoader$loadFromLocal$13.L$0 = producerScope2;
                            ziplineLoader$loadFromLocal$13.L$1 = str5;
                            ziplineLoader$loadFromLocal$13.L$2 = null;
                            ziplineLoader$loadFromLocal$13.L$3 = null;
                            ziplineLoader$loadFromLocal$13.L$4 = null;
                            ziplineLoader$loadFromLocal$13.L$5 = eventListener2;
                            ziplineLoader$loadFromLocal$13.L$6 = loadedManifest2;
                            ziplineLoader$loadFromLocal$13.L$7 = str6;
                            ziplineLoader$loadFromLocal$13.L$8 = null;
                            ziplineLoader$loadFromLocal$13.J$0 = j4;
                            ziplineLoader$loadFromLocal$13.label = 3;
                            str7 = str6;
                            r3 = j4;
                            r5 = eventListener2;
                            r6 = str5;
                            if (((ProducerCoroutine) producerScope2)._channel.send(success, ziplineLoader$loadFromLocal$13) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return loadedManifest2.manifest;
                        }
                        j3 = ziplineLoader$loadFromLocal$13.J$0;
                        EventListener eventListener6 = ziplineLoader$loadFromLocal$13.L$5;
                        RealImageLoader$execute$2 realImageLoader$execute$23 = ziplineLoader$loadFromLocal$13.L$4;
                        serializersModule2 = ziplineLoader$loadFromLocal$13.L$3;
                        realConnectionPool2 = ziplineLoader$loadFromLocal$13.L$2;
                        String str10 = ziplineLoader$loadFromLocal$13.L$1;
                        producerScope3 = ziplineLoader$loadFromLocal$13.L$0;
                        SafeTrace.throwOnFailure(obj);
                        realImageLoader$execute$22 = realImageLoader$execute$23;
                        ziplineLoader$loadFromLocal$12 = ziplineLoader$loadFromLocal$13;
                        loadCachedOrEmbeddedManifest = obj;
                        create = eventListener6;
                        str4 = str10;
                    }
                    loadedManifest = (LoadedManifest) loadCachedOrEmbeddedManifest;
                    if (loadedManifest != null) {
                        return null;
                    }
                    ZiplineManifest ziplineManifest = loadedManifest.manifest;
                    ?? applicationLoadStart = create.applicationLoadStart(str4);
                    SerializersModule serializersModule3 = serializersModule2;
                    long j7 = loadedManifest.freshAtEpochMs;
                    realConnectionPool2.getClass();
                    ziplineManifest.getClass();
                    String str11 = (String) ziplineManifest.metadata.get("committed_at");
                    if (str11 == null || str11.compareTo((String) ((Lazy) realConnectionPool2.connections).getValue()) < 0 || j7 < ((Number) ((Function0) realConnectionPool2.cleanupQueue).invoke()).longValue() - Duration.m4167getInWholeMillisecondsimpl(realConnectionPool2.keepAliveDurationNs)) {
                        create.applicationLoadSkippedNotFresh(applicationLoadStart, str4);
                        return null;
                    }
                    try {
                        create.manifestReady(ziplineManifest, str4);
                        ziplineLoader$loadFromLocal$12.L$0 = producerScope3;
                        ziplineLoader$loadFromLocal$12.L$1 = str4;
                        ziplineLoader$loadFromLocal$12.L$2 = null;
                        ziplineLoader$loadFromLocal$12.L$3 = null;
                        ziplineLoader$loadFromLocal$12.L$4 = null;
                        ziplineLoader$loadFromLocal$12.L$5 = create;
                        ziplineLoader$loadFromLocal$12.L$6 = loadedManifest;
                        ziplineLoader$loadFromLocal$12.L$7 = applicationLoadStart;
                        ziplineLoader$loadFromLocal$12.J$0 = j3;
                        ziplineLoader$loadFromLocal$12.label = 2;
                        ziplineLoader$loadFromLocal$13 = ziplineLoader$loadFromLocal$12;
                        j2 = j3;
                        try {
                            Object loadFromManifest$zipline_loader_release = ziplineLoader.loadFromManifest$zipline_loader_release(str4, create, loadedManifest, serializersModule3, j2, realImageLoader$execute$22, ziplineLoader$loadFromLocal$13);
                            if (loadFromManifest$zipline_loader_release == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            EventListener eventListener7 = create;
                            obj = loadFromManifest$zipline_loader_release;
                            loadedManifest2 = loadedManifest;
                            j4 = j2;
                            eventListener2 = eventListener7;
                            str5 = str4;
                            str6 = applicationLoadStart;
                            producerScope2 = producerScope3;
                            Zipline zipline2 = (Zipline) obj;
                            eventListener2.applicationLoadSuccess(str5, loadedManifest2.manifest, zipline2, str6);
                            success = new LoadResult.Success(zipline2, loadedManifest2.manifest, loadedManifest2.freshAtEpochMs);
                            ziplineLoader$loadFromLocal$13.L$0 = producerScope2;
                            ziplineLoader$loadFromLocal$13.L$1 = str5;
                            ziplineLoader$loadFromLocal$13.L$2 = null;
                            ziplineLoader$loadFromLocal$13.L$3 = null;
                            ziplineLoader$loadFromLocal$13.L$4 = null;
                            ziplineLoader$loadFromLocal$13.L$5 = eventListener2;
                            ziplineLoader$loadFromLocal$13.L$6 = loadedManifest2;
                            ziplineLoader$loadFromLocal$13.L$7 = str6;
                            ziplineLoader$loadFromLocal$13.L$8 = null;
                            ziplineLoader$loadFromLocal$13.J$0 = j4;
                            ziplineLoader$loadFromLocal$13.label = 3;
                            str7 = str6;
                            r3 = j4;
                            r5 = eventListener2;
                            r6 = str5;
                            if (((ProducerCoroutine) producerScope2)._channel.send(success, ziplineLoader$loadFromLocal$13) == coroutineSingletons) {
                            }
                            return loadedManifest2.manifest;
                        } catch (Exception e) {
                            e = e;
                            str2 = str4;
                            EventListener eventListener8 = create;
                            String str12 = applicationLoadStart;
                            producerScope2 = producerScope3;
                            LoadResult.Failure failure = new LoadResult.Failure(e);
                            ziplineLoader$loadFromLocal$13.L$0 = null;
                            ziplineLoader$loadFromLocal$13.L$1 = str2;
                            ziplineLoader$loadFromLocal$13.L$2 = null;
                            ziplineLoader$loadFromLocal$13.L$3 = null;
                            ziplineLoader$loadFromLocal$13.L$4 = null;
                            ziplineLoader$loadFromLocal$13.L$5 = eventListener8;
                            ziplineLoader$loadFromLocal$13.L$6 = null;
                            ziplineLoader$loadFromLocal$13.L$7 = str12;
                            ziplineLoader$loadFromLocal$13.L$8 = e;
                            ziplineLoader$loadFromLocal$13.J$0 = j2;
                            ziplineLoader$loadFromLocal$13.label = 4;
                            str3 = str12;
                            eventListener = eventListener8;
                            if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromLocal$13) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            eventListener.applicationLoadFailed(str2, e, str3);
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ziplineLoader$loadFromLocal$13 = ziplineLoader$loadFromLocal$12;
                        j2 = j3;
                    }
                }
            }
            if (r3 != 0) {
            }
            loadedManifest = (LoadedManifest) loadCachedOrEmbeddedManifest;
            if (loadedManifest != null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        ziplineLoader$loadFromLocal$1 = new ZiplineLoader$loadFromLocal$1(ziplineLoader, continuationImpl);
        ZiplineLoader$loadFromLocal$1 ziplineLoader$loadFromLocal$132 = ziplineLoader$loadFromLocal$1;
        Object obj2 = ziplineLoader$loadFromLocal$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r3 = ziplineLoader$loadFromLocal$132.label;
        ?? r62 = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|159|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0061, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0062, code lost:
    
        r13 = r1;
        r1 = r11;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:158:0x0062 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb A[Catch: Exception -> 0x0225, CancellationException -> 0x02fe, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x02fe, blocks: (B:21:0x005b, B:23:0x0261, B:40:0x0079, B:42:0x0228, B:45:0x0233, B:47:0x024f, B:59:0x0094, B:62:0x01c6, B:64:0x01cb, B:67:0x01f9, B:68:0x01fc, B:75:0x0203, B:80:0x00a8, B:83:0x0178, B:90:0x00bf, B:93:0x0115, B:95:0x0117, B:99:0x0121, B:102:0x014d, B:104:0x0152, B:110:0x0159, B:119:0x0185, B:122:0x01b1, B:142:0x00e6, B:145:0x00fe), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r10v2, types: [app.cash.zipline.EventListener] */
    /* JADX WARN: Type inference failed for: r18v0, types: [app.cash.zipline.loader.ZiplineLoader] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [app.cash.zipline.EventListener$Factory] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28, types: [app.cash.zipline.loader.internal.fetcher.LoadedManifest] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadFromNetwork(ZiplineLoader ziplineLoader, ProducerScope producerScope, ZiplineManifest ziplineManifest, long j, String str, String str2, SerializersModule serializersModule, RealImageLoader$execute$2 realImageLoader$execute$2, ContinuationImpl continuationImpl) {
        ZiplineLoader$loadFromNetwork$1 ziplineLoader$loadFromNetwork$1;
        int i;
        long j2;
        Exception exc;
        ProducerScope producerScope2;
        EventListener eventListener;
        Object obj;
        LoadedManifest loadedManifest;
        String str3;
        Object withContext;
        ProducerScope producerScope3;
        long j3;
        LoadResult.Failure failure;
        Object obj2;
        ZiplineManifest ziplineManifest2;
        SerializersModule serializersModule2;
        Object fetchManifestFromNetwork;
        String str4;
        RealImageLoader$execute$2 realImageLoader$execute$22;
        ProducerScope producerScope4;
        EventListener eventListener2;
        String str5;
        EventListener eventListener3;
        Object obj3;
        String str6;
        EventListener eventListener4;
        String str7;
        LoadedManifest loadedManifest2;
        ?? r7;
        EventListener eventListener5;
        LoadedManifest loadedManifest3;
        String str8;
        String str9;
        LoadedManifest loadedManifest4;
        String str10;
        LoadedManifest loadedManifest5;
        long j4;
        EventListener eventListener6;
        EventListener eventListener7;
        Zipline zipline;
        LoadedManifest loadedManifest6;
        String str11;
        Zipline zipline2;
        long j5;
        ProducerScope producerScope5;
        String str12;
        EventListener eventListener8;
        LoadedManifest loadedManifest7;
        LoadResult.Success success;
        long j6;
        EventListener eventListener9;
        LoadedManifest loadedManifest8;
        EventListener eventListener10;
        ?? r1 = str;
        FsCachingFetcher fsCachingFetcher = (FsCachingFetcher) ziplineLoader.cachingFetcher;
        try {
            if (continuationImpl instanceof ZiplineLoader$loadFromNetwork$1) {
                ziplineLoader$loadFromNetwork$1 = (ZiplineLoader$loadFromNetwork$1) continuationImpl;
                int i2 = ziplineLoader$loadFromNetwork$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineLoader$loadFromNetwork$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj4 = ziplineLoader$loadFromNetwork$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineLoader$loadFromNetwork$1.label;
                    switch (i) {
                        case 0:
                            SafeTrace.throwOnFailure(obj4);
                            ?? create = ((EventListener.Factory) ziplineLoader.eventListenerFactory).create(r1, str2);
                            obj = create.applicationLoadStart(r1);
                            try {
                                ziplineLoader$loadFromNetwork$1.L$0 = producerScope;
                                ziplineManifest2 = ziplineManifest;
                                ziplineLoader$loadFromNetwork$1.L$1 = ziplineManifest2;
                                ziplineLoader$loadFromNetwork$1.L$2 = r1;
                                ziplineLoader$loadFromNetwork$1.L$3 = str2;
                                serializersModule2 = serializersModule;
                                ziplineLoader$loadFromNetwork$1.L$4 = serializersModule2;
                                ziplineLoader$loadFromNetwork$1.L$5 = realImageLoader$execute$2;
                                ziplineLoader$loadFromNetwork$1.L$6 = create;
                                ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                j2 = j;
                                try {
                                    ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                    ziplineLoader$loadFromNetwork$1.label = 1;
                                    fetchManifestFromNetwork = ziplineLoader.fetchManifestFromNetwork(r1, create, str2, ziplineLoader$loadFromNetwork$1);
                                } catch (Exception e) {
                                    e = e;
                                    exc = e;
                                    producerScope2 = producerScope;
                                    str5 = r1;
                                    eventListener2 = create;
                                    loadedManifest = 0;
                                    str3 = str5;
                                    eventListener = eventListener2;
                                    eventListener.applicationLoadFailed(str3, exc, obj);
                                    if (loadedManifest != 0) {
                                    }
                                    failure = new LoadResult.Failure(exc);
                                    obj2 = null;
                                    ziplineLoader$loadFromNetwork$1.L$0 = null;
                                    ziplineLoader$loadFromNetwork$1.L$1 = null;
                                    ziplineLoader$loadFromNetwork$1.L$2 = null;
                                    ziplineLoader$loadFromNetwork$1.L$3 = null;
                                    ziplineLoader$loadFromNetwork$1.L$4 = null;
                                    ziplineLoader$loadFromNetwork$1.L$5 = null;
                                    ziplineLoader$loadFromNetwork$1.L$6 = null;
                                    ziplineLoader$loadFromNetwork$1.L$7 = null;
                                    ziplineLoader$loadFromNetwork$1.L$8 = null;
                                    ziplineLoader$loadFromNetwork$1.L$9 = null;
                                    ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                    ziplineLoader$loadFromNetwork$1.label = 7;
                                    if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                    }
                                    return obj2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                j2 = j;
                            }
                            if (fetchManifestFromNetwork == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str4 = str2;
                            realImageLoader$execute$22 = realImageLoader$execute$2;
                            producerScope4 = producerScope;
                            obj4 = fetchManifestFromNetwork;
                            str7 = r1;
                            eventListener4 = create;
                            try {
                                loadedManifest2 = (LoadedManifest) obj4;
                                try {
                                    r7 = Intrinsics.areEqual(loadedManifest2.manifest, ziplineManifest2);
                                    try {
                                        if (r7 != 0) {
                                            eventListener4.manifestReady(loadedManifest2.manifest, str7);
                                            ziplineLoader$loadFromNetwork$1.L$0 = producerScope4;
                                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                                            ziplineLoader$loadFromNetwork$1.L$2 = str7;
                                            ziplineLoader$loadFromNetwork$1.L$3 = str4;
                                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                                            ziplineLoader$loadFromNetwork$1.L$6 = eventListener4;
                                            ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                            ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest2;
                                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                            ziplineLoader$loadFromNetwork$1.label = 3;
                                            String str13 = str7;
                                            ZiplineLoader$loadFromNetwork$1 ziplineLoader$loadFromNetwork$12 = ziplineLoader$loadFromNetwork$1;
                                            EventListener eventListener11 = eventListener4;
                                            long j7 = j2;
                                            try {
                                                obj4 = ziplineLoader.loadFromManifest$zipline_loader_release(str13, eventListener11, loadedManifest2, serializersModule2, j7, realImageLoader$execute$22, ziplineLoader$loadFromNetwork$12);
                                                eventListener5 = eventListener11;
                                                loadedManifest3 = loadedManifest2;
                                                j2 = j7;
                                                ziplineLoader$loadFromNetwork$1 = ziplineLoader$loadFromNetwork$12;
                                                if (obj4 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                str8 = str13;
                                                str9 = str4;
                                                producerScope2 = producerScope4;
                                                try {
                                                    zipline = (Zipline) obj4;
                                                    loadedManifest7 = loadedManifest3;
                                                    eventListener8 = eventListener5;
                                                    if (fsCachingFetcher != null) {
                                                        ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                                                        ziplineLoader$loadFromNetwork$1.L$1 = null;
                                                        ziplineLoader$loadFromNetwork$1.L$2 = str8;
                                                        ziplineLoader$loadFromNetwork$1.L$3 = str9;
                                                        ziplineLoader$loadFromNetwork$1.L$4 = null;
                                                        ziplineLoader$loadFromNetwork$1.L$5 = null;
                                                        ziplineLoader$loadFromNetwork$1.L$6 = eventListener5;
                                                        ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                                        ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest3;
                                                        ziplineLoader$loadFromNetwork$1.L$9 = zipline;
                                                        ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                                        ziplineLoader$loadFromNetwork$1.label = 4;
                                                        LoadedManifest loadedManifest9 = loadedManifest3;
                                                        String str14 = str8;
                                                        long j8 = j2;
                                                        try {
                                                            Object withContext2 = JobKt.withContext(fsCachingFetcher.cacheDispatcher, new FsCachingFetcher$pin$2(fsCachingFetcher, str14, loadedManifest9, j8, null, 0), ziplineLoader$loadFromNetwork$1);
                                                            if (withContext2 != coroutineSingletons) {
                                                                withContext2 = Unit.INSTANCE;
                                                            }
                                                            if (withContext2 == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                            String str15 = str8;
                                                            str11 = str9;
                                                            zipline2 = zipline;
                                                            j5 = j2;
                                                            producerScope5 = producerScope2;
                                                            str12 = str15;
                                                            loadedManifest8 = loadedManifest3;
                                                            eventListener9 = eventListener5;
                                                            long j9 = j5;
                                                            zipline = zipline2;
                                                            str9 = str11;
                                                            str8 = str12;
                                                            producerScope2 = producerScope5;
                                                            j2 = j9;
                                                            loadedManifest7 = loadedManifest8;
                                                            eventListener8 = eventListener9;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            fsCachingFetcher = fsCachingFetcher;
                                                            str8 = str14;
                                                            loadedManifest6 = loadedManifest9;
                                                            j2 = j8;
                                                            eventListener10 = eventListener5;
                                                            exc = e;
                                                            str3 = str8;
                                                            loadedManifest = loadedManifest6;
                                                            eventListener = eventListener10;
                                                            eventListener.applicationLoadFailed(str3, exc, obj);
                                                            if (loadedManifest != 0) {
                                                            }
                                                            failure = new LoadResult.Failure(exc);
                                                            obj2 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$0 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$2 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$3 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$6 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$7 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$8 = null;
                                                            ziplineLoader$loadFromNetwork$1.L$9 = null;
                                                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                                            ziplineLoader$loadFromNetwork$1.label = 7;
                                                            if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                                            }
                                                            return obj2;
                                                        }
                                                    }
                                                    eventListener8.applicationLoadSuccess(str8, loadedManifest7.manifest, zipline, obj);
                                                    j6 = j2;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    loadedManifest6 = loadedManifest3;
                                                    eventListener10 = eventListener5;
                                                }
                                                try {
                                                    success = new LoadResult.Success(zipline, loadedManifest7.manifest, loadedManifest7.freshAtEpochMs);
                                                    ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                                                    ziplineLoader$loadFromNetwork$1.L$1 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$2 = str8;
                                                    ziplineLoader$loadFromNetwork$1.L$3 = str9;
                                                    ziplineLoader$loadFromNetwork$1.L$4 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$5 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$6 = eventListener8;
                                                    ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                                    ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest7;
                                                    ziplineLoader$loadFromNetwork$1.L$9 = null;
                                                    j2 = j6;
                                                    ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                                    ziplineLoader$loadFromNetwork$1.label = 5;
                                                    loadedManifest3 = loadedManifest7;
                                                    eventListener5 = eventListener8;
                                                    if (((ProducerCoroutine) producerScope2)._channel.send(success, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                    return loadedManifest3.manifest;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    j2 = j6;
                                                    loadedManifest6 = loadedManifest7;
                                                    eventListener10 = eventListener8;
                                                    exc = e;
                                                    str3 = str8;
                                                    loadedManifest = loadedManifest6;
                                                    eventListener = eventListener10;
                                                    eventListener.applicationLoadFailed(str3, exc, obj);
                                                    if (loadedManifest != 0) {
                                                    }
                                                    failure = new LoadResult.Failure(exc);
                                                    obj2 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$0 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$1 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$2 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$3 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$4 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$5 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$6 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$7 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$8 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$9 = null;
                                                    ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                                    ziplineLoader$loadFromNetwork$1.label = 7;
                                                    if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                                    }
                                                    return obj2;
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                str7 = str13;
                                                eventListener4 = eventListener11;
                                                r7 = loadedManifest2;
                                                j2 = j7;
                                                ziplineLoader$loadFromNetwork$1 = ziplineLoader$loadFromNetwork$12;
                                            }
                                        } else {
                                            if (fsCachingFetcher == null) {
                                                loadedManifest4 = loadedManifest2;
                                                str8 = str7;
                                                str10 = str4;
                                                producerScope2 = producerScope4;
                                                eventListener6 = eventListener4;
                                                eventListener6.applicationLoadSkipped(str8, str10, obj);
                                                return null;
                                            }
                                            ziplineLoader$loadFromNetwork$1.L$0 = producerScope4;
                                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                                            ziplineLoader$loadFromNetwork$1.L$2 = str7;
                                            ziplineLoader$loadFromNetwork$1.L$3 = str4;
                                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                                            ziplineLoader$loadFromNetwork$1.L$6 = eventListener4;
                                            ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                            ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest2;
                                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                            ziplineLoader$loadFromNetwork$1.label = 2;
                                            String str16 = str7;
                                            long j10 = j2;
                                            try {
                                                loadedManifest5 = loadedManifest2;
                                                Object withContext3 = JobKt.withContext(fsCachingFetcher.cacheDispatcher, new FsCachingFetcher$pin$2(fsCachingFetcher, str16, loadedManifest2, j10, null, 2), ziplineLoader$loadFromNetwork$1);
                                                if (withContext3 != coroutineSingletons) {
                                                    withContext3 = Unit.INSTANCE;
                                                }
                                                if (withContext3 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                str8 = str7;
                                                str10 = str4;
                                                j4 = j2;
                                                producerScope2 = producerScope4;
                                                eventListener7 = eventListener4;
                                                j2 = j4;
                                                loadedManifest4 = loadedManifest5;
                                                eventListener6 = eventListener7;
                                                try {
                                                    eventListener6.applicationLoadSkipped(str8, str10, obj);
                                                    return null;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    loadedManifest6 = loadedManifest4;
                                                    eventListener10 = eventListener6;
                                                    exc = e;
                                                    str3 = str8;
                                                    loadedManifest = loadedManifest6;
                                                    eventListener = eventListener10;
                                                    eventListener.applicationLoadFailed(str3, exc, obj);
                                                    if (loadedManifest != 0) {
                                                    }
                                                    failure = new LoadResult.Failure(exc);
                                                    obj2 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$0 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$1 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$2 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$3 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$4 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$5 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$6 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$7 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$8 = null;
                                                    ziplineLoader$loadFromNetwork$1.L$9 = null;
                                                    ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                                    ziplineLoader$loadFromNetwork$1.label = 7;
                                                    if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                                    }
                                                    return obj2;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                fsCachingFetcher = fsCachingFetcher;
                                                str7 = str16;
                                                r7 = loadedManifest2;
                                                j2 = j10;
                                            }
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    r7 = loadedManifest2;
                                }
                                exc = e;
                                str6 = str7;
                                obj3 = r7;
                                eventListener3 = eventListener4;
                            } catch (Exception e11) {
                                exc = e11;
                                producerScope2 = producerScope4;
                                str5 = str7;
                                eventListener2 = eventListener4;
                                loadedManifest = 0;
                                str3 = str5;
                                eventListener = eventListener2;
                                eventListener.applicationLoadFailed(str3, exc, obj);
                                if (loadedManifest != 0) {
                                }
                                failure = new LoadResult.Failure(exc);
                                obj2 = null;
                                ziplineLoader$loadFromNetwork$1.L$0 = null;
                                ziplineLoader$loadFromNetwork$1.L$1 = null;
                                ziplineLoader$loadFromNetwork$1.L$2 = null;
                                ziplineLoader$loadFromNetwork$1.L$3 = null;
                                ziplineLoader$loadFromNetwork$1.L$4 = null;
                                ziplineLoader$loadFromNetwork$1.L$5 = null;
                                ziplineLoader$loadFromNetwork$1.L$6 = null;
                                ziplineLoader$loadFromNetwork$1.L$7 = null;
                                ziplineLoader$loadFromNetwork$1.L$8 = null;
                                ziplineLoader$loadFromNetwork$1.L$9 = null;
                                ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                ziplineLoader$loadFromNetwork$1.label = 7;
                                if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                }
                                return obj2;
                            }
                            producerScope2 = producerScope4;
                            str3 = str6;
                            loadedManifest = obj3;
                            eventListener = eventListener3;
                            eventListener.applicationLoadFailed(str3, exc, obj);
                            if (loadedManifest != 0 && fsCachingFetcher != null) {
                                ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                                ziplineLoader$loadFromNetwork$1.L$1 = null;
                                ziplineLoader$loadFromNetwork$1.L$2 = null;
                                ziplineLoader$loadFromNetwork$1.L$3 = null;
                                ziplineLoader$loadFromNetwork$1.L$4 = null;
                                ziplineLoader$loadFromNetwork$1.L$5 = null;
                                ziplineLoader$loadFromNetwork$1.L$6 = null;
                                ziplineLoader$loadFromNetwork$1.L$7 = null;
                                ziplineLoader$loadFromNetwork$1.L$8 = null;
                                ziplineLoader$loadFromNetwork$1.L$9 = exc;
                                ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                ziplineLoader$loadFromNetwork$1.label = 6;
                                withContext = JobKt.withContext(fsCachingFetcher.cacheDispatcher, new FsCachingFetcher$pin$2(fsCachingFetcher, str3, loadedManifest, j2, null, 1), ziplineLoader$loadFromNetwork$1);
                                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    withContext = Unit.INSTANCE;
                                }
                                if (withContext != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                producerScope3 = producerScope2;
                                j3 = j2;
                                j2 = j3;
                                producerScope2 = producerScope3;
                            }
                            failure = new LoadResult.Failure(exc);
                            obj2 = null;
                            ziplineLoader$loadFromNetwork$1.L$0 = null;
                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                            ziplineLoader$loadFromNetwork$1.L$2 = null;
                            ziplineLoader$loadFromNetwork$1.L$3 = null;
                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                            ziplineLoader$loadFromNetwork$1.L$6 = null;
                            ziplineLoader$loadFromNetwork$1.L$7 = null;
                            ziplineLoader$loadFromNetwork$1.L$8 = null;
                            ziplineLoader$loadFromNetwork$1.L$9 = null;
                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                            ziplineLoader$loadFromNetwork$1.label = 7;
                            if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return obj2;
                        case 1:
                            long j11 = ziplineLoader$loadFromNetwork$1.J$0;
                            obj = ziplineLoader$loadFromNetwork$1.L$7;
                            EventListener eventListener12 = ziplineLoader$loadFromNetwork$1.L$6;
                            RealImageLoader$execute$2 realImageLoader$execute$23 = ziplineLoader$loadFromNetwork$1.L$5;
                            serializersModule2 = ziplineLoader$loadFromNetwork$1.L$4;
                            str4 = ziplineLoader$loadFromNetwork$1.L$3;
                            String str17 = ziplineLoader$loadFromNetwork$1.L$2;
                            ZiplineManifest ziplineManifest3 = ziplineLoader$loadFromNetwork$1.L$1;
                            producerScope4 = ziplineLoader$loadFromNetwork$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj4);
                                realImageLoader$execute$22 = realImageLoader$execute$23;
                                str7 = str17;
                                ziplineManifest2 = ziplineManifest3;
                                j2 = j11;
                                eventListener4 = eventListener12;
                                loadedManifest2 = (LoadedManifest) obj4;
                                r7 = Intrinsics.areEqual(loadedManifest2.manifest, ziplineManifest2);
                                if (r7 != 0) {
                                }
                                exc = e;
                                str6 = str7;
                                obj3 = r7;
                                eventListener3 = eventListener4;
                            } catch (Exception e12) {
                                str6 = str17;
                                j2 = j11;
                                exc = e12;
                                obj3 = null;
                                eventListener3 = eventListener12;
                            }
                            producerScope2 = producerScope4;
                            str3 = str6;
                            loadedManifest = obj3;
                            eventListener = eventListener3;
                            eventListener.applicationLoadFailed(str3, exc, obj);
                            if (loadedManifest != 0) {
                                ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                                ziplineLoader$loadFromNetwork$1.L$1 = null;
                                ziplineLoader$loadFromNetwork$1.L$2 = null;
                                ziplineLoader$loadFromNetwork$1.L$3 = null;
                                ziplineLoader$loadFromNetwork$1.L$4 = null;
                                ziplineLoader$loadFromNetwork$1.L$5 = null;
                                ziplineLoader$loadFromNetwork$1.L$6 = null;
                                ziplineLoader$loadFromNetwork$1.L$7 = null;
                                ziplineLoader$loadFromNetwork$1.L$8 = null;
                                ziplineLoader$loadFromNetwork$1.L$9 = exc;
                                ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                ziplineLoader$loadFromNetwork$1.label = 6;
                                withContext = JobKt.withContext(fsCachingFetcher.cacheDispatcher, new FsCachingFetcher$pin$2(fsCachingFetcher, str3, loadedManifest, j2, null, 1), ziplineLoader$loadFromNetwork$1);
                                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                }
                                if (withContext != coroutineSingletons) {
                                }
                            }
                            failure = new LoadResult.Failure(exc);
                            obj2 = null;
                            ziplineLoader$loadFromNetwork$1.L$0 = null;
                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                            ziplineLoader$loadFromNetwork$1.L$2 = null;
                            ziplineLoader$loadFromNetwork$1.L$3 = null;
                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                            ziplineLoader$loadFromNetwork$1.L$6 = null;
                            ziplineLoader$loadFromNetwork$1.L$7 = null;
                            ziplineLoader$loadFromNetwork$1.L$8 = null;
                            ziplineLoader$loadFromNetwork$1.L$9 = null;
                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                            ziplineLoader$loadFromNetwork$1.label = 7;
                            if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                            }
                            return obj2;
                        case 2:
                            j4 = ziplineLoader$loadFromNetwork$1.J$0;
                            LoadedManifest loadedManifest10 = ziplineLoader$loadFromNetwork$1.L$8;
                            obj = ziplineLoader$loadFromNetwork$1.L$7;
                            EventListener eventListener13 = ziplineLoader$loadFromNetwork$1.L$6;
                            str10 = ziplineLoader$loadFromNetwork$1.L$3;
                            str8 = ziplineLoader$loadFromNetwork$1.L$2;
                            producerScope2 = ziplineLoader$loadFromNetwork$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            loadedManifest5 = loadedManifest10;
                            eventListener7 = eventListener13;
                            j2 = j4;
                            loadedManifest4 = loadedManifest5;
                            eventListener6 = eventListener7;
                            eventListener6.applicationLoadSkipped(str8, str10, obj);
                            return null;
                        case 3:
                            long j12 = ziplineLoader$loadFromNetwork$1.J$0;
                            LoadedManifest loadedManifest11 = ziplineLoader$loadFromNetwork$1.L$8;
                            obj = ziplineLoader$loadFromNetwork$1.L$7;
                            EventListener eventListener14 = ziplineLoader$loadFromNetwork$1.L$6;
                            str9 = ziplineLoader$loadFromNetwork$1.L$3;
                            str8 = ziplineLoader$loadFromNetwork$1.L$2;
                            producerScope2 = ziplineLoader$loadFromNetwork$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            j2 = j12;
                            loadedManifest3 = loadedManifest11;
                            eventListener5 = eventListener14;
                            zipline = (Zipline) obj4;
                            loadedManifest7 = loadedManifest3;
                            eventListener8 = eventListener5;
                            if (fsCachingFetcher != null) {
                            }
                            eventListener8.applicationLoadSuccess(str8, loadedManifest7.manifest, zipline, obj);
                            j6 = j2;
                            success = new LoadResult.Success(zipline, loadedManifest7.manifest, loadedManifest7.freshAtEpochMs);
                            ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                            ziplineLoader$loadFromNetwork$1.L$2 = str8;
                            ziplineLoader$loadFromNetwork$1.L$3 = str9;
                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                            ziplineLoader$loadFromNetwork$1.L$6 = eventListener8;
                            ziplineLoader$loadFromNetwork$1.L$7 = obj;
                            ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest7;
                            ziplineLoader$loadFromNetwork$1.L$9 = null;
                            j2 = j6;
                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                            ziplineLoader$loadFromNetwork$1.label = 5;
                            loadedManifest3 = loadedManifest7;
                            eventListener5 = eventListener8;
                            if (((ProducerCoroutine) producerScope2)._channel.send(success, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                            }
                            return loadedManifest3.manifest;
                        case 4:
                            j5 = ziplineLoader$loadFromNetwork$1.J$0;
                            zipline2 = (Zipline) ziplineLoader$loadFromNetwork$1.L$9;
                            ?? r72 = ziplineLoader$loadFromNetwork$1.L$8;
                            obj = ziplineLoader$loadFromNetwork$1.L$7;
                            EventListener eventListener15 = ziplineLoader$loadFromNetwork$1.L$6;
                            str11 = ziplineLoader$loadFromNetwork$1.L$3;
                            str12 = ziplineLoader$loadFromNetwork$1.L$2;
                            producerScope5 = ziplineLoader$loadFromNetwork$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj4);
                                loadedManifest8 = r72;
                                eventListener9 = eventListener15;
                                long j92 = j5;
                                zipline = zipline2;
                                str9 = str11;
                                str8 = str12;
                                producerScope2 = producerScope5;
                                j2 = j92;
                                loadedManifest7 = loadedManifest8;
                                eventListener8 = eventListener9;
                                eventListener8.applicationLoadSuccess(str8, loadedManifest7.manifest, zipline, obj);
                                j6 = j2;
                                success = new LoadResult.Success(zipline, loadedManifest7.manifest, loadedManifest7.freshAtEpochMs);
                                ziplineLoader$loadFromNetwork$1.L$0 = producerScope2;
                                ziplineLoader$loadFromNetwork$1.L$1 = null;
                                ziplineLoader$loadFromNetwork$1.L$2 = str8;
                                ziplineLoader$loadFromNetwork$1.L$3 = str9;
                                ziplineLoader$loadFromNetwork$1.L$4 = null;
                                ziplineLoader$loadFromNetwork$1.L$5 = null;
                                ziplineLoader$loadFromNetwork$1.L$6 = eventListener8;
                                ziplineLoader$loadFromNetwork$1.L$7 = obj;
                                ziplineLoader$loadFromNetwork$1.L$8 = loadedManifest7;
                                ziplineLoader$loadFromNetwork$1.L$9 = null;
                                j2 = j6;
                                ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                ziplineLoader$loadFromNetwork$1.label = 5;
                                loadedManifest3 = loadedManifest7;
                                eventListener5 = eventListener8;
                                if (((ProducerCoroutine) producerScope2)._channel.send(success, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                }
                                return loadedManifest3.manifest;
                            } catch (Exception e13) {
                                e = e13;
                                String str18 = str12;
                                producerScope2 = producerScope5;
                                j2 = j5;
                                int i3 = r72;
                                exc = e;
                                str3 = str18;
                                loadedManifest = i3;
                                eventListener = eventListener15;
                                eventListener.applicationLoadFailed(str3, exc, obj);
                                if (loadedManifest != 0) {
                                }
                                failure = new LoadResult.Failure(exc);
                                obj2 = null;
                                ziplineLoader$loadFromNetwork$1.L$0 = null;
                                ziplineLoader$loadFromNetwork$1.L$1 = null;
                                ziplineLoader$loadFromNetwork$1.L$2 = null;
                                ziplineLoader$loadFromNetwork$1.L$3 = null;
                                ziplineLoader$loadFromNetwork$1.L$4 = null;
                                ziplineLoader$loadFromNetwork$1.L$5 = null;
                                ziplineLoader$loadFromNetwork$1.L$6 = null;
                                ziplineLoader$loadFromNetwork$1.L$7 = null;
                                ziplineLoader$loadFromNetwork$1.L$8 = null;
                                ziplineLoader$loadFromNetwork$1.L$9 = null;
                                ziplineLoader$loadFromNetwork$1.J$0 = j2;
                                ziplineLoader$loadFromNetwork$1.label = 7;
                                if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                                }
                                return obj2;
                            }
                        case 5:
                            long j13 = ziplineLoader$loadFromNetwork$1.J$0;
                            LoadedManifest loadedManifest12 = ziplineLoader$loadFromNetwork$1.L$8;
                            obj = ziplineLoader$loadFromNetwork$1.L$7;
                            EventListener eventListener16 = ziplineLoader$loadFromNetwork$1.L$6;
                            str8 = ziplineLoader$loadFromNetwork$1.L$2;
                            producerScope2 = ziplineLoader$loadFromNetwork$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            j2 = j13;
                            loadedManifest3 = loadedManifest12;
                            eventListener5 = eventListener16;
                            return loadedManifest3.manifest;
                        case 6:
                            j3 = ziplineLoader$loadFromNetwork$1.J$0;
                            exc = (Exception) ziplineLoader$loadFromNetwork$1.L$9;
                            producerScope3 = ziplineLoader$loadFromNetwork$1.L$0;
                            SafeTrace.throwOnFailure(obj4);
                            j2 = j3;
                            producerScope2 = producerScope3;
                            failure = new LoadResult.Failure(exc);
                            obj2 = null;
                            ziplineLoader$loadFromNetwork$1.L$0 = null;
                            ziplineLoader$loadFromNetwork$1.L$1 = null;
                            ziplineLoader$loadFromNetwork$1.L$2 = null;
                            ziplineLoader$loadFromNetwork$1.L$3 = null;
                            ziplineLoader$loadFromNetwork$1.L$4 = null;
                            ziplineLoader$loadFromNetwork$1.L$5 = null;
                            ziplineLoader$loadFromNetwork$1.L$6 = null;
                            ziplineLoader$loadFromNetwork$1.L$7 = null;
                            ziplineLoader$loadFromNetwork$1.L$8 = null;
                            ziplineLoader$loadFromNetwork$1.L$9 = null;
                            ziplineLoader$loadFromNetwork$1.J$0 = j2;
                            ziplineLoader$loadFromNetwork$1.label = 7;
                            if (((ProducerCoroutine) producerScope2)._channel.send(failure, ziplineLoader$loadFromNetwork$1) == coroutineSingletons) {
                            }
                            return obj2;
                        case 7:
                            SafeTrace.throwOnFailure(obj4);
                            obj2 = null;
                            return obj2;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (CancellationException e14) {
            throw e14;
        }
        ziplineLoader$loadFromNetwork$1 = new ZiplineLoader$loadFromNetwork$1(ziplineLoader, continuationImpl);
        Object obj42 = ziplineLoader$loadFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineLoader$loadFromNetwork$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [app.cash.zipline.EventListener$Factory] */
    /* JADX WARN: Type inference failed for: r12v3, types: [okio.FileSystem] */
    public static ZiplineLoader copy$default(ZiplineLoader ziplineLoader, Path path, AssetFileSystem assetFileSystem, ZiplineCache ziplineCache, CoroutineDispatcher coroutineDispatcher, CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0, int i) {
        if ((i & 1) != 0) {
            path = (Path) ziplineLoader.embeddedDir;
        }
        Path path2 = path;
        AssetFileSystem assetFileSystem2 = assetFileSystem;
        if ((i & 2) != 0) {
            assetFileSystem2 = (FileSystem) ziplineLoader.embeddedFileSystem;
        }
        AssetFileSystem assetFileSystem3 = assetFileSystem2;
        if ((i & 4) != 0) {
            ziplineCache = (ZiplineCache) ziplineLoader.cache;
        }
        return new ZiplineLoader((CoroutineDispatcher) ziplineLoader.dispatcher, (ManifestVerifier) ziplineLoader.manifestVerifier, (HttpFetcher) ziplineLoader.httpFetcher, (i & 16) != 0 ? (EventListener.Factory) ziplineLoader.eventListenerFactory : captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0, (Function0) ziplineLoader.nowEpochMs, path2, assetFileSystem3, ziplineCache, (i & 8) != 0 ? (CoroutineDispatcher) ziplineLoader.cacheDispatcher : coroutineDispatcher);
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean z) {
        Object obj;
        ConsentAwareStorage$Batch consentAwareStorage$Batch;
        synchronized (((LinkedHashSet) this.cachingFetcher)) {
            try {
                Iterator it = ((LinkedHashSet) this.cachingFetcher).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String absolutePath = ((ConsentAwareStorage$Batch) obj).file.getAbsolutePath();
                    absolutePath.getClass();
                    if (absolutePath.equals(batchId.id)) {
                        break;
                    }
                }
                consentAwareStorage$Batch = (ConsentAwareStorage$Batch) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (consentAwareStorage$Batch == null) {
            return;
        }
        if (z) {
            File file = consentAwareStorage$Batch.file;
            File file2 = consentAwareStorage$Batch.metaFile;
            InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
            InternalLogger internalLogger = (InternalLogger) this.embeddedDir;
            long lengthSafe = zzhk.lengthSafe(file, internalLogger);
            FileMover fileMover = (FileMover) this.nowEpochMs;
            if (fileMover.delete(file)) {
                ((MetricsDispatcher) this.cache).sendBatchDeletedMetric(file, removalReason, ((BatchFileOrchestrator) this.cacheDispatcher).pendingFiles.decrementAndGet());
                if (removalReason.equals(new RemovalReason.IntakeCode(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE)) && lengthSafe > 0) {
                    HurlStack hurlStack = (HurlStack) this.embeddedFetcher;
                    String str = (String) this.concurrentDownloadsSemaphore;
                    hurlStack.getClass();
                    str.getClass();
                    hurlStack.sendBenchmarkUploads(str, "android.benchmark.bytes_deleted");
                }
            } else {
                DBUtil.log$default((InternalLogger) this.embeddedDir, 4, target, new FileMover$delete$1(file, 2), null, false, 56);
            }
            if (file2 != null && zzhk.existsSafe(file2, internalLogger) && !fileMover.delete(file2)) {
                DBUtil.log$default((InternalLogger) this.embeddedDir, 4, target, new FileMover$delete$1(file2, 3), null, false, 56);
            }
        }
        synchronized (((LinkedHashSet) this.cachingFetcher)) {
            ((LinkedHashSet) this.cachingFetcher).remove(consentAwareStorage$Batch);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchManifestFromNetwork(String str, EventListener eventListener, String str2, ContinuationImpl continuationImpl) {
        ZiplineLoader$fetchManifestFromNetwork$1 ziplineLoader$fetchManifestFromNetwork$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        EventListener eventListener2;
        Semaphore semaphore;
        Throwable th;
        Object obj2;
        String str3;
        EventListener eventListener3;
        String verify;
        try {
            if (continuationImpl instanceof ZiplineLoader$fetchManifestFromNetwork$1) {
                ziplineLoader$fetchManifestFromNetwork$1 = (ZiplineLoader$fetchManifestFromNetwork$1) continuationImpl;
                int i3 = ziplineLoader$fetchManifestFromNetwork$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineLoader$fetchManifestFromNetwork$1.label = i3 - PKIFailureInfo.systemUnavail;
                    ZiplineLoader$fetchManifestFromNetwork$1 ziplineLoader$fetchManifestFromNetwork$12 = ziplineLoader$fetchManifestFromNetwork$1;
                    obj = ziplineLoader$fetchManifestFromNetwork$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineLoader$fetchManifestFromNetwork$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        SemaphoreImpl semaphoreImpl = (SemaphoreImpl) this.concurrentDownloadsSemaphore;
                        ziplineLoader$fetchManifestFromNetwork$12.L$0 = str;
                        ziplineLoader$fetchManifestFromNetwork$12.L$1 = eventListener;
                        ziplineLoader$fetchManifestFromNetwork$12.L$2 = str2;
                        ziplineLoader$fetchManifestFromNetwork$12.L$3 = semaphoreImpl;
                        i2 = 0;
                        ziplineLoader$fetchManifestFromNetwork$12.I$0 = 0;
                        ziplineLoader$fetchManifestFromNetwork$12.label = 1;
                        if (semaphoreImpl.acquire(ziplineLoader$fetchManifestFromNetwork$12) != coroutineSingletons) {
                            eventListener2 = eventListener;
                            semaphore = semaphoreImpl;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = ziplineLoader$fetchManifestFromNetwork$12.L$3;
                        eventListener3 = ziplineLoader$fetchManifestFromNetwork$12.L$1;
                        str3 = ziplineLoader$fetchManifestFromNetwork$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            LoadedManifest loadedManifest = (LoadedManifest) obj;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            ManifestVerifier manifestVerifier = (ManifestVerifier) this.manifestVerifier;
                            ByteString byteString = loadedManifest.manifestBytes;
                            ZiplineManifest ziplineManifest = loadedManifest.manifest;
                            verify = manifestVerifier.verify(byteString, ziplineManifest);
                            if (verify != null) {
                                eventListener3.manifestVerified(str3, ziplineManifest, verify);
                            }
                            return loadedManifest;
                        } catch (Throwable th2) {
                            th = th2;
                            ((SemaphoreAndMutexImpl) obj2).release();
                            throw th;
                        }
                    }
                    int i4 = ziplineLoader$fetchManifestFromNetwork$12.I$0;
                    semaphore = ziplineLoader$fetchManifestFromNetwork$12.L$3;
                    str2 = ziplineLoader$fetchManifestFromNetwork$12.L$2;
                    EventListener eventListener4 = ziplineLoader$fetchManifestFromNetwork$12.L$1;
                    String str4 = ziplineLoader$fetchManifestFromNetwork$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i4;
                    str = str4;
                    eventListener2 = eventListener4;
                    String str5 = str2;
                    HttpFetcher httpFetcher = (HttpFetcher) this.httpFetcher;
                    long longValue = ((Number) ((Function0) this.nowEpochMs).invoke()).longValue();
                    ziplineLoader$fetchManifestFromNetwork$12.L$0 = str;
                    ziplineLoader$fetchManifestFromNetwork$12.L$1 = eventListener2;
                    ziplineLoader$fetchManifestFromNetwork$12.L$2 = str5;
                    ziplineLoader$fetchManifestFromNetwork$12.L$3 = semaphore;
                    ziplineLoader$fetchManifestFromNetwork$12.I$0 = i2;
                    ziplineLoader$fetchManifestFromNetwork$12.label = 2;
                    String str6 = str;
                    obj = httpFetcher.fetchManifest(str6, eventListener2, str5, longValue, ziplineLoader$fetchManifestFromNetwork$12);
                    if (obj != coroutineSingletons) {
                        obj2 = semaphore;
                        str3 = str6;
                        eventListener3 = eventListener2;
                        LoadedManifest loadedManifest2 = (LoadedManifest) obj;
                        ((SemaphoreAndMutexImpl) obj2).release();
                        ManifestVerifier manifestVerifier2 = (ManifestVerifier) this.manifestVerifier;
                        ByteString byteString2 = loadedManifest2.manifestBytes;
                        ZiplineManifest ziplineManifest2 = loadedManifest2.manifest;
                        verify = manifestVerifier2.verify(byteString2, ziplineManifest2);
                        if (verify != null) {
                        }
                        return loadedManifest2;
                    }
                    return coroutineSingletons;
                }
            }
            HttpFetcher httpFetcher2 = (HttpFetcher) this.httpFetcher;
            long longValue2 = ((Number) ((Function0) this.nowEpochMs).invoke()).longValue();
            ziplineLoader$fetchManifestFromNetwork$12.L$0 = str;
            ziplineLoader$fetchManifestFromNetwork$12.L$1 = eventListener2;
            ziplineLoader$fetchManifestFromNetwork$12.L$2 = str5;
            ziplineLoader$fetchManifestFromNetwork$12.L$3 = semaphore;
            ziplineLoader$fetchManifestFromNetwork$12.I$0 = i2;
            ziplineLoader$fetchManifestFromNetwork$12.label = 2;
            String str62 = str;
            obj = httpFetcher2.fetchManifest(str62, eventListener2, str5, longValue2, ziplineLoader$fetchManifestFromNetwork$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            obj2 = semaphore;
            ((SemaphoreAndMutexImpl) obj2).release();
            throw th;
        }
        ziplineLoader$fetchManifestFromNetwork$1 = new ZiplineLoader$fetchManifestFromNetwork$1(this, continuationImpl);
        ZiplineLoader$fetchManifestFromNetwork$1 ziplineLoader$fetchManifestFromNetwork$122 = ziplineLoader$fetchManifestFromNetwork$1;
        obj = ziplineLoader$fetchManifestFromNetwork$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineLoader$fetchManifestFromNetwork$122.label;
        if (i != 0) {
        }
        String str52 = str2;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public Function1 getEventWriteScope(DatadogContext datadogContext) {
        BatchFileOrchestrator batchFileOrchestrator;
        datadogContext.getClass();
        int ordinal = datadogContext.trackingConsent.ordinal();
        if (ordinal != 0) {
            batchFileOrchestrator = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                batchFileOrchestrator = (BatchFileOrchestrator) this.manifestVerifier;
            }
        } else {
            batchFileOrchestrator = (BatchFileOrchestrator) this.cacheDispatcher;
        }
        BatchFileOrchestrator batchFileOrchestrator2 = batchFileOrchestrator;
        Object obj = this.concurrentDownloadsSemaphore;
        Object obj2 = this.dispatcher;
        Object obj3 = this.embeddedDir;
        Object obj4 = this.moduleFetchers;
        if (batchFileOrchestrator2 == null) {
            return new AsyncEventWriteScope((BackPressureExecutorService) obj2, new NoOpEventBatchWriter(), obj4, (String) obj, (InternalLogger) obj3);
        }
        return new AsyncEventWriteScope((BackPressureExecutorService) obj2, new FileEventBatchWriter(batchFileOrchestrator2, (PlainBatchFileReaderWriter) this.httpFetcher, (PlainFileReaderWriter) this.eventListenerFactory, (FilePersistenceConfig) this.embeddedFileSystem, this, (InternalLogger) obj3), obj4, (String) obj, (InternalLogger) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.compare(r2.freshAtEpochMs, r8.freshAtEpochMs) >= 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadCachedOrEmbeddedManifest(String str, EventListener eventListener, long j, ContinuationImpl continuationImpl) {
        ZiplineLoader$loadCachedOrEmbeddedManifest$1 ziplineLoader$loadCachedOrEmbeddedManifest$1;
        int i;
        EventListener eventListener2;
        String str2;
        LoadedManifest loadedManifest;
        Object obj;
        FsEmbeddedFetcher fsEmbeddedFetcher;
        LoadedManifest loadedManifest2;
        String verify;
        if (continuationImpl instanceof ZiplineLoader$loadCachedOrEmbeddedManifest$1) {
            ziplineLoader$loadCachedOrEmbeddedManifest$1 = (ZiplineLoader$loadCachedOrEmbeddedManifest$1) continuationImpl;
            int i2 = ziplineLoader$loadCachedOrEmbeddedManifest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                ziplineLoader$loadCachedOrEmbeddedManifest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = ziplineLoader$loadCachedOrEmbeddedManifest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ziplineLoader$loadCachedOrEmbeddedManifest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FsCachingFetcher fsCachingFetcher = (FsCachingFetcher) this.cachingFetcher;
                    if (fsCachingFetcher == null) {
                        eventListener2 = eventListener;
                        str2 = str;
                        loadedManifest = null;
                        fsEmbeddedFetcher = (FsEmbeddedFetcher) this.embeddedFetcher;
                        if (fsEmbeddedFetcher != null) {
                            str2.getClass();
                            ByteString fetchByteString = fsEmbeddedFetcher.fetchByteString(fsEmbeddedFetcher.embeddedDir.resolve(str2.concat(".manifest.zipline.json")));
                            if (fetchByteString != null) {
                                ZiplineManifest.Companion companion = ZiplineManifest.Companion;
                                String utf8 = fetchByteString.utf8();
                                companion.getClass();
                                ZiplineManifest decodeJson = ZiplineManifest.Companion.decodeJson(utf8);
                                Long l = decodeJson.unsigned.freshAtEpochMs;
                                if (l == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("freshAtEpochMs is required for loaded manifests, but was null");
                                    return null;
                                }
                                loadedManifest2 = new LoadedManifest(fetchByteString, decodeJson, l.longValue());
                                if (loadedManifest != null || loadedManifest2 == null) {
                                    if (loadedManifest == null) {
                                        if (loadedManifest2 == null) {
                                            return null;
                                        }
                                        loadedManifest = loadedManifest2;
                                    }
                                    ZiplineManifest ziplineManifest = loadedManifest.manifest;
                                    verify = ((ManifestVerifier) this.manifestVerifier).verify(loadedManifest.manifestBytes, ziplineManifest);
                                    if (verify != null) {
                                        eventListener2.manifestVerified(str2, ziplineManifest, verify);
                                    }
                                    return loadedManifest;
                                }
                            }
                        }
                        loadedManifest2 = null;
                        if (loadedManifest != null) {
                        }
                        if (loadedManifest == null) {
                        }
                        ZiplineManifest ziplineManifest2 = loadedManifest.manifest;
                        verify = ((ManifestVerifier) this.manifestVerifier).verify(loadedManifest.manifestBytes, ziplineManifest2);
                        if (verify != null) {
                        }
                        return loadedManifest;
                    }
                    ziplineLoader$loadCachedOrEmbeddedManifest$1.L$0 = str;
                    eventListener2 = eventListener;
                    ziplineLoader$loadCachedOrEmbeddedManifest$1.L$1 = eventListener2;
                    ziplineLoader$loadCachedOrEmbeddedManifest$1.label = 1;
                    Object withContext = JobKt.withContext(fsCachingFetcher.cacheDispatcher, new FlashControl$applyScreenFlash$2(fsCachingFetcher, str, j, (Continuation) null, 2), ziplineLoader$loadCachedOrEmbeddedManifest$1);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = withContext;
                    str2 = str;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    EventListener eventListener3 = ziplineLoader$loadCachedOrEmbeddedManifest$1.L$1;
                    str2 = ziplineLoader$loadCachedOrEmbeddedManifest$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    eventListener2 = eventListener3;
                }
                loadedManifest = (LoadedManifest) obj;
                fsEmbeddedFetcher = (FsEmbeddedFetcher) this.embeddedFetcher;
                if (fsEmbeddedFetcher != null) {
                }
                loadedManifest2 = null;
                if (loadedManifest != null) {
                }
                if (loadedManifest == null) {
                }
                ZiplineManifest ziplineManifest22 = loadedManifest.manifest;
                verify = ((ManifestVerifier) this.manifestVerifier).verify(loadedManifest.manifestBytes, ziplineManifest22);
                if (verify != null) {
                }
                return loadedManifest;
            }
        }
        ziplineLoader$loadCachedOrEmbeddedManifest$1 = new ZiplineLoader$loadCachedOrEmbeddedManifest$1(this, continuationImpl);
        Object obj22 = ziplineLoader$loadCachedOrEmbeddedManifest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineLoader$loadCachedOrEmbeddedManifest$1.label;
        if (i != 0) {
        }
        loadedManifest = (LoadedManifest) obj;
        fsEmbeddedFetcher = (FsEmbeddedFetcher) this.embeddedFetcher;
        if (fsEmbeddedFetcher != null) {
        }
        loadedManifest2 = null;
        if (loadedManifest != null) {
        }
        if (loadedManifest == null) {
        }
        ZiplineManifest ziplineManifest222 = loadedManifest.manifest;
        verify = ((ManifestVerifier) this.manifestVerifier).verify(loadedManifest.manifestBytes, ziplineManifest222);
        if (verify != null) {
        }
        return loadedManifest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #1 {all -> 0x0134, blocks: (B:17:0x0105, B:19:0x010b), top: B:16:0x0105, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [app.cash.zipline.loader.ZiplineLoader] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [app.cash.zipline.Zipline, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [app.cash.zipline.EventListener] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadFromManifest$zipline_loader_release(String str, EventListener eventListener, LoadedManifest loadedManifest, SerializersModule serializersModule, long j, Function2 function2, ContinuationImpl continuationImpl) {
        ZiplineLoader$loadFromManifest$1 ziplineLoader$loadFromManifest$1;
        ZiplineLoader$loadFromManifest$1 ziplineLoader$loadFromManifest$12;
        Object obj;
        int i;
        Zipline zipline;
        Zipline zipline2;
        Function2 function22;
        String str2;
        EventListener eventListener2;
        LoadedManifest loadedManifest2;
        long j2;
        Object initializerStart;
        Object obj2;
        EventListener eventListener3;
        String str3;
        Zipline zipline3;
        LoadedManifest loadedManifest3;
        ?? r4;
        String str4;
        ?? r2 = this;
        try {
            try {
                if (continuationImpl instanceof ZiplineLoader$loadFromManifest$1) {
                    ziplineLoader$loadFromManifest$1 = (ZiplineLoader$loadFromManifest$1) continuationImpl;
                    int i2 = ziplineLoader$loadFromManifest$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        ziplineLoader$loadFromManifest$1.label = i2 - PKIFailureInfo.systemUnavail;
                        ziplineLoader$loadFromManifest$12 = ziplineLoader$loadFromManifest$1;
                        Object obj3 = ziplineLoader$loadFromManifest$12.result;
                        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = ziplineLoader$loadFromManifest$12.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) r2.dispatcher;
                            coroutineDispatcher.getClass();
                            serializersModule.getClass();
                            eventListener.getClass();
                            long createContext = QuickJs.createContext();
                            if (createContext == 0) {
                                throw new OutOfMemoryError("Cannot create QuickJs instance");
                            }
                            QuickJs quickJs = new QuickJs();
                            quickJs.context = createContext;
                            quickJs.setMemoryLimit();
                            quickJs.setGcThreshold();
                            quickJs.setMaxStackSize(524288L);
                            quickJs.setMaxStackSize(6291456L);
                            quickJs.evaluate("\n  (function initJsModuleApi() {\n    // Maps module IDs (like './kotlin-kotlin-stdlib-js-ir' or 'export') to their exports.\n    var idToExports = {};\n\n    // Retrieve an exported module. This doesn't need to be a global function, but it's convenient\n    // for callers who want access to a library they just loaded.\n    globalThis.require = function(id) {\n      var resolved = idToExports[id];\n      if (!resolved) {\n        throw Error('\"' + id + '\" not found in ' + JSON.stringify(Object.keys(idToExports)));\n      }\n      return resolved;\n    }\n\n    // This function accepts three arguments:\n    //   id: an optional string. If absent, use the currently-loading file name.\n    //   dependencies: an optional array of IDs, empty if absent.\n    //   factory: user code that consumes and exports dependencies. The arguments to this function\n    //      correspond 1:1 with the dependency names.\n    globalThis.define = function() {\n      var args = Array.from(arguments);\n      var factory = args.pop();\n      var dependencies = (args.length > 0) ? args.pop() : [];\n      var id = (args.length > 0) ? args.pop() : globalThis.app_cash_zipline_currentModuleId;\n      var exports = {};\n\n      var args = dependencies.map(dependency => {\n        if (dependency == 'exports') {\n          return exports;\n        } else if (dependency == 'require') {\n          return globalThis.require;\n        } else {\n          return globalThis.require(dependency);\n        }\n      });\n\n      var result = factory(...args);\n\n      idToExports[id] = result || exports;\n    };\n\n    // By convention, we set 'define.amd' to an object to declare we confirm to the AMD spec.\n    globalThis.define.amd = {};\n  })();\n  ", "define.js");
                            zipline2 = new Zipline(quickJs, serializersModule, coroutineDispatcher, JobKt.CoroutineScope(coroutineDispatcher), eventListener);
                            eventListener.ziplineCreated(zipline2);
                            try {
                                EventListenerAdapter eventListenerAdapter = new EventListenerAdapter(zipline2, eventListener);
                                ziplineLoader$loadFromManifest$12.L$0 = str;
                                ziplineLoader$loadFromManifest$12.L$1 = eventListener;
                                ziplineLoader$loadFromManifest$12.L$2 = loadedManifest;
                                function22 = function2;
                                ziplineLoader$loadFromManifest$12.L$4 = function22;
                                ziplineLoader$loadFromManifest$12.L$5 = zipline2;
                                ziplineLoader$loadFromManifest$12.J$0 = j;
                                ziplineLoader$loadFromManifest$12.label = 1;
                                Object coroutineScope = JobKt.coroutineScope(new ZiplineLoader$receive$2(loadedManifest, r2, str, eventListener, eventListenerAdapter, j, null), ziplineLoader$loadFromManifest$12);
                                if (coroutineScope != obj) {
                                    coroutineScope = Unit.INSTANCE;
                                }
                                if (coroutineScope == obj) {
                                    return obj;
                                }
                                str2 = str;
                                eventListener2 = eventListener;
                                loadedManifest2 = loadedManifest;
                                j2 = j;
                            } catch (Exception e) {
                                e = e;
                                zipline = zipline2;
                                zipline.close();
                                throw e;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj2 = ziplineLoader$loadFromManifest$12.L$6;
                                zipline3 = ziplineLoader$loadFromManifest$12.L$5;
                                loadedManifest3 = ziplineLoader$loadFromManifest$12.L$2;
                                eventListener3 = ziplineLoader$loadFromManifest$12.L$1;
                                str3 = ziplineLoader$loadFromManifest$12.L$0;
                                try {
                                    SafeTrace.throwOnFailure(obj3);
                                    r2 = zipline3;
                                    r4 = eventListener3;
                                    r4.initializerEnd(r2, str3, obj2);
                                    Object mainFunctionStart = r4.mainFunctionStart(r2, str3);
                                    try {
                                        ZiplineManifest ziplineManifest = loadedManifest3.manifest;
                                        str4 = ziplineManifest.mainFunction;
                                        if (str4 != null) {
                                            QuickJs quickJs2 = r2.quickJs;
                                            String str5 = ziplineManifest.mainModuleId;
                                            str5.getClass();
                                            quickJs2.evaluate("require('" + str5 + "')." + str4 + "()", "RunApplication.kt");
                                        }
                                        return r2;
                                    } finally {
                                        r4.mainFunctionEnd(r2, str3, mainFunctionStart);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    eventListener3.initializerEnd(zipline3, str3, obj2);
                                    throw th;
                                }
                            }
                            j2 = ziplineLoader$loadFromManifest$12.J$0;
                            zipline = ziplineLoader$loadFromManifest$12.L$5;
                            Function2 function23 = ziplineLoader$loadFromManifest$12.L$4;
                            loadedManifest2 = ziplineLoader$loadFromManifest$12.L$2;
                            eventListener2 = ziplineLoader$loadFromManifest$12.L$1;
                            str2 = ziplineLoader$loadFromManifest$12.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj3);
                                zipline2 = zipline;
                                function22 = function23;
                            } catch (Exception e2) {
                                e = e2;
                                zipline.close();
                                throw e;
                            }
                        }
                        initializerStart = eventListener2.initializerStart(zipline2, str2);
                        ziplineLoader$loadFromManifest$12.L$0 = str2;
                        ziplineLoader$loadFromManifest$12.L$1 = eventListener2;
                        ziplineLoader$loadFromManifest$12.L$2 = loadedManifest2;
                        ziplineLoader$loadFromManifest$12.L$4 = null;
                        ziplineLoader$loadFromManifest$12.L$5 = zipline2;
                        ziplineLoader$loadFromManifest$12.L$6 = initializerStart;
                        ziplineLoader$loadFromManifest$12.J$0 = j2;
                        ziplineLoader$loadFromManifest$12.label = 2;
                        if (function22.invoke(zipline2, ziplineLoader$loadFromManifest$12) != obj) {
                            obj2 = initializerStart;
                            loadedManifest3 = loadedManifest2;
                            r4 = eventListener2;
                            str3 = str2;
                            r2 = zipline2;
                            r4.initializerEnd(r2, str3, obj2);
                            Object mainFunctionStart2 = r4.mainFunctionStart(r2, str3);
                            ZiplineManifest ziplineManifest2 = loadedManifest3.manifest;
                            str4 = ziplineManifest2.mainFunction;
                            if (str4 != null) {
                            }
                            return r2;
                        }
                        return obj;
                    }
                }
                ziplineLoader$loadFromManifest$12.L$0 = str2;
                ziplineLoader$loadFromManifest$12.L$1 = eventListener2;
                ziplineLoader$loadFromManifest$12.L$2 = loadedManifest2;
                ziplineLoader$loadFromManifest$12.L$4 = null;
                ziplineLoader$loadFromManifest$12.L$5 = zipline2;
                ziplineLoader$loadFromManifest$12.L$6 = initializerStart;
                ziplineLoader$loadFromManifest$12.J$0 = j2;
                ziplineLoader$loadFromManifest$12.label = 2;
                if (function22.invoke(zipline2, ziplineLoader$loadFromManifest$12) != obj) {
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                obj2 = initializerStart;
                eventListener3 = eventListener2;
                str3 = str2;
                zipline3 = zipline2;
                eventListener3.initializerEnd(zipline3, str3, obj2);
                throw th;
            }
            if (i != 0) {
            }
            initializerStart = eventListener2.initializerStart(zipline2, str2);
        } catch (Exception e3) {
            e = e3;
            zipline = r2;
            zipline.close();
            throw e;
        }
        ziplineLoader$loadFromManifest$1 = new ZiplineLoader$loadFromManifest$1(r2, continuationImpl);
        ziplineLoader$loadFromManifest$12 = ziplineLoader$loadFromManifest$1;
        Object obj32 = ziplineLoader$loadFromManifest$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineLoader$loadFromManifest$12.label;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public BatchData readNextBatch() {
        synchronized (((LinkedHashSet) this.cachingFetcher)) {
            try {
                BatchFileOrchestrator batchFileOrchestrator = (BatchFileOrchestrator) this.cacheDispatcher;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.cachingFetcher;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ConsentAwareStorage$Batch) it.next()).file);
                }
                File readableFile = batchFileOrchestrator.getReadableFile(CollectionsKt.toSet(arrayList));
                byte[] bArr = null;
                if (readableFile == null) {
                    return null;
                }
                File metadataFile = ((BatchFileOrchestrator) this.cacheDispatcher).getMetadataFile(readableFile);
                ((LinkedHashSet) this.cachingFetcher).add(new ConsentAwareStorage$Batch(readableFile, metadataFile));
                String absolutePath = readableFile.getAbsolutePath();
                absolutePath.getClass();
                BatchId batchId = new BatchId(absolutePath);
                if (metadataFile != null && zzhk.existsSafe(metadataFile, (InternalLogger) this.embeddedDir)) {
                    bArr = (byte[]) ((PlainFileReaderWriter) this.eventListenerFactory).readData(metadataFile);
                }
                return new BatchData(batchId, ((PlainBatchFileReaderWriter) this.httpFetcher).readData(readableFile), bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ZiplineLoader(BackPressureExecutorService backPressureExecutorService, BatchFileOrchestrator batchFileOrchestrator, BatchFileOrchestrator batchFileOrchestrator2, PlainBatchFileReaderWriter plainBatchFileReaderWriter, PlainFileReaderWriter plainFileReaderWriter, FileMover fileMover, InternalLogger internalLogger, FilePersistenceConfig filePersistenceConfig, MetricsDispatcher metricsDispatcher, String str) {
        HurlStack hurlStack = new HurlStack(24);
        internalLogger.getClass();
        metricsDispatcher.getClass();
        this.dispatcher = backPressureExecutorService;
        this.cacheDispatcher = batchFileOrchestrator;
        this.manifestVerifier = batchFileOrchestrator2;
        this.httpFetcher = plainBatchFileReaderWriter;
        this.eventListenerFactory = plainFileReaderWriter;
        this.nowEpochMs = fileMover;
        this.embeddedDir = internalLogger;
        this.embeddedFileSystem = filePersistenceConfig;
        this.cache = metricsDispatcher;
        this.concurrentDownloadsSemaphore = str;
        this.embeddedFetcher = hurlStack;
        this.cachingFetcher = new LinkedHashSet();
        this.moduleFetchers = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [app.cash.zipline.loader.internal.fetcher.FsCachingFetcher] */
    public ZiplineLoader(CoroutineDispatcher coroutineDispatcher, ManifestVerifier manifestVerifier, HttpFetcher httpFetcher, EventListener.Factory factory, Function0 function0, Path path, FileSystem fileSystem, ZiplineCache ziplineCache, CoroutineDispatcher coroutineDispatcher2) {
        coroutineDispatcher.getClass();
        manifestVerifier.getClass();
        httpFetcher.getClass();
        factory.getClass();
        function0.getClass();
        this.dispatcher = coroutineDispatcher;
        this.manifestVerifier = manifestVerifier;
        this.httpFetcher = httpFetcher;
        this.eventListenerFactory = factory;
        this.nowEpochMs = function0;
        this.embeddedDir = path;
        this.embeddedFileSystem = fileSystem;
        this.cache = ziplineCache;
        this.cacheDispatcher = coroutineDispatcher2;
        int i = SemaphoreKt.MAX_SPIN_CYCLES;
        this.concurrentDownloadsSemaphore = new SemaphoreImpl(3);
        HttpFetcher httpFetcher2 = null;
        FsEmbeddedFetcher fsEmbeddedFetcher = (fileSystem == null || path == null) ? null : new FsEmbeddedFetcher(fileSystem, path);
        this.embeddedFetcher = fsEmbeddedFetcher;
        if (ziplineCache != null) {
            httpFetcher2 = new FsCachingFetcher(ziplineCache, coroutineDispatcher2 != null ? coroutineDispatcher2 : coroutineDispatcher, httpFetcher);
        }
        this.cachingFetcher = httpFetcher2;
        this.moduleFetchers = ArraysKt___ArraysKt.filterNotNull(new Fetcher[]{fsEmbeddedFetcher, httpFetcher2 != null ? httpFetcher2 : httpFetcher});
    }

    public /* synthetic */ ZiplineLoader(Provider provider, Provider provider2, Provider provider3, Factory factory, Factory factory2, Factory factory3, Provider provider4, Factory factory4, Factory factory5, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.dispatcher = provider;
        this.cacheDispatcher = provider2;
        this.manifestVerifier = provider3;
        this.httpFetcher = factory;
        this.eventListenerFactory = factory2;
        this.nowEpochMs = factory3;
        this.embeddedDir = provider4;
        this.embeddedFileSystem = factory4;
        this.cache = factory5;
        this.concurrentDownloadsSemaphore = provider5;
        this.embeddedFetcher = provider6;
        this.cachingFetcher = provider7;
        this.moduleFetchers = provider8;
    }
}
