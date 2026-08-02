package com.squareup.cash.sheet;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;
    public final /* synthetic */ PaddingValuesImpl f$1;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda16(ComposableLambdaImpl composableLambdaImpl, PaddingValuesImpl paddingValuesImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
        this.f$1 = paddingValuesImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PaddingValuesImpl paddingValuesImpl = this.f$1;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) paddingValuesImpl, (Object) gapComposer, (Object) 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) paddingValuesImpl, (Object) gapComposer2, (Object) 48);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
