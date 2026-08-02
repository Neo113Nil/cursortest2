package app.cash.local.views.cart;

import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationCartViewKt$$ExternalSyntheticLambda13 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalBrandLocationCartViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocalBrandLocationCartViewKt$$ExternalSyntheticLambda13(LocalBrandLocationCartViewModel localBrandLocationCartViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localBrandLocationCartViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        LocalBrandLocationCartViewModel localBrandLocationCartViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    int i2 = localBrandLocationCartViewModel.openTabItemCount;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LocalBrandLocationCartViewKt.OpenTabEmptyStateMessageItem(i2, 0, gapComposer, (Function0) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    LocalBrandLocationCartViewKt.LocalBrandLocationCartView(modifier, localBrandLocationCartViewModel, function1, gapComposer2, intValue2 & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
