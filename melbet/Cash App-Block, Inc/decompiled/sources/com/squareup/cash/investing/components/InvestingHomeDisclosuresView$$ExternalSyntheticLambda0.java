package com.squareup.cash.investing.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingHomeDisclosuresView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingHomeDisclosuresView f$0;

    public /* synthetic */ InvestingHomeDisclosuresView$$ExternalSyntheticLambda0(InvestingHomeDisclosuresView investingHomeDisclosuresView) {
        this.$r8$classId = 2;
        this.f$0 = investingHomeDisclosuresView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingHomeDisclosuresView investingHomeDisclosuresView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = InvestingHomeDisclosuresView.$r8$clinit;
                investingHomeDisclosuresView.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = InvestingHomeDisclosuresView.$r8$clinit;
                investingHomeDisclosuresView.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                String str = (String) obj;
                int i4 = InvestingHomeDisclosuresView.$r8$clinit;
                str.getClass();
                ((String) obj2).getClass();
                Function1 function1 = investingHomeDisclosuresView.onLinkClick;
                if (function1 != null) {
                    function1.invoke(str);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingHomeDisclosuresView$$ExternalSyntheticLambda0(InvestingHomeDisclosuresView investingHomeDisclosuresView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = investingHomeDisclosuresView;
    }
}
