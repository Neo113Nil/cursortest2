package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StampSheetViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda2(StampSheetViewModel stampSheetViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = stampSheetViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CanvasKt.StampSheetV2(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            default:
                CanvasKt.StampSheet(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
