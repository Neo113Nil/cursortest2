package com.squareup.cash.profile.views;

import android.content.Context;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.text.TextUtilsCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import androidx.emoji2.text.EmojiExclusions;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b2$$ExternalSyntheticLambda0;
import coil3.ImageLoader$Builder;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoConfirmationDialogEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewEvent;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.cdf.account.AccountConfigureSyncContacts;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewCancelPaymentPlan;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewPaymentPlanCardDetails;
import com.squareup.cash.cdf.browser.BrowserViewCloseRestrictedItemWarning;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.cashapppay.CashAppPayAuthDismissError;
import com.squareup.cash.cdf.identity.IdentityConfirmTap;
import com.squareup.cash.cdf.identity.IdentityOpenView;
import com.squareup.cash.cdf.identity.ScreenType;
import com.squareup.cash.cdf.identity.Source;
import com.squareup.cash.cdf.identity.VerificationType;
import com.squareup.cash.cdf.notificationsoptin.NotificationPromptEntryPoint;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewSettings;
import com.squareup.cash.cdf.qrcodeshortcuts.QRCodeShortcutsOnboardingAddTile;
import com.squareup.cash.cdf.qrcodeshortcuts.QRCodeShortcutsOnboardingAddWidget;
import com.squareup.cash.cdf.qrcodeshortcuts.QRCodeShortcutsOnboardingDismiss;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceEndOnCadenceSelection;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceEndOnDatePicker;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageAllowanceEndOnDayOfCadenceSelection;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceViewSelectUpsell;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.data.contacts.ContactsSyncState;
import com.squareup.cash.data.profile.CropResultManager$CropResult;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$NotificationSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PersonalSettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt$toCdfEvent$2;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.pools.backend.api.Participant;
import com.squareup.cash.pools.backend.api.ParticipantType;
import com.squareup.cash.pools.backend.api.PoolAppletPreview;
import com.squareup.cash.pools.backend.api.PoolsAppletData;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.views.PoolGoalMetKt$PoolGoalMet$1$1$1;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCashCardFAQPresenter;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewEvent;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.OpenSourcePresenter$models$model$2$1$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.InvestingContactPresenter;
import com.squareup.cash.profile.presenters.trustedcontact.TrustedContactFlowPresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.InvestingContactScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ProfileCropViewEvent;
import com.squareup.cash.profile.viewmodels.RingtoneItem;
import com.squareup.cash.profile.viewmodels.RingtoneResult;
import com.squareup.cash.profile.viewmodels.RingtoneViewEvent;
import com.squareup.cash.profile.viewmodels.RingtoneViewModel;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.screens.CashtagQrScanResult;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.viewmodels.CashQrShortcutsOnboardingViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewEvent;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeResult$Positive;
import com.squareup.cash.recurring.ConfirmFirstScheduledReloadNoticeViewEvent$PositiveClick;
import com.squareup.cash.recurringpayments.presenters.RealSelectCadencePresenter;
import com.squareup.cash.recurringpayments.presenters.RealSelectDayOfCadencePresenter;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.recurringpayments.screens.SelectDayOfCadenceScreen;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewEvent;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewEvent;
import com.squareup.cash.savings.presenters.SavingsUpsellCardPresenter;
import com.squareup.cash.savings.screens.SavingsScreen;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.TransferringViewEvent$Exit;
import com.squareup.cash.savings.viewmodels.UpsellCardEvent;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.security.viewmodels.PasswordDialogViewEvent$ButtonClick;
import com.squareup.cash.securityhub.presenters.ProtectionsSectionPresenter;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideId;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.securityhub.viewmodels.BookletViewEvent;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionViewEvent;
import com.squareup.cash.securityhub.viewmodels.SecurityHubViewEvent;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.shopping.presenters.CashAppPayIncentiveSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingInfoSheetPresenter;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.shopping.screens.ContinueWithCashAppPaySheetResult;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.settings.viewmodels.ErrorViewEvent$GoBack;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentAnalyticsParam;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewEvent$ActionButtonPressed;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewEvent;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCardDetailsViewEvent$ConfirmButtonPressed;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewEvent;
import com.squareup.cash.shopping.viewmodels.IncentiveErrorDialogViewEvent$Close;
import com.squareup.cash.shopping.viewmodels.IncentiveSheetViewEvent;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewEvent$Close;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewEvent;
import com.squareup.cash.stablecoin.presenters.StablecoinHomePresenter;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewEvent$BackClicked;
import com.squareup.cash.support.backend.real.RealSupportTransactionService;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.cash.ui.widget.MaxWidthLinearLayout;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.kycrefresh.common.RefreshType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.GetMoneyPoolRequest;
import com.squareup.protos.cash.pools.GetMoneyPoolResponse;
import com.squareup.protos.cash.pools.GetPoolsAppletResponse;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.PoolsAppletStats;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.util.android.coroutines.ViewKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.internal.Tags;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class RingtoneView extends MaxWidthLinearLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(RingtoneView.class, "listView", "getListView()Landroid/widget/ListView;", 0), new PropertyReference1Impl(RingtoneView.class, "cancelButton", "getCancelButton()Landroid/view/View;", 0), new PropertyReference1Impl(RingtoneView.class, "okButton", "getOkButton()Landroid/view/View;", 0)};
    public final SparseArray additionalItemsByPosition;
    public final Lazy cancelButton$delegate;
    public int clickedPos;
    public Ringtone defaultRingtone;
    public int defaultRingtonePos;
    public Ui.EventReceiver eventReceiver;
    public final LayoutInflater inflater;
    public final Lazy listView$delegate;
    public final Lazy okButton$delegate;
    public final RingtoneManager rm;
    public int silentPos;
    public int staticItemCount;
    public final Uri uriForDefaultItem;

    public final class RingtoneAdapter extends ResourceCursorAdapter {
        public int[] mFrom;
        public String[] mOriginalFrom;
        public int mStringConversionColumn;
        public int[] mTo;

        @Override // androidx.cursoradapter.widget.CursorAdapter
        public final void bindView(View view, Cursor cursor) {
            int[] iArr = this.mTo;
            int length = iArr.length;
            int[] iArr2 = this.mFrom;
            for (int i = 0; i < length; i++) {
                View findViewById = view.findViewById(iArr[i]);
                if (findViewById != null) {
                    String string2 = cursor.getString(iArr2[i]);
                    if (string2 == null) {
                        string2 = "";
                    }
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setText(string2);
                    } else if (!(findViewById instanceof ImageView)) {
                        a$$ExternalSyntheticBUOutline0.m$1(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                        return;
                    } else {
                        ImageView imageView = (ImageView) findViewById;
                        try {
                            imageView.setImageResource(Integer.parseInt(string2));
                        } catch (NumberFormatException unused) {
                            imageView.setImageURI(Uri.parse(string2));
                        }
                    }
                }
            }
        }

        @Override // androidx.cursoradapter.widget.CursorAdapter
        public final String convertToString(Cursor cursor) {
            int i = this.mStringConversionColumn;
            return i > -1 ? cursor.getString(i) : cursor == null ? "" : cursor.toString();
        }

        public final void findColumns(Cursor cursor, String[] strArr) {
            if (cursor == null) {
                this.mFrom = null;
                return;
            }
            int length = strArr.length;
            int[] iArr = this.mFrom;
            if (iArr == null || iArr.length != length) {
                this.mFrom = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.mFrom[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
        }

        @Override // androidx.cursoradapter.widget.CursorAdapter
        public final Cursor swapCursor(Cursor cursor) {
            findColumns(cursor, this.mOriginalFrom);
            return super.swapCursor(cursor);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.listView$delegate = KotterKnifeKt.bindView(this, R.id.list);
        this.cancelButton$delegate = KotterKnifeKt.bindView(this, R.id.cancel);
        this.okButton$delegate = KotterKnifeKt.bindView(this, R.id.ok);
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.inflater = from;
        RingtoneManager ringtoneManager = new RingtoneManager(context);
        ringtoneManager.setType(2);
        this.rm = ringtoneManager;
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        defaultUri.getClass();
        this.uriForDefaultItem = defaultUri;
        this.additionalItemsByPosition = new SparseArray();
        this.defaultRingtonePos = -1;
        this.silentPos = -1;
        this.clickedPos = -1;
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass1(context, this, null, 0));
    }

    public final int addStaticItem(ListView listView, int i) {
        View inflate = this.inflater.inflate(R.layout.ringtone_item, (ViewGroup) listView, false);
        inflate.getClass();
        TextView textView = (TextView) inflate;
        textView.setText(i);
        listView.addHeaderView(textView);
        this.staticItemCount++;
        return listView.getHeaderViewsCount() - 1;
    }

    public final ListView getListView$1() {
        return (ListView) this.listView$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        KProperty[] kPropertyArr = $$delegatedProperties;
        final int i = 0;
        ((View) this.okButton$delegate.getValue(this, kPropertyArr[2])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.RingtoneView$$ExternalSyntheticLambda1
            public final /* synthetic */ RingtoneView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri ringtoneUri;
                int i2 = i;
                RingtoneView ringtoneView = this.f$0;
                switch (i2) {
                    case 0:
                        int i3 = ringtoneView.clickedPos;
                        if (i3 == ringtoneView.defaultRingtonePos) {
                            ringtoneUri = ringtoneView.uriForDefaultItem;
                        } else if (i3 == ringtoneView.silentPos) {
                            ringtoneUri = null;
                        } else {
                            RingtoneItem ringtoneItem = (RingtoneItem) ringtoneView.additionalItemsByPosition.get(i3);
                            if (ringtoneItem == null || (ringtoneUri = ringtoneItem.persistedUri) == null) {
                                ringtoneUri = ringtoneView.rm.getRingtoneUri(ringtoneView.clickedPos - ringtoneView.staticItemCount);
                            }
                        }
                        Ui.EventReceiver eventReceiver = ringtoneView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new RingtoneViewEvent.OkClicked(new RingtoneResult(ringtoneUri)));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = ringtoneView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(RingtoneViewEvent.CancelClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        final int i2 = 1;
        ((View) this.cancelButton$delegate.getValue(this, kPropertyArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.RingtoneView$$ExternalSyntheticLambda1
            public final /* synthetic */ RingtoneView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri ringtoneUri;
                int i22 = i2;
                RingtoneView ringtoneView = this.f$0;
                switch (i22) {
                    case 0:
                        int i3 = ringtoneView.clickedPos;
                        if (i3 == ringtoneView.defaultRingtonePos) {
                            ringtoneUri = ringtoneView.uriForDefaultItem;
                        } else if (i3 == ringtoneView.silentPos) {
                            ringtoneUri = null;
                        } else {
                            RingtoneItem ringtoneItem = (RingtoneItem) ringtoneView.additionalItemsByPosition.get(i3);
                            if (ringtoneItem == null || (ringtoneUri = ringtoneItem.persistedUri) == null) {
                                ringtoneUri = ringtoneView.rm.getRingtoneUri(ringtoneView.clickedPos - ringtoneView.staticItemCount);
                            }
                        }
                        Ui.EventReceiver eventReceiver = ringtoneView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new RingtoneViewEvent.OkClicked(new RingtoneResult(ringtoneUri)));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = ringtoneView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(RingtoneViewEvent.CancelClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(RingtoneViewModel ringtoneViewModel) {
        ringtoneViewModel.getClass();
        boolean z = ringtoneViewModel.showDefault;
        Uri uri = ringtoneViewModel.currentRingtone;
        if (z) {
            this.defaultRingtonePos = addStaticItem(getListView$1(), R.string.ringtone_picker_default);
            if (this.clickedPos == -1 && RingtoneManager.isDefault(uri)) {
                this.clickedPos = this.defaultRingtonePos;
            }
        }
        if (ringtoneViewModel.showSilent) {
            int addStaticItem = addStaticItem(getListView$1(), R.string.ringtone_picker_silent);
            this.silentPos = addStaticItem;
            if (this.clickedPos == -1 && uri == null) {
                this.clickedPos = addStaticItem;
            }
        }
        List<RingtoneItem> list = ringtoneViewModel.additionalItems;
        if (list != null) {
            for (RingtoneItem ringtoneItem : list) {
                int addStaticItem2 = addStaticItem(getListView$1(), ringtoneItem.nameResId);
                this.additionalItemsByPosition.put(addStaticItem2, ringtoneItem);
                if (this.clickedPos == -1 && Intrinsics.areEqual(ringtoneItem.persistedUri, uri)) {
                    this.clickedPos = addStaticItem2;
                }
            }
        }
        if (this.clickedPos == -1) {
            int ringtonePosition = this.rm.getRingtonePosition(uri);
            if (ringtonePosition >= 0) {
                ringtonePosition += this.staticItemCount;
            }
            this.clickedPos = ringtonePosition;
        }
        getListView$1().setChoiceMode(1);
        getListView$1().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.squareup.cash.profile.views.RingtoneView$$ExternalSyntheticLambda0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                RingtoneView ringtoneView = RingtoneView.this;
                ringtoneView.clickedPos = i;
                if (i == ringtoneView.silentPos) {
                    return;
                }
                ViewKt.whileEachAttached(ringtoneView, EmptyCoroutineContext.INSTANCE, new RingtoneView$playRingtone$1(i, ringtoneView, (Continuation) null, 0));
            }
        });
    }

    /* renamed from: com.squareup.cash.profile.views.RingtoneView$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public Object $context;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$context = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((Context) this.$context, (RingtoneView) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((RealPoolsRepository) this.$context, (String) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((RealPoolsRepository) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((GoalMetTimeline) this.$context, (PoolDetailsAnimationStateHolder) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((GoalMetTimeline) this.$context, (Function0) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass1((GoalMetTimeline) this.$context, (AvatarLayoutAnimationStateHolder) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass1((GoalMetTimeline) this.$context, (GoalMetAnimationStateHolder) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass1((Ref$ObjectRef) this.$context, (Function1) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass1((LazyListState) this.$context, (DelegatingSoftwareKeyboardController) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass1((PrepurchaseCashCardFAQPresenter) this.$context, (PrepurchaseCardFAQViewEvent) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1((State) this.$context, (PdfPreviewPresenter) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((PdfPreviewPresenter) this.$context, (State) obj2, continuation, 11);
                case 12:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((WorkHomePresenter) obj2, continuation, 12);
                    anonymousClass1.$context = obj;
                    return anonymousClass1;
                case 13:
                    return new AnonymousClass1((ProfilePrivacyPresenter) this.$context, (ProfilePrivacyViewEvent.ToggleContactsSync) obj2, continuation, 13);
                case 14:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((ProfilePrivacyPresenter) obj2, continuation, 14);
                    anonymousClass12.$context = obj;
                    return anonymousClass12;
                case 15:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1((TabToolbarPresenter) obj2, continuation, 15);
                    anonymousClass13.$context = obj;
                    return anonymousClass13;
                case 16:
                    return new AnonymousClass1((SetDefaultInstrumentPresenter) this.$context, (MutableState) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass1((WorkHomePresenter) this.$context, (MutableState) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass1((ProfileNotificationsPresenter) this.$context, (MutableState) obj2, continuation, 18);
                case 19:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1((ProfileNotificationsPresenter) obj2, continuation, 19);
                    anonymousClass14.$context = obj;
                    return anonymousClass14;
                case 20:
                    return new AnonymousClass1((StateFlow) this.$context, (LocalCashBalancePresenter) obj2, continuation, 20);
                case 21:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1((LocalCashBalancePresenter) obj2, continuation, 21);
                    anonymousClass15.$context = obj;
                    return anonymousClass15;
                case 22:
                    return new AnonymousClass1((RealProfileRepo) this.$context, (ProfileScreens.ProfileScreen.Customer) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass1((RealProfileRepo) this.$context, (CustomerProfileData) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass1((LocalEditorialPresenter) this.$context, (CashtagQrScanViewEvent) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((ImageLoader$Builder) this.$context, (String) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass1((PaymentPlanDataBlockerPresenter) this.$context, (PaymentPlanSummaryViewEvent) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass1((LocalEditorialPresenter) this.$context, (MutableState) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass1((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) this.$context, (Function1) obj2, continuation, 28);
                default:
                    return new AnonymousClass1((ScoreAppletTileViewModel) this.$context, (MutableState) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 3:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 5:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 6:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:502:0x07ee, code lost:
        
            if (r2 == r0) goto L435;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0147, code lost:
        
            if (com.squareup.util.cash.Cashtags.isCashtag(r4) != false) goto L71;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object moneyPool;
            Object withContext;
            CurrencyCode currencyCode;
            Money money;
            Integer num;
            Integer num2;
            Long l;
            Long l2;
            Long l3;
            Long l4;
            Unit unit;
            Object obj2;
            Object obj3;
            Object allowlistForCustomer;
            Object blockedCustomers;
            Object obj4;
            Object obj5;
            Object obj6;
            Object firstOrNull;
            Object firstOrNull2;
            String str;
            Object findByCashtag;
            int i = this.$r8$classId;
            int i2 = 3;
            int i3 = 4;
            int i4 = 2;
            int i5 = 14;
            int i6 = 5;
            boolean z = false;
            Object obj7 = this.this$0;
            String str2 = null;
            boolean z2 = false;
            boolean z3 = false;
            switch (i) {
                case 0:
                    RingtoneView ringtoneView = (RingtoneView) obj7;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Context context = (Context) this.$context;
                        Cursor cursor = ringtoneView.rm.getCursor();
                        cursor.getClass();
                        context.getClass();
                        String[] strArr = {"title"};
                        int[] iArr = {android.R.id.text1};
                        RingtoneAdapter ringtoneAdapter = new RingtoneAdapter();
                        ringtoneAdapter.init(context, cursor, 0);
                        ringtoneAdapter.mDropDownLayout = R.layout.ringtone_item;
                        ringtoneAdapter.mLayout = R.layout.ringtone_item;
                        ringtoneAdapter.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
                        ringtoneAdapter.mStringConversionColumn = -1;
                        ringtoneAdapter.mTo = iArr;
                        ringtoneAdapter.mOriginalFrom = strArr;
                        ringtoneAdapter.findColumns(cursor, strArr);
                        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(ringtoneAdapter, 19);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        Flow flowOn = FlowKt.flowOn(appLockMonitor$special$$inlined$map$2, DefaultIoScheduler.INSTANCE);
                        C00651 c00651 = new C00651(ringtoneView, 0);
                        this.label = 1;
                        if (flowOn.collect(c00651, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PoolsService poolsService = ((RealPoolsRepository) this.$context).poolsService;
                        GetMoneyPoolRequest getMoneyPoolRequest = new GetMoneyPoolRequest((String) obj7, ByteString.EMPTY);
                        this.label = 1;
                        moneyPool = poolsService.getMoneyPool(getMoneyPoolRequest, this);
                        if (moneyPool == coroutineSingletons2) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        moneyPool = obj;
                    }
                    ApiResult apiResult = (ApiResult) moneyPool;
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        break;
                    } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        break;
                    } else if (apiResult instanceof ApiResult.Success) {
                        GetMoneyPoolResponse getMoneyPoolResponse = (GetMoneyPoolResponse) ((ApiResult.Success) apiResult).response;
                        GetMoneyPoolResponse.FailureReason failureReason = getMoneyPoolResponse.failure_reason;
                        if (failureReason != null) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    RealPoolsRepository realPoolsRepository = (RealPoolsRepository) obj7;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                PoolsAppletData poolsAppletData = (PoolsAppletData) this.$context;
                                SafeTrace.throwOnFailure(obj);
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            withContext = obj;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        withContext = JobKt.withContext(realPoolsRepository.ioDispatcher, new MusicPresenter$models$3$1(realPoolsRepository, z2 ? 1 : 0, 28), this);
                        break;
                    }
                    GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) withContext;
                    if (getPoolsAppletResponse != null) {
                        PoolsAppletStats poolsAppletStats = getPoolsAppletResponse.stats;
                        List list = getPoolsAppletResponse.highlighted_pools;
                        List<MoneyPool> list2 = list;
                        int i10 = 10;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (MoneyPool moneyPool2 : list2) {
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            PoolOwner poolOwner = moneyPool2.owner;
                            Money money2 = moneyPool2.target;
                            Money money3 = moneyPool2.balance;
                            if (poolOwner != null) {
                                createListBuilder.add(new Participant(ParticipantType.CASH_APP_USER, moneyPool2.created_at, poolOwner.customer_token, poolOwner.full_name, poolOwner.profile_photo_url));
                            }
                            List<PoolParticipant> list3 = moneyPool2.participants;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, i10));
                            for (PoolParticipant poolParticipant : list3) {
                                PoolParticipantType poolParticipantType = poolParticipant.participant_type;
                                int i11 = poolParticipantType == null ? -1 : RealPoolsRepository.WhenMappings.$EnumSwitchMapping$0[poolParticipantType.ordinal()];
                                arrayList2.add(new Participant(i11 != 1 ? i11 != 2 ? ParticipantType.UNSPECIFIED : ParticipantType.OUT_OF_NETWORK : ParticipantType.CASH_APP_USER, poolParticipant.added_at, poolParticipant.customer_identifier, poolParticipant.full_name, poolParticipant.profile_photo_url));
                                list = list;
                            }
                            List list4 = list;
                            createListBuilder.addAll(arrayList2);
                            AbstractPersistentList persistentList = Tags.toPersistentList(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                            String str3 = moneyPool2.name;
                            long j = 0;
                            float longValue = ((money3 == null || (l4 = money3.amount) == null) ? 0L : l4.longValue()) / ((money2 == null || (l3 = money2.amount) == null) ? 1L : l3.longValue());
                            long longValue2 = (money3 == null || (l2 = money3.amount) == null) ? 0L : l2.longValue();
                            if (money2 != null && (l = money2.amount) != null) {
                                j = l.longValue();
                            }
                            arrayList.add(new PoolAppletPreview(str3, persistentList, longValue, longValue2, j));
                            list = list4;
                            i10 = 10;
                        }
                        List list5 = list;
                        int intValue = (poolsAppletStats == null || (num2 = poolsAppletStats.involved_active_pools) == null) ? 0 : num2.intValue();
                        int intValue2 = (poolsAppletStats == null || (num = poolsAppletStats.involved_closed_pools) == null) ? 0 : num.intValue();
                        MoneyPool moneyPool3 = (MoneyPool) CollectionsKt.firstOrNull(list5);
                        if (moneyPool3 == null || (money = moneyPool3.balance) == null || (currencyCode = money.currency_code) == null) {
                            currencyCode = CurrencyCode.USD;
                        }
                        PoolsAppletData poolsAppletData2 = new PoolsAppletData(intValue, intValue2, currencyCode, arrayList);
                        KeyValue keyValue = realPoolsRepository.poolsAppletData;
                        this.$context = poolsAppletData2;
                        this.label = 2;
                        if (keyValue.set(poolsAppletData2, this) != coroutineSingletons3) {
                        }
                        break;
                    }
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow = ((GoalMetTimeline) this.$context).steps;
                        PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$1 = new PoolGoalMetKt$PoolGoalMet$1$1$1((PoolDetailsAnimationStateHolder) obj7, i2);
                        this.label = 1;
                        if (readonlyStateFlow.$$delegate_0.collect(poolGoalMetKt$PoolGoalMet$1$1$1, this) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GoalMetTimeline goalMetTimeline = (GoalMetTimeline) this.$context;
                        this.label = 1;
                        if (goalMetTimeline.play(1000L, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((Function0) obj7).invoke();
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow2 = ((GoalMetTimeline) this.$context).steps;
                        PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$12 = new PoolGoalMetKt$PoolGoalMet$1$1$1((AvatarLayoutAnimationStateHolder) obj7, i3);
                        this.label = 1;
                        if (readonlyStateFlow2.$$delegate_0.collect(poolGoalMetKt$PoolGoalMet$1$1$12, this) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    break;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow3 = ((GoalMetTimeline) this.$context).steps;
                        PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$13 = new PoolGoalMetKt$PoolGoalMet$1$1$1((GoalMetAnimationStateHolder) obj7, z ? 1 : 0);
                        this.label = 1;
                        if (readonlyStateFlow3.$$delegate_0.collect(poolGoalMetKt$PoolGoalMet$1$1$13, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    break;
                case 7:
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$context;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new b2$$ExternalSyntheticLambda0(12, ref$ObjectRef));
                        MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1((Function1) obj7, ref$ObjectRef, (Continuation) null);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, mainPaymentView$Content$2$1, this) == coroutineSingletons8) {
                            break;
                        }
                    } else if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.$context, i5));
                        PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$14 = new PoolGoalMetKt$PoolGoalMet$1$1$1((DelegatingSoftwareKeyboardController) obj7, i6);
                        this.label = 1;
                        if (snapshotFlow2.collect(poolGoalMetKt$PoolGoalMet$1$1$14, this) == coroutineSingletons9) {
                            break;
                        }
                    } else if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PrepurchaseCashCardFAQPresenter prepurchaseCashCardFAQPresenter = (PrepurchaseCashCardFAQPresenter) this.$context;
                        RealBlockersHelper realBlockersHelper = prepurchaseCashCardFAQPresenter.blockersHelper;
                        BlockerAction blockerAction = ((PrepurchaseCardFAQViewEvent.PrimaryButtonClicked) ((PrepurchaseCardFAQViewEvent) obj7)).blockerAction;
                        BlockersScreens.PrepurchaseCashCardFAQBlockerScreen prepurchaseCashCardFAQBlockerScreen = prepurchaseCashCardFAQPresenter.args;
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, prepurchaseCashCardFAQBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons10) {
                            break;
                        }
                    } else if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow3 = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) this.$context, i2));
                        PoolGoalMetKt$PoolGoalMet$1$1$1 poolGoalMetKt$PoolGoalMet$1$1$15 = new PoolGoalMetKt$PoolGoalMet$1$1$1((PdfPreviewPresenter) obj7, 7);
                        this.label = 1;
                        Object collect = snapshotFlow3.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(new AndroidPermissionChecker$granted$$inlined$filter$1$2(poolGoalMetKt$PoolGoalMet$1$1$15, i5), 13), this);
                        if (collect != coroutineSingletons11) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect != coroutineSingletons11) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons11) {
                            break;
                        }
                    } else if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.$context;
                        PasscodeSettings passcodeSettings = (PasscodeSettings) ((State) obj7).getValue();
                        this.label = 1;
                        BetterNavigator.ScreenNavigator screenNavigator = pdfPreviewPresenter.navigator;
                        FlowStarter flowStarter = ((RealPasscodeFlowStarter) pdfPreviewPresenter.pdfFile$delegate).blockersNavigator;
                        DeviceManagerListScreen deviceManagerListScreen = new DeviceManagerListScreen();
                        ((AndroidStringManager) pdfPreviewPresenter.stringManager).get(R.string.profile_error_message_update).getClass();
                        boolean requirePasscodeConfirmation = passcodeSettings.getRequirePasscodeConfirmation();
                        Analytics analytics = ((RealDeviceManagerAnalytics) pdfPreviewPresenter.launcher).analytics;
                        if (requirePasscodeConfirmation) {
                            analytics.track(new TrustedDeviceViewSelectUpsell(TrustedDeviceViewSelectUpsell.UpsellType.ChangePIN), null);
                            screenNavigator.goTo(((RealFlowStarter) flowStarter).startPasscodeFlow(Flow$Type.SET_OR_UPDATE_PASSCODE, deviceManagerListScreen));
                            unit = Unit.INSTANCE;
                        } else {
                            analytics.track(new TrustedDeviceViewSelectUpsell(TrustedDeviceViewSelectUpsell.UpsellType.EnableMoveMoney), null);
                            screenNavigator.goTo(((RealFlowStarter) flowStarter).startPasscodeFlow(Flow$Type.ENABLE_SECURITY_LOCK_FOR_MOVE_MONEY, deviceManagerListScreen));
                            unit = Unit.INSTANCE;
                        }
                        if (unit == coroutineSingletons12) {
                            break;
                        }
                    } else if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 12:
                    ProduceStateScope produceStateScope = (ProduceStateScope) this.$context;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj7;
                        CoroutineContext coroutineContext = (CoroutineContext) workHomePresenter.shiftSection2Presenter;
                        OpenSourcePresenter$models$model$2$1$1 openSourcePresenter$models$model$2$1$1 = new OpenSourcePresenter$models$model$2$1$1(workHomePresenter, produceStateScope, null);
                        this.$context = null;
                        this.label = 1;
                        if (JobKt.withContext(coroutineContext, openSourcePresenter$models$model$2$1$1, this) == coroutineSingletons13) {
                            break;
                        }
                    } else if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 13:
                    ProfilePrivacyViewEvent.ToggleContactsSync toggleContactsSync = (ProfilePrivacyViewEvent.ToggleContactsSync) obj7;
                    ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) this.$context;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        profilePrivacyPresenter.analytics.track(new AccountConfigureSyncContacts(Boolean.valueOf(toggleContactsSync.allow)), null);
                        if (toggleContactsSync.allow) {
                            this.label = 1;
                            if (ProfilePrivacyPresenter.access$requestContactsPermissions(profilePrivacyPresenter, this) == coroutineSingletons14) {
                                break;
                            }
                        } else {
                            profilePrivacyPresenter.contactsSyncPreference.set(ContactsSyncState.OFF);
                        }
                    } else if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 14:
                    ProfilePrivacyPresenter profilePrivacyPresenter2 = (ProfilePrivacyPresenter) obj7;
                    ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$context;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSettingsEligibilityManager realSettingsEligibilityManager = profilePrivacyPresenter2.settingsManager;
                        this.$context = produceStateScope2;
                        this.label = 1;
                        obj2 = realSettingsEligibilityManager.settings(this);
                        if (obj2 == coroutineSingletons15) {
                            break;
                        }
                    } else if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                    }
                    SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                    if (settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError) {
                        profilePrivacyPresenter2.navigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(profilePrivacyPresenter2.stringManager, ((SettingsEligibilityManager$AccountSettingsResult.SettingsError) settingsEligibilityManager$AccountSettingsResult).failure, null).message, null, 6));
                    } else if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        produceStateScope2.setValue(((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.security);
                    }
                    break;
                case 15:
                    TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj7;
                    ProduceStateScope produceStateScope3 = (ProduceStateScope) this.$context;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) tabToolbarPresenter.familyProfileManager;
                        this.$context = produceStateScope3;
                        this.label = 1;
                        obj3 = realSettingsEligibilityManager2.settings(this);
                        if (obj3 == coroutineSingletons16) {
                            break;
                        }
                    } else if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        obj3 = obj;
                    }
                    SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj3;
                    if (settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError) {
                        ((BetterNavigator.ScreenNavigator) tabToolbarPresenter.moneybotFlagsHelper).goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) tabToolbarPresenter.sessionManager, ((SettingsEligibilityManager$AccountSettingsResult.SettingsError) settingsEligibilityManager$AccountSettingsResult2).failure, null).message, null, 6));
                    } else if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        produceStateScope3.setValue(((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult2).cache.security);
                    }
                    break;
                case 16:
                    SetDefaultInstrumentPresenter setDefaultInstrumentPresenter = (SetDefaultInstrumentPresenter) this.$context;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BlocklyService blocklyService = (BlocklyService) setDefaultInstrumentPresenter.appService;
                        GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest((String) setDefaultInstrumentPresenter.args);
                        this.label = 1;
                        allowlistForCustomer = blocklyService.getAllowlistForCustomer(getAllowlistForCustomerRequest, this);
                        if (allowlistForCustomer == coroutineSingletons17) {
                            break;
                        }
                    } else if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        allowlistForCustomer = obj;
                    }
                    ApiResult apiResult2 = (ApiResult) allowlistForCustomer;
                    if (apiResult2 instanceof ApiResult.Success) {
                        ((MutableState) obj7).setValue((GetAllowlistForCustomerResponse) ((ApiResult.Success) apiResult2).response);
                    }
                    break;
                case 17:
                    WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) this.$context;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BlocklyService blocklyService2 = (BlocklyService) workHomePresenter2.shiftsAnalytics;
                        GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest((String) workHomePresenter2.youPresenter, BlockingContext.BLOCKLIST);
                        this.label = 1;
                        blockedCustomers = blocklyService2.getBlockedCustomers(getBlockedCustomersRequest, this);
                        if (blockedCustomers == coroutineSingletons18) {
                            break;
                        }
                    } else if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        blockedCustomers = obj;
                    }
                    ApiResult apiResult3 = (ApiResult) blockedCustomers;
                    if (apiResult3 instanceof ApiResult.Success) {
                        ((MutableState) obj7).setValue((GetBlockedCustomersResponse) ((ApiResult.Success) apiResult3).response);
                    }
                    break;
                case 18:
                    ProfileNotificationsPresenter profileNotificationsPresenter = (ProfileNotificationsPresenter) this.$context;
                    Analytics analytics2 = profileNotificationsPresenter.analytics;
                    MutableState mutableState = (MutableState) obj7;
                    Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!((Boolean) mutableState.getValue()).booleanValue()) {
                            analytics2.track(new NotificationsSettingsViewSettings("rootNotifications"), null);
                            this.label = 1;
                            if (profileNotificationsPresenter.canRequestNotificationPermission) {
                                Object requestNotificationPermissionWithAnalytics = Utils_androidKt.requestNotificationPermissionWithAnalytics(profileNotificationsPresenter.permissionManager.create("android.permission.POST_NOTIFICATIONS"), analytics2, NotificationPromptEntryPoint.SETTINGS, this);
                                obj4 = requestNotificationPermissionWithAnalytics;
                                if (requestNotificationPermissionWithAnalytics != obj8) {
                                    obj4 = Unit.INSTANCE;
                                }
                            } else {
                                obj4 = Unit.INSTANCE;
                            }
                            if (obj4 == obj8) {
                                break;
                            }
                        }
                        break;
                    } else if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    mutableState.setValue(Boolean.TRUE);
                case 19:
                    ProfileNotificationsPresenter profileNotificationsPresenter2 = (ProfileNotificationsPresenter) obj7;
                    BetterNavigator.ScreenNavigator screenNavigator2 = profileNotificationsPresenter2.navigator;
                    AndroidStringManager androidStringManager = profileNotificationsPresenter2.stringManager;
                    ProduceStateScope produceStateScope4 = (ProduceStateScope) this.$context;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSettingsEligibilityManager realSettingsEligibilityManager3 = profileNotificationsPresenter2.settingsManager;
                        this.$context = produceStateScope4;
                        this.label = 1;
                        obj5 = realSettingsEligibilityManager3.settings(this);
                        if (obj5 == coroutineSingletons19) {
                            break;
                        }
                    } else if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        obj5 = obj;
                    }
                    SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult3 = (SettingsEligibilityManager$AccountSettingsResult) obj5;
                    if (settingsEligibilityManager$AccountSettingsResult3 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError) {
                        produceStateScope4.setValue(null);
                        ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, ((SettingsEligibilityManager$AccountSettingsResult.SettingsError) settingsEligibilityManager$AccountSettingsResult3).failure, null);
                        screenNavigator2.goTo(new ProfileScreens.ErrorScreen(errorMessaging.message, errorMessaging.title, 4));
                    } else if (!(settingsEligibilityManager$AccountSettingsResult3 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        AccountSettingType$NotificationSettings accountSettingType$NotificationSettings = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult3).cache.notification;
                        produceStateScope4.setValue(accountSettingType$NotificationSettings);
                        if (accountSettingType$NotificationSettings.cache.isEmpty()) {
                            screenNavigator2.goTo(new ProfileScreens.UnsupportedSettingScreen(new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager.get(R.string.unsupported_setting_business_title), androidStringManager.get(R.string.unsupported_setting_body)), new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager.get(R.string.unsupported_setting_personal_title), androidStringManager.get(R.string.unsupported_setting_body)), AccountSwitchAccountViewSwitcher.Entrypoint.UNSUPPORTED_NOTIFICATIONS_SETTINGS, ProfileScreens.NotificationsScreen.INSTANCE, false));
                        }
                    }
                    break;
                case 20:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow stateFlow = (StateFlow) this.$context;
                        RealSheetState$peek$3.AnonymousClass2 anonymousClass2 = new RealSheetState$peek$3.AnonymousClass2(i4, z3 ? 1 : 0, i4);
                        this.label = 1;
                        if (FlowKt.first(stateFlow, anonymousClass2, this) == coroutineSingletons20) {
                            break;
                        }
                    } else if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((Analytics) ((LocalCashBalancePresenter) obj7).analytics).track(new IdentityOpenView(str2, ScreenType.PIRefresh, i6), null);
                    break;
                case 21:
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj7;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) localCashBalancePresenter.stringManager;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
                    ProduceStateScope produceStateScope5 = (ProduceStateScope) this.$context;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSettingsEligibilityManager realSettingsEligibilityManager4 = (RealSettingsEligibilityManager) localCashBalancePresenter.sessionManager;
                        this.$context = produceStateScope5;
                        this.label = 1;
                        obj6 = realSettingsEligibilityManager4.settings(this);
                        if (obj6 == coroutineSingletons21) {
                            break;
                        }
                    } else if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        obj6 = obj;
                    }
                    SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult4 = (SettingsEligibilityManager$AccountSettingsResult) obj6;
                    if (settingsEligibilityManager$AccountSettingsResult4 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError) {
                        screenNavigator3.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager2, ((SettingsEligibilityManager$AccountSettingsResult.SettingsError) settingsEligibilityManager$AccountSettingsResult4).failure, null).message, null, 6));
                    } else if (!(settingsEligibilityManager$AccountSettingsResult4 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        AccountSettingType$PersonalSettings accountSettingType$PersonalSettings = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult4).cache.personal;
                        if (accountSettingType$PersonalSettings.cache.isEmpty()) {
                            screenNavigator3.goTo(new ProfileScreens.UnsupportedSettingScreen(new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager2.get(R.string.profile_unsupported_setting_personal_title), androidStringManager2.get(R.string.profile_personal_account_unsupported_setting_personal_message)), new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager2.get(R.string.profile_unsupported_setting_personal_title), androidStringManager2.get(R.string.profile_business_account_unsupported_setting_personal_message)), AccountSwitchAccountViewSwitcher.Entrypoint.UNSUPPORTED_PERSONAL_SETTINGS, ProfileScreens.AccountInfoScreen.INSTANCE, false));
                        }
                        produceStateScope5.setValue(accountSettingType$PersonalSettings);
                    }
                    break;
                case 22:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow contactsStatusForCustomer = ((RealProfileRepo) this.$context).contactRepository.contactsStatusForCustomer((String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) ((ProfileScreens.ProfileScreen.Customer) obj7)).customerId.getValue());
                        this.label = 1;
                        firstOrNull = FlowKt.firstOrNull(contactsStatusForCustomer, this);
                        if (firstOrNull == coroutineSingletons22) {
                            break;
                        }
                    } else if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        firstOrNull = obj;
                    }
                    ContactsStatus contactsStatus = (ContactsStatus) firstOrNull;
                    if (contactsStatus == null) {
                        break;
                    }
                    break;
                case 23:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow shouldShowConfirm = ((RealProfileRepo) this.$context).contactRepository.shouldShowConfirm(((CustomerProfileData) obj7).toRecipient());
                        this.label = 1;
                        firstOrNull2 = FlowKt.firstOrNull(shouldShowConfirm, this);
                        if (firstOrNull2 == coroutineSingletons23) {
                            break;
                        }
                    } else if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        firstOrNull2 = obj;
                    }
                    Boolean bool = (Boolean) firstOrNull2;
                    break;
                case 24:
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$context;
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) localEditorialPresenter.stringManager;
                    BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String str4 = ((CashtagQrScanViewEvent.CodeScanned) ((CashtagQrScanViewEvent) obj7)).uri;
                        str4.getClass();
                        try {
                            String path = new URI(str4).getPath();
                            if (path != null) {
                                str = StringsKt.removePrefix("/", path);
                                break;
                            }
                        } catch (Exception unused) {
                        }
                        str = null;
                        if (str == null) {
                            screenNavigator4.goTo(Back.INSTANCE);
                            screenNavigator4.goTo(new ProfileScreens.ErrorScreen(androidStringManager3.get(R.string.profile_qr_invalid_code), null, 14));
                            break;
                        } else {
                            RealRecipientFinder realRecipientFinder = (RealRecipientFinder) localEditorialPresenter.service;
                            String valueOf = String.valueOf(str.charAt(0));
                            String substring = str.substring(1);
                            this.label = 1;
                            findByCashtag = realRecipientFinder.findByCashtag(valueOf, substring, this);
                            if (findByCashtag == coroutineSingletons24) {
                                break;
                            }
                        }
                    } else if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        findByCashtag = obj;
                    }
                    Recipient recipient = (Recipient) findByCashtag;
                    if (recipient != null) {
                        screenNavigator4.giveAnswer(((CashtagQrScanScreen) localEditorialPresenter.installedStore).question, new CashtagQrScanResult(recipient));
                    } else {
                        screenNavigator4.goTo(new ProfileScreens.ErrorScreen(androidStringManager3.get(R.string.qr_cashtag_recipient_not_found), null, 14));
                    }
                case 25:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) ((ImageLoader$Builder) this.$context).diskCacheLazy;
                        this.label = 1;
                        realOnboardingFlowTokenManager.onboardingContextFlowToken.blockingSet((String) obj7);
                        if (Unit.INSTANCE == coroutineSingletons25) {
                            break;
                        }
                    } else if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 26:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PaymentPlanDataBlockerPresenter paymentPlanDataBlockerPresenter = (PaymentPlanDataBlockerPresenter) this.$context;
                        String str5 = ((PaymentPlanSummaryViewEvent.Submit) ((PaymentPlanSummaryViewEvent) obj7)).id;
                        this.label = 1;
                        if (PaymentPlanDataBlockerPresenter.access$submit(paymentPlanDataBlockerPresenter, str5, this) == coroutineSingletons26) {
                            break;
                        }
                    } else if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 27:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) this.$context;
                        TransferProcessingScreen.Direction direction = ((TransferProcessingScreen) localEditorialPresenter2.screen).direction;
                        OpenSourceKt$$ExternalSyntheticLambda11 openSourceKt$$ExternalSyntheticLambda11 = new OpenSourceKt$$ExternalSyntheticLambda11(29, localEditorialPresenter2, (MutableState) obj7);
                        this.label = 1;
                        if (LocalEditorialPresenter.access$startTransferFlow(localEditorialPresenter2, direction, openSourceKt$$ExternalSyntheticLambda11, this) == coroutineSingletons27) {
                            break;
                        }
                    } else if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 28:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (JobKt.delay(500L, this) == coroutineSingletons28) {
                            break;
                        }
                    } else if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    SavingsScreenViewEvent savingsScreenViewEvent = ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) this.$context).onRenderedEvent;
                    if (savingsScreenViewEvent != null) {
                        ((Function1) obj7).invoke(savingsScreenViewEvent);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((ScoreAppletTileViewModel) this.$context) instanceof ScoreAppletTileViewModel.Loading) {
                            Duration.Companion companion = Duration.Companion;
                            long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                            this.label = 1;
                            if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons29) {
                                break;
                            }
                        }
                        break;
                    } else if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    ((MutableState) obj7).setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.profile.views.RingtoneView$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00651 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;

            public /* synthetic */ C00651(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                SupportScreens startSupportHome;
                SupportScreens startSupportHome2;
                int i = this.$r8$classId;
                ProfileScreens.PrivacyScreen privacyScreen = ProfileScreens.PrivacyScreen.INSTANCE;
                ProfileScreens.NotificationsScreen notificationsScreen = ProfileScreens.NotificationsScreen.INSTANCE;
                Back back = Back.INSTANCE;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        RingtoneView ringtoneView = (RingtoneView) obj2;
                        KProperty[] kPropertyArr = RingtoneView.$$delegatedProperties;
                        ringtoneView.getListView$1().setAdapter((ListAdapter) obj);
                        ringtoneView.getListView$1().setItemChecked(ringtoneView.clickedPos, true);
                        ringtoneView.getListView$1().setSelection(ringtoneView.clickedPos);
                        return Unit.INSTANCE;
                    case 1:
                        InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator;
                        PersonalInfoConfirmationDialogEvent personalInfoConfirmationDialogEvent = (PersonalInfoConfirmationDialogEvent) obj;
                        if (Intrinsics.areEqual(personalInfoConfirmationDialogEvent, PersonalInfoConfirmationDialogEvent.Confirm.INSTANCE)) {
                            Analytics analytics = (Analytics) inviteErrorPresenter.analytics;
                            VerificationType verificationType = VerificationType.KYC;
                            Source source = Source.SECURITY_AND_PRIVACY;
                            analytics.track(new IdentityConfirmTap(), null);
                            FlowStarter flowStarter = (FlowStarter) inviteErrorPresenter.args;
                            RetailerType.Companion companion = RefreshType.Companion;
                            screenNavigator.goTo(((RealFlowStarter) flowStarter).confirmPersonalInformationRefreshFlow());
                        } else {
                            if (!Intrinsics.areEqual(personalInfoConfirmationDialogEvent, PersonalInfoConfirmationDialogEvent.ReviewLater.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(Account.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        InvestingContactPresenter investingContactPresenter = (InvestingContactPresenter) obj2;
                        kotlin.Lazy lazy = investingContactPresenter.flowPresenter$delegate;
                        BetterNavigator.ScreenNavigator screenNavigator2 = investingContactPresenter.navigator;
                        InvestingContactViewEvent investingContactViewEvent = (InvestingContactViewEvent) obj;
                        if (Intrinsics.areEqual(investingContactViewEvent, InvestingContactViewEvent.BackClicked.INSTANCE)) {
                            screenNavigator2.goTo(back);
                        } else if (Intrinsics.areEqual(investingContactViewEvent, InvestingContactViewEvent.CloseClicked.INSTANCE)) {
                            NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator2);
                        } else if (Intrinsics.areEqual(investingContactViewEvent, InvestingContactViewEvent.EditClicked.INSTANCE)) {
                            TrustedContactFlowPresenter trustedContactFlowPresenter = (TrustedContactFlowPresenter) lazy.getValue();
                            trustedContactFlowPresenter.navigator.goTo(FlowStarter.startPlasmaFlow$default(trustedContactFlowPresenter.flowStarter, Flow$Type.SET_OR_UPDATE_TRUSTED_CONTACT, new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.INVESTING), null, null, 12));
                        } else {
                            if (!Intrinsics.areEqual(investingContactViewEvent, InvestingContactViewEvent.RemoveClicked.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            TrustedContactFlowPresenter trustedContactFlowPresenter2 = (TrustedContactFlowPresenter) lazy.getValue();
                            trustedContactFlowPresenter2.navigator.goTo(FlowStarter.startPlasmaFlow$default(trustedContactFlowPresenter2.flowStarter, Flow$Type.REMOVE_TRUSTED_CONTACT, new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.INVESTING), null, null, 12));
                        }
                        return Unit.INSTANCE;
                    case 3:
                        InvestingContactPresenter investingContactPresenter2 = (InvestingContactPresenter) obj2;
                        TrustedContactSettingViewEvent trustedContactSettingViewEvent = (TrustedContactSettingViewEvent) obj;
                        if (Intrinsics.areEqual(trustedContactSettingViewEvent, TrustedContactSettingViewEvent.AddTrustedContactClicked.INSTANCE)) {
                            TrustedContactFlowPresenter trustedContactFlowPresenter3 = (TrustedContactFlowPresenter) investingContactPresenter2.flowPresenter$delegate.getValue();
                            trustedContactFlowPresenter3.navigator.goTo(FlowStarter.startPlasmaFlow$default(trustedContactFlowPresenter3.flowStarter, Flow$Type.SET_OR_UPDATE_TRUSTED_CONTACT, new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.INVESTING), null, null, 12));
                        } else {
                            if (!Intrinsics.areEqual(trustedContactSettingViewEvent, TrustedContactSettingViewEvent.OpenTrustedContactClicked.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            investingContactPresenter2.navigator.goTo(InvestingContactScreen.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        GlobalAddress globalAddress = (GlobalAddress) obj;
                        MooncakeAddressSheet mooncakeAddressSheet = (MooncakeAddressSheet) obj2;
                        globalAddress.getClass();
                        KProperty[] kPropertyArr2 = MooncakeAddressSheet.$$delegatedProperties;
                        ((TextView) mooncakeAddressSheet.headerView$delegate.getValue(mooncakeAddressSheet, MooncakeAddressSheet.$$delegatedProperties[0])).setText(AddressKt.buildAsString(globalAddress, false));
                        return Unit.INSTANCE;
                    case 5:
                        ((BasicSettingView) obj2).setDescription((String) obj);
                        return Unit.INSTANCE;
                    case 6:
                        ProfileCropView profileCropView = (ProfileCropView) obj2;
                        profileCropView.cropResultManager.value = (CropResultManager$CropResult) obj;
                        Ui.EventReceiver eventReceiver = profileCropView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ProfileCropViewEvent.CropFinished.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 7:
                        TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                        QrShortcutInstaller qrShortcutInstaller = (QrShortcutInstaller) taxReturnsPresenter.args;
                        Analytics analytics2 = (Analytics) taxReturnsPresenter.router;
                        CashQrShortcutsOnboardingViewEvent cashQrShortcutsOnboardingViewEvent = (CashQrShortcutsOnboardingViewEvent) obj;
                        if (Intrinsics.areEqual(cashQrShortcutsOnboardingViewEvent, CashQrShortcutsOnboardingViewEvent.AddTile.INSTANCE)) {
                            analytics2.track(new QRCodeShortcutsOnboardingAddTile(), null);
                            ((RealQrShortcutInstaller) qrShortcutInstaller).requestAddTile();
                        } else if (Intrinsics.areEqual(cashQrShortcutsOnboardingViewEvent, CashQrShortcutsOnboardingViewEvent.AddWidget.INSTANCE)) {
                            analytics2.track(new QRCodeShortcutsOnboardingAddWidget(), null);
                            ((RealQrShortcutInstaller) qrShortcutInstaller).requestPinWidget();
                        } else {
                            if (!Intrinsics.areEqual(cashQrShortcutsOnboardingViewEvent, CashQrShortcutsOnboardingViewEvent.Dismiss.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            analytics2.track(new QRCodeShortcutsOnboardingDismiss(), null);
                        }
                        ((BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator).goTo(back);
                        return Unit.INSTANCE;
                    case 8:
                        if (Intrinsics.areEqual((ConfirmFirstScheduledReloadNoticeViewEvent$PositiveClick) obj, ConfirmFirstScheduledReloadNoticeViewEvent$PositiveClick.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((InviteErrorPresenter) obj2).navigator).goTo(new Finish(ConfirmFirstScheduledReloadNoticeResult$Positive.INSTANCE));
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 9:
                        RealSelectCadencePresenter realSelectCadencePresenter = (RealSelectCadencePresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator3 = realSelectCadencePresenter.navigator;
                        SelectCadenceScreen selectCadenceScreen = realSelectCadencePresenter.args;
                        SelectCadenceViewEvent selectCadenceViewEvent = (SelectCadenceViewEvent) obj;
                        if (selectCadenceViewEvent instanceof SelectCadenceViewEvent.SelectCadenceOption) {
                            for (RecurringPaymentBlocker.CadenceMenu.CadenceOption cadenceOption : selectCadenceScreen.cadenceMenu.cadence_options) {
                                RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = cadenceOption.day_of_cadence_menu;
                                dayOfCadenceMenu.getClass();
                                if (Intrinsics.areEqual(dayOfCadenceMenu.cadence, ((SelectCadenceViewEvent.SelectCadenceOption) selectCadenceViewEvent).cadenceToken)) {
                                    RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu2 = cadenceOption.day_of_cadence_menu;
                                    dayOfCadenceMenu2.getClass();
                                    screenNavigator3.goTo(new SelectDayOfCadenceScreen(dayOfCadenceMenu2, selectCadenceScreen.previousRecurringPaymentScreen, false));
                                }
                            }
                            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                            return null;
                        }
                        if (Intrinsics.areEqual(selectCadenceViewEvent, SelectCadenceViewEvent.TapBack.INSTANCE)) {
                            CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen = selectCadenceScreen.previousRecurringPaymentScreen;
                            createOrEditRecurringPaymentScreen.getClass();
                            Screen screen = createOrEditRecurringPaymentScreen.exitScreen;
                            if (screen != null) {
                                screenNavigator3.goTo(screen);
                            }
                            screenNavigator3.goTo(createOrEditRecurringPaymentScreen);
                        } else {
                            if (!Intrinsics.areEqual(selectCadenceViewEvent, SelectCadenceViewEvent.TapClose.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Analytics analytics3 = realSelectCadencePresenter.analytics;
                            CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen2 = selectCadenceScreen.previousRecurringPaymentScreen;
                            analytics3.track(new SponsoredAccountManageAllowanceEndOnCadenceSelection(createOrEditRecurringPaymentScreen2.blockersData.flowToken, Boolean.valueOf(createOrEditRecurringPaymentScreen2.isCreate())), null);
                            Screen screen2 = selectCadenceScreen.previousRecurringPaymentScreen.exitScreen;
                            screen2.getClass();
                            screenNavigator3.goTo(screen2);
                        }
                        return Unit.INSTANCE;
                    case 10:
                        RealSelectDayOfCadencePresenter realSelectDayOfCadencePresenter = (RealSelectDayOfCadencePresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator4 = realSelectDayOfCadencePresenter.navigator;
                        SelectDayOfCadenceScreen selectDayOfCadenceScreen = realSelectDayOfCadencePresenter.args;
                        SelectDayOfCadenceViewEvent selectDayOfCadenceViewEvent = (SelectDayOfCadenceViewEvent) obj;
                        if (selectDayOfCadenceViewEvent instanceof SelectDayOfCadenceViewEvent.SelectDayOfCadenceOption) {
                            CreateOrEditRecurringPaymentScreen copy$default = CreateOrEditRecurringPaymentScreen.copy$default(selectDayOfCadenceScreen.previousRecurringPaymentScreen, new RecurringPaymentBlocker.Schedule(selectDayOfCadenceScreen.dayOfCadenceMenu.cadence, new Integer(((SelectDayOfCadenceViewEvent.SelectDayOfCadenceOption) selectDayOfCadenceViewEvent).dayOfCadence), null, null, 12, null), null, false, 8187);
                            Screen screen3 = copy$default.exitScreen;
                            if (screen3 != null) {
                                screenNavigator4.goTo(screen3);
                            }
                            screenNavigator4.goTo(copy$default);
                        } else if (selectDayOfCadenceViewEvent instanceof SelectDayOfCadenceViewEvent.SelectDayPicker) {
                            IntRange intRange = new IntRange(1, 31, 1);
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                            IntProgressionIterator it = intRange.iterator();
                            while (it.hasNext) {
                                int nextInt = it.nextInt();
                                arrayList.add(new Pair(new Integer(nextInt), AndroidStringManager.getOrdinal(nextInt)));
                            }
                            CollectionsKt.toList(arrayList);
                            RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu3 = ((SelectDayOfCadenceViewEvent.SelectDayPicker) selectDayOfCadenceViewEvent).dayPicker;
                            dayOfCadenceMenu3.getClass();
                            screenNavigator4.goTo(new SelectDayOfCadenceScreen(dayOfCadenceMenu3, selectDayOfCadenceScreen.previousRecurringPaymentScreen, true));
                        } else if (Intrinsics.areEqual(selectDayOfCadenceViewEvent, SelectDayOfCadenceViewEvent.TapBack.INSTANCE)) {
                            screenNavigator4.goTo(back);
                        } else {
                            if (!Intrinsics.areEqual(selectDayOfCadenceViewEvent, SelectDayOfCadenceViewEvent.TapClose.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            boolean z = selectDayOfCadenceScreen.isDayPicker;
                            Analytics analytics4 = realSelectDayOfCadencePresenter.analytics;
                            if (z) {
                                CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen3 = selectDayOfCadenceScreen.previousRecurringPaymentScreen;
                                analytics4.track(new SponsoredAccountManageAllowanceEndOnDatePicker(createOrEditRecurringPaymentScreen3.blockersData.flowToken, Boolean.valueOf(createOrEditRecurringPaymentScreen3.isCreate())), null);
                            } else {
                                CreateOrEditRecurringPaymentScreen createOrEditRecurringPaymentScreen4 = selectDayOfCadenceScreen.previousRecurringPaymentScreen;
                                analytics4.track(new SponsoredAccountManageAllowanceEndOnDayOfCadenceSelection(createOrEditRecurringPaymentScreen4.blockersData.flowToken, Boolean.valueOf(createOrEditRecurringPaymentScreen4.isCreate())), null);
                            }
                            Screen screen4 = selectDayOfCadenceScreen.previousRecurringPaymentScreen.exitScreen;
                            screen4.getClass();
                            screenNavigator4.goTo(screen4);
                        }
                        return Unit.INSTANCE;
                    case 11:
                        WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj2;
                        if (((FullScreenActivityViewEvent$Exit) obj) != null) {
                            ((BetterNavigator.ScreenNavigator) workHomePresenter.titleBarPresenter).goTo(back);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 12:
                        SavingsUpsellCardPresenter savingsUpsellCardPresenter = (SavingsUpsellCardPresenter) obj2;
                        UpsellCardEvent upsellCardEvent = (UpsellCardEvent) obj;
                        if (upsellCardEvent instanceof UpsellCardEvent.Close) {
                            savingsUpsellCardPresenter.navigator.goTo(back);
                        } else {
                            if (!(upsellCardEvent instanceof UpsellCardEvent.RouterClicked)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            RealRouter realRouter = savingsUpsellCardPresenter.router;
                            UpsellCardEvent.RouterClicked routerClicked = (UpsellCardEvent.RouterClicked) upsellCardEvent;
                            String str = routerClicked.clientRoute;
                            SavingsScreen savingsScreen = savingsUpsellCardPresenter.args.origin;
                            realRouter.route(new RoutingParams(savingsScreen, null, savingsScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                            CdfEvent cdfEvent = routerClicked.analyticsEvent;
                            if (cdfEvent != null) {
                                savingsUpsellCardPresenter.analytics.track(new UtilsKt$toCdfEvent$2(cdfEvent, new Pair[0]), null);
                            }
                        }
                        return Unit.INSTANCE;
                    case 13:
                        if (Intrinsics.areEqual((TransferringViewEvent$Exit) obj, TransferringViewEvent$Exit.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((LocalEditorialPresenter) obj2).navigator).goTo(back);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 14:
                        PasswordDialogViewEvent$ButtonClick passwordDialogViewEvent$ButtonClick = (PasswordDialogViewEvent$ButtonClick) obj;
                        if (passwordDialogViewEvent$ButtonClick != null) {
                            ((ErrorPresenter) obj2).navigator.goTo(new Finish(passwordDialogViewEvent$ButtonClick.button));
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 15:
                        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                        BookletScreen bookletScreen = (BookletScreen) localEditorialPresenter.launcher;
                        BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                        BookletViewEvent bookletViewEvent = (BookletViewEvent) obj;
                        if (Intrinsics.areEqual(bookletViewEvent, BookletViewEvent.NavigateBack.INSTANCE)) {
                            screenNavigator5.goTo(back);
                        } else if (bookletViewEvent instanceof BookletViewEvent.SupportRowTapped) {
                            int ordinal = ((BookletViewEvent.SupportRowTapped) bookletViewEvent).id.ordinal();
                            if (ordinal == 0) {
                                screenNavigator5.goTo(new RecoveryGuideScreen(RecoveryGuideId.IVE_BEEN_SCAMMED));
                            } else if (ordinal == 1) {
                                screenNavigator5.goTo(new RecoveryGuideScreen(RecoveryGuideId.IVE_BEEN_HACKED));
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                RealSupportNavigator realSupportNavigator = (RealSupportNavigator) localEditorialPresenter.clock;
                                SupportNavigator$Source supportNavigator$Source = SupportNavigator$Source.PROFILE;
                                startSupportHome = realSupportNavigator.startSupportHome(null, bookletScreen, SupportNavigator$Source.PROFILE, null, null);
                                screenNavigator5.goTo(startSupportHome);
                            }
                        } else if (bookletViewEvent instanceof BookletViewEvent.FeatureCardLinkTapped) {
                            switch (((BookletViewEvent.FeatureCardLinkTapped) bookletViewEvent).cardId.ordinal()) {
                                case 20:
                                    screenNavigator5.goTo(ProfileScreens.SecurityLockScreen.INSTANCE);
                                    break;
                                case 21:
                                    BlockersData.Flow.INSTANCE.getClass();
                                    String generateToken = BlockersData.Flow.Companion.generateToken();
                                    Analytics analytics5 = (Analytics) localEditorialPresenter.screen;
                                    ScreenType screenType = ScreenType.IdentityHub;
                                    Source source2 = Source.SECURITY_AND_PRIVACY;
                                    analytics5.track(new IdentityOpenView(generateToken, screenType, 8), null);
                                    BlockersHelper.launchClientScenario$default((RealBlockersHelper) localEditorialPresenter.responseContextHandler, BlockersData.Flow.CLIENT_SCENARIO, ClientScenario.IDENTITY_HUB, (BookletScreen) localEditorialPresenter.launcher, null, generateToken, null, false, null, null, false, 4040);
                                    break;
                                case 22:
                                    screenNavigator5.goTo(privacyScreen);
                                    break;
                                case 23:
                                    screenNavigator5.goTo(notificationsScreen);
                                    break;
                                case 24:
                                    screenNavigator5.goTo(((RealFlowStarter) ((FlowStarter) localEditorialPresenter.service)).startPasscodeFlow(Flow$Type.SET_OR_UPDATE_PASSCODE, bookletScreen));
                                    break;
                            }
                        } else {
                            if (!(bookletViewEvent instanceof BookletViewEvent.RelatedBookletTapped)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator5.goTo(new BookletScreen(((BookletViewEvent.RelatedBookletTapped) bookletViewEvent).id));
                        }
                        return Unit.INSTANCE;
                    case 16:
                        ProtectionsSectionPresenter protectionsSectionPresenter = (ProtectionsSectionPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator6 = protectionsSectionPresenter.navigator;
                        ProtectionsSectionViewEvent protectionsSectionViewEvent = (ProtectionsSectionViewEvent) obj;
                        if (protectionsSectionViewEvent instanceof ProtectionsSectionViewEvent.SettingsRowTapped) {
                            int ordinal2 = ((ProtectionsSectionViewEvent.SettingsRowTapped) protectionsSectionViewEvent).id.ordinal();
                            if (ordinal2 == 0) {
                                screenNavigator6.goTo(new ProfileScreens.SecurityScreen(null));
                            } else if (ordinal2 == 1) {
                                screenNavigator6.goTo(privacyScreen);
                            } else if (ordinal2 == 2) {
                                screenNavigator6.goTo(notificationsScreen);
                            } else {
                                if (ordinal2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator6.goTo(ProfileScreens.AccountInfoScreen.INSTANCE);
                            }
                        } else if (protectionsSectionViewEvent instanceof ProtectionsSectionViewEvent.SupportRowTapped) {
                            int ordinal3 = ((ProtectionsSectionViewEvent.SupportRowTapped) protectionsSectionViewEvent).id.ordinal();
                            if (ordinal3 == 0) {
                                screenNavigator6.goTo(new RecoveryGuideScreen(RecoveryGuideId.IVE_BEEN_SCAMMED));
                            } else if (ordinal3 == 1) {
                                screenNavigator6.goTo(new RecoveryGuideScreen(RecoveryGuideId.IVE_BEEN_HACKED));
                            } else {
                                if (ordinal3 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                RealSupportNavigator realSupportNavigator2 = protectionsSectionPresenter.supportNavigator;
                                SecurityHubScreen securityHubScreen = protectionsSectionPresenter.screen;
                                SupportNavigator$Source supportNavigator$Source2 = SupportNavigator$Source.PROFILE;
                                startSupportHome2 = realSupportNavigator2.startSupportHome(null, securityHubScreen, SupportNavigator$Source.PROFILE, null, null);
                                screenNavigator6.goTo(startSupportHome2);
                            }
                        } else {
                            if (!(protectionsSectionViewEvent instanceof ProtectionsSectionViewEvent.EducationCardTapped)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int ordinal4 = ((ProtectionsSectionViewEvent.EducationCardTapped) protectionsSectionViewEvent).id.ordinal();
                            if (ordinal4 == 0) {
                                screenNavigator6.goTo(new BookletScreen(BookletId.BUILT_IN_PROTECTIONS));
                            } else if (ordinal4 == 1) {
                                screenNavigator6.goTo(new BookletScreen(BookletId.COMMON_SCAMS));
                            } else if (ordinal4 == 2) {
                                screenNavigator6.goTo(new BookletScreen(BookletId.SPOT_SCAMS));
                            } else if (ordinal4 == 3) {
                                screenNavigator6.goTo(new BookletScreen(BookletId.PREVENT_FRAUD));
                            } else {
                                if (ordinal4 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator6.goTo(new BookletScreen(BookletId.SECURITY_FEATURES));
                            }
                        }
                        return Unit.INSTANCE;
                    case 17:
                        SecurityHubViewEvent securityHubViewEvent = (SecurityHubViewEvent) obj;
                        if (Intrinsics.areEqual(securityHubViewEvent, SecurityHubViewEvent.NavigateBack.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator).goTo(back);
                        } else if (!(securityHubViewEvent instanceof SecurityHubViewEvent.ProtectionsEvent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return Unit.INSTANCE;
                    case 18:
                        Object obj3 = ((RealSheetState) obj2).draggableState.settle(((Number) obj).floatValue(), continuation);
                        return obj3 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj3 : Unit.INSTANCE;
                    case 19:
                        BetterNavigator.ScreenNavigator screenNavigator7 = ((CashAppPayIncentiveSheetPresenter) obj2).navigator;
                        IncentiveSheetViewEvent incentiveSheetViewEvent = (IncentiveSheetViewEvent) obj;
                        if (incentiveSheetViewEvent instanceof IncentiveSheetViewEvent.ContinueWithCashAppPay) {
                            screenNavigator7.goTo(new Finish(ContinueWithCashAppPaySheetResult.CONTINUE));
                        } else {
                            if (!(incentiveSheetViewEvent instanceof IncentiveSheetViewEvent.CloseSheet)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator7.goTo(new Finish(ContinueWithCashAppPaySheetResult.DISMISSED));
                        }
                        return Unit.INSTANCE;
                    case 20:
                        InviteErrorPresenter inviteErrorPresenter2 = (InviteErrorPresenter) obj2;
                        if (((IncentiveErrorDialogViewEvent$Close) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Analytics analytics6 = (Analytics) inviteErrorPresenter2.analytics;
                        CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog = (CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) inviteErrorPresenter2.args;
                        ShoppingScreenContext shoppingScreenContext = cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.screenContext;
                        ShoppingScreenContext.DiscoverBnplCarousel discoverBnplCarousel = shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel ? (ShoppingScreenContext.DiscoverBnplCarousel) shoppingScreenContext : null;
                        analytics6.track(new CashAppPayAuthDismissError(discoverBnplCarousel != null ? discoverBnplCarousel.flowToken : null, cashAppPayIncentiveScreen$SilentAuthorizationErrorDialog.paykitMobileUrl, shoppingScreenContext != null ? EmojiExclusions.toOrigin(shoppingScreenContext) : null), null);
                        ((BetterNavigator.ScreenNavigator) inviteErrorPresenter2.navigator).goTo(back);
                        return Unit.INSTANCE;
                    case 21:
                        InviteErrorPresenter inviteErrorPresenter3 = (InviteErrorPresenter) obj2;
                        ShoppingScreen$RestrictedItemWarningSheetScreen shoppingScreen$RestrictedItemWarningSheetScreen = (ShoppingScreen$RestrictedItemWarningSheetScreen) inviteErrorPresenter3.args;
                        if (((RestrictedItemWarningSheetViewEvent$Close) obj) == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((BetterNavigator.ScreenNavigator) inviteErrorPresenter3.navigator).goTo(back);
                        Analytics analytics7 = (Analytics) inviteErrorPresenter3.analytics;
                        String str2 = shoppingScreen$RestrictedItemWarningSheetScreen.name;
                        ShoppingScreenContext shoppingScreenContext2 = shoppingScreen$RestrictedItemWarningSheetScreen.screenContext;
                        String flowToken = shoppingScreenContext2 != null ? EmojiExclusions.getFlowToken(shoppingScreenContext2) : null;
                        ShoppingScreenContext shoppingScreenContext3 = shoppingScreen$RestrictedItemWarningSheetScreen.screenContext;
                        analytics7.track(new BrowserViewCloseRestrictedItemWarning(str2, flowToken, shoppingScreenContext3 != null ? EmojiExclusions.toOrigin(shoppingScreenContext3) : null, null, null, null, 116), null);
                        return Unit.INSTANCE;
                    case 22:
                        ShoppingInfoSheetPresenter shoppingInfoSheetPresenter = (ShoppingInfoSheetPresenter) obj2;
                        ShoppingInfoSheetViewEvent shoppingInfoSheetViewEvent = (ShoppingInfoSheetViewEvent) obj;
                        if (Intrinsics.areEqual(shoppingInfoSheetViewEvent, ShoppingInfoSheetViewEvent.Close.INSTANCE)) {
                            ShoppingInfoSheetScreen shoppingInfoSheetScreen = shoppingInfoSheetPresenter.args;
                            if (shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
                                ShoppingInfoSheetPresenter.access$trackBrowserInfoSheetClose(shoppingInfoSheetPresenter, InfoContext.AfterPay);
                            } else {
                                if (!(shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                ShoppingInfoSheetPresenter.access$trackBrowserInfoSheetClose(shoppingInfoSheetPresenter, InfoContext.CashAppPay);
                            }
                            shoppingInfoSheetPresenter.navigator.goTo(back);
                        } else {
                            if (!(shoppingInfoSheetViewEvent instanceof ShoppingInfoSheetViewEvent.OpenLink)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            shoppingInfoSheetPresenter.launcher.launchUrlInInternalBrowser(((ShoppingInfoSheetViewEvent.OpenLink) shoppingInfoSheetViewEvent).url);
                        }
                        return Unit.INSTANCE;
                    case 23:
                        if (Intrinsics.areEqual((ErrorViewEvent$GoBack) obj, ErrorViewEvent$GoBack.INSTANCE)) {
                            ((ErrorPresenter) obj2).navigator.goTo(back);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 24:
                        if (Intrinsics.areEqual((SingleUsePaymentAddCardViewEvent$ActionButtonPressed) obj, SingleUsePaymentAddCardViewEvent$ActionButtonPressed.INSTANCE)) {
                            ((CardStudioUndoDialogPresenter) obj2).navigator.goTo(back);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 25:
                        BetterNavigator.ScreenNavigator screenNavigator8 = ((CardStudioUndoDialogPresenter) obj2).navigator;
                        SingleUsePaymentCancelPlanDialogViewEvent singleUsePaymentCancelPlanDialogViewEvent = (SingleUsePaymentCancelPlanDialogViewEvent) obj;
                        if (Intrinsics.areEqual(singleUsePaymentCancelPlanDialogViewEvent, SingleUsePaymentCancelPlanDialogViewEvent.CancelPlanPressed.INSTANCE)) {
                            screenNavigator8.goTo(new Finish(AlertDialogResult.POSITIVE));
                        } else {
                            if (!Intrinsics.areEqual(singleUsePaymentCancelPlanDialogViewEvent, SingleUsePaymentCancelPlanDialogViewEvent.GoBackPressed.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator8.goTo(new Finish(AlertDialogResult.NEGATIVE));
                        }
                        return Unit.INSTANCE;
                    case 26:
                        if (!Intrinsics.areEqual((SingleUsePaymentCardDetailsViewEvent$ConfirmButtonPressed) obj, SingleUsePaymentCardDetailsViewEvent$ConfirmButtonPressed.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                        BetterNavigator.ScreenNavigator screenNavigator9 = errorPresenter.navigator;
                        SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen = (SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen) errorPresenter.args;
                        screenNavigator9.goTo(new SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen(singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen.downPayment, singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen.estimatedTotal, singleUsePaymentScreen$SingleUsePaymentCardDetailsScreen.analyticsParam));
                        return Unit.INSTANCE;
                    case 27:
                        InviteErrorPresenter inviteErrorPresenter4 = (InviteErrorPresenter) obj2;
                        Analytics analytics8 = (Analytics) inviteErrorPresenter4.analytics;
                        BetterNavigator.ScreenNavigator screenNavigator10 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter4.navigator;
                        SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen = (SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen) inviteErrorPresenter4.args;
                        SingleUsePaymentPlanDetailsViewEvent singleUsePaymentPlanDetailsViewEvent = (SingleUsePaymentPlanDetailsViewEvent) obj;
                        if (singleUsePaymentPlanDetailsViewEvent instanceof SingleUsePaymentPlanDetailsViewEvent.CancelPlanButtonPressed) {
                            SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.analyticsParam;
                            if (singleUsePaymentAnalyticsParam != null) {
                                analytics8.track(new BrowserCheckoutViewCancelPaymentPlan(singleUsePaymentAnalyticsParam.origin, singleUsePaymentAnalyticsParam.infoContext, singleUsePaymentAnalyticsParam.flowToken, singleUsePaymentAnalyticsParam.entryUrl, singleUsePaymentAnalyticsParam.entityToken), null);
                            }
                            screenNavigator10.goTo(new SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen(singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.downPayment, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.estimatedTotal));
                        } else if (Intrinsics.areEqual(singleUsePaymentPlanDetailsViewEvent, SingleUsePaymentPlanDetailsViewEvent.CardDetailsButtonPressed.INSTANCE)) {
                            SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam2 = singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.analyticsParam;
                            if (singleUsePaymentAnalyticsParam2 != null) {
                                analytics8.track(new BrowserCheckoutViewPaymentPlanCardDetails(singleUsePaymentAnalyticsParam2.origin, singleUsePaymentAnalyticsParam2.infoContext, singleUsePaymentAnalyticsParam2.flowToken, singleUsePaymentAnalyticsParam2.entryUrl, singleUsePaymentAnalyticsParam2.entityToken), null);
                            }
                            screenNavigator10.goTo(new SingleUsePaymentScreen$SingleUsePaymentCardDetailsScreen(singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.downPayment, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.estimatedTotal, singleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen.analyticsParam));
                        } else {
                            if (!Intrinsics.areEqual(singleUsePaymentPlanDetailsViewEvent, SingleUsePaymentPlanDetailsViewEvent.CloseButtonPressed.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator10.goTo(back);
                        }
                        return Unit.INSTANCE;
                    case 28:
                        if (Intrinsics.areEqual((StablecoinHomeViewEvent$BackClicked) obj, StablecoinHomeViewEvent$BackClicked.INSTANCE)) {
                            ((StablecoinHomePresenter) obj2).navigator.goTo(back);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    default:
                        ((RealSupportTransactionService) obj2).activityRowCache.clear();
                        return Unit.INSTANCE;
                }
            }

            public /* synthetic */ C00651(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
                this.$r8$classId = i;
                this.this$0 = moleculePresenter;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
