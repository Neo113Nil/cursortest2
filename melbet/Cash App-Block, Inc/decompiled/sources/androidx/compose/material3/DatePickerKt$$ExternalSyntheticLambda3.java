package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.fidesmo.views.ScanningCardPulseParams;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseParams;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.squareup.cash.fidesmo.views.ScanningStarPulseParams;
import com.squareup.cash.fidesmo.views.ScanningStepAnimationTrigger;
import com.stripe.android.uicore.elements.SectionUIKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ float f$6;
    public final /* synthetic */ Function f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda3(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, DatePickerColors datePickerColors, TextStyle textStyle, float f, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = function2;
        this.f$2 = function22;
        this.f$3 = function23;
        this.f$4 = datePickerColors;
        this.f$5 = textStyle;
        this.f$6 = f;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Function function = this.f$7;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                DatePickerKt.m525DateEntryContainerau3_HiA(this.f$0, (Function2) obj7, (Function2) obj6, (Function2) obj5, (DatePickerColors) obj4, (TextStyle) obj3, this.f$6, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ListUnorderedKt.ListUnorderedItem((ListUnorderedState) obj4, (ListUnorderedProminence) obj3, this.f$6, this.f$0, (ComposableLambdaImpl) function, (Function2) obj7, (Function2) obj6, (Function2) obj5, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                SectionUIKt.ScanningCardPulse(this.f$0, (ScanningCardPulseParams) obj7, (ScanningStepAnimationTrigger) obj6, (Integer) obj5, this.f$6, (Function0) obj4, (Function0) obj3, (Function0) function, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                ScanningHeartPulseKt.ScanningHeartPulse(this.f$0, (ScanningHeartPulseParams) obj7, (ScanningStepAnimationTrigger) obj6, (Integer) obj5, this.f$6, (Function0) obj4, (Function0) obj3, (Function0) function, (Composer) obj, updateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                ScanningStarPulseKt.ScanningStarPulse(this.f$0, (ScanningStarPulseParams) obj7, (ScanningStepAnimationTrigger) obj6, (Integer) obj5, this.f$6, (Function0) obj4, (Function0) obj3, (Function0) function, (Composer) obj, updateChangedFlags5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda3(Modifier modifier, Object obj, ScanningStepAnimationTrigger scanningStepAnimationTrigger, Integer num, float f, Function0 function0, Function0 function02, Function0 function03, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$2 = scanningStepAnimationTrigger;
        this.f$3 = num;
        this.f$6 = f;
        this.f$4 = function0;
        this.f$5 = function02;
        this.f$7 = function03;
        this.f$8 = i;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda3(ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, float f, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function2 function22, Function2 function23, int i) {
        this.$r8$classId = 1;
        this.f$4 = listUnorderedState;
        this.f$5 = listUnorderedProminence;
        this.f$6 = f;
        this.f$0 = modifier;
        this.f$7 = composableLambdaImpl;
        this.f$1 = function2;
        this.f$2 = function22;
        this.f$3 = function23;
        this.f$8 = i;
    }
}
