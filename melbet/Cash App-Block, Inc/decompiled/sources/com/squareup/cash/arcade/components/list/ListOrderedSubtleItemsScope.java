package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes5.dex */
public final class ListOrderedSubtleItemsScope {
    public final SnapshotStateList items = new SnapshotStateList();

    public final class SubtleItem {
        public final ComposableLambdaImpl label;

        public SubtleItem(ComposableLambdaImpl composableLambdaImpl) {
            this.label = composableLambdaImpl;
        }
    }

    public final void item(ComposableLambdaImpl composableLambdaImpl) {
        this.items.add(new SubtleItem(composableLambdaImpl));
    }
}
