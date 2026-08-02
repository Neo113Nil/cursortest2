package com.squareup.cash.profile.presenters;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.motion.utils.CustomSupport;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.LocalTextsKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.favorites.viewmodels.AddOrRemoveAsFavoriteButtonViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.favorites.viewmodels.FavoriteState;
import com.squareup.cash.favorites.viewmodels.FavoritesListWidgetViewModel;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter$Factory$Impl;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfilePaymentHistory;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.GenericProfileElementType;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Error;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Loading;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.TrustElementWidget;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashface.api.AnalyticsData;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashface.api.ReportProfileRequest;
import com.squareup.protos.cash.cashface.api.ReportProfileResponse;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$ButtonElement$Action$Block;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$ButtonElement$Action$Report;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$ButtonElement$Style$Tertiary;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$ActivityStatsElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$ButtonElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$IconTextElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$TextElement;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement$Element$TrustElements;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.compose.StableHolder;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealGenericProfileElementsPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final CashFaceClientService appService;
    public final BlockersDataNavigator blockersNavigator;
    public final UUID externalPaymentId;
    public final RealFavoritesManager favoritesManager;
    public final EglCore favoritesNavigator;
    public final FlowStarter flowStarter;
    public final String inAppMessageToken;
    public boolean loggedViewCustomerProfileAlready;
    public final BetterNavigator.ScreenNavigator navigator;
    public final GetProfileDetailsContext originContext;
    public final Screen parentScreen;
    public final ProfilePaymentHistoryPresenter$Factory$Impl paymentHistoryPresenterFactory;
    public final ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics;
    public final Flow profileDetailsProvider;
    public final RealProfileRepo profileRepo;
    public final ProfileScreens.GenericProfileElementsSection screen;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericProfileElementType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GenericProfileElementType genericProfileElementType = GenericProfileElementType.ACTIVITY;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GenericProfileElementType genericProfileElementType2 = GenericProfileElementType.ACTIVITY;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                GenericProfileElementType genericProfileElementType3 = GenericProfileElementType.ACTIVITY;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GenericProfileElementType genericProfileElementType4 = GenericProfileElementType.ACTIVITY;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GenericProfileElementType genericProfileElementType5 = GenericProfileElementType.ACTIVITY;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                GenericProfileElementType genericProfileElementType6 = GenericProfileElementType.ACTIVITY;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GenericProfileElement.TrustElement.Id.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Error.Code.Companion companion = GenericProfileElement.TrustElement.Id.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Error.Code.Companion companion2 = GenericProfileElement.TrustElement.Id.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Error.Code.Companion companion3 = GenericProfileElement.TrustElement.Id.Companion;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[ContactsStatus.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ContactsStatus contactsStatus = ContactsStatus.IN_CONTACTS;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                ContactsStatus contactsStatus2 = ContactsStatus.IN_CONTACTS;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[GetProfileDetailsContext.values().length];
            try {
                iArr4[8] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                WorkCookieJar workCookieJar = GetProfileDetailsContext.Companion;
                iArr4[7] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                WorkCookieJar workCookieJar2 = GetProfileDetailsContext.Companion;
                iArr4[6] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                WorkCookieJar workCookieJar3 = GetProfileDetailsContext.Companion;
                iArr4[5] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                WorkCookieJar workCookieJar4 = GetProfileDetailsContext.Companion;
                iArr4[9] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                WorkCookieJar workCookieJar5 = GetProfileDetailsContext.Companion;
                iArr4[1] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                WorkCookieJar workCookieJar6 = GetProfileDetailsContext.Companion;
                iArr4[2] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                WorkCookieJar workCookieJar7 = GetProfileDetailsContext.Companion;
                iArr4[3] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                WorkCookieJar workCookieJar8 = GetProfileDetailsContext.Companion;
                iArr4[4] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                WorkCookieJar workCookieJar9 = GetProfileDetailsContext.Companion;
                iArr4[10] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                WorkCookieJar workCookieJar10 = GetProfileDetailsContext.Companion;
                iArr4[11] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                WorkCookieJar workCookieJar11 = GetProfileDetailsContext.Companion;
                iArr4[12] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                WorkCookieJar workCookieJar12 = GetProfileDetailsContext.Companion;
                iArr4[13] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                WorkCookieJar workCookieJar13 = GetProfileDetailsContext.Companion;
                iArr4[0] = 14;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    public RealGenericProfileElementsPresenter(CashFaceClientService cashFaceClientService, Analytics analytics, BlockersDataNavigator blockersDataNavigator, FlowStarter flowStarter, RealProfileRepo realProfileRepo, ProfilePaymentHistoryPresenter$Factory$Impl profilePaymentHistoryPresenter$Factory$Impl, RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl, RealFavoritesManager realFavoritesManager, AndroidStringManager androidStringManager, Screen screen, ProfileScreens.GenericProfileElementsSection genericProfileElementsSection, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics;
        GetProfileDetailsContext getProfileDetailsContext;
        screen.getClass();
        this.appService = cashFaceClientService;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.flowStarter = flowStarter;
        this.profileRepo = realProfileRepo;
        this.paymentHistoryPresenterFactory = profilePaymentHistoryPresenter$Factory$Impl;
        this.favoritesManager = realFavoritesManager;
        this.stringManager = androidStringManager;
        this.parentScreen = screen;
        this.screen = genericProfileElementsSection;
        this.profileDetailsProvider = flow;
        this.navigator = screenNavigator;
        this.favoritesNavigator = realFavoritesInboundNavigator$Factory$Impl.create(screenNavigator);
        ProfileScreens.GenericProfileElementsSection.ExtraPaymentInfo extraPaymentInfo = genericProfileElementsSection.extraPaymentInfo;
        this.externalPaymentId = extraPaymentInfo != null ? extraPaymentInfo.externalPaymentId : null;
        this.originContext = (extraPaymentInfo == null || (getProfileDetailsContext = extraPaymentInfo.originContext) == null) ? GetProfileDetailsContext.UNKNOWN : getProfileDetailsContext;
        this.inAppMessageToken = (extraPaymentInfo == null || (profileAnalytics = extraPaymentInfo.analytics) == null) ? null : profileAnalytics.messageToken;
        this.profileAnalytics = extraPaymentInfo != null ? extraPaymentInfo.analytics : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getCustomerProfileData(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, ContinuationImpl continuationImpl) {
        RealGenericProfileElementsPresenter$getCustomerProfileData$1 realGenericProfileElementsPresenter$getCustomerProfileData$1;
        int i;
        AsyncResult asyncResult;
        if (continuationImpl instanceof RealGenericProfileElementsPresenter$getCustomerProfileData$1) {
            realGenericProfileElementsPresenter$getCustomerProfileData$1 = (RealGenericProfileElementsPresenter$getCustomerProfileData$1) continuationImpl;
            int i2 = realGenericProfileElementsPresenter$getCustomerProfileData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGenericProfileElementsPresenter$getCustomerProfileData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGenericProfileElementsPresenter$getCustomerProfileData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGenericProfileElementsPresenter$getCustomerProfileData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileRepo realProfileRepo = realGenericProfileElementsPresenter.profileRepo;
                    ProfileScreens.GenericProfileElementsSection genericProfileElementsSection = realGenericProfileElementsPresenter.screen;
                    ProfileScreens.ProfileScreen.Customer customer = genericProfileElementsSection.customer;
                    ProfileScreens.GenericProfileElementsSection.ExtraPaymentInfo extraPaymentInfo = genericProfileElementsSection.extraPaymentInfo;
                    boolean z = extraPaymentInfo != null ? extraPaymentInfo.confirmRecipient : false;
                    GetProfileDetailsContext getProfileDetailsContext = realGenericProfileElementsPresenter.originContext;
                    realGenericProfileElementsPresenter$getCustomerProfileData$1.label = 1;
                    obj = realProfileRepo.customerData(customer, z, getProfileDetailsContext, realGenericProfileElementsPresenter$getCustomerProfileData$1);
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
                asyncResult = (AsyncResult) obj;
                if ((asyncResult instanceof AsyncResult.Failure) || Intrinsics.areEqual(asyncResult, AsyncResult.Loading.INSTANCE)) {
                    return null;
                }
                if (!(asyncResult instanceof AsyncResult.Success)) {
                    return (CustomerProfileData) ((AsyncResult.Success) asyncResult).response;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realGenericProfileElementsPresenter$getCustomerProfileData$1 = new RealGenericProfileElementsPresenter$getCustomerProfileData$1(realGenericProfileElementsPresenter, continuationImpl);
        Object obj2 = realGenericProfileElementsPresenter$getCustomerProfileData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGenericProfileElementsPresenter$getCustomerProfileData$1.label;
        if (i != 0) {
        }
        asyncResult = (AsyncResult) obj2;
        if (asyncResult instanceof AsyncResult.Failure) {
            if (!(asyncResult instanceof AsyncResult.Success)) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$reportProfile(RealGenericProfileElementsPresenter realGenericProfileElementsPresenter, ContinuationImpl continuationImpl) {
        RealGenericProfileElementsPresenter$reportProfile$1 realGenericProfileElementsPresenter$reportProfile$1;
        int i;
        BlockersData blockersData;
        ApiResult apiResult;
        Screen screen = realGenericProfileElementsPresenter.parentScreen;
        BetterNavigator.ScreenNavigator screenNavigator = realGenericProfileElementsPresenter.navigator;
        if (continuationImpl instanceof RealGenericProfileElementsPresenter$reportProfile$1) {
            realGenericProfileElementsPresenter$reportProfile$1 = (RealGenericProfileElementsPresenter$reportProfile$1) continuationImpl;
            int i2 = realGenericProfileElementsPresenter$reportProfile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGenericProfileElementsPresenter$reportProfile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGenericProfileElementsPresenter$reportProfile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGenericProfileElementsPresenter$reportProfile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfileScreens.ProfileScreen.Customer customer = realGenericProfileElementsPresenter.screen.customer;
                    if (!(customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer)) {
                        if (customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer) {
                            a$$ExternalSyntheticBUOutline0.m$1((Object) "Local contacts are not expected to be reportable");
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str = (String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer).customerId.getValue();
                    FlowStarter flowStarter = realGenericProfileElementsPresenter.flowStarter;
                    ClientScenario clientScenario = ClientScenario.REPORT_PROFILE;
                    BlockersData startProfileBlockersFlow$default = FlowStarter.startProfileBlockersFlow$default(flowStarter, clientScenario, screen, null, 12);
                    CashFaceClientService cashFaceClientService = realGenericProfileElementsPresenter.appService;
                    String str2 = startProfileBlockersFlow$default.flowToken;
                    ReportProfileRequest reportProfileRequest = new ReportProfileRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), str, ByteString.EMPTY);
                    realGenericProfileElementsPresenter$reportProfile$1.L$1 = startProfileBlockersFlow$default;
                    realGenericProfileElementsPresenter$reportProfile$1.label = 1;
                    obj = cashFaceClientService.reportProfile(clientScenario, str2, reportProfileRequest, realGenericProfileElementsPresenter$reportProfile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = startProfileBlockersFlow$default;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = realGenericProfileElementsPresenter$reportProfile$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((ReportProfileResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(realGenericProfileElementsPresenter.blockersNavigator.getNext(screen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, screen, realGenericProfileElementsPresenter.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        realGenericProfileElementsPresenter$reportProfile$1 = new RealGenericProfileElementsPresenter$reportProfile$1(realGenericProfileElementsPresenter, continuationImpl);
        Object obj2 = realGenericProfileElementsPresenter$reportProfile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGenericProfileElementsPresenter$reportProfile$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public static GenericProfileElement.ButtonElement getButton_element(LocalTextsKt localTextsKt) {
        GenericProfileElement$Element$ButtonElement genericProfileElement$Element$ButtonElement = localTextsKt instanceof GenericProfileElement$Element$ButtonElement ? (GenericProfileElement$Element$ButtonElement) localTextsKt : null;
        if (genericProfileElement$Element$ButtonElement != null) {
            return genericProfileElement$Element$ButtonElement.value;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logProfileViewOpenAnalytics(CustomerProfileData customerProfileData, GetProfileDetailsResponse getProfileDetailsResponse, ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics) {
        ContactStatus contactStatus;
        CustomerProfileViewOpen.Context context;
        AnalyticsData analyticsData;
        ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics2;
        UUID uuid;
        GetProfileDetailsContext getProfileDetailsContext;
        ProfileScreens.GenericProfileElementsSection genericProfileElementsSection = this.screen;
        if (!genericProfileElementsSection.logViewCustomerProfile || this.loggedViewCustomerProfileAlready) {
            return;
        }
        ProfileScreens.GenericProfileElementsSection.ExtraPaymentInfo extraPaymentInfo = genericProfileElementsSection.extraPaymentInfo;
        int ordinal = customerProfileData.isInContacts.ordinal();
        if (ordinal == 0) {
            contactStatus = ContactStatus.IN_CONTACTS;
        } else if (ordinal == 1) {
            contactStatus = ContactStatus.NOT_IN_CONTACTS;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            contactStatus = ContactStatus.CONTACTS_DISABLED;
        }
        if (extraPaymentInfo != null && (getProfileDetailsContext = extraPaymentInfo.originContext) != null) {
            switch (getProfileDetailsContext) {
                case UNKNOWN:
                case INVEST_PAYMENT_FLOW:
                case GIFT_CARD:
                case GLOBAL_SEARCH:
                case POOLS:
                    break;
                case PAYMENT_FLOW:
                    context = CustomerProfileViewOpen.Context.PAYMENT_FLOW;
                    break;
                case BTC_PAYMENT_FLOW:
                    context = CustomerProfileViewOpen.Context.BTC_PAYMENT_FLOW;
                    break;
                case PROFILE_DIRECTORY:
                    context = CustomerProfileViewOpen.Context.PROFILE_DIRECTORY;
                    break;
                case LAUNCHER:
                    context = CustomerProfileViewOpen.Context.LAUNCHER;
                    break;
                case ACTIVITY_PAYMENT_REQUEST_SENDER:
                case ACTIVITY_PAYMENT_REQUEST_RECEIVER:
                case ACTIVITY_PAYMENT_PUSH_SENDER:
                case ACTIVITY_PAYMENT_PUSH_RECEIVER:
                case ACTIVITY_OTHER:
                    context = CustomerProfileViewOpen.Context.ACTIVITY;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            CustomerProfileViewOpen.EntryPoint entryPoint = this.inAppMessageToken == null ? CustomerProfileViewOpen.EntryPoint.APP_MESSAGE : extraPaymentInfo != null ? extraPaymentInfo.entryPoint : null;
            UUID uuid2 = this.externalPaymentId;
            this.analytics.track(new CustomerProfileViewOpen(contactStatus, context, entryPoint, uuid2 == null ? uuid2.toString() : null, Boolean.valueOf((getProfileDetailsResponse == null ? getProfileDetailsResponse.bio : null) == null), Boolean.valueOf(customerProfileData.isBusiness), Boolean.valueOf(customerProfileData.isVerified), customerProfileData.customerId, (extraPaymentInfo != null || (profileAnalytics2 = extraPaymentInfo.analytics) == null || (uuid = profileAnalytics2.searchToken) == null) ? null : uuid.toString(), (getProfileDetailsResponse != null || (analyticsData = getProfileDetailsResponse.analytics_data) == null) ? null : analyticsData.profile_elements_data, this.inAppMessageToken, profileAnalytics == null ? profileAnalytics.isFirstLinkedAccount : null, profileAnalytics == null ? profileAnalytics.isMultipleAccountHolder : null, profileAnalytics == null ? profileAnalytics.accountHolderToken : null), null);
            this.loggedViewCustomerProfileAlready = true;
        }
        context = null;
        if (this.inAppMessageToken == null) {
        }
        UUID uuid22 = this.externalPaymentId;
        this.analytics.track(new CustomerProfileViewOpen(contactStatus, context, entryPoint, uuid22 == null ? uuid22.toString() : null, Boolean.valueOf((getProfileDetailsResponse == null ? getProfileDetailsResponse.bio : null) == null), Boolean.valueOf(customerProfileData.isBusiness), Boolean.valueOf(customerProfileData.isVerified), customerProfileData.customerId, (extraPaymentInfo != null || (profileAnalytics2 = extraPaymentInfo.analytics) == null || (uuid = profileAnalytics2.searchToken) == null) ? null : uuid.toString(), (getProfileDetailsResponse != null || (analyticsData = getProfileDetailsResponse.analytics_data) == null) ? null : analyticsData.profile_elements_data, this.inAppMessageToken, profileAnalytics == null ? profileAnalytics.isFirstLinkedAccount : null, profileAnalytics == null ? profileAnalytics.isMultipleAccountHolder : null, profileAnalytics == null ? profileAnalytics.accountHolderToken : null), null);
        this.loggedViewCustomerProfileAlready = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        Object obj;
        LocalTextsKt localTextsKt;
        boolean z;
        ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel;
        List list;
        Object genericProfileElementsViewModel$Success;
        List list2;
        Redacted redactedString;
        ProfileScreens.ProfileScreen.Customer customer = this.screen.customer;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(568660957);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            Object flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(this.profileDetailsProvider, new TabContentPresenter$models$4$1$1$1(mutableState, continuation2, 18), 3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        AsyncResult.Loading loading = AsyncResult.Loading.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, loading, null, gapComposer, 0, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = this.favoritesManager.getFavorites();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, EmptyList.INSTANCE, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj2) {
            Object nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 22), 16);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
            rememberedValue5 = nullStateSwipeConfigProvider;
        }
        Flow flow2 = (Flow) rememberedValue5;
        boolean changed = gapComposer.changed((AsyncResult) collectAsState.getValue());
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == obj2) {
            AsyncResult asyncResult = (AsyncResult) collectAsState.getValue();
            if (asyncResult instanceof AsyncResult.Failure) {
                CustomerProfileData customerProfileData = (CustomerProfileData) mutableState.getValue();
                if (customerProfileData != null) {
                    logProfileViewOpenAnalytics(customerProfileData, null, null);
                }
            } else if (asyncResult instanceof AsyncResult.Success) {
                CustomerProfileData customerProfileData2 = (CustomerProfileData) mutableState.getValue();
                if (customerProfileData2 != null) {
                    logProfileViewOpenAnalytics(customerProfileData2, ((CustomerProfileDetails) ((AsyncResult.Success) asyncResult).response).customerDetailsProto, this.profileAnalytics);
                }
                GetProfileDetailsResponse getProfileDetailsResponse = ((CustomerProfileDetails) ((AsyncResult.Success) asyncResult).response).customerDetailsProto;
                if (getProfileDetailsResponse != null) {
                    rememberedValue6 = getProfileDetailsResponse.generic_profile_elements;
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
            } else if (!Intrinsics.areEqual(asyncResult, loading)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            rememberedValue6 = null;
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        List list3 = (List) rememberedValue6;
        boolean changed2 = gapComposer.changed(list3);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == obj2) {
            if (list3 != null) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        continuation = continuation2;
                        obj = continuation;
                        break;
                    }
                    obj = it.next();
                    continuation = continuation2;
                    if (CustomSupport.getType((GenericProfileElement) obj) == GenericProfileElementType.ACTIVITY_STATS_ELEMENT) {
                        break;
                    }
                    continuation2 = continuation;
                }
                GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
                if (genericProfileElement != null && (localTextsKt = genericProfileElement.element) != null) {
                    GenericProfileElement$Element$ActivityStatsElement genericProfileElement$Element$ActivityStatsElement = localTextsKt instanceof GenericProfileElement$Element$ActivityStatsElement ? (GenericProfileElement$Element$ActivityStatsElement) localTextsKt : continuation;
                    rememberedValue7 = genericProfileElement$Element$ActivityStatsElement != 0 ? genericProfileElement$Element$ActivityStatsElement.value : continuation;
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
            } else {
                continuation = null;
            }
            rememberedValue7 = continuation;
            gapComposer.updateRememberedValue(rememberedValue7);
        } else {
            continuation = null;
        }
        GenericProfileElement.ActivityStatsElement activityStatsElement = (GenericProfileElement.ActivityStatsElement) rememberedValue7;
        if (((CustomerProfileData) mutableState.getValue()) != null) {
            gapComposer.startReplaceGroup(1629292518);
            boolean changed3 = gapComposer.changed(activityStatsElement);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue8 == obj2) {
                ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer ? (ProfileScreens.ProfileScreen.Customer.CashCustomer) customer : continuation;
                boolean z2 = cashCustomer != 0;
                CustomerProfileData customerProfileData3 = (CustomerProfileData) mutableState.getValue();
                customerProfileData3.getClass();
                boolean z3 = customerProfileData3.isBusiness;
                if (cashCustomer == 0 || (redactedString = cashCustomer.customerId) == null) {
                    redactedString = new RedactedString("");
                }
                rememberedValue8 = this.paymentHistoryPresenterFactory.create(new PaymentHistoryScreens$ProfilePaymentHistory(redactedString, z2, z3), this.parentScreen, this.navigator, activityStatsElement);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            profilePaymentHistoryViewModel = ((ProfilePaymentHistoryPresenter) rememberedValue8).models(flow2, (Composer) gapComposer, 64);
            z = false;
            gapComposer.end(false);
        } else {
            z = false;
            gapComposer.startReplaceGroup(1629975727);
            gapComposer.end(false);
            profilePaymentHistoryViewModel = ProfilePaymentHistoryViewModel.Empty.INSTANCE;
        }
        ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel2 = profilePaymentHistoryViewModel;
        boolean z4 = z;
        Updater.LaunchedEffect(gapComposer, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState, mutableState2, collectAsState2, 3));
        AsyncResult asyncResult2 = (AsyncResult) collectAsState.getValue();
        if (asyncResult2 instanceof AsyncResult.Failure) {
            genericProfileElementsViewModel$Success = GenericProfileElementsViewModel$Error.INSTANCE;
        } else if (Intrinsics.areEqual(asyncResult2, loading)) {
            genericProfileElementsViewModel$Success = GenericProfileElementsViewModel$Loading.INSTANCE;
        } else {
            if (!(asyncResult2 instanceof AsyncResult.Success)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return continuation;
            }
            if (customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) {
                String str = (String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer).customerId.getValue();
                if (list3 != null) {
                    CustomerProfileData customerProfileData4 = (CustomerProfileData) mutableState.getValue();
                    List list4 = (List) collectAsState2.getValue();
                    List list5 = (List) collectAsState2.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Recipient) it2.next()).customerId);
                    }
                    boolean z5 = (!arrayList.contains(str) || ((Boolean) mutableState2.getValue()).booleanValue()) ? z4 : true;
                    CustomerProfileData customerProfileData5 = (CustomerProfileData) mutableState.getValue();
                    list2 = toViewModel(list3, profilePaymentHistoryViewModel2, customerProfileData4, list4, z5, (customerProfileData5 != null ? customerProfileData5.blockState : continuation) == BlockState.BLOCKED ? true : z4, ((Boolean) mutableState2.getValue()).booleanValue());
                } else {
                    list2 = EmptyList.INSTANCE;
                }
                List list6 = (List) collectAsState2.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Recipient) it3.next()).customerId);
                }
                boolean contains = arrayList2.contains(str);
                CustomerProfileData customerProfileData6 = (CustomerProfileData) mutableState.getValue();
                genericProfileElementsViewModel$Success = new GenericProfileElementsViewModel$Success(list2, contains, (customerProfileData6 != null ? customerProfileData6.blockState : continuation) == BlockState.BLOCKED ? true : z4);
            } else {
                if (list3 != null) {
                    CustomerProfileData customerProfileData7 = (CustomerProfileData) mutableState.getValue();
                    EmptyList emptyList = EmptyList.INSTANCE;
                    CustomerProfileData customerProfileData8 = (CustomerProfileData) mutableState.getValue();
                    list = toViewModel(list3, profilePaymentHistoryViewModel2, customerProfileData7, emptyList, false, (customerProfileData8 != null ? customerProfileData8.blockState : continuation) == BlockState.BLOCKED ? true : z4, ((Boolean) mutableState2.getValue()).booleanValue());
                } else {
                    list = EmptyList.INSTANCE;
                }
                CustomerProfileData customerProfileData9 = (CustomerProfileData) mutableState.getValue();
                genericProfileElementsViewModel$Success = new GenericProfileElementsViewModel$Success(list, z4, (customerProfileData9 != null ? customerProfileData9.blockState : continuation) == BlockState.BLOCKED ? true : z4);
            }
        }
        gapComposer.end(z4);
        return genericProfileElementsViewModel$Success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList toViewModel(List list, ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel, CustomerProfileData customerProfileData, List list2, boolean z, boolean z2, boolean z3) {
        String str;
        Redacted redacted;
        GenericProfileElement.ButtonElement.BlockAction blockAction;
        CartItemCounterViewModel.Mode mode;
        GenericProfileElement.ButtonElement.TertiaryStyle tertiaryStyle;
        GenericProfileElement.IconTextElement iconTextElement;
        List list3;
        String str2;
        String str3;
        ProfileScreens.GenericProfileElementsSection genericProfileElementsSection = this.screen;
        boolean z4 = genericProfileElementsSection.isMyOwnProfile;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            r11 = null;
            GenericProfileElement.TextElement textElement = null;
            r11 = null;
            GenericProfileElement.IconTextElement iconTextElement2 = null;
            r11 = null;
            GenericProfileElement.ButtonElement.ReportAction reportAction = null;
            if (!it.hasNext()) {
                if (z4) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (((GenericProfileElementViewModel) listIterator.previous()) instanceof GenericProfileElementViewModel.IconTextWidget) {
                                r9 = listIterator.nextIndex();
                            }
                        }
                    }
                    int i2 = r9 + 1;
                    List<Recipient> list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (Recipient recipient : list4) {
                        String str4 = recipient.displayName;
                        arrayList2.add(new FavoriteAvatar(recipient, str4 == null ? "" : str4, str4 != null ? Character.valueOf(Character.toUpperCase(str4.charAt(0))) : null, recipient.photo, recipient.getAccentColor()));
                    }
                    arrayList.add(i2, new GenericProfileElementViewModel.FavoritesListWidget(new FavoritesListWidgetViewModel(arrayList2)));
                }
                if (!z4) {
                    ProfileScreens.ProfileScreen.Customer customer = genericProfileElementsSection.customer;
                    if ((customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) && !z2 && customerProfileData != null && customerProfileData.isCashCustomer) {
                        ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = (ProfileScreens.ProfileScreen.Customer.CashCustomer) customer;
                        ProfileScreens.ProfileScreen.Customer.CashCustomer.CashCustomerData cashCustomerData = cashCustomer.customerData;
                        String str5 = ((cashCustomerData == null || (redacted = cashCustomerData.displayName) == null || (str = (String) redacted.getValue()) == null) && (str = customerProfileData.displayName) == null) ? "" : str;
                        arrayList.add(0, new GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget(new AddOrRemoveAsFavoriteButtonViewModel((String) cashCustomer.customerId.getValue(), str5, customerProfileData.accentColor, customerProfileData.photo, StringsKt.isBlank(str5) ? null : Character.valueOf(Character.toUpperCase(str5.charAt(0))), z3 ? FavoriteState.REQUEST_IN_FLIGHT : z ? FavoriteState.FAVORITE : FavoriteState.NOT_FAVORITE)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    GenericProfileElementViewModel.BlankDivider.Size size = GenericProfileElementViewModel.BlankDivider.Size.SMALL;
                    arrayList.add(new GenericProfileElementViewModel.BlankDivider());
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    if (!(arrayList.get(i4) instanceof GenericProfileElementViewModel.ButtonWidget)) {
                        arrayList3.add(arrayList.get(i4));
                    } else if (i3 > 0) {
                        i3--;
                    } else {
                        Object obj = arrayList.get(i4);
                        obj.getClass();
                        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(obj);
                        int i5 = 1;
                        while (true) {
                            int i6 = i4 + i5;
                            if (CollectionsKt.getOrNull(i6, arrayList) instanceof GenericProfileElementViewModel.ButtonWidget) {
                                Object obj2 = arrayList.get(i6);
                                obj2.getClass();
                                mutableListOf.add((GenericProfileElementViewModel.ButtonWidget) obj2);
                                i5++;
                            } else {
                                arrayList3.add(new GenericProfileElementViewModel.GroupedButtonsWidget(mutableListOf));
                                i3 = i5 - 1;
                            }
                        }
                    }
                }
                return arrayList3;
            }
            Object next = it.next();
            int i7 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            GenericProfileElement genericProfileElement = (GenericProfileElement) next;
            GenericProfileElementType type2 = CustomSupport.getType(genericProfileElement);
            LocalTextsKt localTextsKt = genericProfileElement.element;
            switch (type2 != null ? WhenMappings.$EnumSwitchMapping$0[type2.ordinal()] : -1) {
                case -1:
                case 7:
                    break;
                case 0:
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 1:
                    GenericProfileElement.ButtonElement button_element = localTextsKt != null ? getButton_element(localTextsKt) : null;
                    button_element.getClass();
                    String str6 = button_element.title;
                    GenericProfileElement.ButtonElement button_element2 = localTextsKt != null ? getButton_element(localTextsKt) : null;
                    button_element2.getClass();
                    GenericProfileElement$ButtonElement$Style$Tertiary genericProfileElement$ButtonElement$Style$Tertiary = button_element2.style;
                    GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle titleStyle = (genericProfileElement$ButtonElement$Style$Tertiary == null || (tertiaryStyle = genericProfileElement$ButtonElement$Style$Tertiary.value) == null) ? null : tertiaryStyle.title_style;
                    GenericProfileElement.ButtonElement button_element3 = localTextsKt != null ? getButton_element(localTextsKt) : null;
                    button_element3.getClass();
                    CartItemCounterViewModel.Mode mode2 = button_element3.action;
                    if (mode2 != null) {
                        GenericProfileElement$ButtonElement$Action$Block genericProfileElement$ButtonElement$Action$Block = mode2 instanceof GenericProfileElement$ButtonElement$Action$Block ? (GenericProfileElement$ButtonElement$Action$Block) mode2 : null;
                        if (genericProfileElement$ButtonElement$Action$Block != null) {
                            blockAction = genericProfileElement$ButtonElement$Action$Block.value;
                            GenericProfileElement.ButtonElement button_element4 = localTextsKt == null ? getButton_element(localTextsKt) : null;
                            button_element4.getClass();
                            mode = button_element4.action;
                            if (mode != null) {
                                GenericProfileElement$ButtonElement$Action$Report genericProfileElement$ButtonElement$Action$Report = mode instanceof GenericProfileElement$ButtonElement$Action$Report ? (GenericProfileElement$ButtonElement$Action$Report) mode : null;
                                if (genericProfileElement$ButtonElement$Action$Report != null) {
                                    reportAction = genericProfileElement$ButtonElement$Action$Report.value;
                                }
                            }
                            arrayList.add(new GenericProfileElementViewModel.ButtonWidget(str6, titleStyle, blockAction, reportAction));
                            continue;
                            i = i7;
                        }
                    }
                    blockAction = null;
                    if (localTextsKt == null) {
                    }
                    button_element4.getClass();
                    mode = button_element4.action;
                    if (mode != null) {
                    }
                    arrayList.add(new GenericProfileElementViewModel.ButtonWidget(str6, titleStyle, blockAction, reportAction));
                    continue;
                    i = i7;
                    break;
                case 2:
                case 3:
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof GenericProfileElementViewModel.PaymentHistoryWidget) {
                            arrayList4.add(next2);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList.add(new GenericProfileElementViewModel.PaymentHistoryWidget(profilePaymentHistoryViewModel));
                        i = i7;
                    }
                    break;
                case 4:
                    if (localTextsKt != null) {
                        GenericProfileElement$Element$IconTextElement genericProfileElement$Element$IconTextElement = localTextsKt instanceof GenericProfileElement$Element$IconTextElement ? (GenericProfileElement$Element$IconTextElement) localTextsKt : null;
                        if (genericProfileElement$Element$IconTextElement != null) {
                            iconTextElement = genericProfileElement$Element$IconTextElement.value;
                            iconTextElement.getClass();
                            String str7 = iconTextElement.title;
                            if (localTextsKt != null) {
                                GenericProfileElement$Element$IconTextElement genericProfileElement$Element$IconTextElement2 = localTextsKt instanceof GenericProfileElement$Element$IconTextElement ? (GenericProfileElement$Element$IconTextElement) localTextsKt : null;
                                if (genericProfileElement$Element$IconTextElement2 != null) {
                                    iconTextElement2 = genericProfileElement$Element$IconTextElement2.value;
                                }
                            }
                            iconTextElement2.getClass();
                            arrayList.add(new GenericProfileElementViewModel.IconTextWidget(str7, iconTextElement2.icon));
                            break;
                        }
                    }
                    iconTextElement = null;
                    iconTextElement.getClass();
                    String str72 = iconTextElement.title;
                    if (localTextsKt != null) {
                    }
                    iconTextElement2.getClass();
                    arrayList.add(new GenericProfileElementViewModel.IconTextWidget(str72, iconTextElement2.icon));
                case 5:
                    if (localTextsKt != null) {
                        GenericProfileElement$Element$TrustElements genericProfileElement$Element$TrustElements = localTextsKt instanceof GenericProfileElement$Element$TrustElements ? (GenericProfileElement$Element$TrustElements) localTextsKt : null;
                        GenericProfileElement.TrustElements trustElements = genericProfileElement$Element$TrustElements != null ? genericProfileElement$Element$TrustElements.value : null;
                        if (trustElements != null) {
                            list3 = trustElements.subelements;
                            if (list3 != null && (!list3.isEmpty())) {
                                List<GenericProfileElement.TrustElement> list5 = list3;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                for (GenericProfileElement.TrustElement trustElement : list5) {
                                    GenericProfileElement.TrustElement.Id id = trustElement.id;
                                    if (id != null) {
                                        int ordinal = id.ordinal();
                                        if (ordinal == 0) {
                                            str3 = "join_date";
                                        } else if (ordinal == 1) {
                                            str3 = "paid_by_ppl_you_know";
                                        } else {
                                            if (ordinal != 2) {
                                                if (ordinal == 3) {
                                                    throw new NotImplementedError(null, 1, null);
                                                }
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            str3 = "in_your_contacts";
                                        }
                                        str2 = str3;
                                    } else {
                                        str2 = null;
                                    }
                                    String str8 = trustElement.title;
                                    StableHolder stableHolder = new StableHolder(trustElement.icon);
                                    Icon icon = trustElement.arcade_small_icon;
                                    arrayList5.add(new TrustElementWidget(str2, str8, stableHolder, trustElement.enabled, icon != null ? icon.arcade_id : null));
                                }
                                arrayList.add(new GenericProfileElementViewModel.TrustIndicatorsWidget(arrayList5));
                                break;
                            }
                        }
                    }
                    list3 = null;
                    if (list3 != null) {
                        List<GenericProfileElement.TrustElement> list52 = list3;
                        ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                        while (r6.hasNext()) {
                        }
                        arrayList.add(new GenericProfileElementViewModel.TrustIndicatorsWidget(arrayList52));
                    }
                    break;
                case 6:
                    if (localTextsKt != null) {
                        GenericProfileElement$Element$TextElement genericProfileElement$Element$TextElement = localTextsKt instanceof GenericProfileElement$Element$TextElement ? (GenericProfileElement$Element$TextElement) localTextsKt : null;
                        if (genericProfileElement$Element$TextElement != null) {
                            textElement = genericProfileElement$Element$TextElement.value;
                        }
                    }
                    textElement.getClass();
                    String str9 = textElement.text;
                    str9.getClass();
                    arrayList.add(new GenericProfileElementViewModel.TextWidget(str9));
                    break;
            }
            i = i7;
        }
    }
}
