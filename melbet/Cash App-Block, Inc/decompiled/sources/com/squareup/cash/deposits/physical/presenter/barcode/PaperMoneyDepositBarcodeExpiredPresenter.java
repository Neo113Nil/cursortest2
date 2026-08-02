package com.squareup.cash.deposits.physical.presenter.barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositBarcodeExpiredPresenter implements MoleculePresenter {
    public final PaperMoneyDepositBarcodeFailedScreen args;
    public final RealCashDepositBarcodeManager barcodeManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public PaperMoneyDepositBarcodeExpiredPresenter(PaperMoneyDepositBarcodeFailedScreen paperMoneyDepositBarcodeFailedScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, RealCashDepositBarcodeManager realCashDepositBarcodeManager) {
        paperMoneyDepositBarcodeFailedScreen.getClass();
        this.args = paperMoneyDepositBarcodeFailedScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.barcodeManager = realCashDepositBarcodeManager;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-815334779);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            FormBlocker.Element element = new FormBlocker.Element("error-icon", new FormBlocker.Element.AbstractC0072Element.LocalImageElement(new FormBlocker.Element.LocalImageElement(FormBlocker.Element.LocalImageElement.Icon.ACTION_REQUIRED, null, null, 6, null)), null, 4, null);
            PaperMoneyDepositBarcodeFailedScreen paperMoneyDepositBarcodeFailedScreen = this.args;
            String str = paperMoneyDepositBarcodeFailedScreen.titleText;
            AndroidStringManager androidStringManager = this.stringManager;
            if (str == null) {
                str = androidStringManager.get(R.string.barcode_failed_title);
            }
            FormBlocker.Element element2 = new FormBlocker.Element("title", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(str, null, FormBlocker.Element.TextElement.Size.LARGE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null);
            String str2 = paperMoneyDepositBarcodeFailedScreen.detailText;
            if (str2 == null) {
                str2 = androidStringManager.get(R.string.barcode_failed_details);
            }
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{element, element2, new FormBlocker.Element("detail", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(str2, null, FormBlocker.Element.TextElement.Size.MEDIUM, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null)});
            String str3 = paperMoneyDepositBarcodeFailedScreen.closeText;
            if (str3 == null) {
                str3 = androidStringManager.get(R.string.barcode_failed_action);
            }
            rememberedValue = Updater.mutableStateOf$default(new PaperMoneyDepositBarcodeExpiredViewModel.Expired(new FormViewModel(listOf, false, null, null, str3, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, 1046568)));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState, 19));
        PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel = (PaperMoneyDepositBarcodeExpiredViewModel) mutableState.getValue();
        gapComposer.end(false);
        return paperMoneyDepositBarcodeExpiredViewModel;
    }
}
