package com.squareup.cash.passkeys.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PasskeyManagementViewKt$$ExternalSyntheticLambda10 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PasskeyOperationSheetUiState f$0;

    public /* synthetic */ PasskeyManagementViewKt$$ExternalSyntheticLambda10(PasskeyOperationSheetUiState passkeyOperationSheetUiState, int i) {
        this.$r8$classId = i;
        this.f$0 = passkeyOperationSheetUiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        PasskeyOperationSheetUiState passkeyOperationSheetUiState = this.f$0;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    PasskeyUpsellViewKt.PasskeyOperationSheetContent(passkeyOperationSheetUiState, paddingValues, gapComposer, (intValue << 3) & 112);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    for (PasskeyOperationSheetButton passkeyOperationSheetButton : ((PasskeyOperationSheetUiState.Content) passkeyOperationSheetUiState).buttons) {
                        SizeKt.ButtonCta(passkeyOperationSheetButton.onClick, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), passkeyOperationSheetButton.prominence, passkeyOperationSheetButton.destructive, false, null, Expect_jvmKt.rememberComposableLambda(1582102261, new P2PListViewKt$$ExternalSyntheticLambda12(passkeyOperationSheetButton, 22), gapComposer2), gapComposer2, 1572912, 48);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
