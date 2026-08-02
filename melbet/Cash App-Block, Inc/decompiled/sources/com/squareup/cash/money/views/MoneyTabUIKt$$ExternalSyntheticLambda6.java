package com.squareup.cash.money.views;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.squareup.cash.moneybot.components.api.LocalMoneybotPluginRegistryKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 13:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry;
                break;
            case 15:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                break;
            case 16:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = MoneybotThemeKt.LocalMoneybotColors;
                break;
            case 25:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled;
                break;
            case 26:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentAnimationsReady;
                break;
            case 27:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentAnimationsReady;
                break;
        }
        return Unit.INSTANCE;
    }
}
