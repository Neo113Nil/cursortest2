package androidx.compose.foundation.selection;

import android.view.autofill.AutofillValue;
import androidx.compose.material3.internal.ParentSemanticsNode;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class ToggleableNode$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SemanticsPropertyReceiver f$0;

    public /* synthetic */ ToggleableNode$$ExternalSyntheticLambda0(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        this.$r8$classId = i;
        this.f$0 = semanticsPropertyReceiver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = true;
        SemanticsPropertyReceiver semanticsPropertyReceiver = this.f$0;
        switch (i) {
            case 0:
                AutofillValue autofillValue = ((AndroidFillableData) obj).autofillValue;
                Boolean valueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (valueOf != null) {
                    ToggleableState toggleableState = valueOf.booleanValue() ? ToggleableState.On : ToggleableState.Off;
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                    SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ToggleableState;
                    KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[26];
                    semanticsPropertyReceiver.set(semanticsPropertyKey, toggleableState);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                ParentSemanticsNode parentSemanticsNode = (ParentSemanticsNode) traversableNode;
                parentSemanticsNode.semanticsConsumed = true;
                parentSemanticsNode.properties.invoke(semanticsPropertyReceiver);
                DepthSortedSetKt.requireLayoutNode(parentSemanticsNode).invalidateSemantics$ui();
                return Boolean.FALSE;
        }
    }
}
