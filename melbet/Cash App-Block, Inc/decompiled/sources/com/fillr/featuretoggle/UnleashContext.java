package com.fillr.featuretoggle;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.text.TextUtilsCompat;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil$H265VideoSignalInfosAndIndices;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.pgs.PgsParser$CueBuilder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.redwood.widget.ComposeHelpersKt;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Client;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.load.engine.Resource;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.fillr.n;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzab;
import com.google.android.gms.internal.mlkit_genai_prompt.zzad;
import com.google.android.gms.internal.mlkit_genai_prompt.zzcm;
import com.google.android.gms.internal.mlkit_genai_prompt.zzcs;
import com.google.android.gms.internal.mlkit_genai_prompt.zzct;
import com.google.android.gms.internal.mlkit_genai_prompt.zzfd;
import com.google.android.gms.internal.mlkit_genai_prompt.zzfn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzzx;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.play.core.splitcompat.zzc;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.crypto.tink.aead.AeadParameters;
import com.google.crypto.tink.aead.AesCtrHmacAeadParameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.LegacyKmsAeadParameters;
import com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.banking.navigation.api.BankingOutboundNavigator$BalanceBasedAddCashIntent;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$startTransferFlow$1;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.cash.benefits.applets.presenters.RealBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.crypto.scenarioplans.models.CryptoOnboardingScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.CryptoOnboardingScenarioPlan$produceResponseContext$1;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.cryptonauts.api.CryptoFeature;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingRequest;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingResponse;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.discover.promotiondetails.backend.real.RealDetailsPageService$getDetailsTokenPage$1;
import com.squareup.cash.discover.promotiondetails.backend.real.RealDetailsPageService$getTemplateTokenPage$1;
import com.squareup.cash.discover.promotiondetails.backend.real.RealDetailsPageService$getTreehousePage$1;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PromotionsDetailsV2;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.taptopay.encryption.api.HieroglyphKeyProvider$KeyType;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyEncryptor$encryptPanData$1;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.protos.cash.bankingbenefits.api.v1_0.BankingBenefitsAppService;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.discover.api.app.v1.service.DiscoverService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.GetDetailsPageResponse;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.scannerview.SizeMap;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParserException;
import papa.SafeTrace;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class UnleashContext implements SubtitleParser, Widget.Children, DataStoreHandler, CallbackToFutureAdapter$Resolver, ScenarioPlan, CameraXBinder {
    public static UnleashContext instance;
    public Object properties;
    public Object remoteAddress;
    public Object sessionId;
    public Object userId;

    public UnleashContext(int i) {
        switch (i) {
            case 7:
                this.userId = new ParsableByteArray();
                this.sessionId = new ParsableByteArray();
                this.remoteAddress = new PgsParser$CueBuilder();
                break;
            case 8:
                this.userId = new ArrayMap(0);
                this.sessionId = new SparseArray();
                this.remoteAddress = new LongSparseArray((Object) null);
                this.properties = new ArrayMap(0);
                break;
            case 10:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new zzc(3));
                this.properties = new HashMap();
                this.sessionId = new ReferenceQueue();
                this.userId = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new Client.AnonymousClass7(this, 16));
                break;
            case 17:
                break;
            default:
                this.userId = null;
                this.sessionId = null;
                this.remoteAddress = null;
                this.properties = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshCashGreenSyncValues(UnleashContext unleashContext, ContinuationImpl continuationImpl) {
        RealBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1 realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1) {
            realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1 = (RealBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1) continuationImpl;
            int i2 = realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshCashGreenSyncValuesRequest refreshCashGreenSyncValuesRequest = new RefreshCashGreenSyncValuesRequest(4, new RequestContext(null, null, null, null, null, null, null, null, 8191), CollectionsKt__CollectionsJVMKt.listOf(RefreshCashGreenSyncValuesRequest.RefreshTarget.CASH_GREEN));
                    BankingBenefitsAppService bankingBenefitsAppService = (BankingBenefitsAppService) unleashContext.sessionId;
                    realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.label = 1;
                    obj = bankingBenefitsAppService.refreshCashGreenSyncValues(refreshCashGreenSyncValuesRequest, realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Cash Green Sync Values: %s", TextUtilsCompat.errorMessaging((AndroidStringManager) unleashContext.remoteAddress, (ApiResult.Failure) apiResult, null).message);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Cash Green Sync Values", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1 = new RealBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1(unleashContext, continuationImpl);
        Object obj2 = realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBankingBenefitsAppletTileAvailabilityManager$refreshCashGreenSyncValues$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    public static synchronized UnleashContext getInstance() {
        UnleashContext unleashContext;
        synchronized (UnleashContext.class) {
            try {
                if (instance == null) {
                    instance = new UnleashContext(1);
                }
                unleashContext = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unleashContext;
    }

    public synchronized void activate(Key key, EngineResource engineResource) {
        ActiveResources$ResourceWeakReference activeResources$ResourceWeakReference = (ActiveResources$ResourceWeakReference) ((HashMap) this.properties).put(key, new ActiveResources$ResourceWeakReference(key, engineResource, (ReferenceQueue) this.sessionId));
        if (activeResources$ResourceWeakReference != null) {
            activeResources$ResourceWeakReference.resource = null;
            activeResources$ResourceWeakReference.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2;
        zzad zzadVar;
        zzfn zzfnVar = (zzfn) this.userId;
        zzcs zzcsVar = (zzcs) this.sessionId;
        zzct zzctVar = (zzct) this.remoteAddress;
        zzzx zzzxVar = (zzzx) this.properties;
        ComponentName componentName = zzfn.zzd;
        try {
            zzadVar = zzcsVar.zza;
            zzab zzabVar = (zzab) zzadVar;
            Parcel zzb = zzabVar.zzb(zzabVar.zza(), 11);
            callbackToFutureAdapter$Completer2 = zzb.readInt();
            zzb.recycle();
        } catch (RemoteException e) {
            e = e;
            callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer;
        } catch (RuntimeException e2) {
            e = e2;
            callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer;
        }
        try {
            if (callbackToFutureAdapter$Completer2 > 0) {
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = callbackToFutureAdapter$Completer;
                ((zzab) zzadVar).zzh(zzctVar.zze(), new zzfd(zzfnVar, zzzxVar, zzctVar, callbackToFutureAdapter$Completer3, 0));
                callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer3;
            } else {
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer4 = callbackToFutureAdapter$Completer;
                zzab zzabVar2 = (zzab) zzadVar;
                zzabVar2.zzg(zzctVar.zze(), new zzfd(zzfnVar, zzzxVar, zzctVar, callbackToFutureAdapter$Completer4, 1));
                callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer4;
            }
            return "requestDownloadableFeatureFuture";
        } catch (RemoteException e3) {
            e = e3;
            RemoteException remoteException = e;
            Log.e("zzfn", "AiCore service failed to download feature ".concat(zzctVar.zza), remoteException);
            callbackToFutureAdapter$Completer2.setException(zzcm.zzc(6, remoteException, "AICore service failed to download feature ".concat(zzctVar.zza)));
            return "requestDownloadableFeatureFuture";
        } catch (RuntimeException e4) {
            e = e4;
            RuntimeException runtimeException = e;
            Log.e("zzfn", "AiCore service failed to download feature due to runtime error ".concat(zzctVar.zza), runtimeException);
            callbackToFutureAdapter$Completer2.setException(zzcm.zzc(0, runtimeException, "AICore service failed to download feature due to runtime error ".concat(zzctVar.zza)));
            return "requestDownloadableFeatureFuture";
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraXBinder
    public void bind() {
        ((CameraPreview) this.remoteAddress).rebind(((Pi2OldSelfieCameraBinding) this.userId).previewviewSelfieCamera, CameraPreview.CameraDirection.FRONT, (SelfieDirectionFeed) ((Lazy) this.sessionId).get(), false, new OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0((SelfieWorkflow.Screen.OldCameraScreen) this.properties, 0));
    }

    public LegacyKmsEnvelopeAeadParameters build() {
        if (((LegacyKmsAeadParameters.Variant) this.sessionId) == null) {
            this.sessionId = LegacyKmsAeadParameters.Variant.NO_PREFIX$1;
        }
        if (((String) this.userId) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("kekUri must be set");
            return null;
        }
        if (((LegacyKmsAeadParameters.Variant) this.remoteAddress) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("dekParsingStrategy must be set");
            return null;
        }
        AeadParameters aeadParameters = (AeadParameters) this.properties;
        if (aeadParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$6("dekParametersForNewKeys must be set");
            return null;
        }
        if (aeadParameters.hasIdRequirement()) {
            a$$ExternalSyntheticBUOutline0.m$6("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        LegacyKmsAeadParameters.Variant variant = (LegacyKmsAeadParameters.Variant) this.remoteAddress;
        AeadParameters aeadParameters2 = (AeadParameters) this.properties;
        if ((variant.equals(LegacyKmsAeadParameters.Variant.ASSUME_AES_GCM) && (aeadParameters2 instanceof AesGcmParameters)) || ((variant == LegacyKmsAeadParameters.Variant.ASSUME_CHACHA20POLY1305 && (aeadParameters2 instanceof ChaCha20Poly1305Parameters)) || ((variant == LegacyKmsAeadParameters.Variant.ASSUME_XCHACHA20POLY1305 && (aeadParameters2 instanceof XChaCha20Poly1305Parameters)) || ((variant == LegacyKmsAeadParameters.Variant.ASSUME_AES_CTR_HMAC && (aeadParameters2 instanceof AesCtrHmacAeadParameters)) || ((variant == LegacyKmsAeadParameters.Variant.ASSUME_AES_EAX && (aeadParameters2 instanceof AesEaxParameters)) || (variant == LegacyKmsAeadParameters.Variant.ASSUME_AES_GCM_SIV && (aeadParameters2 instanceof AesGcmSivParameters))))))) {
            return new LegacyKmsEnvelopeAeadParameters((LegacyKmsAeadParameters.Variant) this.sessionId, (String) this.userId, (LegacyKmsAeadParameters.Variant) this.remoteAddress, (AeadParameters) this.properties);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + ((LegacyKmsAeadParameters.Variant) this.remoteAddress).name + " when new keys are picked according to " + ((AeadParameters) this.properties) + ".");
    }

    public void cleanupActiveReference(ActiveResources$ResourceWeakReference activeResources$ResourceWeakReference) {
        Resource resource;
        synchronized (this) {
            ((HashMap) this.properties).remove(activeResources$ResourceWeakReference.key);
            if (activeResources$ResourceWeakReference.isCacheable && (resource = activeResources$ResourceWeakReference.resource) != null) {
                ((Engine) this.remoteAddress).onResourceReleased(activeResources$ResourceWeakReference.key, new EngineResource(resource, true, false, activeResources$ResourceWeakReference.key, (Engine) this.remoteAddress));
            }
        }
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        return FlowStarter.startFlow$default((FlowStarter) this.sessionId, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.remoteAddress, null, ClientScenario.PLASMA, null, null, null, null, new FlowStarter$$ExternalSyntheticLambda0(19), 500);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void detach() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r2.init(r7) == r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object encryptPanData(byte[] bArr, ContinuationImpl continuationImpl) {
        RealHieroglyphKeyEncryptor$encryptPanData$1 realHieroglyphKeyEncryptor$encryptPanData$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        byte[] bArr2;
        Serializable secretKey;
        byte[] bArr3;
        SecretKey secretKey2;
        SecretKey secretKey3;
        SecretKey secretKey4;
        RealHieroglyphKeyProvider realHieroglyphKeyProvider = (RealHieroglyphKeyProvider) this.sessionId;
        if (continuationImpl instanceof RealHieroglyphKeyEncryptor$encryptPanData$1) {
            realHieroglyphKeyEncryptor$encryptPanData$1 = (RealHieroglyphKeyEncryptor$encryptPanData$1) continuationImpl;
            int i2 = realHieroglyphKeyEncryptor$encryptPanData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realHieroglyphKeyEncryptor$encryptPanData$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealHieroglyphKeyEncryptor$encryptPanData$1 realHieroglyphKeyEncryptor$encryptPanData$12 = realHieroglyphKeyEncryptor$encryptPanData$1;
                Object obj = realHieroglyphKeyEncryptor$encryptPanData$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realHieroglyphKeyEncryptor$encryptPanData$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    bArr2 = bArr;
                    realHieroglyphKeyEncryptor$encryptPanData$12.L$0 = bArr2;
                    realHieroglyphKeyEncryptor$encryptPanData$12.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            bArr3 = realHieroglyphKeyEncryptor$encryptPanData$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            secretKey2 = (SecretKey) obj;
                            if (secretKey2 != null) {
                                HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType = HieroglyphKeyProvider$KeyType.TTP_HMAC_PAN_KEY;
                                realHieroglyphKeyEncryptor$encryptPanData$12.L$0 = bArr3;
                                realHieroglyphKeyEncryptor$encryptPanData$12.L$1 = secretKey2;
                                realHieroglyphKeyEncryptor$encryptPanData$12.label = 3;
                                Serializable secretKey5 = realHieroglyphKeyProvider.getSecretKey(hieroglyphKeyProvider$KeyType, realHieroglyphKeyEncryptor$encryptPanData$12);
                                if (secretKey5 != coroutineSingletons) {
                                    secretKey3 = secretKey2;
                                    obj = secretKey5;
                                    secretKey4 = (SecretKey) obj;
                                    if (secretKey4 != null) {
                                    }
                                }
                            }
                            return null;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        secretKey3 = realHieroglyphKeyEncryptor$encryptPanData$12.L$1;
                        bArr3 = realHieroglyphKeyEncryptor$encryptPanData$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        secretKey4 = (SecretKey) obj;
                        if (secretKey4 != null) {
                            RealObservabilityManager realObservabilityManager = (RealObservabilityManager) this.properties;
                            HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(this, secretKey3, bArr3, secretKey4, (Continuation) null, 4);
                            realHieroglyphKeyEncryptor$encryptPanData$12.L$0 = null;
                            realHieroglyphKeyEncryptor$encryptPanData$12.L$1 = null;
                            realHieroglyphKeyEncryptor$encryptPanData$12.label = 4;
                            EmptyMap emptyMap = EmptyMap.INSTANCE;
                            emptyMap.getClass();
                            Object coroutineScope = JobKt.coroutineScope(new WorkflowLayout$start$1(realObservabilityManager, emptyMap, anonymousClass2, continuation, 4), realHieroglyphKeyEncryptor$encryptPanData$12);
                            return coroutineScope == coroutineSingletons ? coroutineSingletons : coroutineScope;
                        }
                        return null;
                    }
                    byte[] bArr4 = realHieroglyphKeyEncryptor$encryptPanData$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bArr2 = bArr4;
                }
                HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType2 = HieroglyphKeyProvider$KeyType.TTP_PAN_KEY;
                realHieroglyphKeyEncryptor$encryptPanData$12.L$0 = bArr2;
                realHieroglyphKeyEncryptor$encryptPanData$12.label = 2;
                secretKey = realHieroglyphKeyProvider.getSecretKey(hieroglyphKeyProvider$KeyType2, realHieroglyphKeyEncryptor$encryptPanData$12);
                if (secretKey != coroutineSingletons) {
                    bArr3 = bArr2;
                    obj = secretKey;
                    secretKey2 = (SecretKey) obj;
                    if (secretKey2 != null) {
                    }
                    return null;
                }
            }
        }
        realHieroglyphKeyEncryptor$encryptPanData$1 = new RealHieroglyphKeyEncryptor$encryptPanData$1(this, continuationImpl);
        RealHieroglyphKeyEncryptor$encryptPanData$1 realHieroglyphKeyEncryptor$encryptPanData$122 = realHieroglyphKeyEncryptor$encryptPanData$1;
        Object obj2 = realHieroglyphKeyEncryptor$encryptPanData$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realHieroglyphKeyEncryptor$encryptPanData$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType22 = HieroglyphKeyProvider$KeyType.TTP_PAN_KEY;
        realHieroglyphKeyEncryptor$encryptPanData$122.L$0 = bArr2;
        realHieroglyphKeyEncryptor$encryptPanData$122.label = 2;
        secretKey = realHieroglyphKeyProvider.getSecretKey(hieroglyphKeyProvider$KeyType22, realHieroglyphKeyEncryptor$encryptPanData$122);
        if (secretKey != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDetailsTokenPage(PromotionDetails.Identifier.DetailsToken detailsToken, ContinuationImpl continuationImpl) {
        RealDetailsPageService$getDetailsTokenPage$1 realDetailsPageService$getDetailsTokenPage$1;
        int i;
        DetailsPageView detailsPageView;
        DetailsPage detailsPage;
        if (continuationImpl instanceof RealDetailsPageService$getDetailsTokenPage$1) {
            realDetailsPageService$getDetailsTokenPage$1 = (RealDetailsPageService$getDetailsTokenPage$1) continuationImpl;
            int i2 = realDetailsPageService$getDetailsTokenPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDetailsPageService$getDetailsTokenPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDetailsPageService$getDetailsTokenPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDetailsPageService$getDetailsTokenPage$1.label;
                String str = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.properties)).peekCurrentValue(LaunchDarklyFeatureFlags$PromotionsDetailsV2.INSTANCE)).enabled()) {
                        AppMessageClientService appMessageClientService = (AppMessageClientService) this.sessionId;
                        GetDetailsPageRequest getDetailsPageRequest = new GetDetailsPageRequest(detailsToken.token, str, (Long) (objArr == true ? 1 : 0), 14);
                        realDetailsPageService$getDetailsTokenPage$1.label = 1;
                        obj = appMessageClientService.getDetailsPage(getDetailsPageRequest, realDetailsPageService$getDetailsTokenPage$1);
                    } else {
                        DiscoverService discoverService = (DiscoverService) this.userId;
                        com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageRequest getDetailsPageRequest2 = new com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageRequest(detailsToken.token, ByteString.EMPTY);
                        realDetailsPageService$getDetailsTokenPage$1.label = 2;
                        obj = discoverService.getDetailsPage(getDetailsPageRequest2, realDetailsPageService$getDetailsTokenPage$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    GetDetailsPageResponse getDetailsPageResponse = (GetDetailsPageResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                    if (getDetailsPageResponse != null && (detailsPageView = getDetailsPageResponse.details_page) != null) {
                        return new PromotionDetailsViewModel.DetailsPageData.DetailsPageV2(detailsPageView);
                    }
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult2 = (ApiResult) obj;
                    com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageResponse getDetailsPageResponse2 = (com.squareup.protos.cash.discover.api.app.v1.message.GetDetailsPageResponse) (apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null);
                    if (getDetailsPageResponse2 != null && (detailsPage = getDetailsPageResponse2.details_page) != null) {
                        return new PromotionDetailsViewModel.DetailsPageData.DetailsPageV1(detailsPage);
                    }
                }
                return null;
            }
        }
        realDetailsPageService$getDetailsTokenPage$1 = new RealDetailsPageService$getDetailsTokenPage$1(this, continuationImpl);
        Object obj2 = realDetailsPageService$getDetailsTokenPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDetailsPageService$getDetailsTokenPage$1.label;
        String str2 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        return null;
    }

    public Intent getMessagingEvent() {
        return (Intent) ((ArrayDeque) this.properties).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTemplateTokenPage(PromotionDetails.Identifier.TemplateToken templateToken, ContinuationImpl continuationImpl) {
        RealDetailsPageService$getTemplateTokenPage$1 realDetailsPageService$getTemplateTokenPage$1;
        int i;
        GetDetailsPageResponse getDetailsPageResponse;
        DetailsPageView detailsPageView;
        if (continuationImpl instanceof RealDetailsPageService$getTemplateTokenPage$1) {
            realDetailsPageService$getTemplateTokenPage$1 = (RealDetailsPageService$getTemplateTokenPage$1) continuationImpl;
            int i2 = realDetailsPageService$getTemplateTokenPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDetailsPageService$getTemplateTokenPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDetailsPageService$getTemplateTokenPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDetailsPageService$getTemplateTokenPage$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService = (AppMessageClientService) this.sessionId;
                    String str2 = templateToken.templateToken;
                    String str3 = templateToken.templateVersion;
                    GetDetailsPageRequest getDetailsPageRequest = new GetDetailsPageRequest(str, str2, str3 != null ? StringsKt.toLongOrNull(10, str3) : null, 9);
                    realDetailsPageService$getTemplateTokenPage$1.label = 1;
                    obj = appMessageClientService.getDetailsPage(getDetailsPageRequest, realDetailsPageService$getTemplateTokenPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                getDetailsPageResponse = (GetDetailsPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (getDetailsPageResponse != null || (detailsPageView = getDetailsPageResponse.details_page) == null) {
                    return null;
                }
                return new PromotionDetailsViewModel.DetailsPageData.DetailsPageV2(detailsPageView);
            }
        }
        realDetailsPageService$getTemplateTokenPage$1 = new RealDetailsPageService$getTemplateTokenPage$1(this, continuationImpl);
        Object obj2 = realDetailsPageService$getTemplateTokenPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDetailsPageService$getTemplateTokenPage$1.label;
        String str4 = null;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        getDetailsPageResponse = (GetDetailsPageResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (getDetailsPageResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTreehousePage(PromotionDetails.Identifier.TreehousePath treehousePath, ContinuationImpl continuationImpl) {
        RealDetailsPageService$getTreehousePage$1 realDetailsPageService$getTreehousePage$1;
        int i;
        if (continuationImpl instanceof RealDetailsPageService$getTreehousePage$1) {
            realDetailsPageService$getTreehousePage$1 = (RealDetailsPageService$getTreehousePage$1) continuationImpl;
            int i2 = realDetailsPageService$getTreehousePage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDetailsPageService$getTreehousePage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDetailsPageService$getTreehousePage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDetailsPageService$getTreehousePage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SizeMap sizeMap = (SizeMap) this.remoteAddress;
                    String str = treehousePath.path;
                    realDetailsPageService$getTreehousePage$1.label = 1;
                    obj = sizeMap.getDetailsPage(str, realDetailsPageService$getTreehousePage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new PromotionDetailsViewModel.DetailsPageData.DetailsPageV1((DetailsPage) obj);
            }
        }
        realDetailsPageService$getTreehousePage$1 = new RealDetailsPageService$getTreehousePage$1(this, continuationImpl);
        Object obj2 = realDetailsPageService$getTreehousePage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDetailsPageService$getTreehousePage$1.label;
        if (i != 0) {
        }
        return new PromotionDetailsViewModel.DetailsPageData.DetailsPageV1((DetailsPage) obj2);
    }

    public void goToBalanceBasedAddCashScreen(Screen screen, BankingOutboundNavigator$BalanceBasedAddCashIntent bankingOutboundNavigator$BalanceBasedAddCashIntent) {
        Flow$Type flow$Type;
        screen.getClass();
        Navigator navigator = (Navigator) this.userId;
        FlowStarter flowStarter = (FlowStarter) this.remoteAddress;
        int ordinal = bankingOutboundNavigator$BalanceBasedAddCashIntent.ordinal();
        if (ordinal == 0) {
            flow$Type = Flow$Type.ENABLE_BALANCE_BASED_ADD_CASH;
        } else if (ordinal == 1) {
            flow$Type = Flow$Type.EDIT_BALANCE_BASED_ADD_CASH_MINIMUM_BALANCE_AMOUNT;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            flow$Type = Flow$Type.EDIT_BALANCE_BASED_ADD_CASH_INCREMENT_AMOUNT;
        }
        navigator.goTo(FlowStarter.startPlasmaFlow$default(flowStarter, flow$Type, screen, null, null, 12));
    }

    public boolean hasAccessNetworkStatePermission(Context context) {
        if (((Boolean) this.remoteAddress) == null) {
            this.remoteAddress = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.sessionId).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.remoteAddress).booleanValue();
    }

    public boolean hasWakeLockPermission(Context context) {
        if (((Boolean) this.sessionId) == null) {
            this.sessionId = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.sessionId).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.sessionId).booleanValue();
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void insert(int i, Widget widget) {
        widget.getClass();
        ((ArrayList) this.properties).add(i, widget);
        ((Function2) this.userId).invoke(Integer.valueOf(i), widget);
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void move(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.properties;
        ComposeHelpersKt.move(i, i2, i3, arrayList);
        ((Function2) this.sessionId).invoke(Integer.valueOf(i), Integer.valueOf(i3));
        if (i2 > i) {
            i2 -= i3;
        }
        int i4 = i3 + i2;
        while (i2 < i4) {
            Function2 function2 = (Function2) this.userId;
            Integer valueOf = Integer.valueOf(i2);
            Object obj = arrayList.get(i2);
            obj.getClass();
            function2.invoke(valueOf, obj);
            i2++;
        }
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void onModifierUpdated(int i, Widget widget) {
        widget.getClass();
        ((Function2) this.remoteAddress).invoke(Integer.valueOf(i), widget);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        int[] iArr;
        Cue cue;
        int i3;
        int i4;
        int i5;
        int readUnsignedInt24;
        PgsParser$CueBuilder pgsParser$CueBuilder = (PgsParser$CueBuilder) this.remoteAddress;
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.sessionId;
        ParsableByteArray parsableByteArray2 = (ParsableByteArray) this.userId;
        parsableByteArray2.reset(i + i2, bArr);
        parsableByteArray2.setPosition(i);
        if (((Inflater) this.properties) == null) {
            this.properties = new Inflater();
        }
        Inflater inflater = (Inflater) this.properties;
        String str = Util.DEVICE_DEBUG_INFO;
        if (parsableByteArray2.bytesLeft() > 0 && parsableByteArray2.peekUnsignedByte() == 120 && Util.inflate(parsableByteArray2, parsableByteArray, inflater)) {
            parsableByteArray2.reset(parsableByteArray.limit, parsableByteArray.data);
        }
        int i6 = 0;
        pgsParser$CueBuilder.planeWidth = 0;
        int[] iArr2 = pgsParser$CueBuilder.colors;
        ParsableByteArray parsableByteArray3 = pgsParser$CueBuilder.bitmapData;
        pgsParser$CueBuilder.planeHeight = 0;
        pgsParser$CueBuilder.bitmapX = 0;
        pgsParser$CueBuilder.bitmapY = 0;
        pgsParser$CueBuilder.bitmapWidth = 0;
        pgsParser$CueBuilder.bitmapHeight = 0;
        parsableByteArray3.reset(0);
        pgsParser$CueBuilder.colorsSet = false;
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() >= 3) {
            int i7 = parsableByteArray2.limit;
            int readUnsignedByte = parsableByteArray2.readUnsignedByte();
            int readUnsignedShort = parsableByteArray2.readUnsignedShort();
            int i8 = parsableByteArray2.position + readUnsignedShort;
            if (i8 > i7) {
                parsableByteArray2.setPosition(i7);
                i3 = i6;
                iArr = iArr2;
                cue = null;
            } else {
                char c = 128;
                if (readUnsignedByte != 128) {
                    switch (readUnsignedByte) {
                        case 20:
                            if (readUnsignedShort % 5 == 2) {
                                parsableByteArray2.skipBytes(2);
                                Arrays.fill(iArr2, i6);
                                int i9 = readUnsignedShort / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
                                    char c2 = c;
                                    double readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                                    double readUnsignedByte4 = parsableByteArray2.readUnsignedByte() - 128;
                                    int[] iArr3 = iArr2;
                                    double readUnsignedByte5 = parsableByteArray2.readUnsignedByte() - 128;
                                    iArr3[readUnsignedByte2] = Util.constrainValue((int) ((readUnsignedByte5 * 1.772d) + readUnsignedByte3), 0, 255) | (parsableByteArray2.readUnsignedByte() << 24) | (Util.constrainValue((int) ((1.402d * readUnsignedByte4) + readUnsignedByte3), 0, 255) << 16) | (Util.constrainValue((int) ((readUnsignedByte3 - (0.34414d * readUnsignedByte5)) - (readUnsignedByte4 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                pgsParser$CueBuilder.colorsSet = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (readUnsignedShort >= 4) {
                                parsableByteArray2.skipBytes(3);
                                int i11 = readUnsignedShort - 4;
                                if (((128 & parsableByteArray2.readUnsignedByte()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (readUnsignedInt24 = parsableByteArray2.readUnsignedInt24()) >= 4) {
                                        pgsParser$CueBuilder.bitmapWidth = parsableByteArray2.readUnsignedShort();
                                        pgsParser$CueBuilder.bitmapHeight = parsableByteArray2.readUnsignedShort();
                                        parsableByteArray3.reset(readUnsignedInt24 - 4);
                                        i11 = readUnsignedShort - 11;
                                    }
                                }
                                int i12 = parsableByteArray3.position;
                                int i13 = parsableByteArray3.limit;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    parsableByteArray2.readBytes(i12, min, parsableByteArray3.data);
                                    parsableByteArray3.setPosition(i12 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (readUnsignedShort >= 19) {
                                pgsParser$CueBuilder.planeWidth = parsableByteArray2.readUnsignedShort();
                                pgsParser$CueBuilder.planeHeight = parsableByteArray2.readUnsignedShort();
                                parsableByteArray2.skipBytes(11);
                                pgsParser$CueBuilder.bitmapX = parsableByteArray2.readUnsignedShort();
                                pgsParser$CueBuilder.bitmapY = parsableByteArray2.readUnsignedShort();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    cue = null;
                } else {
                    iArr = iArr2;
                    if (pgsParser$CueBuilder.planeWidth == 0 || pgsParser$CueBuilder.planeHeight == 0 || pgsParser$CueBuilder.bitmapWidth == 0 || pgsParser$CueBuilder.bitmapHeight == 0 || (i4 = parsableByteArray3.limit) == 0 || parsableByteArray3.position != i4 || !pgsParser$CueBuilder.colorsSet) {
                        cue = null;
                    } else {
                        parsableByteArray3.setPosition(0);
                        int i14 = pgsParser$CueBuilder.bitmapWidth * pgsParser$CueBuilder.bitmapHeight;
                        int[] iArr4 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int readUnsignedByte6 = parsableByteArray3.readUnsignedByte();
                            if (readUnsignedByte6 != 0) {
                                i5 = i15 + 1;
                                iArr4[i15] = iArr[readUnsignedByte6];
                            } else {
                                int readUnsignedByte7 = parsableByteArray3.readUnsignedByte();
                                if (readUnsignedByte7 != 0) {
                                    i5 = ((readUnsignedByte7 & 64) == 0 ? readUnsignedByte7 & 63 : ((readUnsignedByte7 & 63) << 8) | parsableByteArray3.readUnsignedByte()) + i15;
                                    Arrays.fill(iArr4, i15, i5, (readUnsignedByte7 & 128) == 0 ? iArr[0] : iArr[parsableByteArray3.readUnsignedByte()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, pgsParser$CueBuilder.bitmapWidth, pgsParser$CueBuilder.bitmapHeight, Bitmap.Config.ARGB_8888);
                        float f = pgsParser$CueBuilder.bitmapX;
                        float f2 = pgsParser$CueBuilder.planeWidth;
                        float f3 = f / f2;
                        float f4 = pgsParser$CueBuilder.bitmapY;
                        float f5 = pgsParser$CueBuilder.planeHeight;
                        cue = new Cue(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, PKIFailureInfo.systemUnavail, -3.4028235E38f, pgsParser$CueBuilder.bitmapWidth / f2, pgsParser$CueBuilder.bitmapHeight / f5, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0);
                    }
                    i3 = 0;
                    pgsParser$CueBuilder.planeWidth = 0;
                    pgsParser$CueBuilder.planeHeight = 0;
                    pgsParser$CueBuilder.bitmapX = 0;
                    pgsParser$CueBuilder.bitmapY = 0;
                    pgsParser$CueBuilder.bitmapWidth = 0;
                    pgsParser$CueBuilder.bitmapHeight = 0;
                    parsableByteArray3.reset(0);
                    pgsParser$CueBuilder.colorsSet = false;
                }
                parsableByteArray2.setPosition(i8);
            }
            if (cue != null) {
                arrayList.add(cue);
            }
            i6 = i3;
            iArr2 = iArr;
        }
        consumer.accept(new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        CryptoOnboardingScenarioPlan$produceResponseContext$1 cryptoOnboardingScenarioPlan$produceResponseContext$1;
        int i;
        CryptoFeature cryptoFeature;
        ApiResult apiResult;
        if (continuationImpl instanceof CryptoOnboardingScenarioPlan$produceResponseContext$1) {
            cryptoOnboardingScenarioPlan$produceResponseContext$1 = (CryptoOnboardingScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = cryptoOnboardingScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cryptoOnboardingScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cryptoOnboardingScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cryptoOnboardingScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoService cryptoService = (CryptoService) this.userId;
                    String str = blockersData.flowToken;
                    switch (((BitcoinFeature) this.properties).ordinal()) {
                        case 0:
                            cryptoFeature = CryptoFeature.FEATURE_UNSPECIFIED;
                            break;
                        case 1:
                            cryptoFeature = CryptoFeature.BTC_P2P_SEND;
                            break;
                        case 2:
                            cryptoFeature = CryptoFeature.BTC_P2P_RECEIVE;
                            break;
                        case 3:
                            cryptoFeature = CryptoFeature.BTC_WITHDRAW;
                            break;
                        case 4:
                            cryptoFeature = CryptoFeature.BTC_DEPOSIT;
                            break;
                        case 5:
                            cryptoFeature = CryptoFeature.BTC_LN_WITHDRAW;
                            break;
                        case 6:
                            cryptoFeature = CryptoFeature.BTC_LN_DEPOSIT;
                            break;
                        case 7:
                            cryptoFeature = CryptoFeature.BTC_BUY;
                            break;
                        case 8:
                            cryptoFeature = CryptoFeature.BTC_SELL;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                    StartCryptoOnboardingRequest startCryptoOnboardingRequest = new StartCryptoOnboardingRequest(null, cryptoFeature, ByteString.EMPTY);
                    cryptoOnboardingScenarioPlan$produceResponseContext$1.label = 1;
                    obj = cryptoService.cryptoOnboarding(str, startCryptoOnboardingRequest, cryptoOnboardingScenarioPlan$produceResponseContext$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new ApiResult.Success(((StartCryptoOnboardingResponse) ((ApiResult.Success) apiResult).response).response_context);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        cryptoOnboardingScenarioPlan$produceResponseContext$1 = new CryptoOnboardingScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = cryptoOnboardingScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cryptoOnboardingScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    @Override // app.cash.redwood.widget.Widget.Children
    public void remove(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.properties;
        arrayList.getClass();
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.subList(i, i + i2).clear();
        }
        ((Function2) this.sessionId).invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void setDekParametersForNewKeys(AeadParameters aeadParameters) {
        this.properties = aeadParameters;
    }

    public void setDekParsingStrategy(LegacyKmsAeadParameters.Variant variant) {
        this.remoteAddress = variant;
    }

    public void setKekUri(String str) {
        this.userId = str;
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void setValue(UUID uuid, Transition.AnonymousClass1 anonymousClass1) {
        uuid.getClass();
        zzho.executeSafe((BackPressureExecutorService) this.userId, "dataStoreWrite", (InternalLogger) this.sessionId, new CardEntryActivityController$$ExternalSyntheticLambda1(4, this, uuid, anonymousClass1));
    }

    public void setVariant(LegacyKmsAeadParameters.Variant variant) {
        this.sessionId = variant;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        if (r2 == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0143, code lost:
    
        if (r2 == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startTransferFlow(TransferData transferData, String str, Continuation continuation) {
        RealBankingOutboundNavigator$startTransferFlow$1 realBankingOutboundNavigator$startTransferFlow$1;
        int i;
        Screen screen;
        FlowStarter flowStarter = (FlowStarter) this.remoteAddress;
        Navigator navigator = (Navigator) this.userId;
        if (continuation instanceof RealBankingOutboundNavigator$startTransferFlow$1) {
            realBankingOutboundNavigator$startTransferFlow$1 = (RealBankingOutboundNavigator$startTransferFlow$1) continuation;
            int i2 = realBankingOutboundNavigator$startTransferFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBankingOutboundNavigator$startTransferFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBankingOutboundNavigator$startTransferFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBankingOutboundNavigator$startTransferFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    com.squareup.kotterknife.Lazy create$1 = ((RealTransfersInboundNavigator$Factory$Impl) this.properties).create$1(navigator);
                    int ordinal = transferData.f1215type.ordinal();
                    if (ordinal == 0) {
                        BlockersData copy$default = BlockersData.copy$default(FlowStarter.startTransferFlow$default(flowStarter, RealMoneyNavigatorHelper.moneyTabScreen(), str, 4), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, transferData, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                        realBankingOutboundNavigator$startTransferFlow$1.L$3 = navigator;
                        realBankingOutboundNavigator$startTransferFlow$1.label = 1;
                        obj = com.squareup.kotterknife.Lazy.startAddMoneyFlow$default(create$1, copy$default, null);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockersData copy$default2 = BlockersData.copy$default(FlowStarter.startTransferFlow$default(flowStarter, RealMoneyNavigatorHelper.moneyTabScreen(), str, 4), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, transferData, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                        realBankingOutboundNavigator$startTransferFlow$1.L$3 = navigator;
                        realBankingOutboundNavigator$startTransferFlow$1.label = 2;
                        obj = com.squareup.kotterknife.Lazy.startWithdrawFlow$default(create$1, copy$default2, null, null, 12);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    navigator = realBankingOutboundNavigator$startTransferFlow$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    screen = (Screen) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    navigator = realBankingOutboundNavigator$startTransferFlow$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    screen = (Screen) obj;
                }
                navigator.goTo(screen);
                return Unit.INSTANCE;
            }
        }
        realBankingOutboundNavigator$startTransferFlow$1 = new RealBankingOutboundNavigator$startTransferFlow$1(this, continuation);
        Object obj2 = realBankingOutboundNavigator$startTransferFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBankingOutboundNavigator$startTransferFlow$1.label;
        if (i != 0) {
        }
        navigator.goTo(screen);
        return Unit.INSTANCE;
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public void value(n.b bVar, GlideBuilder$1 glideBuilder$1) {
        zzho.executeSafe((BackPressureExecutorService) this.userId, "dataStoreRead", (InternalLogger) this.sessionId, new CardEntryActivityController$$ExternalSyntheticLambda1(5, this, glideBuilder$1, bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (((android.content.res.XmlResourceParser) r0.provider).getName().equals("manifest") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r4 = ((android.content.res.XmlResourceParser) r0.provider).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r5 = ((android.content.res.XmlResourceParser) r0.provider).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r4 = java.lang.Integer.parseInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r5 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r4 = (r4 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax) | (java.lang.Integer.parseInt(r5) << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m("Couldn't parse versionCodeMajor to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m("Couldn't parse versionCode to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(File[] fileArr) {
        PackageInfo packageInfo;
        long parseInt;
        JCAContext jCAContext = (JCAContext) this.remoteAddress;
        Context context = (Context) this.sessionId;
        if (((PackageInfo) this.properties) == null) {
            try {
                this.properties = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = (PackageInfo) this.properties;
        long longVersionCode = packageInfo.getLongVersionCode();
        try {
            Constructor declaredConstructor = AssetManager.class.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            AssetManager assetManager = (AssetManager) declaredConstructor.newInstance(null);
            int length = fileArr.length;
            loop0: do {
                length--;
                if (length < 0) {
                    return true;
                }
                XmlResourceParser openXmlResourceParser = assetManager.openXmlResourceParser(zzr.zzc(assetManager, fileArr[length]), "AndroidManifest.xml");
                jCAContext.provider = openXmlResourceParser;
                if (openXmlResourceParser == null) {
                    throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
                }
                while (true) {
                    int next = ((XmlResourceParser) jCAContext.provider).next();
                    if (next == 2) {
                        break;
                    }
                    if (next == 1) {
                        break loop0;
                    }
                }
                throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
            } while (longVersionCode == parseInt);
            return false;
        } catch (Exception e) {
            throw new zzbl("Failed to invoke default constructor on class ".concat(AssetManager.class.getName()), e);
        }
    }

    public zzao zzb(zzae zzaeVar) {
        zzao zzaoVar = zzao.zzf;
        Iterator zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            zzaoVar = ((zzz) this.sessionId).zzb(this, zzaeVar.zzl(((Integer) zzg.next()).intValue()));
            if (zzaoVar instanceof zzag) {
                break;
            }
        }
        return zzaoVar;
    }

    public boolean zzc(File[] fileArr) {
        PackageInfo packageInfo;
        String absolutePath;
        X509Certificate x509Certificate;
        Context context = (Context) this.sessionId;
        ArrayList<X509Certificate> arrayList = null;
        if (((PackageInfo) this.properties) == null) {
            try {
                this.properties = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = (PackageInfo) this.properties;
        if (packageInfo != null && packageInfo.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] zza = zzi.zza(absolutePath);
                    if (zza == null || zza.length == 0 || zza[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        for (X509Certificate[] x509CertificateArr : zza) {
                            int i = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i + 1;
                        }
                        Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                    }
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e2);
                }
            } catch (Exception e3) {
                Log.e("SplitCompat", "Split verification error.", e3);
                return false;
            }
        }
        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    public boolean zzd(String str) {
        if (((HashMap) this.properties).containsKey(str)) {
            return true;
        }
        UnleashContext unleashContext = (UnleashContext) this.userId;
        if (unleashContext != null) {
            return unleashContext.zzd(str);
        }
        return false;
    }

    public void zze(String str, zzao zzaoVar) {
        UnleashContext unleashContext;
        HashMap hashMap = (HashMap) this.properties;
        if (!hashMap.containsKey(str) && (unleashContext = (UnleashContext) this.userId) != null && unleashContext.zzd(str)) {
            unleashContext.zze(str, zzaoVar);
        } else {
            if (((HashMap) this.remoteAddress).containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, zzaoVar);
            }
        }
    }

    public void zzf(String str, zzao zzaoVar) {
        if (((HashMap) this.remoteAddress).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.properties;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    public zzao zzh(String str) {
        HashMap hashMap = (HashMap) this.properties;
        if (hashMap.containsKey(str)) {
            return (zzao) hashMap.get(str);
        }
        UnleashContext unleashContext = (UnleashContext) this.userId;
        if (unleashContext != null) {
            return unleashContext.zzh(str);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m$1(str, " is not defined"));
        return null;
    }

    public UnleashContext(UnleashContext unleashContext, zzz zzzVar) {
        this.properties = new HashMap();
        this.remoteAddress = new HashMap();
        this.userId = unleashContext;
        this.sessionId = zzzVar;
    }

    public UnleashContext(ViewGroup viewGroup, Function2 function2, Function2 function22, Function2 function23) {
        viewGroup.getClass();
        this.userId = function2;
        this.sessionId = function22;
        this.remoteAddress = function23;
        this.properties = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UnleashContext(final ViewGroup viewGroup) {
        this(viewGroup, new Function2() { // from class: app.cash.redwood.widget.ViewGroupChildren$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = r2;
                ViewGroup viewGroup2 = viewGroup;
                Integer num = (Integer) obj;
                switch (i) {
                    case 0:
                        int intValue = num.intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        viewGroup2.addView((View) widget.getValue(), intValue);
                        break;
                    case 1:
                        viewGroup2.removeViews(num.intValue(), ((Integer) obj2).intValue());
                        break;
                    default:
                        num.intValue();
                        ((Widget) obj2).getClass();
                        viewGroup2.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2() { // from class: app.cash.redwood.widget.ViewGroupChildren$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = r2;
                ViewGroup viewGroup2 = viewGroup;
                Integer num = (Integer) obj;
                switch (i) {
                    case 0:
                        int intValue = num.intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        viewGroup2.addView((View) widget.getValue(), intValue);
                        break;
                    case 1:
                        viewGroup2.removeViews(num.intValue(), ((Integer) obj2).intValue());
                        break;
                    default:
                        num.intValue();
                        ((Widget) obj2).getClass();
                        viewGroup2.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function2() { // from class: app.cash.redwood.widget.ViewGroupChildren$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = r2;
                ViewGroup viewGroup2 = viewGroup;
                Integer num = (Integer) obj;
                switch (i) {
                    case 0:
                        int intValue = num.intValue();
                        Widget widget = (Widget) obj2;
                        widget.getClass();
                        viewGroup2.addView((View) widget.getValue(), intValue);
                        break;
                    case 1:
                        viewGroup2.removeViews(num.intValue(), ((Integer) obj2).intValue());
                        break;
                    default:
                        num.intValue();
                        ((Widget) obj2).getClass();
                        viewGroup2.requestLayout();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
    }

    public UnleashContext(Navigator navigator, RealSupportNavigator realSupportNavigator, FlowStarter flowStarter, RealMoneyNavigatorHelper realMoneyNavigatorHelper, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl) {
        navigator.getClass();
        this.userId = navigator;
        this.sessionId = realSupportNavigator;
        this.remoteAddress = flowStarter;
        this.properties = realTransfersInboundNavigator$Factory$Impl;
    }

    public UnleashContext(Provider provider, CoroutineContext coroutineContext, CoroutineScope coroutineScope, StateFlow stateFlow) {
        provider.getClass();
        this.userId = provider;
        this.sessionId = coroutineContext;
        this.remoteAddress = coroutineScope;
        this.properties = stateFlow;
    }

    public UnleashContext(SyncValueReader syncValueReader, BankingBenefitsAppService bankingBenefitsAppService, AndroidStringManager androidStringManager, RealFamilyAccountsManager realFamilyAccountsManager, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.userId = syncValueReader;
        this.sessionId = bankingBenefitsAppService;
        this.remoteAddress = androidStringManager;
        this.properties = coroutineContext;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new AmountPickerCondensedView.AnonymousClass14(this, null, 12), 2);
    }

    public UnleashContext(CryptoService cryptoService, FlowStarter flowStarter, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        screen.getClass();
        this.userId = cryptoService;
        this.sessionId = flowStarter;
        this.remoteAddress = screen;
        if (scenarioPlanInput instanceof CryptoOnboardingScenarioPlanInput) {
            this.properties = ((CryptoOnboardingScenarioPlanInput) scenarioPlanInput).bitcoinFeature;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(CryptoOnboardingScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
    }

    public /* synthetic */ UnleashContext(Object obj, Object obj2, Object obj3, Object obj4) {
        this.userId = obj;
        this.sessionId = obj2;
        this.remoteAddress = obj3;
        this.properties = obj4;
    }

    public UnleashContext(Cipher cipher) {
        this.userId = null;
        this.sessionId = cipher;
        this.remoteAddress = null;
        this.properties = null;
    }

    public UnleashContext(RegularImmutableList regularImmutableList, NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices, Recorder.AnonymousClass1 anonymousClass1, NalUnitUtil$H265VideoSignalInfosAndIndices nalUnitUtil$H265VideoSignalInfosAndIndices2) {
        Object obj;
        if (regularImmutableList != null) {
            obj = ImmutableList.copyOf((Collection) regularImmutableList);
        } else {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            obj = RegularImmutableList.EMPTY;
        }
        this.userId = obj;
        this.sessionId = nalUnitUtil$H265VideoSignalInfosAndIndices;
        this.remoteAddress = anonymousClass1;
        this.properties = nalUnitUtil$H265VideoSignalInfosAndIndices2;
    }

    public zzao zza(zzao zzaoVar) {
        return ((zzz) this.sessionId).zzb(this, zzaoVar);
    }

    public UnleashContext zzc() {
        return new UnleashContext(this, (zzz) this.sessionId);
    }
}
