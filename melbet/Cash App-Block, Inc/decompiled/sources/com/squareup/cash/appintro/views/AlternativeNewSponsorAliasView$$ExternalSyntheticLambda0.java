package com.squareup.cash.appintro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import utils.AnyUtilsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AlternativeNewSponsorAliasViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0(AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel, Function1 function1) {
        this.f$0 = alternativeNewSponsorAliasViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = AlternativeNewSponsorAliasView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AnyUtilsKt.AlternativeNewSponsorAliasDialog(alternativeNewSponsorAliasViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                AnyUtilsKt.AlternativeNewSponsorAliasDialog(alternativeNewSponsorAliasViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0(AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel, Function1 function1, int i) {
        this.f$0 = alternativeNewSponsorAliasViewModel;
        this.f$1 = function1;
    }
}
