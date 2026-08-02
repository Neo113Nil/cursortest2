package com.squareup.cash.activity.views;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.room.util.DBUtil;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ReactionsNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public Function1 onEvent;
    public OverlayLayer.Session overlaySession;
    public ReactionsState reactionsState;
    public Rect target;

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        this.target = DBUtil.m1180Recttz77jQw(layoutCoordinates.mo843localToWindowMKHz9U(0L), Countries.m3991toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g()));
    }
}
