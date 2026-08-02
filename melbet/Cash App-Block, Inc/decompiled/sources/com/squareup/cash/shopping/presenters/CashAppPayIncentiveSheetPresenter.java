package com.squareup.cash.shopping.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.viewmodels.CashAppPayIncentiveSheetViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class CashAppPayIncentiveSheetPresenter implements MoleculePresenter {
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##");
    public final Analytics analytics;
    public final CashAppPayIncentiveScreen$IncentivePromptSheetScreen args;
    public final String description;
    public final BetterNavigator.ScreenNavigator navigator;
    public final String title;

    public CashAppPayIncentiveSheetPresenter(AndroidStringManager androidStringManager, Analytics analytics, CashAppPayIncentiveScreen$IncentivePromptSheetScreen cashAppPayIncentiveScreen$IncentivePromptSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        cashAppPayIncentiveScreen$IncentivePromptSheetScreen.getClass();
        this.analytics = analytics;
        this.args = cashAppPayIncentiveScreen$IncentivePromptSheetScreen;
        this.navigator = screenNavigator;
        String format2 = DECIMAL_FORMAT.format(Float.valueOf(cashAppPayIncentiveScreen$IncentivePromptSheetScreen.discountPercentage));
        format2.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.shop_incentive_prompt_title)).format(new Object[]{format2});
        format3.getClass();
        this.title = format3;
        this.description = androidStringManager.get(R.string.shop_incentive_prompt_sheet_body);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1189273105);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ChatInputView$Content$1$1$1(this, null, 9);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, continuation, this, 15));
        CashAppPayIncentiveSheetViewModel cashAppPayIncentiveSheetViewModel = new CashAppPayIncentiveSheetViewModel(this.title, this.description);
        gapComposer.end(false);
        return cashAppPayIncentiveSheetViewModel;
    }
}
