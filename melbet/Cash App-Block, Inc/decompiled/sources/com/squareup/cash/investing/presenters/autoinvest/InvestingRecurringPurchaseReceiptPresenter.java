package com.squareup.cash.investing.presenters.autoinvest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentRecurringPreferenceStore;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries$selectForId$2;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import java.text.SimpleDateFormat;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class InvestingRecurringPurchaseReceiptPresenter implements MoleculePresenter {
    public final InvestingScreens.RecurringPurchaseReceipt args;
    public final AndroidClock clock;
    public final CashAccountDatabaseImpl database;
    public final RealDependentCustomerTokenRepository dependentCustomerTokenRepository;
    public final DependentRecurringPreferenceStore dependentRecurringPreferenceStore;
    public final CoroutineContext ioDispatcher;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public InvestingRecurringPurchaseReceiptPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidStringManager androidStringManager, AndroidClock androidClock, LocalizedMoneyFormatter.Factory factory, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository, DependentRecurringPreferenceStore dependentRecurringPreferenceStore, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.RecurringPurchaseReceipt recurringPurchaseReceipt) {
        recurringPurchaseReceipt.getClass();
        this.database = cashAccountDatabaseImpl;
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.moneyFormatterFactory = factory;
        this.dependentCustomerTokenRepository = realDependentCustomerTokenRepository;
        this.dependentRecurringPreferenceStore = dependentRecurringPreferenceStore;
        this.ioDispatcher = coroutineContext;
        this.navigator = screenNavigator;
        this.args = recurringPurchaseReceipt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        DependentRecurringPreference.RecurringPreferenceLoaded recurringPreferenceLoaded;
        DependentRecurringPreference.RecurringPreferenceLoaded recurringPreferenceLoaded2;
        LocalizedMoneyFormatter.Factory factory;
        LocalizedMoneyFormatter.Factory factory2;
        boolean z;
        InvestingRecurringPurchaseReceiptViewModel.Content content;
        Recurring_preference recurring_preference;
        SyncRecurringPreference syncRecurringPreference;
        ScheduledTransactionPreference scheduledTransactionPreference;
        Money money;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1891229651);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        InvestingScreens.RecurringPurchaseReceipt recurringPurchaseReceipt = this.args;
        if (rememberedValue == neverEqualPolicy) {
            RecurringPreferenceQueries recurringPreferenceQueries = this.database.recurringPreferenceQueries;
            String str = recurringPurchaseReceipt.preferenceId;
            recurringPreferenceQueries.getClass();
            str.getClass();
            int i2 = RecurringPreferenceQueries$selectForId$2.$r8$clinit;
            rememberedValue = FlowKt.distinctUntilChanged(DBUtil.mapToOneNotNull(DBUtil.toFlow(new RecurringPreferenceQueries.SelectForIdQuery(recurringPreferenceQueries, str, new RecurringPreferenceQueries$$ExternalSyntheticLambda5(recurringPreferenceQueries, 1))), this.ioDispatcher));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        InvestingRecurringPurchaseReceiptViewModel.Content content2 = null;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        String customerToken = this.dependentCustomerTokenRepository.getCustomerToken();
        DependentRecurringPreferenceStore dependentRecurringPreferenceStore = this.dependentRecurringPreferenceStore;
        if (customerToken != null && Intrinsics.areEqual(recurringPurchaseReceipt.f1161type, InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin.INSTANCE)) {
            gapComposer.startReplaceGroup(242067140);
            DependentRecurringPreference bitcoinRecurringPreference = ((RealDependentRecurringPreferenceStore) dependentRecurringPreferenceStore).bitcoinRecurringPreference(customerToken, gapComposer, 0);
            recurringPreferenceLoaded2 = bitcoinRecurringPreference instanceof DependentRecurringPreference.RecurringPreferenceLoaded ? (DependentRecurringPreference.RecurringPreferenceLoaded) bitcoinRecurringPreference : null;
            gapComposer.end(false);
        } else {
            if (customerToken == null || !(recurringPurchaseReceipt.f1161type instanceof InvestingScreens.RecurringPurchaseReceipt.Type.Stock)) {
                gapComposer.startReplaceGroup(242478169);
                gapComposer.end(false);
                recurringPreferenceLoaded = null;
                if (((Recurring_preference) collectAsState.getValue()) != null && recurringPreferenceLoaded == null) {
                    gapComposer.end(false);
                    return InvestingRecurringPurchaseReceiptViewModel.Loading.INSTANCE;
                }
                Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, recurringPreferenceLoaded, this, collectAsState, 13));
                factory = this.moneyFormatterFactory;
                AndroidStringManager androidStringManager = this.stringManager;
                AndroidClock androidClock = this.clock;
                if (recurringPreferenceLoaded != null || (syncRecurringPreference = recurringPreferenceLoaded.syncRecurringPreference) == null || (scheduledTransactionPreference = syncRecurringPreference.preference) == null) {
                    factory2 = factory;
                    z = false;
                } else {
                    SimpleDateFormat simpleDateFormat = RecurringPreferenceKt.timeFormatter;
                    recurringPurchaseReceipt.getClass();
                    Boolean bool = scheduledTransactionPreference.enabled;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        Long l = scheduledTransactionPreference.next_reload_at;
                        if (l != null) {
                            RecurringSchedule recurringSchedule = scheduledTransactionPreference.recurring_schedule;
                            if (recurringSchedule == null || (money = scheduledTransactionPreference.amount) == null) {
                                factory2 = factory;
                                content = null;
                                z = false;
                            } else {
                                factory2 = factory;
                                z = false;
                                content = RecurringPreferenceKt.mapRecurringPreferenceToRecieptViewModel(booleanValue, l, recurringSchedule, money, recurringPurchaseReceipt, androidClock, androidStringManager, factory2, true);
                            }
                        }
                    }
                    factory2 = factory;
                    z = false;
                    content = null;
                }
                recurring_preference = (Recurring_preference) collectAsState.getValue();
                if (recurring_preference != null) {
                    SimpleDateFormat simpleDateFormat2 = RecurringPreferenceKt.timeFormatter;
                    recurringPurchaseReceipt.getClass();
                    content2 = RecurringPreferenceKt.mapRecurringPreferenceToRecieptViewModel(recurring_preference.enabled, recurring_preference.next_reload_at, recurring_preference.schedule, recurring_preference.amount, recurringPurchaseReceipt, androidClock, androidStringManager, factory2, false);
                }
                content2.getClass();
                content = content2;
                gapComposer.end(z);
                return content;
            }
            gapComposer.startReplaceGroup(242305282);
            DependentRecurringPreference investingRecurringPreference = ((RealDependentRecurringPreferenceStore) dependentRecurringPreferenceStore).investingRecurringPreference(customerToken, gapComposer);
            recurringPreferenceLoaded2 = investingRecurringPreference instanceof DependentRecurringPreference.RecurringPreferenceLoaded ? (DependentRecurringPreference.RecurringPreferenceLoaded) investingRecurringPreference : null;
            gapComposer.end(false);
        }
        recurringPreferenceLoaded = recurringPreferenceLoaded2;
        if (((Recurring_preference) collectAsState.getValue()) != null) {
        }
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, recurringPreferenceLoaded, this, collectAsState, 13));
        factory = this.moneyFormatterFactory;
        AndroidStringManager androidStringManager2 = this.stringManager;
        AndroidClock androidClock2 = this.clock;
        if (recurringPreferenceLoaded != null) {
        }
        factory2 = factory;
        z = false;
        recurring_preference = (Recurring_preference) collectAsState.getValue();
        if (recurring_preference != null) {
        }
        content2.getClass();
        content = content2;
        gapComposer.end(z);
        return content;
    }
}
