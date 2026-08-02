package com.squareup.cash.phoneplans;

import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewEvent;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PhonePlansEsimCheckViewModel.Cta f$1;

    public /* synthetic */ PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7(Function1 function1, PhonePlansEsimCheckViewModel.Cta cta, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = cta;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PhonePlansEsimCheckViewModel.Cta cta = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new PhonePlansEsimCheckViewEvent.CtaClicked(cta.action));
                break;
            case 1:
                function1.invoke(new PhonePlansEsimCheckViewEvent.CtaClicked(cta.action));
                break;
            default:
                function1.invoke(new PhonePlansEsimCheckViewEvent.CtaClicked(cta.action));
                break;
        }
        return Unit.INSTANCE;
    }
}
