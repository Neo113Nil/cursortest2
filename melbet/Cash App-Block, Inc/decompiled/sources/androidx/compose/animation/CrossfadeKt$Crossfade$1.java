package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class CrossfadeKt$Crossfade$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Object $animationSpec;
    public final /* synthetic */ Function $content;
    public final /* synthetic */ Object $label;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $targetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossfadeKt$Crossfade$1(Object obj, Modifier modifier, Object obj2, Object obj3, Function function, int i, int i2, int i3) {
        super(2);
        this.$r8$classId = i3;
        this.$targetState = obj;
        this.$modifier = modifier;
        this.$animationSpec = obj2;
        this.$label = obj3;
        this.$content = function;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.$targetState;
        int i2 = this.$$changed;
        Function function = this.$content;
        Object obj4 = this.$label;
        Object obj5 = this.$animationSpec;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.$$default;
                Object obj6 = this.$targetState;
                Modifier modifier = this.$modifier;
                CrossfadeKt.Crossfade(obj6, modifier, (FiniteAnimationSpec) obj5, (String) obj4, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                int i4 = this.$$default;
                Modifier modifier2 = this.$modifier;
                CrossfadeKt.Crossfade((Transition) obj3, modifier2, (FiniteAnimationSpec) obj5, (Function1) obj4, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                int i5 = this.$$default;
                Modifier modifier3 = this.$modifier;
                AndroidView_androidKt.AndroidView((Function1) obj3, modifier3, (Function1) obj5, (Function1) obj4, (Function1) function, (Composer) obj, updateChangedFlags3, i5);
                break;
        }
        return Unit.INSTANCE;
    }
}
