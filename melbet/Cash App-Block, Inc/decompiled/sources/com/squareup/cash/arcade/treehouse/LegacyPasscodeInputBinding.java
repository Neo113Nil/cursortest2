package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.arcade.values.PasscodeInputStatus;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class LegacyPasscodeInputBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState dotAccentColor$delegate;
    public final ParcelableSnapshotMutableState inputEnabled$delegate;
    public PasscodeInputStatus latestStatus;
    public Modifier modifier;
    public Function1 onFullyFilled;
    public final ParcelableSnapshotMutableState passcode$delegate;
    public final ParcelableSnapshotMutableIntState passcodeLength$delegate;
    public final ParcelableSnapshotMutableIntState shakeTrigger$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyPasscodeInputBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.passcode$delegate = Updater.mutableStateOf$default("");
        this.passcodeLength$delegate = new ParcelableSnapshotMutableIntState(4);
        this.inputEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.shakeTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
        this.dotAccentColor$delegate = Updater.mutableStateOf$default(new Color(ColorKt.Color(ThemeHelpersKt.findThemeInfo(context).colorPalette.tint)));
        this.latestStatus = PasscodeInputStatus.NONE;
        this.onFullyFilled = new NavBarBinding$$ExternalSyntheticLambda2(24);
        this.modifier = Modifier.Companion.$$INSTANCE;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-906790077);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(583927550, new LegacyPasscodeInputBinding$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LegacyPasscodeInputBinding$$ExternalSyntheticLambda0(this, i);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    public final String getPasscode() {
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
