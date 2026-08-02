package com.squareup.cash.account.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$DialogModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class EditProfileUiViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ EditProfileViewModel$DialogModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditProfileUiViewKt$$ExternalSyntheticLambda4(EditProfileViewModel$DialogModel editProfileViewModel$DialogModel, Function1 function1) {
        this.f$0 = editProfileViewModel$DialogModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        EditProfileViewModel$DialogModel editProfileViewModel$DialogModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, editProfileViewModel$DialogModel.title, editProfileViewModel$DialogModel.message, Expect_jvmKt.rememberComposableLambda(385419013, new EditProfileUiViewKt$$ExternalSyntheticLambda4(function1, editProfileViewModel$DialogModel), gapComposer), (Function3) null, (Function3) null, gapComposer, 3072, 49);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                int i2 = 2;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(639897104, new BalanceFeedKt$$ExternalSyntheticLambda9(editProfileViewModel$DialogModel, i2), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EditProfileUiViewKt$$ExternalSyntheticLambda4(Function1 function1, EditProfileViewModel$DialogModel editProfileViewModel$DialogModel) {
        this.f$1 = function1;
        this.f$0 = editProfileViewModel$DialogModel;
    }
}
