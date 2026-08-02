package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class RadioSelectionGroupBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onSelectionChanged$delegate;
    public final ParcelableSnapshotMutableState options$delegate;
    public final ParcelableSnapshotMutableState selectedIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioSelectionGroupBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.options$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
        this.selectedIndex$delegate = Updater.mutableStateOf$default(0);
        this.onSelectionChanged$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1334245149);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(156472478, new RadioSelectionGroupBinding$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RadioSelectionGroupBinding$$ExternalSyntheticLambda0(this, i);
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
