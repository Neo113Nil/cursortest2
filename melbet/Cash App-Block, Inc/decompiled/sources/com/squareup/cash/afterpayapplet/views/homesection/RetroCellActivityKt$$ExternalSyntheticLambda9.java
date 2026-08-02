package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class RetroCellActivityKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RetroTransaction.Button f$0;

    public /* synthetic */ RetroCellActivityKt$$ExternalSyntheticLambda9(RetroTransaction.Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = button;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RetroTransaction.Button button = this.f$0;
        switch (i) {
            case 0:
                ((RealCellActivityAccessoryButtonScope) obj).getClass();
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                return new CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new RetroCellActivityKt$$ExternalSyntheticLambda15(button, 0), true, -765458590));
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str = button.accessibilityText;
                if (str != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
                return Unit.INSTANCE;
        }
    }
}
