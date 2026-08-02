package com.squareup.cash.arcade.components.timeline;

import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public final class TimelineState {
    public final ParcelableSnapshotMutableState collapseRanges$delegate;

    public final class CollapseRange {
        public final IntRange collapsedIndices;
        public final String label;

        public CollapseRange(String str, IntRange intRange) {
            intRange.getClass();
            this.collapsedIndices = intRange;
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CollapseRange)) {
                return false;
            }
            CollapseRange collapseRange = (CollapseRange) obj;
            return Intrinsics.areEqual(this.collapsedIndices, collapseRange.collapsedIndices) && Intrinsics.areEqual(this.label, collapseRange.label);
        }

        public final int hashCode() {
            int hashCode = this.collapsedIndices.hashCode() * 31;
            String str = this.label;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "CollapseRange(collapsedIndices=" + this.collapsedIndices + ", label=" + this.label + ")";
        }
    }

    public final class Saver implements androidx.compose.runtime.saveable.Saver {
        public static final Saver INSTANCE = new Saver();

        @Override // androidx.compose.runtime.saveable.Saver
        /* renamed from: restore */
        public final Object mo380restore(Object obj) {
            return new TimelineState(CollectionsKt.chunked((List) obj, 3, new NavBarBinding$$ExternalSyntheticLambda2(17)));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object save(SaveableHolder saveableHolder, Object obj) {
            TimelineState timelineState = (TimelineState) obj;
            saveableHolder.getClass();
            timelineState.getClass();
            List<CollapseRange> list = (List) timelineState.collapseRanges$delegate.getValue();
            ArrayList arrayList = new ArrayList();
            for (CollapseRange collapseRange : list) {
                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf(Integer.valueOf(collapseRange.collapsedIndices.first), Integer.valueOf(collapseRange.collapsedIndices.last), collapseRange.label), arrayList);
            }
            return arrayList;
        }
    }

    public TimelineState(List list) {
        list.getClass();
        this.collapseRanges$delegate = Updater.mutableStateOf$default(LazyGridDslKt.access$sortAndMerge(list));
    }
}
