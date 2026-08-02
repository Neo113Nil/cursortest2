package com.google.android.datatransport.runtime.logging;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.error.PhysicalDepositErrorViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccount;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public abstract class Logging {
    public static final void PaperMoneyDepositErrorModal(PhysicalDepositErrorViewModel physicalDepositErrorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        physicalDepositErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1401074427);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(physicalDepositErrorViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(278130512, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(5, physicalDepositErrorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(physicalDepositErrorViewModel, function1, i, i3);
        }
    }

    public static void d(String str, String str2, Object obj) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static void e(Exception exc, String str, String str2) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static final PaymentAccount setUsesMicrodepositsIfNeeded(PaymentAccount paymentAccount, boolean z) {
        if (!(paymentAccount instanceof BankAccount)) {
            if (paymentAccount instanceof FinancialConnectionsAccount) {
                return paymentAccount;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        BankAccount bankAccount = (BankAccount) paymentAccount;
        String str = bankAccount.id;
        String str2 = bankAccount.last4;
        String str3 = bankAccount.bankName;
        String str4 = bankAccount.routingNumber;
        str.getClass();
        str2.getClass();
        return new BankAccount(str, str2, str3, str4, z);
    }

    public static final FinancialConnectionsSession update(FinancialConnectionsSession financialConnectionsSession, FinancialConnectionsSessionManifest financialConnectionsSessionManifest) {
        financialConnectionsSession.getClass();
        boolean z = financialConnectionsSessionManifest != null ? financialConnectionsSessionManifest.manualEntryUsesMicrodeposits : false;
        PaymentAccount paymentAccount = financialConnectionsSession.paymentAccount;
        return FinancialConnectionsSession.copy$default(financialConnectionsSession, paymentAccount != null ? setUsesMicrodepositsIfNeeded(paymentAccount, z) : null);
    }
}
