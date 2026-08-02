package androidx.activity.compose;

import android.view.autofill.AutofillValue;
import androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1;
import androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2$2;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.text.AnnotatedString;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final /* synthetic */ class BackHandlerKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ BackHandlerKt$$ExternalSyntheticLambda1(ComposeBackHandler composeBackHandler, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = composeBackHandler;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = true;
        Object obj2 = this.f$0;
        boolean z2 = this.f$1;
        int i2 = 0;
        switch (i) {
            case 0:
                final ComposeBackHandler composeBackHandler = (ComposeBackHandler) obj2;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj;
                ((BackHandlerCompat$onBackPressedCallback$1) composeBackHandler.valueName).setEnabled(z2);
                ((BackHandlerCompat$navigationEventHandler$1) composeBackHandler.valueType).setBackEnabled(z2);
                return new LifecycleStopOrDisposeEffectResult(lifecycleStartStopEffectScope, composeBackHandler) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$lambda$3$0$$inlined$onStopOrDispose$1
                    public final /* synthetic */ ComposeBackHandler $handler$inlined;

                    {
                        this.$handler$inlined = composeBackHandler;
                    }

                    @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
                    public final void runStopOrDisposeEffect() {
                        ComposeBackHandler composeBackHandler2 = this.$handler$inlined;
                        ((BackHandlerCompat$onBackPressedCallback$1) composeBackHandler2.valueName).setEnabled(false);
                        ((BackHandlerCompat$navigationEventHandler$1) composeBackHandler2.valueType).setBackEnabled(false);
                    }
                };
            case 1:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) obj2;
                AndroidFillableData androidFillableData = (AndroidFillableData) obj;
                if (z2) {
                    AutofillValue autofillValue = androidFillableData.autofillValue;
                    Continuation continuation = null;
                    CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                    if (textValue != null) {
                        textFieldDecoratorModifierNode.textFieldState.replaceAll(textValue);
                    }
                    textFieldDecoratorModifierNode.autofillHighlightOn$delegate.setValue(Boolean.TRUE);
                    JobKt.launch$default(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, i2), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = (TextFieldDecoratorModifierNode) obj2;
                AnnotatedString annotatedString = (AnnotatedString) obj;
                if (z2) {
                    textFieldDecoratorModifierNode2.textFieldState.replaceAll(annotatedString);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode3 = (TextFieldDecoratorModifierNode) obj2;
                AnnotatedString annotatedString2 = (AnnotatedString) obj;
                if (z2) {
                    TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode3.textFieldState, annotatedString2, false, 12);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ BackHandlerKt$$ExternalSyntheticLambda1(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = textFieldDecoratorModifierNode;
    }
}
