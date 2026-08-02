package com.squareup.cash.earnings.presenters.home;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzakk;
import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoConfirmationViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoRow;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewModel;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.viewmodels.DateFilterBarViewModel;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.earnings.backend.api.EarningsChartResult;
import com.squareup.cash.earnings.backend.api.EarningsHomeHeader;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$MetroFactory;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.chat.PromptSuggestion;
import com.squareup.cash.moneybot.backend.api.model.chat.PromptSuggestions;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.presenters.identityverification.RealIdentityVerificationPresenter$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.ui.InputtedLegalName;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import squareup.cash.earnings.Earning;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.earnings.EarningsYearMonth;
import squareup.cash.earnings.EarningsYearToDate;

/* loaded from: classes6.dex */
public final class EarningsHeaderPresenter implements MoleculeCallbackPresenter {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object currentMonthFilter;
    public final Object earningsChartRepository;
    public final Object earningsHomeAnalytics;
    public final Object filterOptions;
    public final Object moneyFormatter;
    public final Object nowAtEntry;
    public final Object nowAtEntryDate;
    public final Object stringManager;

    public EarningsHeaderPresenter(EglCore eglCore, AndroidClock androidClock, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, EarningsHomeAnalytics earningsHomeAnalytics) {
        this.earningsChartRepository = eglCore;
        this.stringManager = androidStringManager;
        this.earningsHomeAnalytics = earningsHomeAnalytics;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        Set set = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS;
        LocalDate localDate = Instant.ofEpochMilli(androidClock.millis()).atZone(androidClock.timeZone().toZoneId()).toLocalDate();
        localDate.getClass();
        this.nowAtEntryDate = localDate;
        YearMonth from = YearMonth.from(localDate);
        from.getClass();
        this.nowAtEntry = from;
        this.currentMonthFilter = new DateFilter.Monthly(from.getMonthValue(), from.getYear());
        IntProgression downTo = RangesKt___RangesKt.downTo(2, 0);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(downTo, 10));
        IntProgressionIterator it = downTo.iterator();
        while (it.hasNext) {
            YearMonth minusMonths = from.minusMonths(it.nextInt());
            arrayList.add(new DateFilter.Monthly(minusMonths.getMonthValue(), minusMonths.getYear()));
        }
        this.filterOptions = CollectionsKt.plus((Collection) arrayList, (Object) new DateFilter.Yearly(from.getYear()));
    }

    public Pair[] cdfEventParams$1() {
        AndroidClock androidClock = (AndroidClock) this.earningsHomeAnalytics;
        String str = ((PluginContext) this.nowAtEntry).homeSessionId;
        return str != null ? new Pair[]{new Pair("home_session_id", str), new Pair("occurred_at", String.valueOf(androidClock.millis()))} : new Pair[]{new Pair("occurred_at", String.valueOf(androidClock.millis()))};
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03a9, code lost:
    
        if (r14.month == r5.getMonthValue()) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03c7, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03de, code lost:
    
        if (r2 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x06b1, code lost:
    
        if (r1 == null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03c5, code lost:
    
        if (((com.squareup.cash.datefilterbar.backend.api.DateFilter.Yearly) r11).year == r5) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0750  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.coroutines.Continuation, squareup.cash.earnings.EarningsChartData] */
    /* JADX WARN: Type inference failed for: r1v47 */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiCallbackModel models(Composer composer) {
        long j;
        GapComposer gapComposer;
        Boolean bool;
        boolean z;
        MutableState mutableState;
        ?? r1;
        EarningsTimeFrame earningsTimeFrame;
        YearMonth yearMonth;
        EarningsHeaderPresenter earningsHeaderPresenter;
        MutableState mutableState2;
        EarningsChartData earningsChartData;
        CurrencyCode currencyCode;
        long j2;
        CurrencyCode currencyCode2;
        CurrencyCode currencyCode3;
        boolean z2;
        EmptyList emptyList;
        EarningsHeaderViewModel.HeaderViewModel loaded;
        Money money;
        int i;
        int i2;
        YearMonth yearMonth2;
        Money money2;
        LocalDate localDate;
        int i3;
        LocalDate localDate2;
        List list;
        long j3;
        Long l;
        MutableState mutableState3;
        Object obj;
        int i4 = this.$r8$classId;
        Object obj2 = this.nowAtEntryDate;
        Object obj3 = this.filterOptions;
        Object obj4 = this.earningsChartRepository;
        int i5 = 10;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel = null;
        switch (i4) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                EglCore eglCore = (EglCore) obj4;
                RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) eglCore.eglDisplay;
                DateFilter dateFilter = (DateFilter.Monthly) this.currentMonthFilter;
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-628703679);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(dateFilter);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState4 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState5 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState6 = (MutableState) rememberedValue3;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = FlowKt.distinctUntilChanged(new RealGooglePayer$createWallet$$inlined$filter$1(zzakk.access$homeUiChartStates(realEarningsSyncStateRepository), 12));
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer2, 48, 2);
                EarningsHomeHeader earningsHomeHeader = (EarningsHomeHeader) collectAsState.getValue();
                boolean z3 = earningsHomeHeader != null ? earningsHomeHeader.showsChart : true;
                Boolean valueOf = Boolean.valueOf(z3);
                boolean changed = gapComposer2.changed(z3) | gapComposer2.changedInstance(this);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Continuation continuation = null;
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    boolean z4 = z3;
                    j = 0;
                    gapComposer = gapComposer2;
                    bool = valueOf;
                    InteractiveCardState$animateLock$2 interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(z4, this, mutableState4, continuation, 7);
                    z = z4;
                    mutableState = mutableState4;
                    r1 = 0;
                    gapComposer.updateRememberedValue(interactiveCardState$animateLock$2);
                    rememberedValue5 = interactiveCardState$animateLock$2;
                } else {
                    mutableState = mutableState4;
                    z = z3;
                    j = 0;
                    r1 = 0;
                    gapComposer = gapComposer2;
                    bool = valueOf;
                }
                Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue5);
                if (z) {
                    dateFilter = (DateFilter) mutableState.getValue();
                }
                DateFilter dateFilter2 = dateFilter;
                boolean changed2 = gapComposer.changed(dateFilter2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue6 == neverEqualPolicy) {
                    dateFilter2.getClass();
                    if (dateFilter2 instanceof DateFilter.Monthly) {
                        DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter2;
                        int i6 = monthly.month;
                        int i7 = monthly.year;
                        if (1 <= i6 && i6 < 13) {
                            try {
                                yearMonth = YearMonth.of(i7, i6);
                            } catch (DateTimeException unused) {
                            }
                            if (yearMonth != null) {
                                earningsTimeFrame = new EarningsTimeFrame(new EarningsTimeFrame.TimeFrame.YearMonth(new EarningsYearMonth(Integer.valueOf(i7), Integer.valueOf(i6))));
                                rememberedValue6 = earningsTimeFrame == null ? new AppLockMonitor$special$$inlined$map$2(new EarningsChartResult.Success(r1), 19) : FlowKt.distinctUntilChanged(FlowKt.mapLatest(new EntitySyncerKt$hasSyncedFlow$1(eglCore, r1, 28), FlowKt.distinctUntilChanged(new RealActivityInvitePresenter(i5, zzakk.access$homeUiChartStates(realEarningsSyncStateRepository), dateFilter2, earningsTimeFrame))));
                                gapComposer.updateRememberedValue(rememberedValue6);
                            }
                            earningsTimeFrame = r1;
                            if (earningsTimeFrame == null) {
                            }
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        yearMonth = r1;
                        if (yearMonth != null) {
                        }
                        earningsTimeFrame = r1;
                        if (earningsTimeFrame == null) {
                        }
                        gapComposer.updateRememberedValue(rememberedValue6);
                    } else if (dateFilter2 instanceof DateFilter.Yearly) {
                        earningsTimeFrame = new EarningsTimeFrame(new EarningsTimeFrame.TimeFrame.YearToDate(new EarningsYearToDate(Integer.valueOf(((DateFilter.Yearly) dateFilter2).year))));
                        if (earningsTimeFrame == null) {
                        }
                        gapComposer.updateRememberedValue(rememberedValue6);
                    } else {
                        if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        earningsTimeFrame = r1;
                        if (earningsTimeFrame == null) {
                        }
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                }
                Flow flow = (Flow) rememberedValue6;
                EarningsTimeFrame.TimeFrame timeFrame = r1;
                GapComposer gapComposer3 = gapComposer;
                MutableState collectAsState2 = Updater.collectAsState(flow, EarningsChartResult.Loading.INSTANCE, null, gapComposer3, 0, 2);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    earningsHeaderPresenter = this;
                    mutableState2 = mutableState5;
                    rememberedValue7 = new BankingConfigQueries$$ExternalSyntheticLambda0(earningsHeaderPresenter, mutableState, mutableState2, mutableState6, 15);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                } else {
                    earningsHeaderPresenter = this;
                    mutableState2 = mutableState5;
                }
                Function1 function1 = (Function1) rememberedValue7;
                EarningsChartResult earningsChartResult = (EarningsChartResult) collectAsState2.getValue();
                boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                Resources resources = ((AndroidStringManager) earningsHeaderPresenter.stringManager).resources;
                MoneyFormatter moneyFormatter = (MoneyFormatter) earningsHeaderPresenter.moneyFormatter;
                boolean z5 = earningsChartResult instanceof EarningsChartResult.Loading;
                EarningsHeaderViewModel.HeaderViewModel headerViewModel = EarningsHeaderViewModel.HeaderViewModel.Loading.INSTANCE;
                if (!z5) {
                    if (earningsChartResult instanceof EarningsChartResult.Success) {
                        EarningsChartData earningsChartData2 = ((EarningsChartResult.Success) earningsChartResult).chartData;
                        if (earningsChartData2 != null) {
                            Set set = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS;
                            EarningsTimeFrame earningsTimeFrame2 = earningsChartData2.period;
                            EarningsTimeFrame.TimeFrame timeFrame2 = earningsTimeFrame2 != null ? earningsTimeFrame2.time_frame : timeFrame;
                            if (timeFrame2 instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
                                YearMonth yearMonthOrNull = EarningsHeaderPresenterKt.toYearMonthOrNull(((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame2).value);
                                if (yearMonthOrNull != null && (dateFilter2 instanceof DateFilter.Monthly)) {
                                    DateFilter.Monthly monthly2 = (DateFilter.Monthly) dateFilter2;
                                    if (monthly2.year == yearMonthOrNull.getYear()) {
                                        break;
                                    }
                                }
                            } else if (timeFrame2 instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
                                Integer num = ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame2).value.year;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    if (dateFilter2 instanceof DateFilter.Yearly) {
                                        break;
                                    }
                                }
                            } else if (timeFrame2 != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            if (earningsChartData2 != null || earningsChartData != null) {
                                if (earningsChartData == null) {
                                    currencyCode = EarningsHeaderPresenterKt.currencyCode(earningsChartData);
                                    break;
                                } else {
                                    Set set2 = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS;
                                }
                                currencyCode = CurrencyCode.USD;
                                if (earningsChartData != null || (list = earningsChartData.earnings) == null) {
                                    j2 = j;
                                } else {
                                    Iterator it = list.iterator();
                                    j2 = j;
                                    while (it.hasNext()) {
                                        Money money3 = ((Earning) it.next()).amount;
                                        if (money3 != null) {
                                            if (money3.currency_code != currencyCode) {
                                                money3 = null;
                                            }
                                            if (money3 != null && (l = money3.amount) != null) {
                                                j3 = l.longValue();
                                                j2 += j3;
                                            }
                                        }
                                        j3 = j;
                                        j2 += j3;
                                    }
                                }
                                Money money4 = new Money(Long.valueOf(j2), currencyCode, 4);
                                currencyCode2 = money4.currency_code;
                                if (currencyCode2 == null) {
                                    currencyCode2 = CurrencyCode.USD;
                                }
                                CurrencyCode currencyCode4 = currencyCode2;
                                if (earningsChartData != null || (currencyCode3 = EarningsHeaderPresenterKt.currencyCode(earningsChartData)) == null) {
                                    currencyCode3 = currencyCode4;
                                }
                                String format2 = moneyFormatter.format(money4);
                                Long l2 = money4.amount;
                                long longValue = l2 == null ? l2.longValue() : j;
                                if (!booleanValue) {
                                    Long l3 = money4.amount;
                                    if ((l3 != null ? l3.longValue() : j) > j) {
                                        z2 = true;
                                        if (earningsChartData != null) {
                                            LocalDate localDate3 = (LocalDate) obj2;
                                            Set set3 = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS;
                                            EarningsTimeFrame earningsTimeFrame3 = earningsChartData.period;
                                            List<Earning> list2 = earningsChartData.earnings;
                                            EarningsTimeFrame.TimeFrame timeFrame3 = earningsTimeFrame3 != null ? earningsTimeFrame3.time_frame : null;
                                            if (timeFrame3 instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
                                                YearMonth yearMonthOrNull2 = EarningsHeaderPresenterKt.toYearMonthOrNull(((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame3).value);
                                                if (yearMonthOrNull2 == null) {
                                                    emptyList = EmptyList.INSTANCE;
                                                    break;
                                                } else {
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    Iterator it2 = list2.iterator();
                                                    while (it2.hasNext()) {
                                                        Earning earning = (Earning) it2.next();
                                                        Integer num2 = earning.day;
                                                        if (num2 != null) {
                                                            int intValue2 = num2.intValue();
                                                            Integer num3 = earning.year;
                                                            int intValue3 = num3 != null ? num3.intValue() : yearMonthOrNull2.getYear();
                                                            Iterator it3 = it2;
                                                            Integer num4 = earning.month;
                                                            try {
                                                                localDate2 = LocalDate.of(intValue3, num4 != null ? num4.intValue() : yearMonthOrNull2.getMonthValue(), intValue2);
                                                            } catch (DateTimeException unused2) {
                                                                localDate2 = null;
                                                            }
                                                            if (localDate2 != null) {
                                                                linkedHashMap.put(localDate2, earning);
                                                            }
                                                            it2 = it3;
                                                        }
                                                    }
                                                    IntRange intRange = new IntRange(1, yearMonthOrNull2.lengthOfMonth(), 1);
                                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                                                    IntProgressionIterator it4 = intRange.iterator();
                                                    while (it4.hasNext) {
                                                        int nextInt = it4.nextInt();
                                                        LocalDate atDay = yearMonthOrNull2.atDay(nextInt);
                                                        YearMonth yearMonth3 = yearMonthOrNull2;
                                                        Earning earning2 = (Earning) linkedHashMap.get(atDay);
                                                        if (earning2 == null || (money2 = earning2.amount) == null) {
                                                            atDay.getClass();
                                                            if (atDay.isAfter(localDate3)) {
                                                                localDate = localDate3;
                                                                money2 = null;
                                                            } else {
                                                                localDate = localDate3;
                                                                i3 = 4;
                                                                money2 = new Money((Long) 0L, currencyCode3, 4);
                                                                Money money5 = money2;
                                                                if (money2 == null) {
                                                                    money2 = new Money((Long) 0L, currencyCode3, i3);
                                                                }
                                                                String format3 = moneyFormatter.format(money2);
                                                                String valueOf2 = String.valueOf(nextInt);
                                                                DateTimeFormatter dateTimeFormatter = EarningsHeaderPresenterKt.DAY_DISPLAY_FORMATTER;
                                                                String format4 = dateTimeFormatter.format(atDay);
                                                                format4.getClass();
                                                                IntProgressionIterator intProgressionIterator = it4;
                                                                boolean contains = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS.contains(Integer.valueOf(nextInt));
                                                                long chartValue = EarningsHeaderPresenterKt.getChartValue(money5);
                                                                EarningsBarViewModel.Color color = money5 != null ? EarningsBarViewModel.Color.FUTURE : EarningsHeaderPresenterKt.getChartValue(money5) == j ? EarningsBarViewModel.Color.DISABLED : EarningsBarViewModel.Color.ACTIVE;
                                                                String format5 = dateTimeFormatter.format(atDay);
                                                                format5.getClass();
                                                                format3.getClass();
                                                                resources.getClass();
                                                                String format6 = new MessageFormat(resources.getString(R.string.earnings_monthly_graph_bar_content_description)).format(new Object[]{format3, format5});
                                                                format6.getClass();
                                                                arrayList2.add(new EarningsBarViewModel(valueOf2, contains, chartValue, color, format4, format3, format6));
                                                                yearMonthOrNull2 = yearMonth3;
                                                                localDate3 = localDate;
                                                                it4 = intProgressionIterator;
                                                            }
                                                        } else {
                                                            localDate = localDate3;
                                                        }
                                                        i3 = 4;
                                                        Money money52 = money2;
                                                        if (money2 == null) {
                                                        }
                                                        String format32 = moneyFormatter.format(money2);
                                                        String valueOf22 = String.valueOf(nextInt);
                                                        DateTimeFormatter dateTimeFormatter2 = EarningsHeaderPresenterKt.DAY_DISPLAY_FORMATTER;
                                                        String format42 = dateTimeFormatter2.format(atDay);
                                                        format42.getClass();
                                                        IntProgressionIterator intProgressionIterator2 = it4;
                                                        boolean contains2 = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS.contains(Integer.valueOf(nextInt));
                                                        long chartValue2 = EarningsHeaderPresenterKt.getChartValue(money52);
                                                        EarningsBarViewModel.Color color2 = money52 != null ? EarningsBarViewModel.Color.FUTURE : EarningsHeaderPresenterKt.getChartValue(money52) == j ? EarningsBarViewModel.Color.DISABLED : EarningsBarViewModel.Color.ACTIVE;
                                                        String format52 = dateTimeFormatter2.format(atDay);
                                                        format52.getClass();
                                                        format32.getClass();
                                                        resources.getClass();
                                                        String format62 = new MessageFormat(resources.getString(R.string.earnings_monthly_graph_bar_content_description)).format(new Object[]{format32, format52});
                                                        format62.getClass();
                                                        arrayList2.add(new EarningsBarViewModel(valueOf22, contains2, chartValue2, color2, format42, format32, format62));
                                                        yearMonthOrNull2 = yearMonth3;
                                                        localDate3 = localDate;
                                                        it4 = intProgressionIterator2;
                                                    }
                                                    emptyList = arrayList2;
                                                    break;
                                                }
                                            } else if (timeFrame3 instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
                                                Integer num5 = ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame3).value.year;
                                                if (num5 != null) {
                                                    int intValue4 = num5.intValue();
                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                    for (Earning earning3 : list2) {
                                                        Integer num6 = earning3.month;
                                                        if (num6 != null) {
                                                            int intValue5 = num6.intValue();
                                                            Integer num7 = earning3.year;
                                                            try {
                                                                yearMonth2 = YearMonth.of(num7 != null ? num7.intValue() : intValue4, intValue5);
                                                            } catch (DateTimeException unused3) {
                                                                yearMonth2 = null;
                                                            }
                                                            if (yearMonth2 != null) {
                                                                linkedHashMap2.put(yearMonth2, earning3);
                                                            }
                                                        }
                                                    }
                                                    IntRange intRange2 = new IntRange(1, 12, 1);
                                                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10));
                                                    IntProgressionIterator it5 = intRange2.iterator();
                                                    while (it5.hasNext) {
                                                        int nextInt2 = it5.nextInt();
                                                        YearMonth of = YearMonth.of(intValue4, nextInt2);
                                                        Earning earning4 = (Earning) linkedHashMap2.get(of);
                                                        if (earning4 == null || (money = earning4.amount) == null) {
                                                            of.getClass();
                                                            if (of.isAfter(YearMonth.from(localDate3))) {
                                                                i = intValue4;
                                                                i2 = 4;
                                                                money = null;
                                                            } else {
                                                                i = intValue4;
                                                                i2 = 4;
                                                                money = new Money((Long) 0L, currencyCode3, 4);
                                                            }
                                                        } else {
                                                            i = intValue4;
                                                            i2 = 4;
                                                        }
                                                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                                        String format7 = moneyFormatter.format(money == null ? new Money((Long) 0L, currencyCode3, i2) : money);
                                                        String format8 = EarningsHeaderPresenterKt.MONTH_SHORT_DISPLAY_FORMATTER.format(of);
                                                        format8.getClass();
                                                        DateTimeFormatter dateTimeFormatter3 = EarningsHeaderPresenterKt.MONTH_DISPLAY_FORMATTER;
                                                        String format9 = dateTimeFormatter3.format(of);
                                                        format9.getClass();
                                                        MoneyFormatter moneyFormatter2 = moneyFormatter;
                                                        boolean contains3 = EarningsHeaderPresenterKt.MONTHLY_VISIBLE_LABELS.contains(Integer.valueOf(nextInt2));
                                                        long chartValue3 = EarningsHeaderPresenterKt.getChartValue(money);
                                                        EarningsBarViewModel.Color color3 = money == null ? EarningsBarViewModel.Color.FUTURE : EarningsHeaderPresenterKt.getChartValue(money) == j ? EarningsBarViewModel.Color.DISABLED : EarningsBarViewModel.Color.ACTIVE;
                                                        String format10 = dateTimeFormatter3.format(of);
                                                        format10.getClass();
                                                        format7.getClass();
                                                        resources.getClass();
                                                        String format11 = new MessageFormat(resources.getString(R.string.earnings_ytd_graph_bar_content_description)).format(new Object[]{format7, format10});
                                                        format11.getClass();
                                                        arrayList3.add(new EarningsBarViewModel(format8, contains3, chartValue3, color3, format9, format7, format11));
                                                        linkedHashMap2 = linkedHashMap3;
                                                        intValue4 = i;
                                                        moneyFormatter = moneyFormatter2;
                                                    }
                                                    emptyList = arrayList3;
                                                    break;
                                                } else {
                                                    emptyList = EmptyList.INSTANCE;
                                                    break;
                                                }
                                            } else if (timeFrame3 == null) {
                                                emptyList = EmptyList.INSTANCE;
                                                break;
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                        }
                                        emptyList = EmptyList.INSTANCE;
                                        EmptyList emptyList2 = emptyList;
                                        String str = "";
                                        if (earningsChartData != null) {
                                            Set set4 = EarningsHeaderPresenterKt.DAILY_VISIBLE_LABELS;
                                            EarningsTimeFrame earningsTimeFrame4 = earningsChartData.period;
                                            EarningsTimeFrame.TimeFrame timeFrame4 = earningsTimeFrame4 != null ? earningsTimeFrame4.time_frame : null;
                                            if (timeFrame4 instanceof EarningsTimeFrame.TimeFrame.YearMonth) {
                                                YearMonth yearMonthOrNull3 = EarningsHeaderPresenterKt.toYearMonthOrNull(((EarningsTimeFrame.TimeFrame.YearMonth) timeFrame4).value);
                                                if (yearMonthOrNull3 != null) {
                                                    String format12 = EarningsHeaderPresenterKt.MONTH_DISPLAY_FORMATTER.format(yearMonthOrNull3);
                                                    format12.getClass();
                                                    resources.getClass();
                                                    str = new MessageFormat(resources.getString(R.string.earnings_monthly_graph_content_description)).format(new Object[]{format12});
                                                    str.getClass();
                                                }
                                            } else if (timeFrame4 instanceof EarningsTimeFrame.TimeFrame.YearToDate) {
                                                Integer num8 = ((EarningsTimeFrame.TimeFrame.YearToDate) timeFrame4).value.year;
                                                if (num8 != null) {
                                                    String valueOf3 = String.valueOf(num8.intValue());
                                                    valueOf3.getClass();
                                                    resources.getClass();
                                                    str = new MessageFormat(resources.getString(R.string.earnings_ytd_graph_content_description)).format(new Object[]{valueOf3});
                                                    str.getClass();
                                                }
                                            } else if (timeFrame4 != null) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                        }
                                        loaded = new EarningsHeaderViewModel.HeaderViewModel.Loaded(format2, longValue, currencyCode4, z2, emptyList2, currencyCode3, str);
                                        int lastIndexOf = arrayList.lastIndexOf(dateFilter2);
                                        DateFilterBarViewModel dateFilterBarViewModel = new DateFilterBarViewModel(arrayList, lastIndexOf < 0 ? Integer.valueOf(lastIndexOf) : null);
                                        EarningsHomeHeader earningsHomeHeader2 = (EarningsHomeHeader) collectAsState.getValue();
                                        UiCallbackModel uiCallbackModel = new UiCallbackModel(function1, new EarningsHeaderViewModel(loaded, dateFilterBarViewModel, dateFilter2, earningsHomeHeader2 == null ? earningsHomeHeader2.title : null, z));
                                        gapComposer3.end(false);
                                        return uiCallbackModel;
                                    }
                                }
                                z2 = false;
                                if (earningsChartData != null) {
                                }
                                emptyList = EmptyList.INSTANCE;
                                EmptyList emptyList22 = emptyList;
                                String str2 = "";
                                if (earningsChartData != null) {
                                }
                                loaded = new EarningsHeaderViewModel.HeaderViewModel.Loaded(format2, longValue, currencyCode4, z2, emptyList22, currencyCode3, str2);
                                int lastIndexOf2 = arrayList.lastIndexOf(dateFilter2);
                                DateFilterBarViewModel dateFilterBarViewModel2 = new DateFilterBarViewModel(arrayList, lastIndexOf2 < 0 ? Integer.valueOf(lastIndexOf2) : null);
                                EarningsHomeHeader earningsHomeHeader22 = (EarningsHomeHeader) collectAsState.getValue();
                                UiCallbackModel uiCallbackModel2 = new UiCallbackModel(function1, new EarningsHeaderViewModel(loaded, dateFilterBarViewModel2, dateFilter2, earningsHomeHeader22 == null ? earningsHomeHeader22.title : null, z));
                                gapComposer3.end(false);
                                return uiCallbackModel2;
                            }
                        }
                        earningsChartData = null;
                        if (earningsChartData2 != null) {
                        }
                        if (earningsChartData == null) {
                        }
                        currencyCode = CurrencyCode.USD;
                        if (earningsChartData != null) {
                        }
                        j2 = j;
                        Money money42 = new Money(Long.valueOf(j2), currencyCode, 4);
                        currencyCode2 = money42.currency_code;
                        if (currencyCode2 == null) {
                        }
                        CurrencyCode currencyCode42 = currencyCode2;
                        if (earningsChartData != null) {
                        }
                        currencyCode3 = currencyCode42;
                        String format22 = moneyFormatter.format(money42);
                        Long l22 = money42.amount;
                        if (l22 == null) {
                        }
                        if (!booleanValue) {
                        }
                        z2 = false;
                        if (earningsChartData != null) {
                        }
                        emptyList = EmptyList.INSTANCE;
                        EmptyList emptyList222 = emptyList;
                        String str22 = "";
                        if (earningsChartData != null) {
                        }
                        loaded = new EarningsHeaderViewModel.HeaderViewModel.Loaded(format22, longValue, currencyCode42, z2, emptyList222, currencyCode3, str22);
                        int lastIndexOf22 = arrayList.lastIndexOf(dateFilter2);
                        DateFilterBarViewModel dateFilterBarViewModel22 = new DateFilterBarViewModel(arrayList, lastIndexOf22 < 0 ? Integer.valueOf(lastIndexOf22) : null);
                        EarningsHomeHeader earningsHomeHeader222 = (EarningsHomeHeader) collectAsState.getValue();
                        UiCallbackModel uiCallbackModel22 = new UiCallbackModel(function1, new EarningsHeaderViewModel(loaded, dateFilterBarViewModel22, dateFilter2, earningsHomeHeader222 == null ? earningsHomeHeader222.title : null, z));
                        gapComposer3.end(false);
                        return uiCallbackModel22;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                loaded = headerViewModel;
                int lastIndexOf222 = arrayList.lastIndexOf(dateFilter2);
                DateFilterBarViewModel dateFilterBarViewModel222 = new DateFilterBarViewModel(arrayList, lastIndexOf222 < 0 ? Integer.valueOf(lastIndexOf222) : null);
                EarningsHomeHeader earningsHomeHeader2222 = (EarningsHomeHeader) collectAsState.getValue();
                UiCallbackModel uiCallbackModel222 = new UiCallbackModel(function1, new EarningsHeaderViewModel(loaded, dateFilterBarViewModel222, dateFilter2, earningsHomeHeader2222 == null ? earningsHomeHeader2222.title : null, z));
                gapComposer3.end(false);
                return uiCallbackModel222;
            case 1:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-1359250418);
                boolean changed3 = gapComposer4.changed(((PluginContext) this.nowAtEntry).homeSessionId);
                Object rememberedValue8 = gapComposer4.rememberedValue();
                if (changed3 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new LinkedHashSet();
                    gapComposer4.updateRememberedValue(rememberedValue8);
                }
                MutableState rememberUpdatedState = Updater.rememberUpdatedState((Set) rememberedValue8, gapComposer4);
                PromptSuggestions promptSuggestions = (PromptSuggestions) obj2;
                ArrayList<PromptSuggestion> arrayList4 = promptSuggestions.suggestions;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                for (PromptSuggestion promptSuggestion : arrayList4) {
                    String str3 = promptSuggestions.suggestionsId;
                    String uuid = promptSuggestion.clientId.toString();
                    uuid.getClass();
                    String str4 = promptSuggestion.label;
                    String str5 = promptSuggestion.body;
                    SuggestionListViewEvent.SuggestionTapped suggestionTapped = new SuggestionListViewEvent.SuggestionTapped(promptSuggestion.prompt, str3, uuid, promptSuggestion.tapCdfEvents);
                    List list3 = promptSuggestion.viewCdfEvents;
                    arrayList5.add(new SuggestionListViewModel.HomeWidgetSuggestion(str4, str5, suggestionTapped, !list3.isEmpty() ? new SuggestionListViewEvent.SuggestionRendered(uuid, list3) : null));
                }
                SuggestionListViewModel suggestionListViewModel = new SuggestionListViewModel(arrayList5);
                boolean changedInstance = gapComposer4.changedInstance(this) | gapComposer4.changed(rememberUpdatedState);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new MusicViewKt$$ExternalSyntheticLambda6(6, this, rememberUpdatedState);
                    gapComposer4.updateRememberedValue(rememberedValue9);
                }
                UiCallbackModel uiCallbackModel3 = new UiCallbackModel((Function1) rememberedValue9, suggestionListViewModel);
                gapComposer4.end(false);
                return uiCallbackModel3;
            default:
                SyncValueReader syncValueReader = (SyncValueReader) obj4;
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(871585066);
                Object rememberedValue10 = gapComposer5.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = ((RealAddressManager) this.earningsHomeAnalytics).address();
                    gapComposer5.updateRememberedValue(rememberedValue10);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer5, 48, 2);
                Object rememberedValue11 = gapComposer5.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.InputtedLegalName);
                    gapComposer5.updateRememberedValue(rememberedValue11);
                }
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue11, null, gapComposer5, 1);
                Object rememberedValue12 = gapComposer5.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    rememberedValue12 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.PersonalInfoCtaBanner);
                    gapComposer5.updateRememberedValue(rememberedValue12);
                }
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue12, null, gapComposer5, 1);
                MutableSharedFlow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer5);
                IdentityVerificationSectionViewModel identityVerificationSectionViewModel = (IdentityVerificationSectionViewModel) ((TaxReturnsPresenter) obj3).models((Flow) rememberSharedViewEvents, (Composer) gapComposer5, 0);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    mutableState3 = collectAsState3;
                    obj = new OpenSourceKt$$ExternalSyntheticLambda9(this, rememberSharedViewEvents, mutableState3, collectAsState4, 3);
                    gapComposer5.updateRememberedValue(obj);
                } else {
                    mutableState3 = collectAsState3;
                    obj = rememberedValue13;
                }
                Function1 function12 = (Function1) obj;
                GlobalAddress globalAddress = (GlobalAddress) mutableState3.getValue();
                InputtedLegalName inputtedLegalName = (InputtedLegalName) collectAsState4.getValue();
                PersonalInfoCTABanner personalInfoCTABanner = (PersonalInfoCTABanner) collectAsState5.getValue();
                ArrayList arrayList6 = new ArrayList();
                if ((identityVerificationSectionViewModel instanceof IdentityVerificationSectionViewModel.Content ? (IdentityVerificationSectionViewModel.Content) identityVerificationSectionViewModel : null) != null) {
                    arrayList6.add(new PersonalInfoRow.IdentityVerification((IdentityVerificationSectionViewModel.Content) identityVerificationSectionViewModel));
                }
                if (inputtedLegalName != null) {
                    String str6 = inputtedLegalName.inputted_legal_name;
                    str6.getClass();
                    arrayList6.add(new PersonalInfoRow.LegalName(str6));
                }
                arrayList6.add(new PersonalInfoRow.Address(AddressKt.buildAsString(globalAddress, false)));
                if (personalInfoCTABanner != null) {
                    String str7 = personalInfoCTABanner.banner_title;
                    str7.getClass();
                    String str8 = personalInfoCTABanner.banner_subtitle;
                    str8.getClass();
                    String str9 = personalInfoCTABanner.banner_primary_button_cta;
                    str9.getClass();
                    personalInfoConfirmationViewModel = new PersonalInfoConfirmationViewModel(str7, str8, str9);
                }
                UiCallbackModel uiCallbackModel4 = new UiCallbackModel(function12, new PersonalInfoSectionViewModel(personalInfoConfirmationViewModel, arrayList6));
                gapComposer5.end(false);
                return uiCallbackModel4;
        }
    }

    public EarningsHeaderPresenter(ChatManager chatManager, RealMoneybotAnalyticsService realMoneybotAnalyticsService, AndroidClock androidClock, CoroutineScope coroutineScope, PromptSuggestions promptSuggestions, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.earningsChartRepository = chatManager;
        this.stringManager = realMoneybotAnalyticsService;
        this.earningsHomeAnalytics = androidClock;
        this.moneyFormatter = coroutineScope;
        this.nowAtEntryDate = promptSuggestions;
        this.nowAtEntry = pluginContext;
        this.currentMonthFilter = screenNavigator;
        this.filterOptions = function2;
    }

    public EarningsHeaderPresenter(SyncValueReader syncValueReader, RealRouter$Factory$Impl realRouter$Factory$Impl, FlowStarter flowStarter, RealAddressManager realAddressManager, Analytics analytics, ProfileScreens.AccountInfoScreen accountInfoScreen, BetterNavigator.ScreenNavigator screenNavigator, RealIdentityVerificationPresenter$Factory$Impl realIdentityVerificationPresenter$Factory$Impl) {
        accountInfoScreen.getClass();
        this.earningsChartRepository = syncValueReader;
        this.stringManager = flowStarter;
        this.earningsHomeAnalytics = realAddressManager;
        this.moneyFormatter = analytics;
        this.nowAtEntryDate = accountInfoScreen;
        this.nowAtEntry = screenNavigator;
        this.currentMonthFilter = realRouter$Factory$Impl.create$1(screenNavigator);
        LimitsInlineMessagePresenter$MetroFactory limitsInlineMessagePresenter$MetroFactory = realIdentityVerificationPresenter$Factory$Impl.delegateFactory;
        Analytics analytics2 = (Analytics) limitsInlineMessagePresenter$MetroFactory.appService.getValue();
        RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) limitsInlineMessagePresenter$MetroFactory.limitsPageletStore.invoke();
        RealIdentityVerificationBadger realIdentityVerificationBadger = (RealIdentityVerificationBadger) limitsInlineMessagePresenter$MetroFactory.routerFactory.invoke();
        RealIdentityVerificationRepo realIdentityVerificationRepo = (RealIdentityVerificationRepo) limitsInlineMessagePresenter$MetroFactory.lastSeenPageletVersion.invoke();
        analytics2.getClass();
        realBlockersHelper$Factory$Impl.getClass();
        realIdentityVerificationBadger.getClass();
        realIdentityVerificationRepo.getClass();
        this.filterOptions = new TaxReturnsPresenter(analytics2, realBlockersHelper$Factory$Impl, realIdentityVerificationBadger, realIdentityVerificationRepo, screenNavigator);
    }
}
