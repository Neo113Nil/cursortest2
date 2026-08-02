package com.squareup.cash.savings.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import com.stripe.android.core.model.StripeJsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsScreenHeaderKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Shaker f$0;
    public final /* synthetic */ SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance f$1;

    public /* synthetic */ SavingsScreenHeaderKt$$ExternalSyntheticLambda13(Shaker shaker, SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, int i) {
        this.$r8$classId = i;
        this.f$0 = shaker;
        this.f$1 = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? shakeWith;
        int i = this.$r8$classId;
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance = this.f$1;
        Shaker shaker = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(CompositionLocalsKt.LocalDensity.defaultProvidedValue$runtime(StripeJsonUtils.nonLinearScalingDensity(gapComposer, 1)), Expect_jvmKt.rememberComposableLambda(-1512292700, new SavingsScreenHeaderKt$$ExternalSyntheticLambda13(shaker, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, i2), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier.Companion companion2 = (shaker == null || (shakeWith = SharedViewEventsKt.shakeWith(companion, shaker)) == 0) ? companion : shakeWith;
                    SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount amount = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.amount;
                    VisibleKt.m3482AnimatedAmountTextJDMA8c0(companion2, Strings.getCurrentTextStyle(gapComposer2), Strings.getColors(gapComposer2).semantic.text.standard, 3, new AnimatedAmountTextView.Amount(amount.label, amount.rawValue), null, false, 0L, gapComposer2, 0, 224);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
