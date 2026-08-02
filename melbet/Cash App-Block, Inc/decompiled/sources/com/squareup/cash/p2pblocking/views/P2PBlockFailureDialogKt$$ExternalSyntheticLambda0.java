package com.squareup.cash.p2pblocking.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PBlockFailureDialogKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P2PFailureDialogModel f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ P2PBlockFailureDialogKt$$ExternalSyntheticLambda0(Function0 function0, P2PFailureDialogModel p2PFailureDialogModel) {
        this.$r8$classId = 2;
        this.f$1 = function0;
        this.f$0 = p2PFailureDialogModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        int i2 = 1;
        P2PFailureDialogModel p2PFailureDialogModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-243683291, new P2PBlockFailureDialogKt$$ExternalSyntheticLambda0(p2PFailureDialogModel, function0, i2), gapComposer), (Composer) gapComposer, 196614, 30);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ModalKt.Modal((Modifier) null, p2PFailureDialogModel.title, p2PFailureDialogModel.message, P2PListRowKt.f529lambda$2001205119, Expect_jvmKt.rememberComposableLambda(94630432, new P2PBlockFailureDialogKt$$ExternalSyntheticLambda0(function0, p2PFailureDialogModel), composer2), (Function3) null, composer2, 27648, 33);
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    modalButtonScope.SecondaryModalButton(this.f$1, null, false, Expect_jvmKt.rememberComposableLambda(170748931, new P2PListViewKt$$ExternalSyntheticLambda12(p2PFailureDialogModel, 21), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ P2PBlockFailureDialogKt$$ExternalSyntheticLambda0(P2PFailureDialogModel p2PFailureDialogModel, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = p2PFailureDialogModel;
        this.f$1 = function0;
    }
}
