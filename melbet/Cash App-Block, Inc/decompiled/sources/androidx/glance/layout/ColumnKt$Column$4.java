package androidx.glance.layout;

import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.glance.GlanceModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ColumnKt$Column$4 extends Lambda implements Function2 {
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ int $horizontalAlignment;
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int $verticalAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnKt$Column$4(GlanceModifier glanceModifier, int i, int i2, ComposableLambdaImpl composableLambdaImpl, int i3) {
        super(2);
        this.$r8$classId = 0;
        this.$modifier = glanceModifier;
        this.$verticalAlignment = i;
        this.$horizontalAlignment = i2;
        this.$content = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.$horizontalAlignment;
        int i3 = this.$verticalAlignment;
        Function2 function2 = this.$content;
        Object obj3 = this.$modifier;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                ColumnKt.m1126ColumnK4GKKTE((GlanceModifier) obj3, this.$verticalAlignment, this.$horizontalAlignment, (ComposableLambdaImpl) function2, composer, 3073);
                break;
            case 1:
                SharedTransitionScopeKt.SharedTransitionLayout((Modifier) obj3, (ComposableLambdaImpl) function2, composer, Updater.updateChangedFlags(i3 | 1), i2);
                break;
            default:
                RulerKt.SubcomposeLayout((Modifier) obj3, function2, composer, Updater.updateChangedFlags(i3 | 1), i2);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColumnKt$Column$4(Modifier modifier, Function2 function2, int i, int i2, int i3) {
        super(2);
        this.$r8$classId = i3;
        this.$modifier = modifier;
        this.$content = function2;
        this.$verticalAlignment = i;
        this.$horizontalAlignment = i2;
    }
}
