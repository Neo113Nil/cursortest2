package com.squareup.cash.payments.presenters;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.Size;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.BadgeSpacing;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentSelectorManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.viewmodels.RecipientSuggestionRowViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.android.widget.ImageSpan;
import com.squareup.util.cash.Bps;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class QuickPayPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppConfigManager appConfigManager;
    public final PaymentScreens.QuickPay args;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final FlowStarter flowStarter;
    public final RealInstrumentManager instrumentManager;
    public final RealInstrumentSelectorManager instrumentSelectorManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNetworkInfo networkInfo;
    public final MoneyFormatter noSymbolMoneyFormatter;
    public final RealPaymentInitiator paymentInitiator;
    public final RealPersonalizePaymentManager personalizePaymentManager;
    public final String personalizedPaymentFlowToken;
    public final RealProfileManager profileManager;
    public final Lazy quickPaySettings;
    public final RealRecipientRepository recipientRepository;
    public final Lazy recipientSuggestionRowViewModelFactory;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final RealStatusAndLimitsManager statusAndLimitsManager;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelectPaymentInstrumentResult.Status.values().length];
            try {
                SelectPaymentInstrumentResult.Status status = SelectPaymentInstrumentResult.Status.SUCCESS;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectPaymentInstrumentResult.Status status2 = SelectPaymentInstrumentResult.Status.SUCCESS;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Orientation.values().length];
            try {
                iArr2[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public QuickPayPresenter(Analytics analytics, RealPaymentInitiator realPaymentInitiator, FlowStarter flowStarter, AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AppConfigManager appConfigManager, Lazy lazy, RealProfileManager realProfileManager, RealStatusAndLimitsManager realStatusAndLimitsManager, LocalizedMoneyFormatter.Factory factory, RealPersonalizePaymentManager realPersonalizePaymentManager, RealNetworkInfo realNetworkInfo, Lazy lazy2, RealInstrumentSelectorManager realInstrumentSelectorManager, SecuritySignalsAggregator securitySignalsAggregator, RealRecipientRepository realRecipientRepository, RealUuidGenerator realUuidGenerator, PaymentScreens.QuickPay quickPay, BetterNavigator.ScreenNavigator screenNavigator) {
        quickPay.getClass();
        this.analytics = analytics;
        this.paymentInitiator = realPaymentInitiator;
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.appConfigManager = appConfigManager;
        this.recipientSuggestionRowViewModelFactory = lazy;
        this.profileManager = realProfileManager;
        this.statusAndLimitsManager = realStatusAndLimitsManager;
        this.personalizePaymentManager = realPersonalizePaymentManager;
        this.networkInfo = realNetworkInfo;
        this.quickPaySettings = lazy2;
        this.instrumentSelectorManager = realInstrumentSelectorManager;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.recipientRepository = realRecipientRepository;
        this.args = quickPay;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.noSymbolMoneyFormatter = factory.createNoSymbolCompact();
        this.personalizedPaymentFlowToken = re$$ExternalSyntheticOutline0.m();
    }

    public static SelectPaymentInstrumentOption.ExistingOption getSelectedInstrument(QuickPayState quickPayState) {
        DecimalFormat decimalFormat = Bps.DISPLAY_FORMAT;
        Money money = quickPayState.amount;
        InstrumentLinkingConfig instrumentLinkingConfig = quickPayState.instrumentLinkingConfig;
        instrumentLinkingConfig.getClass();
        long j = instrumentLinkingConfig.credit_card_fee_bps;
        money.getClass();
        Long l = money.amount;
        l.getClass();
        return GoogleMapKt.normalizeInstrumentSelection$default(quickPayState.orientation, null, quickPayState.selectedInstrumentToken, GoogleMapKt.getExistingInstruments(Moneys.times(quickPayState.amount, quickPayState.paymentGetters.size()), new Money(Long.valueOf(Bps.applyFee(false, l.longValue(), j)), money.currency_code, 4), quickPayState.balanceSnapshot, quickPayState.instruments, quickPayState.instrumentLinkingConfig, quickPayState.hasPassedIdv, quickPayState.countryCode, false), 18);
    }

    public final PaymentInitiatorData createPaymentInitiatorData$presenters(QuickPayState quickPayState, List list, BlockersData.MoneybotContext moneybotContext) {
        InstrumentSelectionData instrumentSelectionData;
        Triple triple;
        quickPayState.getClass();
        list.getClass();
        SelectPaymentInstrumentOption.ExistingOption selectedInstrument = getSelectedInstrument(quickPayState);
        String str = quickPayState.note;
        Orientation orientation = quickPayState.orientation;
        List list2 = quickPayState.paymentGetters;
        Money money = quickPayState.amount;
        if (selectedInstrument != null) {
            if (selectedInstrument instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                triple = new Triple(((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) selectedInstrument).balance.token, null, CashInstrumentType.CASH_BALANCE);
            } else {
                if (!(selectedInstrument instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Instrument instrument = ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) selectedInstrument).instrument;
                triple = new Triple(instrument.token, instrument.cardBrand, instrument.cashInstrumentType);
            }
            instrumentSelectionData = new InstrumentSelectionData((String) triple.first, (InstrumentType) triple.second, (CashInstrumentType) triple.third, quickPayState.acceptedFee);
        } else {
            instrumentSelectionData = null;
        }
        boolean z = quickPayState.ignoreDuplicate;
        PaymentScreens.QuickPay quickPay = this.args;
        return new PaymentInitiatorData(str, orientation, list2, money, instrumentSelectionData, z, quickPay.analytics.externalPaymentId, this.securitySignalsAggregator.buildSignalsContext(list), quickPay.referrer, quickPay.launchUrl, quickPay.appCreationActivity, null, null, null, null, null, moneybotContext, null, null, null, null, null, 16644096);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0709  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        Continuation continuation2;
        Object obj;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Object quickPayPresenter$models$3$1;
        PaymentScreens.QuickPay quickPay;
        Object[] objArr;
        GapComposer gapComposer;
        Object obj2;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        String format2;
        QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel;
        String str;
        Object ready;
        Iterator it;
        Orientation orientation;
        String str2;
        String str3;
        String str4;
        CharSequence charSequence;
        String str5;
        CharSequence charSequence2;
        RecipientSuggestionRowViewModel recipientSuggestionRowViewModel;
        int i2;
        int i3;
        Versioned versioned;
        long j;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1775817405);
        final int i4 = 0;
        Object[] objArr2 = new Object[0];
        Object rememberedValue = gapComposer2.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue == obj3) {
            rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda0(17);
            gapComposer2.updateRememberedValue(rememberedValue);
        }
        Object obj4 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue, gapComposer2, 48);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer2.changedInstance(this) | gapComposer2.changed(obj4);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (changedInstance || rememberedValue2 == obj3) {
            rememberedValue2 = new MainPaymentView$Content$2$1(this, obj4, null, 20);
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
        Object[] objArr3 = new Object[0];
        Object rememberedValue3 = gapComposer2.rememberedValue();
        if (rememberedValue3 == obj3) {
            rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda0(18);
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        Object obj5 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer2, 48);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        PaymentScreens.QuickPay quickPay2 = this.args;
        final int i5 = 1;
        if (rememberedValue4 == obj3) {
            rememberedValue4 = Updater.mutableStateOf$default(new PersonalizePaymentEntrypointButtonViewModel(quickPay2.orientation == Orientation.CASH, (this.personalizePaymentManager.context.getResources().getConfiguration().uiMode & 48) == 32 ? R.raw.personalization_anim_dark : R.raw.personalization_anim_light));
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState7 = (MutableState) rememberedValue4;
        Object[] objArr4 = new Object[0];
        boolean changedInstance2 = gapComposer2.changedInstance(this);
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (changedInstance2 || rememberedValue5 == obj3) {
            rememberedValue5 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.QuickPayPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ QuickPayPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = i4;
                    QuickPayPresenter quickPayPresenter = this.f$0;
                    switch (i6) {
                        case 0:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.amount);
                        case 1:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.note.getValue());
                        case 2:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.paymentGetters);
                        default:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.orientation);
                    }
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue5, gapComposer2, 0);
        Object[] objArr5 = new Object[0];
        boolean changedInstance3 = gapComposer2.changedInstance(this);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (changedInstance3 || rememberedValue6 == obj3) {
            rememberedValue6 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.QuickPayPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ QuickPayPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = i5;
                    QuickPayPresenter quickPayPresenter = this.f$0;
                    switch (i6) {
                        case 0:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.amount);
                        case 1:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.note.getValue());
                        case 2:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.paymentGetters);
                        default:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.orientation);
                    }
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue6, gapComposer2, 0);
        Object[] objArr6 = new Object[0];
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (rememberedValue7 == obj3) {
            rememberedValue7 = new MainPaymentViewKt$$ExternalSyntheticLambda0(19);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState10 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue7, gapComposer2, 48);
        Object[] objArr7 = new Object[0];
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == obj3) {
            rememberedValue8 = new MainPaymentViewKt$$ExternalSyntheticLambda0(20);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr7, (Function0) rememberedValue8, gapComposer2, 48);
        Object[] objArr8 = new Object[0];
        boolean changedInstance4 = gapComposer2.changedInstance(this);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        final int i6 = 2;
        if (changedInstance4 || rememberedValue9 == obj3) {
            rememberedValue9 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.QuickPayPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ QuickPayPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i62 = i6;
                    QuickPayPresenter quickPayPresenter = this.f$0;
                    switch (i62) {
                        case 0:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.amount);
                        case 1:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.note.getValue());
                        case 2:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.paymentGetters);
                        default:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.orientation);
                    }
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr8, (Function0) rememberedValue9, gapComposer2, 0);
        Object[] objArr9 = new Object[0];
        boolean changedInstance5 = gapComposer2.changedInstance(this);
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (changedInstance5 || rememberedValue10 == obj3) {
            final int i7 = 3;
            rememberedValue10 = new Function0(this) { // from class: com.squareup.cash.payments.presenters.QuickPayPresenter$$ExternalSyntheticLambda2
                public final /* synthetic */ QuickPayPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i62 = i7;
                    QuickPayPresenter quickPayPresenter = this.f$0;
                    switch (i62) {
                        case 0:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.amount);
                        case 1:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.note.getValue());
                        case 2:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.paymentGetters);
                        default:
                            return Updater.mutableStateOf$default(quickPayPresenter.args.orientation);
                    }
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr9, (Function0) rememberedValue10, gapComposer2, 0);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        if (rememberedValue11 == obj3) {
            Money money = (Money) mutableState8.getValue();
            String str6 = (String) mutableState9.getValue();
            List list = (List) mutableState12.getValue();
            Orientation orientation2 = (Orientation) mutableState13.getValue();
            PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = (PersonalizePaymentEntrypointButtonViewModel) mutableState7.getValue();
            continuation = null;
            Versioned versioned2 = new Versioned(Boolean.FALSE, 0);
            String str7 = (String) mutableState10.getValue();
            Money money2 = (Money) mutableState11.getValue();
            Region region = Region.USA;
            EmptyList emptyList = EmptyList.INSTANCE;
            Long l = money.amount;
            if (l != null) {
                versioned = versioned2;
                j = l.longValue();
            } else {
                versioned = versioned2;
                j = 0;
            }
            rememberedValue11 = Updater.mutableStateOf$default(new QuickPayState(true, money, orientation2, region, false, money2, str6, versioned, null, emptyList, null, null, null, false, str7, ((double) j) < Moneys.displayDivisor(money.currency_code), list, personalizePaymentEntrypointButtonViewModel));
            gapComposer2.updateRememberedValue(rememberedValue11);
        } else {
            continuation = null;
        }
        MutableState mutableState14 = (MutableState) rememberedValue11;
        mutableState8.setValue(((QuickPayState) mutableState14.getValue()).amount);
        mutableState9.setValue(((QuickPayState) mutableState14.getValue()).note);
        mutableState10.setValue(((QuickPayState) mutableState14.getValue()).selectedInstrumentToken);
        mutableState11.setValue(((QuickPayState) mutableState14.getValue()).acceptedFee);
        mutableState12.setValue(((QuickPayState) mutableState14.getValue()).paymentGetters);
        mutableState13.setValue(((QuickPayState) mutableState14.getValue()).orientation);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        if (rememberedValue12 == obj3) {
            rememberedValue12 = Updater.mutableStateOf$default(continuation);
            gapComposer2.updateRememberedValue(rememberedValue12);
        }
        MutableState mutableState15 = (MutableState) rememberedValue12;
        boolean changedInstance6 = gapComposer2.changedInstance(this);
        Object rememberedValue13 = gapComposer2.rememberedValue();
        if (changedInstance6 || rememberedValue13 == obj3) {
            continuation2 = continuation;
            rememberedValue13 = new QuickPayPresenter$models$2$1(this, mutableState15, mutableState14, continuation2);
            gapComposer2.updateRememberedValue(rememberedValue13);
        } else {
            continuation2 = continuation;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue13);
        Object rememberedValue14 = gapComposer2.rememberedValue();
        if (rememberedValue14 == obj3) {
            rememberedValue14 = Updater.mutableStateOf$default(continuation2);
            gapComposer2.updateRememberedValue(rememberedValue14);
        }
        MutableState mutableState16 = (MutableState) rememberedValue14;
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (rememberedValue15 == obj3) {
            rememberedValue15 = Updater.mutableStateOf$default(new InstrumentSelection("", new Money((Long) 0L, CurrencyCode.BTC, 4), (CashInstrumentType) null, 12));
            gapComposer2.updateRememberedValue(rememberedValue15);
        }
        MutableState mutableState17 = (MutableState) rememberedValue15;
        Object rememberedValue16 = gapComposer2.rememberedValue();
        if (rememberedValue16 == obj3) {
            rememberedValue16 = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
            gapComposer2.updateRememberedValue(rememberedValue16);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer2, 48, 2);
        Object rememberedValue17 = gapComposer2.rememberedValue();
        if (rememberedValue17 == obj3) {
            rememberedValue17 = this.statusAndLimitsManager.hasPassedIdv();
            gapComposer2.updateRememberedValue(rememberedValue17);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer2, 48, 2);
        Object rememberedValue18 = gapComposer2.rememberedValue();
        Lazy lazy = this.quickPaySettings;
        if (rememberedValue18 == obj3) {
            rememberedValue18 = (DerivedStateFlow) lazy.initializer;
            gapComposer2.updateRememberedValue(rememberedValue18);
        }
        Flow flow2 = (Flow) rememberedValue18;
        Boolean bool = Boolean.FALSE;
        MutableState collectAsState3 = Updater.collectAsState(flow2, bool, null, gapComposer2, 48, 2);
        Object rememberedValue19 = gapComposer2.rememberedValue();
        if (rememberedValue19 == obj3) {
            rememberedValue19 = (DerivedStateFlow) lazy.value;
            gapComposer2.updateRememberedValue(rememberedValue19);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue19, bool, null, gapComposer2, 48, 2);
        boolean changed = gapComposer2.changed(((Boolean) collectAsState3.getValue()).booleanValue()) | gapComposer2.changed(((Boolean) collectAsState4.getValue()).booleanValue());
        Object rememberedValue20 = gapComposer2.rememberedValue();
        if (changed || rememberedValue20 == obj3) {
            rememberedValue20 = Recorder$$ExternalSyntheticOutline1.m(((Boolean) collectAsState3.getValue()).booleanValue() && !((Boolean) collectAsState4.getValue()).booleanValue(), gapComposer2);
        }
        MutableState mutableState18 = (MutableState) rememberedValue20;
        Object rememberedValue21 = gapComposer2.rememberedValue();
        if (rememberedValue21 == obj3) {
            rememberedValue21 = this.balanceSnapshotManager.select();
            gapComposer2.updateRememberedValue(rememberedValue21);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer2, 48, 2);
        Object rememberedValue22 = gapComposer2.rememberedValue();
        if (rememberedValue22 == obj3) {
            EnumEntries entries = CashInstrumentType.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : entries) {
                Object obj7 = obj5;
                if (((CashInstrumentType) obj6) != CashInstrumentType.CASH_BALANCE) {
                    arrayList.add(obj6);
                }
                obj5 = obj7;
            }
            obj = obj5;
            mutableState = collectAsState;
            CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
            rememberedValue22 = this.instrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length));
            gapComposer2.updateRememberedValue(rememberedValue22);
        } else {
            obj = obj5;
            mutableState = collectAsState;
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue22, null, null, gapComposer2, 48, 2);
        List list2 = ((QuickPayState) mutableState14.getValue()).paymentGetters;
        Orientation orientation3 = ((QuickPayState) mutableState14.getValue()).orientation;
        Money money3 = ((QuickPayState) mutableState14.getValue()).amount;
        Profile profile = (Profile) mutableState15.getValue();
        List list3 = (List) collectAsState6.getValue();
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) collectAsState5.getValue();
        Object value = collectAsState2.getValue();
        Boolean bool2 = (Boolean) mutableState18.getValue();
        bool2.getClass();
        Object[] objArr10 = {list2, orientation3, money3, profile, list3, balanceSnapshot, value, bool2, mutableState.getValue(), (InstrumentSelection) mutableState17.getValue()};
        boolean changed2 = gapComposer2.changed(collectAsState5) | gapComposer2.changed(collectAsState6) | gapComposer2.changed(mutableState) | gapComposer2.changed(collectAsState2) | gapComposer2.changed(mutableState18) | gapComposer2.changedInstance(this);
        Object rememberedValue23 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue23 == obj3) {
            mutableState2 = mutableState14;
            mutableState3 = mutableState16;
            quickPay = quickPay2;
            objArr = objArr10;
            gapComposer = gapComposer2;
            obj2 = obj;
            quickPayPresenter$models$3$1 = new QuickPayPresenter$models$3$1(mutableState, collectAsState2, this, mutableState2, mutableState17, mutableState15, collectAsState5, collectAsState6, mutableState18, mutableState3, (Continuation) null);
            mutableState4 = mutableState17;
            gapComposer.updateRememberedValue(quickPayPresenter$models$3$1);
        } else {
            quickPay = quickPay2;
            mutableState4 = mutableState17;
            quickPayPresenter$models$3$1 = rememberedValue23;
            obj2 = obj;
            gapComposer = gapComposer2;
            objArr = objArr10;
            mutableState2 = mutableState14;
            mutableState3 = mutableState16;
        }
        Updater.LaunchedEffect(objArr, (Function2) quickPayPresenter$models$3$1, gapComposer);
        gapComposer.startReplaceGroup(-2023000181);
        Object[] objArr11 = {((QuickPayState) mutableState2.getValue()).paymentGetters, Boolean.valueOf(this.networkInfo.isNetworkAvailable()), ((QuickPayState) mutableState2.getValue()).note, ((QuickPayState) mutableState2.getValue()).region, ((QuickPayState) mutableState2.getValue()).amount, ((QuickPayState) mutableState2.getValue()).orientation};
        boolean changedInstance7 = gapComposer.changedInstance(this) | gapComposer.changed(obj2);
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (changedInstance7 || rememberedValue24 == obj3) {
            mutableState5 = mutableState2;
            mutableState6 = mutableState7;
            Object dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, (Object) mutableState5, obj2, (Object) mutableState6, (Continuation) null, 23);
            gapComposer.updateRememberedValue(dotGridKt$DotGrid$3$1);
            rememberedValue24 = dotGridKt$DotGrid$3$1;
        } else {
            mutableState5 = mutableState2;
            mutableState6 = mutableState7;
        }
        Updater.LaunchedEffect(objArr11, (Function2) rememberedValue24, gapComposer);
        gapComposer.end(false);
        Object rememberedValue25 = gapComposer.rememberedValue();
        if (rememberedValue25 == obj3) {
            rememberedValue25 = new HeroTagViewKt$$ExternalSyntheticLambda12(24, mutableState5);
            gapComposer.updateRememberedValue(rememberedValue25);
        }
        Function2 function2 = (Function2) rememberedValue25;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changedInstance8 = gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue26 = gapComposer.rememberedValue();
        if (changedInstance8 || rememberedValue26 == obj3) {
            rememberedValue26 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 19);
            gapComposer.updateRememberedValue(rememberedValue26);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue26, gapComposer);
        MutableState mutableState19 = mutableState5;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) mutableState4, (State) mutableState19, (Object) mutableState6, 27));
        QuickPayState quickPayState = (QuickPayState) mutableState19.getValue();
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) mutableState3.getValue();
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        boolean z = quickPayState.isLoading;
        Orientation orientation4 = quickPayState.orientation;
        Money money4 = quickPayState.amount;
        List list4 = quickPayState.paymentGetters;
        if (z) {
            ready = QuickPayViewModel.Loading.INSTANCE;
        } else {
            if (z) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list5 = list4;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                String str8 = (String) ((PaymentRecipient) it2.next()).displayName.getValue();
                if (str8 != null) {
                    arrayList2.add(str8);
                }
            }
            int size = arrayList2.size();
            if (size == 0) {
                String str9 = androidStringManager.get(R.string.unknown_recipient);
                str9.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.send_payment_toolbar_title_single_recipient)).format(new Object[]{str9});
                format2.getClass();
            } else if (size == 1) {
                String str10 = (String) arrayList2.get(0);
                str10.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.send_payment_toolbar_title_single_recipient)).format(new Object[]{str10});
                format2.getClass();
            } else if (size != 2) {
                String str11 = (String) arrayList2.get(0);
                Integer valueOf = Integer.valueOf(arrayList2.size() - 1);
                str11.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.send_payment_toolbar_title_multi_recipient)).format(new Object[]{str11, valueOf});
                format2.getClass();
            } else {
                String str12 = (String) arrayList2.get(0);
                String str13 = (String) arrayList2.get(1);
                str12.getClass();
                str13.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.send_payment_toolbar_title_two_recipients)).format(new Object[]{str12, str13});
                format2.getClass();
            }
            String str14 = format2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                PaymentRecipient paymentRecipient = (PaymentRecipient) it3.next();
                Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                Recipient create$default = zza.create$default(paymentRecipient.sendableUiCustomer, 100L, false, false, null, 60);
                Region region2 = quickPayState.region;
                Lazy lazy2 = this.recipientSuggestionRowViewModelFactory;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) lazy2.value;
                region2.getClass();
                if (create$default.equals((Recipient) Recipient.pendingCashtagResult$delegate.getValue())) {
                    recipientSuggestionRowViewModel = new RecipientSuggestionRowViewModel(create$default.hashCode(), "", "", null, false, true, false, false, false, false, null, null);
                    it = it3;
                    orientation = orientation4;
                } else {
                    String str15 = create$default.cashtag;
                    boolean z2 = create$default.isCashCustomer;
                    if (str15 != null) {
                        it = it3;
                        Region region3 = create$default.region;
                        if (region3 == null) {
                            region3 = Region.XXL;
                        }
                        str3 = Cashtags.fromString(str15, region3);
                    } else {
                        it = it3;
                        if (create$default.hasMultipleCustomers || !z2) {
                            orientation = orientation4;
                            String[] strArr = {PhoneNumbers.format(create$default.sms, Regions.toCountry(region2).name(), null), create$default.email};
                            int i8 = 0;
                            while (true) {
                                if (i8 >= 2) {
                                    str2 = null;
                                    break;
                                }
                                str2 = strArr[i8];
                                if (str2 != null ? !StringsKt.isBlank(str2) : false) {
                                    break;
                                }
                                i8++;
                            }
                            str3 = str2;
                            if (str3 != null || StringsKt.isBlank(str3)) {
                                str3 = null;
                            }
                            str4 = create$default.displayName;
                            if (str4 == null) {
                                if (Intrinsics.areEqual(str3, str4)) {
                                    str3 = null;
                                }
                                str5 = str3;
                                str3 = str4;
                                charSequence = str4;
                            } else {
                                if (str3 == null) {
                                    Timber.Forest.e("Showing recipient in unexpected state. recipient=%s, region=%s", create$default, region2);
                                }
                                charSequence = null;
                                str5 = null;
                            }
                            boolean z3 = !z2 && create$default.isVerified;
                            boolean z4 = !z2 && create$default.isBusiness;
                            if (str3 == null) {
                                Context context = (Context) lazy2.initializer;
                                BadgeSpacing[] badgeSpacingArr = BadgeSpacing.$VALUES;
                                Size size2 = new Size(16, 16);
                                if (z3) {
                                    i3 = R.drawable.badge_verified_customer;
                                } else if (z4) {
                                    i3 = R.drawable.badge_business_customer;
                                } else {
                                    i2 = 0;
                                    int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.badge_gap_medium);
                                    ImageSpan.VerticalAlignment verticalAlignment = ImageSpan.VerticalAlignment.BASELINE;
                                    if (i2 == 0) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        spannableStringBuilder.append((CharSequence) str3);
                                        ImageSpan imageSpan = new ImageSpan(context, i2, null, dimensionPixelOffset, 0, 0, size2);
                                        int length = spannableStringBuilder.length();
                                        int length2 = spannableStringBuilder.length();
                                        spannableStringBuilder.append(' ');
                                        spannableStringBuilder.setSpan(imageSpan, length, (spannableStringBuilder.length() - length2) + length, 17);
                                        charSequence2 = new SpannedString(spannableStringBuilder);
                                    } else {
                                        charSequence2 = str3;
                                    }
                                }
                                i2 = i3;
                                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.badge_gap_medium);
                                ImageSpan.VerticalAlignment verticalAlignment2 = ImageSpan.VerticalAlignment.BASELINE;
                                if (i2 == 0) {
                                }
                            } else {
                                charSequence2 = charSequence;
                            }
                            CharSequence charSequence3 = charSequence2;
                            if (str3 == null) {
                                str3 = "null";
                            }
                            Resources resources2 = androidStringManager2.resources;
                            resources2.getClass();
                            String format3 = new MessageFormat(resources2.getString(R.string.view_profile_for_content_description)).format(new Object[]{str3});
                            format3.getClass();
                            recipientSuggestionRowViewModel = new RecipientSuggestionRowViewModel(create$default.hashCode(), charSequence3, str5, GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(create$default)), true, false, true, true, !(str5 != null || StringsKt.isBlank(str5)), true, format3, format3);
                        } else {
                            str3 = androidStringManager2.get(create$default.isRecent ? R.string.send_payment_recipient_recent : R.string.send_payment_recipient_existing);
                        }
                    }
                    orientation = orientation4;
                    if (str3 != null) {
                    }
                    str3 = null;
                    str4 = create$default.displayName;
                    if (str4 == null) {
                    }
                    if (z2) {
                    }
                    if (z2) {
                    }
                    if (str3 == null) {
                    }
                    CharSequence charSequence32 = charSequence2;
                    if (str3 == null) {
                    }
                    Resources resources22 = androidStringManager2.resources;
                    resources22.getClass();
                    String format32 = new MessageFormat(resources22.getString(R.string.view_profile_for_content_description)).format(new Object[]{str3});
                    format32.getClass();
                    recipientSuggestionRowViewModel = new RecipientSuggestionRowViewModel(create$default.hashCode(), charSequence32, str5, GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(create$default)), true, false, true, true, !(str5 != null || StringsKt.isBlank(str5)), true, format32, format32);
                }
                arrayList3.add(recipientSuggestionRowViewModel);
                it3 = it;
                orientation4 = orientation;
            }
            Orientation orientation5 = orientation4;
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                StackedAvatarViewModel.Avatar avatar = ((RecipientSuggestionRowViewModel) it4.next()).avatar;
                if (avatar != null) {
                    arrayList4.add(avatar);
                }
            }
            int size3 = arrayList3.size();
            StackedAvatarViewModel duo = size3 != 0 ? size3 != 1 ? new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) arrayList4.get(0), (StackedAvatarViewModel.Avatar) arrayList4.get(1)) : new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) arrayList4.get(0)) : null;
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i9 = iArr[orientation5.ordinal()];
            if (i9 == 1) {
                PaymentScreens.QuickPay quickPay3 = quickPay;
                SelectPaymentInstrumentOption.ExistingOption selectedInstrument = getSelectedInstrument(quickPayState);
                toolbarWithAvatarViewModel = new QuickPayViewModel.ToolbarWithAvatarViewModel(str14, instrumentSelectionRowViewModel == null ? selectedInstrument != null ? GoogleMapKt.displayName(selectedInstrument, androidStringManager, null) : null : null, quickPayState.isPromptForInstrumentOpen, duo, instrumentSelectionRowViewModel == null, quickPay3.isBackNavigation, quickPay3.showDetailsOverflow);
            } else {
                if (i9 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PaymentScreens.QuickPay quickPay4 = quickPay;
                toolbarWithAvatarViewModel = new QuickPayViewModel.ToolbarWithAvatarViewModel(str14, null, false, duo, false, quickPay4.isBackNavigation, quickPay4.showDetailsOverflow);
            }
            QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel2 = toolbarWithAvatarViewModel;
            String format4 = this.moneyFormatter.format(money4);
            int i10 = iArr[orientation5.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (list4.size() > 1) {
                    format4.getClass();
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.request_payment_mulitple_recipients_primary_button)).format(new Object[]{format4});
                    str.getClass();
                } else {
                    str = androidStringManager.get(R.string.send_payment_action_request);
                }
            } else if (list4.size() > 1) {
                format4.getClass();
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.send_payment_mulitple_recipients_primary_button)).format(new Object[]{format4});
                str.getClass();
            } else {
                str = androidStringManager.get(R.string.send_payment_action_send);
            }
            String str16 = str;
            boolean z5 = arrayList3.size() == 1 && ((PaymentRecipient) CollectionsKt.first(list4)).paymentInfo.isBusinessCustomer;
            String format5 = this.noSymbolMoneyFormatter.format(money4);
            CurrencyCode currencyCode = money4.currency_code;
            currencyCode.getClass();
            String str17 = quickPayState.note;
            String str18 = androidStringManager.get(R.string.send_payment_required_note_hint);
            Versioned versioned3 = quickPayState.shouldRequestNoteFocus;
            boolean z6 = quickPayState.isAmountError;
            String str19 = quickPayState.selectedInstrumentToken;
            Money money5 = quickPayState.acceptedFee;
            if (money5 == null) {
                money5 = Moneys.zero(CurrencyCode.USD);
            }
            ready = new QuickPayViewModel.Ready(format5, currencyCode, str16, toolbarWithAvatarViewModel2, str17, str18, versioned3, z6, quickPayState.personalizePaymentButtonState, str19, money5, quickPayState.orientation, quickPayState.paymentGetters, instrumentSelectionRowViewModel, z5);
        }
        gapComposer.end(false);
        return ready;
    }
}
