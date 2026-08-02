package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ListOrderedStandardItemsScope {
    public final SnapshotStateList items = new SnapshotStateList();

    public final class StandardItem {
        public final Function2 body;
        public final ComposableLambdaImpl label;

        public StandardItem(ComposableLambdaImpl composableLambdaImpl, Function2 function2) {
            this.label = composableLambdaImpl;
            this.body = function2;
        }
    }

    public final void item(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2) {
        this.items.add(new StandardItem(composableLambdaImpl, composableLambdaImpl2));
    }
}
