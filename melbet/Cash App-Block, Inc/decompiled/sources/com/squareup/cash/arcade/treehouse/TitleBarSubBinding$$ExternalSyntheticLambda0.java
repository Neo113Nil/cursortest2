package com.squareup.cash.arcade.treehouse;

import com.squareup.cash.arcade.treehouse.TitleBarSubBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class TitleBarSubBinding$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TitleBarSubBinding f$0;

    public /* synthetic */ TitleBarSubBinding$$ExternalSyntheticLambda0(TitleBarSubBinding titleBarSubBinding, int i) {
        this.$r8$classId = i;
        this.f$0 = titleBarSubBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TitleBarSubBinding titleBarSubBinding = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) titleBarSubBinding.navigationCallback$delegate.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 1:
                int i2 = TitleBarSubBinding.$r8$clinit;
                Function0 function02 = ((TitleBarSubBinding.ActionBinding) titleBarSubBinding.primaryAction$delegate.getValue()).callback;
                if (function02 != null) {
                    function02.invoke();
                }
                break;
            default:
                int i3 = TitleBarSubBinding.$r8$clinit;
                Function0 function03 = ((TitleBarSubBinding.ActionBinding) titleBarSubBinding.secondaryAction$delegate.getValue()).callback;
                if (function03 != null) {
                    function03.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
