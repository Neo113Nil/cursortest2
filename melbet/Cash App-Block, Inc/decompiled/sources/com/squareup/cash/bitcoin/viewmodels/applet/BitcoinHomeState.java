package com.squareup.cash.bitcoin.viewmodels.applet;

import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public interface BitcoinHomeState {

    public final class ActiveState implements BitcoinHomeState {
        public static final ActiveState INSTANCE = new ActiveState();
        public static final List placements = CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinWidget[]{BitcoinWidget.KYB_RESTRICTION, BitcoinWidget.PENDING_IDV, BitcoinWidget.BALANCE, BitcoinWidget.GRAPH, BitcoinWidget.BUTTONS, BitcoinWidget.PERFORMANCE, BitcoinWidget.BITCOIN_MAP_CARD, BitcoinWidget.STACKING_TOOLS, BitcoinWidget.ON_RAMP, BitcoinWidget.BOOST, BitcoinWidget.AUTO_INVEST, BitcoinWidget.STATS_AND_SETTINGS, BitcoinWidget.NEWS, BitcoinWidget.BITCOIN_STORIES, BitcoinWidget.DISCLOSURE});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActiveState);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState
        public final List getPlacements() {
            return placements;
        }

        public final int hashCode() {
            return -591141528;
        }

        public final String toString() {
            return "ActiveState";
        }
    }

    public final class FamiliesActiveState implements BitcoinHomeState {
        public static final FamiliesActiveState INSTANCE = new FamiliesActiveState();
        public static final List placements = CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinWidget[]{BitcoinWidget.KYB_RESTRICTION, BitcoinWidget.PENDING_IDV, BitcoinWidget.BALANCE, BitcoinWidget.GRAPH, BitcoinWidget.AUTO_INVEST, BitcoinWidget.ACTIVITY, BitcoinWidget.STATS_AND_SETTINGS, BitcoinWidget.DISCLOSURE});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FamiliesActiveState);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState
        public final List getPlacements() {
            return placements;
        }

        public final int hashCode() {
            return 1861781510;
        }

        public final String toString() {
            return "FamiliesActiveState";
        }
    }

    public final class FamiliesDisabledState implements BitcoinHomeState {
        public static final FamiliesDisabledState INSTANCE = new FamiliesDisabledState();
        public static final List placements = CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinWidget[]{BitcoinWidget.KYB_RESTRICTION, BitcoinWidget.PENDING_IDV, BitcoinWidget.DISABLED, BitcoinWidget.BALANCE, BitcoinWidget.GRAPH, BitcoinWidget.AUTO_INVEST, BitcoinWidget.ACTIVITY, BitcoinWidget.STATS_AND_SETTINGS, BitcoinWidget.DISCLOSURE});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FamiliesDisabledState);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState
        public final List getPlacements() {
            return placements;
        }

        public final int hashCode() {
            return 862337936;
        }

        public final String toString() {
            return "FamiliesDisabledState";
        }
    }

    public final class NullState implements BitcoinHomeState {
        public static final NullState INSTANCE = new NullState();
        public static final List placements = CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinWidget[]{BitcoinWidget.KYB_RESTRICTION, BitcoinWidget.PENDING_IDV, BitcoinWidget.WELCOME, BitcoinWidget.BUTTONS, BitcoinWidget.BITCOIN_MAP_CARD, BitcoinWidget.BITCOIN_STORIES, BitcoinWidget.STACKING_TOOLS, BitcoinWidget.STATS_AND_SETTINGS, BitcoinWidget.ON_RAMP, BitcoinWidget.BOOST, BitcoinWidget.DISCLOSURE});

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NullState);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState
        public final List getPlacements() {
            return placements;
        }

        public final int hashCode() {
            return 473985735;
        }

        public final String toString() {
            return "NullState";
        }
    }

    List getPlacements();
}
