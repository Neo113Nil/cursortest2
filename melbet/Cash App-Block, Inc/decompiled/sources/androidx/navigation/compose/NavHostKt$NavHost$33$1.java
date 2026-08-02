package androidx.navigation.compose;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.icu.text.MessageFormat;
import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotMapKeySet;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.graphics.shapes.RoundedPolygonKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.backend.CartBuilder;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzid;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.presenters.GpsLocationConsentBlockerPresenter;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2$CustomizationMode$Pattern$STAMP;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.StampResult;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationTooltipShown;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.PersonalizationSparkleReason;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatEnterBackground;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenViewEarnings;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerOpenViewError;
import com.squareup.cash.cdf.earningstracker.Timeframe;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.viewmodels.AvatarViewModel;
import com.squareup.cash.earningstracker.viewmodels.CustomerViewModel;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.viewmodels.HeaderTitle;
import com.squareup.cash.earningstracker.viewmodels.HeroHeaderViewModel;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$NotificationSettings;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$MetroFactory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentManager$PaymentFlow;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AccountSelectorSectionViewModel;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryGroupSectionViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.NotificationSectionViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.presenters.ChatState;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.ManagedAccountKeypadListener;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4;
import com.squareup.cash.wallet.views.InteractiveCardState;
import com.squareup.cash.wallet.views.InteractiveCardState$shimmerAnimation$2;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.CustomerData;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.DailyData;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.MonthlyData;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.YearlyData;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.wire.GrpcStatus;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharedFlow;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$33$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $backStackEntry;
    public final /* synthetic */ Object $composeNavigator;
    public final /* synthetic */ Object $navController;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $transition;
    public final /* synthetic */ Object $visibleEntries$delegate;
    public final /* synthetic */ Object $zIndices;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(UiNotificationSettings uiNotificationSettings, List list, List list2, AccountSettingType$NotificationSettings accountSettingType$NotificationSettings, Continuation continuation, ProfileNotificationsPresenter profileNotificationsPresenter) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.$navController = uiNotificationSettings;
        this.$backStackEntry = list;
        this.$zIndices = list2;
        this.$visibleEntries$delegate = accountSettingType$NotificationSettings;
        this.$composeNavigator = profileNotificationsPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    private final Object invokeSuspend$com$squareup$cash$profile$presenters$notifications$ProfileNotificationsPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj) {
        List list;
        ?? r26;
        NotificationSectionViewModel categoryGroupSectionViewModel;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        Object obj6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) this.$navController;
        List list2 = (List) this.$backStackEntry;
        List list3 = (List) this.$zIndices;
        List list4 = list2;
        ProfileNotificationsPresenter profileNotificationsPresenter = (ProfileNotificationsPresenter) this.$composeNavigator;
        List list5 = uiNotificationSettings.category_preferences;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (!list3.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj7 : list5) {
                String str = ((UiCategoryNotificationPreference) obj7).account_token;
                Object obj8 = linkedHashMap.get(str);
                if (obj8 == null) {
                    obj8 = new ArrayList();
                    linkedHashMap.put(str, obj8);
                }
                ((List) obj8).add(obj7);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List list6 = (List) entry.getValue();
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it.next();
                    if (Intrinsics.areEqual(((FullAccount) obj6).account_id, str2)) {
                        break;
                    }
                }
                FullAccount fullAccount = (FullAccount) obj6;
                if (fullAccount != null) {
                    List list7 = list6;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator it2 = list7.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (CollectionsKt.contains(ProfileNotificationsHelperKt.ACTIVITY_CATEGORIES, ((UiCategoryNotificationPreference) it2.next()).category)) {
                                    arrayList.add(fullAccount);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new SemanticsSortKt$special$$inlined$thenBy$1(profileNotificationsPresenter, 14));
            }
        }
        NotificationSectionPresenter$Factory$Impl notificationSectionPresenter$Factory$Impl = profileNotificationsPresenter.notificationSectionPresenterFactory;
        ProfileScreens.NotificationsScreen notificationsScreen = profileNotificationsPresenter.args;
        String activeAccountToken = PlatformKt.activeAccountToken(profileNotificationsPresenter.sessionManager);
        BetterNavigator.ScreenNavigator screenNavigator = profileNotificationsPresenter.navigator;
        notificationsScreen.getClass();
        list5.getClass();
        SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = notificationSectionPresenter$Factory$Impl.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics = (Analytics) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
        FlowStarter flowStarter = (FlowStarter) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
        androidStringManager.getClass();
        analytics.getClass();
        flowStarter.getClass();
        NotificationSectionPresenter notificationSectionPresenter = new NotificationSectionPresenter(androidStringManager, analytics, flowStarter, notificationsScreen, screenNavigator, list5, activeAccountToken);
        int size = arrayList.size();
        ArrayList arrayList2 = notificationSectionPresenter.preferences;
        if (size > 1) {
            Category buildActivityCategory = ProfileNotificationsHelperKt.buildActivityCategory(list5, profileNotificationsPresenter.stringManager);
            String str3 = androidStringManager.get(R.string.activity_section_title);
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                FullAccount fullAccount2 = (FullAccount) it3.next();
                String str4 = fullAccount2.account_id;
                str4.getClass();
                String str5 = fullAccount2.title;
                str5.getClass();
                boolean z3 = z2;
                String str6 = fullAccount2.cash_tag;
                str6.getClass();
                Avatar avatar = fullAccount2.avatar;
                avatar.getClass();
                StackedAvatarViewModel.Single viewModel = StackedAvatarViewModelKt.toViewModel(avatar);
                Boolean bool = fullAccount2.is_business;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                List list8 = notificationSectionPresenter.categoryPreferences;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj9 : list8) {
                    Iterator it4 = it3;
                    List list9 = list4;
                    String str7 = ((UiCategoryNotificationPreference) obj9).account_token;
                    String str8 = str4;
                    if (str7 != null && str7.equals(fullAccount2.account_id)) {
                        arrayList4.add(obj9);
                    }
                    str4 = str8;
                    it3 = it4;
                    list4 = list9;
                }
                Iterator it5 = it3;
                List list10 = list4;
                String str9 = str4;
                if (!arrayList4.isEmpty()) {
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        if (ProfileNotificationsHelperKt.isOneOrMoreChannelEnabled((UiCategoryNotificationPreference) it6.next())) {
                            z = z3;
                            break;
                        }
                    }
                }
                z = false;
                arrayList3.add(new AccountSelectorSectionViewModel.AccountViewModel(str9, str5, str6, viewModel, booleanValue, z, new BasicShieetScope$$ExternalSyntheticLambda10(11, notificationSectionPresenter, buildActivityCategory, fullAccount2)));
                z2 = z3;
                it3 = it5;
                list4 = list10;
            }
            list = list4;
            r26 = z2;
            categoryGroupSectionViewModel = new AccountSelectorSectionViewModel(str3, arrayList3);
        } else {
            list = list4;
            r26 = 1;
            categoryGroupSectionViewModel = new CategoryGroupSectionViewModel(ProfileNotificationsHelperKt.buildActivityCategories(arrayList2, androidStringManager), androidStringManager.get(R.string.activity_section_title), new ScrollCapture$onScrollCaptureSearch$1(1, notificationSectionPresenter, NotificationSectionPresenter.class, "openCategory", "openCategory(Lcom/squareup/cash/profile/viewmodels/Category;Ljava/lang/String;)V", 0, 4));
        }
        String str10 = androidStringManager.get(R.string.contact_preferences_section_title);
        List list11 = list;
        Iterator it7 = list11.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it7.next();
            if (((ContactMethodType) obj2).aliasType == AliasItem.PHONE) {
                break;
            }
        }
        ContactMethodType contactMethodType = (ContactMethodType) obj2;
        if (contactMethodType == null) {
            contactMethodType = new ContactMethodType(AliasItem.PHONE, EmptyList.INSTANCE, false);
        }
        Iterator it8 = list11.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it8.next();
            if (((ContactMethodType) obj3).aliasType == AliasItem.EMAIL) {
                break;
            }
        }
        ContactMethodType contactMethodType2 = (ContactMethodType) obj3;
        if (contactMethodType2 == null) {
            contactMethodType2 = new ContactMethodType(AliasItem.EMAIL, EmptyList.INSTANCE, false);
        }
        ContactMethodSectionViewModel contactMethodSectionViewModel = new ContactMethodSectionViewModel(contactMethodType, contactMethodType2, str10, new UtilsKt$$ExternalSyntheticLambda0(notificationSectionPresenter, 27));
        String str11 = androidStringManager.get(R.string.account_section_title);
        List list12 = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
        arrayList2.getClass();
        ArrayList arrayList5 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            Object next = it9.next();
            if (CollectionsKt.contains(ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES, ((UiCategoryNotificationPreference) next).category)) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it10 = arrayList5.iterator();
        while (it10.hasNext()) {
            Category channelCategory = ProfileNotificationsHelperKt.toChannelCategory((UiCategoryNotificationPreference) it10.next(), androidStringManager, false);
            if (channelCategory != null) {
                arrayList6.add(channelCategory);
            }
        }
        CategoryGroupSectionViewModel categoryGroupSectionViewModel2 = new CategoryGroupSectionViewModel(arrayList6, str11, new ScrollCapture$onScrollCaptureSearch$1(1, notificationSectionPresenter, NotificationSectionPresenter.class, "openCategory", "openCategory(Lcom/squareup/cash/profile/viewmodels/Category;Ljava/lang/String;)V", 0, 3));
        String str12 = androidStringManager.get(R.string.marketing_section_title);
        Category buildNewsCategory = ProfileNotificationsHelperKt.buildNewsCategory(arrayList2, androidStringManager);
        Iterator it11 = arrayList2.iterator();
        while (true) {
            if (!it11.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it11.next();
            if (((UiCategoryNotificationPreference) obj4).category == NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_CASH_APP_LOCAL) {
                break;
            }
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj4;
        Category channelCategory2 = uiCategoryNotificationPreference != null ? ProfileNotificationsHelperKt.toChannelCategory(uiCategoryNotificationPreference, androidStringManager, false) : null;
        Iterator it12 = arrayList2.iterator();
        while (true) {
            if (!it12.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it12.next();
            if (((UiCategoryNotificationPreference) obj5).category == NotificationCategory.NOTIFICATION_CATEGORY_CASH_APP_TAXES) {
                break;
            }
        }
        UiCategoryNotificationPreference uiCategoryNotificationPreference2 = (UiCategoryNotificationPreference) obj5;
        CategoryGroupSectionViewModel categoryGroupSectionViewModel3 = new CategoryGroupSectionViewModel(ArraysKt___ArraysKt.filterNotNull(new Category[]{buildNewsCategory, channelCategory2, uiCategoryNotificationPreference2 != null ? ProfileNotificationsHelperKt.toChannelCategory(uiCategoryNotificationPreference2, androidStringManager, false) : null}), str12, new ScrollCapture$onScrollCaptureSearch$1(1, notificationSectionPresenter, NotificationSectionPresenter.class, "openCategory", "openCategory(Lcom/squareup/cash/profile/viewmodels/Category;Ljava/lang/String;)V", 0, 5));
        NotificationSectionViewModel[] notificationSectionViewModelArr = new NotificationSectionViewModel[4];
        notificationSectionViewModelArr[0] = contactMethodSectionViewModel;
        notificationSectionViewModelArr[r26] = categoryGroupSectionViewModel2;
        notificationSectionViewModelArr[2] = categoryGroupSectionViewModel;
        notificationSectionViewModelArr[3] = categoryGroupSectionViewModel3;
        profileNotificationsPresenter.viewModel$delegate.setValue(new ProfileNotificationsViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) notificationSectionViewModelArr), null));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$support$chat$presenters$ChatPresenter$models$3$1(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        Conversation.BotStatus botStatus;
        Conversation.BotStatus botStatus2;
        MutableState mutableState = (MutableState) this.$zIndices;
        MutableState mutableState2 = (MutableState) this.$backStackEntry;
        ChatPresenter chatPresenter = (ChatPresenter) this.$transition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState3 = (MutableState) this.$navController;
        String str = ChatPresenter.ALLOWED_FILE_MIME_TYPES_REGEX;
        if (!((Boolean) mutableState3.getValue()).booleanValue()) {
            Instant instant = (Instant) mutableState2.getValue();
            if (instant != null) {
                RealObservabilityManager realObservabilityManager = chatPresenter.observabilityManager;
                long epochMilli = instant.toEpochMilli() * 1000;
                Conversation conversation = (Conversation) mutableState.getValue();
                if (conversation == null || (botStatus2 = conversation.botStatus) == null) {
                    botStatus2 = Conversation.BotStatus.UNKNOWN;
                }
                SpanTracking.spanEnded$default(RealObservabilityManager.startTrackingSpan$default(realObservabilityManager, UUID.randomUUID().toString(), "receive_new_support_chat_messages", null, Long.valueOf(epochMilli), 4), MapsKt__MapsKt.mapOf(new Pair("end_kind", "background"), new Pair("bot_status", botStatus2.toString())), 1);
                mutableState2.setValue(null);
            }
            Analytics analytics = chatPresenter.analytics;
            String str2 = chatPresenter.args.flowToken;
            booleanValue = ((Boolean) ((State) this.$visibleEntries$delegate).getValue()).booleanValue();
            Boolean valueOf = Boolean.valueOf(booleanValue);
            booleanValue2 = ((Boolean) ((MutableState) this.$composeNavigator).getValue()).booleanValue();
            Boolean valueOf2 = Boolean.valueOf(booleanValue2);
            Conversation conversation2 = (Conversation) mutableState.getValue();
            analytics.track(new CustomerSupportChatEnterBackground(str2, valueOf, valueOf2, (conversation2 == null || (botStatus = conversation2.botStatus) == null) ? null : RoundedPolygonKt.access$toChatBotStatus(botStatus)), null);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$AmountKeypadContent$1$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        KeypadAmount keypadAmount = (KeypadAmount) this.$transition;
        keypadAmount.onAmountChangedListener = new ManagedAccountKeypadListener((AmountDisplayState) this.$zIndices, (Shaker) this.$visibleEntries$delegate, (RealCashVibrator) this.$composeNavigator, 2);
        RecurringReloadConfigurationViewModel.Keypad keypad = (RecurringReloadConfigurationViewModel.Keypad) this.$navController;
        keypadAmount.maxAmountCents = keypad.getMaxAmountCents();
        keypadAmount.setRawAmount(((MoneyFormatter) this.$backStackEntry).format(keypad.getCurrentAmount()));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$transition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) this.$navController;
        Object value = sharedCardTransitionState.rotation.getValue();
        MutableState mutableState = (MutableState) this.$backStackEntry;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$zIndices;
        Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
        mutableState.setValue((Quat) value);
        JobKt.launch$default(coroutineScope, null, null, new Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1(ref$ObjectRef, mutableState, null, 1), 3);
        return JobKt.launch$default(coroutineScope, null, null, new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2(sharedCardTransitionState, (MutableState) this.$visibleEntries$delegate, (MutableState) this.$composeNavigator, null), 3);
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$6$4$2(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$transition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InteractiveCardState interactiveCardState = (InteractiveCardState) this.$backStackEntry;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 4), 3);
        JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 5), 3);
        JobKt.launch$default(coroutineScope, null, null, new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 6), 3);
        JobKt.launch$default(coroutineScope, null, null, new Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4(interactiveCardState, (State) this.$visibleEntries$delegate, (State) this.$zIndices, continuation, 1), 3);
        CardScene cardScene = (CardScene) this.$navController;
        if (cardScene != null) {
            JobKt.launch$default(coroutineScope, null, null, new TakeUntil$collectSafely$2(cardScene, (State) this.$composeNavigator, continuation, 8), 3);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$Hero3DCardViewKt$InteractiveCard$12$1$4$2$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$transition;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState = (MutableState) this.$backStackEntry;
        CardModelView cardModelView = (CardModelView) this.$navController;
        Quat quat = cardModelView.cardRotation;
        float[] fArr = Hero3DCardViewKt.X_AXIS;
        mutableState.setValue(quat);
        JobKt.launch$default(coroutineScope, null, null, new Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1((Ref$ObjectRef) this.$zIndices, mutableState, null, 0), 3);
        return JobKt.launch$default(coroutineScope, null, null, new CardAppletWorker$setup$1$2$1(cardModelView, (MutableState) this.$visibleEntries$delegate, (MutableState) this.$composeNavigator, null, 13), 3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$zIndices;
        Object obj3 = this.$composeNavigator;
        Object obj4 = this.$navController;
        Object obj5 = this.$visibleEntries$delegate;
        Object obj6 = this.$backStackEntry;
        switch (i) {
            case 0:
                return new NavHostKt$NavHost$33$1((Transition) this.$transition, (NavHostController) obj4, (NavBackStackEntry) obj6, (MutableObjectFloatMap) obj2, (State) obj5, (ComposeNavigator) obj3, continuation, 0);
            case 1:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1((LocationMenu) obj4, (MutableState) obj6, (MutableState) obj2, (LocalBrandProfilePresenter) obj5, (CartBuilder) obj3, continuation, 1);
                navHostKt$NavHost$33$1.$transition = obj;
                return navHostKt$NavHost$33$1;
            case 2:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$12 = new NavHostKt$NavHost$33$1((Function1) obj4, (EducationalSheetModelList) obj6, (PagerState) obj2, (ParcelableSnapshotMutableIntState) obj5, (MutableState) obj3, continuation, 2);
                navHostKt$NavHost$33$12.$transition = obj;
                return navHostKt$NavHost$33$12;
            case 3:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$13 = new NavHostKt$NavHost$33$1((GpsLocationConsentBlockerPresenter) obj4, (MutableState) obj6, (MutableState) obj2, (MutableState) obj5, (MutableState) obj3, continuation, 3);
                navHostKt$NavHost$33$13.$transition = obj;
                return navHostKt$NavHost$33$13;
            case 4:
                return new NavHostKt$NavHost$33$1((CardStudioViewModelV2.Content) this.$transition, (PatternStampState) obj4, (Function1) obj6, (MutableState) obj2, (MutableState) obj5, (StampState) obj3, continuation, 4);
            case 5:
                return new NavHostKt$NavHost$33$1(this.$transition, obj4, obj6, (MutableState) obj2, (MutableState) obj3, (State) obj5, continuation, 5);
            case 6:
                return new NavHostKt$NavHost$33$1((HeaderTitle.EarningsCounterTitle) this.$transition, (CoroutineScope) obj4, (Animatable) obj6, (Function0) obj2, (Animatable) obj5, (Animatable) obj3, continuation, 6);
            case 7:
                return new NavHostKt$NavHost$33$1((FidesmoProvisioningViewModel) this.$transition, (Activity) obj4, (MutableState) obj6, this.$zIndices, (FidesmoDeprovisioningPresenter) obj5, (Set) obj3, continuation, 7);
            case 8:
                return new NavHostKt$NavHost$33$1((FidesmoProvisioningViewModel) this.$transition, (Activity) obj4, (MutableState) obj6, this.$zIndices, (FidesmoProvisioningPresenter) obj5, (Set) obj3, continuation, 8);
            case 9:
                return new NavHostKt$NavHost$33$1(this.$transition, obj4, obj6, (MutableState) obj2, (MutableState) obj3, (State) obj5, continuation, 9);
            case 10:
                return new NavHostKt$NavHost$33$1((String) this.$transition, (MutableState) obj4, (MutableState) obj6, (String) obj2, (String) obj5, (MutableState) obj3, continuation, 10);
            case 11:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$14 = new NavHostKt$NavHost$33$1((InvestingSearchPresenter) obj4, (MutableState) obj6, (ColorModel) obj2, (MutableState) obj5, (MutableState) obj3, continuation, 11);
                navHostKt$NavHost$33$14.$transition = obj;
                return navHostKt$NavHost$33$14;
            case 12:
                return new NavHostKt$NavHost$33$1((MainPaymentPresenter) this.$transition, (MutableState) obj4, (State) obj5, (MutableState) obj6, (MutableState) obj2, (MutableState) obj3, continuation);
            case 13:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$15 = new NavHostKt$NavHost$33$1((SnapshotStateSet) obj4, (SnapshotStateMap) obj6, (SnapshotStateMap) obj2, (CardLockPresenter) obj5, (SnapshotStateSet) obj3, continuation, 13);
                navHostKt$NavHost$33$15.$transition = obj;
                return navHostKt$NavHost$33$15;
            case 14:
                return new NavHostKt$NavHost$33$1(this.$transition, obj4, obj6, obj2, obj5, obj3, continuation, 14);
            case 15:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$16 = new NavHostKt$NavHost$33$1((UiNotificationSettings) obj4, (List) obj6, (List) obj2, (AccountSettingType$NotificationSettings) obj5, continuation, (ProfileNotificationsPresenter) obj3);
                navHostKt$NavHost$33$16.$transition = obj;
                return navHostKt$NavHost$33$16;
            case 16:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$17 = new NavHostKt$NavHost$33$1((String) obj4, (ChatState) obj6, continuation, (ChatPresenter) obj2, (MutableState) obj5, (MutableState) obj3);
                navHostKt$NavHost$33$17.$transition = obj;
                return navHostKt$NavHost$33$17;
            case 17:
                return new NavHostKt$NavHost$33$1((ChatPresenter) this.$transition, (MutableState) obj4, (MutableState) obj6, (MutableState) obj2, (State) obj5, (MutableState) obj3, continuation, 17);
            case 18:
                return new NavHostKt$NavHost$33$1((KeypadAmount) this.$transition, (MoneyFormatter) obj4, (AddMoneyViewModel.Keypad) obj6, (AmountDisplayState) obj2, (Shaker) obj5, (RealCashVibrator) obj3, continuation, 18);
            case 19:
                return new NavHostKt$NavHost$33$1((MoneyFormatter) this.$transition, (WithdrawViewModel.ManagedAccountAmountEntry) obj4, (KeypadAmount) obj6, (AmountDisplayState) obj2, (RealCashVibrator) obj5, (Shaker) obj3, continuation, 19);
            case 20:
                return new NavHostKt$NavHost$33$1((KeypadAmount) this.$transition, (RecurringReloadConfigurationViewModel.Keypad) obj4, (MoneyFormatter) obj6, (AmountDisplayState) obj2, (Shaker) obj5, (RealCashVibrator) obj3, continuation, 20);
            case 21:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$18 = new NavHostKt$NavHost$33$1((CardRegistry.SharedCardTransitionState) obj4, (MutableState) obj6, (Ref$ObjectRef) obj2, (MutableState) obj5, (MutableState) obj3, continuation, 21);
                navHostKt$NavHost$33$18.$transition = obj;
                return navHostKt$NavHost$33$18;
            case 22:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$19 = new NavHostKt$NavHost$33$1((CardScene) obj4, (InteractiveCardState) obj6, (State) obj5, (State) obj2, (State) obj3, continuation);
                navHostKt$NavHost$33$19.$transition = obj;
                return navHostKt$NavHost$33$19;
            case 23:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$110 = new NavHostKt$NavHost$33$1((CardModelView) obj4, (MutableState) obj6, (Ref$ObjectRef) obj2, (MutableState) obj5, (MutableState) obj3, continuation, 23);
                navHostKt$NavHost$33$110.$transition = obj;
                return navHostKt$NavHost$33$110;
            default:
                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$111 = new NavHostKt$NavHost$33$1((SharedFlow) obj6, (Activity) obj2, (RealWebSocket$connect$1) obj5, (NavHostController) obj4, (Function1) obj3, continuation);
                navHostKt$NavHost$33$111.$transition = obj;
                return navHostKt$NavHost$33$111;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((NavHostKt$NavHost$33$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09b0 A[LOOP:6: B:244:0x09aa->B:246:0x09b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocationMenu locationMenu;
        boolean z;
        CurrencyCode currencyCode;
        boolean z2;
        HeroHeaderViewModel heroHeaderViewModel;
        MutableState mutableState;
        Integer num;
        boolean z3;
        ArrayList arrayList;
        List list;
        Iterator it;
        Money money;
        Long l;
        List list2;
        String str;
        Money money2;
        Long l2;
        String str2;
        Integer num2;
        Money money3;
        Long l3;
        AnnotatedString.Builder builder;
        int pushStyle;
        boolean z4;
        boolean booleanValue;
        int i = this.$r8$classId;
        Object obj2 = this.$composeNavigator;
        Object obj3 = this.$visibleEntries$delegate;
        Object obj4 = this.$zIndices;
        Object obj5 = this.$navController;
        Object obj6 = this.$backStackEntry;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Transition transition = (Transition) this.$transition;
                Object currentState = transition.transitionState.getCurrentState();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
                if (Intrinsics.areEqual(currentState, parcelableSnapshotMutableState.getValue()) && (((NavBackStackEntry) ((NavHostController) obj5).impl.backQueue.lastOrNull()) == null || Intrinsics.areEqual(parcelableSnapshotMutableState.getValue(), (NavBackStackEntry) obj6))) {
                    ComposeNavigator composeNavigator = (ComposeNavigator) obj2;
                    Iterator it2 = ((List) ((State) obj3).getValue()).iterator();
                    while (it2.hasNext()) {
                        composeNavigator.getState().markTransitionComplete((NavBackStackEntry) it2.next());
                    }
                    MutableObjectFloatMap mutableObjectFloatMap = (MutableObjectFloatMap) obj4;
                    long[] jArr = mutableObjectFloatMap.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                long j2 = j;
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j2 & 255) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        Object obj7 = mutableObjectFloatMap.keys[i5];
                                        float f = mutableObjectFloatMap.values[i5];
                                        if (!Intrinsics.areEqual((String) obj7, ((NavBackStackEntry) parcelableSnapshotMutableState.getValue()).id)) {
                                            mutableObjectFloatMap._size--;
                                            long[] jArr2 = mutableObjectFloatMap.metadata;
                                            int i6 = mutableObjectFloatMap._capacity;
                                            int i7 = i5 >> 3;
                                            int i8 = (i5 & 7) << 3;
                                            long j3 = (jArr2[i7] & (~(255 << i8))) | (254 << i8);
                                            jArr2[i7] = j3;
                                            jArr2[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j3;
                                            mutableObjectFloatMap.keys[i5] = null;
                                            j2 >>= 8;
                                        }
                                    }
                                    j2 >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState2 = (MutableState) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState3 = (MutableState) obj6;
                if (LocalBrandProfilePresenter.models$lambda$9(mutableState3) == null || LocalBrandProfilePresenter.models$lambda$4(mutableState2) == null || (locationMenu = (LocationMenu) obj5) == null) {
                    return Unit.INSTANCE;
                }
                JobKt.launch$default(coroutineScope, null, null, new MoleculeKt$immediateClockFlow$1$1$1((LocalBrandProfilePresenter) obj3, (CartBuilder) obj2, locationMenu, mutableState3, mutableState2, null, 5), 3);
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                ((Function1) obj5).invoke(new EducationalSheetEvent.PageSeen(parcelableSnapshotMutableIntState.getIntValue()));
                ((MutableState) obj2).setValue(((EducationalSheetModel) ((EducationalSheetModelList) obj6).sheets.get(parcelableSnapshotMutableIntState.getIntValue())).primaryButton);
                PagerState pagerState = (PagerState) obj4;
                if (parcelableSnapshotMutableIntState.getIntValue() == ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue()) {
                    return Unit.INSTANCE;
                }
                JobKt.launch$default(coroutineScope2, null, null, new ZiplineLoader$ModuleJob$run$3(pagerState, parcelableSnapshotMutableIntState, null, 22), 3);
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = (GpsLocationConsentBlockerPresenter) obj5;
                JobKt.launch$default(coroutineScope3, null, null, new SetNamePresenter$models$1$1$1(gpsLocationConsentBlockerPresenter, (MutableState) obj6, (MutableState) obj4, (MutableState) obj3, null, 18), 3);
                JobKt.launch$default(coroutineScope3, null, null, new SsnPresenter$models$2$2(gpsLocationConsentBlockerPresenter, (MutableState) obj2, null, 17), 3);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) this.$transition;
                StampResult stampResult = content.pendingStampResult;
                if (stampResult != null) {
                    PatternStampState patternStampState = (PatternStampState) obj5;
                    Function1 function1 = (Function1) obj6;
                    MutableState mutableState4 = (MutableState) obj4;
                    MutableState mutableState5 = (MutableState) obj3;
                    StampState stampState = (StampState) obj2;
                    Collection collection = stampResult.svgStamps;
                    if (collection == null) {
                        collection = EmptyList.INSTANCE;
                    }
                    if (!collection.isEmpty()) {
                        if (content.customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP) {
                            ArrayList arrayList2 = new ArrayList();
                            Collection<Stamp> collection2 = collection;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
                            for (Stamp stamp : collection2) {
                                Integer num3 = stamp.min_scale;
                                num3.getClass();
                                arrayList2.add(num3);
                                String str3 = stamp.name;
                                str3.getClass();
                                String str4 = stamp.svg;
                                str4.getClass();
                                arrayList3.add(new com.squareup.cardcustomizations.stampview.Stamp(str3, str4));
                            }
                            patternStampState.originalStamps$delegate.setValue(arrayList3);
                            patternStampState.originalMinScales$delegate.setValue(arrayList2);
                            if (patternStampState.boxWidth$delegate.getIntValue() > 0 && patternStampState.boxHeight$delegate.getIntValue() > 0) {
                                patternStampState.generateStampsFromOriginals();
                            }
                        } else {
                            int i9 = CardStudioViewV2Kt.$r8$clinit;
                            int floatValue = (int) ((((Number) mutableState5.getValue()).floatValue() + ((PointF) mutableState4.getValue()).x) / ((Number) mutableState5.getValue()).floatValue());
                            int i10 = floatValue < 1 ? 1 : floatValue;
                            int i11 = 0;
                            for (Object obj8 : CollectionsKt.reversed(collection)) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                Stamp stamp2 = (Stamp) obj8;
                                String str5 = stamp2.name;
                                str5.getClass();
                                String str6 = stamp2.svg;
                                str6.getClass();
                                com.squareup.cardcustomizations.stampview.Stamp stamp3 = new com.squareup.cardcustomizations.stampview.Stamp(str5, str6);
                                Integer num4 = stamp2.min_scale;
                                num4.getClass();
                                int intValue = num4.intValue();
                                float floatValue2 = ((PointF) mutableState4.getValue()).x - (((Number) mutableState5.getValue()).floatValue() * (i11 % i10));
                                float floatValue3 = ((PointF) mutableState4.getValue()).y - (((Number) mutableState5.getValue()).floatValue() * (i11 / i10));
                                stampState.addStamp(stamp3, new RectF(floatValue2, floatValue3, ((Number) mutableState5.getValue()).floatValue() + floatValue2, ((Number) mutableState5.getValue()).floatValue() + floatValue3), intValue);
                                i11 = i12;
                            }
                        }
                    }
                    function1.invoke(CardStudioViewEventV2.ClearPendingStampResult.INSTANCE);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EarningsTrackerDataResult earningsTrackerDataResult = (EarningsTrackerDataResult) ((MutableState) this.$transition).getValue();
                if (earningsTrackerDataResult != null) {
                    TransfersPresenter transfersPresenter = (TransfersPresenter) obj5;
                    EarningsTrackerScreen earningsTrackerScreen = (EarningsTrackerScreen) transfersPresenter.router;
                    RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) transfersPresenter.args;
                    MutableState mutableState6 = (MutableState) obj6;
                    MutableState mutableState7 = (MutableState) obj4;
                    MutableState mutableState8 = (MutableState) obj2;
                    State state = (State) obj3;
                    if (earningsTrackerDataResult instanceof EarningsTrackerDataResult.Loading) {
                        mutableState8.setValue(new EarningsTrackerViewModel.Loading(transfersPresenter.createFilterBarViewModel((Long) mutableState6.getValue(), (DateFilter) mutableState7.getValue())));
                    } else if (earningsTrackerDataResult instanceof EarningsTrackerDataResult.Success) {
                        Long l4 = (Long) mutableState6.getValue();
                        if (l4 != null) {
                            long longValue = l4.longValue();
                            EarningsTrackerEntrypoint earningsTrackerEntrypoint = earningsTrackerScreen.entrypoint;
                            DateFilter dateFilter = (DateFilter) mutableState7.getValue();
                            earningsTrackerEntrypoint.getClass();
                            dateFilter.getClass();
                            Triple analyticsTimeframeData = zzhx.toAnalyticsTimeframeData(dateFilter);
                            realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerOpenViewEarnings(earningsTrackerEntrypoint, (Timeframe) analyticsTimeframeData.first, (Integer) analyticsTimeframeData.second, (Integer) analyticsTimeframeData.third), null);
                            EarningsTrackerDataResult.Success success = (EarningsTrackerDataResult.Success) earningsTrackerDataResult;
                            Long l5 = new Long(longValue);
                            DateFilter dateFilter2 = (DateFilter) mutableState7.getValue();
                            boolean booleanValue2 = ((Boolean) state.getValue()).booleanValue();
                            MoneyFormatter moneyFormatter = (MoneyFormatter) transfersPresenter.blockersHelper;
                            EarningsTrackerDataResponse earningsTrackerDataResponse = success.earnings;
                            Money money4 = earningsTrackerDataResponse.total_earnings;
                            Integer num5 = earningsTrackerDataResponse.number_of_ttp_transactions;
                            money4.getClass();
                            String format2 = moneyFormatter.format(money4);
                            if (!booleanValue2) {
                                num5.getClass();
                                if (num5.intValue() <= 0) {
                                    z = false;
                                    money4.getClass();
                                    currencyCode = money4.currency_code;
                                    if (currencyCode == null) {
                                        currencyCode = CurrencyCode.USD;
                                    }
                                    HeaderTitle.EarningsCounterTitle earningsCounterTitle = new HeaderTitle.EarningsCounterTitle(money4, Moneys.symbol(currencyCode), true);
                                    Trend trend = earningsTrackerDataResponse.trend;
                                    HeroHeaderViewModel heroHeaderViewModel2 = new HeroHeaderViewModel(earningsCounterTitle, trend == null ? transfersPresenter.toHeaderSubtitle(trend) : null, success.refreshFailed);
                                    Long l6 = 0L;
                                    EglCore eglCore = (EglCore) transfersPresenter.accountFormatter;
                                    StoryQueries$$ExternalSyntheticLambda0 storyQueries$$ExternalSyntheticLambda0 = (StoryQueries$$ExternalSyntheticLambda0) eglCore.eglConfig;
                                    AndroidStringManager androidStringManager = (AndroidStringManager) eglCore.eglDisplay;
                                    MoneyFormatter moneyFormatter2 = (MoneyFormatter) eglCore.eglContext;
                                    z2 = dateFilter2 instanceof DateFilter.Monthly;
                                    int i13 = 7;
                                    int i14 = 3;
                                    String str7 = " ";
                                    if (z2) {
                                        heroHeaderViewModel = heroHeaderViewModel2;
                                        mutableState = mutableState8;
                                        num = num5;
                                        z3 = z2;
                                        if (dateFilter2 instanceof DateFilter.Yearly) {
                                            List list3 = earningsTrackerDataResponse.monthly_data;
                                            list3.getClass();
                                            int i15 = 0;
                                            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 3, 6, 9});
                                            List list4 = list3;
                                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                            Iterator it3 = list4.iterator();
                                            while (it3.hasNext()) {
                                                Object next = it3.next();
                                                int i16 = i15 + 1;
                                                if (i15 < 0) {
                                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                    throw null;
                                                }
                                                MonthlyData monthlyData = (MonthlyData) next;
                                                Integer num6 = monthlyData.month;
                                                Iterator it4 = it3;
                                                Money money5 = monthlyData.earnings;
                                                num6.getClass();
                                                String str8 = (String) storyQueries$$ExternalSyntheticLambda0.invoke(num6);
                                                boolean contains = listOf.contains(Integer.valueOf(i15));
                                                String str9 = str8 + str7 + monthlyData.year;
                                                if (money5 == null) {
                                                    list2 = listOf;
                                                    str = str7;
                                                    money2 = new Money(l6, (CurrencyCode) null, 6);
                                                } else {
                                                    list2 = listOf;
                                                    str = str7;
                                                    money2 = money5;
                                                }
                                                String format3 = moneyFormatter2.format(money2);
                                                String take = StringsKt___StringsKt.take(i14, str8);
                                                long longValue2 = (money5 == null || (l2 = money5.amount) == null) ? 0L : l2.longValue();
                                                EarningsBarViewModel.Color access$toColor = zzid.access$toColor(money5);
                                                format3.getClass();
                                                Resources resources = androidStringManager.resources;
                                                resources.getClass();
                                                String format4 = new MessageFormat(resources.getString(R.string.non_monthly_earnings_graph_bar_content_description)).format(new Object[]{format3, str9});
                                                format4.getClass();
                                                arrayList4.add(new EarningsBarViewModel(take, contains, longValue2, access$toColor, str9, format3, format4));
                                                it3 = it4;
                                                i15 = i16;
                                                listOf = list2;
                                                str7 = str;
                                                i14 = 3;
                                            }
                                            arrayList = arrayList4;
                                        } else {
                                            if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            List list5 = earningsTrackerDataResponse.yearly_data;
                                            list5.getClass();
                                            List list6 = list5;
                                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                            Iterator it5 = list6.iterator();
                                            int i17 = 0;
                                            while (it5.hasNext()) {
                                                Object next2 = it5.next();
                                                int i18 = i17 + 1;
                                                if (i17 < 0) {
                                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                    throw null;
                                                }
                                                YearlyData yearlyData = (YearlyData) next2;
                                                Money money6 = yearlyData.earnings;
                                                Integer num7 = yearlyData.year;
                                                if (money6 == null) {
                                                    list = list5;
                                                    it = it5;
                                                    money = new Money(l6, (CurrencyCode) null, 6);
                                                } else {
                                                    list = list5;
                                                    it = it5;
                                                    money = money6;
                                                }
                                                String format5 = moneyFormatter2.format(money);
                                                num7.getClass();
                                                String valueOf = String.valueOf(num7.intValue());
                                                Long l7 = l6;
                                                int i19 = i13;
                                                String concat = list.size() > i19 ? "‘".concat(StringsKt___StringsKt.takeLast(2, String.valueOf(num7.intValue()))) : String.valueOf(num7);
                                                boolean z5 = list.size() < i19 || i17 % 3 == 0;
                                                long longValue3 = (money6 == null || (l = money6.amount) == null) ? 0L : l.longValue();
                                                EarningsBarViewModel.Color access$toColor2 = zzid.access$toColor(money6);
                                                format5.getClass();
                                                valueOf.getClass();
                                                Resources resources2 = androidStringManager.resources;
                                                resources2.getClass();
                                                String format6 = new MessageFormat(resources2.getString(R.string.non_monthly_earnings_graph_bar_content_description)).format(new Object[]{format5, valueOf});
                                                format6.getClass();
                                                arrayList.add(new EarningsBarViewModel(concat, z5, longValue3, access$toColor2, valueOf, format5, format6));
                                                i17 = i18;
                                                list5 = list;
                                                it5 = it;
                                                l6 = l7;
                                                i13 = 7;
                                            }
                                        }
                                    } else {
                                        List list7 = earningsTrackerDataResponse.daily_data;
                                        list7.getClass();
                                        heroHeaderViewModel = heroHeaderViewModel2;
                                        num = num5;
                                        z3 = z2;
                                        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 7, 14, 21, 28});
                                        List list8 = list7;
                                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                        Iterator it6 = list8.iterator();
                                        while (it6.hasNext()) {
                                            DailyData dailyData = (DailyData) it6.next();
                                            Integer num8 = dailyData.date;
                                            Iterator it7 = it6;
                                            Money money7 = dailyData.earnings;
                                            num8.getClass();
                                            boolean contains2 = listOf2.contains(num8);
                                            List list9 = listOf2;
                                            Integer num9 = dailyData.month;
                                            num9.getClass();
                                            MutableState mutableState9 = mutableState8;
                                            String str10 = storyQueries$$ExternalSyntheticLambda0.invoke(num9) + " " + num8 + ", " + dailyData.year;
                                            if (money7 == null) {
                                                num2 = num8;
                                                money3 = new Money(l6, (CurrencyCode) null, 6);
                                            } else {
                                                num2 = num8;
                                                money3 = money7;
                                            }
                                            String format7 = moneyFormatter2.format(money3);
                                            String valueOf2 = String.valueOf(num2.intValue());
                                            long longValue4 = (money7 == null || (l3 = money7.amount) == null) ? 0L : l3.longValue();
                                            EarningsBarViewModel.Color access$toColor3 = zzid.access$toColor(money7);
                                            format7.getClass();
                                            Resources resources3 = androidStringManager.resources;
                                            resources3.getClass();
                                            String format8 = new MessageFormat(resources3.getString(R.string.monthly_earnings_graph_bar_content_description)).format(new Object[]{format7, str10});
                                            format8.getClass();
                                            arrayList.add(new EarningsBarViewModel(valueOf2, contains2, longValue4, access$toColor3, str10, format7, format8));
                                            it6 = it7;
                                            listOf2 = list9;
                                            mutableState8 = mutableState9;
                                        }
                                        mutableState = mutableState8;
                                    }
                                    AndroidStringManager androidStringManager2 = transfersPresenter.stringManager;
                                    Resources resources4 = androidStringManager2.resources;
                                    if (!z3) {
                                        DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter2;
                                        String format9 = YearMonth.of(monthly.year, monthly.month).format(DateTimeFormatter.ofPattern("MMMM yyyy", Locale.US));
                                        format9.getClass();
                                        resources4.getClass();
                                        str2 = new MessageFormat(resources4.getString(R.string.monthly_earnings_graph_content_description)).format(new Object[]{format9});
                                        str2.getClass();
                                    } else if (dateFilter2 instanceof DateFilter.Yearly) {
                                        String format10 = Year.of(((DateFilter.Yearly) dateFilter2).year).format(DateTimeFormatter.ofPattern("yyyy", Locale.US));
                                        format10.getClass();
                                        resources4.getClass();
                                        str2 = new MessageFormat(resources4.getString(R.string.yearly_earnings_graph_content_description)).format(new Object[]{format10});
                                        str2.getClass();
                                    } else {
                                        if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str2 = androidStringManager2.get(R.string.all_time_earnings_graph_content_description);
                                    }
                                    Money money8 = earningsTrackerDataResponse.processing_fees;
                                    money8.getClass();
                                    String format11 = moneyFormatter.format(money8);
                                    Money money9 = earningsTrackerDataResponse.net_earnings;
                                    money9.getClass();
                                    String format12 = moneyFormatter.format(money9);
                                    Integer num10 = earningsTrackerDataResponse.number_of_cash_app_transactions;
                                    num10.getClass();
                                    int intValue2 = num10.intValue();
                                    num.getClass();
                                    int intValue3 = num.intValue();
                                    DateFilterBarViewModel createFilterBarViewModel = transfersPresenter.createFilterBarViewModel(l5, dateFilter2);
                                    List<CustomerData> list10 = earningsTrackerDataResponse.customer_data;
                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                                    for (CustomerData customerData : list10) {
                                        String str11 = customerData.customer_token;
                                        String str12 = customerData.cashtag;
                                        str11.getClass();
                                        str12.getClass();
                                        Integer num11 = customerData.sales;
                                        num11.getClass();
                                        int intValue4 = num11.intValue();
                                        Money money10 = customerData.sales_amount;
                                        money10.getClass();
                                        String format13 = moneyFormatter.format(money10);
                                        String str13 = customerData.photo;
                                        Character monogram = GrpcStatus.Companion.monogram(str12.substring(1));
                                        String str14 = customerData.customer_token;
                                        str14.getClass();
                                        arrayList5.add(new CustomerViewModel(str11, str12, intValue4, format13, new AvatarViewModel(str13, monogram, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, str14, null, null, null))))));
                                    }
                                    mutableState.setValue(new EarningsTrackerViewModel.Loaded(heroHeaderViewModel, format2, arrayList, str2, format11, format12, intValue2, intValue3, z, arrayList5, createFilterBarViewModel));
                                }
                            }
                            z = true;
                            money4.getClass();
                            currencyCode = money4.currency_code;
                            if (currencyCode == null) {
                            }
                            HeaderTitle.EarningsCounterTitle earningsCounterTitle2 = new HeaderTitle.EarningsCounterTitle(money4, Moneys.symbol(currencyCode), true);
                            Trend trend2 = earningsTrackerDataResponse.trend;
                            HeroHeaderViewModel heroHeaderViewModel22 = new HeroHeaderViewModel(earningsCounterTitle2, trend2 == null ? transfersPresenter.toHeaderSubtitle(trend2) : null, success.refreshFailed);
                            Long l62 = 0L;
                            EglCore eglCore2 = (EglCore) transfersPresenter.accountFormatter;
                            StoryQueries$$ExternalSyntheticLambda0 storyQueries$$ExternalSyntheticLambda02 = (StoryQueries$$ExternalSyntheticLambda0) eglCore2.eglConfig;
                            AndroidStringManager androidStringManager3 = (AndroidStringManager) eglCore2.eglDisplay;
                            MoneyFormatter moneyFormatter22 = (MoneyFormatter) eglCore2.eglContext;
                            z2 = dateFilter2 instanceof DateFilter.Monthly;
                            int i132 = 7;
                            int i142 = 3;
                            String str72 = " ";
                            if (z2) {
                            }
                            AndroidStringManager androidStringManager22 = transfersPresenter.stringManager;
                            Resources resources42 = androidStringManager22.resources;
                            if (!z3) {
                            }
                            Money money82 = earningsTrackerDataResponse.processing_fees;
                            money82.getClass();
                            String format112 = moneyFormatter.format(money82);
                            Money money92 = earningsTrackerDataResponse.net_earnings;
                            money92.getClass();
                            String format122 = moneyFormatter.format(money92);
                            Integer num102 = earningsTrackerDataResponse.number_of_cash_app_transactions;
                            num102.getClass();
                            int intValue22 = num102.intValue();
                            num.getClass();
                            int intValue32 = num.intValue();
                            DateFilterBarViewModel createFilterBarViewModel2 = transfersPresenter.createFilterBarViewModel(l5, dateFilter2);
                            List<CustomerData> list102 = earningsTrackerDataResponse.customer_data;
                            ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list102, 10));
                            while (r1.hasNext()) {
                            }
                            mutableState.setValue(new EarningsTrackerViewModel.Loaded(heroHeaderViewModel, format2, arrayList, str2, format112, format122, intValue22, intValue32, z, arrayList52, createFilterBarViewModel2));
                        }
                    } else {
                        if (!(earningsTrackerDataResult instanceof EarningsTrackerDataResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        EarningsTrackerEntrypoint earningsTrackerEntrypoint2 = earningsTrackerScreen.entrypoint;
                        DateFilter dateFilter3 = (DateFilter) mutableState7.getValue();
                        earningsTrackerEntrypoint2.getClass();
                        dateFilter3.getClass();
                        Triple analyticsTimeframeData2 = zzhx.toAnalyticsTimeframeData(dateFilter3);
                        realEarningsTrackerAnalytics.analytics.track(new EarningsTrackerOpenViewError(earningsTrackerEntrypoint2, (Timeframe) analyticsTimeframeData2.first, (Integer) analyticsTimeframeData2.second, (Integer) analyticsTimeframeData2.third), null);
                        mutableState8.setValue(EarningsTrackerViewModel.LoadingError.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HeaderTitle.EarningsCounterTitle earningsCounterTitle3 = (HeaderTitle.EarningsCounterTitle) this.$transition;
                if (!earningsCounterTitle3.animate) {
                    return Unit.INSTANCE;
                }
                CoroutineScope coroutineScope4 = (CoroutineScope) obj5;
                float f2 = EarningsHeaderKt.subtitleShimmerWidth;
                JobKt.launch$default(coroutineScope4, null, null, new RealIdvPresenter$models$1$1((Animatable) obj6, earningsCounterTitle3, coroutineScope4, (Function0) obj4, (Animatable) obj3, (Animatable) obj2, null, 23), 3);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FidesmoProvisioningViewModel fidesmoProvisioningViewModel = (FidesmoProvisioningViewModel) this.$transition;
                fidesmoProvisioningViewModel.getClass();
                FidesmoShutdownReason fidesmoShutdownReason = fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Success ? FidesmoShutdownReason.SUCCESS_SCREEN_SHOWN : ((fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Error) || (fidesmoProvisioningViewModel instanceof FidesmoProvisioningViewModel.Failed)) ? FidesmoShutdownReason.TERMINAL_ERROR_SCREEN_CLOSED : FidesmoShutdownReason.STREAM_DISPOSED;
                ((MutableState) obj6).setValue(fidesmoShutdownReason);
                if (fidesmoShutdownReason == FidesmoShutdownReason.SUCCESS_SCREEN_SHOWN) {
                    FidesmoDeprovisioningPresenter.access$models$shutdownFidesmo(obj4, (FidesmoDeprovisioningPresenter) obj3, (Set) obj2, (Activity) obj5, fidesmoShutdownReason);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FidesmoProvisioningViewModel fidesmoProvisioningViewModel2 = (FidesmoProvisioningViewModel) this.$transition;
                fidesmoProvisioningViewModel2.getClass();
                FidesmoShutdownReason fidesmoShutdownReason2 = fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Success ? FidesmoShutdownReason.SUCCESS_SCREEN_SHOWN : ((fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Error) || (fidesmoProvisioningViewModel2 instanceof FidesmoProvisioningViewModel.Failed)) ? FidesmoShutdownReason.TERMINAL_ERROR_SCREEN_CLOSED : FidesmoShutdownReason.STREAM_DISPOSED;
                ((MutableState) obj6).setValue(fidesmoShutdownReason2);
                if (fidesmoShutdownReason2 == FidesmoShutdownReason.SUCCESS_SCREEN_SHOWN) {
                    FidesmoProvisioningPresenter.access$models$shutdownFidesmo(obj4, (FidesmoProvisioningPresenter) obj3, (Set) obj2, (Activity) obj5, fidesmoShutdownReason2);
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function12 = (Function1) obj6;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float expandProgress = ((RealSheetState) this.$transition).getExpandProgress();
                MutableFloatState mutableFloatState = (MutableFloatState) obj4;
                float f3 = RecyclerView.DECELERATION_RATE;
                float f4 = expandProgress < 0.5f ? 1.0f - (expandProgress * 2.0f) : 0.0f;
                int i20 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(f4);
                MutableFloatState mutableFloatState2 = (MutableFloatState) obj2;
                if (expandProgress >= 0.5f) {
                    f3 = (expandProgress - 0.5f) * 2.0f;
                }
                ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(f3);
                if (!((Boolean) ((State) obj3).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) obj5;
                if (expandProgress > 0.5d) {
                    if (!(investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.FullScreenContent)) {
                        function12.invoke(InvestingExchangeViewEvent.Expanded.INSTANCE);
                    }
                } else if (!(investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.BottomSheetContent)) {
                    function12.invoke(InvestingExchangeViewEvent.Peeking.INSTANCE);
                }
                return Unit.INSTANCE;
            case 10:
                MutableState mutableState10 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str15 = (String) this.$transition;
                if (str15.length() < 250) {
                    mutableState10.setValue(new AnnotatedString(str15));
                    return Unit.INSTANCE;
                }
                if (((Boolean) ((MutableState) obj6).getValue()).booleanValue()) {
                    String str16 = (String) obj4;
                    builder = new AnnotatedString.Builder();
                    builder.append(str15.concat("\n"));
                    pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.W700, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                    try {
                        builder.append(str16);
                        builder.pop(pushStyle);
                        mutableState10.setValue(builder.toAnnotatedString());
                    } finally {
                    }
                } else {
                    String substring = str15.substring(0, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                    String str17 = (String) obj3;
                    builder = new AnnotatedString.Builder();
                    builder.append(substring.concat("… "));
                    pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.W700, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                    try {
                        builder.append(str17);
                        builder.pop(pushStyle);
                        mutableState10.setValue(builder.toAnnotatedString());
                        ((MutableState) obj2).setValue(Boolean.TRUE);
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) obj5;
                JobKt.launch$default(coroutineScope5, investingSearchPresenter.ioDispatcher, null, new MoneybotChatPresenter$models$6$1(investingSearchPresenter, ((Map) ((MutableState) obj6).getValue()).values(), (ColorModel) obj4, (MutableState) obj3, (MutableState) obj2, (Continuation) null), 2);
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState11 = (MutableState) obj2;
                MutableState mutableState12 = (MutableState) obj4;
                MutableState mutableState13 = (MutableState) obj6;
                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.$transition;
                Analytics analytics = mainPaymentPresenter.analytics;
                RealPersonalizePaymentManager realPersonalizePaymentManager = mainPaymentPresenter.personalizePaymentManager;
                PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState14 = (MutableState) obj5;
                Collection values = ((Map) mutableState14.getValue()).values();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                Iterator it8 = values.iterator();
                while (it8.hasNext()) {
                    arrayList6.add(TextFieldValueKt.toPaymentRecipient((Recipient) it8.next()));
                }
                boolean z6 = Moneys.amount(mainPayment.amountInSelectedCurrency) >= 100;
                boolean z7 = mainPayment.orientation == Orientation.CASH;
                boolean isNetworkAvailable = mainPaymentPresenter.networkInfo.isNetworkAvailable();
                Profile profile = (Profile) ((State) obj3).getValue();
                boolean isPersonalizedPaymentButtonEnabled = UtilsKt.isPersonalizedPaymentButtonEnabled(z6, z7, isNetworkAvailable, arrayList6, profile != null ? profile.region : null);
                PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = (PersonalizePaymentEntrypointButtonViewModel) mutableState13.getValue();
                boolean isEmpty = ((Map) mutableState14.getValue()).values().isEmpty();
                PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow = PersonalizePaymentManager$PaymentFlow.RECIPIENT_SELECTOR;
                Boolean bool = (Boolean) ((Map) realPersonalizePaymentManager.showTooltip.blockingGet()).get("RECIPIENT_SELECTOR");
                boolean booleanValue3 = bool != null ? bool.booleanValue() : true;
                if (!((Map) mutableState14.getValue()).isEmpty() && isPersonalizedPaymentButtonEnabled) {
                    String str18 = (String) mutableState12.getValue();
                    boolean booleanValue4 = ((Boolean) mutableState11.getValue()).booleanValue();
                    str18.getClass();
                    if ((realPersonalizePaymentManager.getAnimationCounter(personalizePaymentManager$PaymentFlow) < 3 && !booleanValue4) || str18.length() > 0) {
                        z4 = true;
                        mutableState13.setValue(personalizePaymentEntrypointButtonViewModel.updateState(isEmpty, isPersonalizedPaymentButtonEnabled, booleanValue3, z4));
                        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState13.getValue()).showTooltip) {
                            realPersonalizePaymentManager.markPersonalizePaymentTooltipAsSeen(personalizePaymentManager$PaymentFlow);
                            analytics.track(new AssetSendPersonalizationTooltipShown(mainPayment.paymentToken.toString(), EntryPoint.AMOUNT_FIRST, mainPaymentPresenter.personalizedPaymentFlowToken), null);
                        }
                        if (((PersonalizePaymentEntrypointButtonViewModel) mutableState13.getValue()).animate) {
                            realPersonalizePaymentManager.updatePersonalizePaymentButtonAnimationTracker(personalizePaymentManager$PaymentFlow);
                            mutableState11.setValue(Boolean.TRUE);
                            boolean z8 = !((Map) mutableState14.getValue()).values().isEmpty();
                            boolean z9 = Moneys.amount(mainPayment.amountInSelectedCurrency) >= 100;
                            String str19 = mainPaymentPresenter.personalizedPaymentFlowToken;
                            int animationCounter = realPersonalizePaymentManager.getAnimationCounter(personalizePaymentManager$PaymentFlow);
                            PersonalizationSparkleReason personalizationSparkleReason = ((String) mutableState12.getValue()).length() > 0 ? PersonalizationSparkleReason.NOTE_TYPED : PersonalizationSparkleReason.FIRST_IMPRESSION;
                            EntryPoint entryPoint = EntryPoint.AMOUNT_FIRST;
                            String uuid = mainPayment.paymentToken.toString();
                            uuid.getClass();
                            AnalyticsHelperKt.trackPersonalizationButtonSparkled(analytics, z8, z9, str19, animationCounter, personalizationSparkleReason, entryPoint, uuid);
                        }
                        return Unit.INSTANCE;
                    }
                }
                z4 = false;
                mutableState13.setValue(personalizePaymentEntrypointButtonViewModel.updateState(isEmpty, isPersonalizedPaymentButtonEnabled, booleanValue3, z4));
                if (((PersonalizePaymentEntrypointButtonViewModel) mutableState13.getValue()).showTooltip) {
                }
                if (((PersonalizePaymentEntrypointButtonViewModel) mutableState13.getValue()).animate) {
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj5;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj6;
                LinkedHashSet union = CollectionsKt.union(snapshotStateSet, snapshotStateMap.keys);
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj4;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj9 : union) {
                    if (!snapshotStateMap2.containsKey((NearbyAdvertisement) obj9)) {
                        arrayList7.add(obj9);
                    }
                }
                Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) it9.next();
                    snapshotStateMap.remove(nearbyAdvertisement);
                    snapshotStateSet.remove(nearbyAdvertisement);
                }
                SnapshotMapKeySet snapshotMapKeySet = snapshotStateMap2.keys;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj10 : snapshotMapKeySet) {
                    NearbyAdvertisement nearbyAdvertisement2 = (NearbyAdvertisement) obj10;
                    if (!snapshotStateMap.keys.map.containsKey(nearbyAdvertisement2) && !snapshotStateSet.contains(nearbyAdvertisement2)) {
                        arrayList8.add(obj10);
                    }
                }
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj6;
                SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) obj2;
                SnapshotStateSet snapshotStateSet3 = (SnapshotStateSet) obj5;
                Iterator it10 = arrayList8.iterator();
                while (it10.hasNext()) {
                    JobKt.launch$default(coroutineScope6, null, null, new PoolsListPresenter$models$2$2(cardLockPresenter, (NearbyAdvertisement) it10.next(), snapshotStateMap3, snapshotStateSet2, snapshotStateSet3, (Continuation) null), 3);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState15 = (MutableState) obj5;
                mutableState15.setValue(Boolean.TRUE);
                ((MutableState) obj2).setValue(PoolsListPresenter.access$buildDisplayableSections((PoolsListPresenter) this.$transition, (List) ((MutableState) obj6).getValue(), (List) ((MutableState) obj4).getValue(), (List) ((MutableState) obj3).getValue()));
                mutableState15.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                return invokeSuspend$com$squareup$cash$profile$presenters$notifications$ProfileNotificationsPresenter$models$$inlined$LaunchedEffectNotNull$1(obj);
            case 16:
                ChatPresenter chatPresenter = (ChatPresenter) obj4;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str20 = (String) obj5;
                ChatState chatState = (ChatState) obj6;
                if (!chatState.initialState) {
                    RealConversationService realConversationService = chatPresenter.conversationService;
                    MessageBody activityItemTransactionBody = chatPresenter.unifiedTransactionPickerEnabled ? new MessageBody.ActivityItemTransactionBody(str20) : new MessageBody.TransactionBody.Selected(str20);
                    String str21 = chatPresenter.args.flowToken;
                    Conversation conversation = chatState.conversation;
                    booleanValue = ((Boolean) ((MutableState) obj3).getValue()).booleanValue();
                    realConversationService.sendMessage(activityItemTransactionBody, str21, conversation, booleanValue);
                    ((MutableState) obj2).setValue(null);
                }
                return Unit.INSTANCE;
            case 17:
                return invokeSuspend$com$squareup$cash$support$chat$presenters$ChatPresenter$models$3$1(obj);
            case 18:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KeypadAmount keypadAmount = (KeypadAmount) this.$transition;
                keypadAmount.onAmountChangedListener = new ManagedAccountKeypadListener((AmountDisplayState) obj4, (Shaker) obj3, (RealCashVibrator) obj2, 1);
                keypadAmount.setRawAmount(((MoneyFormatter) obj5).format(((AddMoneyViewModel.Keypad) obj6).currentAmount));
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String format14 = ((MoneyFormatter) this.$transition).format(((WithdrawViewModel.ManagedAccountAmountEntry) obj5).amountConfig.currentAmount);
                KeypadAmount keypadAmount2 = (KeypadAmount) obj6;
                keypadAmount2.onAmountChangedListener = new ManagedAccountKeypadListener((AmountDisplayState) obj4, (RealCashVibrator) obj3, (Shaker) obj2);
                keypadAmount2.setRawAmount(format14);
                return Unit.INSTANCE;
            case 20:
                return invokeSuspend$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$AmountKeypadContent$1$1(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$6$4$2(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$wallet$views$Hero3DCardViewKt$InteractiveCard$12$1$4$2$1(obj);
            default:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$transition;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FlowKt.launchIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1((SharedFlow) obj6, new WorkflowContextAdapter$updateState$1((Activity) obj4, (RealWebSocket$connect$1) obj3, (NavHostController) obj5, (Function1) obj2, null, 1), 3), coroutineScope7);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(MainPaymentPresenter mainPaymentPresenter, MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.$transition = mainPaymentPresenter;
        this.$navController = mutableState;
        this.$visibleEntries$delegate = state;
        this.$backStackEntry = mutableState2;
        this.$zIndices = mutableState3;
        this.$composeNavigator = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(CardScene cardScene, InteractiveCardState interactiveCardState, State state, State state2, State state3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 22;
        this.$navController = cardScene;
        this.$backStackEntry = interactiveCardState;
        this.$visibleEntries$delegate = state;
        this.$zIndices = state2;
        this.$composeNavigator = state3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$33$1(Object obj, Object obj2, Object obj3, MutableState mutableState, MutableState mutableState2, State state, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transition = obj;
        this.$navController = obj2;
        this.$backStackEntry = obj3;
        this.$zIndices = mutableState;
        this.$composeNavigator = mutableState2;
        this.$visibleEntries$delegate = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$33$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$transition = obj;
        this.$navController = obj2;
        this.$backStackEntry = obj3;
        this.$zIndices = obj4;
        this.$visibleEntries$delegate = obj5;
        this.$composeNavigator = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$33$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$navController = obj;
        this.$backStackEntry = obj2;
        this.$zIndices = obj3;
        this.$visibleEntries$delegate = obj4;
        this.$composeNavigator = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(String str, ChatState chatState, Continuation continuation, ChatPresenter chatPresenter, MutableState mutableState, MutableState mutableState2) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.$navController = str;
        this.$backStackEntry = chatState;
        this.$zIndices = chatPresenter;
        this.$visibleEntries$delegate = mutableState;
        this.$composeNavigator = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(SharedFlow sharedFlow, Activity activity, RealWebSocket$connect$1 realWebSocket$connect$1, NavHostController navHostController, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 24;
        this.$backStackEntry = sharedFlow;
        this.$zIndices = activity;
        this.$visibleEntries$delegate = realWebSocket$connect$1;
        this.$navController = navHostController;
        this.$composeNavigator = function1;
    }
}
