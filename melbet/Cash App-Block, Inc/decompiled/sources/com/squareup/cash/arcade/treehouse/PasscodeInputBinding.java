package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;

/* loaded from: classes5.dex */
public final class PasscodeInputBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final long dotAccentColor;
    public final ParcelableSnapshotMutableState inputEnabled$delegate;
    public Modifier modifier;
    public GraphLoop$processingQueue$1 onChangeCallback;
    public final ParcelableSnapshotMutableState passcode$delegate;
    public final ParcelableSnapshotMutableIntState passcodeLength$delegate;
    public final ParcelableSnapshotMutableIntState shakeTrigger$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeInputBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.passcode$delegate = Updater.mutableStateOf$default("");
        this.passcodeLength$delegate = new ParcelableSnapshotMutableIntState(4);
        this.inputEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.shakeTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
        this.dotAccentColor = ColorKt.Color(ThemeHelpersKt.findThemeInfo(context).colorPalette.tint);
        this.modifier = Modifier.Companion.$$INSTANCE;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(454223331);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1905462754, new PasscodeInputBinding$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasscodeInputBinding$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final String getPasscode$1() {
        return (String) this.passcode$delegate.getValue();
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
