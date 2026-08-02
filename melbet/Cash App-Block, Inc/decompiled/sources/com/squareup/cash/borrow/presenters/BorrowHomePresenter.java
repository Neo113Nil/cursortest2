package com.squareup.cash.borrow.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.backend.BorrowError;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.backend.RealBorrowDataManager$borrowAppletTiles$5;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.BulletinInteractionRequest;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.lending.LoanDetailsRequest;
import com.squareup.protos.franklin.lending.LoanDetailsResponse;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.Tile;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BorrowHomePresenter implements MoleculePresenter {
    public final CoroutineScope activityScope;
    public final Analytics analytics;
    public final BorrowHome args;
    public final BorrowHome argsAsOrigin;
    public final RealBorrowDataManager borrowDataManager;
    public final ErrorReporter errorReporter;
    public final LendingAppService lendingAppService;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final AndroidStringManager stringManager;

    public BorrowHomePresenter(RealBorrowDataManager realBorrowDataManager, LendingAppService lendingAppService, CoroutineScope coroutineScope, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, ErrorReporter errorReporter, AndroidStringManager androidStringManager, BorrowHome borrowHome, BetterNavigator.ScreenNavigator screenNavigator) {
        borrowHome.getClass();
        this.borrowDataManager = realBorrowDataManager;
        this.lendingAppService = lendingAppService;
        this.activityScope = coroutineScope;
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.stringManager = androidStringManager;
        this.args = borrowHome;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.argsAsOrigin = new BorrowHome(BorrowHome.InitialState.Standard.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$bulletinInteraction(BorrowHomePresenter borrowHomePresenter, String str, ContinuationImpl continuationImpl) {
        BorrowHomePresenter$bulletinInteraction$1 borrowHomePresenter$bulletinInteraction$1;
        int i;
        Object obj;
        if (continuationImpl instanceof BorrowHomePresenter$bulletinInteraction$1) {
            borrowHomePresenter$bulletinInteraction$1 = (BorrowHomePresenter$bulletinInteraction$1) continuationImpl;
            int i2 = borrowHomePresenter$bulletinInteraction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                borrowHomePresenter$bulletinInteraction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = borrowHomePresenter$bulletinInteraction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = borrowHomePresenter$bulletinInteraction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    LendingAppService lendingAppService = borrowHomePresenter.lendingAppService;
                    BulletinInteractionRequest bulletinInteractionRequest = new BulletinInteractionRequest(null, str, ByteString.EMPTY);
                    borrowHomePresenter$bulletinInteraction$1.label = 1;
                    obj2 = lendingAppService.bulletinInteraction(bulletinInteractionRequest, borrowHomePresenter$bulletinInteraction$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (obj instanceof ApiResult.Failure) {
                    Timber.Forest forest = Timber.Forest;
                    if (obj instanceof ApiResult.Failure.NetworkFailure) {
                        obj = ((ApiResult.Failure.NetworkFailure) obj).error.getMessage();
                    }
                    forest.e("Failed to register bulletin interaction: %s", obj);
                }
                return Unit.INSTANCE;
            }
        }
        borrowHomePresenter$bulletinInteraction$1 = new BorrowHomePresenter$bulletinInteraction$1(borrowHomePresenter, continuationImpl);
        Object obj22 = borrowHomePresenter$bulletinInteraction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = borrowHomePresenter$bulletinInteraction$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (obj instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$initialLoanDetailsSheet(BorrowHomePresenter borrowHomePresenter, List list, String str, ContinuationImpl continuationImpl) {
        BorrowHomePresenter$initialLoanDetailsSheet$1 borrowHomePresenter$initialLoanDetailsSheet$1;
        int i;
        BorrowAppletLoanHistoryTile.Data data;
        BorrowAppletLoanHistoryTile.Data data2;
        Iterator it;
        Object obj;
        BorrowAppletLoanHistoryTile.Data.Loan loan;
        if (continuationImpl instanceof BorrowHomePresenter$initialLoanDetailsSheet$1) {
            borrowHomePresenter$initialLoanDetailsSheet$1 = (BorrowHomePresenter$initialLoanDetailsSheet$1) continuationImpl;
            int i2 = borrowHomePresenter$initialLoanDetailsSheet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                borrowHomePresenter$initialLoanDetailsSheet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = borrowHomePresenter$initialLoanDetailsSheet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = borrowHomePresenter$initialLoanDetailsSheet$1.label;
                BorrowAppletLoanHistoryTile.Data.Loan.Details details = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Tile.AbstractC0074Tile abstractC0074Tile = ((Tile) it2.next()).tile;
                        if (abstractC0074Tile != null) {
                            Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile = abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile ? (Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile : null;
                            if (borrowAppletLoanHistoryTile != null) {
                                data = borrowAppletLoanHistoryTile.value;
                                if (data != null) {
                                    if (abstractC0074Tile != null) {
                                        Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile2 = abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile ? (Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile : null;
                                        if (borrowAppletLoanHistoryTile2 != null) {
                                            data2 = borrowAppletLoanHistoryTile2.value;
                                            data2.getClass();
                                            it = data2.loans.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it.next();
                                                if (Intrinsics.areEqual(((BorrowAppletLoanHistoryTile.Data.Loan) obj).legacy_reference_token, str)) {
                                                    break;
                                                }
                                            }
                                            loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
                                            if (loan == null) {
                                                details = loan.loan_details;
                                                details.getClass();
                                                break;
                                            }
                                        }
                                    }
                                    data2 = null;
                                    data2.getClass();
                                    it = data2.loans.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj;
                                    if (loan == null) {
                                    }
                                }
                            }
                        }
                        data = null;
                        if (data != null) {
                        }
                    }
                    if (details != null) {
                        return details;
                    }
                    borrowHomePresenter$initialLoanDetailsSheet$1.label = 1;
                    obj2 = borrowHomePresenter.fetchLoanDetails(str, borrowHomePresenter$initialLoanDetailsSheet$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj2;
            }
        }
        borrowHomePresenter$initialLoanDetailsSheet$1 = new BorrowHomePresenter$initialLoanDetailsSheet$1(borrowHomePresenter, continuationImpl);
        Object obj22 = borrowHomePresenter$initialLoanDetailsSheet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = borrowHomePresenter$initialLoanDetailsSheet$1.label;
        BorrowAppletLoanHistoryTile.Data.Loan.Details details2 = null;
        if (i != 0) {
        }
        return (BorrowAppletLoanHistoryTile.Data.Loan.Details) obj22;
    }

    public static final void access$routeActionUrl(BorrowHomePresenter borrowHomePresenter, String str) {
        RealRouter realRouter = borrowHomePresenter.router;
        BorrowHome borrowHome = borrowHomePresenter.argsAsOrigin;
        realRouter.route(new RoutingParams(borrowHome, null, borrowHome, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable fetchLoanDetails(String str, ContinuationImpl continuationImpl) {
        BorrowHomePresenter$fetchLoanDetails$1 borrowHomePresenter$fetchLoanDetails$1;
        int i;
        Object obj;
        if (continuationImpl instanceof BorrowHomePresenter$fetchLoanDetails$1) {
            borrowHomePresenter$fetchLoanDetails$1 = (BorrowHomePresenter$fetchLoanDetails$1) continuationImpl;
            int i2 = borrowHomePresenter$fetchLoanDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                borrowHomePresenter$fetchLoanDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = borrowHomePresenter$fetchLoanDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = borrowHomePresenter$fetchLoanDetails$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    LoanDetailsRequest loanDetailsRequest = new LoanDetailsRequest(null, str, ByteString.EMPTY);
                    borrowHomePresenter$fetchLoanDetails$1.label = 1;
                    obj2 = this.lendingAppService.loanDetails(loanDetailsRequest, borrowHomePresenter$fetchLoanDetails$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Failure)) {
                    Timber.Forest forest = Timber.Forest;
                    if (obj instanceof ApiResult.Failure.NetworkFailure) {
                        obj = ((ApiResult.Failure.NetworkFailure) obj).error.getMessage();
                    }
                    forest.e("Failed to fetch loan details: %s", obj);
                    return null;
                }
                if (!(obj instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                BorrowAppletLoanHistoryTile.Data.Loan.Details details = ((LoanDetailsResponse) ((ApiResult.Success) obj).response).loan_details;
                details.getClass();
                return details;
            }
        }
        borrowHomePresenter$fetchLoanDetails$1 = new BorrowHomePresenter$fetchLoanDetails$1(this, continuationImpl);
        Object obj22 = borrowHomePresenter$fetchLoanDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = borrowHomePresenter$fetchLoanDetails$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03a3  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data;
        BorrowAppletPaymentTimelineTile.Data data2;
        BorrowAppletBulletinsTile.Data data3;
        BorrowAppletLoanHistoryTile.Data data4;
        BorrowHomeViewModel.Tile loanHistoryTileModel;
        BorrowAppletLoanHistoryTile.Data data5;
        BorrowHomeViewModel.Tile tile;
        BorrowAppletBulletinsTile.Data data6;
        BorrowAppletPaymentTimelineTile.Data data7;
        LoanRepaymentSelectionData loanRepaymentSelectionData;
        SheetButtonAction repaymentSelection;
        BorrowAppletCreditLimitAndBorrowButtonTile.Data data8;
        BorrowAppletPaymentTimelineTile.Data data9;
        LoanRepaymentSelectionData loanRepaymentSelectionData2;
        Object repaymentSelection2;
        String str;
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$1 = AndroidSyncValueSpecs.BorrowData;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(312957884);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new FileBlockerView$6$2$2(flow, continuation, this, 24));
        Object rememberedValue = gapComposer.rememberedValue();
        RealBorrowDataManager realBorrowDataManager = this.borrowDataManager;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(realBorrowDataManager.syncValueReader.getSingleValue(androidSyncValueSpecs$Access$1), 19);
            gapComposer.updateRememberedValue(cardModelView$iconTexture$$inlined$map$1);
            rememberedValue = cardModelView$iconTexture$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, "", null, gapComposer, 48, 2);
        SyncValueReader syncValueReader = realBorrowDataManager.syncValueReader;
        CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$12 = new CardModelView$iconTexture$$inlined$map$1(syncValueReader.getSingleValue(androidSyncValueSpecs$Access$1), 18);
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$12 = AndroidSyncValueSpecs.BorrowAppletCreditLimitBorrowTile;
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.combine(syncValueReader.getSingleValueOrDefault(androidSyncValueSpecs$Access$12, emptyList, new RewardQueries$$ExternalSyntheticLambda4(26)), syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.BorrowAppletBulletinsTile, emptyList, new RewardQueries$$ExternalSyntheticLambda4(27)), syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.BorrowAppletPaymentTimelineTile, emptyList, new RewardQueries$$ExternalSyntheticLambda4(28)), syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.BorrowAppletLoanHistoryTile, emptyList, new RewardQueries$$ExternalSyntheticLambda4(29)), new RealBorrowDataManager$borrowAppletTiles$5(5, null)), cardModelView$iconTexture$$inlined$map$12, new CardModelView$getActiveHeat$2$2(realBorrowDataManager, continuation, 4), 0), emptyList, null, gapComposer, 48, 2);
        List list = (List) collectAsState2.getValue();
        boolean changed = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new BorrowHomePresenter$models$2$1(this, collectAsState2, null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue2);
        Object[] objArr = new Object[0];
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda0(25);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 48);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1043189434);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1044839657);
            BorrowHome.InitialState initialState = this.args.initialState;
            if (initialState instanceof BorrowHome.InitialState.Standard) {
                gapComposer.startReplaceGroup(-1044808533);
                gapComposer.end(false);
                mutableState.setValue(Boolean.TRUE);
            } else if (initialState instanceof BorrowHome.InitialState.DisplayingLoanDetails) {
                gapComposer.startReplaceGroup(104849002);
                List list2 = (List) collectAsState2.getValue();
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState2) | gapComposer.changedInstance(initialState) | gapComposer.changed(mutableState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1(this, initialState, collectAsState2, mutableState, null, 13);
                    gapComposer.updateRememberedValue(realBoostSelector$removeBoost$1);
                    rememberedValue4 = realBoostSelector$removeBoost$1;
                }
                Updater.LaunchedEffect(list2, initialState, (Function2) rememberedValue4, gapComposer);
                gapComposer.end(false);
            } else {
                if (!(initialState instanceof BorrowHome.InitialState.DisplayingRepaymentOptions)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 104842827, false);
                }
                gapComposer.startReplaceGroup(-1044178737);
                gapComposer.end(false);
                if (!((List) collectAsState2.getValue()).isEmpty()) {
                    List list3 = (List) collectAsState2.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        Tile.AbstractC0074Tile abstractC0074Tile = ((Tile) obj).tile;
                        if (abstractC0074Tile != null) {
                            Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = abstractC0074Tile instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile ? (Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile : null;
                            BorrowAppletPaymentTimelineTile.Data data10 = borrowAppletPaymentTimelineTile != null ? borrowAppletPaymentTimelineTile.value : null;
                            if (data10 != null) {
                                str = data10.identifier;
                                if (!Intrinsics.areEqual(str, ((BorrowHome.InitialState.DisplayingRepaymentOptions) initialState).identifier)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        str = null;
                        if (!Intrinsics.areEqual(str, ((BorrowHome.InitialState.DisplayingRepaymentOptions) initialState).identifier)) {
                        }
                    }
                    if (arrayList.size() != 1) {
                        this.errorReporter.report(new BorrowError.TimelineTileIdentifierError(((BorrowHome.InitialState.DisplayingRepaymentOptions) initialState).identifier, arrayList.size()), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    Tile tile2 = (Tile) CollectionsKt.firstOrNull((List) arrayList);
                    if (tile2 != null) {
                        Tile.AbstractC0074Tile abstractC0074Tile2 = tile2.tile;
                        if (abstractC0074Tile2 != null) {
                            Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile2 = abstractC0074Tile2 instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile ? (Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile2 : null;
                            if (borrowAppletPaymentTimelineTile2 != null) {
                                data9 = borrowAppletPaymentTimelineTile2.value;
                                data9.getClass();
                                loanRepaymentSelectionData2 = data9.repayment_selection;
                                if (loanRepaymentSelectionData2 != null) {
                                    BorrowAppletPaymentTimelineTile.Data.Button button = data9.button;
                                    button.getClass();
                                    String str2 = button.action_url;
                                    str2.getClass();
                                    repaymentSelection2 = new SheetButtonAction.ActionUrl(str2);
                                } else {
                                    repaymentSelection2 = new SheetButtonAction.RepaymentSelection(loanRepaymentSelectionData2);
                                }
                                if (!(repaymentSelection2 instanceof SheetButtonAction.ActionUrl)) {
                                    access$routeActionUrl(this, ((SheetButtonAction.ActionUrl) repaymentSelection2).url);
                                } else {
                                    if (!(repaymentSelection2 instanceof SheetButtonAction.RepaymentSelection)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    this.navigator.goTo(new BorrowHomeOverlay.RepaymentSelection(((SheetButtonAction.RepaymentSelection) repaymentSelection2).data, this.argsAsOrigin));
                                }
                            }
                        }
                        data9 = null;
                        data9.getClass();
                        loanRepaymentSelectionData2 = data9.repayment_selection;
                        if (loanRepaymentSelectionData2 != null) {
                        }
                        if (!(repaymentSelection2 instanceof SheetButtonAction.ActionUrl)) {
                        }
                    }
                    mutableState.setValue(Boolean.TRUE);
                }
            }
            gapComposer.end(false);
        }
        String str3 = (String) collectAsState.getValue();
        List<Tile> list4 = (List) collectAsState2.getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (Tile tile3 : list4) {
            Tile.AbstractC0074Tile abstractC0074Tile3 = tile3.tile;
            if (abstractC0074Tile3 != null) {
                Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile creditLimitAndBorrowButtonTile = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile ? (Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) abstractC0074Tile3 : null;
                if (creditLimitAndBorrowButtonTile != null) {
                    data = creditLimitAndBorrowButtonTile.value;
                    if (data == null) {
                        gapComposer.startReplaceGroup(576610478);
                        Unit unit = Unit.INSTANCE;
                        boolean changedInstance2 = gapComposer.changedInstance(this);
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new BorrowHomePresenter$models$4$1$1(this, null, 0);
                            gapComposer.updateRememberedValue(rememberedValue5);
                        }
                        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
                        if (abstractC0074Tile3 != null) {
                            Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile creditLimitAndBorrowButtonTile2 = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile ? (Tile.AbstractC0074Tile.CreditLimitAndBorrowButtonTile) abstractC0074Tile3 : null;
                            if (creditLimitAndBorrowButtonTile2 != null) {
                                data8 = creditLimitAndBorrowButtonTile2.value;
                                data8.getClass();
                                Money money = data8.available_credit_amount;
                                money.getClass();
                                tile = new BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel(this.moneyFormatter.format(money), data8);
                                gapComposer.end(false);
                            }
                        }
                        data8 = null;
                        data8.getClass();
                        Money money2 = data8.available_credit_amount;
                        money2.getClass();
                        tile = new BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel(this.moneyFormatter.format(money2), data8);
                        gapComposer.end(false);
                    } else {
                        if (abstractC0074Tile3 != null) {
                            Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile3 = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile ? (Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile3 : null;
                            if (borrowAppletPaymentTimelineTile3 != null) {
                                data2 = borrowAppletPaymentTimelineTile3.value;
                                if (data2 == null) {
                                    gapComposer.startReplaceGroup(577098077);
                                    Unit unit2 = Unit.INSTANCE;
                                    boolean changedInstance3 = gapComposer.changedInstance(this);
                                    Object rememberedValue6 = gapComposer.rememberedValue();
                                    if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                                        rememberedValue6 = new BorrowHomePresenter$models$4$1$1(this, null, 1);
                                        gapComposer.updateRememberedValue(rememberedValue6);
                                    }
                                    Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue6);
                                    if (abstractC0074Tile3 != null) {
                                        Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile4 = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile ? (Tile.AbstractC0074Tile.BorrowAppletPaymentTimelineTile) abstractC0074Tile3 : null;
                                        if (borrowAppletPaymentTimelineTile4 != null) {
                                            data7 = borrowAppletPaymentTimelineTile4.value;
                                            data7.getClass();
                                            loanRepaymentSelectionData = data7.repayment_selection;
                                            if (loanRepaymentSelectionData != null) {
                                                BorrowAppletPaymentTimelineTile.Data.Button button2 = data7.button;
                                                button2.getClass();
                                                String str4 = button2.action_url;
                                                str4.getClass();
                                                repaymentSelection = new SheetButtonAction.ActionUrl(str4);
                                            } else {
                                                repaymentSelection = new SheetButtonAction.RepaymentSelection(loanRepaymentSelectionData);
                                            }
                                            tile = new BorrowHomeViewModel.Tile.PaymentTimelineTileModel(data7, repaymentSelection);
                                            gapComposer.end(false);
                                        }
                                    }
                                    data7 = null;
                                    data7.getClass();
                                    loanRepaymentSelectionData = data7.repayment_selection;
                                    if (loanRepaymentSelectionData != null) {
                                    }
                                    tile = new BorrowHomeViewModel.Tile.PaymentTimelineTileModel(data7, repaymentSelection);
                                    gapComposer.end(false);
                                } else {
                                    if (abstractC0074Tile3 != null) {
                                        Tile.AbstractC0074Tile.BorrowAppletBulletinsTile borrowAppletBulletinsTile = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile ? (Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile3 : null;
                                        if (borrowAppletBulletinsTile != null) {
                                            data3 = borrowAppletBulletinsTile.value;
                                            if (data3 == null) {
                                                gapComposer.startReplaceGroup(577509137);
                                                Unit unit3 = Unit.INSTANCE;
                                                boolean changedInstance4 = gapComposer.changedInstance(this) | gapComposer.changedInstance(tile3);
                                                Object rememberedValue7 = gapComposer.rememberedValue();
                                                if (changedInstance4 || rememberedValue7 == neverEqualPolicy) {
                                                    rememberedValue7 = new InteractiveCardView$flingTo$1.AnonymousClass2(this, tile3, continuation, 20);
                                                    gapComposer.updateRememberedValue(rememberedValue7);
                                                }
                                                Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue7);
                                                if (abstractC0074Tile3 != null) {
                                                    Tile.AbstractC0074Tile.BorrowAppletBulletinsTile borrowAppletBulletinsTile2 = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletBulletinsTile ? (Tile.AbstractC0074Tile.BorrowAppletBulletinsTile) abstractC0074Tile3 : null;
                                                    if (borrowAppletBulletinsTile2 != null) {
                                                        data6 = borrowAppletBulletinsTile2.value;
                                                        data6.getClass();
                                                        loanHistoryTileModel = new BorrowHomeViewModel.Tile.BulletinTileModel(data6);
                                                        gapComposer.end(false);
                                                    }
                                                }
                                                data6 = null;
                                                data6.getClass();
                                                loanHistoryTileModel = new BorrowHomeViewModel.Tile.BulletinTileModel(data6);
                                                gapComposer.end(false);
                                            } else {
                                                if (abstractC0074Tile3 != null) {
                                                    Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile ? (Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile3 : null;
                                                    if (borrowAppletLoanHistoryTile != null) {
                                                        data4 = borrowAppletLoanHistoryTile.value;
                                                        if (data4 != null) {
                                                            throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, -2059554395, false, "missing tile type in proto");
                                                        }
                                                        gapComposer.startReplaceGroup(578108367);
                                                        Unit unit4 = Unit.INSTANCE;
                                                        boolean changedInstance5 = gapComposer.changedInstance(this);
                                                        Object rememberedValue8 = gapComposer.rememberedValue();
                                                        if (changedInstance5 || rememberedValue8 == neverEqualPolicy) {
                                                            rememberedValue8 = new BorrowHomePresenter$models$4$1$1(this, null, 2);
                                                            gapComposer.updateRememberedValue(rememberedValue8);
                                                        }
                                                        Updater.LaunchedEffect(gapComposer, unit4, (Function2) rememberedValue8);
                                                        if (abstractC0074Tile3 != null) {
                                                            Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile2 = abstractC0074Tile3 instanceof Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile ? (Tile.AbstractC0074Tile.BorrowAppletLoanHistoryTile) abstractC0074Tile3 : null;
                                                            if (borrowAppletLoanHistoryTile2 != null) {
                                                                data5 = borrowAppletLoanHistoryTile2.value;
                                                                data5.getClass();
                                                                loanHistoryTileModel = new BorrowHomeViewModel.Tile.LoanHistoryTileModel(data5);
                                                                gapComposer.end(false);
                                                            }
                                                        }
                                                        data5 = null;
                                                        data5.getClass();
                                                        loanHistoryTileModel = new BorrowHomeViewModel.Tile.LoanHistoryTileModel(data5);
                                                        gapComposer.end(false);
                                                    }
                                                }
                                                data4 = null;
                                                if (data4 != null) {
                                                }
                                            }
                                            tile = loanHistoryTileModel;
                                        }
                                    }
                                    data3 = null;
                                    if (data3 == null) {
                                    }
                                    tile = loanHistoryTileModel;
                                }
                            }
                        }
                        data2 = null;
                        if (data2 == null) {
                        }
                    }
                    arrayList2.add(tile);
                }
            }
            data = null;
            if (data == null) {
            }
            arrayList2.add(tile);
        }
        BorrowHomeViewModel borrowHomeViewModel = new BorrowHomeViewModel(str3, arrayList2);
        gapComposer.end(false);
        return borrowHomeViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activityScope;
        public final DoubleCheck analytics;
        public final Provider borrowDataManager;
        public final LambdaProvider errorReporter;
        public final DoubleCheck lendingAppService;
        public final Provider moneyFormatterFactory;
        public final Provider routerFactory;
        public final LambdaProvider stringManager;

        public MetroFactory(NavigationSideEffects.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.borrowDataManager = metroFactory;
            this.lendingAppService = doubleCheck;
            this.activityScope = instanceFactory;
            this.moneyFormatterFactory = metroFactory2;
            this.routerFactory = instanceFactory2;
            this.analytics = doubleCheck2;
            this.errorReporter = lambdaProvider;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2) {
            this.lendingAppService = doubleCheck;
            this.borrowDataManager = instanceFactory;
            this.moneyFormatterFactory = instanceFactory2;
            this.analytics = doubleCheck2;
            this.errorReporter = lambdaProvider;
            this.routerFactory = metroFactory;
            this.activityScope = instanceFactory3;
            this.stringManager = lambdaProvider2;
        }

        public MetroFactory(InstanceFactory instanceFactory, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory2) {
            this.activityScope = instanceFactory;
            this.borrowDataManager = metroFactory;
            this.lendingAppService = doubleCheck;
            this.analytics = doubleCheck2;
            this.errorReporter = lambdaProvider;
            this.moneyFormatterFactory = musicViewFactory$MetroFactory;
            this.stringManager = lambdaProvider2;
            this.routerFactory = metroFactory2;
        }
    }
}
