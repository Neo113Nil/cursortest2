package com.squareup.cash.core.navigationcontainer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class AcceptableScrim$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AcceptableScrim f$0;

    public /* synthetic */ AcceptableScrim$$ExternalSyntheticLambda0(AcceptableScrim acceptableScrim) {
        this.f$0 = acceptableScrim;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AcceptableScrim acceptableScrim = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    acceptableScrim.Content(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                acceptableScrim.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AcceptableScrim$$ExternalSyntheticLambda0(AcceptableScrim acceptableScrim, int i) {
        this.f$0 = acceptableScrim;
    }
}
