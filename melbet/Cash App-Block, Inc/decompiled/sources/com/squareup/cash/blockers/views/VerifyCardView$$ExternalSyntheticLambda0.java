package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class VerifyCardView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ VerifyInstrumentModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ VerifyCardView$$ExternalSyntheticLambda0(VerifyInstrumentModel verifyInstrumentModel, Function1 function1) {
        this.f$0 = verifyInstrumentModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        VerifyInstrumentModel verifyInstrumentModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = VerifyCardView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SsnViewKt.VerifyCardViewUi(verifyInstrumentModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                SsnViewKt.VerifyCardViewUi(verifyInstrumentModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ VerifyCardView$$ExternalSyntheticLambda0(VerifyInstrumentModel verifyInstrumentModel, Function1 function1, int i) {
        this.f$0 = verifyInstrumentModel;
        this.f$1 = function1;
    }
}
