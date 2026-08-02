package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes.dex */
public final class BasicTextFieldKt$DefaultTextFieldDecorator$1 implements TextFieldDecorator {
    public static final BasicTextFieldKt$DefaultTextFieldDecorator$1 INSTANCE = new BasicTextFieldKt$DefaultTextFieldDecorator$1();

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2101003086);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(this, composableLambdaImpl, i, 11);
        }
    }
}
