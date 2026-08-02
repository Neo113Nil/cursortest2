package com.squareup.cash.clientsync;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.fillr.featuretoggle.UnleashContext;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter$deleteByMessageToken$2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.cashapplite.cashin.CashInRow;
import com.squareup.cash.cashapplite.cashin.CashInRowAction;
import com.squareup.cash.cashapplite.cashin.LiteCashInResult;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.cashapppay.presenters.StatusInterstitialPresenter;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.routers.activity.ActivityRouter;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter;
import com.squareup.cash.clientrouting.routers.profile.DocumentsRouter;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentageSubmitter;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.documents.AfterpayStatementDownloadData;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.loyalty.LoyaltyMerchantQueries$loyaltyMerchant$2;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.db2.profile.documents.DocumentQueries$SelectForTokenQuery;
import com.squareup.cash.db2.profile.documents.DocumentQueries$selectForToken$2;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositExpiredBarcodeView;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.directdeposit.presenters.DirectDepositForm;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetailsTransitionFactory$AnimationData;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.e2ee.signature.RealSignatureRepo$generateSignature$2;
import com.squareup.cash.e2ee.signature.RealSignatureRepo$retrieveSignature$2;
import com.squareup.cash.e2ee.signature.SignatureFetch;
import com.squareup.cash.e2ee.signature.logger.RealSignatureManagerLogger;
import com.squareup.cash.earnings.backend.api.EarningsChartResult;
import com.squareup.cash.earnings.backend.real.EarningsChartDataSource;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsDownloadOptionsScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.cash.notificationsettings.api.v1.NotificationSettingsService;
import com.squareup.protos.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsRequest;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningsChartRequest;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ClearProfilePhotoRequest;
import com.squareup.protos.franklin.app.ClearProfilePhotoResponse;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.earnings.EarningsTimeFrame;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class EntitySyncerKt$hasSyncedFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_hasSyncedFlow;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntitySyncerKt$hasSyncedFlow$1(ContouredTextRing contouredTextRing, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$0 = contouredTextRing;
        this.$this_hasSyncedFlow = str;
        this.label = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$this_hasSyncedFlow;
        switch (i) {
            case 0:
                EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$1 = new EntitySyncerKt$hasSyncedFlow$1((MultiplatformEntitySyncer) obj2, continuation, 0);
                entitySyncerKt$hasSyncedFlow$1.L$0 = obj;
                return entitySyncerKt$hasSyncedFlow$1;
            case 1:
                return new EntitySyncerKt$hasSyncedFlow$1((ContouredTextRing) this.L$0, (String) obj2, this.label, continuation);
            case 2:
                return new EntitySyncerKt$hasSyncedFlow$1((EndAppLockPresenter) this.L$0, (MutableState) obj2, continuation, 2);
            case 3:
                return new EntitySyncerKt$hasSyncedFlow$1((LiteCashInPresenter) this.L$0, (MutableState) obj2, continuation, 3);
            case 4:
                EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$12 = new EntitySyncerKt$hasSyncedFlow$1((GrantPresenter) obj2, continuation, 4);
                entitySyncerKt$hasSyncedFlow$12.L$0 = obj;
                return entitySyncerKt$hasSyncedFlow$12;
            case 5:
                return new EntitySyncerKt$hasSyncedFlow$1((StatusInterstitialPresenter) this.L$0, (BlockerAction) obj2, continuation, 5);
            case 6:
                return new EntitySyncerKt$hasSyncedFlow$1((ActivityRouter) this.L$0, (ClientRoute.ViewActivitySearch) obj2, continuation, 6);
            case 7:
                return new EntitySyncerKt$hasSyncedFlow$1((ActivityRouter) this.L$0, (ClientRoute.ViewThreadedCustomerActivity) obj2, continuation, 7);
            case 8:
                return new EntitySyncerKt$hasSyncedFlow$1((BackgroundRouter) this.L$0, (ClientRoute.RemoveAppMessageInBackground) obj2, continuation, 8);
            case 9:
                return new EntitySyncerKt$hasSyncedFlow$1((BackgroundRouter) this.L$0, (ClientRoute.RemoveAppMessageByTokenInBackground) obj2, continuation, 9);
            case 10:
                return new EntitySyncerKt$hasSyncedFlow$1((ClientRoute.UpdateAfterpayApplet) this.L$0, (BackgroundRouter) obj2, continuation, 10);
            case 11:
                return new EntitySyncerKt$hasSyncedFlow$1((ClientRoute.CollectGpsLocationData) this.L$0, (BackgroundRouter) obj2, continuation, 11);
            case 12:
                return new EntitySyncerKt$hasSyncedFlow$1((DocumentsRouter) this.L$0, (ClientRoute.ViewDocumentBtcTaxForm) obj2, continuation, 12);
            case 13:
                return new EntitySyncerKt$hasSyncedFlow$1((DocumentsRouter) this.L$0, (ClientRoute.ViewDocumentStockMonthlyStatement) obj2, continuation, 13);
            case 14:
                return new EntitySyncerKt$hasSyncedFlow$1((DocumentsRouter) this.L$0, (ClientRoute.ViewDocumentAfterpayMonthlyStatement) obj2, continuation, 14);
            case 15:
                return new EntitySyncerKt$hasSyncedFlow$1((String) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 15);
            case 16:
                return new EntitySyncerKt$hasSyncedFlow$1((ImmutableList) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 16);
            case 17:
                return new EntitySyncerKt$hasSyncedFlow$1((NavigationModel.Ready.Swipe) this.L$0, (PagerState) obj2, continuation, 17);
            case 18:
                EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$13 = new EntitySyncerKt$hasSyncedFlow$1((RealCryptoBalanceRepo) obj2, continuation, 18);
                entitySyncerKt$hasSyncedFlow$13.L$0 = obj;
                return entitySyncerKt$hasSyncedFlow$13;
            case 19:
                return new EntitySyncerKt$hasSyncedFlow$1((BitcoinP2pConversionPercentagePresenter) this.L$0, (MutableState) obj2, continuation, 19);
            case 20:
                return new EntitySyncerKt$hasSyncedFlow$1((RealProfileManager) obj2, continuation, 20);
            case 21:
                return new EntitySyncerKt$hasSyncedFlow$1((RealProfileNotificationsRepository) this.L$0, (List) obj2, continuation, 21);
            case 22:
                return new EntitySyncerKt$hasSyncedFlow$1((PaperMoneyDepositMapPresenter) this.L$0, (AddressResult) obj2, continuation, 22);
            case 23:
                return new EntitySyncerKt$hasSyncedFlow$1((PaperMoneyDepositExpiredBarcodeView) this.L$0, (Function1) obj2, continuation, 23);
            case 24:
                return new EntitySyncerKt$hasSyncedFlow$1((PagerState) this.L$0, (PaperMoneyDepositOnboardingViewModel) obj2, continuation, 24);
            case 25:
                return new EntitySyncerKt$hasSyncedFlow$1((LocalHomePresenter) this.L$0, (MutableState) obj2, continuation, 25);
            case 26:
                EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$14 = new EntitySyncerKt$hasSyncedFlow$1((DisclosurePresenter) obj2, continuation, 26);
                entitySyncerKt$hasSyncedFlow$14.L$0 = obj;
                return entitySyncerKt$hasSyncedFlow$14;
            case 27:
                return new EntitySyncerKt$hasSyncedFlow$1((RealSignatureManager) obj2, continuation, 27);
            case 28:
                EntitySyncerKt$hasSyncedFlow$1 entitySyncerKt$hasSyncedFlow$15 = new EntitySyncerKt$hasSyncedFlow$1((EglCore) obj2, continuation, 28);
                entitySyncerKt$hasSyncedFlow$15.L$0 = obj;
                return entitySyncerKt$hasSyncedFlow$15;
            default:
                return new EntitySyncerKt$hasSyncedFlow$1((EarningsTimeFrame) this.L$0, (EglCore) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CryptoBalance$StablecoinBalance) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((EarningsChartDataSource) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((EntitySyncerKt$hasSyncedFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0334, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0313, code lost:
    
        if (r1 == r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r1 == r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0472, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(50, r21) == r0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0459, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(200, r21) == r0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0686, code lost:
    
        if (app.cash.molecule.PlatformKt.retryWhenRetryable$default(null, r0, r21, 3) != r1) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0676, code lost:
    
        if (r0 == r1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x065f, code lost:
    
        if (r3 == r1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0648, code lost:
    
        if (r3.forceExpireAfterpayAppletCache(r21) == r1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0999, code lost:
    
        if (r1.emit(r0, r21) == r3) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0986, code lost:
    
        if (r0.join(r21) == r3) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x097b, code lost:
    
        if (r1.emit(r4, r21) == r3) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        if (r0 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f6, code lost:
    
        if (r2 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r2v20, types: [app.cash.broadway.navigation.Navigator] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object cashInAccount;
        Object first;
        Screen profileFor;
        Object collectGpsLocation;
        Object firstOrNull;
        Object first2;
        Object afterpayStatementDownloadData;
        Object animateScrollToPage;
        Object clearProfilePhoto;
        Object access$centerOnSearchAddress;
        Object animateScrollToPage2;
        Uri uri;
        Object withContext;
        Object templateTokenPage;
        Object loading;
        Object withContext2;
        SignatureFetch signatureFetch;
        Object withContext3;
        Object earningsChart;
        int i = this.$r8$classId;
        int i2 = 24;
        int i3 = 18;
        int i4 = 4;
        int i5 = 0;
        Object obj2 = this.$this_hasSyncedFlow;
        int i6 = 1;
        r11 = null;
        String str = null;
        ProfileDocumentModel profileDocumentModel = null;
        ProfileDocumentModel profileDocumentModel2 = null;
        switch (i) {
            case 0:
                JobImpl jobImpl = ((MultiplatformEntitySyncer) obj2).hasSynced;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            Boolean valueOf = Boolean.valueOf(jobImpl.isCompleted());
                            this.L$0 = null;
                            this.label = 3;
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    Boolean valueOf2 = Boolean.valueOf(jobImpl.isCompleted());
                    this.L$0 = flowCollector;
                    this.label = 1;
                    break;
                }
                this.L$0 = flowCollector;
                this.label = 2;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(FlowKt.distinctUntilChanged(((RealBalanceSnapshotManager) ((EndAppLockPresenter) this.L$0).navigatorSwitcher).select()), 1);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(i3, (MutableState) obj2);
                    this.label = 1;
                    if (drop.collect(anonymousClass1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                MutableState mutableState = (MutableState) obj2;
                LiteCashInPresenter liteCashInPresenter = (LiteCashInPresenter) this.L$0;
                LiteCashInScreen liteCashInScreen = (LiteCashInScreen) liteCashInPresenter.args;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzr zzrVar = (zzr) liteCashInPresenter.liteCashInRepo;
                    this.label = 1;
                    cashInAccount = zzrVar.getCashInAccount(this);
                    if (cashInAccount == coroutineSingletons4) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    cashInAccount = obj;
                }
                LiteCashInResult liteCashInResult = (LiteCashInResult) cashInAccount;
                if (liteCashInResult instanceof LiteCashInResult.Success) {
                    ArrayList<CashInRow> arrayList = ((LiteCashInResult.Success) liteCashInResult).accountInfo.rows;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (CashInRow cashInRow : arrayList) {
                        arrayList2.add(new CashInRowViewModel(cashInRow.title, cashInRow.subtitle, cashInRow.action == CashInRowAction.COPY));
                    }
                    mutableState.setValue(new LiteCashInViewModel.Loaded(arrayList2));
                } else if (liteCashInResult instanceof LiteCashInResult.NeedsRedirect) {
                    liteCashInPresenter.navigator.goTo(liteCashInPresenter.blockersDataNavigator.getNext(liteCashInScreen, OtelConventions.startPlasmaClientScenarioFlow((FlowStarter) liteCashInPresenter.flowStarter, liteCashInScreen, ((LiteCashInResult.NeedsRedirect) liteCashInResult).responseContext, null)));
                } else if (!(liteCashInResult instanceof LiteCashInResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    mutableState.setValue(LiteCashInViewModel.Error.INSTANCE);
                }
                break;
            case 4:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = ((GrantPresenter) obj2).activityEvents;
                    FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 flowExtKt$collectAsStateWithLifecycle$1$1$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(produceStateScope, i4);
                    this.L$0 = null;
                    this.label = 1;
                    Object collect = flow.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowExtKt$collectAsStateWithLifecycle$1$1$1$1, 25), i2), this);
                    if (collect != coroutineSingletons5) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons5) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons5) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StatusInterstitialPresenter statusInterstitialPresenter = (StatusInterstitialPresenter) this.L$0;
                    BlockersScreens.StatusInterstitial statusInterstitial = statusInterstitialPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(statusInterstitialPresenter.blockersHelper, (BlockerAction) obj2, statusInterstitial, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons6) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier = ((ActivityRouter) this.L$0).activityScreenInitialArgumentsSupplier;
                    String str2 = ((ClientRoute.ViewActivitySearch) obj2).query;
                    this.label = 1;
                    Object send = realActivityScreenInitialArgumentsSupplier._initialSearchQueries.send(str2, this);
                    if (send != coroutineSingletons7) {
                        send = Unit.INSTANCE;
                    }
                    if (send == coroutineSingletons7) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                ClientRoute.ViewThreadedCustomerActivity viewThreadedCustomerActivity = (ClientRoute.ViewThreadedCustomerActivity) obj2;
                ActivityRouter activityRouter = (ActivityRouter) this.L$0;
                ?? r2 = activityRouter.navigator;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RewardSlotQueries rewardSlotQueries = activityRouter.cashDatabase.loyaltyMerchantQueries;
                    String str3 = viewThreadedCustomerActivity.customerToken;
                    rewardSlotQueries.getClass();
                    LoyaltyMerchantQueries$loyaltyMerchant$2 loyaltyMerchantQueries$loyaltyMerchant$2 = LoyaltyMerchantQueries$loyaltyMerchant$2.INSTANCE;
                    RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardSlotQueries, str3, new OfflineQueries$$ExternalSyntheticLambda0(rewardSlotQueries), i2)), activityRouter.ioDispatcher), 6);
                    this.label = 1;
                    first = FlowKt.first(realCustomerStore$getCustomerForId$$inlined$map$1, this);
                    if (first == coroutineSingletons8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                String str4 = (String) first;
                if (str4 != null) {
                    r11 = (StringsKt__StringsJVMKt.startsWith(str4, "M_", false) || StringsKt__StringsJVMKt.startsWith(str4, "BRAND_", false)) ? new MerchantScreen$MerchantProfileScreen(new RedactedString(str4), GetProfileDetailsContext.ACTIVITY_OTHER, null, BackNavigationAction.CLOSE, null) : 0;
                    if (r11 != 0) {
                        r2.goTo(r11);
                    }
                } else {
                    LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                    profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(viewThreadedCustomerActivity.customerToken), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : null, RealUuidGenerator.generate(), GetProfileDetailsContext.ACTIVITY_OTHER, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, ActivityScreen.INSTANCE, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                    r2.goTo(profileFor);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppMessageManager realAppMessageManager = ((BackgroundRouter) this.L$0).appMessageManager;
                    String str5 = ((ClientRoute.RemoveAppMessageInBackground) obj2).campaignToken;
                    this.label = 1;
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = realAppMessageManager.repository;
                    Object withContext4 = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new RealAppMessageRepositoryWriter$deleteByMessageToken$2(realAppMessageRepositoryWriter, str5, r11, i6), this);
                    Object obj3 = withContext4;
                    if (withContext4 != coroutineSingletons9) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 != coroutineSingletons9) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons9) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAppMessageManager realAppMessageManager2 = ((BackgroundRouter) this.L$0).appMessageManager;
                    String str6 = ((ClientRoute.RemoveAppMessageByTokenInBackground) obj2).messageToken;
                    this.label = 1;
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter2 = realAppMessageManager2.repository;
                    Object withContext5 = JobKt.withContext(realAppMessageRepositoryWriter2.ioDispatcher, new RealAppMessageRepositoryWriter$deleteByMessageToken$2(realAppMessageRepositoryWriter2, str6, r11, i5), this);
                    Object obj4 = withContext5;
                    if (withContext5 != coroutineSingletons10) {
                        obj4 = Unit.INSTANCE;
                    }
                    if (obj4 != coroutineSingletons10) {
                        obj4 = Unit.INSTANCE;
                    }
                    if (obj4 == coroutineSingletons10) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                BackgroundRouter backgroundRouter = (BackgroundRouter) obj2;
                RealOffersSheetRepository realOffersSheetRepository = backgroundRouter.offerSheetRepository;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                int i17 = 26;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (Intrinsics.areEqual(StringsKt.toBooleanStrictOrNull(((ClientRoute.UpdateAfterpayApplet) this.L$0).blocking), Boolean.TRUE)) {
                        RealAfterpayAppletRepository realAfterpayAppletRepository = backgroundRouter.afterpayAppletRepository;
                        this.label = 1;
                        break;
                    }
                    Scene.AnonymousClass1 anonymousClass12 = new Scene.AnonymousClass1(backgroundRouter, (Continuation) r11, 17);
                    this.label = 4;
                } else if (i16 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    OfferType offerType = OfferType.PAY_LATER_INN;
                    this.label = 2;
                    Object withContext6 = JobKt.withContext(realOffersSheetRepository.ioDispatcher, new GenieViewKt$GenieView$1$1(realOffersSheetRepository, offerType, r11, i17), this);
                    Object obj6 = withContext6;
                    if (withContext6 != obj5) {
                        obj6 = Unit.INSTANCE;
                        break;
                    }
                } else if (i16 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    OfferType offerType2 = OfferType.PAY_LATER_OON;
                    this.label = 3;
                    Object withContext7 = JobKt.withContext(realOffersSheetRepository.ioDispatcher, new GenieViewKt$GenieView$1$1(realOffersSheetRepository, offerType2, r11, i17), this);
                    Object obj7 = withContext7;
                    if (withContext7 != obj5) {
                        obj7 = Unit.INSTANCE;
                        break;
                    }
                } else if (i16 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    Scene.AnonymousClass1 anonymousClass122 = new Scene.AnonymousClass1(backgroundRouter, (Continuation) r11, 17);
                    this.label = 4;
                    break;
                } else if (i16 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                ClientRoute.CollectGpsLocationData collectGpsLocationData = (ClientRoute.CollectGpsLocationData) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest forest = Timber.Forest;
                    String str7 = collectGpsLocationData.trigger;
                    String str8 = collectGpsLocationData.eventToken;
                    forest.i(CameraSelector$$ExternalSyntheticOutline0.m("Received CollectGpsLocationData client route: trigger: ", str7, ", event_token: ", str8), new Object[0]);
                    BackgroundRouter backgroundRouter2 = (BackgroundRouter) obj2;
                    RealGpsLocationManager realGpsLocationManager = backgroundRouter2.gpsLocationManager;
                    String str9 = collectGpsLocationData.trigger;
                    String str10 = str8 + "_" + backgroundRouter2.deviceId.$$delegate_0.getValue();
                    this.label = 1;
                    collectGpsLocation = realGpsLocationManager.collectGpsLocation(str9, str10, (r13 & 4) == 0, (r13 & 8) == 0, this);
                    if (collectGpsLocation == coroutineSingletons11) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                DocumentsRouter documentsRouter = (DocumentsRouter) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow documentsForCategory = documentsRouter.documentEntitiesMapper.documentsForCategory(StatementType.BTC_TAX_FORM);
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(documentsForCategory, this);
                    if (firstOrNull == coroutineSingletons12) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                List list = (List) firstOrNull;
                if (list != null) {
                    ClientRoute.ViewDocumentBtcTaxForm viewDocumentBtcTaxForm = (ClientRoute.ViewDocumentBtcTaxForm) obj2;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (Intrinsics.areEqual(((ProfileDocumentModel) next).token, viewDocumentBtcTaxForm.key)) {
                                profileDocumentModel = next;
                            }
                        }
                    }
                    profileDocumentModel2 = profileDocumentModel;
                }
                if (profileDocumentModel2 != null && profileDocumentModel2.emailForwardable) {
                    documentsRouter.navigator.goTo(new DocumentsDownloadOptionsScreen(profileDocumentModel2.token, StatementType.BTC_TAX_FORM, DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE));
                }
                break;
            case 13:
                DocumentsRouter documentsRouter2 = (DocumentsRouter) this.L$0;
                Navigator navigator = documentsRouter2.navigator;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDocumentEntitiesMapper realDocumentEntitiesMapper = documentsRouter2.documentEntitiesMapper;
                    String str11 = ((ClientRoute.ViewDocumentStockMonthlyStatement) obj2).key;
                    InstrumentQueries instrumentQueries = realDocumentEntitiesMapper.documentQueries;
                    instrumentQueries.getClass();
                    DocumentQueries$selectForToken$2 documentQueries$selectForToken$2 = DocumentQueries$selectForToken$2.INSTANCE;
                    RealCustomerStore$getCustomerForId$$inlined$map$1 realCustomerStore$getCustomerForId$$inlined$map$12 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries, str11, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries, i5), (byte) 0)), realDocumentEntitiesMapper.ioDispatcher), 11);
                    this.label = 1;
                    first2 = FlowKt.first(realCustomerStore$getCustomerForId$$inlined$map$12, this);
                    if (first2 == coroutineSingletons13) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    first2 = obj;
                }
                Long l = (Long) first2;
                if (l == null) {
                    navigator.goTo(DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE);
                } else {
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar.setTimeInMillis(l.longValue());
                    navigator.goTo(new DocumentsScreen.DocumentsScreenStockMonthlyForMonth(calendar.get(1)));
                }
                break;
            case 14:
                ClientRoute.ViewDocumentAfterpayMonthlyStatement viewDocumentAfterpayMonthlyStatement = (ClientRoute.ViewDocumentAfterpayMonthlyStatement) obj2;
                DocumentsRouter documentsRouter3 = (DocumentsRouter) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayStatementManager realAfterpayStatementManager = documentsRouter3.afterpayStatementManager;
                    String str12 = viewDocumentAfterpayMonthlyStatement.token;
                    this.label = 1;
                    afterpayStatementDownloadData = realAfterpayStatementManager.getAfterpayStatementDownloadData(str12, this);
                    if (afterpayStatementDownloadData == coroutineSingletons14) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    afterpayStatementDownloadData = obj;
                }
                AfterpayStatementDownloadData afterpayStatementDownloadData2 = (AfterpayStatementDownloadData) afterpayStatementDownloadData;
                if (afterpayStatementDownloadData2 != null) {
                    documentsRouter3.navigator.goTo(new DocumentDownloaderScreen.AccountStatementDownloaderScreen(new DocumentDownloaderScreen.DocumentData(afterpayStatementDownloadData2.displayName, afterpayStatementDownloadData2.fileName, afterpayStatementDownloadData2.url), afterpayStatementDownloadData2.downloadMessage, viewDocumentAfterpayMonthlyStatement.token, i4));
                }
                break;
            case 15:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    if (parcelableSnapshotMutableIntState.getIntValue() == 0) {
                        this.label = 1;
                        break;
                    }
                }
                if (parcelableSnapshotMutableIntState.getIntValue() < ((String) this.L$0).length()) {
                    this.label = 2;
                    break;
                }
            case 16:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj2;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = parcelableSnapshotMutableIntState2.getIntValue() < 0 ? 400L : 2500L;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                parcelableSnapshotMutableIntState2.setIntValue((parcelableSnapshotMutableIntState2.getIntValue() + 1) % ((ImmutableList) this.L$0).size());
                break;
            case 17:
                PagerState pagerState = (PagerState) obj2;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NavigationModel.Ready.Swipe swipe = (NavigationModel.Ready.Swipe) this.L$0;
                    int indexOf = swipe.pages.indexOf(swipe.activePage.value);
                    if (indexOf != -1 && ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() != indexOf) {
                        this.label = 1;
                        animateScrollToPage = pagerState.animateScrollToPage(indexOf, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                        if (animateScrollToPage == coroutineSingletons17) {
                            break;
                        }
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if ((cryptoBalance$StablecoinBalance != null ? cryptoBalance$StablecoinBalance.amount : 0L) > 0) {
                        KeyValue keyValue = ((RealCryptoBalanceRepo) obj2).hasStablecoinActivity;
                        Boolean bool = Boolean.TRUE;
                        this.L$0 = null;
                        this.label = 1;
                        if (keyValue.set(bool, this) == coroutineSingletons18) {
                            break;
                        }
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BitcoinP2pConversionPercentagePresenter bitcoinP2pConversionPercentagePresenter = (BitcoinP2pConversionPercentagePresenter) this.L$0;
                    BitcoinP2pConversionPercentageInputs.SubmissionInteraction submissionInteraction = BitcoinP2pConversionPercentageInputs.SubmissionInteraction.SUBMISSION_INTERACTION_DISABLE;
                    this.label = 1;
                    BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter = bitcoinP2pConversionPercentagePresenter.submitter;
                    CryptoCommonScreens.BitcoinP2pConversionPercentageScreen bitcoinP2pConversionPercentageScreen = bitcoinP2pConversionPercentagePresenter.args;
                    Object submit = bitcoinP2pConversionPercentageSubmitter.submit(bitcoinP2pConversionPercentageScreen, bitcoinP2pConversionPercentageScreen.blockersData, 0L, submissionInteraction, bitcoinP2pConversionPercentagePresenter.navigator, this);
                    Object obj9 = submit;
                    if (submit != obj8) {
                        obj9 = Unit.INSTANCE;
                    }
                    if (obj9 == obj8) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
                ((MutableState) obj2).setValue(Boolean.FALSE);
                break;
            case 20:
                RealProfileManager realProfileManager = (RealProfileManager) obj2;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            ApiResult.Success success = (ApiResult.Success) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        clearProfilePhoto = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = realProfileManager.appService;
                    ClientScenario clientScenario = ClientScenario.PROFILE;
                    ClearProfilePhotoRequest clearProfilePhotoRequest = new ClearProfilePhotoRequest(null, ByteString.EMPTY);
                    this.label = 1;
                    clearProfilePhoto = appService.clearProfilePhoto(clientScenario, null, clearProfilePhotoRequest, this);
                    break;
                }
                ApiResult apiResult = (ApiResult) clearProfilePhoto;
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) apiResult;
                    if (((ClearProfilePhotoResponse) success2.response).status == ClearProfilePhotoResponse.Status.SUCCESS) {
                        RealProfileSyncer realProfileSyncer = realProfileManager.profileSyncer;
                        this.L$0 = success2;
                        this.label = 2;
                        realProfileSyncer.blockingUpdateProfilePhoto(null);
                        break;
                    }
                }
                break;
            case 21:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 != 0) {
                    if (i28 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    NotificationSettingsService notificationSettingsService = ((RealProfileNotificationsRepository) this.L$0).service;
                    UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = new UpdateCategoryNotificationSettingsRequest((List) obj2);
                    this.label = 1;
                    Object updateCategoryNotificationSettings = notificationSettingsService.updateCategoryNotificationSettings(updateCategoryNotificationSettingsRequest, this);
                    if (updateCategoryNotificationSettings != coroutineSingletons20) {
                        break;
                    }
                }
                break;
            case 22:
                PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    access$centerOnSearchAddress = PaperMoneyDepositMapPresenter.access$centerOnSearchAddress(paperMoneyDepositMapPresenter, (SelectedSearchAddressResult) ((AddressResult) obj2), this);
                    if (access$centerOnSearchAddress == coroutineSingletons21) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    access$centerOnSearchAddress = obj;
                }
                LocationViewModel locationViewModel = (LocationViewModel) access$centerOnSearchAddress;
                if (locationViewModel != null) {
                    paperMoneyDepositMapPresenter.cashMapPresenter.searchLocation(locationViewModel);
                }
                break;
            case 23:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((PaperMoneyDepositExpiredBarcodeView) this.L$0).formView.viewEvents;
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(7, (Function1) obj2);
                    this.label = 1;
                    sharedFlowImpl.getClass();
                    SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, anonymousClass2, this);
                    break;
                }
            case 24:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PagerState pagerState2 = (PagerState) this.L$0;
                    int i32 = ((PaperMoneyDepositOnboardingViewModel) obj2).page;
                    this.label = 1;
                    animateScrollToPage2 = pagerState2.animateScrollToPage(i32, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                    if (animateScrollToPage2 == coroutineSingletons23) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.L$0;
                AndroidStringManager androidStringManager = (AndroidStringManager) localHomePresenter.syncer;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DirectDepositForm directDepositForm = (DirectDepositForm) ((MutableState) obj2).getValue();
                    if (directDepositForm != null && (uri = directDepositForm.pdfLocalUri) != null) {
                        CoroutineContext coroutineContext = (CoroutineContext) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                        RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(localHomePresenter, uri, r11, i3);
                        this.label = 1;
                        withContext = JobKt.withContext(coroutineContext, realAppConfigManager$update$2$2, this);
                        if (withContext == coroutineSingletons24) {
                            break;
                        }
                    }
                    IntentLauncher intentLauncher = (IntentLauncher) localHomePresenter.store;
                    Object value = ((DirectDepositManualFormSubmissionScreen) localHomePresenter.embeddedMapEnabled$delegate).getFormDetails().fullName.getValue();
                    value.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.direct_deposit_manual_email_subject)).format(new Object[]{value});
                    format2.getClass();
                    intentLauncher.sendEmail(format2, androidStringManager.get(R.string.direct_deposit_manual_email_body), str);
                    break;
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                str = (String) withContext;
                IntentLauncher intentLauncher2 = (IntentLauncher) localHomePresenter.store;
                Object value2 = ((DirectDepositManualFormSubmissionScreen) localHomePresenter.embeddedMapEnabled$delegate).getFormDetails().fullName.getValue();
                value2.getClass();
                Resources resources2 = androidStringManager.resources;
                resources2.getClass();
                String format22 = new MessageFormat(resources2.getString(R.string.direct_deposit_manual_email_subject)).format(new Object[]{value2});
                format22.getClass();
                intentLauncher2.sendEmail(format22, androidStringManager.get(R.string.direct_deposit_manual_email_body), str);
                break;
            case 26:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                PromotionDetails promotionDetails = (PromotionDetails) disclosurePresenter.analytics;
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnleashContext unleashContext = (UnleashContext) disclosurePresenter.blockersNavigator;
                    PromotionDetails.Identifier identifier = promotionDetails.identifier;
                    this.L$0 = produceStateScope2;
                    this.label = 1;
                    if (identifier instanceof PromotionDetails.Identifier.DetailsToken) {
                        templateTokenPage = unleashContext.getDetailsTokenPage((PromotionDetails.Identifier.DetailsToken) identifier, this);
                    } else if (identifier instanceof PromotionDetails.Identifier.TreehousePath) {
                        templateTokenPage = unleashContext.getTreehousePage((PromotionDetails.Identifier.TreehousePath) identifier, this);
                        if (templateTokenPage != coroutineSingletons25) {
                            templateTokenPage = (PromotionDetailsViewModel.DetailsPageData) templateTokenPage;
                        }
                    } else if (!(identifier instanceof PromotionDetails.Identifier.TemplateToken)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        templateTokenPage = unleashContext.getTemplateTokenPage((PromotionDetails.Identifier.TemplateToken) identifier, this);
                    }
                    if (templateTokenPage == coroutineSingletons25) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    templateTokenPage = obj;
                }
                PromotionDetailsViewModel.DetailsPageData detailsPageData = (PromotionDetailsViewModel.DetailsPageData) templateTokenPage;
                if (detailsPageData != null) {
                    PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData = promotionDetails.animationData;
                    loading = new PromotionDetailsViewModel.Loaded(detailsPageData, (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator, promotionDetailsTransitionFactory$AnimationData != null ? promotionDetailsTransitionFactory$AnimationData.id : null, promotionDetails.identifier instanceof PromotionDetails.Identifier.TreehousePath);
                } else {
                    PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData2 = promotionDetails.animationData;
                    loading = new PromotionDetailsViewModel.Loading(promotionDetailsTransitionFactory$AnimationData2 != null ? promotionDetailsTransitionFactory$AnimationData2.id : null);
                }
                produceStateScope2.setValue(loading);
                break;
            case 27:
                RealSignatureManager realSignatureManager = (RealSignatureManager) obj2;
                RealSignatureRepo realSignatureRepo = (RealSignatureRepo) realSignatureManager.signatureRepo;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    withContext2 = JobKt.withContext(realSignatureRepo.ioDispatcher, new RealSignatureRepo$retrieveSignature$2(realSignatureRepo, null), this);
                    break;
                } else if (i35 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                } else if (i35 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    signatureFetch = (SignatureFetch.Failure) this.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Exception e) {
                        e = e;
                        ((RealSignatureManagerLogger) realSignatureManager.logger).logGenerateSignatureFailure(e, (SignatureFetch.Failure) signatureFetch);
                        return Unit.INSTANCE;
                    }
                }
                SignatureFetch signatureFetch2 = (SignatureFetch) withContext2;
                if (signatureFetch2 instanceof SignatureFetch.Failure) {
                    try {
                        this.L$0 = (SignatureFetch.Failure) signatureFetch2;
                        this.label = 2;
                        Object withContext8 = JobKt.withContext(realSignatureRepo.ioDispatcher, new RealSignatureRepo$generateSignature$2(realSignatureRepo, null), this);
                        if (withContext8 == coroutineSingletons26) {
                            break;
                        } else {
                            withContext8 = Unit.INSTANCE;
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        signatureFetch = signatureFetch2;
                        ((RealSignatureManagerLogger) realSignatureManager.logger).logGenerateSignatureFailure(e, (SignatureFetch.Failure) signatureFetch);
                        return Unit.INSTANCE;
                    }
                }
            case 28:
                EarningsChartDataSource earningsChartDataSource = (EarningsChartDataSource) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 != 0) {
                    if (i36 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = (EglCore) obj2;
                    this.L$0 = null;
                    this.label = 1;
                    if (Intrinsics.areEqual(earningsChartDataSource, EarningsChartDataSource.Loading.INSTANCE)) {
                        withContext3 = EarningsChartResult.Loading.INSTANCE;
                    } else if (earningsChartDataSource instanceof EarningsChartDataSource.Ready) {
                        withContext3 = new EarningsChartResult.Success(((EarningsChartDataSource.Ready) earningsChartDataSource).chartData);
                    } else if (!(earningsChartDataSource instanceof EarningsChartDataSource.Fetch)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        withContext3 = JobKt.withContext((CoroutineContext) eglCore.eglConfig, new EntitySyncerKt$hasSyncedFlow$1(((EarningsChartDataSource.Fetch) earningsChartDataSource).period, eglCore, (Continuation) r11, 29), this);
                    }
                    if (withContext3 == coroutineSingletons27) {
                        break;
                    } else {
                        break;
                    }
                }
            default:
                Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetEarningsChartRequest getEarningsChartRequest = new GetEarningsChartRequest((EarningsTimeFrame) this.L$0, ByteString.EMPTY);
                    PaychecksAppService paychecksAppService = (PaychecksAppService) ((EglCore) obj2).eglContext;
                    this.label = 1;
                    earningsChart = paychecksAppService.getEarningsChart(getEarningsChartRequest, this);
                    break;
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    earningsChart = obj;
                }
                ApiResult apiResult2 = (ApiResult) earningsChart;
                if (apiResult2 instanceof ApiResult.Success) {
                    break;
                } else if (apiResult2 instanceof ApiResult.Failure) {
                    obj10 = new EarningsChartResult.Success(null);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntitySyncerKt$hasSyncedFlow$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$this_hasSyncedFlow = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EntitySyncerKt$hasSyncedFlow$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_hasSyncedFlow = obj;
    }
}
