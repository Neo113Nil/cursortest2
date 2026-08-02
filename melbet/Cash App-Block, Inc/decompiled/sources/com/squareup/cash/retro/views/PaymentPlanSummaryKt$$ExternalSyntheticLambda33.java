package com.squareup.cash.retro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api28Impl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda33 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda33(Modifier modifier, Function1 function1, ArrayList arrayList, int i) {
        this.$r8$classId = 1;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$2;
        Function1 function1 = this.f$1;
        ArrayList arrayList = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PaymentPlanSummaryKt.LabeledLinksSection(Updater.updateChangedFlags(1), composer, modifier, arrayList, function1);
                break;
            case 1:
                ContextCompat$Api28Impl.ReactionsBottomSheet(Updater.updateChangedFlags(1), composer, modifier, arrayList, function1);
                break;
            default:
                PaymentPlanSummaryViewKt.LabeledLinksSection(Updater.updateChangedFlags(1), composer, modifier, arrayList, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda33(ArrayList arrayList, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arrayList;
        this.f$1 = function1;
        this.f$2 = modifier;
    }
}
