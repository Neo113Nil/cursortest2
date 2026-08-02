package com.squareup.cash.money.applets.sections;

import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.core.ids.AppletId;

/* loaded from: classes6.dex */
public final class LiteAppletTileUninstalledRowVariantProvider$RowVariant {
    public final AppletId promotedAppletId;
    public final AppletId rowAppletId;
    public final AppletId sourceAppletId;
    public final AppletTileItem.Section.Uninstalled sourceSection;

    public LiteAppletTileUninstalledRowVariantProvider$RowVariant(AppletId appletId, AppletTileItem.Section.Uninstalled uninstalled, AppletId appletId2, AppletId appletId3) {
        this.sourceAppletId = appletId;
        this.sourceSection = uninstalled;
        this.rowAppletId = appletId2;
        this.promotedAppletId = appletId3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteAppletTileUninstalledRowVariantProvider$RowVariant)) {
            return false;
        }
        LiteAppletTileUninstalledRowVariantProvider$RowVariant liteAppletTileUninstalledRowVariantProvider$RowVariant = (LiteAppletTileUninstalledRowVariantProvider$RowVariant) obj;
        return this.sourceAppletId == liteAppletTileUninstalledRowVariantProvider$RowVariant.sourceAppletId && this.sourceSection.equals(liteAppletTileUninstalledRowVariantProvider$RowVariant.sourceSection) && this.rowAppletId == liteAppletTileUninstalledRowVariantProvider$RowVariant.rowAppletId && this.promotedAppletId == liteAppletTileUninstalledRowVariantProvider$RowVariant.promotedAppletId;
    }

    public final int hashCode() {
        int hashCode = (this.rowAppletId.hashCode() + ((this.sourceSection.id.hashCode() + (this.sourceAppletId.hashCode() * 31)) * 31)) * 31;
        AppletId appletId = this.promotedAppletId;
        return hashCode + (appletId == null ? 0 : appletId.hashCode());
    }

    public final String toString() {
        return "RowVariant(sourceAppletId=" + this.sourceAppletId + ", sourceSection=" + this.sourceSection + ", rowAppletId=" + this.rowAppletId + ", promotedAppletId=" + this.promotedAppletId + ")";
    }
}
