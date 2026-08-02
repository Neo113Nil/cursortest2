package com.squareup.cash.profile.views.personal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class AutoFillSettingsDetailView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ArcadeAutofillSettingsDetailViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AutoFillSettingsDetailView$$ExternalSyntheticLambda1(ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel, Function1 function1) {
        this.f$0 = arcadeAutofillSettingsDetailViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = AutoFillSettingsDetailView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AutoFillSettingsDetailViewKt.AutoFillSettingsDetail(arcadeAutofillSettingsDetailViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                AutoFillSettingsDetailViewKt.AutoFillSettingsDetail(arcadeAutofillSettingsDetailViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AutoFillSettingsDetailView$$ExternalSyntheticLambda1(ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel, Function1 function1, int i) {
        this.f$0 = arcadeAutofillSettingsDetailViewModel;
        this.f$1 = function1;
    }
}
