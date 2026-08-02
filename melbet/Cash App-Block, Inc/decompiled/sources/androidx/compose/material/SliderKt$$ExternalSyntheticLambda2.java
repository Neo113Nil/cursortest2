package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedFloatingPointRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(float f, Function1 function1, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange, Function0 function0, DefaultSliderColors defaultSliderColors, int i) {
        this.f$0 = f;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = closedFloatingPointRange;
        this.f$6 = function0;
        this.f$8 = defaultSliderColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$8;
        Object obj4 = this.f$6;
        Object obj5 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1572865);
                SliderKt.Slider(this.f$0, this.f$1, this.f$2, this.f$3, (ClosedFloatingPointRange) obj5, (Function0) obj4, (DefaultSliderColors) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1794433);
                CheckoutTipSectionKt.m1303CheckoutPaymentSectionPfoAEA0((LocalCheckoutPaymentSectionViewModel) obj5, this.f$1, this.f$2, (String) obj4, this.f$3, this.f$0, (PaddingValues) obj3, (Composer) obj, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(1);
                SegmentedBarChartKt.m3461ChartUR9CgXA((SegmentedBarChartViewModel) obj5, (ChartConfig) obj4, this.f$0, (List) obj3, this.f$2, this.f$3, this.f$1, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, Function1 function1, Modifier modifier, String str, boolean z, float f, PaddingValues paddingValues, int i) {
        this.f$4 = localCheckoutPaymentSectionViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$6 = str;
        this.f$3 = z;
        this.f$0 = f;
        this.f$8 = paddingValues;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda2(SegmentedBarChartViewModel segmentedBarChartViewModel, ChartConfig chartConfig, float f, List list, Modifier modifier, boolean z, Function1 function1, int i) {
        this.f$4 = segmentedBarChartViewModel;
        this.f$6 = chartConfig;
        this.f$0 = f;
        this.f$8 = list;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$1 = function1;
    }
}
