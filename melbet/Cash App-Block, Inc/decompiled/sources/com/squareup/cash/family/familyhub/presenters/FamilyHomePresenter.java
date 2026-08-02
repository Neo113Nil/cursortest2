package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import app.cash.mooncake.values.MooncakeColors;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zztj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.presenters.PendingRequestActivityState;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListGroup;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListItem;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberSection;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMultiplePendingRequestsRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingInvitesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UpdatedMembersRowsInFamiliesApplet;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.InviteLink;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.core.MultiplePendingRequestsRow;
import com.squareup.protos.cash.aegis.core.PendingRequest;
import com.squareup.protos.cash.aegis.core.PendingRequestSection;
import com.squareup.protos.cash.aegis.core.PendingRequestSection$Type$MultiplePendingRequestsRow;
import com.squareup.protos.cash.aegis.core.PendingRequestSection$Type$PendingRequest;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.aegis.core.ViewRequestLink;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FamilyHomePresenter implements MoleculePresenter, HasObservability {
    public static final long HIGHLIGHT_ANIMATION_DELAY;
    public static final StackedAvatarViewModel.Avatar LOADING_AVATAR;
    public static final FamilyMemberRowViewModel LOADING_MEMBER;
    public static final FamilyPendingRequestsSection.OnePendingRequest loadingPendingRequestSection;
    public final RealAccountholderAccountRepository accountholderAccountRepository;
    public final Analytics analytics;
    public final FamilyHome args;
    public final MoneyFormatter balanceMoneyFormatter;
    public final RealCustomerStore customerStore;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final RealDependentBalancesStore dependentBalanceStore;
    public final ErrorReporter errorReporter;
    public final FamilyUpsellAnalytics familyUpsellAnalytics;
    public final FeatureFlagManager featureFlagManager;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final PendingRequestActivityManager pendingRequestActivityManager;
    public final RealProfileManager profileManager;
    public final RealRouter router;
    public final RealRouter$Factory$Impl routerFactory;
    public final AegisService service;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    public final class DependentDetails {
        public final String customerToken;
        public final Recipient recipient;
        public final SponsorshipTier sponsorshipTier;

        public DependentDetails(String str, SponsorshipTier sponsorshipTier, Recipient recipient) {
            this.customerToken = str;
            this.sponsorshipTier = sponsorshipTier;
            this.recipient = recipient;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DependentDetails)) {
                return false;
            }
            DependentDetails dependentDetails = (DependentDetails) obj;
            return this.customerToken.equals(dependentDetails.customerToken) && this.sponsorshipTier == dependentDetails.sponsorshipTier && Intrinsics.areEqual(this.recipient, dependentDetails.recipient);
        }

        public final int hashCode() {
            int hashCode = this.customerToken.hashCode() * 31;
            SponsorshipTier sponsorshipTier = this.sponsorshipTier;
            int hashCode2 = (hashCode + (sponsorshipTier == null ? 0 : sponsorshipTier.hashCode())) * 31;
            Recipient recipient = this.recipient;
            return hashCode2 + (recipient != null ? recipient.hashCode() : 0);
        }

        public final String toString() {
            return "DependentDetails(customerToken=" + this.customerToken + ", sponsorshipTier=" + this.sponsorshipTier + ", recipient=" + this.recipient + ")";
        }
    }

    public final class DependentInfo {
        public final String customerToken;
        public final SponsorshipTier sponsorshipTier;

        public DependentInfo(SponsorshipTier sponsorshipTier, String str) {
            this.sponsorshipTier = sponsorshipTier;
            this.customerToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DependentInfo)) {
                return false;
            }
            DependentInfo dependentInfo = (DependentInfo) obj;
            return this.sponsorshipTier == dependentInfo.sponsorshipTier && this.customerToken.equals(dependentInfo.customerToken);
        }

        public final int hashCode() {
            SponsorshipTier sponsorshipTier = this.sponsorshipTier;
            return this.customerToken.hashCode() + ((sponsorshipTier == null ? 0 : sponsorshipTier.hashCode()) * 31);
        }

        public final String toString() {
            return "DependentInfo(sponsorshipTier=" + this.sponsorshipTier + ", customerToken=" + this.customerToken + ")";
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SponsorshipTier.values().length];
            try {
                WorkCookieJar workCookieJar = SponsorshipTier.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkCookieJar workCookieJar2 = SponsorshipTier.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkCookieJar workCookieJar3 = SponsorshipTier.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(MoshiJsonIntegration.toModel$default(MooncakeColors.secondaryButtonBackground), ' ', null, null, null, null, null, null, false, false, null, false, null, null, 131068);
        LOADING_AVATAR = avatar;
        LOADING_MEMBER = new FamilyMemberRowViewModel((String) null, avatar, (String) null, (String) null, (String) null, (FamilyHomeViewEvent.TapDependent) null, true, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        Duration.Companion companion = Duration.Companion;
        HIGHLIGHT_ANIMATION_DELAY = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
        loadingPendingRequestSection = new FamilyPendingRequestsSection.OnePendingRequest(FamilyPendingRequestRowModel.Loading.INSTANCE);
    }

    public FamilyHomePresenter(FamilyHome familyHome, BetterNavigator.ScreenNavigator screenNavigator, SessionManager sessionManager, RealCustomerStore realCustomerStore, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, RealDependentBalancesStore realDependentBalancesStore, LocalizedMoneyFormatter.Factory factory, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, IntentLauncher intentLauncher, AegisService aegisService, PendingRequestActivityManager pendingRequestActivityManager, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, FeatureFlagManager featureFlagManager, RealAccountholderAccountRepository realAccountholderAccountRepository, FamilyUpsellAnalytics familyUpsellAnalytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        familyHome.getClass();
        this.args = familyHome;
        this.navigator = screenNavigator;
        this.sessionManager = sessionManager;
        this.customerStore = realCustomerStore;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.dependentBalanceStore = realDependentBalancesStore;
        this.analytics = analytics;
        this.launcher = intentLauncher;
        this.service = aegisService;
        this.pendingRequestActivityManager = pendingRequestActivityManager;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.featureFlagManager = featureFlagManager;
        this.accountholderAccountRepository = realAccountholderAccountRepository;
        this.familyUpsellAnalytics = familyUpsellAnalytics;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.balanceMoneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.routerFactory = realRouter$Factory$Impl;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String familyDisplayName(Recipient recipient) {
        String str;
        String obj;
        String obj2;
        String obj3;
        String str2 = recipient.fullName;
        if (str2 != null && (obj3 = StringsKt.trim(str2).toString()) != null) {
            if (StringsKt.isBlank(obj3)) {
                obj3 = null;
            }
            if (obj3 != null) {
                return obj3;
            }
        }
        String str3 = recipient.cashtag;
        if (str3 != null && (obj2 = StringsKt.trim(str3).toString()) != null) {
            if (StringsKt.isBlank(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                str = "$".concat(obj2);
                if (str == null) {
                    String str4 = recipient.email;
                    if (str4 == null || (str = StringsKt.trim(str4).toString()) == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str == null) {
                        String str5 = recipient.sms;
                        if (str5 == null || (obj = StringsKt.trim(str5).toString()) == null || StringsKt.isBlank(obj)) {
                            return null;
                        }
                        return obj;
                    }
                }
                return str;
            }
        }
        str = null;
        if (str == null) {
        }
        return str;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x053e A[Catch: Exception -> 0x0542, TRY_ENTER, TryCatch #4 {Exception -> 0x0542, blocks: (B:123:0x04ba, B:124:0x04cd, B:126:0x04d3, B:127:0x04e6, B:129:0x04ec, B:138:0x053e, B:150:0x0555, B:151:0x0564, B:154:0x0565, B:156:0x0585, B:132:0x04f8, B:142:0x0514, B:145:0x0524, B:147:0x0535), top: B:122:0x04ba, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x070d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0958 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0967 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x097f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0954 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r1v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3, types: [com.squareup.protos.franklin.api.FormBlocker$Element$UpsellElement] */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83, types: [com.squareup.protos.franklin.api.FormBlocker$Element$Element$UpsellElement] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.squareup.cash.recipients.data.RealCustomerStore] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        ?? r13;
        FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData;
        MutableState mutableState;
        FamilyAccountsParameters familyAccountsParameters;
        ArrayList<DependentInfo> arrayList;
        Object rememberedValue;
        GapComposer gapComposer;
        Object cardModelView$textures$$inlined$combine$1;
        char c;
        RealCustomerStore realCustomerStore;
        int i2;
        List list;
        ArrayList arrayList2;
        ?? r7;
        LinkedHashMap linkedHashMap;
        boolean z;
        boolean changed;
        Object rememberedValue2;
        FamilyAccountsParameters familyAccountsParameters2;
        List list2;
        List list3;
        PendingRequestSection pendingRequestSection;
        zztj zztjVar;
        PendingRequest pendingRequest;
        MultiplePendingRequestsRow multiplePendingRequestsRow;
        MultiplePendingRequestsRow multiplePendingRequestsRow2;
        PendingRequest pendingRequest2;
        String str;
        boolean changed2;
        Object rememberedValue3;
        FamilyAccountsParameters familyAccountsParameters3;
        ?? r1;
        List list4;
        FamilyAccountsParameters familyAccountsParameters4;
        MutableState mutableState2;
        GapComposer gapComposer2;
        MutableState mutableState3;
        SessionManager sessionManager;
        LinkedHashMap linkedHashMap2;
        boolean z2;
        MutableState mutableState4;
        char c2;
        FamilyListItem.Loading loading;
        List list5;
        Object rememberedValue4;
        FamilyHomePresenter familyHomePresenter;
        GapComposer gapComposer3;
        MutableState mutableState5;
        Object rememberedValue5;
        FamilyAccountsParameters familyAccountsParameters5;
        String str2;
        FamilyAccountsParameters familyAccountsParameters6;
        String str3;
        boolean z3;
        AndroidStringManager androidStringManager;
        State state;
        UiCallbackModel uiCallbackModel;
        boolean changed3;
        Object rememberedValue6;
        FamilyAccountsParameters familyAccountsParameters7;
        PendingRequestSection pendingRequestSection2;
        FamilyPendingRequestsSection familyPendingRequestsSection;
        PendingRequestSection pendingRequestSection3;
        String str4;
        ArrayList arrayList3;
        Iterator it;
        boolean z4;
        Iterator it2;
        int i3;
        boolean changed4;
        Object rememberedValue7;
        MutableState mutableState6;
        String str5;
        FamilyAccountsParameters familyAccountsParameters8;
        PublicProfile publicProfile;
        StackedAvatarViewModel.Avatar avatar;
        FamilyAccountsParameters familyAccountsParameters9;
        ?? r41;
        FormBlocker.Element element;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element;
        ?? r4;
        InviteLink inviteLink;
        Recipient recipient;
        Iterator it3;
        LinkedHashMap linkedHashMap3;
        boolean z5;
        AndroidStringManager androidStringManager2;
        FamilyMemberRowViewModel familyMemberRowViewModel;
        String str6;
        Image image;
        boolean z6;
        ?? r6;
        String str7;
        LinkedHashMap linkedHashMap4;
        int i4;
        String str8;
        String firstName;
        PendingRequestSection pendingRequestSection4;
        zztj zztjVar2;
        PendingRequest pendingRequest3;
        ViewRequestLink viewRequestLink;
        PendingRequestSection pendingRequestSection5;
        zztj zztjVar3;
        PendingRequest pendingRequest4;
        Section section;
        SessionManager sessionManager2;
        LinkedHashMap linkedHashMap5;
        boolean z7;
        MutableState mutableState7;
        GapComposer gapComposer4;
        MutableState mutableState8;
        FamilyListSection familyListSection;
        MutableState mutableState9;
        MutableState mutableState10;
        FamilyListItem.Loaded loaded;
        Collection values;
        boolean z8;
        List<Member> list6;
        FormBlocker.Element element2;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element2;
        Object obj;
        flow.getClass();
        ?? r8 = (GapComposer) composer;
        r8.startReplaceGroup(-407465157);
        Object rememberedValue8 = r8.rememberedValue();
        Continuation continuation = null;
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(null);
            r8.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState11 = (MutableState) rememberedValue8;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = r8.changedInstance(this);
        Object rememberedValue9 = r8.rememberedValue();
        if (changedInstance || rememberedValue9 == obj2) {
            rememberedValue9 = new EarningsHomePresenter$models$3$1(this, mutableState11, continuation, 22);
            r8.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect((Composer) r8, unit, (Function2) rememberedValue9);
        Object rememberedValue10 = r8.rememberedValue();
        if (rememberedValue10 == obj2) {
            BlockersData.Flow.INSTANCE.getClass();
            rememberedValue10 = BlockersData.Flow.Companion.generateToken();
            r8.updateRememberedValue(rememberedValue10);
        }
        String str9 = (String) rememberedValue10;
        EmptyList emptyList = EmptyList.INSTANCE;
        boolean changedInstance2 = r8.changedInstance(this);
        Object rememberedValue11 = r8.rememberedValue();
        if (changedInstance2 || rememberedValue11 == obj2) {
            rememberedValue11 = new EarningsHomePresenter$models$3$1(this, continuation, 23);
            r8.updateRememberedValue(rememberedValue11);
        }
        MutableState produceState = Updater.produceState(r8, emptyList, (Function2) rememberedValue11);
        SessionManager sessionManager3 = this.sessionManager;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager3);
        if (((FamilyAccountsParameters) mutableState11.getValue()) == null || activeAccountTokenOrNull == null) {
            r13 = 0;
            r8.startReplaceGroup(-1215555641);
            r8.end(false);
        } else {
            r8.startReplaceGroup(-1215800696);
            boolean changedInstance3 = r8.changedInstance(this) | r8.changed(activeAccountTokenOrNull);
            Object rememberedValue12 = r8.rememberedValue();
            if (changedInstance3 || rememberedValue12 == obj2) {
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(this, activeAccountTokenOrNull, mutableState11, continuation, 9);
                obj = null;
                r8.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
                rememberedValue12 = gLSceneScopeProvider$SceneScope$2$1$1;
            } else {
                obj = null;
            }
            Updater.LaunchedEffect((Composer) r8, unit, (Function2) rememberedValue12);
            r8.end(false);
            r13 = obj;
        }
        FamilyAccountsParameters familyAccountsParameters10 = (FamilyAccountsParameters) mutableState11.getValue();
        if (familyAccountsParameters10 != null && (element2 = familyAccountsParameters10.upsell_element) != null && (abstractC0072Element2 = element2.element) != null) {
            FormBlocker.Element.AbstractC0072Element.UpsellElement upsellElement = abstractC0072Element2 instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement ? (FormBlocker.Element.AbstractC0072Element.UpsellElement) abstractC0072Element2 : r13;
            FormBlocker.Element.UpsellElement value = upsellElement != null ? upsellElement.getValue() : r13;
            if (value != null) {
                onDemandMessageData = value.on_demand_message_data;
                if (onDemandMessageData != null) {
                    r8.startReplaceGroup(-1215473895);
                    r8.end(false);
                } else {
                    r8.startReplaceGroup(-1215473894);
                    boolean changedInstance4 = r8.changedInstance(this) | r8.changedInstance(onDemandMessageData);
                    Object rememberedValue13 = r8.rememberedValue();
                    if (changedInstance4 || rememberedValue13 == obj2) {
                        rememberedValue13 = new FamilyHomePresenter$models$3$1$1(this, onDemandMessageData, r13);
                        r8.updateRememberedValue(rememberedValue13);
                    }
                    Updater.LaunchedEffect((Composer) r8, onDemandMessageData, (Function2) rememberedValue13);
                    r8.end(false);
                }
                RealIdvPresenter$models$1$1 realIdvPresenter$models$1$1 = new RealIdvPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) str9, (Object) produceState, mutableState11, 26);
                FamilyHomePresenter familyHomePresenter2 = this;
                mutableState = mutableState11;
                Updater.LaunchedEffect((Composer) r8, flow, realIdvPresenter$models$1$1);
                familyAccountsParameters = (FamilyAccountsParameters) mutableState.getValue();
                FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                if (familyAccountsParameters != null || (list6 = familyAccountsParameters.sorted_dependents) == null) {
                    arrayList = r13;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Member member : list6) {
                        try {
                            String str10 = member.customer_token;
                            try {
                                ProtoValidationScope.required(str10, "sorted_dependents.customer_token");
                            } catch (Exception e) {
                                familyHomePresenter2.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, member != null ? Reflection.factory.getOrCreateKotlinClass(member.getClass()) : r13, familyParsingErrorFactory, r13), familyHomePresenter2.getOneErrorPerAppSessionStrategy());
                                str10 = r13;
                            }
                            DependentInfo dependentInfo = str10 != null ? new DependentInfo(member.sponsorship_tier, str10) : r13;
                            if (dependentInfo != null) {
                                arrayList4.add(dependentInfo);
                            }
                        } catch (Exception e2) {
                            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(member.getClass()), familyParsingErrorFactory, r13);
                        }
                    }
                    arrayList = arrayList4;
                }
                rememberedValue = r8.rememberedValue();
                if (rememberedValue == obj2) {
                    rememberedValue = familyHomePresenter2.profileManager.publicProfile();
                    r8.updateRememberedValue(rememberedValue);
                }
                gapComposer = r8;
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
                RealCustomerStore realCustomerStore2 = familyHomePresenter2.customerStore;
                if (arrayList != null) {
                    gapComposer.startReplaceGroup(-731806586);
                    gapComposer.end(false);
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayList5.add(r13);
                    realCustomerStore = realCustomerStore2;
                    i2 = 10;
                    list = arrayList5;
                } else {
                    gapComposer.startReplaceGroup(-731778560);
                    boolean changed5 = gapComposer.changed(arrayList);
                    Object rememberedValue14 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue14 == obj2) {
                        if (arrayList.isEmpty()) {
                            cardModelView$textures$$inlined$combine$1 = new AppLockMonitor$special$$inlined$map$2(EmptyList.INSTANCE, 19);
                            c = 2;
                        } else {
                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (DependentInfo dependentInfo2 : arrayList) {
                                SponsorshipTier sponsorshipTier = dependentInfo2.sponsorshipTier;
                                String str11 = dependentInfo2.customerToken;
                                arrayList6.add(new RealActivityInvitePresenter(12, realCustomerStore2.getCustomerForId(str11), str11, sponsorshipTier));
                            }
                            Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList6).toArray(new Flow[0]);
                            c = 2;
                            cardModelView$textures$$inlined$combine$1 = new CardModelView$textures$$inlined$combine$1(flowArr, 2);
                        }
                        gapComposer.updateRememberedValue(cardModelView$textures$$inlined$combine$1);
                    } else {
                        cardModelView$textures$$inlined$combine$1 = rememberedValue14;
                        c = 2;
                    }
                    Flow flow2 = (Flow) cardModelView$textures$$inlined$combine$1;
                    int size = arrayList.size();
                    ArrayList arrayList7 = new ArrayList(size);
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList7.add(null);
                    }
                    realCustomerStore = realCustomerStore2;
                    i2 = 10;
                    List list7 = (List) Updater.collectAsState(flow2, arrayList7, null, gapComposer, 0, 2).getValue();
                    gapComposer.end(false);
                    list = list7;
                }
                List list8 = list;
                if (arrayList == null) {
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, i2));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((DependentInfo) it4.next()).customerToken);
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    gapComposer.startReplaceGroup(-1210136222);
                    gapComposer.end(false);
                    r7 = realCustomerStore;
                    linkedHashMap = null;
                } else {
                    gapComposer.startReplaceGroup(-1210136221);
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, i2));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(mapCapacity);
                    for (Object obj3 : arrayList2) {
                        Duration.Companion.getClass();
                        linkedHashMap6.put(obj3, familyHomePresenter2.dependentBalanceStore.m3530cashBalancehhJSO8g((String) obj3, new Duration(Duration.INFINITE), gapComposer, 0));
                        realCustomerStore = realCustomerStore;
                    }
                    r7 = realCustomerStore;
                    gapComposer.end(false);
                    linkedHashMap = linkedHashMap6;
                }
                if (linkedHashMap != null || (values = linkedHashMap.values()) == null) {
                    z = false;
                } else {
                    Collection<DependentBalance> collection = values;
                    if (!collection.isEmpty()) {
                        for (DependentBalance dependentBalance : collection) {
                            if (!((dependentBalance != null ? dependentBalance.state : null) instanceof DependentBalance.LoadingState.BalanceLoaded)) {
                                z8 = false;
                                break;
                            }
                        }
                    }
                    z8 = true;
                    z = z8;
                }
                changed = gapComposer.changed((FamilyAccountsParameters) mutableState.getValue());
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed || rememberedValue2 == obj2) {
                    familyAccountsParameters2 = (FamilyAccountsParameters) mutableState.getValue();
                    if (familyAccountsParameters2 != null && (pendingRequestSection = familyAccountsParameters2.pending_request_section) != null) {
                        zztjVar = pendingRequestSection.f1243type;
                        if (zztjVar != null) {
                            PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest = zztjVar instanceof PendingRequestSection$Type$PendingRequest ? (PendingRequestSection$Type$PendingRequest) zztjVar : null;
                            if (pendingRequestSection$Type$PendingRequest != null) {
                                pendingRequest = pendingRequestSection$Type$PendingRequest.value;
                                if (pendingRequest != null) {
                                    if (zztjVar != null) {
                                        PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest2 = zztjVar instanceof PendingRequestSection$Type$PendingRequest ? (PendingRequestSection$Type$PendingRequest) zztjVar : null;
                                        if (pendingRequestSection$Type$PendingRequest2 != null) {
                                            pendingRequest2 = pendingRequestSection$Type$PendingRequest2.value;
                                            pendingRequest2.getClass();
                                            str = pendingRequest2.requester_customer_token;
                                            if (str != null) {
                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(str);
                                            }
                                        }
                                    }
                                    pendingRequest2 = null;
                                    pendingRequest2.getClass();
                                    str = pendingRequest2.requester_customer_token;
                                    if (str != null) {
                                    }
                                } else {
                                    if (zztjVar != null) {
                                        PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                                        if (pendingRequestSection$Type$MultiplePendingRequestsRow != null) {
                                            multiplePendingRequestsRow = pendingRequestSection$Type$MultiplePendingRequestsRow.value;
                                            if (multiplePendingRequestsRow != null) {
                                                a$$ExternalSyntheticBUOutline0.m$3("PendingRequestSection has neither pending_request nor multiple_pending_requests_row");
                                                return null;
                                            }
                                            if (zztjVar != null) {
                                                PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow2 = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                                                if (pendingRequestSection$Type$MultiplePendingRequestsRow2 != null) {
                                                    multiplePendingRequestsRow2 = pendingRequestSection$Type$MultiplePendingRequestsRow2.value;
                                                    multiplePendingRequestsRow2.getClass();
                                                    list2 = multiplePendingRequestsRow2.subtitle_customer_tokens;
                                                }
                                            }
                                            multiplePendingRequestsRow2 = null;
                                            multiplePendingRequestsRow2.getClass();
                                            list2 = multiplePendingRequestsRow2.subtitle_customer_tokens;
                                        }
                                    }
                                    multiplePendingRequestsRow = null;
                                    if (multiplePendingRequestsRow != null) {
                                    }
                                }
                                list3 = list2;
                                if (list3 != null || list3.isEmpty()) {
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(emptyMap, 19);
                                } else {
                                    rememberedValue2 = new Transform$special$$inlined$map$1(r7.getCustomersForIds(list2), list2, 4);
                                }
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                        }
                        pendingRequest = null;
                        if (pendingRequest != null) {
                        }
                        list3 = list2;
                        if (list3 != null) {
                        }
                        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                        emptyMap2.getClass();
                        rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(emptyMap2, 19);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    list2 = null;
                    list3 = list2;
                    if (list3 != null) {
                    }
                    EmptyMap emptyMap22 = EmptyMap.INSTANCE;
                    emptyMap22.getClass();
                    rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(emptyMap22, 19);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Flow flow3 = (Flow) rememberedValue2;
                EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                emptyMap3.getClass();
                MutableState collectAsState2 = Updater.collectAsState(flow3, emptyMap3, null, gapComposer, 48, 2);
                changed2 = gapComposer.changed((FamilyAccountsParameters) mutableState.getValue());
                rememberedValue3 = gapComposer.rememberedValue();
                if (!changed2 || rememberedValue3 == obj2) {
                    familyAccountsParameters3 = (FamilyAccountsParameters) mutableState.getValue();
                    if (familyAccountsParameters3 != null || (list4 = familyAccountsParameters3.pending_invitations) == null) {
                        r1 = EmptyList.INSTANCE;
                    } else {
                        r1 = new ArrayList();
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            String str12 = ((PendingRequest) it5.next()).requester_customer_token;
                            if (str12 != null) {
                                r1.add(str12);
                            }
                        }
                    }
                    if (r1.isEmpty()) {
                        EmptyMap emptyMap4 = EmptyMap.INSTANCE;
                        emptyMap4.getClass();
                        rememberedValue3 = new AppLockMonitor$special$$inlined$map$2(emptyMap4, 19);
                    } else {
                        rememberedValue3 = new Transform$special$$inlined$map$1(r7.getCustomersForIds(r1), r1, 4);
                    }
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Flow flow4 = (Flow) rememberedValue3;
                EmptyMap emptyMap5 = EmptyMap.INSTANCE;
                emptyMap5.getClass();
                MutableState collectAsState3 = Updater.collectAsState(flow4, emptyMap5, null, gapComposer, 48, 2);
                familyAccountsParameters4 = (FamilyAccountsParameters) mutableState.getValue();
                AndroidStringManager androidStringManager3 = familyHomePresenter2.stringManager;
                if (familyAccountsParameters4 != null) {
                    List list9 = familyAccountsParameters4.sections;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = list9.iterator();
                    while (it6.hasNext()) {
                        Section section2 = (Section) it6.next();
                        try {
                            ProtoValidationScope protoValidationScope = new ProtoValidationScope(section2, familyParsingErrorFactory, familyHomePresenter2);
                            Iterator it7 = it6;
                            MutableState mutableState12 = collectAsState;
                            String str13 = (String) protoValidationScope.reportIfNullAndContinue("section.header_text", (String) null, section2.header_text);
                            if (str13 == null) {
                                mutableState7 = collectAsState3;
                                gapComposer4 = gapComposer;
                                sessionManager2 = sessionManager3;
                                linkedHashMap5 = linkedHashMap;
                                z7 = z;
                                mutableState8 = mutableState;
                                familyListSection = null;
                            } else {
                                Section.HeaderButton headerButton = section2.header_button;
                                String str14 = headerButton != null ? headerButton.title : null;
                                String str15 = headerButton != null ? headerButton.url : null;
                                sessionManager2 = sessionManager3;
                                List list10 = section2.groups;
                                section = section2;
                                try {
                                    linkedHashMap5 = linkedHashMap;
                                    z7 = z;
                                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                                    Iterator it8 = list10.iterator();
                                    while (it8.hasNext()) {
                                        List list11 = ((Section.Group) it8.next()).items;
                                        ArrayList arrayList10 = new ArrayList();
                                        Iterator it9 = list11.iterator();
                                        while (it9.hasNext()) {
                                            Iterator it10 = it8;
                                            Section.Group.RowItem rowItem = (Section.Group.RowItem) it9.next();
                                            Iterator it11 = it9;
                                            try {
                                                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(rowItem, familyParsingErrorFactory, protoValidationScope);
                                                ProtoValidationScope protoValidationScope3 = protoValidationScope;
                                                GapComposer gapComposer5 = gapComposer;
                                                Icon icon = (Icon) protoValidationScope2.reportIfNullAndContinue("section.group.item.arcade_icon", (String) null, rowItem.arcade_icon);
                                                if (icon == null) {
                                                    mutableState9 = collectAsState3;
                                                } else {
                                                    mutableState9 = collectAsState3;
                                                    String str16 = (String) protoValidationScope2.reportIfNullAndContinue("section.group.item.title", (String) null, rowItem.title);
                                                    if (str16 != null) {
                                                        mutableState10 = mutableState;
                                                        String str17 = (String) protoValidationScope2.reportIfNullAndContinue("section.group.item.url", (String) null, rowItem.url);
                                                        if (str17 != null) {
                                                            loaded = new FamilyListItem.Loaded(icon, str16, str17, rowItem.analytical_identifier);
                                                            if (loaded != null) {
                                                                arrayList10.add(loaded);
                                                            }
                                                            it9 = it11;
                                                            it8 = it10;
                                                            protoValidationScope = protoValidationScope3;
                                                            gapComposer = gapComposer5;
                                                            collectAsState3 = mutableState9;
                                                            mutableState = mutableState10;
                                                        }
                                                        loaded = null;
                                                        if (loaded != null) {
                                                        }
                                                        it9 = it11;
                                                        it8 = it10;
                                                        protoValidationScope = protoValidationScope3;
                                                        gapComposer = gapComposer5;
                                                        collectAsState3 = mutableState9;
                                                        mutableState = mutableState10;
                                                    }
                                                }
                                                mutableState10 = mutableState;
                                                loaded = null;
                                                if (loaded != null) {
                                                }
                                                it9 = it11;
                                                it8 = it10;
                                                protoValidationScope = protoValidationScope3;
                                                gapComposer = gapComposer5;
                                                collectAsState3 = mutableState9;
                                                mutableState = mutableState10;
                                            } catch (Exception e3) {
                                                throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(rowItem.getClass()), familyParsingErrorFactory, null);
                                            }
                                        }
                                        arrayList9.add(new FamilyListGroup(arrayList10));
                                        it8 = it8;
                                        protoValidationScope = protoValidationScope;
                                        gapComposer = gapComposer;
                                        collectAsState3 = collectAsState3;
                                        mutableState = mutableState;
                                    }
                                    mutableState7 = collectAsState3;
                                    gapComposer4 = gapComposer;
                                    mutableState8 = mutableState;
                                    familyListSection = new FamilyListSection(str13, str14, str15, arrayList9);
                                } catch (Exception e4) {
                                    e = e4;
                                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(section.getClass()), familyParsingErrorFactory, null);
                                }
                            }
                            if (familyListSection != null) {
                                arrayList8.add(familyListSection);
                            }
                            familyHomePresenter2 = this;
                            it6 = it7;
                            collectAsState = mutableState12;
                            sessionManager3 = sessionManager2;
                            linkedHashMap = linkedHashMap5;
                            z = z7;
                            gapComposer = gapComposer4;
                            collectAsState3 = mutableState7;
                            mutableState = mutableState8;
                        } catch (Exception e5) {
                            e = e5;
                            section = section2;
                        }
                    }
                    mutableState2 = collectAsState3;
                    gapComposer2 = gapComposer;
                    mutableState3 = collectAsState;
                    sessionManager = sessionManager3;
                    linkedHashMap2 = linkedHashMap;
                    z2 = z;
                    mutableState4 = mutableState;
                    c2 = 3;
                    list5 = arrayList8;
                } else {
                    mutableState2 = collectAsState3;
                    gapComposer2 = gapComposer;
                    mutableState3 = collectAsState;
                    sessionManager = sessionManager3;
                    linkedHashMap2 = linkedHashMap;
                    z2 = z;
                    mutableState4 = mutableState;
                    String str18 = androidStringManager3.get(R.string.family_home_sponsor_resources_section_default_header);
                    c2 = 3;
                    ArrayList arrayList11 = new ArrayList(3);
                    int i6 = 0;
                    while (true) {
                        loading = FamilyListItem.Loading.INSTANCE;
                        if (i6 >= 3) {
                            break;
                        }
                        arrayList11.add(loading);
                        i6++;
                    }
                    list5 = CollectionsKt__CollectionsJVMKt.listOf(new FamilyListSection(str18, null, null, CollectionsKt__CollectionsKt.listOf((Object[]) new FamilyListGroup[]{new FamilyListGroup(arrayList11), new FamilyListGroup(CollectionsKt__CollectionsJVMKt.listOf(loading))})));
                }
                List list12 = list5;
                rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == obj2) {
                    familyHomePresenter = this;
                    mutableState5 = mutableState4;
                    rememberedValue4 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(4, familyHomePresenter, mutableState5, mutableState2));
                    gapComposer3 = gapComposer2;
                    gapComposer3.updateRememberedValue(rememberedValue4);
                } else {
                    familyHomePresenter = this;
                    gapComposer3 = gapComposer2;
                    mutableState5 = mutableState4;
                }
                State state2 = (State) rememberedValue4;
                rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == obj2) {
                    rememberedValue5 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state2, 25));
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                State state3 = (State) rememberedValue5;
                familyAccountsParameters5 = (FamilyAccountsParameters) mutableState5.getValue();
                if (familyAccountsParameters5 != null && (pendingRequestSection5 = familyAccountsParameters5.pending_request_section) != null && (zztjVar3 = pendingRequestSection5.f1243type) != null) {
                    PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest3 = !(zztjVar3 instanceof PendingRequestSection$Type$PendingRequest) ? (PendingRequestSection$Type$PendingRequest) zztjVar3 : null;
                    pendingRequest4 = pendingRequestSection$Type$PendingRequest3 == null ? pendingRequestSection$Type$PendingRequest3.value : null;
                    if (pendingRequest4 != null) {
                        str2 = pendingRequest4.activity_row_id;
                        familyAccountsParameters6 = (FamilyAccountsParameters) mutableState5.getValue();
                        if (familyAccountsParameters6 != null && (pendingRequestSection4 = familyAccountsParameters6.pending_request_section) != null && (zztjVar2 = pendingRequestSection4.f1243type) != null) {
                            PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest4 = !(zztjVar2 instanceof PendingRequestSection$Type$PendingRequest) ? (PendingRequestSection$Type$PendingRequest) zztjVar2 : null;
                            pendingRequest3 = pendingRequestSection$Type$PendingRequest4 == null ? pendingRequestSection$Type$PendingRequest4.value : null;
                            if (pendingRequest3 != null && (viewRequestLink = pendingRequest3.request_action_link) != null) {
                                str3 = viewRequestLink.url;
                                RealPendingRequestActivityManager realPendingRequestActivityManager = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
                                PendingRequestActivityState rememberPendingRequestActivityState = realPendingRequestActivityManager.rememberPendingRequestActivityState(str2, str3, gapComposer3);
                                z3 = rememberPendingRequestActivityState instanceof PendingRequestActivityState.Loaded;
                                if (z3) {
                                    androidStringManager = androidStringManager3;
                                    state = state2;
                                    gapComposer3.startReplaceGroup(-1205169278);
                                    gapComposer3.end(false);
                                    uiCallbackModel = null;
                                } else {
                                    gapComposer3.startReplaceGroup(-1205555289);
                                    PendingRequestActivityState.Loaded loaded2 = (PendingRequestActivityState.Loaded) rememberPendingRequestActivityState;
                                    GapComposer gapComposer6 = gapComposer3;
                                    androidStringManager = androidStringManager3;
                                    state = state2;
                                    uiCallbackModel = realPendingRequestActivityManager.createActivityUiCallbackModel(loaded2.activityItem, familyHomePresenter.navigator, familyHomePresenter.args, loaded2.buttonUrl, familyHomePresenter.defaultActivityItemEventHandlerFactory, familyHomePresenter.routerFactory, gapComposer6);
                                    gapComposer3 = gapComposer6;
                                    gapComposer3.end(false);
                                }
                                changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState) | gapComposer3.changed((Map) collectAsState2.getValue()) | gapComposer3.changed(uiCallbackModel);
                                rememberedValue6 = gapComposer3.rememberedValue();
                                if (!changed3 || rememberedValue6 == obj2) {
                                    familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
                                    FamilyPendingRequestsSection.OnePendingRequest onePendingRequest = loadingPendingRequestSection;
                                    if (familyAccountsParameters7 != null) {
                                        if (str2 != null) {
                                            if (!(rememberPendingRequestActivityState instanceof PendingRequestActivityState.Loading)) {
                                                if (!z3) {
                                                    if (!(rememberPendingRequestActivityState instanceof PendingRequestActivityState.Failed)) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    FamilyAccountsParameters familyAccountsParameters11 = (FamilyAccountsParameters) mutableState5.getValue();
                                                    if (familyAccountsParameters11 != null && (pendingRequestSection3 = familyAccountsParameters11.pending_request_section) != null) {
                                                        familyPendingRequestsSection = familyHomePresenter.toFamilyPendingRequestsSection(pendingRequestSection3, (Map) collectAsState2.getValue());
                                                    }
                                                } else if (uiCallbackModel != null) {
                                                    familyPendingRequestsSection = new FamilyPendingRequestsSection.OnePendingActivity(uiCallbackModel, ((PendingRequestActivityState.Loaded) rememberPendingRequestActivityState).buttonUrl);
                                                }
                                                gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                                                rememberedValue6 = familyPendingRequestsSection;
                                            }
                                            familyPendingRequestsSection = null;
                                            gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                                            rememberedValue6 = familyPendingRequestsSection;
                                        } else {
                                            FamilyAccountsParameters familyAccountsParameters12 = (FamilyAccountsParameters) mutableState5.getValue();
                                            if (familyAccountsParameters12 != null && (pendingRequestSection2 = familyAccountsParameters12.pending_request_section) != null) {
                                                familyPendingRequestsSection = familyHomePresenter.toFamilyPendingRequestsSection(pendingRequestSection2, (Map) collectAsState2.getValue());
                                                gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                                                rememberedValue6 = familyPendingRequestsSection;
                                            }
                                            familyPendingRequestsSection = null;
                                            gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                                            rememberedValue6 = familyPendingRequestsSection;
                                        }
                                    }
                                    familyPendingRequestsSection = onePendingRequest;
                                    gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                                    rememberedValue6 = familyPendingRequestsSection;
                                }
                                FamilyPendingRequestsSection familyPendingRequestsSection2 = (FamilyPendingRequestsSection) rememberedValue6;
                                str4 = familyHomePresenter.args.highlightedDependentToken;
                                List<DependentDetails> list13 = list8;
                                arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13, 10));
                                for (it = list13.iterator(); it.hasNext(); it = it3) {
                                    DependentDetails dependentDetails = (DependentDetails) it.next();
                                    if (dependentDetails != null) {
                                        SponsorshipTier sponsorshipTier2 = dependentDetails.sponsorshipTier;
                                        String str19 = dependentDetails.customerToken;
                                        Recipient recipient2 = dependentDetails.recipient;
                                        if (recipient2 != null) {
                                            String familyDisplayName = familyDisplayName(recipient2);
                                            String familyDisplayName2 = familyDisplayName(recipient2);
                                            MerchantData merchantData = recipient2.merchantData;
                                            String str20 = recipient2.threadedCustomerId;
                                            String str21 = recipient2.fullName;
                                            it3 = it;
                                            ColorModel.Accented accented = new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor(str20, str19, str21, recipient2.sms, recipient2.email)));
                                            if (str21 == null || (str6 = StringsKt.trim(str21).toString()) == null || StringsKt.isBlank(str6)) {
                                                str6 = null;
                                            }
                                            if (str6 == null) {
                                                if (familyDisplayName2 != null && (str6 = StringsKt.trim(familyDisplayName2).toString()) != null) {
                                                    if (StringsKt.isBlank(str6)) {
                                                        str6 = null;
                                                    }
                                                    if (str6 != null) {
                                                        int length = str6.length();
                                                        int i7 = 0;
                                                        while (true) {
                                                            if (i7 >= length) {
                                                                i7 = -1;
                                                                break;
                                                            }
                                                            if (Character.isLetter(str6.charAt(i7))) {
                                                                break;
                                                            }
                                                            i7++;
                                                        }
                                                        if (i7 > 0) {
                                                            str6 = str6.substring(i7);
                                                        }
                                                    }
                                                }
                                                str6 = null;
                                            }
                                            Character monogram = str6 != null ? GrpcStatus.Companion.monogram(str6) : null;
                                            Image image2 = recipient2.photo;
                                            ColorModel model$default = MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse);
                                            if (merchantData != null) {
                                                image = image2;
                                                z6 = Intrinsics.areEqual(merchantData.should_colorize_avatar, Boolean.TRUE);
                                            } else {
                                                image = image2;
                                                z6 = false;
                                            }
                                            StackedAvatarViewModel.Avatar avatar2 = new StackedAvatarViewModel.Avatar(accented, monogram, familyDisplayName2, image, null, z6 ? model$default : null, ((merchantData != null ? Intrinsics.areEqual(merchantData.should_fill_background, Boolean.TRUE) : false) || recipient2.isCashCustomer) ? accented : null, recipient2.isFavorite, recipient2.isSponsorAllowlisted, false, 3120);
                                            z5 = z2;
                                            if (z5) {
                                                r6 = linkedHashMap2;
                                                DependentBalance dependentBalance2 = (DependentBalance) r6.get(str19);
                                                DependentBalance.LoadingState loadingState = dependentBalance2 != null ? dependentBalance2.state : null;
                                                DependentBalance.LoadingState.BalanceLoaded balanceLoaded = loadingState instanceof DependentBalance.LoadingState.BalanceLoaded ? (DependentBalance.LoadingState.BalanceLoaded) loadingState : null;
                                                if (balanceLoaded != null) {
                                                    str7 = familyHomePresenter.balanceMoneyFormatter.format(balanceLoaded.amount);
                                                    linkedHashMap4 = r6;
                                                    i4 = sponsorshipTier2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[sponsorshipTier2.ordinal()];
                                                    if (i4 != -1) {
                                                        androidStringManager2 = androidStringManager;
                                                    } else if (i4 == 1 || i4 == 2) {
                                                        androidStringManager2 = androidStringManager;
                                                    } else {
                                                        if (i4 != 3) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                        androidStringManager2 = androidStringManager;
                                                        str8 = androidStringManager2.get(R.string.family_home_member_managed_account);
                                                        String str22 = str8;
                                                        firstName = recipient2.getFirstName();
                                                        if (StringsKt.isBlank(firstName)) {
                                                            firstName = familyDisplayName;
                                                        }
                                                        familyMemberRowViewModel = new FamilyMemberRowViewModel(str19, avatar2, familyDisplayName, str7, str22, new FamilyHomeViewEvent.TapDependent(sponsorshipTier2, str19, firstName), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) familyHomePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UpdatedMembersRowsInFamiliesApplet.INSTANCE)).enabled(), 128);
                                                        linkedHashMap3 = linkedHashMap4;
                                                        arrayList3.add(familyMemberRowViewModel);
                                                        z2 = z5;
                                                        linkedHashMap2 = linkedHashMap3;
                                                        androidStringManager = androidStringManager2;
                                                    }
                                                    str8 = androidStringManager2.get(R.string.family_home_member_sponsored_teen);
                                                    String str222 = str8;
                                                    firstName = recipient2.getFirstName();
                                                    if (StringsKt.isBlank(firstName)) {
                                                    }
                                                    familyMemberRowViewModel = new FamilyMemberRowViewModel(str19, avatar2, familyDisplayName, str7, str222, new FamilyHomeViewEvent.TapDependent(sponsorshipTier2, str19, firstName), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) familyHomePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UpdatedMembersRowsInFamiliesApplet.INSTANCE)).enabled(), 128);
                                                    linkedHashMap3 = linkedHashMap4;
                                                    arrayList3.add(familyMemberRowViewModel);
                                                    z2 = z5;
                                                    linkedHashMap2 = linkedHashMap3;
                                                    androidStringManager = androidStringManager2;
                                                }
                                            } else {
                                                r6 = linkedHashMap2;
                                                if (z5) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                            }
                                            str7 = null;
                                            linkedHashMap4 = r6;
                                            if (sponsorshipTier2 != null) {
                                            }
                                            if (i4 != -1) {
                                            }
                                            str8 = androidStringManager2.get(R.string.family_home_member_sponsored_teen);
                                            String str2222 = str8;
                                            firstName = recipient2.getFirstName();
                                            if (StringsKt.isBlank(firstName)) {
                                            }
                                            familyMemberRowViewModel = new FamilyMemberRowViewModel(str19, avatar2, familyDisplayName, str7, str2222, new FamilyHomeViewEvent.TapDependent(sponsorshipTier2, str19, firstName), ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) familyHomePresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UpdatedMembersRowsInFamiliesApplet.INSTANCE)).enabled(), 128);
                                            linkedHashMap3 = linkedHashMap4;
                                            arrayList3.add(familyMemberRowViewModel);
                                            z2 = z5;
                                            linkedHashMap2 = linkedHashMap3;
                                            androidStringManager = androidStringManager2;
                                        }
                                    }
                                    it3 = it;
                                    linkedHashMap3 = linkedHashMap2;
                                    z5 = z2;
                                    androidStringManager2 = androidStringManager;
                                    familyMemberRowViewModel = LOADING_MEMBER;
                                    arrayList3.add(familyMemberRowViewModel);
                                    z2 = z5;
                                    linkedHashMap2 = linkedHashMap3;
                                    androidStringManager = androidStringManager2;
                                }
                                AndroidStringManager androidStringManager4 = androidStringManager;
                                if (!arrayList3.isEmpty()) {
                                    Iterator it12 = arrayList3.iterator();
                                    while (it12.hasNext()) {
                                        if (((FamilyMemberRowViewModel) it12.next()).customerToken == null) {
                                            z4 = false;
                                            break;
                                        }
                                    }
                                }
                                z4 = true;
                                it2 = arrayList3.iterator();
                                i3 = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        i3 = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(((FamilyMemberRowViewModel) it2.next()).customerToken, str4)) {
                                        break;
                                    }
                                    i3++;
                                }
                                boolean z9 = !z4 && i3 >= 0;
                                changed4 = gapComposer3.changed(str4);
                                rememberedValue7 = gapComposer3.rememberedValue();
                                if (!changed4 || rememberedValue7 == obj2) {
                                    rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
                                }
                                mutableState6 = (MutableState) rememberedValue7;
                                if (((Boolean) mutableState6.getValue()).booleanValue() && z9) {
                                    gapComposer3.startReplaceGroup(-1201884703);
                                    boolean changed6 = gapComposer3.changed(mutableState6);
                                    Object rememberedValue15 = gapComposer3.rememberedValue();
                                    if (changed6 || rememberedValue15 == obj2) {
                                        str5 = null;
                                        rememberedValue15 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState6, null, 6);
                                        gapComposer3.updateRememberedValue(rememberedValue15);
                                    } else {
                                        str5 = null;
                                    }
                                    Updater.LaunchedEffect(gapComposer3, str4, (Function2) rememberedValue15);
                                    gapComposer3.end(false);
                                } else {
                                    str5 = null;
                                    gapComposer3.startReplaceGroup(-1201755929);
                                    gapComposer3.end(false);
                                }
                                if (str4 != null) {
                                    if (!((Boolean) mutableState6.getValue()).booleanValue() && z9) {
                                        ArrayList arrayList12 = new ArrayList();
                                        Iterator it13 = arrayList3.iterator();
                                        while (it13.hasNext()) {
                                            Object next = it13.next();
                                            if (!Intrinsics.areEqual(((FamilyMemberRowViewModel) next).customerToken, str4)) {
                                                arrayList12.add(next);
                                            }
                                        }
                                        arrayList3 = arrayList12;
                                    } else if (((Boolean) mutableState6.getValue()).booleanValue() && i3 >= 0) {
                                        Iterator it14 = arrayList3.iterator();
                                        while (it14.hasNext()) {
                                            FamilyMemberRowViewModel familyMemberRowViewModel2 = (FamilyMemberRowViewModel) it14.next();
                                            if (Intrinsics.areEqual(familyMemberRowViewModel2.customerToken, str4)) {
                                                ArrayList arrayList13 = new ArrayList();
                                                Iterator it15 = arrayList3.iterator();
                                                while (it15.hasNext()) {
                                                    Object next2 = it15.next();
                                                    if (!Intrinsics.areEqual(((FamilyMemberRowViewModel) next2).customerToken, str4)) {
                                                        arrayList13.add(next2);
                                                    }
                                                }
                                                String str23 = familyMemberRowViewModel2.customerToken;
                                                StackedAvatarViewModel.Avatar avatar3 = familyMemberRowViewModel2.avatar;
                                                String str24 = familyMemberRowViewModel2.fullName;
                                                String str25 = familyMemberRowViewModel2.balanceText;
                                                String str26 = familyMemberRowViewModel2.sponsorshipTierText;
                                                FamilyHomeViewEvent familyHomeViewEvent = familyMemberRowViewModel2.onClickEvent;
                                                boolean z10 = familyMemberRowViewModel2.cashForKidsUxEnabled;
                                                avatar3.getClass();
                                                arrayList3 = CollectionsKt.plus((Iterable) arrayList13, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new FamilyMemberRowViewModel(str23, avatar3, str24, str25, str26, familyHomeViewEvent, z10, true)));
                                            }
                                        }
                                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                                        return null;
                                    }
                                }
                                familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
                                if (familyAccountsParameters8 != null || (r0 = familyAccountsParameters8.title) == null) {
                                    String str27 = androidStringManager4.get(R.string.family_home_default_title);
                                }
                                String str28 = str27;
                                publicProfile = (PublicProfile) mutableState3.getValue();
                                StackedAvatarViewModel.Avatar avatar4 = LOADING_AVATAR;
                                if (publicProfile == null) {
                                    String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                                    if (activeAccountTokenOrNull2 == null) {
                                        activeAccountTokenOrNull2 = "";
                                    }
                                    ColorModel.Accented accented2 = new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, activeAccountTokenOrNull2, null, null, null)));
                                    Character monogram2 = GrpcStatus.Companion.monogram(publicProfile.fullName);
                                    String str29 = publicProfile.fullName;
                                    String str30 = publicProfile.photoUrl;
                                    avatar = new StackedAvatarViewModel.Avatar(accented2, monogram2, str29, str30 != null ? new Image(str30, str30, 4) : null, null, null, null, null, false, false, null, false, null, null, 131056);
                                } else {
                                    avatar = avatar4;
                                }
                                List listOf = CollectionsKt__CollectionsJVMKt.listOf(avatar);
                                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13, 10));
                                for (DependentDetails dependentDetails2 : list13) {
                                    arrayList14.add((dependentDetails2 == null || (recipient = dependentDetails2.recipient) == null) ? avatar4 : GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(recipient)));
                                }
                                ArrayList plus = CollectionsKt.plus((Iterable) arrayList14, (Collection) listOf);
                                FamilyPendingInvitesViewModel familyPendingInvitesViewModel = new FamilyPendingInvitesViewModel(androidStringManager4.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state3.getValue()).booleanValue());
                                String str31 = androidStringManager4.get(R.string.family_home_members_section_header);
                                FamilyAccountsParameters familyAccountsParameters13 = (FamilyAccountsParameters) mutableState5.getValue();
                                FamilyMemberSection familyMemberSection = new FamilyMemberSection(str31, (familyAccountsParameters13 != null || (inviteLink = familyAccountsParameters13.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
                                familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
                                if (familyAccountsParameters9 != null && (element = familyAccountsParameters9.upsell_element) != null && (abstractC0072Element = element.element) != null) {
                                    r4 = !(abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement) ? (FormBlocker.Element.AbstractC0072Element.UpsellElement) abstractC0072Element : str5;
                                    if (r4 != 0) {
                                        r41 = r4.getValue();
                                        FamilyHomeViewModel familyHomeViewModel = new FamilyHomeViewModel(str28, plus, familyPendingRequestsSection2, familyPendingInvitesViewModel, familyMemberSection, list12, r41);
                                        gapComposer3.end(false);
                                        return familyHomeViewModel;
                                    }
                                }
                                r41 = str5;
                                FamilyHomeViewModel familyHomeViewModel2 = new FamilyHomeViewModel(str28, plus, familyPendingRequestsSection2, familyPendingInvitesViewModel, familyMemberSection, list12, r41);
                                gapComposer3.end(false);
                                return familyHomeViewModel2;
                            }
                        }
                        str3 = null;
                        RealPendingRequestActivityManager realPendingRequestActivityManager2 = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
                        PendingRequestActivityState rememberPendingRequestActivityState2 = realPendingRequestActivityManager2.rememberPendingRequestActivityState(str2, str3, gapComposer3);
                        z3 = rememberPendingRequestActivityState2 instanceof PendingRequestActivityState.Loaded;
                        if (z3) {
                        }
                        changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState2) | gapComposer3.changed((Map) collectAsState2.getValue()) | gapComposer3.changed(uiCallbackModel);
                        rememberedValue6 = gapComposer3.rememberedValue();
                        if (!changed3) {
                        }
                        familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
                        FamilyPendingRequestsSection.OnePendingRequest onePendingRequest2 = loadingPendingRequestSection;
                        if (familyAccountsParameters7 != null) {
                        }
                        familyPendingRequestsSection = onePendingRequest2;
                        gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                        rememberedValue6 = familyPendingRequestsSection;
                        FamilyPendingRequestsSection familyPendingRequestsSection22 = (FamilyPendingRequestsSection) rememberedValue6;
                        str4 = familyHomePresenter.args.highlightedDependentToken;
                        List<DependentDetails> list132 = list8;
                        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list132, 10));
                        while (it.hasNext()) {
                        }
                        AndroidStringManager androidStringManager42 = androidStringManager;
                        if (!arrayList3.isEmpty()) {
                        }
                        z4 = true;
                        it2 = arrayList3.iterator();
                        i3 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                            }
                            i3++;
                        }
                        if (z4) {
                        }
                        changed4 = gapComposer3.changed(str4);
                        rememberedValue7 = gapComposer3.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
                        mutableState6 = (MutableState) rememberedValue7;
                        if (((Boolean) mutableState6.getValue()).booleanValue()) {
                        }
                        str5 = null;
                        gapComposer3.startReplaceGroup(-1201755929);
                        gapComposer3.end(false);
                        if (str4 != null) {
                        }
                        familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
                        if (familyAccountsParameters8 != null) {
                        }
                        String str272 = androidStringManager42.get(R.string.family_home_default_title);
                        String str282 = str272;
                        publicProfile = (PublicProfile) mutableState3.getValue();
                        StackedAvatarViewModel.Avatar avatar42 = LOADING_AVATAR;
                        if (publicProfile == null) {
                        }
                        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(avatar);
                        ArrayList arrayList142 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list132, 10));
                        while (r1.hasNext()) {
                        }
                        ArrayList plus2 = CollectionsKt.plus((Iterable) arrayList142, (Collection) listOf2);
                        FamilyPendingInvitesViewModel familyPendingInvitesViewModel2 = new FamilyPendingInvitesViewModel(androidStringManager42.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state3.getValue()).booleanValue());
                        String str312 = androidStringManager42.get(R.string.family_home_members_section_header);
                        FamilyAccountsParameters familyAccountsParameters132 = (FamilyAccountsParameters) mutableState5.getValue();
                        FamilyMemberSection familyMemberSection2 = new FamilyMemberSection(str312, (familyAccountsParameters132 != null || (inviteLink = familyAccountsParameters132.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
                        familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
                        if (familyAccountsParameters9 != null) {
                            if (!(abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement)) {
                            }
                            if (r4 != 0) {
                            }
                        }
                        r41 = str5;
                        FamilyHomeViewModel familyHomeViewModel22 = new FamilyHomeViewModel(str282, plus2, familyPendingRequestsSection22, familyPendingInvitesViewModel2, familyMemberSection2, list12, r41);
                        gapComposer3.end(false);
                        return familyHomeViewModel22;
                    }
                }
                str2 = null;
                familyAccountsParameters6 = (FamilyAccountsParameters) mutableState5.getValue();
                if (familyAccountsParameters6 != null) {
                    if (!(zztjVar2 instanceof PendingRequestSection$Type$PendingRequest)) {
                    }
                    if (pendingRequestSection$Type$PendingRequest4 == null) {
                    }
                    if (pendingRequest3 != null) {
                        str3 = viewRequestLink.url;
                        RealPendingRequestActivityManager realPendingRequestActivityManager22 = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
                        PendingRequestActivityState rememberPendingRequestActivityState22 = realPendingRequestActivityManager22.rememberPendingRequestActivityState(str2, str3, gapComposer3);
                        z3 = rememberPendingRequestActivityState22 instanceof PendingRequestActivityState.Loaded;
                        if (z3) {
                        }
                        changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState22) | gapComposer3.changed((Map) collectAsState2.getValue()) | gapComposer3.changed(uiCallbackModel);
                        rememberedValue6 = gapComposer3.rememberedValue();
                        if (!changed3) {
                        }
                        familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
                        FamilyPendingRequestsSection.OnePendingRequest onePendingRequest22 = loadingPendingRequestSection;
                        if (familyAccountsParameters7 != null) {
                        }
                        familyPendingRequestsSection = onePendingRequest22;
                        gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                        rememberedValue6 = familyPendingRequestsSection;
                        FamilyPendingRequestsSection familyPendingRequestsSection222 = (FamilyPendingRequestsSection) rememberedValue6;
                        str4 = familyHomePresenter.args.highlightedDependentToken;
                        List<DependentDetails> list1322 = list8;
                        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1322, 10));
                        while (it.hasNext()) {
                        }
                        AndroidStringManager androidStringManager422 = androidStringManager;
                        if (!arrayList3.isEmpty()) {
                        }
                        z4 = true;
                        it2 = arrayList3.iterator();
                        i3 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                            }
                            i3++;
                        }
                        if (z4) {
                        }
                        changed4 = gapComposer3.changed(str4);
                        rememberedValue7 = gapComposer3.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
                        mutableState6 = (MutableState) rememberedValue7;
                        if (((Boolean) mutableState6.getValue()).booleanValue()) {
                        }
                        str5 = null;
                        gapComposer3.startReplaceGroup(-1201755929);
                        gapComposer3.end(false);
                        if (str4 != null) {
                        }
                        familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
                        if (familyAccountsParameters8 != null) {
                        }
                        String str2722 = androidStringManager422.get(R.string.family_home_default_title);
                        String str2822 = str2722;
                        publicProfile = (PublicProfile) mutableState3.getValue();
                        StackedAvatarViewModel.Avatar avatar422 = LOADING_AVATAR;
                        if (publicProfile == null) {
                        }
                        List listOf22 = CollectionsKt__CollectionsJVMKt.listOf(avatar);
                        ArrayList arrayList1422 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1322, 10));
                        while (r1.hasNext()) {
                        }
                        ArrayList plus22 = CollectionsKt.plus((Iterable) arrayList1422, (Collection) listOf22);
                        FamilyPendingInvitesViewModel familyPendingInvitesViewModel22 = new FamilyPendingInvitesViewModel(androidStringManager422.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state3.getValue()).booleanValue());
                        String str3122 = androidStringManager422.get(R.string.family_home_members_section_header);
                        FamilyAccountsParameters familyAccountsParameters1322 = (FamilyAccountsParameters) mutableState5.getValue();
                        FamilyMemberSection familyMemberSection22 = new FamilyMemberSection(str3122, (familyAccountsParameters1322 != null || (inviteLink = familyAccountsParameters1322.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
                        familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
                        if (familyAccountsParameters9 != null) {
                        }
                        r41 = str5;
                        FamilyHomeViewModel familyHomeViewModel222 = new FamilyHomeViewModel(str2822, plus22, familyPendingRequestsSection222, familyPendingInvitesViewModel22, familyMemberSection22, list12, r41);
                        gapComposer3.end(false);
                        return familyHomeViewModel222;
                    }
                }
                str3 = null;
                RealPendingRequestActivityManager realPendingRequestActivityManager222 = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
                PendingRequestActivityState rememberPendingRequestActivityState222 = realPendingRequestActivityManager222.rememberPendingRequestActivityState(str2, str3, gapComposer3);
                z3 = rememberPendingRequestActivityState222 instanceof PendingRequestActivityState.Loaded;
                if (z3) {
                }
                changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState222) | gapComposer3.changed((Map) collectAsState2.getValue()) | gapComposer3.changed(uiCallbackModel);
                rememberedValue6 = gapComposer3.rememberedValue();
                if (!changed3) {
                }
                familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
                FamilyPendingRequestsSection.OnePendingRequest onePendingRequest222 = loadingPendingRequestSection;
                if (familyAccountsParameters7 != null) {
                }
                familyPendingRequestsSection = onePendingRequest222;
                gapComposer3.updateRememberedValue(familyPendingRequestsSection);
                rememberedValue6 = familyPendingRequestsSection;
                FamilyPendingRequestsSection familyPendingRequestsSection2222 = (FamilyPendingRequestsSection) rememberedValue6;
                str4 = familyHomePresenter.args.highlightedDependentToken;
                List<DependentDetails> list13222 = list8;
                arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13222, 10));
                while (it.hasNext()) {
                }
                AndroidStringManager androidStringManager4222 = androidStringManager;
                if (!arrayList3.isEmpty()) {
                }
                z4 = true;
                it2 = arrayList3.iterator();
                i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                    }
                    i3++;
                }
                if (z4) {
                }
                changed4 = gapComposer3.changed(str4);
                rememberedValue7 = gapComposer3.rememberedValue();
                if (!changed4) {
                }
                rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
                mutableState6 = (MutableState) rememberedValue7;
                if (((Boolean) mutableState6.getValue()).booleanValue()) {
                }
                str5 = null;
                gapComposer3.startReplaceGroup(-1201755929);
                gapComposer3.end(false);
                if (str4 != null) {
                }
                familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
                if (familyAccountsParameters8 != null) {
                }
                String str27222 = androidStringManager4222.get(R.string.family_home_default_title);
                String str28222 = str27222;
                publicProfile = (PublicProfile) mutableState3.getValue();
                StackedAvatarViewModel.Avatar avatar4222 = LOADING_AVATAR;
                if (publicProfile == null) {
                }
                List listOf222 = CollectionsKt__CollectionsJVMKt.listOf(avatar);
                ArrayList arrayList14222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13222, 10));
                while (r1.hasNext()) {
                }
                ArrayList plus222 = CollectionsKt.plus((Iterable) arrayList14222, (Collection) listOf222);
                FamilyPendingInvitesViewModel familyPendingInvitesViewModel222 = new FamilyPendingInvitesViewModel(androidStringManager4222.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state3.getValue()).booleanValue());
                String str31222 = androidStringManager4222.get(R.string.family_home_members_section_header);
                FamilyAccountsParameters familyAccountsParameters13222 = (FamilyAccountsParameters) mutableState5.getValue();
                FamilyMemberSection familyMemberSection222 = new FamilyMemberSection(str31222, (familyAccountsParameters13222 != null || (inviteLink = familyAccountsParameters13222.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
                familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
                if (familyAccountsParameters9 != null) {
                }
                r41 = str5;
                FamilyHomeViewModel familyHomeViewModel2222 = new FamilyHomeViewModel(str28222, plus222, familyPendingRequestsSection2222, familyPendingInvitesViewModel222, familyMemberSection222, list12, r41);
                gapComposer3.end(false);
                return familyHomeViewModel2222;
            }
        }
        onDemandMessageData = r13;
        if (onDemandMessageData != null) {
        }
        RealIdvPresenter$models$1$1 realIdvPresenter$models$1$12 = new RealIdvPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) str9, (Object) produceState, mutableState11, 26);
        FamilyHomePresenter familyHomePresenter22 = this;
        mutableState = mutableState11;
        Updater.LaunchedEffect((Composer) r8, flow, realIdvPresenter$models$1$12);
        familyAccountsParameters = (FamilyAccountsParameters) mutableState.getValue();
        FamilyParsingErrorFactory familyParsingErrorFactory2 = FamilyParsingErrorFactory.INSTANCE;
        if (familyAccountsParameters != null) {
        }
        arrayList = r13;
        rememberedValue = r8.rememberedValue();
        if (rememberedValue == obj2) {
        }
        gapComposer = r8;
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        RealCustomerStore realCustomerStore22 = familyHomePresenter22.customerStore;
        if (arrayList != null) {
        }
        List list82 = list;
        if (arrayList == null) {
        }
        if (arrayList2 != null) {
        }
        if (linkedHashMap != null) {
        }
        z = false;
        changed = gapComposer.changed((FamilyAccountsParameters) mutableState.getValue());
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changed) {
        }
        familyAccountsParameters2 = (FamilyAccountsParameters) mutableState.getValue();
        if (familyAccountsParameters2 != null) {
            zztjVar = pendingRequestSection.f1243type;
            if (zztjVar != null) {
            }
            pendingRequest = null;
            if (pendingRequest != null) {
            }
            list3 = list2;
            if (list3 != null) {
            }
            EmptyMap emptyMap222 = EmptyMap.INSTANCE;
            emptyMap222.getClass();
            rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(emptyMap222, 19);
            gapComposer.updateRememberedValue(rememberedValue2);
            Flow flow32 = (Flow) rememberedValue2;
            EmptyMap emptyMap32 = EmptyMap.INSTANCE;
            emptyMap32.getClass();
            MutableState collectAsState22 = Updater.collectAsState(flow32, emptyMap32, null, gapComposer, 48, 2);
            changed2 = gapComposer.changed((FamilyAccountsParameters) mutableState.getValue());
            rememberedValue3 = gapComposer.rememberedValue();
            if (!changed2) {
            }
            familyAccountsParameters3 = (FamilyAccountsParameters) mutableState.getValue();
            if (familyAccountsParameters3 != null) {
            }
            r1 = EmptyList.INSTANCE;
            if (r1.isEmpty()) {
            }
            gapComposer.updateRememberedValue(rememberedValue3);
            Flow flow42 = (Flow) rememberedValue3;
            EmptyMap emptyMap52 = EmptyMap.INSTANCE;
            emptyMap52.getClass();
            MutableState collectAsState32 = Updater.collectAsState(flow42, emptyMap52, null, gapComposer, 48, 2);
            familyAccountsParameters4 = (FamilyAccountsParameters) mutableState.getValue();
            AndroidStringManager androidStringManager32 = familyHomePresenter22.stringManager;
            if (familyAccountsParameters4 != null) {
            }
            List list122 = list5;
            rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj2) {
            }
            State state22 = (State) rememberedValue4;
            rememberedValue5 = gapComposer3.rememberedValue();
            if (rememberedValue5 == obj2) {
            }
            State state32 = (State) rememberedValue5;
            familyAccountsParameters5 = (FamilyAccountsParameters) mutableState5.getValue();
            if (familyAccountsParameters5 != null) {
                if (!(zztjVar3 instanceof PendingRequestSection$Type$PendingRequest)) {
                }
                if (pendingRequestSection$Type$PendingRequest3 == null) {
                }
                if (pendingRequest4 != null) {
                }
            }
            str2 = null;
            familyAccountsParameters6 = (FamilyAccountsParameters) mutableState5.getValue();
            if (familyAccountsParameters6 != null) {
            }
            str3 = null;
            RealPendingRequestActivityManager realPendingRequestActivityManager2222 = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
            PendingRequestActivityState rememberPendingRequestActivityState2222 = realPendingRequestActivityManager2222.rememberPendingRequestActivityState(str2, str3, gapComposer3);
            z3 = rememberPendingRequestActivityState2222 instanceof PendingRequestActivityState.Loaded;
            if (z3) {
            }
            changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState2222) | gapComposer3.changed((Map) collectAsState22.getValue()) | gapComposer3.changed(uiCallbackModel);
            rememberedValue6 = gapComposer3.rememberedValue();
            if (!changed3) {
            }
            familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
            FamilyPendingRequestsSection.OnePendingRequest onePendingRequest2222 = loadingPendingRequestSection;
            if (familyAccountsParameters7 != null) {
            }
            familyPendingRequestsSection = onePendingRequest2222;
            gapComposer3.updateRememberedValue(familyPendingRequestsSection);
            rememberedValue6 = familyPendingRequestsSection;
            FamilyPendingRequestsSection familyPendingRequestsSection22222 = (FamilyPendingRequestsSection) rememberedValue6;
            str4 = familyHomePresenter.args.highlightedDependentToken;
            List<DependentDetails> list132222 = list82;
            arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list132222, 10));
            while (it.hasNext()) {
            }
            AndroidStringManager androidStringManager42222 = androidStringManager;
            if (!arrayList3.isEmpty()) {
            }
            z4 = true;
            it2 = arrayList3.iterator();
            i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                }
                i3++;
            }
            if (z4) {
            }
            changed4 = gapComposer3.changed(str4);
            rememberedValue7 = gapComposer3.rememberedValue();
            if (!changed4) {
            }
            rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
            mutableState6 = (MutableState) rememberedValue7;
            if (((Boolean) mutableState6.getValue()).booleanValue()) {
            }
            str5 = null;
            gapComposer3.startReplaceGroup(-1201755929);
            gapComposer3.end(false);
            if (str4 != null) {
            }
            familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
            if (familyAccountsParameters8 != null) {
            }
            String str272222 = androidStringManager42222.get(R.string.family_home_default_title);
            String str282222 = str272222;
            publicProfile = (PublicProfile) mutableState3.getValue();
            StackedAvatarViewModel.Avatar avatar42222 = LOADING_AVATAR;
            if (publicProfile == null) {
            }
            List listOf2222 = CollectionsKt__CollectionsJVMKt.listOf(avatar);
            ArrayList arrayList142222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list132222, 10));
            while (r1.hasNext()) {
            }
            ArrayList plus2222 = CollectionsKt.plus((Iterable) arrayList142222, (Collection) listOf2222);
            FamilyPendingInvitesViewModel familyPendingInvitesViewModel2222 = new FamilyPendingInvitesViewModel(androidStringManager42222.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state32.getValue()).booleanValue());
            String str312222 = androidStringManager42222.get(R.string.family_home_members_section_header);
            FamilyAccountsParameters familyAccountsParameters132222 = (FamilyAccountsParameters) mutableState5.getValue();
            FamilyMemberSection familyMemberSection2222 = new FamilyMemberSection(str312222, (familyAccountsParameters132222 != null || (inviteLink = familyAccountsParameters132222.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
            familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
            if (familyAccountsParameters9 != null) {
            }
            r41 = str5;
            FamilyHomeViewModel familyHomeViewModel22222 = new FamilyHomeViewModel(str282222, plus2222, familyPendingRequestsSection22222, familyPendingInvitesViewModel2222, familyMemberSection2222, list122, r41);
            gapComposer3.end(false);
            return familyHomeViewModel22222;
        }
        list2 = null;
        list3 = list2;
        if (list3 != null) {
        }
        EmptyMap emptyMap2222 = EmptyMap.INSTANCE;
        emptyMap2222.getClass();
        rememberedValue2 = new AppLockMonitor$special$$inlined$map$2(emptyMap2222, 19);
        gapComposer.updateRememberedValue(rememberedValue2);
        Flow flow322 = (Flow) rememberedValue2;
        EmptyMap emptyMap322 = EmptyMap.INSTANCE;
        emptyMap322.getClass();
        MutableState collectAsState222 = Updater.collectAsState(flow322, emptyMap322, null, gapComposer, 48, 2);
        changed2 = gapComposer.changed((FamilyAccountsParameters) mutableState.getValue());
        rememberedValue3 = gapComposer.rememberedValue();
        if (!changed2) {
        }
        familyAccountsParameters3 = (FamilyAccountsParameters) mutableState.getValue();
        if (familyAccountsParameters3 != null) {
        }
        r1 = EmptyList.INSTANCE;
        if (r1.isEmpty()) {
        }
        gapComposer.updateRememberedValue(rememberedValue3);
        Flow flow422 = (Flow) rememberedValue3;
        EmptyMap emptyMap522 = EmptyMap.INSTANCE;
        emptyMap522.getClass();
        MutableState collectAsState322 = Updater.collectAsState(flow422, emptyMap522, null, gapComposer, 48, 2);
        familyAccountsParameters4 = (FamilyAccountsParameters) mutableState.getValue();
        AndroidStringManager androidStringManager322 = familyHomePresenter22.stringManager;
        if (familyAccountsParameters4 != null) {
        }
        List list1222 = list5;
        rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == obj2) {
        }
        State state222 = (State) rememberedValue4;
        rememberedValue5 = gapComposer3.rememberedValue();
        if (rememberedValue5 == obj2) {
        }
        State state322 = (State) rememberedValue5;
        familyAccountsParameters5 = (FamilyAccountsParameters) mutableState5.getValue();
        if (familyAccountsParameters5 != null) {
        }
        str2 = null;
        familyAccountsParameters6 = (FamilyAccountsParameters) mutableState5.getValue();
        if (familyAccountsParameters6 != null) {
        }
        str3 = null;
        RealPendingRequestActivityManager realPendingRequestActivityManager22222 = (RealPendingRequestActivityManager) familyHomePresenter.pendingRequestActivityManager;
        PendingRequestActivityState rememberPendingRequestActivityState22222 = realPendingRequestActivityManager22222.rememberPendingRequestActivityState(str2, str3, gapComposer3);
        z3 = rememberPendingRequestActivityState22222 instanceof PendingRequestActivityState.Loaded;
        if (z3) {
        }
        changed3 = gapComposer3.changed((FamilyAccountsParameters) mutableState5.getValue()) | gapComposer3.changed(rememberPendingRequestActivityState22222) | gapComposer3.changed((Map) collectAsState222.getValue()) | gapComposer3.changed(uiCallbackModel);
        rememberedValue6 = gapComposer3.rememberedValue();
        if (!changed3) {
        }
        familyAccountsParameters7 = (FamilyAccountsParameters) mutableState5.getValue();
        FamilyPendingRequestsSection.OnePendingRequest onePendingRequest22222 = loadingPendingRequestSection;
        if (familyAccountsParameters7 != null) {
        }
        familyPendingRequestsSection = onePendingRequest22222;
        gapComposer3.updateRememberedValue(familyPendingRequestsSection);
        rememberedValue6 = familyPendingRequestsSection;
        FamilyPendingRequestsSection familyPendingRequestsSection222222 = (FamilyPendingRequestsSection) rememberedValue6;
        str4 = familyHomePresenter.args.highlightedDependentToken;
        List<DependentDetails> list1322222 = list82;
        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1322222, 10));
        while (it.hasNext()) {
        }
        AndroidStringManager androidStringManager422222 = androidStringManager;
        if (!arrayList3.isEmpty()) {
        }
        z4 = true;
        it2 = arrayList3.iterator();
        i3 = 0;
        while (true) {
            if (it2.hasNext()) {
            }
            i3++;
        }
        if (z4) {
        }
        changed4 = gapComposer3.changed(str4);
        rememberedValue7 = gapComposer3.rememberedValue();
        if (!changed4) {
        }
        rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(str4 == null, gapComposer3);
        mutableState6 = (MutableState) rememberedValue7;
        if (((Boolean) mutableState6.getValue()).booleanValue()) {
        }
        str5 = null;
        gapComposer3.startReplaceGroup(-1201755929);
        gapComposer3.end(false);
        if (str4 != null) {
        }
        familyAccountsParameters8 = (FamilyAccountsParameters) mutableState5.getValue();
        if (familyAccountsParameters8 != null) {
        }
        String str2722222 = androidStringManager422222.get(R.string.family_home_default_title);
        String str2822222 = str2722222;
        publicProfile = (PublicProfile) mutableState3.getValue();
        StackedAvatarViewModel.Avatar avatar422222 = LOADING_AVATAR;
        if (publicProfile == null) {
        }
        List listOf22222 = CollectionsKt__CollectionsJVMKt.listOf(avatar);
        ArrayList arrayList1422222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list1322222, 10));
        while (r1.hasNext()) {
        }
        ArrayList plus22222 = CollectionsKt.plus((Iterable) arrayList1422222, (Collection) listOf22222);
        FamilyPendingInvitesViewModel familyPendingInvitesViewModel22222 = new FamilyPendingInvitesViewModel(androidStringManager422222.get(R.string.family_home_pending_invites_section_header), (List) state.getValue(), ((Boolean) state322.getValue()).booleanValue());
        String str3122222 = androidStringManager422222.get(R.string.family_home_members_section_header);
        FamilyAccountsParameters familyAccountsParameters1322222 = (FamilyAccountsParameters) mutableState5.getValue();
        FamilyMemberSection familyMemberSection22222 = new FamilyMemberSection(str3122222, (familyAccountsParameters1322222 != null || (inviteLink = familyAccountsParameters1322222.invite_teen_action) == null) ? str5 : inviteLink.text, arrayList3);
        familyAccountsParameters9 = (FamilyAccountsParameters) mutableState5.getValue();
        if (familyAccountsParameters9 != null) {
        }
        r41 = str5;
        FamilyHomeViewModel familyHomeViewModel222222 = new FamilyHomeViewModel(str2822222, plus22222, familyPendingRequestsSection222222, familyPendingInvitesViewModel22222, familyMemberSection22222, list1222, r41);
        gapComposer3.end(false);
        return familyHomeViewModel222222;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FamilyPendingRequestsSection toFamilyPendingRequestsSection(PendingRequestSection pendingRequestSection, Map map) {
        PendingRequest pendingRequest;
        MultiplePendingRequestsRow multiplePendingRequestsRow;
        MultiplePendingRequestsRow multiplePendingRequestsRow2;
        MultiplePendingRequestsRow multiplePendingRequestsRow3;
        Iterator it;
        int size;
        String str;
        PendingRequest pendingRequest2;
        FamilyPendingRequestRowModel.Loaded model;
        zztj zztjVar = pendingRequestSection.f1243type;
        MultiplePendingRequestsRow multiplePendingRequestsRow4 = null;
        if (zztjVar != null) {
            PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest = zztjVar instanceof PendingRequestSection$Type$PendingRequest ? (PendingRequestSection$Type$PendingRequest) zztjVar : null;
            if (pendingRequestSection$Type$PendingRequest != null) {
                pendingRequest = pendingRequestSection$Type$PendingRequest.value;
                if (pendingRequest == null) {
                    if (zztjVar != null) {
                        PendingRequestSection$Type$PendingRequest pendingRequestSection$Type$PendingRequest2 = zztjVar instanceof PendingRequestSection$Type$PendingRequest ? (PendingRequestSection$Type$PendingRequest) zztjVar : null;
                        if (pendingRequestSection$Type$PendingRequest2 != null) {
                            pendingRequest2 = pendingRequestSection$Type$PendingRequest2.value;
                            pendingRequest2.getClass();
                            model = FamilyPendingRequestRowModelHelperKt.toModel(this, pendingRequest2, map);
                            if (model == null) {
                                return new FamilyPendingRequestsSection.OnePendingRequest(model);
                            }
                            return null;
                        }
                    }
                    pendingRequest2 = null;
                    pendingRequest2.getClass();
                    model = FamilyPendingRequestRowModelHelperKt.toModel(this, pendingRequest2, map);
                    if (model == null) {
                    }
                } else {
                    if (zztjVar != null) {
                        PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                        if (pendingRequestSection$Type$MultiplePendingRequestsRow != null) {
                            multiplePendingRequestsRow = pendingRequestSection$Type$MultiplePendingRequestsRow.value;
                            if (multiplePendingRequestsRow != null) {
                                a$$ExternalSyntheticBUOutline0.m$3("PendingRequestSection has neither pending_request nor multiple_pending_requests_row");
                                return null;
                            }
                            if (zztjVar != null) {
                                PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow2 = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                                if (pendingRequestSection$Type$MultiplePendingRequestsRow2 != null) {
                                    multiplePendingRequestsRow2 = pendingRequestSection$Type$MultiplePendingRequestsRow2.value;
                                    multiplePendingRequestsRow2.getClass();
                                    String str2 = multiplePendingRequestsRow2.title;
                                    str2.getClass();
                                    if (zztjVar != null) {
                                        PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow3 = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                                        if (pendingRequestSection$Type$MultiplePendingRequestsRow3 != null) {
                                            multiplePendingRequestsRow3 = pendingRequestSection$Type$MultiplePendingRequestsRow3.value;
                                            multiplePendingRequestsRow3.getClass();
                                            List list = multiplePendingRequestsRow3.subtitle_customer_tokens;
                                            ArrayList arrayList = new ArrayList();
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                                Recipient recipient = (Recipient) map.get((String) it.next());
                                                String firstName = recipient != null ? recipient.getFirstName() : null;
                                                if (firstName != null) {
                                                    arrayList.add(firstName);
                                                }
                                            }
                                            Resources resources = this.stringManager.resources;
                                            size = arrayList.size();
                                            if (size == 0) {
                                                str = null;
                                            } else if (size == 1) {
                                                Object first = CollectionsKt.first((List) arrayList);
                                                first.getClass();
                                                resources.getClass();
                                                str = new MessageFormat(resources.getString(R.string.family_home_multiple_pending_requests_subtitle_one_requester)).format(new Object[]{first});
                                                str.getClass();
                                            } else if (size != 2) {
                                                Object first2 = CollectionsKt.first((List) arrayList);
                                                Object obj = arrayList.get(1);
                                                String valueOf = String.valueOf(arrayList.size() - 2);
                                                first2.getClass();
                                                obj.getClass();
                                                valueOf.getClass();
                                                resources.getClass();
                                                str = new MessageFormat(resources.getString(R.string.family_home_multiple_pending_requests_subtitle_three_plus_requesters)).format(new Object[]{first2, obj, valueOf});
                                                str.getClass();
                                            } else {
                                                Object first3 = CollectionsKt.first((List) arrayList);
                                                Object obj2 = arrayList.get(1);
                                                first3.getClass();
                                                obj2.getClass();
                                                resources.getClass();
                                                str = new MessageFormat(resources.getString(R.string.family_home_multiple_pending_requests_subtitle_two_requesters)).format(new Object[]{first3, obj2});
                                                str.getClass();
                                            }
                                            if (zztjVar != null) {
                                                PendingRequestSection$Type$MultiplePendingRequestsRow pendingRequestSection$Type$MultiplePendingRequestsRow4 = zztjVar instanceof PendingRequestSection$Type$MultiplePendingRequestsRow ? (PendingRequestSection$Type$MultiplePendingRequestsRow) zztjVar : null;
                                                if (pendingRequestSection$Type$MultiplePendingRequestsRow4 != null) {
                                                    multiplePendingRequestsRow4 = pendingRequestSection$Type$MultiplePendingRequestsRow4.value;
                                                }
                                            }
                                            multiplePendingRequestsRow4.getClass();
                                            String str3 = multiplePendingRequestsRow4.pending_requests_url;
                                            str3.getClass();
                                            return new FamilyPendingRequestsSection.MultiplePendingRequests(new FamilyMultiplePendingRequestsRowModel(str2, str, str3));
                                        }
                                    }
                                    multiplePendingRequestsRow3 = null;
                                    multiplePendingRequestsRow3.getClass();
                                    List list2 = multiplePendingRequestsRow3.subtitle_customer_tokens;
                                    ArrayList arrayList2 = new ArrayList();
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                    }
                                    Resources resources2 = this.stringManager.resources;
                                    size = arrayList2.size();
                                    if (size == 0) {
                                    }
                                    if (zztjVar != null) {
                                    }
                                    multiplePendingRequestsRow4.getClass();
                                    String str32 = multiplePendingRequestsRow4.pending_requests_url;
                                    str32.getClass();
                                    return new FamilyPendingRequestsSection.MultiplePendingRequests(new FamilyMultiplePendingRequestsRowModel(str2, str, str32));
                                }
                            }
                            multiplePendingRequestsRow2 = null;
                            multiplePendingRequestsRow2.getClass();
                            String str22 = multiplePendingRequestsRow2.title;
                            str22.getClass();
                            if (zztjVar != null) {
                            }
                            multiplePendingRequestsRow3 = null;
                            multiplePendingRequestsRow3.getClass();
                            List list22 = multiplePendingRequestsRow3.subtitle_customer_tokens;
                            ArrayList arrayList22 = new ArrayList();
                            it = list22.iterator();
                            while (it.hasNext()) {
                            }
                            Resources resources22 = this.stringManager.resources;
                            size = arrayList22.size();
                            if (size == 0) {
                            }
                            if (zztjVar != null) {
                            }
                            multiplePendingRequestsRow4.getClass();
                            String str322 = multiplePendingRequestsRow4.pending_requests_url;
                            str322.getClass();
                            return new FamilyPendingRequestsSection.MultiplePendingRequests(new FamilyMultiplePendingRequestsRowModel(str22, str, str322));
                        }
                    }
                    multiplePendingRequestsRow = null;
                    if (multiplePendingRequestsRow != null) {
                    }
                }
            }
        }
        pendingRequest = null;
        if (pendingRequest == null) {
        }
    }
}
