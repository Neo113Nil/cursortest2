package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$2 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function3 $content;
    public final /* synthetic */ EnterTransitionImpl $enter;
    public final /* synthetic */ ExitTransitionImpl $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedVisibilityKt$AnimatedVisibility$2(boolean z, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, Function3 function3, int i, int i2, int i3) {
        super(2);
        this.$r8$classId = i3;
        this.$visible = z;
        this.$modifier = modifier;
        this.$enter = enterTransitionImpl;
        this.$exit = exitTransitionImpl;
        this.$label = str;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.$$changed;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AnimatedContentKt.AnimatedVisibility(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.$$default);
                break;
            default:
                ((Number) obj2).intValue();
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.$content;
                AnimatedContentKt.AnimatedVisibility(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.$$default);
                break;
        }
        return Unit.INSTANCE;
    }
}
