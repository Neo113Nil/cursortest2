package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import com.squareup.cardcustomizations.signature.PatternStateListener;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda6(PatternStateListener patternStateListener, SignatureState signatureState, PatternStampState patternStampState, Function1 function1, float f) {
        this.f$0 = patternStateListener;
        this.f$3 = signatureState;
        this.f$4 = patternStampState;
        this.f$1 = function1;
        this.f$2 = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        float f = this.f$2;
        Function1 function1 = this.f$1;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
                ClosedFloatRange closedFloatRange2 = (ClosedFloatRange) ((ClosedFloatingPointRange) obj3);
                float f2 = (closedFloatRange2._endInclusive - closedFloatRange2._start) / 1000.0f;
                float floatValue = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
                if (Math.abs(floatValue - ((Number) mutableState.getValue()).floatValue()) > f2) {
                    float floatValue2 = ((Number) ((Comparable) mutableState.getValue())).floatValue();
                    if (floatValue2 >= closedFloatRange._start && floatValue2 <= closedFloatRange._endInclusive) {
                        mutableState.setValue(Float.valueOf(floatValue));
                    }
                }
                break;
            default:
                Pair onPatternCommitted = ((PatternStateListener) obj3).onPatternCommitted((SignatureState) obj2, (PatternStampState) obj);
                function1.invoke(new CardStudioViewEvent.ExitPatternCustomizationMode(f, ((Number) onPatternCommitted.second).intValue(), ((Number) onPatternCommitted.first).intValue()));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda6(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, float f, MutableState mutableState, ClosedFloatRange closedFloatRange) {
        this.f$0 = closedFloatingPointRange;
        this.f$1 = function1;
        this.f$2 = f;
        this.f$3 = mutableState;
        this.f$4 = closedFloatRange;
    }
}
