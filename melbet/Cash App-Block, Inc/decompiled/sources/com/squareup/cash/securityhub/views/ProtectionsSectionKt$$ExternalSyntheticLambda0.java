package com.squareup.cash.securityhub.views;

import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ProtectionsSectionKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ EducationCardUiModel f$1;

    public /* synthetic */ ProtectionsSectionKt$$ExternalSyntheticLambda0(Function1 function1, EducationCardUiModel educationCardUiModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = educationCardUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        EducationCardUiModel educationCardUiModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new ProtectionsSectionViewEvent.EducationCardTapped(educationCardUiModel.id));
                break;
            default:
                function1.invoke(educationCardUiModel.id);
                break;
        }
        return Unit.INSTANCE;
    }
}
