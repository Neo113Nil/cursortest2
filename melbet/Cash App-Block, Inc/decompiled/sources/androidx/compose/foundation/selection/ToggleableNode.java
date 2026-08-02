package androidx.compose.foundation.selection;

import android.view.autofill.AutofillValue;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class ToggleableNode extends ClickableNode {
    public final Threads$$ExternalSyntheticLambda1 _onClick;
    public Function1 onValueChange;
    public boolean value;

    public ToggleableNode(boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, Role role, Function1 function1) {
        super(mutableInteractionSourceImpl, indicationNodeFactory, z2, z3, null, role, new ToggleableNode$$ExternalSyntheticLambda1(function1, z, 0));
        this.value = z;
        this.onValueChange = function1;
        this._onClick = new Threads$$ExternalSyntheticLambda1(this, 17);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToggleableState toggleableState = this.value ? ToggleableState.On : ToggleableState.Off;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ToggleableState;
        KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
        KProperty kProperty = kPropertyArr2[26];
        semanticsPropertyReceiver.set(semanticsPropertyKey, toggleableState);
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.ContentDataType;
        KProperty kProperty2 = kPropertyArr2[9];
        semanticsPropertyReceiver.set(semanticsPropertyKey2, ContentDataType$Companion.Toggle);
        AndroidFillableData androidFillableData = new AndroidFillableData(AutofillValue.forToggle(this.value));
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.FillableData;
        KProperty kProperty3 = kPropertyArr2[10];
        semanticsPropertyReceiver.set(semanticsPropertyKey3, androidFillableData);
        semanticsPropertyReceiver.set(SemanticsActions.OnFillData, new AccessibilityAction(null, new ToggleableNode$$ExternalSyntheticLambda0(semanticsPropertyReceiver, 0)));
    }
}
