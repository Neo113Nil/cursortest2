package com.squareup.cash.moneybot.genie;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DatePickerViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ TextStyle f$0;

    public /* synthetic */ DatePickerViewKt$$ExternalSyntheticLambda5(TextStyle textStyle) {
        this.f$0 = textStyle;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    TextKt.m561TextNvy7gAk("yyyy-MM-dd", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, this.f$0, gapComposer, 6, 0, 131070);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                EarningsStreamDetailKt.ShimmerLine(this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
