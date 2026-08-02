package com.squareup.cash.investing.viewmodels.categories;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingDetailsCategorySectionContentModel {
    public final ArrayList cells;
    public final String header;

    public final class Cell {
        public final CategoryToken categoryToken;
        public final Color gradientColor;
        public final Image image;
        public final String title;

        public Cell(Image image, Color color, String str, CategoryToken categoryToken) {
            color.getClass();
            str.getClass();
            categoryToken.getClass();
            this.image = image;
            this.gradientColor = color;
            this.title = str;
            this.categoryToken = categoryToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) obj;
            return this.image.equals(cell.image) && Intrinsics.areEqual(this.gradientColor, cell.gradientColor) && Intrinsics.areEqual(this.title, cell.title) && Intrinsics.areEqual(this.categoryToken, cell.categoryToken);
        }

        public final int hashCode() {
            return this.categoryToken.value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.gradientColor, this.image.hashCode() * 31, 31), 31, this.title);
        }

        public final String toString() {
            return "Cell(image=" + this.image + ", gradientColor=" + this.gradientColor + ", title=" + this.title + ", categoryToken=" + this.categoryToken + ")";
        }
    }

    public InvestingDetailsCategorySectionContentModel(String str, ArrayList arrayList) {
        str.getClass();
        this.header = str;
        this.cells = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingDetailsCategorySectionContentModel)) {
            return false;
        }
        InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel = (InvestingDetailsCategorySectionContentModel) obj;
        return Intrinsics.areEqual(this.header, investingDetailsCategorySectionContentModel.header) && this.cells.equals(investingDetailsCategorySectionContentModel.cells);
    }

    public final int hashCode() {
        return this.cells.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.cells, "InvestingDetailsCategorySectionContentModel(header=", this.header, ", cells=", ")");
    }
}
