package com.squareup.cash.money.applets.viewmodels;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public interface AppletTile {

    public final class AppletTileAppearance {
        public final Function1 obfuscationMask;
        public final boolean useRedesignedTiles;

        public AppletTileAppearance(boolean z, Function1 function1) {
            this.obfuscationMask = function1;
            this.useRedesignedTiles = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppletTileAppearance)) {
                return false;
            }
            AppletTileAppearance appletTileAppearance = (AppletTileAppearance) obj;
            return this.obfuscationMask.equals(appletTileAppearance.obfuscationMask) && this.useRedesignedTiles == appletTileAppearance.useRedesignedTiles;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.useRedesignedTiles) + (this.obfuscationMask.hashCode() * 31);
        }

        public final String toString() {
            return "AppletTileAppearance(obfuscationMask=" + this.obfuscationMask + ", useRedesignedTiles=" + this.useRedesignedTiles + ")";
        }
    }

    default void PromotedUI(AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1633048570);
        UI(appletTileAppearance, gapComposer, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        gapComposer.end(false);
    }

    void UI(AppletTileAppearance appletTileAppearance, Composer composer, int i);

    default void UninstalledRowUI(AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1128263025);
        UI(appletTileAppearance, gapComposer, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        gapComposer.end(false);
    }

    StateFlow getInstallationSectionId();

    StateFlow getInstallationState();

    default StateFlow uninstallationSectionId() {
        return StateFlowKt.mapState(getInstallationSectionId(), new CashMapViewKt$$ExternalSyntheticLambda0(29));
    }
}
