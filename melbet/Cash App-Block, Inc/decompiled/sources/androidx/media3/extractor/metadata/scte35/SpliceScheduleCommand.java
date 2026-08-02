package androidx.media3.extractor.metadata.scte35;

import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.AppletTilePresentation;
import com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider;
import com.squareup.cash.money.applets.sections.LiteAppletTileUninstalledRowVariantProvider$RowVariant;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public final List events;

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.events = Collections.unmodifiableList(arrayList);
    }

    public final class Event implements AppletTileUninstalledRowVariantProvider {
        public final List componentSpliceList;

        public Event() {
            this.componentSpliceList = CollectionsKt__CollectionsKt.listOf((Object[]) new LiteAppletTileUninstalledRowVariantProvider$RowVariant[]{new LiteAppletTileUninstalledRowVariantProvider$RowVariant(AppletId.BALANCE, new AppletTileItem.Section.Uninstalled(AppletTileUninstallationSectionId.BANKING), AppletId.LITE_UNINSTALLED_BALANCE, null), new LiteAppletTileUninstalledRowVariantProvider$RowVariant(AppletId.CARD, new AppletTileItem.Section.Uninstalled(AppletTileUninstallationSectionId.CARD_UNINSTALLED), AppletId.LITE_UNINSTALLED_CARD, AppletId.PROMOTED_CARD)});
        }

        @Override // com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider
        public List rowVariants(ArrayList arrayList, List list) {
            Object obj;
            List<LiteAppletTileUninstalledRowVariantProvider$RowVariant> list2 = this.componentSpliceList;
            ArrayList arrayList2 = new ArrayList();
            for (LiteAppletTileUninstalledRowVariantProvider$RowVariant liteAppletTileUninstalledRowVariantProvider$RowVariant : list2) {
                Pair pair = null;
                if (liteAppletTileUninstalledRowVariantProvider$RowVariant.promotedAppletId != null) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (((AppletTileItem) ((Pair) it.next()).second).appletId == liteAppletTileUninstalledRowVariantProvider$RowVariant.promotedAppletId) {
                                break;
                            }
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    AppletTileItem appletTileItem = (AppletTileItem) obj;
                    if (appletTileItem.appletId == liteAppletTileUninstalledRowVariantProvider$RowVariant.sourceAppletId && Intrinsics.areEqual(appletTileItem.section, liteAppletTileUninstalledRowVariantProvider$RowVariant.sourceSection) && appletTileItem.presentation == AppletTilePresentation.Default) {
                        break;
                    }
                }
                AppletTileItem appletTileItem2 = (AppletTileItem) obj;
                if (appletTileItem2 != null) {
                    AppletTileUninstallationSectionId appletTileUninstallationSectionId = AppletTileUninstallationSectionId.DEFAULT;
                    pair = new Pair(appletTileUninstallationSectionId, AppletTileItem.copy$default(appletTileItem2, liteAppletTileUninstalledRowVariantProvider$RowVariant.rowAppletId, new AppletTileItem.Section.Uninstalled(appletTileUninstallationSectionId), AppletTilePresentation.UninstalledRow, 10));
                }
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            return arrayList2;
        }

        public Event(ArrayList arrayList) {
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
        }
    }
}
