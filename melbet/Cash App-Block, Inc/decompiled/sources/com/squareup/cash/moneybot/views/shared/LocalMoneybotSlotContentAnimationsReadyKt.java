package com.squareup.cash.moneybot.views.shared;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;

/* loaded from: classes6.dex */
public abstract class LocalMoneybotSlotContentAnimationsReadyKt {
    public static final StaticProvidableCompositionLocal LocalMoneybotSlotContentAnimationsReady = new StaticProvidableCompositionLocal(new MoneyTabUIKt$$ExternalSyntheticLambda6(26));
    public static final StaticProvidableCompositionLocal LocalMoneybotSlotContentShouldAnimate = new StaticProvidableCompositionLocal(new MoneyTabUIKt$$ExternalSyntheticLambda6(26));
    public static final StaticProvidableCompositionLocal LocalMoneybotSlotContentAnimationResetKey = new StaticProvidableCompositionLocal(new MoneyTabUIKt$$ExternalSyntheticLambda6(27));

    public static final boolean moneybotSlotContentAnimationsReady(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        if (!((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue()) {
            gapComposer.startReplaceGroup(-382523241);
            gapComposer.end(false);
            return true;
        }
        gapComposer.startReplaceGroup(-982168200);
        boolean booleanValue = ((Boolean) gapComposer.consume(LocalMoneybotSlotContentAnimationsReady)).booleanValue();
        gapComposer.end(false);
        return booleanValue;
    }

    public static final boolean moneybotSlotContentShouldAnimate(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        if (!((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue()) {
            gapComposer.startReplaceGroup(960144311);
            gapComposer.end(false);
            return false;
        }
        gapComposer.startReplaceGroup(862256350);
        boolean booleanValue = ((Boolean) gapComposer.consume(LocalMoneybotSlotContentShouldAnimate)).booleanValue();
        gapComposer.end(false);
        return booleanValue;
    }
}
