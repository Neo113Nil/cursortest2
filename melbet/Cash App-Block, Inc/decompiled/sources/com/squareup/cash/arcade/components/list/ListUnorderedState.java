package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ListUnorderedState {
    public final DerivedSnapshotState iconWidth$delegate;
    public final DerivedSnapshotState labelWidth$delegate;
    public final DerivedSnapshotState valueWidth$delegate;
    public final SnapshotStateList icons = new SnapshotStateList();
    public final SnapshotStateList labels = new SnapshotStateList();
    public final SnapshotStateList values = new SnapshotStateList();

    public ListUnorderedState() {
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        final int i = 0;
        this.iconWidth$delegate = Updater.derivedStateOf(neverEqualPolicy, new Function0(this) { // from class: com.squareup.cash.arcade.components.list.ListUnorderedState$$ExternalSyntheticLambda0
            public final /* synthetic */ ListUnorderedState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Integer num = null;
                ListUnorderedState listUnorderedState = this.f$0;
                switch (i2) {
                    case 0:
                        SnapshotStateList snapshotStateList = listUnorderedState.icons;
                        snapshotStateList.getClass();
                        ListIterator listIterator = SnapshotId_jvmKt.getReadable(snapshotStateList).list.listIterator(0);
                        if (listIterator.hasNext()) {
                            Integer valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf;
                                while (listIterator.hasNext()) {
                                    valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    case 1:
                        SnapshotStateList snapshotStateList2 = listUnorderedState.labels;
                        snapshotStateList2.getClass();
                        ListIterator listIterator2 = SnapshotId_jvmKt.getReadable(snapshotStateList2).list.listIterator(0);
                        if (listIterator2.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf2;
                                while (listIterator2.hasNext()) {
                                    valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf2) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    default:
                        SnapshotStateList snapshotStateList3 = listUnorderedState.values;
                        snapshotStateList3.getClass();
                        ListIterator listIterator3 = SnapshotId_jvmKt.getReadable(snapshotStateList3).list.listIterator(0);
                        if (listIterator3.hasNext()) {
                            Integer valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf3;
                                while (listIterator3.hasNext()) {
                                    valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf3) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                }
            }
        });
        final int i2 = 1;
        this.labelWidth$delegate = Updater.derivedStateOf(neverEqualPolicy, new Function0(this) { // from class: com.squareup.cash.arcade.components.list.ListUnorderedState$$ExternalSyntheticLambda0
            public final /* synthetic */ ListUnorderedState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Integer num = null;
                ListUnorderedState listUnorderedState = this.f$0;
                switch (i22) {
                    case 0:
                        SnapshotStateList snapshotStateList = listUnorderedState.icons;
                        snapshotStateList.getClass();
                        ListIterator listIterator = SnapshotId_jvmKt.getReadable(snapshotStateList).list.listIterator(0);
                        if (listIterator.hasNext()) {
                            Integer valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf;
                                while (listIterator.hasNext()) {
                                    valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    case 1:
                        SnapshotStateList snapshotStateList2 = listUnorderedState.labels;
                        snapshotStateList2.getClass();
                        ListIterator listIterator2 = SnapshotId_jvmKt.getReadable(snapshotStateList2).list.listIterator(0);
                        if (listIterator2.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf2;
                                while (listIterator2.hasNext()) {
                                    valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf2) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    default:
                        SnapshotStateList snapshotStateList3 = listUnorderedState.values;
                        snapshotStateList3.getClass();
                        ListIterator listIterator3 = SnapshotId_jvmKt.getReadable(snapshotStateList3).list.listIterator(0);
                        if (listIterator3.hasNext()) {
                            Integer valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf3;
                                while (listIterator3.hasNext()) {
                                    valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf3) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                }
            }
        });
        final int i3 = 2;
        this.valueWidth$delegate = Updater.derivedStateOf(neverEqualPolicy, new Function0(this) { // from class: com.squareup.cash.arcade.components.list.ListUnorderedState$$ExternalSyntheticLambda0
            public final /* synthetic */ ListUnorderedState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                Integer num = null;
                ListUnorderedState listUnorderedState = this.f$0;
                switch (i22) {
                    case 0:
                        SnapshotStateList snapshotStateList = listUnorderedState.icons;
                        snapshotStateList.getClass();
                        ListIterator listIterator = SnapshotId_jvmKt.getReadable(snapshotStateList).list.listIterator(0);
                        if (listIterator.hasNext()) {
                            Integer valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf;
                                while (listIterator.hasNext()) {
                                    valueOf = Integer.valueOf(((ListItemModifierNode) listIterator.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    case 1:
                        SnapshotStateList snapshotStateList2 = listUnorderedState.labels;
                        snapshotStateList2.getClass();
                        ListIterator listIterator2 = SnapshotId_jvmKt.getReadable(snapshotStateList2).list.listIterator(0);
                        if (listIterator2.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf2;
                                while (listIterator2.hasNext()) {
                                    valueOf2 = Integer.valueOf(((ListItemModifierNode) listIterator2.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf2) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                    default:
                        SnapshotStateList snapshotStateList3 = listUnorderedState.values;
                        snapshotStateList3.getClass();
                        ListIterator listIterator3 = SnapshotId_jvmKt.getReadable(snapshotStateList3).list.listIterator(0);
                        if (listIterator3.hasNext()) {
                            Integer valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                            while (true) {
                                num = valueOf3;
                                while (listIterator3.hasNext()) {
                                    valueOf3 = Integer.valueOf(((ListItemModifierNode) listIterator3.next()).intrinsicWidth$delegate.getIntValue());
                                    if (num.compareTo(valueOf3) < 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(num != null ? num.intValue() : 0);
                }
            }
        });
    }

    public final int getLabelWidth() {
        return ((Number) this.labelWidth$delegate.getValue()).intValue();
    }

    public final int getValueWidth() {
        return ((Number) this.valueWidth$delegate.getValue()).intValue();
    }
}
