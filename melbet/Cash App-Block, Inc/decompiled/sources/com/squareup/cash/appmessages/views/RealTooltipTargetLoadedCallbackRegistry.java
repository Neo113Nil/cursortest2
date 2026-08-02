package com.squareup.cash.appmessages.views;

import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class RealTooltipTargetLoadedCallbackRegistry {
    public BankingDialogKt$$ExternalSyntheticLambda5 animateInCallback;

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealTooltipTargetLoadedCallbackRegistry();
        }
    }
}
