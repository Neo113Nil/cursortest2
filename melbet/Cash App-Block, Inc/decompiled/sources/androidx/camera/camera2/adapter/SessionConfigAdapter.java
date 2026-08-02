package androidx.camera.camera2.adapter;

import android.media.MediaCodec;
import android.util.Log;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SessionConfigAdapter {
    public final Lazy deferrableSurfaces$delegate;
    public final boolean isPrimary;
    public final Lazy sessionConfig$delegate;
    public final Lazy surfaceToStreamUseCaseMap$delegate;
    public final Lazy surfaceToStreamUseHintMap$delegate;
    public final Collection useCases;
    public final Lazy validatingBuilder$delegate;

    public SessionConfigAdapter(Collection collection, boolean z) {
        collection.getClass();
        this.useCases = collection;
        this.isPrimary = z;
        final int i = 0;
        this.surfaceToStreamUseCaseMap$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ SessionConfigAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SessionConfigAdapter sessionConfigAdapter = this.f$0;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (UseCase useCase : sessionConfigAdapter.useCases) {
                            boolean z2 = sessionConfigAdapter.isPrimary;
                            useCase.getClass();
                            SessionConfig sessionConfig = z2 ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
                            sessionConfig.getClass();
                            arrayList.add(sessionConfig);
                            UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                            useCaseConfig.getClass();
                            arrayList2.add(useCaseConfig);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((SessionConfig) it.next()).mRepeatingCaptureConfig.mTemplateType == 5) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SessionConfig sessionConfig2 = (SessionConfig) it2.next();
                                if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option) && sessionConfig2.getSurfaces().size() != 1) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + sessionConfig2.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                        break;
                                    }
                                } else if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                    Iterator it3 = arrayList.iterator();
                                    int i3 = 0;
                                    while (it3.hasNext()) {
                                        SessionConfig sessionConfig3 = (SessionConfig) it3.next();
                                        if (((UseCaseConfig) arrayList3.get(i3)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                                            sessionConfig3.getSurfaces().getClass();
                                            TransactorKt.checkState("MeteringRepeating should contain a surface", !r9.isEmpty());
                                            linkedHashMap.put(sessionConfig3.getSurfaces().get(0), 1L);
                                        } else if (sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                            List surfaces = sessionConfig3.getSurfaces();
                                            surfaces.getClass();
                                            if (!surfaces.isEmpty()) {
                                                Object obj = sessionConfig3.getSurfaces().get(0);
                                                Object retrieveOption = sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.retrieveOption(autoValue_Config_Option);
                                                retrieveOption.getClass();
                                                linkedHashMap.put(obj, retrieveOption);
                                            }
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<UseCase> collection2 = sessionConfigAdapter.useCases;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (UseCase useCase2 : collection2) {
                            boolean z3 = sessionConfigAdapter.isPrimary;
                            useCase2.getClass();
                            SessionConfig sessionConfig4 = z3 ? useCase2.mAttachedSessionConfig : useCase2.mAttachedSecondarySessionConfig;
                            sessionConfig4.getClass();
                            arrayList4.add(sessionConfig4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            SessionConfig sessionConfig5 = (SessionConfig) it4.next();
                            List<DeferrableSurface> surfaces2 = sessionConfig5.getSurfaces();
                            CaptureConfig captureConfig = sessionConfig5.mRepeatingCaptureConfig;
                            for (DeferrableSurface deferrableSurface : surfaces2) {
                                OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
                                AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_HINT_OPTION;
                                if (!optionsBundle.mOptions.containsKey(autoValue_Config_Option2) || optionsBundle.retrieveOption(autoValue_Config_Option2) == null) {
                                    linkedHashMap2.put(deferrableSurface, Long.valueOf(Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
                                    retrieveOption2.getClass();
                                    linkedHashMap2.put(deferrableSurface, retrieveOption2);
                                }
                            }
                        }
                        break;
                    case 2:
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        for (UseCase useCase3 : sessionConfigAdapter.useCases) {
                            boolean z4 = sessionConfigAdapter.isPrimary;
                            useCase3.getClass();
                            SessionConfig sessionConfig6 = z4 ? useCase3.mAttachedSessionConfig : useCase3.mAttachedSecondarySessionConfig;
                            sessionConfig6.getClass();
                            validatingBuilder.add(sessionConfig6);
                        }
                        break;
                    case 3:
                        Lazy lazy = sessionConfigAdapter.validatingBuilder$delegate;
                        if (((SessionConfig.ValidatingBuilder) lazy.getValue()).isValid()) {
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                    default:
                        Lazy lazy2 = sessionConfigAdapter.sessionConfig$delegate;
                        if (((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid()) {
                            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = ((SessionConfig) lazy2.getValue()).mPostviewOutputConfig;
                            if (autoValue_SessionConfig_OutputConfig != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List surfaces3 = ((SessionConfig) lazy2.getValue()).getSurfaces();
                                surfaces3.getClass();
                                arrayList5.addAll(surfaces3);
                                DeferrableSurface deferrableSurface2 = autoValue_SessionConfig_OutputConfig.surface;
                                deferrableSurface2.getClass();
                                arrayList5.add(deferrableSurface2);
                                List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (unmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i2 = 1;
        this.surfaceToStreamUseHintMap$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ SessionConfigAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SessionConfigAdapter sessionConfigAdapter = this.f$0;
                switch (i22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (UseCase useCase : sessionConfigAdapter.useCases) {
                            boolean z2 = sessionConfigAdapter.isPrimary;
                            useCase.getClass();
                            SessionConfig sessionConfig = z2 ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
                            sessionConfig.getClass();
                            arrayList.add(sessionConfig);
                            UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                            useCaseConfig.getClass();
                            arrayList2.add(useCaseConfig);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((SessionConfig) it.next()).mRepeatingCaptureConfig.mTemplateType == 5) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SessionConfig sessionConfig2 = (SessionConfig) it2.next();
                                if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option) && sessionConfig2.getSurfaces().size() != 1) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + sessionConfig2.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                        break;
                                    }
                                } else if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                    Iterator it3 = arrayList.iterator();
                                    int i3 = 0;
                                    while (it3.hasNext()) {
                                        SessionConfig sessionConfig3 = (SessionConfig) it3.next();
                                        if (((UseCaseConfig) arrayList3.get(i3)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                                            sessionConfig3.getSurfaces().getClass();
                                            TransactorKt.checkState("MeteringRepeating should contain a surface", !r9.isEmpty());
                                            linkedHashMap.put(sessionConfig3.getSurfaces().get(0), 1L);
                                        } else if (sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                            List surfaces = sessionConfig3.getSurfaces();
                                            surfaces.getClass();
                                            if (!surfaces.isEmpty()) {
                                                Object obj = sessionConfig3.getSurfaces().get(0);
                                                Object retrieveOption = sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.retrieveOption(autoValue_Config_Option);
                                                retrieveOption.getClass();
                                                linkedHashMap.put(obj, retrieveOption);
                                            }
                                        }
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<UseCase> collection2 = sessionConfigAdapter.useCases;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (UseCase useCase2 : collection2) {
                            boolean z3 = sessionConfigAdapter.isPrimary;
                            useCase2.getClass();
                            SessionConfig sessionConfig4 = z3 ? useCase2.mAttachedSessionConfig : useCase2.mAttachedSecondarySessionConfig;
                            sessionConfig4.getClass();
                            arrayList4.add(sessionConfig4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            SessionConfig sessionConfig5 = (SessionConfig) it4.next();
                            List<DeferrableSurface> surfaces2 = sessionConfig5.getSurfaces();
                            CaptureConfig captureConfig = sessionConfig5.mRepeatingCaptureConfig;
                            for (DeferrableSurface deferrableSurface : surfaces2) {
                                OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
                                AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_HINT_OPTION;
                                if (!optionsBundle.mOptions.containsKey(autoValue_Config_Option2) || optionsBundle.retrieveOption(autoValue_Config_Option2) == null) {
                                    linkedHashMap2.put(deferrableSurface, Long.valueOf(Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
                                    retrieveOption2.getClass();
                                    linkedHashMap2.put(deferrableSurface, retrieveOption2);
                                }
                            }
                        }
                        break;
                    case 2:
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        for (UseCase useCase3 : sessionConfigAdapter.useCases) {
                            boolean z4 = sessionConfigAdapter.isPrimary;
                            useCase3.getClass();
                            SessionConfig sessionConfig6 = z4 ? useCase3.mAttachedSessionConfig : useCase3.mAttachedSecondarySessionConfig;
                            sessionConfig6.getClass();
                            validatingBuilder.add(sessionConfig6);
                        }
                        break;
                    case 3:
                        Lazy lazy = sessionConfigAdapter.validatingBuilder$delegate;
                        if (((SessionConfig.ValidatingBuilder) lazy.getValue()).isValid()) {
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                    default:
                        Lazy lazy2 = sessionConfigAdapter.sessionConfig$delegate;
                        if (((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid()) {
                            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = ((SessionConfig) lazy2.getValue()).mPostviewOutputConfig;
                            if (autoValue_SessionConfig_OutputConfig != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List surfaces3 = ((SessionConfig) lazy2.getValue()).getSurfaces();
                                surfaces3.getClass();
                                arrayList5.addAll(surfaces3);
                                DeferrableSurface deferrableSurface2 = autoValue_SessionConfig_OutputConfig.surface;
                                deferrableSurface2.getClass();
                                arrayList5.add(deferrableSurface2);
                                List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (unmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i3 = 2;
        this.validatingBuilder$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ SessionConfigAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SessionConfigAdapter sessionConfigAdapter = this.f$0;
                switch (i22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (UseCase useCase : sessionConfigAdapter.useCases) {
                            boolean z2 = sessionConfigAdapter.isPrimary;
                            useCase.getClass();
                            SessionConfig sessionConfig = z2 ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
                            sessionConfig.getClass();
                            arrayList.add(sessionConfig);
                            UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                            useCaseConfig.getClass();
                            arrayList2.add(useCaseConfig);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((SessionConfig) it.next()).mRepeatingCaptureConfig.mTemplateType == 5) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SessionConfig sessionConfig2 = (SessionConfig) it2.next();
                                if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option) && sessionConfig2.getSurfaces().size() != 1) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + sessionConfig2.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                        break;
                                    }
                                } else if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                    Iterator it3 = arrayList.iterator();
                                    int i32 = 0;
                                    while (it3.hasNext()) {
                                        SessionConfig sessionConfig3 = (SessionConfig) it3.next();
                                        if (((UseCaseConfig) arrayList3.get(i32)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                                            sessionConfig3.getSurfaces().getClass();
                                            TransactorKt.checkState("MeteringRepeating should contain a surface", !r9.isEmpty());
                                            linkedHashMap.put(sessionConfig3.getSurfaces().get(0), 1L);
                                        } else if (sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                            List surfaces = sessionConfig3.getSurfaces();
                                            surfaces.getClass();
                                            if (!surfaces.isEmpty()) {
                                                Object obj = sessionConfig3.getSurfaces().get(0);
                                                Object retrieveOption = sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.retrieveOption(autoValue_Config_Option);
                                                retrieveOption.getClass();
                                                linkedHashMap.put(obj, retrieveOption);
                                            }
                                        }
                                        i32++;
                                    }
                                }
                            }
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<UseCase> collection2 = sessionConfigAdapter.useCases;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (UseCase useCase2 : collection2) {
                            boolean z3 = sessionConfigAdapter.isPrimary;
                            useCase2.getClass();
                            SessionConfig sessionConfig4 = z3 ? useCase2.mAttachedSessionConfig : useCase2.mAttachedSecondarySessionConfig;
                            sessionConfig4.getClass();
                            arrayList4.add(sessionConfig4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            SessionConfig sessionConfig5 = (SessionConfig) it4.next();
                            List<DeferrableSurface> surfaces2 = sessionConfig5.getSurfaces();
                            CaptureConfig captureConfig = sessionConfig5.mRepeatingCaptureConfig;
                            for (DeferrableSurface deferrableSurface : surfaces2) {
                                OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
                                AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_HINT_OPTION;
                                if (!optionsBundle.mOptions.containsKey(autoValue_Config_Option2) || optionsBundle.retrieveOption(autoValue_Config_Option2) == null) {
                                    linkedHashMap2.put(deferrableSurface, Long.valueOf(Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
                                    retrieveOption2.getClass();
                                    linkedHashMap2.put(deferrableSurface, retrieveOption2);
                                }
                            }
                        }
                        break;
                    case 2:
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        for (UseCase useCase3 : sessionConfigAdapter.useCases) {
                            boolean z4 = sessionConfigAdapter.isPrimary;
                            useCase3.getClass();
                            SessionConfig sessionConfig6 = z4 ? useCase3.mAttachedSessionConfig : useCase3.mAttachedSecondarySessionConfig;
                            sessionConfig6.getClass();
                            validatingBuilder.add(sessionConfig6);
                        }
                        break;
                    case 3:
                        Lazy lazy = sessionConfigAdapter.validatingBuilder$delegate;
                        if (((SessionConfig.ValidatingBuilder) lazy.getValue()).isValid()) {
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                    default:
                        Lazy lazy2 = sessionConfigAdapter.sessionConfig$delegate;
                        if (((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid()) {
                            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = ((SessionConfig) lazy2.getValue()).mPostviewOutputConfig;
                            if (autoValue_SessionConfig_OutputConfig != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List surfaces3 = ((SessionConfig) lazy2.getValue()).getSurfaces();
                                surfaces3.getClass();
                                arrayList5.addAll(surfaces3);
                                DeferrableSurface deferrableSurface2 = autoValue_SessionConfig_OutputConfig.surface;
                                deferrableSurface2.getClass();
                                arrayList5.add(deferrableSurface2);
                                List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (unmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i4 = 3;
        this.sessionConfig$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ SessionConfigAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                SessionConfigAdapter sessionConfigAdapter = this.f$0;
                switch (i22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (UseCase useCase : sessionConfigAdapter.useCases) {
                            boolean z2 = sessionConfigAdapter.isPrimary;
                            useCase.getClass();
                            SessionConfig sessionConfig = z2 ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
                            sessionConfig.getClass();
                            arrayList.add(sessionConfig);
                            UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                            useCaseConfig.getClass();
                            arrayList2.add(useCaseConfig);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((SessionConfig) it.next()).mRepeatingCaptureConfig.mTemplateType == 5) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SessionConfig sessionConfig2 = (SessionConfig) it2.next();
                                if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option) && sessionConfig2.getSurfaces().size() != 1) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + sessionConfig2.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                        break;
                                    }
                                } else if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                    Iterator it3 = arrayList.iterator();
                                    int i32 = 0;
                                    while (it3.hasNext()) {
                                        SessionConfig sessionConfig3 = (SessionConfig) it3.next();
                                        if (((UseCaseConfig) arrayList3.get(i32)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                                            sessionConfig3.getSurfaces().getClass();
                                            TransactorKt.checkState("MeteringRepeating should contain a surface", !r9.isEmpty());
                                            linkedHashMap.put(sessionConfig3.getSurfaces().get(0), 1L);
                                        } else if (sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                            List surfaces = sessionConfig3.getSurfaces();
                                            surfaces.getClass();
                                            if (!surfaces.isEmpty()) {
                                                Object obj = sessionConfig3.getSurfaces().get(0);
                                                Object retrieveOption = sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.retrieveOption(autoValue_Config_Option);
                                                retrieveOption.getClass();
                                                linkedHashMap.put(obj, retrieveOption);
                                            }
                                        }
                                        i32++;
                                    }
                                }
                            }
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<UseCase> collection2 = sessionConfigAdapter.useCases;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (UseCase useCase2 : collection2) {
                            boolean z3 = sessionConfigAdapter.isPrimary;
                            useCase2.getClass();
                            SessionConfig sessionConfig4 = z3 ? useCase2.mAttachedSessionConfig : useCase2.mAttachedSecondarySessionConfig;
                            sessionConfig4.getClass();
                            arrayList4.add(sessionConfig4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            SessionConfig sessionConfig5 = (SessionConfig) it4.next();
                            List<DeferrableSurface> surfaces2 = sessionConfig5.getSurfaces();
                            CaptureConfig captureConfig = sessionConfig5.mRepeatingCaptureConfig;
                            for (DeferrableSurface deferrableSurface : surfaces2) {
                                OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
                                AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_HINT_OPTION;
                                if (!optionsBundle.mOptions.containsKey(autoValue_Config_Option2) || optionsBundle.retrieveOption(autoValue_Config_Option2) == null) {
                                    linkedHashMap2.put(deferrableSurface, Long.valueOf(Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
                                    retrieveOption2.getClass();
                                    linkedHashMap2.put(deferrableSurface, retrieveOption2);
                                }
                            }
                        }
                        break;
                    case 2:
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        for (UseCase useCase3 : sessionConfigAdapter.useCases) {
                            boolean z4 = sessionConfigAdapter.isPrimary;
                            useCase3.getClass();
                            SessionConfig sessionConfig6 = z4 ? useCase3.mAttachedSessionConfig : useCase3.mAttachedSecondarySessionConfig;
                            sessionConfig6.getClass();
                            validatingBuilder.add(sessionConfig6);
                        }
                        break;
                    case 3:
                        Lazy lazy = sessionConfigAdapter.validatingBuilder$delegate;
                        if (((SessionConfig.ValidatingBuilder) lazy.getValue()).isValid()) {
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                    default:
                        Lazy lazy2 = sessionConfigAdapter.sessionConfig$delegate;
                        if (((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid()) {
                            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = ((SessionConfig) lazy2.getValue()).mPostviewOutputConfig;
                            if (autoValue_SessionConfig_OutputConfig != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List surfaces3 = ((SessionConfig) lazy2.getValue()).getSurfaces();
                                surfaces3.getClass();
                                arrayList5.addAll(surfaces3);
                                DeferrableSurface deferrableSurface2 = autoValue_SessionConfig_OutputConfig.surface;
                                deferrableSurface2.getClass();
                                arrayList5.add(deferrableSurface2);
                                List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (unmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
        final int i5 = 4;
        this.deferrableSurfaces$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.SessionConfigAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ SessionConfigAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SessionConfigAdapter sessionConfigAdapter = this.f$0;
                switch (i22) {
                    case 0:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (UseCase useCase : sessionConfigAdapter.useCases) {
                            boolean z2 = sessionConfigAdapter.isPrimary;
                            useCase.getClass();
                            SessionConfig sessionConfig = z2 ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
                            sessionConfig.getClass();
                            arrayList.add(sessionConfig);
                            UseCaseConfig useCaseConfig = useCase.mCurrentConfig;
                            useCaseConfig.getClass();
                            arrayList2.add(useCaseConfig);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((SessionConfig) it.next()).mRepeatingCaptureConfig.mTemplateType == 5) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SessionConfig sessionConfig2 = (SessionConfig) it2.next();
                                if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option) && sessionConfig2.getSurfaces().size() != 1) {
                                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                                        Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + sessionConfig2.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                        break;
                                    }
                                } else if (sessionConfig2.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                    Iterator it3 = arrayList.iterator();
                                    int i32 = 0;
                                    while (it3.hasNext()) {
                                        SessionConfig sessionConfig3 = (SessionConfig) it3.next();
                                        if (((UseCaseConfig) arrayList3.get(i32)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                                            sessionConfig3.getSurfaces().getClass();
                                            TransactorKt.checkState("MeteringRepeating should contain a surface", !r9.isEmpty());
                                            linkedHashMap.put(sessionConfig3.getSurfaces().get(0), 1L);
                                        } else if (sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.mOptions.containsKey(autoValue_Config_Option)) {
                                            List surfaces = sessionConfig3.getSurfaces();
                                            surfaces.getClass();
                                            if (!surfaces.isEmpty()) {
                                                Object obj = sessionConfig3.getSurfaces().get(0);
                                                Object retrieveOption = sessionConfig3.mRepeatingCaptureConfig.mImplementationOptions.retrieveOption(autoValue_Config_Option);
                                                retrieveOption.getClass();
                                                linkedHashMap.put(obj, retrieveOption);
                                            }
                                        }
                                        i32++;
                                    }
                                }
                            }
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                            break;
                        }
                        break;
                    case 1:
                        Collection<UseCase> collection2 = sessionConfigAdapter.useCases;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                        for (UseCase useCase2 : collection2) {
                            boolean z3 = sessionConfigAdapter.isPrimary;
                            useCase2.getClass();
                            SessionConfig sessionConfig4 = z3 ? useCase2.mAttachedSessionConfig : useCase2.mAttachedSecondarySessionConfig;
                            sessionConfig4.getClass();
                            arrayList4.add(sessionConfig4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            SessionConfig sessionConfig5 = (SessionConfig) it4.next();
                            List<DeferrableSurface> surfaces2 = sessionConfig5.getSurfaces();
                            CaptureConfig captureConfig = sessionConfig5.mRepeatingCaptureConfig;
                            for (DeferrableSurface deferrableSurface : surfaces2) {
                                OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
                                AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_HINT_OPTION;
                                if (!optionsBundle.mOptions.containsKey(autoValue_Config_Option2) || optionsBundle.retrieveOption(autoValue_Config_Option2) == null) {
                                    linkedHashMap2.put(deferrableSurface, Long.valueOf(Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
                                    retrieveOption2.getClass();
                                    linkedHashMap2.put(deferrableSurface, retrieveOption2);
                                }
                            }
                        }
                        break;
                    case 2:
                        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                        for (UseCase useCase3 : sessionConfigAdapter.useCases) {
                            boolean z4 = sessionConfigAdapter.isPrimary;
                            useCase3.getClass();
                            SessionConfig sessionConfig6 = z4 ? useCase3.mAttachedSessionConfig : useCase3.mAttachedSecondarySessionConfig;
                            sessionConfig6.getClass();
                            validatingBuilder.add(sessionConfig6);
                        }
                        break;
                    case 3:
                        Lazy lazy = sessionConfigAdapter.validatingBuilder$delegate;
                        if (((SessionConfig.ValidatingBuilder) lazy.getValue()).isValid()) {
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                    default:
                        Lazy lazy2 = sessionConfigAdapter.sessionConfig$delegate;
                        if (((SessionConfig.ValidatingBuilder) sessionConfigAdapter.validatingBuilder$delegate.getValue()).isValid()) {
                            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = ((SessionConfig) lazy2.getValue()).mPostviewOutputConfig;
                            if (autoValue_SessionConfig_OutputConfig != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List surfaces3 = ((SessionConfig) lazy2.getValue()).getSurfaces();
                                surfaces3.getClass();
                                arrayList5.addAll(surfaces3);
                                DeferrableSurface deferrableSurface2 = autoValue_SessionConfig_OutputConfig.surface;
                                deferrableSurface2.getClass();
                                arrayList5.add(deferrableSurface2);
                                List unmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (unmodifiableList != null) {
                                }
                            }
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            break;
                        }
                        break;
                }
                return null;
            }
        });
    }

    public final void reportSurfaceInvalid(DeferrableSurface deferrableSurface) {
        Continuation continuation;
        Object obj;
        deferrableSurface.getClass();
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Unavailable " + deferrableSurface + ", notify SessionConfig invalid");
        }
        Iterator it = this.useCases.iterator();
        while (true) {
            continuation = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            UseCase useCase = (UseCase) obj;
            useCase.getClass();
            SessionConfig sessionConfig = this.isPrimary ? useCase.mAttachedSessionConfig : useCase.mAttachedSecondarySessionConfig;
            sessionConfig.getClass();
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                break;
            }
        }
        UseCase useCase2 = (UseCase) obj;
        SessionConfig sessionConfig2 = useCase2 != null ? useCase2.mAttachedSessionConfig : null;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(JobKt.CoroutineScope(MainDispatcherLoader.dispatcher.immediate), null, null, new DiskLruCache$launchCleanup$1(sessionConfig2, continuation, 1), 3);
    }
}
