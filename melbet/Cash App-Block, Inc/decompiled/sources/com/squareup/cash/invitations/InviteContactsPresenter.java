package com.squareup.cash.invitations;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$model$1;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.ContactInviteEntryPoint;
import com.squareup.cash.cdf.contact.ContactInvitePrefillRequest;
import com.squareup.cash.cdf.contact.ContactInviteRegisterAlias;
import com.squareup.cash.cdf.contact.ContactInviteSent;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$withContactAliasId$2;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LocalFeatureFlags$ReadInviteTextFromAppConfig;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.backend.real.RealInvitationsRepository$registerInvitations$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.ui.MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.CountryText;
import com.squareup.protos.franklin.api.InviteFriendsScreen;
import com.squareup.protos.franklin.api.PromotionUpsell;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.SharingContent;
import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import com.squareup.protos.franklin.app.RegisterInvitationsResponse;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Countries;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter implements MoleculePresenter {
    public final StateFlow activityLifecycleState;
    public final ReadonlyStateFlow allContacts;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final BlockersScreens.InviteContactsScreen args;
    public final BlockersDataNavigator blockersNavigator;
    public final AndroidClock clock;
    public final ReadonlyStateFlow contactsWithAliasIds;
    public final InviteContactsViewModel emptyModel;
    public final ContactInviteEntryPoint entryPoint;
    public final FeatureFlagManager featureFlagManager;
    public Map hashedAliasToId;
    public final StateFlowImpl invitationSuccessToastViewModelState;
    public final EglCore invitationsRepository;
    public final StateFlowImpl inviteConsentBottomSheetViewModel;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final ModifiablePermissions readContactsPermissions;
    public final RealRouter router;
    public final StateFlowImpl sendInviteRequestInFlight;
    public final Flow shareResults;
    public final AndroidStringManager stringManager;
    public final SharedFlowImpl whenRequestHappened;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activityLifecycleState;
        public final DoubleCheck analytics;
        public final DoubleCheck appConfig;
        public final Provider blockersNavigator;
        public final LambdaProvider clock;
        public final Provider contactRepository;
        public final DoubleCheck featureFlagManager;
        public final RealMerchantProfileRepo$MetroFactory invitationsRepository;
        public final LambdaProvider ioDispatcher;
        public final Provider launcher;
        public final LambdaProvider observabilityManager;
        public final Provider readContactsPermissions;
        public final Provider routerFactory;
        public final InstanceFactory scope;
        public final DoubleCheck shareResults;
        public final DoubleCheck signOut;
        public final LambdaProvider stringManager;

        public MetroFactory(DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, IntentLauncher.MetroFactory metroFactory2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, LambdaProvider lambdaProvider2, MainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory, TemporaryStorage.MetroFactory metroFactory3, LambdaProvider lambdaProvider3, RealBrazeManager.MetroFactory metroFactory4, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.appConfig = doubleCheck;
            this.contactRepository = metroFactory;
            this.signOut = doubleCheck2;
            this.ioDispatcher = lambdaProvider;
            this.launcher = metroFactory2;
            this.analytics = doubleCheck3;
            this.featureFlagManager = doubleCheck4;
            this.invitationsRepository = realMerchantProfileRepo$MetroFactory;
            this.stringManager = lambdaProvider2;
            this.activityLifecycleState = mainActivityModule$Companion$ProvideActivityLifecycleStateFlowMetroFactory;
            this.readContactsPermissions = metroFactory3;
            this.clock = lambdaProvider3;
            this.blockersNavigator = metroFactory4;
            this.observabilityManager = lambdaProvider4;
            this.shareResults = doubleCheck5;
            this.routerFactory = instanceFactory;
            this.scope = instanceFactory2;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InviteContactsViewEvent.SendInvite.ContactSection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InviteContactsViewEvent.SendInvite.ContactSection contactSection = InviteContactsViewEvent.SendInvite.ContactSection.RECOMMENDED;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InviteContactsViewEvent.SendInvite.ContactSection contactSection2 = InviteContactsViewEvent.SendInvite.ContactSection.RECOMMENDED;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[BlockersScreens.StartFlowEntryPointScreen.Origin.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin2 = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin3 = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin4 = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin5 = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                BlockersScreens.StartFlowEntryPointScreen.Origin origin6 = BlockersScreens.StartFlowEntryPointScreen.Origin.PROFILE;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[ClientScenario.values().length];
            try {
                iArr3[ClientScenario.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ClientScenario.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ClientScenario.RETURNING_CUSTOMER_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ClientScenario.ACTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ClientScenario.PAYMENT_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InviteContactsPresenter(AppConfigManager appConfigManager, RealContactRepository realContactRepository, Signal signal, CoroutineContext coroutineContext, IntentLauncher intentLauncher, Analytics analytics, FeatureFlagManager featureFlagManager, EglCore eglCore, AndroidStringManager androidStringManager, StateFlow stateFlow, ModifiablePermissions modifiablePermissions, AndroidClock androidClock, BlockersDataNavigator blockersDataNavigator, RealObservabilityManager realObservabilityManager, Flow flow, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineScope coroutineScope, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.InviteContactsScreen inviteContactsScreen) {
        ContactInviteEntryPoint contactInviteEntryPoint;
        inviteContactsScreen.getClass();
        InviteFriendsScreen inviteFriendsScreen = inviteContactsScreen.inviteFriendsScreen;
        this.appConfig = appConfigManager;
        this.ioDispatcher = coroutineContext;
        this.launcher = intentLauncher;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.invitationsRepository = eglCore;
        this.stringManager = androidStringManager;
        this.activityLifecycleState = stateFlow;
        this.readContactsPermissions = modifiablePermissions;
        this.clock = androidClock;
        this.blockersNavigator = blockersDataNavigator;
        this.observabilityManager = realObservabilityManager;
        this.shareResults = flow;
        this.navigator = screenNavigator;
        this.args = inviteContactsScreen;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        ContactQueries contactQueries = realContactRepository.contactQueries;
        contactQueries.getClass();
        ContactQueries$withContactAliasId$2 contactQueries$withContactAliasId$2 = ContactQueries$withContactAliasId$2.INSTANCE;
        SqlDriver sqlDriver = contactQueries.driver;
        WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2 = new WebLoginConfigQueries$$ExternalSyntheticLambda2(29, false);
        sqlDriver.getClass();
        Flow flowOn = FlowKt.flowOn(StateFlowKt.runUntil(new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1713242204, new String[]{"contact", "alias", "contact_alias"}, sqlDriver, "Contact.sq", "withContactAliasId", "SELECT contact.lookup_key, alias.hashed_alias, alias.hashed_alias_id, alias.sms, alias.email\nFROM contact\nLEFT JOIN contact_alias USING (lookup_key)\nLEFT JOIN alias USING (hashed_alias)", webLoginConfigQueries$$ExternalSyntheticLambda2)), realContactRepository.ioDispatcher), 7), signal), coroutineContext);
        EmptyList emptyList = EmptyList.INSTANCE;
        StartedLazily startedLazily = SharingStarted.Companion.Eagerly;
        this.contactsWithAliasIds = FlowKt.stateIn(flowOn, coroutineScope, startedLazily, emptyList);
        this.allContacts = FlowKt.stateIn(FlowKt.flowOn(new InviteContactsPresenter$special$$inlined$map$1(StateFlowKt.runUntil(realContactRepository.contacts(), signal), this, 0 == true ? 1 : 0), coroutineContext), coroutineScope, startedLazily, emptyList);
        this.invitationSuccessToastViewModelState = FlowKt.MutableStateFlow(new Versioned(null, 0));
        this.inviteConsentBottomSheetViewModel = FlowKt.MutableStateFlow(new Versioned(null, 0));
        this.sendInviteRequestInFlight = FlowKt.MutableStateFlow(Boolean.FALSE);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.hashedAliasToId = emptyMap;
        BlockersScreens.StartFlowEntryPointScreen.Origin origin = inviteContactsScreen.plasmaOrigin;
        if (origin != null) {
            switch (origin.ordinal()) {
                case 0:
                    contactInviteEntryPoint = ContactInviteEntryPoint.PROFILE;
                    break;
                case 1:
                    contactInviteEntryPoint = ContactInviteEntryPoint.ACTIVITY;
                    break;
                case 2:
                    contactInviteEntryPoint = ContactInviteEntryPoint.ONBOARDING;
                    break;
                case 3:
                    contactInviteEntryPoint = ContactInviteEntryPoint.DISCOVER;
                    break;
                case 4:
                    contactInviteEntryPoint = ContactInviteEntryPoint.PAYMENT;
                    break;
                case 5:
                    contactInviteEntryPoint = ContactInviteEntryPoint.PROMOTION_HUB;
                    break;
                case 6:
                    contactInviteEntryPoint = ContactInviteEntryPoint.FAMILIES;
                    break;
                default:
                    contactInviteEntryPoint = null;
                    break;
            }
        } else {
            ClientScenario clientScenario = inviteContactsScreen.blockersData.clientScenario;
            if (clientScenario != null) {
                int i = WhenMappings.$EnumSwitchMapping$2[clientScenario.ordinal()];
                if (i == 1) {
                    contactInviteEntryPoint = ContactInviteEntryPoint.PROFILE;
                } else if (i == 2 || i == 3) {
                    contactInviteEntryPoint = ContactInviteEntryPoint.ONBOARDING;
                } else if (i == 4) {
                    contactInviteEntryPoint = ContactInviteEntryPoint.ACTIVITY;
                } else if (i == 5) {
                    contactInviteEntryPoint = ContactInviteEntryPoint.PAYMENT;
                }
            }
            contactInviteEntryPoint = null;
        }
        this.entryPoint = contactInviteEntryPoint;
        this.whenRequestHappened = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
        String str = inviteFriendsScreen.invite_contact_button_text;
        String str2 = inviteFriendsScreen.send_invite_button_text;
        String str3 = inviteFriendsScreen.contact_access_request_text;
        String str4 = inviteFriendsScreen.contact_access_request_button_text;
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        InviteErrorDialogKt inviteErrorDialogKt = modifiablePermissions.check() ? InviteContactsViewModel$State$ShowContacts.INSTANCE : InviteContactsViewModel$State$PromptForPermissions.INSTANCE;
        String str5 = androidStringManager.get(modifiablePermissions.check() ? R.string.blockers_invite_contacts_view_with_permissions_name_input_hint : R.string.blockers_invite_contacts_view_name_input_hint);
        InviteContactsHeaderViewModel inviteContactsHeaderViewModel = new InviteContactsHeaderViewModel(inviteFriendsScreen.header_text, null, false);
        Versioned versioned = new Versioned(null, 0);
        Versioned versioned2 = new Versioned(null, 0);
        PromotionUpsell promotionUpsell = inviteFriendsScreen.promotion_upsell;
        this.emptyModel = new InviteContactsViewModel(str, str2, null, str3, str4, smallPersistentVector, smallPersistentVector, inviteErrorDialogKt, null, str5, inviteContactsHeaderViewModel, versioned, versioned2, promotionUpsell != null ? getPromotionUpsellViewModel(promotionUpsell) : null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0192, code lost:
    
        if (r17.doAfterRegister(r1, r5, r16, r3, r2, r6, r7) != r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b6, code lost:
    
        if (kotlin.Unit.INSTANCE != r10) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$sendInvite(InviteContactsPresenter inviteContactsPresenter, List list, InviteContactsViewEvent.SendInvite.ContactSection contactSection, ContinuationImpl continuationImpl) {
        InviteContactsPresenter$sendInvite$1 inviteContactsPresenter$sendInvite$1;
        int i;
        InviteContactsViewEvent.SendInvite.ContactSection contactSection2;
        List list2;
        InvitationConfig invitationConfig;
        InvitationConfig invitationConfig2;
        InviteContactsViewEvent.SendInvite.ContactSection contactSection3;
        List list3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ApiResult apiResult;
        if (continuationImpl instanceof InviteContactsPresenter$sendInvite$1) {
            inviteContactsPresenter$sendInvite$1 = (InviteContactsPresenter$sendInvite$1) continuationImpl;
            int i2 = inviteContactsPresenter$sendInvite$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteContactsPresenter$sendInvite$1.label = i2 - PKIFailureInfo.systemUnavail;
                InviteContactsPresenter$sendInvite$1 inviteContactsPresenter$sendInvite$12 = inviteContactsPresenter$sendInvite$1;
                Object obj = inviteContactsPresenter$sendInvite$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteContactsPresenter$sendInvite$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter invitationConfig3 = ((RealAppConfigManager) inviteContactsPresenter.appConfig).invitationConfig();
                    inviteContactsPresenter$sendInvite$12.L$0 = list;
                    contactSection2 = contactSection;
                    inviteContactsPresenter$sendInvite$12.L$1 = contactSection2;
                    inviteContactsPresenter$sendInvite$12.label = 1;
                    obj = FlowKt.first(invitationConfig3, inviteContactsPresenter$sendInvite$12);
                    if (obj != obj2) {
                        list2 = list;
                    }
                    return obj2;
                }
                if (i == 1) {
                    contactSection2 = inviteContactsPresenter$sendInvite$12.L$1;
                    list2 = inviteContactsPresenter$sendInvite$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        InvitationConfig invitationConfig4 = inviteContactsPresenter$sendInvite$12.L$2;
                        InviteContactsViewEvent.SendInvite.ContactSection contactSection4 = inviteContactsPresenter$sendInvite$12.L$1;
                        list2 = inviteContactsPresenter$sendInvite$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        invitationConfig = invitationConfig4;
                        contactSection2 = contactSection4;
                        List list4 = list2;
                        List list5 = list4;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            String str = ((Recipient) it.next()).sms;
                            if (str != null) {
                                arrayList3.add(str);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((Recipient) it2.next()).email;
                            if (str2 != null) {
                                arrayList4.add(str2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            inviteContactsPresenter$sendInvite$12.L$0 = list4;
                            inviteContactsPresenter$sendInvite$12.L$1 = contactSection2;
                            inviteContactsPresenter$sendInvite$12.L$2 = invitationConfig;
                            inviteContactsPresenter$sendInvite$12.L$3 = arrayList3;
                            inviteContactsPresenter$sendInvite$12.L$4 = arrayList4;
                            inviteContactsPresenter$sendInvite$12.label = 3;
                            ArrayList enhancedAliasList = inviteContactsPresenter.enhancedAliasList(new Pair(CollectionsKt.first((List) arrayList3), RegisterInvitationsRequest.EnhancedAlias.Type.SMS), CollectionsKt.drop(arrayList3, 1), arrayList4);
                            Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, inviteContactsPresenter.args.blockersData, inviteContactsPresenter.analytics, inviteContactsPresenter.stringManager, inviteContactsPresenter$sendInvite$12, null, new RealMRIFactory$sign$2.AnonymousClass1(inviteContactsPresenter, enhancedAliasList, continuation, 13));
                            if (trackBlockerSubmissionAnalytics$default != obj2) {
                                invitationConfig2 = invitationConfig;
                                contactSection3 = contactSection2;
                                obj = trackBlockerSubmissionAnalytics$default;
                                list3 = list4;
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                                apiResult = (ApiResult) obj;
                                List list6 = list3;
                                InvitationConfig invitationConfig5 = invitationConfig2;
                                String str3 = (String) CollectionsKt.firstOrNull((List) arrayList);
                                String str4 = (String) CollectionsKt.firstOrNull((List) arrayList2);
                                inviteContactsPresenter$sendInvite$12.L$0 = null;
                                inviteContactsPresenter$sendInvite$12.L$1 = null;
                                inviteContactsPresenter$sendInvite$12.L$2 = null;
                                inviteContactsPresenter$sendInvite$12.L$3 = null;
                                inviteContactsPresenter$sendInvite$12.L$4 = null;
                                inviteContactsPresenter$sendInvite$12.label = 5;
                            }
                        } else {
                            if (arrayList4.isEmpty()) {
                                a$$ExternalSyntheticBUOutline0.m$1("Invitation Expected one alias, found none.");
                                return null;
                            }
                            inviteContactsPresenter$sendInvite$12.L$0 = list4;
                            inviteContactsPresenter$sendInvite$12.L$1 = contactSection2;
                            inviteContactsPresenter$sendInvite$12.L$2 = invitationConfig;
                            inviteContactsPresenter$sendInvite$12.L$3 = arrayList3;
                            inviteContactsPresenter$sendInvite$12.L$4 = arrayList4;
                            inviteContactsPresenter$sendInvite$12.label = 4;
                            Object sendEmailInvitation = inviteContactsPresenter.sendEmailInvitation(arrayList4, inviteContactsPresenter$sendInvite$12);
                            if (sendEmailInvitation != obj2) {
                                invitationConfig2 = invitationConfig;
                                contactSection3 = contactSection2;
                                obj = sendEmailInvitation;
                                list3 = list4;
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                                apiResult = (ApiResult) obj;
                                List list62 = list3;
                                InvitationConfig invitationConfig52 = invitationConfig2;
                                String str32 = (String) CollectionsKt.firstOrNull((List) arrayList);
                                String str42 = (String) CollectionsKt.firstOrNull((List) arrayList2);
                                inviteContactsPresenter$sendInvite$12.L$0 = null;
                                inviteContactsPresenter$sendInvite$12.L$1 = null;
                                inviteContactsPresenter$sendInvite$12.L$2 = null;
                                inviteContactsPresenter$sendInvite$12.L$3 = null;
                                inviteContactsPresenter$sendInvite$12.L$4 = null;
                                inviteContactsPresenter$sendInvite$12.label = 5;
                            }
                        }
                        return obj2;
                    }
                    if (i == 3) {
                        arrayList2 = inviteContactsPresenter$sendInvite$12.L$4;
                        arrayList = inviteContactsPresenter$sendInvite$12.L$3;
                        invitationConfig2 = inviteContactsPresenter$sendInvite$12.L$2;
                        contactSection3 = inviteContactsPresenter$sendInvite$12.L$1;
                        list3 = inviteContactsPresenter$sendInvite$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        List list622 = list3;
                        InvitationConfig invitationConfig522 = invitationConfig2;
                        String str322 = (String) CollectionsKt.firstOrNull((List) arrayList);
                        String str422 = (String) CollectionsKt.firstOrNull((List) arrayList2);
                        inviteContactsPresenter$sendInvite$12.L$0 = null;
                        inviteContactsPresenter$sendInvite$12.L$1 = null;
                        inviteContactsPresenter$sendInvite$12.L$2 = null;
                        inviteContactsPresenter$sendInvite$12.L$3 = null;
                        inviteContactsPresenter$sendInvite$12.L$4 = null;
                        inviteContactsPresenter$sendInvite$12.label = 5;
                    } else {
                        if (i != 4) {
                            if (i == 5) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList2 = inviteContactsPresenter$sendInvite$12.L$4;
                        arrayList = inviteContactsPresenter$sendInvite$12.L$3;
                        invitationConfig2 = inviteContactsPresenter$sendInvite$12.L$2;
                        contactSection3 = inviteContactsPresenter$sendInvite$12.L$1;
                        list3 = inviteContactsPresenter$sendInvite$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        List list6222 = list3;
                        InvitationConfig invitationConfig5222 = invitationConfig2;
                        String str3222 = (String) CollectionsKt.firstOrNull((List) arrayList);
                        String str4222 = (String) CollectionsKt.firstOrNull((List) arrayList2);
                        inviteContactsPresenter$sendInvite$12.L$0 = null;
                        inviteContactsPresenter$sendInvite$12.L$1 = null;
                        inviteContactsPresenter$sendInvite$12.L$2 = null;
                        inviteContactsPresenter$sendInvite$12.L$3 = null;
                        inviteContactsPresenter$sendInvite$12.L$4 = null;
                        inviteContactsPresenter$sendInvite$12.label = 5;
                    }
                }
                invitationConfig = (InvitationConfig) obj;
                StateFlowImpl stateFlowImpl = inviteContactsPresenter.sendInviteRequestInFlight;
                Boolean bool = Boolean.TRUE;
                inviteContactsPresenter$sendInvite$12.L$0 = list2;
                inviteContactsPresenter$sendInvite$12.L$1 = contactSection2;
                inviteContactsPresenter$sendInvite$12.L$2 = invitationConfig;
                inviteContactsPresenter$sendInvite$12.label = 2;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
            }
        }
        inviteContactsPresenter$sendInvite$1 = new InviteContactsPresenter$sendInvite$1(inviteContactsPresenter, continuationImpl);
        InviteContactsPresenter$sendInvite$1 inviteContactsPresenter$sendInvite$122 = inviteContactsPresenter$sendInvite$1;
        Object obj3 = inviteContactsPresenter$sendInvite$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteContactsPresenter$sendInvite$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        invitationConfig = (InvitationConfig) obj3;
        StateFlowImpl stateFlowImpl2 = inviteContactsPresenter.sendInviteRequestInFlight;
        Boolean bool2 = Boolean.TRUE;
        inviteContactsPresenter$sendInvite$122.L$0 = list2;
        inviteContactsPresenter$sendInvite$122.L$1 = contactSection2;
        inviteContactsPresenter$sendInvite$122.L$2 = invitationConfig;
        inviteContactsPresenter$sendInvite$122.label = 2;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, bool2);
    }

    public static InviteContactsViewModel.PromotionUpsellViewModel getPromotionUpsellViewModel(PromotionUpsell promotionUpsell) {
        String str;
        String str2 = promotionUpsell.title;
        if (str2 == null || (str = promotionUpsell.body) == null) {
            return null;
        }
        String str3 = promotionUpsell.cta;
        String str4 = promotionUpsell.cta_client_route;
        String str5 = promotionUpsell.image_url_light;
        String str6 = promotionUpsell.image_url_dark;
        Long l = promotionUpsell.image_height;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Long l2 = promotionUpsell.image_width;
        return new InviteContactsViewModel.PromotionUpsellViewModel(str2, str, str3, str4, new InviteContactsViewModel.PromotionUpsellViewModel.PromotionIllustration(str5, str6, valueOf, l2 != null ? Integer.valueOf((int) l2.longValue()) : null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0317, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x031a, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0333, code lost:
    
        if (r6 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0335, code lost:
    
        r1 = r18.invitationSuccessToastViewModelState;
        r4 = app.cash.versioned.VersionedKt.update((app.cash.versioned.Versioned) r1.getValue(), new com.squareup.cash.invitations.InvitationSuccessToastViewModel(r6, r7.inviteFriendsScreen.invited_contact_toast_subtitle, false, r4.element));
        r1.getClass();
        r9 = 0;
        r1.updateState(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0356, code lost:
    
        r1 = new com.squareup.cash.music.presenters.MusicPresenter$models$2$1(r18, r9, 3);
        r2.L$0 = r9;
        r2.L$1 = r9;
        r2.L$2 = r9;
        r2.L$3 = r9;
        r2.L$4 = r9;
        r2.L$5 = r9;
        r2.L$6 = r9;
        r2.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0372, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r18.ioDispatcher, r1, r2) != r3) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0355, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0331, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ff  */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [app.cash.api.ApiResult, com.squareup.cash.data.db.InvitationConfig, com.squareup.cash.invitations.InviteContactsViewEvent$SendInvite$ContactSection, java.lang.String, java.util.List, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v8, types: [app.cash.api.ApiResult, com.squareup.cash.data.db.InvitationConfig, com.squareup.cash.invitations.InviteContactsViewEvent$SendInvite$ContactSection, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doAfterRegister(ApiResult apiResult, InviteContactsViewEvent.SendInvite.ContactSection contactSection, List list, String str, String str2, InvitationConfig invitationConfig, ContinuationImpl continuationImpl) {
        InviteContactsPresenter$doAfterRegister$1 inviteContactsPresenter$doAfterRegister$1;
        int i;
        InviteContactsViewEvent.SendInvite.ContactSection contactSection2;
        String str3;
        InvitationConfig invitationConfig2;
        ApiResult apiResult2;
        String str4;
        List list2;
        Ref$BooleanRef ref$BooleanRef;
        Long l;
        ContactInviteRegisterAlias.ContactSection contactSection3;
        ?? r9;
        Object withContext;
        String str5;
        String str6;
        List list3;
        SmsInvitation smsInvitation;
        String str7;
        ContactInviteRegisterAlias.ContactSection contactSection4;
        Long l2;
        ContactInviteSent.ContactSection contactSection5;
        Recipient recipient;
        String format2;
        if (continuationImpl instanceof InviteContactsPresenter$doAfterRegister$1) {
            inviteContactsPresenter$doAfterRegister$1 = (InviteContactsPresenter$doAfterRegister$1) continuationImpl;
            int i2 = inviteContactsPresenter$doAfterRegister$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteContactsPresenter$doAfterRegister$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = inviteContactsPresenter$doAfterRegister$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteContactsPresenter$doAfterRegister$1.label;
                BlockersScreens.InviteContactsScreen inviteContactsScreen = this.args;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.FALSE;
                    inviteContactsPresenter$doAfterRegister$1.L$0 = apiResult;
                    contactSection2 = contactSection;
                    inviteContactsPresenter$doAfterRegister$1.L$1 = contactSection2;
                    inviteContactsPresenter$doAfterRegister$1.L$2 = list;
                    str3 = str;
                    inviteContactsPresenter$doAfterRegister$1.L$3 = str3;
                    inviteContactsPresenter$doAfterRegister$1.L$4 = str2;
                    invitationConfig2 = invitationConfig;
                    inviteContactsPresenter$doAfterRegister$1.L$5 = invitationConfig2;
                    inviteContactsPresenter$doAfterRegister$1.label = 1;
                    StateFlowImpl stateFlowImpl = this.sendInviteRequestInFlight;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                    if (Unit.INSTANCE != obj2) {
                        apiResult2 = apiResult;
                        str4 = str2;
                        list2 = list;
                    }
                    return obj2;
                }
                if (i == 1) {
                    InvitationConfig invitationConfig3 = inviteContactsPresenter$doAfterRegister$1.L$5;
                    String str8 = inviteContactsPresenter$doAfterRegister$1.L$4;
                    str3 = inviteContactsPresenter$doAfterRegister$1.L$3;
                    list2 = inviteContactsPresenter$doAfterRegister$1.L$2;
                    InviteContactsViewEvent.SendInvite.ContactSection contactSection6 = inviteContactsPresenter$doAfterRegister$1.L$1;
                    apiResult2 = inviteContactsPresenter$doAfterRegister$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str4 = str8;
                    contactSection2 = contactSection6;
                    invitationConfig2 = invitationConfig3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = inviteContactsPresenter$doAfterRegister$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ref$BooleanRef = inviteContactsPresenter$doAfterRegister$1.L$6;
                    str5 = inviteContactsPresenter$doAfterRegister$1.L$4;
                    str6 = inviteContactsPresenter$doAfterRegister$1.L$3;
                    list3 = inviteContactsPresenter$doAfterRegister$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    recipient = (Recipient) CollectionsKt.firstOrNull(list3);
                    if (recipient != null && (format2 = recipient.getFirstName()) != null) {
                        if (StringsKt.isBlank(format2)) {
                            format2 = null;
                        }
                    }
                    format2 = str6 == null ? PhoneNumbers.format(str6, Regions.toCountry(inviteContactsScreen.blockersData.region).name(), null) : null;
                }
                if (apiResult2 instanceof ApiResult.Success) {
                    if (apiResult2 instanceof ApiResult.Failure) {
                        this.navigator.goTo(new BlockersScreens.InviteErrorScreen(inviteContactsScreen.blockersData, this.stringManager.get(R.string.blockers_invite_contacts_error)));
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ref$BooleanRef = new Ref$BooleanRef();
                Analytics analytics = this.analytics;
                if (str3 != null) {
                    Object obj3 = ((ApiResult.Success) apiResult2).response;
                    if (((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LocalFeatureFlags$ReadInviteTextFromAppConfig.INSTANCE)).enabled()) {
                        List<CountryText> list5 = invitationConfig2.preview_message_by_country;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                        for (CountryText countryText : list5) {
                            Country country = countryText.country;
                            country.getClass();
                            Region region = Countries.toRegion(country);
                            String str9 = countryText.text;
                            str9.getClass();
                            linkedHashMap.put(region, str9);
                        }
                        Region region2 = inviteContactsScreen.blockersData.region;
                        String str10 = invitationConfig2.message_template;
                        String str11 = invitationConfig2.preview_message;
                        Region region3 = Countries.toRegion(Country.valueOf(PhoneNumbers.getRegionFromNumber(str3, Regions.toCountry(region2).name())));
                        String str12 = linkedHashMap.containsKey(region3) ? (String) linkedHashMap.get(region3) : (String) linkedHashMap.get(region2);
                        if (str12 != null) {
                            str11 = str12;
                        }
                        smsInvitation = new SmsInvitation(new RedactedString(StringsKt__StringsJVMKt.replace$default(str10, "{{message}}", str11)), new RedactedString(str3));
                    } else {
                        List<CountryText> list6 = inviteContactsScreen.inviteFriendsScreen.sms_text_by_country;
                        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                        for (CountryText countryText2 : list6) {
                            Country country2 = countryText2.country;
                            country2.getClass();
                            Region region4 = Countries.toRegion(country2);
                            String str13 = countryText2.text;
                            str13.getClass();
                            linkedHashMap2.put(region4, str13);
                        }
                        Region region5 = inviteContactsScreen.blockersData.region;
                        String str14 = (String) linkedHashMap2.get(Countries.toRegion(Country.valueOf(PhoneNumbers.getRegionFromNumber(str3, Regions.toCountry(region5).name()))));
                        if (str14 == null && (str14 = (String) linkedHashMap2.get(region5)) == null) {
                            SharingContent sharingContent = inviteContactsScreen.inviteFriendsScreen.sharing_content;
                            sharingContent.getClass();
                            str14 = sharingContent.default_text;
                            str14.getClass();
                        }
                        smsInvitation = new SmsInvitation(new RedactedString(str14), new RedactedString(str3));
                    }
                    this.launcher.sendSms((String) smsInvitation.message.getValue(), (String) smsInvitation.number.getValue());
                    ref$BooleanRef.element = true;
                    String str15 = (String) this.hashedAliasToId.get(Aliases.hash(str3));
                    boolean contains = CollectionsKt.contains(inviteContactsScreen.recommendedContactsHashedAliasIds, str15);
                    AliasType aliasType = AliasType.SMS;
                    int ordinal = contactSection2.ordinal();
                    if (ordinal != 0) {
                        str7 = str15;
                        if (ordinal == 1) {
                            contactSection4 = ContactInviteRegisterAlias.ContactSection.ALL_CONTACTS;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            contactSection4 = ContactInviteRegisterAlias.ContactSection.NOT_IN_CONTACTS;
                        }
                    } else {
                        str7 = str15;
                        contactSection4 = ContactInviteRegisterAlias.ContactSection.RECOMMENDED;
                    }
                    analytics.track(new ContactInviteRegisterAlias(aliasType, contactSection4, Boolean.valueOf(contains), str7, this.entryPoint), null);
                    Boolean valueOf = Boolean.valueOf(contains);
                    ContactInviteEntryPoint contactInviteEntryPoint = this.entryPoint;
                    analytics.track(new ContactInvitePrefillRequest(valueOf, str7, contactInviteEntryPoint), null);
                    if (obj3 instanceof RegisterInvitationsResponse) {
                        for (Iterator it = ((RegisterInvitationsResponse) obj3).invitation_tokens.iterator(); it.hasNext(); it = it) {
                            String str16 = (String) it.next();
                            int ordinal2 = contactSection2.ordinal();
                            if (ordinal2 == 0) {
                                l2 = null;
                                contactSection5 = ContactInviteSent.ContactSection.RECOMMENDED;
                            } else if (ordinal2 == 1) {
                                l2 = null;
                                contactSection5 = ContactInviteSent.ContactSection.ALL_CONTACTS;
                            } else {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                contactSection5 = ContactInviteSent.ContactSection.NOT_IN_CONTACTS;
                                l2 = null;
                            }
                            analytics.track(new ContactInviteSent(str16, contactInviteEntryPoint, contactSection5, Boolean.valueOf(contains)), l2);
                        }
                    }
                } else if (str4 != null) {
                    String str17 = (String) this.hashedAliasToId.get(Aliases.hash(str4));
                    AliasType aliasType2 = AliasType.EMAIL;
                    int ordinal3 = contactSection2.ordinal();
                    if (ordinal3 == 0) {
                        l = null;
                        contactSection3 = ContactInviteRegisterAlias.ContactSection.RECOMMENDED;
                    } else if (ordinal3 == 1) {
                        l = null;
                        contactSection3 = ContactInviteRegisterAlias.ContactSection.ALL_CONTACTS;
                    } else {
                        if (ordinal3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        contactSection3 = ContactInviteRegisterAlias.ContactSection.NOT_IN_CONTACTS;
                        l = null;
                    }
                    analytics.track(new ContactInviteRegisterAlias(aliasType2, contactSection3, Boolean.valueOf(CollectionsKt.contains(inviteContactsScreen.recommendedContactsHashedAliasIds, str17)), str17, this.entryPoint), l);
                    r9 = l;
                    inviteContactsPresenter$doAfterRegister$1.L$0 = r9;
                    inviteContactsPresenter$doAfterRegister$1.L$1 = r9;
                    inviteContactsPresenter$doAfterRegister$1.L$2 = list2;
                    inviteContactsPresenter$doAfterRegister$1.L$3 = str3;
                    inviteContactsPresenter$doAfterRegister$1.L$4 = str4;
                    inviteContactsPresenter$doAfterRegister$1.L$5 = r9;
                    inviteContactsPresenter$doAfterRegister$1.L$6 = ref$BooleanRef;
                    inviteContactsPresenter$doAfterRegister$1.label = 2;
                    EglCore eglCore = this.invitationsRepository;
                    withContext = JobKt.withContext((CoroutineContext) eglCore.eglContext, new GenieViewKt$GenieView$1$1(eglCore, list2, r9, 7), inviteContactsPresenter$doAfterRegister$1);
                    if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext != obj2) {
                        str5 = str4;
                        str6 = str3;
                        list3 = list2;
                        recipient = (Recipient) CollectionsKt.firstOrNull(list3);
                        if (recipient != null) {
                            if (StringsKt.isBlank(format2)) {
                            }
                        }
                        if (str6 == null) {
                        }
                    }
                    return obj2;
                }
                r9 = 0;
                inviteContactsPresenter$doAfterRegister$1.L$0 = r9;
                inviteContactsPresenter$doAfterRegister$1.L$1 = r9;
                inviteContactsPresenter$doAfterRegister$1.L$2 = list2;
                inviteContactsPresenter$doAfterRegister$1.L$3 = str3;
                inviteContactsPresenter$doAfterRegister$1.L$4 = str4;
                inviteContactsPresenter$doAfterRegister$1.L$5 = r9;
                inviteContactsPresenter$doAfterRegister$1.L$6 = ref$BooleanRef;
                inviteContactsPresenter$doAfterRegister$1.label = 2;
                EglCore eglCore2 = this.invitationsRepository;
                withContext = JobKt.withContext((CoroutineContext) eglCore2.eglContext, new GenieViewKt$GenieView$1$1(eglCore2, list2, r9, 7), inviteContactsPresenter$doAfterRegister$1);
                if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (withContext != obj2) {
                }
                return obj2;
            }
        }
        inviteContactsPresenter$doAfterRegister$1 = new InviteContactsPresenter$doAfterRegister$1(this, continuationImpl);
        Object obj4 = inviteContactsPresenter$doAfterRegister$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteContactsPresenter$doAfterRegister$1.label;
        BlockersScreens.InviteContactsScreen inviteContactsScreen2 = this.args;
        if (i != 0) {
        }
        if (apiResult2 instanceof ApiResult.Success) {
        }
    }

    public final ArrayList enhancedAliasList(Pair pair, List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
        MoneyTabBookletKt$$ExternalSyntheticLambda4 moneyTabBookletKt$$ExternalSyntheticLambda4 = new MoneyTabBookletKt$$ExternalSyntheticLambda4(23, arrayList, this);
        if (pair != null) {
            moneyTabBookletKt$$ExternalSyntheticLambda4.invoke(pair.first, pair.second, null);
        }
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add((Boolean) moneyTabBookletKt$$ExternalSyntheticLambda4.invoke((String) it.next(), RegisterInvitationsRequest.EnhancedAlias.Type.EMAIL, InvitationConfig.InvitationTreatment.ADDITIONAL_ALIAS));
        }
        List list4 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add((Boolean) moneyTabBookletKt$$ExternalSyntheticLambda4.invoke((String) it2.next(), RegisterInvitationsRequest.EnhancedAlias.Type.SMS, InvitationConfig.InvitationTreatment.ADDITIONAL_ALIAS));
        }
        return arrayList;
    }

    public final TreeMap getRecommendedIdToLookupKey(LinkedHashMap linkedHashMap) {
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (CollectionsKt.contains(this.args.recommendedContactsHashedAliasIds, this.hashedAliasToId.get(str)) && this.hashedAliasToId.containsKey(str)) {
                arrayList.add(obj);
            }
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object obj2 = this.hashedAliasToId.get(str2);
            obj2.getClass();
            Object obj3 = linkedHashMap.get(str2);
            obj3.getClass();
            linkedHashMap2.put(obj2, obj3);
        }
        TreeMap treeMap = new TreeMap(new SemanticsSortKt$special$$inlined$thenBy$1(this, 11));
        treeMap.putAll(linkedHashMap2);
        return treeMap;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(109546506);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(mutableSharedFlow);
            ModifiablePermissions modifiablePermissions = this.readContactsPermissions;
            Flow granted = modifiablePermissions.granted();
            int i3 = 2;
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, continuation, 25), new InviteContactsPresenter$filterContacts$$inlined$map$1(distinctUntilChanged, i2));
            CardModelView.AnonymousClass1.AnonymousClass4 anonymousClass4 = new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation, 10);
            ReadonlyStateFlow readonlyStateFlow = this.allContacts;
            Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__MergeKt$flatMapConcat$$inlined$map$1, readonlyStateFlow, anonymousClass4, i2));
            Flow distinctUntilChanged3 = FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, continuation, 28), distinctUntilChanged), this, 13));
            Flow distinctUntilChanged4 = FlowKt.distinctUntilChanged(new InviteContactsPresenter$includingEmail$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, continuation, 27), distinctUntilChanged), i2));
            int i4 = 26;
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, continuation, i4), new InviteContactsPresenter$filterContacts$$inlined$map$1(distinctUntilChanged, i4));
            Flow granted2 = modifiablePermissions.granted();
            RealStyledCardPresenter$model$1 realStyledCardPresenter$model$1 = new RealStyledCardPresenter$model$1(this, continuation, i3);
            ReadonlyStateFlow readonlyStateFlow2 = this.contactsWithAliasIds;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowKt__MergeKt$flatMapConcat$$inlined$map$12, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(FlowKt.combine(readonlyStateFlow, readonlyStateFlow2, granted2, realStyledCardPresenter$model$1)), new InviteContactsPresenter$models$2$1(this, continuation, i3), 3), new CardModelView.AnonymousClass1.AnonymousClass4(3, continuation, 11), 0);
            InviteContactsPresenter$contentModels$1 inviteContactsPresenter$contentModels$1 = new InviteContactsPresenter$contentModels$1(this, null);
            granted.getClass();
            readonlyStateFlow2.getClass();
            StateFlowImpl stateFlowImpl = this.invitationSuccessToastViewModelState;
            stateFlowImpl.getClass();
            StateFlowImpl stateFlowImpl2 = this.inviteConsentBottomSheetViewModel;
            stateFlowImpl2.getClass();
            StateFlowImpl stateFlowImpl3 = this.sendInviteRequestInFlight;
            stateFlowImpl3.getClass();
            rememberedValue3 = FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(26, new Flow[]{granted, distinctUntilChanged2, distinctUntilChanged3, distinctUntilChanged4, flowKt__ZipKt$combine$$inlined$unsafeFlow$1, readonlyStateFlow2, stateFlowImpl, stateFlowImpl2, stateFlowImpl3}, inviteContactsPresenter$contentModels$1));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, this.emptyModel, null, gapComposer, 0, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new InviteContactsPresenter$models$1$1(this, null, 0);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new InviteContactsPresenter$models$2$1(this, null, 0);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableSharedFlow, mutableState, 16));
        InviteContactsViewModel inviteContactsViewModel = (InviteContactsViewModel) collectAsState.getValue();
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        String str = inviteContactsViewModel.inviteContactButtonText;
        String str2 = inviteContactsViewModel.sendInviteButtonText;
        String str3 = inviteContactsViewModel.shareReferralLinkButtonText;
        String str4 = inviteContactsViewModel.contactRequestText;
        String str5 = inviteContactsViewModel.contactRequestButtonText;
        ImmutableList immutableList = inviteContactsViewModel.all_contacts;
        ImmutableList immutableList2 = inviteContactsViewModel.recommended_contacts;
        InviteErrorDialogKt inviteErrorDialogKt = inviteContactsViewModel.state;
        String str6 = inviteContactsViewModel.formattedText;
        String str7 = inviteContactsViewModel.searchPlaceholder;
        InviteContactsHeaderViewModel inviteContactsHeaderViewModel = inviteContactsViewModel.headerViewModel;
        Versioned versioned = inviteContactsViewModel.invitationSuccessToastViewModel;
        Versioned versioned2 = inviteContactsViewModel.inviteConsentBottomSheetModel;
        InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel = inviteContactsViewModel.promotionUpsellViewModel;
        immutableList.getClass();
        immutableList2.getClass();
        inviteErrorDialogKt.getClass();
        str7.getClass();
        inviteContactsHeaderViewModel.getClass();
        versioned.getClass();
        versioned2.getClass();
        InviteContactsViewModel inviteContactsViewModel2 = new InviteContactsViewModel(str, str2, str3, str4, str5, immutableList, immutableList2, inviteErrorDialogKt, str6, str7, inviteContactsHeaderViewModel, versioned, versioned2, promotionUpsellViewModel, booleanValue);
        gapComposer.end(false);
        return inviteContactsViewModel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r13 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEmailInvitation(ArrayList arrayList, ContinuationImpl continuationImpl) {
        InviteContactsPresenter$sendEmailInvitation$1 inviteContactsPresenter$sendEmailInvitation$1;
        InviteContactsPresenter$sendEmailInvitation$1 inviteContactsPresenter$sendEmailInvitation$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        ApiResult apiResult;
        ArrayList enhancedAliasList;
        EglCore eglCore;
        if (continuationImpl instanceof InviteContactsPresenter$sendEmailInvitation$1) {
            inviteContactsPresenter$sendEmailInvitation$1 = (InviteContactsPresenter$sendEmailInvitation$1) continuationImpl;
            int i2 = inviteContactsPresenter$sendEmailInvitation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                inviteContactsPresenter$sendEmailInvitation$1.label = i2 - PKIFailureInfo.systemUnavail;
                inviteContactsPresenter$sendEmailInvitation$12 = inviteContactsPresenter$sendEmailInvitation$1;
                Object obj = inviteContactsPresenter$sendEmailInvitation$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteContactsPresenter$sendEmailInvitation$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData blockersData = this.args.blockersData;
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(arrayList, this, continuation, 12);
                    inviteContactsPresenter$sendEmailInvitation$12.L$0 = arrayList;
                    inviteContactsPresenter$sendEmailInvitation$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, this.analytics, this.stringManager, inviteContactsPresenter$sendEmailInvitation$12, null, anonymousClass1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ApiResult.Success success = inviteContactsPresenter$sendEmailInvitation$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        return success;
                    }
                    arrayList = inviteContactsPresenter$sendEmailInvitation$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                List drop = CollectionsKt.drop(arrayList, 1);
                if ((apiResult instanceof ApiResult.Success) && !drop.isEmpty()) {
                    enhancedAliasList = enhancedAliasList(null, EmptyList.INSTANCE, CollectionsKt.drop(arrayList, 1));
                    inviteContactsPresenter$sendEmailInvitation$12.L$0 = null;
                    inviteContactsPresenter$sendEmailInvitation$12.L$1 = (ApiResult.Success) apiResult;
                    inviteContactsPresenter$sendEmailInvitation$12.label = 2;
                    eglCore = this.invitationsRepository;
                    if (JobKt.withContext((CoroutineContext) eglCore.eglContext, new RealInvitationsRepository$registerInvitations$2(eglCore, enhancedAliasList, null), inviteContactsPresenter$sendEmailInvitation$12) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return apiResult;
            }
        }
        inviteContactsPresenter$sendEmailInvitation$1 = new InviteContactsPresenter$sendEmailInvitation$1(this, continuationImpl);
        inviteContactsPresenter$sendEmailInvitation$12 = inviteContactsPresenter$sendEmailInvitation$1;
        Object obj2 = inviteContactsPresenter$sendEmailInvitation$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteContactsPresenter$sendEmailInvitation$12.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        List drop2 = CollectionsKt.drop(arrayList, 1);
        if (apiResult instanceof ApiResult.Success) {
            enhancedAliasList = enhancedAliasList(null, EmptyList.INSTANCE, CollectionsKt.drop(arrayList, 1));
            inviteContactsPresenter$sendEmailInvitation$12.L$0 = null;
            inviteContactsPresenter$sendEmailInvitation$12.L$1 = (ApiResult.Success) apiResult;
            inviteContactsPresenter$sendEmailInvitation$12.label = 2;
            eglCore = this.invitationsRepository;
            if (JobKt.withContext((CoroutineContext) eglCore.eglContext, new RealInvitationsRepository$registerInvitations$2(eglCore, enhancedAliasList, null), inviteContactsPresenter$sendEmailInvitation$12) != coroutineSingletons) {
            }
        }
        return apiResult;
    }
}
