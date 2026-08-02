package com.squareup.cash.blockers.treehouse;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenMapper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class TreehouseBlockerScreenMapper implements TreehouseScreenMapper {
    public final FlowStarter flowStarter;

    public TreehouseBlockerScreenMapper(FlowStarter flowStarter) {
        this.flowStarter = flowStarter;
    }

    @Override // com.squareup.cash.treehouse.android.broadway.TreehouseScreenMapper
    public final Screen map(TreehouseScreen treehouseScreen) {
        if (!Intrinsics.areEqual(treehouseScreen.f1218app, "flows") || StringsKt.isBlank(treehouseScreen.link)) {
            return null;
        }
        return new BlockersScreens.TreehouseBlockerScreen(FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.CLIENT_SCENARIO, PaymentScreens$HomeScreens$Home.INSTANCE, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1), treehouseScreen.link, treehouseScreen.parameters, 0, (String) null, (String) null, 120);
    }
}
