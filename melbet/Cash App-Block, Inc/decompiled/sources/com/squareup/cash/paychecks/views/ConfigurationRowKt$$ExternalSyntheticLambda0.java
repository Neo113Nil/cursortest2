package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ConfigurationRowKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ EditDistributionViewModel.Content.Configuration f$1;

    public /* synthetic */ ConfigurationRowKt$$ExternalSyntheticLambda0(Function1 function1, EditDistributionViewModel.Content.Configuration configuration, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = configuration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        EditDistributionViewModel.Content.Configuration configuration = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(configuration.action.action);
                return Unit.INSTANCE;
            default:
                function1.invoke(configuration.action.action);
                return Boolean.TRUE;
        }
    }
}
