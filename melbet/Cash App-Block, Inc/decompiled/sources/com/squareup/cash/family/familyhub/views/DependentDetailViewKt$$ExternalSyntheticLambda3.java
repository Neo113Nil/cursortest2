package com.squareup.cash.family.familyhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentDetailViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ DependentDetailViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ DependentDetailViewKt$$ExternalSyntheticLambda3(DependentDetailViewModel dependentDetailViewModel, Modifier modifier, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$1 = dependentDetailViewModel;
        this.f$0 = modifier;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DependentDetailViewKt.DependentDetail(Updater.updateChangedFlags(1), composer, this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                AllowanceViewKt.DependentDetailBalanceHeader(Updater.updateChangedFlags(1), composer, this.f$0, this.f$1, this.f$2);
                break;
            default:
                DependentDetailViewKt.DependentDetailsContent(Updater.updateChangedFlags(1), composer, this.f$0, this.f$1, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DependentDetailViewKt$$ExternalSyntheticLambda3(Modifier modifier, DependentDetailViewModel dependentDetailViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = dependentDetailViewModel;
        this.f$2 = function1;
    }
}
