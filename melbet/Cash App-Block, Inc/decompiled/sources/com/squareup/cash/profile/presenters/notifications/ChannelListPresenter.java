package com.squareup.cash.profile.presenters.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.core.text.TextUtilsCompat;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.cdf.notificationssettings.ConfirmationSheetOrigin;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.SponsoredAccount;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ChannelListPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final ProfileScreens.ChannelListScreen args;
    public final FlowStarter blockersNavigator;
    public final boolean canRequestNotificationPermission;
    public final RealCustomerStore customerStore;
    public final FeatureFlagManager featureFlagManager;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidPermissionManager permissionManager;
    public final RealProfileNotificationsRepository repository;
    public final NotificationSettingsChecker settingsChecker;
    public final AndroidStringManager stringManager;

    public ChannelListPresenter(RealProfileNotificationsRepository realProfileNotificationsRepository, AndroidStringManager androidStringManager, RealCustomerStore realCustomerStore, FlowStarter flowStarter, AndroidPermissionManager androidPermissionManager, IntentLauncher intentLauncher, Analytics analytics, NotificationSettingsChecker notificationSettingsChecker, FeatureFlagManager featureFlagManager, ProfileScreens.ChannelListScreen channelListScreen, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        channelListScreen.getClass();
        this.repository = realProfileNotificationsRepository;
        this.stringManager = androidStringManager;
        this.customerStore = realCustomerStore;
        this.blockersNavigator = flowStarter;
        this.permissionManager = androidPermissionManager;
        this.launcher = intentLauncher;
        this.analytics = analytics;
        this.settingsChecker = notificationSettingsChecker;
        this.featureFlagManager = featureFlagManager;
        this.args = channelListScreen;
        this.navigator = screenNavigator;
        this.canRequestNotificationPermission = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.squareup.cash.profile.presenters.notifications.ChannelListPresenter] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleToggleClick(ChannelListPresenter channelListPresenter, ChannelListViewEvent.ToggleClicked toggleClicked, String str, Category category, Integer num, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1, ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12, ContinuationImpl continuationImpl) {
        ChannelListPresenter$handleToggleClick$1 channelListPresenter$handleToggleClick$1;
        int i;
        Category category2;
        ChannelListViewEvent.ToggleClicked toggleClicked2;
        ChannelListViewEvent.ToggleClicked toggleClicked3;
        List list;
        ?? r5;
        EmptyList emptyList;
        EmptyList emptyList2;
        Object obj;
        List list2;
        Category category3 = category;
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$13 = shiftNotePresenter$models$1$1;
        ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$14 = shiftNotePresenter$models$1$12;
        AndroidStringManager androidStringManager = channelListPresenter.stringManager;
        ProfileScreens.ChannelListScreen channelListScreen = channelListPresenter.args;
        if (continuationImpl instanceof ChannelListPresenter$handleToggleClick$1) {
            channelListPresenter$handleToggleClick$1 = (ChannelListPresenter$handleToggleClick$1) continuationImpl;
            int i2 = channelListPresenter$handleToggleClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                channelListPresenter$handleToggleClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                ChannelListPresenter$handleToggleClick$1 channelListPresenter$handleToggleClick$12 = channelListPresenter$handleToggleClick$1;
                Object obj2 = channelListPresenter$handleToggleClick$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelListPresenter$handleToggleClick$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (category3 != null) {
                        Analytics analytics = channelListPresenter.analytics;
                        String channelListSettingsPage = zzaky.getChannelListSettingsPage(channelListScreen.categoryType);
                        boolean z = toggleClicked.toggledValue;
                        ChannelType channelType = toggleClicked.channelType;
                        zzaky.trackChangeNotificationSettingToggle(analytics, str, channelListSettingsPage, z, channelType);
                        shiftNotePresenter$models$1$13.invoke(ProfileNotificationsHelperKt.updateChannelToggleState(category3, channelType, toggleClicked.toggledValue));
                        if (!toggleClicked.hasNoEnabledAlias || channelType == ChannelType.PUSH) {
                            shiftNotePresenter$models$1$14.invoke(Boolean.TRUE);
                            String str2 = ProfileNotificationsHelperKt.ACCOUNT_BASED_CATEGORIES.contains(channelListScreen.categoryType) ? str : null;
                            ChannelType channelType2 = toggleClicked.channelType;
                            boolean z2 = toggleClicked.toggledValue;
                            channelListPresenter$handleToggleClick$12.L$0 = toggleClicked;
                            channelListPresenter$handleToggleClick$12.L$4 = shiftNotePresenter$models$1$13;
                            channelListPresenter$handleToggleClick$12.L$5 = shiftNotePresenter$models$1$14;
                            channelListPresenter$handleToggleClick$12.L$6 = category3;
                            channelListPresenter$handleToggleClick$12.label = 2;
                            obj2 = channelListPresenter.sendChannelToggleUpdate$real(category3, channelType2, z2, str2, num, channelListPresenter$handleToggleClick$12);
                            if (obj2 != coroutineSingletons) {
                                category2 = category;
                                toggleClicked2 = toggleClicked;
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                                shiftNotePresenter$models$1$14.invoke(Boolean.FALSE);
                            }
                        } else {
                            CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(channelListPresenter.repository.getAliasNotificationPreferences(), 25);
                            channelListPresenter$handleToggleClick$12.L$0 = toggleClicked;
                            channelListPresenter$handleToggleClick$12.L$4 = shiftNotePresenter$models$1$13;
                            channelListPresenter$handleToggleClick$12.L$5 = null;
                            channelListPresenter$handleToggleClick$12.L$6 = category3;
                            channelListPresenter$handleToggleClick$12.label = 1;
                            obj2 = FlowKt.firstOrNull(cashQrScannerPresenter$special$$inlined$filter$1, channelListPresenter$handleToggleClick$12);
                            if (obj2 != coroutineSingletons) {
                                toggleClicked3 = toggleClicked;
                                list = (List) obj2;
                                if (list != null) {
                                }
                                r5 = 0;
                                if (r5 == 0) {
                                }
                                ChannelType channelType3 = toggleClicked3.channelType;
                                shiftNotePresenter$models$1$13.invoke(ProfileNotificationsHelperKt.updateChannelToggleState(category3, channelType3, !toggleClicked3.toggledValue));
                                BetterNavigator.ScreenNavigator screenNavigator = channelListPresenter.navigator;
                                ChannelType channelType4 = ChannelType.SMS;
                                String str3 = androidStringManager.get(channelType3 == channelType4 ? R.string.enable_alias_sheet_title_toggling_sms : R.string.enable_alias_sheet_title_toggling_email);
                                String str4 = androidStringManager.get(channelType3 == channelType4 ? R.string.enable_alias_sheet_body_toggling_sms : R.string.enable_alias_sheet_body_toggling_email);
                                if (channelType3 == channelType4) {
                                }
                                if (emptyList == null) {
                                }
                                RedactedParcelableList redactList = DBUtil.redactList(emptyList);
                                if (channelType3 == ChannelType.EMAIL) {
                                }
                                if (emptyList2 == null) {
                                }
                                screenNavigator.goTo(new ProfileScreens.EnableAliasSheetScreen(str3, str4, redactList, DBUtil.redactList(emptyList2), ConfirmationSheetOrigin.CHANNEL, zzaky.toAnalyticsAliasType(channelType3), channelListScreen.categoryType));
                            }
                        }
                        return coroutineSingletons;
                    }
                } else if (i == 1) {
                    category3 = channelListPresenter$handleToggleClick$12.L$6;
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$15 = channelListPresenter$handleToggleClick$12.L$4;
                    toggleClicked3 = channelListPresenter$handleToggleClick$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    shiftNotePresenter$models$1$13 = shiftNotePresenter$models$1$15;
                    list = (List) obj2;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            AliasItem aliasItem = ((ContactMethodType) obj).aliasType;
                            ChannelType channelType5 = toggleClicked3.channelType;
                            List list3 = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
                            channelType5.getClass();
                            int ordinal = channelType5.ordinal();
                            if (aliasItem == (ordinal != 0 ? ordinal != 1 ? null : AliasItem.PHONE : AliasItem.EMAIL)) {
                                break;
                            }
                        }
                        ContactMethodType contactMethodType = (ContactMethodType) obj;
                        if (contactMethodType != null && (list2 = contactMethodType.aliases) != null) {
                            r5 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (!((Alias) obj3).isChecked) {
                                    r5.add(obj3);
                                }
                            }
                            if (r5 == 0) {
                                r5 = EmptyList.INSTANCE;
                            }
                            ChannelType channelType32 = toggleClicked3.channelType;
                            shiftNotePresenter$models$1$13.invoke(ProfileNotificationsHelperKt.updateChannelToggleState(category3, channelType32, !toggleClicked3.toggledValue));
                            BetterNavigator.ScreenNavigator screenNavigator2 = channelListPresenter.navigator;
                            ChannelType channelType42 = ChannelType.SMS;
                            String str32 = androidStringManager.get(channelType32 == channelType42 ? R.string.enable_alias_sheet_title_toggling_sms : R.string.enable_alias_sheet_title_toggling_email);
                            String str42 = androidStringManager.get(channelType32 == channelType42 ? R.string.enable_alias_sheet_body_toggling_sms : R.string.enable_alias_sheet_body_toggling_email);
                            emptyList = channelType32 == channelType42 ? r5 : null;
                            if (emptyList == null) {
                                emptyList = EmptyList.INSTANCE;
                            }
                            RedactedParcelableList redactList2 = DBUtil.redactList(emptyList);
                            emptyList2 = channelType32 == ChannelType.EMAIL ? r5 : null;
                            if (emptyList2 == null) {
                                emptyList2 = EmptyList.INSTANCE;
                            }
                            screenNavigator2.goTo(new ProfileScreens.EnableAliasSheetScreen(str32, str42, redactList2, DBUtil.redactList(emptyList2), ConfirmationSheetOrigin.CHANNEL, zzaky.toAnalyticsAliasType(channelType32), channelListScreen.categoryType));
                        }
                    }
                    r5 = 0;
                    if (r5 == 0) {
                    }
                    ChannelType channelType322 = toggleClicked3.channelType;
                    shiftNotePresenter$models$1$13.invoke(ProfileNotificationsHelperKt.updateChannelToggleState(category3, channelType322, !toggleClicked3.toggledValue));
                    BetterNavigator.ScreenNavigator screenNavigator22 = channelListPresenter.navigator;
                    ChannelType channelType422 = ChannelType.SMS;
                    String str322 = androidStringManager.get(channelType322 == channelType422 ? R.string.enable_alias_sheet_title_toggling_sms : R.string.enable_alias_sheet_title_toggling_email);
                    String str422 = androidStringManager.get(channelType322 == channelType422 ? R.string.enable_alias_sheet_body_toggling_sms : R.string.enable_alias_sheet_body_toggling_email);
                    if (channelType322 == channelType422) {
                    }
                    if (emptyList == null) {
                    }
                    RedactedParcelableList redactList22 = DBUtil.redactList(emptyList);
                    if (channelType322 == ChannelType.EMAIL) {
                    }
                    if (emptyList2 == null) {
                    }
                    screenNavigator22.goTo(new ProfileScreens.EnableAliasSheetScreen(str322, str422, redactList22, DBUtil.redactList(emptyList2), ConfirmationSheetOrigin.CHANNEL, zzaky.toAnalyticsAliasType(channelType322), channelListScreen.categoryType));
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    category2 = channelListPresenter$handleToggleClick$12.L$6;
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$16 = channelListPresenter$handleToggleClick$12.L$5;
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$17 = channelListPresenter$handleToggleClick$12.L$4;
                    toggleClicked2 = channelListPresenter$handleToggleClick$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    shiftNotePresenter$models$1$14 = shiftNotePresenter$models$1$16;
                    shiftNotePresenter$models$1$13 = shiftNotePresenter$models$1$17;
                    if (!((Boolean) obj2).booleanValue()) {
                        shiftNotePresenter$models$1$13.invoke(ProfileNotificationsHelperKt.updateChannelToggleState(category2, toggleClicked2.channelType, !toggleClicked2.toggledValue));
                    }
                    shiftNotePresenter$models$1$14.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }
        channelListPresenter$handleToggleClick$1 = new ChannelListPresenter$handleToggleClick$1(channelListPresenter, continuationImpl);
        ChannelListPresenter$handleToggleClick$1 channelListPresenter$handleToggleClick$122 = channelListPresenter$handleToggleClick$1;
        Object obj22 = channelListPresenter$handleToggleClick$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelListPresenter$handleToggleClick$122.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static ArrayList toSponsoredFamilyMembers$real(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Recipient recipient = (Recipient) obj;
            SponsoredAccount sponsoredAccount = list2 != null ? (SponsoredAccount) list2.get(i) : null;
            List list4 = ProfileNotificationsHelperKt.ACCOUNT_CATEGORIES;
            recipient.getClass();
            arrayList.add(new SponsoredFamilyMember(sponsoredAccount != null ? sponsoredAccount.accountToken : null, recipient.displayName, recipient.cashtag, recipient.photo, sponsoredAccount != null && sponsoredAccount.notificationsEnabled, sponsoredAccount != null && sponsoredAccount.notificationsTurnedOn));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object moleculeKt$immediateClockFlow$1$1$1;
        String str;
        ChannelListPresenter channelListPresenter;
        MutableState mutableState;
        MutableState mutableState2;
        Object appLockMonitor$special$$inlined$map$2;
        List list;
        Object obj;
        MutableState collectAsState;
        GapComposer gapComposer;
        Object obj2;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1833862017);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer2.changedInstance(this);
        Object rememberedValue = gapComposer2.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        ?? r12 = 0;
        Object obj3 = rememberedValue;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            InviteErrorPresenter$models$1$1 inviteErrorPresenter$models$1$1 = new InviteErrorPresenter$models$1$1(this, r12, 29);
            gapComposer2.updateRememberedValue(inviteErrorPresenter$models$1$1);
            obj3 = inviteErrorPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj3);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj4 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            ChannelFlowTransformLatest notificationSettings = this.repository.getNotificationSettings();
            gapComposer2.updateRememberedValue(notificationSettings);
            obj4 = notificationSettings;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) obj4, null, null, gapComposer2, 48, 2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj5 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj5 = mutableStateOf$default;
        }
        MutableState mutableState3 = (MutableState) obj5;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        Object obj6 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj6 = mutableStateOf$default2;
        }
        MutableState mutableState4 = (MutableState) obj6;
        ProfileScreens.ChannelListScreen channelListScreen = this.args;
        String str2 = channelListScreen.ownerAccountToken;
        NotificationCategory notificationCategory = channelListScreen.categoryType;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj7 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj7 = mutableStateOf$default3;
        }
        MutableState mutableState5 = (MutableState) obj7;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default4);
            obj8 = mutableStateOf$default4;
        }
        MutableState mutableState6 = (MutableState) obj8;
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) collectAsState2.getValue();
        boolean changed = gapComposer2.changed(collectAsState2) | gapComposer2.changed(str2) | gapComposer2.changedInstance(this);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (changed || rememberedValue7 == neverEqualPolicy) {
            moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(str2, this, collectAsState2, mutableState3, mutableState6, null, 26);
            str = str2;
            channelListPresenter = this;
            mutableState = mutableState3;
            mutableState2 = mutableState6;
            gapComposer2.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
        } else {
            str = str2;
            mutableState = mutableState3;
            mutableState2 = mutableState6;
            moleculeKt$immediateClockFlow$1$1$1 = rememberedValue7;
            channelListPresenter = this;
        }
        Updater.LaunchedEffect(gapComposer2, uiNotificationSettings, (Function2) moleculeKt$immediateClockFlow$1$1$1);
        boolean changed2 = gapComposer2.changed((Category) mutableState.getValue());
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue8 == neverEqualPolicy) {
            Category category = (Category) mutableState.getValue();
            Category.CategoryType categoryType = category != null ? category.categoryType : null;
            Category.CategoryType.ChannelList channelList = categoryType instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType : null;
            if (channelList == null || (list = channelList.family) == null) {
                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(r12, 19);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = ((SponsoredAccount) it.next()).accountToken;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
                appLockMonitor$special$$inlined$map$2 = channelListPresenter.customerStore.getCustomersForIds(arrayList);
            }
            rememberedValue8 = appLockMonitor$special$$inlined$map$2;
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer2, 48, 2);
        boolean changed3 = gapComposer2.changed(notificationCategory.ordinal());
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj9 = rememberedValue9;
        if (changed3 || rememberedValue9 == neverEqualPolicy) {
            Iterator it2 = NotificationChannelId.$ENTRIES.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((NotificationChannelId) obj).id.equals(notificationCategory.name())) {
                    break;
                }
            }
            NotificationChannelId notificationChannelId = (NotificationChannelId) obj;
            gapComposer2.updateRememberedValue(notificationChannelId);
            obj9 = notificationChannelId;
        }
        NotificationChannelId notificationChannelId2 = (NotificationChannelId) obj9;
        if (notificationChannelId2 == null) {
            gapComposer2.startReplaceGroup(-597692483);
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            collectAsState = null;
        } else {
            gapComposer2.startReplaceGroup(-597692482);
            collectAsState = Updater.collectAsState(((RealAndroidNotificationSettingsChecker) channelListPresenter.settingsChecker).notificationChannelState(notificationChannelId2), NotificationChannelToggleState.NotFound, null, gapComposer2, 48, 2);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        }
        if (collectAsState == null) {
            gapComposer.startReplaceGroup(-1404750435);
            collectAsState = Updater.rememberUpdatedState(NotificationChannelToggleState.NotFound, gapComposer);
        } else {
            gapComposer.startReplaceGroup(-1404753969);
        }
        gapComposer.end(false);
        MutableState mutableState7 = mutableState;
        GapComposer gapComposer3 = gapComposer;
        Updater.LaunchedEffect(gapComposer3, flow, new RealBugReportSender$submitBugReport$2(flow, (Continuation) null, channelListPresenter, Updater.rememberUpdatedState((NotificationChannelToggleState) collectAsState.getValue(), gapComposer), str, notificationChannelId2, mutableState4, mutableState7, mutableState2, mutableState5, collectAsState3));
        Category category2 = (Category) mutableState7.getValue();
        if (category2 != null) {
            boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
            List list2 = (List) collectAsState3.getValue();
            if (list2 != null) {
                Category.CategoryType categoryType2 = category2.categoryType;
                Category.CategoryType.ChannelList channelList2 = categoryType2 instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType2 : null;
                r12 = toSponsoredFamilyMembers$real(list2, channelList2 != null ? channelList2.family : null);
            }
            obj2 = new ChannelListViewModel.Loaded(category2, booleanValue, booleanValue2, r12);
        } else {
            obj2 = ChannelListViewModel.Loading.INSTANCE;
        }
        gapComposer3.end(false);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendChannelToggleUpdate$real(Category category, ChannelType channelType, boolean z, String str, Integer num, ContinuationImpl continuationImpl) {
        ChannelListPresenter$sendChannelToggleUpdate$1 channelListPresenter$sendChannelToggleUpdate$1;
        int i;
        boolean z2;
        ApiResult apiResult;
        if (continuationImpl instanceof ChannelListPresenter$sendChannelToggleUpdate$1) {
            channelListPresenter$sendChannelToggleUpdate$1 = (ChannelListPresenter$sendChannelToggleUpdate$1) continuationImpl;
            int i2 = channelListPresenter$sendChannelToggleUpdate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                channelListPresenter$sendChannelToggleUpdate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = channelListPresenter$sendChannelToggleUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelListPresenter$sendChannelToggleUpdate$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Category.CategoryType categoryType = category.categoryType;
                    Category.CategoryType.ChannelList channelList = categoryType instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType : null;
                    if (channelList == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Category type must be channel list");
                        return null;
                    }
                    ClientChannelState clientChannelState = z ? ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED : ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED;
                    NotificationCategory notificationCategory = channelList.notificationCategory;
                    if (str != null) {
                        if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).disabled()) {
                            z2 = true;
                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new CategoryPreferenceUpdate(str, notificationCategory, channelType != ChannelType.EMAIL ? clientChannelState : null, channelType != ChannelType.PUSH ? clientChannelState : null, channelType != ChannelType.SMS ? clientChannelState : null, num == null ? new Long(num.intValue()) : null, (NotificationCategoryExtraConfig) null, Boolean.valueOf(z2), 320));
                            channelListPresenter$sendChannelToggleUpdate$1.label = 1;
                            RealProfileNotificationsRepository realProfileNotificationsRepository = this.repository;
                            obj = JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileNotificationsRepository, listOf, continuation, 21), channelListPresenter$sendChannelToggleUpdate$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z2 = false;
                    if (num == null) {
                    }
                    if (channelType != ChannelType.EMAIL) {
                    }
                    if (channelType != ChannelType.SMS) {
                    }
                    List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new CategoryPreferenceUpdate(str, notificationCategory, channelType != ChannelType.EMAIL ? clientChannelState : null, channelType != ChannelType.PUSH ? clientChannelState : null, channelType != ChannelType.SMS ? clientChannelState : null, num == null ? new Long(num.intValue()) : null, (NotificationCategoryExtraConfig) null, Boolean.valueOf(z2), 320));
                    channelListPresenter$sendChannelToggleUpdate$1.label = 1;
                    RealProfileNotificationsRepository realProfileNotificationsRepository2 = this.repository;
                    obj = JobKt.withContext(realProfileNotificationsRepository2.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileNotificationsRepository2, listOf2, continuation, 21), channelListPresenter$sendChannelToggleUpdate$1);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    return Boolean.TRUE;
                }
                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                zzaky.trackChangeSettingError(this.analytics, zzaky.getReasonCode(failure));
                ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(this.stringManager, failure, null);
                this.navigator.goTo(new ProfileScreens.ErrorScreen(errorMessaging.message, errorMessaging.title, 12));
                return Boolean.FALSE;
            }
        }
        channelListPresenter$sendChannelToggleUpdate$1 = new ChannelListPresenter$sendChannelToggleUpdate$1(this, continuationImpl);
        Object obj2 = channelListPresenter$sendChannelToggleUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelListPresenter$sendChannelToggleUpdate$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck blockersNavigator;
        public final Provider customerStore;
        public final DoubleCheck featureFlagManager;
        public final Provider launcher;
        public final Provider permissionManager;
        public final Provider repository;
        public final Provider settingsChecker;
        public final LambdaProvider stringManager;

        public MetroFactory(NavigationSideEffects.MetroFactory metroFactory, LambdaProvider lambdaProvider, RetroUiFactory.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, IntentLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck3, RealAndroidNotificationSettingsChecker.MetroFactory metroFactory4, DoubleCheck doubleCheck4) {
            this.repository = metroFactory;
            this.stringManager = lambdaProvider;
            this.customerStore = metroFactory2;
            this.blockersNavigator = doubleCheck;
            this.permissionManager = doubleCheck2;
            this.launcher = metroFactory3;
            this.analytics = doubleCheck3;
            this.settingsChecker = metroFactory4;
            this.featureFlagManager = doubleCheck4;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBadger2.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, TreehouseFlows.MetroFactory metroFactory2, DoubleCheck doubleCheck3, RealMessageSigner.MetroFactory metroFactory3, TreehouseFlows.MetroFactory metroFactory4, CashCdpConfigProvider.MetroFactory metroFactory5) {
            this.blockersNavigator = doubleCheck;
            this.repository = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck2;
            this.customerStore = metroFactory2;
            this.featureFlagManager = doubleCheck3;
            this.permissionManager = metroFactory3;
            this.launcher = metroFactory4;
            this.settingsChecker = metroFactory5;
        }
    }
}
