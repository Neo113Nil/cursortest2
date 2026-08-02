package com.squareup.cash.activity.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BalanceFeedViewModel {
    public final UiCallbackModel activityEmbeddedViewModel;
    public final String availableBalance;
    public final InfoSheet infoSheet;
    public final String title;

    public final class InfoSheet {
        public final String body;
        public final String title;

        public InfoSheet(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoSheet)) {
                return false;
            }
            InfoSheet infoSheet = (InfoSheet) obj;
            return Intrinsics.areEqual(this.title, infoSheet.title) && Intrinsics.areEqual(this.body, infoSheet.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InfoSheet(title=", this.title, ", body=", this.body, ")");
        }
    }

    public BalanceFeedViewModel(UiCallbackModel uiCallbackModel, String str, String str2, InfoSheet infoSheet) {
        str.getClass();
        this.activityEmbeddedViewModel = uiCallbackModel;
        this.title = str;
        this.availableBalance = str2;
        this.infoSheet = infoSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceFeedViewModel)) {
            return false;
        }
        BalanceFeedViewModel balanceFeedViewModel = (BalanceFeedViewModel) obj;
        return this.activityEmbeddedViewModel.equals(balanceFeedViewModel.activityEmbeddedViewModel) && Intrinsics.areEqual(this.title, balanceFeedViewModel.title) && Intrinsics.areEqual(this.availableBalance, balanceFeedViewModel.availableBalance) && Intrinsics.areEqual(this.infoSheet, balanceFeedViewModel.infoSheet);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.activityEmbeddedViewModel.hashCode() * 31, 31, this.title);
        String str = this.availableBalance;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        InfoSheet infoSheet = this.infoSheet;
        return hashCode + (infoSheet != null ? infoSheet.hashCode() : 0);
    }

    public final String toString() {
        return "BalanceFeedViewModel(activityEmbeddedViewModel=" + this.activityEmbeddedViewModel + ", title=" + this.title + ", availableBalance=" + this.availableBalance + ", infoSheet=" + this.infoSheet + ")";
    }
}
