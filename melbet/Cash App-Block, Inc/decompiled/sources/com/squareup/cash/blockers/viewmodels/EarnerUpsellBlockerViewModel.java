package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class EarnerUpsellBlockerViewModel {
    public final String cta;
    public final Image image;
    public final ArrayList summaryItems;
    public final ArrayList tiles;
    public final String title;

    public interface BookletTileContent {

        public final class Grid implements BookletTileContent {
            public final List items;
            public final String title;

            /* loaded from: classes5.dex */
            public final class Item {
                public final String body;
                public final Icon icon;
                public final String title;

                public Item(Icon icon, String str, String str2) {
                    this.title = str;
                    this.body = str2;
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) obj;
                    return this.title.equals(item.title) && this.body.equals(item.body) && Intrinsics.areEqual(this.icon, item.icon);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
                    Icon icon = this.icon;
                    return m + (icon == null ? 0 : icon.hashCode());
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Item(title=", this.title, ", body=", this.body, ", icon=");
                    m.append(this.icon);
                    m.append(")");
                    return m.toString();
                }
            }

            public Grid(String str, List list) {
                list.getClass();
                this.title = str;
                this.items = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Grid)) {
                    return false;
                }
                Grid grid = (Grid) obj;
                return this.title.equals(grid.title) && Intrinsics.areEqual(this.items, grid.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Grid(title=", this.title, ", items=", ")", this.items);
            }
        }

        public final class Tile implements BookletTileContent {
            public final String body;
            public final Image image;
            public final String title;

            public Tile(Image image, String str, String str2) {
                image.getClass();
                this.image = image;
                this.title = str;
                this.body = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tile)) {
                    return false;
                }
                Tile tile = (Tile) obj;
                return Intrinsics.areEqual(this.image, tile.image) && this.title.equals(tile.title) && this.body.equals(tile.body);
            }

            public final int hashCode() {
                return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "Tile(image=", ", title=", this.title, ", body="), this.body, ")");
            }
        }
    }

    public final class SummaryItem {
        public final Icon icon;
        public final String text;

        public SummaryItem(Icon icon, String str) {
            this.icon = icon;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryItem)) {
                return false;
            }
            SummaryItem summaryItem = (SummaryItem) obj;
            return Intrinsics.areEqual(this.icon, summaryItem.icon) && this.text.equals(summaryItem.text);
        }

        public final int hashCode() {
            Icon icon = this.icon;
            return this.text.hashCode() + ((icon == null ? 0 : icon.hashCode()) * 31);
        }

        public final String toString() {
            return "SummaryItem(icon=" + this.icon + ", text=" + this.text + ")";
        }
    }

    public EarnerUpsellBlockerViewModel(Image image, String str, ArrayList arrayList, ArrayList arrayList2, String str2) {
        this.image = image;
        this.title = str;
        this.summaryItems = arrayList;
        this.tiles = arrayList2;
        this.cta = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnerUpsellBlockerViewModel)) {
            return false;
        }
        EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = (EarnerUpsellBlockerViewModel) obj;
        return Intrinsics.areEqual(this.image, earnerUpsellBlockerViewModel.image) && this.title.equals(earnerUpsellBlockerViewModel.title) && this.summaryItems.equals(earnerUpsellBlockerViewModel.summaryItems) && this.tiles.equals(earnerUpsellBlockerViewModel.tiles) && this.cta.equals(earnerUpsellBlockerViewModel.cta);
    }

    public final int hashCode() {
        Image image = this.image;
        return this.cta.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.tiles, CameraState$Type$EnumUnboxingLocalUtility.m(this.summaryItems, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title), 31), 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "EarnerUpsellBlockerViewModel(image=", ", title=", this.title, ", summaryItems=");
        m.append(this.summaryItems);
        m.append(", tiles=");
        m.append(this.tiles);
        m.append(", cta=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.cta, ")");
    }
}
