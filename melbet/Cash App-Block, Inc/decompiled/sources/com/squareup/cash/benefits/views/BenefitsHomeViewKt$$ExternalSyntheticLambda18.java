package com.squareup.cash.benefits.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsHomeViewKt$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BenefitsComparisonTableViewModel f$0;

    public /* synthetic */ BenefitsHomeViewKt$$ExternalSyntheticLambda18(BenefitsComparisonTableViewModel benefitsComparisonTableViewModel, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = benefitsComparisonTableViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BenefitsComparisonTableViewModel benefitsComparisonTableViewModel = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BenefitsHomeViewKt.BenefitsTable(benefitsComparisonTableViewModel, composer, Updater.updateChangedFlags(1));
                break;
            default:
                zzadq.BenefitsComparisonTable(benefitsComparisonTableViewModel, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
