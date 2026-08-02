package com.squareup.cash.buynowpaylater.viewmodels;

import com.squareup.protos.cash.cashapproxy.api.InfoTileIcon;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class InfoTileCardViewModel {
    public final TextModel body;
    public final InfoTileIcon icon;
    public final TextModel title;

    public InfoTileCardViewModel(TextModel textModel, TextModel textModel2, InfoTileIcon infoTileIcon) {
        this.title = textModel;
        this.body = textModel2;
        this.icon = infoTileIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTileCardViewModel)) {
            return false;
        }
        InfoTileCardViewModel infoTileCardViewModel = (InfoTileCardViewModel) obj;
        return this.title.equals(infoTileCardViewModel.title) && Intrinsics.areEqual(this.body, infoTileCardViewModel.body) && this.icon == infoTileCardViewModel.icon;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextModel textModel = this.body;
        int hashCode2 = (hashCode + (textModel == null ? 0 : textModel.hashCode())) * 31;
        InfoTileIcon infoTileIcon = this.icon;
        return hashCode2 + (infoTileIcon != null ? infoTileIcon.hashCode() : 0);
    }

    public final String toString() {
        return "InfoTileCardViewModel(title=" + this.title + ", body=" + this.body + ", icon=" + this.icon + ")";
    }
}
