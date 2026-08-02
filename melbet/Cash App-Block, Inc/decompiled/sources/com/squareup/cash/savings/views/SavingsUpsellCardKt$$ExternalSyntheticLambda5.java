package com.squareup.cash.savings.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsUpsellCardKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ UpsellCardModel$Loaded f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SavingsUpsellCardKt$$ExternalSyntheticLambda5(Modifier modifier, UpsellCardModel$Loaded upsellCardModel$Loaded, Function1 function1, int i) {
        this.f$0 = modifier;
        this.f$1 = upsellCardModel$Loaded;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Function1 function1 = this.f$2;
        Modifier modifier = this.f$0;
        UpsellCardModel$Loaded upsellCardModel$Loaded = this.f$1;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ButtonGroupKt.SavingsUpsellCard(Updater.updateChangedFlags(i2 | 1), composer, modifier, upsellCardModel$Loaded, function1);
                break;
            default:
                ButtonGroupKt.SavingsUpsellSheet(Updater.updateChangedFlags(i2 | 1), composer, modifier, upsellCardModel$Loaded, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SavingsUpsellCardKt$$ExternalSyntheticLambda5(UpsellCardModel$Loaded upsellCardModel$Loaded, Modifier modifier, Function1 function1, int i) {
        this.f$1 = upsellCardModel$Loaded;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$3 = i;
    }
}
