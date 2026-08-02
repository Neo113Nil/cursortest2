package com.squareup.cash.qrcodes.presenters;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.cdf.account.AccountConfigureUpdateNotificationPreference;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$Result;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewEvent;
import com.squareup.cash.profile.views.BasicSettingView;
import com.squareup.cash.profile.views.NotificationOptionsView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$models$2$1$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.db.RecentSearches;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository$restoreResults$2$sections$1;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1;
import com.squareup.cash.shopping.presenters.BrandsSearchPresenter;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.notifications.NotificationPreferenceUpdatedEvent$ClientExperienceVersion;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.recipientsuggestion.CustomerData;
import com.squareup.protos.cash.recipientsuggestion.SuggestedRecipient;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.NotificationPreference;
import com.squareup.protos.franklin.api.SetNotificationPreferenceRequest;
import com.squareup.protos.franklin.api.SetNotificationPreferencesRequest;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.UnregisterAliasRequest;
import com.squareup.protos.franklin.app.UnregisterAliasResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealQrCodesPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public Object $qrCodeArgs;
    public final /* synthetic */ int $r8$classId;
    public Object $state$delegate;
    public /* synthetic */ Object $url;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealQrCodesPresenter$models$1$1(PdfPreviewPresenter pdfPreviewPresenter, CoroutineContext coroutineContext, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.this$0 = pdfPreviewPresenter;
        this.$qrCodeArgs = coroutineContext;
        this.$state$delegate = mutableState;
        this.$url = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealQrCodesPresenter$models$1$1((RealQrCodesPresenter) this.this$0, (QrCodeArgs) this.$qrCodeArgs, (String) this.$url, (MutableState) this.$state$delegate, continuation, 0);
            case 1:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$1 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (TaxReturnsPresenter) this.$url, (MutableState) this.$state$delegate, 1);
                realQrCodesPresenter$models$1$1.this$0 = obj;
                return realQrCodesPresenter$models$1$1;
            case 2:
                return new RealQrCodesPresenter$models$1$1((MutableState) this.$state$delegate, (WorkHomePresenter) this.this$0, (ContactMethodDetailsViewEvent) this.$qrCodeArgs, (List) this.$url, continuation);
            case 3:
                return new RealQrCodesPresenter$models$1$1((PdfPreviewPresenter) this.this$0, (CoroutineContext) this.$qrCodeArgs, (MutableState) this.$state$delegate, (MutableState) this.$url, continuation);
            case 4:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$12 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (PdfPreviewPresenter) this.$url, (MutableState) this.$state$delegate, 4);
                realQrCodesPresenter$models$1$12.this$0 = obj;
                return realQrCodesPresenter$models$1$12;
            case 5:
                return new RealQrCodesPresenter$models$1$1((AliasesSectionEvent) this.$qrCodeArgs, (PdfPreviewPresenter) this.$url, (MutableState) this.$state$delegate, continuation);
            case 6:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$13 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (LocalCashBalancePresenter) this.$url, (State) this.$state$delegate, 6);
                realQrCodesPresenter$models$1$13.this$0 = obj;
                return realQrCodesPresenter$models$1$13;
            case 7:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$14 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (LocalHomePresenter) this.$url, (MutableState) this.$state$delegate, 7);
                realQrCodesPresenter$models$1$14.this$0 = obj;
                return realQrCodesPresenter$models$1$14;
            case 8:
                return new RealQrCodesPresenter$models$1$1(8, (MutableState) this.$qrCodeArgs, (MutableState) this.$url, (LocalHomePresenter) this.this$0, continuation);
            case 9:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$15 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (LocalEditorialPresenter) this.$url, (MutableState) this.$state$delegate, 9);
                realQrCodesPresenter$models$1$15.this$0 = obj;
                return realQrCodesPresenter$models$1$15;
            case 10:
                return new RealQrCodesPresenter$models$1$1((CoroutineContext) this.this$0, (Uri) this.$qrCodeArgs, (NotificationOptionsView) this.$url, (BasicSettingView) this.$state$delegate, continuation, 10);
            case 11:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$16 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (CardLockPresenter) this.$url, (MutableState) this.$state$delegate, 11);
                realQrCodesPresenter$models$1$16.this$0 = obj;
                return realQrCodesPresenter$models$1$16;
            case 12:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$17 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (CashQrScannerPresenter) this.$url, (MutableState) this.$state$delegate, 12);
                realQrCodesPresenter$models$1$17.this$0 = obj;
                return realQrCodesPresenter$models$1$17;
            case 13:
                return new RealQrCodesPresenter$models$1$1((List) this.this$0, (RealRecipientRepository) this.$qrCodeArgs, (ArrayList) this.$url, (Set) this.$state$delegate, continuation, 13);
            case 14:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$18 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (PaymentPlanDataBlockerPresenter) this.$url, (MutableState) this.$state$delegate, 14);
                realQrCodesPresenter$models$1$18.this$0 = obj;
                return realQrCodesPresenter$models$1$18;
            case 15:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$19 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (PoolsListPresenter) this.$url, (MutableState) this.$state$delegate, 15);
                realQrCodesPresenter$models$1$19.this$0 = obj;
                return realQrCodesPresenter$models$1$19;
            case 16:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$110 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (WorkHomePresenter) this.$url, (MutableState) this.$state$delegate, 16);
                realQrCodesPresenter$models$1$110.this$0 = obj;
                return realQrCodesPresenter$models$1$110;
            case 17:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$111 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate, 17);
                realQrCodesPresenter$models$1$111.this$0 = obj;
                return realQrCodesPresenter$models$1$111;
            case 18:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$112 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate, 18);
                realQrCodesPresenter$models$1$112.this$0 = obj;
                return realQrCodesPresenter$models$1$112;
            case 19:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$113 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (BasePasswordPresenter) this.$url, (MutableState) this.$state$delegate, 19);
                realQrCodesPresenter$models$1$113.this$0 = obj;
                return realQrCodesPresenter$models$1$113;
            case 20:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$114 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate, 20);
                realQrCodesPresenter$models$1$114.this$0 = obj;
                return realQrCodesPresenter$models$1$114;
            case 21:
                return new RealQrCodesPresenter$models$1$1((LocalEditorialPresenter) this.this$0, (Profile) this.$qrCodeArgs, (Function1) this.$url, (Function0) this.$state$delegate, continuation, 21);
            case 22:
                return new RealQrCodesPresenter$models$1$1((LocalEditorialPresenter) this.this$0, (Function1) this.$qrCodeArgs, (Function0) this.$url, (State) this.$state$delegate, continuation, 22);
            case 23:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$115 = new RealQrCodesPresenter$models$1$1((RealProductSearchRepository) this.$state$delegate, continuation, 23);
                realQrCodesPresenter$models$1$115.$url = obj;
                return realQrCodesPresenter$models$1$115;
            case 24:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$116 = new RealQrCodesPresenter$models$1$1((RealRecentSearchManager) this.$state$delegate, continuation, 24);
                realQrCodesPresenter$models$1$116.$url = obj;
                return realQrCodesPresenter$models$1$116;
            case 25:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$117 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (BrandsSearchPresenter) this.$url, (MutableState) this.$state$delegate, 25);
                realQrCodesPresenter$models$1$117.this$0 = obj;
                return realQrCodesPresenter$models$1$117;
            case 26:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$118 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (ProductSearchPresenter) this.$url, (MutableState) this.$state$delegate, 26);
                realQrCodesPresenter$models$1$118.this$0 = obj;
                return realQrCodesPresenter$models$1$118;
            case 27:
                return new RealQrCodesPresenter$models$1$1(27, (MutableState) this.$qrCodeArgs, (State) this.$url, (ProductSearchPresenter) this.this$0, continuation);
            case 28:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$119 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (RealShoppingJavascriptPresenter) this.$url, (MutableState) this.$state$delegate, 28);
                realQrCodesPresenter$models$1$119.this$0 = obj;
                return realQrCodesPresenter$models$1$119;
            default:
                RealQrCodesPresenter$models$1$1 realQrCodesPresenter$models$1$120 = new RealQrCodesPresenter$models$1$1((Flow) this.$qrCodeArgs, continuation, (CoroutineScope) this.$url, (RealShoppingJavascriptPresenter) this.$state$delegate, 29);
                realQrCodesPresenter$models$1$120.this$0 = obj;
                return realQrCodesPresenter$models$1$120;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealQrCodesPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0211, code lost:
    
        if (r0 == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x08b0, code lost:
    
        if (r0.fetchAndStoreAliases(r53) == r4) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x081b, code lost:
    
        if (r0 == r4) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
    
        if (r0 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
    
        if (r1 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0225, code lost:
    
        if (r1 == r2) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0607 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0897  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AccountConfigureUpdateNotificationPreference.AliasType aliasType;
        Object notificationPreference;
        Object notificationPreferences;
        ProfileAlias profileAlias;
        Object unregisterAlias;
        Object unregisterOngoing;
        AliasesSectionPresenter$Result.UnregisterFailed unregisterFailed;
        AliasesSectionPresenter$Result aliasesSectionPresenter$Result;
        Object withContext;
        MutableState mutableState;
        Object firstOrNull;
        Map map;
        String str;
        Recipient recipient;
        Recipient copy$default;
        DeferredCoroutine async$default;
        Object awaitInternal;
        List list;
        Object await;
        DeferredCoroutine async$default2;
        Object access$resultOrEmpty;
        List list2;
        Object access$resultOrEmpty2;
        String str2;
        Object access$performSearch;
        int i = 14;
        int i2 = 9;
        int i3 = 21;
        int i4 = 26;
        int i5 = 5;
        int i6 = 3;
        int i7 = 0;
        int i8 = 2;
        int i9 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (this.$r8$classId) {
            case 0:
                RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) this.this$0;
                MutableState mutableState2 = (MutableState) this.$state$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int i11 = 6;
                        mutableState2.setValue(RealQrCodesPresenter.State.copy$default((RealQrCodesPresenter.State) mutableState2.getValue(), true, null, null, 6));
                        QrCodeArgs qrCodeArgs = (QrCodeArgs) this.$qrCodeArgs;
                        String str3 = (String) this.$url;
                        TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10 = new TabToolbarsKt$$ExternalSyntheticLambda10(i11, mutableState2);
                        this.label = 1;
                        Object access$loadQrCodeImage = RealQrCodesPresenter.access$loadQrCodeImage(realQrCodesPresenter, qrCodeArgs, str3, tabToolbarsKt$$ExternalSyntheticLambda10, this);
                        realQrCodesPresenter = access$loadQrCodeImage;
                        if (access$loadQrCodeImage == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        realQrCodesPresenter = realQrCodesPresenter;
                    }
                } catch (Exception unused) {
                    mutableState2.setValue(RealQrCodesPresenter.State.copy$default((RealQrCodesPresenter.State) mutableState2.getValue(), false, null, realQrCodesPresenter.stringManager.get(R.string.unexpected_error_occurred), 2));
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(19, coroutineScope, (TaxReturnsPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState3 = (MutableState) this.$state$delegate;
                ContactMethodDetailsViewEvent contactMethodDetailsViewEvent = (ContactMethodDetailsViewEvent) this.$qrCodeArgs;
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3.setValue(Boolean.TRUE);
                    RealProfileManager realProfileManager = (RealProfileManager) workHomePresenter.shiftsAnalytics;
                    ContactMethodDetailsViewEvent.NotificationToggled notificationToggled = (ContactMethodDetailsViewEvent.NotificationToggled) contactMethodDetailsViewEvent;
                    UiAlias uiAlias = new UiAlias(((ProfileScreens.ContactMethodDetailsScreen) workHomePresenter.payPresenter).aliasType, notificationToggled.alias.value);
                    boolean z6 = notificationToggled.checkedValue;
                    FeeType.Companion companion = NotificationPreferenceUpdatedEvent$ClientExperienceVersion.Companion;
                    this.label = 1;
                    UiAlias.Type type2 = uiAlias.f1363type;
                    int i14 = type2 == null ? -1 : RealProfileManager.WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i14 == -1) {
                        aliasType = null;
                    } else if (i14 == 1) {
                        aliasType = AccountConfigureUpdateNotificationPreference.AliasType.SMS;
                    } else if (i14 == 2) {
                        aliasType = AccountConfigureUpdateNotificationPreference.AliasType.APP;
                    } else {
                        if (i14 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        aliasType = AccountConfigureUpdateNotificationPreference.AliasType.EMAIL;
                    }
                    realProfileManager.analytics.track(new AccountConfigureUpdateNotificationPreference(aliasType, Boolean.valueOf(z6)), null);
                    notificationPreference = realProfileManager.appService.setNotificationPreference(ClientScenario.PROFILE, null, new SetNotificationPreferenceRequest(null, null, new NotificationPreference(uiAlias, Boolean.valueOf(z6)), null, ByteString.EMPTY), this);
                    if (notificationPreference == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    notificationPreference = obj;
                }
                ApiResult apiResult = (ApiResult) notificationPreference;
                if (apiResult instanceof ApiResult.Failure) {
                    WorkHomePresenter.access$replace(workHomePresenter, (List) this.$url, ((ContactMethodDetailsViewEvent.NotificationToggled) contactMethodDetailsViewEvent).alias, !r2.checkedValue);
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) workHomePresenter.titleBarPresenter, (ApiResult.Failure) apiResult, null);
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.youPresenter).goTo(new ProfileScreens.ErrorScreen(errorMessaging.message, errorMessaging.title, 12));
                }
                mutableState3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.this$0;
                AndroidStringManager androidStringManager = (AndroidStringManager) pdfPreviewPresenter.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator = pdfPreviewPresenter.navigator;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager2 = (RealProfileManager) pdfPreviewPresenter.args;
                    String appTokenOrNull = PlatformKt.appTokenOrNull((SessionManager) pdfPreviewPresenter.fileProvider);
                    String access$getSessionToken = PdfPreviewPresenter.access$getSessionToken(pdfPreviewPresenter);
                    ArrayList plus = CollectionsKt.plus((Iterable) PdfPreviewPresenter.access$toNotificationPreferenceList(pdfPreviewPresenter, (List) ((MutableState) this.$url).getValue(), UiAlias.Type.EMAIL), (Collection) PdfPreviewPresenter.access$toNotificationPreferenceList(pdfPreviewPresenter, (List) ((MutableState) this.$state$delegate).getValue(), UiAlias.Type.SMS));
                    this.label = 1;
                    notificationPreferences = realProfileManager2.appService.setNotificationPreferences(ClientScenario.PROFILE, null, new SetNotificationPreferencesRequest(null, appTokenOrNull, access$getSessionToken, plus, ByteString.EMPTY), this);
                    if (notificationPreferences == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    notificationPreferences = obj;
                }
                ApiResult apiResult2 = (ApiResult) notificationPreferences;
                if (JobKt.isActive((CoroutineContext) this.$qrCodeArgs)) {
                    if (apiResult2 instanceof ApiResult.Success) {
                        screenNavigator.goTo(Back.INSTANCE);
                    } else {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(R.string.enable_alias_sheet_error_body), androidStringManager.get(R.string.enable_alias_sheet_error_title), 12));
                    }
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$22 = new AndroidPermissionChecker$granted$$inlined$map$2$2(20, coroutineScope2, (PdfPreviewPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(androidPermissionChecker$granted$$inlined$map$2$22, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                AliasesSectionEvent aliasesSectionEvent = (AliasesSectionEvent) this.$qrCodeArgs;
                MutableState mutableState4 = (MutableState) this.$state$delegate;
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) this.$url;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AliasesSectionEvent.UnregisterAlias unregisterAlias2 = (AliasesSectionEvent.UnregisterAlias) aliasesSectionEvent;
                    profileAlias = new ProfileAlias(unregisterAlias2.f1037type, unregisterAlias2.text, unregisterAlias2.verified);
                    RealProfileManager realProfileManager3 = (RealProfileManager) pdfPreviewPresenter2.fileProvider;
                    String str4 = unregisterAlias2.text;
                    UiAlias.Type type3 = unregisterAlias2.f1037type;
                    this.this$0 = profileAlias;
                    this.label = 1;
                    unregisterAlias = realProfileManager3.appService.unregisterAlias(ClientScenario.PROFILE, null, new UnregisterAliasRequest(null, new UiAlias(type3, str4), ByteString.EMPTY), this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ProfileAlias profileAlias2 = (ProfileAlias) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    profileAlias = profileAlias2;
                    unregisterAlias = obj;
                }
                ApiResult apiResult3 = (ApiResult) unregisterAlias;
                if (apiResult3 instanceof ApiResult.Success) {
                    ResponseContext responseContext = ((UnregisterAliasResponse) ((ApiResult.Success) apiResult3).response).response_context;
                    String str5 = responseContext != null ? responseContext.failure_message : null;
                    if (str5 == null) {
                        unregisterOngoing = new AliasesSectionPresenter$Result.UnregisterSuccess(profileAlias);
                        mutableState4.setValue(unregisterOngoing);
                        aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) mutableState4.getValue();
                        if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterFailed) {
                            if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterSuccess) {
                                Timber.Forest.d("Successfully unregistered alias", new Object[0]);
                                RealContactAliasFetcher realContactAliasFetcher = (RealContactAliasFetcher) pdfPreviewPresenter2.fileSaver;
                                this.this$0 = null;
                                this.label = 2;
                                break;
                            }
                        } else {
                            AliasesSectionPresenter$Result aliasesSectionPresenter$Result2 = (AliasesSectionPresenter$Result) mutableState4.getValue();
                            aliasesSectionPresenter$Result2.getClass();
                            String str6 = ((AliasesSectionPresenter$Result.UnregisterFailed) aliasesSectionPresenter$Result2).failureMessage;
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("failed to unregister alias: ", str6), new Object[0]);
                            pdfPreviewPresenter2.navigator.goTo(new ProfileScreens.ErrorScreen(str6, null, 14));
                        }
                    } else {
                        unregisterFailed = new AliasesSectionPresenter$Result.UnregisterFailed(profileAlias, str5);
                        unregisterOngoing = unregisterFailed;
                        mutableState4.setValue(unregisterOngoing);
                        aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) mutableState4.getValue();
                        if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterFailed) {
                        }
                    }
                } else if (apiResult3 instanceof ApiResult.Failure) {
                    unregisterFailed = new AliasesSectionPresenter$Result.UnregisterFailed(profileAlias, TextUtilsCompat.errorMessaging((AndroidStringManager) pdfPreviewPresenter2.stringManager, (ApiResult.Failure) apiResult3, new Integer(R.string.profile_error_message_update)).message);
                    unregisterOngoing = unregisterFailed;
                    mutableState4.setValue(unregisterOngoing);
                    aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) mutableState4.getValue();
                    if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterFailed) {
                    }
                } else {
                    unregisterOngoing = new AliasesSectionPresenter$Result.UnregisterOngoing(profileAlias);
                    mutableState4.setValue(unregisterOngoing);
                    aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) mutableState4.getValue();
                    if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterFailed) {
                    }
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope3, (LocalCashBalancePresenter) this.$url, (State) this.$state$delegate, i);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(wirelessProviderListPresenter$models$1$1$1, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$23 = new AndroidPermissionChecker$granted$$inlined$map$2$2(i3, coroutineScope4, (LocalHomePresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(androidPermissionChecker$granted$$inlined$map$2$23, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState5 = (MutableState) this.$qrCodeArgs;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                try {
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutableState5.setValue(Boolean.TRUE);
                        MutableState mutableState6 = (MutableState) this.$url;
                        LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                        this.$state$delegate = mutableState6;
                        this.label = 1;
                        withContext = JobKt.withContext((CoroutineContext) localHomePresenter.neighborhoodsTabContentEnabled$delegate, new ShoppingWebBridge.AnonymousClass1((Object) localHomePresenter, (Continuation) (z ? 1 : 0), i2), this);
                        if (withContext == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        mutableState = mutableState6;
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState = (MutableState) this.$state$delegate;
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                    }
                    mutableState.setValue((RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings) withContext);
                    mutableState5.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutableState5.setValue(Boolean.FALSE);
                    throw th;
                }
            case 9:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$24 = new AndroidPermissionChecker$granted$$inlined$map$2$2(22, coroutineScope5, (LocalEditorialPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(androidPermissionChecker$granted$$inlined$map$2$24, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flowOn = FlowKt.flowOn(new SafeFlow(new SelectPaymentPlanBlockerPresenter$models$1$2((Uri) this.$qrCodeArgs, (NotificationOptionsView) this.$url, (Continuation) null)), (CoroutineContext) this.this$0);
                    RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651((BasicSettingView) this.$state$delegate, i5);
                    this.label = 1;
                    if (flowOn.collect(c00651, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$12 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope6, (CardLockPresenter) this.$url, (MutableState) this.$state$delegate, 15);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(wirelessProviderListPresenter$models$1$1$12, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$qrCodeArgs;
                    CashQrScannerPresenter$models$2$1$1.AnonymousClass1 anonymousClass1 = new CashQrScannerPresenter$models$2$1$1.AnonymousClass1(coroutineScope7, (CashQrScannerPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(anonymousClass1, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                List list3 = (List) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        String str7 = ((SuggestedRecipient) it.next()).customer_token;
                        if (str7 != null) {
                            arrayList.add(str7);
                        }
                    }
                    RealCustomerStore$getCustomersForIds$$inlined$map$1 customersForIds = ((RealRecipientRepository) this.$qrCodeArgs).customerStore.getCustomersForIds(arrayList);
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(customersForIds, this);
                    if (firstOrNull == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                List list4 = (List) firstOrNull;
                if (list4 != null) {
                    List list5 = list4;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    map = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : list5) {
                        map.put(((com.squareup.cash.db.contacts.Recipient) obj2).customerId, obj2);
                    }
                } else {
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
                List sortedWith = CollectionsKt.sortedWith(list3, new LinkedHashTreeMap.AnonymousClass1(i2));
                ArrayList arrayList2 = (ArrayList) this.$url;
                Set set = (Set) this.$state$delegate;
                ArrayList arrayList3 = new ArrayList();
                int i26 = 0;
                for (Object obj3 : sortedWith) {
                    int i27 = i26 + 1;
                    if (i26 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    SuggestedRecipient suggestedRecipient = (SuggestedRecipient) obj3;
                    String str8 = suggestedRecipient.customer_token;
                    if (str8 != null) {
                        if (map.containsKey(str8)) {
                            Object obj4 = map.get(str8);
                            obj4.getClass();
                            recipient = DrawableCompat.transform((com.squareup.cash.db.contacts.Recipient) obj4, arrayList2, set);
                            str = str8;
                        } else {
                            CustomerData customerData = suggestedRecipient.customer_data;
                            if (customerData != null) {
                                String str9 = customerData.full_name;
                                String str10 = customerData.cashtag;
                                Recipient recipient2 = new Recipient(null, false, false, str8, null, str10, !(str10 == null || StringsKt.isBlank(str10)), false, false, null, null, null, customerData.photo, null, null, false, 0L, null, null, false, null, null, null, null, null, str9, null, null, false, null, null, arrayList2.contains(str8), set.contains(str8), null, 2113925015, 2);
                                str = str8;
                                recipient = recipient2;
                            } else {
                                str = str8;
                                recipient = null;
                            }
                        }
                        if (recipient != null) {
                            copy$default = Recipient.copy$default(recipient, null, null, null, null, null, null, new Recipient.Analytics(null, arrayList2.contains(str) ? GenerationStrategy.FAVORITE : null, new Integer(i26), null, null, null, "SUGGESTED", new Integer(i26), new Integer(list3.size()), new Integer(0), null, SuggestionStrategy.REMOTE, null, null, null, null, null, null, null, null, null, 16774201), arrayList2.contains(str), set.contains(str), 1073741823, 2);
                            if (copy$default == null) {
                                arrayList3.add(copy$default);
                            }
                            i26 = i27;
                        }
                    }
                    copy$default = null;
                    if (copy$default == null) {
                    }
                    i26 = i27;
                }
                return arrayList3;
            case 14:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$25 = new AndroidPermissionChecker$granted$$inlined$map$2$2(i4, coroutineScope8, (PaymentPlanDataBlockerPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(androidPermissionChecker$granted$$inlined$map$2$25, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$13 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope9, (PoolsListPresenter) this.$url, (MutableState) this.$state$delegate, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(wirelessProviderListPresenter$models$1$1$13, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$14 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope10, (WorkHomePresenter) this.$url, (MutableState) this.$state$delegate, 24);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(wirelessProviderListPresenter$models$1$1$14, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$15 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope11, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate, 25);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(wirelessProviderListPresenter$models$1$1$15, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$qrCodeArgs;
                    WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$16 = new WirelessProviderListPresenter$models$1$1$1(coroutineScope12, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow12.collect(wirelessProviderListPresenter$models$1$1$16, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$qrCodeArgs;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$26 = new AndroidPermissionChecker$granted$$inlined$map$2$2(28, coroutineScope13, (BasePasswordPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow13.collect(androidPermissionChecker$granted$$inlined$map$2$26, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$qrCodeArgs;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass12 = new BufferCountKt$bufferSkip$1.AnonymousClass1(i5, coroutineScope14, (ShareSheetPresenter) this.$url, (MutableState) this.$state$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow14.collect(anonymousClass12, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                    Map map2 = (Map) ((AutofillScreen) localEditorialPresenter.launcher).getCapturedData().getValue();
                    String str11 = ((Profile) this.$qrCodeArgs).profile_id;
                    Function1 function1 = (Function1) this.$url;
                    Function0 function0 = (Function0) this.$state$delegate;
                    this.label = 1;
                    if (LocalEditorialPresenter.access$saveAutofill(localEditorialPresenter, map2, str11, function1, function0, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Map map3 = (Map) ((AutofillScreen) localEditorialPresenter2.launcher).getCapturedData().getValue();
                    String str12 = ((AutofillScreen.UpdateAutofillScreen) ((AutofillScreen) localEditorialPresenter2.launcher)).shippingAddressId;
                    Profile profile = (Profile) ((State) this.$state$delegate).getValue();
                    String str13 = profile != null ? profile.profile_id : null;
                    Function1 function12 = (Function1) this.$qrCodeArgs;
                    Function0 function02 = (Function0) this.$url;
                    this.label = 1;
                    if (LocalEditorialPresenter.access$updateAutofill(localEditorialPresenter2, map3, str12, str13, function12, function02, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                RealProductSearchRepository realProductSearchRepository = (RealProductSearchRepository) this.$state$delegate;
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$url;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    async$default = JobKt.async$default(coroutineScope15, null, null, new RealProductSearchRepository$restoreResults$2$sections$1(realProductSearchRepository, z3 ? 1 : 0, i9), 3);
                    DeferredCoroutine async$default3 = JobKt.async$default(coroutineScope15, null, null, new RealProductSearchRepository$restoreResults$2$sections$1(realProductSearchRepository, z2 ? 1 : 0, i7), 3);
                    this.$url = null;
                    this.this$0 = async$default;
                    this.label = 1;
                    awaitInternal = async$default3.awaitInternal(this);
                    break;
                } else {
                    if (i37 != 1) {
                        if (i37 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) this.$qrCodeArgs;
                        SafeTrace.throwOnFailure(obj);
                        await = obj;
                        obj5 = new SearchResults(2, null, (String) await, list);
                        return obj5;
                    }
                    DeferredCoroutine deferredCoroutine = (DeferredCoroutine) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    async$default = deferredCoroutine;
                    awaitInternal = obj;
                }
                list = (List) awaitInternal;
                this.$url = null;
                this.this$0 = null;
                this.$qrCodeArgs = list;
                this.label = 2;
                await = async$default.await(this);
                break;
            case 24:
                RealRecentSearchManager realRecentSearchManager = (RealRecentSearchManager) this.$state$delegate;
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$url;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    async$default2 = JobKt.async$default(coroutineScope16, null, null, new RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1(realRecentSearchManager, z5 ? 1 : 0, i7), 3);
                    DeferredCoroutine async$default4 = JobKt.async$default(coroutineScope16, null, null, new RealRecentSearchManager$recentSearchesAndViews$2$recentSearchesAsync$1(realRecentSearchManager, z4 ? 1 : 0, i9), 3);
                    this.$url = null;
                    this.this$0 = async$default2;
                    this.label = 1;
                    access$resultOrEmpty = RealRecentSearchManager.access$resultOrEmpty(realRecentSearchManager, async$default4, this);
                    break;
                } else {
                    if (i38 != 1) {
                        if (i38 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list6 = (List) this.$qrCodeArgs;
                        SafeTrace.throwOnFailure(obj);
                        list2 = list6;
                        access$resultOrEmpty2 = obj;
                        return new RecentSearches(list2, (List) access$resultOrEmpty2);
                    }
                    DeferredCoroutine deferredCoroutine2 = (DeferredCoroutine) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    async$default2 = deferredCoroutine2;
                    access$resultOrEmpty = obj;
                }
                list2 = (List) access$resultOrEmpty;
                this.$url = null;
                this.this$0 = null;
                this.$qrCodeArgs = list2;
                this.label = 2;
                access$resultOrEmpty2 = RealRecentSearchManager.access$resultOrEmpty(realRecentSearchManager, async$default2, this);
                break;
            case 25:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$qrCodeArgs;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$1 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope17, (BrandsSearchPresenter) this.$url, (MutableState) this.$state$delegate, i9);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow15.collect(taxWebAppBridge$openTakePhoto$1$1, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$qrCodeArgs;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$12 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope18, (ProductSearchPresenter) this.$url, (MutableState) this.$state$delegate, i8);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow16.collect(taxWebAppBridge$openTakePhoto$1$12, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                MutableState mutableState7 = (MutableState) this.$qrCodeArgs;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((ProductSearchPresenter.State) mutableState7.getValue()).isLoadingNextPage && (str2 = ((ProductSearchPresenter.State) mutableState7.getValue()).searchResults.paginationToken) != null && !StringsKt.isBlank(str2)) {
                        ProductSearchPresenter productSearchPresenter = (ProductSearchPresenter) this.this$0;
                        ProductSearchPresenter.State state = (ProductSearchPresenter.State) mutableState7.getValue();
                        List list7 = (List) ((State) this.$url).getValue();
                        this.$state$delegate = mutableState7;
                        this.label = 1;
                        access$performSearch = ProductSearchPresenter.access$performSearch(productSearchPresenter, state, list7, this);
                        if (access$performSearch == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i41 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutableState7 = (MutableState) this.$state$delegate;
                SafeTrace.throwOnFailure(obj);
                access$performSearch = obj;
                mutableState7.setValue((ProductSearchPresenter.State) access$performSearch);
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.label;
                if (i42 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$qrCodeArgs;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$13 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope19, (RealShoppingJavascriptPresenter) this.$url, (MutableState) this.$state$delegate, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow17.collect(taxWebAppBridge$openTakePhoto$1$13, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i42 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = this.label;
                if (i43 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$qrCodeArgs;
                    TaxWebAppBridge$openTakePhoto$1$1 taxWebAppBridge$openTakePhoto$1$14 = new TaxWebAppBridge$openTakePhoto$1$1(coroutineScope20, (CoroutineScope) this.$url, (RealShoppingJavascriptPresenter) this.$state$delegate, 4);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow18.collect(taxWebAppBridge$openTakePhoto$1$14, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i43 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealQrCodesPresenter$models$1$1(MutableState mutableState, WorkHomePresenter workHomePresenter, ContactMethodDetailsViewEvent contactMethodDetailsViewEvent, List list, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$state$delegate = mutableState;
        this.this$0 = workHomePresenter;
        this.$qrCodeArgs = contactMethodDetailsViewEvent;
        this.$url = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealQrCodesPresenter$models$1$1(AliasesSectionEvent aliasesSectionEvent, PdfPreviewPresenter pdfPreviewPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$qrCodeArgs = aliasesSectionEvent;
        this.$url = pdfPreviewPresenter;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealQrCodesPresenter$models$1$1(int i, MutableState mutableState, State state, MoleculePresenter moleculePresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$qrCodeArgs = mutableState;
        this.$url = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealQrCodesPresenter$models$1$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$qrCodeArgs = obj2;
        this.$url = obj3;
        this.$state$delegate = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealQrCodesPresenter$models$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealQrCodesPresenter$models$1$1(Flow flow, Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$qrCodeArgs = flow;
        this.$url = obj;
        this.$state$delegate = obj2;
    }
}
