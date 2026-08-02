package com.squareup.cash.graphics.views;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLES20;
import android.view.TextureView;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.zxing.BinaryBitmap;
import com.squareup.address.typeahead.backend.api.Coordinates;
import com.squareup.address.typeahead.backend.api.Location;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.cdf.earnings.EarningsTapActivityRow;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceSeeNoAllowance;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountViewAllStart;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedRecentAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.family.familyhub.presenters.DependentControlsAndLimitsPresenter$models$1$1$1;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.ResolvedStarPlacement;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.ImageFormatConverter$ConversionResult;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$convertToJpeg$2$fileUri$1;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.gl.core.GLTexture;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.db.categories.CategorySearchQueries$PerformSearchQuery;
import com.squareup.cash.investing.db.categories.CategorySearchQueries$performSearch$2;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.scenarioplans.models.InitiateInvestmentOrderScenarioPlanInput;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentActionComplete;
import com.squareup.cash.payments.backend.api.PaymentActionResult;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.storage.UtilsKt;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.SelectDependentsBlocker;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.Path;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class GLSceneScopeProvider$SceneScope$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $attached$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scope;
    public /* synthetic */ Object $textureView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLSceneScopeProvider$SceneScope$2$1$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.$attached$delegate = mutableState;
        this.$textureView = mutableState2;
        this.$scope = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$attached$delegate;
        Object obj3 = this.$scope;
        switch (i) {
            case 0:
                return new GLSceneScopeProvider$SceneScope$2$1$1((TextureView) this.$textureView, (GLSceneScope) obj3, (MutableState) obj2, continuation, 0);
            case 1:
                return new GLSceneScopeProvider$SceneScope$2$1$1((PaperMoneyDepositMapPresenter) this.$textureView, (LocationSearchClient$LocationDetailsResult.Success) obj3, (SearchLocation) obj2, continuation, 1);
            case 2:
                return new GLSceneScopeProvider$SceneScope$2$1$1(this.$textureView, (MutableState) obj2, (MutableState) obj3, continuation, 2);
            case 3:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1((PaperMoneyDepositMapPresenter) obj3, (CoroutineScope) obj2, continuation, 3);
                gLSceneScopeProvider$SceneScope$2$1$1.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$1;
            case 4:
                return new GLSceneScopeProvider$SceneScope$2$1$1((RealFormPdfProvider) this.$textureView, (String) obj3, (String) obj2, continuation, 4);
            case 5:
                return new GLSceneScopeProvider$SceneScope$2$1$1((String) this.$textureView, (CashTreehouseLayout) obj3, (PromotionDetailsViewModel.Loaded) obj2, continuation, 5);
            case 6:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$12 = new GLSceneScopeProvider$SceneScope$2$1$1((ActivityItem) obj3, (zzb) obj2, continuation, 6);
                gLSceneScopeProvider$SceneScope$2$1$12.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$12;
            case 7:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$13 = new GLSceneScopeProvider$SceneScope$2$1$1((RealBitcoinAmountPickerPresenter) obj3, (MutableState) obj2, continuation, 7);
                gLSceneScopeProvider$SceneScope$2$1$13.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$13;
            case 8:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$14 = new GLSceneScopeProvider$SceneScope$2$1$1((DependentAccessControlsViewModel) obj3, continuation, (SavingsScreenPresenter) obj2, 8);
                gLSceneScopeProvider$SceneScope$2$1$14.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$14;
            case 9:
                return new GLSceneScopeProvider$SceneScope$2$1$1((FamilyHomePresenter) this.$textureView, (String) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                return new GLSceneScopeProvider$SceneScope$2$1$1((AmountChooserViewModel.Content) this.$textureView, (Shaker) obj3, (RealCashVibrator) obj2, continuation, 10);
            case 11:
                return new GLSceneScopeProvider$SceneScope$2$1$1(this.$textureView, (MutableState) obj2, (MutableState) obj3, continuation, 11);
            case 12:
                return new GLSceneScopeProvider$SceneScope$2$1$1((SelectSponsorPresenter) this.$textureView, (SelectSponsorViewEvent) obj3, (MutableStateFlow) obj2, continuation, 12);
            case 13:
                return new GLSceneScopeProvider$SceneScope$2$1$1((SelectSponsorViewModel.SelectSponsor) this.$textureView, (DelegatingSoftwareKeyboardController) obj3, (FocusRequester) obj2, continuation, 13);
            case 14:
                return new GLSceneScopeProvider$SceneScope$2$1$1((TextFieldState) this.$textureView, (Modifier$$ExternalSyntheticLambda0) obj3, (Function1) obj2, continuation, 14);
            case 15:
                return new GLSceneScopeProvider$SceneScope$2$1$1((FidesmoDeprovisioningPresenter) this.$textureView, (ScanningStarPlacement) obj3, (ResolvedStarPlacement) obj2, continuation, 15);
            case 16:
                return new GLSceneScopeProvider$SceneScope$2$1$1((MutableState) obj2, (MutableState) this.$textureView, (MutableState) obj3, continuation);
            case 17:
                return new GLSceneScopeProvider$SceneScope$2$1$1((FidesmoProvisioningViewModel) this.$textureView, (ProvisioningHaptics) obj3, (MutableState) obj2, continuation, 17);
            case 18:
                return new GLSceneScopeProvider$SceneScope$2$1$1((EglCore) this.$textureView, (String) obj3, (FileMetadata) obj2, continuation, 18);
            case 19:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$15 = new GLSceneScopeProvider$SceneScope$2$1$1(obj3, continuation, (ArcadeFormDateInputView) obj2, 19);
                gLSceneScopeProvider$SceneScope$2$1$15.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$15;
            case 20:
                return new GLSceneScopeProvider$SceneScope$2$1$1((ProduceStateScope) this.$textureView, (Bitmap) obj3, (TextureType) obj2, continuation, 20);
            case 21:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$16 = new GLSceneScopeProvider$SceneScope$2$1$1((ArrayList) obj3, continuation, (MutableState) obj2, 21);
                gLSceneScopeProvider$SceneScope$2$1$16.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$16;
            case 22:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$17 = new GLSceneScopeProvider$SceneScope$2$1$1((Boolean) obj3, continuation, (GrowToolsManagerState) obj2, 22);
                gLSceneScopeProvider$SceneScope$2$1$17.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$17;
            case 23:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$18 = new GLSceneScopeProvider$SceneScope$2$1$1((GrowToolsManagerViewModel.Loaded.TotalStats) obj3, continuation, (UiCallbackModel) obj2, 23);
                gLSceneScopeProvider$SceneScope$2$1$18.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$18;
            case 24:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$19 = new GLSceneScopeProvider$SceneScope$2$1$1((PaymentActionHandler) obj3, (PaymentAction) obj2, continuation, 24);
                gLSceneScopeProvider$SceneScope$2$1$19.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$19;
            case 25:
                return new GLSceneScopeProvider$SceneScope$2$1$1(this.$textureView, obj3, obj2, continuation, 25);
            case 26:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$110 = new GLSceneScopeProvider$SceneScope$2$1$1((Reward$Adapter) obj3, (HistoricalRange) obj2, continuation, 26);
                gLSceneScopeProvider$SceneScope$2$1$110.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$110;
            case 27:
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$111 = new GLSceneScopeProvider$SceneScope$2$1$1((RealCategoryBackend) obj3, (String) obj2, continuation, 27);
                gLSceneScopeProvider$SceneScope$2$1$111.$textureView = obj;
                return gLSceneScopeProvider$SceneScope$2$1$111;
            case 28:
                return new GLSceneScopeProvider$SceneScope$2$1$1(this.$textureView, (MutableState) obj2, (MutableState) obj3, continuation, 28);
            default:
                return new GLSceneScopeProvider$SceneScope$2$1$1((InitiateInvestmentOrderRequest) this.$textureView, (InviteErrorPresenter) obj3, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((GLSceneScopeProvider$SceneScope$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UiPayment uiPayment;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        PaymentActionResult route;
        int i = this.$r8$classId;
        int i2 = 22;
        int i3 = 2;
        int i4 = 6;
        ActivityEmbeddedViewEvent.Refresh refresh = ActivityEmbeddedViewEvent.Refresh.INSTANCE;
        int i5 = 3;
        int i6 = 0;
        int i7 = 1;
        String str5 = 0;
        PaymentActionResult paymentActionResult = null;
        Object obj2 = this.$scope;
        Object obj3 = this.$attached$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TextureView textureView = (TextureView) this.$textureView;
                GLSceneScope gLSceneScope = (GLSceneScope) obj2;
                MutableState mutableState = (MutableState) obj3;
                textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener(gLSceneScope, mutableState) { // from class: com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1.1
                    public final /* synthetic */ MutableState $attached$delegate;
                    public final GLSceneScope parent;

                    {
                        this.$attached$delegate = mutableState;
                        gLSceneScope.getClass();
                        this.parent = gLSceneScope;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
                        surfaceTexture.getClass();
                        this.parent.onSurfaceTextureAvailable(surfaceTexture, i8, i9);
                        this.$attached$delegate.setValue(Boolean.TRUE);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        surfaceTexture.getClass();
                        this.parent.getClass();
                        return false;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
                        surfaceTexture.getClass();
                        this.parent.onSurfaceTextureSizeChanged(surfaceTexture, i8, i9);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        surfaceTexture.getClass();
                        this.parent.getClass();
                    }
                });
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                if (surfaceTexture != null) {
                    gLSceneScope.onSurfaceTextureAvailable(surfaceTexture, textureView.getWidth(), textureView.getHeight());
                    mutableState.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) this.$textureView;
                Location location = ((LocationSearchClient$LocationDetailsResult.Success) obj2).location;
                SearchLocation searchLocation = (SearchLocation) obj3;
                PhysicalDepositUsAddressSearchQueries physicalDepositUsAddressSearchQueries = paperMoneyDepositMapPresenter.physicalDepositUsAddressSearchQueries;
                String str6 = location.identifier;
                Coordinates coordinates = location.coordinates;
                long millis = paperMoneyDepositMapPresenter.clock.millis();
                String str7 = location.formattedAddress;
                String str8 = str7 == null ? "" : str7;
                String obj4 = searchLocation.primaryText.toString();
                String valueOf = String.valueOf(searchLocation.secondaryText);
                Double valueOf2 = Double.valueOf(coordinates.latitude);
                Double valueOf3 = Double.valueOf(coordinates.longitude);
                physicalDepositUsAddressSearchQueries.getClass();
                str6.getClass();
                obj4.getClass();
                physicalDepositUsAddressSearchQueries.driver.execute(-1451216918, "INSERT OR REPLACE INTO physicalDepositUsAddressSearch\nVALUES (?,?,?,?,?,?,?)", new BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4(str6, millis, str8, obj4, valueOf, valueOf2, valueOf3, 2));
                physicalDepositUsAddressSearchQueries.notifyQueries(-1451216918, new PasswordInfoQueries$$ExternalSyntheticLambda0(23));
                physicalDepositUsAddressSearchQueries.driver.execute(-2070387808, "DELETE FROM physicalDepositUsAddressSearch\nWHERE identifier NOT IN (\n  SELECT identifier\n  FROM physicalDepositUsAddressSearch\n  ORDER BY created_at DESC\n  LIMIT ?\n)", new PasswordInfoQueries$$ExternalSyntheticLambda0(21));
                physicalDepositUsAddressSearchQueries.notifyQueries(-2070387808, new PasswordInfoQueries$$ExternalSyntheticLambda0(i2));
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj5 = ((UiCallbackModel) this.$textureView).model;
                ((MutableState) obj3).setValue(((CashMapViewModel) obj5).latestMapMovement);
                ((MutableState) obj2).setValue(((CashMapViewModel) obj5).selectedLocation);
                return Unit.INSTANCE;
            case 3:
                PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter2 = (PaperMoneyDepositMapPresenter) obj2;
                AddressResult addressResult = (AddressResult) this.$textureView;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (Intrinsics.areEqual(addressResult, NoAddressResult.INSTANCE)) {
                    a$$ExternalSyntheticBUOutline0.m$3("NoAddressResult should be filtered out");
                    return null;
                }
                if (addressResult instanceof SelectedRecentAddressResult) {
                    SelectedRecentAddressResult selectedRecentAddressResult = (SelectedRecentAddressResult) addressResult;
                    paperMoneyDepositMapPresenter2.cashMapPresenter.searchLocation(new LocationViewModel(selectedRecentAddressResult.latitude, selectedRecentAddressResult.longitude, 12.5f));
                } else {
                    if (!(addressResult instanceof SelectedSearchAddressResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default((CoroutineScope) obj3, null, null, new EntitySyncerKt$hasSyncedFlow$1(paperMoneyDepositMapPresenter2, addressResult, (Continuation) str5, i2), 3);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealFormPdfProvider realFormPdfProvider = (RealFormPdfProvider) this.$textureView;
                RealFileDownloader realFileDownloader = realFormPdfProvider.fileDownloader;
                RealFileDownloader realFileDownloader2 = realFormPdfProvider.fileDownloader;
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.DDA_FORM;
                String str9 = (String) obj2;
                if (realFileDownloader.ready(fileDownloader$Category, str9)) {
                    String str10 = Path.DIRECTORY_SEPARATOR;
                    Path resolve = Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve(str9);
                    try {
                        realFileDownloader2.fileSystem.delete(resolve, false);
                    } catch (IOException e) {
                        Timber.Forest.e("Failed to delete " + resolve, new Object[0], e);
                    }
                }
                return realFileDownloader2.download(FileDownloader$Category.DDA_FORM, str9, (String) obj3, false);
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str11 = (String) this.$textureView;
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) obj2;
                if (str11 != null) {
                    CashTreehouseLayout.setContent$default(cashTreehouseLayout, str11, ((PromotionDetailsViewModel.Loaded) obj3).navigator, null, 4, null);
                } else {
                    cashTreehouseLayout.getClass();
                    CashTreehouseLayout.updateState$default(cashTreehouseLayout, null, null, 1);
                }
                return Unit.INSTANCE;
            case 6:
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.$textureView;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                    ActivityItem activityItem = (ActivityItem) obj2;
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = activityItem instanceof FormattedPaymentHistoryActivityItem ? (FormattedPaymentHistoryActivityItem) activityItem : null;
                    ((EarningsHomeAnalytics) ((zzb) obj3).zza).analytics.track(new EarningsTapActivityRow((formattedPaymentHistoryActivityItem == null || (uiPayment = formattedPaymentHistoryActivityItem.getUiPayment()) == null) ? null : uiPayment.token), null);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.$textureView;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) obj2;
                JobKt.launch$default(coroutineScope, null, null, new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, str5, i6), 3);
                JobKt.launch$default(coroutineScope, null, null, new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, str5, i7), 3);
                JobKt.launch$default(coroutineScope, null, null, new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, str5, i3), 3);
                JobKt.launch$default(coroutineScope, null, null, new DependentControlsAndLimitsPresenter$models$1$1$1(realBitcoinAmountPickerPresenter, str5, i5), 3);
                if (!realBitcoinAmountPickerPresenter.hasError) {
                    JobKt.launch$default(coroutineScope, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(realBitcoinAmountPickerPresenter, (MutableState) obj3, str5, i4), 3);
                }
                return Unit.INSTANCE;
            case 8:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj3;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (CollectionsKt.firstOrNull(((DependentAccessControlsViewModel) obj2).allowanceItems) instanceof AllowanceViewModel.NoAllowanceInDependentDetail) {
                    savingsScreenPresenter.analytics.track(new SponsoredAccountManageAllowanceSeeNoAllowance(PlatformKt.activeAccountToken(savingsScreenPresenter.sessionManager), ((DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy).dependentCustomerToken), null);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = ((FamilyHomePresenter) this.$textureView).analytics;
                FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) ((MutableState) obj3).getValue();
                familyAccountsParameters.getClass();
                analytics.track(new SponsoredAccountViewAllStart(new Integer(familyAccountsParameters.sorted_dependents.size()), (String) obj2), null);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((AmountChooserViewModel.Content) this.$textureView).shouldShakeAmount.value).booleanValue()) {
                    ((Shaker) obj2).shake();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) obj3;
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SelectSponsorPresenter selectSponsorPresenter = (SelectSponsorPresenter) this.$textureView;
                boolean booleanValue = ((Boolean) ((MutableState) obj3).getValue()).booleanValue();
                MutableState mutableState2 = (MutableState) obj2;
                SelectSponsorScreen selectSponsorScreen = selectSponsorPresenter.selectSponsorScreen;
                SelectSponsorsBlocker.AddContactsDialog addContactsDialog = selectSponsorScreen != null ? selectSponsorScreen.contactsDialog : null;
                SelectDependentScreen selectDependentScreen = selectSponsorPresenter.selectDependentScreen;
                SelectDependentsBlocker.AddContactsDialog addContactsDialog2 = selectDependentScreen != null ? selectDependentScreen.contactsDialog : null;
                if (!booleanValue && (addContactsDialog != null || addContactsDialog2 != null)) {
                    mutableState2.setValue(Boolean.TRUE);
                    BetterNavigator.ScreenNavigator screenNavigator = selectSponsorPresenter.navigator;
                    if (addContactsDialog == null || (str = addContactsDialog.title) == null) {
                        str = addContactsDialog2 != null ? addContactsDialog2.title : null;
                    }
                    if (addContactsDialog == null || (str2 = addContactsDialog.body) == null) {
                        str2 = addContactsDialog2 != null ? addContactsDialog2.body : null;
                    }
                    if (addContactsDialog == null || (str3 = addContactsDialog.add_contact_button_title) == null) {
                        str3 = addContactsDialog2 != null ? addContactsDialog2.add_contact_button_title : null;
                    }
                    if (addContactsDialog != null && (str4 = addContactsDialog.dismiss_button_title) != null) {
                        str5 = str4;
                    } else if (addContactsDialog2 != null) {
                        str5 = addContactsDialog2.dismiss_button_title;
                    }
                    screenNavigator.goTo(new ContactPermissionDialogScreen(str, str2, str3, str5));
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str12 = ((SelectSponsorViewEvent.Search) ((SelectSponsorViewEvent) obj2)).input;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) ((MutableStateFlow) obj3);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, str12);
                return Unit.INSTANCE;
            case 13:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj2;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((SelectSponsorViewModel.SelectSponsor) this.$textureView).isShowingDialog) {
                    FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj3);
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.show();
                    }
                } else if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String take = StringsKt___StringsKt.take(100, ((TextFieldState) this.$textureView).getValue$foundation().text.toString());
                ((Modifier$$ExternalSyntheticLambda0) obj2).invoke(new TextFieldState(take, 2));
                ((Function1) obj3).invoke(new SelectSponsorViewEvent.Search(take));
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((FidesmoDeprovisioningPresenter) this.$textureView).observabilityManager.logEvent("fidesmo_deprovisioning_nfc_indicator_placement", MapsKt__MapsKt.mapOf(new Pair("nfc_indicator_placement", ((ScanningStarPlacement) obj2).getAnalyticsLabel()), new Pair("placement_source", ((ResolvedStarPlacement) obj3).source.analyticsLabel)));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj3).getValue()).booleanValue() && (num = (Integer) ((MutableState) this.$textureView).getValue()) != null && num.intValue() == 100) {
                    ((MutableState) obj2).setValue(FidesmoDeprovisioningPresenter.DeprovisionPhase.ResetSucceeded.INSTANCE);
                }
                return Unit.INSTANCE;
            case 17:
                ProvisioningHaptics provisioningHaptics = (ProvisioningHaptics) obj2;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState3 = (MutableState) obj3;
                List list = FidesmoProvisioningViewKt.SNAKE_PATH;
                boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                FidesmoProvisioningViewModel fidesmoProvisioningViewModel = (FidesmoProvisioningViewModel) this.$textureView;
                mutableState3.setValue(Boolean.valueOf(fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Activating));
                if (fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Scanning.Disconnected) {
                    if (provisioningHaptics != null) {
                        BinaryBitmap binaryBitmap = provisioningHaptics.player;
                        binaryBitmap.cancel();
                        binaryBitmap.play(provisioningHaptics.disconnect);
                    }
                } else if (booleanValue2 && (fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Scanning.InProgress)) {
                    if (provisioningHaptics != null) {
                        BinaryBitmap binaryBitmap2 = provisioningHaptics.player;
                        binaryBitmap2.cancel();
                        binaryBitmap2.play(provisioningHaptics.holdConfirmed);
                    }
                } else if (fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Success) {
                    if (provisioningHaptics != null) {
                        BinaryBitmap binaryBitmap3 = provisioningHaptics.player;
                        binaryBitmap3.cancel();
                        binaryBitmap3.play(provisioningHaptics.success);
                    }
                } else if (((fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Failed) || (fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Error)) && provisioningHaptics != null) {
                    BinaryBitmap binaryBitmap4 = provisioningHaptics.player;
                    binaryBitmap4.cancel();
                    binaryBitmap4.play(provisioningHaptics.failure);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EglCore eglCore = (EglCore) this.$textureView;
                ImageDecoder.Source createSource = ImageDecoder.createSource((ContentResolver) eglCore.eglConfig, Uri.parse((String) obj2));
                createSource.getClass();
                Bitmap decodeBitmap = ImageDecoder.decodeBitmap(createSource);
                decodeBitmap.getClass();
                try {
                    String str13 = Path.DIRECTORY_SEPARATOR;
                    Uri fileUri = ((RealStorage) ((Storage) eglCore.eglContext)).getFileUri(Path.Companion.get(UtilsKt.tempFileName("CASH"), false), RealImageFormatConverter$convertToJpeg$2$fileUri$1.INSTANCE);
                    String path = fileUri.getPath();
                    if (path == null) {
                        throw new IllegalStateException("Failed to create output file");
                    }
                    File file = new File(path);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        if (!decodeBitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream)) {
                            throw new IllegalStateException("Failed to compress bitmap to JPEG");
                        }
                        Uri contentUriForFileUri = ((AndroidFileProvider) eglCore.eglDisplay).contentUriForFileUri(fileUri);
                        String str14 = ((FileMetadata) obj3).displayName;
                        str14.getClass();
                        int lastIndexOf$default = StringsKt.lastIndexOf$default('.', 0, 6, (CharSequence) str14);
                        if (lastIndexOf$default != -1) {
                            str14 = StringsKt.replaceRange(str14, lastIndexOf$default + 1, str14.length(), "jpg").toString();
                        }
                        FileMetadata fileMetadata = new FileMetadata("image/jpeg", str14, "jpg", new Long(file.length()));
                        String uri = contentUriForFileUri.toString();
                        uri.getClass();
                        return new ImageFormatConverter$ConversionResult(uri, fileMetadata);
                    } finally {
                        fileOutputStream.close();
                        decodeBitmap.recycle();
                    }
                } catch (Exception e2) {
                    decodeBitmap.recycle();
                    throw e2;
                }
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArcadeFormDateInputView arcadeFormDateInputView = (ArcadeFormDateInputView) obj3;
                arcadeFormDateInputView.onEvent.invoke(new FormViewEvent.UpdateResultEvent.DateInputChanged(arcadeFormDateInputView.formElementId, (SubmitFormRequest.ElementResult.DateInputResult) obj2));
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GLTexture gLTexture = (GLTexture) ((ProduceStateScope) this.$textureView).getValue();
                if (gLTexture != null) {
                    GLES20.glDeleteTextures(1, new int[]{gLTexture.texture}, 0);
                }
                return new GLTexture((Bitmap) obj2, (TextureType) obj3);
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) ((MutableState) obj3).getValue()).onEvent.invoke(refresh);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((GrowToolsManagerState) obj3).setInteractive(true);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiCallbackModel) obj3).onEvent.invoke(refresh);
                return Unit.INSTANCE;
            case 24:
                com.squareup.cash.core.navigationcontainer.PaymentActionResult paymentActionResult2 = (com.squareup.cash.core.navigationcontainer.PaymentActionResult) this.$textureView;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher = ((PaymentActionHandler) obj2).paymentActionCompletionDispatcher;
                PaymentAction paymentAction = (PaymentAction) obj3;
                if (paymentActionResult2 != null) {
                    if (paymentActionResult2 instanceof PaymentActionResult.GoToScreen) {
                        route = new PaymentActionResult.GoToScreen(((PaymentActionResult.GoToScreen) paymentActionResult2).screen);
                    } else if (paymentActionResult2 instanceof PaymentActionResult.IntentResult) {
                        route = new PaymentActionResult.IntentResult(((PaymentActionResult.IntentResult) paymentActionResult2).intent);
                    } else {
                        if (!(paymentActionResult2 instanceof PaymentActionResult.Route)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        route = new PaymentActionResult.Route(((PaymentActionResult.Route) paymentActionResult2).route);
                    }
                    paymentActionResult = route;
                }
                paymentAction.getClass();
                StateFlowKt.emitOrThrow(realPaymentActionCompletionDispatcher.completedPaymentActions, new PaymentActionComplete(paymentAction, paymentActionResult));
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i8 = ((PasscodeDialogViewModel) this.$textureView).passcodeLength;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                if (i8 != parcelableSnapshotMutableIntState.getIntValue()) {
                    ((MutableState) obj3).setValue("");
                    parcelableSnapshotMutableIntState.setIntValue(i8);
                }
                return Unit.INSTANCE;
            case 26:
                CurrencyCode currencyCode = (CurrencyCode) this.$textureView;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Reward$Adapter reward$Adapter = (Reward$Adapter) obj2;
                Continuation continuation = null;
                RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new SafeFlow(new MoneybotChatPresenter$models$6$1((HistoricalRange) obj3, currencyCode, reward$Adapter, continuation, 9)), 24);
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) reward$Adapter.boost_detail_rowsAdapter;
                AndroidClock androidClock = (AndroidClock) reward$Adapter.boost_detail_bottom_upsellAdapter;
                CoroutineContext coroutineContext = (CoroutineContext) reward$Adapter.app_linksAdapter;
                stateFlowImpl2.getClass();
                return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, FaceDetection.m2065timerForAgeWn2Vu4Y(stateFlowImpl2, androidClock, coroutineContext, RealInvestmentEntitiesKt.INVESTING_STALENESS_THRESHOLD), new CardModelView$getActiveHeat$2$2(reward$Adapter, continuation, 8), i6);
            case 27:
                String str15 = (String) this.$textureView;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RewardSlotQueries rewardSlotQueries = ((RealCategoryBackend) obj2).searchQueries;
                ByteString.Companion companion = InvestmentEntityStatus.Companion;
                ByteString.Companion companion2 = SyncInvestmentEntity.ReleaseStage.Companion;
                Path.Companion companion3 = SyncInvestmentFilterGroup.JoinType.Companion;
                rewardSlotQueries.getClass();
                str15.getClass();
                CategorySearchQueries$performSearch$2 categorySearchQueries$performSearch$2 = CategorySearchQueries$performSearch$2.INSTANCE;
                return DBUtil.toFlow(new CategorySearchQueries$PerformSearchQuery(rewardSlotQueries, str15, (String) obj3, new TooltipBoxKt$$ExternalSyntheticLambda2(rewardSlotQueries)));
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((InvestingExchangeViewModel) this.$textureView) instanceof InvestingExchangeViewModel.Content.FullScreenContent) {
                    int i9 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                    Boolean bool = (Boolean) ((MutableState) obj3).getValue();
                    bool.booleanValue();
                    ((MutableState) obj2).setValue(bool);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ScenarioPlans scenarioPlans = ScenarioPlans.INITIATE_INVESTMENT_ORDER;
                InitiateInvestmentOrderRequest initiateInvestmentOrderRequest = (InitiateInvestmentOrderRequest) this.$textureView;
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                ColorModel colorModel = (ColorModel) inviteErrorPresenter.args;
                ((MutableState) obj3).setValue(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(scenarioPlans, new InitiateInvestmentOrderScenarioPlanInput(initiateInvestmentOrderRequest, colorModel, (String) inviteErrorPresenter.navigator), new InvestingScreens.StockDetails(null, new InvestmentEntityToken((String) inviteErrorPresenter.analytics), null, new InvestingScreens.StockDetails.Origin.Tradable(true), null, false, 49), colorModel));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScopeProvider$SceneScope$2$1$1(Object obj, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$textureView = obj;
        this.$attached$delegate = mutableState;
        this.$scope = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScopeProvider$SceneScope$2$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$textureView = obj;
        this.$scope = obj2;
        this.$attached$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScopeProvider$SceneScope$2$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scope = obj;
        this.$attached$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScopeProvider$SceneScope$2$1$1(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$scope = obj;
        this.$attached$delegate = obj2;
    }
}
