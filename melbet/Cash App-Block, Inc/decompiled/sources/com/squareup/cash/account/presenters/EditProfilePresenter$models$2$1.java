package com.squareup.cash.account.presenters;

import androidx.biometric.DeviceUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.camera.a.n;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$SettingsOptions;
import com.squareup.cash.account.presenters.accountswitcher.AddAccountOptionsPresenter$models$1$1$3;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.screens.ThemeSwitcherScreen;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.backend.ActivityFormattingError;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager$activities$2$1$2;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$activity$2$1$1;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1;
import com.squareup.cash.afterpayapplet.presenters.CalendarProviderInput;
import com.squareup.cash.afterpayapplet.presenters.OrderItemEventHandler;
import com.squareup.cash.afterpayapplet.presenters.OrderItemPresenter;
import com.squareup.cash.afterpayapplet.presenters.OverdueInfo;
import com.squareup.cash.afterpayapplet.presenters.PaymentInfo;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.PromoterActivityMessages;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.themepicker.ThemePickerManageConfirm;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.payment.Pending;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountCreationSettings;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.InMemoryAccountSettingsCache;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.treehouse.ActivityTreehouseCompatibility$Method;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.FormattingResult;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class EditProfilePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $remainingNameChanges$delegate;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$models$2$1(JWECryptoParts jWECryptoParts, List list, CalendarProviderInput calendarProviderInput, int i, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 28;
        this.L$0 = jWECryptoParts;
        this.$remainingNameChanges$delegate = list;
        this.this$0 = calendarProviderInput;
        this.label = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0332 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$afterpayapplet$presenters$RealAfterpayAppletCalendarProvider$calendarState$1$1(Object obj) {
        int i;
        int i2;
        int i3;
        Calendar addDays;
        CalendarProviderInput calendarProviderInput;
        ArrayList arrayList;
        String str;
        String str2;
        Money money;
        String str3;
        JWECryptoParts jWECryptoParts;
        String str4;
        Object obj2;
        Money money2;
        String str5;
        String str6;
        TimeZone timeZone;
        Calendar calendar;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList2;
        String replace$default;
        CalendarProviderInput calendarProviderInput2 = (CalendarProviderInput) this.this$0;
        ArrayList arrayList3 = calendarProviderInput2.payments;
        List list = (List) this.$remainingNameChanges$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        JWECryptoParts jWECryptoParts2 = (JWECryptoParts) this.L$0;
        AndroidClock androidClock = (AndroidClock) jWECryptoParts2.iv;
        TimeZone timeZone2 = androidClock.timeZone();
        Calendar calendar2 = Calendar.getInstance(timeZone2);
        calendar2.setTimeInMillis(androidClock.millis());
        switch (calendar2.get(7)) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        Calendar addDays2 = JWECryptoParts.addDays(calendar2, -i);
        int size = list.size();
        if (arrayList3.isEmpty()) {
            addDays = JWECryptoParts.addDays(addDays2, 6);
            i2 = 1;
        } else {
            Iterator it = arrayList3.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            long j = ((PaymentInfo) it.next()).dueDateMs;
            while (it.hasNext()) {
                long j2 = ((PaymentInfo) it.next()).dueDateMs;
                if (j < j2) {
                    j = j2;
                }
            }
            i2 = 1;
            Calendar calendar3 = Calendar.getInstance(timeZone2);
            calendar3.setTimeInMillis(j);
            switch (calendar3.get(7)) {
                case 1:
                    i3 = 6;
                    break;
                case 2:
                    i3 = 5;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = 2;
                    break;
                case 6:
                    i3 = 1;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            addDays = JWECryptoParts.addDays(calendar3, i3);
        }
        ZoneId systemDefault = ZoneId.systemDefault();
        int between = (int) ChronoUnit.DAYS.between(addDays2.toInstant().atZone(systemDefault).toLocalDate(), addDays.toInstant().atZone(systemDefault).toLocalDate());
        int i7 = this.label;
        int i8 = i7 == 0 ? between + 1 : i7 * 42;
        if (i8 > size) {
            Calendar addDays3 = JWECryptoParts.addDays(addDays2, size);
            Calendar addDays4 = JWECryptoParts.addDays(addDays2, i8 - 1);
            Object clone = addDays3.clone();
            clone.getClass();
            Calendar calendar4 = (Calendar) clone;
            while (!calendar4.after(addDays4)) {
                OverdueInfo overdueInfo = calendarProviderInput2.overdue;
                MoneyFormatter moneyFormatter = (MoneyFormatter) jWECryptoParts2.authenticationTag;
                AndroidStringManager androidStringManager = (AndroidStringManager) jWECryptoParts2.encryptedKey;
                AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) jWECryptoParts2.header;
                AndroidClock androidClock2 = androidDateFormatManager.clock;
                ArrayList arrayList4 = new ArrayList();
                if (JWECryptoParts.isSameDay(calendar4, calendar2)) {
                    arrayList4.add(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Today.INSTANCE);
                }
                if (!JWECryptoParts.isSameDay(calendar4, calendar2) || overdueInfo == null) {
                    calendarProviderInput = calendarProviderInput2;
                    arrayList = arrayList3;
                    str = "";
                    str2 = "";
                    money = null;
                } else {
                    money = overdueInfo.amount;
                    str = moneyFormatter.format(money);
                    calendarProviderInput = calendarProviderInput2;
                    arrayList = arrayList3;
                    arrayList4.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue(money, str, overdueInfo.analyticViewEvent, overdueInfo.analyticTapEvent));
                    str2 = androidStringManager.get(R.string.afterpay_calendar_overdue);
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        Iterator it3 = it2;
                        str3 = str2;
                        Calendar calendar5 = Calendar.getInstance(timeZone2);
                        jWECryptoParts = jWECryptoParts2;
                        str4 = str;
                        calendar5.setTimeInMillis(((PaymentInfo) obj2).dueDateMs);
                        if (!JWECryptoParts.isSameDay(calendar4, calendar5)) {
                            it2 = it3;
                            str2 = str3;
                            str = str4;
                            jWECryptoParts2 = jWECryptoParts;
                        }
                    } else {
                        str3 = str2;
                        jWECryptoParts = jWECryptoParts2;
                        str4 = str;
                        obj2 = null;
                    }
                }
                PaymentInfo paymentInfo = (PaymentInfo) obj2;
                if (paymentInfo != null) {
                    Money money3 = paymentInfo.amount;
                    String format2 = moneyFormatter.format(money3);
                    arrayList4.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue(money3, format2, paymentInfo.analyticViewEvent, paymentInfo.analyticTapEvent));
                    if (money == null) {
                        ZoneId systemDefault2 = ZoneId.systemDefault();
                        int between2 = (int) ChronoUnit.DAYS.between(calendar2.toInstant().atZone(systemDefault2).toLocalDate(), calendar4.toInstant().atZone(systemDefault2).toLocalDate());
                        if (between2 < 0) {
                            replace$default = androidStringManager.get(R.string.afterpay_calendar_overdue);
                        } else if (between2 == 0) {
                            replace$default = androidStringManager.get(R.string.afterpay_calendar_due_today);
                        } else if (between2 < 7) {
                            String format3 = androidDateFormatManager.getDateFormat("EEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                            String str7 = androidStringManager.get(R.string.afterpay_calendar_due_on_date);
                            format3.getClass();
                            replace$default = StringsKt__StringsJVMKt.replace$default(str7, "%s", format3);
                        } else {
                            String format4 = androidDateFormatManager.getDateFormat("MMM d", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                            String str8 = androidStringManager.get(R.string.afterpay_calendar_due_on_date);
                            format4.getClass();
                            replace$default = StringsKt__StringsJVMKt.replace$default(str8, "%s", format4);
                        }
                        money2 = money3;
                        str5 = replace$default;
                        str6 = format2;
                        if (arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            if (!it4.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            long j3 = ((PaymentInfo) it4.next()).dueDateMs;
                            while (it4.hasNext()) {
                                TimeZone timeZone3 = timeZone2;
                                Calendar calendar6 = calendar2;
                                long j4 = ((PaymentInfo) it4.next()).dueDateMs;
                                if (j3 < j4) {
                                    j3 = j4;
                                }
                                timeZone2 = timeZone3;
                                calendar2 = calendar6;
                            }
                            timeZone = timeZone2;
                            calendar = calendar2;
                            Calendar calendar7 = Calendar.getInstance(timeZone);
                            calendar7.setTimeInMillis(j3);
                            if (calendar4.after(calendar7) && !JWECryptoParts.isSameDay(calendar4, calendar7)) {
                                arrayList4.add(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Disabled.INSTANCE);
                            }
                        } else {
                            timeZone = timeZone2;
                            calendar = calendar2;
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList4.add(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Regular.INSTANCE);
                        }
                        String format5 = androidDateFormatManager.getDateFormat("EEEE, MMMM d", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                        if (!arrayList4.isEmpty()) {
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it5.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Today) {
                                    i4 = i2;
                                    if (!arrayList4.isEmpty()) {
                                        Iterator it6 = arrayList4.iterator();
                                        while (it6.hasNext()) {
                                            if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it6.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.PaymentDue) {
                                                i5 = i2;
                                                if (!arrayList4.isEmpty()) {
                                                    Iterator it7 = arrayList4.iterator();
                                                    while (it7.hasNext()) {
                                                        if (((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment) it7.next()) instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.DateTreatment.Overdue) {
                                                            i6 = i2;
                                                            arrayList2 = new ArrayList();
                                                            if (i4 != 0) {
                                                                arrayList2.add(androidStringManager.get(R.string.afterpay_calendar_content_description_today));
                                                            }
                                                            format5.getClass();
                                                            arrayList2.add(format5);
                                                            if (i6 == 0 && str6.length() > 0) {
                                                                arrayList2.add(StringsKt__StringsJVMKt.replace$default(androidStringManager.get(R.string.afterpay_calendar_content_description_overdue), "%s", str6));
                                                            } else if (i5 == 0 && str6.length() > 0) {
                                                                arrayList2.add(StringsKt__StringsJVMKt.replace$default(androidStringManager.get(R.string.afterpay_calendar_content_description_payment_due), "%s", str6));
                                                            }
                                                            String joinToString$default = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
                                                            int i9 = calendar4.get(5);
                                                            String format6 = androidDateFormatManager.getDateFormat("EEEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                                            format6.getClass();
                                                            String format7 = androidDateFormatManager.getDateFormat("MMM", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                                            format7.getClass();
                                                            list.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate(i9, format6, arrayList4, money2, str6, str5, format7, calendar4.getTimeInMillis(), joinToString$default));
                                                            calendar4 = JWECryptoParts.addDays(calendar4, i2);
                                                            timeZone2 = timeZone;
                                                            calendarProviderInput2 = calendarProviderInput;
                                                            arrayList3 = arrayList;
                                                            calendar2 = calendar;
                                                            jWECryptoParts2 = jWECryptoParts;
                                                        }
                                                    }
                                                }
                                                i6 = 0;
                                                arrayList2 = new ArrayList();
                                                if (i4 != 0) {
                                                }
                                                format5.getClass();
                                                arrayList2.add(format5);
                                                if (i6 == 0) {
                                                }
                                                if (i5 == 0) {
                                                    arrayList2.add(StringsKt__StringsJVMKt.replace$default(androidStringManager.get(R.string.afterpay_calendar_content_description_payment_due), "%s", str6));
                                                }
                                                String joinToString$default2 = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
                                                int i92 = calendar4.get(5);
                                                String format62 = androidDateFormatManager.getDateFormat("EEEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                                format62.getClass();
                                                String format72 = androidDateFormatManager.getDateFormat("MMM", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                                format72.getClass();
                                                list.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate(i92, format62, arrayList4, money2, str6, str5, format72, calendar4.getTimeInMillis(), joinToString$default2));
                                                calendar4 = JWECryptoParts.addDays(calendar4, i2);
                                                timeZone2 = timeZone;
                                                calendarProviderInput2 = calendarProviderInput;
                                                arrayList3 = arrayList;
                                                calendar2 = calendar;
                                                jWECryptoParts2 = jWECryptoParts;
                                            }
                                        }
                                    }
                                    i5 = 0;
                                    if (!arrayList4.isEmpty()) {
                                    }
                                    i6 = 0;
                                    arrayList2 = new ArrayList();
                                    if (i4 != 0) {
                                    }
                                    format5.getClass();
                                    arrayList2.add(format5);
                                    if (i6 == 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    String joinToString$default22 = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
                                    int i922 = calendar4.get(5);
                                    String format622 = androidDateFormatManager.getDateFormat("EEEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                    format622.getClass();
                                    String format722 = androidDateFormatManager.getDateFormat("MMM", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                                    format722.getClass();
                                    list.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate(i922, format622, arrayList4, money2, str6, str5, format722, calendar4.getTimeInMillis(), joinToString$default22));
                                    calendar4 = JWECryptoParts.addDays(calendar4, i2);
                                    timeZone2 = timeZone;
                                    calendarProviderInput2 = calendarProviderInput;
                                    arrayList3 = arrayList;
                                    calendar2 = calendar;
                                    jWECryptoParts2 = jWECryptoParts;
                                }
                            }
                        }
                        i4 = 0;
                        if (!arrayList4.isEmpty()) {
                        }
                        i5 = 0;
                        if (!arrayList4.isEmpty()) {
                        }
                        i6 = 0;
                        arrayList2 = new ArrayList();
                        if (i4 != 0) {
                        }
                        format5.getClass();
                        arrayList2.add(format5);
                        if (i6 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        String joinToString$default222 = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
                        int i9222 = calendar4.get(5);
                        String format6222 = androidDateFormatManager.getDateFormat("EEEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                        format6222.getClass();
                        String format7222 = androidDateFormatManager.getDateFormat("MMM", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                        format7222.getClass();
                        list.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate(i9222, format6222, arrayList4, money2, str6, str5, format7222, calendar4.getTimeInMillis(), joinToString$default222));
                        calendar4 = JWECryptoParts.addDays(calendar4, i2);
                        timeZone2 = timeZone;
                        calendarProviderInput2 = calendarProviderInput;
                        arrayList3 = arrayList;
                        calendar2 = calendar;
                        jWECryptoParts2 = jWECryptoParts;
                    }
                }
                money2 = money;
                str5 = str3;
                str6 = str4;
                if (arrayList.isEmpty()) {
                }
                if (arrayList4.isEmpty()) {
                }
                String format52 = androidDateFormatManager.getDateFormat("EEEE, MMMM d", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                if (!arrayList4.isEmpty()) {
                }
                i4 = 0;
                if (!arrayList4.isEmpty()) {
                }
                i5 = 0;
                if (!arrayList4.isEmpty()) {
                }
                i6 = 0;
                arrayList2 = new ArrayList();
                if (i4 != 0) {
                }
                format52.getClass();
                arrayList2.add(format52);
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                String joinToString$default2222 = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
                int i92222 = calendar4.get(5);
                String format62222 = androidDateFormatManager.getDateFormat("EEEEE", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                format62222.getClass();
                String format72222 = androidDateFormatManager.getDateFormat("MMM", androidClock2.timeZone()).formatter.format(Instant.ofEpochMilli(calendar4.getTimeInMillis()));
                format72222.getClass();
                list.add(new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate(i92222, format62222, arrayList4, money2, str6, str5, format72222, calendar4.getTimeInMillis(), joinToString$default2222));
                calendar4 = JWECryptoParts.addDays(calendar4, i2);
                timeZone2 = timeZone;
                calendarProviderInput2 = calendarProviderInput;
                arrayList3 = arrayList;
                calendar2 = calendar;
                jWECryptoParts2 = jWECryptoParts;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new EditProfilePresenter$models$2$1((TapToPayPresenter) obj2, (MutableState) this.$remainingNameChanges$delegate, continuation);
            case 1:
                return new EditProfilePresenter$models$2$1((LocalEditorialPresenter) obj2, (MutableState) this.L$0, continuation);
            case 2:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1((PaymentLoadingPresenter) obj2, continuation, 2);
                editProfilePresenter$models$2$1.$remainingNameChanges$delegate = obj;
                return editProfilePresenter$models$2$1;
            case 3:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$12 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (AddAliasPresenter) obj2, 3);
                editProfilePresenter$models$2$12.L$0 = obj;
                return editProfilePresenter$models$2$12;
            case 4:
                return new EditProfilePresenter$models$2$1((State) this.L$0, (LocalPosCheckInPresenter) this.$remainingNameChanges$delegate, (String) obj2, continuation, 4);
            case 5:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$13 = new EditProfilePresenter$models$2$1((LocalPosCheckInPresenter) obj2, continuation, 5);
                editProfilePresenter$models$2$13.$remainingNameChanges$delegate = obj;
                return editProfilePresenter$models$2$13;
            case 6:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$14 = new EditProfilePresenter$models$2$1((DisclosurePresenter) obj2, continuation, 6);
                editProfilePresenter$models$2$14.$remainingNameChanges$delegate = obj;
                return editProfilePresenter$models$2$14;
            case 7:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$15 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (DisclosurePresenter) obj2, 7);
                editProfilePresenter$models$2$15.L$0 = obj;
                return editProfilePresenter$models$2$15;
            case 8:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$16 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (AccountDocumentsPresenter) obj2, 8);
                editProfilePresenter$models$2$16.L$0 = obj;
                return editProfilePresenter$models$2$16;
            case 9:
                return new EditProfilePresenter$models$2$1((ZiplineActivityItemFormatter) this.L$0, (PaymentHistoryActivityItem) this.$remainingNameChanges$delegate, (Locale) obj2, continuation, 9);
            case 10:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$17 = new EditProfilePresenter$models$2$1((RealActivitiesManager) this.$remainingNameChanges$delegate, (ProducerScope) obj2, continuation, 10);
                editProfilePresenter$models$2$17.L$0 = obj;
                return editProfilePresenter$models$2$17;
            case 11:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$18 = new EditProfilePresenter$models$2$1((RealSingleActivityManager) this.$remainingNameChanges$delegate, (ProducerScope) obj2, continuation, 11);
                editProfilePresenter$models$2$18.L$0 = obj;
                return editProfilePresenter$models$2$18;
            case 12:
                return new EditProfilePresenter$models$2$1((Pending) this.L$0, (RealOfflineActivitiesManager) this.$remainingNameChanges$delegate, (ZiplineHistoryDataJavaScripter) obj2, continuation, 12);
            case 13:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$19 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (ActivityInviteItemPresenter) obj2, 13);
                editProfilePresenter$models$2$19.L$0 = obj;
                return editProfilePresenter$models$2$19;
            case 14:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$110 = new EditProfilePresenter$models$2$1((RealLocalInstalledStore$hideBrands$$inlined$map$1) this.$remainingNameChanges$delegate, continuation, (UiCallbackModel) obj2, 14);
                editProfilePresenter$models$2$110.L$0 = obj;
                return editProfilePresenter$models$2$110;
            case 15:
                return new EditProfilePresenter$models$2$1(15, (MutableState) this.L$0, (Flow) this.$remainingNameChanges$delegate, (ActivityTabPresenter) obj2, continuation);
            case 16:
                return new EditProfilePresenter$models$2$1((ActivityTabPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$remainingNameChanges$delegate, continuation);
            case 17:
                return new EditProfilePresenter$models$2$1(17, (MutableState) this.L$0, (PaymentHistoryActivityItemPresenter) this.$remainingNameChanges$delegate, (ActivityItemViewEvent) obj2, continuation);
            case 18:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$111 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (ReceiptPresenter) obj2, 18);
                editProfilePresenter$models$2$111.L$0 = obj;
                return editProfilePresenter$models$2$111;
            case 19:
                return new EditProfilePresenter$models$2$1((ReceiptPresenter) this.$remainingNameChanges$delegate, (MutableState) this.L$0, (State) obj2, continuation);
            case 20:
                return new EditProfilePresenter$models$2$1((State) this.L$0, (ActivityItemEventHandler) this.$remainingNameChanges$delegate, (ReceiptPresenter) obj2, continuation, 20);
            case 21:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$112 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (FullscreenAdPresenter) obj2, 21);
                editProfilePresenter$models$2$112.L$0 = obj;
                return editProfilePresenter$models$2$112;
            case 22:
                return new EditProfilePresenter$models$2$1(22, (MutableState) this.L$0, (AfterpayAppletTilePresenter) this.$remainingNameChanges$delegate, (State) obj2, continuation);
            case 23:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$113 = new EditProfilePresenter$models$2$1((FinishSetupTileBadgeCounter) this.$remainingNameChanges$delegate, continuation, (RealAfterpayAppletRepository) obj2, 23);
                editProfilePresenter$models$2$113.L$0 = obj;
                return editProfilePresenter$models$2$113;
            case 24:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$114 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (LocalHomePresenter) obj2, 24);
                editProfilePresenter$models$2$114.L$0 = obj;
                return editProfilePresenter$models$2$114;
            case 25:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$115 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (LocalPosCheckInPresenter) obj2, 25);
                editProfilePresenter$models$2$115.L$0 = obj;
                return editProfilePresenter$models$2$115;
            case 26:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$116 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (ErrorPresenter) obj2, 26);
                editProfilePresenter$models$2$116.L$0 = obj;
                return editProfilePresenter$models$2$116;
            case 27:
                return new EditProfilePresenter$models$2$1((OrderItemPresenter) this.L$0, (ActivityItemViewModel) this.$remainingNameChanges$delegate, (ActivityItemViewEvent) obj2, continuation, 27);
            case 28:
                return new EditProfilePresenter$models$2$1((JWECryptoParts) this.L$0, (List) this.$remainingNameChanges$delegate, (CalendarProviderInput) obj2, this.label, continuation);
            default:
                EditProfilePresenter$models$2$1 editProfilePresenter$models$2$117 = new EditProfilePresenter$models$2$1((Flow) this.$remainingNameChanges$delegate, continuation, (EndAppLockPresenter) obj2, 29);
                editProfilePresenter$models$2$117.L$0 = obj;
                return editProfilePresenter$models$2$117;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 10:
                ((EditProfilePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 11:
                ((EditProfilePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((EditProfilePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0436, code lost:
    
        if (r0 == r4) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04a2, code lost:
    
        if (r0 == r4) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05af, code lost:
    
        if (r0 == r3) goto L275;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.squareup.cash.account.presenters.accountswitcher.AccountSwitcherPresenter$SettingsOptions] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        Object remainingLimit;
        ThemeSwitcherViewModel.Loaded loaded;
        Object obj2;
        SettingVisibility settingVisibility;
        Object obj3;
        Object mapOf;
        Object canDowngrade;
        Object format2;
        Object format3;
        FormattingResult formattingResult;
        Object access$makePaymentItem;
        Object access$makeTransferItem;
        Object fetch;
        int i = this.$r8$classId;
        int i2 = 25;
        int i3 = 0;
        int i4 = 2;
        Object obj4 = this.this$0;
        int i5 = 1;
        Continuation continuation = null;
        SettingVisibility settingVisibility2 = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = (MutableState) this.$remainingNameChanges$delegate;
                    n nVar = (n) ((TapToPayPresenter) obj4).tapToPayErrorReporter;
                    this.L$0 = mutableState;
                    this.label = 1;
                    remainingLimit = nVar.getRemainingLimit(this);
                    if (remainingLimit == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState2 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState2;
                    remainingLimit = obj;
                }
                mutableState.setValue((Integer) remainingLimit);
                return Unit.INSTANCE;
            case 1:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ThemeSwitcherViewModel themeSwitcherViewModel = (ThemeSwitcherViewModel) ((MutableState) this.L$0).getValue();
                    themeSwitcherViewModel.getClass();
                    ThemeSwitcherViewModel.Loaded loaded2 = (ThemeSwitcherViewModel.Loaded) themeSwitcherViewModel;
                    PaymentPadTheme paymentPadTheme = loaded2.selectedTheme;
                    ThemeData themeData = null;
                    for (?? r10 : loaded2.themeData) {
                        if (((ThemeData) r10).theme == paymentPadTheme) {
                            if (i3 != 0) {
                                a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                                return null;
                            }
                            i3 = 1;
                            themeData = r10;
                        }
                    }
                    if (i3 == 0) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    ThemeData themeData2 = themeData;
                    if (themeData2.locked) {
                        RealRouter realRouter = (RealRouter) localEditorialPresenter.responseContextHandler;
                        String str = themeData2.url;
                        str.getClass();
                        ThemeSwitcherScreen themeSwitcherScreen = (ThemeSwitcherScreen) localEditorialPresenter.service;
                        realRouter.route(new RoutingParams(themeSwitcherScreen, "THEME_SWITCHER", themeSwitcherScreen, null, null, null, 500), str);
                        return Unit.INSTANCE;
                    }
                    KeyValue keyValue = (KeyValue) localEditorialPresenter.launcher;
                    String name = paymentPadTheme.name();
                    this.$remainingNameChanges$delegate = loaded2;
                    this.label = 1;
                    if (keyValue.set(name, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    loaded = loaded2;
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    loaded = (ThemeSwitcherViewModel.Loaded) this.$remainingNameChanges$delegate;
                    SafeTrace.throwOnFailure(obj);
                }
                ArrayList arrayList = loaded.themeData;
                PaymentPadTheme paymentPadTheme2 = loaded.selectedTheme;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ThemeData) it.next()).theme);
                }
                ((Analytics) localEditorialPresenter.installedStore).track(new ThemePickerManageConfirm(LocalEditorialPresenter.access$toCdfTheme(localEditorialPresenter, paymentPadTheme2), new Integer(arrayList2.indexOf(paymentPadTheme2))), null);
                ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(Back.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) obj4;
                boolean z = paymentLoadingPresenter.isRequest;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) paymentLoadingPresenter.featureFlagManager;
                    this.$remainingNameChanges$delegate = null;
                    this.L$0 = produceStateScope;
                    this.label = 1;
                    obj2 = realSettingsEligibilityManager.settings(this);
                    if (obj2 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                }
                SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SettingVisibility settingsState = !z ? ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.accountCreation.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_BUSINESS_ACCOUNT) : SettingVisibility.HIDDEN;
                    SettingVisibility settingsState2 = !z ? ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.accountCreation.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_PERSONAL_ACCOUNT) : SettingVisibility.HIDDEN;
                    if (z) {
                        InMemoryAccountSettingsCache inMemoryAccountSettingsCache = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache;
                        AccountSettingType$AccountCreationSettings accountSettingType$AccountCreationSettings = inMemoryAccountSettingsCache.accountCreation;
                        Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new SettingVisibility[]{inMemoryAccountSettingsCache.accountLinking.getSettingState(), accountSettingType$AccountCreationSettings.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_BUSINESS_ACCOUNT), accountSettingType$AccountCreationSettings.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_PERSONAL_ACCOUNT)}).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ?? next = it2.next();
                                if (((SettingVisibility) next) == SettingVisibility.VISIBLE) {
                                    settingVisibility2 = next;
                                }
                            }
                        }
                        settingVisibility = settingVisibility2;
                        if (settingVisibility == null) {
                            settingVisibility = SettingVisibility.HIDDEN;
                        }
                    } else {
                        settingVisibility = SettingVisibility.HIDDEN;
                    }
                    continuation = new AccountSwitcherPresenter$SettingsOptions(settingsState, settingsState2, settingVisibility);
                }
                produceStateScope.setValue(continuation);
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(coroutineScope, (AddAliasPresenter) obj4, 16);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8((State) this.L$0, 15)), i5), 1);
                    AddAccountOptionsPresenter$models$1$1$3 addAccountOptionsPresenter$models$1$1$3 = new AddAccountOptionsPresenter$models$1$1$3((LocalPosCheckInPresenter) this.$remainingNameChanges$delegate, (String) obj4);
                    this.label = 1;
                    if (take.collect(addAccountOptionsPresenter$models$1$1$3, this) == coroutineSingletons5) {
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
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager2 = (RealSettingsEligibilityManager) ((LocalPosCheckInPresenter) obj4).stringManager;
                    this.$remainingNameChanges$delegate = null;
                    this.L$0 = produceStateScope2;
                    this.label = 1;
                    obj3 = realSettingsEligibilityManager2.settings(this);
                    if (obj3 == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope2 = (ProduceStateScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    obj3 = obj;
                }
                SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult2 = (SettingsEligibilityManager$AccountSettingsResult) obj3;
                if (settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError) {
                    mapOf = EmptyMap.INSTANCE;
                    mapOf.getClass();
                } else {
                    if (!(settingsEligibilityManager$AccountSettingsResult2 instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AddAccountOptionsViewModel.Loaded.AccountOption.OptionType optionType = AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Personal;
                    InMemoryAccountSettingsCache inMemoryAccountSettingsCache2 = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult2).cache;
                    AccountSettingType$AccountCreationSettings accountSettingType$AccountCreationSettings2 = inMemoryAccountSettingsCache2.accountCreation;
                    mapOf = MapsKt__MapsKt.mapOf(new Pair(optionType, accountSettingType$AccountCreationSettings2.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_PERSONAL_ACCOUNT)), new Pair(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Business, accountSettingType$AccountCreationSettings2.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_BUSINESS_ACCOUNT)), new Pair(AddAccountOptionsViewModel.Loaded.AccountOption.OptionType.Link, inMemoryAccountSettingsCache2.accountLinking.getSettingState()));
                }
                produceStateScope2.setValue(mapOf);
                return Unit.INSTANCE;
            case 6:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAccountRatePlanManager realAccountRatePlanManager = (RealAccountRatePlanManager) ((DisclosurePresenter) obj4).launcher;
                    this.$remainingNameChanges$delegate = null;
                    this.L$0 = produceStateScope3;
                    this.label = 1;
                    canDowngrade = realAccountRatePlanManager.canDowngrade(this);
                    if (canDowngrade == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope3 = (ProduceStateScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    canDowngrade = obj;
                }
                produceStateScope3.setValue(canDowngrade);
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$22 = new LazyPagingItems$collectLoadState$2(coroutineScope2, (DisclosurePresenter) obj4, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(lazyPagingItems$collectLoadState$22, this) == coroutineSingletons8) {
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
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$23 = new LazyPagingItems$collectLoadState$2(coroutineScope3, (AccountDocumentsPresenter) obj4, 18);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(lazyPagingItems$collectLoadState$23, this) == coroutineSingletons9) {
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
                ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) this.L$0;
                PaymentHistoryActivityItem paymentHistoryActivityItem = (PaymentHistoryActivityItem) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        boolean canUse = ziplineActivityItemFormatter.activityTreehouseCompatibility.canUse(ActivityTreehouseCompatibility$Method.LocaleAwareFormatting);
                        ActivityDataBridge activityDataBridge = ziplineActivityItemFormatter.activityDataBridge;
                        if (!canUse) {
                            SerializableActivityItem serializable = ZiplineActivityItemFormatter.serializable(paymentHistoryActivityItem);
                            this.label = 2;
                            format2 = activityDataBridge.format(serializable, this);
                            break;
                        } else {
                            SerializableActivityItem serializable2 = ZiplineActivityItemFormatter.serializable(paymentHistoryActivityItem);
                            Locale locale = (Locale) obj4;
                            String languageTag = locale != null ? locale.toLanguageTag() : null;
                            this.label = 1;
                            format3 = activityDataBridge.format(serializable2, languageTag, this);
                            if (format3 == coroutineSingletons10) {
                            }
                            formattingResult = (FormattingResult) format3;
                        }
                        return coroutineSingletons10;
                    }
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        format3 = obj;
                        formattingResult = (FormattingResult) format3;
                    } else {
                        if (i15 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        format2 = obj;
                        formattingResult = (FormattingResult) format2;
                    }
                    if (formattingResult instanceof FormattingResult.Failure) {
                        ziplineActivityItemFormatter.reportAsError((FormattingResult.Failure) formattingResult, paymentHistoryActivityItem);
                    }
                    return ziplineActivityItemFormatter.mapResult(paymentHistoryActivityItem, formattingResult);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ziplineActivityItemFormatter.errorReporter.report(new ActivityFormattingError(e2, paymentHistoryActivityItem), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    return DeviceUtils.FormattingFailedActivityItem(paymentHistoryActivityItem);
                }
            case 10:
                RealActivitiesManager realActivitiesManager = (RealActivitiesManager) this.$remainingNameChanges$delegate;
                SharedFlowImpl sharedFlowImpl = realActivitiesManager.activities;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 != 0) {
                    if (i16 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Activities activities = (Activities) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                if ((activities != null ? activities.loadingState : null) != LoadingState.LOADED) {
                    List list = activities != null ? activities.recentActivities : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    if (list.isEmpty()) {
                        JobKt.launch$default(coroutineScope4, null, null, new AmountPickerCondensedView.AnonymousClass14(realActivitiesManager, continuation, i5), 3);
                    }
                }
                RealActivitiesManager$activities$2$1$2 realActivitiesManager$activities$2$1$2 = new RealActivitiesManager$activities$2$1$2((ProducerScope) obj4, i3);
                this.L$0 = null;
                this.label = 1;
                sharedFlowImpl.collect(realActivitiesManager$activities$2$1$2, this);
                return coroutineSingletons11;
            case 11:
                RealSingleActivityManager realSingleActivityManager = (RealSingleActivityManager) this.$remainingNameChanges$delegate;
                SharedFlowImpl sharedFlowImpl2 = realSingleActivityManager.activity;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 != 0) {
                    if (i17 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SingleActivity singleActivity = (SingleActivity) CollectionsKt.firstOrNull(sharedFlowImpl2.getReplayCache());
                if ((singleActivity != null ? singleActivity.loadingState : null) != LoadingState.LOADED) {
                    if ((singleActivity != null ? singleActivity.activityItem : null) == null) {
                        JobKt.launch$default(coroutineScope5, null, null, new RealSingleActivityManager$activity$2$1$1(realSingleActivityManager, continuation, i3), 3);
                    }
                }
                ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1 = new ThumbNode$onAttach$1.AnonymousClass1(i2, realSingleActivityManager, (ProducerScope) obj4);
                this.L$0 = null;
                this.label = 1;
                sharedFlowImpl2.collect(anonymousClass1, this);
                return coroutineSingletons12;
            case 12:
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj4;
                RealOfflineActivitiesManager realOfflineActivitiesManager = (RealOfflineActivitiesManager) this.$remainingNameChanges$delegate;
                Pending pending = (Pending) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 != 0) {
                    if (i18 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        access$makeTransferItem = obj;
                        return (FormattedPaymentHistoryActivityItem) access$makeTransferItem;
                    }
                    if (i18 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$makePaymentItem = obj;
                    return (FormattedPaymentHistoryActivityItem) access$makePaymentItem;
                }
                SafeTrace.throwOnFailure(obj);
                TransferFundsRequest transferFundsRequest = pending.transfer_request;
                long j = pending.created_at;
                if (transferFundsRequest == null) {
                    InitiatePaymentRequest initiatePaymentRequest = pending.payment_request;
                    if (initiatePaymentRequest == null) {
                        return null;
                    }
                    UiCustomer uiCustomer = RealOfflineActivitiesManager.C_OUTGOING_TRANSFER;
                    RetryContext retryContext = new RetryContext(Long.valueOf(j), 0L, null, 60);
                    RequestContext requestContext = initiatePaymentRequest.request_context;
                    InitiatePaymentRequest copy$default = InitiatePaymentRequest.copy$default(initiatePaymentRequest, requestContext != null ? RequestContext.copy$default(requestContext, retryContext, null, null, null, null, null, null, null, null, null, null, null, 8190) : new RequestContext(retryContext, null, null, null, null, null, null, null, 8190), null, null, null, null, null, null, null, null, null, 8388606);
                    int i19 = (int) pending.recipient_index;
                    this.label = 2;
                    access$makePaymentItem = RealOfflineActivitiesManager.access$makePaymentItem(realOfflineActivitiesManager, copy$default, i19, ziplineHistoryDataJavaScripter, this);
                    break;
                } else {
                    UiCustomer uiCustomer2 = RealOfflineActivitiesManager.C_OUTGOING_TRANSFER;
                    RetryContext retryContext2 = new RetryContext(Long.valueOf(j), 0L, null, 60);
                    RequestContext requestContext2 = transferFundsRequest.request_context;
                    TransferFundsRequest copy$default2 = TransferFundsRequest.copy$default(transferFundsRequest, requestContext2 != null ? RequestContext.copy$default(requestContext2, retryContext2, null, null, null, null, null, null, null, null, null, null, null, 8190) : new RequestContext(retryContext2, null, null, null, null, null, null, null, 8190), null, null, null, null, null, null, 16382);
                    this.label = 1;
                    access$makeTransferItem = RealOfflineActivitiesManager.access$makeTransferItem(realOfflineActivitiesManager, copy$default2, ziplineHistoryDataJavaScripter, this);
                    break;
                }
                return coroutineSingletons13;
            case 13:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$24 = new LazyPagingItems$collectLoadState$2(coroutineScope6, (ActivityInviteItemPresenter) obj4, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(lazyPagingItems$collectLoadState$24, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = (RealLocalInstalledStore$hideBrands$$inlined$map$1) this.$remainingNameChanges$delegate;
                    HomeViewPresenter$models$$inlined$CollectEffect$1$1 homeViewPresenter$models$$inlined$CollectEffect$1$1 = new HomeViewPresenter$models$$inlined$CollectEffect$1$1(coroutineScope7, (UiCallbackModel) obj4, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (realLocalInstalledStore$hideBrands$$inlined$map$1.collect(homeViewPresenter$models$$inlined$CollectEffect$1$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) obj4;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow buffer$default = FlowKt.buffer$default(FlowKt.merge(new BitcoinDepositsPresenter$special$$inlined$filter$1((Flow) this.$remainingNameChanges$delegate, i5), new BitcoinDepositsPresenter$special$$inlined$filter$1(activityTabPresenter.mappedFeedCallbackEvents, i4)), -1, 2);
                    ThumbNode$onAttach$1.AnonymousClass1 anonymousClass12 = new ThumbNode$onAttach$1.AnonymousClass1(29, activityTabPresenter, (MutableState) this.L$0);
                    this.label = 1;
                    if (buffer$default.collect(anonymousClass12, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    n nVar2 = ((ActivityTabPresenter) obj4).promoterActivityMessageProvider;
                    this.label = 1;
                    fetch = nVar2.fetch(this);
                    if (fetch == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    fetch = obj;
                }
                PromoterActivityMessages promoterActivityMessages = (PromoterActivityMessages) fetch;
                ((MutableState) this.L$0).setValue(promoterActivityMessages.cardMessage);
                ((MutableState) this.$remainingNameChanges$delegate).setValue(promoterActivityMessages.inlineV2Message);
                return Unit.INSTANCE;
            case 17:
                PaymentHistoryActivityItemPresenter paymentHistoryActivityItemPresenter = (PaymentHistoryActivityItemPresenter) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow handleEvent = paymentHistoryActivityItemPresenter.eventHandler.handleEvent((ActivityItemViewModel) ((MutableState) this.L$0).getValue(), (ActivityItemViewEvent) obj4, paymentHistoryActivityItemPresenter.activityItem);
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$25 = new LazyPagingItems$collectLoadState$2(paymentHistoryActivityItemPresenter, 21);
                    this.label = 1;
                    if (handleEvent.collect(lazyPagingItems$collectLoadState$25, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$remainingNameChanges$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(5, coroutineScope8, (ReceiptPresenter) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                MutableState mutableState3 = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        ActivityItem activityItem = ((SingleActivity) ((State) obj4).getValue()).activityItem;
                        PaymentHistoryActivityItem paymentHistoryActivityItem2 = activityItem instanceof PaymentHistoryActivityItem ? (PaymentHistoryActivityItem) activityItem : null;
                        if (paymentHistoryActivityItem2 == null || !paymentHistoryActivityItem2.isOffline()) {
                            RealSingleActivityManager realSingleActivityManager2 = ((ReceiptPresenter) this.$remainingNameChanges$delegate).singleActivityManager;
                            this.label = 1;
                            if (realSingleActivityManager2.fetch(this) == coroutineSingletons20) {
                                return coroutineSingletons20;
                            }
                        }
                    } else {
                        mutableState3.setValue(Boolean.TRUE);
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReceiptPresenter.IntermediateState intermediateState = (ReceiptPresenter.IntermediateState) ((State) this.L$0).getValue();
                    ReceiptPresenter.IntermediateState.Loaded loaded3 = intermediateState instanceof ReceiptPresenter.IntermediateState.Loaded ? (ReceiptPresenter.IntermediateState.Loaded) intermediateState : null;
                    if (loaded3 != null) {
                        Flow handleEvent2 = ((ActivityItemEventHandler) this.$remainingNameChanges$delegate).handleEvent(loaded3.itemViewModel, ActivityItemViewEvent.AvatarClicked.INSTANCE, loaded3.activityItem);
                        LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$26 = ((ReceiptPresenter) obj4).eventHandlerFlowCollector;
                        this.label = 1;
                        if (handleEvent2.collect(lazyPagingItems$collectLoadState$26, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$remainingNameChanges$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$32 = new ActivityTabViewKt$ActivityTab$5$1$3(7, coroutineScope9, (FullscreenAdPresenter) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(activityTabViewKt$ActivityTab$5$1$32, this) == coroutineSingletons22) {
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
            case 22:
                AfterpayAppletTilePresenter afterpayAppletTilePresenter = (AfterpayAppletTilePresenter) this.$remainingNameChanges$delegate;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow home = afterpayAppletTilePresenter.repository.getHome();
                    SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(12, afterpayAppletTilePresenter, (State) obj4, (MutableState) this.L$0);
                    this.label = 1;
                    if (home.collect(swipeableState$animateTo$2, this) == coroutineSingletons23) {
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
            case 23:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = (FinishSetupTileBadgeCounter) this.$remainingNameChanges$delegate;
                    RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2 realAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2 = new RealAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2(flowCollector, (RealAfterpayAppletRepository) obj4, i5);
                    this.L$0 = null;
                    this.label = 1;
                    if (finishSetupTileBadgeCounter.collect(realAfterpayAppletRepository$getEntryPointAvailable$$inlined$map$1$2, this) == coroutineSingletons24) {
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
            case 24:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$remainingNameChanges$delegate;
                    AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1 afterpayAppletActivityListEmbeddedPresenter$models$2$1$1 = new AfterpayAppletActivityListEmbeddedPresenter$models$2$1$1(coroutineScope10, (LocalHomePresenter) obj4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(afterpayAppletActivityListEmbeddedPresenter$models$2$1$1, this) == coroutineSingletons25) {
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
            case 25:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$27 = new LazyPagingItems$collectLoadState$2(coroutineScope11, (LocalPosCheckInPresenter) obj4, 24);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(lazyPagingItems$collectLoadState$27, this) == coroutineSingletons26) {
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
            case 26:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$28 = new LazyPagingItems$collectLoadState$2(coroutineScope12, (ErrorPresenter) obj4, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(lazyPagingItems$collectLoadState$28, this) == coroutineSingletons27) {
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
            case 27:
                OrderItemPresenter orderItemPresenter = (OrderItemPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow handleEvent3 = ((OrderItemEventHandler) orderItemPresenter.eventHandler$delegate.getValue()).handleEvent((ActivityItemViewModel) this.$remainingNameChanges$delegate, (ActivityItemViewEvent) obj4, orderItemPresenter.activityItem);
                    this.label = 1;
                    if (FlowKt.collect(handleEvent3, this) == coroutineSingletons28) {
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
            case 28:
                return invokeSuspend$com$squareup$cash$afterpayapplet$presenters$RealAfterpayAppletCalendarProvider$calendarState$1$1(obj);
            default:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$remainingNameChanges$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$29 = new LazyPagingItems$collectLoadState$2(coroutineScope13, (EndAppLockPresenter) obj4, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(lazyPagingItems$collectLoadState$29, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfilePresenter$models$2$1(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$models$2$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.this$0 = localEditorialPresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfilePresenter$models$2$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$remainingNameChanges$delegate = obj;
        this.this$0 = obj2;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$models$2$1(ActivityTabPresenter activityTabPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.this$0 = activityTabPresenter;
        this.L$0 = mutableState;
        this.$remainingNameChanges$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$models$2$1(ReceiptPresenter receiptPresenter, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.$remainingNameChanges$delegate = receiptPresenter;
        this.L$0 = mutableState;
        this.this$0 = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfilePresenter$models$2$1(TapToPayPresenter tapToPayPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = tapToPayPresenter;
        this.$remainingNameChanges$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfilePresenter$models$2$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$remainingNameChanges$delegate = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfilePresenter$models$2$1(Object obj, ProducerScope producerScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$remainingNameChanges$delegate = obj;
        this.this$0 = producerScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfilePresenter$models$2$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$remainingNameChanges$delegate = flow;
        this.this$0 = obj;
    }
}
