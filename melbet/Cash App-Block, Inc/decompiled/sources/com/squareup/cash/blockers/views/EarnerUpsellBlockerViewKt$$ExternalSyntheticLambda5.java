package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.size.DimensionKt;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerUpsellBlockerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(int i, EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1) {
        this.$r8$classId = 3;
        this.f$0 = earnerUpsellBlockerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    EarnerUpsellBlockerViewKt.EarnerUpsellCta(earnerUpsellBlockerViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    EarnerUpsellBlockerViewKt.EarnerUpsellCta(earnerUpsellBlockerViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                int intValue3 = num.intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-112012679, new EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda3(i2, earnerUpsellBlockerViewModel, function1), gapComposer3), gapComposer3, 24576, 15);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                EarnerUpsellBlockerViewKt.EarnerUpsellCta(earnerUpsellBlockerViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = earnerUpsellBlockerViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ EarnerUpsellBlockerViewKt$$ExternalSyntheticLambda5(Function1 function1, EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel) {
        this.$r8$classId = 2;
        this.f$1 = function1;
        this.f$0 = earnerUpsellBlockerViewModel;
    }
}
