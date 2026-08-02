package com.squareup.cash.paychecks.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EditDistributionViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ EditDistributionViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda10(EditDistributionViewModel.Content content, Modifier modifier, Function1 function1, int i) {
        this.f$0 = content;
        this.f$2 = modifier;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                HelpSheetViewKt.EditDistributionContent(Updater.updateChangedFlags(1), composer, this.f$2, this.f$0, this.f$1);
                break;
            default:
                HelpSheetViewKt.Controls(Updater.updateChangedFlags(1), composer, this.f$2, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda10(EditDistributionViewModel.Content content, Function1 function1, Modifier modifier, int i) {
        this.f$0 = content;
        this.f$1 = function1;
        this.f$2 = modifier;
    }
}
