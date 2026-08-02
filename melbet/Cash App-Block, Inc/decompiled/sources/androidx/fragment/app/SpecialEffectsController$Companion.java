package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.protos.common.Money;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SpecialEffectsController$Companion {
    public static final void LoanLimitReachedErrorContent(LocalizedMoneyFormatter.Factory factory, CheckoutScreenType.LoanLimitReachedError loanLimitReachedError, Function1 function1, Composer composer, int i) {
        int i2;
        String stringResource;
        Money money = loanLimitReachedError.creditLimit;
        factory.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1610603216);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(factory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loanLimitReachedError) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (money == null) {
                stringResource = re$$ExternalSyntheticOutline0.m(gapComposer, 1894448087, R.string.sup_loan_limit_reached_error_message_no_credit_limit, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1894548186);
                MoneyFormatter create = factory.create(MoneyFormatterConfig.COMPACT);
                money.getClass();
                stringResource = Room.stringResource(R.string.sup_loan_limit_reached_error_message, new Object[]{create.format(money)}, gapComposer);
                gapComposer.end(false);
            }
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_loan_limit_reached_error_header);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource2, stringResource, stringResource3, buttonProminence, true, null, (Function0) rememberedValue, gapComposer, 27648, 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(factory, loanLimitReachedError, function1, i, 4);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RemoveAppMessageInBackground.deepLinkSpecs;
    }

    public static DefaultSpecialEffectsController getOrCreateController(ViewGroup viewGroup, zzf zzfVar) {
        viewGroup.getClass();
        zzfVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof DefaultSpecialEffectsController) {
            return (DefaultSpecialEffectsController) tag;
        }
        DefaultSpecialEffectsController defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
        return defaultSpecialEffectsController;
    }
}
