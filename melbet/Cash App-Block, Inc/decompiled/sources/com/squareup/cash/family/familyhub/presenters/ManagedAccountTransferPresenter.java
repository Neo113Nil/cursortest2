package com.squareup.cash.family.familyhub.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.backend.real.RealSponsorInstrumentManager$sponsorInstruments$1;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.util.money.Moneys;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class ManagedAccountTransferPresenter implements MoleculePresenter {
    public static final List PRESET_AMOUNTS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{1000L, 2500L, 5000L, 10000L, 20000L});
    public final ManagedAccountTransferScreen args;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final RealDependentBalancesStore balanceStore;
    public final RealCustomerStore customerStore;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final KeyValue principalAccountToken;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final Lazy sponsorInstrumentManager;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final AndroidStringManager stringManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputMode {
        public static final /* synthetic */ InputMode[] $VALUES;
        public static final InputMode ATM_PICKER;
        public static final InputMode CHANGE_AMOUNT;
        public static final InputMode INSTRUMENT_PICKER;
        public static final InputMode KEYPAD;
        public static final InputMode VIEW_AMOUNT;

        static {
            InputMode inputMode = new InputMode("ATM_PICKER", 0);
            ATM_PICKER = inputMode;
            InputMode inputMode2 = new InputMode("KEYPAD", 1);
            KEYPAD = inputMode2;
            InputMode inputMode3 = new InputMode("INSTRUMENT_PICKER", 2);
            INSTRUMENT_PICKER = inputMode3;
            InputMode inputMode4 = new InputMode("VIEW_AMOUNT", 3);
            VIEW_AMOUNT = inputMode4;
            InputMode inputMode5 = new InputMode("CHANGE_AMOUNT", 4);
            CHANGE_AMOUNT = inputMode5;
            $VALUES = new InputMode[]{inputMode, inputMode2, inputMode3, inputMode4, inputMode5};
        }

        public static InputMode valueOf(String str) {
            return (InputMode) Enum.valueOf(InputMode.class, str);
        }

        public static InputMode[] values() {
            return (InputMode[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ManagedAccountTransferScreen.TransferType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ManagedAccountTransferScreen.TransferType transferType = ManagedAccountTransferScreen.TransferType.ADD_MONEY;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InputMode.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InputMode inputMode = InputMode.ATM_PICKER;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InputMode inputMode2 = InputMode.ATM_PICKER;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                InputMode inputMode3 = InputMode.ATM_PICKER;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                InputMode inputMode4 = InputMode.ATM_PICKER;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[CashInstrumentType.values().length];
            try {
                iArr3[CashInstrumentType.CASH_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CashInstrumentType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public ManagedAccountTransferPresenter(AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, KeyValue keyValue, RealDependentBalancesStore realDependentBalancesStore, RealFamilyAccountsManager realFamilyAccountsManager, SessionManager sessionManager, RealCustomerStore realCustomerStore, Lazy lazy, RealBalanceSnapshotManager realBalanceSnapshotManager, LocalizedMoneyFormatter.Factory factory, ManagedAccountTransferScreen managedAccountTransferScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        managedAccountTransferScreen.getClass();
        this.stringManager = androidStringManager;
        this.principalAccountToken = keyValue;
        this.balanceStore = realDependentBalancesStore;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.sessionManager = sessionManager;
        this.customerStore = realCustomerStore;
        this.sponsorInstrumentManager = lazy;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.args = managedAccountTransferScreen;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public final InstrumentCellViewModel createInstrumentViewModel(Instrument instrument, String str, String str2, GapComposer gapComposer, int i, int i2) {
        Object localIcon;
        String str3;
        Money money;
        boolean z = (i2 & 8) != 0;
        boolean changed = ((((i & 7168) ^ 3072) > 2048 && gapComposer.changed(z)) || (i & 3072) == 2048) | gapComposer.changed(instrument) | ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(str2)) || (i & MLKEMEngine.KyberPolyBytes) == 256);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            if (instrument != null) {
                CashInstrumentType cashInstrumentType = instrument.cash_instrument_type;
                boolean z2 = cashInstrumentType == CashInstrumentType.CASH_BALANCE;
                String str4 = instrument.icon_url;
                if (str4 == null || z2) {
                    int i3 = cashInstrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[cashInstrumentType.ordinal()];
                    localIcon = i3 != 1 ? i3 != 2 ? i3 != 3 ? new InstrumentIcon.LocalIcon(Icons.Avatar24, null, null, null, null, 30) : new InstrumentIcon.LocalIcon(Icons.BankAccount24, null, null, null, null, 30) : InstrumentAvatarUtilsKt.toInstrumentIcon(instrument.card_brand) : new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                } else {
                    localIcon = new InstrumentIcon.RemoteIcon(str4, (InstrumentIcon.IconShape) null, 6);
                }
                if (!z2 || str2 == null) {
                    str3 = instrument.display_name_compact;
                    if (str3 == null) {
                        str3 = "";
                    }
                } else {
                    str3 = str2.concat("'s Cash balance");
                }
                rememberedValue = new InstrumentCellViewModel(str3, null, false, CollectionsKt__CollectionsJVMKt.listOf(localIcon), z ? InstrumentCellViewModel.Accessory.Push.INSTANCE : null, null, str, (!z2 || (money = instrument.available_balance) == null) ? null : this.moneyFormatter.format(money), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
            } else {
                rememberedValue = null;
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (InstrumentCellViewModel) rememberedValue;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object appLockMonitor$special$$inlined$map$2;
        MutableState mutableState;
        MutableState mutableState2;
        GapComposer gapComposer;
        InstrumentCellViewModel instrumentCellViewModel;
        GapComposer gapComposer2;
        Object atmPicker;
        String firstName;
        Object obj;
        boolean z;
        String firstName2;
        String str;
        String str2;
        Object localIcon;
        String str3;
        String str4;
        Long l;
        Long l2;
        MutableState mutableState3;
        Instrument instrument;
        String str5;
        Object appLockMonitor$special$$inlined$map$22;
        Object dotGridKt$DotGrid$3$1;
        State state;
        Money money;
        GapComposer gapComposer3;
        MutableState mutableState4;
        MutableState mutableState5;
        String str6;
        String firstName3;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startReplaceGroup(-1383400058);
        ManagedAccountTransferScreen managedAccountTransferScreen = this.args;
        int ordinal = managedAccountTransferScreen.transferType.ordinal();
        MoneyFormatter moneyFormatter = this.moneyFormatter;
        Lazy lazy = this.sponsorInstrumentManager;
        RealFamilyAccountsManager realFamilyAccountsManager = this.sponsorshipStateProvider;
        Object obj2 = Composer.Companion.Empty;
        SessionManager sessionManager = this.sessionManager;
        RealCustomerStore realCustomerStore = this.customerStore;
        String str7 = "";
        final int i2 = 1;
        if (ordinal == 0) {
            gapComposer4.startReplaceGroup(1992409493);
            int i3 = i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            final CurrencyCode currencyCode = CurrencyCode.USD;
            String activeAccountToken = PlatformKt.activeAccountToken(sessionManager);
            Object rememberedValue = gapComposer4.rememberedValue();
            if (rememberedValue == obj2) {
                rememberedValue = realCustomerStore.getCustomerForId(activeAccountToken);
                gapComposer4.updateRememberedValue(rememberedValue);
            }
            MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer4, 48, 2);
            MutableState collectAsState2 = Updater.collectAsState(StateFlowKt.mapState(realFamilyAccountsManager.sponsorsFlow(), new FamilyActivityFixtures$$ExternalSyntheticLambda0(1)), null, gapComposer4, 1);
            Sponsor sponsor = (Sponsor) collectAsState2.getValue();
            String str8 = sponsor != null ? sponsor.customer_token : null;
            boolean changed = gapComposer4.changed((Sponsor) collectAsState2.getValue());
            Object rememberedValue2 = gapComposer4.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                if (str8 == null || (appLockMonitor$special$$inlined$map$2 = realCustomerStore.getCustomerForId(str8)) == null) {
                    appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                }
                rememberedValue2 = appLockMonitor$special$$inlined$map$2;
                gapComposer4.updateRememberedValue(rememberedValue2);
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer4, 48, 2);
            Object rememberedValue3 = gapComposer4.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = this.principalAccountToken.observe();
                gapComposer4.updateRememberedValue(rememberedValue3);
            }
            MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer4, 48, 2);
            Object rememberedValue4 = gapComposer4.rememberedValue();
            if (rememberedValue4 == obj2) {
                Object safeFlow = new SafeFlow(new RealSponsorInstrumentManager$sponsorInstruments$1(lazy, null));
                gapComposer4.updateRememberedValue(safeFlow);
                rememberedValue4 = safeFlow;
            }
            MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue4, EmptyList.INSTANCE, null, gapComposer4, 48, 2);
            boolean changed2 = gapComposer4.changed((List) collectAsState5.getValue());
            Object rememberedValue5 = gapComposer4.rememberedValue();
            if (changed2 || rememberedValue5 == obj2) {
                rememberedValue5 = Updater.derivedStateOf(new DrawerViewKt$$ExternalSyntheticLambda2(19, collectAsState5));
                gapComposer4.updateRememberedValue(rememberedValue5);
            }
            State state2 = (State) rememberedValue5;
            boolean changed3 = gapComposer4.changed((Instrument) state2.getValue());
            Object rememberedValue6 = gapComposer4.rememberedValue();
            if (changed3 || rememberedValue6 == obj2) {
                rememberedValue6 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state2, 26));
                gapComposer4.updateRememberedValue(rememberedValue6);
            }
            State state3 = (State) rememberedValue6;
            boolean changed4 = gapComposer4.changed((List) collectAsState5.getValue());
            Object rememberedValue7 = gapComposer4.rememberedValue();
            if (changed4 || rememberedValue7 == obj2) {
                rememberedValue7 = Updater.derivedStateOf(new DrawerViewKt$$ExternalSyntheticLambda2(20, collectAsState5));
                gapComposer4.updateRememberedValue(rememberedValue7);
            }
            State state4 = (State) rememberedValue7;
            boolean changed5 = gapComposer4.changed((List) collectAsState5.getValue());
            Object rememberedValue8 = gapComposer4.rememberedValue();
            if (changed5 || rememberedValue8 == obj2) {
                rememberedValue8 = Updater.derivedStateOf(new DrawerViewKt$$ExternalSyntheticLambda2(21, collectAsState5));
                gapComposer4.updateRememberedValue(rememberedValue8);
            }
            State state5 = (State) rememberedValue8;
            Object[] objArr = new Object[0];
            Object rememberedValue9 = gapComposer4.rememberedValue();
            if (rememberedValue9 == obj2) {
                rememberedValue9 = new Recipient$$ExternalSyntheticLambda2(21);
                gapComposer4.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue9, gapComposer4, 48);
            Object rememberedValue10 = gapComposer4.rememberedValue();
            if (rememberedValue10 == obj2) {
                rememberedValue10 = Updater.mutableStateOf$default(null);
                gapComposer4.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState7 = (MutableState) rememberedValue10;
            boolean changed6 = gapComposer4.changed((List) collectAsState5.getValue()) | gapComposer4.changed((String) mutableState6.getValue()) | gapComposer4.changed(managedAccountTransferScreen.selectedInstrumentToken);
            Object rememberedValue11 = gapComposer4.rememberedValue();
            if (changed6 || rememberedValue11 == obj2) {
                rememberedValue11 = Updater.derivedStateOf(new GLSceneScope$$ExternalSyntheticLambda2(5, this, mutableState6, collectAsState5));
                gapComposer4.updateRememberedValue(rememberedValue11);
            }
            State state6 = (State) rememberedValue11;
            Object[] objArr2 = new Object[0];
            boolean changedInstance = gapComposer4.changedInstance(this);
            Object rememberedValue12 = gapComposer4.rememberedValue();
            if (changedInstance || rememberedValue12 == obj2) {
                rememberedValue12 = new Function0(this) { // from class: com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter$$ExternalSyntheticLambda1
                    public final /* synthetic */ ManagedAccountTransferPresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = i2;
                        CurrencyCode currencyCode2 = currencyCode;
                        ManagedAccountTransferPresenter managedAccountTransferPresenter = this.f$0;
                        switch (i4) {
                            case 0:
                                Money money2 = managedAccountTransferPresenter.args.initialAmount;
                                if (money2 == null) {
                                    money2 = Moneys.zero(currencyCode2);
                                }
                                return Updater.mutableStateOf$default(money2);
                            default:
                                Money money3 = managedAccountTransferPresenter.args.initialAmount;
                                if (money3 == null) {
                                    money3 = Moneys.zero(currencyCode2);
                                }
                                return Updater.mutableStateOf$default(money3);
                        }
                    }
                };
                gapComposer4.updateRememberedValue(rememberedValue12);
            }
            MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue12, gapComposer4, 0);
            Object rememberedValue13 = gapComposer4.rememberedValue();
            List list = PRESET_AMOUNTS;
            if (rememberedValue13 == obj2) {
                rememberedValue13 = Updater.mutableStateOf$default((Moneys.isZero((Money) mutableState8.getValue()) || CollectionsKt.contains(list, ((Money) mutableState8.getValue()).amount)) ? InputMode.ATM_PICKER : InputMode.KEYPAD);
                gapComposer4.updateRememberedValue(rememberedValue13);
            }
            MutableState mutableState9 = (MutableState) rememberedValue13;
            if (((Instrument) state6.getValue()) != null) {
                gapComposer4.startReplaceGroup(-453281376);
                Instrument instrument2 = (Instrument) state6.getValue();
                String str9 = androidStringManager.get(R.string.managed_account_transfer_from_prefix);
                Recipient recipient = (Recipient) collectAsState3.getValue();
                if (recipient != null) {
                    mutableState3 = mutableState6;
                    instrument = instrument2;
                    str5 = recipient.getFirstName();
                } else {
                    mutableState3 = mutableState6;
                    instrument = instrument2;
                    str5 = null;
                }
                mutableState = collectAsState5;
                mutableState2 = mutableState7;
                InstrumentCellViewModel createInstrumentViewModel = createInstrumentViewModel(instrument, str9, str5, gapComposer4, (i3 << 9) & 57344, 8);
                gapComposer = gapComposer4;
                gapComposer.end(false);
                instrumentCellViewModel = createInstrumentViewModel;
                mutableState6 = mutableState3;
            } else {
                mutableState = collectAsState5;
                mutableState2 = mutableState7;
                gapComposer = gapComposer4;
                gapComposer.startReplaceGroup(-453035205);
                Object rememberedValue14 = gapComposer.rememberedValue();
                if (rememberedValue14 == obj2) {
                    rememberedValue14 = new InstrumentCellViewModel(androidStringManager.get(R.string.managed_account_transfer_add_payment_method), null, true, CollectionsKt__CollectionsJVMKt.listOf(new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24)), InstrumentCellViewModel.Accessory.Push.INSTANCE, null, androidStringManager.get(R.string.managed_account_transfer_from_prefix), null, null, 416);
                    gapComposer.updateRememberedValue(rememberedValue14);
                }
                gapComposer.end(false);
                instrumentCellViewModel = (InstrumentCellViewModel) rememberedValue14;
            }
            Long l3 = ((Money) mutableState8.getValue()).amount;
            long longValue = l3 != null ? l3.longValue() : 0L;
            Instrument instrument3 = (Instrument) state6.getValue();
            if ((instrument3 != null ? instrument3.cash_instrument_type : null) == CashInstrumentType.CASH_BALANCE && longValue > ((Number) state3.getValue()).longValue() && ((Instrument) state5.getValue()) != null && !((Boolean) state4.getValue()).booleanValue()) {
                String str10 = (String) mutableState6.getValue();
                Instrument instrument4 = (Instrument) state5.getValue();
                if (!Intrinsics.areEqual(str10, instrument4 != null ? instrument4.token : null)) {
                    Instrument instrument5 = (Instrument) state5.getValue();
                    mutableState6.setValue(instrument5 != null ? instrument5.token : null);
                    Instrument instrument6 = (Instrument) state5.getValue();
                    mutableState2.setValue(instrument6 != null ? instrument6.token : null);
                }
            }
            MutableState mutableState10 = mutableState6;
            gapComposer2 = gapComposer;
            Updater.LaunchedEffect(gapComposer2, flow, new ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(flow, (Continuation) null, currencyCode, this, mutableState8, state6, mutableState9, collectAsState4, mutableState10));
            int ordinal2 = ((InputMode) mutableState9.getValue()).ordinal();
            if (ordinal2 == 0) {
                String str11 = androidStringManager.get(R.string.managed_account_transfer_add_money_title);
                Recipient recipient2 = (Recipient) collectAsState.getValue();
                if (recipient2 != null && (firstName = recipient2.getFirstName()) != null) {
                    str7 = firstName;
                }
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.managed_account_transfer_add_money_subtitle)).format(new Object[]{str7});
                format2.getClass();
                Money money2 = (Money) mutableState8.getValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Money(Long.valueOf(((Number) it.next()).longValue()), currencyCode, 4));
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Money money3 = (Money) it2.next();
                    Long l4 = money3.amount;
                    arrayList2.add(new AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount(moneyFormatter.format(money3), Intrinsics.areEqual((Money) mutableState8.getValue(), money3), money3, !(((Instrument) state6.getValue()) == null || (((Boolean) state4.getValue()).booleanValue() && (l4 != null ? l4.longValue() : 0L) > ((Number) state3.getValue()).longValue())), 4));
                }
                atmPicker = new AddMoneyViewModel.AtmPicker(str11, format2, money2, androidStringManager.get(R.string.managed_account_transfer_confirm_button), (((Instrument) state6.getValue()) == null || Moneys.isZero((Money) mutableState8.getValue())) ? false : true, null, false, instrumentCellViewModel, CollectionsKt.plus((Collection) arrayList2, (Object) new AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom(androidStringManager.get(R.string.managed_account_transfer_more_options), ((Instrument) state6.getValue()) != null)), null);
            } else if (ordinal2 == 1) {
                String str12 = androidStringManager.get(R.string.managed_account_transfer_add_money_title);
                Recipient recipient3 = (Recipient) collectAsState.getValue();
                if (recipient3 != null && (firstName2 = recipient3.getFirstName()) != null) {
                    str7 = firstName2;
                }
                resources.getClass();
                String format3 = new MessageFormat(resources.getString(R.string.managed_account_transfer_add_money_subtitle)).format(new Object[]{str7});
                format3.getClass();
                atmPicker = new AddMoneyViewModel.Keypad(str12, format3, (Money) mutableState8.getValue(), androidStringManager.get(R.string.managed_account_transfer_confirm_button), !Moneys.isZero((Money) mutableState8.getValue()), null, false, instrumentCellViewModel, new Money((Long) 9999900L, currencyCode, 4), false, null);
            } else {
                if (ordinal2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$2((InputMode) mutableState9.getValue(), "Invalid input mode for add money: ");
                    return null;
                }
                String str13 = androidStringManager.get(R.string.sponsor_instrument_picker_title);
                String str14 = androidStringManager.get(R.string.sponsor_instrument_picker_subtitle);
                List list3 = (List) mutableState.getValue();
                Recipient recipient4 = (Recipient) collectAsState3.getValue();
                String firstName4 = recipient4 != null ? recipient4.getFirstName() : null;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    Instrument instrument7 = (Instrument) obj3;
                    if (instrument7.cash_instrument_type == CashInstrumentType.CASH_BALANCE) {
                        Money money4 = instrument7.available_balance;
                        if (((money4 == null || (l2 = money4.amount) == null) ? 0L : l2.longValue()) >= 100) {
                        }
                    }
                    arrayList3.add(obj3);
                }
                List<Instrument> sortedWith = CollectionsKt.sortedWith(arrayList3, new b.C0008b(14));
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                for (Instrument instrument8 : sortedWith) {
                    boolean z2 = instrument8.cash_instrument_type == CashInstrumentType.CASH_BALANCE;
                    Money money5 = instrument8.available_balance;
                    boolean z3 = !z2 || longValue <= ((money5 == null || (l = money5.amount) == null) ? 0L : l.longValue());
                    Money money6 = instrument8.available_balance;
                    if (money6 != null) {
                        String format4 = moneyFormatter.format(money6);
                        format4.getClass();
                        resources.getClass();
                        str2 = new MessageFormat(resources.getString(R.string.sponsor_instrument_picker_available_amount)).format(new Object[]{format4});
                        str2.getClass();
                    } else {
                        str2 = null;
                    }
                    String str15 = z2 ? str2 : null;
                    String str16 = instrument8.icon_url;
                    if (str16 == null || z2) {
                        CashInstrumentType cashInstrumentType = instrument8.cash_instrument_type;
                        int i4 = cashInstrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[cashInstrumentType.ordinal()];
                        localIcon = i4 != 1 ? i4 != 2 ? i4 != 3 ? new InstrumentIcon.LocalIcon(Icons.Avatar24, null, null, null, null, 30) : new InstrumentIcon.LocalIcon(Icons.BankAccount24, null, null, null, null, 30) : InstrumentAvatarUtilsKt.toInstrumentIcon(instrument8.card_brand) : new InstrumentIcon.LocalIcon(Icons.CurrencyUsd16, InstrumentIcon.LocalIcon.IconTint.INVERSE, InstrumentIcon.LocalIcon.IconBackground.BRAND, null, null, 24);
                    } else {
                        localIcon = new InstrumentIcon.RemoteIcon(str16, (InstrumentIcon.IconShape) null, 6);
                    }
                    if (!z2 || firstName4 == null) {
                        str3 = instrument8.display_name_compact;
                        if (str3 == null) {
                            str4 = "";
                            String str17 = instrument8.token;
                            str17.getClass();
                            arrayList4.add(new AddMoneyViewModel.ManagedAccountInstrumentPicker.InstrumentItem(new InstrumentCellViewModel(str4, str15, z3, CollectionsKt__CollectionsJVMKt.listOf(localIcon), InstrumentCellViewModel.Accessory.Radio.INSTANCE, null, null, null, null, 480), str17));
                        }
                    } else {
                        str3 = firstName4.concat("'s Cash balance");
                    }
                    str4 = str3;
                    String str172 = instrument8.token;
                    str172.getClass();
                    arrayList4.add(new AddMoneyViewModel.ManagedAccountInstrumentPicker.InstrumentItem(new InstrumentCellViewModel(str4, str15, z3, CollectionsKt__CollectionsJVMKt.listOf(localIcon), InstrumentCellViewModel.Accessory.Radio.INSTANCE, null, null, null, null, 480), str172));
                }
                String str18 = (String) mutableState10.getValue();
                if (str18 == null) {
                    Instrument instrument9 = (Instrument) state6.getValue();
                    str = instrument9 != null ? instrument9.token : null;
                } else {
                    str = str18;
                }
                obj = new AddMoneyViewModel.ManagedAccountInstrumentPicker(arrayList4, str13, str14, str, androidStringManager.get(R.string.sponsor_instrument_picker_done_button));
                z = false;
                gapComposer2.end(false);
            }
            obj = atmPicker;
            z = false;
            gapComposer2.end(false);
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1992407749, false);
            }
            gapComposer4.startReplaceGroup(1992412021);
            int i5 = i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            final CurrencyCode currencyCode2 = CurrencyCode.USD;
            String activeAccountToken2 = PlatformKt.activeAccountToken(sessionManager);
            Object rememberedValue15 = gapComposer4.rememberedValue();
            if (rememberedValue15 == obj2) {
                rememberedValue15 = realCustomerStore.getCustomerForId(activeAccountToken2);
                gapComposer4.updateRememberedValue(rememberedValue15);
            }
            MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue15, null, null, gapComposer4, 48, 2);
            MutableState collectAsState7 = Updater.collectAsState(StateFlowKt.mapState(realFamilyAccountsManager.sponsorsFlow(), new FamilyActivityFixtures$$ExternalSyntheticLambda0(1)), null, gapComposer4, 1);
            Sponsor sponsor2 = (Sponsor) collectAsState7.getValue();
            String str19 = sponsor2 != null ? sponsor2.customer_token : null;
            boolean changed7 = gapComposer4.changed((Sponsor) collectAsState7.getValue());
            Object rememberedValue16 = gapComposer4.rememberedValue();
            if (changed7 || rememberedValue16 == obj2) {
                if (str19 == null || (appLockMonitor$special$$inlined$map$22 = realCustomerStore.getCustomerForId(str19)) == null) {
                    appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                }
                rememberedValue16 = appLockMonitor$special$$inlined$map$22;
                gapComposer4.updateRememberedValue(rememberedValue16);
            }
            MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer4, 48, 2);
            Object rememberedValue17 = gapComposer4.rememberedValue();
            if (rememberedValue17 == obj2) {
                Object safeFlow2 = new SafeFlow(new RealSponsorInstrumentManager$sponsorInstruments$1(lazy, null));
                gapComposer4.updateRememberedValue(safeFlow2);
                rememberedValue17 = safeFlow2;
            }
            MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue17, EmptyList.INSTANCE, null, gapComposer4, 48, 2);
            boolean changed8 = gapComposer4.changed((List) collectAsState9.getValue());
            Object rememberedValue18 = gapComposer4.rememberedValue();
            if (changed8 || rememberedValue18 == obj2) {
                rememberedValue18 = Updater.derivedStateOf(new DrawerViewKt$$ExternalSyntheticLambda2(18, collectAsState9));
                gapComposer4.updateRememberedValue(rememberedValue18);
            }
            State state7 = (State) rememberedValue18;
            Object rememberedValue19 = gapComposer4.rememberedValue();
            if (rememberedValue19 == obj2) {
                rememberedValue19 = this.balanceSnapshotManager.select();
                gapComposer4.updateRememberedValue(rememberedValue19);
            }
            MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue19, null, null, gapComposer4, 48, 2);
            DependentBalance.LoadingState loadingState = this.balanceStore.m3530cashBalancehhJSO8g(activeAccountToken2, null, gapComposer4, 48).state;
            boolean z4 = loadingState instanceof DependentBalance.LoadingState.BalanceLoaded;
            Money zero = z4 ? ((DependentBalance.LoadingState.BalanceLoaded) loadingState).amount : Moneys.zero(currencyCode2);
            final int i6 = 0;
            Object[] objArr3 = new Object[0];
            boolean changedInstance2 = gapComposer4.changedInstance(this);
            Object rememberedValue20 = gapComposer4.rememberedValue();
            if (changedInstance2 || rememberedValue20 == obj2) {
                rememberedValue20 = new Function0(this) { // from class: com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter$$ExternalSyntheticLambda1
                    public final /* synthetic */ ManagedAccountTransferPresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i6;
                        CurrencyCode currencyCode22 = currencyCode2;
                        ManagedAccountTransferPresenter managedAccountTransferPresenter = this.f$0;
                        switch (i42) {
                            case 0:
                                Money money22 = managedAccountTransferPresenter.args.initialAmount;
                                if (money22 == null) {
                                    money22 = Moneys.zero(currencyCode22);
                                }
                                return Updater.mutableStateOf$default(money22);
                            default:
                                Money money32 = managedAccountTransferPresenter.args.initialAmount;
                                if (money32 == null) {
                                    money32 = Moneys.zero(currencyCode22);
                                }
                                return Updater.mutableStateOf$default(money32);
                        }
                    }
                };
                gapComposer4.updateRememberedValue(rememberedValue20);
            }
            MutableState mutableState11 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue20, gapComposer4, 0);
            Object[] objArr4 = new Object[0];
            boolean changedInstance3 = gapComposer4.changedInstance(this);
            Object rememberedValue21 = gapComposer4.rememberedValue();
            if (changedInstance3 || rememberedValue21 == obj2) {
                rememberedValue21 = new ArcadeModal$$ExternalSyntheticLambda2(this, 20);
                gapComposer4.updateRememberedValue(rememberedValue21);
            }
            MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue21, gapComposer4, 0);
            DependentBalance.LoadingState.BalanceLoaded balanceLoaded = z4 ? (DependentBalance.LoadingState.BalanceLoaded) loadingState : null;
            Object obj4 = balanceLoaded != null ? balanceLoaded.amount : null;
            Boolean valueOf = Boolean.valueOf(managedAccountTransferScreen.autoPopulateWithdrawAmount);
            Money money7 = managedAccountTransferScreen.initialAmount;
            Boolean bool = (Boolean) mutableState12.getValue();
            bool.getClass();
            Object[] objArr5 = {valueOf, money7, obj4, bool};
            boolean changedInstance4 = gapComposer4.changedInstance(this) | gapComposer4.changed(mutableState12) | gapComposer4.changedInstance(obj4) | gapComposer4.changed(mutableState11);
            Object rememberedValue22 = gapComposer4.rememberedValue();
            if (changedInstance4 || rememberedValue22 == obj2) {
                state = state7;
                money = zero;
                gapComposer3 = gapComposer4;
                dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) this, obj4, mutableState12, mutableState11, (Continuation) null, 8);
                mutableState4 = mutableState12;
                mutableState5 = mutableState11;
                gapComposer3.updateRememberedValue(dotGridKt$DotGrid$3$1);
            } else {
                mutableState4 = mutableState12;
                mutableState5 = mutableState11;
                state = state7;
                dotGridKt$DotGrid$3$1 = rememberedValue22;
                gapComposer3 = gapComposer4;
                money = zero;
            }
            Updater.LaunchedEffect(objArr5, (Function2) dotGridKt$DotGrid$3$1, gapComposer3);
            Object[] objArr6 = new Object[0];
            Object rememberedValue23 = gapComposer3.rememberedValue();
            if (rememberedValue23 == obj2) {
                rememberedValue23 = new Recipient$$ExternalSyntheticLambda2(20);
                gapComposer3.updateRememberedValue(rememberedValue23);
            }
            MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue23, gapComposer3, 48);
            Instrument instrument10 = (Instrument) state.getValue();
            String str20 = androidStringManager.get(R.string.managed_account_transfer_to_prefix);
            Recipient recipient5 = (Recipient) collectAsState8.getValue();
            GapComposer gapComposer5 = gapComposer3;
            InstrumentCellViewModel createInstrumentViewModel2 = createInstrumentViewModel(instrument10, str20, recipient5 != null ? recipient5.getFirstName() : null, gapComposer5, ((i5 << 9) & 57344) | 3072, 0);
            gapComposer2 = gapComposer5;
            MutableState mutableState14 = mutableState5;
            Updater.LaunchedEffect(gapComposer2, flow, new ManagedAccountTransferPresenter$addMoneyFlow$$inlined$CollectEffect$1(flow, (Continuation) null, this, currencyCode2, mutableState14, mutableState4, mutableState13, collectAsState10, state));
            double longValue2 = (money.amount != null ? r0.longValue() : 0.0d) / 100.0d;
            int ordinal3 = ((InputMode) mutableState13.getValue()).ordinal();
            if (ordinal3 == 3) {
                String format5 = moneyFormatter.format((Money) mutableState14.getValue());
                Recipient recipient6 = (Recipient) collectAsState6.getValue();
                if (recipient6 == null || (str6 = recipient6.getFirstName()) == null) {
                    str6 = "";
                }
                format5.getClass();
                resources.getClass();
                String format6 = new MessageFormat(resources.getString(R.string.managed_account_transfer_withdraw_confirmation_title)).format(new Object[]{format5, str6});
                format6.getClass();
                obj = new WithdrawViewModel.ManagedAccountConfirmation(format6, androidStringManager.get(R.string.managed_account_transfer_withdraw_button), createInstrumentViewModel2);
            } else {
                if (ordinal3 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$2((InputMode) mutableState13.getValue(), "Invalid input mode for withdraw: ");
                    return null;
                }
                Recipient recipient7 = (Recipient) collectAsState6.getValue();
                if (recipient7 != null && (firstName3 = recipient7.getFirstName()) != null) {
                    str7 = firstName3;
                }
                String str21 = androidStringManager.get(R.string.managed_account_transfer_withdraw_title);
                resources.getClass();
                String format7 = new MessageFormat(resources.getString(R.string.managed_account_transfer_withdraw_subtitle)).format(new Object[]{str7});
                format7.getClass();
                obj = new WithdrawViewModel.ManagedAccountAmountEntry(str21, new WithdrawViewModel$AmountConfig$KeypadConfig((Money) mutableState14.getValue(), longValue2, currencyCode2), format7, androidStringManager.get(R.string.managed_account_transfer_continue_button));
            }
            z = false;
            gapComposer2.end(false);
        }
        gapComposer2.end(z);
        return obj;
    }
}
