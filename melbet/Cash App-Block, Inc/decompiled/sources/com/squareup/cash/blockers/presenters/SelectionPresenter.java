package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$model$1;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SelectionOption;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public final class SelectionPresenter implements MoleculePresenter {
    public final boolean allowDialogs;
    public final BlockersScreens.SelectionScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final IntentLauncher launcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final StateFlowImpl loading = FlowKt.MutableStateFlow(Boolean.FALSE);
    public final StateFlowImpl errorMessages = FlowKt.MutableStateFlow(null);

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectionOption.Hint.values().length];
            try {
                iArr[SelectionOption.Hint.CANCEL_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelectionPresenter(BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, IntentLauncher intentLauncher, LocalizedMoneyFormatter.Factory factory, BlockersScreens.SelectionScreen selectionScreen, boolean z, BetterNavigator.ScreenNavigator screenNavigator) {
        this.blockersNavigator = blockersDataNavigator;
        this.launcher = intentLauncher;
        this.args = selectionScreen;
        this.allowDialogs = z;
        this.navigator = screenNavigator;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public final Unit handleError(BlockersHelper.BlockersAction.ShowError showError) {
        if (this.allowDialogs) {
            this.navigator.goTo(new FailureMessageBlockerScreen(((BlockersScreens.SelectionFullScreen) this.args).blockersData, showError.message, null, 4));
            return Unit.INSTANCE;
        }
        this.errorMessages.setValue(showError.message);
        Unit unit = Unit.INSTANCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1074853282);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        BlockersScreens.SelectionScreen selectionScreen = this.args;
        Continuation continuation = null;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = FlowKt.combine(new AppLockMonitor$special$$inlined$map$2(selectionScreen, 19), this.loading, this.errorMessages, new RealStyledCardPresenter$model$1(this, continuation, 1));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, viewModelFor(selectionScreen, false, null), null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new PasscodePresenter$models$1$2(flow, continuation, this, 26));
        SelectionViewModel selectionViewModel = (SelectionViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return selectionViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelectionViewModel viewModelFor(BlockersScreens.SelectionScreen selectionScreen, boolean z, String str) {
        boolean z2;
        List list;
        List list2;
        SelectionOption selectionOption = ((BlockersScreens.SelectionFullScreen) selectionScreen).primaryOption;
        SelectionOption.Hint hint = selectionOption != null ? selectionOption.hint : null;
        SelectionOption.Hint hint2 = SelectionOption.Hint.CANCEL_BUTTON;
        if (hint != hint2) {
            BlockersScreens.SelectionFullScreen selectionFullScreen = (BlockersScreens.SelectionFullScreen) selectionScreen;
            SelectionOption selectionOption2 = selectionFullScreen.secondaryOption;
            if ((selectionOption2 != null ? selectionOption2.hint : null) != hint2) {
                List list3 = selectionFullScreen.options;
                if (list3 != null) {
                    List list4 = list3;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            if (((SelectionOption) it.next()).hint == SelectionOption.Hint.CANCEL_BUTTON) {
                            }
                        }
                    }
                }
                z2 = false;
                boolean z3 = z2;
                BlockersScreens.SelectionFullScreen selectionFullScreen2 = (BlockersScreens.SelectionFullScreen) selectionScreen;
                String str2 = selectionFullScreen2.headerText;
                Redacted redacted = selectionFullScreen2.mainText;
                String str3 = redacted == null ? (String) redacted.getValue() : null;
                SelectionBlocker.Icon icon = selectionFullScreen2.icon;
                list = selectionFullScreen2.options;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                List list5 = list;
                String str4 = selectionFullScreen2.footerText;
                list2 = selectionFullScreen2.helpItems;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                List list6 = list2;
                SelectionOption selectionOption3 = selectionFullScreen2.primaryOption;
                SelectionOption selectionOption4 = selectionFullScreen2.secondaryOption;
                Money money = selectionFullScreen2.amount;
                return new SelectionViewModel(str2, str3, icon, list5, str4, list6, selectionOption3, selectionOption4, z, money != null ? this.moneyFormatter.format(money) : null, str, z3, selectionFullScreen2.detailRows);
            }
        }
        z2 = true;
        boolean z32 = z2;
        BlockersScreens.SelectionFullScreen selectionFullScreen22 = (BlockersScreens.SelectionFullScreen) selectionScreen;
        String str22 = selectionFullScreen22.headerText;
        Redacted redacted2 = selectionFullScreen22.mainText;
        if (redacted2 == null) {
        }
        SelectionBlocker.Icon icon2 = selectionFullScreen22.icon;
        list = selectionFullScreen22.options;
        if (list == null) {
        }
        List list52 = list;
        String str42 = selectionFullScreen22.footerText;
        list2 = selectionFullScreen22.helpItems;
        if (list2 == null) {
        }
        List list62 = list2;
        SelectionOption selectionOption32 = selectionFullScreen22.primaryOption;
        SelectionOption selectionOption42 = selectionFullScreen22.secondaryOption;
        Money money2 = selectionFullScreen22.amount;
        return new SelectionViewModel(str22, str3, icon2, list52, str42, list62, selectionOption32, selectionOption42, z, money2 != null ? this.moneyFormatter.format(money2) : null, str, z32, selectionFullScreen22.detailRows);
    }
}
