package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class SnapFlingBehaviorKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Ref$FloatRef f$1;
    public final /* synthetic */ ScrollScope f$2;
    public final /* synthetic */ Function1 f$3;

    public /* synthetic */ SnapFlingBehaviorKt$$ExternalSyntheticLambda0(float f, Ref$FloatRef ref$FloatRef, ScrollScope scrollScope, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = ref$FloatRef;
        this.f$2 = scrollScope;
        this.f$3 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        int i = this.$r8$classId;
        Function1 function1 = this.f$3;
        ScrollScope scrollScope = this.f$2;
        Ref$FloatRef ref$FloatRef = this.f$1;
        float f2 = this.f$0;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                float abs = Math.abs(((Number) animationScope.value$delegate.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.value$delegate;
                if (abs >= abs2) {
                    float coerceToTarget = zzacp.coerceToTarget(((Number) parcelableSnapshotMutableState.getValue()).floatValue(), f2);
                    zzacp.animateDecay$consumeDelta(animationScope, scrollScope, function1, coerceToTarget - ref$FloatRef.element);
                    animationScope.cancelAnimation();
                    ref$FloatRef.element = coerceToTarget;
                } else {
                    zzacp.animateDecay$consumeDelta(animationScope, scrollScope, function1, ((Number) parcelableSnapshotMutableState.getValue()).floatValue() - ref$FloatRef.element);
                    ref$FloatRef.element = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
                }
                break;
            default:
                float coerceToTarget2 = zzacp.coerceToTarget(((Number) animationScope.value$delegate.getValue()).floatValue(), f2);
                float f3 = coerceToTarget2 - ref$FloatRef.element;
                try {
                    f = scrollScope.scrollBy(f3);
                } catch (CancellationException unused) {
                    animationScope.cancelAnimation();
                    f = RecyclerView.DECELERATION_RATE;
                }
                function1.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || coerceToTarget2 != ((Number) animationScope.value$delegate.getValue()).floatValue()) {
                    animationScope.cancelAnimation();
                }
                ref$FloatRef.element += f;
                break;
        }
        return Unit.INSTANCE;
    }
}
