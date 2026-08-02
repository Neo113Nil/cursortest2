package com.bumptech.glide;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.view.PreviewView;
import androidx.camera.viewfinder.core.impl.CloseGuardImpl;
import androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ogg.OggSeeker;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.engine.cache.SafeKeyGenerator$PoolableDigestContainer;
import com.bumptech.glide.util.pool.FactoryPools;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.account.MutableAccountInfoProvider;
import com.datadog.android.core.internal.metrics.BatchClosedMetadata;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.fillr.e0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class GlideBuilder$1 implements MenuPresenter.Callback, CameraCaptureResult, CloseGuardImpl, ByteString$ByteArrayCopier, MediaCodecAdapter.Factory, BinarySearchSeeker$SeekTimestampConverter, OggSeeker, CoroutineContext.Key, FactoryPools.Factory, MutableAccountInfoProvider, MetricsDispatcher, ConsentProvider, Deserializer, UserActionTrackingStrategy {
    public static GlideBuilder$1 zza;

    public static MediaCodec createCodec(e0 e0Var) {
        String str = ((MediaCodecInfo) e0Var.a).name;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static ResolvedFeatureGroup resolveFeatureGroup$default(LegacySessionConfig legacySessionConfig, CameraInfoInternal cameraInfoInternal) {
        FeatureGroupResolutionResult featureListResolvedByPriority;
        PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1(cameraInfoInternal, false);
        Set set = (Set) legacySessionConfig.requiredFeatureGroup;
        StringUtilsKt.d("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + legacySessionConfig + ", lensFacing = " + cameraInfoInternal.getLensFacing());
        List list = (List) legacySessionConfig.preferredFeatureGroup;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) legacySessionConfig.useCases;
        if (set.isEmpty() && list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                UseCaseType.Companion.getClass();
                if (Transition.AnonymousClass1.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                    featureListResolvedByPriority = new FeatureGroupResolutionResult.UnsupportedUseCase(useCase);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        FeatureGroupResolutionResult.UseCaseMissing missingUseCase = PreviewView.AnonymousClass1.getMissingUseCase((GroupableFeature) it2.next(), list2);
                        if (missingUseCase != null) {
                            featureListResolvedByPriority = missingUseCase;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            FeatureGroupResolutionResult.UseCaseMissing missingUseCase2 = PreviewView.AnonymousClass1.getMissingUseCase((GroupableFeature) obj, list2);
                            if (missingUseCase2 != null) {
                                StringUtilsKt.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + missingUseCase2);
                            } else {
                                missingUseCase2 = null;
                            }
                            if (missingUseCase2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        StringUtilsKt.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        featureListResolvedByPriority = anonymousClass1.getFeatureListResolvedByPriority(legacySessionConfig, arrayList, 0, EmptyList.INSTANCE);
                    }
                }
            }
        }
        if (featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Supported) {
            ResolvedFeatureGroup resolvedFeatureGroup = ((FeatureGroupResolutionResult.Supported) featureListResolvedByPriority).resolvedFeatureGroup;
            StringUtilsKt.d("ResolvedFeatureGroup", "resolvedFeatureGroup = " + resolvedFeatureGroup);
            return resolvedFeatureGroup;
        }
        if (featureListResolvedByPriority instanceof FeatureGroupResolutionResult.Unsupported) {
            a$$ExternalSyntheticBUOutline0.m$3("Feature group is not supported");
            return null;
        }
        if (featureListResolvedByPriority instanceof FeatureGroupResolutionResult.UnsupportedUseCase) {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) ((FeatureGroupResolutionResult.UnsupportedUseCase) featureListResolvedByPriority).unsupportedUseCase, (Object) " is not supported");
            return null;
        }
        if (!(featureListResolvedByPriority instanceof FeatureGroupResolutionResult.UseCaseMissing)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        FeatureGroupResolutionResult.UseCaseMissing useCaseMissing = (FeatureGroupResolutionResult.UseCaseMissing) featureListResolvedByPriority;
        throw new IllegalArgumentException(useCaseMissing.requiredUseCases + " must be added for " + useCaseMissing.featureRequiring);
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void close() {
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString$ByteArrayCopier
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
    public Object create() {
        try {
            return new SafeKeyGenerator$PoolableDigestContainer(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(e0 e0Var) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = createCodec(e0Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) e0Var.i;
            mediaCodec.configure((MediaFormat) e0Var.b, surface, (MediaCrypto) e0Var.f, (surface == null && ((MediaCodecInfo) e0Var.a).detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new SynchronousMediaCodecAdapter(mediaCodec, (LoudnessCodecController) e0Var.h);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public SeekMap createSeekMap() {
        return new SeekMap.Unseekable(-9223372036854775807L);
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public Object deserialize(Object obj) {
        String str = (String) obj;
        str.getClass();
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AeState getAeState() {
        return CameraCaptureMetaData$AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AfState getAfState() {
        return CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CameraCaptureMetaData$AwbState getAwbState() {
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CaptureResult getCaptureResult() {
        return null;
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public TrackingConsent getConsent() {
        return TrackingConsent.GRANTED;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public int getFlashState() {
        return 1;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public TagBundle getTagBundle() {
        return TagBundle.EMPTY_TAGBUNDLE;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return -1L;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void open() {
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) {
        return -1L;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public void registerCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator) {
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchClosedMetric(File file, BatchClosedMetadata batchClosedMetadata) {
        file.getClass();
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public void sendBatchDeletedMetric(File file, RemovalReason removalReason, int i) {
        file.getClass();
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public void setConsent() {
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public void startSeek(long j) {
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return j;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public void unregister(Context context) {
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public void unregisterAllCallbacks() {
    }

    @Override // com.datadog.android.core.internal.privacy.ConsentProvider
    public void unregisterCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator) {
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public void warnIfOpen() {
    }
}
