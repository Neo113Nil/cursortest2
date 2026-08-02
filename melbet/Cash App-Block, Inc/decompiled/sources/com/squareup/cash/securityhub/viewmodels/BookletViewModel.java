package com.squareup.cash.securityhub.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BookletViewModel {
    public final List featureCards;
    public final String navigationTitle;
    public final String pageHeaderBody;
    public final String pageHeaderTitle;
    public final List relatedBooklets;
    public final String relatedSectionTitle;
    public final List supportRows;
    public final String supportSectionTitle;

    public BookletViewModel(String str, String str2, String str3, List list, String str4, List list2, String str5, List list3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        list3.getClass();
        this.navigationTitle = str;
        this.pageHeaderTitle = str2;
        this.pageHeaderBody = str3;
        this.featureCards = list;
        this.relatedSectionTitle = str4;
        this.relatedBooklets = list2;
        this.supportSectionTitle = str5;
        this.supportRows = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletViewModel)) {
            return false;
        }
        BookletViewModel bookletViewModel = (BookletViewModel) obj;
        return Intrinsics.areEqual(this.navigationTitle, bookletViewModel.navigationTitle) && Intrinsics.areEqual(this.pageHeaderTitle, bookletViewModel.pageHeaderTitle) && Intrinsics.areEqual(this.pageHeaderBody, bookletViewModel.pageHeaderBody) && Intrinsics.areEqual(this.featureCards, bookletViewModel.featureCards) && Intrinsics.areEqual(this.relatedSectionTitle, bookletViewModel.relatedSectionTitle) && Intrinsics.areEqual(this.relatedBooklets, bookletViewModel.relatedBooklets) && Intrinsics.areEqual(this.supportSectionTitle, bookletViewModel.supportSectionTitle) && Intrinsics.areEqual(this.supportRows, bookletViewModel.supportRows);
    }

    public final int hashCode() {
        return this.supportRows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.navigationTitle.hashCode() * 31, 31, this.pageHeaderTitle), 31, this.pageHeaderBody), 31, this.featureCards), 31, this.relatedSectionTitle), 31, this.relatedBooklets), 31, this.supportSectionTitle);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BookletViewModel(navigationTitle=", this.navigationTitle, ", pageHeaderTitle=", this.pageHeaderTitle, ", pageHeaderBody=");
        NavAction$$ExternalSyntheticOutline0.m(this.pageHeaderBody, ", featureCards=", ", relatedSectionTitle=", m, this.featureCards);
        NavAction$$ExternalSyntheticOutline0.m(this.relatedSectionTitle, ", relatedBooklets=", ", supportSectionTitle=", m, this.relatedBooklets);
        m.append(this.supportSectionTitle);
        m.append(", supportRows=");
        m.append(this.supportRows);
        m.append(")");
        return m.toString();
    }
}
