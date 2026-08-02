package com.squareup.cash.instruments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SelectPaymentInstrumentViewKt {
    static {
        new BalanceSnapshot("usd_balance", new Money((Long) 3421L, CurrencyCode.USD, 4), 0L);
        Instrument instrument = new Instrument("Debit 2222", CashInstrumentType.DEBIT_CARD, (InstrumentType) null, "2222", "The Bank", "fake:///chase.png", (String) null, "Visa Debit 1234", "Debit", (Boolean) null, "fake:///chase.png", (String) null, (String) null, true, (String) null, (Long) 0L, 81920);
        CashInstrumentType cashInstrumentType = CashInstrumentType.CREDIT_CARD;
        InstrumentType instrumentType = InstrumentType.MASTER_CARD;
        cashInstrumentType.getClass();
        new Instrument("credit card", cashInstrumentType, instrumentType, "1111", "El Banco", (String) null, (String) null, "Credit", "Debit", (Boolean) null, "fake:///chase.png", (String) null, (String) null, true, instrument.cardImageUrl, (Long) 0L, (String) null);
    }

    public static final void SelectPaymentInstrument(SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-267078180);
        int i2 = (gapComposer.changedInstance(selectPaymentInstrumentViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1149448049, new SelectPaymentInstrumentView$$ExternalSyntheticLambda0(selectPaymentInstrumentViewModel, function1, 1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) selectPaymentInstrumentViewModel, function1, i, 6);
        }
    }
}
