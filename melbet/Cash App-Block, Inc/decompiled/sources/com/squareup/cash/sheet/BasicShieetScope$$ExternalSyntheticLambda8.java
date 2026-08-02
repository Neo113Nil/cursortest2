package com.squareup.cash.sheet;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda8(long j, Modifier modifier, TextStyle textStyle, long j2, Function0 function0, int i) {
        this.$r8$classId = 4;
        this.f$1 = j;
        this.f$2 = modifier;
        this.f$0 = textStyle;
        this.f$3 = j2;
        this.f$4 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$4;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                ((BasicShieetScope) obj4).m3746DragHandle9Us8nR8(this.f$1, this.f$2, this.f$3, (RoundedCornerShape) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                BitcoinPerformanceDetailsContentKt.m3419BitcoinPerformanceDetailsSectiont6yy7ic((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection) obj4, (Function1) obj3, this.f$1, this.f$3, this.f$2, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(3073);
                CanvasKt.MoodHeatEffect(this.f$2, (Integer) obj4, (Function1) obj3, this.f$1, this.f$3, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(49);
                ((CoreFlowBasicShieetScope) obj4).m3708DragHandle9Us8nR8(this.f$1, this.f$2, this.f$3, (RoundedCornerShape) obj3, (Composer) obj, updateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(1);
                DisclaimerTextKt.m3806ElapsedTimeTimeruDo3WH8(this.f$1, this.f$2, (TextStyle) obj4, this.f$3, (Function0) obj3, (Composer) obj, updateChangedFlags5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda8(Modifier modifier, Integer num, Function1 function1, long j, long j2, int i) {
        this.$r8$classId = 2;
        this.f$2 = modifier;
        this.f$0 = num;
        this.f$4 = function1;
        this.f$1 = j;
        this.f$3 = j2;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda8(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSection bitcoinPerformanceDetailsSection, Function1 function1, long j, long j2, Modifier modifier, int i) {
        this.$r8$classId = 1;
        this.f$0 = bitcoinPerformanceDetailsSection;
        this.f$4 = function1;
        this.f$1 = j;
        this.f$3 = j2;
        this.f$2 = modifier;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda8(Object obj, long j, Modifier modifier, long j2, RoundedCornerShape roundedCornerShape, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = modifier;
        this.f$3 = j2;
        this.f$4 = roundedCornerShape;
    }
}
