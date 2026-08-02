package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import coil3.size.SizeKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f$0;

    public /* synthetic */ CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.$r8$classId = 3;
        this.f$0 = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f$0;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = coreTextFieldSemanticsModifierNode.state.justAutofilled$delegate;
                Boolean bool = Boolean.TRUE;
                parcelableSnapshotMutableState.setValue(bool);
                coreTextFieldSemanticsModifierNode.state.autofillHighlightOn$delegate.setValue(bool);
                LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
                AutofillValue autofillValue = ((AndroidFillableData) obj).autofillValue;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                CoreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(legacyTextFieldState, (String) textValue, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
                return bool;
            case 1:
                List list = (List) obj;
                if (coreTextFieldSemanticsModifierNode.state.getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = coreTextFieldSemanticsModifierNode.state.getLayoutResult();
                    layoutResult.getClass();
                    list.add(layoutResult.value);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                CoreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.state, ((AnnotatedString) obj).text, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
                return Boolean.TRUE;
            default:
                AnnotatedString annotatedString = (AnnotatedString) obj;
                if (!coreTextFieldSemanticsModifierNode.readOnly && coreTextFieldSemanticsModifierNode.enabled) {
                    TextInputSession textInputSession = coreTextFieldSemanticsModifierNode.state.inputSession;
                    if (textInputSession != null) {
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)});
                        LegacyTextFieldState legacyTextFieldState2 = coreTextFieldSemanticsModifierNode.state;
                        Recorder.AnonymousClass1 anonymousClass1 = legacyTextFieldState2.processor;
                        CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState2.onValueChange;
                        TextFieldValue apply = anonymousClass1.apply(listOf);
                        textInputSession.updateState(null, apply);
                        coreTextFieldKt$$ExternalSyntheticLambda2.invoke(apply);
                    } else {
                        TextFieldValue textFieldValue = coreTextFieldSemanticsModifierNode.value;
                        String str = textFieldValue.annotatedString.text;
                        long j = textFieldValue.selection;
                        int i2 = TextRange.$r8$clinit;
                        String obj2 = StringsKt.replaceRange(str, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax), annotatedString).toString();
                        int length = annotatedString.text.length() + ((int) (coreTextFieldSemanticsModifierNode.value.selection >> 32));
                        coreTextFieldSemanticsModifierNode.state.onValueChange.invoke(new TextFieldValue(obj2, SizeKt.TextRange(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.$r8$classId = i;
        this.f$0 = coreTextFieldSemanticsModifierNode;
    }
}
