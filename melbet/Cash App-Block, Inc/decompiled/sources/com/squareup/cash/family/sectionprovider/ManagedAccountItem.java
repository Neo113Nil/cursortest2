package com.squareup.cash.family.sectionprovider;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzck;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.viewmodels.api.Item;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ManagedAccountItem implements Item {
    public final CellDefaultAccessory accessory;
    public final Icons icon;
    public final ItemId id;
    public final Function0 onClick;
    public final String subtitle;
    public final String title;

    public ManagedAccountItem(ItemId itemId, Icons icons, String str, String str2, Function0 function0) {
        CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
        str.getClass();
        this.id = itemId;
        this.icon = icons;
        this.title = str;
        this.subtitle = str2;
        this.onClick = function0;
        this.accessory = push;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final void UI(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1273307132);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            zzck.ManagedAccountItemUI(this.icon, this.title, this.subtitle, this.onClick, this.accessory, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(this, i, 13);
        }
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final ItemId getId() {
        return this.id;
    }
}
