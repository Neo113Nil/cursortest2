package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class TextFieldDecoratorModifierNode$startInputSession$1$1$1 extends AdaptedFunctionReference implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((TextFieldDecoratorModifierNode) this.receiver).m408onImeActionPerformedKlQnJC8(((ImeAction) obj).value);
        return Unit.INSTANCE;
    }
}
