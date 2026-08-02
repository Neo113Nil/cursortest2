package com.squareup.cash.cdf.app;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppNavigateOpenSpace implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String badged_components;
    public final Boolean is_treehouse;
    public final LinkedHashMap parameters;
    public final Source source;
    public final SourceTab source_tab;
    public final Space space;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source APPLET_TILE;
        public static final Source CLIENT_ROUTE;
        public static final Source DEEP_LINK;
        public static final Source SWIPE;
        public static final Source TOP_NAV_BAR_BUTTON;

        /* JADX INFO: Fake field, exist only in values array */
        Source EF0;

        static {
            Source source = new Source("TAB_BAR_BUTTON", 0);
            Source source2 = new Source("TOP_NAV_BAR_BUTTON", 1);
            TOP_NAV_BAR_BUTTON = source2;
            Source source3 = new Source("CLIENT_ROUTE", 2);
            CLIENT_ROUTE = source3;
            Source source4 = new Source("DEEP_LINK", 3);
            DEEP_LINK = source4;
            Source source5 = new Source("DISCOVERY_FLOATING_PAY_BUTTON", 4);
            Source source6 = new Source("APPLET_TILE", 5);
            APPLET_TILE = source6;
            Source source7 = new Source("APP_LAUNCH", 6);
            Source source8 = new Source("SWIPE", 7);
            SWIPE = source8;
            $VALUES = new Source[]{source, source2, source3, source4, source5, source6, source7, source8};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SourceTab {
        public static final /* synthetic */ SourceTab[] $VALUES;
        public static final SourceTab BANKING;
        public static final SourceTab BITCOIN;

        /* JADX INFO: Fake field, exist only in values array */
        SourceTab EF0;

        static {
            SourceTab sourceTab = new SourceTab("ACTIVITY", 0);
            SourceTab sourceTab2 = new SourceTab("BANKING", 1);
            BANKING = sourceTab2;
            SourceTab sourceTab3 = new SourceTab("BITCOIN", 2);
            BITCOIN = sourceTab3;
            $VALUES = new SourceTab[]{sourceTab, sourceTab2, sourceTab3, new SourceTab("CARD", 3), new SourceTab("MAIN_PAYMENT_PAD", 4), new SourceTab("INVESTING", 5)};
        }

        public static SourceTab valueOf(String str) {
            return (SourceTab) Enum.valueOf(SourceTab.class, str);
        }

        public static SourceTab[] values() {
            return (SourceTab[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Space {
        public static final /* synthetic */ Space[] $VALUES;
        public static final Space ACTIVITY;
        public static final Space BANKING;
        public static final Space BITCOIN;
        public static final Space CARD;
        public static final Space INVESTING;
        public static final Space LOCAL;
        public static final Space MAIN_PAYMENT_PAD;
        public static final Space MCF_ERROR_DIALOG;
        public static final Space MONEYBOT_HOME;
        public static final Space OFFERS;
        public static final Space QR_CODE;
        public static final Space SETTINGS;
        public static final Space STABLECOIN;

        static {
            Space space = new Space("ACTIVITY", 0);
            ACTIVITY = space;
            Space space2 = new Space("BANKING", 1);
            BANKING = space2;
            Space space3 = new Space("BITCOIN", 2);
            BITCOIN = space3;
            Space space4 = new Space("CARD", 3);
            CARD = space4;
            Space space5 = new Space("DISCOVERY", 4);
            Space space6 = new Space("FLOATING_PAYMENT_PAD", 5);
            Space space7 = new Space("INVESTING", 6);
            INVESTING = space7;
            Space space8 = new Space("MAIN_PAYMENT_PAD", 7);
            MAIN_PAYMENT_PAD = space8;
            Space space9 = new Space("OFFERS", 8);
            OFFERS = space9;
            Space space10 = new Space("PROFILE_DIRECTORY", 9);
            Space space11 = new Space("SETTINGS", 10);
            SETTINGS = space11;
            Space space12 = new Space("QR_CODE", 11);
            QR_CODE = space12;
            Space space13 = new Space("MCF_ERROR_DIALOG", 12);
            MCF_ERROR_DIALOG = space13;
            Space space14 = new Space("STABLECOIN", 13);
            STABLECOIN = space14;
            Space space15 = new Space("LOCAL", 14);
            LOCAL = space15;
            Space space16 = new Space("MONEYBOT_HOME", 15);
            MONEYBOT_HOME = space16;
            $VALUES = new Space[]{space, space2, space3, space4, space5, space6, space7, space8, space9, space10, space11, space12, space13, space14, space15, space16};
        }

        public static Space valueOf(String str) {
            return (Space) Enum.valueOf(Space.class, str);
        }

        public static Space[] values() {
            return (Space[]) $VALUES.clone();
        }
    }

    public AppNavigateOpenSpace(Source source, SourceTab sourceTab, Space space, String str, int i) {
        Boolean bool = (i & 2) != 0 ? null : Boolean.FALSE;
        source = (i & 8) != 0 ? null : source;
        sourceTab = (i & 16) != 0 ? null : sourceTab;
        str = (i & 128) != 0 ? null : str;
        this.is_treehouse = bool;
        this.source = source;
        this.source_tab = sourceTab;
        this.space = space;
        this.badged_components = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "App", "cdf_action", "Navigate");
        Countries.putSafe(m, "is_treehouse", bool);
        Countries.putSafe(m, "source", source);
        Countries.putSafe(m, "source_tab", sourceTab);
        Countries.putSafe(m, "space", space);
        Countries.putSafe(m, "badged_components", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNavigateOpenSpace)) {
            return false;
        }
        AppNavigateOpenSpace appNavigateOpenSpace = (AppNavigateOpenSpace) obj;
        return Intrinsics.areEqual(this.is_treehouse, appNavigateOpenSpace.is_treehouse) && this.source == appNavigateOpenSpace.source && this.source_tab == appNavigateOpenSpace.source_tab && this.space == appNavigateOpenSpace.space && Intrinsics.areEqual(this.badged_components, appNavigateOpenSpace.badged_components);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "App Navigate OpenSpace";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Boolean bool = this.is_treehouse;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 961;
        Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        SourceTab sourceTab = this.source_tab;
        int hashCode3 = (hashCode2 + (sourceTab == null ? 0 : sourceTab.hashCode())) * 31;
        Space space = this.space;
        int hashCode4 = (hashCode3 + (space == null ? 0 : space.hashCode())) * 961;
        String str = this.badged_components;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppNavigateOpenSpace(external_id=null, is_treehouse=");
        sb.append(this.is_treehouse);
        sb.append(", keypad_external_id=null, source=");
        sb.append(this.source);
        sb.append(", source_tab=");
        sb.append(this.source_tab);
        sb.append(", space=");
        sb.append(this.space);
        sb.append(", space_badge_count=null, badged_components=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.badged_components, ")");
    }
}
