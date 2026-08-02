package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;

/* loaded from: classes5.dex */
public final class ArcadeTimeline2Binding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState collapseRanges$delegate;
    public final ParcelableSnapshotMutableState id$delegate;
    public final ParcelableSnapshotMutableState items$delegate;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onItemClick$delegate;
    public final ThemeInfo themeInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeTimeline2Binding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.themeInfo = ThemeHelpersKt.themeInfo(this);
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        this.items$delegate = Updater.mutableStateOf$default(smallPersistentVector);
        this.onItemClick$delegate = Updater.mutableStateOf$default(new NavBarBinding$$ExternalSyntheticLambda2(20));
        this.collapseRanges$delegate = Updater.mutableStateOf$default(smallPersistentVector);
        this.id$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1106015357);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            LazyListLayoutInfoKt.Timeline(LazyGridDslKt.rememberTimelineState(Tags.toPersistentList((ImmutableList) this.collapseRanges$delegate.getValue()), gapComposer, 0), (ImmutableList) this.items$delegate.getValue(), null, gapComposer, 0, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 18);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
