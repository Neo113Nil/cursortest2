package com.squareup.cash.p2pblocking.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListViewModel {
    public final P2PListButtonValues buttonValues;
    public final P2PFailureDialogModel dialog;
    public final P2PListEmptyState emptyState;
    public final String footer;
    public final List list;
    public final String supportPageButtonAccessibilityLabel;
    public final String supportPageUrl;
    public final String toolbarTitle;

    public P2PListViewModel(String str, List list, P2PListEmptyState p2PListEmptyState, String str2, String str3, P2PFailureDialogModel p2PFailureDialogModel, P2PListButtonValues p2PListButtonValues, String str4) {
        str.getClass();
        p2PListEmptyState.getClass();
        str3.getClass();
        this.toolbarTitle = str;
        this.list = list;
        this.emptyState = p2PListEmptyState;
        this.supportPageUrl = str2;
        this.supportPageButtonAccessibilityLabel = str3;
        this.dialog = p2PFailureDialogModel;
        this.buttonValues = p2PListButtonValues;
        this.footer = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PListViewModel)) {
            return false;
        }
        P2PListViewModel p2PListViewModel = (P2PListViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, p2PListViewModel.toolbarTitle) && Intrinsics.areEqual(this.list, p2PListViewModel.list) && Intrinsics.areEqual(this.emptyState, p2PListViewModel.emptyState) && Intrinsics.areEqual(this.supportPageUrl, p2PListViewModel.supportPageUrl) && Intrinsics.areEqual(this.supportPageButtonAccessibilityLabel, p2PListViewModel.supportPageButtonAccessibilityLabel) && Intrinsics.areEqual(this.dialog, p2PListViewModel.dialog) && Intrinsics.areEqual(this.buttonValues, p2PListViewModel.buttonValues) && Intrinsics.areEqual(this.footer, p2PListViewModel.footer);
    }

    public final int hashCode() {
        int hashCode = this.toolbarTitle.hashCode() * 31;
        List list = this.list;
        int hashCode2 = (this.emptyState.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.supportPageUrl;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.supportPageButtonAccessibilityLabel);
        P2PFailureDialogModel p2PFailureDialogModel = this.dialog;
        int hashCode3 = (m + (p2PFailureDialogModel == null ? 0 : p2PFailureDialogModel.hashCode())) * 31;
        P2PListButtonValues p2PListButtonValues = this.buttonValues;
        int hashCode4 = (hashCode3 + (p2PListButtonValues == null ? 0 : p2PListButtonValues.hashCode())) * 31;
        String str2 = this.footer;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("P2PListViewModel(toolbarTitle=", this.toolbarTitle, ", list=", ", emptyState=", this.list);
        m.append(this.emptyState);
        m.append(", supportPageUrl=");
        m.append(this.supportPageUrl);
        m.append(", supportPageButtonAccessibilityLabel=");
        m.append(this.supportPageButtonAccessibilityLabel);
        m.append(", dialog=");
        m.append(this.dialog);
        m.append(", buttonValues=");
        m.append(this.buttonValues);
        m.append(", footer=");
        m.append(this.footer);
        m.append(")");
        return m.toString();
    }
}
