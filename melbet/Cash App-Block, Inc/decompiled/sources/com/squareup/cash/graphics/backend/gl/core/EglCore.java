package com.squareup.cash.graphics.backend.gl.core;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLES30;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.core.net.UriKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.directoryui.viewmodels.MissingMetadata;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.InvertedLuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.knotapi.knot.interfaces.KnotEventDelegate;
import com.knotapi.knot.models.KnotError;
import com.knotapi.knot.models.KnotEvent;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.RealAppMessageManager$reportMessageView$1;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter$deleteByMessageToken$2;
import com.squareup.cash.appmessages.db.TooltipMessageQueries$tooltipMessagesForPlacement$2;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.cashapppay.settings.backend.BusinessGrantManager$DeleteResult;
import com.squareup.cash.cashapppay.settings.backend.RealBusinessGrantManager$deleteBusinessGrant$1;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.knot.KnotAuthenticateStatus;
import com.squareup.cash.cdf.knot.KnotLinkMerchantExit;
import com.squareup.cash.cdf.knot.KnotLinkMerchantFailed;
import com.squareup.cash.cdf.knot.KnotLinkMerchantSuccess;
import com.squareup.cash.cdf.knot.KnotRefreshSession;
import com.squareup.cash.cdf.knot.KnotSelectMerchant;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.cdf.shophub.Metadata;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.documents.RealCryptoStatementSyncer$syncStatements$1;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.db.DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2;
import com.squareup.cash.family.familyhub.backend.api.BalanceType;
import com.squareup.cash.favorites.screens.FavoriteAdded;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.featureflags.AmplitudeExperiments$DefaultQrCodeTab;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashLocalProfileBrandMap;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowLocalProfileBrandMapWebRedirectFallback;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.ImageFormatConverter$ConversionResult;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$convertIfNeeded$1;
import com.squareup.cash.genie.backend.api.GenieAppConfig;
import com.squareup.cash.genie.backend.real.RealGenieSceneLoader$loadScene$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Geometry;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.gl.RealGlOperations;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.knot.backend.real.KnotEventConstants;
import com.squareup.cash.knot.backend.real.RealKnotEventDelegate$WhenMappings;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.backend.api.mappers.NextBestActionMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.NextBestAction;
import com.squareup.cash.moneybot.backend.real.managers.RealNextBestActionManager$getNextBestActions$1;
import com.squareup.cash.moneybot.backend.real.managers.RealNextBestActionManager$updateNextBestAction$1;
import com.squareup.cash.moneybot.presenters.RealMoneybotMemoryTooltipManager$dismissTooltip$1;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.prepurchasecashcard.navigation.RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.navigation.RealQrCodesInboundNavigator$Factory$Impl;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.views.camerax.RealByteArrayCondenser;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.real.RealSavingsTaxDocumentManager$syncTaxDocuments$1;
import com.squareup.cash.savings.db.SavingsGoalLocalStatusQueries$getGoalStatus$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.Storage;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand$Response$LocalBrandEntity;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrandEntity;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsClientRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetNextBestActionRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetNextBestActionResponse;
import com.squareup.protos.cash.kgoose.api.v3.NextBestAction;
import com.squareup.protos.cash.kgoose.api.v3.NextBestActionService;
import com.squareup.protos.cash.kgoose.api.v3.UpdateNextBestActionRequest;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.piggybank.appapi.Get1099IntStatementsRequest;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.app.UnlinkBusinessRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.lending.PlasmaPrepurchaseCashCardToggleFlowParameters;
import com.squareup.scannerview.SizeMap;
import com.squareup.scannerview.scanner.RealObjectScanner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;
import xyz.block.genie.GenieSession;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final class EglCore implements Material, ImageRequest.Listener, Geometry, KnotEventDelegate, HasObservability, ImageAnalysis.Analyzer, OffsetMapping {
    public final /* synthetic */ int $r8$classId;
    public Object eglConfig;
    public Object eglContext;
    public Object eglDisplay;

    public EglCore(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 16:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                defaultScheduler.getClass();
                this.eglDisplay = defaultScheduler;
                this.eglContext = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
                this.eglConfig = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
                break;
            case 17:
                this.eglDisplay = new Path();
                this.eglContext = new Outline();
                this.eglConfig = new Rect();
                break;
        }
    }

    public static void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m(str, ": EGL error: 0x", Integer.toHexString(eglGetError)));
    }

    public static void showAddedFavoriteSuccess$default(EglCore eglCore, String str, Image image, Color color, Character ch, boolean z) {
        eglCore.getClass();
        ((BetterNavigator.ScreenNavigator) eglCore.eglDisplay).goTo(new FavoriteAdded(str, null, image, color, ch, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void analyze(SettableImageProxy settableImageProxy) {
        byte[] bArr;
        byte[] bArr2;
        String tryDecodeSource;
        int i = settableImageProxy.mHeight;
        int i2 = settableImageProxy.mWidth;
        ImageProxy imageProxy = settableImageProxy.mImage;
        if (imageProxy.getFormat() != 35 && imageProxy.getFormat() != 39 && imageProxy.getFormat() != 40) {
            settableImageProxy.close();
            return;
        }
        int i3 = 0;
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ByteBuffer buffer = planeProxy.getBuffer();
        buffer.getClass();
        byte[] bArr3 = new byte[buffer.capacity()];
        buffer.get(bArr3);
        RealByteArrayCondenser realByteArrayCondenser = (RealByteArrayCondenser) this.eglConfig;
        int rowStride = planeProxy.getRowStride();
        int pixelStride = planeProxy.getPixelStride();
        realByteArrayCondenser.getClass();
        if (pixelStride != 1 || rowStride != i2) {
            byte[] bArr4 = new byte[i2 * i];
            if (pixelStride == 1) {
                int i4 = (i2 - pixelStride) + 1;
                int i5 = i - 1;
                for (int i6 = 0; i6 < i5; i6++) {
                    System.arraycopy(bArr3, i6 * rowStride, bArr4, i6 * i2, i4);
                }
            } else {
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = i7 * i2;
                    for (int i9 = 0; i9 < i2; i9++) {
                        bArr4[i8 + i9] = bArr3[(i9 * pixelStride) + (i7 * rowStride)];
                    }
                }
            }
            bArr3 = bArr4;
        }
        int rotationDegrees = settableImageProxy.mImageInfo.getRotationDegrees();
        if (rotationDegrees == 90) {
            bArr = new byte[i * i2];
            int i10 = 0;
            while (i3 < i2) {
                for (int i11 = i - 1; -1 < i11; i11--) {
                    bArr[i10] = bArr3[(i11 * i2) + i3];
                    i10++;
                }
                i3++;
            }
        } else if (rotationDegrees == 180) {
            bArr = new byte[i2 * i];
            for (int i12 = i - 1; -1 < i12; i12--) {
                for (int i13 = i2 - 1; -1 < i13; i13--) {
                    bArr[i3] = bArr3[(i12 * i2) + i13];
                    i3++;
                }
            }
        } else {
            if (rotationDegrees != 270) {
                bArr2 = bArr3;
                int i14 = (rotationDegrees != 90 || rotationDegrees == 270) ? i : i2;
                int i15 = (rotationDegrees != 90 || rotationDegrees == 270) ? i2 : i;
                ((RealObjectScanner) this.eglContext).getClass();
                PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr2, i14, i15, i14, i15);
                tryDecodeSource = RealObjectScanner.tryDecodeSource(planarYUVLuminanceSource);
                if (tryDecodeSource == null) {
                    tryDecodeSource = RealObjectScanner.tryDecodeSource(new InvertedLuminanceSource(planarYUVLuminanceSource));
                }
                if (tryDecodeSource != null) {
                    ((Function1) this.eglDisplay).invoke(tryDecodeSource);
                }
                settableImageProxy.close();
            }
            bArr = new byte[i * i2];
            int i16 = 0;
            for (int i17 = i2 - 1; -1 < i17; i17--) {
                for (int i18 = 0; i18 < i; i18++) {
                    bArr[i16] = bArr3[(i18 * i2) + i17];
                    i16++;
                }
            }
        }
        bArr2 = bArr;
        if (rotationDegrees != 90) {
        }
        if (rotationDegrees != 90) {
        }
        ((RealObjectScanner) this.eglContext).getClass();
        PlanarYUVLuminanceSource planarYUVLuminanceSource2 = new PlanarYUVLuminanceSource(bArr2, i14, i15, i14, i15);
        tryDecodeSource = RealObjectScanner.tryDecodeSource(planarYUVLuminanceSource2);
        if (tryDecodeSource == null) {
        }
        if (tryDecodeSource != null) {
        }
        settableImageProxy.close();
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public void bind(RealUniformBinder realUniformBinder) {
        InstancedCardBatch instancedCardBatch = (InstancedCardBatch) this.eglConfig;
        instancedCardBatch.albedoArray.bind(0);
        realUniformBinder.setInt(0, "uAlbedoArray");
        instancedCardBatch.normalArray.bind(1);
        realUniformBinder.setInt(1, "uNormalArray");
        instancedCardBatch.inkMetalHeatArray.bind(2);
        realUniformBinder.setInt(2, "uInkMetalHeatArray");
        GLES20.glActiveTexture(33987);
        HeatMaskRenderer heatMaskRenderer = instancedCardBatch.heatMaskRenderer;
        GLES20.glBindTexture(3553, heatMaskRenderer != null ? heatMaskRenderer.getTextureId() : instancedCardBatch.placeholderTextureId);
        realUniformBinder.setInt(3, "uHeatMaskTexture");
        instancedCardBatch.holoBaseArray.bind(4);
        realUniformBinder.setInt(4, "uHoloBaseArray");
        instancedCardBatch.holoReflectArray.bind(5);
        realUniformBinder.setInt(5, "uHoloReflectArray");
        GLES20.glActiveTexture(33990);
        GLES20.glBindTexture(3553, instancedCardBatch.heatColorsTextureId);
        realUniformBinder.setInt(6, "uHeatColorsTexture");
        GLES20.glActiveTexture(33991);
        GLES20.glBindTexture(3553, instancedCardBatch.shimmerTextureId);
        realUniformBinder.setInt(7, "uShimmerGradientTexture");
        GLES20.glActiveTexture(33992);
        GLES20.glBindTexture(3553, instancedCardBatch.snakeSkinTextureId);
        realUniformBinder.setInt(8, "uSnakeSkinTexture");
        GLES20.glActiveTexture(33993);
        GLES20.glBindTexture(3553, instancedCardBatch.placeholderTextureId);
        realUniformBinder.setInt(9, "uIconTexture");
        realUniformBinder.setFloat("uShimmerOffset", -1.0f);
        realUniformBinder.setFloat("uShimmerScale", 1.0f);
        realUniformBinder.setFloat("uIndicatorRadius", 0.4f);
        realUniformBinder.setFloat4("uIndicatorColor", RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uMaterialFade", 1.0f);
        realUniformBinder.setFloat("uDimmer", RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uCrossfadeMultiplier", instancedCardBatch.crossfadeMultiplier);
        realUniformBinder.setFloat("uIsDoubleSidedRendering", instancedCardBatch.getEntity().getNeedsDoubleSidedRendering() ? 1.0f : 0.0f);
        realUniformBinder.setFloat("uHeatIntensity", instancedCardBatch.heatIntensity);
        realUniformBinder.setFloat("uSimplifiedRendering", RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uRoughnessMultiplier", instancedCardBatch.roughnessMultiplier);
        realUniformBinder.setFloat("uHoloOffsetScale", 1.0f);
        realUniformBinder.setFloat("uHoloOffsetX", RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uHoloOffsetY", RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uHoloReflectionDirOffsetX", instancedCardBatch.holoReflectionDirOffsetX);
        realUniformBinder.setFloat("uHoloReflectionDirOffsetY", instancedCardBatch.holoReflectionDirOffsetY);
        realUniformBinder.setFloat4("uIconRect", RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat3("uBackMagStripeColor", 0.3f, 0.3f, 0.3f);
        realUniformBinder.setInt(12, "uIblCubemapMip0");
        realUniformBinder.setInt(13, "uIblCubemapMip1");
        realUniformBinder.setInt(14, "uIblCubemapMip2");
        realUniformBinder.setInt(15, "uIblCubemapMip3");
        realUniformBinder.setFloat("uIblNumMipLevels", 4.0f);
        realUniformBinder.setFloat("uIblIntensity", instancedCardBatch.iblIntensity);
        realUniformBinder.setFloat("uGyroOffsetX", RecyclerView.DECELERATION_RATE);
        realUniformBinder.setFloat("uGyroOffsetY", RecyclerView.DECELERATION_RATE);
        if (instancedCardBatch.uboId != 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(35725, iArr, 0);
            int glGetUniformBlockIndex = GLES30.glGetUniformBlockIndex(iArr[0], "CardInstanceData");
            if (glGetUniformBlockIndex != -1) {
                GLES30.glUniformBlockBinding(iArr[0], glGetUniformBlockIndex, 0);
                GLES30.glBindBufferBase(35345, 0, instancedCardBatch.uboId);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: convertIfNeeded-5y75sic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m3562convertIfNeeded5y75sic(String str, FileMetadata fileMetadata, ContinuationImpl continuationImpl) {
        RealImageFormatConverter$convertIfNeeded$1 realImageFormatConverter$convertIfNeeded$1;
        int i;
        String str2;
        FileMetadata fileMetadata2;
        Exception exc;
        if (continuationImpl instanceof RealImageFormatConverter$convertIfNeeded$1) {
            realImageFormatConverter$convertIfNeeded$1 = (RealImageFormatConverter$convertIfNeeded$1) continuationImpl;
            int i2 = realImageFormatConverter$convertIfNeeded$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realImageFormatConverter$convertIfNeeded$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realImageFormatConverter$convertIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realImageFormatConverter$convertIfNeeded$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!StringsKt__StringsJVMKt.startsWith(fileMetadata.mimeType, "image/", true)) {
                        return new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    }
                    String lowerCase = fileMetadata.mimeType.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int hashCode = lowerCase.hashCode();
                    if (hashCode == -1487394660 ? lowerCase.equals("image/jpeg") : hashCode == -879264467 ? lowerCase.equals("image/jpg") : hashCode == -879258763 && lowerCase.equals("image/png")) {
                        return new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    }
                    try {
                        realImageFormatConverter$convertIfNeeded$1.L$0 = str;
                        realImageFormatConverter$convertIfNeeded$1.L$1 = fileMetadata;
                        realImageFormatConverter$convertIfNeeded$1.label = 1;
                        try {
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            str2 = str;
                            fileMetadata2 = fileMetadata;
                        } catch (Exception e) {
                            e = e;
                            str2 = str;
                            fileMetadata2 = fileMetadata;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        Timber.Forest.e("Failed to convert image format, falling back to original", new Object[0], exc);
                        return new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    }
                    try {
                        obj = JobKt.withContext(DefaultIoScheduler.INSTANCE, new GLSceneScopeProvider$SceneScope$2$1$1(this, str2, fileMetadata2, (Continuation) null, 18), realImageFormatConverter$convertIfNeeded$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str2;
                        fileMetadata = fileMetadata2;
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        str = str2;
                        fileMetadata = fileMetadata2;
                        Timber.Forest.e("Failed to convert image format, falling back to original", new Object[0], exc);
                        return new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileMetadata = realImageFormatConverter$convertIfNeeded$1.L$1;
                    str = realImageFormatConverter$convertIfNeeded$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        Timber.Forest.e("Failed to convert image format, falling back to original", new Object[0], exc);
                        return new ImageFormatConverter$ConversionResult(str, fileMetadata);
                    }
                }
                return (ImageFormatConverter$ConversionResult) obj;
            }
        }
        realImageFormatConverter$convertIfNeeded$1 = new RealImageFormatConverter$convertIfNeeded$1(this, continuationImpl);
        Object obj2 = realImageFormatConverter$convertIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realImageFormatConverter$convertIfNeeded$1.label;
        if (i != 0) {
        }
        return (ImageFormatConverter$ConversionResult) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteBusinessGrant(String str, ContinuationImpl continuationImpl) {
        RealBusinessGrantManager$deleteBusinessGrant$1 realBusinessGrantManager$deleteBusinessGrant$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealBusinessGrantManager$deleteBusinessGrant$1) {
            realBusinessGrantManager$deleteBusinessGrant$1 = (RealBusinessGrantManager$deleteBusinessGrant$1) continuationImpl;
            int i2 = realBusinessGrantManager$deleteBusinessGrant$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBusinessGrantManager$deleteBusinessGrant$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBusinessGrantManager$deleteBusinessGrant$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBusinessGrantManager$deleteBusinessGrant$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = (AppService) this.eglDisplay;
                    UnlinkBusinessRequest unlinkBusinessRequest = new UnlinkBusinessRequest(null, str, ByteString.EMPTY);
                    realBusinessGrantManager$deleteBusinessGrant$1.label = 1;
                    obj = appService.unlinkBusiness(unlinkBusinessRequest, realBusinessGrantManager$deleteBusinessGrant$1);
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
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    return BusinessGrantManager$DeleteResult.Failed.INSTANCE;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return BusinessGrantManager$DeleteResult.Success.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realBusinessGrantManager$deleteBusinessGrant$1 = new RealBusinessGrantManager$deleteBusinessGrant$1(this, continuationImpl);
        Object obj2 = realBusinessGrantManager$deleteBusinessGrant$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBusinessGrantManager$deleteBusinessGrant$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
        }
        return BusinessGrantManager$DeleteResult.Failed.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dismissTooltip(String str, ContinuationImpl continuationImpl) {
        RealMoneybotMemoryTooltipManager$dismissTooltip$1 realMoneybotMemoryTooltipManager$dismissTooltip$1;
        int i;
        RealAppMessageManager realAppMessageManager = (RealAppMessageManager) this.eglDisplay;
        CoroutineScope coroutineScope = realAppMessageManager.scope;
        if (continuationImpl instanceof RealMoneybotMemoryTooltipManager$dismissTooltip$1) {
            realMoneybotMemoryTooltipManager$dismissTooltip$1 = (RealMoneybotMemoryTooltipManager$dismissTooltip$1) continuationImpl;
            int i2 = realMoneybotMemoryTooltipManager$dismissTooltip$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotMemoryTooltipManager$dismissTooltip$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotMemoryTooltipManager$dismissTooltip$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotMemoryTooltipManager$dismissTooltip$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str.getClass();
                    int i4 = 0;
                    JobKt.launch$default(coroutineScope, null, null, new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation, i4), 3);
                    realMoneybotMemoryTooltipManager$dismissTooltip$1.L$0 = str;
                    realMoneybotMemoryTooltipManager$dismissTooltip$1.label = 1;
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = realAppMessageManager.repository;
                    Object withContext = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new RealAppMessageRepositoryWriter$deleteByMessageToken$2(realAppMessageRepositoryWriter, str, continuation, i4), realMoneybotMemoryTooltipManager$dismissTooltip$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realMoneybotMemoryTooltipManager$dismissTooltip$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                str.getClass();
                JobKt.launch$default(coroutineScope, null, null, new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation, i3), 3);
                return Unit.INSTANCE;
            }
        }
        realMoneybotMemoryTooltipManager$dismissTooltip$1 = new RealMoneybotMemoryTooltipManager$dismissTooltip$1(this, continuationImpl);
        Object obj3 = realMoneybotMemoryTooltipManager$dismissTooltip$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotMemoryTooltipManager$dismissTooltip$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        str.getClass();
        JobKt.launch$default(coroutineScope, null, null, new RealAppMessageManager$reportMessageView$1(realAppMessageManager, str, continuation2, i32), 3);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public void draw() {
        MeshGeometry meshGeometry = (MeshGeometry) this.eglDisplay;
        SubMesh subMesh = (SubMesh) this.eglContext;
        int i = subMesh.indexOffset;
        int i2 = subMesh.indexCount;
        RealGlOperations realGlOperations = meshGeometry.glOps;
        if (meshGeometry.vboId == 0 || meshGeometry.iboId == 0) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("MeshGeometry");
            forest.w("Attempting to draw submesh before buffers are ready", new Object[0]);
        } else {
            GLES30.glBindVertexArray(meshGeometry.getOrCreateVAO());
            GLES20.glDrawElements(4, i2, 5125, i * 4);
            GLES30.glBindVertexArray(0);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public AABB getAABB() {
        return ((MeshGeometry) this.eglDisplay).getAABB();
    }

    public List getCertificateChain() {
        return (List) this.eglContext;
    }

    public EGLConfig getConfig(int i) {
        int[] iArr = {24, 16};
        for (int i2 = 0; i2 < 2; i2++) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglChooseConfig((EGLDisplay) this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, iArr[i2], 12352, i == 3 ? 68 : 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0) {
                return eGLConfigArr[0];
            }
        }
        return null;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public Flow getDirty() {
        return EmptyFlow.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.eglDisplay;
    }

    public RealAttestedKeyService.KeyAlgorithm getKeyAlgorithm() {
        return (RealAttestedKeyService.KeyAlgorithm) this.eglConfig;
    }

    public PrivateKey getKeyHandler() {
        return (PrivateKey) this.eglDisplay;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNextBestActions(ContinuationImpl continuationImpl) {
        RealNextBestActionManager$getNextBestActions$1 realNextBestActionManager$getNextBestActions$1;
        int i;
        ApiResult apiResult;
        String reportIfNullAndContinue;
        NextBestAction.Cta cta;
        NextBestAction nextBestAction;
        if (continuationImpl instanceof RealNextBestActionManager$getNextBestActions$1) {
            realNextBestActionManager$getNextBestActions$1 = (RealNextBestActionManager$getNextBestActions$1) continuationImpl;
            int i2 = realNextBestActionManager$getNextBestActions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNextBestActionManager$getNextBestActions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realNextBestActionManager$getNextBestActions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNextBestActionManager$getNextBestActions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NextBestActionService nextBestActionService = (NextBestActionService) this.eglConfig;
                    GetNextBestActionRequest getNextBestActionRequest = new GetNextBestActionRequest(null, EmptyList.INSTANCE, ByteString.EMPTY);
                    realNextBestActionManager$getNextBestActions$1.label = 1;
                    obj = nextBestActionService.getNextBestAction(getNextBestActionRequest, realNextBestActionManager$getNextBestActions$1);
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
                    return apiResult;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List<com.squareup.protos.cash.kgoose.api.v3.NextBestAction> list = ((GetNextBestActionResponse) ((ApiResult.Success) apiResult).response).actions;
                ArrayList arrayList = new ArrayList();
                for (com.squareup.protos.cash.kgoose.api.v3.NextBestAction nextBestAction2 : list) {
                    nextBestAction2.getClass();
                    PatternRedaction patternRedaction = new PatternRedaction((String) null, (String) null, 1);
                    try {
                        ProtoValidationScope protoValidationScope = new ProtoValidationScope(nextBestAction2, patternRedaction, this);
                        String str = (String) protoValidationScope.reportIfNullAndContinue("next_best_action_id", (String) null, nextBestAction2.next_best_action_id);
                        if (str != null && (reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(nextBestAction2.title, "title", (String) null)) != null) {
                            String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(nextBestAction2.subtitle, "subtitle", (String) null);
                            String str2 = nextBestAction2.category;
                            NextBestAction.CtaTapAction ctaTapAction = (NextBestAction.CtaTapAction) protoValidationScope.reportIfNullAndContinue("cta_tap_action", (String) null, nextBestAction2.cta_tap_action);
                            if (ctaTapAction != null && (cta = NextBestActionMappersKt.toCta(protoValidationScope, ctaTapAction, patternRedaction, protoValidationScope.reportIfNullAndContinue(nextBestAction2.cta_text, "cta_text", (String) null))) != null) {
                                nextBestAction = new com.squareup.cash.moneybot.backend.api.model.chat.NextBestAction(str, reportIfNullAndContinue, reportIfNullAndContinue2, str2, cta);
                                if (nextBestAction == null) {
                                    arrayList.add(nextBestAction);
                                }
                            }
                        }
                        nextBestAction = null;
                        if (nextBestAction == null) {
                        }
                    } catch (Exception e) {
                        throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.NextBestAction.class), patternRedaction, null);
                    }
                }
                return new ApiResult.Success(arrayList);
            }
        }
        realNextBestActionManager$getNextBestActions$1 = new RealNextBestActionManager$getNextBestActions$1(this, continuationImpl);
        Object obj2 = realNextBestActionManager$getNextBestActions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNextBestActionManager$getNextBestActions$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.eglContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrepurchaseToggleFlowScreen(Screen screen, PlasmaPrepurchaseCashCardToggleFlowParameters plasmaPrepurchaseCashCardToggleFlowParameters, Screen screen2, ContinuationImpl continuationImpl) {
        RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1;
        int i;
        BlockersData blockersData;
        GetFlowRequest getFlowRequest;
        Screen screen3;
        ApiResult apiResult;
        FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) this.eglConfig;
        if (continuationImpl instanceof RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1) {
            realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 = (RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1) continuationImpl;
            int i2 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1;
                Object obj = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.label;
                RequestContext requestContext = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersScreens.StartFlowEntryPoint startPlasmaFlowWithParams$default = FlowStarter.startPlasmaFlowWithParams$default((FlowStarter) this.eglContext, Flow$Type.TOGGLE_PREPURCHASE, plasmaPrepurchaseCashCardToggleFlowParameters, screen2, null, screen2, null, null, 984);
                    blockersData = startPlasmaFlowWithParams$default.getBlockersData();
                    String initiationData = startPlasmaFlowWithParams$default.getInitiationData();
                    if (initiationData == null) {
                        Flow$Type flow$Type = blockersData.flowType;
                        flow$Type.getClass();
                        getFlowRequest = new GetFlowRequest(requestContext, new GetFlowRequest.Input.FlowType(flow$Type), 5);
                    } else {
                        getFlowRequest = new GetFlowRequest(blockersData.requestContext, new GetFlowRequest.Input.InitiationData(initiationData), 4);
                    }
                    AppService appService = (AppService) this.eglDisplay;
                    BlockersData.MoneybotContext moneybotContext = blockersData.moneybotContext;
                    String str = moneybotContext != null ? moneybotContext.sessionId : null;
                    String str2 = moneybotContext != null ? moneybotContext.toolRequestId : null;
                    screen3 = screen;
                    realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.L$0 = screen3;
                    realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.L$4 = blockersData;
                    realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.label = 1;
                    obj = appService.getFlow("/2.0/cash/get-flow", str, str2, getFlowRequest, realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BlockersData blockersData2 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.L$4;
                    Screen screen4 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    blockersData = blockersData2;
                    screen3 = screen4;
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return flowNavigationHelper.getFlowFailureScreen(screen3, (ApiResult.Failure) apiResult, blockersData);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ApiResult.Success success = (ApiResult.Success) apiResult;
                ResponseContext responseContext = ((GetFlowResponse) success.response).response_context;
                responseContext.getClass();
                ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                return flowNavigationHelper.getFlowSuccessScreen(screen3, success, blockersData, false);
            }
        }
        realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 = new RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1(this, continuationImpl);
        RealPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1 realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$122 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$1;
        Object obj2 = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPrepurchaseCashCardGetFlowHandler$getPrepurchaseToggleFlowScreen$122.label;
        RequestContext requestContext2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public Material.ProgramSource getProgramSource() {
        return (Material.ProgramSource) ((Lazy) this.eglContext).getValue();
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Material
    public StateFlow getReady() {
        switch (this.$r8$classId) {
            case 1:
                return (StateFlowImpl) this.eglDisplay;
            default:
                return (ReadonlyStateFlow) this.eglConfig;
        }
    }

    public FlowQuery$mapToList$$inlined$map$1 getTaxDocuments() {
        GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.eglConfig;
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0 = new RealSandboxer$$ExternalSyntheticLambda0(gpsConfigQueries, 9);
        sqlDriver.getClass();
        return DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(1007438837, new String[]{"savingsTaxDocument"}, sqlDriver, "SavingsTaxDocument.sq", "selectAll", "SELECT savingsTaxDocument.document FROM savingsTaxDocument", realSandboxer$$ExternalSyntheticLambda0)), (CoroutineContext) this.eglContext);
    }

    public void goToCashQrCodeScanner(boolean z) {
        RealQrCodesInboundNavigator$Factory$Impl realQrCodesInboundNavigator$Factory$Impl = (RealQrCodesInboundNavigator$Factory$Impl) this.eglDisplay;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.eglConfig;
        Analytics analytics = (Analytics) realQrCodesInboundNavigator$Factory$Impl.delegateFactory.sandboxer.invoke();
        analytics.getClass();
        Screen screen = null;
        if (!z) {
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.eglContext)).peekCurrentValue(AmplitudeExperiments$DefaultQrCodeTab.INSTANCE)).enabled()) {
                analytics.track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.QR_CODE, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
                screenNavigator.goTo(new QrCodeScreen(Back.INSTANCE));
                return;
            }
        }
        analytics.track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.QR_CODE, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
        screenNavigator.goTo(new CashQrCodeScanner(screen, z, 1));
    }

    public Flow lastBalanceSeen(BalanceType balanceType, String str) {
        str.getClass();
        if (balanceType instanceof BalanceType.Goal) {
            GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.eglContext;
            String str2 = ((BalanceType.Goal) balanceType).goalToken;
            gpsConfigQueries.getClass();
            str2.getClass();
            SavingsGoalLocalStatusQueries$getGoalStatus$2 savingsGoalLocalStatusQueries$getGoalStatus$2 = SavingsGoalLocalStatusQueries$getGoalStatus$2.INSTANCE;
            return new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, str2, new RealSandboxer$$ExternalSyntheticLambda0(gpsConfigQueries))), (CoroutineContext) this.eglDisplay), 12);
        }
        int i = 2;
        Continuation continuation = null;
        if (balanceType.equals(BalanceType.GeneralSavings.INSTANCE)) {
            return queryDependentSavings(str, new DataStoreImpl$data$1.AnonymousClass2(i, continuation, 20));
        }
        if (balanceType.equals(BalanceType.Savings.INSTANCE)) {
            return queryDependentSavings(str, new DataStoreImpl$data$1.AnonymousClass2(i, continuation, 21));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r13 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable loadScene(String str, ContinuationImpl continuationImpl) {
        RealGenieSceneLoader$loadScene$1 realGenieSceneLoader$loadScene$1;
        int i;
        try {
            if (continuationImpl instanceof RealGenieSceneLoader$loadScene$1) {
                realGenieSceneLoader$loadScene$1 = (RealGenieSceneLoader$loadScene$1) continuationImpl;
                int i2 = realGenieSceneLoader$loadScene$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realGenieSceneLoader$loadScene$1.label = i2 - PKIFailureInfo.systemUnavail;
                    RealGenieSceneLoader$loadScene$1 realGenieSceneLoader$loadScene$12 = realGenieSceneLoader$loadScene$1;
                    Object obj = realGenieSceneLoader$loadScene$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGenieSceneLoader$loadScene$12.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        GenieSession.Companion companion = GenieSession.Companion;
                        String str2 = (String) this.eglDisplay;
                        String str3 = (String) this.eglContext;
                        SizeMap sizeMap = (SizeMap) this.eglConfig;
                        realGenieSceneLoader$loadScene$12.L$0 = str;
                        realGenieSceneLoader$loadScene$12.label = 1;
                        obj = companion.create("https://genie.stage.sqprod.co", "moneybot2", "e3e75e824e19bb57e1a9b878278e6db52de940a667d2a09a90715ebb4c3dbc2f", str2, str3, sizeMap, realGenieSceneLoader$loadScene$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = realGenieSceneLoader$loadScene$12.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return (ViewPlan) obj;
                        }
                        str = realGenieSceneLoader$loadScene$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    realGenieSceneLoader$loadScene$12.L$0 = str;
                    realGenieSceneLoader$loadScene$12.label = 2;
                    obj = ((GenieSession) obj).fetchScene(str, realGenieSceneLoader$loadScene$12);
                }
            }
            if (i != 0) {
            }
            realGenieSceneLoader$loadScene$12.L$0 = str;
            realGenieSceneLoader$loadScene$12.label = 2;
            obj = ((GenieSession) obj).fetchScene(str, realGenieSceneLoader$loadScene$12);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Timber.Forest.e("Failed to fetch Genie scene slug=%s", new Object[]{str}, e2);
            return null;
        }
        realGenieSceneLoader$loadScene$1 = new RealGenieSceneLoader$loadScene$1(this, continuationImpl);
        RealGenieSceneLoader$loadScene$1 realGenieSceneLoader$loadScene$122 = realGenieSceneLoader$loadScene$1;
        Object obj2 = realGenieSceneLoader$loadScene$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGenieSceneLoader$loadScene$122.label;
    }

    public Boolean navigateToBrandProfile(String str, Recipient recipient, String str2, String str3, String str4) {
        String str5;
        LocalBrandProfileScreen localBrandProfileScreen;
        String str6;
        MenuHoursKt menuHoursKt;
        LocalBrand localBrand;
        String str7;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) ((FeatureFlagManager) this.eglDisplay);
        LocalBrandProfileScreen localBrandProfileScreen2 = null;
        if (!Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting.INSTANCE)).value, "BRAND_PROFILE_MAP_REROUTING") || (str7 = (String) ((JsonFeatureFlags$CashLocalProfileBrandMap.Brands) ((FeatureFlag$JsonFeatureFlag.Options) realFeatureFlagManager.peekCurrentValue(JsonFeatureFlags$CashLocalProfileBrandMap.INSTANCE)).value).brands.getOrDefault(str, null)) == null) {
            str5 = str3;
            localBrandProfileScreen = null;
        } else {
            localBrandProfileScreen = new LocalBrandProfileScreen(new BrandSpot(str7, null), new AttributionKey(str2), (MarketingMessageOfferDetails) null, (String) null, str4, (BrandSpotSyncTokens) null, str3, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
            str5 = str3;
        }
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$AllowLocalProfileBrandMapWebRedirectFallback.INSTANCE)).enabled();
        if (recipient == null && localBrandProfileScreen != null) {
            localBrandProfileScreen2 = localBrandProfileScreen;
        } else {
            if (recipient == null && enabled) {
                if (str5 != null) {
                    ((IntentLauncher) this.eglContext).launchUrlInExternalBrowser(str5);
                }
                return Boolean.TRUE;
            }
            if ((recipient != null ? recipient.localBrand : null) != null) {
                com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand localBrand2 = recipient.localBrand;
                if (localBrand2 != null && (menuHoursKt = localBrand2.response) != null) {
                    LocalBrand$Response$LocalBrandEntity localBrand$Response$LocalBrandEntity = menuHoursKt instanceof LocalBrand$Response$LocalBrandEntity ? (LocalBrand$Response$LocalBrandEntity) menuHoursKt : null;
                    LocalBrandEntity localBrandEntity = localBrand$Response$LocalBrandEntity != null ? localBrand$Response$LocalBrandEntity.value : null;
                    if (localBrandEntity != null && (localBrand = localBrandEntity.brand) != null) {
                        str6 = localBrand.token;
                        str6.getClass();
                        localBrandProfileScreen2 = new LocalBrandProfileScreen(new BrandSpot(str6, null), new AttributionKey(str2), (MarketingMessageOfferDetails) null, (String) null, str4, (BrandSpotSyncTokens) null, str5, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
                    }
                }
                str6 = null;
                str6.getClass();
                localBrandProfileScreen2 = new LocalBrandProfileScreen(new BrandSpot(str6, null), new AttributionKey(str2), (MarketingMessageOfferDetails) null, (String) null, str4, (BrandSpotSyncTokens) null, str5, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
            }
        }
        if (localBrandProfileScreen2 == null) {
            return Boolean.FALSE;
        }
        ((Navigator) this.eglConfig).goTo(localBrandProfileScreen2);
        return Boolean.TRUE;
    }

    @Override // com.knotapi.knot.interfaces.KnotEventDelegate
    public void onError(KnotError knotError) {
        KnotLinkMerchantFailed.KnotLinkFailedReason knotLinkFailedReason;
        knotError.getClass();
        Analytics analytics = (Analytics) this.eglContext;
        switch (RealKnotEventDelegate$WhenMappings.$EnumSwitchMapping$0[knotError.ordinal()]) {
            case 1:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INVALID_SESSION;
                break;
            case 2:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.EXPIRED_SESSION;
                break;
            case 3:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INVALID_CLIENT_ID;
                break;
            case 4:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INTERNAL_ERROR;
                break;
            case 5:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INVALID_CARD_NAME;
                break;
            case 6:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INVALID_CUSTOMER_NAME;
                break;
            case 7:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.INVALID_LOGO_ID;
                break;
            case 8:
                knotLinkFailedReason = KnotLinkMerchantFailed.KnotLinkFailedReason.MERCHANT_ID_NOT_FOUND;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        analytics.track(new KnotLinkMerchantFailed(knotLinkFailedReason), null);
    }

    @Override // com.knotapi.knot.interfaces.KnotEventDelegate
    public void onEvent(KnotEvent knotEvent) {
        Analytics analytics = (Analytics) this.eglContext;
        knotEvent.getClass();
        String event = knotEvent.getEvent();
        KnotEventConstants[] knotEventConstantsArr = KnotEventConstants.$VALUES;
        if (Intrinsics.areEqual(event, "REFRESH_SESSION_REQUEST")) {
            analytics.track(new KnotRefreshSession((String) this.eglConfig), null);
            return;
        }
        if (Intrinsics.areEqual(event, "MERCHANT_CLICKED")) {
            analytics.track(new KnotSelectMerchant(knotEvent.getMerchantId(), knotEvent.getMerchantName()), null);
            return;
        }
        if (Intrinsics.areEqual(event, "LOGIN_STARTED")) {
            String merchantId = knotEvent.getMerchantId();
            merchantId.getClass();
            String merchantName = knotEvent.getMerchantName();
            merchantName.getClass();
            analytics.track(new KnotAuthenticateStatus(merchantId, merchantName, KnotAuthenticateStatus.AuthenticationStatus.STARTED, null), null);
            return;
        }
        if (Intrinsics.areEqual(event, "AUTHENTICATED")) {
            String merchantId2 = knotEvent.getMerchantId();
            merchantId2.getClass();
            String merchantName2 = knotEvent.getMerchantName();
            merchantName2.getClass();
            analytics.track(new KnotAuthenticateStatus(merchantId2, merchantName2, KnotAuthenticateStatus.AuthenticationStatus.SUCCESS, null), null);
            return;
        }
        if (Intrinsics.areEqual(event, "OTP_REQUIRED")) {
            String merchantId3 = knotEvent.getMerchantId();
            merchantId3.getClass();
            String merchantName3 = knotEvent.getMerchantName();
            merchantName3.getClass();
            trackAuthenticateRequirement(merchantId3, merchantName3, KnotAuthenticateStatus.RequirementType.OTP_REQUIRED);
            return;
        }
        if (Intrinsics.areEqual(event, "SECURITY_QUESTIONS_REQUIRED")) {
            String merchantId4 = knotEvent.getMerchantId();
            merchantId4.getClass();
            String merchantName4 = knotEvent.getMerchantName();
            merchantName4.getClass();
            trackAuthenticateRequirement(merchantId4, merchantName4, KnotAuthenticateStatus.RequirementType.SECURITY_QUESTIONS_REQUIRED);
            return;
        }
        if (Intrinsics.areEqual(event, "APPROVAL_REQUIRED")) {
            String merchantId5 = knotEvent.getMerchantId();
            merchantId5.getClass();
            String merchantName5 = knotEvent.getMerchantName();
            merchantName5.getClass();
            trackAuthenticateRequirement(merchantId5, merchantName5, KnotAuthenticateStatus.RequirementType.APPROVAL_REQUIRED);
            return;
        }
        if (Intrinsics.areEqual(event, "ZIPCODE_REQUIRED")) {
            String merchantId6 = knotEvent.getMerchantId();
            merchantId6.getClass();
            String merchantName6 = knotEvent.getMerchantName();
            merchantName6.getClass();
            trackAuthenticateRequirement(merchantId6, merchantName6, KnotAuthenticateStatus.RequirementType.ZIPCODE_REQUIRED);
            return;
        }
        if (Intrinsics.areEqual(event, "LICENSE_REQUIRED")) {
            String merchantId7 = knotEvent.getMerchantId();
            merchantId7.getClass();
            String merchantName7 = knotEvent.getMerchantName();
            merchantName7.getClass();
            trackAuthenticateRequirement(merchantId7, merchantName7, KnotAuthenticateStatus.RequirementType.LICENSE_REQUIRED);
        }
    }

    @Override // com.knotapi.knot.interfaces.KnotEventDelegate
    public void onExit() {
        ((Analytics) this.eglContext).track(new KnotLinkMerchantExit(), null);
    }

    @Override // com.knotapi.knot.interfaces.KnotEventDelegate
    public void onSuccess(String str) {
        str.getClass();
        ((Analytics) this.eglContext).track(new KnotLinkMerchantSuccess(str), null);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        ArrayList arrayList = (ArrayList) this.eglDisplay;
        CurrencyConfig currencyConfig = (CurrencyConfig) ((zzb) this.eglContext).zza;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((FakeTextFieldBuffer$BufferEntry) it.next()).getChar() == currencyConfig.decimalSeparator) {
                    int i2 = 0;
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((FakeTextFieldBuffer$BufferEntry) it2.next()).getChar() == currencyConfig.groupingSeparator && (i2 = i2 + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                    return i + i2;
                }
            }
        }
        return arrayList.size();
    }

    public Transform$special$$inlined$map$1 queryDependentSavings(String str, Function2 function2) {
        GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.eglConfig;
        gpsConfigQueries.getClass();
        str.getClass();
        int i = DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2.$r8$clinit;
        return new Transform$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, str, new RecipientQueries$$ExternalSyntheticLambda0(gpsConfigQueries, (char) 0))), (CoroutineContext) this.eglDisplay), function2, 1);
    }

    public void showFavorite(UUID uuid, com.squareup.cash.recipients.data.Recipient recipient, Screen screen) {
        Screen profileFor;
        recipient.getClass();
        screen.getClass();
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.eglDisplay;
        if (uuid == null) {
            uuid = RealUuidGenerator.generate();
        }
        UUID uuid2 = uuid;
        CustomerProfileViewOpen.EntryPoint entryPoint = CustomerProfileViewOpen.EntryPoint.CELL;
        LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
        profileFor = ProfileLauncher.profileFor(UriKt.buildCustomerFromRecipient(recipient), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, uuid2, GetProfileDetailsContext.UNKNOWN, entryPoint, screen, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
        screenNavigator.goTo(profileFor);
    }

    public void showListFavorites(PersonalProfileViewOpenScreen.EntryPoint entryPoint) {
        ((Analytics) this.eglConfig).track(new PersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.FAVORITES, entryPoint), null);
        ((BetterNavigator.ScreenNavigator) this.eglDisplay).goTo(new ListFavorites(RealUuidGenerator.generate()));
    }

    public void showNoNetworkConnection() {
        ((BetterNavigator.ScreenNavigator) this.eglDisplay).goTo(new FavoritesMessage("", ((AndroidStringManager) this.eglContext).get(R.string.no_internet_connection)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r4, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncStatements(ContinuationImpl continuationImpl) {
        RealCryptoStatementSyncer$syncStatements$1 realCryptoStatementSyncer$syncStatements$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealCryptoStatementSyncer$syncStatements$1) {
            realCryptoStatementSyncer$syncStatements$1 = (RealCryptoStatementSyncer$syncStatements$1) continuationImpl;
            int i2 = realCryptoStatementSyncer$syncStatements$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoStatementSyncer$syncStatements$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCryptoStatementSyncer$syncStatements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoStatementSyncer$syncStatements$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoService cryptoService = (CryptoService) this.eglDisplay;
                    GetCryptoTaxStatementsClientRequest getCryptoTaxStatementsClientRequest = new GetCryptoTaxStatementsClientRequest(ByteString.EMPTY);
                    realCryptoStatementSyncer$syncStatements$1.label = 1;
                    obj = cryptoService.getCryptoStatements(getCryptoTaxStatementsClientRequest, realCryptoStatementSyncer$syncStatements$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return Unit.INSTANCE;
                }
                GetCryptoTaxStatementsResponse getCryptoTaxStatementsResponse = (GetCryptoTaxStatementsResponse) ((ApiResult.Success) apiResult).response;
                CoroutineContext coroutineContext = (CoroutineContext) this.eglContext;
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(this, getCryptoTaxStatementsResponse, continuation, 17);
                realCryptoStatementSyncer$syncStatements$1.label = 2;
            }
        }
        realCryptoStatementSyncer$syncStatements$1 = new RealCryptoStatementSyncer$syncStatements$1(this, continuationImpl);
        Object obj2 = realCryptoStatementSyncer$syncStatements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoStatementSyncer$syncStatements$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r4, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncTaxDocuments(ContinuationImpl continuationImpl) {
        RealSavingsTaxDocumentManager$syncTaxDocuments$1 realSavingsTaxDocumentManager$syncTaxDocuments$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealSavingsTaxDocumentManager$syncTaxDocuments$1) {
            realSavingsTaxDocumentManager$syncTaxDocuments$1 = (RealSavingsTaxDocumentManager$syncTaxDocuments$1) continuationImpl;
            int i2 = realSavingsTaxDocumentManager$syncTaxDocuments$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSavingsTaxDocumentManager$syncTaxDocuments$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSavingsTaxDocumentManager$syncTaxDocuments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSavingsTaxDocumentManager$syncTaxDocuments$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PiggybankAppService piggybankAppService = (PiggybankAppService) this.eglDisplay;
                    Get1099IntStatementsRequest get1099IntStatementsRequest = new Get1099IntStatementsRequest(null, ByteString.EMPTY);
                    realSavingsTaxDocumentManager$syncTaxDocuments$1.label = 1;
                    obj = piggybankAppService.get1099IntStatements(get1099IntStatementsRequest, realSavingsTaxDocumentManager$syncTaxDocuments$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.e("Failed to sync savings tax documents", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                CoroutineContext coroutineContext = (CoroutineContext) this.eglContext;
                ProfileCropView.AnonymousClass3 anonymousClass3 = new ProfileCropView.AnonymousClass3(this, (ApiResult.Success) apiResult, continuation, 7);
                realSavingsTaxDocumentManager$syncTaxDocuments$1.label = 2;
            }
        }
        realSavingsTaxDocumentManager$syncTaxDocuments$1 = new RealSavingsTaxDocumentManager$syncTaxDocuments$1(this, continuationImpl);
        Object obj2 = realSavingsTaxDocumentManager$syncTaxDocuments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSavingsTaxDocumentManager$syncTaxDocuments$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public void trackAuthenticateRequirement(String str, String str2, KnotAuthenticateStatus.RequirementType requirementType) {
        ((Analytics) this.eglContext).track(new KnotAuthenticateStatus(str, str2, KnotAuthenticateStatus.AuthenticationStatus.REQUIREMENT_NEEDED, requirementType), null);
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        String str = (String) this.eglConfig;
        ArrayList arrayList = (ArrayList) this.eglDisplay;
        CurrencyConfig currencyConfig = (CurrencyConfig) ((zzb) this.eglContext).zza;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((FakeTextFieldBuffer$BufferEntry) it.next()).getChar() == currencyConfig.decimalSeparator) {
                    int i2 = 0;
                    List subList = arrayList.subList(0, i);
                    if (!(subList instanceof Collection) || !subList.isEmpty()) {
                        Iterator it2 = subList.iterator();
                        while (it2.hasNext()) {
                            if (((FakeTextFieldBuffer$BufferEntry) it2.next()).getChar() == currencyConfig.groupingSeparator && (i2 = i2 + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    }
                    int i3 = i - i2;
                    int length = str.length();
                    return i3 > length ? length : i3;
                }
            }
        }
        return str.length();
    }

    public Unit updateLastBalanceSeen(BalanceType balanceType, final Money money, final String str) {
        final GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.eglConfig;
        gpsConfigQueries.getClass();
        str.getClass();
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        int i = 25;
        sqlDriver.execute(1222867860, "INSERT OR IGNORE\nINTO dependentLastSeenSavingsBalance (customer_token)\nVALUES (?)", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, i));
        gpsConfigQueries.notifyQueries(1222867860, new StoryQueries$$ExternalSyntheticLambda0(24));
        if (balanceType.equals(BalanceType.GeneralSavings.INSTANCE)) {
            final int i2 = 0;
            sqlDriver.execute(-273973043, "UPDATE dependentLastSeenSavingsBalance\nSET general_balance = ?\nWHERE customer_token = ?", new Function1() { // from class: com.squareup.cash.family.db.DependentLastSeenSavingsBalanceQueries$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    GpsConfigQueries gpsConfigQueries2 = gpsConfigQueries;
                    String str2 = str;
                    Money money2 = money;
                    AndroidStatement androidStatement = (AndroidStatement) obj;
                    androidStatement.getClass();
                    switch (i3) {
                        case 0:
                            androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.encode(money2));
                            androidStatement.bindString(1, str2);
                            break;
                        default:
                            androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.encode(money2));
                            androidStatement.bindString(1, str2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            gpsConfigQueries.notifyQueries(-273973043, new StoryQueries$$ExternalSyntheticLambda0(i));
        } else {
            if (!balanceType.equals(BalanceType.Savings.INSTANCE)) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) balanceType, "Should not use this API to update ");
                return null;
            }
            final int i3 = 1;
            sqlDriver.execute(-591274020, "UPDATE dependentLastSeenSavingsBalance\nSET balance = ?\nWHERE customer_token = ?", new Function1() { // from class: com.squareup.cash.family.db.DependentLastSeenSavingsBalanceQueries$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i3;
                    GpsConfigQueries gpsConfigQueries2 = gpsConfigQueries;
                    String str2 = str;
                    Money money2 = money;
                    AndroidStatement androidStatement = (AndroidStatement) obj;
                    androidStatement.getClass();
                    switch (i32) {
                        case 0:
                            androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.encode(money2));
                            androidStatement.bindString(1, str2);
                            break;
                        default:
                            androidStatement.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.encode(money2));
                            androidStatement.bindString(1, str2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            gpsConfigQueries.notifyQueries(-591274020, new StoryQueries$$ExternalSyntheticLambda0(26));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNextBestAction(String str, ContinuationImpl continuationImpl) {
        RealNextBestActionManager$updateNextBestAction$1 realNextBestActionManager$updateNextBestAction$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealNextBestActionManager$updateNextBestAction$1) {
            realNextBestActionManager$updateNextBestAction$1 = (RealNextBestActionManager$updateNextBestAction$1) continuationImpl;
            int i2 = realNextBestActionManager$updateNextBestAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNextBestActionManager$updateNextBestAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realNextBestActionManager$updateNextBestAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNextBestActionManager$updateNextBestAction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NextBestActionService nextBestActionService = (NextBestActionService) this.eglConfig;
                    UpdateNextBestActionRequest updateNextBestActionRequest = new UpdateNextBestActionRequest(str, ByteString.EMPTY);
                    realNextBestActionManager$updateNextBestAction$1.label = 1;
                    obj = nextBestActionService.updateNextBestAction(updateNextBestActionRequest, realNextBestActionManager$updateNextBestAction$1);
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
                    return apiResult;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realNextBestActionManager$updateNextBestAction$1 = new RealNextBestActionManager$updateNextBestAction$1(this, continuationImpl);
        Object obj2 = realNextBestActionManager$updateNextBestAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNextBestActionManager$updateNextBestAction$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        ((Ui.EventReceiver) this.eglDisplay).sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.MissingMetadataEvent(new MissingMetadata(((DirectoryListItem.ItemViewModel) this.eglContext).analyticsData, Metadata.MAIN_IMAGE, (String) this.eglConfig)));
    }

    public EglCore(Function1 function1) {
        this.$r8$classId = 27;
        RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
        this.eglDisplay = function1;
        this.eglContext = realObjectScanner;
        this.eglConfig = RealByteArrayCondenser.INSTANCE;
    }

    public EglCore(Navigator navigator, LoadTimeClock loadTimeClock, ActivityAnalyticsService activityAnalyticsService) {
        this.$r8$classId = 14;
        navigator.getClass();
        this.eglDisplay = navigator;
        this.eglContext = loadTimeClock;
        this.eglConfig = activityAnalyticsService;
    }

    public EglCore(CryptoService cryptoService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.$r8$classId = 4;
        this.eglDisplay = cryptoService;
        this.eglContext = coroutineContext;
        this.eglConfig = cashAccountDatabaseImpl.cryptoStatementQueries;
    }

    public EglCore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, PhysicalCashDepositAddressEntryScreen.AddressSearchType addressSearchType) {
        Object obj;
        this.$r8$classId = 5;
        addressSearchType.getClass();
        this.eglDisplay = coroutineContext;
        this.eglContext = addressSearchType;
        int ordinal = addressSearchType.ordinal();
        if (ordinal == 0) {
            obj = cashAccountDatabaseImpl.physicalDepositUsAddressSearchQueries;
        } else if (ordinal == 1) {
            obj = cashAccountDatabaseImpl.atmWithdrawalAddressSearchQueries;
        } else if (ordinal == 2) {
            obj = cashAccountDatabaseImpl.bitcoinMapAddressSearchQueries;
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            throw null;
        }
        this.eglConfig = obj;
    }

    public EglCore(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        this.$r8$classId = 8;
        this.eglDisplay = androidStringManager;
        this.eglContext = factory.create(MoneyFormatterConfig.STANDARD);
        this.eglConfig = new StoryQueries$$ExternalSyntheticLambda0(6);
    }

    public /* synthetic */ EglCore(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.eglDisplay = obj;
        this.eglContext = obj2;
        this.eglConfig = obj3;
    }

    public EglCore(GenieAppConfig genieAppConfig, String str, String str2, SizeMap sizeMap) {
        this.$r8$classId = 12;
        this.eglDisplay = str;
        this.eglContext = str2;
        this.eglConfig = sizeMap;
    }

    public EglCore(FeatureFlagManager featureFlagManager, IntentLauncher intentLauncher, Navigator navigator) {
        this.$r8$classId = 3;
        navigator.getClass();
        this.eglDisplay = featureFlagManager;
        this.eglContext = intentLauncher;
        this.eglConfig = navigator;
    }

    public EglCore(RealQrCodesInboundNavigator$Factory$Impl realQrCodesInboundNavigator$Factory$Impl, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, FeatureFlagManager featureFlagManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 24;
        this.eglDisplay = realQrCodesInboundNavigator$Factory$Impl;
        this.eglContext = featureFlagManager;
        this.eglConfig = screenNavigator;
    }

    public EglCore(AppService appService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.$r8$classId = 2;
        this.eglDisplay = appService;
        this.eglContext = coroutineContext;
        this.eglConfig = cashAccountDatabaseImpl.customerQueries;
    }

    public EglCore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CashAccountDatabaseImpl cashAccountDatabaseImpl2, CoroutineContext coroutineContext) {
        this.$r8$classId = 9;
        this.eglDisplay = coroutineContext;
        this.eglContext = cashAccountDatabaseImpl2.savingsGoalLocalStatusQueries;
        this.eglConfig = cashAccountDatabaseImpl.dependentLastSeenSavingsBalanceQueries;
    }

    public EglCore(PiggybankAppService piggybankAppService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.$r8$classId = 28;
        this.eglDisplay = piggybankAppService;
        this.eglContext = coroutineContext;
        this.eglConfig = cashAccountDatabaseImpl.savingsTaxDocumentQueries;
    }

    public EglCore(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppService appService, CoroutineContext coroutineContext) {
        this.$r8$classId = 18;
        this.eglDisplay = appService;
        this.eglContext = coroutineContext;
        this.eglConfig = cashAccountDatabaseImpl.contactQueries;
    }

    public EglCore(MeshGeometry meshGeometry, SubMesh subMesh) {
        this.$r8$classId = 13;
        meshGeometry.getClass();
        this.eglDisplay = meshGeometry;
        this.eglContext = subMesh;
        this.eglConfig = meshGeometry.ready;
    }

    public EglCore(Context context, AndroidFileProvider androidFileProvider, Storage storage) {
        this.$r8$classId = 11;
        this.eglDisplay = androidFileProvider;
        this.eglContext = storage;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        this.eglConfig = contentResolver;
    }

    public EglCore(BetterNavigator.ScreenNavigator screenNavigator, RealUuidGenerator realUuidGenerator, AndroidStringManager androidStringManager, Analytics analytics) {
        this.$r8$classId = 10;
        this.eglDisplay = screenNavigator;
        this.eglContext = androidStringManager;
        this.eglConfig = analytics;
    }

    public EglCore(CashFaceClientService cashFaceClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.$r8$classId = 21;
        this.eglDisplay = cashFaceClientService;
        this.eglContext = coroutineContext;
        this.eglConfig = cashAccountDatabaseImpl.customerProfileQueries;
    }

    public EglCore(PostcardClientService postcardClientService, Analytics analytics, CoroutineScope coroutineScope, String str) {
        this.$r8$classId = 20;
        str.getClass();
        this.eglDisplay = postcardClientService;
        this.eglContext = analytics;
        this.eglConfig = str;
    }

    public EglCore(RealAppMessageManager realAppMessageManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.$r8$classId = 23;
        this.eglDisplay = realAppMessageManager;
        this.eglContext = coroutineContext;
        LocalTabContentQueries localTabContentQueries = cashAccountDatabaseImpl.tooltipMessageQueries;
        ResourceFileSystem.Companion companion = Placement.Companion;
        localTabContentQueries.getClass();
        TooltipMessageQueries$tooltipMessagesForPlacement$2 tooltipMessageQueries$tooltipMessagesForPlacement$2 = TooltipMessageQueries$tooltipMessagesForPlacement$2.INSTANCE;
        this.eglConfig = new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(localTabContentQueries, new ContextKt$$ExternalSyntheticLambda1(localTabContentQueries, (short) 0))), coroutineContext), 20);
    }

    public EglCore(InstancedCardBatch instancedCardBatch) {
        this.$r8$classId = 1;
        this.eglConfig = instancedCardBatch;
        this.eglDisplay = instancedCardBatch._ready;
        this.eglContext = LazyKt.lazy(new CardScene$$ExternalSyntheticLambda1(18));
        Timber.Forest.d("BatchedMaterial created", new Object[0]);
    }
}
