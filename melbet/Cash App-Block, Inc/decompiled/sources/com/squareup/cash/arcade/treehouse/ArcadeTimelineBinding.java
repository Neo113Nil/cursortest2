package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.MutableListChildren;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import okhttp3.internal.Tags;

/* loaded from: classes5.dex */
public final class ArcadeTimelineBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableIntState collapsedSize$delegate;
    public final MutableListChildren content;
    public Modifier modifier;
    public final ArcadeTimelineBinding value;
    public final SnapshotStateList widgets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeTimelineBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        this.widgets = snapshotStateList;
        this.content = new MutableListChildren(snapshotStateList, 2);
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.collapsedSize$delegate = new ParcelableSnapshotMutableIntState(-1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        TimelineState rememberTimelineState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-589848789);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.collapsedSize$delegate;
            if (parcelableSnapshotMutableIntState.getIntValue() == -1) {
                gapComposer.startReplaceGroup(-1474001394);
                rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1473952879);
                rememberTimelineState = LazyGridDslKt.rememberTimelineState(gapComposer, parcelableSnapshotMutableIntState.getIntValue());
                gapComposer.end(false);
            }
            TimelineState timelineState = rememberTimelineState;
            gapComposer.startReplaceGroup(91005766);
            SnapshotStateList snapshotStateList = this.widgets;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
            ListIterator listIterator = snapshotStateList.listIterator();
            while (true) {
                StateListIterator stateListIterator = (StateListIterator) listIterator;
                if (!stateListIterator.hasNext()) {
                    break;
                }
                Widget widget = (Widget) stateListIterator.next();
                widget.getClass();
                arrayList.add((ArcadeTimelineItemBinding) widget);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArcadeTimelineItemBinding arcadeTimelineItemBinding = (ArcadeTimelineItemBinding) it.next();
                TimelineItem.State state = (TimelineItem.State) arcadeTimelineItemBinding.state$delegate.getValue();
                if (state == null) {
                    state = TimelineItem.State.NotStarted;
                }
                TimelineItem.State state2 = state;
                String str = (String) arcadeTimelineItemBinding.title$delegate.getValue();
                if (str == null) {
                    str = "";
                }
                arrayList2.add(LazyListLayoutInfoKt.TimelineItem$default(state2, str, (String) arcadeTimelineItemBinding.valueText$delegate.getValue(), (String) arcadeTimelineItemBinding.body$delegate.getValue(), (String) arcadeTimelineItemBinding.valueDescriptor$delegate.getValue(), null, 96));
            }
            gapComposer.end(false);
            LazyListLayoutInfoKt.Timeline(timelineState, Tags.toPersistentList(arrayList2), null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 19);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
