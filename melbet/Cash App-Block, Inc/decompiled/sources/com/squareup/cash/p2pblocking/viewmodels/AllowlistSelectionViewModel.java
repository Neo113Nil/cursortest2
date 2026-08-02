package com.squareup.cash.p2pblocking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AllowlistSelectionViewModel {
    public final HeaderStyle headerStyle;
    public final String limitDescription;
    public final String safetyResources;
    public final SelectCustomerViewModel searchModel;
    public final ArrayList selectedContacts;
    public final String selectedContactsTitle;
    public final AllowlistSkipDialogModel skipDialog;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class HeaderStyle {
        public static final /* synthetic */ HeaderStyle[] $VALUES;
        public static final HeaderStyle COMPACT;
        public static final HeaderStyle EXPANDED;

        static {
            HeaderStyle headerStyle = new HeaderStyle("COMPACT", 0);
            COMPACT = headerStyle;
            HeaderStyle headerStyle2 = new HeaderStyle("EXPANDED", 1);
            EXPANDED = headerStyle2;
            $VALUES = new HeaderStyle[]{headerStyle, headerStyle2};
        }

        public static HeaderStyle valueOf(String str) {
            return (HeaderStyle) Enum.valueOf(HeaderStyle.class, str);
        }

        public static HeaderStyle[] values() {
            return (HeaderStyle[]) $VALUES.clone();
        }
    }

    public AllowlistSelectionViewModel(HeaderStyle headerStyle, String str, String str2, ArrayList arrayList, String str3, String str4, SelectCustomerViewModel selectCustomerViewModel, AllowlistSkipDialogModel allowlistSkipDialogModel) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.headerStyle = headerStyle;
        this.title = str;
        this.selectedContactsTitle = str2;
        this.selectedContacts = arrayList;
        this.limitDescription = str3;
        this.safetyResources = str4;
        this.searchModel = selectCustomerViewModel;
        this.skipDialog = allowlistSkipDialogModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowlistSelectionViewModel)) {
            return false;
        }
        AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj;
        return this.headerStyle == allowlistSelectionViewModel.headerStyle && Intrinsics.areEqual(this.title, allowlistSelectionViewModel.title) && Intrinsics.areEqual(this.selectedContactsTitle, allowlistSelectionViewModel.selectedContactsTitle) && this.selectedContacts.equals(allowlistSelectionViewModel.selectedContacts) && Intrinsics.areEqual(this.limitDescription, allowlistSelectionViewModel.limitDescription) && Intrinsics.areEqual(this.safetyResources, allowlistSelectionViewModel.safetyResources) && this.searchModel.equals(allowlistSelectionViewModel.searchModel) && Intrinsics.areEqual(this.skipDialog, allowlistSelectionViewModel.skipDialog);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedContacts, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerStyle.hashCode() * 31, 31, this.title), 31, this.selectedContactsTitle), 31);
        String str = this.limitDescription;
        int hashCode = (this.searchModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.safetyResources)) * 31;
        AllowlistSkipDialogModel allowlistSkipDialogModel = this.skipDialog;
        return hashCode + (allowlistSkipDialogModel != null ? allowlistSkipDialogModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllowlistSelectionViewModel(headerStyle=");
        sb.append(this.headerStyle);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", selectedContactsTitle=");
        sb.append(this.selectedContactsTitle);
        sb.append(", selectedContacts=");
        sb.append(this.selectedContacts);
        sb.append(", limitDescription=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.limitDescription, ", safetyResources=", this.safetyResources, ", searchModel=");
        sb.append(this.searchModel);
        sb.append(", skipDialog=");
        sb.append(this.skipDialog);
        sb.append(")");
        return sb.toString();
    }
}
