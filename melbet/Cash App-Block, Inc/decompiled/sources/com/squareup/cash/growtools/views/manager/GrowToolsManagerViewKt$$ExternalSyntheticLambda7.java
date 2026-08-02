package com.squareup.cash.growtools.views.manager;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrowToolsManagerViewKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ GrowToolsManagerViewModel.Loaded.Dialog f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ GrowToolsManagerViewKt$$ExternalSyntheticLambda7(MutableState mutableState, GrowToolsManagerViewModel.Loaded.Dialog dialog, Function1 function1) {
        this.f$1 = mutableState;
        this.f$0 = dialog;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl rememberComposableLambda;
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        GrowToolsManagerViewModel.Loaded.Dialog dialog = this.f$0;
        MutableState mutableState = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 17) != 16)) {
                    String str = dialog.title;
                    String str2 = dialog.body;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(770732128, new GrowToolsManagerViewKt$$ExternalSyntheticLambda7(mutableState, dialog, function1), gapComposer);
                    String str3 = dialog.secondaryButton;
                    if (str3 == null) {
                        gapComposer.startReplaceGroup(-416416562);
                        gapComposer.end(false);
                        rememberComposableLambda = null;
                    } else {
                        gapComposer.startReplaceGroup(-416416561);
                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-401767435, new PoolToastKt$$ExternalSyntheticLambda0(3, (Object) dialog, str3, function1), gapComposer);
                        gapComposer.end(false);
                    }
                    ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda2, rememberComposableLambda, (Function3) null, gapComposer, 3072, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed = gapComposer2.changed(mutableState) | gapComposer2.changedInstance(dialog) | gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(17, dialog, function1, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, booleanValue, Expect_jvmKt.rememberComposableLambda(-960583189, new FormView$$ExternalSyntheticLambda0(dialog, 6), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GrowToolsManagerViewKt$$ExternalSyntheticLambda7(GrowToolsManagerViewModel.Loaded.Dialog dialog, MutableState mutableState, Function1 function1) {
        this.f$0 = dialog;
        this.f$1 = mutableState;
        this.f$2 = function1;
    }
}
