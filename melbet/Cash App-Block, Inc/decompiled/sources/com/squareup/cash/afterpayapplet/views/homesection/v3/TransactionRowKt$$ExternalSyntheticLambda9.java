package com.squareup.cash.afterpayapplet.views.homesection.v3;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.components.cell.CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransactionRowKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton f$0;

    public /* synthetic */ TransactionRowKt$$ExternalSyntheticLambda9(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton inlineButton, int i) {
        this.$r8$classId = i;
        this.f$0 = inlineButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.InlineButton inlineButton = this.f$0;
        switch (i) {
            case 0:
                ((RealCellActivityAccessoryButtonScope) obj).getClass();
                return new CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new TransactionRowKt$$ExternalSyntheticLambda12(inlineButton, 0), true, 1371701389));
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String str = inlineButton.accessibilityText;
                if (str != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
                return Unit.INSTANCE;
        }
    }
}
