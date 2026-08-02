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
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;

/* loaded from: classes5.dex */
public final class CardUpsellBinding extends AbstractComposeView implements Widget {
    public final ParcelableSnapshotMutableState body$delegate;
    public final ParcelableSnapshotMutableState buttonText$delegate;
    public final ParcelableSnapshotMutableState illustration$delegate;
    public final RealImageLoader imageLoader;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState onClick$delegate;
    public final ParcelableSnapshotMutableState title$delegate;

    public CardUpsellBinding(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.title$delegate = Updater.mutableStateOf$default("");
        this.body$delegate = Updater.mutableStateOf$default(null);
        this.buttonText$delegate = Updater.mutableStateOf$default("");
        this.illustration$delegate = Updater.mutableStateOf$default(null);
        this.onClick$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(858330755);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(272972227, new CardUpsellBinding$$ExternalSyntheticLambda0(this, 0, (byte) 0), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardUpsellBinding$$ExternalSyntheticLambda0(this, i);
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
