package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.cart.LocalBrandLocationOpenTabPresenter;
import app.cash.local.presenters.cart.LocalCartCheckoutNavigator;
import app.cash.local.presenters.cart.LocalCartCheckoutResult;
import app.cash.local.presenters.instore.TableQrCodeScannerPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$6$1$2;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.zipline.ZiplineService;
import app.cash.zipline.internal.bridge.InboundService;
import app.cash.zipline.internal.bridge.InternalCall;
import app.cash.zipline.internal.bridge.SuspendingZiplineFunction;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.intercept.EngineInterceptor$intercept$2;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$SettingsOptions;
import com.squareup.cash.account.presenters.accountswitcher.AddAccountOptionsPresenter$models$1$1$3;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.screens.AccountsLoadingFailedScreen;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.localmarketing.EventLocation;
import com.squareup.cash.cdf.localmarketing.LocalMarketingBuyerMarketingCampaignViewMessage;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda1;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class zzmo extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public int zzb;
    public Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmo(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zza = obj;
        this.zzc = obj2;
        this.zzd = obj3;
        this.zze = obj4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.zze;
        Object obj3 = this.zzd;
        switch (i) {
            case 0:
                return new zzmo((zzmd) this.zzc, (zzmz) obj3, (Context) obj2, continuation, 0);
            case 1:
                return new zzmo((LocalOrderStatusPresenter) this.zza, (MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 1);
            case 2:
                return new zzmo((LocalBrandProfilePresenter) this.zzc, (String) obj3, (MutableState) obj2, continuation, 2);
            case 3:
                return new zzmo((LocalBrandLocationOpenTabPresenter) this.zza, (LocalCart) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                zzmo zzmoVar = new zzmo((Flow) this.zzc, continuation, (CardStudioPresenter) obj3, (MutableState) obj2, 4);
                zzmoVar.zza = obj;
                return zzmoVar;
            case 5:
                zzmo zzmoVar2 = new zzmo((Flow) this.zzc, continuation, (TableQrCodeScannerPresenter) obj3, (MutableState) obj2, 5);
                zzmoVar2.zza = obj;
                return zzmoVar2;
            case 6:
                return new zzmo((TableQrCodeScannerPresenter) this.zza, (MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 6);
            case 7:
                return new zzmo((CardStudioPresenter) this.zza, (MarketingMessageData) this.zzc, (MarketingMessageOfferDetails) obj3, (EventLocation) obj2, continuation, 7);
            case 8:
                zzmo zzmoVar3 = new zzmo((Flow) this.zzc, continuation, (DisclosurePresenter) obj3, (MutableState) obj2, 8);
                zzmoVar3.zza = obj;
                return zzmoVar3;
            case 9:
                return new zzmo((String) this.zza, (DisclosurePresenter) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                zzmo zzmoVar4 = new zzmo((Flow) this.zzc, continuation, (LocalPosLocalCashRedemptionPresenter) obj3, (State) obj2, 10);
                zzmoVar4.zza = obj;
                return zzmoVar4;
            case 11:
                return new zzmo((MusicPresenter) this.zza, (Navigator) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 11);
            case 12:
                zzmo zzmoVar5 = new zzmo((Flow) this.zzc, continuation, (EndAppLockPresenter) obj3, (MutableState) obj2, 12);
                zzmoVar5.zza = obj;
                return zzmoVar5;
            case 13:
                return new zzmo((TabContentPresenter) this.zza, (MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 13);
            case 14:
                return new zzmo((RealSheetState) this.zza, (MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 14);
            case 15:
                zzmo zzmoVar6 = new zzmo((InternalCall) this.zzc, (SuspendingZiplineFunction) obj3, (InboundService) obj2, continuation, 15);
                zzmoVar6.zza = obj;
                return zzmoVar6;
            case 16:
                zzmo zzmoVar7 = new zzmo((Function2) this.zzc, (zzmz) obj3, (Context) obj2, continuation, 16);
                zzmoVar7.zza = obj;
                return zzmoVar7;
            case 17:
                return new zzmo((RealBugReportSender) this.zza, (ApiResult.Success) this.zzc, (BugReport) obj3, (List) obj2, continuation, 17);
            case 18:
                zzmo zzmoVar8 = new zzmo((TapToPayPresenter) obj3, (MutableState) obj2, continuation);
                zzmoVar8.zza = obj;
                return zzmoVar8;
            case 19:
                zzmo zzmoVar9 = new zzmo((PaymentLoadingPresenter) this.zzc, (String) obj3, (State) obj2, continuation, 19);
                zzmoVar9.zza = obj;
                return zzmoVar9;
            case 20:
                zzmo zzmoVar10 = new zzmo((Flow) this.zzc, continuation, (LocalPosCheckInPresenter) obj3, (String) obj2, 20);
                zzmoVar10.zza = obj;
                return zzmoVar10;
            case 21:
                zzmo zzmoVar11 = new zzmo((Flow) this.zzc, continuation, (DisclosurePresenter) obj3, (MutableState) obj2, 21);
                zzmoVar11.zza = obj;
                return zzmoVar11;
            case 22:
                zzmo zzmoVar12 = new zzmo((Flow) this.zzc, continuation, (MutableState) obj3, (AccountDocumentsDownloadOptionsPresenter) obj2, 22);
                zzmoVar12.zza = obj;
                return zzmoVar12;
            case 23:
                zzmo zzmoVar13 = new zzmo((ActivityTabPresenter) this.zzc, (MutableState) obj3, (MutableState) obj2, continuation, 23);
                zzmoVar13.zza = obj;
                return zzmoVar13;
            case 24:
                zzmo zzmoVar14 = new zzmo((Flow) this.zzc, continuation, (CardStudioPresenter) obj3, (MutableState) obj2, 24);
                zzmoVar14.zza = obj;
                return zzmoVar14;
            case 25:
                zzmo zzmoVar15 = new zzmo((Flow) this.zzc, continuation, (RealActivityEmbeddedPresenter) obj3, (MutableState) obj2, 25);
                zzmoVar15.zza = obj;
                return zzmoVar15;
            case 26:
                zzmo zzmoVar16 = new zzmo((Flow) this.zzc, continuation, (DisclosurePresenter) obj3, (State) obj2, 26);
                zzmoVar16.zza = obj;
                return zzmoVar16;
            case 27:
                zzmo zzmoVar17 = new zzmo((Flow) this.zzc, continuation, (AfterpayAppletTilePresenter) obj3, (MutableState) obj2, 27);
                zzmoVar17.zza = obj;
                return zzmoVar17;
            case 28:
                zzmo zzmoVar18 = new zzmo((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) this.zzc, continuation, (RealAfterpayAppletRepository) obj3, (FormattedDetail) obj2, 28);
                zzmoVar18.zza = obj;
                return zzmoVar18;
            default:
                zzmo zzmoVar19 = new zzmo((List) this.zzc, (RealAfterpayEligibleRetroTransactionsProvider) obj3, (ZiplineHistoryDataJavaScripter) obj2, continuation, 29);
                zzmoVar19.zza = obj;
                return zzmoVar19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((zzmo) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((zzmo) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((zzmo) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((zzmo) create((UpdateSearchQuery) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((zzmo) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((zzmo) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x0677, code lost:
    
        if (r2 == r3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0651, code lost:
    
        if (r6 == r3) goto L303;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        String str;
        Object m1205confirmArrivalh2CDXeg;
        Object m1207getMarketingMessagebPdJ9CI;
        MutableState mutableState;
        Object createCheckoutResult;
        Object shouldShowRequestPermissionRationale;
        Object shouldShowOverridePrompt;
        List list;
        Object failure;
        Map map;
        Object invoke;
        Object access$toBusinessUpgradeModel;
        Object loadAccounts;
        int i = this.$r8$classId;
        int i2 = 22;
        int i3 = 4;
        int i4 = 13;
        int i5 = 2;
        Object obj2 = this.zze;
        Object obj3 = this.zzd;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.zzb;
                try {
                    if (i6 != 0) {
                        Object obj4 = this.zza;
                        if (i6 != 1) {
                            file = (File) obj4;
                            SafeTrace.throwOnFailure(obj);
                            return ParcelFileDescriptor.open(file, 268435456);
                        }
                        str = (String) obj4;
                        SafeTrace.throwOnFailure(obj);
                        throw new FileNotFoundException("Cache file not found for id: " + str);
                    }
                    SafeTrace.throwOnFailure(obj);
                    zzmd zzmdVar = (zzmd) this.zzc;
                    zzmz zzmzVar = (zzmz) obj3;
                    Context context = (Context) obj2;
                    String str2 = zzmdVar.zza;
                    zzmzVar.getClass();
                    File file2 = new File(zzmz.zzt(context), zzmdVar.zzb);
                    if (file2.exists()) {
                        AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(str2, zzmzVar, continuation, i2);
                        this.zza = file2;
                        this.zzb = 2;
                        if (zzmz.zzi(zzmzVar, context, animatedImageDecoder$wrapDrawable$2, this) != coroutineSingletons) {
                            file = file2;
                            return ParcelFileDescriptor.open(file, 268435456);
                        }
                    } else {
                        Log.w("CacheManager", "Cache file not found for id: " + str2 + ". Cleaning up index.");
                        this.zza = str2;
                        this.zzb = 1;
                        if (zzmzVar.zzu(context, str2, this) != coroutineSingletons) {
                            str = str2;
                            throw new FileNotFoundException("Cache file not found for id: " + str);
                        }
                    }
                    return coroutineSingletons;
                } catch (IOException e) {
                    Log.e("CacheManager", "Failed to open cache for reading", e);
                    return null;
                }
            case 1:
                MutableState mutableState2 = (MutableState) this.zzc;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.zzb;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalOrderRepository realLocalOrderRepository = ((LocalOrderStatusPresenter) this.zza).localOrderRepository;
                    String str3 = ((LocalOrder) mutableState2.getValue()).token;
                    str3.getClass();
                    this.zzb = 1;
                    m1205confirmArrivalh2CDXeg = realLocalOrderRepository.m1205confirmArrivalh2CDXeg(str3, this);
                    if (m1205confirmArrivalh2CDXeg == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m1205confirmArrivalh2CDXeg = obj;
                }
                LocalOrder localOrder = (LocalOrder) m1205confirmArrivalh2CDXeg;
                if (localOrder != null) {
                    mutableState2.setValue(localOrder);
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                }
                ((MutableState) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.zzb;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState3 = (MutableState) obj2;
                    this.zza = mutableState3;
                    this.zzb = 1;
                    m1207getMarketingMessagebPdJ9CI = ((LocalBrandProfilePresenter) this.zzc).marketingMessageRepository.m1207getMarketingMessagebPdJ9CI((String) obj3, this);
                    if (m1207getMarketingMessagebPdJ9CI == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    mutableState = mutableState3;
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.zza;
                    SafeTrace.throwOnFailure(obj);
                    m1207getMarketingMessagebPdJ9CI = obj;
                }
                mutableState.setValue((MarketingMessageData) m1207getMarketingMessagebPdJ9CI);
                return Unit.INSTANCE;
            case 3:
                LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter = (LocalBrandLocationOpenTabPresenter) this.zza;
                BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationOpenTabPresenter.navigator;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.zzb;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCartCheckoutNavigator localCartCheckoutNavigator = localBrandLocationOpenTabPresenter.cartCheckoutNavigator;
                    LocalCart localCart = (LocalCart) this.zzc;
                    LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen = localBrandLocationOpenTabPresenter.screen;
                    BrandSpot brandSpot = localBrandLocationOpenTabScreen.brandSpot;
                    AttributionKey attributionKey = localBrandLocationOpenTabScreen.attributionKey;
                    boolean z = localBrandLocationOpenTabScreen.isProfileSheetInline;
                    BrandSpotSyncTokens brandSpotSyncTokens = localBrandLocationOpenTabScreen.syncTokens;
                    OpenTabCheckoutRouting openTabCheckoutRouting = OpenTabCheckoutRouting.CLOSE_OPEN_TAB;
                    this.zzb = 1;
                    createCheckoutResult = localCartCheckoutNavigator.createCheckoutResult(localCart, brandSpot, attributionKey, z, brandSpotSyncTokens, screenNavigator, null, openTabCheckoutRouting, null, this);
                    if (createCheckoutResult == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    createCheckoutResult = obj;
                }
                LocalCartCheckoutResult localCartCheckoutResult = (LocalCartCheckoutResult) createCheckoutResult;
                if (localCartCheckoutResult instanceof LocalCartCheckoutResult.Error) {
                    ((MutableState) obj3).setValue(CollectionsKt__CollectionsJVMKt.listOf(((LocalCartCheckoutResult.Error) localCartCheckoutResult).error));
                } else {
                    if (!(localCartCheckoutResult instanceof LocalCartCheckoutResult.Navigation)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(((LocalCartCheckoutResult.Navigation) localCartCheckoutResult).screen);
                }
                ((MutableState) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.zzb;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope, (CardStudioPresenter) obj3, (MutableState) obj2, i4);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.zzb;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass12 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope2, (TableQrCodeScannerPresenter) obj3, (MutableState) obj2, 16);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow2.collect(anonymousClass12, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState4 = (MutableState) this.zzc;
                TableQrCodeScannerPresenter tableQrCodeScannerPresenter = (TableQrCodeScannerPresenter) this.zza;
                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = tableQrCodeScannerPresenter.cameraPermissions;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.zzb;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState4.getValue()).booleanValue() && !Intrinsics.areEqual((Boolean) ((MutableState) obj3).getValue(), Boolean.TRUE)) {
                        this.zzb = 1;
                        shouldShowRequestPermissionRationale = androidPermissionManager$create$1.shouldShowRequestPermissionRationale(this);
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        shouldShowOverridePrompt = obj;
                        if (((Boolean) shouldShowOverridePrompt).booleanValue()) {
                            mutableState4.setValue(Boolean.TRUE);
                            tableQrCodeScannerPresenter.navigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(tableQrCodeScannerPresenter.stringManager.get(R.string.local_presenters_check_in_need_permission_to_scan)), LocalExplanatoryDialog.PositiveAction.OpenSettings.INSTANCE));
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    shouldShowRequestPermissionRationale = obj;
                }
                if (((Boolean) shouldShowRequestPermissionRationale).booleanValue()) {
                    if (((Number) ((MutableState) obj2).getValue()).intValue() > 0) {
                        return Unit.INSTANCE;
                    }
                    androidPermissionManager$create$1.request();
                    return Unit.INSTANCE;
                }
                this.zzb = 2;
                shouldShowOverridePrompt = androidPermissionManager$create$1.shouldShowOverridePrompt(this);
                break;
            case 7:
                MarketingMessageData marketingMessageData = (MarketingMessageData) this.zzc;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.zza;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.zzb;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) cardStudioPresenter.analytics;
                    BrandSpot brandSpot2 = marketingMessageData.brandSpot;
                    String str4 = marketingMessageData.messageToken;
                    MarketingMessageOfferDetails marketingMessageOfferDetails = (MarketingMessageOfferDetails) obj3;
                    analytics.track(new LocalMarketingBuyerMarketingCampaignViewMessage(brandSpot2.brandToken, str4, marketingMessageOfferDetails != null ? marketingMessageOfferDetails.offerToken : null, (EventLocation) obj2), null);
                    AndroidSvg androidSvg = (AndroidSvg) cardStudioPresenter.args;
                    this.zzb = 1;
                    if (androidSvg.m1472invokebPdJ9CI(str4, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.zzb;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass13 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope3, (DisclosurePresenter) obj3, (MutableState) obj2, 17);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow3.collect(anonymousClass13, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState5 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.zzb;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState5.getValue()).booleanValue() && ((String) this.zza) == null && (list = (List) ((MutableState) obj2).getValue()) != null && (!list.isEmpty())) {
                        mutableState5.setValue(Boolean.TRUE);
                        ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded = (ClearMarketingBadgesIfNeeded) ((DisclosurePresenter) this.zzc).appService;
                        this.zzb = 1;
                        if (clearMarketingBadgesIfNeeded.invoke(this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.zzb;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.zzc;
                    SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(i3, coroutineScope4, (LocalPosLocalCashRedemptionPresenter) obj3, (State) obj2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow4.collect(swipeableState$animateTo$2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState6 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.zzb;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState6.setValue(Boolean.TRUE);
                    RealCashLocalShortlinkHandler realCashLocalShortlinkHandler = (RealCashLocalShortlinkHandler) ((MusicPresenter) this.zza).musicPlayer;
                    ShortlinkAction shortlinkAction = (ShortlinkAction) ((MutableState) obj2).getValue();
                    Navigator navigator = (Navigator) this.zzc;
                    GetShortlinkRequest.InvocationContext invocationContext = GetShortlinkRequest.InvocationContext.INVOCATION_CONTEXT_INTERACTION;
                    Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0 = new Worker$$ExternalSyntheticLambda0(navigator, 21);
                    this.zzb = 1;
                    if (realCashLocalShortlinkHandler.handleShortlink(shortlinkAction, navigator, invocationContext, worker$$ExternalSyntheticLambda0, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState6.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.zzb;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass14 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope5, (EndAppLockPresenter) obj3, (MutableState) obj2, 18);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow5.collect(anonymousClass14, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.zzb;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) ((TabContentPresenter) this.zza).store).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard), i4);
                    TabContentPresenter$models$6$1$2 tabContentPresenter$models$6$1$2 = new TabContentPresenter$models$6$1$2((MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, null, 0);
                    this.zzb = 1;
                    if (FlowKt.collectLatest(realLocalInstalledStore$hideBrands$$inlined$map$1, tabContentPresenter$models$6$1$2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.zzb;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1((RealSheetState) this.zza, i5));
                    TabContentPresenter$models$6$1$2 tabContentPresenter$models$6$1$22 = new TabContentPresenter$models$6$1$2((MutableState) this.zzc, (MutableState) obj3, (MutableState) obj2, null, 1);
                    this.zzb = 1;
                    if (FlowKt.collectLatest(snapshotFlow, tabContentPresenter$models$6$1$22, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.zzb;
                try {
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list2 = ((InternalCall) this.zzc).args;
                        SuspendingZiplineFunction suspendingZiplineFunction = (SuspendingZiplineFunction) obj3;
                        InboundService inboundService = (InboundService) obj2;
                        Result.Companion companion = Result.Companion;
                        ZiplineService ziplineService = inboundService.service;
                        this.zza = null;
                        this.zzb = 1;
                        failure = suspendingZiplineFunction.callSuspending(ziplineService, list2, this);
                        if (failure == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        failure = obj;
                    }
                    Result.Companion companion2 = Result.Companion;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.zzb;
                if (i22 != 0) {
                    Object obj5 = this.zza;
                    if (i22 != 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj5;
                    }
                    map = (Map) obj5;
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    map = (Map) this.zza;
                    Function2 function2 = (Function2) this.zzc;
                    this.zza = map;
                    this.zzb = 1;
                    invoke = function2.invoke(map, this);
                    if (invoke == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                }
                Map map2 = map;
                zzmz zzmzVar2 = (zzmz) obj3;
                this.zza = invoke;
                this.zzb = 2;
                Object withContext = JobKt.withContext(((ContextScope) zzmzVar2.zzj).coroutineContext, new AnimatedImageDecoder$wrapDrawable$2(zzmzVar2, (Context) obj2, map2, null, 23), this);
                if (withContext != coroutineSingletons17) {
                    withContext = Unit.INSTANCE;
                }
                return withContext != coroutineSingletons17 ? invoke : coroutineSingletons17;
            case 17:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.zzb;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBugReportSender realBugReportSender = (RealBugReportSender) this.zza;
                    BugReportService bugReportService = realBugReportSender.bugReportService;
                    CreateBugReportResponse createBugReportResponse = (CreateBugReportResponse) ((ApiResult.Success) this.zzc).response;
                    Context context2 = realBugReportSender.endpointContext;
                    this.zzb = 1;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Object withContext2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2(((BugReport) obj3).screenshots, createBugReportResponse, context2, (List) obj2, bugReportService, null), this);
                    if (withContext2 != obj6) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.zza;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.zzb;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj3;
                    RealAccountRatePlanManager realAccountRatePlanManager = (RealAccountRatePlanManager) tapToPayPresenter.sessionManager;
                    boolean booleanValue = ((Boolean) ((MutableState) obj2).getValue()).booleanValue();
                    this.zza = null;
                    this.zzc = produceStateScope;
                    this.zzb = 1;
                    access$toBusinessUpgradeModel = TapToPayPresenter.access$toBusinessUpgradeModel(tapToPayPresenter, realAccountRatePlanManager, booleanValue, this);
                    if (access$toBusinessUpgradeModel == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.zzc;
                    SafeTrace.throwOnFailure(obj);
                    access$toBusinessUpgradeModel = obj;
                }
                produceStateScope.setValue(access$toBusinessUpgradeModel);
                return Unit.INSTANCE;
            case 19:
                PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) this.zzc;
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.zza;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.zzb;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics2 = (Analytics) paymentLoadingPresenter.analytics;
                    AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = ((AccountSwitcherScreen) paymentLoadingPresenter.paymentToken).entrypoint;
                    AccountSwitcherPresenter$SettingsOptions accountSwitcherPresenter$SettingsOptions = (AccountSwitcherPresenter$SettingsOptions) ((State) obj2).getValue();
                    analytics2.track(new AccountSwitchAccountViewSwitcher((String) obj3, Boolean.valueOf((accountSwitcherPresenter$SettingsOptions != null ? accountSwitcherPresenter$SettingsOptions.linkAccountVisibility : null) != SettingVisibility.HIDDEN), entrypoint), null);
                    RealAccountholderAccountRepository realAccountholderAccountRepository = (RealAccountholderAccountRepository) paymentLoadingPresenter.paymentNavigator;
                    this.zza = produceStateScope2;
                    this.zzb = 1;
                    loadAccounts = realAccountholderAccountRepository.loadAccounts(this);
                    if (loadAccounts == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    loadAccounts = obj;
                }
                AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) loadAccounts;
                if (accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful) {
                    produceStateScope2.setValue(((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts);
                } else {
                    if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    paymentLoadingPresenter.navigator.goTo(AccountsLoadingFailedScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.zzb;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.zzc;
                    AddAccountOptionsPresenter$models$1$1$3 addAccountOptionsPresenter$models$1$1$3 = new AddAccountOptionsPresenter$models$1$1$3(coroutineScope6, (LocalPosCheckInPresenter) obj3, (String) obj2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow6.collect(addAccountOptionsPresenter$models$1$1$3, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.zzb;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass15 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope7, (DisclosurePresenter) obj3, (MutableState) obj2, i2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow7.collect(anonymousClass15, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.zzb;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.zzc;
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass16 = new ThumbNode$onAttach$1.AnonymousClass1(coroutineScope8, (MutableState) obj3, (AccountDocumentsDownloadOptionsPresenter) obj2, 23);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow8.collect(anonymousClass16, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                UpdateSearchQuery updateSearchQuery = (UpdateSearchQuery) this.zza;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.zzb;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldStateInputFieldText textFieldStateInputFieldText = updateSearchQuery.newQuery;
                    this.zza = null;
                    this.zzb = 1;
                    if (ActivityTabPresenter.access$models$applySearchQuery((ActivityTabPresenter) this.zzc, (MutableState) obj3, (MutableState) obj2, textFieldStateInputFieldText, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.zzb;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.zzc;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope9, (CardStudioPresenter) obj3, (MutableState) obj2, i5);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow9.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.zzb;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.zzc;
                    SwipeableState$animateTo$2 swipeableState$animateTo$22 = new SwipeableState$animateTo$2(9, coroutineScope10, (RealActivityEmbeddedPresenter) obj3, (MutableState) obj2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow10.collect(swipeableState$animateTo$22, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.zzb;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.zzc;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$32 = new ActivityTabViewKt$ActivityTab$5$1$3(coroutineScope11, (DisclosurePresenter) obj3, (State) obj2, i3);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow11.collect(activityTabViewKt$ActivityTab$5$1$32, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.zzb;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.zzc;
                    SwipeableState$animateTo$2 swipeableState$animateTo$23 = new SwipeableState$animateTo$2(11, coroutineScope12, (AfterpayAppletTilePresenter) obj3, (MutableState) obj2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flow12.collect(swipeableState$animateTo$23, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                FlowCollector flowCollector = (FlowCollector) this.zza;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.zzb;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = (FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) this.zzc;
                    SwipeableState$animateTo$2 swipeableState$animateTo$24 = new SwipeableState$animateTo$2(i4, flowCollector, (RealAfterpayAppletRepository) obj3, (FormattedDetail) obj2);
                    this.zza = null;
                    this.zzb = 1;
                    if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(swipeableState$animateTo$24, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.zza;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.zzb;
                if (i35 != 0) {
                    if (i35 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                List<Triple> list3 = (List) this.zzc;
                RealAfterpayEligibleRetroTransactionsProvider realAfterpayEligibleRetroTransactionsProvider = (RealAfterpayEligibleRetroTransactionsProvider) obj3;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (Triple triple : list3) {
                    arrayList.add(JobKt.async$default(coroutineScope13, realAfterpayEligibleRetroTransactionsProvider.jsContext, null, new EngineInterceptor$intercept$2((PaymentHistoryInputsRow) triple.first, ziplineHistoryDataJavaScripter, (AnalyticsEvent) triple.second, (AnalyticsEvent) triple.third, (Continuation) null, 12), 2));
                }
                this.zza = null;
                this.zzb = 1;
                Object awaitAll = AwaitKt.awaitAll(arrayList, this);
                return awaitAll == coroutineSingletons29 ? coroutineSingletons29 : awaitAll;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmo(TapToPayPresenter tapToPayPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.zzd = tapToPayPresenter;
        this.zze = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmo(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzmo(Flow flow, Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zzc = flow;
        this.zzd = obj;
        this.zze = obj2;
    }
}
