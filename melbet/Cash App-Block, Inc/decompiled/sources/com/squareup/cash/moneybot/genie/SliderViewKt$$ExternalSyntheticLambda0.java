package com.squareup.cash.moneybot.genie;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes6.dex */
public final /* synthetic */ class SliderViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GenieStateBinding f$0;

    public /* synthetic */ SliderViewKt$$ExternalSyntheticLambda0(GenieStateBinding genieStateBinding, int i) {
        this.$r8$classId = i;
        this.f$0 = genieStateBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        GenieStateBinding genieStateBinding = this.f$0;
        switch (i) {
            case 0:
                genieStateBinding.setValue(Double.valueOf(((Float) obj).floatValue()));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                genieStateBinding.setValue(bool);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                genieStateBinding.setValue(str);
                break;
        }
        return Unit.INSTANCE;
    }
}
