package com.squareup.cash.bitcoin.views.deposits;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinDepositsViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealCashScreenBrightness f$0;

    public /* synthetic */ BitcoinDepositsViewKt$$ExternalSyntheticLambda0(RealCashScreenBrightness realCashScreenBrightness, int i) {
        this.$r8$classId = i;
        this.f$0 = realCashScreenBrightness;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final RealCashScreenBrightness realCashScreenBrightness = this.f$0;
        ((DisposableEffectScope) obj).getClass();
        switch (i) {
            case 0:
                realCashScreenBrightness.setScreenBrightness(1.0f);
                final int i2 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$BitcoinDepositsView$lambda$0$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        RealCashScreenBrightness realCashScreenBrightness2 = realCashScreenBrightness;
                        switch (i3) {
                            case 0:
                                realCashScreenBrightness2.setScreenBrightness(-1.0f);
                                break;
                            default:
                                realCashScreenBrightness2.setScreenBrightness(-1.0f);
                                break;
                        }
                    }
                };
            default:
                realCashScreenBrightness.setScreenBrightness(1.0f);
                final int i3 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$BitcoinDepositsView$lambda$0$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        RealCashScreenBrightness realCashScreenBrightness2 = realCashScreenBrightness;
                        switch (i32) {
                            case 0:
                                realCashScreenBrightness2.setScreenBrightness(-1.0f);
                                break;
                            default:
                                realCashScreenBrightness2.setScreenBrightness(-1.0f);
                                break;
                        }
                    }
                };
        }
    }
}
