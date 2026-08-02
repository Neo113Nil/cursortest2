package com.squareup.cash.data.profile;

import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import androidx.compose.ui.draw.RotateKt;
import androidx.emoji2.text.MetadataRepo;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.cdf.activityrecord.ActivityRecordCancelStart;
import com.squareup.cash.cdf.atm.AtmWithdrawalViewExplainer;
import com.squareup.cash.cdf.atm.AtmWithdrawalViewLocation;
import com.squareup.cash.cdf.atm.AtmWithdrawalViewMap;
import com.squareup.cash.cdf.booklet.BookletInteractViewScreen;
import com.squareup.cash.cdf.crypto.CryptoSendStart;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.cash.cdf.growtools.GrowToolsManageEnter;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewMerchant;
import com.squareup.cash.cdf.roundups.RoundUpsChangeViewHome;
import com.squareup.cash.cdf.singleusepayment.SingleUsePaymentCancelViewConfirmSheet;
import com.squareup.cash.cdf.stock.StockViewPresentStockSelector;
import com.squareup.cash.cdf.stock.StockViewViewInvestSearch;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.documents.LegalDocumentQueries$selectAll$2;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearchQueries;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalExplainerPresenter;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.presenter.details.PaperMoneyDepositMerchantDetailsPresenter;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferType;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.favorites.data.RealFavoritesRepository;
import com.squareup.cash.formview.components.arcade.ArcadeFormCheckBoxView;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$selectAll$2;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.swampgl.components.MeshData;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAmount;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.random.PlatformRandomKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealProfileManager$profileOrNull$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileManager$profileOrNull$2(HeartPoseController heartPoseController, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        WandPose wandPose = WandPose.Float;
        this.this$0 = heartPoseController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealProfileManager$profileOrNull$2((RealProfileManager) obj2, continuation, 0);
            case 1:
                return new RealProfileManager$profileOrNull$2((MetadataRepo) obj2, continuation, 1);
            case 2:
                return new RealProfileManager$profileOrNull$2((PoolsListPresenter) obj2, continuation, 2);
            case 3:
                return new RealProfileManager$profileOrNull$2((AtmWithdrawalExplainerPresenter) obj2, continuation, 3);
            case 4:
                return new RealProfileManager$profileOrNull$2((AtmWithdrawalMapPresenter) obj2, continuation, 4);
            case 5:
                return new RealProfileManager$profileOrNull$2((LocalHomePresenter) obj2, continuation, 5);
            case 6:
                return new RealProfileManager$profileOrNull$2((PaperMoneyDepositMerchantDetailsPresenter) obj2, continuation, 6);
            case 7:
                return new RealProfileManager$profileOrNull$2((DisclosurePresenter) obj2, continuation, 7);
            case 8:
                return new RealProfileManager$profileOrNull$2((TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj2, continuation, 8);
            case 9:
                return new RealProfileManager$profileOrNull$2((CardStudioPresenter) obj2, continuation, 9);
            case 10:
                return new RealProfileManager$profileOrNull$2((LocalEditorialPresenter) obj2, continuation, 10);
            case 11:
                return new RealProfileManager$profileOrNull$2((RealFavoritesRepository) obj2, continuation, 11);
            case 12:
                WandPose wandPose = WandPose.Float;
                return new RealProfileManager$profileOrNull$2((HeartPoseController) obj2, continuation);
            case 13:
                WandPose wandPose2 = WandPose.Float;
                return new RealProfileManager$profileOrNull$2((MiniCardPoseController) obj2, continuation);
            case 14:
                WandPose wandPose3 = WandPose.Float;
                return new RealProfileManager$profileOrNull$2((WandPoseController) obj2, continuation);
            case 15:
                return new RealProfileManager$profileOrNull$2((byte[]) obj2, continuation, 15);
            case 16:
                return new RealProfileManager$profileOrNull$2((ArcadeFormCheckBoxView) obj2, continuation, 16);
            case 17:
                return new RealProfileManager$profileOrNull$2((Shaker) obj2, continuation, 17);
            case 18:
                return new RealProfileManager$profileOrNull$2((Instrument$Adapter) obj2, continuation, 18);
            case 19:
                return new RealProfileManager$profileOrNull$2((PBRMaterial) obj2, continuation, 19);
            case 20:
                return new RealProfileManager$profileOrNull$2((MeshGeometry) obj2, continuation, 20);
            case 21:
                return new RealProfileManager$profileOrNull$2((MusicPresenter) obj2, continuation, 21);
            case 22:
                return new RealProfileManager$profileOrNull$2((RealAccountOutboundNavigator) obj2, continuation, 22);
            case 23:
                return new RealProfileManager$profileOrNull$2((PaymentActionHandler) obj2, continuation, 23);
            case 24:
                return new RealProfileManager$profileOrNull$2((LocalEditorialPresenter) obj2, continuation, 24);
            case 25:
                return new RealProfileManager$profileOrNull$2((DisclosurePresenter) obj2, continuation, 25);
            case 26:
                return new RealProfileManager$profileOrNull$2((RealStocksAppletTilePriceMovementRepository) obj2, continuation, 26);
            case 27:
                return new RealProfileManager$profileOrNull$2((PersistentHistoricalDataCache) obj2, continuation, 27);
            case 28:
                return new RealProfileManager$profileOrNull$2((TapToPayPresenter) obj2, continuation, 28);
            default:
                return new RealProfileManager$profileOrNull$2((InvestingSearchPresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealProfileManager$profileOrNull$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType;
        MeshData loadMeshDataV1;
        int i = this.$r8$classId;
        String str = null;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((RealProfileManager) obj2).profileQueries.select$2().executeAsOneOrNull();
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionQueries sessionQueries = (SessionQueries) ((MetadataRepo) obj2).mTypeface;
                sessionQueries.getClass();
                LegalDocumentQueries$selectAll$2 legalDocumentQueries$selectAll$2 = LegalDocumentQueries$selectAll$2.INSTANCE;
                SqlDriver sqlDriver = sessionQueries.driver;
                ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4 = new ProfileQueries$$ExternalSyntheticLambda4(27);
                sqlDriver.getClass();
                return new SimpleQuery(1009654678, new String[]{"LegalDocument"}, sqlDriver, "LegalDocument.sq", "selectAll", "SELECT LegalDocument.token, LegalDocument.category, LegalDocument.title, LegalDocument.document_date, LegalDocument.url, LegalDocument.owner_token\nFROM LegalDocument\nORDER BY title DESC", profileQueries$$ExternalSyntheticLambda4).executeAsList();
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EglCore eglCore = (EglCore) ((PoolsListPresenter) obj2).args;
                TransacterImpl transacterImpl = (TransacterImpl) eglCore.eglConfig;
                int ordinal = ((PhysicalCashDepositAddressEntryScreen.AddressSearchType) eglCore.eglContext).ordinal();
                if (ordinal == 0) {
                    transacterImpl.getClass();
                    PhysicalDepositUsAddressSearchQueries physicalDepositUsAddressSearchQueries = (PhysicalDepositUsAddressSearchQueries) transacterImpl;
                    physicalDepositUsAddressSearchQueries.driver.execute(1284995173, "DELETE FROM physicalDepositUsAddressSearch", null);
                    physicalDepositUsAddressSearchQueries.notifyQueries(1284995173, new PasswordInfoQueries$$ExternalSyntheticLambda0(20));
                } else if (ordinal == 1) {
                    transacterImpl.getClass();
                    AtmWithdrawalAddressSearchQueries atmWithdrawalAddressSearchQueries = (AtmWithdrawalAddressSearchQueries) transacterImpl;
                    atmWithdrawalAddressSearchQueries.driver.execute(-1125910001, "DELETE FROM atmWithdrawalAddressSearch", null);
                    atmWithdrawalAddressSearchQueries.notifyQueries(-1125910001, new PasswordInfoQueries$$ExternalSyntheticLambda0(9));
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    transacterImpl.getClass();
                    BitcoinMapAddressSearchQueries bitcoinMapAddressSearchQueries = (BitcoinMapAddressSearchQueries) transacterImpl;
                    bitcoinMapAddressSearchQueries.driver.execute(-1263658410, "DELETE FROM bitcoinMapAddressSearch", null);
                    bitcoinMapAddressSearchQueries.notifyQueries(-1263658410, new PasswordInfoQueries$$ExternalSyntheticLambda0(15));
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AtmWithdrawalExplainerPresenter) obj2).analytics.track(new AtmWithdrawalViewExplainer(), null);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AtmWithdrawalMapPresenter) obj2).analytics.track(new AtmWithdrawalViewMap(), null);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj2;
                ((Analytics) localHomePresenter.clearMarketingBadgesIfNeeded).track(new AtmWithdrawalViewLocation(((GetRetailerLocationsResponse.RetailerLocation) localHomePresenter.neighborhoodsTabContentEnabled$delegate).retailer_location_token), null);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaperMoneyDepositMerchantDetailsPresenter paperMoneyDepositMerchantDetailsPresenter = (PaperMoneyDepositMerchantDetailsPresenter) obj2;
                paperMoneyDepositMerchantDetailsPresenter.analytics.track(new PaperMoneyDepositViewMerchant(paperMoneyDepositMerchantDetailsPresenter.args.retailerLocation.retailer_location_token), null);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealPromotionDetailsAnalyticsService realPromotionDetailsAnalyticsService = (RealPromotionDetailsAnalyticsService) ((DisclosurePresenter) obj2).args;
                PromotionDetails promotionDetails = realPromotionDetailsAnalyticsService.args;
                PromotionDetails promotionDetails2 = realPromotionDetailsAnalyticsService.args;
                PromotionDetails.Identifier identifier = promotionDetails.identifier;
                if (identifier instanceof PromotionDetails.Identifier.TemplateToken) {
                    PromotionDetails.Identifier.TemplateToken templateToken = (PromotionDetails.Identifier.TemplateToken) identifier;
                    realPromotionDetailsAnalyticsService.track(new DetailsPageInteractViewPage(templateToken.templateToken, templateToken.templateVersion, null, realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, promotionDetails2.persisted ? DetailsPageInteractViewPage.DetailsPageOrigin.DISCOVER : DetailsPageInteractViewPage.DetailsPageOrigin.DEEP_LINK, 4), null);
                } else {
                    realPromotionDetailsAnalyticsService.track(new DetailsPageInteractViewPage(null, null, identifier.getToken(), realPromotionDetailsAnalyticsService.flowToken, promotionDetails.referrerFlowToken, promotionDetails2.persisted ? DetailsPageInteractViewPage.DetailsPageOrigin.DISCOVER : DetailsPageInteractViewPage.DetailsPageOrigin.DEEP_LINK, 3), null);
                    if (identifier instanceof PromotionDetails.Identifier.TreehousePath) {
                        String str2 = ((PromotionDetails.Identifier.TreehousePath) identifier).token;
                        realPromotionDetailsAnalyticsService.track(new BookletInteractViewScreen(str2, realPromotionDetailsAnalyticsService.flowToken, Intrinsics.areEqual(str2, "PaychecksBooklet") ? BookletInteractViewScreen.BookletOrigin.PAYCHECKS : Intrinsics.areEqual(str2, "SpendBenefitsBooklet") ? BookletInteractViewScreen.BookletOrigin.SPENDING : null, 4), null);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj2).invoke();
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                ManagedAccountTransferLoadingScreen managedAccountTransferLoadingScreen = (ManagedAccountTransferLoadingScreen) cardStudioPresenter.appConfig;
                int ordinal2 = managedAccountTransferLoadingScreen.transferType.ordinal();
                if (ordinal2 == 0) {
                    managedAccountTransferManager$ManagedAccountTransferType = ManagedAccountTransferManager$ManagedAccountTransferType.ADD_MONEY;
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    managedAccountTransferManager$ManagedAccountTransferType = ManagedAccountTransferManager$ManagedAccountTransferType.WITHDRAW;
                }
                ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType2 = managedAccountTransferManager$ManagedAccountTransferType;
                RealManagedAccountTransferManager realManagedAccountTransferManager = (RealManagedAccountTransferManager) cardStudioPresenter.args;
                Money money = managedAccountTransferLoadingScreen.amount;
                String str3 = managedAccountTransferLoadingScreen.sponsorInstrumentToken;
                String str4 = managedAccountTransferLoadingScreen.dependentInstrumentToken;
                String str5 = (String) cardStudioPresenter.cardStudioQueries;
                money.getClass();
                str5.getClass();
                if (realManagedAccountTransferManager.transferInProgress.compareAndSet(false, true)) {
                    JobKt.launch$default(realManagedAccountTransferManager.scope, null, null, new RealIdvPresenter$models$1$1(realManagedAccountTransferManager, managedAccountTransferManager$ManagedAccountTransferType2, money, str3, str4, str5, null, 24), 3);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                Sponsor sponsor = ((SponsorLedInviteScreen) localEditorialPresenter.launcher).sponsor;
                FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                try {
                    LinkText linkText = sponsor.primary_cta;
                    String str6 = linkText != null ? linkText.url : null;
                    if (str6 != null) {
                        str = str6;
                    } else {
                        try {
                            throw new IllegalArgumentException("sponsor.primary_cta.url");
                        } catch (Exception e) {
                            ((ErrorReporter) localEditorialPresenter.installedStore).report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), familyParsingErrorFactory, null), (SampleStrategy) localEditorialPresenter.clock);
                        }
                    }
                    if (str != null) {
                        ((RealRouter) localEditorialPresenter.screen).route(new RoutingParams(null, null, null, null, null, null, 511), str);
                    }
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(sponsor.getClass()), familyParsingErrorFactory, null);
                }
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealFavoritesRepository realFavoritesRepository = (RealFavoritesRepository) obj2;
                AndroidClock androidClock = realFavoritesRepository.clock;
                long epochSecond = Instant.ofEpochMilli(androidClock.millis()).atZone(ZoneId.of(androidClock.timeZone().getID())).minus((TemporalAmount) Period.ofMonths(6)).toEpochSecond();
                List list = (List) realFavoritesRepository.syncValueReader.getAllValues(AndroidSyncValueSpecs.Favorite, new FamilyActivityFixtures$$ExternalSyntheticLambda0(18)).getValue();
                SessionQueries sessionQueries2 = realFavoritesRepository.favoriteRecipientQueries;
                List list2 = list;
                sessionQueries2.getClass();
                list2.getClass();
                return new SyncEntityQueries$SelectAllWithEntityTypeQuery(sessionQueries2, epochSecond, list2, new OfflineQueries$$ExternalSyntheticLambda1(1)).executeAsList();
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((HeartPoseController) obj2).delegate.setPose(WandPose.Review);
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MiniCardPoseController) obj2).delegate.setPose(WandPose.Review);
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((WandPoseController) obj2).setPose(WandPose.Review);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                byte[] bArr = (byte[]) obj2;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArcadeFormCheckBoxView arcadeFormCheckBoxView = (ArcadeFormCheckBoxView) obj2;
                arcadeFormCheckBoxView.onEvent.invoke(new FormViewEvent.UpdateResultEvent.CheckBoxChecked(arcadeFormCheckBoxView.id, new SubmitFormRequest.ElementResult.CheckBoxResult(Boolean.valueOf(arcadeFormCheckBoxView.isChecked$1()), ByteString.EMPTY)));
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Shaker) obj2).shake();
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) ((Instrument$Adapter) obj2).card_brandAdapter;
                gpsConfigQueries.getClass();
                GpsConfigQueries$selectAll$2 gpsConfigQueries$selectAll$2 = GpsConfigQueries$selectAll$2.INSTANCE;
                SqlDriver sqlDriver2 = gpsConfigQueries.driver;
                GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = new GpsConfigQueries$$ExternalSyntheticLambda2(gpsConfigQueries);
                sqlDriver2.getClass();
                return new SimpleQuery(-1114815439, new String[]{"gpsConfig"}, sqlDriver2, "GpsConfig.sq", "selectAll", "SELECT gpsConfig.consent_status, gpsConfig.precise_enabled, gpsConfig.location_updated_at FROM gpsConfig", gpsConfigQueries$$ExternalSyntheticLambda2).executeAsOneOrNull();
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PBRMaterial pBRMaterial = (PBRMaterial) obj2;
                if (pBRMaterial == null) {
                    pBRMaterial = null;
                }
                if (pBRMaterial == null) {
                    return null;
                }
                int createProgram = DoubleUtils.createProgram(pBRMaterial.vertexShader, pBRMaterial.fragmentShader);
                int glGetUniformLocation = GLES20.glGetUniformLocation(createProgram, "modelMatrix");
                DoubleUtils.checkLocation(glGetUniformLocation, "modelMatrix");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(createProgram, "normalMatrix");
                DoubleUtils.checkLocation(glGetUniformLocation2, "normalMatrix");
                int glGetUniformLocation3 = GLES20.glGetUniformLocation(createProgram, "mvpMatrix");
                DoubleUtils.checkLocation(glGetUniformLocation3, "mvpMatrix");
                int glGetUniformLocation4 = GLES20.glGetUniformLocation(createProgram, "cameraPosition");
                DoubleUtils.checkLocation(glGetUniformLocation4, "cameraPosition");
                int glGetUniformLocation5 = GLES20.glGetUniformLocation(createProgram, "lightPositions");
                DoubleUtils.checkLocation(glGetUniformLocation5, "lightPositions");
                int glGetUniformLocation6 = GLES20.glGetUniformLocation(createProgram, "lightColors");
                DoubleUtils.checkLocation(glGetUniformLocation6, "lightColors");
                int glGetAttribLocation = GLES20.glGetAttribLocation(createProgram, "position");
                DoubleUtils.checkLocation(glGetAttribLocation, "position");
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(createProgram, "normal");
                DoubleUtils.checkLocation(glGetAttribLocation2, "normal");
                int glGetAttribLocation3 = GLES20.glGetAttribLocation(createProgram, "tangent");
                DoubleUtils.checkLocation(glGetAttribLocation3, "tangent");
                int glGetAttribLocation4 = GLES20.glGetAttribLocation(createProgram, "bitangent");
                DoubleUtils.checkLocation(glGetAttribLocation4, "bitangent");
                int glGetAttribLocation5 = GLES20.glGetAttribLocation(createProgram, "uv");
                DoubleUtils.checkLocation(glGetAttribLocation5, "uv");
                return new PBRMaterial.PBRMaterialInstance(createProgram, glGetUniformLocation, glGetUniformLocation2, glGetUniformLocation3, glGetUniformLocation4, glGetUniformLocation5, glGetUniformLocation6, glGetAttribLocation, glGetAttribLocation2, glGetAttribLocation3, glGetAttribLocation4, glGetAttribLocation5);
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MeshGeometry meshGeometry = (MeshGeometry) obj2;
                InputStream open = meshGeometry.context.getAssets().open(meshGeometry.meshName);
                try {
                    open.getClass();
                    ByteBuffer order = ByteBuffer.wrap(ByteStreamsKt.readBytes(open)).order(ByteOrder.LITTLE_ENDIAN);
                    byte[] bArr2 = new byte[8];
                    order.get(bArr2);
                    if (!new String(bArr2, Charsets.UTF_8).equals("CASHMESH")) {
                        throw new IllegalArgumentException("Invalid CashMesh file: bad magic");
                    }
                    int i2 = order.getInt();
                    int i3 = order.getInt();
                    int i4 = order.getInt();
                    if (i2 == 1) {
                        loadMeshDataV1 = MeshGeometry.loadMeshDataV1(order, i3, i4);
                    } else if (i2 == 2) {
                        loadMeshDataV1 = MeshGeometry.loadMeshDataV2(order, i3, i4);
                    } else {
                        if (i2 != 3) {
                            throw new IllegalArgumentException("Unsupported CashMesh version: " + i2);
                        }
                        loadMeshDataV1 = MeshGeometry.loadMeshDataV3(order, i3, i4);
                    }
                    open.close();
                    return loadMeshDataV1;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Utf8.closeFinally(open, th);
                        throw th2;
                    }
                }
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                Analytics analytics = (Analytics) musicPresenter.musicRepository;
                GrowToolsManagerScreen growToolsManagerScreen = (GrowToolsManagerScreen) musicPresenter.args;
                GrowToolsManagerScreen.Origin origin = growToolsManagerScreen.getOrigin();
                GrowToolsManagerScreen.InvestmentType investmentType = growToolsManagerScreen.f1144type;
                origin.getClass();
                analytics.track(new GrowToolsManageEnter(PlatformRandomKt.toCdfType(origin), PlatformRandomKt.toCdfType(investmentType)), null);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealAccountOutboundNavigator) obj2).analytics.track(new RoundUpsChangeViewHome(), null);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((PaymentActionHandler) obj2).analytics.track(new CryptoSendStart(CryptoSendStart.CryptoSendStartSource.REVERSE_DEPOSIT), null);
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((LocalEditorialPresenter) obj2).launcher).track(new ActivityRecordCancelStart(), null);
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                ((Analytics) disclosurePresenter.analytics).track(new SingleUsePaymentCancelViewConfirmSheet(((HistoryScreens.CancelPendingSupPaymentScreen) disclosurePresenter.args).paymentToken), null);
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = ((RealStocksAppletTilePriceMovementRepository) obj2).historicalPriceTickRefresher.stocksActiveOverride;
                Boolean bool = Boolean.TRUE;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PersistentHistoricalDataCache persistentHistoricalDataCache = (PersistentHistoricalDataCache) obj2;
                persistentHistoricalDataCache.entityMemoryCache.clear();
                persistentHistoricalDataCache.bitcoinPortfolio.clear();
                persistentHistoricalDataCache.portfoliosHistoricalDataResponseCache.cache = null;
                persistentHistoricalDataCache.getQueries().transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda2(persistentHistoricalDataCache, 16));
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((TapToPayPresenter) obj2).keyProvider).track(new StockViewPresentStockSelector(), null);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics2 = ((InvestingSearchPresenter) obj2).analytics;
                StockViewViewInvestSearch.InvestingSearchOrigin investingSearchOrigin = StockViewViewInvestSearch.InvestingSearchOrigin.HOME;
                analytics2.track(new StockViewViewInvestSearch(), null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileManager$profileOrNull$2(MiniCardPoseController miniCardPoseController, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        WandPose wandPose = WandPose.Float;
        this.this$0 = miniCardPoseController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileManager$profileOrNull$2(WandPoseController wandPoseController, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 14;
        WandPose wandPose = WandPose.Float;
        this.this$0 = wandPoseController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfileManager$profileOrNull$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
