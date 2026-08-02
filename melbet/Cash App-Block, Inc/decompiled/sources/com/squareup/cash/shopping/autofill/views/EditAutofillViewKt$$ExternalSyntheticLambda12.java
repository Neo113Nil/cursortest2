package com.squareup.cash.shopping.autofill.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class EditAutofillViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InputViewModel.InputFieldViewModel f$0;

    public /* synthetic */ EditAutofillViewKt$$ExternalSyntheticLambda12(InputViewModel.InputFieldViewModel inputFieldViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = inputFieldViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InputViewModel.InputFieldViewModel inputFieldViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = inputFieldViewModel.label;
                    if (str == null) {
                        gapComposer.startReplaceGroup(767988004);
                    } else {
                        gapComposer.startReplaceGroup(767988005);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str2 = inputFieldViewModel.label;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(-633079985);
                    } else {
                        gapComposer2.startReplaceGroup(-633079984);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
