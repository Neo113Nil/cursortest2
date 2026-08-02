package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PaymentClaimPresenter implements MoleculePresenter {
    public final AppService appService;
    public final PaymentScreens.PaymentClaim args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final FlowStarter flowStarter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;
    public final AndroidStringManager stringManager;

    public final class Companion {
        public static final StatusResult access$statusResult(String str, String str2) {
            return new StatusResult(StatusResult.Icon.FAILURE, str, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, str2, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
        }
    }

    public PaymentClaimPresenter(FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, AppService appService, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, PaymentScreens.PaymentClaim paymentClaim, BetterNavigator.ScreenNavigator screenNavigator) {
        paymentClaim.getClass();
        this.flowStarter = flowStarter;
        this.blockersDataNavigator = blockersDataNavigator;
        this.appService = appService;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.args = paymentClaim;
        this.navigator = screenNavigator;
    }

    public final PaymentClaimViewModel.Initial createViewModel(String str) {
        AndroidStringManager androidStringManager = this.stringManager;
        if (str == null || str.length() == 0) {
            return new PaymentClaimViewModel.Initial(androidStringManager.get(R.string.payment_claim_message_no_cashtag));
        }
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.payment_claim_message_cashtag)).format(new Object[]{str});
        format2.getClass();
        return new PaymentClaimViewModel.Initial(format2);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        PaymentClaimPresenter paymentClaimPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(747462690);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(createViewModel(null));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = this.profileManager.publicProfile();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        PublicProfile publicProfile = (PublicProfile) Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2).getValue();
        if (publicProfile != null) {
            gapComposer.startReplaceGroup(-1106477359);
            paymentClaimPresenter = this;
            Updater.LaunchedEffect(gapComposer, publicProfile, new DotGridKt$DotGrid$3$1(19, mutableState, paymentClaimPresenter, publicProfile, continuation));
            gapComposer.end(false);
        } else {
            paymentClaimPresenter = this;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(8, mutableState, (MoleculePresenter) paymentClaimPresenter, (Object) flow, continuation));
        PaymentClaimViewModel paymentClaimViewModel = (PaymentClaimViewModel) mutableState.getValue();
        gapComposer.end(false);
        return paymentClaimViewModel;
    }
}
