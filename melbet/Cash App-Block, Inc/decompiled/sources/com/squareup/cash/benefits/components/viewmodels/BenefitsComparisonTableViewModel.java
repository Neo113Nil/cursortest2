package com.squareup.cash.benefits.components.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsComparisonTableViewModel {

    public abstract class BenefitsComparisonTableCell {

        public final class IconCell extends BenefitsComparisonTableCell {
            public final String contentDescription;
            public final Icon icon;

            public IconCell(Icon icon, String str) {
                str.getClass();
                this.icon = icon;
                this.contentDescription = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCell)) {
                    return false;
                }
                IconCell iconCell = (IconCell) obj;
                return this.icon.equals(iconCell.icon) && Intrinsics.areEqual(this.contentDescription, iconCell.contentDescription);
            }

            public final int hashCode() {
                return this.contentDescription.hashCode() + (this.icon.hashCode() * 31);
            }

            public final String toString() {
                return "IconCell(icon=" + this.icon + ", contentDescription=" + this.contentDescription + ")";
            }
        }

        public final class TextCell extends BenefitsComparisonTableCell {
            public final String text;

            public TextCell(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextCell) && Intrinsics.areEqual(this.text, ((TextCell) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextCell(text=", this.text, ")");
            }
        }
    }

    public final class BenefitsComparisonTableRow {
        public final List cells;
        public final boolean hasHorizontalDivider;

        public BenefitsComparisonTableRow(List list, boolean z) {
            list.getClass();
            this.cells = list;
            this.hasHorizontalDivider = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BenefitsComparisonTableRow)) {
                return false;
            }
            BenefitsComparisonTableRow benefitsComparisonTableRow = (BenefitsComparisonTableRow) obj;
            return Intrinsics.areEqual(this.cells, benefitsComparisonTableRow.cells) && this.hasHorizontalDivider == benefitsComparisonTableRow.hasHorizontalDivider;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasHorizontalDivider) + (this.cells.hashCode() * 31);
        }

        public final String toString() {
            return "BenefitsComparisonTableRow(cells=" + this.cells + ", hasHorizontalDivider=" + this.hasHorizontalDivider + ")";
        }
    }

    public final class Loaded implements BenefitsComparisonTableViewModel {
        public final ArrayList rows;
        public final String title;

        public Loaded(String str, ArrayList arrayList) {
            str.getClass();
            this.title = str;
            this.rows = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && this.rows.equals(loaded.rows);
        }

        public final int hashCode() {
            return this.rows.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.rows, "Loaded(title=", this.title, ", rows=", ")");
        }
    }

    public final class Loading implements BenefitsComparisonTableViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1411407504;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
