package com.squareup.cash.blockers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.franklin.api.SelectionBlocker;
import com.squareup.protos.franklin.api.SelectionOption;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SelectionViewModel {
    public final String amount;
    public final List detailRows;
    public final String errorMessage;
    public final String headerText;
    public final List helpItems;
    public final boolean hideCancel;
    public final SelectionBlocker.Icon icon;
    public final String linkableFooter;
    public final boolean loading;
    public final String mainText;
    public final List options;
    public final SelectionOption primaryOption;
    public final SelectionOption secondaryOption;

    public SelectionViewModel(String str, String str2, SelectionBlocker.Icon icon, List list, String str3, List list2, SelectionOption selectionOption, SelectionOption selectionOption2, boolean z, String str4, String str5, boolean z2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.headerText = str;
        this.mainText = str2;
        this.icon = icon;
        this.options = list;
        this.linkableFooter = str3;
        this.helpItems = list2;
        this.primaryOption = selectionOption;
        this.secondaryOption = selectionOption2;
        this.loading = z;
        this.amount = str4;
        this.errorMessage = str5;
        this.hideCancel = z2;
        this.detailRows = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionViewModel)) {
            return false;
        }
        SelectionViewModel selectionViewModel = (SelectionViewModel) obj;
        return Intrinsics.areEqual(this.headerText, selectionViewModel.headerText) && Intrinsics.areEqual(this.mainText, selectionViewModel.mainText) && this.icon == selectionViewModel.icon && Intrinsics.areEqual(this.options, selectionViewModel.options) && Intrinsics.areEqual(this.linkableFooter, selectionViewModel.linkableFooter) && Intrinsics.areEqual(this.helpItems, selectionViewModel.helpItems) && Intrinsics.areEqual(this.primaryOption, selectionViewModel.primaryOption) && Intrinsics.areEqual(this.secondaryOption, selectionViewModel.secondaryOption) && this.loading == selectionViewModel.loading && Intrinsics.areEqual(this.amount, selectionViewModel.amount) && Intrinsics.areEqual(this.errorMessage, selectionViewModel.errorMessage) && this.hideCancel == selectionViewModel.hideCancel && Intrinsics.areEqual(this.detailRows, selectionViewModel.detailRows);
    }

    public final int hashCode() {
        String str = this.headerText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mainText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SelectionBlocker.Icon icon = this.icon;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.options);
        String str3 = this.linkableFooter;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.helpItems);
        SelectionOption selectionOption = this.primaryOption;
        int hashCode3 = (m2 + (selectionOption == null ? 0 : selectionOption.hashCode())) * 31;
        SelectionOption selectionOption2 = this.secondaryOption;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (selectionOption2 == null ? 0 : selectionOption2.hashCode())) * 31, 31, this.loading);
        String str4 = this.amount;
        int hashCode4 = (m3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorMessage;
        return this.detailRows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.hideCancel);
    }
}
