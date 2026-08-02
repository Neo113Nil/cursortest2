package com.squareup.cash.limits.views.arcade;

import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import coil3.svg.internal.ParseSvg_androidKt;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FlatLimitsViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LimitsViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ FlatLimitsViewKt$$ExternalSyntheticLambda1(LimitsViewModel limitsViewModel, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = limitsViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ParseSvg_androidKt.FlatLimitsContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                AppCompatHintHelper.GroupedLimitsContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
