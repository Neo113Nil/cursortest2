package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CoreTextFieldKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LegacyTextFieldState f$0;

    public /* synthetic */ CoreTextFieldKt$$ExternalSyntheticLambda2(LegacyTextFieldState legacyTextFieldState, int i) {
        this.$r8$classId = i;
        this.f$0 = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        LegacyTextFieldState legacyTextFieldState = this.f$0;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null) {
                    layoutResult.decorationBoxCoordinates = layoutCoordinates;
                }
                return Unit.INSTANCE;
            case 1:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyTextFieldState.justAutofilled$delegate;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                String str = textFieldValue.annotatedString.text;
                AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
                if (!Intrinsics.areEqual(str, annotatedString != null ? annotatedString.text : null)) {
                    legacyTextFieldState.handleState$delegate.setValue(HandleState.None);
                    if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                        parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    } else {
                        legacyTextFieldState.autofillHighlightOn$delegate.setValue(Boolean.FALSE);
                    }
                }
                long j = TextRange.Zero;
                legacyTextFieldState.m362setSelectionPreviewHighlightRange5zctL8(j);
                legacyTextFieldState.m361setDeletionPreviewHighlightRange5zctL8(j);
                legacyTextFieldState.onValueChangeOriginal.invoke(textFieldValue);
                RecomposeScopeImpl recomposeScopeImpl = legacyTextFieldState.recomposeScope;
                CompositionImpl compositionImpl = recomposeScopeImpl.owner;
                if (compositionImpl != null) {
                    compositionImpl.invalidate(recomposeScopeImpl, null);
                }
                return Unit.INSTANCE;
            case 2:
                legacyTextFieldState.keyboardActionRunner.m358runActionKlQnJC8(((ImeAction) obj).value);
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(legacyTextFieldState.keyboardActionRunner.m358runActionKlQnJC8(((ImeAction) obj).value));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                legacyTextFieldState.isInTouchMode$delegate.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
