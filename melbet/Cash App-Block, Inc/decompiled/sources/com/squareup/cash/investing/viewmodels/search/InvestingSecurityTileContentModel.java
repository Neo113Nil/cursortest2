package com.squareup.cash.investing.viewmodels.search;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingSecurityTileContentModel {
    public final Color backgroundColor;
    public final Image image;
    public final String ticker;
    public final String title;
    public final InvestmentEntityToken token;

    public InvestingSecurityTileContentModel(Image image, String str, String str2, Color color, InvestmentEntityToken investmentEntityToken) {
        image.getClass();
        str.getClass();
        str2.getClass();
        this.image = image;
        this.title = str;
        this.ticker = str2;
        this.backgroundColor = color;
        this.token = investmentEntityToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingSecurityTileContentModel)) {
            return false;
        }
        InvestingSecurityTileContentModel investingSecurityTileContentModel = (InvestingSecurityTileContentModel) obj;
        return Intrinsics.areEqual(this.image, investingSecurityTileContentModel.image) && Intrinsics.areEqual(this.title, investingSecurityTileContentModel.title) && Intrinsics.areEqual(this.ticker, investingSecurityTileContentModel.ticker) && this.backgroundColor.equals(investingSecurityTileContentModel.backgroundColor) && this.token.equals(investingSecurityTileContentModel.token);
    }

    public final int hashCode() {
        return this.token.value.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title), 31, this.ticker), 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "InvestingSecurityTileContentModel(image=", ", title=", this.title, ", ticker=");
        m.append(this.ticker);
        m.append(", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", token=");
        m.append(this.token);
        m.append(")");
        return m.toString();
    }
}
