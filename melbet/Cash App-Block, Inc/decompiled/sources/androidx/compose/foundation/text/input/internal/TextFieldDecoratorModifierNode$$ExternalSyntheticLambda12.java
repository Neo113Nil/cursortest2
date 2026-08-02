package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.node.DepthSortedSetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldDecoratorModifierNode f$0;

    public /* synthetic */ TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f$0;
        switch (i) {
            case 0:
                DepthSortedSetKt.requestAutofill(textFieldDecoratorModifierNode);
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(textFieldDecoratorModifierNode.m408onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.keyboardOptions.m360getImeActionOrDefaulteUduSuo$foundation()));
            case 2:
                return textFieldDecoratorModifierNode.textFieldState.textFieldState.getValue$foundation().text.toString();
            default:
                if (textFieldDecoratorModifierNode.inputSessionJob != null) {
                    textFieldDecoratorModifierNode.requireKeyboardController().show();
                } else {
                    textFieldDecoratorModifierNode.startInputSession(true);
                }
                return Unit.INSTANCE;
        }
    }
}
