package com.squareup.cash.invitations;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.cash.invitations.InviteContactsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteContactsBodyKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InviteContactsViewModel.PromotionUpsellViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InviteContactsBodyKt$$ExternalSyntheticLambda9(InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = promotionUpsellViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                InviteErrorDialogKt.PromotionUpsell(null, this.f$0, this.f$1, (Composer) obj2, 0, 1);
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    InviteErrorDialogKt.PromotionUpsell(LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE), this.f$0, this.f$1, gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
