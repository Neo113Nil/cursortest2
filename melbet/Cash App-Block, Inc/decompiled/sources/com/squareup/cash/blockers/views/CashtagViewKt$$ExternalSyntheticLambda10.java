package com.squareup.cash.blockers.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel;
import com.squareup.cash.banking.applets.presenters.LiteBalanceAppletTileRepository;
import com.squareup.cash.banking.applets.presenters.OverdraftModel$Activated;
import com.squareup.cash.banking.applets.presenters.OverdraftModel$Disabled;
import com.squareup.cash.banking.applets.presenters.RealBalanceAppletTileRepository;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.viewmodels.TransfersViewModel;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantSection;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.views.applet.balance.BitcoinBalanceWidgetKt;
import com.squareup.cash.bitcoin.views.applet.statsandsettings.BitcoinSettingsWidgetViewKt;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Placeholder;
import com.squareup.cash.blockers.viewmodels.Header$Avatar$Url;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.money.disclosure.DisclosureItem;
import com.squareup.cash.money.loadable.Loadable;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.stripe.android.networking.StripeErrorMappingKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.YearMonth;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.ui.arcade.elements.RemoteImage;

/* loaded from: classes5.dex */
public final /* synthetic */ class CashtagViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0a61, code lost:
    
        if ((r8 instanceof com.squareup.cash.money.loadable.Loadable.Loading) != false) goto L366;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09ad  */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel$AccountAndRoutingState] */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.squareup.cash.banking.applets.presenters.BalanceRepositoryModel$AccountAndRoutingState] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        CurrencyCode currencyCode;
        Money money;
        Long l;
        PagerDefaults pagerDefaults;
        Money money2;
        Money money3;
        PagerDefaults pagerDefaults2;
        LocalizedString localizedString;
        String str;
        String str2;
        Money money4;
        Long l2;
        long j;
        int i = this.$r8$classId;
        BalanceRepositoryModel.AccountAndRoutingState.Hidden hidden = BalanceRepositoryModel.AccountAndRoutingState.Hidden.INSTANCE;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        BalanceAppletTileViewModel.ConvertedBalance convertedBalance = null;
        convertedBalance = null;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                CashtagViewModel cashtagViewModel = (CashtagViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cashtagViewModel.cashtagSymbol, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj3;
                BalanceRepositoryModel balanceRepositoryModel = (BalanceRepositoryModel) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (balanceRepositoryModel == null) {
                    return (BalanceAppletTileViewModel.Loading) transfersPresenter.initialTab;
                }
                Money money5 = balanceRepositoryModel.balance;
                MoneyFormatter moneyFormatter = (MoneyFormatter) transfersPresenter.analytics;
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) transfersPresenter.demandDepositAccountManager;
                AndroidStringManager androidStringManager = transfersPresenter.stringManager;
                String format2 = moneyFormatter.format(money5);
                Long l3 = money5.amount;
                long longValue = l3 != null ? l3.longValue() : 0L;
                BalanceAppletTileViewModel.BalanceMovementButtons balanceMovementButtons = new BalanceAppletTileViewModel.BalanceMovementButtons(balanceRepositoryModel.canCashIn, balanceRepositoryModel.canCashOut, (String) transfersPresenter.navigator, (String) transfersPresenter.router, 32);
                BalanceAppletTileViewModel.BalanceObfuscationButton balanceObfuscationButton = new BalanceAppletTileViewModel.BalanceObfuscationButton(booleanValue ? androidStringManager.get(R.string.balance_obfuscation_state_hidden_content_description) : androidStringManager.get(R.string.balance_obfuscation_state_shown_content_description), booleanValue ? androidStringManager.get(R.string.balance_obfuscation_show_click_label) : androidStringManager.get(R.string.balance_obfuscation_hide_click_label), booleanValue);
                Money money6 = balanceRepositoryModel.convertedBalance;
                if (money6 != null && (currencyCode = money6.currency_code) != null) {
                    String currencySymbol = moneyFormatter2.currencySymbol(currencyCode);
                    String format3 = moneyFormatter2.format(money6);
                    currencySymbol.getClass();
                    format3.getClass();
                    Object[] objArr = {"MX", currencySymbol, format3};
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format4 = new MessageFormat(resources.getString(R.string.lite_converted_balance_label)).format(objArr);
                    format4.getClass();
                    Long l4 = money6.amount;
                    convertedBalance = new BalanceAppletTileViewModel.ConvertedBalance(format4, l4 != null ? l4.longValue() : 0L);
                }
                BalanceAppletTileViewModel.ConvertedBalance convertedBalance2 = convertedBalance;
                String str3 = (String) transfersPresenter.args;
                return longValue <= 0 ? new BalanceAppletTileViewModel.Loaded.Lite.Uninstalled(str3, balanceMovementButtons, androidStringManager.get(R.string.lite_account_text), androidStringManager.get(R.string.lite_account_text), format2, longValue, balanceObfuscationButton, convertedBalance2, (BalanceAppletTileViewModel.Loaded.Lite.Uninstalled.UninstalledRowModel) transfersPresenter.blockersHelper) : new BalanceAppletTileViewModel.Loaded.Lite.Installed(str3, balanceMovementButtons, androidStringManager.get(R.string.lite_account_text), androidStringManager.get(R.string.lite_account_text), format2, longValue, balanceObfuscationButton, convertedBalance2);
            case 2:
                LiteBalanceAppletTileRepository liteBalanceAppletTileRepository = (LiteBalanceAppletTileRepository) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj);
                gapComposer2.startReplaceGroup(505335164);
                MutableState collectAsLoadableState = LoadableStateKt.collectAsLoadableState(liteBalanceAppletTileRepository.fxExchangeRate, gapComposer2);
                MutableState collectAsLoadableState2 = LoadableStateKt.collectAsLoadableState(liteBalanceAppletTileRepository.balanceSnapshot, gapComposer2);
                Loadable loadable = (Loadable) collectAsLoadableState2.getValue();
                loadable.getClass();
                if (!(loadable instanceof Loadable.Loading)) {
                    MutableState collectAsLoadableState3 = LoadableStateKt.collectAsLoadableState(liteBalanceAppletTileRepository.addCashEnabled, gapComposer2);
                    MutableState collectAsLoadableState4 = LoadableStateKt.collectAsLoadableState(liteBalanceAppletTileRepository.accountAndRoutingStateFlow, gapComposer2);
                    Loadable loadable2 = (Loadable) collectAsLoadableState3.getValue();
                    loadable2.getClass();
                    if (loadable2 instanceof Loadable.Loading) {
                        Loadable loadable3 = (Loadable) collectAsLoadableState4.getValue();
                        loadable3.getClass();
                        break;
                    }
                    BalanceSnapshot balanceSnapshot = (BalanceSnapshot) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState2.getValue());
                    Boolean bool = (Boolean) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState3.getValue());
                    ?? r0 = (BalanceRepositoryModel.AccountAndRoutingState) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState4.getValue());
                    FxExchangeRate fxExchangeRate = (FxExchangeRate) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState.getValue());
                    BalanceRepositoryModel balanceRepositoryModel2 = new BalanceRepositoryModel(LazyLayoutPagerKt.balance(balanceSnapshot), r0 == 0 ? hidden : r0, Intrinsics.areEqual(bool, Boolean.TRUE), ((balanceSnapshot == null || (money = balanceSnapshot.balance) == null || (l = money.amount) == null) ? 0L : l.longValue()) > 0, null, null, fxExchangeRate != null ? StripeErrorMappingKt.convert(fxExchangeRate, LazyLayoutPagerKt.balance(balanceSnapshot)) : null);
                    gapComposer2.end(false);
                    return balanceRepositoryModel2;
                }
                gapComposer2.end(false);
                return null;
            case 3:
                RealBalanceAppletTileRepository realBalanceAppletTileRepository = (RealBalanceAppletTileRepository) obj3;
                ((Integer) obj2).getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj);
                gapComposer3.startReplaceGroup(-1915960484);
                MutableState collectAsLoadableState5 = LoadableStateKt.collectAsLoadableState(realBalanceAppletTileRepository.overdraftStatus, gapComposer3);
                MutableState collectAsLoadableState6 = LoadableStateKt.collectAsLoadableState(realBalanceAppletTileRepository.balanceSnapshot, gapComposer3);
                Loadable loadable4 = (Loadable) collectAsLoadableState5.getValue();
                loadable4.getClass();
                if (!(loadable4 instanceof Loadable.Loading)) {
                    Loadable loadable5 = (Loadable) collectAsLoadableState6.getValue();
                    loadable5.getClass();
                    if (!(loadable5 instanceof Loadable.Loading)) {
                        MutableState collectAsLoadableState7 = LoadableStateKt.collectAsLoadableState(realBalanceAppletTileRepository.addCashEnabled, gapComposer3);
                        MutableState collectAsLoadableState8 = LoadableStateKt.collectAsLoadableState(realBalanceAppletTileRepository.accountAndRoutingStateFlow, gapComposer3);
                        MutableState collectAsLoadableState9 = LoadableStateKt.collectAsLoadableState(realBalanceAppletTileRepository.restrictedBalance, gapComposer3);
                        Loadable loadable6 = (Loadable) collectAsLoadableState7.getValue();
                        loadable6.getClass();
                        if (!(loadable6 instanceof Loadable.Loading)) {
                            Loadable loadable7 = (Loadable) collectAsLoadableState8.getValue();
                            loadable7.getClass();
                            if (!(loadable7 instanceof Loadable.Loading)) {
                                Loadable loadable8 = (Loadable) collectAsLoadableState9.getValue();
                                loadable8.getClass();
                                if (!(loadable8 instanceof Loadable.Loading)) {
                                    OverdraftStatus overdraftStatus = (OverdraftStatus) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState5.getValue());
                                    BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState6.getValue());
                                    Boolean bool2 = (Boolean) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState7.getValue());
                                    ?? r8 = (BalanceRepositoryModel.AccountAndRoutingState) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState8.getValue());
                                    RestrictedBalance restrictedBalance = (RestrictedBalance) LoadableStateKt.valueOrNull((Loadable) collectAsLoadableState9.getValue());
                                    Money balance = LazyLayoutPagerKt.balance(balanceSnapshot2);
                                    BalanceRepositoryModel.AccountAndRoutingState.Hidden hidden2 = r8 == 0 ? hidden : r8;
                                    boolean areEqual = Intrinsics.areEqual(bool2, Boolean.TRUE);
                                    boolean z = ((balanceSnapshot2 == null || (money4 = balanceSnapshot2.balance) == null || (l2 = money4.amount) == null) ? 0L : l2.longValue()) > 0;
                                    if (overdraftStatus != null) {
                                        OverdraftStatus.State_ state_ = overdraftStatus.State;
                                        if (state_ != null) {
                                            OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                                            if ((eligible != null ? eligible.value : null) != null) {
                                                OverdraftStatus.Button button = overdraftStatus.footer_button_override;
                                                final String str4 = button != null ? button.client_route_url : null;
                                                pagerDefaults2 = new PagerDefaults(str4) { // from class: com.squareup.cash.banking.applets.presenters.OverdraftModel$Eligible
                                                    public final String clientRoute;

                                                    {
                                                        this.clientRoute = str4;
                                                    }

                                                    public final boolean equals(Object obj4) {
                                                        if (this == obj4) {
                                                            return true;
                                                        }
                                                        return (obj4 instanceof OverdraftModel$Eligible) && Intrinsics.areEqual(this.clientRoute, ((OverdraftModel$Eligible) obj4).clientRoute);
                                                    }

                                                    @Override // androidx.compose.foundation.pager.PagerDefaults
                                                    public final boolean getUseWarningTextColor() {
                                                        return false;
                                                    }

                                                    public final int hashCode() {
                                                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(false) * 31, 31, false);
                                                        String str5 = this.clientRoute;
                                                        return m + (str5 != null ? str5.hashCode() : 0);
                                                    }

                                                    public final String toString() {
                                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Eligible(displayAsSubtitle=false, useWarningTextColor=false, clientRoute=", this.clientRoute, ")");
                                                    }
                                                };
                                                pagerDefaults = pagerDefaults2;
                                            }
                                        }
                                        if (state_ != null) {
                                            OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                                            OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                                            if (activated2 != null) {
                                                LocalizedString localizedString2 = activated2.localized_detailed_usage_summary_label;
                                                pagerDefaults2 = (localizedString2 == null || (str2 = localizedString2.translated_value) == null) ? null : new OverdraftModel$Activated(str2);
                                                if (pagerDefaults2 == null) {
                                                    if (state_ != null) {
                                                        OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                                                        OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                                                        if (disabled2 != null && (localizedString = disabled2.localized_detailed_usage_summary_label) != null && (str = localizedString.translated_value) != null) {
                                                            Boolean bool3 = disabled2.needs_alert_treatment;
                                                            pagerDefaults2 = new OverdraftModel$Disabled(bool3 != null ? bool3.booleanValue() : false, str);
                                                        }
                                                    }
                                                    pagerDefaults2 = null;
                                                }
                                                pagerDefaults = pagerDefaults2;
                                            }
                                        }
                                        pagerDefaults2 = null;
                                        if (pagerDefaults2 == null) {
                                        }
                                        pagerDefaults = pagerDefaults2;
                                    } else {
                                        pagerDefaults = null;
                                    }
                                    if (restrictedBalance != null && (money3 = restrictedBalance.amount) != null) {
                                        Long l5 = money3.amount;
                                        l5.getClass();
                                        if (l5.longValue() > 0 && realBalanceAppletTileRepository.restrictedBalanceEnabled) {
                                            money2 = money3;
                                            BalanceRepositoryModel balanceRepositoryModel3 = new BalanceRepositoryModel(balance, hidden2, areEqual, z, pagerDefaults, money2, null);
                                            gapComposer3.end(false);
                                            return balanceRepositoryModel3;
                                        }
                                    }
                                    money2 = null;
                                    BalanceRepositoryModel balanceRepositoryModel32 = new BalanceRepositoryModel(balance, hidden2, areEqual, z, pagerDefaults, money2, null);
                                    gapComposer3.end(false);
                                    return balanceRepositoryModel32;
                                }
                            }
                        }
                    }
                }
                gapComposer3.end(false);
                return null;
            case 4:
                ((Integer) obj2).getClass();
                ((DisclosureItem) obj3).UI((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.Image((RemoteImage) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                OverdraftViewModel.Loaded.ToggleViewModel toggleViewModel = (OverdraftViewModel.Loaded.ToggleViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggleViewModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                TransfersViewModel.BankTransferContent bankTransferContent = (TransfersViewModel.BankTransferContent) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.bank_transfer_description), (Map) null, (Function1) null, false);
                    if (bankTransferContent instanceof TransfersViewModel.BankTransferContent.NoCashCard) {
                        gapComposer5.startReplaceGroup(801943954);
                        ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 16.0f, gapComposer5);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TransfersViewModel.BankTransferContent.NoCashCard) bankTransferContent).getSecondaryDescription(), (Map) null, (Function1) null, false);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(802077533);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                zzadq.BenefitsComparisonTableContent((BenefitsComparisonTableViewModel.Loaded) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = (BankingBenefitsBookletViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    for (BankingBenefitsBookletViewModel.Loaded.BookletTile bookletTile : ((BankingBenefitsBookletViewModel.Loaded) bankingBenefitsBookletViewModel).tiles) {
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer6, null);
                        BookletGridKt.m3424BookletTileeHTjO5g(null, bookletTile.title, bookletTile.subtitle, bookletTile.image, RecyclerView.DECELERATION_RATE, null, null, gapComposer6, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.BenefitsHeader((BenefitsHomeViewModel.Content.HeaderViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer questionAndAnswer = (BenefitsHubViewModel.Loaded.CommonQuestionsViewModel.QuestionAndAnswer) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, questionAndAnswer.question, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                BenefitsHubViewModel.Loaded.PageHeaderViewModel pageHeaderViewModel = (BenefitsHubViewModel.Loaded.PageHeaderViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer8, OffsetKt.m273offsetVpY3zN4$default(companion, -8.0f, RecyclerView.DECELERATION_RATE, 2), (TextStyle) null, (TextLineBalancing) null, pageHeaderViewModel.status, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                BenefitsHubViewModel.Loaded.Insight insight = (BenefitsHubViewModel.Loaded.Insight) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    String str5 = insight.hero;
                    int ordinal = insight.prominence.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            gapComposer9.startReplaceGroup(1320339731);
                            Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                            } else {
                                gapComposer9.startReplaceGroup(-1762997739);
                                gapComposer9.end(false);
                            }
                            j = colors.semantic.text.brand;
                            gapComposer9.end(false);
                        } else if (ordinal != 2) {
                            if (ordinal != 3) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer9, 1320336618, false);
                            }
                            gapComposer9.startReplaceGroup(1320342388);
                            Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                            } else {
                                gapComposer9.startReplaceGroup(-1762997739);
                                gapComposer9.end(false);
                            }
                            j = colors2.semantic.text.subtle;
                            gapComposer9.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    }
                    gapComposer9.startReplaceGroup(1320346646);
                    Colors colors3 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    j = colors3.semantic.text.standard;
                    gapComposer9.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                BenefitsHubViewModel.Loaded loaded = (BenefitsHubViewModel.Loaded) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3838, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.header.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                GreenEligibleTransactionsViewModel greenEligibleTransactionsViewModel = (GreenEligibleTransactionsViewModel) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer11, null);
                    ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer11, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, ((GreenEligibleTransactionsViewModel.Loaded) greenEligibleTransactionsViewModel).noActivityText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Merchant merchant = (Merchant) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, merchant.name, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                MerchantSection merchantSection = (MerchantSection) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, merchantSection.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel = (BitcoinBalanceWidgetViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    BitcoinBalanceWidgetKt.BalancePrimaryAmount(bitcoinBalanceWidgetViewModel.amount, null, bitcoinBalanceWidgetViewModel.rawAmount, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                BitcoinSettingsWidgetOption bitcoinSettingsWidgetOption = (BitcoinSettingsWidgetOption) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    BitcoinSettingsWidgetViewKt.PrimaryAndSecondaryText(0, gapComposer15, null, bitcoinSettingsWidgetOption.getPrimaryText(), bitcoinSettingsWidgetOption.getSecondaryText());
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer16, 6);
                    int hashCode2 = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer16, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, bitcoinMapViewModel.canPayWithLightning ? R.string.bitcoin_map_title_pay_with_bitcoin : R.string.bitcoin_map_title_bitcoin_map), (Map) null, (Function1) null, false);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, filesetUploadViewModel.attachButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                CalendarDatePickerKt.CalendarMonth((YearMonth) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                CalendarBlockerViewModel.Loaded.Toggle toggle = (CalendarBlockerViewModel.Loaded.Toggle) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                EarnerEnrollmentBlockerViewModel.Form form = (EarnerEnrollmentBlockerViewModel.Form) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer19, (Modifier) null, ((Typography) gapComposer19.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, form.individualCertificationText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                EarnerEnrollmentBlockerViewModel.CategorySelection.Category category = (EarnerEnrollmentBlockerViewModel.CategorySelection.Category) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer18;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, category.displayName, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                EarnerUpsellBlockerViewKt.EarnerUpsellBookletTile((EarnerUpsellBlockerViewModel.BookletTileContent) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                EarnerUpsellBlockerViewKt.EarnerUpsellSummaryRow((EarnerUpsellBlockerViewModel.SummaryItem) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj3;
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    OverlaysKt overlaysKt = referralCodeViewModel.header.avatar;
                    if (overlaysKt instanceof Header$Avatar$Url) {
                        gapComposer21.startReplaceGroup(-1985946308);
                        Header$Avatar$Url header$Avatar$Url = (Header$Avatar$Url) referralCodeViewModel.header.avatar;
                        AvatarSize avatarSize = AvatarSize.Size64;
                        String str6 = header$Avatar$Url.url;
                        Icons icons = Icons.ContactAdd32;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors4 = (Colors) gapComposer21.consume(staticProvidableCompositionLocal);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        AvatarImage.Remote.Image image = new AvatarImage.Remote.Image(str6, false, new AvatarImage.LocalIcon(icons, colors4.semantic.icon.standard, 4), 0L, new ReferralCodeViewKt$$ExternalSyntheticLambda12(r12 ? 1 : 0), 58);
                        Colors colors5 = (Colors) gapComposer21.consume(staticProvidableCompositionLocal);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors5.semantic.background.f1047app, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer21, 6, 28);
                        gapComposer21.end(false);
                    } else if (overlaysKt instanceof Header$Avatar$Placeholder) {
                        gapComposer21.startReplaceGroup(-1984984037);
                        Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.CircleShape);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                        Colors colors6 = (Colors) gapComposer21.consume(staticProvidableCompositionLocal2);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors6.semantic.background.brand, ColorKt.RectangleShape), 16.0f);
                        Icons icons2 = Icons.ContactAdd32;
                        Colors colors7 = (Colors) gapComposer21.consume(staticProvidableCompositionLocal2);
                        if (colors7 == null) {
                            colors7 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                        } else {
                            gapComposer21.startReplaceGroup(-1762997739);
                            gapComposer21.end(false);
                        }
                        Trace.m1191Iconww6aTOc(icons2, (String) null, m298padding3ABfNKs, colors7.semantic.icon.inverse, gapComposer21, 54, 0);
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(-1984578960);
                        gapComposer21.end(false);
                    }
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                RequestPushNotificationsBlockerViewModel.NotificationToggle notificationToggle = (RequestPushNotificationsBlockerViewModel.NotificationToggle) obj3;
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer20;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationToggle.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashtagViewKt$$ExternalSyntheticLambda10(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
