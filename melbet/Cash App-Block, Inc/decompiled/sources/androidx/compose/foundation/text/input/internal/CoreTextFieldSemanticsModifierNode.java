package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import coil3.size.SizeKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public boolean enabled;
    public FocusRequester focusRequester;
    public ImeOptions imeOptions;
    public TextFieldSelectionManager manager;
    public OffsetMapping offsetMapping;
    public boolean readOnly;
    public LegacyTextFieldState state;
    public TransformedText transformedText;
    public TextFieldValue value;

    public static void handleTextUpdateFromSemantics(LegacyTextFieldState legacyTextFieldState, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        TextInputSession textInputSession = legacyTextFieldState.inputSession;
        CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2 = legacyTextFieldState.onValueChange;
        if (textInputSession == null) {
            int length = str.length();
            coreTextFieldKt$$ExternalSyntheticLambda2.invoke(new TextFieldValue(str, SizeKt.TextRange(length, length), 4));
        } else {
            TextFieldValue apply = legacyTextFieldState.processor.apply(CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(str, 1)}));
            textInputSession.updateState(null, apply);
            coreTextFieldKt$$ExternalSyntheticLambda2.invoke(apply);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AnnotatedString annotatedString = this.value.annotatedString;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.InputText;
        KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
        KProperty kProperty = kPropertyArr2[18];
        semanticsPropertyReceiver.set(semanticsPropertyKey, annotatedString);
        AnnotatedString annotatedString2 = this.transformedText.text;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.EditableText;
        KProperty kProperty2 = kPropertyArr2[19];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, annotatedString2);
        long j = this.value.selection;
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.TextSelectionRange;
        KProperty kProperty3 = kPropertyArr2[20];
        semanticsPropertyReceiver.set(semanticsPropertyKey3, new TextRange(j));
        SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.ContentDataType;
        KProperty kProperty4 = kPropertyArr2[9];
        semanticsPropertyReceiver.set(semanticsPropertyKey4, ContentDataType$Companion.Text);
        AndroidFillableData androidFillableData = new AndroidFillableData(AutofillValue.forText(this.value.annotatedString));
        SemanticsPropertyKey semanticsPropertyKey5 = SemanticsProperties.FillableData;
        KProperty kProperty5 = kPropertyArr2[10];
        semanticsPropertyReceiver.set(semanticsPropertyKey5, androidFillableData);
        boolean z = false;
        z = false;
        semanticsPropertyReceiver.set(SemanticsActions.OnFillData, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(this, z ? 1 : 0)));
        int i = this.imeOptions.keyboardType;
        if (i == 6) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.EmailAddress);
        } else if (i == 7 || i == 8) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.Password);
        } else if (i == 4) {
            ContentType.Companion.getClass();
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.PhoneNumber);
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        int i2 = 1;
        if (this.enabled && !this.readOnly) {
            z = true;
        }
        SemanticsPropertyKey semanticsPropertyKey6 = SemanticsProperties.IsEditable;
        KProperty kProperty6 = kPropertyArr2[28];
        semanticsPropertyReceiver.set(semanticsPropertyKey6, Boolean.valueOf(z));
        semanticsPropertyReceiver.set(SemanticsActions.GetTextLayoutResult, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(this, i2)));
        int i3 = 2;
        if (z) {
            semanticsPropertyReceiver.set(SemanticsActions.SetText, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(this, i3)));
            semanticsPropertyReceiver.set(SemanticsActions.InsertTextAtCursor, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2(this, semanticsPropertyReceiver)));
        }
        semanticsPropertyReceiver.set(SemanticsActions.SetSelection, new AccessibilityAction(null, new SliderDefaults$$ExternalSyntheticLambda3(this, i2)));
        SemanticsPropertiesKt.m948onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.imeAction, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 6));
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 7));
        semanticsPropertyReceiver.set(SemanticsActions.OnLongClick, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 1)));
        if (!TextRange.m987getCollapsedimpl(this.value.selection)) {
            semanticsPropertyReceiver.set(SemanticsActions.CopyText, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 2)));
            if (this.enabled && !this.readOnly) {
                semanticsPropertyReceiver.set(SemanticsActions.CutText, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 3)));
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        semanticsPropertyReceiver.set(SemanticsActions.PasteText, new AccessibilityAction(null, new CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0(this, 5)));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }
}
