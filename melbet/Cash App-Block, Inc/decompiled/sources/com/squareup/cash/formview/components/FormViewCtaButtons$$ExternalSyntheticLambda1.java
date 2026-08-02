package com.squareup.cash.formview.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormViewCtaButtons$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ FormViewCtaButtons f$0;

    public /* synthetic */ FormViewCtaButtons$$ExternalSyntheticLambda1(FormViewCtaButtons formViewCtaButtons) {
        this.f$0 = formViewCtaButtons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FormViewCtaButtons formViewCtaButtons = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = FormViewCtaButtons.$r8$clinit;
                formViewCtaButtons.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                String str = (String) obj;
                int i3 = FormViewCtaButtons.$r8$clinit;
                str.getClass();
                ((String) obj2).getClass();
                StateFlowKt.emitOrThrow(formViewCtaButtons.disclaimer.clicks, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FormViewCtaButtons$$ExternalSyntheticLambda1(FormViewCtaButtons formViewCtaButtons, int i) {
        this.f$0 = formViewCtaButtons;
    }
}
