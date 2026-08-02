package com.squareup.cash.money.banners.presenters;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.banners.presenters.KybBannerItemModel;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;

/* loaded from: classes6.dex */
public final class KybBannerItem implements Item {
    public final KybBannerItemModel.Available model;

    public KybBannerItem(KybBannerItemModel.Available available) {
        this.model = available;
    }

    public final void UI(KybBannerItemModel.Available available, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1081872424);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(available) : gapComposer.changedInstance(available) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.startReplaceGroup(626881653);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ColorResources_androidKt.FeatureRestrictionCallbackBanner(available.callbackModel, null, false, false, gapComposer, 0, 14);
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(this, available, i, 6);
        }
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final /* bridge */ /* synthetic */ ItemId getId() {
        return ItemId.KYB_BANNER.INSTANCE;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final void UI(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(572380498);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UI(this.model, gapComposer, (i2 << 3) & 112);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(this, i, 21);
        }
    }
}
