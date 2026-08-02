package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/arcade/components/list/ListItemModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/squareup/cash/arcade/components/list/ListItemModifierNode;", "components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ListItemModifierElement extends ModifierNodeElement {
    public final int id;
    public final SnapshotStateList stateList;

    public ListItemModifierElement(SnapshotStateList snapshotStateList, int i) {
        snapshotStateList.getClass();
        this.stateList = snapshotStateList;
        this.id = i;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new ListItemModifierNode(this.stateList, this.id);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListItemModifierElement)) {
            return false;
        }
        ListItemModifierElement listItemModifierElement = (ListItemModifierElement) obj;
        return Intrinsics.areEqual(this.stateList, listItemModifierElement.stateList) && this.id == listItemModifierElement.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id) + (this.stateList.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final String toString() {
        return "ListItemModifierElement(stateList=" + this.stateList + ", id=" + this.id + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ListItemModifierNode listItemModifierNode = (ListItemModifierNode) node;
        listItemModifierNode.getClass();
        SnapshotStateList snapshotStateList = listItemModifierNode.stateList;
        SnapshotStateList snapshotStateList2 = this.stateList;
        if (Intrinsics.areEqual(snapshotStateList, snapshotStateList2)) {
            return;
        }
        CollectionsKt__MutableCollectionsKt.addAll(listItemModifierNode.stateList, snapshotStateList2);
        listItemModifierNode.stateList = snapshotStateList2;
    }
}
