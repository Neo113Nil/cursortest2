package com.squareup.cash.passkeys.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PasskeyManagementViewKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ PasskeyOperationSheetUiState f$0;

    public /* synthetic */ PasskeyManagementViewKt$$ExternalSyntheticLambda11(PasskeyOperationSheetUiState passkeyOperationSheetUiState) {
        this.f$0 = passkeyOperationSheetUiState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PasskeyOperationSheetUiState passkeyOperationSheetUiState = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyOperationSheet(passkeyOperationSheetUiState, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PasskeyOperationSheetUiState.Content) passkeyOperationSheetUiState).title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PasskeyManagementViewKt$$ExternalSyntheticLambda11(PasskeyOperationSheetUiState passkeyOperationSheetUiState, int i) {
        this.f$0 = passkeyOperationSheetUiState;
    }
}
