package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableCell;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.protos.cash.ui.Icon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class BenefitsComparisonTableBinding extends AbstractComposeView implements Widget {
    public final RealImageLoader imageLoader;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState rows$delegate;

    public BenefitsComparisonTableBinding(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.rows$delegate = Updater.mutableStateOf$default(EmptyList.INSTANCE);
    }

    public static BenefitsComparisonTableViewModel.BenefitsComparisonTableCell toViewModel(BenefitsComparisonTableCell benefitsComparisonTableCell) {
        if (benefitsComparisonTableCell instanceof BenefitsComparisonTableCell.IconCell) {
            BenefitsComparisonTableCell.IconCell iconCell = (BenefitsComparisonTableCell.IconCell) benefitsComparisonTableCell;
            ImageResource imageResource = iconCell.icon;
            imageResource.getClass();
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell(new Icon(((ImageResource.Token) imageResource).id), iconCell.contentDescription);
        }
        if (benefitsComparisonTableCell instanceof BenefitsComparisonTableCell.TextCell) {
            return new BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell(((BenefitsComparisonTableCell.TextCell) benefitsComparisonTableCell).text);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1984041603);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(1374463427, new BenefitsComparisonTableBinding$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsComparisonTableBinding$$ExternalSyntheticLambda0(this, i);
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
