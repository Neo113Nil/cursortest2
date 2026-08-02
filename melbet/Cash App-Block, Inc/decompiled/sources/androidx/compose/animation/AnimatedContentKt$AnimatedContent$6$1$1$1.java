package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.datastore.core.SimpleActor;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$1$1 extends Lambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedContentKt$AnimatedContent$6$1$1$1(Object obj, int i) {
        super(3);
        this.$r8$classId = i;
        this.$specOnEnter = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$specOnEnter;
        switch (i) {
            case 0:
                Placeable mo833measureBRTryo0 = ((Measurable) obj2).mo833measureBRTryo0(((Constraints) obj3).value);
                return MeasureScope.layout$default((MeasureScope) obj, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new SimpleActor.AnonymousClass1(1, mo833measureBRTryo0, (ContentTransform) obj4));
            default:
                LookaheadScope lookaheadScope = (LookaheadScope) obj;
                ((Number) obj3).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SharedTransitionScopeImpl(lookaheadScope, coroutineScope);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) rememberedValue2;
                ((ComposableLambdaImpl) obj4).invoke((Object) sharedTransitionScopeImpl, (Object) new SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl), (Object) gapComposer, (Object) 6);
                return Unit.INSTANCE;
        }
    }
}
