package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingValuesModifier;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesElement extends ModifierNodeElement {
    public final CashApp$$ExternalSyntheticLambda2 inspectorInfo;
    public final PaddingValues paddingValues;

    public PaddingValuesElement(PaddingValues paddingValues, CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = cashApp$$ExternalSyntheticLambda2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        PaddingValuesModifier paddingValuesModifier = new PaddingValuesModifier();
        paddingValuesModifier.paddingValues = this.paddingValues;
        return paddingValuesModifier;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.paddingValues, paddingValuesElement.paddingValues);
    }

    public final int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ((PaddingValuesModifier) node).paddingValues = this.paddingValues;
    }
}
