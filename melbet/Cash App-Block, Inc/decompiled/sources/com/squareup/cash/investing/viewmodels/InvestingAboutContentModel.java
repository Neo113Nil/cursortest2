package com.squareup.cash.investing.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingAboutContentModel {
    public final ColorModel.Accented accentColor;
    public final String content;
    public final InvestingDetailRowContentModel detailRows;
    public final String title;

    public InvestingAboutContentModel(String str, String str2, InvestingDetailRowContentModel investingDetailRowContentModel, ColorModel.Accented accented) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.content = str2;
        this.detailRows = investingDetailRowContentModel;
        this.accentColor = accented;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingAboutContentModel)) {
            return false;
        }
        InvestingAboutContentModel investingAboutContentModel = (InvestingAboutContentModel) obj;
        return Intrinsics.areEqual(this.title, investingAboutContentModel.title) && Intrinsics.areEqual(this.content, investingAboutContentModel.content) && this.detailRows.equals(investingAboutContentModel.detailRows) && this.accentColor.equals(investingAboutContentModel.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.color.hashCode() + ((this.detailRows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.content)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestingAboutContentModel(title=", this.title, ", content=", this.content, ", detailRows=");
        m.append(this.detailRows);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
