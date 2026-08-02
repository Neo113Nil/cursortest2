package com.squareup.cash.maps.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import bo.app.mc$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class MapMarkerPropertiesKt {
    public static final StaticProvidableCompositionLocal LocalMapMarkerProperties = new StaticProvidableCompositionLocal(new ClusterItemKt$$ExternalSyntheticLambda0(27));

    /* renamed from: MapMarkerAnchor-9KIMszo, reason: not valid java name */
    public static final void m3595MapMarkerAnchor9KIMszo(long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-570524102);
        int i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            MapMarkerProperties mapMarkerProperties = (MapMarkerProperties) gapComposer.consume(LocalMapMarkerProperties);
            boolean changed = gapComposer.changed(mapMarkerProperties) | ((i2 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new mc$$ExternalSyntheticLambda0(mapMarkerProperties, j, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.SideEffect((Function0) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(i, 0, j);
        }
    }
}
