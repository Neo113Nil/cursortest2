package androidx.compose.ui.layout;

import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LookaheadScopeKt$LookaheadScope$4 extends Lambda implements Function2 {
    public final /* synthetic */ ComposableLambdaImpl $content;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LookaheadScopeKt$LookaheadScope$4(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.$r8$classId = i2;
        this.$content = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.$content;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                ValueInsets.LookaheadScope(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                break;
            default:
                SharedTransitionScopeKt.SharedTransitionScope(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
