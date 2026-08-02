package app.cash.passcode.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.internal.LoyaltyKt;
import app.cash.local.primitives.RewardToken;
import app.cash.local.screens.app.LocalCurbsidePickupCarScreen;
import app.cash.local.screens.app.LocalLoyaltySheet;
import app.cash.local.screens.app.LoyaltyRewardToApplyQuestion;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.VehicleColorOption;
import app.cash.local.viewmodels.VehicleColorSpec;
import app.cash.local.viewmodels.VehicleTypeOption;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Configuration;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$RefreshMode;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.agents.applets.presenters.RealAgentsAppletTileRepository;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.benefits.screens.BenefitDetailScreen;
import com.squareup.cash.benefits.screens.BenefitsExplanationScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.viewmodels.TreehouseBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.CancelHelpItem;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationViewModel;
import com.squareup.cash.blockers.viewmodels.GenericHelpItem;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewModel;
import com.squareup.cash.blockers.viewmodels.RemoteSkipViewModel;
import com.squareup.cash.blockers.viewmodels.SetPinMessageViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.screens.RepayCustomAmountPicker;
import com.squareup.cash.card.onboarding.CardStudioExitDialogViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewModel;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewModel$Uninstalled;
import com.squareup.cash.family.applets.viewmodels.DependentActivityAppletTileViewModel;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.favorites.screens.FavoriteAdded;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.GenericTreeElementsScreenPresenter$State;
import com.squareup.cash.genericelements.presenters.RealGenericTreeElementsPresenter$Factory$Impl;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsAnalyticsData;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.screens.GenericTreeElementsScreen;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyReward;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.lending.CustomAmountPickerData;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class EndAppLockPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object accountOutboundNavigator;
    public final Object appLockState;
    public final Object navigatorSwitcher;

    public EndAppLockPresenter(AndroidStringManager androidStringManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory, RealActivitiesCacheManager realActivitiesCacheManager, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, SessionManager sessionManager, Navigator navigator) {
        this.$r8$classId = 25;
        navigator.getClass();
        this.navigatorSwitcher = navigator;
        this.appLockState = PlatformKt.activeAccountTokenOrNull(sessionManager);
        this.accountOutboundNavigator = realActivityEmbeddedPresenter$Factory$Impl.create(navigator, new ActivityEmbeddedPresenter$Configuration(new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN), ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) null, 12), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, "kids_activity_tile"), null, ActivityEmbeddedPresenter$RefreshMode.AlwaysOnBack, false, false, new ArcadeModal$$ExternalSyntheticLambda2(this, 16), 3, false, true, androidStringManager.get(R.string.family_applet_dependent_activity_empty_state), null, defaultActivityItemEventHandler$Factory$Impl, null, null, null, 0, 249856));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0350  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        GapComposer gapComposer;
        LocalCurbsidePickupCarScreen localCurbsidePickupCarScreen;
        LocalCurbsidePickupCarScreen localCurbsidePickupCarScreen2;
        boolean z;
        String str;
        VehicleTypeOption vehicleTypeOption;
        Object obj;
        VehicleColorOption vehicleColorOption;
        Object obj2;
        String str2;
        BlockersData.AnalyticsData.Source source;
        Object ready;
        boolean z2;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        Boolean valueOf;
        boolean changed;
        Object anonymousClass1;
        Boolean bool;
        List list;
        Iterator it;
        Object obj3;
        List<ActivityFeedEntry> list2;
        int i2;
        Object obj4;
        MutableState mutableState;
        int i3 = this.$r8$classId;
        int i4 = 19;
        int i5 = 12;
        int i6 = 29;
        int i7 = 5;
        int i8 = 8;
        Object obj5 = this.accountOutboundNavigator;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj6 = this.appLockState;
        Object obj7 = this.navigatorSwitcher;
        switch (i3) {
            case 0:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
            case 1:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj7;
                LocalCurbsidePickupCarScreen localCurbsidePickupCarScreen3 = (LocalCurbsidePickupCarScreen) obj6;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1535667246);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    localCurbsidePickupCarScreen = localCurbsidePickupCarScreen3;
                    rememberedValue3 = CollectionsKt__CollectionsKt.listOf((Object[]) new VehicleColorOption[]{new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_black), new VehicleColorSpec.Solid(4278190080L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_gray), new VehicleColorSpec.Solid(4287137928L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_silver), new VehicleColorSpec.Solid(4291611852L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_white), new VehicleColorSpec.Solid(BodyPartID.bodyIdMax)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_blue), new VehicleColorSpec.Solid(4278190335L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_green), new VehicleColorSpec.Solid(4278255360L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_red), new VehicleColorSpec.Solid(4294901760L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_brown), new VehicleColorSpec.Solid(4284893742L)), new VehicleColorOption(androidStringManager.get(R.string.local_presenters_vehicle_color_other), new VehicleColorSpec.Gradient(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Float.valueOf(0.05f), 4280527316L), new Pair(Float.valueOf(0.17f), 4286538229L), new Pair(Float.valueOf(0.29f), 4292759285L), new Pair(Float.valueOf(0.49f), 4294235496L), new Pair(Float.valueOf(0.76f), 4294228519L)})))});
                    gapComposer = gapComposer2;
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    gapComposer = gapComposer2;
                    localCurbsidePickupCarScreen = localCurbsidePickupCarScreen3;
                }
                List list3 = (List) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = CollectionsKt__CollectionsKt.listOf((Object[]) new VehicleTypeOption[]{new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_sedan)), new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_suv)), new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_truck)), new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_van)), new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_bicycle)), new VehicleTypeOption(androidStringManager.get(R.string.local_presenters_vehicle_type_other))});
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                List list4 = (List) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    localCurbsidePickupCarScreen2 = localCurbsidePickupCarScreen;
                    VehicleDescription vehicleDescription = localCurbsidePickupCarScreen2.previousDescription;
                    if (vehicleDescription != null) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (Intrinsics.areEqual(((VehicleColorOption) obj2).label, vehicleDescription.colorLabel)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        vehicleColorOption = (VehicleColorOption) obj2;
                    } else {
                        vehicleColorOption = null;
                    }
                    rememberedValue5 = Updater.mutableStateOf$default(vehicleColorOption);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    localCurbsidePickupCarScreen2 = localCurbsidePickupCarScreen;
                }
                MutableState mutableState2 = (MutableState) rememberedValue5;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    VehicleDescription vehicleDescription2 = localCurbsidePickupCarScreen2.previousDescription;
                    if (vehicleDescription2 != null) {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (Intrinsics.areEqual(((VehicleTypeOption) obj).label, vehicleDescription2.typeLabel)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        vehicleTypeOption = (VehicleTypeOption) obj;
                    } else {
                        vehicleTypeOption = null;
                    }
                    rememberedValue6 = Updater.mutableStateOf$default(vehicleTypeOption);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState3 = (MutableState) rememberedValue6;
                Updater.LaunchedEffect(gapComposer, flow, new RealImageLoader$execute$result$1(flow, (Continuation) null, this, mutableState2, mutableState3, 16));
                VehicleDescription vehicleDescription3 = localCurbsidePickupCarScreen2.previousDescription;
                if (vehicleDescription3 != null) {
                    VehicleColorOption vehicleColorOption2 = (VehicleColorOption) mutableState2.getValue();
                    if (Intrinsics.areEqual(vehicleColorOption2 != null ? vehicleColorOption2.label : null, vehicleDescription3.colorLabel)) {
                        VehicleTypeOption vehicleTypeOption2 = (VehicleTypeOption) mutableState3.getValue();
                        if (Intrinsics.areEqual(vehicleTypeOption2 != null ? vehicleTypeOption2.label : null, vehicleDescription3.typeLabel)) {
                            z = false;
                            VehicleColorOption vehicleColorOption3 = (VehicleColorOption) mutableState2.getValue();
                            VehicleTypeOption vehicleTypeOption3 = (VehicleTypeOption) mutableState3.getValue();
                            VehicleDescription vehicleDescription4 = localCurbsidePickupCarScreen2.previousDescription;
                            str = vehicleDescription4 == null ? vehicleDescription4.note : null;
                            if (str == null) {
                                str = "";
                            }
                            CurbsidePickupCarViewModel curbsidePickupCarViewModel = new CurbsidePickupCarViewModel(list3, list4, vehicleColorOption3, vehicleTypeOption3, str, z);
                            gapComposer.end(false);
                            return curbsidePickupCarViewModel;
                        }
                    }
                }
                z = true;
                VehicleColorOption vehicleColorOption32 = (VehicleColorOption) mutableState2.getValue();
                VehicleTypeOption vehicleTypeOption32 = (VehicleTypeOption) mutableState3.getValue();
                VehicleDescription vehicleDescription42 = localCurbsidePickupCarScreen2.previousDescription;
                if (vehicleDescription42 == null) {
                }
                if (str == null) {
                }
                CurbsidePickupCarViewModel curbsidePickupCarViewModel2 = new CurbsidePickupCarViewModel(list3, list4, vehicleColorOption32, vehicleTypeOption32, str, z);
                gapComposer.end(false);
                return curbsidePickupCarViewModel2;
            case 2:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj7;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(231117527);
                LocalLoyaltySheet localLoyaltySheet = (LocalLoyaltySheet) obj6;
                LoyaltyRewardToApplyQuestion loyaltyRewardToApplyQuestion = (LoyaltyRewardToApplyQuestion) localLoyaltySheet.question.question;
                LocalLoyaltyAccount localLoyaltyAccount = loyaltyRewardToApplyQuestion.loyaltyAccount;
                LocalLoyaltyProgram localLoyaltyProgram = loyaltyRewardToApplyQuestion.loyaltyProgram;
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    String str3 = localLoyaltySheet.currentlySelectedRewardToken;
                    rememberedValue7 = Updater.mutableStateOf$default(str3 != null ? new RewardToken(str3) : null);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState4 = (MutableState) rememberedValue7;
                Updater.LaunchedEffect(gapComposer3, flow, new zzmo(flow, (Continuation) (null == true ? 1 : 0), (Object) this, (Object) mutableState4, 12));
                String str4 = androidStringManager2.get(R.string.local_presenters_loyalty_sheet_title);
                Integer num = localLoyaltyAccount.balance;
                num.getClass();
                int intValue = num.intValue();
                if (num.intValue() == 1) {
                    str2 = localLoyaltyProgram.loyalty_terminology_singular;
                    str2.getClass();
                } else {
                    str2 = localLoyaltyProgram.loyalty_terminology_plural;
                    str2.getClass();
                }
                String str5 = str2;
                String str6 = localLoyaltyProgram.loyalty_terminology_plural;
                str6.getClass();
                Resources resources = androidStringManager2.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_loyalty_sheet_body)).format(new Object[]{str6});
                format2.getClass();
                List<LocalLoyaltyReward> list5 = localLoyaltyProgram.reward_tiers;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (LocalLoyaltyReward localLoyaltyReward : list5) {
                    String str7 = localLoyaltyReward.token;
                    str7.getClass();
                    String str8 = localLoyaltyReward.name;
                    str8.getClass();
                    Integer num2 = localLoyaltyReward.points;
                    num2.getClass();
                    String pointsText = LoyaltyKt.pointsText(localLoyaltyProgram, num2.intValue());
                    RewardToken rewardToken = (RewardToken) mutableState4.getValue();
                    String str9 = rewardToken != null ? rewardToken.value : null;
                    boolean equals = str9 == null ? false : str9.equals(str7);
                    Integer num3 = localLoyaltyReward.points;
                    num3.getClass();
                    arrayList.add(new LoyaltySheetModel.Tier(str7, str8, pointsText, equals, num3.intValue() <= num.intValue()));
                }
                String str10 = androidStringManager2.get(R.string.local_presenters_loyalty_sheet_cta_text);
                RewardToken rewardToken2 = (RewardToken) mutableState4.getValue();
                LoyaltySheetModel loyaltySheetModel = new LoyaltySheetModel(str4, intValue, str5, format2, arrayList, str10, (rewardToken2 != null ? rewardToken2.value : null) != null);
                gapComposer3.end(false);
                return loyaltySheetModel;
            case 3:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
            case 4:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1511372438);
                Object rememberedValue8 = gapComposer4.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = ((RealAgentsAppletTileRepository) obj7).agentsAppletTileViewModel;
                    gapComposer4.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue8, null, gapComposer4, 1);
                Updater.LaunchedEffect(gapComposer4, flow, new BenefitsHubPresenter$models$1$1(flow, (Continuation) null, this, collectAsState, 6));
                AgentsAppletTileViewModel agentsAppletTileViewModel = (AgentsAppletTileViewModel) collectAsState.getValue();
                gapComposer4.end(false);
                return agentsAppletTileViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(1949920355);
                Updater.LaunchedEffect(gapComposer5, flow, new ToastKt$Toast$9$1((Object) flow, (Continuation) (null == true ? 1 : 0), (Object) this, i5));
                BankingDialogScreen.Dialog dialog = ((BankingDialogScreen) obj7).dialog;
                String str11 = dialog.title;
                String str12 = dialog.body;
                BankingDialogScreen.Dialog.Button button = dialog.primaryButton;
                BankingDialogViewModel.Button button2 = button != null ? new BankingDialogViewModel.Button(button.clientScenario, button.text) : null;
                button2.getClass();
                BankingDialogScreen.Dialog.Button button3 = dialog.secondaryButton;
                BankingDialogViewModel bankingDialogViewModel = new BankingDialogViewModel(str11, str12, button2, button3 != null ? new BankingDialogViewModel.Button(button3.clientScenario, button3.text) : null);
                gapComposer5.end(false);
                return bankingDialogViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(1763352606);
                Updater.LaunchedEffect(gapComposer6, flow, new ToastKt$Toast$9$1((Object) flow, (Continuation) (null == true ? 1 : 0), (Object) this, i4));
                BenefitDetailScreen benefitDetailScreen = (BenefitDetailScreen) obj7;
                BenefitDetailsViewModel benefitDetailsViewModel = new BenefitDetailsViewModel(benefitDetailScreen.avatar, benefitDetailScreen.title, benefitDetailScreen.content, benefitDetailScreen.disclaimers);
                gapComposer6.end(false);
                return benefitDetailsViewModel;
            case 7:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-1317304782);
                Updater.LaunchedEffect(gapComposer7, flow, new ToastKt$Toast$9$1((Object) flow, (Continuation) (null == true ? 1 : 0), (Object) this, 20));
                BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsExplanationScreen) obj7;
                String str13 = benefitsExplanationScreen.title;
                ArrayList<Pair> arrayList2 = benefitsExplanationScreen.content;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (Pair pair : arrayList2) {
                    arrayList3.add(new BenefitsExplanationViewModel.BenefitsExplanationContent((String) pair.first, (List) pair.second));
                }
                BenefitsExplanationViewModel benefitsExplanationViewModel = new BenefitsExplanationViewModel(str13, arrayList3, benefitsExplanationScreen.footer);
                gapComposer7.end(false);
                return benefitsExplanationViewModel;
            case 8:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
            case 9:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1631285679);
                Updater.LaunchedEffect(gapComposer8, flow, new CashtagPresenter$models$2$1((Object) flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, 21));
                FileBlockerExplanationViewModel fileBlockerExplanationViewModel = new FileBlockerExplanationViewModel(((AndroidStringManager) obj7).get(((BlockersScreens.FileBlockerExplanation) obj6).message));
                gapComposer8.end(false);
                return fileBlockerExplanationViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(922108047);
                Updater.LaunchedEffect(gapComposer9, flow, new PasscodePresenter$models$1$2(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, 1));
                List list6 = (List) obj5;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new GenericHelpItem(((HelpItem) it4.next()).text));
                }
                HelpOptionsViewModel helpOptionsViewModel = new HelpOptionsViewModel(CollectionsKt.plus((Collection) arrayList4, (Object) new CancelHelpItem(((AndroidStringManager) obj6).get(R.string.cancel))));
                gapComposer9.end(false);
                return helpOptionsViewModel;
            case 11:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-1680798265);
                ClientScenario clientScenario = ((BlockersScreens.RemoteSkipScreen) obj7).blockersData.clientScenario;
                if (clientScenario == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer10.changedInstance(flow) | gapComposer10.changedInstance(this) | gapComposer10.changed(clientScenario.ordinal());
                Object rememberedValue9 = gapComposer10.rememberedValue();
                if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
                    PasscodePresenter$models$1$2 passcodePresenter$models$1$2 = new PasscodePresenter$models$1$2(flow, this, clientScenario, null, 24);
                    gapComposer10.updateRememberedValue(passcodePresenter$models$1$2);
                    rememberedValue9 = passcodePresenter$models$1$2;
                }
                Updater.LaunchedEffect(gapComposer10, unit, (Function2) rememberedValue9);
                gapComposer10.end(false);
                return RemoteSkipViewModel.INSTANCE;
            case 12:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(-1593935354);
                Updater.LaunchedEffect(gapComposer11, flow, new PasscodePresenter$models$1$2(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, i6));
                SetPinMessageViewModel setPinMessageViewModel = new SetPinMessageViewModel(((BlockersScreens.SetPinMessageScreen) obj6).message, ((AndroidStringManager) obj7).get(R.string.ok));
                gapComposer11.end(false);
                return setPinMessageViewModel;
            case 13:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
            case 14:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(1299366080);
                BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen = (BlockersScreens.TreehouseBlockerScreen) obj6;
                BlockersData blockersData = treehouseBlockerScreen.blockersData;
                BlockersData blockersData2 = treehouseBlockerScreen.blockersData;
                String str14 = blockersData2.flowToken;
                String str15 = treehouseBlockerScreen.path;
                ByteString byteString = treehouseBlockerScreen.parameters;
                String str16 = blockersData2.blockerId;
                ClientScenario clientScenario2 = blockersData2.clientScenario;
                Integer valueOf2 = clientScenario2 != null ? Integer.valueOf(clientScenario2.getValue()) : null;
                BlockersData.AnalyticsData analyticsData = blockersData2.analyticsData;
                TreehouseBlockerViewModel treehouseBlockerViewModel = new TreehouseBlockerViewModel(blockersData, new BlockerScreenSpec(str14, str15, byteString, str16, valueOf2, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName(), treehouseBlockerScreen.proposedTreehouseFlowToken, treehouseBlockerScreen.plasmaFlowToken), (BetterNavigator.ScreenNavigator) obj5);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer12.changedInstance(this);
                Object rememberedValue10 = gapComposer12.rememberedValue();
                if (changedInstance3 || rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = new TemporaryStorage$getDir$2(this, null == true ? 1 : 0, 4);
                    gapComposer12.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer12, unit2, (Function2) rememberedValue10);
                Updater.LaunchedEffect(gapComposer12, flow, new FileBlockerView$6$2$2(flow, (Continuation) (null == true ? 1 : 0), (Object) this, i4));
                gapComposer12.end(false);
                return treehouseBlockerViewModel;
            case 16:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-407262294);
                Object rememberedValue11 = gapComposer13.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer13);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue11;
                Updater.LaunchedEffect(gapComposer13, flow, new RealBoostSelector$removeBoost$1(flow, (Continuation) null, this, parcelableSnapshotMutableIntState, 15));
                if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                    ready = new AmountPickerViewModel.Loading();
                } else {
                    CustomAmountPickerData customAmountPickerData = ((RepayCustomAmountPicker) obj6).repaymentData.custom_amount_picker_data;
                    customAmountPickerData.getClass();
                    LocalizedString localizedString = customAmountPickerData.title;
                    localizedString.getClass();
                    String str17 = localizedString.translated_value;
                    str17.getClass();
                    LocalizedString localizedString2 = customAmountPickerData.subtitle;
                    localizedString2.getClass();
                    String str18 = localizedString2.translated_value;
                    str18.getClass();
                    LocalizedString localizedString3 = customAmountPickerData.button_title;
                    localizedString3.getClass();
                    String str19 = localizedString3.translated_value;
                    str19.getClass();
                    Money money = customAmountPickerData.minimum_amount;
                    money.getClass();
                    AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = new AmountPickerViewModel.Ready.Amount.MoneyAmount(money);
                    Money money2 = customAmountPickerData.maximum_amount;
                    money2.getClass();
                    ready = new AmountPickerViewModel.Ready(str17, str18, str19, moneyAmount, new AmountPickerViewModel.Ready.Amount.MoneyAmount(money2), false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, null, false, false, null, null, 16224);
                }
                gapComposer13.end(false);
                return ready;
            case 17:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-1976548839);
                Updater.LaunchedEffect(gapComposer14, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, i7));
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj7;
                CardStudioExitDialogViewModel cardStudioExitDialogViewModel = new CardStudioExitDialogViewModel(androidStringManager3.get(R.string.card_studio_exit_dialog_title), androidStringManager3.get(R.string.card_studio_exit_dialog_message), androidStringManager3.get(R.string.card_studio_exit_dialog_exit), androidStringManager3.get(R.string.card_studio_exit_dialog_stay));
                gapComposer14.end(false);
                return cardStudioExitDialogViewModel;
            case 18:
                RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) obj7;
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(-1571874056);
                UiCallbackModel models = ((RealActivityEmbeddedPresenter) obj5).models(gapComposer15, 0);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(models, gapComposer15);
                ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) models.model;
                List list7 = activityEmbeddedViewModel.feedEntries;
                List list8 = activityEmbeddedViewModel.feedEntries;
                List list9 = list7;
                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                    Iterator it5 = list9.iterator();
                    while (it5.hasNext()) {
                        if (((ActivityFeedEntry) it5.next()) instanceof ActivityFeedEntry.EmptyItem) {
                            z2 = true;
                            rememberedValue = gapComposer15.rememberedValue();
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer15.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState5 = (MutableState) rememberedValue;
                            changedInstance = gapComposer15.changedInstance(this) | gapComposer15.changed(rememberUpdatedState);
                            rememberedValue2 = gapComposer15.rememberedValue();
                            if (!changedInstance || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1((Object) this, (Object) rememberUpdatedState, (Continuation) (null == true ? 1 : 0), 2);
                                gapComposer15.updateRememberedValue(rememberedValue2);
                            }
                            Updater.LaunchedEffect(gapComposer15, realBalanceSnapshotManager, (Function2) rememberedValue2);
                            valueOf = Boolean.valueOf(z2);
                            changed = gapComposer15.changed(z2) | gapComposer15.changedInstance(this) | gapComposer15.changed(rememberUpdatedState);
                            Object rememberedValue12 = gapComposer15.rememberedValue();
                            if (!changed || rememberedValue12 == neverEqualPolicy) {
                                bool = valueOf;
                                anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z2, this, mutableState5, rememberUpdatedState, (Continuation) null, 6);
                                gapComposer15.updateRememberedValue(anonymousClass1);
                            } else {
                                anonymousClass1 = rememberedValue12;
                                bool = valueOf;
                            }
                            Updater.LaunchedEffect(realBalanceSnapshotManager, bool, (Function2) anonymousClass1, gapComposer15);
                            if (activityEmbeddedViewModel.isRefreshing || !list8.isEmpty()) {
                                list = list8;
                                if ((list instanceof Collection) || !list.isEmpty()) {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((ActivityFeedEntry) it.next()) instanceof ActivityFeedEntry.EmptyItem) {
                                            obj3 = ActivityAppletTileViewModel.NoActivity.INSTANCE;
                                        }
                                    }
                                }
                                list2 = list8;
                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                    i2 = 0;
                                    for (ActivityFeedEntry activityFeedEntry : list2) {
                                        if ((activityFeedEntry instanceof ActivityFeedEntry.Item) || (activityFeedEntry instanceof ActivityFeedEntry.ErrorItem)) {
                                            i2++;
                                            if (i2 < 0) {
                                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                                throw null;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                }
                                obj3 = new ActivityAppletTileViewModel.Installed(models, i2 < 3);
                            } else {
                                obj3 = new ActivityAppletTileViewModel.Loading(models);
                            }
                            gapComposer15.end(false);
                            return obj3;
                        }
                    }
                }
                z2 = false;
                rememberedValue = gapComposer15.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                }
                MutableState mutableState52 = (MutableState) rememberedValue;
                changedInstance = gapComposer15.changedInstance(this) | gapComposer15.changed(rememberUpdatedState);
                rememberedValue2 = gapComposer15.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1((Object) this, (Object) rememberUpdatedState, (Continuation) (null == true ? 1 : 0), 2);
                gapComposer15.updateRememberedValue(rememberedValue2);
                Updater.LaunchedEffect(gapComposer15, realBalanceSnapshotManager, (Function2) rememberedValue2);
                valueOf = Boolean.valueOf(z2);
                changed = gapComposer15.changed(z2) | gapComposer15.changedInstance(this) | gapComposer15.changed(rememberUpdatedState);
                Object rememberedValue122 = gapComposer15.rememberedValue();
                if (changed) {
                }
                bool = valueOf;
                anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z2, this, mutableState52, rememberUpdatedState, (Continuation) null, 6);
                gapComposer15.updateRememberedValue(anonymousClass1);
                Updater.LaunchedEffect(realBalanceSnapshotManager, bool, (Function2) anonymousClass1, gapComposer15);
                if (activityEmbeddedViewModel.isRefreshing) {
                }
                list = list8;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                list2 = list8;
                if (list2 instanceof Collection) {
                }
                i2 = 0;
                while (r1.hasNext()) {
                }
                obj3 = new ActivityAppletTileViewModel.Installed(models, i2 < 3);
                gapComposer15.end(false);
                return obj3;
            case 19:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(-1503629361);
                Object rememberedValue13 = gapComposer16.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    LinkedBusinessDetailsSheet linkedBusinessDetailsSheet = (LinkedBusinessDetailsSheet) obj6;
                    rememberedValue13 = new LinkedBusinessDetailsViewModel(linkedBusinessDetailsSheet.businessGrantId, linkedBusinessDetailsSheet.image, linkedBusinessDetailsSheet.title, linkedBusinessDetailsSheet.actionType, linkedBusinessDetailsSheet.renderingBehavior);
                    gapComposer16.updateRememberedValue(rememberedValue13);
                }
                LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) rememberedValue13;
                Updater.LaunchedEffect(gapComposer16, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, 28));
                gapComposer16.end(false);
                return linkedBusinessDetailsViewModel;
            case 20:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj7;
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(1195239545);
                Updater.LaunchedEffect(gapComposer17, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) (null == true ? 1 : 0), (Object) this, i8));
                FailureMessageBlockerScreen failureMessageBlockerScreen = (FailureMessageBlockerScreen) obj6;
                String str20 = failureMessageBlockerScreen.title;
                String str21 = failureMessageBlockerScreen.message;
                if (str21 == null) {
                    str21 = androidStringManager4.get(R.string.blockers_retrofit_error_message);
                }
                FailureMessageDialogViewModel failureMessageDialogViewModel = new FailureMessageDialogViewModel(str20, str21, androidStringManager4.get(R.string.blockers_retrofit_error_negative));
                gapComposer17.end(false);
                return failureMessageDialogViewModel;
            case 21:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(-180574177);
                Updater.LaunchedEffect(gapComposer18, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) (null == true ? 1 : 0), (Object) this, 9));
                FailureMessageScreen failureMessageScreen = (FailureMessageScreen) obj6;
                String str22 = failureMessageScreen.title;
                String str23 = failureMessageScreen.message;
                String str24 = failureMessageScreen.dismissButtonText;
                if (str24 == null) {
                    str24 = ((AndroidStringManager) obj7).get(R.string.failure_message_dialog_negative_button_text);
                }
                FailureMessageDialogViewModel failureMessageDialogViewModel2 = new FailureMessageDialogViewModel(str22, str23, str24);
                gapComposer18.end(false);
                return failureMessageDialogViewModel2;
            case 22:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(386420881);
                Updater.LaunchedEffect(gapComposer19, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) (null == true ? 1 : 0), (Object) this, 16));
                Object rememberedValue14 = gapComposer19.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) obj7;
                    if (!Intrinsics.areEqual(((CryptoCommonScreens.CryptoCommonInsufficientFunds) obj6).f1117type, CryptoCommonScreens$CryptoCommonInsufficientFunds$Type$Stablecoin.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    rememberedValue14 = new CryptoInsufficientFundsViewModel(androidStringManager5.get(R.string.stablecoin_insufficient_funds_bitcoin_body), androidStringManager5.get(R.string.stablecoin_insufficient_funds_positive_button), androidStringManager5.get(R.string.stablecoin_insufficient_funds_negative_button));
                    gapComposer19.updateRememberedValue(rememberedValue14);
                }
                CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel = (CryptoInsufficientFundsViewModel) rememberedValue14;
                gapComposer19.end(false);
                return cryptoInsufficientFundsViewModel;
            case 23:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(-235233871);
                Updater.LaunchedEffect(gapComposer20, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) (null == true ? 1 : 0), (Object) this, 26));
                LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) obj7;
                gapComposer20.end(false);
                return locationDeniedScreen;
            case 24:
                flow.getClass();
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(48981284);
                Updater.LaunchedEffect(gapComposer21, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, i5));
                AndroidStringManager androidStringManager6 = (AndroidStringManager) obj6;
                ApprovedContactsAppletTileViewModel$Uninstalled approvedContactsAppletTileViewModel$Uninstalled = new ApprovedContactsAppletTileViewModel$Uninstalled(androidStringManager6.get(R.string.approved_contacts_applet_uninstalled_title), androidStringManager6.get(R.string.approved_contacts_applet_uninstalled_subtitle));
                gapComposer21.end(false);
                return approvedContactsAppletTileViewModel$Uninstalled;
            case 25:
                flow.getClass();
                GapComposer gapComposer22 = (GapComposer) composer;
                gapComposer22.startReplaceGroup(529972638);
                UiCallbackModel models2 = ((RealActivityEmbeddedPresenter) obj5).models(gapComposer22, 0);
                Updater.LaunchedEffect(gapComposer22, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, 13));
                ActivityEmbeddedViewModel activityEmbeddedViewModel2 = (ActivityEmbeddedViewModel) models2.model;
                boolean z3 = activityEmbeddedViewModel2.isRefreshing;
                List list10 = activityEmbeddedViewModel2.feedEntries;
                if (z3 && list10.isEmpty()) {
                    obj4 = new DependentActivityAppletTileViewModel.Loading(models2);
                } else {
                    List list11 = list10;
                    if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                        Iterator it6 = list11.iterator();
                        while (it6.hasNext()) {
                            if (((ActivityFeedEntry) it6.next()) instanceof ActivityFeedEntry.EmptyItem) {
                                obj4 = DependentActivityAppletTileViewModel.NoActivity.INSTANCE;
                            }
                        }
                    }
                    obj4 = new DependentActivityAppletTileViewModel.Installed(models2);
                }
                gapComposer22.end(false);
                return obj4;
            case 26:
                flow.getClass();
                GapComposer gapComposer23 = (GapComposer) composer;
                gapComposer23.startReplaceGroup(1322981381);
                Updater.LaunchedEffect(gapComposer23, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) (null == true ? 1 : 0), (MoleculePresenter) this, i6));
                BlockersScreens.U13CelebrationBlockerScreen u13CelebrationBlockerScreen = (BlockersScreens.U13CelebrationBlockerScreen) obj6;
                String str25 = u13CelebrationBlockerScreen.title;
                String str26 = u13CelebrationBlockerScreen.ctaButtonAction.text;
                if (str26 == null) {
                    str26 = ((AndroidStringManager) obj7).get(R.string.u13_celebration_button_text);
                }
                U13CelebrationViewModel u13CelebrationViewModel = new U13CelebrationViewModel(str25, str26);
                gapComposer23.end(false);
                return u13CelebrationViewModel;
            case 27:
                flow.getClass();
                GapComposer gapComposer24 = (GapComposer) composer;
                gapComposer24.startReplaceGroup(-1412973174);
                Updater.LaunchedEffect(gapComposer24, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) (null == true ? 1 : 0), (Object) this, i8));
                FavoriteAdded favoriteAdded = (FavoriteAdded) obj7;
                FavoriteAddedViewModel favoriteAddedViewModel = new FavoriteAddedViewModel(favoriteAdded.name, favoriteAdded.message, favoriteAdded.photo, favoriteAdded.accentColor, favoriteAdded.monogram, favoriteAdded.showViewFavorites);
                gapComposer24.end(false);
                return favoriteAddedViewModel;
            case 28:
                GenericTreeElementsScreen genericTreeElementsScreen = (GenericTreeElementsScreen) obj6;
                flow.getClass();
                GapComposer gapComposer25 = (GapComposer) composer;
                gapComposer25.startReplaceGroup(-471749207);
                Object rememberedValue15 = gapComposer25.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = Updater.mutableStateOf$default(new GenericTreeElementsScreenPresenter$State(GenericTreeElementsViewModel.Loading.INSTANCE));
                    gapComposer25.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState6 = (MutableState) rememberedValue15;
                Object rememberedValue16 = gapComposer25.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = Updater.mutableStateOf$default(null);
                    gapComposer25.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState7 = (MutableState) rememberedValue16;
                String elementsContext = genericTreeElementsScreen.getElementsContext();
                boolean changedInstance4 = gapComposer25.changedInstance(this);
                Object rememberedValue17 = gapComposer25.rememberedValue();
                if (changedInstance4 || rememberedValue17 == neverEqualPolicy) {
                    mutableState = mutableState6;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1 anonymousClass12 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(this, mutableState7, mutableState, null == true ? 1 : 0, 18);
                    gapComposer25.updateRememberedValue(anonymousClass12);
                    rememberedValue17 = anonymousClass12;
                } else {
                    mutableState = mutableState6;
                }
                Updater.LaunchedEffect(gapComposer25, elementsContext, (Function2) rememberedValue17);
                GenericTreeElementsData genericTreeElementsData = (GenericTreeElementsData) mutableState7.getValue();
                if (genericTreeElementsData == null) {
                    gapComposer25.startReplaceGroup(-746779453);
                    gapComposer25.end(false);
                } else {
                    gapComposer25.startReplaceGroup(-746779452);
                    GenericTreeElementsScreenPresenter$State genericTreeElementsScreenPresenter$State = (GenericTreeElementsScreenPresenter$State) mutableState.getValue();
                    SubtreeManager subtreeManager = (SubtreeManager) obj5;
                    String entityToken = genericTreeElementsScreen.getEntityToken();
                    List list12 = genericTreeElementsData.genericElementTree;
                    GenericTreeElementsAnalyticsData genericTreeElementsAnalyticsData = new GenericTreeElementsAnalyticsData(5, genericTreeElementsScreen.getReferrerFlowToken(), null, null);
                    AnalyticsEvent analyticsEvent = genericTreeElementsData.viewEvent;
                    GenericAnalyticsData analyticsData2 = analyticsEvent != null ? zzi.toAnalyticsData(analyticsEvent) : null;
                    AnalyticsEvent analyticsEvent2 = genericTreeElementsData.dismissEvent;
                    GenericTreeElementsViewModel.Loaded model = subtreeManager.model(new GenericTreeElementsItem(entityToken, list12, genericTreeElementsAnalyticsData, analyticsData2, analyticsEvent2 != null ? zzi.toAnalyticsData(analyticsEvent2) : null, null, null, 96), flow, gapComposer25, ((i << 3) & 112) | 8);
                    genericTreeElementsScreenPresenter$State.getClass();
                    mutableState.setValue(new GenericTreeElementsScreenPresenter$State(model));
                    gapComposer25.end(false);
                }
                GenericTreeElementsViewModel genericTreeElementsViewModel = ((GenericTreeElementsScreenPresenter$State) mutableState.getValue()).model;
                gapComposer25.end(false);
                return genericTreeElementsViewModel;
            default:
                m1348models(flow, composer, i);
                return Unit.INSTANCE;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider accountOutboundNavigatorFactory;
        public final DoubleCheck appLockState;
        public final InstanceFactory navigatorSwitcher;

        public MetroFactory(RealKeyStoreProvider.MetroFactory metroFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
            this.accountOutboundNavigatorFactory = metroFactory;
            this.appLockState = doubleCheck;
            this.navigatorSwitcher = instanceFactory;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2) {
            this.navigatorSwitcher = instanceFactory;
            this.appLockState = doubleCheck;
            this.accountOutboundNavigatorFactory = instanceFactory2;
        }
    }

    public /* synthetic */ EndAppLockPresenter(Object obj, Object obj2, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.navigatorSwitcher = obj;
        this.appLockState = obj2;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1, RealAppLockState realAppLockState, RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        this.navigatorSwitcher = mainActivity$navigatorSwitcher$1;
        this.appLockState = realAppLockState;
        this.accountOutboundNavigator = realAccountOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public EndAppLockPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, BenefitDetailScreen benefitDetailScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        benefitDetailScreen.getClass();
        this.navigatorSwitcher = benefitDetailScreen;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public EndAppLockPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, BenefitsExplanationScreen benefitsExplanationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        benefitsExplanationScreen.getClass();
        this.navigatorSwitcher = benefitsExplanationScreen;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public EndAppLockPresenter(LocationDeniedScreen locationDeniedScreen, BetterNavigator.ScreenNavigator screenNavigator, IntentLauncher intentLauncher) {
        this.$r8$classId = 23;
        locationDeniedScreen.getClass();
        this.navigatorSwitcher = locationDeniedScreen;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = intentLauncher;
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, CardStudioExitDialogScreen cardStudioExitDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        cardStudioExitDialogScreen.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = cardStudioExitDialogScreen;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AndroidStringManager androidStringManager, BlockersScreens.U13CelebrationBlockerScreen u13CelebrationBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        u13CelebrationBlockerScreen.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = u13CelebrationBlockerScreen;
        this.accountOutboundNavigator = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public EndAppLockPresenter(AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet, BetterNavigator.ScreenNavigator screenNavigator, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics) {
        this.$r8$classId = 3;
        afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.getClass();
        this.navigatorSwitcher = afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realAfterpayAppletAnalytics;
    }

    public EndAppLockPresenter(BlockersScreens.HelpOptions.Impl impl, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager) {
        this.$r8$classId = 10;
        this.navigatorSwitcher = screenNavigator;
        this.appLockState = androidStringManager;
        Object obj = impl.helpItems;
        this.accountOutboundNavigator = obj == null ? EmptyList.INSTANCE : obj;
    }

    public EndAppLockPresenter(RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl, FavoriteAdded favoriteAdded, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        favoriteAdded.getClass();
        this.navigatorSwitcher = favoriteAdded;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realFavoritesInboundNavigator$Factory$Impl.create(screenNavigator);
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, FailureMessageScreen failureMessageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 21;
        failureMessageScreen.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = failureMessageScreen;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, FailureMessageBlockerScreen failureMessageBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        failureMessageBlockerScreen.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = failureMessageBlockerScreen;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(SessionManager sessionManager, AndroidStringManager androidStringManager, Navigator navigator) {
        this.$r8$classId = 24;
        navigator.getClass();
        this.navigatorSwitcher = sessionManager;
        this.appLockState = androidStringManager;
        this.accountOutboundNavigator = navigator;
    }

    public EndAppLockPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BankingDialogScreen bankingDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        bankingDialogScreen.getClass();
        this.navigatorSwitcher = bankingDialogScreen;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public EndAppLockPresenter(BetterNavigator.ScreenNavigator screenNavigator, LinkedBusinessDetailsSheet linkedBusinessDetailsSheet, Analytics analytics) {
        this.$r8$classId = 19;
        linkedBusinessDetailsSheet.getClass();
        this.navigatorSwitcher = screenNavigator;
        this.appLockState = linkedBusinessDetailsSheet;
        this.accountOutboundNavigator = analytics;
    }

    public EndAppLockPresenter(BlockersDataNavigator blockersDataNavigator, BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        treehouseBlockerScreen.getClass();
        this.navigatorSwitcher = blockersDataNavigator;
        this.appLockState = treehouseBlockerScreen;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.RemoteSkipScreen remoteSkipScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        this.navigatorSwitcher = remoteSkipScreen;
        this.appLockState = screenNavigator;
        this.accountOutboundNavigator = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, CryptoCommonScreens.CryptoCommonInsufficientFunds cryptoCommonInsufficientFunds, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        cryptoCommonInsufficientFunds.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = cryptoCommonInsufficientFunds;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(RealAgentsAppletTileRepository realAgentsAppletTileRepository, FlowStarter flowStarter, Navigator navigator) {
        this.$r8$classId = 4;
        navigator.getClass();
        this.navigatorSwitcher = realAgentsAppletTileRepository;
        this.appLockState = flowStarter;
        this.accountOutboundNavigator = navigator;
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, LocalLoyaltySheet localLoyaltySheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        localLoyaltySheet.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = localLoyaltySheet;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(AndroidStringManager androidStringManager, LocalCurbsidePickupCarScreen localCurbsidePickupCarScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        localCurbsidePickupCarScreen.getClass();
        this.navigatorSwitcher = androidStringManager;
        this.appLockState = localCurbsidePickupCarScreen;
        this.accountOutboundNavigator = screenNavigator;
    }

    public /* synthetic */ EndAppLockPresenter(Analytics analytics, BlockersDataNavigator blockersDataNavigator, BlockersScreens blockersScreens, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.navigatorSwitcher = blockersDataNavigator;
        this.appLockState = blockersScreens;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(RealGenericTreeElementsRepo realGenericTreeElementsRepo, RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl, GenericTreeElementsScreen genericTreeElementsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        genericTreeElementsScreen.getClass();
        this.navigatorSwitcher = realGenericTreeElementsRepo;
        this.appLockState = genericTreeElementsScreen;
        this.accountOutboundNavigator = realGenericTreeElementsPresenter$Factory$Impl.create$1(genericTreeElementsScreen, screenNavigator);
    }

    public EndAppLockPresenter(MetadataRepo metadataRepo, RepayCustomAmountPicker repayCustomAmountPicker, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        repayCustomAmountPicker.getClass();
        this.navigatorSwitcher = metadataRepo;
        this.appLockState = repayCustomAmountPicker;
        this.accountOutboundNavigator = screenNavigator;
    }

    public EndAppLockPresenter(SessionManager sessionManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, RealBalanceSnapshotManager realBalanceSnapshotManager, Navigator navigator) {
        this.$r8$classId = 18;
        navigator.getClass();
        this.navigatorSwitcher = realBalanceSnapshotManager;
        this.appLockState = navigator;
        this.accountOutboundNavigator = realActivityEmbeddedPresenter$Factory$Impl.create(navigator, new ActivityEmbeddedPresenter$Configuration(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountTokenOrNull(sessionManager), (String) null, 12), ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) null, 12), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, "lite_activity_tile"), null, ActivityEmbeddedPresenter$RefreshMode.AlwaysOnBack, false, false, new SsnViewKt$$ExternalSyntheticLambda4(this, 20), 3, false, true, null, null, defaultActivityItemEventHandler$Factory$Impl, null, null, null, 0, 251904));
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m1348models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.$r8$classId;
        int i9 = 29;
        int i10 = 7;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i11 = 18;
        Continuation continuation = null;
        int i12 = 1;
        flow.getClass();
        switch (i8) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1378704381);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new DiskLruCache$launchCleanup$1(this, continuation, 21);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(this, flow, i, 25);
                    break;
                }
                break;
            case 3:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(802289333);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MLKitTitleGenerator$1(this, continuation, i10);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue2);
                    Updater.LaunchedEffect(gapComposer2, flow, new EditProfilePresenter$models$2$1(flow, continuation, this, i9));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new SectionHeaderScope$$ExternalSyntheticLambda1(this, flow, i, 12);
                    break;
                }
                break;
            case 8:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1322745372);
                if ((i & 48) == 0) {
                    i4 = i | (gapComposer3.changedInstance(this) ? 32 : 16);
                } else {
                    i4 = i;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 17) != 16)) {
                    boolean changedInstance3 = gapComposer3.changedInstance(this);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AmountPickerCondensedView.AnonymousClass14(this, continuation, 28);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer3, this, (Function2) rememberedValue3);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, r10 ? 1 : 0);
                    break;
                }
                break;
            case 13:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(1191121986);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer4.changedInstance(flow) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer4, flow, new FileBlockerView$6$2$2(flow, continuation, this, 5));
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer4.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i9);
                    break;
                }
                break;
            case 14:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(950839700);
                if ((i & 6) == 0) {
                    i6 = i | (gapComposer5.changedInstance(flow) ? 4 : 2);
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer5.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer5, flow, new FileBlockerView$6$2$2(flow, continuation, this, i10));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer5.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(this, flow, i, i12);
                    break;
                }
                break;
            default:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(-1271795816);
                if ((i & 6) == 0) {
                    i7 = i | (gapComposer6.changedInstance(flow) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= gapComposer6.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer6.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer6, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, i11));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup6 = gapComposer6.endRestartGroup();
                if (endRestartGroup6 != null) {
                    endRestartGroup6.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 14);
                    break;
                }
                break;
        }
    }
}
