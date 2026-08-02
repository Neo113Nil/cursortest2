package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
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
public abstract class FragmentKt {
    public static final void LoanLimitReachedContent(LocalizedMoneyFormatter.Factory factory, CheckoutScreenType.LoanLimitReached loanLimitReached, Function1 function1, Composer composer, int i) {
        int i2;
        String stringResource;
        Money money = loanLimitReached.creditLimit;
        factory.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-159538972);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(factory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loanLimitReached) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (money == null) {
                stringResource = re$$ExternalSyntheticOutline0.m(gapComposer, 1703496745, R.string.sup_loan_limit_reached_message_no_credit_limit, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1703590892);
                MoneyFormatter create = factory.create(MoneyFormatterConfig.COMPACT);
                money.getClass();
                stringResource = Room.stringResource(R.string.sup_loan_limit_reached_message, new Object[]{create.format(money)}, gapComposer);
                gapComposer.end(false);
            }
            String stringResource2 = Room.stringResource(gapComposer, R.string.sup_loan_limit_reached_header);
            String stringResource3 = Room.stringResource(gapComposer, R.string.ok);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent(stringResource2, stringResource, stringResource3, buttonProminence, false, null, (Function0) rememberedValue, gapComposer, 3072, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(factory, loanLimitReached, function1, i, 3);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.RemoveAppMessageByTokenInBackground.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setFragmentResult(Bundle bundle, Fragment fragment, String str) {
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        FragmentManager.LifecycleAwareResultListener lifecycleAwareResultListener = (FragmentManager.LifecycleAwareResultListener) parentFragmentManager.mResultListeners.get(str);
        if (lifecycleAwareResultListener != null) {
            if (lifecycleAwareResultListener.mLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                lifecycleAwareResultListener.onFragmentResult(bundle, str);
                if (FragmentManager.isLoggingEnabled(2)) {
                    return;
                }
                Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
                return;
            }
        }
        parentFragmentManager.mResults.put(str, bundle);
        if (FragmentManager.isLoggingEnabled(2)) {
        }
    }
}
