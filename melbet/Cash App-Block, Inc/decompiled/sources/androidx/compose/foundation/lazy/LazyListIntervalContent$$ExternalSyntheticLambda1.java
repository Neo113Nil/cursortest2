package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyListIntervalContent$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function3 f$0;

    public /* synthetic */ LazyListIntervalContent$$ExternalSyntheticLambda1(Function3 function3, int i) {
        this.$r8$classId = i;
        this.f$0 = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Function3 function3 = this.f$0;
        switch (i) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 131) != 130)) {
                    function3.invoke(lazyItemScopeImpl, gapComposer, Integer.valueOf(intValue & 14));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Float f = (Float) obj2;
                f.floatValue();
                Float f2 = (Float) obj4;
                f2.floatValue();
                function3.invoke(f, (Offset) obj3, f2);
                break;
        }
        return Unit.INSTANCE;
    }
}
