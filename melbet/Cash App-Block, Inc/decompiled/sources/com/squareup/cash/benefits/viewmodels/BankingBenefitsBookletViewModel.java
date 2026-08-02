package com.squareup.cash.benefits.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BankingBenefitsBookletViewModel {

    public final class Loaded implements BankingBenefitsBookletViewModel {
        public final String disclosure;
        public final String footerButtonText;
        public final List iconListItems;
        public final BenefitsComparisonTableViewModel table;
        public final ArrayList tiles;
        public final String title;

        public final class BookletIconItem {
            public final Icon icon;
            public final String text;

            public BookletIconItem(Icon icon, String str) {
                this.icon = icon;
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BookletIconItem)) {
                    return false;
                }
                BookletIconItem bookletIconItem = (BookletIconItem) obj;
                return this.icon.equals(bookletIconItem.icon) && this.text.equals(bookletIconItem.text);
            }

            public final int hashCode() {
                return this.text.hashCode() + (this.icon.hashCode() * 31);
            }

            public final String toString() {
                return "BookletIconItem(icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        public final class BookletTile {
            public final Image image;
            public final String subtitle;
            public final String title;

            public BookletTile(Image image, String str, String str2) {
                image.getClass();
                str.getClass();
                str2.getClass();
                this.image = image;
                this.title = str;
                this.subtitle = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BookletTile)) {
                    return false;
                }
                BookletTile bookletTile = (BookletTile) obj;
                return Intrinsics.areEqual(this.image, bookletTile.image) && Intrinsics.areEqual(this.title, bookletTile.title) && Intrinsics.areEqual(this.subtitle, bookletTile.subtitle);
            }

            public final int hashCode() {
                return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "BookletTile(image=", ", title=", this.title, ", subtitle="), this.subtitle, ")");
            }
        }

        public Loaded(String str, List list, BenefitsComparisonTableViewModel benefitsComparisonTableViewModel, ArrayList arrayList, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.iconListItems = list;
            this.table = benefitsComparisonTableViewModel;
            this.tiles = arrayList;
            this.footerButtonText = str2;
            this.disclosure = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && this.iconListItems.equals(loaded.iconListItems) && this.table.equals(loaded.table) && this.tiles.equals(loaded.tiles) && Intrinsics.areEqual(this.footerButtonText, loaded.footerButtonText) && Intrinsics.areEqual(this.disclosure, loaded.disclosure);
        }

        public final int hashCode() {
            return this.disclosure.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.tiles, (this.table.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.iconListItems)) * 31, 31), 31, this.footerButtonText);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", iconListItems=", ", table=", this.iconListItems);
            m.append(this.table);
            m.append(", tiles=");
            m.append(this.tiles);
            m.append(", footerButtonText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.footerButtonText, ", disclosure=", this.disclosure, ")");
        }
    }

    public final class Loading implements BankingBenefitsBookletViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -872097693;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
