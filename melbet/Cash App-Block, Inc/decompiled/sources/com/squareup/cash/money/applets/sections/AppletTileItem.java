package com.squareup.cash.money.applets.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.viewmodels.api.Item;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AppletTileItem implements Item {
    public final AppletTile.AppletTileAppearance appearance;
    public final AppletId appletId;
    public final AppletTile appletTile;
    public final ItemId id;
    public final AppletTilePresentation presentation;
    public final Section section;

    public interface Section {

        public final class Installed implements Section {
            public final AppletTileInstallationSectionId id;

            public Installed(AppletTileInstallationSectionId appletTileInstallationSectionId) {
                appletTileInstallationSectionId.getClass();
                this.id = appletTileInstallationSectionId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Installed) && this.id == ((Installed) obj).id;
            }

            public final int hashCode() {
                return this.id.hashCode();
            }

            public final String toString() {
                return "Installed(id=" + this.id + ")";
            }
        }

        public final class Uninstalled implements Section {
            public final AppletTileUninstallationSectionId id;

            public Uninstalled(AppletTileUninstallationSectionId appletTileUninstallationSectionId) {
                appletTileUninstallationSectionId.getClass();
                this.id = appletTileUninstallationSectionId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Uninstalled) && this.id == ((Uninstalled) obj).id;
            }

            public final int hashCode() {
                return this.id.hashCode();
            }

            public final String toString() {
                return "Uninstalled(id=" + this.id + ")";
            }
        }
    }

    public AppletTileItem(AppletId appletId, AppletTile appletTile, Section section, AppletTile.AppletTileAppearance appletTileAppearance, AppletTilePresentation appletTilePresentation) {
        ItemId itemId;
        appletId.getClass();
        section.getClass();
        appletTilePresentation.getClass();
        this.appletId = appletId;
        this.appletTile = appletTile;
        this.section = section;
        this.appearance = appletTileAppearance;
        this.presentation = appletTilePresentation;
        switch (appletId.ordinal()) {
            case 0:
                itemId = ItemId.AFTERPAY.INSTANCE;
                break;
            case 1:
                itemId = ItemId.BALANCE.INSTANCE;
                break;
            case 2:
                itemId = ItemId.BANKING_BENEFITS.INSTANCE;
                break;
            case 3:
                itemId = ItemId.SAVINGS.INSTANCE;
                break;
            case 4:
                itemId = ItemId.STOCKS.INSTANCE;
                break;
            case 5:
                itemId = ItemId.BITCOIN.INSTANCE;
                break;
            case 6:
                itemId = ItemId.BORROW.INSTANCE;
                break;
            case 7:
                itemId = ItemId.SCORE.INSTANCE;
                break;
            case 8:
                itemId = ItemId.PAYCHECKS.INSTANCE;
                break;
            case 9:
                itemId = ItemId.EARNER.INSTANCE;
                break;
            case 10:
                itemId = ItemId.TAXES.INSTANCE;
                break;
            case 11:
                itemId = ItemId.FAMILY.INSTANCE;
                break;
            case 12:
                itemId = ItemId.AGENTS.INSTANCE;
                break;
            case 13:
                itemId = ItemId.EARNINGS.INSTANCE;
                break;
            case 14:
                itemId = ItemId.PROMOTED_BANKING_BENEFITS.INSTANCE;
                break;
            case 15:
                itemId = ItemId.PROMOTED_CARD.INSTANCE;
                break;
            case 16:
                itemId = ItemId.LITE_UNINSTALLED_CARD.INSTANCE;
                break;
            case 17:
                itemId = ItemId.PROMOTED_TAXES.INSTANCE;
                break;
            case 18:
                itemId = ItemId.CARD.INSTANCE;
                break;
            case 19:
                itemId = ItemId.SPENDING.INSTANCE;
                break;
            case 20:
                itemId = ItemId.POOLS.INSTANCE;
                break;
            case 21:
                itemId = ItemId.MONEYBOT.INSTANCE;
                break;
            case 22:
                itemId = ItemId.KIDS_ACTIVITY.INSTANCE;
                break;
            case 23:
                itemId = ItemId.ALLOWANCE.INSTANCE;
                break;
            case 24:
                itemId = ItemId.APPROVED_CONTACTS.INSTANCE;
                break;
            case 25:
                itemId = ItemId.WORK.INSTANCE;
                break;
            case 26:
                itemId = ItemId.PHONE_PLANS.INSTANCE;
                break;
            case 27:
                itemId = ItemId.KYC.INSTANCE;
                break;
            case 28:
                itemId = ItemId.LITE_ACTIVITY.INSTANCE;
                break;
            case 29:
                itemId = ItemId.FINISH_SETUP.INSTANCE;
                break;
            case 30:
                itemId = ItemId.LITE_UNINSTALLED_BALANCE.INSTANCE;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
        }
        this.id = itemId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.squareup.cash.money.applets.sections.AppletTileItem$Section] */
    public static AppletTileItem copy$default(AppletTileItem appletTileItem, AppletId appletId, Section.Uninstalled uninstalled, AppletTilePresentation appletTilePresentation, int i) {
        if ((i & 1) != 0) {
            appletId = appletTileItem.appletId;
        }
        AppletId appletId2 = appletId;
        AppletTile appletTile = appletTileItem.appletTile;
        Section.Uninstalled uninstalled2 = uninstalled;
        if ((i & 4) != 0) {
            uninstalled2 = appletTileItem.section;
        }
        Section.Uninstalled uninstalled3 = uninstalled2;
        AppletTile.AppletTileAppearance appletTileAppearance = appletTileItem.appearance;
        appletTileItem.getClass();
        appletId2.getClass();
        uninstalled3.getClass();
        appletTilePresentation.getClass();
        return new AppletTileItem(appletId2, appletTile, uninstalled3, appletTileAppearance, appletTilePresentation);
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final void UI(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2128852641);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            this.presentation.method.invoke(this.appletTile, this.appearance, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(this, i, 20);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppletTileItem)) {
            return false;
        }
        AppletTileItem appletTileItem = (AppletTileItem) obj;
        return this.appletId == appletTileItem.appletId && this.appletTile.equals(appletTileItem.appletTile) && Intrinsics.areEqual(this.section, appletTileItem.section) && this.appearance.equals(appletTileItem.appearance) && this.presentation == appletTileItem.presentation;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Item
    public final ItemId getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.presentation.hashCode() + ((this.appearance.hashCode() + ((this.section.hashCode() + ((this.appletTile.hashCode() + (this.appletId.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppletTileItem(appletId=" + this.appletId + ", appletTile=" + this.appletTile + ", section=" + this.section + ", appearance=" + this.appearance + ", presentation=" + this.presentation + ")";
    }
}
